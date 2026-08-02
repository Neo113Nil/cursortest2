package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class izd {
    public final String a;
    public final String b;
    public final String c;

    public izd(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izd)) {
            return false;
        }
        izd izdVar = (izd) obj;
        return jl40.l(this.a, izdVar.a) && jl40.l(this.b, izdVar.b) && jl40.l(this.c, izdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("ConfirmDialogsTexts(title=", this.a, ", acceptText=", this.b, ", rejectText="), this.c, Extension.C_BRAKE);
    }
}
