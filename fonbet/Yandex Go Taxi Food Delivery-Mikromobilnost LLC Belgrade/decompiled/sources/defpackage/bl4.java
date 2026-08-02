package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class bl4 {
    public final String a;
    public final kdc b;
    public final kdc c;
    public final float d;
    public final String e;
    public final FormattedText f;
    public final ol4 g;
    public final BadgeModel$Type h;
    public final zyr0 i;

    public bl4(String str, kdc kdcVar, kdc kdcVar2, float f, String str2, FormattedText formattedText, ol4 ol4Var, BadgeModel$Type badgeModel$Type, zyr0 zyr0Var) {
        this.a = str;
        this.b = kdcVar;
        this.c = kdcVar2;
        this.d = f;
        this.e = str2;
        this.f = formattedText;
        this.g = ol4Var;
        this.h = badgeModel$Type;
        this.i = zyr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl4)) {
            return false;
        }
        bl4 bl4Var = (bl4) obj;
        return jl40.l(this.a, bl4Var.a) && jl40.l(this.b, bl4Var.b) && jl40.l(this.c, bl4Var.c) && Float.compare(this.d, bl4Var.d) == 0 && jl40.l(this.e, bl4Var.e) && jl40.l(this.f, bl4Var.f) && jl40.l(this.g, bl4Var.g) && this.h == bl4Var.h && jl40.l(this.i, bl4Var.i);
    }

    public final int hashCode() {
        int c = g8e.c(this.d, smw0.d(this.c, smw0.d(this.b, this.a.hashCode() * 31, 31), 31), 31);
        String str = this.e;
        int c2 = unr0.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.f.a);
        ol4 ol4Var = this.g;
        int hashCode = (this.h.hashCode() + ((c2 + (ol4Var == null ? 0 : ol4Var.hashCode())) * 31)) * 31;
        zyr0 zyr0Var = this.i;
        return hashCode + (zyr0Var != null ? zyr0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Base(text=" + this.a + ", textColor=" + this.b + ", bgColor=" + this.c + ", bgAlpha=" + this.d + ", bgMetaColor=" + this.e + ", attributedText=" + this.f + ", showPolicy=" + this.g + ", type=" + this.h + ", analyticsData=" + this.i + Extension.C_BRAKE;
    }
}
