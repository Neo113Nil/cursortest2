package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pgs0 {
    public final String a;
    public final ColorModel b;
    public final String c;
    public final ColorModel d;
    public final jq51 e;
    public final jbv f;
    public final rbv g;
    public final rbv h;
    public final String i;

    public pgs0(String str, ColorModel colorModel, String str2, ColorModel colorModel2, jq51 jq51Var, jbv jbvVar, jbv jbvVar2, jbv jbvVar3, String str3) {
        this.a = str;
        this.b = colorModel;
        this.c = str2;
        this.d = colorModel2;
        this.e = jq51Var;
        this.f = jbvVar;
        this.g = jbvVar2;
        this.h = jbvVar3;
        this.i = str3;
    }

    public final rbv a() {
        return this.h;
    }

    public final String b() {
        return this.c;
    }

    public final ColorModel c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final ColorModel e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgs0)) {
            return false;
        }
        pgs0 pgs0Var = (pgs0) obj;
        return jl40.l(this.a, pgs0Var.a) && this.b.equals(pgs0Var.b) && jl40.l(this.c, pgs0Var.c) && this.d.equals(pgs0Var.d) && this.e.equals(pgs0Var.e) && this.f.equals(pgs0Var.f) && jl40.l(this.g, pgs0Var.g) && jl40.l(this.h, pgs0Var.h) && jl40.l(this.i, pgs0Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + vfc.d(this.d, unr0.b(vfc.d(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31)) * 31)) * 31;
        rbv rbvVar = this.g;
        int hashCode2 = (hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        rbv rbvVar2 = this.h;
        int hashCode3 = (hashCode2 + (rbvVar2 == null ? 0 : rbvVar2.hashCode())) * 31;
        String str = this.i;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleCardHeaderEntity(title=");
        sb.append(this.a);
        sb.append(", titleColor=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", subtitleColor=");
        sb.append(this.d);
        sb.append(", cardSkin=");
        sb.append(this.e);
        sb.append(", nfcBadge=");
        sb.append(this.f);
        sb.append(", badge=");
        sb.append(this.g);
        sb.append(", renameImageModel=");
        sb.append(this.h);
        sb.append(", renameAction=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
