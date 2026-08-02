package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import com.vk.log.L;
import xsna.azs;

/* compiled from: AppPushGdprOnboarding.kt */
/* loaded from: classes5.dex */
public final class d83 extends azs {
    public final zys b;

    /* compiled from: AppPushGdprOnboarding.kt */
    /* loaded from: classes.dex */
    public static final class a implements azs.a {
        @Override // xsna.azs.a
        public final azs a(zys zysVar) {
            return new d83(zysVar);
        }
    }

    public d83(zys zysVar) {
        this.b = zysVar;
    }

    @Override // xsna.azs
    public final void a(PromoSessionInfo promoSessionInfo) {
        aa70 aa70Var = new aa70();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        if (!gz80.a(33) || Preference.f("notification_gdpr_dialog").getBoolean("dialog_already_shown", false) || anj.a(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            L.e("[Push][Onboarding]: No need to show dialog");
            this.b.a(promoSessionInfo);
        } else {
            L.e("[Push][Onboarding]: Will show dialog");
            itg0.g(aa70Var.a(), new vf1(1, this, promoSessionInfo), new hl1(2, this, promoSessionInfo));
        }
    }
}
