package defpackage;

import com.ybsdk.feature.main.internal.domain.entities.sbpPartners.Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class phm0 extends gc5 {
    public final Status c;
    public final String d;
    public final String e;
    public final rbv f;
    public final boolean g;
    public final String h;
    public final gu5 i;
    public final vf51 j;
    public final boolean k;
    public final boolean l;

    public phm0(Status status, String str, String str2, rbv rbvVar, boolean z, String str3, gu5 gu5Var, vf51 vf51Var, boolean z2, boolean z3) {
        super(str3, 2);
        this.c = status;
        this.d = str;
        this.e = str2;
        this.f = rbvVar;
        this.g = z;
        this.h = str3;
        this.i = gu5Var;
        this.j = vf51Var;
        this.k = z2;
        this.l = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phm0)) {
            return false;
        }
        phm0 phm0Var = (phm0) obj;
        return this.c == phm0Var.c && jl40.l(this.d, phm0Var.d) && jl40.l(this.e, phm0Var.e) && this.f.equals(phm0Var.f) && this.g == phm0Var.g && jl40.l(this.h, phm0Var.h) && this.i.equals(phm0Var.i) && jl40.l(this.j, phm0Var.j) && this.k == phm0Var.k && this.l == phm0Var.l;
    }

    public final int hashCode() {
        int b = unr0.b(this.c.hashCode() * 31, 31, this.d);
        String str = this.e;
        int hashCode = (this.i.hashCode() + unr0.b(unr0.e(ly3.c(this.f, (b + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.g), 31, this.h)) * 31;
        vf51 vf51Var = this.j;
        return Boolean.hashCode(this.l) + unr0.e((hashCode + (vf51Var != null ? vf51Var.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SbpPartnerListViewItem(status=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subTitle=");
        sb.append(this.e);
        sb.append(", startIcon=");
        sb.append(this.f);
        sb.append(", enabled=");
        unr0.A(", nspkId=", this.h, ", bindAccountSheetOverridesItem=", sb, this.g);
        sb.append(this.i);
        sb.append(", yandexBankPayloadItem=");
        sb.append(this.j);
        sb.append(", shimmerStarted=");
        return smw0.k(", clickable=", Extension.C_BRAKE, sb, this.k, this.l);
    }
}
