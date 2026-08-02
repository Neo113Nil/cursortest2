package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class rjb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ rjb(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return bdb.a((bdb) obj, this.c, 0, 0, 0, 0, 0, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -3, 7);
            case 1:
                if (this.c == 0 && ce60.l.compareAndSet(false, true)) {
                    dx90 dx90Var = ow90.e;
                    dx90Var.getClass();
                    dx90Var.l = System.currentTimeMillis();
                    dx90Var.r();
                }
                return s3q0.a;
            default:
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                gfn0 i = vdx0Var.i();
                int i2 = this.c;
                return i.a(i2).l(new s1j0(new wom(i2, 3), 10));
        }
    }
}
