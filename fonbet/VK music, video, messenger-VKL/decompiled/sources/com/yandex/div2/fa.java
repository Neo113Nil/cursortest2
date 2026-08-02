package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.ga;
import com.yandex.div2.la;
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
import xsna.jon;
import xsna.krn;
import xsna.ukn;
import xsna.vmn;
import xsna.zkn;

/* compiled from: DivSlider.kt */
/* loaded from: classes8.dex */
public final class fa implements JSONSerializable, Hashable, ikn {
    public final b A;
    public final String B;
    public final ukn C;
    public final b D;
    public final String E;
    public final ukn F;
    public final ukn G;
    public final List<DivTooltip> H;
    public final ukn I;
    public final ukn J;
    public final hd K;
    public final d2 L;
    public final e1 M;
    public final e1 N;
    public final List<DivTransitionTrigger> O;
    public final List<DivTrigger> P;
    public final List<md> Q;
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
    public final vmn p;
    public final y3 q;
    public final Expression<Long> r;
    public final Expression<Long> s;
    public final y3 t;
    public final List<a> u;
    public final Expression<String> v;
    public final Expression<Long> w;
    public final DivAccessibility x;
    public final List<DivAction> y;
    public final ukn z;

    /* compiled from: DivSlider.kt */
    public static final class a implements JSONSerializable, Hashable {
        public final Expression<Long> a;
        public final y3 b;
        public final Expression<Long> c;
        public final ukn d;
        public final ukn e;
        public Integer f;

