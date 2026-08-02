package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class nl30 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final ovi0 e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    public final List j;
    public final ml30 k;
    public final hk30 l;

    public nl30(String str, boolean z, boolean z2, String str2, ovi0 ovi0Var, String str3, boolean z3, String str4, String str5, List list, ml30 ml30Var, hk30 hk30Var, int i) {
        str = (i & 1) != 0 ? null : str;
        z2 = (i & 4) != 0 ? true : z2;
        str2 = (i & 8) != 0 ? null : str2;
        ovi0Var = (i & 16) != 0 ? null : ovi0Var;
        str3 = (i & 32) != 0 ? null : str3;
        str4 = (i & 128) != 0 ? null : str4;
        str5 = (i & 256) != 0 ? null : str5;
        list = (i & 512) != 0 ? null : list;
        ml30Var = (i & 1024) != 0 ? null : ml30Var;
        hk30Var = (i & 2048) != 0 ? null : hk30Var;
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
        this.e = ovi0Var;
        this.f = str3;
        this.g = z3;
        this.h = str4;
        this.i = str5;
        this.j = list;
        this.k = ml30Var;
        this.l = hk30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl30)) {
            return false;
        }
        nl30 nl30Var = (nl30) obj;
        return jl40.l(this.a, nl30Var.a) && this.b == nl30Var.b && this.c == nl30Var.c && jl40.l(this.d, nl30Var.d) && jl40.l(this.e, nl30Var.e) && jl40.l(this.f, nl30Var.f) && this.g == nl30Var.g && jl40.l(this.h, nl30Var.h) && jl40.l(this.i, nl30Var.i) && jl40.l(this.j, nl30Var.j) && jl40.l(this.k, nl30Var.k) && jl40.l(this.l, nl30Var.l);
    }

    public final int hashCode() {
        String str = this.a;
        int e = unr0.e(unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        int hashCode = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        ovi0 ovi0Var = this.e;
        int hashCode2 = (hashCode + (ovi0Var == null ? 0 : ovi0Var.hashCode())) * 31;
        String str3 = this.f;
        int e2 = unr0.e((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g);
        String str4 = this.h;
        int hashCode3 = (e2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.j;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ml30 ml30Var = this.k;
        int hashCode6 = (hashCode5 + (ml30Var == null ? 0 : ml30Var.hashCode())) * 31;
        hk30 hk30Var = this.l;
        return hashCode6 + (hk30Var != null ? hk30Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("MtGeoPaymentModalUiState(qrHeaderTitle=", this.a, ", qrIsHidden=", ", showDivider=", this.b);
        unr0.A(", qrHeaderSubtitle=", this.d, ", qrButtonImage=", l, this.c);
        l.append(this.e);
        l.append(", qrButtonText=");
        l.append(this.f);
        l.append(", bleTitleIsHidden=");
        unr0.A(", errorText=", this.h, ", settingsButtonTitle=", l, this.g);
        tse0.x(this.i, ", itemsList=", ", settingsButtonAction=", l, this.j);
        l.append(this.k);
        l.append(", connectionError=");
        l.append(this.l);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
