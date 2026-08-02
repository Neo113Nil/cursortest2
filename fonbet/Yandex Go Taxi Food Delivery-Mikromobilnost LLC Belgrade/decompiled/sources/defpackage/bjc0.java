package defpackage;

/* loaded from: classes2.dex */
public final class bjc0 {
    public final String a;
    public final zrc0 b;

    public bjc0(String str, zrc0 zrc0Var) {
        this.a = str;
        this.b = zrc0Var;
    }

    public final zrc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjc0)) {
            return false;
        }
        bjc0 bjc0Var = (bjc0) obj;
        return this.a.equals(bjc0Var.a) && this.b.equals(bjc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(__typename=" + this.a + ", plaqueUnit=" + this.b + ')';
    }
}
