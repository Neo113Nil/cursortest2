package com.yandex.div2;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.hc;
import com.yandex.div2.ic;
import com.yandex.div2.rb;
import com.yandex.div2.v9;
import com.yandex.div2.wb;
import com.yandex.div2.xb;
import com.yandex.div2.yb;
import com.yandex.div2.zb;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bpn;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.ikn;
import xsna.izs;
import xsna.jln;
import xsna.krn;
import xsna.vmn;
import xsna.zkn;

/* compiled from: DivText.kt */
/* loaded from: classes8.dex */
public final class DivText implements JSONSerializable, Hashable, ikn {
    public final List<t4> A;
    public final v9 B;
    public final List<DivAction> C;
    public final List<DivAction> D;
    public final String E;
    public final List<Image> F;
    public final vmn G;
    public final Expression<Double> H;
    public final Expression<Long> I;
    public final List<DivAction> J;
    public final y3 K;
    public final Expression<Long> L;
    public final Expression<Long> M;
    public final y3 N;
    public final List<DivAction> O;
    public final List<DivAction> P;
    public final List<b> Q;
    public final Expression<String> R;
    public final Expression<Long> S;
    public final Expression<Boolean> T;
    public final List<DivAction> U;
    public final Expression<DivLineStyle> V;
    public final Expression<String> W;
    public final Expression<DivAlignmentHorizontal> X;
    public final Expression<DivAlignmentVertical> Y;
    public final Expression<Integer> Z;
    public final DivAccessibility a;
    public final rb a0;
    public final DivAction b;
    public final n9 b0;
    public final DivAnimation c;
    public final Expression<Boolean> c0;
    public final List<DivAction> d;
    public final List<DivTooltip> d0;
    public final Expression<DivAlignmentHorizontal> e;
    public final hd e0;
    public final Expression<DivAlignmentVertical> f;
    public final d2 f0;
    public final Expression<Double> g;
    public final e1 g0;
    public final List<w0> h;
    public final e1 h0;
    public final Expression<Boolean> i;
    public final List<DivTransitionTrigger> i0;
    public final List<m1> j;
    public final Expression<Truncate> j0;
    public final u1 k;
    public final Expression<DivLineStyle> k0;
    public final Expression<Boolean> l;
    public final List<DivTrigger> l0;
    public final Expression<Long> m;
    public final List<md> m0;
    public final List<v3> n;
    public final Expression<DivVisibility> n0;
    public final List<DivAction> o;
    public final zd o0;
    public final a p;
    public final List<zd> p0;
    public final List<zkn> q;
    public final v9 q0;
    public final jln r;
    public Integer r0;
    public final Expression<Integer> s;
    public final Expression<String> t;
    public final Expression<String> u;
    public final Expression<Long> v;
    public final Expression<DivSizeUnit> w;
    public final Expression<JSONObject> x;
    public final Expression<DivFontWeight> y;
    public final Expression<Long> z;

    /* compiled from: DivText.kt */
    public enum Truncate {
        NONE("none"),
        START("start"),
        END(TtmlNode.END),
        MIDDLE("middle");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Truncate, String> TO_STRING = b.i;
        public static final izs<String, Truncate> FROM_STRING = a.i;

        /* compiled from: DivText.kt */
        public static final class a extends Lambda implements izs<String, Truncate> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Truncate invoke(String str) {
                String str2 = str;
                Truncate.Converter.getClass();
                Truncate truncate = Truncate.NONE;
                if (epx.f(str2, truncate.value)) {
                    return truncate;
                }
                Truncate truncate2 = Truncate.START;
                if (epx.f(str2, truncate2.value)) {
                    return truncate2;
                }
                Truncate truncate3 = Truncate.END;
                if (epx.f(str2, truncate3.value)) {
                    return truncate3;
                }
                Truncate truncate4 = Truncate.MIDDLE;
                if (epx.f(str2, truncate4.value)) {
                    return truncate4;
                }
                return null;
            }
        }

