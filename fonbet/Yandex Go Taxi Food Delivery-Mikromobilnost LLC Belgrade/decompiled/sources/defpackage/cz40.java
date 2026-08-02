package defpackage;

/* loaded from: classes10.dex */
public class cz40 {
    public Object a;
    public Object b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof sa90)) {
            return false;
        }
        sa90 sa90Var = (sa90) obj;
        Object obj2 = sa90Var.a;
        Object obj3 = this.a;
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        Object obj4 = sa90Var.b;
        Object obj5 = this.b;
        if (obj4 != obj5) {
            return obj4 != null && obj4.equals(obj5);
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.a);
        sb.append(" ");
        return x4e.h(sb, this.b, "}");
    }
}
