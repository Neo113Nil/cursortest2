package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class i8n {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public i8n(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8n)) {
            return false;
        }
        i8n i8nVar = (i8n) obj;
        return jl40.l(this.a, i8nVar.a) && jl40.l(this.b, i8nVar.b) && this.c.equals(i8nVar.c) && this.d.equals(i8nVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("HeaderText(title=", this.a, ", subtitle=", this.b, ", contentDescription="), this.c, ", accessibilityAnnounce=", this.d, Extension.C_BRAKE);
    }
}
