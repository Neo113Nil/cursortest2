package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class m7t {
    public final String a;
    public final long b;

    public m7t(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7t)) {
            return false;
        }
        m7t m7tVar = (m7t) obj;
        return jl40.l(this.a, m7tVar.a) && this.b == m7tVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("Params(folderId=", this.a, ", organizationId=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
