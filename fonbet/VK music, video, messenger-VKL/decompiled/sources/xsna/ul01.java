package xsna;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes13.dex */
public final class ul01 extends ah01 {
    public final /* synthetic */ up01 c;

    public ul01(up01 up01Var) {
        this.c = up01Var;
    }

    @Override // xsna.ah01
    public final void a() {
        up01 up01Var = this.c;
        if (up01Var.m != null) {
            up01Var.b.a("Unbind from service.", new Object[0]);
            up01Var.a.unbindService(up01Var.l);
            up01Var.g = false;
            up01Var.m = null;
            up01Var.l = null;
        }
        up01Var.b();
    }
}
