package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.ui.ButtonSize;
import ru.yandex.taxi.common_models.ui.TextStyle;

/* loaded from: classes6.dex */
public final class my6 {
    public static final my6 k = new my6(null, null, null, null, null, null, null, false, false, 16383);
    public final CharSequence a;
    public final kdc b;
    public final kdc c;
    public final TextStyle d;
    public final zy6 e;
    public final CharSequence f;
    public final kdc g;
    public final ButtonSize h;
    public final boolean i;
    public final boolean j;

    public my6(CharSequence charSequence, kdc kdcVar, kdc kdcVar2, TextStyle textStyle, zy6 zy6Var, CharSequence charSequence2, bdc bdcVar, boolean z, boolean z2, int i) {
        charSequence = (i & 1) != 0 ? "" : charSequence;
        kdcVar = (i & 2) != 0 ? null : kdcVar;
        kdcVar2 = (i & 8) != 0 ? null : kdcVar2;
        textStyle = (i & 16) != 0 ? null : textStyle;
        zy6Var = (i & 64) != 0 ? null : zy6Var;
        charSequence2 = (i & 128) != 0 ? null : charSequence2;
        bdcVar = (i & 256) != 0 ? null : bdcVar;
        ButtonSize buttonSize = ButtonSize.L;
        z = (i & 1024) != 0 ? true : z;
        z2 = (i & 8192) != 0 ? false : z2;
        this.a = charSequence;
        this.b = kdcVar;
        this.c = kdcVar2;
        this.d = textStyle;
        this.e = zy6Var;
        this.f = charSequence2;
        this.g = bdcVar;
        this.h = buttonSize;
        this.i = z;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my6)) {
            return false;
        }
        my6 my6Var = (my6) obj;
        return jl40.l(this.a, my6Var.a) && jl40.l(this.b, my6Var.b) && jl40.l(this.c, my6Var.c) && this.d == my6Var.d && jl40.l(this.e, my6Var.e) && jl40.l(this.f, my6Var.f) && jl40.l(this.g, my6Var.g) && this.h == my6Var.h && this.i == my6Var.i && this.j == my6Var.j;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kdc kdcVar = this.b;
        int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 961;
        kdc kdcVar2 = this.c;
        int hashCode3 = (hashCode2 + (kdcVar2 == null ? 0 : kdcVar2.hashCode())) * 31;
        TextStyle textStyle = this.d;
        int hashCode4 = (hashCode3 + (textStyle == null ? 0 : textStyle.hashCode())) * 961;
        zy6 zy6Var = this.e;
        int hashCode5 = (hashCode4 + (zy6Var == null ? 0 : zy6Var.hashCode())) * 31;
        CharSequence charSequence = this.f;
        int hashCode6 = (hashCode5 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        kdc kdcVar3 = this.g;
        return Boolean.hashCode(this.j) + unr0.e(unr0.e((this.h.hashCode() + ((hashCode6 + (kdcVar3 == null ? 0 : kdcVar3.hashCode())) * 31)) * 31, 31, this.i), 961, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(text=");
        sb.append((Object) this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", disabledTextColor=null, bgColor=");
        sb.append(this.c);
        sb.append(", titleTextStyle=");
        sb.append(this.d);
        sb.append(", titleTextSize=null, action=");
        sb.append(this.e);
        sb.append(", subtitle=");
        sb.append((Object) this.f);
        sb.append(", subtitleColor=");
        sb.append(this.g);
        sb.append(", size=");
        sb.append(this.h);
        sb.append(", isEnabled=");
        return smw0.k(", startShimmeringOnTap=false, alpha=null, isShimmering=", Extension.C_BRAKE, sb, this.i, this.j);
    }

    public my6() {
        this(null, null, null, null, null, null, null, false, false, 16383);
    }
}
