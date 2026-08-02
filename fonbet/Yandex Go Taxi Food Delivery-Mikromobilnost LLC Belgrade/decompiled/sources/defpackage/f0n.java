package defpackage;

/* loaded from: classes12.dex */
public final class f0n {
    public final g1n a;
    public final hz91 b;
    public final izm c;

    public f0n(g1n g1nVar, hz91 hz91Var, izm izmVar) {
        this.a = g1nVar;
        this.b = hz91Var;
        this.c = izmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0n)) {
            return false;
        }
        f0n f0nVar = (f0n) obj;
        return this.a.equals(f0nVar.a) && this.b.equals(f0nVar.b) && this.c.equals(f0nVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c.a) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
