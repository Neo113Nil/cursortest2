package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.na;
import com.yandex.div2.v9;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.ikn;
import xsna.jln;
import xsna.krn;
import xsna.vmn;
import xsna.zkn;

/* compiled from: DivState.kt */
/* loaded from: classes8.dex */
public final class ma implements JSONSerializable, Hashable, ikn {
    public final y3 A;
    public final y3 B;
    public final List<DivAction> C;
    public final List<DivAction> D;
    public final Expression<String> E;
    public final Expression<Long> F;
    public final List<DivAction> G;
    public final String H;
    public final List<a> I;
    public final List<DivTooltip> J;
    public final hd K;
    public final Expression<DivTransitionSelector> L;
    public final d2 M;
    public final e1 N;
    public final e1 O;
    public final List<DivTransitionTrigger> P;
    public final List<DivTrigger> Q;
    public final List<md> R;
    public final Expression<DivVisibility> S;
    public final zd T;
    public final List<zd> U;
    public final v9 V;
    public Integer W;
    public Integer X;
    public final DivAccessibility a;
    public final DivAction b;
    public final DivAnimation c;
    public final List<DivAction> d;
    public final Expression<DivAlignmentHorizontal> e;
    public final Expression<DivAlignmentVertical> f;
    public final Expression<Double> g;
    public final List<w0> h;
    public final List<m1> i;
    public final u1 j;
    public final Expression<Boolean> k;
    public final Expression<Boolean> l;
    public final Expression<Long> m;
    public final Expression<String> n;
    public final List<v3> o;
    public final String p;
    public final List<DivAction> q;
    public final List<zkn> r;
    public final jln s;
    public final List<t4> t;
    public final v9 u;
    public final List<DivAction> v;
    public final List<DivAction> w;
    public final String x;
    public final vmn y;
    public final List<DivAction> z;

    /* compiled from: DivState.kt */
    public static final class a implements JSONSerializable, Hashable {
        public final DivAnimation a;
        public final DivAnimation b;
        public final com.yandex.div2.a c;
        public final String d;
        public final List<DivAction> e;
        public Integer f;

