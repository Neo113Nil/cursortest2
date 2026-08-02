package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m4s {
    public final Object a;
    public final l5s b;

    public m4s(Object obj, l5s l5sVar) {
        this.a = obj;
        this.b = l5sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4s)) {
            return false;
        }
        m4s m4sVar = (m4s) obj;
        return jl40.l(this.a, m4sVar.a) && this.b.equals(m4sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FormDescriptor(match=" + this.a + ", override=" + this.b + Extension.C_BRAKE;
    }
}
