package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class glj {
    public final String a;
    public final CharSequence b;

    public glj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glj)) {
            return false;
        }
        glj gljVar = (glj) obj;
        return jl40.l(this.a, gljVar.a) && jl40.l(this.b, gljVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "Direction(id=" + this.a + ", title=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