        public a(DivAnimation divAnimation, DivAnimation divAnimation2, com.yandex.div2.a aVar, String str, List<DivAction> list) {
            this.a = divAnimation;
            this.b = divAnimation2;
            this.c = aVar;
            this.d = str;
            this.e = list;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.f;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = fpf0.a(a.class).hashCode();
            int i = 0;
            DivAnimation divAnimation = this.a;
            int hash = hashCode + (divAnimation != null ? divAnimation.hash() : 0);
            DivAnimation divAnimation2 = this.b;
            int hash2 = hash + (divAnimation2 != null ? divAnimation2.hash() : 0);
            com.yandex.div2.a aVar = this.c;
            int hashCode2 = this.d.hashCode() + hash2 + (aVar != null ? aVar.hash() : 0);
            List<DivAction> list = this.e;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    i += ((DivAction) it.next()).hash();
                }
            }
            int i2 = hashCode2 + i;
            this.f = Integer.valueOf(i2);
            return i2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((oa) BuiltInParserKt.getBuiltInParserComponent().t7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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
        Boolean bool = Boolean.TRUE;
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, DivTransitionSelector.STATE_CHANGE, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ma(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list2, List<? extends m1> list3, u1 u1Var, Expression<Boolean> expression4, Expression<Boolean> expression5, Expression<Long> expression6, Expression<String> expression7, List<v3> list4, String str, List<DivAction> list5, List<zkn> list6, jln jlnVar, List<t4> list7, v9 v9Var, List<DivAction> list8, List<DivAction> list9, String str2, vmn vmnVar, List<DivAction> list10, y3 y3Var, y3 y3Var2, List<DivAction> list11, List<DivAction> list12, Expression<String> expression8, Expression<Long> expression9, List<DivAction> list13, String str3, List<a> list14, List<DivTooltip> list15, hd hdVar, Expression<DivTransitionSelector> expression10, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list16, List<DivTrigger> list17, List<? extends md> list18, Expression<DivVisibility> expression11, zd zdVar, List<zd> list19, v9 v9Var2) {
        this.a = divAccessibility;
        this.b = divAction;
        this.c = divAnimation;
        this.d = list;
        this.e = expression;
        this.f = expression2;
        this.g = expression3;
        this.h = list2;
        this.i = list3;
        this.j = u1Var;
        this.k = expression4;
        this.l = expression5;
        this.m = expression6;
        this.n = expression7;
        this.o = list4;
        this.p = str;
        this.q = list5;
        this.r = list6;
        this.s = jlnVar;
        this.t = list7;
        this.u = v9Var;
        this.v = list8;
        this.w = list9;
        this.x = str2;
        this.y = vmnVar;
        this.z = list10;
        this.A = y3Var;
        this.B = y3Var2;
        this.C = list11;
        this.D = list12;
        this.E = expression8;
        this.F = expression9;
        this.G = list13;
        this.H = str3;
        this.I = list14;
        this.J = list15;
        this.K = hdVar;
        this.L = expression10;
        this.M = d2Var;
        this.N = e1Var;
        this.O = e1Var2;
        this.P = list16;
        this.Q = list17;
        this.R = list18;
        this.S = expression11;
        this.T = zdVar;
        this.U = list19;
        this.V = v9Var2;
    }

    public static ma B(ma maVar, String str, String str2, List list, int i) {
        DivAccessibility divAccessibility;
        List<DivAction> list2;
        String str3;
        DivAccessibility divAccessibility2 = maVar.a;
        DivAction divAction = maVar.b;
        DivAnimation divAnimation = maVar.c;
        List<DivAction> list3 = maVar.d;
        Expression<DivAlignmentHorizontal> expression = maVar.e;
        Expression<DivAlignmentVertical> expression2 = maVar.f;
        Expression<Double> expression3 = maVar.g;
        List<w0> list4 = maVar.h;
        List<m1> list5 = maVar.i;
        u1 u1Var = maVar.j;
        Expression<Boolean> expression4 = maVar.k;
        Expression<Boolean> expression5 = maVar.l;
        Expression<Long> expression6 = maVar.m;
        Expression<String> expression7 = maVar.n;
        List<v3> list6 = maVar.o;
        if ((i & 32768) != 0) {
            divAccessibility = divAccessibility2;
            str = maVar.p;
        } else {
            divAccessibility = divAccessibility2;
        }
        List<DivAction> list7 = maVar.q;
        List<zkn> list8 = maVar.r;
        jln jlnVar = maVar.s;
        List<t4> list9 = maVar.t;
        v9 v9Var = maVar.u;
        List<DivAction> list10 = maVar.v;
        List<DivAction> list11 = maVar.w;
        if ((i & 8388608) != 0) {
            list2 = list11;
            str3 = maVar.x;
        } else {
            list2 = list11;
            str3 = str2;
        }
        vmn vmnVar = maVar.y;
        List<DivAction> list12 = maVar.z;
        y3 y3Var = maVar.A;
        y3 y3Var2 = maVar.B;
        List<DivAction> list13 = maVar.C;
        List<DivAction> list14 = maVar.D;
        Expression<String> expression8 = maVar.E;
        Expression<Long> expression9 = maVar.F;
        List<DivAction> list15 = maVar.G;
        String str4 = maVar.H;
        List<DivTooltip> list16 = maVar.J;
        hd hdVar = maVar.K;
        Expression<DivTransitionSelector> expression10 = maVar.L;
        d2 d2Var = maVar.M;
        e1 e1Var = maVar.N;
        e1 e1Var2 = maVar.O;
        List<DivTransitionTrigger> list17 = maVar.P;
        List<DivTrigger> list18 = maVar.Q;
        List<md> list19 = maVar.R;
        Expression<DivVisibility> expression11 = maVar.S;
        zd zdVar = maVar.T;
        List<zd> list20 = maVar.U;
        v9 v9Var2 = maVar.V;
        maVar.getClass();
        return new ma(divAccessibility, divAction, divAnimation, list3, expression, expression2, expression3, list4, list5, u1Var, expression4, expression5, expression6, expression7, list6, str, list7, list8, jlnVar, list9, v9Var, list10, list2, str3, vmnVar, list12, y3Var, y3Var2, list13, list14, expression8, expression9, list15, str4, list, list16, hdVar, expression10, d2Var, e1Var, e1Var2, list17, list18, list19, expression11, zdVar, list20, v9Var2);
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:496:0x08cf, code lost:
    
        if (r17 == null) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0861, code lost:
    
        if (r19 == null) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0814, code lost:
    
        if (r20 == null) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x07c7, code lost:
    
        if (r21 == null) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0719, code lost:
    
        if (r26 == null) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x06bb, code lost:
    
        if (r9 == null) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x05ea, code lost:
    
        if (r27 == null) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x055d, code lost:
    
        if (r28 == null) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0510, code lost:
    
        if (r29 == null) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x049b, code lost:
    
        if (r32 == null) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0430, code lost:
    
        if (r34 == null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x03e3, code lost:
    
        if (r36 == null) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x038c, code lost:
    
        if (r12 == null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0333, code lost:
    
        if (r14 == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x02ec, code lost:
    
        if (r15 == null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x029b, code lost:
    
        if (r4 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x01ce, code lost:
    
        if (r6 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x0187, code lost:
    
        if (r7 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x00e5, code lost:
    
        if (r8 == null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:539:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:549:0x06ca A[LOOP:18: B:541:0x0617->B:549:0x06ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x060b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(ma maVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (maVar == null) {
            return false;
        }
        List<zd> list = maVar.U;
        zd zdVar = maVar.T;
        List<md> list2 = maVar.R;
        List<DivTrigger> list3 = maVar.Q;
        List<DivTransitionTrigger> list4 = maVar.P;
        e1 e1Var = maVar.O;
        e1 e1Var2 = maVar.N;
        d2 d2Var = maVar.M;
        hd hdVar = maVar.K;
        List<DivTooltip> list5 = maVar.J;
        List<DivAction> list6 = maVar.G;
        List<DivAction> list7 = maVar.D;
        List<zd> list8 = list;
        List<DivAction> list9 = maVar.C;
        y3 y3Var = maVar.B;
        List<md> list10 = list2;
        y3 y3Var2 = maVar.A;
        List<DivTrigger> list11 = list3;
        List<DivAction> list12 = maVar.z;
        List<DivTransitionTrigger> list13 = list4;
        vmn vmnVar = maVar.y;
        List<DivAction> list14 = maVar.w;
        List<DivAction> list15 = maVar.v;
        List<t4> list16 = maVar.t;
        jln jlnVar = maVar.s;
        List<DivTooltip> list17 = list5;
        List<zkn> list18 = maVar.r;
        List<DivAction> list19 = list6;
        List<DivAction> list20 = maVar.q;
        List<DivAction> list21 = list7;
        List<v3> list22 = maVar.o;
        List<DivAction> list23 = list9;
        u1 u1Var = maVar.j;
        List<m1> list24 = maVar.i;
        List<w0> list25 = maVar.h;
        List<DivAction> list26 = list12;
        List<DivAction> list27 = maVar.d;
        DivAction divAction = maVar.b;
        List<DivAction> list28 = list14;
        DivAccessibility divAccessibility = maVar.a;
        List<DivAction> list29 = list15;
        DivAccessibility divAccessibility2 = this.a;
        if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
            return false;
        }
        DivAction divAction2 = this.b;
        if (!(divAction2 != null ? divAction2.a(divAction, expressionResolver, expressionResolver2) : divAction == null) || !this.c.a(maVar.c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list30 = this.d;
        if (list30 != null) {
            if (list27 != null) {
                th = null;
                if (list30.size() == list27.size()) {
                    int i = 0;
                    for (Object obj : list30) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((DivAction) obj).a(list27.get(i), expressionResolver, expressionResolver2)) {
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
        Expression<DivAlignmentHorizontal> expression2 = maVar.e;
        if (obj2 != (expression2 != null ? (DivAlignmentHorizontal) expression2.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.f;
        Object obj3 = expression3 != null ? (DivAlignmentVertical) expression3.evaluate(expressionResolver) : th;
        Expression<DivAlignmentVertical> expression4 = maVar.f;
        if (obj3 != (expression4 != null ? (DivAlignmentVertical) expression4.evaluate(expressionResolver2) : th)) {
            return false;
        }
        if (!(this.g.evaluate(expressionResolver).doubleValue() == maVar.g.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<w0> list31 = this.h;
        if (list31 != null) {
            if (list25 != null) {
                if (list31.size() == list25.size()) {
                    int i3 = 0;
                    for (Object obj4 : list31) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((w0) obj4).a(list25.get(i3), expressionResolver, expressionResolver2)) {
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
        List<m1> list32 = this.i;
        if (list32 != null) {
            if (list24 != null) {
                if (list32.size() == list24.size()) {
                    int i5 = 0;
                    for (Object obj5 : list32) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((m1) obj5).a(list24.get(i5), expressionResolver, expressionResolver2)) {
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
        u1 u1Var2 = this.j;
        if (!(u1Var2 != null ? u1Var2.a(u1Var, expressionResolver, expressionResolver2) : u1Var == null) || this.k.evaluate(expressionResolver).booleanValue() != maVar.k.evaluate(expressionResolver2).booleanValue() || this.l.evaluate(expressionResolver).booleanValue() != maVar.l.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expression5 = this.m;
        Long evaluate = expression5 != null ? expression5.evaluate(expressionResolver) : th;
        Expression<Long> expression6 = maVar.m;
        if (!epx.f(evaluate, expression6 != null ? expression6.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<String> expression7 = this.n;
        String evaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : th;
        Expression<String> expression8 = maVar.n;
        if (!epx.f(evaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : th)) {
            return false;
        }
        List<v3> list33 = this.o;
        if (list33 != null) {
            if (list22 != null) {
                if (list33.size() == list22.size()) {
                    int i7 = 0;
                    for (Object obj6 : list33) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((v3) obj6).g(list22.get(i7), expressionResolver, expressionResolver2)) {
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
        if (!z4 || !epx.f(this.p, maVar.p)) {
            return false;
        }
        List<DivAction> list34 = this.q;
        if (list34 != null) {
            if (list20 != null) {
                if (list34.size() == list20.size()) {
                    int i9 = 0;
                    for (Object obj7 : list34) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((DivAction) obj7).a(list20.get(i9), expressionResolver, expressionResolver2)) {
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
        List<zkn> list35 = this.r;
        if (list35 != null) {
            if (list18 != null) {
                if (list35.size() == list18.size()) {
                    int i11 = 0;
                    for (Object obj8 : list35) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((zkn) obj8).a(list18.get(i11))) {
                            i11 = i12;
                        }
                    }
                    z6 = true;
                }
                z6 = false;
                break;
            }
            return false;
        }
        if (!z6) {
            return false;
        }
        jln jlnVar2 = this.s;
        if (!(jlnVar2 != null ? jlnVar2.a(jlnVar, expressionResolver, expressionResolver2) : jlnVar == null)) {
            return false;
        }
        List<t4> list36 = this.t;
        if (list36 != null) {
            if (list16 != null) {
                if (list36.size() == list16.size()) {
                    int i13 = 0;
                    for (Object obj9 : list36) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((t4) obj9).a(list16.get(i13))) {
                            i13 = i14;
                        }
                    }
                    z7 = true;
                }
                z7 = false;
                break;
            }
            return false;
        }
        if (!z7 || !this.u.a(maVar.u, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list37 = this.v;
        if (list37 != null) {
            if (list29 != null) {
                if (list37.size() == list29.size()) {
                    int i15 = 0;
                    for (Object obj10 : list37) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list38 = list29;
                        if (((DivAction) obj10).a(list38.get(i15), expressionResolver, expressionResolver2)) {
                            i15 = i16;
                            list29 = list38;
                        }
                    }
                    z8 = true;
                }
                z8 = false;
                break;
            }
            return false;
        }
        if (!z8) {
            return false;
        }
        List<DivAction> list39 = this.w;
        if (list39 != null) {
            if (list28 != null) {
                if (list39.size() == list28.size()) {
                    int i17 = 0;
                    for (Object obj11 : list39) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list40 = list28;
                        if (((DivAction) obj11).a(list40.get(i17), expressionResolver, expressionResolver2)) {
                            i17 = i18;
                            list28 = list40;
                        }
                    }
                    z9 = true;
                }
                z9 = false;
                break;
            }
            return false;
        }
        if (!z9 || !epx.f(this.x, maVar.x)) {
            return false;
        }
        vmn vmnVar2 = this.y;
        if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
            return false;
        }
        List<DivAction> list41 = this.z;
        if (list41 != null) {
            if (list26 != null) {
                if (list41.size() == list26.size()) {
                    int i19 = 0;
                    for (Object obj12 : list41) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list42 = list26;
                        if (((DivAction) obj12).a(list42.get(i19), expressionResolver, expressionResolver2)) {
                            i19 = i20;
                            list26 = list42;
                        }
                    }
                    z10 = true;
                }
                z10 = false;
                break;
            }
            return false;
        }
        if (!z10) {
            return false;
        }
        y3 y3Var3 = this.A;
        if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null)) {
            return false;
        }
        y3 y3Var4 = this.B;
        if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null)) {
            return false;
        }
        List<DivAction> list43 = this.C;
        if (list43 != null) {
            if (list23 != null) {
                if (list43.size() == list23.size()) {
                    int i21 = 0;
                    for (Object obj13 : list43) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list44 = list23;
                        if (((DivAction) obj13).a(list44.get(i21), expressionResolver, expressionResolver2)) {
                            i21 = i22;
                            list23 = list44;
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
        List<DivAction> list45 = this.D;
        if (list45 != null) {
            if (list21 != null) {
                if (list45.size() == list21.size()) {
                    int i23 = 0;
                    for (Object obj14 : list45) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list46 = list21;
                        if (((DivAction) obj14).a(list46.get(i23), expressionResolver, expressionResolver2)) {
                            i23 = i24;
                            list21 = list46;
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
        Expression<String> expression9 = this.E;
        String evaluate3 = expression9 != null ? expression9.evaluate(expressionResolver) : th;
        Expression<String> expression10 = maVar.E;
        if (!epx.f(evaluate3, expression10 != null ? expression10.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<Long> expression11 = this.F;
        Long evaluate4 = expression11 != null ? expression11.evaluate(expressionResolver) : th;
        Expression<Long> expression12 = maVar.F;
        if (!epx.f(evaluate4, expression12 != null ? expression12.evaluate(expressionResolver2) : th)) {
            return false;
        }
        List<DivAction> list47 = this.G;
        if (list47 != null) {
            if (list19 != null) {
                if (list47.size() == list19.size()) {
                    int i25 = 0;
                    for (Object obj15 : list47) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list48 = list19;
                        if (((DivAction) obj15).a(list48.get(i25), expressionResolver, expressionResolver2)) {
                            i25 = i26;
                            list19 = list48;
                        }
                    }
                    z13 = true;
                }
                z13 = false;
                break;
            }
            return false;
        }
        if (!z13 || !epx.f(this.H, maVar.H)) {
            return false;
        }
        List<a> list49 = maVar.I;
        List<a> list50 = this.I;
        if (list50.size() == list49.size()) {
            int i27 = 0;
            for (Object obj16 : list50) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    e43.t();
                    throw th;
                }
                a aVar = list49.get(i27);
                a aVar2 = (a) obj16;
                aVar2.getClass();
                if (aVar != null) {
                    List<DivAction> list51 = aVar.e;
                    com.yandex.div2.a aVar3 = aVar.c;
                    DivAnimation divAnimation = aVar.b;
                    DivAnimation divAnimation2 = aVar.a;
                    DivAnimation divAnimation3 = aVar2.a;
                    if (divAnimation3 != null ? divAnimation3.a(divAnimation2, expressionResolver, expressionResolver2) : divAnimation2 == null) {
                        DivAnimation divAnimation4 = aVar2.b;
                        if (divAnimation4 != null ? divAnimation4.a(divAnimation, expressionResolver, expressionResolver2) : divAnimation == null) {
                            com.yandex.div2.a aVar4 = aVar2.c;
                            if ((aVar4 != null ? aVar4.a(aVar3, expressionResolver, expressionResolver2) : aVar3 == null) && epx.f(aVar2.d, aVar.d)) {
                                List<DivAction> list52 = aVar2.e;
                                if (list52 != null) {
                                    if (list51 != null) {
                                        if (list52.size() == list51.size()) {
                                            int i29 = 0;
                                            for (Object obj17 : list52) {
                                                int i30 = i29 + 1;
                                                if (i29 < 0) {
                                                    e43.t();
                                                    throw th;
                                                }
                                                if (((DivAction) obj17).a(list51.get(i29), expressionResolver, expressionResolver2)) {
                                                    i29 = i30;
                                                }
                                            }
                                            z15 = true;
                                        }
                                        z15 = false;
                                        break;
                                    }
                                }
                                if (z15) {
                                    z16 = true;
                                    if (!z16) {
                                        i27 = i28;
                                    }
                                }
                            }
                        }
                    }
                }
                z16 = false;
                if (!z16) {
                }
            }
            z14 = true;
            if (z14) {
                return false;
            }
            List<DivTooltip> list53 = this.J;
            if (list53 != null) {
                if (list17 != null) {
                    if (list53.size() == list17.size()) {
                        int i31 = 0;
                        for (Object obj18 : list53) {
                            int i32 = i31 + 1;
                            if (i31 < 0) {
                                e43.t();
                                throw th;
                            }
                            List<DivTooltip> list54 = list17;
                            if (((DivTooltip) obj18).a(list54.get(i31), expressionResolver, expressionResolver2)) {
                                i31 = i32;
                                list17 = list54;
                            }
                        }
                        z17 = true;
                    }
                    z17 = false;
                    break;
                }
                return false;
            }
            if (!z17) {
                return false;
            }
            hd hdVar2 = this.K;
            if (!(hdVar2 != null ? hdVar2.a(hdVar, expressionResolver, expressionResolver2) : hdVar == null) || this.L.evaluate(expressionResolver) != maVar.L.evaluate(expressionResolver2)) {
                return false;
            }
            d2 d2Var2 = this.M;
            if (!(d2Var2 != null ? d2Var2.a(d2Var, expressionResolver, expressionResolver2) : d2Var == null)) {
                return false;
            }
            e1 e1Var3 = this.N;
            if (!(e1Var3 != null ? e1Var3.a(e1Var2, expressionResolver, expressionResolver2) : e1Var2 == null)) {
                return false;
            }
            e1 e1Var4 = this.O;
            if (!(e1Var4 != null ? e1Var4.a(e1Var, expressionResolver, expressionResolver2) : e1Var == null)) {
                return false;
            }
            List<DivTransitionTrigger> list55 = this.P;
            if (list55 != null) {
                if (list13 != null) {
                    if (list55.size() == list13.size()) {
                        int i33 = 0;
                        for (Object obj19 : list55) {
                            int i34 = i33 + 1;
                            if (i33 < 0) {
                                e43.t();
                                throw th;
                            }
                            List<DivTransitionTrigger> list56 = list13;
                            if (((DivTransitionTrigger) obj19) == list56.get(i33)) {
                                i33 = i34;
                                list13 = list56;
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
            List<DivTrigger> list57 = this.Q;
            if (list57 != null) {
                if (list11 != null) {
                    if (list57.size() == list11.size()) {
                        int i35 = 0;
                        for (Object obj20 : list57) {
                            int i36 = i35 + 1;
                            if (i35 < 0) {
                                e43.t();
                                throw th;
                            }
                            List<DivTrigger> list58 = list11;
                            if (((DivTrigger) obj20).a(list58.get(i35), expressionResolver, expressionResolver2)) {
                                i35 = i36;
                                list11 = list58;
                            }
                        }
                        z19 = true;
                    }
                    z19 = false;
                    break;
                }
                return false;
            }
            if (!z19) {
                return false;
            }
            List<md> list59 = this.R;
            if (list59 != null) {
                if (list10 != null) {
                    if (list59.size() == list10.size()) {
                        int i37 = 0;
                        for (Object obj21 : list59) {
                            int i38 = i37 + 1;
                            if (i37 < 0) {
                                e43.t();
                                throw th;
                            }
                            List<md> list60 = list10;
                            if (((md) obj21).a(list60.get(i37), expressionResolver, expressionResolver2)) {
                                i37 = i38;
                                list10 = list60;
                            }
                        }
                        z20 = true;
                    }
                    z20 = false;
                    break;
                }
                return false;
            }
            if (!z20 || this.S.evaluate(expressionResolver) != maVar.S.evaluate(expressionResolver2)) {
                return false;
            }
            zd zdVar2 = this.T;
            if (!(zdVar2 != null ? zdVar2.g(zdVar, expressionResolver, expressionResolver2) : zdVar == null)) {
                return false;
            }
            List<zd> list61 = this.U;
            if (list61 != null) {
                if (list8 != null) {
                    if (list61.size() == list8.size()) {
                        int i39 = 0;
                        for (Object obj22 : list61) {
                            int i40 = i39 + 1;
                            if (i39 < 0) {
                                e43.t();
                                throw th;
                            }
                            List<zd> list62 = list8;
                            if (((zd) obj22).g(list62.get(i39), expressionResolver, expressionResolver2)) {
                                i39 = i40;
                                list8 = list62;
                            }
                        }
                        z21 = true;
                    }
                    z21 = false;
                    break;
                }
                return false;
            }
            return z21 && this.V.a(maVar.V, expressionResolver, expressionResolver2);
        }
        z14 = false;
        if (z14) {
        }
    }

    @Override // xsna.ikn
    public final Expression<Double> a() {
        return this.g;
    }

    @Override // xsna.ikn
    public final List<DivTooltip> b() {
        return this.J;
    }

    @Override // xsna.ikn
    public final hd c() {
        return this.K;
    }

    @Override // xsna.ikn
    public final u1 d() {
        return this.j;
    }

    @Override // xsna.ikn
    public final Expression<Long> e() {
        return this.m;
    }

    @Override // xsna.ikn
    public final List<md> f() {
        return this.R;
    }

    @Override // xsna.ikn
    public final y3 g() {
        return this.A;
    }

    @Override // xsna.ikn
    public final List<m1> getBackground() {
        return this.i;
    }

    @Override // xsna.ikn
    public final v9 getHeight() {
        return this.u;
    }

    @Override // xsna.ikn
    public final String getId() {
        return this.x;
    }

    @Override // xsna.ikn
    public final Expression<DivVisibility> getVisibility() {
        return this.S;
    }

    @Override // xsna.ikn
    public final v9 getWidth() {
        return this.V;
    }

    @Override // xsna.ikn
    public final Expression<Long> h() {
        return this.F;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.X;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        Iterator<T> it = this.I.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((a) it.next()).hash();
        }
        int i2 = propertiesHash + i;
        this.X = Integer.valueOf(i2);
        return i2;
    }

    @Override // xsna.ikn
    public final Expression<String> i() {
        return this.E;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentHorizontal> j() {
        return this.e;
    }

    @Override // xsna.ikn
    public final e1 k() {
        return this.O;
    }

    @Override // xsna.ikn
    public final List<DivTransitionTrigger> l() {
        return this.P;
    }

    @Override // xsna.ikn
    public final List<zkn> m() {
        return this.r;
    }

    @Override // xsna.ikn
    public final List<DivAction> n() {
        return this.G;
    }

    @Override // xsna.ikn
    public final vmn o() {
        return this.y;
    }

    @Override // xsna.ikn
    public final List<DivTrigger> p() {
        return this.Q;
    }

    @Override // com.yandex.div.data.Hashable
    public final int propertiesHash() {
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
        Integer num = this.W;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(ma.class).hashCode();
        int i17 = 0;
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
        int i18 = hash2 + i;
        Expression<DivAlignmentHorizontal> expression = this.e;
        int hashCode2 = i18 + (expression != null ? expression.hashCode() : 0);
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
        int i19 = hashCode3 + i2;
        List<m1> list3 = this.i;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((m1) it3.next()).hash();
            }
        } else {
            i3 = 0;
        }
        int i20 = i19 + i3;
        u1 u1Var = this.j;
        int hashCode4 = this.l.hashCode() + this.k.hashCode() + i20 + (u1Var != null ? u1Var.hash() : 0);
        Expression<Long> expression3 = this.m;
        int hashCode5 = hashCode4 + (expression3 != null ? expression3.hashCode() : 0);
        Expression<String> expression4 = this.n;
        int hashCode6 = hashCode5 + (expression4 != null ? expression4.hashCode() : 0);
        List<v3> list4 = this.o;
        if (list4 != null) {
            Iterator<T> it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((v3) it4.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i21 = hashCode6 + i4;
        String str = this.p;
        int hashCode7 = i21 + (str != null ? str.hashCode() : 0);
        List<DivAction> list5 = this.q;
        if (list5 != null) {
            Iterator<T> it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((DivAction) it5.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int i22 = hashCode7 + i5;
        List<zkn> list6 = this.r;
        if (list6 != null) {
            Iterator<T> it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((zkn) it6.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i23 = i22 + i6;
        jln jlnVar = this.s;
        int hash3 = i23 + (jlnVar != null ? jlnVar.hash() : 0);
        List<t4> list7 = this.t;
        if (list7 != null) {
            Iterator<T> it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((t4) it7.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int hash4 = this.u.hash() + hash3 + i7;
        List<DivAction> list8 = this.v;
        if (list8 != null) {
            Iterator<T> it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((DivAction) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int i24 = hash4 + i8;
        List<DivAction> list9 = this.w;
        if (list9 != null) {
            Iterator<T> it9 = list9.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((DivAction) it9.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int i25 = i24 + i9;
        String str2 = this.x;
        int hashCode8 = i25 + (str2 != null ? str2.hashCode() : 0);
        vmn vmnVar = this.y;
        int hash5 = hashCode8 + (vmnVar != null ? vmnVar.hash() : 0);
        List<DivAction> list10 = this.z;
        if (list10 != null) {
            Iterator<T> it10 = list10.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((DivAction) it10.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i26 = hash5 + i10;
        y3 y3Var = this.A;
        int hash6 = i26 + (y3Var != null ? y3Var.hash() : 0);
        y3 y3Var2 = this.B;
        int hash7 = hash6 + (y3Var2 != null ? y3Var2.hash() : 0);
        List<DivAction> list11 = this.C;
        if (list11 != null) {
            Iterator<T> it11 = list11.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((DivAction) it11.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i27 = hash7 + i11;
        List<DivAction> list12 = this.D;
        if (list12 != null) {
            Iterator<T> it12 = list12.iterator();
            i12 = 0;
            while (it12.hasNext()) {
                i12 += ((DivAction) it12.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int i28 = i27 + i12;
        Expression<String> expression5 = this.E;
        int hashCode9 = i28 + (expression5 != null ? expression5.hashCode() : 0);
        Expression<Long> expression6 = this.F;
        int hashCode10 = hashCode9 + (expression6 != null ? expression6.hashCode() : 0);
        List<DivAction> list13 = this.G;
        if (list13 != null) {
            Iterator<T> it13 = list13.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((DivAction) it13.next()).hash();
            }
        } else {
            i13 = 0;
        }
        int i29 = hashCode10 + i13;
        String str3 = this.H;
        int hashCode11 = i29 + (str3 != null ? str3.hashCode() : 0);
        List<DivTooltip> list14 = this.J;
        if (list14 != null) {
            Iterator<T> it14 = list14.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((DivTooltip) it14.next()).hash();
            }
        } else {
            i14 = 0;
        }
        int i30 = hashCode11 + i14;
        hd hdVar = this.K;
        int hashCode12 = this.L.hashCode() + i30 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.M;
        int hash8 = hashCode12 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.N;
        int hash9 = hash8 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.O;
        int hash10 = hash9 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list15 = this.P;
        int hashCode13 = hash10 + (list15 != null ? list15.hashCode() : 0);
        List<DivTrigger> list16 = this.Q;
        if (list16 != null) {
            Iterator<T> it15 = list16.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((DivTrigger) it15.next()).hash();
            }
        } else {
            i15 = 0;
        }
        int i31 = hashCode13 + i15;
        List<md> list17 = this.R;
        if (list17 != null) {
            Iterator<T> it16 = list17.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((md) it16.next()).hash();
            }
        } else {
            i16 = 0;
        }
        int hashCode14 = this.S.hashCode() + i31 + i16;
        zd zdVar = this.T;
        int hash11 = hashCode14 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list18 = this.U;
        if (list18 != null) {
            Iterator<T> it17 = list18.iterator();
            while (it17.hasNext()) {
                i17 += ((zd) it17.next()).hash();
            }
        }
        int hash12 = this.V.hash() + hash11 + i17;
        this.W = Integer.valueOf(hash12);
        return hash12;
    }

    @Override // xsna.ikn
    public final e1 q() {
        return this.N;
    }

    @Override // xsna.ikn
    public final List<w0> r() {
        return this.h;
    }

    @Override // xsna.ikn
    public final List<zd> s() {
        return this.U;
    }

    @Override // xsna.ikn
    public final d2 t() {
        return this.M;
    }

    @Override // xsna.ikn
    public final List<v3> u() {
        return this.o;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentVertical> v() {
        return this.f;
    }

    @Override // xsna.ikn
    public final jln w() {
        return this.s;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((na.e) BuiltInParserKt.getBuiltInParserComponent().q7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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
        return this.T;
    }
}
