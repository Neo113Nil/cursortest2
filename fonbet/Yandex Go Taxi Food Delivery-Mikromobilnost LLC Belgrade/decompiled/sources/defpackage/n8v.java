package defpackage;

/* loaded from: classes12.dex */
public final class n8v {
    public final mgd a;
    public final u92 b;
    public final boolean c;
    public final boolean d;
    public final kfv e;

    public n8v(mgd mgdVar, u92 u92Var, boolean z, boolean z2, kfv kfvVar) {
        this.a = mgdVar;
        this.b = u92Var;
        this.c = z;
        this.d = z2;
        this.e = kfvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (n8v.class.equals(obj != null ? obj.getClass() : null)) {
            return jl40.l(this.a, ((n8v) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
