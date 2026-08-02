package xsna;

/* compiled from: CornersHelper.kt */
/* loaded from: classes2.dex */
public final class zuj {
    public int a;
    public int b;
    public int c;
    public final xuj d = new xuj(0);

    public final void a(wr6 wr6Var, boolean z, boolean z2, boolean z3, boolean z4) {
        int i = this.c;
        xuj xujVar = this.d;
        xujVar.b(i, 15);
        if (z) {
            xuj.c(xujVar, this.a, 0, 0, 0, 14);
        }
        if (z2) {
            xuj.c(xujVar, 0, this.a, 0, 0, 13);
        }
        if (z3) {
            xuj.c(xujVar, 0, 0, this.b, 0, 11);
        }
        if (z4) {
            xuj.c(xujVar, 0, 0, 0, this.b, 7);
        }
        wr6Var.f(xujVar);
    }
}
