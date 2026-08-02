package xsna;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class yit implements sfn0 {
    public final bpn0 a = new bpn0(new gc(10));

    @Override // xsna.sfn0
    public final io.reactivex.rxjava3.internal.operators.single.y a() {
        return rdx0.B(e370.e(new ufx("superApp.getAnimations", new wul0(1), new hbn0(0)))).l(new rj4(new yad(this, 28), 14));
    }

    @Override // xsna.sfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 b(String str, String str2) {
        ufx ufxVar = new ufx("superApp.markBadgeAsClicked", new qjk0(4), new rjk0(4));
        ufx.n(ufxVar, "uid", str, 0, 12);
        if (str2 != null) {
            ufx.n(ufxVar, "parent_uid", str2, 0, 12);
        }
        return rdx0.u(e370.e(ufxVar)).U(new qj4(new sop(this, 9), 16));
    }

    @Override // xsna.sfn0
    public final io.reactivex.rxjava3.core.x<Boolean> c(String str, String str2) {
        return io.reactivex.rxjava3.internal.operators.single.a0.b;
    }
}
