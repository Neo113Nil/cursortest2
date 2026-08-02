package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class n7u0 {
    public final tsa a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;

    public n7u0(tsa tsaVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.a = tsaVar;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7u0)) {
            return false;
        }
        n7u0 n7u0Var = (n7u0) obj;
        return jl40.l(this.a, n7u0Var.a) && jl40.l(this.b, n7u0Var.b) && jl40.l(this.c, n7u0Var.c) && jl40.l(this.d, n7u0Var.d);
    }

    public final int hashCode() {
        tsa tsaVar = this.a;
        return this.d.hashCode() + smw0.b(smw0.b((tsaVar == null ? 0 : tsaVar.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "StationItem(station=" + this.a + ", title=" + ((Object) this.b) + ", subtitle=" + ((Object) this.c) + ", distance=" + ((Object) this.d) + Extension.C_BRAKE;
    }
}
