package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class k4t {
    public final String a;
    public final Long b;

    public k4t(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4t)) {
            return false;
        }
        k4t k4tVar = (k4t) obj;
        return jl40.l(this.a, k4tVar.a) && this.b.equals(k4tVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Params(folderId=" + this.a + ", organizationId=" + this.b + Extension.C_BRAKE;
    }
}
