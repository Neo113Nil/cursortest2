package defpackage;

/* loaded from: classes9.dex */
public abstract class ad5 extends zc5 {
    public ike w;

    public static ike Hg(String str) {
        IllegalStateException illegalStateException = new IllegalStateException("Using cancelled scope instead of ".concat(str));
        jst.e.s(illegalStateException);
        ike b = bvf0.b();
        bvf0.i(b, "Already cancelled", illegalStateException);
        return b;
    }

    @Override // defpackage.zc5
    public void Bg(l050 l050Var) {
        this.w = bvf0.M(bvf0.M(bvf0.b(), new pse(l050Var.getClass().getSimpleName())), Ig());
        super.Bg(l050Var);
    }

    @Override // defpackage.zc5
    public void Cg() {
        super.Cg();
        ike ikeVar = this.w;
        if (ikeVar != null) {
            bvf0.i(ikeVar, "detach view from presenter", null);
        }
    }

    public mse Ig() {
        return new yc5(new Throwable().getStackTrace(), 0);
    }

    public final tse Jg() {
        ike ikeVar = this.w;
        return ikeVar == null ? Hg("mainScope") : ikeVar;
    }
}
