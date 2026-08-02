package defpackage;

import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTextAlignmentVertical;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mlt0 implements Comparable {
    public static final DivSizeUnit O = DivSizeUnit.SP;
    public final DivSizeUnit A;
    public final DivFontWeight B;
    public final Integer C;
    public final JSONObject D;
    public final Double E;
    public final Integer F;
    public final gy00 G;
    public final DivLineStyle H;
    public final Integer I;
    public final kgr0 J;
    public final Integer K;
    public final Integer L;
    public final Integer M;
    public final DivLineStyle N;
    public final int a;
    public final int b;
    public final DivTextAlignmentVertical c;
    public final int w;
    public final String x;
    public final String y;
    public final Integer z;

    public mlt0(int i, int i2, DivTextAlignmentVertical divTextAlignmentVertical, int i3, String str, String str2, Integer num, DivSizeUnit divSizeUnit, DivFontWeight divFontWeight, Integer num2, JSONObject jSONObject, Double d, Integer num3, gy00 gy00Var, DivLineStyle divLineStyle, Integer num4, kgr0 kgr0Var, Integer num5, Integer num6, Integer num7, DivLineStyle divLineStyle2) {
        this.a = i;
        this.b = i2;
        this.c = divTextAlignmentVertical;
        this.w = i3;
        this.x = str;
        this.y = str2;
        this.z = num;
        this.A = divSizeUnit;
        this.B = divFontWeight;
        this.C = num2;
        this.D = jSONObject;
        this.E = d;
        this.F = num3;
        this.G = gy00Var;
        this.H = divLineStyle;
        this.I = num4;
        this.J = kgr0Var;
        this.K = num5;
        this.L = num6;
        this.M = num7;
        this.N = divLineStyle2;
    }

    public final mlt0 a(mlt0 mlt0Var, int i, int i2) {
        Integer num;
        Integer num2;
        DivTextAlignmentVertical divTextAlignmentVertical = mlt0Var.c;
        if (divTextAlignmentVertical == null) {
            divTextAlignmentVertical = this.c;
        }
        int i3 = mlt0Var.w;
        if (i3 == 0) {
            i3 = this.w;
        }
        String str = mlt0Var.x;
        if (str == null) {
            str = this.x;
        }
        String str2 = mlt0Var.y;
        if (str2 == null) {
            str2 = this.y;
        }
        Integer num3 = mlt0Var.z;
        if (num3 == null) {
            num3 = this.z;
        }
        DivSizeUnit divSizeUnit = mlt0Var.A;
        if (divSizeUnit == O) {
            divSizeUnit = this.A;
        }
        DivFontWeight divFontWeight = mlt0Var.B;
        if (divFontWeight == null) {
            divFontWeight = this.B;
        }
        Integer num4 = mlt0Var.C;
        if (num4 == null) {
            num4 = this.C;
        }
        JSONObject jSONObject = mlt0Var.D;
        if (jSONObject == null) {
            jSONObject = this.D;
        }
        Double d = mlt0Var.E;
        if (d == null) {
            d = this.E;
        }
        Integer num5 = mlt0Var.F;
        if (num5 == null) {
            num5 = this.F;
        }
        gy00 gy00Var = mlt0Var.G;
        if (gy00Var == null) {
            gy00Var = this.G;
        }
        DivLineStyle divLineStyle = mlt0Var.H;
        if (divLineStyle == null) {
            divLineStyle = this.H;
        }
        Integer num6 = mlt0Var.I;
        if (num6 == null) {
            num6 = this.I;
        }
        Integer num7 = num6;
        kgr0 kgr0Var = mlt0Var.J;
        if (kgr0Var == null) {
            kgr0Var = this.J;
        }
        kgr0 kgr0Var2 = kgr0Var;
        Integer num8 = mlt0Var.K;
        if (num8 == null) {
            num8 = this.K;
        }
        Integer num9 = num8;
        Integer num10 = num8 != null ? mlt0Var.L : this.L;
        if (num8 != null) {
            num = num10;
            num2 = mlt0Var.M;
        } else {
            num = num10;
            num2 = this.M;
        }
        DivLineStyle divLineStyle2 = mlt0Var.N;
        if (divLineStyle2 == null) {
            divLineStyle2 = this.N;
        }
        return new mlt0(i, i2, divTextAlignmentVertical, i3, str, str2, num3, divSizeUnit, divFontWeight, num4, jSONObject, d, num5, gy00Var, divLineStyle, num7, kgr0Var2, num9, num, num2, divLineStyle2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((mlt0) obj).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlt0)) {
            return false;
        }
        mlt0 mlt0Var = (mlt0) obj;
        return this.a == mlt0Var.a && this.b == mlt0Var.b && this.c == mlt0Var.c && this.w == mlt0Var.w && jl40.l(this.x, mlt0Var.x) && jl40.l(this.y, mlt0Var.y) && jl40.l(this.z, mlt0Var.z) && this.A == mlt0Var.A && this.B == mlt0Var.B && jl40.l(this.C, mlt0Var.C) && jl40.l(this.D, mlt0Var.D) && jl40.l(this.E, mlt0Var.E) && jl40.l(this.F, mlt0Var.F) && jl40.l(this.G, mlt0Var.G) && this.H == mlt0Var.H && jl40.l(this.I, mlt0Var.I) && jl40.l(this.J, mlt0Var.J) && jl40.l(this.K, mlt0Var.K) && jl40.l(this.L, mlt0Var.L) && jl40.l(this.M, mlt0Var.M) && this.N == mlt0Var.N;
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
        DivTextAlignmentVertical divTextAlignmentVertical = this.c;
        int b2 = oyr.b(this.w, (b + (divTextAlignmentVertical == null ? 0 : divTextAlignmentVertical.hashCode())) * 31, 31);
        String str = this.x;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.y;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.z;
        int hashCode3 = (this.A.hashCode() + ((hashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        DivFontWeight divFontWeight = this.B;
        int hashCode4 = (hashCode3 + (divFontWeight == null ? 0 : divFontWeight.hashCode())) * 31;
        Integer num2 = this.C;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        JSONObject jSONObject = this.D;
        int hashCode6 = (hashCode5 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        Double d = this.E;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num3 = this.F;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        gy00 gy00Var = this.G;
        int hashCode9 = (hashCode8 + (gy00Var == null ? 0 : gy00Var.hashCode())) * 31;
        DivLineStyle divLineStyle = this.H;
        int hashCode10 = (hashCode9 + (divLineStyle == null ? 0 : divLineStyle.hashCode())) * 31;
        Integer num4 = this.I;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        kgr0 kgr0Var = this.J;
        int hashCode12 = (hashCode11 + (kgr0Var == null ? 0 : kgr0Var.hashCode())) * 31;
        Integer num5 = this.K;
        int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.L;
        int hashCode14 = (hashCode13 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.M;
        int hashCode15 = (hashCode14 + (num7 == null ? 0 : num7.hashCode())) * 31;
        DivLineStyle divLineStyle2 = this.N;
        return hashCode15 + (divLineStyle2 != null ? divLineStyle2.hashCode() : 0);
    }

    public final String toString() {
        return "SpanData(start=" + this.a + ", end=" + this.b + ", alignmentVertical=" + this.c + ", baselineOffset=" + this.w + ", fontFamily=" + this.x + ", fontFeatureSettings=" + this.y + ", fontSize=" + this.z + ", fontSizeUnit=" + this.A + ", fontWeight=" + this.B + ", fontWeightValue=" + this.C + ", fontVariationSettings=" + this.D + ", letterSpacing=" + this.E + ", lineHeight=" + this.F + ", mask=" + this.G + ", strike=" + this.H + ", textColor=" + this.I + ", textShadow=" + this.J + ", topOffset=" + this.K + ", topOffsetStart=" + this.L + ", topOffsetEnd=" + this.M + ", underline=" + this.N + ')';
    }
}
