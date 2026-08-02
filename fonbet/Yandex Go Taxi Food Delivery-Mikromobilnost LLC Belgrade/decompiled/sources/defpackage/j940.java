package defpackage;

import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class j940 implements m940 {
    public final String a;
    public final wp2 b;
    public final String c;
    public final String d;
    public final List e;
    public final lja0 f;
    public final List g;
    public final Integer h;
    public final CurrencyRulesDto i;

    public /* synthetic */ j940(String str, wp2 wp2Var, String str2, String str3, List list, lja0 lja0Var, List list2, Integer num, CurrencyRulesDto currencyRulesDto, int i) {
        this((i & 2) != 0 ? null : str, (i & 4) != 0 ? null : wp2Var, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : lja0Var, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : currencyRulesDto);
    }

    public static j940 a(j940 j940Var, ArrayList arrayList) {
        return new j940(j940Var.a, j940Var.b, j940Var.c, j940Var.d, arrayList, j940Var.f, j940Var.g, j940Var.h, j940Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j940)) {
            return false;
        }
        j940 j940Var = (j940) obj;
        return jl40.l(this.a, j940Var.a) && jl40.l(this.b, j940Var.b) && jl40.l(this.c, j940Var.c) && jl40.l(this.d, j940Var.d) && jl40.l(this.e, j940Var.e) && jl40.l(this.f, j940Var.f) && jl40.l(this.g, j940Var.g) && jl40.l(this.h, j940Var.h) && jl40.l(this.i, j940Var.i);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(0) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        wp2 wp2Var = this.b;
        int hashCode3 = (hashCode2 + (wp2Var == null ? 0 : wp2Var.hashCode())) * 31;
        String str2 = this.c;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.e;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        lja0 lja0Var = this.f;
        int hashCode7 = (hashCode6 + (lja0Var == null ? 0 : lja0Var.hashCode())) * 31;
        List list2 = this.g;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.h;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        CurrencyRulesDto currencyRulesDto = this.i;
        return hashCode9 + (currencyRulesDto != null ? currencyRulesDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(initialPage=0, orderId=");
        sb.append(this.a);
        sb.append(", pageTopGradientColor=");
        sb.append(this.b);
        sb.append(", toolbarTitle=");
        g8e.D(sb, this.c, ", toolbarSubTitle=", this.d, ", tickets=");
        sb.append(this.e);
        sb.append(", paymentSection=");
        sb.append(this.f);
        sb.append(", orderActions=");
        sb.append(this.g);
        sb.append(", screenBrightness=");
        sb.append(this.h);
        sb.append(", currencyRules=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public j940(String str, wp2 wp2Var, String str2, String str3, List list, lja0 lja0Var, List list2, Integer num, CurrencyRulesDto currencyRulesDto) {
        this.a = str;
        this.b = wp2Var;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = lja0Var;
        this.g = list2;
        this.h = num;
        this.i = currencyRulesDto;
    }

    public j940() {
        this(null, null, null, null, null, null, null, null, null, 1023);
    }
}