        /* compiled from: DivText.kt */
        public static final class b extends Lambda implements izs<Truncate, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Truncate truncate) {
                Truncate.Converter.getClass();
                return truncate.value;
            }
        }

        /* compiled from: DivText.kt */
        public static final class c {
        }

        Truncate(String str) {
            this.value = str;
        }
    }

    /* compiled from: DivText.kt */
    public static final class a implements JSONSerializable, Hashable {
        public final List<DivAction> a;
        public final List<Image> b;
        public final List<b> c;
        public final Expression<String> d;
        public Integer e;

        public a(Expression expression, List list, List list2, List list3) {
            this.a = list;
            this.b = list2;
            this.c = list3;
            this.d = expression;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            int i;
            int i2;
            Integer num = this.e;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = fpf0.a(a.class).hashCode();
            int i3 = 0;
            List<DivAction> list = this.a;
            if (list != null) {
                Iterator<T> it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    i += ((DivAction) it.next()).hash();
                }
            } else {
                i = 0;
            }
            int i4 = hashCode + i;
            List<Image> list2 = this.b;
            if (list2 != null) {
                Iterator<T> it2 = list2.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    i2 += ((Image) it2.next()).hash();
                }
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            List<b> list3 = this.c;
            if (list3 != null) {
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    i3 += ((b) it3.next()).hash();
                }
            }
            int hashCode2 = this.d.hashCode() + i5 + i3;
            this.e = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((ob) BuiltInParserKt.getBuiltInParserComponent().G8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 12L, null, 2, null);
        Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        Boolean bool = Boolean.FALSE;
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivLineStyle divLineStyle = DivLineStyle.NONE;
        Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentVertical.TOP, null, 2, null);
        Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, Truncate.END, null, 2, null);
        Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivText(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list2, Expression<Boolean> expression4, List<? extends m1> list3, u1 u1Var, Expression<Boolean> expression5, Expression<Long> expression6, List<v3> list4, List<DivAction> list5, a aVar, List<zkn> list6, jln jlnVar, Expression<Integer> expression7, Expression<String> expression8, Expression<String> expression9, Expression<Long> expression10, Expression<DivSizeUnit> expression11, Expression<JSONObject> expression12, Expression<DivFontWeight> expression13, Expression<Long> expression14, List<t4> list7, v9 v9Var, List<DivAction> list8, List<DivAction> list9, String str, List<Image> list10, vmn vmnVar, Expression<Double> expression15, Expression<Long> expression16, List<DivAction> list11, y3 y3Var, Expression<Long> expression17, Expression<Long> expression18, y3 y3Var2, List<DivAction> list12, List<DivAction> list13, List<b> list14, Expression<String> expression19, Expression<Long> expression20, Expression<Boolean> expression21, List<DivAction> list15, Expression<DivLineStyle> expression22, Expression<String> expression23, Expression<DivAlignmentHorizontal> expression24, Expression<DivAlignmentVertical> expression25, Expression<Integer> expression26, rb rbVar, n9 n9Var, Expression<Boolean> expression27, List<DivTooltip> list16, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list17, Expression<Truncate> expression28, Expression<DivLineStyle> expression29, List<DivTrigger> list18, List<? extends md> list19, Expression<DivVisibility> expression30, zd zdVar, List<zd> list20, v9 v9Var2) {
        this.a = divAccessibility;
        this.b = divAction;
        this.c = divAnimation;
        this.d = list;
        this.e = expression;
        this.f = expression2;
        this.g = expression3;
        this.h = list2;
        this.i = expression4;
        this.j = list3;
        this.k = u1Var;
        this.l = expression5;
        this.m = expression6;
        this.n = list4;
        this.o = list5;
        this.p = aVar;
        this.q = list6;
        this.r = jlnVar;
        this.s = expression7;
        this.t = expression8;
        this.u = expression9;
        this.v = expression10;
        this.w = expression11;
        this.x = expression12;
        this.y = expression13;
        this.z = expression14;
        this.A = list7;
        this.B = v9Var;
        this.C = list8;
        this.D = list9;
        this.E = str;
        this.F = list10;
        this.G = vmnVar;
        this.H = expression15;
        this.I = expression16;
        this.J = list11;
        this.K = y3Var;
        this.L = expression17;
        this.M = expression18;
        this.N = y3Var2;
        this.O = list12;
        this.P = list13;
        this.Q = list14;
        this.R = expression19;
        this.S = expression20;
        this.T = expression21;
        this.U = list15;
        this.V = expression22;
        this.W = expression23;
        this.X = expression24;
        this.Y = expression25;
        this.Z = expression26;
        this.a0 = rbVar;
        this.b0 = n9Var;
        this.c0 = expression27;
        this.d0 = list16;
        this.e0 = hdVar;
        this.f0 = d2Var;
        this.g0 = e1Var;
        this.h0 = e1Var2;
        this.i0 = list17;
        this.j0 = expression28;
        this.k0 = expression29;
        this.l0 = list18;
        this.m0 = list19;
        this.n0 = expression30;
        this.o0 = zdVar;
        this.p0 = list20;
        this.q0 = v9Var2;
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x03ba, code lost:
    
        if (xsna.epx.f(r4.d.evaluate(r44), r15.d.evaluate(r45)) != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03bf, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x0bec, code lost:
    
        if (r43.p0 == null) goto L852;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x0b7e, code lost:
    
        if (r43.m0 == null) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0b33, code lost:
    
        if (r17 == null) goto L794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x0aca, code lost:
    
        if (r18 == null) goto L767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x0a2a, code lost:
    
        if (r23 == null) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x08de, code lost:
    
        if (r24 == null) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x0837, code lost:
    
        if (r27 == null) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x07ea, code lost:
    
        if (r28 == null) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x079d, code lost:
    
        if (r29 == null) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x06e8, code lost:
    
        if (r32 == null) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x0644, code lost:
    
        if (r34 == null) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x05ed, code lost:
    
        if (r35 == null) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x05a0, code lost:
    
        if (r36 == null) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x0549, code lost:
    
        if (r38 == null) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x0404, code lost:
    
        if (r6 == null) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:890:0x03a8, code lost:
    
        if (r7 == null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:891:0x0369, code lost:
    
        if (r8 == null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x0327, code lost:
    
        if (r9 == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x03bd, code lost:
    
        if (r15 == null) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:898:0x02d0, code lost:
    
        if (r13 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:902:0x0289, code lost:
    
        if (r7 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:914:0x01f6, code lost:
    
        if (r9 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:921:0x018f, code lost:
    
        if (r10 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:934:0x00ed, code lost:
    
        if (r14 == null) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(DivText divText, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        Hashable hashable;
        Hashable hashable2;
        if (divText == null) {
            return false;
        }
        List<DivTrigger> list = divText.l0;
        List<DivTransitionTrigger> list2 = divText.i0;
        e1 e1Var = divText.h0;
        e1 e1Var2 = divText.g0;
        d2 d2Var = divText.f0;
        hd hdVar = divText.e0;
        List<DivTooltip> list3 = divText.d0;
        List<DivAction> list4 = divText.U;
        y3 y3Var = divText.N;
        y3 y3Var2 = divText.K;
        vmn vmnVar = divText.G;
        List<t4> list5 = divText.A;
        List<DivTrigger> list6 = list;
        jln jlnVar = divText.r;
        List<DivTransitionTrigger> list7 = list2;
        List<zkn> list8 = divText.q;
        List<v3> list9 = divText.n;
        u1 u1Var = divText.k;
        List<m1> list10 = divText.j;
        List<w0> list11 = divText.h;
        List<DivTooltip> list12 = list3;
        DivAccessibility divAccessibility = divText.a;
        List<DivAction> list13 = list4;
        n9 n9Var = divText.b0;
        rb rbVar = divText.a0;
        List<b> list14 = divText.Q;
        List<DivAction> list15 = divText.P;
        List<DivAction> list16 = divText.O;
        List<DivAction> list17 = divText.J;
        List<Image> list18 = divText.F;
        List<DivAction> list19 = divText.D;
        List<DivAction> list20 = list17;
        List<DivAction> list21 = divText.C;
        a aVar = divText.p;
        List<Image> list22 = list18;
        List<DivAction> list23 = divText.o;
        List<DivAction> list24 = list19;
        List<DivAction> list25 = divText.d;
        List<DivAction> list26 = list21;
        DivAction divAction = divText.b;
        List<t4> list27 = list5;
        DivAccessibility divAccessibility2 = this.a;
        if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
            return false;
        }
        DivAction divAction2 = this.b;
        if (!(divAction2 != null ? divAction2.a(divAction, expressionResolver, expressionResolver2) : divAction == null) || !this.c.a(divText.c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list28 = this.d;
        if (list28 != null) {
            if (list25 != null) {
                th = null;
                if (list28.size() == list25.size()) {
                    int i = 0;
                    for (Object obj : list28) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((DivAction) obj).a(list25.get(i), expressionResolver, expressionResolver2)) {
                            i = i2;
                        }
                    }
                    z = true;
                }
                z = false;
                break;
            }
            return false;
        }
        th = null;
        if (!z) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expression = this.e;
        Object obj2 = expression != null ? (DivAlignmentHorizontal) expression.evaluate(expressionResolver) : th;
        Expression<DivAlignmentHorizontal> expression2 = divText.e;
        if (obj2 != (expression2 != null ? (DivAlignmentHorizontal) expression2.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.f;
        Object obj3 = expression3 != null ? (DivAlignmentVertical) expression3.evaluate(expressionResolver) : th;
        Expression<DivAlignmentVertical> expression4 = divText.f;
        if (obj3 != (expression4 != null ? (DivAlignmentVertical) expression4.evaluate(expressionResolver2) : th)) {
            return false;
        }
        if (!(this.g.evaluate(expressionResolver).doubleValue() == divText.g.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<w0> list29 = this.h;
        if (list29 != null) {
            if (list11 != null) {
                if (list29.size() == list11.size()) {
                    int i3 = 0;
                    for (Object obj4 : list29) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((w0) obj4).a(list11.get(i3), expressionResolver, expressionResolver2)) {
                            i3 = i4;
                        }
                    }
                    z2 = true;
                }
                z2 = false;
                break;
            }
            return false;
        }
        if (!z2) {
            return false;
        }
        Expression<Boolean> expression5 = this.i;
        Boolean evaluate = expression5 != null ? expression5.evaluate(expressionResolver) : th;
        Expression<Boolean> expression6 = divText.i;
        if (!epx.f(evaluate, expression6 != null ? expression6.evaluate(expressionResolver2) : th)) {
            return false;
        }
        List<m1> list30 = this.j;
        if (list30 != null) {
            if (list10 != null) {
                if (list30.size() == list10.size()) {
                    int i5 = 0;
                    for (Object obj5 : list30) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((m1) obj5).a(list10.get(i5), expressionResolver, expressionResolver2)) {
                            i5 = i6;
                        }
                    }
                    z3 = true;
                }
                z3 = false;
                break;
            }
            return false;
        }
        if (!z3) {
            return false;
        }
        u1 u1Var2 = this.k;
        if (!(u1Var2 != null ? u1Var2.a(u1Var, expressionResolver, expressionResolver2) : u1Var == null) || this.l.evaluate(expressionResolver).booleanValue() != divText.l.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expression7 = this.m;
        Long evaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : th;
        Expression<Long> expression8 = divText.m;
        if (!epx.f(evaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : th)) {
            return false;
        }
        List<v3> list31 = this.n;
        if (list31 != null) {
            if (list9 != null) {
                if (list31.size() == list9.size()) {
                    int i7 = 0;
                    for (Object obj6 : list31) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((v3) obj6).g(list9.get(i7), expressionResolver, expressionResolver2)) {
                            i7 = i8;
                        }
                    }
                    z4 = true;
                }
                z4 = false;
                break;
            }
            return false;
        }
        if (!z4) {
            return false;
        }
        List<DivAction> list32 = this.o;
        if (list32 != null) {
            if (list23 != null) {
                if (list32.size() == list23.size()) {
                    int i9 = 0;
                    for (Object obj7 : list32) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((DivAction) obj7).a(list23.get(i9), expressionResolver, expressionResolver2)) {
                            i9 = i10;
                        }
                    }
                    z5 = true;
                }
                z5 = false;
                break;
            }
            return false;
        }
        if (!z5) {
            return false;
        }
        a aVar2 = this.p;
        if (aVar2 != null) {
            if (aVar != null) {
                List<b> list33 = aVar.c;
                List<Image> list34 = aVar.b;
                List<DivAction> list35 = aVar.a;
                List<DivAction> list36 = aVar2.a;
                if (list36 != null) {
                    if (list35 != null && list36.size() == list35.size()) {
                        int i11 = 0;
                        for (Object obj8 : list36) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                e43.t();
                                throw th;
                            }
                            if (!((DivAction) obj8).a(list35.get(i11), expressionResolver, expressionResolver2)) {
                                break;
                            }
                            i11 = i12;
                        }
                        List<Image> list37 = aVar2.b;
                        if (list37 != null) {
                            if (list34 != null && list37.size() == list34.size()) {
                                int i13 = 0;
                                for (Object obj9 : list37) {
                                    int i14 = i13 + 1;
                                    if (i13 < 0) {
                                        e43.t();
                                        throw th;
                                    }
                                    if (!((Image) obj9).a(list34.get(i13), expressionResolver, expressionResolver2)) {
                                        break;
                                    }
                                    i13 = i14;
                                }
                                List<b> list38 = aVar2.c;
                                if (list38 != null) {
                                    if (list33 != null && list38.size() == list33.size()) {
                                        int i15 = 0;
                                        for (Object obj10 : list38) {
                                            int i16 = i15 + 1;
                                            if (i15 < 0) {
                                                e43.t();
                                                throw th;
                                            }
                                            if (!((b) obj10).a(list33.get(i15), expressionResolver, expressionResolver2)) {
                                                break;
                                            }
                                            i15 = i16;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        List<zkn> list39 = this.q;
        if (list39 != null) {
            if (list8 != null) {
                if (list39.size() == list8.size()) {
                    int i17 = 0;
                    for (Object obj11 : list39) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((zkn) obj11).a(list8.get(i17))) {
                            i17 = i18;
                        }
                    }
                    z7 = true;
                }
                z7 = false;
                break;
            }
            return false;
        }
        if (!z7) {
            return false;
        }
        jln jlnVar2 = this.r;
        if (!(jlnVar2 != null ? jlnVar2.a(jlnVar, expressionResolver, expressionResolver2) : jlnVar == null)) {
            return false;
        }
        Expression<Integer> expression9 = this.s;
        Integer evaluate3 = expression9 != null ? expression9.evaluate(expressionResolver) : th;
        Expression<Integer> expression10 = divText.s;
        if (!epx.f(evaluate3, expression10 != null ? expression10.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<String> expression11 = this.t;
        String evaluate4 = expression11 != null ? expression11.evaluate(expressionResolver) : th;
        Expression<String> expression12 = divText.t;
        if (!epx.f(evaluate4, expression12 != null ? expression12.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<String> expression13 = this.u;
        String evaluate5 = expression13 != null ? expression13.evaluate(expressionResolver) : th;
        Expression<String> expression14 = divText.u;
        if (!epx.f(evaluate5, expression14 != null ? expression14.evaluate(expressionResolver2) : th) || this.v.evaluate(expressionResolver).longValue() != divText.v.evaluate(expressionResolver2).longValue() || this.w.evaluate(expressionResolver) != divText.w.evaluate(expressionResolver2)) {
            return false;
        }
        Expression<JSONObject> expression15 = this.x;
        JSONObject evaluate6 = expression15 != null ? expression15.evaluate(expressionResolver) : th;
        Expression<JSONObject> expression16 = divText.x;
        if (!epx.f(evaluate6, expression16 != null ? expression16.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<DivFontWeight> expression17 = this.y;
        Object obj12 = expression17 != null ? (DivFontWeight) expression17.evaluate(expressionResolver) : th;
        Expression<DivFontWeight> expression18 = divText.y;
        if (obj12 != (expression18 != null ? (DivFontWeight) expression18.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<Long> expression19 = this.z;
        Long evaluate7 = expression19 != null ? expression19.evaluate(expressionResolver) : th;
        Expression<Long> expression20 = divText.z;
        if (!epx.f(evaluate7, expression20 != null ? expression20.evaluate(expressionResolver2) : th)) {
            return false;
        }
        List<t4> list40 = this.A;
        if (list40 != null) {
            if (list27 != null) {
                if (list40.size() == list27.size()) {
                    int i19 = 0;
                    for (Object obj13 : list40) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<t4> list41 = list27;
                        if (((t4) obj13).a(list41.get(i19))) {
                            i19 = i20;
                            list27 = list41;
                        }
                    }
                    z8 = true;
                }
                z8 = false;
                break;
            }
            return false;
        }
        if (!z8 || !this.B.a(divText.B, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list42 = this.C;
        if (list42 != null) {
            if (list26 != null) {
                if (list42.size() == list26.size()) {
                    int i21 = 0;
                    for (Object obj14 : list42) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list43 = list26;
                        if (((DivAction) obj14).a(list43.get(i21), expressionResolver, expressionResolver2)) {
                            i21 = i22;
                            list26 = list43;
                        }
                    }
                    z9 = true;
                }
                z9 = false;
                break;
            }
            return false;
        }
        if (!z9) {
            return false;
        }
        List<DivAction> list44 = this.D;
        if (list44 != null) {
            if (list24 != null) {
                if (list44.size() == list24.size()) {
                    int i23 = 0;
                    for (Object obj15 : list44) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list45 = list24;
                        if (((DivAction) obj15).a(list45.get(i23), expressionResolver, expressionResolver2)) {
                            i23 = i24;
                            list24 = list45;
                        }
                    }
                    z10 = true;
                }
                z10 = false;
                break;
            }
            return false;
        }
        if (!z10 || !epx.f(this.E, divText.E)) {
            return false;
        }
        List<Image> list46 = this.F;
        if (list46 != null) {
            if (list22 != null) {
                if (list46.size() == list22.size()) {
                    int i25 = 0;
                    for (Object obj16 : list46) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<Image> list47 = list22;
                        if (((Image) obj16).a(list47.get(i25), expressionResolver, expressionResolver2)) {
                            i25 = i26;
                            list22 = list47;
                        }
                    }
                    z11 = true;
                }
                z11 = false;
                break;
            }
            return false;
        }
        if (!z11) {
            return false;
        }
        vmn vmnVar2 = this.G;
        if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
            return false;
        }
        if (!(this.H.evaluate(expressionResolver).doubleValue() == divText.H.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        Expression<Long> expression21 = this.I;
        Long evaluate8 = expression21 != null ? expression21.evaluate(expressionResolver) : th;
        Expression<Long> expression22 = divText.I;
        if (!epx.f(evaluate8, expression22 != null ? expression22.evaluate(expressionResolver2) : th)) {
            return false;
        }
        List<DivAction> list48 = this.J;
        if (list48 != null) {
            if (list20 != null) {
                if (list48.size() == list20.size()) {
                    int i27 = 0;
                    for (Object obj17 : list48) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list49 = list20;
                        if (((DivAction) obj17).a(list49.get(i27), expressionResolver, expressionResolver2)) {
                            i27 = i28;
                            list20 = list49;
                        }
                    }
                    z12 = true;
                }
                z12 = false;
                break;
            }
            return false;
        }
        if (!z12) {
            return false;
        }
        y3 y3Var3 = this.K;
        if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null)) {
            return false;
        }
        Expression<Long> expression23 = this.L;
        Long evaluate9 = expression23 != null ? expression23.evaluate(expressionResolver) : th;
        Expression<Long> expression24 = divText.L;
        if (!epx.f(evaluate9, expression24 != null ? expression24.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<Long> expression25 = this.M;
        Long evaluate10 = expression25 != null ? expression25.evaluate(expressionResolver) : th;
        Expression<Long> expression26 = divText.M;
        if (!epx.f(evaluate10, expression26 != null ? expression26.evaluate(expressionResolver2) : th)) {
            return false;
        }
        y3 y3Var4 = this.N;
        if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null)) {
            return false;
        }
        List<DivAction> list50 = this.O;
        if (list50 != null) {
            if (list16 != null) {
                if (list50.size() == list16.size()) {
                    int i29 = 0;
                    for (Object obj18 : list50) {
                        int i30 = i29 + 1;
                        if (i29 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list51 = list16;
                        if (((DivAction) obj18).a(list51.get(i29), expressionResolver, expressionResolver2)) {
                            i29 = i30;
                            list16 = list51;
                        }
                    }
                    z13 = true;
                }
                z13 = false;
                break;
            }
            return false;
        }
        if (!z13) {
            return false;
        }
        List<DivAction> list52 = this.P;
        if (list52 != null) {
            if (list15 != null) {
                if (list52.size() == list15.size()) {
                    int i31 = 0;
                    for (Object obj19 : list52) {
                        int i32 = i31 + 1;
                        if (i31 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list53 = list15;
                        if (((DivAction) obj19).a(list53.get(i31), expressionResolver, expressionResolver2)) {
                            i31 = i32;
                            list15 = list53;
                        }
                    }
                    z14 = true;
                }
                z14 = false;
                break;
            }
            return false;
        }
        if (!z14) {
            return false;
        }
        List<b> list54 = this.Q;
        if (list54 != null) {
            if (list14 != null) {
                if (list54.size() == list14.size()) {
                    int i33 = 0;
                    for (Object obj20 : list54) {
                        int i34 = i33 + 1;
                        if (i33 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<b> list55 = list14;
                        if (((b) obj20).a(list55.get(i33), expressionResolver, expressionResolver2)) {
                            i33 = i34;
                            list14 = list55;
                        }
                    }
                    z15 = true;
                }
                z15 = false;
                break;
            }
            return false;
        }
        if (!z15) {
            return false;
        }
        Expression<String> expression27 = this.R;
        String evaluate11 = expression27 != null ? expression27.evaluate(expressionResolver) : th;
        Expression<String> expression28 = divText.R;
        if (!epx.f(evaluate11, expression28 != null ? expression28.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<Long> expression29 = this.S;
        Long evaluate12 = expression29 != null ? expression29.evaluate(expressionResolver) : th;
        Expression<Long> expression30 = divText.S;
        if (!epx.f(evaluate12, expression30 != null ? expression30.evaluate(expressionResolver2) : th) || this.T.evaluate(expressionResolver).booleanValue() != divText.T.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> list56 = this.U;
        if (list56 != null) {
            if (list13 != null) {
                if (list56.size() == list13.size()) {
                    int i35 = 0;
                    for (Object obj21 : list56) {
                        int i36 = i35 + 1;
                        if (i35 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list57 = list13;
                        if (((DivAction) obj21).a(list57.get(i35), expressionResolver, expressionResolver2)) {
                            i35 = i36;
                            list13 = list57;
                        }
                    }
                    z16 = true;
                }
                z16 = false;
                break;
            }
            return false;
        }
        if (!z16 || this.V.evaluate(expressionResolver) != divText.V.evaluate(expressionResolver2) || !epx.f(this.W.evaluate(expressionResolver), divText.W.evaluate(expressionResolver2)) || this.X.evaluate(expressionResolver) != divText.X.evaluate(expressionResolver2) || this.Y.evaluate(expressionResolver) != divText.Y.evaluate(expressionResolver2) || this.Z.evaluate(expressionResolver).intValue() != divText.Z.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        rb rbVar2 = this.a0;
        if (rbVar2 != null) {
            if (rbVar != null) {
                if (rbVar2 instanceof rb.a) {
                    s6 s6Var = ((rb.a) rbVar2).b;
                    if (rbVar instanceof rb.a) {
                        hashable2 = ((rb.a) rbVar).b;
                    } else {
                        if (!(rbVar instanceof rb.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hashable2 = ((rb.b) rbVar).b;
                    }
                    z17 = s6Var.a(hashable2 instanceof s6 ? (s6) hashable2 : th, expressionResolver, expressionResolver2);
                } else {
                    if (!(rbVar2 instanceof rb.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f8 f8Var = ((rb.b) rbVar2).b;
                    if (rbVar instanceof rb.a) {
                        hashable = ((rb.a) rbVar).b;
                    } else {
                        if (!(rbVar instanceof rb.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hashable = ((rb.b) rbVar).b;
                    }
                    z17 = f8Var.a(hashable instanceof f8 ? (f8) hashable : th, expressionResolver, expressionResolver2);
                }
            }
            z17 = false;
        } else {
            if (rbVar == null) {
                z17 = true;
            }
            z17 = false;
        }
        if (!z17) {
            return false;
        }
        n9 n9Var2 = this.b0;
        if (!(n9Var2 != null ? n9Var2.a(n9Var, expressionResolver, expressionResolver2) : n9Var == null) || this.c0.evaluate(expressionResolver).booleanValue() != divText.c0.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivTooltip> list58 = this.d0;
        if (list58 != null) {
            if (list12 != null) {
                if (list58.size() == list12.size()) {
                    int i37 = 0;
                    for (Object obj22 : list58) {
                        int i38 = i37 + 1;
                        if (i37 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivTooltip> list59 = list12;
                        if (((DivTooltip) obj22).a(list59.get(i37), expressionResolver, expressionResolver2)) {
                            i37 = i38;
                            list12 = list59;
                        }
                    }
                    z18 = true;
                }
                z18 = false;
                break;
            }
            return false;
        }
        if (!z18) {
            return false;
        }
        hd hdVar2 = this.e0;
        if (!(hdVar2 != null ? hdVar2.a(hdVar, expressionResolver, expressionResolver2) : hdVar == null)) {
            return false;
        }
        d2 d2Var2 = this.f0;
        if (!(d2Var2 != null ? d2Var2.a(d2Var, expressionResolver, expressionResolver2) : d2Var == null)) {
            return false;
        }
        e1 e1Var3 = this.g0;
        if (!(e1Var3 != null ? e1Var3.a(e1Var2, expressionResolver, expressionResolver2) : e1Var2 == null)) {
            return false;
        }
        e1 e1Var4 = this.h0;
        if (!(e1Var4 != null ? e1Var4.a(e1Var, expressionResolver, expressionResolver2) : e1Var == null)) {
            return false;
        }
        List<DivTransitionTrigger> list60 = this.i0;
        if (list60 != null) {
            if (list7 != null) {
                if (list60.size() == list7.size()) {
                    int i39 = 0;
                    for (Object obj23 : list60) {
                        int i40 = i39 + 1;
                        if (i39 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivTransitionTrigger> list61 = list7;
                        if (((DivTransitionTrigger) obj23) == list61.get(i39)) {
                            i39 = i40;
                            list7 = list61;
                        }
                    }
                    z19 = true;
                }
                z19 = false;
                break;
            }
            return false;
        }
        if (!z19 || this.j0.evaluate(expressionResolver) != divText.j0.evaluate(expressionResolver2) || this.k0.evaluate(expressionResolver) != divText.k0.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivTrigger> list62 = this.l0;
        if (list62 != null) {
            if (list6 != null) {
                if (list62.size() == list6.size()) {
                    int i41 = 0;
                    for (Object obj24 : list62) {
                        int i42 = i41 + 1;
                        if (i41 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivTrigger> list63 = list6;
                        if (((DivTrigger) obj24).a(list63.get(i41), expressionResolver, expressionResolver2)) {
                            i41 = i42;
                            list6 = list63;
                        }
                    }
                    z20 = true;
                }
                z20 = false;
                break;
            }
            return false;
        }
        if (!z20) {
            return false;
        }
        List<md> list64 = this.m0;
        if (list64 != null) {
            List<md> list65 = divText.m0;
            if (list65 != null) {
                if (list64.size() == list65.size()) {
                    int i43 = 0;
                    for (Object obj25 : list64) {
                        int i44 = i43 + 1;
                        if (i43 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((md) obj25).a(list65.get(i43), expressionResolver, expressionResolver2)) {
                            i43 = i44;
                        }
                    }
                    z21 = true;
                }
                z21 = false;
                break;
            }
            return false;
        }
        if (!z21 || this.n0.evaluate(expressionResolver) != divText.n0.evaluate(expressionResolver2)) {
            return false;
        }
        zd zdVar = this.o0;
        if (!(zdVar != null ? zdVar.g(divText.o0, expressionResolver, expressionResolver2) : divText.o0 == null)) {
            return false;
        }
        List<zd> list66 = this.p0;
        if (list66 != null) {
            List<zd> list67 = divText.p0;
            if (list67 != null) {
                if (list66.size() == list67.size()) {
                    int i45 = 0;
                    for (Object obj26 : list66) {
                        int i46 = i45 + 1;
                        if (i45 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((zd) obj26).g(list67.get(i45), expressionResolver, expressionResolver2)) {
                            i45 = i46;
                        }
                    }
                    z22 = true;
                }
                z22 = false;
                break;
            }
            return false;
        }
        return z22 && this.q0.a(divText.q0, expressionResolver, expressionResolver2);
    }

    @Override // xsna.ikn
    public final Expression<Double> a() {
        return this.g;
    }

    @Override // xsna.ikn
    public final List<DivTooltip> b() {
        return this.d0;
    }

    @Override // xsna.ikn
    public final hd c() {
        return this.e0;
    }

    @Override // xsna.ikn
    public final u1 d() {
        return this.k;
    }

    @Override // xsna.ikn
    public final Expression<Long> e() {
        return this.m;
    }

    @Override // xsna.ikn
    public final List<md> f() {
        return this.m0;
    }

    @Override // xsna.ikn
    public final y3 g() {
        return this.K;
    }

    @Override // xsna.ikn
    public final List<m1> getBackground() {
        return this.j;
    }

    @Override // xsna.ikn
    public final v9 getHeight() {
        return this.B;
    }

    @Override // xsna.ikn
    public final String getId() {
        return this.E;
    }

    @Override // xsna.ikn
    public final Expression<DivVisibility> getVisibility() {
        return this.n0;
    }

    @Override // xsna.ikn
    public final v9 getWidth() {
        return this.q0;
    }

    @Override // xsna.ikn
    public final Expression<Long> h() {
        return this.S;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Integer num = this.r0;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(DivText.class).hashCode();
        int i19 = 0;
        DivAccessibility divAccessibility = this.a;
        int hash = hashCode + (divAccessibility != null ? divAccessibility.hash() : 0);
        DivAction divAction = this.b;
        int hash2 = this.c.hash() + hash + (divAction != null ? divAction.hash() : 0);
        List<DivAction> list = this.d;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((DivAction) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i20 = hash2 + i;
        Expression<DivAlignmentHorizontal> expression = this.e;
        int hashCode2 = i20 + (expression != null ? expression.hashCode() : 0);
        Expression<DivAlignmentVertical> expression2 = this.f;
        int hashCode3 = this.g.hashCode() + hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        List<w0> list2 = this.h;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((w0) it2.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int i21 = hashCode3 + i2;
        Expression<Boolean> expression3 = this.i;
        int hashCode4 = i21 + (expression3 != null ? expression3.hashCode() : 0);
        List<m1> list3 = this.j;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((m1) it3.next()).hash();
            }
        } else {
            i3 = 0;
        }
        int i22 = hashCode4 + i3;
        u1 u1Var = this.k;
        int hashCode5 = this.l.hashCode() + i22 + (u1Var != null ? u1Var.hash() : 0);
        Expression<Long> expression4 = this.m;
        int hashCode6 = hashCode5 + (expression4 != null ? expression4.hashCode() : 0);
        List<v3> list4 = this.n;
        if (list4 != null) {
            Iterator<T> it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((v3) it4.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i23 = hashCode6 + i4;
        List<DivAction> list5 = this.o;
        if (list5 != null) {
            Iterator<T> it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((DivAction) it5.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int i24 = i23 + i5;
        a aVar = this.p;
        int hash3 = i24 + (aVar != null ? aVar.hash() : 0);
        List<zkn> list6 = this.q;
        if (list6 != null) {
            Iterator<T> it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((zkn) it6.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i25 = hash3 + i6;
        jln jlnVar = this.r;
        int hash4 = i25 + (jlnVar != null ? jlnVar.hash() : 0);
        Expression<Integer> expression5 = this.s;
        int hashCode7 = hash4 + (expression5 != null ? expression5.hashCode() : 0);
        Expression<String> expression6 = this.t;
        int hashCode8 = hashCode7 + (expression6 != null ? expression6.hashCode() : 0);
        Expression<String> expression7 = this.u;
        int hashCode9 = this.w.hashCode() + this.v.hashCode() + hashCode8 + (expression7 != null ? expression7.hashCode() : 0);
        Expression<JSONObject> expression8 = this.x;
        int hashCode10 = hashCode9 + (expression8 != null ? expression8.hashCode() : 0);
        Expression<DivFontWeight> expression9 = this.y;
        int hashCode11 = hashCode10 + (expression9 != null ? expression9.hashCode() : 0);
        Expression<Long> expression10 = this.z;
        int hashCode12 = hashCode11 + (expression10 != null ? expression10.hashCode() : 0);
        List<t4> list7 = this.A;
        if (list7 != null) {
            Iterator<T> it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((t4) it7.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int hash5 = this.B.hash() + hashCode12 + i7;
        List<DivAction> list8 = this.C;
        if (list8 != null) {
            Iterator<T> it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((DivAction) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int i26 = hash5 + i8;
        List<DivAction> list9 = this.D;
        if (list9 != null) {
            Iterator<T> it9 = list9.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((DivAction) it9.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int i27 = i26 + i9;
        String str = this.E;
        int hashCode13 = i27 + (str != null ? str.hashCode() : 0);
        List<Image> list10 = this.F;
        if (list10 != null) {
            Iterator<T> it10 = list10.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((Image) it10.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i28 = hashCode13 + i10;
        vmn vmnVar = this.G;
        int hashCode14 = this.H.hashCode() + i28 + (vmnVar != null ? vmnVar.hash() : 0);
        Expression<Long> expression11 = this.I;
        int hashCode15 = hashCode14 + (expression11 != null ? expression11.hashCode() : 0);
        List<DivAction> list11 = this.J;
        if (list11 != null) {
            Iterator<T> it11 = list11.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((DivAction) it11.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i29 = hashCode15 + i11;
        y3 y3Var = this.K;
        int hash6 = i29 + (y3Var != null ? y3Var.hash() : 0);
        Expression<Long> expression12 = this.L;
        int hashCode16 = hash6 + (expression12 != null ? expression12.hashCode() : 0);
        Expression<Long> expression13 = this.M;
        int hashCode17 = hashCode16 + (expression13 != null ? expression13.hashCode() : 0);
        y3 y3Var2 = this.N;
        int hash7 = hashCode17 + (y3Var2 != null ? y3Var2.hash() : 0);
        List<DivAction> list12 = this.O;
        if (list12 != null) {
            Iterator<T> it12 = list12.iterator();
            i12 = 0;
            while (it12.hasNext()) {
                i12 += ((DivAction) it12.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int i30 = hash7 + i12;
        List<DivAction> list13 = this.P;
        if (list13 != null) {
            Iterator<T> it13 = list13.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((DivAction) it13.next()).hash();
            }
        } else {
            i13 = 0;
        }
        int i31 = i30 + i13;
        List<b> list14 = this.Q;
        if (list14 != null) {
            Iterator<T> it14 = list14.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((b) it14.next()).hash();
            }
        } else {
            i14 = 0;
        }
        int i32 = i31 + i14;
        Expression<String> expression14 = this.R;
        int hashCode18 = i32 + (expression14 != null ? expression14.hashCode() : 0);
        Expression<Long> expression15 = this.S;
        int hashCode19 = this.T.hashCode() + hashCode18 + (expression15 != null ? expression15.hashCode() : 0);
        List<DivAction> list15 = this.U;
        if (list15 != null) {
            Iterator<T> it15 = list15.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((DivAction) it15.next()).hash();
            }
        } else {
            i15 = 0;
        }
        int hashCode20 = this.Z.hashCode() + this.Y.hashCode() + this.X.hashCode() + this.W.hashCode() + this.V.hashCode() + hashCode19 + i15;
        rb rbVar = this.a0;
        int hash8 = hashCode20 + (rbVar != null ? rbVar.hash() : 0);
        n9 n9Var = this.b0;
        int hashCode21 = this.c0.hashCode() + hash8 + (n9Var != null ? n9Var.hash() : 0);
        List<DivTooltip> list16 = this.d0;
        if (list16 != null) {
            Iterator<T> it16 = list16.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((DivTooltip) it16.next()).hash();
            }
        } else {
            i16 = 0;
        }
        int i33 = hashCode21 + i16;
        hd hdVar = this.e0;
        int hash9 = i33 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.f0;
        int hash10 = hash9 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.g0;
        int hash11 = hash10 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.h0;
        int hash12 = hash11 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list17 = this.i0;
        int hashCode22 = this.k0.hashCode() + this.j0.hashCode() + hash12 + (list17 != null ? list17.hashCode() : 0);
        List<DivTrigger> list18 = this.l0;
        if (list18 != null) {
            Iterator<T> it17 = list18.iterator();
            i17 = 0;
            while (it17.hasNext()) {
                i17 += ((DivTrigger) it17.next()).hash();
            }
        } else {
            i17 = 0;
        }
        int i34 = hashCode22 + i17;
        List<md> list19 = this.m0;
        if (list19 != null) {
            Iterator<T> it18 = list19.iterator();
            i18 = 0;
            while (it18.hasNext()) {
                i18 += ((md) it18.next()).hash();
            }
        } else {
            i18 = 0;
        }
        int hashCode23 = this.n0.hashCode() + i34 + i18;
        zd zdVar = this.o0;
        int hash13 = hashCode23 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list20 = this.p0;
        if (list20 != null) {
            Iterator<T> it19 = list20.iterator();
            while (it19.hasNext()) {
                i19 += ((zd) it19.next()).hash();
            }
        }
        int hash14 = this.q0.hash() + hash13 + i19;
        this.r0 = Integer.valueOf(hash14);
        return hash14;
    }

    @Override // xsna.ikn
    public final Expression<String> i() {
        return this.R;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentHorizontal> j() {
        return this.e;
    }

    @Override // xsna.ikn
    public final e1 k() {
        return this.h0;
    }

    @Override // xsna.ikn
    public final List<DivTransitionTrigger> l() {
        return this.i0;
    }

    @Override // xsna.ikn
    public final List<zkn> m() {
        return this.q;
    }

    @Override // xsna.ikn
    public final List<DivAction> n() {
        return this.U;
    }

    @Override // xsna.ikn
    public final vmn o() {
        return this.G;
    }

    @Override // xsna.ikn
    public final List<DivTrigger> p() {
        return this.l0;
    }

    @Override // xsna.ikn
    public final e1 q() {
        return this.g0;
    }

    @Override // xsna.ikn
    public final List<w0> r() {
        return this.h;
    }

    @Override // xsna.ikn
    public final List<zd> s() {
        return this.p0;
    }

    @Override // xsna.ikn
    public final d2 t() {
        return this.f0;
    }

    @Override // xsna.ikn
    public final List<v3> u() {
        return this.n;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentVertical> v() {
        return this.f;
    }

    @Override // xsna.ikn
    public final jln w() {
        return this.r;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((yb.k) BuiltInParserKt.getBuiltInParserComponent().u8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // xsna.ikn
    public final DivAccessibility x() {
        return this.a;
    }

    @Override // xsna.ikn
    public final y3 y() {
        return this.N;
    }

    @Override // xsna.ikn
    public final zd z() {
        return this.o0;
    }

    /* compiled from: DivText.kt */
    public static final class Image implements JSONSerializable, Hashable {
        public final Accessibility a;
        public final Expression<DivTextAlignmentVertical> b;
        public final q4 c;
        public final Expression<IndexingDirection> d;
        public final Expression<Boolean> e;
        public final Expression<Long> f;
        public final Expression<Integer> g;
        public final Expression<DivBlendMode> h;
        public final Expression<Uri> i;
        public final q4 j;
        public Integer k;

        /* compiled from: DivText.kt */
        public enum IndexingDirection {
            NORMAL("normal"),
            REVERSED("reversed");

            private final String value;
            public static final c Converter = new c();
            public static final izs<IndexingDirection, String> TO_STRING = b.i;
            public static final izs<String, IndexingDirection> FROM_STRING = a.i;

            /* compiled from: DivText.kt */
            public static final class a extends Lambda implements izs<String, IndexingDirection> {
                public static final a i = new a(1);

                @Override // xsna.izs
                public final IndexingDirection invoke(String str) {
                    String str2 = str;
                    IndexingDirection.Converter.getClass();
                    IndexingDirection indexingDirection = IndexingDirection.NORMAL;
                    if (epx.f(str2, indexingDirection.value)) {
                        return indexingDirection;
                    }
                    IndexingDirection indexingDirection2 = IndexingDirection.REVERSED;
                    if (epx.f(str2, indexingDirection2.value)) {
                        return indexingDirection2;
                    }
                    return null;
                }
            }

            /* compiled from: DivText.kt */
            public static final class b extends Lambda implements izs<IndexingDirection, String> {
                public static final b i = new b(1);

                @Override // xsna.izs
                public final String invoke(IndexingDirection indexingDirection) {
                    IndexingDirection.Converter.getClass();
                    return indexingDirection.value;
                }
            }

            /* compiled from: DivText.kt */
            public static final class c {
            }

            IndexingDirection(String str) {
                this.value = str;
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            Expression.Companion.constant$default(companion, DivTextAlignmentVertical.CENTER, null, 2, null);
            Expression.Companion.constant$default(companion, 20L, null, 2, null);
            Expression.Companion.constant$default(companion, IndexingDirection.NORMAL, null, 2, null);
            Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
            Expression.Companion.constant$default(companion, DivBlendMode.SOURCE_IN, null, 2, null);
            Expression.Companion.constant$default(companion, 20L, null, 2, null);
        }

        public Image(Accessibility accessibility, Expression<DivTextAlignmentVertical> expression, q4 q4Var, Expression<IndexingDirection> expression2, Expression<Boolean> expression3, Expression<Long> expression4, Expression<Integer> expression5, Expression<DivBlendMode> expression6, Expression<Uri> expression7, q4 q4Var2) {
            this.a = accessibility;
            this.b = expression;
            this.c = q4Var;
            this.d = expression2;
            this.e = expression3;
            this.f = expression4;
            this.g = expression5;
            this.h = expression6;
            this.i = expression7;
            this.j = q4Var2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        
            if (r3.b == r1.b) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        
            if (r7.b.evaluate(r9) != r8.b.evaluate(r10)) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        
            if (r7.c.a(r8.c, r9, r10) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        
            if (r7.d.evaluate(r9) != r8.d.evaluate(r10)) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
        
            if (r7.e.evaluate(r9).booleanValue() != r8.e.evaluate(r10).booleanValue()) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        
            if (r7.f.evaluate(r9).longValue() != r8.f.evaluate(r10).longValue()) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        
            r1 = r7.g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
        
            if (r1 == null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
        
            r1 = r1.evaluate(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
        
            r3 = r8.g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
        
            if (r3 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
        
            r2 = r3.evaluate(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
        
            if (xsna.epx.f(r1, r2) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
        
            if (r7.h.evaluate(r9) != r8.h.evaluate(r10)) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
        
            if (xsna.epx.f(r7.i.evaluate(r9), r8.i.evaluate(r10)) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
        
            if (r7.j.a(r8.j, r9, r10) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x009d, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0034, code lost:
        
            if (r1 == null) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(Image image, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (image == null) {
                return false;
            }
            Accessibility accessibility = image.a;
            Integer num = null;
            Accessibility accessibility2 = this.a;
            if (accessibility2 != null) {
                if (accessibility != null) {
                    Expression<String> expression = accessibility2.a;
                    String evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
                    Expression<String> expression2 = accessibility.a;
                    if (epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                    }
                }
                return false;
            }
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.k;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = fpf0.a(Image.class).hashCode();
            Accessibility accessibility = this.a;
            int hashCode2 = this.f.hashCode() + this.e.hashCode() + this.d.hashCode() + this.c.hash() + this.b.hashCode() + hashCode + (accessibility != null ? accessibility.hash() : 0);
            Expression<Integer> expression = this.g;
            int hash = this.j.hash() + this.i.hashCode() + this.h.hashCode() + hashCode2 + (expression != null ? expression.hashCode() : 0);
            this.k = Integer.valueOf(hash);
            return hash;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((xb.d) BuiltInParserKt.getBuiltInParserComponent().A8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivText.kt */
        public static final class Accessibility implements JSONSerializable, Hashable {
            public static final Type d = Type.AUTO;
            public final Expression<String> a;
            public final Type b;
            public Integer c;

            /* compiled from: DivText.kt */
            public enum Type {
                NONE("none"),
                BUTTON("button"),
                IMAGE("image"),
                TEXT("text"),
                AUTO("auto");

                private final String value;
                public static final c Converter = new c();
                public static final izs<Type, String> TO_STRING = b.i;
                public static final izs<String, Type> FROM_STRING = a.i;

                /* compiled from: DivText.kt */
                public static final class a extends Lambda implements izs<String, Type> {
                    public static final a i = new a(1);

                    @Override // xsna.izs
                    public final Type invoke(String str) {
                        String str2 = str;
                        Type.Converter.getClass();
                        Type type = Type.NONE;
                        if (epx.f(str2, type.value)) {
                            return type;
                        }
                        Type type2 = Type.BUTTON;
                        if (epx.f(str2, type2.value)) {
                            return type2;
                        }
                        Type type3 = Type.IMAGE;
                        if (epx.f(str2, type3.value)) {
                            return type3;
                        }
                        Type type4 = Type.TEXT;
                        if (epx.f(str2, type4.value)) {
                            return type4;
                        }
                        Type type5 = Type.AUTO;
                        if (epx.f(str2, type5.value)) {
                            return type5;
                        }
                        return null;
                    }
                }

                /* compiled from: DivText.kt */
                public static final class b extends Lambda implements izs<Type, String> {
                    public static final b i = new b(1);

                    @Override // xsna.izs
                    public final String invoke(Type type) {
                        Type.Converter.getClass();
                        return type.value;
                    }
                }

                /* compiled from: DivText.kt */
                public static final class c {
                }

                Type(String str) {
                    this.value = str;
                }
            }

            public Accessibility(Expression<String> expression, Type type) {
                this.a = expression;
                this.b = type;
            }

            @Override // com.yandex.div.data.Hashable
            public final int hash() {
                Integer num = this.c;
                if (num != null) {
                    return num.intValue();
                }
                int hashCode = fpf0.a(Accessibility.class).hashCode();
                Expression<String> expression = this.a;
                int hashCode2 = this.b.hashCode() + hashCode + (expression != null ? expression.hashCode() : 0);
                this.c = Integer.valueOf(hashCode2);
                return hashCode2;
            }

            @Override // com.yandex.div.json.JSONSerializable
            public final JSONObject writeToJSON() {
                wb.a aVar = (wb.a) BuiltInParserKt.getBuiltInParserComponent().D8.getValue();
                ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
                aVar.getClass();
                JSONObject jSONObject = new JSONObject();
                JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "description", this.a);
                JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", this.b, (izs<Type, R>) Type.TO_STRING);
                return jSONObject;
            }

            public Accessibility() {
                this(null, d);
            }
        }
    }

    /* compiled from: DivText.kt */
    public static final class b implements JSONSerializable, Hashable {
        public static final Expression<Double> x;
        public static final Expression<DivSizeUnit> y;
        public static final Expression<Long> z;
        public final List<DivAction> a;
        public final Expression<DivTextAlignmentVertical> b;
        public final zb c;
        public final Expression<Double> d;
        public final ec e;
        public final Expression<Long> f;
        public final Expression<String> g;
        public final Expression<String> h;
        public final Expression<Long> i;
        public final Expression<DivSizeUnit> j;
        public final Expression<JSONObject> k;
        public final Expression<DivFontWeight> l;
        public final Expression<Long> m;
        public final Expression<Double> n;
        public final Expression<Long> o;
        public final ic p;
        public final Expression<Long> q;
        public final Expression<DivLineStyle> r;
        public final Expression<Integer> s;
        public final n9 t;
        public final Expression<Long> u;
        public final Expression<DivLineStyle> v;
        public Integer w;

        static {
            Expression.Companion companion = Expression.Companion;
            x = Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
            y = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            z = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        }

        public b(List<DivAction> list, Expression<DivTextAlignmentVertical> expression, zb zbVar, Expression<Double> expression2, ec ecVar, Expression<Long> expression3, Expression<String> expression4, Expression<String> expression5, Expression<Long> expression6, Expression<DivSizeUnit> expression7, Expression<JSONObject> expression8, Expression<DivFontWeight> expression9, Expression<Long> expression10, Expression<Double> expression11, Expression<Long> expression12, ic icVar, Expression<Long> expression13, Expression<DivLineStyle> expression14, Expression<Integer> expression15, n9 n9Var, Expression<Long> expression16, Expression<DivLineStyle> expression17) {
            this.a = list;
            this.b = expression;
            this.c = zbVar;
            this.d = expression2;
            this.e = ecVar;
            this.f = expression3;
            this.g = expression4;
            this.h = expression5;
            this.i = expression6;
            this.j = expression7;
            this.k = expression8;
            this.l = expression9;
            this.m = expression10;
            this.n = expression11;
            this.o = expression12;
            this.p = icVar;
            this.q = expression13;
            this.r = expression14;
            this.s = expression15;
            this.t = n9Var;
            this.u = expression16;
            this.v = expression17;
        }

        /* JADX WARN: Code restructure failed: missing block: B:156:0x0330, code lost:
        
            if (r7.e.a(r6.e, r19, r20) != false) goto L236;
         */
        /* JADX WARN: Code restructure failed: missing block: B:157:0x038a, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:217:0x037f, code lost:
        
            if (r7.b.evaluate(r19).booleanValue() == r6.b.evaluate(r20).booleanValue()) goto L236;
         */
        /* JADX WARN: Code restructure failed: missing block: B:222:0x0388, code lost:
        
            if (r6 == null) goto L236;
         */
        /* JADX WARN: Code restructure failed: missing block: B:247:0x017c, code lost:
        
            if (r7 == null) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:264:0x0113, code lost:
        
            if ((r8 != null ? r8.a(r12, r19, r20) : r12 == null) != false) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:272:0x011c, code lost:
        
            if (r8 == null) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:275:0x0057, code lost:
        
            if (r9 == null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
        
            if (r11.a.evaluate(r19).intValue() == r8.a.evaluate(r20).intValue()) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x011e, code lost:
        
            r8 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0179, code lost:
        
            if ((r7 != null ? r7.a(r11, r19, r20) : r11 == null) != false) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x017e, code lost:
        
            r7 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(b bVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            boolean z2;
            boolean z3;
            boolean z4;
            if (bVar != null) {
                n9 n9Var = bVar.t;
                ic icVar = bVar.p;
                ec ecVar = bVar.e;
                zb zbVar = bVar.c;
                List<DivAction> list = bVar.a;
                List<DivAction> list2 = this.a;
                if (list2 != null) {
                    if (list != null && list2.size() == list.size()) {
                        int i = 0;
                        for (Object obj : list2) {
                            int i2 = i + 1;
                            if (i < 0) {
                                e43.t();
                                throw null;
                            }
                            if (!((DivAction) obj).a(list.get(i), expressionResolver, expressionResolver2)) {
                                break;
                            }
                            i = i2;
                        }
                        Expression<DivTextAlignmentVertical> expression = this.b;
                        DivTextAlignmentVertical evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
                        Expression<DivTextAlignmentVertical> expression2 = bVar.b;
                        if (evaluate == (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                            zb zbVar2 = this.c;
                            if (zbVar2 != null) {
                                if (zbVar != null) {
                                    if (zbVar2 instanceof zb.b) {
                                        bpn bpnVar = ((zb.b) zbVar2).b;
                                        Object a = zbVar.a();
                                        bpn bpnVar2 = a instanceof bpn ? (bpn) a : null;
                                        if (bpnVar2 == null) {
                                            bpnVar.getClass();
                                        }
                                    } else {
                                        if (!(zbVar2 instanceof zb.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        l2 l2Var = ((zb.a) zbVar2).b;
                                        Object a2 = zbVar.a();
                                        l2 l2Var2 = a2 instanceof l2 ? (l2) a2 : null;
                                        l2Var.getClass();
                                        if (l2Var2 != null) {
                                            y3 y3Var = l2Var2.c;
                                            if (l2Var.a.evaluate(expressionResolver).intValue() == l2Var2.a.evaluate(expressionResolver2).intValue() && l2Var.b.evaluate(expressionResolver).longValue() == l2Var2.b.evaluate(expressionResolver2).longValue()) {
                                                y3 y3Var2 = l2Var.c;
                                            }
                                        }
                                    }
                                }
                                z2 = false;
                            }
                            if (z2) {
                                if (this.d.evaluate(expressionResolver).doubleValue() == bVar.d.evaluate(expressionResolver2).doubleValue()) {
                                    ec ecVar2 = this.e;
                                    if (ecVar2 != null) {
                                        if (ecVar != null) {
                                            va vaVar = ecVar.b;
                                            Expression<Long> expression3 = ecVar2.a;
                                            Long evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
                                            Expression<Long> expression4 = ecVar.a;
                                            if (epx.f(evaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                                                va vaVar2 = ecVar2.b;
                                            }
                                        }
                                        z3 = false;
                                    }
                                    if (z3) {
                                        Expression<Long> expression5 = this.f;
                                        Long evaluate3 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
                                        Expression<Long> expression6 = bVar.f;
                                        if (epx.f(evaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
                                            Expression<String> expression7 = this.g;
                                            String evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
                                            Expression<String> expression8 = bVar.g;
                                            if (epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
                                                Expression<String> expression9 = this.h;
                                                String evaluate5 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
                                                Expression<String> expression10 = bVar.h;
                                                if (epx.f(evaluate5, expression10 != null ? expression10.evaluate(expressionResolver2) : null)) {
                                                    Expression<Long> expression11 = this.i;
                                                    Long evaluate6 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
                                                    Expression<Long> expression12 = bVar.i;
                                                    if (epx.f(evaluate6, expression12 != null ? expression12.evaluate(expressionResolver2) : null) && this.j.evaluate(expressionResolver) == bVar.j.evaluate(expressionResolver2)) {
                                                        Expression<JSONObject> expression13 = this.k;
                                                        JSONObject evaluate7 = expression13 != null ? expression13.evaluate(expressionResolver) : null;
                                                        Expression<JSONObject> expression14 = bVar.k;
                                                        if (epx.f(evaluate7, expression14 != null ? expression14.evaluate(expressionResolver2) : null)) {
                                                            Expression<DivFontWeight> expression15 = this.l;
                                                            DivFontWeight evaluate8 = expression15 != null ? expression15.evaluate(expressionResolver) : null;
                                                            Expression<DivFontWeight> expression16 = bVar.l;
                                                            if (evaluate8 == (expression16 != null ? expression16.evaluate(expressionResolver2) : null)) {
                                                                Expression<Long> expression17 = this.m;
                                                                Long evaluate9 = expression17 != null ? expression17.evaluate(expressionResolver) : null;
                                                                Expression<Long> expression18 = bVar.m;
                                                                if (epx.f(evaluate9, expression18 != null ? expression18.evaluate(expressionResolver2) : null)) {
                                                                    Expression<Double> expression19 = this.n;
                                                                    Double evaluate10 = expression19 != null ? expression19.evaluate(expressionResolver) : null;
                                                                    Expression<Double> expression20 = bVar.n;
                                                                    if (epx.c(evaluate10, expression20 != null ? expression20.evaluate(expressionResolver2) : null)) {
                                                                        Expression<Long> expression21 = this.o;
                                                                        Long evaluate11 = expression21 != null ? expression21.evaluate(expressionResolver) : null;
                                                                        Expression<Long> expression22 = bVar.o;
                                                                        if (epx.f(evaluate11, expression22 != null ? expression22.evaluate(expressionResolver2) : null)) {
                                                                            ic icVar2 = this.p;
                                                                            if (icVar2 != null) {
                                                                                if (icVar != null) {
                                                                                    if (icVar2 instanceof ic.a) {
                                                                                        pc pcVar = ((ic.a) icVar2).b;
                                                                                        Object a3 = icVar.a();
                                                                                        pc pcVar2 = a3 instanceof pc ? (pc) a3 : null;
                                                                                        if (pcVar2 == null) {
                                                                                            pcVar.getClass();
                                                                                        } else if (pcVar.a.evaluate(expressionResolver).intValue() == pcVar2.a.evaluate(expressionResolver2).intValue()) {
                                                                                            if (pcVar.b.evaluate(expressionResolver).doubleValue() == pcVar2.b.evaluate(expressionResolver2).doubleValue()) {
                                                                                                if (pcVar.c.evaluate(expressionResolver).booleanValue() == pcVar2.c.evaluate(expressionResolver2).booleanValue()) {
                                                                                                    if (pcVar.d.evaluate(expressionResolver).booleanValue() == pcVar2.d.evaluate(expressionResolver2).booleanValue()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        if (!(icVar2 instanceof ic.b)) {
                                                                                            throw new NoWhenBranchMatchedException();
                                                                                        }
                                                                                        sc scVar = ((ic.b) icVar2).b;
                                                                                        Object a4 = icVar.a();
                                                                                        sc scVar2 = a4 instanceof sc ? (sc) a4 : null;
                                                                                        if (scVar2 == null) {
                                                                                            scVar.getClass();
                                                                                        } else if (scVar.a.evaluate(expressionResolver).intValue() == scVar2.a.evaluate(expressionResolver2).intValue()) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                                z4 = false;
                                                                            }
                                                                            if (z4 && this.q.evaluate(expressionResolver).longValue() == bVar.q.evaluate(expressionResolver2).longValue()) {
                                                                                Expression<DivLineStyle> expression23 = this.r;
                                                                                DivLineStyle evaluate12 = expression23 != null ? expression23.evaluate(expressionResolver) : null;
                                                                                Expression<DivLineStyle> expression24 = bVar.r;
                                                                                if (evaluate12 == (expression24 != null ? expression24.evaluate(expressionResolver2) : null)) {
                                                                                    Expression<Integer> expression25 = this.s;
                                                                                    Integer evaluate13 = expression25 != null ? expression25.evaluate(expressionResolver) : null;
                                                                                    Expression<Integer> expression26 = bVar.s;
                                                                                    if (epx.f(evaluate13, expression26 != null ? expression26.evaluate(expressionResolver2) : null)) {
                                                                                        n9 n9Var2 = this.t;
                                                                                        if (n9Var2 != null ? n9Var2.a(n9Var, expressionResolver, expressionResolver2) : n9Var == null) {
                                                                                            Expression<Long> expression27 = this.u;
                                                                                            Long evaluate14 = expression27 != null ? expression27.evaluate(expressionResolver) : null;
                                                                                            Expression<Long> expression28 = bVar.u;
                                                                                            if (epx.f(evaluate14, expression28 != null ? expression28.evaluate(expressionResolver2) : null)) {
                                                                                                Expression<DivLineStyle> expression29 = this.v;
                                                                                                DivLineStyle evaluate15 = expression29 != null ? expression29.evaluate(expressionResolver) : null;
                                                                                                Expression<DivLineStyle> expression30 = bVar.v;
                                                                                                if (evaluate15 == (expression30 != null ? expression30.evaluate(expressionResolver2) : null)) {
                                                                                                    return true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            int i;
            Integer num = this.w;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = fpf0.a(b.class).hashCode();
            List<DivAction> list = this.a;
            if (list != null) {
                Iterator<T> it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    i += ((DivAction) it.next()).hash();
                }
            } else {
                i = 0;
            }
            int i2 = hashCode + i;
            Expression<DivTextAlignmentVertical> expression = this.b;
            int hashCode2 = i2 + (expression != null ? expression.hashCode() : 0);
            zb zbVar = this.c;
            int hashCode3 = this.d.hashCode() + hashCode2 + (zbVar != null ? zbVar.hash() : 0);
            ec ecVar = this.e;
            int hash = hashCode3 + (ecVar != null ? ecVar.hash() : 0);
            Expression<Long> expression2 = this.f;
            int hashCode4 = hash + (expression2 != null ? expression2.hashCode() : 0);
            Expression<String> expression3 = this.g;
            int hashCode5 = hashCode4 + (expression3 != null ? expression3.hashCode() : 0);
            Expression<String> expression4 = this.h;
            int hashCode6 = hashCode5 + (expression4 != null ? expression4.hashCode() : 0);
            Expression<Long> expression5 = this.i;
            int hashCode7 = this.j.hashCode() + hashCode6 + (expression5 != null ? expression5.hashCode() : 0);
            Expression<JSONObject> expression6 = this.k;
            int hashCode8 = hashCode7 + (expression6 != null ? expression6.hashCode() : 0);
            Expression<DivFontWeight> expression7 = this.l;
            int hashCode9 = hashCode8 + (expression7 != null ? expression7.hashCode() : 0);
            Expression<Long> expression8 = this.m;
            int hashCode10 = hashCode9 + (expression8 != null ? expression8.hashCode() : 0);
            Expression<Double> expression9 = this.n;
            int hashCode11 = hashCode10 + (expression9 != null ? expression9.hashCode() : 0);
            Expression<Long> expression10 = this.o;
            int hashCode12 = hashCode11 + (expression10 != null ? expression10.hashCode() : 0);
            ic icVar = this.p;
            int hashCode13 = this.q.hashCode() + hashCode12 + (icVar != null ? icVar.hash() : 0);
            Expression<DivLineStyle> expression11 = this.r;
            int hashCode14 = hashCode13 + (expression11 != null ? expression11.hashCode() : 0);
            Expression<Integer> expression12 = this.s;
            int hashCode15 = hashCode14 + (expression12 != null ? expression12.hashCode() : 0);
            n9 n9Var = this.t;
            int hash2 = hashCode15 + (n9Var != null ? n9Var.hash() : 0);
            Expression<Long> expression13 = this.u;
            int hashCode16 = hash2 + (expression13 != null ? expression13.hashCode() : 0);
            Expression<DivLineStyle> expression14 = this.v;
            int hashCode17 = hashCode16 + (expression14 != null ? expression14.hashCode() : 0);
            this.w = Integer.valueOf(hashCode17);
            return hashCode17;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((hc.f) BuiltInParserKt.getBuiltInParserComponent().x8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public b() {
            this(null, null, null, x, null, null, null, null, null, y, null, null, null, null, null, null, z, null, null, null, null, null);
        }
    }
}
