package defpackage;

import com.yandex.go.analytics.AccountType;
import java.util.Calendar;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

@gsq0
/* loaded from: classes9.dex */
public final class lbl0 {
    public static final kbl0 Companion = new kbl0();
    public static final i3y[] R;
    public final o9i A;
    public final Boolean B;
    public final Integer C;
    public final boolean D;
    public final boolean E;
    public final String F;
    public final Boolean G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final String Q;
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final RequirementsParam f;
    public final List g;
    public final Calendar h;
    public final String i;
    public final String j;
    public final boolean k;
    public final Calendar l;
    public final rfa0 m;
    public final boolean n;
    public final int o;
    public final ip40 p;
    public final Boolean q;
    public final boolean r;
    public final jsq0 s;
    public final List t;
    public final v03 u;
    public final List v;
    public final b w;
    public final boolean x;
    public final List y;
    public final boolean z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        R = new i3y[]{null, null, null, a.b(lazyThreadSafetyMode, new eqj0(27)), a.b(lazyThreadSafetyMode, new eqj0(28)), a.b(lazyThreadSafetyMode, new eqj0(29)), a.b(lazyThreadSafetyMode, new ibl0(0)), null, null, null, null, null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new ibl0(1)), a.b(lazyThreadSafetyMode, new ibl0(2)), null, a.b(lazyThreadSafetyMode, new ibl0(3)), null, null, a.b(lazyThreadSafetyMode, new ibl0(4)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ lbl0(int i, int i2, String str, String str2, String str3, List list, List list2, RequirementsParam requirementsParam, List list3, Calendar calendar, String str4, String str5, boolean z, Calendar calendar2, rfa0 rfa0Var, boolean z2, int i3, ip40 ip40Var, Boolean bool, boolean z3, jsq0 jsq0Var, List list4, v03 v03Var, List list5, b bVar, boolean z4, List list6, boolean z5, o9i o9iVar, Boolean bool2, Integer num, boolean z6, boolean z7, String str6, Boolean bool3, boolean z8, int i4, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str7) {
        if (536870911 != (i & 536870911)) {
            qje.Y(new int[]{i, i2}, new int[]{536870911, 0}, jbl0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
        this.f = requirementsParam;
        this.g = list3;
        this.h = calendar;
        this.i = str4;
        this.j = str5;
        this.k = z;
        this.l = calendar2;
        this.m = rfa0Var;
        this.n = z2;
        this.o = i3;
        this.p = ip40Var;
        this.q = bool;
        this.r = z3;
        this.s = jsq0Var;
        this.t = list4;
        this.u = v03Var;
        this.v = list5;
        this.w = bVar;
        this.x = z4;
        this.y = list6;
        this.z = z5;
        this.A = o9iVar;
        this.B = bool2;
        this.C = num;
        if ((536870912 & i) == 0) {
            this.D = true;
        } else {
            this.D = z6;
        }
        if ((1073741824 & i) == 0) {
            this.E = true;
        } else {
            this.E = z7;
        }
        this.F = (i & Integer.MIN_VALUE) == 0 ? "tml-0.1" : str6;
        this.G = (i2 & 1) == 0 ? Boolean.FALSE : bool3;
        if ((i2 & 2) == 0) {
            this.H = true;
        } else {
            this.H = z8;
        }
        this.I = (i2 & 4) == 0 ? 2 : i4;
        if ((i2 & 8) == 0) {
            this.J = true;
        } else {
            this.J = z9;
        }
        if ((i2 & 16) == 0) {
            this.K = true;
        } else {
            this.K = z10;
        }
        if ((i2 & 32) == 0) {
            this.L = true;
        } else {
            this.L = z11;
        }
        if ((i2 & 64) == 0) {
            this.M = true;
        } else {
            this.M = z12;
        }
        if ((i2 & 128) == 0) {
            this.N = true;
        } else {
            this.N = z13;
        }
        if ((i2 & 256) == 0) {
            this.O = true;
        } else {
            this.O = z14;
        }
        if ((i2 & 512) == 0) {
            this.P = true;
        } else {
            this.P = z15;
        }
        this.Q = (i2 & 1024) == 0 ? AccountType.None.getEventValue() : str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbl0)) {
            return false;
        }
        lbl0 lbl0Var = (lbl0) obj;
        return jl40.l(this.a, lbl0Var.a) && jl40.l(this.b, lbl0Var.b) && jl40.l(this.c, lbl0Var.c) && jl40.l(this.d, lbl0Var.d) && jl40.l(this.e, lbl0Var.e) && jl40.l(this.f, lbl0Var.f) && jl40.l(this.g, lbl0Var.g) && jl40.l(this.h, lbl0Var.h) && jl40.l(this.i, lbl0Var.i) && jl40.l(this.j, lbl0Var.j) && this.k == lbl0Var.k && jl40.l(this.l, lbl0Var.l) && jl40.l(this.m, lbl0Var.m) && this.n == lbl0Var.n && this.o == lbl0Var.o && jl40.l(this.p, lbl0Var.p) && jl40.l(this.q, lbl0Var.q) && this.r == lbl0Var.r && jl40.l(this.s, lbl0Var.s) && jl40.l(this.t, lbl0Var.t) && jl40.l(this.u, lbl0Var.u) && jl40.l(this.v, lbl0Var.v) && jl40.l(this.w, lbl0Var.w) && this.x == lbl0Var.x && jl40.l(this.y, lbl0Var.y) && this.z == lbl0Var.z && jl40.l(this.A, lbl0Var.A) && jl40.l(this.B, lbl0Var.B) && jl40.l(this.C, lbl0Var.C) && this.D == lbl0Var.D && this.E == lbl0Var.E && jl40.l(this.F, lbl0Var.F) && jl40.l(this.G, lbl0Var.G) && this.H == lbl0Var.H && this.I == lbl0Var.I && this.J == lbl0Var.J && this.K == lbl0Var.K && this.L == lbl0Var.L && this.M == lbl0Var.M && this.N == lbl0Var.N && this.O == lbl0Var.O && this.P == lbl0Var.P && jl40.l(this.Q, lbl0Var.Q);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        List list = this.d;
        int c = unr0.c((b + (list == null ? 0 : list.hashCode())) * 31, 31, this.e);
        RequirementsParam requirementsParam = this.f;
        int c2 = unr0.c((c + (requirementsParam == null ? 0 : requirementsParam.hashCode())) * 31, 31, this.g);
        Calendar calendar = this.h;
        int hashCode = (c2 + (calendar == null ? 0 : calendar.hashCode())) * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int e = unr0.e((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.k);
        Calendar calendar2 = this.l;
        int b2 = oyr.b(this.o, unr0.e((this.m.hashCode() + ((e + (calendar2 == null ? 0 : calendar2.hashCode())) * 31)) * 31, 31, this.n), 31);
        ip40 ip40Var = this.p;
        int hashCode3 = (b2 + (ip40Var == null ? 0 : ip40Var.hashCode())) * 31;
        Boolean bool = this.q;
        int c3 = unr0.c(unr0.e((hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.r), 31, this.s.a);
        List list2 = this.t;
        int hashCode4 = (c3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        v03 v03Var = this.u;
        int hashCode5 = (this.A.hashCode() + unr0.e(unr0.c(unr0.e((this.w.hashCode() + unr0.c((hashCode4 + (v03Var == null ? 0 : v03Var.hashCode())) * 31, 31, this.v)) * 31, 31, this.x), 31, this.y), 31, this.z)) * 31;
        Boolean bool2 = this.B;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.C;
        int e2 = unr0.e(unr0.e((hashCode6 + (num == null ? 0 : num.hashCode())) * 31, 31, this.D), 31, this.E);
        String str3 = this.F;
        int hashCode7 = (e2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.G;
        return this.Q.hashCode() + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(oyr.b(this.I, unr0.e((hashCode7 + (bool3 != null ? bool3.hashCode() : 0)) * 31, 31, this.H), 31), 31, this.J), 31, this.K), 31, this.L), 31, this.M), 31, this.N), 31, this.O), 31, this.P);
    }

    public final String toString() {
        StringBuilder v = b64.v("RouteStatsParam(id=", this.a, ", zoneName=", this.b, ", selectedClass=");
        tse0.x(this.c, ", parks=", ", route=", v, this.d);
        v.append(this.e);
        v.append(", requirements=");
        v.append(this.f);
        v.append(", tariffRequirements=");
        v.append(this.g);
        v.append(", due=");
        v.append(this.h);
        v.append(", preorderCalculationId=");
        g8e.D(v, this.i, ", scheduledOrderRequestId=", this.j, ", forceSoonOrder=");
        v.append(this.k);
        v.append(", intercityPreorderFlowDue=");
        v.append(this.l);
        v.append(", payment=");
        v.append(this.m);
        v.append(", isSkipEstimatedWaiting=");
        v.append(this.n);
        v.append(", sizeHint=");
        v.append(this.o);
        v.append(", multiclassOptions=");
        v.append(this.p);
        v.append(", useTollRoad=");
        v.append(this.q);
        v.append(", isLightWeight=");
        v.append(this.r);
        v.append(", verticalTypes=");
        v.append(this.s);
        v.append(", supportedVerticals=");
        v.append(this.t);
        v.append(", state=");
        v.append(this.u);
        v.append(", supportedOptions=");
        v.append(this.v);
        v.append(", summaryContext=");
        v.append(this.w);
        v.append(", surgeFakePin=");
        v.append(this.x);
        v.append(", supportedFeatures=");
        nzs.p(v, this.y, ", enableFallbackForTariffs=", this.z, ", deliveryExtra=");
        v.append(this.A);
        v.append(", suggestAlternatives=");
        v.append(this.B);
        v.append(", duePrecisionMinutes=");
        v.append(this.C);
        v.append(", extendedDescription=");
        v.append(this.D);
        v.append(", withTitle=");
        unr0.A(", supportedMarkup=", this.F, ", selectedClassOnly=", v, this.E);
        v.append(this.G);
        v.append(", supportsHideableTariffs=");
        v.append(this.H);
        v.append(", summaryVersion=");
        tse0.z(v, this.I, ", supportsUnavailableAlternatives=", this.J, ", supportVerticalsSelector=");
        nnm.v(", supportsNoCarsAvailable=", ", supportPaidOptions=", v, this.K, this.L);
        nnm.v(", formatCurrency=", ", supportExplicitAntisurge=", v, this.M, this.N);
        nnm.v(", supportsMulticlass=", ", accountType=", v, this.O, this.P);
        return oyr.t(v, this.Q, Extension.C_BRAKE);
    }

    public lbl0(String str, String str2, String str3, List list, List list2, RequirementsParam requirementsParam, List list3, Calendar calendar, String str4, String str5, boolean z, Calendar calendar2, rfa0 rfa0Var, boolean z2, int i, ip40 ip40Var, Boolean bool, boolean z3, jsq0 jsq0Var, List list4, v03 v03Var, List list5, b bVar, boolean z4, List list6, boolean z5, o9i o9iVar, Boolean bool2, Integer num, boolean z6, boolean z7, String str6, Boolean bool3, boolean z8, int i2, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
        this.f = requirementsParam;
        this.g = list3;
        this.h = calendar;
        this.i = str4;
        this.j = str5;
        this.k = z;
        this.l = calendar2;
        this.m = rfa0Var;
        this.n = z2;
        this.o = i;
        this.p = ip40Var;
        this.q = bool;
        this.r = z3;
        this.s = jsq0Var;
        this.t = list4;
        this.u = v03Var;
        this.v = list5;
        this.w = bVar;
        this.x = z4;
        this.y = list6;
        this.z = z5;
        this.A = o9iVar;
        this.B = bool2;
        this.C = num;
        this.D = z6;
        this.E = z7;
        this.F = str6;
        this.G = bool3;
        this.H = z8;
        this.I = i2;
        this.J = z9;
        this.K = z10;
        this.L = z11;
        this.M = z12;
        this.N = z13;
        this.O = z14;
        this.P = z15;
        this.Q = str7;
    }
}
