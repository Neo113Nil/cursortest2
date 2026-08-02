package defpackage;

/* loaded from: classes2.dex */
public final class fuc0 {
    public final String a;
    public final pkc0 b;

    public fuc0(String str, pkc0 pkc0Var) {
        this.a = str;
        this.b = pkc0Var;
    }

    public final pkc0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuc0)) {
            return false;
        }
        fuc0 fuc0Var = (fuc0) obj;
        return this.a.equals(fuc0Var.a) && this.b.equals(fuc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentDescription(__typename=" + this.a + ", plaqueContentDescription=" + this.b + ')';
    }
}
