package defpackage;

import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;

/* loaded from: classes.dex */
public final class ply0 {
    public final String a;
    public final int b;
    public final int c;
    public final DivSizeUnit d;
    public final String e;
    public final DivFontWeight f;
    public final Integer g;
    public final Integer h;
    public final int i;
    public final int j;

    public ply0(String str, int i, int i2, DivSizeUnit divSizeUnit, String str2, DivFontWeight divFontWeight, Integer num, Integer num2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = divSizeUnit;
        this.e = str2;
        this.f = divFontWeight;
        this.g = num;
        this.h = num2;
        this.i = i3;
        this.j = str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ply0)) {
            return false;
        }
        ply0 ply0Var = (ply0) obj;
        return jl40.l(this.a, ply0Var.a) && this.b == ply0Var.b && this.c == ply0Var.c && this.d == ply0Var.d && jl40.l(this.e, ply0Var.e) && this.f == ply0Var.f && jl40.l(this.g, ply0Var.g) && jl40.l(this.h, ply0Var.h) && this.i == ply0Var.i;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DivFontWeight divFontWeight = this.f;
        int hashCode3 = (hashCode2 + (divFontWeight == null ? 0 : divFontWeight.hashCode())) * 31;
        Integer num = this.g;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        return Integer.hashCode(this.i) + ((hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextData(text=");
        sb.append(this.a);
        sb.append(", fontSize=");
        sb.append(this.b);
        sb.append(", fontSizeValue=");
        sb.append(this.c);
        sb.append(", fontSizeUnit=");
        sb.append(this.d);
        sb.append(", fontFamily=");
        sb.append(this.e);
        sb.append(", fontWeight=");
        sb.append(this.f);
        sb.append(", fontWeightValue=");
        sb.append(this.g);
        sb.append(", lineHeight=");
        sb.append(this.h);
        sb.append(", textColor=");
        return oyr.s(sb, this.i, ')');
    }
}
