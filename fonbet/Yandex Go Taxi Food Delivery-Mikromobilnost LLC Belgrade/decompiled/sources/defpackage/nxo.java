package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class nxo {
    public final String a;
    public final String b;
    public final fr c;

    public nxo(String str, String str2, fr frVar) {
        this.a = str;
        this.b = str2;
        this.c = frVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxo)) {
            return false;
        }
        nxo nxoVar = (nxo) obj;
        return jl40.l(this.a, nxoVar.a) && jl40.l(this.b, nxoVar.b) && this.c.equals(nxoVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ExtendedOptionItem(title=", this.a, ", iconUrl=", this.b, ", action=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
