package defpackage;

/* loaded from: classes.dex */
public final class p64 extends u0p {
    public final s0p a;

    public p64(s0p s0pVar) {
        this.a = s0pVar;
    }

    @Override // defpackage.u0p
    public final s0p a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0p)) {
            return false;
        }
        u0p u0pVar = (u0p) obj;
        s0p s0pVar = this.a;
        return s0pVar == null ? u0pVar.a() == null : s0pVar.equals(u0pVar.a());
    }

    public final int hashCode() {
        s0p s0pVar = this.a;
        return (s0pVar == null ? 0 : s0pVar.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }
}
