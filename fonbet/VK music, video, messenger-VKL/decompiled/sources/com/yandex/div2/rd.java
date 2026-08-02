package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.sd;
import com.yandex.div2.td;
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

/* compiled from: DivVideo.kt */
/* loaded from: classes8.dex */
public final class rd implements JSONSerializable, Hashable, ikn {
    public final Expression<Boolean> A;
    public final Expression<String> B;
    public final Expression<Boolean> C;
    public final List<DivAction> D;
    public final Expression<String> E;
    public final Expression<Long> F;
    public final Expression<DivVideoScale> G;
    public final List<DivAction> H;
    public final List<DivTooltip> I;
    public final hd J;
    public final d2 K;
    public final e1 L;
    public final e1 M;
    public final List<DivTransitionTrigger> N;
    public final List<DivTrigger> O;
    public final List<md> P;
    public final List<td> Q;
    public final Expression<DivVisibility> R;
    public final zd S;
    public final List<zd> T;
    public final v9 U;
    public Integer V;
    public final DivAccessibility a;
    public final Expression<DivAlignmentHorizontal> b;
    public final Expression<DivAlignmentVertical> c;
    public final Expression<Double> d;
    public final List<w0> e;
    public final j1 f;
    public final Expression<Boolean> g;
    public final List<m1> h;
    public final u1 i;
    public final List<DivAction> j;
    public final Expression<Long> k;
    public final List<v3> l;
    public final String m;
    public final List<DivAction> n;
    public final List<zkn> o;
    public final List<DivAction> p;
    public final jln q;
    public final List<t4> r;
    public final v9 s;
    public final String t;
    public final vmn u;
    public final y3 v;
    public final Expression<Boolean> w;
    public final y3 x;
    public final List<DivAction> y;
    public final JSONObject z;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, DivVideoScale.FIT, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rd(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list, j1 j1Var, Expression<Boolean> expression4, List<? extends m1> list2, u1 u1Var, List<DivAction> list3, Expression<Long> expression5, List<v3> list4, String str, List<DivAction> list5, List<zkn> list6, List<DivAction> list7, jln jlnVar, List<t4> list8, v9 v9Var, String str2, vmn vmnVar, y3 y3Var, Expression<Boolean> expression6, y3 y3Var2, List<DivAction> list9, JSONObject jSONObject, Expression<Boolean> expression7, Expression<String> expression8, Expression<Boolean> expression9, List<DivAction> list10, Expression<String> expression10, Expression<Long> expression11, Expression<DivVideoScale> expression12, List<DivAction> list11, List<DivTooltip> list12, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list13, List<DivTrigger> list14, List<? extends md> list15, List<td> list16, Expression<DivVisibility> expression13, zd zdVar, List<zd> list17, v9 v9Var2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = j1Var;
        this.g = expression4;
        this.h = list2;
        this.i = u1Var;
        this.j = list3;
        this.k = expression5;
        this.l = list4;
        this.m = str;
        this.n = list5;
        this.o = list6;
        this.p = list7;
        this.q = jlnVar;
        this.r = list8;
        this.s = v9Var;
        this.t = str2;
        this.u = vmnVar;
        this.v = y3Var;
        this.w = expression6;
        this.x = y3Var2;
        this.y = list9;
        this.z = jSONObject;
        this.A = expression7;
        this.B = expression8;
        this.C = expression9;
        this.D = list10;
        this.E = expression10;
        this.F = expression11;
        this.G = expression12;
        this.H = list11;
        this.I = list12;
        this.J = hdVar;
        this.K = d2Var;
        this.L = e1Var;
        this.M = e1Var2;
        this.N = list13;
        this.O = list14;
        this.P = list15;
        this.Q = list16;
        this.R = expression13;
        this.S = zdVar;
        this.T = list17;
        this.U = v9Var2;
    }

