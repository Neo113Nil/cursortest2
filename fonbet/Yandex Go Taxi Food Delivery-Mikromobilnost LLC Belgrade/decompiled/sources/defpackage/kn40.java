package defpackage;

import com.yandex.go.tariffcard.ui.MultiTariffOption$LeadIconType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kn40 implements uhx0, e6v {
    public final String a;
    public final String b;
    public final MultiTariffOption$LeadIconType c;
    public final boolean d;
    public final dn40 e;
    public final String f;
    public final in40 g;
    public final boolean h;
    public final hq40 i;
    public final nco j;
    public final hn40 k;
    public final String l;

    public kn40(String str, String str2, MultiTariffOption$LeadIconType multiTariffOption$LeadIconType, boolean z, dn40 dn40Var, String str3, in40 in40Var, boolean z2, hq40 hq40Var, nco ncoVar, hn40 hn40Var) {
        String o = g8e.o("TariffCardCheckItem", str);
        this.a = str;
        this.b = str2;
        this.c = multiTariffOption$LeadIconType;
        this.d = z;
        this.e = dn40Var;
        this.f = str3;
        this.g = in40Var;
        this.h = z2;
        this.i = hq40Var;
        this.j = ncoVar;
        this.k = hn40Var;
        this.l = o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn40)) {
            return false;
        }
        kn40 kn40Var = (kn40) obj;
        return jl40.l(this.a, kn40Var.a) && jl40.l(this.b, kn40Var.b) && this.c == kn40Var.c && this.d == kn40Var.d && jl40.l(this.e, kn40Var.e) && jl40.l(this.f, kn40Var.f) && jl40.l(this.g, kn40Var.g) && this.h == kn40Var.h && jl40.l(this.i, kn40Var.i) && jl40.l(this.j, kn40Var.j) && jl40.l(this.k, kn40Var.k) && jl40.l(this.l, kn40Var.l);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.l;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.e.hashCode() + unr0.e((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d)) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        in40 in40Var = this.g;
        int hashCode4 = (this.i.hashCode() + unr0.e((hashCode3 + (in40Var == null ? 0 : in40Var.hashCode())) * 31, 31, this.h)) * 31;
        nco ncoVar = this.j;
        int hashCode5 = ncoVar != null ? ncoVar.hashCode() : 0;
        return this.l.hashCode() + ((this.k.hashCode() + ((hashCode4 + hashCode5) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("MultiTariffOption(tariffClass=", this.a, ", leadIconUrl=", this.b, ", leadIconType=");
        v.append(this.c);
        v.append(", isChecked=");
        v.append(this.d);
        v.append(", checkedCheckboxColors=");
        v.append(this.e);
        v.append(", title=");
        v.append(this.f);
        v.append(", subtitle=");
        v.append(this.g);
        v.append(", hasTopDivider=");
        v.append(this.h);
        v.append(", disabledInfo=");
        v.append(this.i);
        v.append(", etaUiState=");
        v.append(this.j);
        v.append(", priceInfo=");
        v.append(this.k);
        v.append(", id=");
        v.append(this.l);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
