package xsna;

import android.content.Context;
import com.vk.dto.common.data.Subscription;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import java.util.Set;
import xsna.ys8;

/* compiled from: BuyMusicSubscriptionComposeButton.kt */
/* loaded from: classes3.dex */
public class rk6 {
    public void a(qr8 qr8Var, Subscription subscription, Context context) {
        int i;
        wh50<String> wh50Var = qr8Var.b;
        wh50<Boolean> wh50Var2 = qr8Var.c;
        wh50<String> wh50Var3 = qr8Var.a;
        wh50<Boolean> wh50Var4 = qr8Var.e;
        Boolean bool = Boolean.TRUE;
        wh50Var4.setValue(bool);
        wh50<Boolean> wh50Var5 = qr8Var.f;
        Boolean bool2 = Boolean.FALSE;
        wh50Var5.setValue(bool2);
        qr8Var.d.setValue(bool);
        ys8.a.getClass();
        Set<String> set = ys8.a.b;
        String str = subscription.b;
        int i2 = (set.contains(str) || ("combo_android_trial".equals(str) && 90 == subscription.x)) ? 3 : subscription.x / 30;
        String str2 = subscription.A;
        if (str2 == null || drm0.N(str2) || (i = subscription.B) <= 0) {
            if (!subscription.t || i2 <= 0) {
                wh50Var3.setValue(context.getString(R.string.musc_bmsb_title_buy, subscription.d));
                wh50Var2.setValue(bool2);
                return;
            } else {
                wh50Var3.setValue(enj.f(R.plurals.musc_bmsb_title_month, i2, context));
                wh50Var.setValue(context.getString(R.string.musc_bmsb_subtitle_buy, subscription.d));
                wh50Var2.setValue(bool);
                return;
            }
        }
        int i3 = i / 30;
        if (i3 == 0) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.w, new Object[]{new IllegalStateException("Introductory subscription with less month duration, in days = " + subscription.B)});
            }
        }
        wh50Var3.setValue(context.getString(R.string.music_bmsb_introductory_title, subscription.A));
        wh50Var.setValue(i3 == 6 ? context.getString(R.string.music_bmsb_introductory_subtitle_half_year, subscription.d) : context.getResources().getQuantityString(R.plurals.music_bmsb_introductory_subtitle_month, i3, Integer.valueOf(i3), subscription.d));
        wh50Var2.setValue(bool);
    }
}
