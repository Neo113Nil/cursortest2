package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.qr.payments.api.data.BoostStrategy;
import com.ybsdk.feature.qr.payments.api.data.PageImageHeaderEntity;
import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class e9g0 implements f9g0 {
    public final ThemedImageUrlEntity a;
    public final String b;
    public final String c;
    public final PageImageHeaderEntity d;
    public final String e;
    public final yj1 f;
    public final BigDecimal g;
    public final String h;
    public final rzj0 i;
    public final String j;
    public final tzj0 k;
    public final String l;
    public final String m;
    public final rr51 n;
    public final BoostStrategy o;

    public e9g0(ThemedImageUrlEntity themedImageUrlEntity, String str, String str2, PageImageHeaderEntity pageImageHeaderEntity, String str3, yj1 yj1Var, BigDecimal bigDecimal, String str4, rzj0 rzj0Var, String str5, tzj0 tzj0Var, String str6, String str7, rr51 rr51Var, BoostStrategy boostStrategy) {
        this.a = themedImageUrlEntity;
        this.b = str;
        this.c = str2;
        this.d = pageImageHeaderEntity;
        this.e = str3;
        this.f = yj1Var;
        this.g = bigDecimal;
        this.h = str4;
        this.i = rzj0Var;
        this.j = str5;
        this.k = tzj0Var;
        this.l = str6;
        this.m = str7;
        this.n = rr51Var;
        this.o = boostStrategy;
    }

    public static e9g0 c(e9g0 e9g0Var, tzj0 tzj0Var, String str, String str2, int i) {
        ThemedImageUrlEntity themedImageUrlEntity = e9g0Var.a;
        String str3 = e9g0Var.b;
        String str4 = e9g0Var.c;
        PageImageHeaderEntity pageImageHeaderEntity = e9g0Var.d;
        String str5 = e9g0Var.e;
        yj1 yj1Var = e9g0Var.f;
        BigDecimal bigDecimal = e9g0Var.g;
        String str6 = e9g0Var.h;
        rzj0 rzj0Var = e9g0Var.i;
        String str7 = e9g0Var.j;
        tzj0 tzj0Var2 = (i & 1024) != 0 ? e9g0Var.k : tzj0Var;
        String str8 = (i & 2048) != 0 ? e9g0Var.l : str;
        String str9 = (i & 4096) != 0 ? e9g0Var.m : str2;
        rr51 rr51Var = e9g0Var.n;
        BoostStrategy boostStrategy = e9g0Var.o;
        e9g0Var.getClass();
        return new e9g0(themedImageUrlEntity, str3, str4, pageImageHeaderEntity, str5, yj1Var, bigDecimal, str6, rzj0Var, str7, tzj0Var2, str8, str9, rr51Var, boostStrategy);
    }

    @Override // defpackage.g9g0
    public final yj1 b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9g0)) {
            return false;
        }
        e9g0 e9g0Var = (e9g0) obj;
        return this.a.equals(e9g0Var.a) && jl40.l(this.b, e9g0Var.b) && jl40.l(this.c, e9g0Var.c) && jl40.l(this.d, e9g0Var.d) && jl40.l(this.e, e9g0Var.e) && jl40.l(this.f, e9g0Var.f) && jl40.l(this.g, e9g0Var.g) && jl40.l(this.h, e9g0Var.h) && jl40.l(this.i, e9g0Var.i) && jl40.l(this.j, e9g0Var.j) && this.k.equals(e9g0Var.k) && jl40.l(this.l, e9g0Var.l) && jl40.l(this.m, e9g0Var.m) && jl40.l(this.n, e9g0Var.n) && this.o == e9g0Var.o;
    }

    @Override // defpackage.g9g0
    public final BigDecimal getAmount() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        String str = this.e;
        int f = smw0.f(this.g, (this.f.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
        String str2 = this.h;
        int hashCode2 = (this.k.hashCode() + unr0.b((this.i.hashCode() + ((f + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.j)) * 31;
        String str3 = this.l;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        rr51 rr51Var = this.n;
        int hashCode5 = (hashCode4 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        BoostStrategy boostStrategy = this.o;
        return hashCode5 + (boostStrategy != null ? boostStrategy.hashCode() : 0);
    }

    public final String toString() {
        return "ResultScreen(icon=" + this.a + ", currency=" + this.b + ", message=" + this.c + ", toolbar=" + this.d + ", purpose=" + this.e + ", agreement=" + this.f + ", amount=" + this.g + ", repaymentPlanId=" + this.h + ", defaultPageData=" + this.i + ", checkId=" + this.j + ", resultPayment=" + this.k + ", paymentOperationId=" + this.l + ", subscriptionOperationId=" + this.m + ", amountInfoWidget=" + this.n + ", boostStrategy=" + this.o + Extension.C_BRAKE;
    }
}