        public a() {
            this(null, null, null, null, null);
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.f;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = fpf0.a(a.class).hashCode();
            Expression<Long> expression = this.a;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
            y3 y3Var = this.b;
            int hash = hashCode2 + (y3Var != null ? y3Var.hash() : 0);
            Expression<Long> expression2 = this.c;
            int hashCode3 = hash + (expression2 != null ? expression2.hashCode() : 0);
            ukn uknVar = this.d;
            int hash2 = hashCode3 + (uknVar != null ? uknVar.hash() : 0);
            ukn uknVar2 = this.e;
            int hash3 = hash2 + (uknVar2 != null ? uknVar2.hash() : 0);
            this.f = Integer.valueOf(hash3);
            return hash3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((ha) BuiltInParserKt.getBuiltInParserComponent().k7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public a(Expression<Long> expression, y3 y3Var, Expression<Long> expression2, ukn uknVar, ukn uknVar2) {
            this.a = expression;
            this.b = y3Var;
            this.c = expression2;
            this.d = uknVar;
            this.e = uknVar2;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fa(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list, List<? extends m1> list2, u1 u1Var, Expression<Long> expression4, List<v3> list3, List<zkn> list4, jln jlnVar, List<t4> list5, v9 v9Var, String str, Expression<Boolean> expression5, vmn vmnVar, y3 y3Var, Expression<Long> expression6, Expression<Long> expression7, y3 y3Var2, List<a> list6, Expression<String> expression8, Expression<Long> expression9, DivAccessibility divAccessibility2, List<DivAction> list7, ukn uknVar, b bVar, String str2, ukn uknVar2, b bVar2, String str3, ukn uknVar3, ukn uknVar4, List<DivTooltip> list8, ukn uknVar5, ukn uknVar6, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list9, List<DivTrigger> list10, List<? extends md> list11, Expression<DivVisibility> expression10, zd zdVar, List<zd> list12, v9 v9Var2) {
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
        this.p = vmnVar;
        this.q = y3Var;
        this.r = expression6;
        this.s = expression7;
        this.t = y3Var2;
        this.u = list6;
        this.v = expression8;
        this.w = expression9;
        this.x = divAccessibility2;
        this.y = list7;
        this.z = uknVar;
        this.A = bVar;
        this.B = str2;
        this.C = uknVar2;
        this.D = bVar2;
        this.E = str3;
        this.F = uknVar3;
        this.G = uknVar4;
        this.H = list8;
        this.I = uknVar5;
        this.J = uknVar6;
        this.K = hdVar;
        this.L = d2Var;
        this.M = e1Var;
        this.N = e1Var2;
        this.O = list9;
        this.P = list10;
        this.Q = list11;
        this.R = expression10;
        this.S = zdVar;
        this.T = list12;
        this.U = v9Var2;
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:433:0x0727, code lost:
    
        if (r17 == null) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x06b9, code lost:
    
        if (r19 == null) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x066c, code lost:
    
        if (r20 == null) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x061f, code lost:
    
        if (r21 == null) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x056b, code lost:
    
        if (r26 == null) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x049c, code lost:
    
        if (r32 == null) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x03fb, code lost:
    
        if (r35 == null) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x028d, code lost:
    
        if (r14 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0234, code lost:
    
        if (r4 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x01ed, code lost:
    
        if (r5 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0174, code lost:
    
        if (r7 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x012c, code lost:
    
        if (r8 == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03f0 A[LOOP:5: B:172:0x034e->B:180:0x03f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0400 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(fa faVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (faVar == null) {
            return false;
        }
        List<zd> list = faVar.T;
        zd zdVar = faVar.S;
        List<md> list2 = faVar.Q;
        List<DivTrigger> list3 = faVar.P;
        List<DivTransitionTrigger> list4 = faVar.O;
        e1 e1Var = faVar.N;
        e1 e1Var2 = faVar.M;
        d2 d2Var = faVar.L;
        hd hdVar = faVar.K;
        List<DivTooltip> list5 = faVar.H;
        ukn uknVar = faVar.G;
        ukn uknVar2 = faVar.F;
        List<zd> list6 = list;
        b bVar = faVar.D;
        b bVar2 = faVar.A;
        List<md> list7 = list2;
        ukn uknVar3 = faVar.z;
        List<DivTrigger> list8 = list3;
        List<DivAction> list9 = faVar.y;
        List<DivTransitionTrigger> list10 = list4;
        DivAccessibility divAccessibility = faVar.x;
        List<a> list11 = faVar.u;
        y3 y3Var = faVar.t;
        y3 y3Var2 = faVar.q;
        vmn vmnVar = faVar.p;
        List<DivTooltip> list12 = list5;
        List<t4> list13 = faVar.l;
        jln jlnVar = faVar.k;
        List<zkn> list14 = faVar.j;
        List<v3> list15 = faVar.i;
        u1 u1Var = faVar.g;
        List<m1> list16 = faVar.f;
        List<DivAction> list17 = list9;
        List<w0> list18 = faVar.e;
        DivAccessibility divAccessibility2 = faVar.a;
        List<a> list19 = list11;
        DivAccessibility divAccessibility3 = this.a;
        if (!(divAccessibility3 != null ? divAccessibility3.a(divAccessibility2, expressionResolver, expressionResolver2) : divAccessibility2 == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expression = this.b;
        DivAlignmentHorizontal evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expression2 = faVar.b;
        if (evaluate != (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.c;
        DivAlignmentVertical evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expression4 = faVar.c;
        if (evaluate2 != (expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(this.d.evaluate(expressionResolver).doubleValue() == faVar.d.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<w0> list20 = this.e;
        if (list20 != null) {
            if (list18 != null) {
                if (list20.size() == list18.size()) {
                    int i = 0;
                    for (Object obj : list20) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        List<w0> list21 = list18;
                        if (((w0) obj).a(list18.get(i), expressionResolver, expressionResolver2)) {
                            i = i2;
                            list18 = list21;
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
        List<m1> list22 = this.f;
        if (list22 != null) {
            if (list16 != null) {
                if (list22.size() == list16.size()) {
                    int i3 = 0;
                    for (Object obj2 : list22) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((m1) obj2).a(list16.get(i3), expressionResolver, expressionResolver2)) {
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
        Expression<Long> expression6 = faVar.h;
        if (!epx.f(evaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<v3> list23 = this.i;
        if (list23 != null) {
            if (list15 != null) {
                if (list23.size() == list15.size()) {
                    int i5 = 0;
                    for (Object obj3 : list23) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((v3) obj3).g(list15.get(i5), expressionResolver, expressionResolver2)) {
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
        List<zkn> list24 = this.j;
        if (list24 != null) {
            if (list14 != null) {
                if (list24.size() == list14.size()) {
                    int i7 = 0;
                    for (Object obj4 : list24) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((zkn) obj4).a(list14.get(i7))) {
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
        List<t4> list25 = this.l;
        if (list25 != null) {
            if (list13 != null) {
                if (list25.size() == list13.size()) {
                    int i9 = 0;
                    for (Object obj5 : list25) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((t4) obj5).a(list13.get(i9))) {
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
        if (!z5 || !this.m.a(faVar.m, expressionResolver, expressionResolver2) || !epx.f(this.n, faVar.n) || this.o.evaluate(expressionResolver).booleanValue() != faVar.o.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        vmn vmnVar2 = this.p;
        if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
            return false;
        }
        y3 y3Var3 = this.q;
        if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null) || this.r.evaluate(expressionResolver).longValue() != faVar.r.evaluate(expressionResolver2).longValue() || this.s.evaluate(expressionResolver).longValue() != faVar.s.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        y3 y3Var4 = this.t;
        if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null)) {
            return false;
        }
        List<a> list26 = this.u;
        if (list26 != null) {
            if (list19 != null) {
                if (list26.size() == list19.size()) {
                    int i11 = 0;
                    for (Object obj6 : list26) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<a> list27 = list19;
                        a aVar = list27.get(i11);
                        a aVar2 = (a) obj6;
                        aVar2.getClass();
                        if (aVar != null) {
                            ukn uknVar4 = aVar.e;
                            ukn uknVar5 = aVar.d;
                            y3 y3Var5 = aVar.b;
                            Expression<Long> expression7 = aVar2.a;
                            Long evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
                            Expression<Long> expression8 = aVar.a;
                            if (epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
                                y3 y3Var6 = aVar2.b;
                                if (y3Var6 != null ? y3Var6.a(y3Var5, expressionResolver, expressionResolver2) : y3Var5 == null) {
                                    Expression<Long> expression9 = aVar2.c;
                                    Long evaluate5 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
                                    Expression<Long> expression10 = aVar.c;
                                    if (epx.f(evaluate5, expression10 != null ? expression10.evaluate(expressionResolver2) : null)) {
                                        ukn uknVar6 = aVar2.d;
                                        if (uknVar6 != null ? uknVar6.a(uknVar5, expressionResolver, expressionResolver2) : uknVar5 == null) {
                                            ukn uknVar7 = aVar2.e;
                                            if (uknVar7 != null ? uknVar7.a(uknVar4, expressionResolver, expressionResolver2) : uknVar4 == null) {
                                                z13 = true;
                                                if (!z13) {
                                                    i11 = i12;
                                                    list19 = list27;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z13 = false;
                        if (!z13) {
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
        Expression<String> expression11 = this.v;
        String evaluate6 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
        Expression<String> expression12 = faVar.v;
        if (!epx.f(evaluate6, expression12 != null ? expression12.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression13 = this.w;
        Long evaluate7 = expression13 != null ? expression13.evaluate(expressionResolver) : null;
        Expression<Long> expression14 = faVar.w;
        if (!epx.f(evaluate7, expression14 != null ? expression14.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivAccessibility divAccessibility4 = this.x;
        if (!(divAccessibility4 != null ? divAccessibility4.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
            return false;
        }
        List<DivAction> list28 = this.y;
        if (list28 != null) {
            if (list17 != null) {
                if (list28.size() == list17.size()) {
                    int i13 = 0;
                    for (Object obj7 : list28) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivAction> list29 = list17;
                        if (((DivAction) obj7).a(list29.get(i13), expressionResolver, expressionResolver2)) {
                            i13 = i14;
                            list17 = list29;
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
        ukn uknVar8 = this.z;
        if (!(uknVar8 != null ? uknVar8.a(uknVar3, expressionResolver, expressionResolver2) : uknVar3 == null)) {
            return false;
        }
        b bVar3 = this.A;
        if (!(bVar3 != null ? bVar3.a(bVar2, expressionResolver, expressionResolver2) : bVar2 == null) || !epx.f(this.B, faVar.B) || !this.C.a(faVar.C, expressionResolver, expressionResolver2)) {
            return false;
        }
        b bVar4 = this.D;
        if (!(bVar4 != null ? bVar4.a(bVar, expressionResolver, expressionResolver2) : bVar == null) || !epx.f(this.E, faVar.E)) {
            return false;
        }
        ukn uknVar9 = this.F;
        if (!(uknVar9 != null ? uknVar9.a(uknVar2, expressionResolver, expressionResolver2) : uknVar2 == null)) {
            return false;
        }
        ukn uknVar10 = this.G;
        if (!(uknVar10 != null ? uknVar10.a(uknVar, expressionResolver, expressionResolver2) : uknVar == null)) {
            return false;
        }
        List<DivTooltip> list30 = this.H;
        if (list30 != null) {
            if (list12 != null) {
                if (list30.size() == list12.size()) {
                    int i15 = 0;
                    for (Object obj8 : list30) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTooltip> list31 = list12;
                        if (((DivTooltip) obj8).a(list31.get(i15), expressionResolver, expressionResolver2)) {
                            i15 = i16;
                            list12 = list31;
                        }
                    }
                    z8 = true;
                }
                z8 = false;
                break;
            }
            return false;
        }
        if (!z8 || !this.I.a(faVar.I, expressionResolver, expressionResolver2) || !this.J.a(faVar.J, expressionResolver, expressionResolver2)) {
            return false;
        }
        hd hdVar2 = this.K;
        if (!(hdVar2 != null ? hdVar2.a(hdVar, expressionResolver, expressionResolver2) : hdVar == null)) {
            return false;
        }
        d2 d2Var2 = this.L;
        if (!(d2Var2 != null ? d2Var2.a(d2Var, expressionResolver, expressionResolver2) : d2Var == null)) {
            return false;
        }
        e1 e1Var3 = this.M;
        if (!(e1Var3 != null ? e1Var3.a(e1Var2, expressionResolver, expressionResolver2) : e1Var2 == null)) {
            return false;
        }
        e1 e1Var4 = this.N;
        if (!(e1Var4 != null ? e1Var4.a(e1Var, expressionResolver, expressionResolver2) : e1Var == null)) {
            return false;
        }
        List<DivTransitionTrigger> list32 = this.O;
        if (list32 != null) {
            if (list10 != null) {
                if (list32.size() == list10.size()) {
                    int i17 = 0;
                    for (Object obj9 : list32) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTransitionTrigger> list33 = list10;
                        if (((DivTransitionTrigger) obj9) == list33.get(i17)) {
                            i17 = i18;
                            list10 = list33;
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
        List<DivTrigger> list34 = this.P;
        if (list34 != null) {
            if (list8 != null) {
                if (list34.size() == list8.size()) {
                    int i19 = 0;
                    for (Object obj10 : list34) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTrigger> list35 = list8;
                        if (((DivTrigger) obj10).a(list35.get(i19), expressionResolver, expressionResolver2)) {
                            i19 = i20;
                            list8 = list35;
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
        List<md> list36 = this.Q;
        if (list36 != null) {
            if (list7 != null) {
                if (list36.size() == list7.size()) {
                    int i21 = 0;
                    for (Object obj11 : list36) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<md> list37 = list7;
                        if (((md) obj11).a(list37.get(i21), expressionResolver, expressionResolver2)) {
                            i21 = i22;
                            list7 = list37;
                        }
                    }
                    z11 = true;
                }
                z11 = false;
                break;
            }
            return false;
        }
        if (!z11 || this.R.evaluate(expressionResolver) != faVar.R.evaluate(expressionResolver2)) {
            return false;
        }
        zd zdVar2 = this.S;
        if (!(zdVar2 != null ? zdVar2.g(zdVar, expressionResolver, expressionResolver2) : zdVar == null)) {
            return false;
        }
        List<zd> list38 = this.T;
        if (list38 != null) {
            if (list6 != null) {
                if (list38.size() == list6.size()) {
                    int i23 = 0;
                    for (Object obj12 : list38) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<zd> list39 = list6;
                        if (((zd) obj12).g(list39.get(i23), expressionResolver, expressionResolver2)) {
                            i23 = i24;
                            list6 = list39;
                        }
                    }
                    z12 = true;
                }
                z12 = false;
                break;
            }
            return false;
        }
        return z12 && this.U.a(faVar.U, expressionResolver, expressionResolver2);
    }

    @Override // xsna.ikn
    public final Expression<Double> a() {
        return this.d;
    }

    @Override // xsna.ikn
    public final List<DivTooltip> b() {
        return this.H;
    }

    @Override // xsna.ikn
    public final hd c() {
        return this.K;
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
        return this.Q;
    }

    @Override // xsna.ikn
    public final y3 g() {
        return this.q;
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
        return this.R;
    }

    @Override // xsna.ikn
    public final v9 getWidth() {
        return this.U;
    }

    @Override // xsna.ikn
    public final Expression<Long> h() {
        return this.w;
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
        Integer num = this.V;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(fa.class).hashCode();
        int i11 = 0;
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
        int i12 = hashCode3 + i;
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
        int i13 = i12 + i2;
        u1 u1Var = this.g;
        int hash2 = i13 + (u1Var != null ? u1Var.hash() : 0);
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
        int i14 = hashCode4 + i3;
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
        int i15 = i14 + i4;
        jln jlnVar = this.k;
        int hash3 = i15 + (jlnVar != null ? jlnVar.hash() : 0);
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
        int hashCode5 = this.o.hashCode() + hash4 + (str != null ? str.hashCode() : 0);
        vmn vmnVar = this.p;
        int hash5 = hashCode5 + (vmnVar != null ? vmnVar.hash() : 0);
        y3 y3Var = this.q;
        int hashCode6 = this.s.hashCode() + this.r.hashCode() + hash5 + (y3Var != null ? y3Var.hash() : 0);
        y3 y3Var2 = this.t;
        int hash6 = hashCode6 + (y3Var2 != null ? y3Var2.hash() : 0);
        List<a> list6 = this.u;
        if (list6 != null) {
            Iterator<T> it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((a) it6.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i16 = hash6 + i6;
        Expression<String> expression4 = this.v;
        int hashCode7 = i16 + (expression4 != null ? expression4.hashCode() : 0);
        Expression<Long> expression5 = this.w;
        int hashCode8 = hashCode7 + (expression5 != null ? expression5.hashCode() : 0);
        DivAccessibility divAccessibility2 = this.x;
        int hash7 = hashCode8 + (divAccessibility2 != null ? divAccessibility2.hash() : 0);
        List<DivAction> list7 = this.y;
        if (list7 != null) {
            Iterator<T> it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((DivAction) it7.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int i17 = hash7 + i7;
        ukn uknVar = this.z;
        int hash8 = i17 + (uknVar != null ? uknVar.hash() : 0);
        b bVar = this.A;
        int hash9 = hash8 + (bVar != null ? bVar.hash() : 0);
        String str2 = this.B;
        int hash10 = this.C.hash() + hash9 + (str2 != null ? str2.hashCode() : 0);
        b bVar2 = this.D;
        int hash11 = hash10 + (bVar2 != null ? bVar2.hash() : 0);
        String str3 = this.E;
        int hashCode9 = hash11 + (str3 != null ? str3.hashCode() : 0);
        ukn uknVar2 = this.F;
        int hash12 = hashCode9 + (uknVar2 != null ? uknVar2.hash() : 0);
        ukn uknVar3 = this.G;
        int hash13 = hash12 + (uknVar3 != null ? uknVar3.hash() : 0);
        List<DivTooltip> list8 = this.H;
        if (list8 != null) {
            Iterator<T> it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((DivTooltip) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int hash14 = this.J.hash() + this.I.hash() + hash13 + i8;
        hd hdVar = this.K;
        int hash15 = hash14 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.L;
        int hash16 = hash15 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.M;
        int hash17 = hash16 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.N;
        int hash18 = hash17 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list9 = this.O;
        int hashCode10 = hash18 + (list9 != null ? list9.hashCode() : 0);
        List<DivTrigger> list10 = this.P;
        if (list10 != null) {
            Iterator<T> it9 = list10.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((DivTrigger) it9.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int i18 = hashCode10 + i9;
        List<md> list11 = this.Q;
        if (list11 != null) {
            Iterator<T> it10 = list11.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((md) it10.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int hashCode11 = this.R.hashCode() + i18 + i10;
        zd zdVar = this.S;
        int hash19 = hashCode11 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list12 = this.T;
        if (list12 != null) {
            Iterator<T> it11 = list12.iterator();
            while (it11.hasNext()) {
                i11 += ((zd) it11.next()).hash();
            }
        }
        int hash20 = this.U.hash() + hash19 + i11;
        this.V = Integer.valueOf(hash20);
        return hash20;
    }

    @Override // xsna.ikn
    public final Expression<String> i() {
        return this.v;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentHorizontal> j() {
        return this.b;
    }

    @Override // xsna.ikn
    public final e1 k() {
        return this.N;
    }

    @Override // xsna.ikn
    public final List<DivTransitionTrigger> l() {
        return this.O;
    }

    @Override // xsna.ikn
    public final List<zkn> m() {
        return this.j;
    }

    @Override // xsna.ikn
    public final List<DivAction> n() {
        return this.y;
    }

    @Override // xsna.ikn
    public final vmn o() {
        return this.p;
    }

    @Override // xsna.ikn
    public final List<DivTrigger> p() {
        return this.P;
    }

    @Override // xsna.ikn
    public final e1 q() {
        return this.M;
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
        return this.L;
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
        return ((ga.d) BuiltInParserKt.getBuiltInParserComponent().e7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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
        return this.S;
    }

    /* compiled from: DivSlider.kt */
    public static final class b implements JSONSerializable, Hashable {
        public static final Expression<Long> k;
        public static final Expression<DivSizeUnit> l;
        public static final Expression<Double> m;
        public static final Expression<Integer> n;
        public final Expression<String> a;
        public final Expression<Long> b;
        public final Expression<DivSizeUnit> c;
        public final Expression<JSONObject> d;
        public final Expression<DivFontWeight> e;
        public final Expression<Long> f;
        public final Expression<Double> g;
        public final jon h;
        public final Expression<Integer> i;
        public Integer j;

        static {
            Expression.Companion companion = Expression.Companion;
            k = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            l = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            m = Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
            n = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        }

        public b(Expression<String> expression, Expression<Long> expression2, Expression<DivSizeUnit> expression3, Expression<JSONObject> expression4, Expression<DivFontWeight> expression5, Expression<Long> expression6, Expression<Double> expression7, jon jonVar, Expression<Integer> expression8) {
            this.a = expression;
            this.b = expression2;
            this.c = expression3;
            this.d = expression4;
            this.e = expression5;
            this.f = expression6;
            this.g = expression7;
            this.h = jonVar;
            this.i = expression8;
        }

        public final boolean a(b bVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (bVar == null) {
                return false;
            }
            jon jonVar = bVar.h;
            Expression<String> expression = this.a;
            String evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<String> expression2 = bVar.a;
            if (epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && this.b.evaluate(expressionResolver).longValue() == bVar.b.evaluate(expressionResolver2).longValue() && this.c.evaluate(expressionResolver) == bVar.c.evaluate(expressionResolver2)) {
                Expression<JSONObject> expression3 = this.d;
                JSONObject evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
                Expression<JSONObject> expression4 = bVar.d;
                if (epx.f(evaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                    Expression<DivFontWeight> expression5 = this.e;
                    DivFontWeight evaluate3 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
                    Expression<DivFontWeight> expression6 = bVar.e;
                    if (evaluate3 == (expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
                        Expression<Long> expression7 = this.f;
                        Long evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
                        Expression<Long> expression8 = bVar.f;
                        if (epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null) && this.g.evaluate(expressionResolver).doubleValue() == bVar.g.evaluate(expressionResolver2).doubleValue()) {
                            jon jonVar2 = this.h;
                            if ((jonVar2 != null ? jonVar2.a(jonVar, expressionResolver, expressionResolver2) : jonVar == null) && this.i.evaluate(expressionResolver).intValue() == bVar.i.evaluate(expressionResolver2).intValue()) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.j;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = fpf0.a(b.class).hashCode();
            Expression<String> expression = this.a;
            int hashCode2 = this.c.hashCode() + this.b.hashCode() + hashCode + (expression != null ? expression.hashCode() : 0);
            Expression<JSONObject> expression2 = this.d;
            int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
            Expression<DivFontWeight> expression3 = this.e;
            int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            Expression<Long> expression4 = this.f;
            int hashCode5 = this.g.hashCode() + hashCode4 + (expression4 != null ? expression4.hashCode() : 0);
            jon jonVar = this.h;
            int hashCode6 = this.i.hashCode() + hashCode5 + (jonVar != null ? jonVar.hash() : 0);
            this.j = Integer.valueOf(hashCode6);
            return hashCode6;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((la.c) BuiltInParserKt.getBuiltInParserComponent().h7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public b() {
            this(null, k, l, null, null, null, m, null, n);
        }
    }
}
