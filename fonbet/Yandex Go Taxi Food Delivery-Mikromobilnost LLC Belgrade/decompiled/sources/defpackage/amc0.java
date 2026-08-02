package defpackage;

/* loaded from: classes8.dex */
public final class amc0 {
    public final String a;
    public final ujc0 b;

    public amc0(String str, ujc0 ujc0Var) {
        this.a = str;
        this.b = ujc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amc0)) {
            return false;
        }
        amc0 amc0Var = (amc0) obj;
        return this.a.equals(amc0Var.a) && this.b.equals(amc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BackgroundColorSetting(__typename=" + this.a + ", plaqueColorSettings=" + this.b + ')';
    }
}
