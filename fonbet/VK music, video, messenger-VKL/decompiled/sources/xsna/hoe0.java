package xsna;

import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;

/* compiled from: QrWebToAppAnalyticsHelper.kt */
/* loaded from: classes6.dex */
public final class hoe0 {
    public static void a() {
        String str = RegistrationStatParamsFactory.b;
        String str2 = "mobile_qr_auth";
        if (str != null && !drm0.D(str, "mobile_qr_auth", false)) {
            str2 = str.concat(",mobile_qr_auth");
        }
        bpn0 bpn0Var = com.vk.auth.main.f.a;
        RegistrationStatParamsFactory.b = str2;
    }
}
