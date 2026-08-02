package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class mrz {
    public final mjy0 a;
    public final mjy0 b;
    public final m7v c;

    public mrz(mjy0 mjy0Var, mjy0 mjy0Var2, m7v m7vVar) {
        this.a = mjy0Var;
        this.b = mjy0Var2;
        this.c = m7vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrz)) {
            return false;
        }
        mrz mrzVar = (mrz) obj;
        return this.a.equals(mrzVar.a) && this.b.equals(mrzVar.b) && jl40.l(this.c, mrzVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        m7v m7vVar = this.c;
        return hashCode + (m7vVar == null ? 0 : m7vVar.hashCode());
    }

    public final String toString() {
        return "Bullet(title=" + this.a + ", subtitle=" + this.b + ", icon=" + this.c + Extension.C_BRAKE;
    }
}
