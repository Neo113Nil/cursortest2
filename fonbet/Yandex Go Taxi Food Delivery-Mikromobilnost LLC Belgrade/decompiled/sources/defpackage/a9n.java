package defpackage;

/* loaded from: classes5.dex */
public final class a9n extends b9n {
    public final int a;
    public final dqb1 b;

    public a9n(int i, dqb1 dqb1Var) {
        this.a = i;
        this.b = dqb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9n)) {
            return false;
        }
        a9n a9nVar = (a9n) obj;
        return this.a == a9nVar.a && jl40.l(this.b, a9nVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        dqb1 dqb1Var = this.b;
        return (hashCode + (dqb1Var == null ? 0 : dqb1Var.hashCode())) * 31;
    }

    public final String toString() {
        return "DynamicSearchIdleTimeline(stagesCount=" + this.a + ", icon=" + this.b + ", dynamicDescription=null)";
    }
}
