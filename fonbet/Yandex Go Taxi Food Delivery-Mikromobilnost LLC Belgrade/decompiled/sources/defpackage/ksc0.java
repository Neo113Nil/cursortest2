package defpackage;

/* loaded from: classes2.dex */
public final class ksc0 {
    public final String a;
    public final djc0 b;

    public ksc0(String str, djc0 djc0Var) {
        this.a = str;
        this.b = djc0Var;
    }

    public final djc0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksc0)) {
            return false;
        }
        ksc0 ksc0Var = (ksc0) obj;
        return this.a.equals(ksc0Var.a) && this.b.equals(ksc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonWidget(__typename=" + this.a + ", plaqueButtonWidget=" + this.b + ')';
    }
}
