package defpackage;

/* loaded from: classes12.dex */
public final class m0f0 implements o0f0 {
    public final String a;
    public final String b;

    public m0f0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0f0)) {
            return false;
        }
        m0f0 m0f0Var = (m0f0) obj;
        return this.a.equals(m0f0Var.a) && this.b.equals(m0f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
