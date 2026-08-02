package xsna;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes13.dex */
public final class un01 extends ah01 {
    public final /* synthetic */ cp01 c;

    public un01(cp01 cp01Var) {
        this.c = cp01Var;
    }

    @Override // xsna.ah01
    public final void a() {
        up01 up01Var = this.c.b;
        up01Var.b.a("unlinkToDeath", new Object[0]);
        up01Var.m.asBinder().unlinkToDeath(up01Var.j, 0);
        up01Var.m = null;
        up01Var.g = false;
    }
}
