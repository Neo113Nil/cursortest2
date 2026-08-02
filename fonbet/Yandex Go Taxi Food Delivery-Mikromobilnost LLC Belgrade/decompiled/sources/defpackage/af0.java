package defpackage;

import com.yandex.plus.core.data.common.PlusColor;

/* loaded from: classes2.dex */
public final class af0 {
    public final String a;
    public final h2d0 b;
    public final PlusColor c;
    public final PlusColor d;
    public final int e;

    public af0(String str, h2d0 h2d0Var, PlusColor plusColor, PlusColor plusColor2, int i) {
        this.a = str;
        this.b = h2d0Var;
        this.c = plusColor;
        this.d = plusColor2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af0)) {
            return false;
        }
        af0 af0Var = (af0) obj;
        return jl40.l(this.a, af0Var.a) && this.b.equals(af0Var.b) && jl40.l(this.c, af0Var.c) && jl40.l(this.d, af0Var.d) && this.e == af0Var.e;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        PlusColor plusColor = this.c;
        int hashCode2 = (hashCode + (plusColor == null ? 0 : plusColor.hashCode())) * 31;
        PlusColor plusColor2 = this.d;
        return Integer.hashCode(this.e) + ((hashCode2 + (plusColor2 != null ? plusColor2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddInFamilyViewContent(title=");
        sb.append(this.a);
        sb.append(", titleDrawableHolder=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sb.append(this.c);
        sb.append(", iconPlusColor=");
        sb.append(this.d);
        sb.append(", defaultBackgroundColor=");
        return oyr.s(sb, this.e, ')');
    }
}
