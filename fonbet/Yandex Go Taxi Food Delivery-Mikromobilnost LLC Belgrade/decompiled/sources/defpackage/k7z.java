package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class k7z {
    public final ajc a;
    public final p6z b;
    public final r6z c;
    public final o6z d;
    public final n6z e;

    public k7z(ajc ajcVar, p6z p6zVar, r6z r6zVar, o6z o6zVar, n6z n6zVar) {
        this.a = ajcVar;
        this.b = p6zVar;
        this.c = r6zVar;
        this.d = o6zVar;
        this.e = n6zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7z)) {
            return false;
        }
        k7z k7zVar = (k7z) obj;
        return this.a.equals(k7zVar.a) && this.b.equals(k7zVar.b) && this.c.equals(k7zVar.c) && this.d.equals(k7zVar.d) && this.e.equals(k7zVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LocationData(timestamp=" + this.a + ", position=" + this.b + ", verticalPosition=" + this.c + ", movement=" + this.d + ", meta=" + this.e + Extension.C_BRAKE;
    }
}
