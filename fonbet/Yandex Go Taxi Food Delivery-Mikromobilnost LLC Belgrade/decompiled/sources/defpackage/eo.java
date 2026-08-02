package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class eo extends nr {
    public final String a;
    public final String b;
    public final boolean c;

    public eo(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo)) {
            return false;
        }
        eo eoVar = (eo) obj;
        return jl40.l(this.a, eoVar.a) && jl40.l(this.b, eoVar.b) && this.c == eoVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("ActionShowContentOrderHistory(title=", this.a, ", url=", this.b, ", openPdf="), this.c, Extension.C_BRAKE);
    }
}
