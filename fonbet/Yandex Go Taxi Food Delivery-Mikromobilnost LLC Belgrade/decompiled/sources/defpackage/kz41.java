package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class kz41 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final boolean f;

    public kz41(String str, String str2, String str3, List list, List list2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz41)) {
            return false;
        }
        kz41 kz41Var = (kz41) obj;
        return jl40.l(this.a, kz41Var.a) && jl40.l(this.b, kz41Var.b) && jl40.l(this.c, kz41Var.c) && jl40.l(this.d, kz41Var.d) && jl40.l(this.e, kz41Var.e) && this.f == kz41Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.c(unr0.c(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("WhereYouAreParams(title=", this.a, ", anotherAddressText=", this.b, ", description=");
        tse0.x(this.c, ", addresses=", ", pickupPoints=", v, this.d);
        v.append(this.e);
        v.append(", showAnotherAddressSearchAtStart=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