    public static rd B(rd rdVar, String str) {
        DivAccessibility divAccessibility = rdVar.a;
        Expression<DivAlignmentHorizontal> expression = rdVar.b;
        Expression<DivAlignmentVertical> expression2 = rdVar.c;
        Expression<Double> expression3 = rdVar.d;
        List<w0> list = rdVar.e;
        j1 j1Var = rdVar.f;
        Expression<Boolean> expression4 = rdVar.g;
        List<m1> list2 = rdVar.h;
        u1 u1Var = rdVar.i;
        List<DivAction> list3 = rdVar.j;
        Expression<Long> expression5 = rdVar.k;
        List<v3> list4 = rdVar.l;
        String str2 = rdVar.m;
        List<DivAction> list5 = rdVar.n;
        List<zkn> list6 = rdVar.o;
        List<DivAction> list7 = rdVar.p;
        jln jlnVar = rdVar.q;
        List<t4> list8 = rdVar.r;
        v9 v9Var = rdVar.s;
        vmn vmnVar = rdVar.u;
        y3 y3Var = rdVar.v;
        Expression<Boolean> expression6 = rdVar.w;
        y3 y3Var2 = rdVar.x;
        List<DivAction> list9 = rdVar.y;
        JSONObject jSONObject = rdVar.z;
        Expression<Boolean> expression7 = rdVar.A;
        Expression<String> expression8 = rdVar.B;
        Expression<Boolean> expression9 = rdVar.C;
        List<DivAction> list10 = rdVar.D;
        Expression<String> expression10 = rdVar.E;
        Expression<Long> expression11 = rdVar.F;
        Expression<DivVideoScale> expression12 = rdVar.G;
        List<DivAction> list11 = rdVar.H;
        List<DivTooltip> list12 = rdVar.I;
        hd hdVar = rdVar.J;
        d2 d2Var = rdVar.K;
        e1 e1Var = rdVar.L;
        e1 e1Var2 = rdVar.M;
        List<DivTransitionTrigger> list13 = rdVar.N;
        List<DivTrigger> list14 = rdVar.O;
        List<md> list15 = rdVar.P;
        List<td> list16 = rdVar.Q;
        Expression<DivVisibility> expression13 = rdVar.R;
        zd zdVar = rdVar.S;
        List<zd> list17 = rdVar.T;
        v9 v9Var2 = rdVar.U;
        rdVar.getClass();
        return new rd(divAccessibility, expression, expression2, expression3, list, j1Var, expression4, list2, u1Var, list3, expression5, list4, str2, list5, list6, list7, jlnVar, list8, v9Var, str, vmnVar, y3Var, expression6, y3Var2, list9, jSONObject, expression7, expression8, expression9, list10, expression10, expression11, expression12, list11, list12, hdVar, d2Var, e1Var, e1Var2, list13, list14, list15, list16, expression13, zdVar, list17, v9Var2);
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:459:0x085d, code lost:
    
        if (r17 == null) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x071d, code lost:
    
        if (r19 == null) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x06d0, code lost:
    
        if (r20 == null) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0683, code lost:
    
        if (r21 == null) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x05e3, code lost:
    
        if (r26 == null) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0596, code lost:
    
        if (r27 == null) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x04fb, code lost:
    
        if (r28 == null) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0450, code lost:
    
        if (r29 == null) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0399, code lost:
    
        if (r34 == null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x033a, code lost:
    
        if (r11 == null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x02f3, code lost:
    
        if (r12 == null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x02ac, code lost:
    
        if (r13 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x025b, code lost:
    
        if (r14 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x01f4, code lost:
    
        if (r15 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x019b, code lost:
    
        if (r5 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0128, code lost:
    
        if (r7 == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:475:0x07ed A[LOOP:16: B:467:0x0740->B:475:0x07ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0734 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(rd rdVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        td.a aVar;
        boolean z17;
        boolean z18;
        if (rdVar == null) {
            return false;
        }
        List<zd> list = rdVar.T;
        zd zdVar = rdVar.S;
        List<md> list2 = rdVar.P;
        List<DivTrigger> list3 = rdVar.O;
        List<DivTransitionTrigger> list4 = rdVar.N;
        e1 e1Var = rdVar.M;
        e1 e1Var2 = rdVar.L;
        d2 d2Var = rdVar.K;
        hd hdVar = rdVar.J;
        List<DivTooltip> list5 = rdVar.I;
        List<DivAction> list6 = rdVar.H;
        List<DivAction> list7 = rdVar.D;
        List<zd> list8 = list;
        List<DivAction> list9 = rdVar.y;
        y3 y3Var = rdVar.x;
        List<md> list10 = list2;
        y3 y3Var2 = rdVar.v;
        List<DivTrigger> list11 = list3;
        vmn vmnVar = rdVar.u;
        List<DivTransitionTrigger> list12 = list4;
        List<t4> list13 = rdVar.r;
        jln jlnVar = rdVar.q;
        List<DivAction> list14 = rdVar.p;
        List<zkn> list15 = rdVar.o;
        List<DivAction> list16 = rdVar.n;
        List<DivTooltip> list17 = list5;
        List<v3> list18 = rdVar.l;
        List<DivAction> list19 = list6;
        List<DivAction> list20 = rdVar.j;
        List<DivAction> list21 = list7;
        u1 u1Var = rdVar.i;
        List<DivAction> list22 = list9;
        List<m1> list23 = rdVar.h;
        j1 j1Var = rdVar.f;
        List<w0> list24 = rdVar.e;
        DivAccessibility divAccessibility = rdVar.a;
        List<t4> list25 = list13;
        DivAccessibility divAccessibility2 = this.a;
        if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expression = this.b;
        DivAlignmentHorizontal evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expression2 = rdVar.b;
        if (evaluate != (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.c;
        DivAlignmentVertical evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expression4 = rdVar.c;
        if (evaluate2 != (expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(this.d.evaluate(expressionResolver).doubleValue() == rdVar.d.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<w0> list26 = this.e;
        if (list26 != null) {
            if (list24 != null) {
                if (list26.size() == list24.size()) {
                    int i = 0;
                    for (Object obj : list26) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        List<w0> list27 = list24;
                        if (((w0) obj).a(list24.get(i), expressionResolver, expressionResolver2)) {
                            i = i2;
                            list24 = list27;
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
        j1 j1Var2 = this.f;
        if (!(j1Var2 != null ? j1Var2.a(j1Var, expressionResolver, expressionResolver2) : j1Var == null) || this.g.evaluate(expressionResolver).booleanValue() != rdVar.g.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<m1> list28 = this.h;
        if (list28 != null) {
            if (list23 != null) {
                if (list28.size() == list23.size()) {
                    int i3 = 0;
                    for (Object obj2 : list28) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((m1) obj2).a(list23.get(i3), expressionResolver, expressionResolver2)) {
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
        u1 u1Var2 = this.i;
        if (!(u1Var2 != null ? u1Var2.a(u1Var, expressionResolver, expressionResolver2) : u1Var == null)) {
            return false;
        }
        List<DivAction> list29 = this.j;
        if (list29 != null) {
            if (list20 != null) {
                if (list29.size() == list20.size()) {
                    int i5 = 0;
                    for (Object obj3 : list29) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((DivAction) obj3).a(list20.get(i5), expressionResolver, expressionResolver2)) {
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
        Expression<Long> expression5 = this.k;
        Long evaluate3 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<Long> expression6 = rdVar.k;
        if (!epx.f(evaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<v3> list30 = this.l;
        if (list30 != null) {
            if (list18 != null) {
                if (list30.size() == list18.size()) {
                    int i7 = 0;
                    for (Object obj4 : list30) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((v3) obj4).g(list18.get(i7), expressionResolver, expressionResolver2)) {
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
        if (!z4 || !epx.f(this.m, rdVar.m)) {
            return false;
        }
        List<DivAction> list31 = this.n;
        if (list31 != null) {
            if (list16 != null) {
                if (list31.size() == list16.size()) {
                    int i9 = 0;
                    for (Object obj5 : list31) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((DivAction) obj5).a(list16.get(i9), expressionResolver, expressionResolver2)) {
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
        List<zkn> list32 = this.o;
        if (list32 != null) {
            if (list15 != null) {
                if (list32.size() == list15.size()) {
                    int i11 = 0;
                    for (Object obj6 : list32) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((zkn) obj6).a(list15.get(i11))) {
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
        List<DivAction> list33 = this.p;
        if (list33 != null) {
            if (list14 != null) {
                if (list33.size() == list14.size()) {
                    int i13 = 0;
                    for (Object obj7 : list33) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((DivAction) obj7).a(list14.get(i13), expressionResolver, expressionResolver2)) {
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
        if (!z7) {
            return false;
        }
        jln jlnVar2 = this.q;
        if (!(jlnVar2 != null ? jlnVar2.a(jlnVar, expressionResolver, expressionResolver2) : jlnVar == null)) {
            return false;
        }
        List<t4> list34 = this.r;
        if (list34 != null) {
            if (list25 != null) {
                if (list34.size() == list25.size()) {
                    int i15 = 0;
                    for (Object obj8 : list34) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<t4> list35 = list25;
                        if (((t4) obj8).a(list35.get(i15))) {
                            i15 = i16;
                            list25 = list35;
                        }
                    }
                    z8 = true;
                }
                z8 = false;
                break;
            }
            return false;
        }
        if (!z8 || !this.s.a(rdVar.s, expressionResolver, expressionResolver2) || !epx.f(this.t, rdVar.t)) {
            return false;
        }
        vmn vmnVar2 = this.u;
        if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
            return false;
        }
        y3 y3Var3 = this.v;
        if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null) || this.w.evaluate(expressionResolver).booleanValue() != rdVar.w.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        y3 y3Var4 = this.x;
        if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null)) {
            return false;
        }
        List<DivAction> list36 = this.y;
        if (list36 != null) {
            if (list22 != null) {
                if (list36.size() == list22.size()) {
                    int i17 = 0;
                    for (Object obj9 : list36) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivAction> list37 = list22;
                        if (((DivAction) obj9).a(list37.get(i17), expressionResolver, expressionResolver2)) {
                            i17 = i18;
                            list22 = list37;
                        }
                    }
                    z9 = true;
                }
                z9 = false;
                break;
            }
            return false;
        }
        if (!z9 || !epx.f(this.z, rdVar.z) || this.A.evaluate(expressionResolver).booleanValue() != rdVar.A.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<String> expression7 = this.B;
        String evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<String> expression8 = rdVar.B;
        if (!epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null) || this.C.evaluate(expressionResolver).booleanValue() != rdVar.C.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> list38 = this.D;
        if (list38 != null) {
            if (list21 != null) {
                if (list38.size() == list21.size()) {
                    int i19 = 0;
                    for (Object obj10 : list38) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivAction> list39 = list21;
                        if (((DivAction) obj10).a(list39.get(i19), expressionResolver, expressionResolver2)) {
                            i19 = i20;
                            list21 = list39;
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
        Expression<String> expression9 = this.E;
        String evaluate5 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
        Expression<String> expression10 = rdVar.E;
        if (!epx.f(evaluate5, expression10 != null ? expression10.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression11 = this.F;
        Long evaluate6 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
        Expression<Long> expression12 = rdVar.F;
        if (!epx.f(evaluate6, expression12 != null ? expression12.evaluate(expressionResolver2) : null) || this.G.evaluate(expressionResolver) != rdVar.G.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAction> list40 = this.H;
        if (list40 != null) {
            if (list19 != null) {
                if (list40.size() == list19.size()) {
                    int i21 = 0;
                    for (Object obj11 : list40) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivAction> list41 = list19;
                        if (((DivAction) obj11).a(list41.get(i21), expressionResolver, expressionResolver2)) {
                            i21 = i22;
                            list19 = list41;
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
        List<DivTooltip> list42 = this.I;
        if (list42 != null) {
            if (list17 != null) {
                if (list42.size() == list17.size()) {
                    int i23 = 0;
                    for (Object obj12 : list42) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTooltip> list43 = list17;
                        if (((DivTooltip) obj12).a(list43.get(i23), expressionResolver, expressionResolver2)) {
                            i23 = i24;
                            list17 = list43;
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
        List<DivTransitionTrigger> list44 = this.N;
        if (list44 != null) {
            if (list12 != null) {
                if (list44.size() == list12.size()) {
                    int i25 = 0;
                    for (Object obj13 : list44) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTransitionTrigger> list45 = list12;
                        if (((DivTransitionTrigger) obj13) == list45.get(i25)) {
                            i25 = i26;
                            list12 = list45;
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
        List<DivTrigger> list46 = this.O;
        if (list46 != null) {
            if (list11 != null) {
                if (list46.size() == list11.size()) {
                    int i27 = 0;
                    for (Object obj14 : list46) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTrigger> list47 = list11;
                        if (((DivTrigger) obj14).a(list47.get(i27), expressionResolver, expressionResolver2)) {
                            i27 = i28;
                            list11 = list47;
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
        List<md> list48 = this.P;
        if (list48 != null) {
            if (list10 != null) {
                if (list48.size() == list10.size()) {
                    int i29 = 0;
                    for (Object obj15 : list48) {
                        int i30 = i29 + 1;
                        if (i29 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<md> list49 = list10;
                        if (((md) obj15).a(list49.get(i29), expressionResolver, expressionResolver2)) {
                            i29 = i30;
                            list10 = list49;
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
        List<td> list50 = rdVar.Q;
        List<td> list51 = this.Q;
        if (list51.size() == list50.size()) {
            int i31 = 0;
            for (Object obj16 : list51) {
                int i32 = i31 + 1;
                if (i31 < 0) {
                    e43.t();
                    throw null;
                }
                td tdVar = list50.get(i31);
                td tdVar2 = (td) obj16;
                tdVar2.getClass();
                if (tdVar != null) {
                    td.a aVar2 = tdVar.c;
                    Expression<Long> expression13 = tdVar2.a;
                    Long evaluate7 = expression13 != null ? expression13.evaluate(expressionResolver) : null;
                    Expression<Long> expression14 = tdVar.a;
                    if (epx.f(evaluate7, expression14 != null ? expression14.evaluate(expressionResolver2) : null) && epx.f(tdVar2.b.evaluate(expressionResolver), tdVar.b.evaluate(expressionResolver2)) && ((aVar = tdVar2.c) == null ? aVar2 == null : !(aVar2 == null || aVar.a.evaluate(expressionResolver).longValue() != aVar2.a.evaluate(expressionResolver2).longValue() || aVar.b.evaluate(expressionResolver).longValue() != aVar2.b.evaluate(expressionResolver2).longValue())) && epx.f(tdVar2.d.evaluate(expressionResolver), tdVar.d.evaluate(expressionResolver2))) {
                        z17 = true;
                        if (!z17) {
                            i31 = i32;
                        }
                    }
                }
                z17 = false;
                if (!z17) {
                }
            }
            z16 = true;
            if (!z16 && this.R.evaluate(expressionResolver) == rdVar.R.evaluate(expressionResolver2)) {
                zd zdVar2 = this.S;
                if (!(zdVar2 != null ? zdVar2.g(zdVar, expressionResolver, expressionResolver2) : zdVar == null)) {
                    return false;
                }
                List<zd> list52 = this.T;
                if (list52 != null) {
                    if (list8 != null) {
                        if (list52.size() == list8.size()) {
                            int i33 = 0;
                            for (Object obj17 : list52) {
                                int i34 = i33 + 1;
                                if (i33 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                List<zd> list53 = list8;
                                if (((zd) obj17).g(list53.get(i33), expressionResolver, expressionResolver2)) {
                                    i33 = i34;
                                    list8 = list53;
                                }
                            }
                            z18 = true;
                        }
                        z18 = false;
                        break;
                    }
                    return false;
                }
                return z18 && this.U.a(rdVar.U, expressionResolver, expressionResolver2);
            }
        }
        z16 = false;
        return !z16 ? false : false;
    }

    @Override // xsna.ikn
    public final Expression<Double> a() {
        return this.d;
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
        return this.i;
    }

    @Override // xsna.ikn
    public final Expression<Long> e() {
        return this.k;
    }

    @Override // xsna.ikn
    public final List<md> f() {
        return this.P;
    }

    @Override // xsna.ikn
    public final y3 g() {
        return this.v;
    }

    @Override // xsna.ikn
    public final List<m1> getBackground() {
        return this.h;
    }

    @Override // xsna.ikn
    public final v9 getHeight() {
        return this.s;
    }

    @Override // xsna.ikn
    public final String getId() {
        return this.t;
    }

    @Override // xsna.ikn
    public final Expression<DivVisibility> getVisibility() {
        return this.R;
    }

    @Override // xsna.ikn
    public final v9 getWidth() {
        return this.U;
    }

    @Override // xsna.ikn
    public final Expression<Long> h() {
        return this.F;
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
        Integer num = this.V;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(rd.class).hashCode();
        int i15 = 0;
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
        int i16 = hashCode3 + i;
        j1 j1Var = this.f;
        int hashCode4 = this.g.hashCode() + i16 + (j1Var != null ? j1Var.hash() : 0);
        List<m1> list2 = this.h;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((m1) it2.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int i17 = hashCode4 + i2;
        u1 u1Var = this.i;
        int hash2 = i17 + (u1Var != null ? u1Var.hash() : 0);
        List<DivAction> list3 = this.j;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((DivAction) it3.next()).hash();
            }
        } else {
            i3 = 0;
        }
        int i18 = hash2 + i3;
        Expression<Long> expression3 = this.k;
        int hashCode5 = i18 + (expression3 != null ? expression3.hashCode() : 0);
        List<v3> list4 = this.l;
        if (list4 != null) {
            Iterator<T> it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((v3) it4.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i19 = hashCode5 + i4;
        String str = this.m;
        int hashCode6 = i19 + (str != null ? str.hashCode() : 0);
        List<DivAction> list5 = this.n;
        if (list5 != null) {
            Iterator<T> it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((DivAction) it5.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int i20 = hashCode6 + i5;
        List<zkn> list6 = this.o;
        if (list6 != null) {
            Iterator<T> it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((zkn) it6.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i21 = i20 + i6;
        List<DivAction> list7 = this.p;
        if (list7 != null) {
            Iterator<T> it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((DivAction) it7.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int i22 = i21 + i7;
        jln jlnVar = this.q;
        int hash3 = i22 + (jlnVar != null ? jlnVar.hash() : 0);
        List<t4> list8 = this.r;
        if (list8 != null) {
            Iterator<T> it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((t4) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int hash4 = this.s.hash() + hash3 + i8;
        String str2 = this.t;
        int hashCode7 = hash4 + (str2 != null ? str2.hashCode() : 0);
        vmn vmnVar = this.u;
        int hash5 = hashCode7 + (vmnVar != null ? vmnVar.hash() : 0);
        y3 y3Var = this.v;
        int hashCode8 = this.w.hashCode() + hash5 + (y3Var != null ? y3Var.hash() : 0);
        y3 y3Var2 = this.x;
        int hash6 = hashCode8 + (y3Var2 != null ? y3Var2.hash() : 0);
        List<DivAction> list9 = this.y;
        if (list9 != null) {
            Iterator<T> it9 = list9.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((DivAction) it9.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int i23 = hash6 + i9;
        JSONObject jSONObject = this.z;
        int hashCode9 = this.A.hashCode() + i23 + (jSONObject != null ? jSONObject.hashCode() : 0);
        Expression<String> expression4 = this.B;
        int hashCode10 = this.C.hashCode() + hashCode9 + (expression4 != null ? expression4.hashCode() : 0);
        List<DivAction> list10 = this.D;
        if (list10 != null) {
            Iterator<T> it10 = list10.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((DivAction) it10.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i24 = hashCode10 + i10;
        Expression<String> expression5 = this.E;
        int hashCode11 = i24 + (expression5 != null ? expression5.hashCode() : 0);
        Expression<Long> expression6 = this.F;
        int hashCode12 = this.G.hashCode() + hashCode11 + (expression6 != null ? expression6.hashCode() : 0);
        List<DivAction> list11 = this.H;
        if (list11 != null) {
            Iterator<T> it11 = list11.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((DivAction) it11.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i25 = hashCode12 + i11;
        List<DivTooltip> list12 = this.I;
        if (list12 != null) {
            Iterator<T> it12 = list12.iterator();
            i12 = 0;
            while (it12.hasNext()) {
                i12 += ((DivTooltip) it12.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int i26 = i25 + i12;
        hd hdVar = this.J;
        int hash7 = i26 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.K;
        int hash8 = hash7 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.L;
        int hash9 = hash8 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.M;
        int hash10 = hash9 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list13 = this.N;
        int hashCode13 = hash10 + (list13 != null ? list13.hashCode() : 0);
        List<DivTrigger> list14 = this.O;
        if (list14 != null) {
            Iterator<T> it13 = list14.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((DivTrigger) it13.next()).hash();
            }
        } else {
            i13 = 0;
        }
        int i27 = hashCode13 + i13;
        List<md> list15 = this.P;
        if (list15 != null) {
            Iterator<T> it14 = list15.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((md) it14.next()).hash();
            }
        } else {
            i14 = 0;
        }
        int i28 = i27 + i14;
        Iterator<T> it15 = this.Q.iterator();
        int i29 = 0;
        while (it15.hasNext()) {
            i29 += ((td) it15.next()).hash();
        }
        int hashCode14 = this.R.hashCode() + i28 + i29;
        zd zdVar = this.S;
        int hash11 = hashCode14 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list16 = this.T;
        if (list16 != null) {
            Iterator<T> it16 = list16.iterator();
            while (it16.hasNext()) {
                i15 += ((zd) it16.next()).hash();
            }
        }
        int hash12 = this.U.hash() + hash11 + i15;
        this.V = Integer.valueOf(hash12);
        return hash12;
    }

    @Override // xsna.ikn
    public final Expression<String> i() {
        return this.E;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentHorizontal> j() {
        return this.b;
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
        return this.o;
    }

    @Override // xsna.ikn
    public final List<DivAction> n() {
        return this.H;
    }

    @Override // xsna.ikn
    public final vmn o() {
        return this.u;
    }

    @Override // xsna.ikn
    public final List<DivTrigger> p() {
        return this.O;
    }

    @Override // xsna.ikn
    public final e1 q() {
        return this.L;
    }

    @Override // xsna.ikn
    public final List<w0> r() {
        return this.e;
    }

    @Override // xsna.ikn
    public final List<zd> s() {
        return this.T;
    }

    @Override // xsna.ikn
    public final d2 t() {
        return this.K;
    }

    @Override // xsna.ikn
    public final List<v3> u() {
        return this.l;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentVertical> v() {
        return this.c;
    }

    @Override // xsna.ikn
    public final jln w() {
        return this.q;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((sd.e) BuiltInParserKt.getBuiltInParserComponent().q9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // xsna.ikn
    public final DivAccessibility x() {
        return this.a;
    }

    @Override // xsna.ikn
    public final y3 y() {
        return this.x;
    }

    @Override // xsna.ikn
    public final zd z() {
        return this.S;
    }
}
