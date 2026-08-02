package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.c5;
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

/* compiled from: DivGrid.kt */
/* loaded from: classes8.dex */
public final class b5 implements JSONSerializable, Hashable, ikn {
    public final List<DivAction> A;
    public final y3 B;
    public final y3 C;
    public final List<DivAction> D;
    public final List<DivAction> E;
    public final Expression<String> F;
    public final Expression<Long> G;
    public final List<DivAction> H;
    public final List<DivTooltip> I;
    public final hd J;
    public final d2 K;
    public final e1 L;
    public final e1 M;
    public final List<DivTransitionTrigger> N;
    public final List<DivTrigger> O;
    public final List<md> P;
    public final Expression<DivVisibility> Q;
    public final zd R;
    public final List<zd> S;
    public final v9 T;
    public Integer U;
    public Integer V;
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
    public final Expression<Long> m;
    public final Expression<DivAlignmentHorizontal> n;
    public final Expression<DivAlignmentVertical> o;
    public final List<v3> p;
    public final List<DivAction> q;
    public final List<zkn> r;
    public final jln s;
    public final List<t4> t;
    public final v9 u;
    public final List<DivAction> v;
    public final List<DivAction> w;
    public final String x;
    public final List<a> y;
    public final vmn z;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentVertical.TOP, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b5(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list2, List<? extends m1> list3, u1 u1Var, Expression<Boolean> expression4, Expression<Long> expression5, Expression<Long> expression6, Expression<DivAlignmentHorizontal> expression7, Expression<DivAlignmentVertical> expression8, List<v3> list4, List<DivAction> list5, List<zkn> list6, jln jlnVar, List<t4> list7, v9 v9Var, List<DivAction> list8, List<DivAction> list9, String str, List<? extends a> list10, vmn vmnVar, List<DivAction> list11, y3 y3Var, y3 y3Var2, List<DivAction> list12, List<DivAction> list13, Expression<String> expression9, Expression<Long> expression10, List<DivAction> list14, List<DivTooltip> list15, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list16, List<DivTrigger> list17, List<? extends md> list18, Expression<DivVisibility> expression11, zd zdVar, List<zd> list19, v9 v9Var2) {
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
        this.o = expression8;
        this.p = list4;
        this.q = list5;
        this.r = list6;
        this.s = jlnVar;
        this.t = list7;
        this.u = v9Var;
        this.v = list8;
        this.w = list9;
        this.x = str;
        this.y = list10;
        this.z = vmnVar;
        this.A = list11;
        this.B = y3Var;
        this.C = y3Var2;
        this.D = list12;
        this.E = list13;
        this.F = expression9;
        this.G = expression10;
        this.H = list14;
        this.I = list15;
        this.J = hdVar;
        this.K = d2Var;
        this.L = e1Var;
        this.M = e1Var2;
        this.N = list16;
        this.O = list17;
        this.P = list18;
        this.Q = expression11;
        this.R = zdVar;
        this.S = list19;
        this.T = v9Var2;
    }

