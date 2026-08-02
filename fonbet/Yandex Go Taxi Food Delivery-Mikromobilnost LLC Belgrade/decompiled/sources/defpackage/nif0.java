package defpackage;

/* loaded from: classes15.dex */
public final class nif0 extends fas {
    public final wtq0 b;
    public final /* synthetic */ oif0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nif0(oif0 oif0Var, oq6 oq6Var) {
        super(oq6Var);
        this.c = oif0Var;
        wtq0 wtq0Var = new wtq0(oif0Var.c);
        this.b = wtq0Var;
        long j = oif0Var.d;
        if (j > 0) {
            wtq0Var.e(j, oif0Var.b.a() + j);
        }
    }

    @Override // defpackage.fas, defpackage.uis0
    public final void write(yp6 yp6Var, long j) {
        super.write(yp6Var, j);
        oif0 oif0Var = this.c;
        this.b.e(j, oif0Var.b.a() + oif0Var.d);
    }
}
