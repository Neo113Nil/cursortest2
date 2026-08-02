package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kw40 {
    public final String a;
    public final String b;
    public final nr c;

    public kw40(String str, String str2, nr nrVar) {
        this.a = str;
        this.b = str2;
        this.c = nrVar;
    }

    public final nr a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw40)) {
            return false;
        }
        kw40 kw40Var = (kw40) obj;
        return jl40.l(this.a, kw40Var.a) && jl40.l(this.b, kw40Var.b) && jl40.l(this.c, kw40Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        nr nrVar = this.c;
        return hashCode2 + (nrVar != null ? nrVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MultiorderDialogButton(title=", this.a, ", subtitle=", this.b, ", action=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
