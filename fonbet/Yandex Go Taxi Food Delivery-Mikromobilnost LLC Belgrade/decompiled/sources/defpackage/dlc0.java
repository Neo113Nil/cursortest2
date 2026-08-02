package defpackage;

/* loaded from: classes8.dex */
public final class dlc0 {
    public final String a;
    public final yhc0 b;

    public dlc0(String str, yhc0 yhc0Var) {
        this.a = str;
        this.b = yhc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlc0)) {
            return false;
        }
        dlc0 dlc0Var = (dlc0) obj;
        return this.a.equals(dlc0Var.a) && this.b.equals(dlc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultPlaqueList(__typename=" + this.a + ", plaque=" + this.b + ')';
    }
}
