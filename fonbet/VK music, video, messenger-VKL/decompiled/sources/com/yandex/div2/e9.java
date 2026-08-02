package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.f9;
import com.yandex.div2.v9;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.ikn;
import xsna.jln;
import xsna.krn;
import xsna.vmn;
import xsna.zkn;

/* compiled from: DivSelect.kt */
/* loaded from: classes8.dex */
public final class e9 implements JSONSerializable, Hashable, ikn {
    public final List<a> A;
    public final y3 B;
    public final Expression<String> C;
    public final Expression<Long> D;
    public final List<DivAction> E;
    public final Expression<Integer> F;
    public final List<DivTooltip> G;
    public final hd H;
    public final d2 I;
    public final e1 J;
    public final e1 K;
    public final List<DivTransitionTrigger> L;
    public final String M;
    public final List<DivTrigger> N;
    public final List<md> O;
    public final Expression<DivVisibility> P;
    public final zd Q;
    public final List<zd> R;
    public final v9 S;
    public Integer T;
    public final DivAccessibility a;
    public final Expression<DivAlignmentHorizontal> b;
    public final Expression<DivAlignmentVertical> c;
    public final Expression<Double> d;
    public final List<w0> e;
    public final List<m1> f;
    public final u1 g;
    public final Expression<Long> h;
    public final List<v3> i;
    public final List<zkn> j;
    public final jln k;
    public final Expression<String> l;
    public final Expression<Long> m;
    public final Expression<DivSizeUnit> n;
    public final Expression<JSONObject> o;
    public final Expression<DivFontWeight> p;
    public final Expression<Long> q;
    public final List<t4> r;
    public final v9 s;
    public final Expression<Integer> t;
    public final Expression<String> u;
    public final String v;
    public final vmn w;
    public final Expression<Double> x;
    public final Expression<Long> y;
    public final y3 z;

    /* compiled from: DivSelect.kt */
    public static final class a implements JSONSerializable, Hashable {
        public final Expression<String> a;
        public final Expression<String> b;
        public Integer c;

