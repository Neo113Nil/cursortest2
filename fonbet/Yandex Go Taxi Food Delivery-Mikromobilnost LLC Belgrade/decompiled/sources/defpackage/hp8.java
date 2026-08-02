package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes12.dex */
public final class hp8 {
    public final String a;
    public final gp8 b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final DividerType i;
    public final String j;
    public final String k;
    public final boolean l;

    public hp8(String str, gp8 gp8Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str2, boolean z, boolean z2, DividerType dividerType, String str3, String str4, boolean z3) {
        this.a = str;
        this.b = gp8Var;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = str2;
        this.g = z;
        this.h = z2;
        this.i = dividerType;
        this.j = str3;
        this.k = str4;
        this.l = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp8)) {
            return false;
        }
        hp8 hp8Var = (hp8) obj;
        return jl40.l(this.a, hp8Var.a) && jl40.l(this.b, hp8Var.b) && this.c.equals(hp8Var.c) && this.d.equals(hp8Var.d) && this.e.equals(hp8Var.e) && jl40.l(this.f, hp8Var.f) && this.g == hp8Var.g && this.h == hp8Var.h && this.i == hp8Var.i && jl40.l(this.j, hp8Var.j) && this.k.equals(hp8Var.k) && this.l == hp8Var.l;
    }

    public final int hashCode() {
        int b = smw0.b(smw0.b(smw0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (this.i.hashCode() + unr0.e(unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h)) * 31;
        String str2 = this.j;
        return Boolean.hashCode(this.l) + unr0.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestTariffItemUiState(tariffName=");
        sb.append(this.a);
        sb.append(", suggestTariffIcon=");
        sb.append(this.b);
        sb.append(", title=");
        vfc.A(sb, this.c, ", subtitle=", this.d, ", price=");
        sb.append((Object) this.e);
        sb.append(", cashbackValue=");
        sb.append(this.f);
        sb.append(", isSelected=");
        nnm.v(", isEnabled=", ", dividerType=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", confirmModalId=");
        sb.append(this.j);
        sb.append(", contentDescription=");
        return nnm.i(this.k, ", isMultichoice=", Extension.C_BRAKE, sb, this.l);
    }
}
