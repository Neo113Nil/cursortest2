package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositShimmerType;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.k;
import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ibf {
    public final CreditDepositShimmerType a;
    public final gu01 b;
    public final boolean c;
    public final BigDecimal d;
    public final String e;
    public final Text f;
    public final ptb1 g;
    public final YbButtonView.a h;
    public final boolean i;
    public final k j;
    public final String k;
    public final String l;
    public final kao m;
    public final String n;
    public final boolean o;
    public final ubv0 p;
    public final rr51 q;

    public ibf(CreditDepositShimmerType creditDepositShimmerType, eu01 eu01Var, boolean z, BigDecimal bigDecimal, String str, Text text, ptb1 ptb1Var, YbButtonView.a aVar, boolean z2, k kVar, String str2, String str3, kao kaoVar, String str4, boolean z3, ubv0 ubv0Var, rr51 rr51Var) {
        this.a = creditDepositShimmerType;
        this.b = eu01Var;
        this.c = z;
        this.d = bigDecimal;
        this.e = str;
        this.f = text;
        this.g = ptb1Var;
        this.h = aVar;
        this.i = z2;
        this.j = kVar;
        this.k = str2;
        this.l = str3;
        this.m = kaoVar;
        this.n = str4;
        this.o = z3;
        this.p = ubv0Var;
        this.q = rr51Var;
    }

    public final YbButtonView.a a() {
        return this.h;
    }

    public final BigDecimal b() {
        return this.d;
    }

    public final ptb1 c() {
        return this.g;
    }

    public final String d() {
        return this.e;
    }

    public final Text e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibf)) {
            return false;
        }
        ibf ibfVar = (ibf) obj;
        return this.a == ibfVar.a && jl40.l(this.b, ibfVar.b) && this.c == ibfVar.c && jl40.l(this.d, ibfVar.d) && this.e.equals(ibfVar.e) && jl40.l(this.f, ibfVar.f) && jl40.l(this.g, ibfVar.g) && this.h.equals(ibfVar.h) && this.i == ibfVar.i && jl40.l(this.j, ibfVar.j) && jl40.l(this.k, ibfVar.k) && jl40.l(this.l, ibfVar.l) && jl40.l(this.m, ibfVar.m) && jl40.l(this.n, ibfVar.n) && this.o == ibfVar.o && jl40.l(this.p, ibfVar.p) && jl40.l(this.q, ibfVar.q);
    }

    public final rr51 f() {
        return this.q;
    }

    public final kao g() {
        return this.m;
    }

    public final String h() {
        return this.k;
    }

    public final int hashCode() {
        CreditDepositShimmerType creditDepositShimmerType = this.a;
        int hashCode = (creditDepositShimmerType == null ? 0 : creditDepositShimmerType.hashCode()) * 31;
        gu01 gu01Var = this.b;
        int b = unr0.b(smw0.f(this.d, unr0.e((hashCode + (gu01Var == null ? 0 : gu01Var.hashCode())) * 31, 31, this.c), 31), 31, this.e);
        Text text = this.f;
        int hashCode2 = (b + (text == null ? 0 : text.hashCode())) * 31;
        ptb1 ptb1Var = this.g;
        int e = unr0.e((this.h.hashCode() + ((hashCode2 + (ptb1Var == null ? 0 : ptb1Var.hashCode())) * 31)) * 31, 31, this.i);
        k kVar = this.j;
        int hashCode3 = (e + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.k;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        kao kaoVar = this.m;
        int hashCode6 = (hashCode5 + (kaoVar == null ? 0 : kaoVar.hashCode())) * 31;
        String str3 = this.n;
        int e2 = unr0.e((hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.o);
        ubv0 ubv0Var = this.p;
        int hashCode7 = (e2 + (ubv0Var == null ? 0 : ubv0Var.a.hashCode())) * 31;
        rr51 rr51Var = this.q;
        return hashCode7 + (rr51Var != null ? rr51Var.hashCode() : 0);
    }

    public final k i() {
        return this.j;
    }

    public final String j() {
        return this.l;
    }

    public final CreditDepositShimmerType k() {
        return this.a;
    }

    public final boolean l() {
        return this.i;
    }

    public final ubv0 m() {
        return this.p;
    }

    public final gu01 n() {
        return this.b;
    }

    public final String o() {
        return this.n;
    }

    public final boolean p() {
        return this.c;
    }

    public final boolean q() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreditDepositViewState(shimmerType=");
        sb.append(this.a);
        sb.append(", toolbar=");
        sb.append(this.b);
        sb.append(", isBackButtonVisible=");
        sb.append(this.c);
        sb.append(", amount=");
        sb.append(this.d);
        sb.append(", currencySymbol=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", bottomSheetState=");
        sb.append(this.g);
        sb.append(", actionButtonState=");
        sb.append(this.h);
        sb.append(", shouldEnableActionButton=");
        sb.append(this.i);
        sb.append(", operationProgressViewState=");
        sb.append(this.j);
        sb.append(", operationActionButtonAction=");
        g8e.D(sb, this.k, ", operationSubActionButtonAction=", this.l, ", errorState=");
        sb.append(this.m);
        sb.append(", urlFor3ds=");
        sb.append(this.n);
        sb.append(", isKeyboardVisible=");
        sb.append(this.o);
        sb.append(", suggestsViewState=");
        sb.append(this.p);
        sb.append(", divkitData=");
        sb.append(this.q);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
