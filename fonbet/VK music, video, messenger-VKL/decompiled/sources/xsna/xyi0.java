package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: SetNetSettingsDialogProvider.kt */
/* loaded from: classes3.dex */
public final class xyi0 {
    public static void a(Context context, boolean z, b0t0 b0t0Var) {
        if (z) {
            dhr0.a.getClass();
            context = dhr0.t(context);
        }
        int i = h7u0.p;
        h7u0.a b = h7u0.b.b(context);
        b.g0(R.string.video_download_settings_by_mobile_net_title);
        b.U(R.string.video_download_settings_by_mobile_net_message);
        b.W(R.string.video_download_settings_by_mobile_net_negative_button, new vbc0(b0t0Var, 2));
        b.c0(R.string.video_download_settings_by_mobile_net_positive_button, new com.vk.stickers.bonus.catalog.a(b0t0Var, 3));
        b.a.n = new xbc0(b0t0Var, 1);
        b.m();
    }
}
