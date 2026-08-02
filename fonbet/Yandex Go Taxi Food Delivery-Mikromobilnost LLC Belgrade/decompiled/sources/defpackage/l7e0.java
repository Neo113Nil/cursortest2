package defpackage;

/* loaded from: classes2.dex */
public final class l7e0 {
    public final String a;
    public final d7e0 b;

    public l7e0(String str, d7e0 d7e0Var) {
        this.a = str;
        this.b = d7e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7e0)) {
            return false;
        }
        l7e0 l7e0Var = (l7e0) obj;
        return this.a.equals(l7e0Var.a) && this.b.equals(l7e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Configuration(__typename=" + this.a + ", popupConfigurationFragment=" + this.b + ')';
    }
}
