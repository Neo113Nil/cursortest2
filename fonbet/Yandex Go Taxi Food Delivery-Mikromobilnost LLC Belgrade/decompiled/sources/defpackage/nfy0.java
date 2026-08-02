package defpackage;

/* loaded from: classes.dex */
public final class nfy0 implements eg90 {
    public final eg90 c;
    public final String d;

    public nfy0(eg90 eg90Var, String str) {
        this.c = eg90Var;
        this.d = str;
    }

    @Override // defpackage.eg90
    public final void a(Exception exc) {
        this.c.b(exc, this.d);
    }
}
