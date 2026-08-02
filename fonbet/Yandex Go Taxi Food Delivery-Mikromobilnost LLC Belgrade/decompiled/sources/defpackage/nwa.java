package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nwa {
    public final String a;
    public final CharSequence b;
    public final boolean c;

    public nwa(boolean z, CharSequence charSequence, String str) {
        this.a = str;
        this.b = charSequence;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwa)) {
            return false;
        }
        nwa nwaVar = (nwa) obj;
        return jl40.l(this.a, nwaVar.a) && jl40.l(this.b, nwaVar.b) && this.c == nwaVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(ly3.t(this.b, "ChargersTab(id=", this.a, ", title=", ", showBadge="), this.c, Extension.C_BRAKE);
    }
}
