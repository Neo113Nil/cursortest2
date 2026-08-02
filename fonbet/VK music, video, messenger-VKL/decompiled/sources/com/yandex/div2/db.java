package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.eb;
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

/* compiled from: DivSwitch.kt */
/* loaded from: classes8.dex */
public final class db implements JSONSerializable, Hashable, ikn {
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
    public final List<t4> l;
    public final v9 m;
    public final String n;
    public final Expression<Boolean> o;
    public final String p;
    public final vmn q;
    public final y3 r;
    public final Expression<Integer> s;
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
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public db(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list, List<? extends m1> list2, u1 u1Var, Expression<Long> expression4, List<v3> list3, List<zkn> list4, jln jlnVar, List<t4> list5, v9 v9Var, String str, Expression<Boolean> expression5, String str2, vmn vmnVar, y3 y3Var, Expression<Integer> expression6, y3 y3Var2, Expression<String> expression7, Expression<Long> expression8, List<DivAction> list6, List<DivTooltip> list7, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list8, List<DivTrigger> list9, List<? extends md> list10, Expression<DivVisibility> expression9, zd zdVar, List<zd> list11, v9 v9Var2) {
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
        this.l = list5;
        this.m = v9Var;
        this.n = str;
        this.o = expression5;
        this.p = str2;
        this.q = vmnVar;
        this.r = y3Var;
        this.s = expression6;
        this.t = y3Var2;
        this.u = expression7;
        this.v = expression8;
        this.w = list6;
        this.x = list7;
        this.y = hdVar;
        this.z = d2Var;
        this.A = e1Var;
        this.B = e1Var2;
        this.C = list8;
        this.D = list9;
        this.E = list10;
        this.F = expression9;
        this.G = zdVar;
        this.H = list11;
        this.I = v9Var2;
    }

