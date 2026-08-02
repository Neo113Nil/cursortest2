package defpackage;

import com.yandex.plus.core.data.common.PlusColor;
import java.util.Map;

/* loaded from: classes2.dex */
public final class bld {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;
    public final Map f;
    public final String g;
    public final String h;
    public final PlusColor i;

    public bld(String str, String str2, String str3, String str4, Map map, Map map2, String str5, String str6, PlusColor plusColor) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
        this.f = map2;
        this.g = str5;
        this.h = str6;
        this.i = plusColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bld)) {
            return false;
        }
        bld bldVar = (bld) obj;
        return this.a.equals(bldVar.a) && jl40.l(this.b, bldVar.b) && jl40.l(this.c, bldVar.c) && jl40.l(this.d, bldVar.d) && jl40.l(this.e, bldVar.e) && this.f.equals(bldVar.f) && this.g.equals(bldVar.g) && this.h.equals(bldVar.h) && jl40.l(this.i, bldVar.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.e;
        int b = unr0.b(unr0.b(unr0.d((hashCode4 + (map == null ? 0 : map.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        PlusColor plusColor = this.i;
        return b + (plusColor != null ? plusColor.hashCode() : 0);
    }

    public final String toString() {
        return "OptionDetails(title=" + this.a + ", text=" + this.b + ", description=" + this.c + ", additionText=" + this.d + ", payload=" + this.e + ", images=" + this.f + ", offerName=" + this.g + ", optionName=" + this.h + ", backgroundTv=" + this.i + ')';
    }
}
