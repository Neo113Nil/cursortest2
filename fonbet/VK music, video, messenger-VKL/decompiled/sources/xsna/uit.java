package xsna;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class uit implements ofn0 {
    public uit() {
        new bpn0(new gu0(17));
    }

    @Override // xsna.ofn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(String str, String str2, String str3, String str4, String str5) {
        ufx ufxVar = new ufx("settings.activateExternalOAuthService", new dt(25), new s3j0(0));
        ufx.n(ufxVar, "external_code", str, 0, 12);
        ufx.n(ufxVar, "vk_external_client", str2, 0, 12);
        ufx.n(ufxVar, "redirect_uri", str3, 0, 12);
        ufx.n(ufxVar, "service", str4, 0, 12);
        if (str5 != null) {
            ufx.n(ufxVar, "code_verifier", str5, 0, 12);
        }
        return rdx0.u(e370.e(ufxVar)).U(new nu0(new rvq(3), 24));
    }

    @Override // xsna.ofn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 b(Boolean bool, String str, String str2) {
        ufx ufxVar = new ufx("settings.deactivateExternalOAuthService", new t3j0(0), new eq0(26));
        ufx.n(ufxVar, "oauth_service_name", str, 0, 12);
        if (str2 != null) {
            ufx.n(ufxVar, "auth_label", str2, 0, 12);
        }
        if (bool != null) {
            ufxVar.i("is_deactivate_all_auth_labels", bool.booleanValue());
        }
        return rdx0.u(e370.e(ufxVar)).U(new h8(new g8(25), 19));
    }
}
