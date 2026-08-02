package defpackage;

/* loaded from: classes15.dex */
public abstract class njt {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final bn21 d = new bn21();

    public njt(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean a(j3b j3bVar) {
        long j = j3bVar.a;
        String str = j3bVar.b;
        String str2 = j3bVar.e;
        boolean z = j3bVar.C;
        boolean z2 = j3bVar.G;
        boolean z3 = j3bVar.K;
        boolean z4 = j3bVar.D;
        boolean z5 = j3bVar.E;
        String str3 = j3bVar.s;
        boolean z6 = j3bVar.t;
        o1b0 o1b0Var = new o1b0(j, str, str2, z, z2, z4, z5, str3, j3bVar.u, j3bVar.v, z3, z6, j3bVar.H);
        if (z6) {
            return false;
        }
        return b(o1b0Var);
    }

    public abstract boolean b(o1b0 o1b0Var);

    public abstract boolean c(fm21 fm21Var);
}