        public a(Expression<String> expression, Expression<String> expression2) {
            this.a = expression;
            this.b = expression2;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.c;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = fpf0.a(a.class).hashCode();
            Expression<String> expression = this.a;
            int hashCode2 = this.b.hashCode() + hashCode + (expression != null ? expression.hashCode() : 0);
            this.c = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            g9 g9Var = (g9) BuiltInParserKt.getBuiltInParserComponent().D6.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            g9Var.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "text", this.a);
            JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "value", this.b);
            return jSONObject;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Expression.Companion.constant$default(companion, 12L, null, 2, null);
        Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e9(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list, List<? extends m1> list2, u1 u1Var, Expression<Long> expression4, List<v3> list3, List<zkn> list4, jln jlnVar, Expression<String> expression5, Expression<Long> expression6, Expression<DivSizeUnit> expression7, Expression<JSONObject> expression8, Expression<DivFontWeight> expression9, Expression<Long> expression10, List<t4> list5, v9 v9Var, Expression<Integer> expression11, Expression<String> expression12, String str, vmn vmnVar, Expression<Double> expression13, Expression<Long> expression14, y3 y3Var, List<a> list6, y3 y3Var2, Expression<String> expression15, Expression<Long> expression16, List<DivAction> list7, Expression<Integer> expression17, List<DivTooltip> list8, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list9, String str2, List<DivTrigger> list10, List<? extends md> list11, Expression<DivVisibility> expression18, zd zdVar, List<zd> list12, v9 v9Var2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = list2;
        this.g = u1Var;
        this.h = expression4;
        this.i = list3;
        this.j = list4;
        this.k = jlnVar;
        this.l = expression5;
        this.m = expression6;
        this.n = expression7;
        this.o = expression8;
        this.p = expression9;
        this.q = expression10;
        this.r = list5;
        this.s = v9Var;
        this.t = expression11;
        this.u = expression12;
        this.v = str;
        this.w = vmnVar;
        this.x = expression13;
        this.y = expression14;
        this.z = y3Var;
        this.A = list6;
        this.B = y3Var2;
        this.C = expression15;
        this.D = expression16;
        this.E = list7;
        this.F = expression17;
        this.G = list8;
        this.H = hdVar;
        this.I = d2Var;
        this.J = e1Var;
        this.K = e1Var2;
        this.L = list9;
        this.M = str2;
        this.N = list10;
        this.O = list11;
        this.P = expression18;
        this.Q = zdVar;
        this.R = list12;
        this.S = v9Var2;
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:394:0x06fd, code lost:
    
        if (r17 == null) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x068f, code lost:
    
        if (r19 == null) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0642, code lost:
    
        if (r20 == null) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x05eb, code lost:
    
        if (r21 == null) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x054b, code lost:
    
        if (r26 == null) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x04e4, code lost:
    
        if (r28 == null) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0317, code lost:
    
        if (r7 == null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0218, code lost:
    
        if (r9 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x01d1, code lost:
    
        if (r10 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0158, code lost:
    
        if (r12 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0110, code lost:
    
        if (r13 == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:217:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:453:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0444 A[LOOP:11: B:455:0x03ef->B:464:0x0444, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x03e3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(e9 e9Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (e9Var == null) {
            return false;
        }
        List<zd> list = e9Var.R;
        zd zdVar = e9Var.Q;
        List<md> list2 = e9Var.O;
        List<DivTrigger> list3 = e9Var.N;
        List<DivTransitionTrigger> list4 = e9Var.L;
        e1 e1Var = e9Var.K;
        e1 e1Var2 = e9Var.J;
        d2 d2Var = e9Var.I;
        hd hdVar = e9Var.H;
        List<DivTooltip> list5 = e9Var.G;
        List<DivAction> list6 = e9Var.E;
        y3 y3Var = e9Var.B;
        List<zd> list7 = list;
        y3 y3Var2 = e9Var.z;
        vmn vmnVar = e9Var.w;
        List<md> list8 = list2;
        List<t4> list9 = e9Var.r;
        List<DivTrigger> list10 = list3;
        jln jlnVar = e9Var.k;
        List<DivTransitionTrigger> list11 = list4;
        List<zkn> list12 = e9Var.j;
        List<v3> list13 = e9Var.i;
        u1 u1Var = e9Var.g;
        List<m1> list14 = e9Var.f;
        List<w0> list15 = e9Var.e;
        List<DivTooltip> list16 = list5;
        DivAccessibility divAccessibility = e9Var.a;
        List<DivAction> list17 = list6;
        DivAccessibility divAccessibility2 = this.a;
        if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expression = this.b;
        DivAlignmentHorizontal evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expression2 = e9Var.b;
        if (evaluate != (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.c;
        DivAlignmentVertical evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expression4 = e9Var.c;
        if (evaluate2 != (expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(this.d.evaluate(expressionResolver).doubleValue() == e9Var.d.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<w0> list18 = this.e;
        if (list18 != null) {
            if (list15 != null) {
                if (list18.size() == list15.size()) {
                    int i = 0;
                    for (Object obj : list18) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        List<w0> list19 = list15;
                        if (((w0) obj).a(list15.get(i), expressionResolver, expressionResolver2)) {
                            i = i2;
                            list15 = list19;
                        }
                    }
                    z = true;
                }
                z = false;
                break;
            }
            return false;
        }
        if (!z) {
            return false;
        }
        List<m1> list20 = this.f;
        if (list20 != null) {
            if (list14 != null) {
                if (list20.size() == list14.size()) {
                    int i3 = 0;
                    for (Object obj2 : list20) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((m1) obj2).a(list14.get(i3), expressionResolver, expressionResolver2)) {
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
        u1 u1Var2 = this.g;
        if (!(u1Var2 != null ? u1Var2.a(u1Var, expressionResolver, expressionResolver2) : u1Var == null)) {
            return false;
        }
        Expression<Long> expression5 = this.h;
        Long evaluate3 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<Long> expression6 = e9Var.h;
        if (!epx.f(evaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<v3> list21 = this.i;
        if (list21 != null) {
            if (list13 != null) {
                if (list21.size() == list13.size()) {
                    int i5 = 0;
                    for (Object obj3 : list21) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((v3) obj3).g(list13.get(i5), expressionResolver, expressionResolver2)) {
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
        List<zkn> list22 = this.j;
        if (list22 != null) {
            if (list12 != null) {
                if (list22.size() == list12.size()) {
                    int i7 = 0;
                    for (Object obj4 : list22) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((zkn) obj4).a(list12.get(i7))) {
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
        jln jlnVar2 = this.k;
        if (!(jlnVar2 != null ? jlnVar2.a(jlnVar, expressionResolver, expressionResolver2) : jlnVar == null)) {
            return false;
        }
        Expression<String> expression7 = this.l;
        String evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<String> expression8 = e9Var.l;
        if (!epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null) || this.m.evaluate(expressionResolver).longValue() != e9Var.m.evaluate(expressionResolver2).longValue() || this.n.evaluate(expressionResolver) != e9Var.n.evaluate(expressionResolver2)) {
            return false;
        }
        Expression<JSONObject> expression9 = this.o;
        JSONObject evaluate5 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
        Expression<JSONObject> expression10 = e9Var.o;
        if (!epx.f(evaluate5, expression10 != null ? expression10.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivFontWeight> expression11 = this.p;
        DivFontWeight evaluate6 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
        Expression<DivFontWeight> expression12 = e9Var.p;
        if (evaluate6 != (expression12 != null ? expression12.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression13 = this.q;
        Long evaluate7 = expression13 != null ? expression13.evaluate(expressionResolver) : null;
        Expression<Long> expression14 = e9Var.q;
        if (!epx.f(evaluate7, expression14 != null ? expression14.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<t4> list23 = this.r;
        if (list23 != null) {
            if (list9 != null) {
                if (list23.size() == list9.size()) {
                    int i9 = 0;
                    for (Object obj5 : list23) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((t4) obj5).a(list9.get(i9))) {
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
        if (!z5 || !this.s.a(e9Var.s, expressionResolver, expressionResolver2) || this.t.evaluate(expressionResolver).intValue() != e9Var.t.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        Expression<String> expression15 = this.u;
        String evaluate8 = expression15 != null ? expression15.evaluate(expressionResolver) : null;
        Expression<String> expression16 = e9Var.u;
        if (!epx.f(evaluate8, expression16 != null ? expression16.evaluate(expressionResolver2) : null) || !epx.f(this.v, e9Var.v)) {
            return false;
        }
        vmn vmnVar2 = this.w;
        if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
            return false;
        }
        if (!(this.x.evaluate(expressionResolver).doubleValue() == e9Var.x.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        Expression<Long> expression17 = this.y;
        Long evaluate9 = expression17 != null ? expression17.evaluate(expressionResolver) : null;
        Expression<Long> expression18 = e9Var.y;
        if (!epx.f(evaluate9, expression18 != null ? expression18.evaluate(expressionResolver2) : null)) {
            return false;
        }
        y3 y3Var3 = this.z;
        if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null)) {
            return false;
        }
        List<a> list24 = e9Var.A;
        List<a> list25 = this.A;
        if (list25.size() == list24.size()) {
            int i11 = 0;
            for (Object obj6 : list25) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    e43.t();
                    throw null;
                }
                a aVar = list24.get(i11);
                a aVar2 = (a) obj6;
                if (aVar == null) {
                    aVar2.getClass();
                } else {
                    Expression<String> expression19 = aVar2.a;
                    String evaluate10 = expression19 != null ? expression19.evaluate(expressionResolver) : null;
                    Expression<String> expression20 = aVar.a;
                    if (epx.f(evaluate10, expression20 != null ? expression20.evaluate(expressionResolver2) : null) && epx.f(aVar2.b.evaluate(expressionResolver), aVar.b.evaluate(expressionResolver2))) {
                        z7 = true;
                        if (!z7) {
                            i11 = i12;
                        }
                    }
                }
                z7 = false;
                if (!z7) {
                }
            }
            z6 = true;
            if (z6) {
                return false;
            }
            y3 y3Var4 = this.B;
            if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null)) {
                return false;
            }
            Expression<String> expression21 = this.C;
            String evaluate11 = expression21 != null ? expression21.evaluate(expressionResolver) : null;
            Expression<String> expression22 = e9Var.C;
            if (!epx.f(evaluate11, expression22 != null ? expression22.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<Long> expression23 = this.D;
            Long evaluate12 = expression23 != null ? expression23.evaluate(expressionResolver) : null;
            Expression<Long> expression24 = e9Var.D;
            if (!epx.f(evaluate12, expression24 != null ? expression24.evaluate(expressionResolver2) : null)) {
                return false;
            }
            List<DivAction> list26 = this.E;
            if (list26 != null) {
                if (list17 != null) {
                    if (list26.size() == list17.size()) {
                        int i13 = 0;
                        for (Object obj7 : list26) {
                            int i14 = i13 + 1;
                            if (i13 < 0) {
                                e43.t();
                                throw null;
                            }
                            List<DivAction> list27 = list17;
                            if (((DivAction) obj7).a(list27.get(i13), expressionResolver, expressionResolver2)) {
                                i13 = i14;
                                list17 = list27;
                            }
                        }
                        z8 = true;
                    }
                    z8 = false;
                    break;
                }
                return false;
            }
            if (!z8 || this.F.evaluate(expressionResolver).intValue() != e9Var.F.evaluate(expressionResolver2).intValue()) {
                return false;
            }
            List<DivTooltip> list28 = this.G;
            if (list28 != null) {
                if (list16 != null) {
                    if (list28.size() == list16.size()) {
                        int i15 = 0;
                        for (Object obj8 : list28) {
                            int i16 = i15 + 1;
                            if (i15 < 0) {
                                e43.t();
                                throw null;
                            }
                            List<DivTooltip> list29 = list16;
                            if (((DivTooltip) obj8).a(list29.get(i15), expressionResolver, expressionResolver2)) {
                                i15 = i16;
                                list16 = list29;
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
            hd hdVar2 = this.H;
            if (!(hdVar2 != null ? hdVar2.a(hdVar, expressionResolver, expressionResolver2) : hdVar == null)) {
                return false;
            }
            d2 d2Var2 = this.I;
            if (!(d2Var2 != null ? d2Var2.a(d2Var, expressionResolver, expressionResolver2) : d2Var == null)) {
                return false;
            }
            e1 e1Var3 = this.J;
            if (!(e1Var3 != null ? e1Var3.a(e1Var2, expressionResolver, expressionResolver2) : e1Var2 == null)) {
                return false;
            }
            e1 e1Var4 = this.K;
            if (!(e1Var4 != null ? e1Var4.a(e1Var, expressionResolver, expressionResolver2) : e1Var == null)) {
                return false;
            }
            List<DivTransitionTrigger> list30 = this.L;
            if (list30 != null) {
                if (list11 != null) {
                    if (list30.size() == list11.size()) {
                        int i17 = 0;
                        for (Object obj9 : list30) {
                            int i18 = i17 + 1;
                            if (i17 < 0) {
                                e43.t();
                                throw null;
                            }
                            List<DivTransitionTrigger> list31 = list11;
                            if (((DivTransitionTrigger) obj9) == list31.get(i17)) {
                                i17 = i18;
                                list11 = list31;
                            }
                        }
                        z10 = true;
                    }
                    z10 = false;
                    break;
                }
                return false;
            }
            if (!z10 || !epx.f(this.M, e9Var.M)) {
                return false;
            }
            List<DivTrigger> list32 = this.N;
            if (list32 != null) {
                if (list10 != null) {
                    if (list32.size() == list10.size()) {
                        int i19 = 0;
                        for (Object obj10 : list32) {
                            int i20 = i19 + 1;
                            if (i19 < 0) {
                                e43.t();
                                throw null;
                            }
                            List<DivTrigger> list33 = list10;
                            if (((DivTrigger) obj10).a(list33.get(i19), expressionResolver, expressionResolver2)) {
                                i19 = i20;
                                list10 = list33;
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
            List<md> list34 = this.O;
            if (list34 != null) {
                if (list8 != null) {
                    if (list34.size() == list8.size()) {
                        int i21 = 0;
                        for (Object obj11 : list34) {
                            int i22 = i21 + 1;
                            if (i21 < 0) {
                                e43.t();
                                throw null;
                            }
                            List<md> list35 = list8;
                            if (((md) obj11).a(list35.get(i21), expressionResolver, expressionResolver2)) {
                                i21 = i22;
                                list8 = list35;
                            }
                        }
                        z12 = true;
                    }
                    z12 = false;
                    break;
                }
                return false;
            }
            if (!z12 || this.P.evaluate(expressionResolver) != e9Var.P.evaluate(expressionResolver2)) {
                return false;
            }
            zd zdVar2 = this.Q;
            if (!(zdVar2 != null ? zdVar2.g(zdVar, expressionResolver, expressionResolver2) : zdVar == null)) {
                return false;
            }
            List<zd> list36 = this.R;
            if (list36 != null) {
                if (list7 != null) {
                    if (list36.size() == list7.size()) {
                        int i23 = 0;
                        for (Object obj12 : list36) {
                            int i24 = i23 + 1;
                            if (i23 < 0) {
                                e43.t();
                                throw null;
                            }
                            List<zd> list37 = list7;
                            if (((zd) obj12).g(list37.get(i23), expressionResolver, expressionResolver2)) {
                                i23 = i24;
                                list7 = list37;
                            }
                        }
                        z13 = true;
                    }
                    z13 = false;
                    break;
                }
                return false;
            }
            return z13 && this.S.a(e9Var.S, expressionResolver, expressionResolver2);
        }
        z6 = false;
        if (z6) {
        }
    }

    @Override // xsna.ikn
    public final Expression<Double> a() {
        return this.d;
    }

    @Override // xsna.ikn
    public final List<DivTooltip> b() {
        return this.G;
    }

    @Override // xsna.ikn
    public final hd c() {
        return this.H;
    }

    @Override // xsna.ikn
    public final u1 d() {
        return this.g;
    }

    @Override // xsna.ikn
    public final Expression<Long> e() {
        return this.h;
    }

    @Override // xsna.ikn
    public final List<md> f() {
        return this.O;
    }

    @Override // xsna.ikn
    public final y3 g() {
        return this.z;
    }

    @Override // xsna.ikn
    public final List<m1> getBackground() {
        return this.f;
    }

    @Override // xsna.ikn
    public final v9 getHeight() {
        return this.s;
    }

    @Override // xsna.ikn
    public final String getId() {
        return this.v;
    }

    @Override // xsna.ikn
    public final Expression<DivVisibility> getVisibility() {
        return this.P;
    }

    @Override // xsna.ikn
    public final v9 getWidth() {
        return this.S;
    }

    @Override // xsna.ikn
    public final Expression<Long> h() {
        return this.D;
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
        Integer num = this.T;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(e9.class).hashCode();
        int i10 = 0;
        DivAccessibility divAccessibility = this.a;
        int hash = hashCode + (divAccessibility != null ? divAccessibility.hash() : 0);
        Expression<DivAlignmentHorizontal> expression = this.b;
        int hashCode2 = hash + (expression != null ? expression.hashCode() : 0);
        Expression<DivAlignmentVertical> expression2 = this.c;
        int hashCode3 = this.d.hashCode() + hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        List<w0> list = this.e;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((w0) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i11 = hashCode3 + i;
        List<m1> list2 = this.f;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((m1) it2.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int i12 = i11 + i2;
        u1 u1Var = this.g;
        int hash2 = i12 + (u1Var != null ? u1Var.hash() : 0);
        Expression<Long> expression3 = this.h;
        int hashCode4 = hash2 + (expression3 != null ? expression3.hashCode() : 0);
        List<v3> list3 = this.i;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((v3) it3.next()).hash();
            }
        } else {
            i3 = 0;
        }
        int i13 = hashCode4 + i3;
        List<zkn> list4 = this.j;
        if (list4 != null) {
            Iterator<T> it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((zkn) it4.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i14 = i13 + i4;
        jln jlnVar = this.k;
        int hash3 = i14 + (jlnVar != null ? jlnVar.hash() : 0);
        Expression<String> expression4 = this.l;
        int hashCode5 = this.n.hashCode() + this.m.hashCode() + hash3 + (expression4 != null ? expression4.hashCode() : 0);
        Expression<JSONObject> expression5 = this.o;
        int hashCode6 = hashCode5 + (expression5 != null ? expression5.hashCode() : 0);
        Expression<DivFontWeight> expression6 = this.p;
        int hashCode7 = hashCode6 + (expression6 != null ? expression6.hashCode() : 0);
        Expression<Long> expression7 = this.q;
        int hashCode8 = hashCode7 + (expression7 != null ? expression7.hashCode() : 0);
        List<t4> list5 = this.r;
        if (list5 != null) {
            Iterator<T> it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((t4) it5.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int hashCode9 = this.t.hashCode() + this.s.hash() + hashCode8 + i5;
        Expression<String> expression8 = this.u;
        int hashCode10 = hashCode9 + (expression8 != null ? expression8.hashCode() : 0);
        String str = this.v;
        int hashCode11 = hashCode10 + (str != null ? str.hashCode() : 0);
        vmn vmnVar = this.w;
        int hashCode12 = this.x.hashCode() + hashCode11 + (vmnVar != null ? vmnVar.hash() : 0);
        Expression<Long> expression9 = this.y;
        int hashCode13 = hashCode12 + (expression9 != null ? expression9.hashCode() : 0);
        y3 y3Var = this.z;
        int hash4 = hashCode13 + (y3Var != null ? y3Var.hash() : 0);
        Iterator<T> it6 = this.A.iterator();
        int i15 = 0;
        while (it6.hasNext()) {
            i15 += ((a) it6.next()).hash();
        }
        int i16 = hash4 + i15;
        y3 y3Var2 = this.B;
        int hash5 = i16 + (y3Var2 != null ? y3Var2.hash() : 0);
        Expression<String> expression10 = this.C;
        int hashCode14 = hash5 + (expression10 != null ? expression10.hashCode() : 0);
        Expression<Long> expression11 = this.D;
        int hashCode15 = hashCode14 + (expression11 != null ? expression11.hashCode() : 0);
        List<DivAction> list6 = this.E;
        if (list6 != null) {
            Iterator<T> it7 = list6.iterator();
            i6 = 0;
            while (it7.hasNext()) {
                i6 += ((DivAction) it7.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int hashCode16 = this.F.hashCode() + hashCode15 + i6;
        List<DivTooltip> list7 = this.G;
        if (list7 != null) {
            Iterator<T> it8 = list7.iterator();
            i7 = 0;
            while (it8.hasNext()) {
                i7 += ((DivTooltip) it8.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int i17 = hashCode16 + i7;
        hd hdVar = this.H;
        int hash6 = i17 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.I;
        int hash7 = hash6 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.J;
        int hash8 = hash7 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.K;
        int hash9 = hash8 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list8 = this.L;
        int hashCode17 = this.M.hashCode() + hash9 + (list8 != null ? list8.hashCode() : 0);
        List<DivTrigger> list9 = this.N;
        if (list9 != null) {
            Iterator<T> it9 = list9.iterator();
            i8 = 0;
            while (it9.hasNext()) {
                i8 += ((DivTrigger) it9.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int i18 = hashCode17 + i8;
        List<md> list10 = this.O;
        if (list10 != null) {
            Iterator<T> it10 = list10.iterator();
            i9 = 0;
            while (it10.hasNext()) {
                i9 += ((md) it10.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int hashCode18 = this.P.hashCode() + i18 + i9;
        zd zdVar = this.Q;
        int hash10 = hashCode18 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list11 = this.R;
        if (list11 != null) {
            Iterator<T> it11 = list11.iterator();
            while (it11.hasNext()) {
                i10 += ((zd) it11.next()).hash();
            }
        }
        int hash11 = this.S.hash() + hash10 + i10;
        this.T = Integer.valueOf(hash11);
        return hash11;
    }

    @Override // xsna.ikn
    public final Expression<String> i() {
        return this.C;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentHorizontal> j() {
        return this.b;
    }

    @Override // xsna.ikn
    public final e1 k() {
        return this.K;
    }

    @Override // xsna.ikn
    public final List<DivTransitionTrigger> l() {
        return this.L;
    }

    @Override // xsna.ikn
    public final List<zkn> m() {
        return this.j;
    }

    @Override // xsna.ikn
    public final List<DivAction> n() {
        return this.E;
    }

    @Override // xsna.ikn
    public final vmn o() {
        return this.w;
    }

    @Override // xsna.ikn
    public final List<DivTrigger> p() {
        return this.N;
    }

    @Override // xsna.ikn
    public final e1 q() {
        return this.J;
    }

    @Override // xsna.ikn
    public final List<w0> r() {
        return this.e;
    }

    @Override // xsna.ikn
    public final List<zd> s() {
        return this.R;
    }

    @Override // xsna.ikn
    public final d2 t() {
        return this.I;
    }

    @Override // xsna.ikn
    public final List<v3> u() {
        return this.i;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentVertical> v() {
        return this.c;
    }

    @Override // xsna.ikn
    public final jln w() {
        return this.k;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((f9.f) BuiltInParserKt.getBuiltInParserComponent().A6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // xsna.ikn
    public final DivAccessibility x() {
        return this.a;
    }

    @Override // xsna.ikn
    public final y3 y() {
        return this.B;
    }

    @Override // xsna.ikn
    public final zd z() {
        return this.Q;
    }
}
