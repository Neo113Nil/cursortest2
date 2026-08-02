package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.v9;
import com.yandex.div2.z4;
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

/* compiled from: DivGifImage.kt */
/* loaded from: classes8.dex */
public final class y4 implements JSONSerializable, Hashable, ikn {
    public final List<DivAction> A;
    public final y3 B;
    public final y3 C;
    public final Expression<Integer> D;
    public final Expression<Boolean> E;
    public final List<DivAction> F;
    public final List<DivAction> G;
    public final Expression<String> H;
    public final Expression<String> I;
    public final Expression<Long> J;
    public final Expression<DivImageScale> K;
    public final List<DivAction> L;
    public final List<DivTooltip> M;
    public final hd N;
    public final d2 O;
    public final e1 P;
    public final e1 Q;
    public final List<DivTransitionTrigger> R;
    public final List<DivTrigger> S;
    public final List<md> T;
    public final Expression<DivVisibility> U;
    public final zd V;
    public final List<zd> W;
    public final v9 X;
    public Integer Y;
    public final DivAccessibility a;
    public final DivAction b;
    public final DivAnimation c;
    public final List<DivAction> d;
    public final Expression<DivAlignmentHorizontal> e;
    public final Expression<DivAlignmentVertical> f;
    public final Expression<Double> g;
    public final List<w0> h;
    public final j1 i;
    public final List<m1> j;
    public final u1 k;
    public final Expression<Boolean> l;
    public final Expression<Long> m;
    public final Expression<DivAlignmentHorizontal> n;
    public final Expression<DivAlignmentVertical> o;
    public final List<v3> p;
    public final List<DivAction> q;
    public final List<zkn> r;
    public final jln s;
    public final List<t4> t;
    public final Expression<Uri> u;
    public final v9 v;
    public final List<DivAction> w;
    public final List<DivAction> x;
    public final String y;
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
        Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y4(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list2, j1 j1Var, List<? extends m1> list3, u1 u1Var, Expression<Boolean> expression4, Expression<Long> expression5, Expression<DivAlignmentHorizontal> expression6, Expression<DivAlignmentVertical> expression7, List<v3> list4, List<DivAction> list5, List<zkn> list6, jln jlnVar, List<t4> list7, Expression<Uri> expression8, v9 v9Var, List<DivAction> list8, List<DivAction> list9, String str, vmn vmnVar, List<DivAction> list10, y3 y3Var, y3 y3Var2, Expression<Integer> expression9, Expression<Boolean> expression10, List<DivAction> list11, List<DivAction> list12, Expression<String> expression11, Expression<String> expression12, Expression<Long> expression13, Expression<DivImageScale> expression14, List<DivAction> list13, List<DivTooltip> list14, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list15, List<DivTrigger> list16, List<? extends md> list17, Expression<DivVisibility> expression15, zd zdVar, List<zd> list18, v9 v9Var2) {
        this.a = divAccessibility;
        this.b = divAction;
        this.c = divAnimation;
        this.d = list;
        this.e = expression;
        this.f = expression2;
        this.g = expression3;
        this.h = list2;
        this.i = j1Var;
        this.j = list3;
        this.k = u1Var;
        this.l = expression4;
        this.m = expression5;
        this.n = expression6;
        this.o = expression7;
        this.p = list4;
        this.q = list5;
        this.r = list6;
        this.s = jlnVar;
        this.t = list7;
        this.u = expression8;
        this.v = v9Var;
        this.w = list8;
        this.x = list9;
        this.y = str;
        this.z = vmnVar;
        this.A = list10;
        this.B = y3Var;
        this.C = y3Var2;
        this.D = expression9;
        this.E = expression10;
        this.F = list11;
        this.G = list12;
        this.H = expression11;
        this.I = expression12;
        this.J = expression13;
        this.K = expression14;
        this.L = list13;
        this.M = list14;
        this.N = hdVar;
        this.O = d2Var;
        this.P = e1Var;
        this.Q = e1Var2;
        this.R = list15;
        this.S = list16;
        this.T = list17;
        this.U = expression15;
        this.V = zdVar;
        this.W = list18;
        this.X = v9Var2;
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:500:0x0847, code lost:
    
        if (r17 == null) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x07d9, code lost:
    
        if (r19 == null) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x078c, code lost:
    
        if (r20 == null) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x073f, code lost:
    
        if (r21 == null) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x069f, code lost:
    
        if (r26 == null) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0652, code lost:
    
        if (r27 == null) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0597, code lost:
    
        if (r28 == null) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x054a, code lost:
    
        if (r29 == null) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x04a1, code lost:
    
        if (r32 == null) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0436, code lost:
    
        if (r34 == null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x03e9, code lost:
    
        if (r35 == null) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0380, code lost:
    
        if (r37 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0321, code lost:
    
        if (r14 == null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x02da, code lost:
    
        if (r15 == null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0293, code lost:
    
        if (r4 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x01e4, code lost:
    
        if (r6 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x018b, code lost:
    
        if (r8 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x00e9, code lost:
    
        if (r9 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(y4 y4Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (y4Var == null) {
            return false;
        }
        List<zd> list = y4Var.W;
        zd zdVar = y4Var.V;
        List<md> list2 = y4Var.T;
        List<DivTrigger> list3 = y4Var.S;
        List<DivTransitionTrigger> list4 = y4Var.R;
        e1 e1Var = y4Var.Q;
        e1 e1Var2 = y4Var.P;
        d2 d2Var = y4Var.O;
        hd hdVar = y4Var.N;
        List<DivTooltip> list5 = y4Var.M;
        List<DivAction> list6 = y4Var.L;
        List<DivAction> list7 = y4Var.G;
        List<zd> list8 = list;
        List<DivAction> list9 = y4Var.F;
        y3 y3Var = y4Var.C;
        List<md> list10 = list2;
        y3 y3Var2 = y4Var.B;
        List<DivTrigger> list11 = list3;
        List<DivAction> list12 = y4Var.A;
        List<DivTransitionTrigger> list13 = list4;
        vmn vmnVar = y4Var.z;
        List<DivAction> list14 = y4Var.x;
        List<DivAction> list15 = y4Var.w;
        List<t4> list16 = y4Var.t;
        jln jlnVar = y4Var.s;
        List<DivTooltip> list17 = list5;
        List<zkn> list18 = y4Var.r;
        List<DivAction> list19 = list6;
        List<DivAction> list20 = y4Var.q;
        List<DivAction> list21 = list7;
        List<v3> list22 = y4Var.p;
        List<DivAction> list23 = list9;
        u1 u1Var = y4Var.k;
        List<m1> list24 = y4Var.j;
        j1 j1Var = y4Var.i;
        List<DivAction> list25 = list12;
        List<w0> list26 = y4Var.h;
        List<DivAction> list27 = y4Var.d;
        List<DivAction> list28 = list14;
        DivAction divAction = y4Var.b;
        List<DivAction> list29 = list15;
        DivAccessibility divAccessibility = y4Var.a;
        List<t4> list30 = list16;
        DivAccessibility divAccessibility2 = this.a;
        if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
            return false;
        }
        DivAction divAction2 = this.b;
        if (!(divAction2 != null ? divAction2.a(divAction, expressionResolver, expressionResolver2) : divAction == null) || !this.c.a(y4Var.c, expressionResolver, expressionResolver2)) {
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
        Expression<DivAlignmentHorizontal> expression2 = y4Var.e;
        if (obj2 != (expression2 != null ? (DivAlignmentHorizontal) expression2.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.f;
        Object obj3 = expression3 != null ? (DivAlignmentVertical) expression3.evaluate(expressionResolver) : th;
        Expression<DivAlignmentVertical> expression4 = y4Var.f;
        if (obj3 != (expression4 != null ? (DivAlignmentVertical) expression4.evaluate(expressionResolver2) : th)) {
            return false;
        }
        if (!(this.g.evaluate(expressionResolver).doubleValue() == y4Var.g.evaluate(expressionResolver2).doubleValue())) {
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
        j1 j1Var2 = this.i;
        if (!(j1Var2 != null ? j1Var2.a(j1Var, expressionResolver, expressionResolver2) : j1Var == null)) {
            return false;
        }
        List<m1> list33 = this.j;
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
        u1 u1Var2 = this.k;
        if (!(u1Var2 != null ? u1Var2.a(u1Var, expressionResolver, expressionResolver2) : u1Var == null) || this.l.evaluate(expressionResolver).booleanValue() != y4Var.l.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expression5 = this.m;
        Long evaluate = expression5 != null ? expression5.evaluate(expressionResolver) : th;
        Expression<Long> expression6 = y4Var.m;
        if (!epx.f(evaluate, expression6 != null ? expression6.evaluate(expressionResolver2) : th) || this.n.evaluate(expressionResolver) != y4Var.n.evaluate(expressionResolver2) || this.o.evaluate(expressionResolver) != y4Var.o.evaluate(expressionResolver2)) {
            return false;
        }
        List<v3> list34 = this.p;
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
        List<DivAction> list35 = this.q;
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
        List<zkn> list36 = this.r;
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
        jln jlnVar2 = this.s;
        if (!(jlnVar2 != null ? jlnVar2.a(jlnVar, expressionResolver, expressionResolver2) : jlnVar == null)) {
            return false;
        }
        List<t4> list37 = this.t;
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
        if (!z7 || !epx.f(this.u.evaluate(expressionResolver), y4Var.u.evaluate(expressionResolver2)) || !this.v.a(y4Var.v, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list39 = this.w;
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
        List<DivAction> list41 = this.x;
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
        if (!z9 || !epx.f(this.y, y4Var.y)) {
            return false;
        }
        vmn vmnVar2 = this.z;
        if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
            return false;
        }
        List<DivAction> list43 = this.A;
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
        y3 y3Var3 = this.B;
        if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null)) {
            return false;
        }
        y3 y3Var4 = this.C;
        if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null) || this.D.evaluate(expressionResolver).intValue() != y4Var.D.evaluate(expressionResolver2).intValue() || this.E.evaluate(expressionResolver).booleanValue() != y4Var.E.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<DivAction> list45 = this.F;
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
        List<DivAction> list47 = this.G;
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
        Expression<String> expression7 = this.H;
        String evaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : th;
        Expression<String> expression8 = y4Var.H;
        if (!epx.f(evaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<String> expression9 = this.I;
        String evaluate3 = expression9 != null ? expression9.evaluate(expressionResolver) : th;
        Expression<String> expression10 = y4Var.I;
        if (!epx.f(evaluate3, expression10 != null ? expression10.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<Long> expression11 = this.J;
        Long evaluate4 = expression11 != null ? expression11.evaluate(expressionResolver) : th;
        Expression<Long> expression12 = y4Var.J;
        if (!epx.f(evaluate4, expression12 != null ? expression12.evaluate(expressionResolver2) : th) || this.K.evaluate(expressionResolver) != y4Var.K.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAction> list49 = this.L;
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
        List<DivTooltip> list51 = this.M;
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
        hd hdVar2 = this.N;
        if (!(hdVar2 != null ? hdVar2.a(hdVar, expressionResolver, expressionResolver2) : hdVar == null)) {
            return false;
        }
        d2 d2Var2 = this.O;
        if (!(d2Var2 != null ? d2Var2.a(d2Var, expressionResolver, expressionResolver2) : d2Var == null)) {
            return false;
        }
        e1 e1Var3 = this.P;
        if (!(e1Var3 != null ? e1Var3.a(e1Var2, expressionResolver, expressionResolver2) : e1Var2 == null)) {
            return false;
        }
        e1 e1Var4 = this.Q;
        if (!(e1Var4 != null ? e1Var4.a(e1Var, expressionResolver, expressionResolver2) : e1Var == null)) {
            return false;
        }
        List<DivTransitionTrigger> list53 = this.R;
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
        List<DivTrigger> list55 = this.S;
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
        List<md> list57 = this.T;
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
        if (!z17 || this.U.evaluate(expressionResolver) != y4Var.U.evaluate(expressionResolver2)) {
            return false;
        }
        zd zdVar2 = this.V;
        if (!(zdVar2 != null ? zdVar2.g(zdVar, expressionResolver, expressionResolver2) : zdVar == null)) {
            return false;
        }
        List<zd> list59 = this.W;
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
        return z18 && this.X.a(y4Var.X, expressionResolver, expressionResolver2);
    }

    @Override // xsna.ikn
    public final Expression<Double> a() {
        return this.g;
    }

    @Override // xsna.ikn
    public final List<DivTooltip> b() {
        return this.M;
    }

    @Override // xsna.ikn
    public final hd c() {
        return this.N;
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
        return this.T;
    }

    @Override // xsna.ikn
    public final y3 g() {
        return this.B;
    }

    @Override // xsna.ikn
    public final List<m1> getBackground() {
        return this.j;
    }

    @Override // xsna.ikn
    public final v9 getHeight() {
        return this.v;
    }

    @Override // xsna.ikn
    public final String getId() {
        return this.y;
    }

    @Override // xsna.ikn
    public final Expression<DivVisibility> getVisibility() {
        return this.U;
    }

    @Override // xsna.ikn
    public final v9 getWidth() {
        return this.X;
    }

    @Override // xsna.ikn
    public final Expression<Long> h() {
        return this.J;
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
        Integer num = this.Y;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(y4.class).hashCode();
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
        j1 j1Var = this.i;
        int hash3 = i19 + (j1Var != null ? j1Var.hash() : 0);
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
        int i20 = hash3 + i3;
        u1 u1Var = this.k;
        int hashCode4 = this.l.hashCode() + i20 + (u1Var != null ? u1Var.hash() : 0);
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
        int hash4 = i23 + (jlnVar != null ? jlnVar.hash() : 0);
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
        int hash5 = this.v.hash() + this.u.hashCode() + hash4 + i7;
        List<DivAction> list8 = this.w;
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
        List<DivAction> list9 = this.x;
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
        String str = this.y;
        int hashCode6 = i25 + (str != null ? str.hashCode() : 0);
        vmn vmnVar = this.z;
        int hash6 = hashCode6 + (vmnVar != null ? vmnVar.hash() : 0);
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
        int i26 = hash6 + i10;
        y3 y3Var = this.B;
        int hash7 = i26 + (y3Var != null ? y3Var.hash() : 0);
        y3 y3Var2 = this.C;
        int hashCode7 = this.E.hashCode() + this.D.hashCode() + hash7 + (y3Var2 != null ? y3Var2.hash() : 0);
        List<DivAction> list11 = this.F;
        if (list11 != null) {
            Iterator<T> it11 = list11.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((DivAction) it11.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i27 = hashCode7 + i11;
        List<DivAction> list12 = this.G;
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
        Expression<String> expression4 = this.H;
        int hashCode8 = i28 + (expression4 != null ? expression4.hashCode() : 0);
        Expression<String> expression5 = this.I;
        int hashCode9 = hashCode8 + (expression5 != null ? expression5.hashCode() : 0);
        Expression<Long> expression6 = this.J;
        int hashCode10 = this.K.hashCode() + hashCode9 + (expression6 != null ? expression6.hashCode() : 0);
        List<DivAction> list13 = this.L;
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
        List<DivTooltip> list14 = this.M;
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
        hd hdVar = this.N;
        int hash8 = i30 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.O;
        int hash9 = hash8 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.P;
        int hash10 = hash9 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.Q;
        int hash11 = hash10 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list15 = this.R;
        int hashCode11 = hash11 + (list15 != null ? list15.hashCode() : 0);
        List<DivTrigger> list16 = this.S;
        if (list16 != null) {
            Iterator<T> it15 = list16.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((DivTrigger) it15.next()).hash();
            }
        } else {
            i15 = 0;
        }
        int i31 = hashCode11 + i15;
        List<md> list17 = this.T;
        if (list17 != null) {
            Iterator<T> it16 = list17.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((md) it16.next()).hash();
            }
        } else {
            i16 = 0;
        }
        int hashCode12 = this.U.hashCode() + i31 + i16;
        zd zdVar = this.V;
        int hash12 = hashCode12 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list18 = this.W;
        if (list18 != null) {
            Iterator<T> it17 = list18.iterator();
            while (it17.hasNext()) {
                i17 += ((zd) it17.next()).hash();
            }
        }
        int hash13 = this.X.hash() + hash12 + i17;
        this.Y = Integer.valueOf(hash13);
        return hash13;
    }

    @Override // xsna.ikn
    public final Expression<String> i() {
        return this.I;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentHorizontal> j() {
        return this.e;
    }

    @Override // xsna.ikn
    public final e1 k() {
        return this.Q;
    }

    @Override // xsna.ikn
    public final List<DivTransitionTrigger> l() {
        return this.R;
    }

    @Override // xsna.ikn
    public final List<zkn> m() {
        return this.r;
    }

    @Override // xsna.ikn
    public final List<DivAction> n() {
        return this.L;
    }

    @Override // xsna.ikn
    public final vmn o() {
        return this.z;
    }

    @Override // xsna.ikn
    public final List<DivTrigger> p() {
        return this.S;
    }

    @Override // xsna.ikn
    public final e1 q() {
        return this.P;
    }

    @Override // xsna.ikn
    public final List<w0> r() {
        return this.h;
    }

    @Override // xsna.ikn
    public final List<zd> s() {
        return this.W;
    }

    @Override // xsna.ikn
    public final d2 t() {
        return this.O;
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
        return ((z4.g) BuiltInParserKt.getBuiltInParserComponent().O3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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
        return this.V;
    }
}
