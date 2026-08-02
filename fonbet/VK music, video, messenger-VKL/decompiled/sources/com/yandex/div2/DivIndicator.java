package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.k5;
import com.yandex.div2.p5;
import com.yandex.div2.q9;
import com.yandex.div2.v9;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: DivIndicator.kt */
/* loaded from: classes8.dex */
public final class DivIndicator implements JSONSerializable, Hashable, ikn {
    public static final Expression<Integer> T;
    public static final Expression<Double> U;
    public static final Expression<Double> V;
    public static final Expression<Animation> W;
    public static final v9.c X;
    public static final Expression<Integer> Y;
    public static final Expression<Double> Z;
    public static final q9.b a0;
    public static final q4 b0;
    public static final Expression<DivVisibility> c0;
    public static final v9.b d0;
    public final String A;
    public final Expression<String> B;
    public final Expression<Long> C;
    public final List<DivAction> D;
    public final q9 E;
    public final q4 F;
    public final List<DivTooltip> G;
    public final hd H;
    public final d2 I;
    public final e1 J;
    public final e1 K;
    public final List<DivTransitionTrigger> L;
    public final List<DivTrigger> M;
    public final List<md> N;
    public final Expression<DivVisibility> O;
    public final zd P;
    public final List<zd> Q;
    public final v9 R;
    public Integer S;
    public final DivAccessibility a;
    public final Expression<Integer> b;
    public final Expression<Double> c;
    public final y8 d;
    public final Expression<DivAlignmentHorizontal> e;
    public final Expression<DivAlignmentVertical> f;
    public final Expression<Double> g;
    public final Expression<Animation> h;
    public final List<w0> i;
    public final List<m1> j;
    public final u1 k;
    public final Expression<Long> l;
    public final List<v3> m;
    public final List<zkn> n;
    public final jln o;
    public final List<t4> p;
    public final v9 q;
    public final String r;
    public final Expression<Integer> s;
    public final y8 t;
    public final y8 u;
    public final k5 v;
    public final vmn w;
    public final y3 x;
    public final Expression<Double> y;
    public final y3 z;

    /* compiled from: DivIndicator.kt */
    public enum Animation {
        SCALE("scale"),
        WORM("worm"),
        SLIDER("slider");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Animation, String> TO_STRING = b.i;
        public static final izs<String, Animation> FROM_STRING = a.i;

        /* compiled from: DivIndicator.kt */
        public static final class a extends Lambda implements izs<String, Animation> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Animation invoke(String str) {
                String str2 = str;
                Animation.Converter.getClass();
                Animation animation = Animation.SCALE;
                if (epx.f(str2, animation.value)) {
                    return animation;
                }
                Animation animation2 = Animation.WORM;
                if (epx.f(str2, animation2.value)) {
                    return animation2;
                }
                Animation animation3 = Animation.SLIDER;
                if (epx.f(str2, animation3.value)) {
                    return animation3;
                }
                return null;
            }
        }

