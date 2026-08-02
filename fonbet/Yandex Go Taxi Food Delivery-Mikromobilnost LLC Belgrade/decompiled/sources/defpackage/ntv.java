package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lntv;", "", "Companion", "ltv", "mtv", "order_popup"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ntv {
    public static final mtv Companion = new mtv();
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    public /* synthetic */ ntv(int i, String str, int i2, int i3, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, String str5) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z2;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z3;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntv)) {
            return false;
        }
        ntv ntvVar = (ntv) obj;
        return jl40.l(this.a, ntvVar.a) && this.b == ntvVar.b && this.c == ntvVar.c && jl40.l(this.d, ntvVar.d) && jl40.l(this.e, ntvVar.e) && jl40.l(this.f, ntvVar.f) && this.g == ntvVar.g && this.h == ntvVar.h && this.i == ntvVar.i && jl40.l(this.j, ntvVar.j);
    }

    public final int hashCode() {
        int b = oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.j.hashCode() + unr0.e(unr0.e(unr0.e(unr0.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "InfoModalCardParams(showPolicyId=", this.a, ", maxShowCount=", ", showCount=");
        smw0.t(this.c, ", offerId=", this.d, ", tariff=", u);
        g8e.D(u, this.e, ", title=", this.f, ", bullets=");
        nnm.v(", description=", ", isTariffUnavailible=", u, this.g, this.h);
        return n.m(", buttonType=", this.j, Extension.C_BRAKE, u, this.i);
    }

    public ntv(String str, int i, int i2, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, String str5) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = str5;
    }

    public ntv() {
        this("", 0, 0, null, null, "", false, false, false, "");
    }
}
