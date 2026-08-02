package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fmo extends udf0 {
    public final String c;
    public final emo d;
    public final v4v e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final ifa0 i;
    public final hhg j;

    public fmo(String str, emo emoVar, ra90 ra90Var, String str2, boolean z, boolean z2, ifa0 ifa0Var, hhg hhgVar) {
        this.c = str;
        this.d = emoVar;
        this.e = ra90Var;
        this.f = str2;
        this.g = z;
        this.h = z2;
        this.i = ifa0Var;
        this.j = hhgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmo)) {
            return false;
        }
        fmo fmoVar = (fmo) obj;
        return jl40.l(this.c, fmoVar.c) && jl40.l(this.d, fmoVar.d) && jl40.l(this.e, fmoVar.e) && jl40.l(this.f, fmoVar.f) && this.g == fmoVar.g && this.h == fmoVar.h && jl40.l(this.i, fmoVar.i) && jl40.l(this.j, fmoVar.j);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        emo emoVar = this.d;
        int hashCode2 = (hashCode + (emoVar == null ? 0 : emoVar.hashCode())) * 31;
        v4v v4vVar = this.e;
        int hashCode3 = (hashCode2 + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31;
        String str = this.f;
        int e = unr0.e(unr0.e((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h);
        ifa0 ifa0Var = this.i;
        return this.j.hashCode() + ((e + (ifa0Var != null ? ifa0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExistingProfileState(title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", iconState=");
        sb.append(this.e);
        sb.append(", corpClientId=");
        sb.append(this.f);
        sb.append(", isEnabled=");
        nnm.v(", isChecked=", ", paymentOptions=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", actionModel=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
