package defpackage;

/* loaded from: classes2.dex */
public final class m7e0 {
    public final String a;
    public final ffg b;

    public m7e0(String str, ffg ffgVar) {
        this.a = str;
        this.b = ffgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7e0)) {
            return false;
        }
        m7e0 m7e0Var = (m7e0) obj;
        return this.a.equals(m7e0Var.a) && this.b.equals(m7e0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DarkConfiguration(__typename=" + this.a + ", darkPopupConfigurationFragment=" + this.b + ')';
    }
}
