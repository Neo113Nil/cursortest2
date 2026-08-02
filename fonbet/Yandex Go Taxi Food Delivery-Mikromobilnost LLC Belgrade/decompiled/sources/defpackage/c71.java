package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.address.AddressPositionModel;

/* loaded from: classes5.dex */
public final class c71 implements pre, hon {
    public final String a;
    public final c0k0 b;
    public final AddressPositionModel c;
    public final FormattedText d;
    public final FormattedText e;
    public final hty0 f;
    public final lts0 g;
    public final lts0 h;
    public final fws0 i;
    public final r9x0 j;
    public final String k;
    public final vu0 l;
    public final Map m;
    public final o690 n;

    public c71(String str, c0k0 c0k0Var, AddressPositionModel addressPositionModel, FormattedText formattedText, FormattedText formattedText2, hty0 hty0Var, lts0 lts0Var, lts0 lts0Var2, fws0 fws0Var, r9x0 r9x0Var, String str2, vu0 vu0Var, Map map, o690 o690Var) {
        this.a = str;
        this.b = c0k0Var;
        this.c = addressPositionModel;
        this.d = formattedText;
        this.e = formattedText2;
        this.f = hty0Var;
        this.g = lts0Var;
        this.h = lts0Var2;
        this.i = fws0Var;
        this.j = r9x0Var;
        this.k = str2;
        this.l = vu0Var;
        this.m = map;
        this.n = o690Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c71)) {
            return false;
        }
        c71 c71Var = (c71) obj;
        return jl40.l(this.a, c71Var.a) && this.b.equals(c71Var.b) && this.c == c71Var.c && this.d.equals(c71Var.d) && this.e.equals(c71Var.e) && jl40.l(this.f, c71Var.f) && jl40.l(this.g, c71Var.g) && jl40.l(this.h, c71Var.h) && jl40.l(this.i, c71Var.i) && jl40.l(this.j, c71Var.j) && jl40.l(this.k, c71Var.k) && jl40.l(this.l, c71Var.l) && jl40.l(this.m, c71Var.m) && jl40.l(this.n, c71Var.n);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "address-selector-item";
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d.a), 31, this.e.a);
        hty0 hty0Var = this.f;
        int hashCode = (c + (hty0Var == null ? 0 : hty0Var.hashCode())) * 31;
        lts0 lts0Var = this.g;
        int hashCode2 = (hashCode + (lts0Var == null ? 0 : lts0Var.hashCode())) * 31;
        lts0 lts0Var2 = this.h;
        int hashCode3 = (hashCode2 + (lts0Var2 == null ? 0 : lts0Var2.hashCode())) * 31;
        fws0 fws0Var = this.i;
        int hashCode4 = (hashCode3 + (fws0Var == null ? 0 : fws0Var.hashCode())) * 31;
        r9x0 r9x0Var = this.j;
        int hashCode5 = (hashCode4 + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31;
        String str = this.k;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        vu0 vu0Var = this.l;
        int hashCode7 = (hashCode6 + (vu0Var == null ? 0 : vu0Var.hashCode())) * 31;
        Map map = this.m;
        int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        o690 o690Var = this.n;
        return hashCode8 + (o690Var != null ? o690Var.hashCode() : 0);
    }

    public final String toString() {
        return "AddressSelectorRemoteCoreWidget(id=" + this.a + ", resultPosition=" + this.b + ", addressPosition=" + this.c + ", selectedDescription=" + this.d + ", unselectedDescription=" + this.e + ", addressStyle=" + this.f + ", selectedLead=" + this.g + ", unselectedLead=" + this.h + ", trail=" + this.i + ", action=" + this.j + ", metricaLabel=" + this.k + ", addressFlow=" + this.l + ", meta=" + this.m + ", paddings=" + this.n + Extension.C_BRAKE;
    }
}
