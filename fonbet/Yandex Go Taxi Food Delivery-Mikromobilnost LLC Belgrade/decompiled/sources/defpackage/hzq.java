package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class hzq {
    public final m5j0 a;
    public final izq b;

    public hzq(m5j0 m5j0Var, izq izqVar) {
        this.a = m5j0Var;
        this.b = izqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzq)) {
            return false;
        }
        hzq hzqVar = (hzq) obj;
        return this.a.equals(hzqVar.a) && this.b.equals(hzqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FetchResult(requestBody=" + this.a + ", updatedFileData=" + this.b + Extension.C_BRAKE;
    }
}
