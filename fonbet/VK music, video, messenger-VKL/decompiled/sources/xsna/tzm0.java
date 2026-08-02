package xsna;

import android.content.Context;
import com.vk.dto.common.data.Subscription;
import com.vkontakte.android.R;

/* compiled from: MusicSubscriptionDetailsAdapter.kt */
/* loaded from: classes3.dex */
public final class tzm0 extends rk6 {
    @Override // xsna.rk6
    public final void a(qr8 qr8Var, Subscription subscription, Context context) {
        wh50<Boolean> wh50Var = qr8Var.e;
        Boolean bool = Boolean.TRUE;
        wh50Var.setValue(bool);
        wh50<Boolean> wh50Var2 = qr8Var.f;
        Boolean bool2 = Boolean.FALSE;
        wh50Var2.setValue(bool2);
        qr8Var.d.setValue(bool);
        qr8Var.a.setValue(subscription.t ? context.getString(R.string.music_subscription_purchase_btn_title_trial) : context.getString(R.string.music_subscription_purchase_btn_title, subscription.d));
        qr8Var.c.setValue(bool2);
    }
}
