package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fnz {
    public final String a = null;
    public final String b = null;
    public final String c = null;
    public final String d = null;
    public final String e = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnz)) {
            return false;
        }
        fnz fnzVar = (fnz) obj;
        return jl40.l(this.a, fnzVar.a) && jl40.l(this.b, fnzVar.b) && jl40.l(this.c, fnzVar.c) && jl40.l(this.d, fnzVar.d) && jl40.l(this.e, fnzVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Popup(title=", this.a, ", description=", this.b, ", buttonTitle=");
        g8e.D(v, this.c, ", searchCardTitle=", this.d, ", searchCardSubtitle=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
