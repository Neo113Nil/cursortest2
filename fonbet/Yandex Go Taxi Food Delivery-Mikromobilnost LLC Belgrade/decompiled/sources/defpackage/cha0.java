package defpackage;

/* loaded from: classes2.dex */
public final class cha0 {
    public final String a;
    public final jec b;

    public cha0(String str, jec jecVar) {
        this.a = str;
        this.b = jecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cha0)) {
            return false;
        }
        cha0 cha0Var = (cha0) obj;
        return this.a.equals(cha0Var.a) && this.b.equals(cha0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Dark1(__typename=" + this.a + ", colorFields=" + this.b + ')';
    }
}
