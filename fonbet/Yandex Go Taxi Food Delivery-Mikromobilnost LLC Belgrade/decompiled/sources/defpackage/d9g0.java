package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.qr.payments.api.data.PageImageHeaderEntity;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.AmountScreenStatus;
import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d9g0 implements f9g0 {
    public final ThemedImageUrlEntity a;
    public final String b;
    public final String c;
    public final PageImageHeaderEntity d;
    public final String e;
    public final yj1 f;
    public final BigDecimal g;
    public final String h;
    public final kgy0 i;
    public final bcp0 j;
    public final AmountScreenStatus k;
    public final boolean l;
    public final rr51 m;
    public final v031 n;
    public final boolean o;
    public final ka6 p;

    public d9g0(ThemedImageUrlEntity themedImageUrlEntity, String str, String str2, PageImageHeaderEntity pageImageHeaderEntity, String str3, yj1 yj1Var, BigDecimal bigDecimal, String str4, kgy0 kgy0Var, bcp0 bcp0Var, AmountScreenStatus amountScreenStatus, boolean z, rr51 rr51Var, v031 v031Var, boolean z2, ka6 ka6Var) {
        this.a = themedImageUrlEntity;
        this.b = str;
        this.c = str2;
        this.d = pageImageHeaderEntity;
        this.e = str3;
        this.f = yj1Var;
        this.g = bigDecimal;
        this.h = str4;
        this.i = kgy0Var;
        this.j = bcp0Var;
        this.k = amountScreenStatus;
        this.l = z;
        this.m = rr51Var;
        this.n = v031Var;
        this.o = z2;
        this.p = ka6Var;
    }

    public static d9g0 c(d9g0 d9g0Var, yj1 yj1Var, BigDecimal bigDecimal, String str, kgy0 kgy0Var, AmountScreenStatus amountScreenStatus, rr51 rr51Var, v031 v031Var, boolean z, ka6 ka6Var, int i) {
        ThemedImageUrlEntity themedImageUrlEntity = d9g0Var.a;
        String str2 = d9g0Var.b;
        String str3 = d9g0Var.c;
        PageImageHeaderEntity pageImageHeaderEntity = d9g0Var.d;
        String str4 = d9g0Var.e;
        yj1 yj1Var2 = (i & 32) != 0 ? d9g0Var.f : yj1Var;
        BigDecimal bigDecimal2 = (i & 64) != 0 ? d9g0Var.g : bigDecimal;
        String str5 = (i & 128) != 0 ? d9g0Var.h : str;
        kgy0 kgy0Var2 = (i & 256) != 0 ? d9g0Var.i : kgy0Var;
        bcp0 bcp0Var = d9g0Var.j;
        AmountScreenStatus amountScreenStatus2 = (i & 1024) != 0 ? d9g0Var.k : amountScreenStatus;
        boolean z2 = d9g0Var.l;
        rr51 rr51Var2 = (i & 4096) != 0 ? d9g0Var.m : rr51Var;
        v031 v031Var2 = (i & 8192) != 0 ? d9g0Var.n : v031Var;
        boolean z3 = (i & 16384) != 0 ? d9g0Var.o : z;
        ka6 ka6Var2 = (i & 32768) != 0 ? d9g0Var.p : ka6Var;
        d9g0Var.getClass();
        return new d9g0(themedImageUrlEntity, str2, str3, pageImageHeaderEntity, str4, yj1Var2, bigDecimal2, str5, kgy0Var2, bcp0Var, amountScreenStatus2, z2, rr51Var2, v031Var2, z3, ka6Var2);
    }

    @Override // defpackage.g9g0
    public final yj1 b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9g0)) {
            return false;
        }
        d9g0 d9g0Var = (d9g0) obj;
        return this.a.equals(d9g0Var.a) && jl40.l(this.b, d9g0Var.b) && jl40.l(this.c, d9g0Var.c) && jl40.l(this.d, d9g0Var.d) && jl40.l(this.e, d9g0Var.e) && jl40.l(this.f, d9g0Var.f) && jl40.l(this.g, d9g0Var.g) && jl40.l(this.h, d9g0Var.h) && jl40.l(this.i, d9g0Var.i) && this.j.equals(d9g0Var.j) && this.k == d9g0Var.k && this.l == d9g0Var.l && jl40.l(this.m, d9g0Var.m) && jl40.l(this.n, d9g0Var.n) && this.o == d9g0Var.o && jl40.l(this.p, d9g0Var.p);
    }

    @Override // defpackage.g9g0
    public final BigDecimal getAmount() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        yj1 yj1Var = this.f;
        int f = smw0.f(this.g, (hashCode2 + (yj1Var == null ? 0 : yj1Var.hashCode())) * 31, 31);
        String str2 = this.h;
        int hashCode3 = (f + (str2 == null ? 0 : str2.hashCode())) * 31;
        kgy0 kgy0Var = this.i;
        int e = unr0.e((this.n.hashCode() + ((this.m.hashCode() + unr0.e((this.k.hashCode() + ((this.j.hashCode() + ((hashCode3 + (kgy0Var == null ? 0 : kgy0Var.hashCode())) * 31)) * 31)) * 31, 31, this.l)) * 31)) * 31, 31, this.o);
        ka6 ka6Var = this.p;
        return e + (ka6Var != null ? ka6Var.hashCode() : 0);
    }

    public final String toString() {
        return "AmountScreen(icon=" + this.a + ", currency=" + this.b + ", message=" + this.c + ", toolbar=" + this.d + ", purpose=" + this.e + ", agreement=" + this.f + ", amount=" + this.g + ", repaymentPlanId=" + this.h + ", term=" + this.i + ", screenButtons=" + this.j + ", amountStatus=" + this.k + ", isAmountEditable=" + this.l + ", agreementsData=" + this.m + ", validation=" + this.n + ", areTapsBlocked=" + this.o + ", boostStrategy=" + this.p + Extension.C_BRAKE;
    }
}