    public static b5 B(b5 b5Var, String str, List list, int i) {
        List<DivAction> list2;
        DivAccessibility divAccessibility = b5Var.a;
        DivAction divAction = b5Var.b;
        DivAnimation divAnimation = b5Var.c;
        List<DivAction> list3 = b5Var.d;
        Expression<DivAlignmentHorizontal> expression = b5Var.e;
        Expression<DivAlignmentVertical> expression2 = b5Var.f;
        Expression<Double> expression3 = b5Var.g;
        List<w0> list4 = b5Var.h;
        List<m1> list5 = b5Var.i;
        u1 u1Var = b5Var.j;
        Expression<Boolean> expression4 = b5Var.k;
        Expression<Long> expression5 = b5Var.l;
        Expression<Long> expression6 = b5Var.m;
        Expression<DivAlignmentHorizontal> expression7 = b5Var.n;
        Expression<DivAlignmentVertical> expression8 = b5Var.o;
        List<v3> list6 = b5Var.p;
        List<DivAction> list7 = b5Var.q;
        List<zkn> list8 = b5Var.r;
        jln jlnVar = b5Var.s;
        List<t4> list9 = b5Var.t;
        v9 v9Var = b5Var.u;
        List<DivAction> list10 = b5Var.v;
        List<DivAction> list11 = b5Var.w;
        if ((i & 8388608) != 0) {
            list2 = list11;
            str = b5Var.x;
        } else {
            list2 = list11;
        }
        vmn vmnVar = b5Var.z;
        List<DivAction> list12 = b5Var.A;
        y3 y3Var = b5Var.B;
        y3 y3Var2 = b5Var.C;
        List<DivAction> list13 = b5Var.D;
        List<DivAction> list14 = b5Var.E;
        Expression<String> expression9 = b5Var.F;
        Expression<Long> expression10 = b5Var.G;
        List<DivAction> list15 = b5Var.H;
        List<DivTooltip> list16 = b5Var.I;
        hd hdVar = b5Var.J;
        d2 d2Var = b5Var.K;
        e1 e1Var = b5Var.L;
        e1 e1Var2 = b5Var.M;
        List<DivTransitionTrigger> list17 = b5Var.N;
        List<DivTrigger> list18 = b5Var.O;
        List<md> list19 = b5Var.P;
        Expression<DivVisibility> expression11 = b5Var.Q;
        zd zdVar = b5Var.R;
        List<zd> list20 = b5Var.S;
        v9 v9Var2 = b5Var.T;
        b5Var.getClass();
        return new b5(divAccessibility, divAction, divAnimation, list3, expression, expression2, expression3, list4, list5, u1Var, expression4, expression5, expression6, expression7, expression8, list6, list7, list8, jlnVar, list9, v9Var, list10, list2, str, list, vmnVar, list12, y3Var, y3Var2, list13, list14, expression9, expression10, list15, list16, hdVar, d2Var, e1Var, e1Var2, list17, list18, list19, expression11, zdVar, list20, v9Var2);
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:502:0x0824, code lost:
    
        if (r17 == null) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x07b6, code lost:
    
        if (r19 == null) goto L557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0769, code lost:
    
        if (r20 == null) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x071c, code lost:
    
        if (r21 == null) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x067c, code lost:
    
        if (r26 == null) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x062f, code lost:
    
        if (r27 == null) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x05a2, code lost:
    
        if (r28 == null) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0555, code lost:
    
        if (r29 == null) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x04e0, code lost:
    
        if (r32 == null) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x047f, code lost:
    
        if (r34 == null) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0428, code lost:
    
        if (r35 == null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x03db, code lost:
    
        if (r37 == null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0384, code lost:
    
        if (r13 == null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x032b, code lost:
    
        if (r15 == null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x02e4, code lost:
    
        if (r4 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x029d, code lost:
    
        if (r5 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x01d2, code lost:
    
        if (r7 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x018b, code lost:
    
        if (r8 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x00e9, code lost:
    
        if (r9 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(b5 b5Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (b5Var == null) {
            return false;
        }
        List<zd> list = b5Var.S;
        zd zdVar = b5Var.R;
        List<md> list2 = b5Var.P;
        List<DivTrigger> list3 = b5Var.O;
        List<DivTransitionTrigger> list4 = b5Var.N;
        e1 e1Var = b5Var.M;
        e1 e1Var2 = b5Var.L;
        d2 d2Var = b5Var.K;
        hd hdVar = b5Var.J;
        List<DivTooltip> list5 = b5Var.I;
        List<DivAction> list6 = b5Var.H;
        List<DivAction> list7 = b5Var.E;
        List<zd> list8 = list;
        List<DivAction> list9 = b5Var.D;
        y3 y3Var = b5Var.C;
        List<md> list10 = list2;
        y3 y3Var2 = b5Var.B;
        List<DivTrigger> list11 = list3;
        List<DivAction> list12 = b5Var.A;
        List<DivTransitionTrigger> list13 = list4;
        vmn vmnVar = b5Var.z;
        List<a> list14 = b5Var.y;
        List<DivAction> list15 = b5Var.w;
        List<DivAction> list16 = b5Var.v;
        List<t4> list17 = b5Var.t;
        List<DivTooltip> list18 = list5;
        jln jlnVar = b5Var.s;
        List<DivAction> list19 = list6;
        List<zkn> list20 = b5Var.r;
        List<DivAction> list21 = list7;
        List<DivAction> list22 = b5Var.q;
        List<DivAction> list23 = list9;
        List<v3> list24 = b5Var.p;
        u1 u1Var = b5Var.j;
        List<m1> list25 = b5Var.i;
        List<DivAction> list26 = list12;
        List<w0> list27 = b5Var.h;
        List<DivAction> list28 = b5Var.d;
        List<a> list29 = list14;
        DivAction divAction = b5Var.b;
        List<DivAction> list30 = list15;
        DivAccessibility divAccessibility = b5Var.a;
        List<DivAction> list31 = list16;
        DivAccessibility divAccessibility2 = this.a;
        if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
            return false;
        }
        DivAction divAction2 = this.b;
        if (!(divAction2 != null ? divAction2.a(divAction, expressionResolver, expressionResolver2) : divAction == null) || !this.c.a(b5Var.c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list32 = this.d;
        if (list32 != null) {
            if (list28 != null) {
                th = null;
                if (list32.size() == list28.size()) {
                    int i = 0;
                    for (Object obj : list32) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((DivAction) obj).a(list28.get(i), expressionResolver, expressionResolver2)) {
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
        Expression<DivAlignmentHorizontal> expression2 = b5Var.e;
        if (obj2 != (expression2 != null ? (DivAlignmentHorizontal) expression2.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.f;
        Object obj3 = expression3 != null ? (DivAlignmentVertical) expression3.evaluate(expressionResolver) : th;
        Expression<DivAlignmentVertical> expression4 = b5Var.f;
        if (obj3 != (expression4 != null ? (DivAlignmentVertical) expression4.evaluate(expressionResolver2) : th)) {
            return false;
        }
        if (!(this.g.evaluate(expressionResolver).doubleValue() == b5Var.g.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<w0> list33 = this.h;
        if (list33 != null) {
            if (list27 != null) {
                if (list33.size() == list27.size()) {
                    int i3 = 0;
                    for (Object obj4 : list33) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((w0) obj4).a(list27.get(i3), expressionResolver, expressionResolver2)) {
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
        List<m1> list34 = this.i;
        if (list34 != null) {
            if (list25 != null) {
                if (list34.size() == list25.size()) {
                    int i5 = 0;
                    for (Object obj5 : list34) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((m1) obj5).a(list25.get(i5), expressionResolver, expressionResolver2)) {
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
        if (!(u1Var2 != null ? u1Var2.a(u1Var, expressionResolver, expressionResolver2) : u1Var == null) || this.k.evaluate(expressionResolver).booleanValue() != b5Var.k.evaluate(expressionResolver2).booleanValue() || this.l.evaluate(expressionResolver).longValue() != b5Var.l.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        Expression<Long> expression5 = this.m;
        Long evaluate = expression5 != null ? expression5.evaluate(expressionResolver) : th;
        Expression<Long> expression6 = b5Var.m;
        if (!epx.f(evaluate, expression6 != null ? expression6.evaluate(expressionResolver2) : th) || this.n.evaluate(expressionResolver) != b5Var.n.evaluate(expressionResolver2) || this.o.evaluate(expressionResolver) != b5Var.o.evaluate(expressionResolver2)) {
            return false;
        }
        List<v3> list35 = this.p;
        if (list35 != null) {
            if (list24 != null) {
                if (list35.size() == list24.size()) {
                    int i7 = 0;
                    for (Object obj6 : list35) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((v3) obj6).g(list24.get(i7), expressionResolver, expressionResolver2)) {
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
        List<DivAction> list36 = this.q;
        if (list36 != null) {
            if (list22 != null) {
                if (list36.size() == list22.size()) {
                    int i9 = 0;
                    for (Object obj7 : list36) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((DivAction) obj7).a(list22.get(i9), expressionResolver, expressionResolver2)) {
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
        List<zkn> list37 = this.r;
        if (list37 != null) {
            if (list20 != null) {
                if (list37.size() == list20.size()) {
                    int i11 = 0;
                    for (Object obj8 : list37) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((zkn) obj8).a(list20.get(i11))) {
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
        List<t4> list38 = this.t;
        if (list38 != null) {
            if (list17 != null) {
                if (list38.size() == list17.size()) {
                    int i13 = 0;
                    for (Object obj9 : list38) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((t4) obj9).a(list17.get(i13))) {
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
        if (!z7 || !this.u.a(b5Var.u, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list39 = this.v;
        if (list39 != null) {
            if (list31 != null) {
                if (list39.size() == list31.size()) {
                    int i15 = 0;
                    for (Object obj10 : list39) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list40 = list31;
                        if (((DivAction) obj10).a(list40.get(i15), expressionResolver, expressionResolver2)) {
                            i15 = i16;
                            list31 = list40;
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
        List<DivAction> list41 = this.w;
        if (list41 != null) {
            if (list30 != null) {
                if (list41.size() == list30.size()) {
                    int i17 = 0;
                    for (Object obj11 : list41) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list42 = list30;
                        if (((DivAction) obj11).a(list42.get(i17), expressionResolver, expressionResolver2)) {
                            i17 = i18;
                            list30 = list42;
                        }
                    }
                    z9 = true;
                }
                z9 = false;
                break;
            }
            return false;
        }
        if (!z9 || !epx.f(this.x, b5Var.x)) {
            return false;
        }
        List<a> list43 = this.y;
        if (list43 != null) {
            if (list29 != null) {
                if (list43.size() == list29.size()) {
                    int i19 = 0;
                    for (Object obj12 : list43) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<a> list44 = list29;
                        if (((a) obj12).a(list44.get(i19), expressionResolver, expressionResolver2)) {
                            i19 = i20;
                            list29 = list44;
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
        vmn vmnVar2 = this.z;
        if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
            return false;
        }
        List<DivAction> list45 = this.A;
        if (list45 != null) {
            if (list26 != null) {
                if (list45.size() == list26.size()) {
                    int i21 = 0;
                    for (Object obj13 : list45) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list46 = list26;
                        if (((DivAction) obj13).a(list46.get(i21), expressionResolver, expressionResolver2)) {
                            i21 = i22;
                            list26 = list46;
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
        y3 y3Var3 = this.B;
        if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null)) {
            return false;
        }
        y3 y3Var4 = this.C;
        if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null)) {
            return false;
        }
        List<DivAction> list47 = this.D;
        if (list47 != null) {
            if (list23 != null) {
                if (list47.size() == list23.size()) {
                    int i23 = 0;
                    for (Object obj14 : list47) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list48 = list23;
                        if (((DivAction) obj14).a(list48.get(i23), expressionResolver, expressionResolver2)) {
                            i23 = i24;
                            list23 = list48;
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
        List<DivAction> list49 = this.E;
        if (list49 != null) {
            if (list21 != null) {
                if (list49.size() == list21.size()) {
                    int i25 = 0;
                    for (Object obj15 : list49) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list50 = list21;
                        if (((DivAction) obj15).a(list50.get(i25), expressionResolver, expressionResolver2)) {
                            i25 = i26;
                            list21 = list50;
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
        Expression<String> expression7 = this.F;
        String evaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : th;
        Expression<String> expression8 = b5Var.F;
        if (!epx.f(evaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<Long> expression9 = this.G;
        Long evaluate3 = expression9 != null ? expression9.evaluate(expressionResolver) : th;
        Expression<Long> expression10 = b5Var.G;
        if (!epx.f(evaluate3, expression10 != null ? expression10.evaluate(expressionResolver2) : th)) {
            return false;
        }
        List<DivAction> list51 = this.H;
        if (list51 != null) {
            if (list19 != null) {
                if (list51.size() == list19.size()) {
                    int i27 = 0;
                    for (Object obj16 : list51) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list52 = list19;
                        if (((DivAction) obj16).a(list52.get(i27), expressionResolver, expressionResolver2)) {
                            i27 = i28;
                            list19 = list52;
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
        List<DivTooltip> list53 = this.I;
        if (list53 != null) {
            if (list18 != null) {
                if (list53.size() == list18.size()) {
                    int i29 = 0;
                    for (Object obj17 : list53) {
                        int i30 = i29 + 1;
                        if (i29 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivTooltip> list54 = list18;
                        if (((DivTooltip) obj17).a(list54.get(i29), expressionResolver, expressionResolver2)) {
                            i29 = i30;
                            list18 = list54;
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
        hd hdVar2 = this.J;
        if (!(hdVar2 != null ? hdVar2.a(hdVar, expressionResolver, expressionResolver2) : hdVar == null)) {
            return false;
        }
        d2 d2Var2 = this.K;
        if (!(d2Var2 != null ? d2Var2.a(d2Var, expressionResolver, expressionResolver2) : d2Var == null)) {
            return false;
        }
        e1 e1Var3 = this.L;
        if (!(e1Var3 != null ? e1Var3.a(e1Var2, expressionResolver, expressionResolver2) : e1Var2 == null)) {
            return false;
        }
        e1 e1Var4 = this.M;
        if (!(e1Var4 != null ? e1Var4.a(e1Var, expressionResolver, expressionResolver2) : e1Var == null)) {
            return false;
        }
        List<DivTransitionTrigger> list55 = this.N;
        if (list55 != null) {
            if (list13 != null) {
                if (list55.size() == list13.size()) {
                    int i31 = 0;
                    for (Object obj18 : list55) {
                        int i32 = i31 + 1;
                        if (i31 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivTransitionTrigger> list56 = list13;
                        if (((DivTransitionTrigger) obj18) == list56.get(i31)) {
                            i31 = i32;
                            list13 = list56;
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
        List<DivTrigger> list57 = this.O;
        if (list57 != null) {
            if (list11 != null) {
                if (list57.size() == list11.size()) {
                    int i33 = 0;
                    for (Object obj19 : list57) {
                        int i34 = i33 + 1;
                        if (i33 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivTrigger> list58 = list11;
                        if (((DivTrigger) obj19).a(list58.get(i33), expressionResolver, expressionResolver2)) {
                            i33 = i34;
                            list11 = list58;
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
        List<md> list59 = this.P;
        if (list59 != null) {
            if (list10 != null) {
                if (list59.size() == list10.size()) {
                    int i35 = 0;
                    for (Object obj20 : list59) {
                        int i36 = i35 + 1;
                        if (i35 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<md> list60 = list10;
                        if (((md) obj20).a(list60.get(i35), expressionResolver, expressionResolver2)) {
                            i35 = i36;
                            list10 = list60;
                        }
                    }
                    z18 = true;
                }
                z18 = false;
                break;
            }
            return false;
        }
        if (!z18 || this.Q.evaluate(expressionResolver) != b5Var.Q.evaluate(expressionResolver2)) {
            return false;
        }
        zd zdVar2 = this.R;
        if (!(zdVar2 != null ? zdVar2.g(zdVar, expressionResolver, expressionResolver2) : zdVar == null)) {
            return false;
        }
        List<zd> list61 = this.S;
        if (list61 != null) {
            if (list8 != null) {
                if (list61.size() == list8.size()) {
                    int i37 = 0;
                    for (Object obj21 : list61) {
                        int i38 = i37 + 1;
                        if (i37 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<zd> list62 = list8;
                        if (((zd) obj21).g(list62.get(i37), expressionResolver, expressionResolver2)) {
                            i37 = i38;
                            list8 = list62;
                        }
                    }
                    z19 = true;
                }
                z19 = false;
                break;
            }
            return false;
        }
        return z19 && this.T.a(b5Var.T, expressionResolver, expressionResolver2);
    }

    @Override // xsna.ikn
    public final Expression<Double> a() {
        return this.g;
    }

    @Override // xsna.ikn
    public final List<DivTooltip> b() {
        return this.I;
    }

    @Override // xsna.ikn
    public final hd c() {
        return this.J;
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
        return this.P;
    }

    @Override // xsna.ikn
    public final y3 g() {
        return this.B;
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
        return this.Q;
    }

    @Override // xsna.ikn
    public final v9 getWidth() {
        return this.T;
    }

    @Override // xsna.ikn
    public final Expression<Long> h() {
        return this.G;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.V;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        int i = 0;
        List<a> list = this.y;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                i += ((a) it.next()).hash();
            }
        }
        int i2 = propertiesHash + i;
        this.V = Integer.valueOf(i2);
        return i2;
    }

    @Override // xsna.ikn
    public final Expression<String> i() {
        return this.F;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentHorizontal> j() {
        return this.e;
    }

    @Override // xsna.ikn
    public final e1 k() {
        return this.M;
    }

    @Override // xsna.ikn
    public final List<DivTransitionTrigger> l() {
        return this.N;
    }

    @Override // xsna.ikn
    public final List<zkn> m() {
        return this.r;
    }

    @Override // xsna.ikn
    public final List<DivAction> n() {
        return this.H;
    }

    @Override // xsna.ikn
    public final vmn o() {
        return this.z;
    }

    @Override // xsna.ikn
    public final List<DivTrigger> p() {
        return this.O;
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
        Integer num = this.U;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(b5.class).hashCode();
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
        int hashCode5 = this.o.hashCode() + this.n.hashCode() + hashCode4 + (expression3 != null ? expression3.hashCode() : 0);
        List<v3> list4 = this.p;
        if (list4 != null) {
            Iterator<T> it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((v3) it4.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i21 = hashCode5 + i4;
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
        int i22 = i21 + i5;
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
        String str = this.x;
        int hashCode6 = i25 + (str != null ? str.hashCode() : 0);
        vmn vmnVar = this.z;
        int hash5 = hashCode6 + (vmnVar != null ? vmnVar.hash() : 0);
        List<DivAction> list10 = this.A;
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
        y3 y3Var = this.B;
        int hash6 = i26 + (y3Var != null ? y3Var.hash() : 0);
        y3 y3Var2 = this.C;
        int hash7 = hash6 + (y3Var2 != null ? y3Var2.hash() : 0);
        List<DivAction> list11 = this.D;
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
        List<DivAction> list12 = this.E;
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
        Expression<String> expression4 = this.F;
        int hashCode7 = i28 + (expression4 != null ? expression4.hashCode() : 0);
        Expression<Long> expression5 = this.G;
        int hashCode8 = hashCode7 + (expression5 != null ? expression5.hashCode() : 0);
        List<DivAction> list13 = this.H;
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
        List<DivTooltip> list14 = this.I;
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
        hd hdVar = this.J;
        int hash8 = i30 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.K;
        int hash9 = hash8 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.L;
        int hash10 = hash9 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.M;
        int hash11 = hash10 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list15 = this.N;
        int hashCode9 = hash11 + (list15 != null ? list15.hashCode() : 0);
        List<DivTrigger> list16 = this.O;
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
        List<md> list17 = this.P;
        if (list17 != null) {
            Iterator<T> it16 = list17.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((md) it16.next()).hash();
            }
        } else {
            i16 = 0;
        }
        int hashCode10 = this.Q.hashCode() + i31 + i16;
        zd zdVar = this.R;
        int hash12 = hashCode10 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list18 = this.S;
        if (list18 != null) {
            Iterator<T> it17 = list18.iterator();
            while (it17.hasNext()) {
                i17 += ((zd) it17.next()).hash();
            }
        }
        int hash13 = this.T.hash() + hash12 + i17;
        this.U = Integer.valueOf(hash13);
        return hash13;
    }

    @Override // xsna.ikn
    public final e1 q() {
        return this.L;
    }

    @Override // xsna.ikn
    public final List<w0> r() {
        return this.h;
    }

    @Override // xsna.ikn
    public final List<zd> s() {
        return this.S;
    }

    @Override // xsna.ikn
    public final d2 t() {
        return this.K;
    }

    @Override // xsna.ikn
    public final List<v3> u() {
        return this.p;
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
        return ((c5.f) BuiltInParserKt.getBuiltInParserComponent().R3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // xsna.ikn
    public final DivAccessibility x() {
        return this.a;
    }

    @Override // xsna.ikn
    public final y3 y() {
        return this.C;
    }

    @Override // xsna.ikn
    public final zd z() {
        return this.R;
    }
}
