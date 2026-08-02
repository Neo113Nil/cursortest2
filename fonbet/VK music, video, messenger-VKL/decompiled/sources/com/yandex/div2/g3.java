package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.h3;
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

/* compiled from: DivCustom.kt */
/* loaded from: classes8.dex */
public final class g3 implements JSONSerializable, Hashable, ikn {
    public final e1 A;
    public final e1 B;
    public final List<DivTransitionTrigger> C;
    public final List<DivTrigger> D;
    public final List<md> E;
    public final Expression<DivVisibility> F;
    public final zd G;
    public final List<zd> H;
    public final v9 I;
    public Integer J;
    public Integer K;
    public final DivAccessibility a;
    public final Expression<DivAlignmentHorizontal> b;
    public final Expression<DivAlignmentVertical> c;
    public final Expression<Double> d;
    public final List<w0> e;
    public final List<m1> f;
    public final u1 g;
    public final Expression<Long> h;
    public final JSONObject i;
    public final String j;
    public final List<v3> k;
    public final List<zkn> l;
    public final jln m;
    public final List<t4> n;
    public final v9 o;
    public final String p;
    public final List<a> q;
    public final vmn r;
    public final y3 s;
    public final y3 t;
    public final Expression<String> u;
    public final Expression<Long> v;
    public final List<DivAction> w;
    public final List<DivTooltip> x;
    public final hd y;
    public final d2 z;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g3(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list, List<? extends m1> list2, u1 u1Var, Expression<Long> expression4, JSONObject jSONObject, String str, List<v3> list3, List<zkn> list4, jln jlnVar, List<t4> list5, v9 v9Var, String str2, List<? extends a> list6, vmn vmnVar, y3 y3Var, y3 y3Var2, Expression<String> expression5, Expression<Long> expression6, List<DivAction> list7, List<DivTooltip> list8, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list9, List<DivTrigger> list10, List<? extends md> list11, Expression<DivVisibility> expression7, zd zdVar, List<zd> list12, v9 v9Var2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = list2;
        this.g = u1Var;
        this.h = expression4;
        this.i = jSONObject;
        this.j = str;
        this.k = list3;
        this.l = list4;
        this.m = jlnVar;
        this.n = list5;
        this.o = v9Var;
        this.p = str2;
        this.q = list6;
        this.r = vmnVar;
        this.s = y3Var;
        this.t = y3Var2;
        this.u = expression5;
        this.v = expression6;
        this.w = list7;
        this.x = list8;
        this.y = hdVar;
        this.z = d2Var;
        this.A = e1Var;
        this.B = e1Var2;
        this.C = list9;
        this.D = list10;
        this.E = list11;
        this.F = expression7;
        this.G = zdVar;
        this.H = list12;
        this.I = v9Var2;
    }

