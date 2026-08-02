package defpackage;

/* loaded from: classes11.dex */
public final class bwf extends vd4 {
    public final boolean w;

    public bwf(int i, int i2, boolean z, o3 o3Var) {
        super(i, i2, o3Var);
        this.w = z;
    }

    @Override // defpackage.vd4, defpackage.llv
    public final a3 a() {
        boolean z = this.w;
        o3 o3Var = this.c;
        int i = this.a;
        int i2 = this.b;
        if (z) {
            return r3.p(i, i2, o3Var.H());
        }
        td4 td4Var = new td4(4, i, i2, new cqf(((bph) ((tfy) o3Var.w)).c()), 2);
        return i != 64 ? td4Var : new nvf(td4Var);
    }
}
