package defpackage;

/* loaded from: classes12.dex */
public final class jxl0 extends h55 {
    public final n4j0 D;
    public final kxl0 E;
    public final rq21 F;

    public jxl0(n4j0 n4j0Var, kxl0 kxl0Var, rq21 rq21Var) {
        super(null);
        this.D = n4j0Var;
        this.E = kxl0Var;
        this.F = rq21Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.F.a().delete();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        P((gxl0) obj);
    }

    public final void P(gxl0 gxl0Var) {
        D((m950) this.D.get(), new qwl0(gxl0Var.b, gxl0Var.a), new hxl0(this, gxl0Var));
    }
}
