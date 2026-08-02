package com.yandex.div2;

import com.ironsource.X3;
import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.k9;
import com.yandex.div2.l9;
import com.yandex.div2.v9;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.ikn;
import xsna.izs;
import xsna.jln;
import xsna.krn;
import xsna.vmn;
import xsna.zkn;

/* compiled from: DivSeparator.kt */
/* loaded from: classes8.dex */
public final class DivSeparator implements JSONSerializable, Hashable, ikn {
    public static final DivAnimation S;
    public static final Expression<Double> T;
    public static final Expression<Boolean> U;
    public static final v9.c V;
    public static final Expression<DivVisibility> W;
    public static final v9.b X;
    public final List<DivAction> A;
    public final List<DivAction> B;
    public final Expression<String> C;
    public final Expression<Long> D;
    public final List<DivAction> E;
    public final List<DivTooltip> F;
    public final hd G;
    public final d2 H;
    public final e1 I;
    public final e1 J;
    public final List<DivTransitionTrigger> K;
    public final List<DivTrigger> L;
    public final List<md> M;
    public final Expression<DivVisibility> N;
    public final zd O;
    public final List<zd> P;
    public final v9 Q;
    public Integer R;
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
    public final Expression<Long> l;
    public final DelimiterStyle m;
    public final List<v3> n;
    public final List<DivAction> o;
    public final List<zkn> p;
    public final jln q;
    public final List<t4> r;
    public final v9 s;
    public final List<DivAction> t;
    public final List<DivAction> u;
    public final String v;
    public final vmn w;
    public final List<DivAction> x;
    public final y3 y;
    public final y3 z;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression constant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression constant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression constant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        S = new DivAnimation(constant$default, constant$default2, constant$default3, Expression.Companion.constant$default(companion, valueOf, null, 2, null));
        T = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        U = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        V = new v9.c(new krn(null, null, null));
        W = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        X = new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivSeparator(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list2, List<? extends m1> list3, u1 u1Var, Expression<Boolean> expression4, Expression<Long> expression5, DelimiterStyle delimiterStyle, List<v3> list4, List<DivAction> list5, List<zkn> list6, jln jlnVar, List<t4> list7, v9 v9Var, List<DivAction> list8, List<DivAction> list9, String str, vmn vmnVar, List<DivAction> list10, y3 y3Var, y3 y3Var2, List<DivAction> list11, List<DivAction> list12, Expression<String> expression6, Expression<Long> expression7, List<DivAction> list13, List<DivTooltip> list14, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list15, List<DivTrigger> list16, List<? extends md> list17, Expression<DivVisibility> expression8, zd zdVar, List<zd> list18, v9 v9Var2) {
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
        this.m = delimiterStyle;
        this.n = list4;
        this.o = list5;
        this.p = list6;
        this.q = jlnVar;
        this.r = list7;
        this.s = v9Var;
        this.t = list8;
        this.u = list9;
        this.v = str;
        this.w = vmnVar;
        this.x = list10;
        this.y = y3Var;
        this.z = y3Var2;
        this.A = list11;
        this.B = list12;
        this.C = expression6;
        this.D = expression7;
        this.E = list13;
        this.F = list14;
        this.G = hdVar;
        this.H = d2Var;
        this.I = e1Var;
        this.J = e1Var2;
        this.K = list15;
        this.L = list16;
        this.M = list17;
        this.N = expression8;
        this.O = zdVar;
        this.P = list18;
        this.Q = v9Var2;
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:485:0x07de, code lost:
    
        if (r17 == null) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0770, code lost:
    
        if (r19 == null) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0723, code lost:
    
        if (r20 == null) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x06d6, code lost:
    
        if (r21 == null) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0636, code lost:
    
        if (r26 == null) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x05e9, code lost:
    
        if (r27 == null) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x055c, code lost:
    
        if (r28 == null) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x050f, code lost:
    
        if (r29 == null) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x049a, code lost:
    
        if (r32 == null) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x042f, code lost:
    
        if (r34 == null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x03e2, code lost:
    
        if (r35 == null) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x038b, code lost:
    
        if (r37 == null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x032c, code lost:
    
        if (r14 == null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x02e5, code lost:
    
        if (r15 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x029e, code lost:
    
        if (r4 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x01d2, code lost:
    
        if (r7 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x018b, code lost:
    
        if (r8 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x00e9, code lost:
    
        if (r9 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(DivSeparator divSeparator, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (divSeparator == null) {
            return false;
        }
        List<zd> list = divSeparator.P;
        zd zdVar = divSeparator.O;
        List<md> list2 = divSeparator.M;
        List<DivTrigger> list3 = divSeparator.L;
        List<DivTransitionTrigger> list4 = divSeparator.K;
        e1 e1Var = divSeparator.J;
        e1 e1Var2 = divSeparator.I;
        d2 d2Var = divSeparator.H;
        hd hdVar = divSeparator.G;
        List<DivTooltip> list5 = divSeparator.F;
        List<DivAction> list6 = divSeparator.E;
        List<DivAction> list7 = divSeparator.B;
        List<zd> list8 = list;
        List<DivAction> list9 = divSeparator.A;
        y3 y3Var = divSeparator.z;
        List<md> list10 = list2;
        y3 y3Var2 = divSeparator.y;
        List<DivTrigger> list11 = list3;
        List<DivAction> list12 = divSeparator.x;
        List<DivTransitionTrigger> list13 = list4;
        vmn vmnVar = divSeparator.w;
        List<DivAction> list14 = divSeparator.u;
        List<DivAction> list15 = divSeparator.t;
        List<t4> list16 = divSeparator.r;
        jln jlnVar = divSeparator.q;
        List<DivTooltip> list17 = list5;
        List<zkn> list18 = divSeparator.p;
        List<DivAction> list19 = list6;
        List<DivAction> list20 = divSeparator.o;
        List<DivAction> list21 = list7;
        List<v3> list22 = divSeparator.n;
        List<DivAction> list23 = list9;
        DelimiterStyle delimiterStyle = divSeparator.m;
        u1 u1Var = divSeparator.j;
        List<m1> list24 = divSeparator.i;
        List<DivAction> list25 = list12;
        List<w0> list26 = divSeparator.h;
        List<DivAction> list27 = divSeparator.d;
        List<DivAction> list28 = list14;
        DivAction divAction = divSeparator.b;
        List<DivAction> list29 = list15;
        DivAccessibility divAccessibility = divSeparator.a;
        List<t4> list30 = list16;
        DivAccessibility divAccessibility2 = this.a;
        if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
            return false;
        }
        DivAction divAction2 = this.b;
        if (!(divAction2 != null ? divAction2.a(divAction, expressionResolver, expressionResolver2) : divAction == null) || !this.c.a(divSeparator.c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list31 = this.d;
        if (list31 != null) {
            if (list27 != null) {
                th = null;
                if (list31.size() == list27.size()) {
                    int i = 0;
                    for (Object obj : list31) {
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
        Expression<DivAlignmentHorizontal> expression2 = divSeparator.e;
        if (obj2 != (expression2 != null ? (DivAlignmentHorizontal) expression2.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.f;
        Object obj3 = expression3 != null ? (DivAlignmentVertical) expression3.evaluate(expressionResolver) : th;
        Expression<DivAlignmentVertical> expression4 = divSeparator.f;
        if (obj3 != (expression4 != null ? (DivAlignmentVertical) expression4.evaluate(expressionResolver2) : th)) {
            return false;
        }
        if (!(this.g.evaluate(expressionResolver).doubleValue() == divSeparator.g.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<w0> list32 = this.h;
        if (list32 != null) {
            if (list26 != null) {
                if (list32.size() == list26.size()) {
                    int i3 = 0;
                    for (Object obj4 : list32) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((w0) obj4).a(list26.get(i3), expressionResolver, expressionResolver2)) {
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
        List<m1> list33 = this.i;
        if (list33 != null) {
            if (list24 != null) {
                if (list33.size() == list24.size()) {
                    int i5 = 0;
                    for (Object obj5 : list33) {
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
        if (!(u1Var2 != null ? u1Var2.a(u1Var, expressionResolver, expressionResolver2) : u1Var == null) || this.k.evaluate(expressionResolver).booleanValue() != divSeparator.k.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expression5 = this.l;
        Long evaluate = expression5 != null ? expression5.evaluate(expressionResolver) : th;
        Expression<Long> expression6 = divSeparator.l;
        if (!epx.f(evaluate, expression6 != null ? expression6.evaluate(expressionResolver2) : th)) {
            return false;
        }
        DelimiterStyle delimiterStyle2 = this.m;
        if (!(delimiterStyle2 == null ? delimiterStyle == null : delimiterStyle != null && delimiterStyle2.a.evaluate(expressionResolver).intValue() == delimiterStyle.a.evaluate(expressionResolver2).intValue() && delimiterStyle2.b.evaluate(expressionResolver) == delimiterStyle.b.evaluate(expressionResolver2))) {
            return false;
        }
        List<v3> list34 = this.n;
        if (list34 != null) {
            if (list22 != null) {
                if (list34.size() == list22.size()) {
                    int i7 = 0;
                    for (Object obj6 : list34) {
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
        if (!z4) {
            return false;
        }
        List<DivAction> list35 = this.o;
        if (list35 != null) {
            if (list20 != null) {
                if (list35.size() == list20.size()) {
                    int i9 = 0;
                    for (Object obj7 : list35) {
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
        List<zkn> list36 = this.p;
        if (list36 != null) {
            if (list18 != null) {
                if (list36.size() == list18.size()) {
                    int i11 = 0;
                    for (Object obj8 : list36) {
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
        jln jlnVar2 = this.q;
        if (!(jlnVar2 != null ? jlnVar2.a(jlnVar, expressionResolver, expressionResolver2) : jlnVar == null)) {
            return false;
        }
        List<t4> list37 = this.r;
        if (list37 != null) {
            if (list30 != null) {
                if (list37.size() == list30.size()) {
                    int i13 = 0;
                    for (Object obj9 : list37) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<t4> list38 = list30;
                        if (((t4) obj9).a(list38.get(i13))) {
                            i13 = i14;
                            list30 = list38;
                        }
                    }
                    z7 = true;
                }
                z7 = false;
                break;
            }
            return false;
        }
        if (!z7 || !this.s.a(divSeparator.s, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list39 = this.t;
        if (list39 != null) {
            if (list29 != null) {
                if (list39.size() == list29.size()) {
                    int i15 = 0;
                    for (Object obj10 : list39) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list40 = list29;
                        if (((DivAction) obj10).a(list40.get(i15), expressionResolver, expressionResolver2)) {
                            i15 = i16;
                            list29 = list40;
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
        List<DivAction> list41 = this.u;
        if (list41 != null) {
            if (list28 != null) {
                if (list41.size() == list28.size()) {
                    int i17 = 0;
                    for (Object obj11 : list41) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list42 = list28;
                        if (((DivAction) obj11).a(list42.get(i17), expressionResolver, expressionResolver2)) {
                            i17 = i18;
                            list28 = list42;
                        }
                    }
                    z9 = true;
                }
                z9 = false;
                break;
            }
            return false;
        }
        if (!z9 || !epx.f(this.v, divSeparator.v)) {
            return false;
        }
        vmn vmnVar2 = this.w;
        if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
            return false;
        }
        List<DivAction> list43 = this.x;
        if (list43 != null) {
            if (list25 != null) {
                if (list43.size() == list25.size()) {
                    int i19 = 0;
                    for (Object obj12 : list43) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list44 = list25;
                        if (((DivAction) obj12).a(list44.get(i19), expressionResolver, expressionResolver2)) {
                            i19 = i20;
                            list25 = list44;
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
        y3 y3Var3 = this.y;
        if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null)) {
            return false;
        }
        y3 y3Var4 = this.z;
        if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null)) {
            return false;
        }
        List<DivAction> list45 = this.A;
        if (list45 != null) {
            if (list23 != null) {
                if (list45.size() == list23.size()) {
                    int i21 = 0;
                    for (Object obj13 : list45) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list46 = list23;
                        if (((DivAction) obj13).a(list46.get(i21), expressionResolver, expressionResolver2)) {
                            i21 = i22;
                            list23 = list46;
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
        List<DivAction> list47 = this.B;
        if (list47 != null) {
            if (list21 != null) {
                if (list47.size() == list21.size()) {
                    int i23 = 0;
                    for (Object obj14 : list47) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list48 = list21;
                        if (((DivAction) obj14).a(list48.get(i23), expressionResolver, expressionResolver2)) {
                            i23 = i24;
                            list21 = list48;
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
        Expression<String> expression7 = this.C;
        String evaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : th;
        Expression<String> expression8 = divSeparator.C;
        if (!epx.f(evaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<Long> expression9 = this.D;
        Long evaluate3 = expression9 != null ? expression9.evaluate(expressionResolver) : th;
        Expression<Long> expression10 = divSeparator.D;
        if (!epx.f(evaluate3, expression10 != null ? expression10.evaluate(expressionResolver2) : th)) {
            return false;
        }
        List<DivAction> list49 = this.E;
        if (list49 != null) {
            if (list19 != null) {
                if (list49.size() == list19.size()) {
                    int i25 = 0;
                    for (Object obj15 : list49) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list50 = list19;
                        if (((DivAction) obj15).a(list50.get(i25), expressionResolver, expressionResolver2)) {
                            i25 = i26;
                            list19 = list50;
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
        List<DivTooltip> list51 = this.F;
        if (list51 != null) {
            if (list17 != null) {
                if (list51.size() == list17.size()) {
                    int i27 = 0;
                    for (Object obj16 : list51) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivTooltip> list52 = list17;
                        if (((DivTooltip) obj16).a(list52.get(i27), expressionResolver, expressionResolver2)) {
                            i27 = i28;
                            list17 = list52;
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
        hd hdVar2 = this.G;
        if (!(hdVar2 != null ? hdVar2.a(hdVar, expressionResolver, expressionResolver2) : hdVar == null)) {
            return false;
        }
        d2 d2Var2 = this.H;
        if (!(d2Var2 != null ? d2Var2.a(d2Var, expressionResolver, expressionResolver2) : d2Var == null)) {
            return false;
        }
        e1 e1Var3 = this.I;
        if (!(e1Var3 != null ? e1Var3.a(e1Var2, expressionResolver, expressionResolver2) : e1Var2 == null)) {
            return false;
        }
        e1 e1Var4 = this.J;
        if (!(e1Var4 != null ? e1Var4.a(e1Var, expressionResolver, expressionResolver2) : e1Var == null)) {
            return false;
        }
        List<DivTransitionTrigger> list53 = this.K;
        if (list53 != null) {
            if (list13 != null) {
                if (list53.size() == list13.size()) {
                    int i29 = 0;
                    for (Object obj17 : list53) {
                        int i30 = i29 + 1;
                        if (i29 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivTransitionTrigger> list54 = list13;
                        if (((DivTransitionTrigger) obj17) == list54.get(i29)) {
                            i29 = i30;
                            list13 = list54;
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
        List<DivTrigger> list55 = this.L;
        if (list55 != null) {
            if (list11 != null) {
                if (list55.size() == list11.size()) {
                    int i31 = 0;
                    for (Object obj18 : list55) {
                        int i32 = i31 + 1;
                        if (i31 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivTrigger> list56 = list11;
                        if (((DivTrigger) obj18).a(list56.get(i31), expressionResolver, expressionResolver2)) {
                            i31 = i32;
                            list11 = list56;
                        }
                    }
                    z16 = true;
                }
                z16 = false;
                break;
            }
            return false;
        }
        if (!z16) {
            return false;
        }
        List<md> list57 = this.M;
        if (list57 != null) {
            if (list10 != null) {
                if (list57.size() == list10.size()) {
                    int i33 = 0;
                    for (Object obj19 : list57) {
                        int i34 = i33 + 1;
                        if (i33 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<md> list58 = list10;
                        if (((md) obj19).a(list58.get(i33), expressionResolver, expressionResolver2)) {
                            i33 = i34;
                            list10 = list58;
                        }
                    }
                    z17 = true;
                }
                z17 = false;
                break;
            }
            return false;
        }
        if (!z17 || this.N.evaluate(expressionResolver) != divSeparator.N.evaluate(expressionResolver2)) {
            return false;
        }
        zd zdVar2 = this.O;
        if (!(zdVar2 != null ? zdVar2.g(zdVar, expressionResolver, expressionResolver2) : zdVar == null)) {
            return false;
        }
        List<zd> list59 = this.P;
        if (list59 != null) {
            if (list8 != null) {
                if (list59.size() == list8.size()) {
                    int i35 = 0;
                    for (Object obj20 : list59) {
                        int i36 = i35 + 1;
                        if (i35 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<zd> list60 = list8;
                        if (((zd) obj20).g(list60.get(i35), expressionResolver, expressionResolver2)) {
                            i35 = i36;
                            list8 = list60;
                        }
                    }
                    z18 = true;
                }
                z18 = false;
                break;
            }
            return false;
        }
        return z18 && this.Q.a(divSeparator.Q, expressionResolver, expressionResolver2);
    }

    @Override // xsna.ikn
    public final Expression<Double> a() {
        return this.g;
    }

    @Override // xsna.ikn
    public final List<DivTooltip> b() {
        return this.F;
    }

    @Override // xsna.ikn
    public final hd c() {
        return this.G;
    }

    @Override // xsna.ikn
    public final u1 d() {
        return this.j;
    }

    @Override // xsna.ikn
    public final Expression<Long> e() {
        return this.l;
    }

    @Override // xsna.ikn
    public final List<md> f() {
        return this.M;
    }

    @Override // xsna.ikn
    public final y3 g() {
        return this.y;
    }

    @Override // xsna.ikn
    public final List<m1> getBackground() {
        return this.i;
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
        return this.N;
    }

    @Override // xsna.ikn
    public final v9 getWidth() {
        return this.Q;
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
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Integer num = this.R;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(DivSeparator.class).hashCode();
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
        int hashCode4 = this.k.hashCode() + i20 + (u1Var != null ? u1Var.hash() : 0);
        Expression<Long> expression3 = this.l;
        int hashCode5 = hashCode4 + (expression3 != null ? expression3.hashCode() : 0);
        DelimiterStyle delimiterStyle = this.m;
        int hash3 = hashCode5 + (delimiterStyle != null ? delimiterStyle.hash() : 0);
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
        int i21 = hash3 + i4;
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
        int i22 = i21 + i5;
        List<zkn> list6 = this.p;
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
        jln jlnVar = this.q;
        int hash4 = i23 + (jlnVar != null ? jlnVar.hash() : 0);
        List<t4> list7 = this.r;
        if (list7 != null) {
            Iterator<T> it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((t4) it7.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int hash5 = this.s.hash() + hash4 + i7;
        List<DivAction> list8 = this.t;
        if (list8 != null) {
            Iterator<T> it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((DivAction) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int i24 = hash5 + i8;
        List<DivAction> list9 = this.u;
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
        String str = this.v;
        int hashCode6 = i25 + (str != null ? str.hashCode() : 0);
        vmn vmnVar = this.w;
        int hash6 = hashCode6 + (vmnVar != null ? vmnVar.hash() : 0);
        List<DivAction> list10 = this.x;
        if (list10 != null) {
            Iterator<T> it10 = list10.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((DivAction) it10.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i26 = hash6 + i10;
        y3 y3Var = this.y;
        int hash7 = i26 + (y3Var != null ? y3Var.hash() : 0);
        y3 y3Var2 = this.z;
        int hash8 = hash7 + (y3Var2 != null ? y3Var2.hash() : 0);
        List<DivAction> list11 = this.A;
        if (list11 != null) {
            Iterator<T> it11 = list11.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((DivAction) it11.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i27 = hash8 + i11;
        List<DivAction> list12 = this.B;
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
        Expression<String> expression4 = this.C;
        int hashCode7 = i28 + (expression4 != null ? expression4.hashCode() : 0);
        Expression<Long> expression5 = this.D;
        int hashCode8 = hashCode7 + (expression5 != null ? expression5.hashCode() : 0);
        List<DivAction> list13 = this.E;
        if (list13 != null) {
            Iterator<T> it13 = list13.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((DivAction) it13.next()).hash();
            }
        } else {
            i13 = 0;
        }
        int i29 = hashCode8 + i13;
        List<DivTooltip> list14 = this.F;
        if (list14 != null) {
            Iterator<T> it14 = list14.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((DivTooltip) it14.next()).hash();
            }
        } else {
            i14 = 0;
        }
        int i30 = i29 + i14;
        hd hdVar = this.G;
        int hash9 = i30 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.H;
        int hash10 = hash9 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.I;
        int hash11 = hash10 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.J;
        int hash12 = hash11 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list15 = this.K;
        int hashCode9 = hash12 + (list15 != null ? list15.hashCode() : 0);
        List<DivTrigger> list16 = this.L;
        if (list16 != null) {
            Iterator<T> it15 = list16.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((DivTrigger) it15.next()).hash();
            }
        } else {
            i15 = 0;
        }
        int i31 = hashCode9 + i15;
        List<md> list17 = this.M;
        if (list17 != null) {
            Iterator<T> it16 = list17.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((md) it16.next()).hash();
            }
        } else {
            i16 = 0;
        }
        int hashCode10 = this.N.hashCode() + i31 + i16;
        zd zdVar = this.O;
        int hash13 = hashCode10 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list18 = this.P;
        if (list18 != null) {
            Iterator<T> it17 = list18.iterator();
            while (it17.hasNext()) {
                i17 += ((zd) it17.next()).hash();
            }
        }
        int hash14 = this.Q.hash() + hash13 + i17;
        this.R = Integer.valueOf(hash14);
        return hash14;
    }

    @Override // xsna.ikn
    public final Expression<String> i() {
        return this.C;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentHorizontal> j() {
        return this.e;
    }

    @Override // xsna.ikn
    public final e1 k() {
        return this.J;
    }

    @Override // xsna.ikn
    public final List<DivTransitionTrigger> l() {
        return this.K;
    }

    @Override // xsna.ikn
    public final List<zkn> m() {
        return this.p;
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
        return this.L;
    }

    @Override // xsna.ikn
    public final e1 q() {
        return this.I;
    }

    @Override // xsna.ikn
    public final List<w0> r() {
        return this.h;
    }

    @Override // xsna.ikn
    public final List<zd> s() {
        return this.P;
    }

    @Override // xsna.ikn
    public final d2 t() {
        return this.H;
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
        return this.q;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((l9.d) BuiltInParserKt.getBuiltInParserComponent().G6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // xsna.ikn
    public final DivAccessibility x() {
        return this.a;
    }

    @Override // xsna.ikn
    public final y3 y() {
        return this.z;
    }

    @Override // xsna.ikn
    public final zd z() {
        return this.O;
    }

    /* compiled from: DivSeparator.kt */
    public static final class DelimiterStyle implements JSONSerializable, Hashable {
        public static final Expression<Integer> d;
        public static final Expression<Orientation> e;
        public final Expression<Integer> a;
        public final Expression<Orientation> b;
        public Integer c;

        /* compiled from: DivSeparator.kt */
        public enum Orientation {
            VERTICAL("vertical"),
            HORIZONTAL("horizontal");

            private final String value;
            public static final c Converter = new c();
            public static final izs<Orientation, String> TO_STRING = b.i;
            public static final izs<String, Orientation> FROM_STRING = a.i;

            /* compiled from: DivSeparator.kt */
            public static final class a extends Lambda implements izs<String, Orientation> {
                public static final a i = new a(1);

                @Override // xsna.izs
                public final Orientation invoke(String str) {
                    String str2 = str;
                    Orientation.Converter.getClass();
                    Orientation orientation = Orientation.VERTICAL;
                    if (epx.f(str2, orientation.value)) {
                        return orientation;
                    }
                    Orientation orientation2 = Orientation.HORIZONTAL;
                    if (epx.f(str2, orientation2.value)) {
                        return orientation2;
                    }
                    return null;
                }
            }

            /* compiled from: DivSeparator.kt */
            public static final class b extends Lambda implements izs<Orientation, String> {
                public static final b i = new b(1);

                @Override // xsna.izs
                public final String invoke(Orientation orientation) {
                    Orientation.Converter.getClass();
                    return orientation.value;
                }
            }

            /* compiled from: DivSeparator.kt */
            public static final class c {
            }

            Orientation(String str) {
                this.value = str;
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            d = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
            e = Expression.Companion.constant$default(companion, Orientation.HORIZONTAL, null, 2, null);
        }

        public DelimiterStyle(Expression<Integer> expression, Expression<Orientation> expression2) {
            this.a = expression;
            this.b = expression2;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.c;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(DelimiterStyle.class).hashCode();
            this.c = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            k9.b bVar = (k9.b) BuiltInParserKt.getBuiltInParserComponent().J6.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            bVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "color", this.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, X3.i.n, this.b, Orientation.TO_STRING);
            return jSONObject;
        }

        public DelimiterStyle() {
            this(d, e);
        }
    }

    public DivSeparator() {
        this(null, null, S, null, null, null, T, null, null, null, U, null, null, null, null, null, null, null, V, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, W, null, null, X);
    }
}
