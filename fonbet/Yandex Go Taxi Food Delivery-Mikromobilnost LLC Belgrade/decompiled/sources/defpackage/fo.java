package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fo extends nr {
    public final p6i a;
    public final boolean b;

    public fo(p6i p6iVar, boolean z) {
        this.a = p6iVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo)) {
            return false;
        }
        fo foVar = (fo) obj;
        return this.a.equals(foVar.a) && this.b == foVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionShowContentSections(contentSections=" + this.a + ", maximizeScreenBrightness=" + this.b + Extension.C_BRAKE;
    }
}