    public static g3 B(g3 g3Var, String str, List list, int i) {
        DivAccessibility divAccessibility;
        String str2;
        DivAccessibility divAccessibility2 = g3Var.a;
        Expression<DivAlignmentHorizontal> expression = g3Var.b;
        Expression<DivAlignmentVertical> expression2 = g3Var.c;
        Expression<Double> expression3 = g3Var.d;
        List<w0> list2 = g3Var.e;
        List<m1> list3 = g3Var.f;
        u1 u1Var = g3Var.g;
        Expression<Long> expression4 = g3Var.h;
        JSONObject jSONObject = g3Var.i;
        String str3 = g3Var.j;
        List<v3> list4 = g3Var.k;
        List<zkn> list5 = g3Var.l;
        jln jlnVar = g3Var.m;
        List<t4> list6 = g3Var.n;
        v9 v9Var = g3Var.o;
        if ((i & 32768) != 0) {
            divAccessibility = divAccessibility2;
            str2 = g3Var.p;
        } else {
            divAccessibility = divAccessibility2;
            str2 = str;
        }
        String str4 = str2;
        List list7 = (i & 65536) != 0 ? g3Var.q : list;
        vmn vmnVar = g3Var.r;
        y3 y3Var = g3Var.s;
        y3 y3Var2 = g3Var.t;
        Expression<String> expression5 = g3Var.u;
        Expression<Long> expression6 = g3Var.v;
        List<DivAction> list8 = g3Var.w;
        List<DivTooltip> list9 = g3Var.x;
        hd hdVar = g3Var.y;
        d2 d2Var = g3Var.z;
        e1 e1Var = g3Var.A;
        e1 e1Var2 = g3Var.B;
        List<DivTransitionTrigger> list10 = g3Var.C;
        List<DivTrigger> list11 = g3Var.D;
        List<md> list12 = g3Var.E;
        Expression<DivVisibility> expression7 = g3Var.F;
        zd zdVar = g3Var.G;
        List<zd> list13 = g3Var.H;
        v9 v9Var2 = g3Var.I;
        g3Var.getClass();
        return new g3(divAccessibility, expression, expression2, expression3, list2, list3, u1Var, expression4, jSONObject, str3, list4, list5, jlnVar, list6, v9Var, str4, list7, vmnVar, y3Var, y3Var2, expression5, expression6, list8, list9, hdVar, d2Var, e1Var, e1Var2, list10, list11, list12, expression7, zdVar, list13, v9Var2);
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:353:0x059a, code lost:
    
        if (r17 == null) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x052c, code lost:
    
        if (r19 == null) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x04df, code lost:
    
        if (r20 == null) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0492, code lost:
    
        if (r21 == null) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x03f2, code lost:
    
        if (r26 == null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x03a5, code lost:
    
        if (r27 == null) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x02e0, code lost:
    
        if (r7 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0285, code lost:
    
        if (r8 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x022c, code lost:
    
        if (r10 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x01e5, code lost:
    
        if (r11 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0158, code lost:
    
        if (r13 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0110, code lost:
    
        if (r14 == null) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(g3 g3Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (g3Var == null) {
            return false;
        }
        List<zd> list = g3Var.H;
        zd zdVar = g3Var.G;
        List<md> list2 = g3Var.E;
        List<DivTrigger> list3 = g3Var.D;
        List<DivTransitionTrigger> list4 = g3Var.C;
        e1 e1Var = g3Var.B;
        e1 e1Var2 = g3Var.A;
        d2 d2Var = g3Var.z;
        hd hdVar = g3Var.y;
        List<DivTooltip> list5 = g3Var.x;
        List<DivAction> list6 = g3Var.w;
        y3 y3Var = g3Var.t;
        List<zd> list7 = list;
        y3 y3Var2 = g3Var.s;
        vmn vmnVar = g3Var.r;
        List<md> list8 = list2;
        List<a> list9 = g3Var.q;
        List<DivTrigger> list10 = list3;
        List<t4> list11 = g3Var.n;
        List<DivTransitionTrigger> list12 = list4;
        jln jlnVar = g3Var.m;
        List<zkn> list13 = g3Var.l;
        List<v3> list14 = g3Var.k;
        u1 u1Var = g3Var.g;
        List<m1> list15 = g3Var.f;
        List<DivTooltip> list16 = list5;
        List<w0> list17 = g3Var.e;
        List<DivAction> list18 = list6;
        DivAccessibility divAccessibility = g3Var.a;
        DivAccessibility divAccessibility2 = this.a;
        if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expression = this.b;
        DivAlignmentHorizontal evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expression2 = g3Var.b;
        if (evaluate != (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.c;
        DivAlignmentVertical evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expression4 = g3Var.c;
        if (evaluate2 != (expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(this.d.evaluate(expressionResolver).doubleValue() == g3Var.d.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<w0> list19 = this.e;
        if (list19 != null) {
            if (list17 != null) {
                if (list19.size() == list17.size()) {
                    Iterator it = list19.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        Iterator it2 = it;
                        if (((w0) next).a(list17.get(i), expressionResolver, expressionResolver2)) {
                            i = i2;
                            it = it2;
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
            if (list15 != null) {
                if (list20.size() == list15.size()) {
                    int i3 = 0;
                    for (Object obj : list20) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((m1) obj).a(list15.get(i3), expressionResolver, expressionResolver2)) {
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
        Expression<Long> expression6 = g3Var.h;
        if (!epx.f(evaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null) || !epx.f(this.i, g3Var.i) || !epx.f(this.j, g3Var.j)) {
            return false;
        }
        List<v3> list21 = this.k;
        if (list21 != null) {
            if (list14 != null) {
                if (list21.size() == list14.size()) {
                    int i5 = 0;
                    for (Object obj2 : list21) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((v3) obj2).g(list14.get(i5), expressionResolver, expressionResolver2)) {
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
        List<zkn> list22 = this.l;
        if (list22 != null) {
            if (list13 != null) {
                if (list22.size() == list13.size()) {
                    int i7 = 0;
                    for (Object obj3 : list22) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((zkn) obj3).a(list13.get(i7))) {
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
        jln jlnVar2 = this.m;
        if (!(jlnVar2 != null ? jlnVar2.a(jlnVar, expressionResolver, expressionResolver2) : jlnVar == null)) {
            return false;
        }
        List<t4> list23 = this.n;
        if (list23 != null) {
            if (list11 != null) {
                if (list23.size() == list11.size()) {
                    int i9 = 0;
                    for (Object obj4 : list23) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((t4) obj4).a(list11.get(i9))) {
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
        if (!z5 || !this.o.a(g3Var.o, expressionResolver, expressionResolver2) || !epx.f(this.p, g3Var.p)) {
            return false;
        }
        List<a> list24 = this.q;
        if (list24 != null) {
            if (list9 != null) {
                if (list24.size() == list9.size()) {
                    int i11 = 0;
                    for (Object obj5 : list24) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((a) obj5).a(list9.get(i11), expressionResolver, expressionResolver2)) {
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
        vmn vmnVar2 = this.r;
        if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
            return false;
        }
        y3 y3Var3 = this.s;
        if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null)) {
            return false;
        }
        y3 y3Var4 = this.t;
        if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null)) {
            return false;
        }
        Expression<String> expression7 = this.u;
        String evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<String> expression8 = g3Var.u;
        if (!epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression9 = this.v;
        Long evaluate5 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
        Expression<Long> expression10 = g3Var.v;
        if (!epx.f(evaluate5, expression10 != null ? expression10.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> list25 = this.w;
        if (list25 != null) {
            if (list18 != null) {
                if (list25.size() == list18.size()) {
                    int i13 = 0;
                    for (Object obj6 : list25) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivAction> list26 = list18;
                        if (((DivAction) obj6).a(list26.get(i13), expressionResolver, expressionResolver2)) {
                            i13 = i14;
                            list18 = list26;
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
        List<DivTooltip> list27 = this.x;
        if (list27 != null) {
            if (list16 != null) {
                if (list27.size() == list16.size()) {
                    int i15 = 0;
                    for (Object obj7 : list27) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTooltip> list28 = list16;
                        if (((DivTooltip) obj7).a(list28.get(i15), expressionResolver, expressionResolver2)) {
                            i15 = i16;
                            list16 = list28;
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
        hd hdVar2 = this.y;
        if (!(hdVar2 != null ? hdVar2.a(hdVar, expressionResolver, expressionResolver2) : hdVar == null)) {
            return false;
        }
        d2 d2Var2 = this.z;
        if (!(d2Var2 != null ? d2Var2.a(d2Var, expressionResolver, expressionResolver2) : d2Var == null)) {
            return false;
        }
        e1 e1Var3 = this.A;
        if (!(e1Var3 != null ? e1Var3.a(e1Var2, expressionResolver, expressionResolver2) : e1Var2 == null)) {
            return false;
        }
        e1 e1Var4 = this.B;
        if (!(e1Var4 != null ? e1Var4.a(e1Var, expressionResolver, expressionResolver2) : e1Var == null)) {
            return false;
        }
        List<DivTransitionTrigger> list29 = this.C;
        if (list29 != null) {
            if (list12 != null) {
                if (list29.size() == list12.size()) {
                    int i17 = 0;
                    for (Object obj8 : list29) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTransitionTrigger> list30 = list12;
                        if (((DivTransitionTrigger) obj8) == list30.get(i17)) {
                            i17 = i18;
                            list12 = list30;
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
        List<DivTrigger> list31 = this.D;
        if (list31 != null) {
            if (list10 != null) {
                if (list31.size() == list10.size()) {
                    int i19 = 0;
                    for (Object obj9 : list31) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTrigger> list32 = list10;
                        if (((DivTrigger) obj9).a(list32.get(i19), expressionResolver, expressionResolver2)) {
                            i19 = i20;
                            list10 = list32;
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
        List<md> list33 = this.E;
        if (list33 != null) {
            if (list8 != null) {
                if (list33.size() == list8.size()) {
                    int i21 = 0;
                    for (Object obj10 : list33) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<md> list34 = list8;
                        if (((md) obj10).a(list34.get(i21), expressionResolver, expressionResolver2)) {
                            i21 = i22;
                            list8 = list34;
                        }
                    }
                    z11 = true;
                }
                z11 = false;
                break;
            }
            return false;
        }
        if (!z11 || this.F.evaluate(expressionResolver) != g3Var.F.evaluate(expressionResolver2)) {
            return false;
        }
        zd zdVar2 = this.G;
        if (!(zdVar2 != null ? zdVar2.g(zdVar, expressionResolver, expressionResolver2) : zdVar == null)) {
            return false;
        }
        List<zd> list35 = this.H;
        if (list35 != null) {
            if (list7 != null) {
                if (list35.size() == list7.size()) {
                    int i23 = 0;
                    for (Object obj11 : list35) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<zd> list36 = list7;
                        if (((zd) obj11).g(list36.get(i23), expressionResolver, expressionResolver2)) {
                            i23 = i24;
                            list7 = list36;
                        }
                    }
                    z12 = true;
                }
                z12 = false;
                break;
            }
            return false;
        }
        return z12 && this.I.a(g3Var.I, expressionResolver, expressionResolver2);
    }

    @Override // xsna.ikn
    public final Expression<Double> a() {
        return this.d;
    }

    @Override // xsna.ikn
    public final List<DivTooltip> b() {
        return this.x;
    }

    @Override // xsna.ikn
    public final hd c() {
        return this.y;
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
        return this.E;
    }

    @Override // xsna.ikn
    public final y3 g() {
        return this.s;
    }

    @Override // xsna.ikn
    public final List<m1> getBackground() {
        return this.f;
    }

    @Override // xsna.ikn
    public final v9 getHeight() {
        return this.o;
    }

    @Override // xsna.ikn
    public final String getId() {
        return this.p;
    }

    @Override // xsna.ikn
    public final Expression<DivVisibility> getVisibility() {
        return this.F;
    }

    @Override // xsna.ikn
    public final v9 getWidth() {
        return this.I;
    }

    @Override // xsna.ikn
    public final Expression<Long> h() {
        return this.v;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.K;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        int i = 0;
        List<a> list = this.q;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                i += ((a) it.next()).hash();
            }
        }
        int i2 = propertiesHash + i;
        this.K = Integer.valueOf(i2);
        return i2;
    }

    @Override // xsna.ikn
    public final Expression<String> i() {
        return this.u;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentHorizontal> j() {
        return this.b;
    }

    @Override // xsna.ikn
    public final e1 k() {
        return this.B;
    }

    @Override // xsna.ikn
    public final List<DivTransitionTrigger> l() {
        return this.C;
    }

    @Override // xsna.ikn
    public final List<zkn> m() {
        return this.l;
    }

    @Override // xsna.ikn
    public final List<DivAction> n() {
        return this.w;
    }

    @Override // xsna.ikn
    public final vmn o() {
        return this.r;
    }

    @Override // xsna.ikn
    public final List<DivTrigger> p() {
        return this.D;
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
        Integer num = this.J;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(g3.class).hashCode();
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
        JSONObject jSONObject = this.i;
        int hashCode5 = this.j.hashCode() + hashCode4 + (jSONObject != null ? jSONObject.hashCode() : 0);
        List<v3> list3 = this.k;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((v3) it3.next()).hash();
            }
        } else {
            i3 = 0;
        }
        int i13 = hashCode5 + i3;
        List<zkn> list4 = this.l;
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
        jln jlnVar = this.m;
        int hash3 = i14 + (jlnVar != null ? jlnVar.hash() : 0);
        List<t4> list5 = this.n;
        if (list5 != null) {
            Iterator<T> it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((t4) it5.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int hash4 = this.o.hash() + hash3 + i5;
        String str = this.p;
        int hashCode6 = hash4 + (str != null ? str.hashCode() : 0);
        vmn vmnVar = this.r;
        int hash5 = hashCode6 + (vmnVar != null ? vmnVar.hash() : 0);
        y3 y3Var = this.s;
        int hash6 = hash5 + (y3Var != null ? y3Var.hash() : 0);
        y3 y3Var2 = this.t;
        int hash7 = hash6 + (y3Var2 != null ? y3Var2.hash() : 0);
        Expression<String> expression4 = this.u;
        int hashCode7 = hash7 + (expression4 != null ? expression4.hashCode() : 0);
        Expression<Long> expression5 = this.v;
        int hashCode8 = hashCode7 + (expression5 != null ? expression5.hashCode() : 0);
        List<DivAction> list6 = this.w;
        if (list6 != null) {
            Iterator<T> it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((DivAction) it6.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i15 = hashCode8 + i6;
        List<DivTooltip> list7 = this.x;
        if (list7 != null) {
            Iterator<T> it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((DivTooltip) it7.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int i16 = i15 + i7;
        hd hdVar = this.y;
        int hash8 = i16 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.z;
        int hash9 = hash8 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.A;
        int hash10 = hash9 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.B;
        int hash11 = hash10 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list8 = this.C;
        int hashCode9 = hash11 + (list8 != null ? list8.hashCode() : 0);
        List<DivTrigger> list9 = this.D;
        if (list9 != null) {
            Iterator<T> it8 = list9.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((DivTrigger) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int i17 = hashCode9 + i8;
        List<md> list10 = this.E;
        if (list10 != null) {
            Iterator<T> it9 = list10.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((md) it9.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int hashCode10 = this.F.hashCode() + i17 + i9;
        zd zdVar = this.G;
        int hash12 = hashCode10 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list11 = this.H;
        if (list11 != null) {
            Iterator<T> it10 = list11.iterator();
            while (it10.hasNext()) {
                i10 += ((zd) it10.next()).hash();
            }
        }
        int hash13 = this.I.hash() + hash12 + i10;
        this.J = Integer.valueOf(hash13);
        return hash13;
    }

    @Override // xsna.ikn
    public final e1 q() {
        return this.A;
    }

    @Override // xsna.ikn
    public final List<w0> r() {
        return this.e;
    }

    @Override // xsna.ikn
    public final List<zd> s() {
        return this.H;
    }

    @Override // xsna.ikn
    public final d2 t() {
        return this.z;
    }

    @Override // xsna.ikn
    public final List<v3> u() {
        return this.k;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentVertical> v() {
        return this.c;
    }

    @Override // xsna.ikn
    public final jln w() {
        return this.m;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((h3.d) BuiltInParserKt.getBuiltInParserComponent().B2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // xsna.ikn
    public final DivAccessibility x() {
        return this.a;
    }

    @Override // xsna.ikn
    public final y3 y() {
        return this.t;
    }

    @Override // xsna.ikn
    public final zd z() {
        return this.G;
    }
}