    public static db B(db dbVar, String str) {
        DivAccessibility divAccessibility = dbVar.a;
        Expression<DivAlignmentHorizontal> expression = dbVar.b;
        Expression<DivAlignmentVertical> expression2 = dbVar.c;
        Expression<Double> expression3 = dbVar.d;
        List<w0> list = dbVar.e;
        List<m1> list2 = dbVar.f;
        u1 u1Var = dbVar.g;
        Expression<Long> expression4 = dbVar.h;
        List<v3> list3 = dbVar.i;
        List<zkn> list4 = dbVar.j;
        jln jlnVar = dbVar.k;
        List<t4> list5 = dbVar.l;
        v9 v9Var = dbVar.m;
        Expression<Boolean> expression5 = dbVar.o;
        String str2 = dbVar.p;
        vmn vmnVar = dbVar.q;
        y3 y3Var = dbVar.r;
        Expression<Integer> expression6 = dbVar.s;
        y3 y3Var2 = dbVar.t;
        Expression<String> expression7 = dbVar.u;
        Expression<Long> expression8 = dbVar.v;
        List<DivAction> list6 = dbVar.w;
        List<DivTooltip> list7 = dbVar.x;
        hd hdVar = dbVar.y;
        d2 d2Var = dbVar.z;
        e1 e1Var = dbVar.A;
        e1 e1Var2 = dbVar.B;
        List<DivTransitionTrigger> list8 = dbVar.C;
        List<DivTrigger> list9 = dbVar.D;
        List<md> list10 = dbVar.E;
        Expression<DivVisibility> expression9 = dbVar.F;
        zd zdVar = dbVar.G;
        List<zd> list11 = dbVar.H;
        v9 v9Var2 = dbVar.I;
        dbVar.getClass();
        return new db(divAccessibility, expression, expression2, expression3, list, list2, u1Var, expression4, list3, list4, jlnVar, list5, v9Var, str, expression5, str2, vmnVar, y3Var, expression6, y3Var2, expression7, expression8, list6, list7, hdVar, d2Var, e1Var, e1Var2, list8, list9, list10, expression9, zdVar, list11, v9Var2);
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:341:0x0581, code lost:
    
        if (r17 == null) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0513, code lost:
    
        if (r19 == null) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x04c6, code lost:
    
        if (r20 == null) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0479, code lost:
    
        if (r21 == null) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x03d9, code lost:
    
        if (r26 == null) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x038c, code lost:
    
        if (r28 == null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0271, code lost:
    
        if (r7 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0218, code lost:
    
        if (r9 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x01d1, code lost:
    
        if (r10 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0158, code lost:
    
        if (r12 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0110, code lost:
    
        if (r13 == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(db dbVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (dbVar == null) {
            return false;
        }
        List<zd> list = dbVar.H;
        zd zdVar = dbVar.G;
        List<md> list2 = dbVar.E;
        List<DivTrigger> list3 = dbVar.D;
        List<DivTransitionTrigger> list4 = dbVar.C;
        e1 e1Var = dbVar.B;
        e1 e1Var2 = dbVar.A;
        d2 d2Var = dbVar.z;
        hd hdVar = dbVar.y;
        List<DivTooltip> list5 = dbVar.x;
        List<DivAction> list6 = dbVar.w;
        y3 y3Var = dbVar.t;
        List<zd> list7 = list;
        y3 y3Var2 = dbVar.r;
        vmn vmnVar = dbVar.q;
        List<md> list8 = list2;
        List<t4> list9 = dbVar.l;
        List<DivTrigger> list10 = list3;
        jln jlnVar = dbVar.k;
        List<DivTransitionTrigger> list11 = list4;
        List<zkn> list12 = dbVar.j;
        List<v3> list13 = dbVar.i;
        u1 u1Var = dbVar.g;
        List<m1> list14 = dbVar.f;
        List<w0> list15 = dbVar.e;
        List<DivTooltip> list16 = list5;
        DivAccessibility divAccessibility = dbVar.a;
        List<DivAction> list17 = list6;
        DivAccessibility divAccessibility2 = this.a;
        if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expression = this.b;
        DivAlignmentHorizontal evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expression2 = dbVar.b;
        if (evaluate != (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.c;
        DivAlignmentVertical evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expression4 = dbVar.c;
        if (evaluate2 != (expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(this.d.evaluate(expressionResolver).doubleValue() == dbVar.d.evaluate(expressionResolver2).doubleValue())) {
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
        Expression<Long> expression6 = dbVar.h;
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
        List<t4> list23 = this.l;
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
        if (!z5 || !this.m.a(dbVar.m, expressionResolver, expressionResolver2) || !epx.f(this.n, dbVar.n) || this.o.evaluate(expressionResolver).booleanValue() != dbVar.o.evaluate(expressionResolver2).booleanValue() || !epx.f(this.p, dbVar.p)) {
            return false;
        }
        vmn vmnVar2 = this.q;
        if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
            return false;
        }
        y3 y3Var3 = this.r;
        if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null)) {
            return false;
        }
        Expression<Integer> expression7 = this.s;
        Integer evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<Integer> expression8 = dbVar.s;
        if (!epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
            return false;
        }
        y3 y3Var4 = this.t;
        if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null)) {
            return false;
        }
        Expression<String> expression9 = this.u;
        String evaluate5 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
        Expression<String> expression10 = dbVar.u;
        if (!epx.f(evaluate5, expression10 != null ? expression10.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression11 = this.v;
        Long evaluate6 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
        Expression<Long> expression12 = dbVar.v;
        if (!epx.f(evaluate6, expression12 != null ? expression12.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> list24 = this.w;
        if (list24 != null) {
            if (list17 != null) {
                if (list24.size() == list17.size()) {
                    int i11 = 0;
                    for (Object obj6 : list24) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivAction> list25 = list17;
                        if (((DivAction) obj6).a(list25.get(i11), expressionResolver, expressionResolver2)) {
                            i11 = i12;
                            list17 = list25;
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
        List<DivTooltip> list26 = this.x;
        if (list26 != null) {
            if (list16 != null) {
                if (list26.size() == list16.size()) {
                    int i13 = 0;
                    for (Object obj7 : list26) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTooltip> list27 = list16;
                        if (((DivTooltip) obj7).a(list27.get(i13), expressionResolver, expressionResolver2)) {
                            i13 = i14;
                            list16 = list27;
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
        List<DivTransitionTrigger> list28 = this.C;
        if (list28 != null) {
            if (list11 != null) {
                if (list28.size() == list11.size()) {
                    int i15 = 0;
                    for (Object obj8 : list28) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTransitionTrigger> list29 = list11;
                        if (((DivTransitionTrigger) obj8) == list29.get(i15)) {
                            i15 = i16;
                            list11 = list29;
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
        List<DivTrigger> list30 = this.D;
        if (list30 != null) {
            if (list10 != null) {
                if (list30.size() == list10.size()) {
                    int i17 = 0;
                    for (Object obj9 : list30) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTrigger> list31 = list10;
                        if (((DivTrigger) obj9).a(list31.get(i17), expressionResolver, expressionResolver2)) {
                            i17 = i18;
                            list10 = list31;
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
        List<md> list32 = this.E;
        if (list32 != null) {
            if (list8 != null) {
                if (list32.size() == list8.size()) {
                    int i19 = 0;
                    for (Object obj10 : list32) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<md> list33 = list8;
                        if (((md) obj10).a(list33.get(i19), expressionResolver, expressionResolver2)) {
                            i19 = i20;
                            list8 = list33;
                        }
                    }
                    z10 = true;
                }
                z10 = false;
                break;
            }
            return false;
        }
        if (!z10 || this.F.evaluate(expressionResolver) != dbVar.F.evaluate(expressionResolver2)) {
            return false;
        }
        zd zdVar2 = this.G;
        if (!(zdVar2 != null ? zdVar2.g(zdVar, expressionResolver, expressionResolver2) : zdVar == null)) {
            return false;
        }
        List<zd> list34 = this.H;
        if (list34 != null) {
            if (list7 != null) {
                if (list34.size() == list7.size()) {
                    int i21 = 0;
                    for (Object obj11 : list34) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<zd> list35 = list7;
                        if (((zd) obj11).g(list35.get(i21), expressionResolver, expressionResolver2)) {
                            i21 = i22;
                            list7 = list35;
                        }
                    }
                    z11 = true;
                }
                z11 = false;
                break;
            }
            return false;
        }
        return z11 && this.I.a(dbVar.I, expressionResolver, expressionResolver2);
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
        return this.r;
    }

    @Override // xsna.ikn
    public final List<m1> getBackground() {
        return this.f;
    }

    @Override // xsna.ikn
    public final v9 getHeight() {
        return this.m;
    }

    @Override // xsna.ikn
    public final String getId() {
        return this.n;
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
        int hashCode = fpf0.a(db.class).hashCode();
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
        List<t4> list5 = this.l;
        if (list5 != null) {
            Iterator<T> it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((t4) it5.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int hash4 = this.m.hash() + hash3 + i5;
        String str = this.n;
        int hashCode5 = this.p.hashCode() + this.o.hashCode() + hash4 + (str != null ? str.hashCode() : 0);
        vmn vmnVar = this.q;
        int hash5 = hashCode5 + (vmnVar != null ? vmnVar.hash() : 0);
        y3 y3Var = this.r;
        int hash6 = hash5 + (y3Var != null ? y3Var.hash() : 0);
        Expression<Integer> expression4 = this.s;
        int hashCode6 = hash6 + (expression4 != null ? expression4.hashCode() : 0);
        y3 y3Var2 = this.t;
        int hash7 = hashCode6 + (y3Var2 != null ? y3Var2.hash() : 0);
        Expression<String> expression5 = this.u;
        int hashCode7 = hash7 + (expression5 != null ? expression5.hashCode() : 0);
        Expression<Long> expression6 = this.v;
        int hashCode8 = hashCode7 + (expression6 != null ? expression6.hashCode() : 0);
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
        return this.j;
    }

    @Override // xsna.ikn
    public final List<DivAction> n() {
        return this.w;
    }

    @Override // xsna.ikn
    public final vmn o() {
        return this.q;
    }

    @Override // xsna.ikn
    public final List<DivTrigger> p() {
        return this.D;
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
        return ((eb.d) BuiltInParserKt.getBuiltInParserComponent().L7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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
