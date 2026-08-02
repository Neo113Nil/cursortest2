package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class evm implements uni {
    public final hvm A;
    public final String a;
    public final String b;
    public final String c;
    public final sbv w;
    public final m2n x;
    public final String y;
    public final String z;

    public evm(String str, String str2, String str3, sbv sbvVar, m2n m2nVar, String str4, String str5, hvm hvmVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.w = sbvVar;
        this.x = m2nVar;
        this.y = str4;
        this.z = str5;
        this.A = hvmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evm)) {
            return false;
        }
        evm evmVar = (evm) obj;
        return jl40.l(this.a, evmVar.a) && jl40.l(this.b, evmVar.b) && jl40.l(this.c, evmVar.c) && this.w.equals(evmVar.w) && this.x.equals(evmVar.x) && jl40.l(this.y, evmVar.y) && jl40.l(this.z, evmVar.z) && jl40.l(this.A, evmVar.A);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int b = ly3.b((this.w.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.x.a);
        String str3 = this.y;
        int b2 = unr0.b((b + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.z);
        hvm hvmVar = this.A;
        return b2 + (hvmVar != null ? hvmVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DueArgs(title=", this.a, ", subtitle=", this.b, ", descriptionSubtitle=");
        v.append(this.c);
        v.append(", descriptionIcon=");
        v.append(this.w);
        v.append(", tree=");
        v.append(this.x);
        v.append(", metricaLabel=");
        v.append(this.y);
        v.append(", formStateKey=");
        v.append(this.z);
        v.append(", buttonsConfig=");
        v.append(this.A);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
