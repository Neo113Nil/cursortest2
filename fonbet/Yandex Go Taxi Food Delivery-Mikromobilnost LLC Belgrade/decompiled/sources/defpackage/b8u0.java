package defpackage;

import com.yandex.plus.core.data.common.PlusColor;

/* loaded from: classes2.dex */
public final class b8u0 {
    public final String a;
    public final h2d0 b;
    public final PlusColor c;
    public final PlusColor d;
    public final int e;
    public final af0 f;
    public final String g;
    public final String h;

    public b8u0(String str, h2d0 h2d0Var, PlusColor plusColor, PlusColor plusColor2, int i, af0 af0Var, String str2, String str3) {
        this.a = str;
        this.b = h2d0Var;
        this.c = plusColor;
        this.d = plusColor2;
        this.e = i;
        this.f = af0Var;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8u0)) {
            return false;
        }
        b8u0 b8u0Var = (b8u0) obj;
        return jl40.l(this.a, b8u0Var.a) && this.b.equals(b8u0Var.b) && jl40.l(this.c, b8u0Var.c) && jl40.l(this.d, b8u0Var.d) && this.e == b8u0Var.e && jl40.l(this.f, b8u0Var.f) && this.g.equals(b8u0Var.g) && this.h.equals(b8u0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        PlusColor plusColor = this.c;
        int hashCode2 = (hashCode + (plusColor == null ? 0 : plusColor.hashCode())) * 31;
        PlusColor plusColor2 = this.d;
        int b = oyr.b(this.e, (hashCode2 + (plusColor2 == null ? 0 : plusColor2.hashCode())) * 31, 31);
        af0 af0Var = this.f;
        return this.h.hashCode() + unr0.b((b + (af0Var != null ? af0Var.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusAndFamilyViewContent(title=");
        sb.append(this.a);
        sb.append(", titleDrawableHolder=");
        sb.append(this.b);
        sb.append(", arrowIconColor=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", defaultBackgroundColor=");
        sb.append(this.e);
        sb.append(", addInFamilyViewContent=");
        sb.append(this.f);
        sb.append(", statusContentDescription=");
        sb.append(this.g);
        sb.append(", familyContentDescription=");
        return b64.p(sb, this.h, ')');
    }
}
