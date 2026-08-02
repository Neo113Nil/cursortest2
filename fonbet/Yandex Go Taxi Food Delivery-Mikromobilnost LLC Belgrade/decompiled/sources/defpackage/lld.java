package defpackage;

import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.pay.repository.api.model.offers.InAppReplacementParams;
import java.util.Map;

/* loaded from: classes2.dex */
public final class lld {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;
    public final Map f;
    public final String g;
    public final String h;
    public final PlusColor i;
    public final InAppReplacementParams j;

    public lld(String str, String str2, String str3, String str4, Map map, Map map2, String str5, String str6, PlusColor plusColor, InAppReplacementParams inAppReplacementParams) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
        this.f = map2;
        this.g = str5;
        this.h = str6;
        this.i = plusColor;
        this.j = inAppReplacementParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lld)) {
            return false;
        }
        lld lldVar = (lld) obj;
        return this.a.equals(lldVar.a) && jl40.l(this.b, lldVar.b) && jl40.l(this.c, lldVar.c) && jl40.l(this.d, lldVar.d) && jl40.l(this.e, lldVar.e) && this.f.equals(lldVar.f) && this.g.equals(lldVar.g) && this.h.equals(lldVar.h) && jl40.l(this.i, lldVar.i) && jl40.l(this.j, lldVar.j);
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
        int hashCode5 = (b + (plusColor == null ? 0 : plusColor.hashCode())) * 31;
        InAppReplacementParams inAppReplacementParams = this.j;
        return hashCode5 + (inAppReplacementParams != null ? inAppReplacementParams.hashCode() : 0);
    }

    public final String toString() {
        return "TariffDetails(title=" + this.a + ", text=" + this.b + ", description=" + this.c + ", additionText=" + this.d + ", payload=" + this.e + ", images=" + this.f + ", offerName=" + this.g + ", tariffName=" + this.h + ", backgroundTv=" + this.i + ", inAppReplacementParams=" + this.j + ')';
    }
}
