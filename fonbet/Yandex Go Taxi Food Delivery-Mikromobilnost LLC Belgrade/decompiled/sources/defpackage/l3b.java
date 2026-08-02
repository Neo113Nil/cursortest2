package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class l3b {
    public final j3b a;
    public final boolean b;

    public l3b(j3b j3bVar, boolean z) {
        this.a = j3bVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3b)) {
            return false;
        }
        l3b l3bVar = (l3b) obj;
        return this.a.equals(l3bVar.a) && this.b == l3bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatInfoEntity(chatInfo=" + this.a + ", isValid=" + this.b + Extension.C_BRAKE;
    }
}
