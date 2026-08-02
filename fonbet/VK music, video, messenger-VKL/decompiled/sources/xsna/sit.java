package xsna;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class sit implements mfn0 {
    public final bpn0 a = new bpn0(new f4(20));

    @Override // xsna.mfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(long j, String str) {
        String e = dgn0.e();
        ufx ufxVar = new ufx("apps.setDevicePermissions", new kq(5), new lq(4));
        ufx.k(ufxVar, "app_id", (int) j, 0, 8);
        ufx.n(ufxVar, "device_id", e, 0, 12);
        ufx.n(ufxVar, "name", str, 0, 12);
        ufxVar.i("value", true);
        return rdx0.u(e370.e(ufxVar)).U(new y7(new ot(26), 22));
    }

    @Override // xsna.mfn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 b(long j) {
        String e = dgn0.e();
        ufx ufxVar = new ufx("apps.getDevicePermissions", new nq(2), new oq(2));
        ufx.k(ufxVar, "app_id", (int) j, 0, 8);
        ufx.n(ufxVar, "device_id", e, 0, 12);
        return rdx0.u(e370.e(ufxVar)).U(new b8(new nhe(this, 27), 25));
    }
}
