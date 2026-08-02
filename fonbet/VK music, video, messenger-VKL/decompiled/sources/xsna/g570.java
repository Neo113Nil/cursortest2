package xsna;

/* compiled from: HitPathTracker.kt */
/* loaded from: classes11.dex */
public class g570 {
    public final ci50<t470> a = new ci50<>(new t470[16]);
    public final fh50<g570> b = new fh50<>(10);

    public boolean a(x500<xlb0> x500Var, tny tnyVar, rkx rkxVar, boolean z) {
        ci50<t470> ci50Var = this.a;
        t470[] t470VarArr = ci50Var.b;
        int i = ci50Var.d;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = t470VarArr[i2].a(x500Var, tnyVar, rkxVar, z) || z2;
        }
        return z2;
    }

    public void b(rkx rkxVar) {
        ci50<t470> ci50Var = this.a;
        int i = ci50Var.d;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (ci50Var.b[i].d.b == 0) {
                ci50Var.k(i);
            }
        }
    }
}
