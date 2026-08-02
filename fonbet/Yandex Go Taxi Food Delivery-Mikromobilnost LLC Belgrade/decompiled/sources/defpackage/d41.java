package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.FieldVisibility;

/* loaded from: classes5.dex */
public final class d41 {
    public final String a;
    public final String b;
    public final ow91 c;
    public final hts0 d;
    public final boolean e;
    public final boolean f;
    public final FieldVisibility g;
    public final boolean h;

    public d41(String str, String str2, ow91 ow91Var, hts0 hts0Var, boolean z, boolean z2, FieldVisibility fieldVisibility, boolean z3, int i) {
        z2 = (i & 32) != 0 ? false : z2;
        fieldVisibility = (i & 64) != 0 ? FieldVisibility.VISIBLE : fieldVisibility;
        z3 = (i & 128) != 0 ? false : z3;
        this.a = str;
        this.b = str2;
        this.c = ow91Var;
        this.d = hts0Var;
        this.e = z;
        this.f = z2;
        this.g = fieldVisibility;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d41)) {
            return false;
        }
        d41 d41Var = (d41) obj;
        return jl40.l(this.a, d41Var.a) && jl40.l(this.b, d41Var.b) && jl40.l(this.c, d41Var.c) && jl40.l(this.d, d41Var.d) && this.e == d41Var.e && this.f == d41Var.f && this.g == d41Var.g && this.h == d41Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + unr0.e(unr0.e((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("AddressModel(mainText=", this.a, ", additionalText=", this.b, ", mainTextColor=");
        v.append(this.c);
        v.append(", lead=");
        v.append(this.d);
        v.append(", isLoading=");
        nnm.v(", isLocked=", ", visibility=", v, this.e, this.f);
        v.append(this.g);
        v.append(", showDeleteButton=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
