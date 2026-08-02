package defpackage;

/* loaded from: classes12.dex */
public final class o0n {
    public final bg1 a;
    public final jie b;
    public final a47 c;

    public o0n(bg1 bg1Var, jie jieVar, a47 a47Var) {
        this.a = bg1Var;
        this.b = jieVar;
        this.c = a47Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0n) {
            o0n o0nVar = (o0n) obj;
            if (this.a == o0nVar.a && this.b.equals(o0nVar.b) && this.c.equals(o0nVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
