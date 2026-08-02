package xsna;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class tit implements nfn0 {
    @Override // xsna.nfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 a(String str) {
        ufx ufxVar = new ufx("auth.terminateAuthCode", new pr(5), new qr(7));
        ufx.n(ufxVar, "auth_code", str, 0, 12);
        bx2 e = e370.e(ufxVar);
        e.c = true;
        e.d = true;
        return rdx0.p(e);
    }

    @Override // xsna.nfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 b(String str) {
        ufx ufxVar = new ufx("auth.setAuthCodeStatus", new ao(6), new bo(9));
        ufx.n(ufxVar, "auth_code", str, 0, 12);
        bx2 e = e370.e(ufxVar);
        e.c = true;
        e.d = true;
        return rdx0.p(e);
    }

    @Override // xsna.nfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 c(String str) {
        ufx ufxVar = new ufx("auth.getAuthCodeStatus", new tr(5), new ur(5));
        ufx.n(ufxVar, "auth_code", str, 0, 12);
        bx2 e = e370.e(ufxVar);
        e.c = true;
        e.d = true;
        return rdx0.p(e);
    }
}
