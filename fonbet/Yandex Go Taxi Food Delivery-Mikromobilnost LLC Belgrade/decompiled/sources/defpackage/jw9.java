package defpackage;

/* loaded from: classes12.dex */
public final class jw9 implements sy60 {
    public final /* synthetic */ lw9 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ hw9 c;

    public jw9(lw9 lw9Var, boolean z, hw9 hw9Var) {
        this.a = lw9Var;
        this.b = z;
        this.c = hw9Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        boolean z = this.b;
        lw9 lw9Var = this.a;
        if (z) {
            lw9Var.R(this.c);
        } else {
            lw9Var.r(new qu(9));
        }
    }
}