        /* compiled from: DivIndicator.kt */
        public static final class b extends Lambda implements izs<Animation, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Animation animation) {
                Animation.Converter.getClass();
                return animation.value;
            }
        }

        /* compiled from: DivIndicator.kt */
        public static final class c {
        }

        Animation(String str) {
            this.value = str;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        T = Expression.Companion.constant$default(companion, 16768096, null, 2, null);
        U = Expression.Companion.constant$default(companion, Double.valueOf(1.3d), null, 2, null);
        V = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        W = Expression.Companion.constant$default(companion, Animation.SCALE, null, 2, null);
        X = new v9.c(new krn(null, null, null));
        Y = Expression.Companion.constant$default(companion, 865180853, null, 2, null);
        Z = Expression.Companion.constant$default(companion, Double.valueOf(0.5d), null, 2, null);
        a0 = new q9.b(new y8(0));
        b0 = new q4(Expression.Companion.constant$default(companion, 15L, null, 2, null));
        c0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        d0 = new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivIndicator(DivAccessibility divAccessibility, Expression<Integer> expression, Expression<Double> expression2, y8 y8Var, Expression<DivAlignmentHorizontal> expression3, Expression<DivAlignmentVertical> expression4, Expression<Double> expression5, Expression<Animation> expression6, List<? extends w0> list, List<? extends m1> list2, u1 u1Var, Expression<Long> expression7, List<v3> list3, List<zkn> list4, jln jlnVar, List<t4> list5, v9 v9Var, String str, Expression<Integer> expression8, y8 y8Var2, y8 y8Var3, k5 k5Var, vmn vmnVar, y3 y3Var, Expression<Double> expression9, y3 y3Var2, String str2, Expression<String> expression10, Expression<Long> expression11, List<DivAction> list6, q9 q9Var, q4 q4Var, List<DivTooltip> list7, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list8, List<DivTrigger> list9, List<? extends md> list10, Expression<DivVisibility> expression12, zd zdVar, List<zd> list11, v9 v9Var2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = y8Var;
        this.e = expression3;
        this.f = expression4;
        this.g = expression5;
        this.h = expression6;
        this.i = list;
        this.j = list2;
        this.k = u1Var;
        this.l = expression7;
        this.m = list3;
        this.n = list4;
        this.o = jlnVar;
        this.p = list5;
        this.q = v9Var;
        this.r = str;
        this.s = expression8;
        this.t = y8Var2;
        this.u = y8Var3;
        this.v = k5Var;
        this.w = vmnVar;
        this.x = y3Var;
        this.y = expression9;
        this.z = y3Var2;
        this.A = str2;
        this.B = expression10;
        this.C = expression11;
        this.D = list6;
        this.E = q9Var;
        this.F = q4Var;
        this.G = list7;
        this.H = hdVar;
        this.I = d2Var;
        this.J = e1Var;
        this.K = e1Var2;
        this.L = list8;
        this.M = list9;
        this.N = list10;
        this.O = expression12;
        this.P = zdVar;
        this.Q = list11;
        this.R = v9Var2;
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:375:0x06cd, code lost:
    
        if (r17 == null) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x065f, code lost:
    
        if (r19 == null) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0612, code lost:
    
        if (r20 == null) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x05c5, code lost:
    
        if (r21 == null) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0525, code lost:
    
        if (r26 == null) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x04c4, code lost:
    
        if (r27 == null) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x03bd, code lost:
    
        if (r4.b.evaluate(r38).longValue() == r5.b.evaluate(r39).longValue()) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x03d0, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x03ce, code lost:
    
        if (r7 == null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x02cd, code lost:
    
        if (r10 == null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0274, code lost:
    
        if (r12 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x022d, code lost:
    
        if (r13 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x01b4, code lost:
    
        if (r15 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x016d, code lost:
    
        if (r4 == null) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(DivIndicator divIndicator, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        Hashable hashable;
        Hashable hashable2;
        if (divIndicator == null) {
            return false;
        }
        List<zd> list = divIndicator.Q;
        zd zdVar = divIndicator.P;
        List<md> list2 = divIndicator.N;
        List<DivTrigger> list3 = divIndicator.M;
        List<DivTransitionTrigger> list4 = divIndicator.L;
        e1 e1Var = divIndicator.K;
        e1 e1Var2 = divIndicator.J;
        d2 d2Var = divIndicator.I;
        hd hdVar = divIndicator.H;
        List<DivTooltip> list5 = divIndicator.G;
        List<DivAction> list6 = divIndicator.D;
        y3 y3Var = divIndicator.z;
        List<zd> list7 = list;
        y3 y3Var2 = divIndicator.x;
        vmn vmnVar = divIndicator.w;
        List<md> list8 = list2;
        k5 k5Var = divIndicator.v;
        List<DivTrigger> list9 = list3;
        y8 y8Var = divIndicator.u;
        List<DivTransitionTrigger> list10 = list4;
        y8 y8Var2 = divIndicator.t;
        List<t4> list11 = divIndicator.p;
        jln jlnVar = divIndicator.o;
        List<zkn> list12 = divIndicator.n;
        List<v3> list13 = divIndicator.m;
        List<DivTooltip> list14 = list5;
        u1 u1Var = divIndicator.k;
        List<DivAction> list15 = list6;
        List<m1> list16 = divIndicator.j;
        List<w0> list17 = divIndicator.i;
        y8 y8Var3 = divIndicator.d;
        DivAccessibility divAccessibility = divIndicator.a;
        DivAccessibility divAccessibility2 = this.a;
        if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null) || this.b.evaluate(expressionResolver).intValue() != divIndicator.b.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        if (!(this.c.evaluate(expressionResolver).doubleValue() == divIndicator.c.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        y8 y8Var4 = this.d;
        if (!(y8Var4 != null ? y8Var4.a(y8Var3, expressionResolver, expressionResolver2) : y8Var3 == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expression = this.e;
        DivAlignmentHorizontal evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expression2 = divIndicator.e;
        if (evaluate != (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.f;
        DivAlignmentVertical evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expression4 = divIndicator.f;
        if (evaluate2 != (expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(this.g.evaluate(expressionResolver).doubleValue() == divIndicator.g.evaluate(expressionResolver2).doubleValue()) || this.h.evaluate(expressionResolver) != divIndicator.h.evaluate(expressionResolver2)) {
            return false;
        }
        List<w0> list18 = this.i;
        if (list18 != null) {
            if (list17 != null) {
                if (list18.size() == list17.size()) {
                    int i = 0;
                    for (Object obj : list18) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((w0) obj).a(list17.get(i), expressionResolver, expressionResolver2)) {
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
        if (!z) {
            return false;
        }
        List<m1> list19 = this.j;
        if (list19 != null) {
            if (list16 != null) {
                if (list19.size() == list16.size()) {
                    int i3 = 0;
                    for (Object obj2 : list19) {
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
        u1 u1Var2 = this.k;
        if (!(u1Var2 != null ? u1Var2.a(u1Var, expressionResolver, expressionResolver2) : u1Var == null)) {
            return false;
        }
        Expression<Long> expression5 = this.l;
        Long evaluate3 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<Long> expression6 = divIndicator.l;
        if (!epx.f(evaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<v3> list20 = this.m;
        if (list20 != null) {
            if (list13 != null) {
                if (list20.size() == list13.size()) {
                    int i5 = 0;
                    for (Object obj3 : list20) {
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
        List<zkn> list21 = this.n;
        if (list21 != null) {
            if (list12 != null) {
                if (list21.size() == list12.size()) {
                    int i7 = 0;
                    for (Object obj4 : list21) {
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
        jln jlnVar2 = this.o;
        if (!(jlnVar2 != null ? jlnVar2.a(jlnVar, expressionResolver, expressionResolver2) : jlnVar == null)) {
            return false;
        }
        List<t4> list22 = this.p;
        if (list22 != null) {
            if (list11 != null) {
                if (list22.size() == list11.size()) {
                    int i9 = 0;
                    for (Object obj5 : list22) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((t4) obj5).a(list11.get(i9))) {
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
        if (!z5 || !this.q.a(divIndicator.q, expressionResolver, expressionResolver2) || !epx.f(this.r, divIndicator.r) || this.s.evaluate(expressionResolver).intValue() != divIndicator.s.evaluate(expressionResolver2).intValue()) {
            return false;
        }
        y8 y8Var5 = this.t;
        if (!(y8Var5 != null ? y8Var5.a(y8Var2, expressionResolver, expressionResolver2) : y8Var2 == null)) {
            return false;
        }
        y8 y8Var6 = this.u;
        if (!(y8Var6 != null ? y8Var6.a(y8Var, expressionResolver, expressionResolver2) : y8Var == null)) {
            return false;
        }
        k5 k5Var2 = this.v;
        if (k5Var2 != null) {
            if (k5Var != null) {
                if (k5Var2 instanceof k5.a) {
                    p3 p3Var = ((k5.a) k5Var2).b;
                    if (k5Var instanceof k5.a) {
                        hashable2 = ((k5.a) k5Var).b;
                    } else {
                        if (!(k5Var instanceof k5.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hashable2 = ((k5.b) k5Var).b;
                    }
                    p3 p3Var2 = hashable2 instanceof p3 ? (p3) hashable2 : null;
                    if (p3Var2 == null) {
                        p3Var.getClass();
                    } else {
                        z6 = p3Var.a.a(p3Var2.a, expressionResolver, expressionResolver2);
                    }
                } else {
                    if (!(k5Var2 instanceof k5.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sa saVar = ((k5.b) k5Var2).b;
                    if (k5Var instanceof k5.a) {
                        hashable = ((k5.a) k5Var).b;
                    } else {
                        if (!(k5Var instanceof k5.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hashable = ((k5.b) k5Var).b;
                    }
                    sa saVar2 = hashable instanceof sa ? (sa) hashable : null;
                    if (saVar2 == null) {
                        saVar.getClass();
                    } else if (saVar.a.a(saVar2.a, expressionResolver, expressionResolver2)) {
                    }
                }
            }
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        vmn vmnVar2 = this.w;
        if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
            return false;
        }
        y3 y3Var3 = this.x;
        if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null)) {
            return false;
        }
        if (!(this.y.evaluate(expressionResolver).doubleValue() == divIndicator.y.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        y3 y3Var4 = this.z;
        if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null) || !epx.f(this.A, divIndicator.A)) {
            return false;
        }
        Expression<String> expression7 = this.B;
        String evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<String> expression8 = divIndicator.B;
        if (!epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression9 = this.C;
        Long evaluate5 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
        Expression<Long> expression10 = divIndicator.C;
        if (!epx.f(evaluate5, expression10 != null ? expression10.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<DivAction> list23 = this.D;
        if (list23 != null) {
            if (list15 != null) {
                if (list23.size() == list15.size()) {
                    int i11 = 0;
                    for (Object obj6 : list23) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivAction> list24 = list15;
                        if (((DivAction) obj6).a(list24.get(i11), expressionResolver, expressionResolver2)) {
                            i11 = i12;
                            list15 = list24;
                        }
                    }
                    z7 = true;
                }
                z7 = false;
                break;
            }
            return false;
        }
        if (!z7 || !this.E.a(divIndicator.E, expressionResolver, expressionResolver2) || !this.F.a(divIndicator.F, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivTooltip> list25 = this.G;
        if (list25 != null) {
            if (list14 != null) {
                if (list25.size() == list14.size()) {
                    int i13 = 0;
                    for (Object obj7 : list25) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTooltip> list26 = list14;
                        if (((DivTooltip) obj7).a(list26.get(i13), expressionResolver, expressionResolver2)) {
                            i13 = i14;
                            list14 = list26;
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
        List<DivTransitionTrigger> list27 = this.L;
        if (list27 != null) {
            if (list10 != null) {
                if (list27.size() == list10.size()) {
                    int i15 = 0;
                    for (Object obj8 : list27) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTransitionTrigger> list28 = list10;
                        if (((DivTransitionTrigger) obj8) == list28.get(i15)) {
                            i15 = i16;
                            list10 = list28;
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
        List<DivTrigger> list29 = this.M;
        if (list29 != null) {
            if (list9 != null) {
                if (list29.size() == list9.size()) {
                    int i17 = 0;
                    for (Object obj9 : list29) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTrigger> list30 = list9;
                        if (((DivTrigger) obj9).a(list30.get(i17), expressionResolver, expressionResolver2)) {
                            i17 = i18;
                            list9 = list30;
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
        List<md> list31 = this.N;
        if (list31 != null) {
            if (list8 != null) {
                if (list31.size() == list8.size()) {
                    int i19 = 0;
                    for (Object obj10 : list31) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<md> list32 = list8;
                        if (((md) obj10).a(list32.get(i19), expressionResolver, expressionResolver2)) {
                            i19 = i20;
                            list8 = list32;
                        }
                    }
                    z11 = true;
                }
                z11 = false;
                break;
            }
            return false;
        }
        if (!z11 || this.O.evaluate(expressionResolver) != divIndicator.O.evaluate(expressionResolver2)) {
            return false;
        }
        zd zdVar2 = this.P;
        if (!(zdVar2 != null ? zdVar2.g(zdVar, expressionResolver, expressionResolver2) : zdVar == null)) {
            return false;
        }
        List<zd> list33 = this.Q;
        if (list33 != null) {
            if (list7 != null) {
                if (list33.size() == list7.size()) {
                    int i21 = 0;
                    for (Object obj11 : list33) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<zd> list34 = list7;
                        if (((zd) obj11).g(list34.get(i21), expressionResolver, expressionResolver2)) {
                            i21 = i22;
                            list7 = list34;
                        }
                    }
                    z12 = true;
                }
                z12 = false;
                break;
            }
            return false;
        }
        return z12 && this.R.a(divIndicator.R, expressionResolver, expressionResolver2);
    }

    @Override // xsna.ikn
    public final Expression<Double> a() {
        return this.g;
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
        return this.k;
    }

    @Override // xsna.ikn
    public final Expression<Long> e() {
        return this.l;
    }

    @Override // xsna.ikn
    public final List<md> f() {
        return this.N;
    }

    @Override // xsna.ikn
    public final y3 g() {
        return this.x;
    }

    @Override // xsna.ikn
    public final List<m1> getBackground() {
        return this.j;
    }

    @Override // xsna.ikn
    public final v9 getHeight() {
        return this.q;
    }

    @Override // xsna.ikn
    public final String getId() {
        return this.r;
    }

    @Override // xsna.ikn
    public final Expression<DivVisibility> getVisibility() {
        return this.O;
    }

    @Override // xsna.ikn
    public final v9 getWidth() {
        return this.R;
    }

    @Override // xsna.ikn
    public final Expression<Long> h() {
        return this.C;
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
        Integer num = this.S;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(DivIndicator.class).hashCode();
        int i10 = 0;
        DivAccessibility divAccessibility = this.a;
        int hashCode2 = this.c.hashCode() + this.b.hashCode() + hashCode + (divAccessibility != null ? divAccessibility.hash() : 0);
        y8 y8Var = this.d;
        int hash = hashCode2 + (y8Var != null ? y8Var.hash() : 0);
        Expression<DivAlignmentHorizontal> expression = this.e;
        int hashCode3 = hash + (expression != null ? expression.hashCode() : 0);
        Expression<DivAlignmentVertical> expression2 = this.f;
        int hashCode4 = this.h.hashCode() + this.g.hashCode() + hashCode3 + (expression2 != null ? expression2.hashCode() : 0);
        List<w0> list = this.i;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((w0) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i11 = hashCode4 + i;
        List<m1> list2 = this.j;
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
        u1 u1Var = this.k;
        int hash2 = i12 + (u1Var != null ? u1Var.hash() : 0);
        Expression<Long> expression3 = this.l;
        int hashCode5 = hash2 + (expression3 != null ? expression3.hashCode() : 0);
        List<v3> list3 = this.m;
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
        List<zkn> list4 = this.n;
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
        jln jlnVar = this.o;
        int hash3 = i14 + (jlnVar != null ? jlnVar.hash() : 0);
        List<t4> list5 = this.p;
        if (list5 != null) {
            Iterator<T> it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((t4) it5.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int hash4 = this.q.hash() + hash3 + i5;
        String str = this.r;
        int hashCode6 = this.s.hashCode() + hash4 + (str != null ? str.hashCode() : 0);
        y8 y8Var2 = this.t;
        int hash5 = hashCode6 + (y8Var2 != null ? y8Var2.hash() : 0);
        y8 y8Var3 = this.u;
        int hash6 = hash5 + (y8Var3 != null ? y8Var3.hash() : 0);
        k5 k5Var = this.v;
        int hash7 = hash6 + (k5Var != null ? k5Var.hash() : 0);
        vmn vmnVar = this.w;
        int hash8 = hash7 + (vmnVar != null ? vmnVar.hash() : 0);
        y3 y3Var = this.x;
        int hashCode7 = this.y.hashCode() + hash8 + (y3Var != null ? y3Var.hash() : 0);
        y3 y3Var2 = this.z;
        int hash9 = hashCode7 + (y3Var2 != null ? y3Var2.hash() : 0);
        String str2 = this.A;
        int hashCode8 = hash9 + (str2 != null ? str2.hashCode() : 0);
        Expression<String> expression4 = this.B;
        int hashCode9 = hashCode8 + (expression4 != null ? expression4.hashCode() : 0);
        Expression<Long> expression5 = this.C;
        int hashCode10 = hashCode9 + (expression5 != null ? expression5.hashCode() : 0);
        List<DivAction> list6 = this.D;
        if (list6 != null) {
            Iterator<T> it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((DivAction) it6.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int hash10 = this.F.hash() + this.E.hash() + hashCode10 + i6;
        List<DivTooltip> list7 = this.G;
        if (list7 != null) {
            Iterator<T> it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((DivTooltip) it7.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int i15 = hash10 + i7;
        hd hdVar = this.H;
        int hash11 = i15 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.I;
        int hash12 = hash11 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.J;
        int hash13 = hash12 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.K;
        int hash14 = hash13 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list8 = this.L;
        int hashCode11 = hash14 + (list8 != null ? list8.hashCode() : 0);
        List<DivTrigger> list9 = this.M;
        if (list9 != null) {
            Iterator<T> it8 = list9.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((DivTrigger) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int i16 = hashCode11 + i8;
        List<md> list10 = this.N;
        if (list10 != null) {
            Iterator<T> it9 = list10.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((md) it9.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int hashCode12 = this.O.hashCode() + i16 + i9;
        zd zdVar = this.P;
        int hash15 = hashCode12 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list11 = this.Q;
        if (list11 != null) {
            Iterator<T> it10 = list11.iterator();
            while (it10.hasNext()) {
                i10 += ((zd) it10.next()).hash();
            }
        }
        int hash16 = this.R.hash() + hash15 + i10;
        this.S = Integer.valueOf(hash16);
        return hash16;
    }

    @Override // xsna.ikn
    public final Expression<String> i() {
        return this.B;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentHorizontal> j() {
        return this.e;
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
        return this.n;
    }

    @Override // xsna.ikn
    public final List<DivAction> n() {
        return this.D;
    }

    @Override // xsna.ikn
    public final vmn o() {
        return this.w;
    }

    @Override // xsna.ikn
    public final List<DivTrigger> p() {
        return this.M;
    }

    @Override // xsna.ikn
    public final e1 q() {
        return this.J;
    }

    @Override // xsna.ikn
    public final List<w0> r() {
        return this.i;
    }

    @Override // xsna.ikn
    public final List<zd> s() {
        return this.Q;
    }

    @Override // xsna.ikn
    public final d2 t() {
        return this.I;
    }

    @Override // xsna.ikn
    public final List<v3> u() {
        return this.m;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentVertical> v() {
        return this.f;
    }

    @Override // xsna.ikn
    public final jln w() {
        return this.o;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((p5.e) BuiltInParserKt.getBuiltInParserComponent().d4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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
        return this.P;
    }

    public DivIndicator() {
        this(null, T, U, null, null, null, V, W, null, null, null, null, null, null, null, null, X, null, Y, null, null, null, null, null, Z, null, null, null, null, null, a0, b0, null, null, null, null, null, null, null, null, c0, null, null, d0);
    }
}
