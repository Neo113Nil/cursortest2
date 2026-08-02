package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vib implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vib(long j, Boolean bool) {
        this.c = j;
        this.d = bool;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                gkb gkbVar = (gkb) this.d;
                bdb bdbVar = (bdb) obj;
                vcb vcbVar = bdbVar.j;
                if (vcbVar == null) {
                    vcbVar = bdbVar.i;
                }
                gkbVar.b.d(this.c, vcbVar);
                return s3q0.a;
            default:
                Boolean bool = (Boolean) this.d;
                mol0 mol0Var = (mol0) obj;
                uoi0 c = mol0Var.c(this.c);
                if (c == null) {
                    return mol0Var;
                }
                return mol0Var.m(uoi0.l(c, bool != null ? bool.booleanValue() : !c.o, null, 8323071));
        }
    }

    public /* synthetic */ vib(gkb gkbVar, long j) {
        this.d = gkbVar;
        this.c = j;
    }
}
