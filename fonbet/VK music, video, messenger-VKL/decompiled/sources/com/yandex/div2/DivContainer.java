package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.v2;
import com.yandex.div2.v9;
import com.yandex.div2.w2;
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
import xsna.ukn;
import xsna.vmn;
import xsna.zkn;

/* compiled from: DivContainer.kt */
/* loaded from: classes8.dex */
public final class DivContainer implements JSONSerializable, Hashable, ikn {
    public static final DivAnimation e0;
    public static final Expression<Double> f0;
    public static final Expression<Boolean> g0;
    public static final Expression<Boolean> h0;
    public static final Expression<DivContentAlignmentHorizontal> i0;
    public static final Expression<DivContentAlignmentVertical> j0;
    public static final v9.c k0;
    public static final Expression<Long> l0;
    public static final Expression<LayoutMode> m0;
    public static final Expression<Long> n0;
    public static final Expression<Orientation> o0;
    public static final Expression<DivVisibility> p0;
    public static final v9.b q0;
    public final Expression<Long> A;
    public final List<com.yandex.div2.a> B;
    public final Expression<LayoutMode> C;
    public final vmn D;
    public final a E;
    public final Expression<Long> F;
    public final List<DivAction> G;
    public final y3 H;
    public final Expression<Orientation> I;
    public final y3 J;
    public final List<DivAction> K;
    public final List<DivAction> L;
    public final Expression<String> M;
    public final Expression<Long> N;
    public final List<DivAction> O;
    public final a P;
    public final List<DivTooltip> Q;
    public final hd R;
    public final d2 S;
    public final e1 T;
    public final e1 U;
    public final List<DivTransitionTrigger> V;
    public final List<DivTrigger> W;
    public final List<md> X;
    public final Expression<DivVisibility> Y;
    public final zd Z;
    public final DivAccessibility a;
    public final List<zd> a0;
    public final DivAction b;
    public final v9 b0;
    public final DivAnimation c;
    public Integer c0;
    public final List<DivAction> d;
    public Integer d0;
    public final Expression<DivAlignmentHorizontal> e;
    public final Expression<DivAlignmentVertical> f;
    public final Expression<Double> g;
    public final List<w0> h;
    public final j1 i;
    public final List<m1> j;
    public final u1 k;
    public final Expression<Boolean> l;
    public final Expression<Boolean> m;
    public final Expression<Long> n;
    public final Expression<DivContentAlignmentHorizontal> o;
    public final Expression<DivContentAlignmentVertical> p;
    public final List<v3> q;
    public final List<DivAction> r;
    public final List<zkn> s;
    public final jln t;
    public final List<t4> u;
    public final v9 v;
    public final List<DivAction> w;
    public final List<DivAction> x;
    public final String y;
    public final o2 z;

    /* compiled from: DivContainer.kt */
    public enum LayoutMode {
        NO_WRAP("no_wrap"),
        WRAP("wrap");

        private final String value;
        public static final c Converter = new c();
        public static final izs<LayoutMode, String> TO_STRING = b.i;
        public static final izs<String, LayoutMode> FROM_STRING = a.i;

        /* compiled from: DivContainer.kt */
        public static final class a extends Lambda implements izs<String, LayoutMode> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final LayoutMode invoke(String str) {
                String str2 = str;
                LayoutMode.Converter.getClass();
                LayoutMode layoutMode = LayoutMode.NO_WRAP;
                if (epx.f(str2, layoutMode.value)) {
                    return layoutMode;
                }
                LayoutMode layoutMode2 = LayoutMode.WRAP;
                if (epx.f(str2, layoutMode2.value)) {
                    return layoutMode2;
                }
                return null;
            }
        }

        /* compiled from: DivContainer.kt */
        public static final class b extends Lambda implements izs<LayoutMode, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(LayoutMode layoutMode) {
                LayoutMode.Converter.getClass();
                return layoutMode.value;
            }
        }

        /* compiled from: DivContainer.kt */
        public static final class c {
        }

        LayoutMode(String str) {
            this.value = str;
        }
    }

    /* compiled from: DivContainer.kt */
    public enum Orientation {
        VERTICAL("vertical"),
        HORIZONTAL("horizontal"),
        OVERLAP("overlap");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Orientation, String> TO_STRING = b.i;
        public static final izs<String, Orientation> FROM_STRING = a.i;

        /* compiled from: DivContainer.kt */
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
                Orientation orientation3 = Orientation.OVERLAP;
                if (epx.f(str2, orientation3.value)) {
                    return orientation3;
                }
                return null;
            }
        }

        /* compiled from: DivContainer.kt */
        public static final class b extends Lambda implements izs<Orientation, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Orientation orientation) {
                Orientation.Converter.getClass();
                return orientation.value;
            }
        }

        /* compiled from: DivContainer.kt */
        public static final class c {
        }

        Orientation(String str) {
            this.value = str;
        }
    }

    /* compiled from: DivContainer.kt */
    public static final class a implements JSONSerializable, Hashable {
        public final y3 a;
        public final Expression<Boolean> b;
        public final Expression<Boolean> c;
        public final Expression<Boolean> d;
        public final ukn e;
        public Integer f;

        static {
            Expression.Companion companion = Expression.Companion;
            Boolean bool = Boolean.FALSE;
            Expression.Companion.constant$default(companion, bool, null, 2, null);
            Expression.Companion.constant$default(companion, bool, null, 2, null);
            Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        }

        public a(y3 y3Var, Expression<Boolean> expression, Expression<Boolean> expression2, Expression<Boolean> expression3, ukn uknVar) {
            this.a = y3Var;
            this.b = expression;
            this.c = expression2;
            this.d = expression3;
            this.e = uknVar;
        }

        public final boolean a(a aVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (aVar == null) {
                return false;
            }
            y3 y3Var = aVar.a;
            y3 y3Var2 = this.a;
            return (y3Var2 != null ? y3Var2.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null) && this.b.evaluate(expressionResolver).booleanValue() == aVar.b.evaluate(expressionResolver2).booleanValue() && this.c.evaluate(expressionResolver).booleanValue() == aVar.c.evaluate(expressionResolver2).booleanValue() && this.d.evaluate(expressionResolver).booleanValue() == aVar.d.evaluate(expressionResolver2).booleanValue() && this.e.a(aVar.e, expressionResolver, expressionResolver2);
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.f;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = fpf0.a(a.class).hashCode();
            y3 y3Var = this.a;
            int hash = this.e.hash() + this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + hashCode + (y3Var != null ? y3Var.hash() : 0);
            this.f = Integer.valueOf(hash);
            return hash;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((w2.a) BuiltInParserKt.getBuiltInParserComponent().p2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression constant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression constant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression constant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        e0 = new DivAnimation(constant$default, constant$default2, constant$default3, Expression.Companion.constant$default(companion, valueOf, null, 2, null));
        f0 = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        g0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        h0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        i0 = Expression.Companion.constant$default(companion, DivContentAlignmentHorizontal.START, null, 2, null);
        j0 = Expression.Companion.constant$default(companion, DivContentAlignmentVertical.TOP, null, 2, null);
        k0 = new v9.c(new krn(null, null, null));
        l0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        m0 = Expression.Companion.constant$default(companion, LayoutMode.NO_WRAP, null, 2, null);
        n0 = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        o0 = Expression.Companion.constant$default(companion, Orientation.VERTICAL, null, 2, null);
        p0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        q0 = new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivContainer(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list2, j1 j1Var, List<? extends m1> list3, u1 u1Var, Expression<Boolean> expression4, Expression<Boolean> expression5, Expression<Long> expression6, Expression<DivContentAlignmentHorizontal> expression7, Expression<DivContentAlignmentVertical> expression8, List<v3> list4, List<DivAction> list5, List<zkn> list6, jln jlnVar, List<t4> list7, v9 v9Var, List<DivAction> list8, List<DivAction> list9, String str, o2 o2Var, Expression<Long> expression9, List<? extends com.yandex.div2.a> list10, Expression<LayoutMode> expression10, vmn vmnVar, a aVar, Expression<Long> expression11, List<DivAction> list11, y3 y3Var, Expression<Orientation> expression12, y3 y3Var2, List<DivAction> list12, List<DivAction> list13, Expression<String> expression13, Expression<Long> expression14, List<DivAction> list14, a aVar2, List<DivTooltip> list15, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list16, List<DivTrigger> list17, List<? extends md> list18, Expression<DivVisibility> expression15, zd zdVar, List<zd> list19, v9 v9Var2) {
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
        this.p = expression8;
        this.q = list4;
        this.r = list5;
        this.s = list6;
        this.t = jlnVar;
        this.u = list7;
        this.v = v9Var;
        this.w = list8;
        this.x = list9;
        this.y = str;
        this.z = o2Var;
        this.A = expression9;
        this.B = list10;
        this.C = expression10;
        this.D = vmnVar;
        this.E = aVar;
        this.F = expression11;
        this.G = list11;
        this.H = y3Var;
        this.I = expression12;
        this.J = y3Var2;
        this.K = list12;
        this.L = list13;
        this.M = expression13;
        this.N = expression14;
        this.O = list14;
        this.P = aVar2;
        this.Q = list15;
        this.R = hdVar;
        this.S = d2Var;
        this.T = e1Var;
        this.U = e1Var2;
        this.V = list16;
        this.W = list17;
        this.X = list18;
        this.Y = expression15;
        this.Z = zdVar;
        this.a0 = list19;
        this.b0 = v9Var2;
    }

    public static DivContainer B(DivContainer divContainer, String str, List list, int i) {
        List<DivAction> list2;
        DivAccessibility divAccessibility = divContainer.a;
        DivAction divAction = divContainer.b;
        DivAnimation divAnimation = divContainer.c;
        List<DivAction> list3 = divContainer.d;
        Expression<DivAlignmentHorizontal> expression = divContainer.e;
        Expression<DivAlignmentVertical> expression2 = divContainer.f;
        Expression<Double> expression3 = divContainer.g;
        List<w0> list4 = divContainer.h;
        j1 j1Var = divContainer.i;
        List<m1> list5 = divContainer.j;
        u1 u1Var = divContainer.k;
        Expression<Boolean> expression4 = divContainer.l;
        Expression<Boolean> expression5 = divContainer.m;
        Expression<Long> expression6 = divContainer.n;
        Expression<DivContentAlignmentHorizontal> expression7 = divContainer.o;
        Expression<DivContentAlignmentVertical> expression8 = divContainer.p;
        List<v3> list6 = divContainer.q;
        List<DivAction> list7 = divContainer.r;
        List<zkn> list8 = divContainer.s;
        jln jlnVar = divContainer.t;
        List<t4> list9 = divContainer.u;
        v9 v9Var = divContainer.v;
        List<DivAction> list10 = divContainer.w;
        List<DivAction> list11 = divContainer.x;
        if ((i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0) {
            list2 = list11;
            str = divContainer.y;
        } else {
            list2 = list11;
        }
        o2 o2Var = divContainer.z;
        Expression<Long> expression9 = divContainer.A;
        Expression<LayoutMode> expression10 = divContainer.C;
        vmn vmnVar = divContainer.D;
        a aVar = divContainer.E;
        Expression<Long> expression11 = divContainer.F;
        List<DivAction> list12 = divContainer.G;
        y3 y3Var = divContainer.H;
        Expression<Orientation> expression12 = divContainer.I;
        y3 y3Var2 = divContainer.J;
        List<DivAction> list13 = divContainer.K;
        List<DivAction> list14 = divContainer.L;
        Expression<String> expression13 = divContainer.M;
        Expression<Long> expression14 = divContainer.N;
        List<DivAction> list15 = divContainer.O;
        a aVar2 = divContainer.P;
        List<DivTooltip> list16 = divContainer.Q;
        hd hdVar = divContainer.R;
        d2 d2Var = divContainer.S;
        e1 e1Var = divContainer.T;
        e1 e1Var2 = divContainer.U;
        List<DivTransitionTrigger> list17 = divContainer.V;
        List<DivTrigger> list18 = divContainer.W;
        List<md> list19 = divContainer.X;
        Expression<DivVisibility> expression15 = divContainer.Y;
        zd zdVar = divContainer.Z;
        List<zd> list20 = divContainer.a0;
        v9 v9Var2 = divContainer.b0;
        divContainer.getClass();
        return new DivContainer(divAccessibility, divAction, divAnimation, list3, expression, expression2, expression3, list4, j1Var, list5, u1Var, expression4, expression5, expression6, expression7, expression8, list6, list7, list8, jlnVar, list9, v9Var, list10, list2, str, o2Var, expression9, list, expression10, vmnVar, aVar, expression11, list12, y3Var, expression12, y3Var2, list13, list14, expression13, expression14, list15, aVar2, list16, hdVar, d2Var, e1Var, e1Var2, list17, list18, list19, expression15, zdVar, list20, v9Var2);
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:526:0x08da, code lost:
    
        if (r17 == null) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x086c, code lost:
    
        if (r19 == null) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x081f, code lost:
    
        if (r20 == null) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x07d2, code lost:
    
        if (r21 == null) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0732, code lost:
    
        if (r26 == null) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x06d1, code lost:
    
        if (r28 == null) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0644, code lost:
    
        if (r29 == null) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x05f7, code lost:
    
        if (r30 == null) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0574, code lost:
    
        if (r33 == null) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x04d5, code lost:
    
        if (r36 == null) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x044e, code lost:
    
        if (r38 == null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0401, code lost:
    
        if (r39 == null) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x03aa, code lost:
    
        if (r41 == null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x034b, code lost:
    
        if (r6 == null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0304, code lost:
    
        if (r7 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x02bd, code lost:
    
        if (r8 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x01f4, code lost:
    
        if (r10 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x019b, code lost:
    
        if (r12 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x00f9, code lost:
    
        if (r13 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(DivContainer divContainer, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (divContainer == null) {
            return false;
        }
        List<zd> list = divContainer.a0;
        zd zdVar = divContainer.Z;
        List<md> list2 = divContainer.X;
        List<DivTrigger> list3 = divContainer.W;
        List<DivTransitionTrigger> list4 = divContainer.V;
        e1 e1Var = divContainer.U;
        e1 e1Var2 = divContainer.T;
        d2 d2Var = divContainer.S;
        hd hdVar = divContainer.R;
        List<DivTooltip> list5 = divContainer.Q;
        a aVar = divContainer.P;
        List<DivAction> list6 = divContainer.O;
        List<zd> list7 = list;
        List<DivAction> list8 = divContainer.L;
        List<DivAction> list9 = divContainer.K;
        List<md> list10 = list2;
        y3 y3Var = divContainer.J;
        List<DivTrigger> list11 = list3;
        y3 y3Var2 = divContainer.H;
        List<DivTransitionTrigger> list12 = list4;
        List<DivAction> list13 = divContainer.G;
        a aVar2 = divContainer.E;
        vmn vmnVar = divContainer.D;
        List<com.yandex.div2.a> list14 = divContainer.B;
        o2 o2Var = divContainer.z;
        List<DivTooltip> list15 = list5;
        List<DivAction> list16 = divContainer.x;
        List<DivAction> list17 = divContainer.w;
        List<DivAction> list18 = list6;
        List<t4> list19 = divContainer.u;
        List<DivAction> list20 = list8;
        jln jlnVar = divContainer.t;
        List<DivAction> list21 = list9;
        List<zkn> list22 = divContainer.s;
        List<DivAction> list23 = divContainer.r;
        List<v3> list24 = divContainer.q;
        List<DivAction> list25 = list13;
        u1 u1Var = divContainer.k;
        List<m1> list26 = divContainer.j;
        j1 j1Var = divContainer.i;
        List<com.yandex.div2.a> list27 = list14;
        List<w0> list28 = divContainer.h;
        List<DivAction> list29 = divContainer.d;
        List<DivAction> list30 = list16;
        DivAction divAction = divContainer.b;
        List<DivAction> list31 = list17;
        DivAccessibility divAccessibility = divContainer.a;
        List<t4> list32 = list19;
        DivAccessibility divAccessibility2 = this.a;
        if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
            return false;
        }
        DivAction divAction2 = this.b;
        if (!(divAction2 != null ? divAction2.a(divAction, expressionResolver, expressionResolver2) : divAction == null) || !this.c.a(divContainer.c, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list33 = this.d;
        if (list33 != null) {
            if (list29 != null) {
                th = null;
                if (list33.size() == list29.size()) {
                    int i = 0;
                    for (Object obj : list33) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((DivAction) obj).a(list29.get(i), expressionResolver, expressionResolver2)) {
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
        Expression<DivAlignmentHorizontal> expression2 = divContainer.e;
        if (obj2 != (expression2 != null ? (DivAlignmentHorizontal) expression2.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.f;
        Object obj3 = expression3 != null ? (DivAlignmentVertical) expression3.evaluate(expressionResolver) : th;
        Expression<DivAlignmentVertical> expression4 = divContainer.f;
        if (obj3 != (expression4 != null ? (DivAlignmentVertical) expression4.evaluate(expressionResolver2) : th)) {
            return false;
        }
        if (!(this.g.evaluate(expressionResolver).doubleValue() == divContainer.g.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<w0> list34 = this.h;
        if (list34 != null) {
            if (list28 != null) {
                if (list34.size() == list28.size()) {
                    int i3 = 0;
                    for (Object obj4 : list34) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((w0) obj4).a(list28.get(i3), expressionResolver, expressionResolver2)) {
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
        List<m1> list35 = this.j;
        if (list35 != null) {
            if (list26 != null) {
                if (list35.size() == list26.size()) {
                    int i5 = 0;
                    for (Object obj5 : list35) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((m1) obj5).a(list26.get(i5), expressionResolver, expressionResolver2)) {
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
        if (!(u1Var2 != null ? u1Var2.a(u1Var, expressionResolver, expressionResolver2) : u1Var == null) || this.l.evaluate(expressionResolver).booleanValue() != divContainer.l.evaluate(expressionResolver2).booleanValue() || this.m.evaluate(expressionResolver).booleanValue() != divContainer.m.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<Long> expression5 = this.n;
        Long evaluate = expression5 != null ? expression5.evaluate(expressionResolver) : th;
        Expression<Long> expression6 = divContainer.n;
        if (!epx.f(evaluate, expression6 != null ? expression6.evaluate(expressionResolver2) : th) || this.o.evaluate(expressionResolver) != divContainer.o.evaluate(expressionResolver2) || this.p.evaluate(expressionResolver) != divContainer.p.evaluate(expressionResolver2)) {
            return false;
        }
        List<v3> list36 = this.q;
        if (list36 != null) {
            if (list24 != null) {
                if (list36.size() == list24.size()) {
                    int i7 = 0;
                    for (Object obj6 : list36) {
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
        List<DivAction> list37 = this.r;
        if (list37 != null) {
            if (list23 != null) {
                if (list37.size() == list23.size()) {
                    int i9 = 0;
                    for (Object obj7 : list37) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((DivAction) obj7).a(list23.get(i9), expressionResolver, expressionResolver2)) {
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
        List<zkn> list38 = this.s;
        if (list38 != null) {
            if (list22 != null) {
                if (list38.size() == list22.size()) {
                    int i11 = 0;
                    for (Object obj8 : list38) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (((zkn) obj8).a(list22.get(i11))) {
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
        jln jlnVar2 = this.t;
        if (!(jlnVar2 != null ? jlnVar2.a(jlnVar, expressionResolver, expressionResolver2) : jlnVar == null)) {
            return false;
        }
        List<t4> list39 = this.u;
        if (list39 != null) {
            if (list32 != null) {
                if (list39.size() == list32.size()) {
                    int i13 = 0;
                    for (Object obj9 : list39) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<t4> list40 = list32;
                        if (((t4) obj9).a(list40.get(i13))) {
                            i13 = i14;
                            list32 = list40;
                        }
                    }
                    z7 = true;
                }
                z7 = false;
                break;
            }
            return false;
        }
        if (!z7 || !this.v.a(divContainer.v, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<DivAction> list41 = this.w;
        if (list41 != null) {
            if (list31 != null) {
                if (list41.size() == list31.size()) {
                    int i15 = 0;
                    for (Object obj10 : list41) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list42 = list31;
                        if (((DivAction) obj10).a(list42.get(i15), expressionResolver, expressionResolver2)) {
                            i15 = i16;
                            list31 = list42;
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
        List<DivAction> list43 = this.x;
        if (list43 != null) {
            if (list30 != null) {
                if (list43.size() == list30.size()) {
                    int i17 = 0;
                    for (Object obj11 : list43) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list44 = list30;
                        if (((DivAction) obj11).a(list44.get(i17), expressionResolver, expressionResolver2)) {
                            i17 = i18;
                            list30 = list44;
                        }
                    }
                    z9 = true;
                }
                z9 = false;
                break;
            }
            return false;
        }
        if (!z9 || !epx.f(this.y, divContainer.y)) {
            return false;
        }
        o2 o2Var2 = this.z;
        if (!(o2Var2 != null ? o2Var2.a(o2Var, expressionResolver, expressionResolver2) : o2Var == null) || this.A.evaluate(expressionResolver).longValue() != divContainer.A.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<com.yandex.div2.a> list45 = this.B;
        if (list45 != null) {
            if (list27 != null) {
                if (list45.size() == list27.size()) {
                    int i19 = 0;
                    for (Object obj12 : list45) {
                        int i20 = i19 + 1;
                        if (i19 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<com.yandex.div2.a> list46 = list27;
                        if (((com.yandex.div2.a) obj12).a(list46.get(i19), expressionResolver, expressionResolver2)) {
                            i19 = i20;
                            list27 = list46;
                        }
                    }
                    z10 = true;
                }
                z10 = false;
                break;
            }
            return false;
        }
        if (!z10 || this.C.evaluate(expressionResolver) != divContainer.C.evaluate(expressionResolver2)) {
            return false;
        }
        vmn vmnVar2 = this.D;
        if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
            return false;
        }
        a aVar3 = this.E;
        if (!(aVar3 != null ? aVar3.a(aVar2, expressionResolver, expressionResolver2) : aVar2 == null) || this.F.evaluate(expressionResolver).longValue() != divContainer.F.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<DivAction> list47 = this.G;
        if (list47 != null) {
            if (list25 != null) {
                if (list47.size() == list25.size()) {
                    int i21 = 0;
                    for (Object obj13 : list47) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list48 = list25;
                        if (((DivAction) obj13).a(list48.get(i21), expressionResolver, expressionResolver2)) {
                            i21 = i22;
                            list25 = list48;
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
        y3 y3Var3 = this.H;
        if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null) || this.I.evaluate(expressionResolver) != divContainer.I.evaluate(expressionResolver2)) {
            return false;
        }
        y3 y3Var4 = this.J;
        if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null)) {
            return false;
        }
        List<DivAction> list49 = this.K;
        if (list49 != null) {
            if (list21 != null) {
                if (list49.size() == list21.size()) {
                    int i23 = 0;
                    for (Object obj14 : list49) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list50 = list21;
                        if (((DivAction) obj14).a(list50.get(i23), expressionResolver, expressionResolver2)) {
                            i23 = i24;
                            list21 = list50;
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
        List<DivAction> list51 = this.L;
        if (list51 != null) {
            if (list20 != null) {
                if (list51.size() == list20.size()) {
                    int i25 = 0;
                    for (Object obj15 : list51) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list52 = list20;
                        if (((DivAction) obj15).a(list52.get(i25), expressionResolver, expressionResolver2)) {
                            i25 = i26;
                            list20 = list52;
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
        Expression<String> expression7 = this.M;
        String evaluate2 = expression7 != null ? expression7.evaluate(expressionResolver) : th;
        Expression<String> expression8 = divContainer.M;
        if (!epx.f(evaluate2, expression8 != null ? expression8.evaluate(expressionResolver2) : th)) {
            return false;
        }
        Expression<Long> expression9 = this.N;
        Long evaluate3 = expression9 != null ? expression9.evaluate(expressionResolver) : th;
        Expression<Long> expression10 = divContainer.N;
        if (!epx.f(evaluate3, expression10 != null ? expression10.evaluate(expressionResolver2) : th)) {
            return false;
        }
        List<DivAction> list53 = this.O;
        if (list53 != null) {
            if (list18 != null) {
                if (list53.size() == list18.size()) {
                    int i27 = 0;
                    for (Object obj16 : list53) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivAction> list54 = list18;
                        if (((DivAction) obj16).a(list54.get(i27), expressionResolver, expressionResolver2)) {
                            i27 = i28;
                            list18 = list54;
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
        a aVar4 = this.P;
        if (!(aVar4 != null ? aVar4.a(aVar, expressionResolver, expressionResolver2) : aVar == null)) {
            return false;
        }
        List<DivTooltip> list55 = this.Q;
        if (list55 != null) {
            if (list15 != null) {
                if (list55.size() == list15.size()) {
                    int i29 = 0;
                    for (Object obj17 : list55) {
                        int i30 = i29 + 1;
                        if (i29 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivTooltip> list56 = list15;
                        if (((DivTooltip) obj17).a(list56.get(i29), expressionResolver, expressionResolver2)) {
                            i29 = i30;
                            list15 = list56;
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
        hd hdVar2 = this.R;
        if (!(hdVar2 != null ? hdVar2.a(hdVar, expressionResolver, expressionResolver2) : hdVar == null)) {
            return false;
        }
        d2 d2Var2 = this.S;
        if (!(d2Var2 != null ? d2Var2.a(d2Var, expressionResolver, expressionResolver2) : d2Var == null)) {
            return false;
        }
        e1 e1Var3 = this.T;
        if (!(e1Var3 != null ? e1Var3.a(e1Var2, expressionResolver, expressionResolver2) : e1Var2 == null)) {
            return false;
        }
        e1 e1Var4 = this.U;
        if (!(e1Var4 != null ? e1Var4.a(e1Var, expressionResolver, expressionResolver2) : e1Var == null)) {
            return false;
        }
        List<DivTransitionTrigger> list57 = this.V;
        if (list57 != null) {
            if (list12 != null) {
                if (list57.size() == list12.size()) {
                    int i31 = 0;
                    for (Object obj18 : list57) {
                        int i32 = i31 + 1;
                        if (i31 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivTransitionTrigger> list58 = list12;
                        if (((DivTransitionTrigger) obj18) == list58.get(i31)) {
                            i31 = i32;
                            list12 = list58;
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
        List<DivTrigger> list59 = this.W;
        if (list59 != null) {
            if (list11 != null) {
                if (list59.size() == list11.size()) {
                    int i33 = 0;
                    for (Object obj19 : list59) {
                        int i34 = i33 + 1;
                        if (i33 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<DivTrigger> list60 = list11;
                        if (((DivTrigger) obj19).a(list60.get(i33), expressionResolver, expressionResolver2)) {
                            i33 = i34;
                            list11 = list60;
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
        List<md> list61 = this.X;
        if (list61 != null) {
            if (list10 != null) {
                if (list61.size() == list10.size()) {
                    int i35 = 0;
                    for (Object obj20 : list61) {
                        int i36 = i35 + 1;
                        if (i35 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<md> list62 = list10;
                        if (((md) obj20).a(list62.get(i35), expressionResolver, expressionResolver2)) {
                            i35 = i36;
                            list10 = list62;
                        }
                    }
                    z18 = true;
                }
                z18 = false;
                break;
            }
            return false;
        }
        if (!z18 || this.Y.evaluate(expressionResolver) != divContainer.Y.evaluate(expressionResolver2)) {
            return false;
        }
        zd zdVar2 = this.Z;
        if (!(zdVar2 != null ? zdVar2.g(zdVar, expressionResolver, expressionResolver2) : zdVar == null)) {
            return false;
        }
        List<zd> list63 = this.a0;
        if (list63 != null) {
            if (list7 != null) {
                if (list63.size() == list7.size()) {
                    int i37 = 0;
                    for (Object obj21 : list63) {
                        int i38 = i37 + 1;
                        if (i37 < 0) {
                            e43.t();
                            throw th;
                        }
                        List<zd> list64 = list7;
                        if (((zd) obj21).g(list64.get(i37), expressionResolver, expressionResolver2)) {
                            i37 = i38;
                            list7 = list64;
                        }
                    }
                    z19 = true;
                }
                z19 = false;
                break;
            }
            return false;
        }
        return z19 && this.b0.a(divContainer.b0, expressionResolver, expressionResolver2);
    }

    @Override // xsna.ikn
    public final Expression<Double> a() {
        return this.g;
    }

    @Override // xsna.ikn
    public final List<DivTooltip> b() {
        return this.Q;
    }

    @Override // xsna.ikn
    public final hd c() {
        return this.R;
    }

    @Override // xsna.ikn
    public final u1 d() {
        return this.k;
    }

    @Override // xsna.ikn
    public final Expression<Long> e() {
        return this.n;
    }

    @Override // xsna.ikn
    public final List<md> f() {
        return this.X;
    }

    @Override // xsna.ikn
    public final y3 g() {
        return this.H;
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
        return this.Y;
    }

    @Override // xsna.ikn
    public final v9 getWidth() {
        return this.b0;
    }

    @Override // xsna.ikn
    public final Expression<Long> h() {
        return this.N;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.d0;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        int i = 0;
        List<com.yandex.div2.a> list = this.B;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                i += ((com.yandex.div2.a) it.next()).hash();
            }
        }
        int i2 = propertiesHash + i;
        this.d0 = Integer.valueOf(i2);
        return i2;
    }

    @Override // xsna.ikn
    public final Expression<String> i() {
        return this.M;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentHorizontal> j() {
        return this.e;
    }

    @Override // xsna.ikn
    public final e1 k() {
        return this.U;
    }

    @Override // xsna.ikn
    public final List<DivTransitionTrigger> l() {
        return this.V;
    }

    @Override // xsna.ikn
    public final List<zkn> m() {
        return this.s;
    }

    @Override // xsna.ikn
    public final List<DivAction> n() {
        return this.O;
    }

    @Override // xsna.ikn
    public final vmn o() {
        return this.D;
    }

    @Override // xsna.ikn
    public final List<DivTrigger> p() {
        return this.W;
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
        Integer num = this.c0;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(DivContainer.class).hashCode();
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
        int hashCode4 = this.m.hashCode() + this.l.hashCode() + i20 + (u1Var != null ? u1Var.hash() : 0);
        Expression<Long> expression3 = this.n;
        int hashCode5 = this.p.hashCode() + this.o.hashCode() + hashCode4 + (expression3 != null ? expression3.hashCode() : 0);
        List<v3> list4 = this.q;
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
        List<DivAction> list5 = this.r;
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
        List<zkn> list6 = this.s;
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
        jln jlnVar = this.t;
        int hash4 = i23 + (jlnVar != null ? jlnVar.hash() : 0);
        List<t4> list7 = this.u;
        if (list7 != null) {
            Iterator<T> it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((t4) it7.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int hash5 = this.v.hash() + hash4 + i7;
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
        o2 o2Var = this.z;
        int hashCode7 = this.C.hashCode() + this.A.hashCode() + hashCode6 + (o2Var != null ? o2Var.hash() : 0);
        vmn vmnVar = this.D;
        int hash6 = hashCode7 + (vmnVar != null ? vmnVar.hash() : 0);
        a aVar = this.E;
        int hashCode8 = this.F.hashCode() + hash6 + (aVar != null ? aVar.hash() : 0);
        List<DivAction> list10 = this.G;
        if (list10 != null) {
            Iterator<T> it10 = list10.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((DivAction) it10.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i26 = hashCode8 + i10;
        y3 y3Var = this.H;
        int hashCode9 = this.I.hashCode() + i26 + (y3Var != null ? y3Var.hash() : 0);
        y3 y3Var2 = this.J;
        int hash7 = hashCode9 + (y3Var2 != null ? y3Var2.hash() : 0);
        List<DivAction> list11 = this.K;
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
        List<DivAction> list12 = this.L;
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
        Expression<String> expression4 = this.M;
        int hashCode10 = i28 + (expression4 != null ? expression4.hashCode() : 0);
        Expression<Long> expression5 = this.N;
        int hashCode11 = hashCode10 + (expression5 != null ? expression5.hashCode() : 0);
        List<DivAction> list13 = this.O;
        if (list13 != null) {
            Iterator<T> it13 = list13.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((DivAction) it13.next()).hash();
            }
        } else {
            i13 = 0;
        }
        int i29 = hashCode11 + i13;
        a aVar2 = this.P;
        int hash8 = i29 + (aVar2 != null ? aVar2.hash() : 0);
        List<DivTooltip> list14 = this.Q;
        if (list14 != null) {
            Iterator<T> it14 = list14.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((DivTooltip) it14.next()).hash();
            }
        } else {
            i14 = 0;
        }
        int i30 = hash8 + i14;
        hd hdVar = this.R;
        int hash9 = i30 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.S;
        int hash10 = hash9 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.T;
        int hash11 = hash10 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.U;
        int hash12 = hash11 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list15 = this.V;
        int hashCode12 = hash12 + (list15 != null ? list15.hashCode() : 0);
        List<DivTrigger> list16 = this.W;
        if (list16 != null) {
            Iterator<T> it15 = list16.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((DivTrigger) it15.next()).hash();
            }
        } else {
            i15 = 0;
        }
        int i31 = hashCode12 + i15;
        List<md> list17 = this.X;
        if (list17 != null) {
            Iterator<T> it16 = list17.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((md) it16.next()).hash();
            }
        } else {
            i16 = 0;
        }
        int hashCode13 = this.Y.hashCode() + i31 + i16;
        zd zdVar = this.Z;
        int hash13 = hashCode13 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list18 = this.a0;
        if (list18 != null) {
            Iterator<T> it17 = list18.iterator();
            while (it17.hasNext()) {
                i17 += ((zd) it17.next()).hash();
            }
        }
        int hash14 = this.b0.hash() + hash13 + i17;
        this.c0 = Integer.valueOf(hash14);
        return hash14;
    }

    @Override // xsna.ikn
    public final e1 q() {
        return this.T;
    }

    @Override // xsna.ikn
    public final List<w0> r() {
        return this.h;
    }

    @Override // xsna.ikn
    public final List<zd> s() {
        return this.a0;
    }

    @Override // xsna.ikn
    public final d2 t() {
        return this.S;
    }

    @Override // xsna.ikn
    public final List<v3> u() {
        return this.q;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentVertical> v() {
        return this.f;
    }

    @Override // xsna.ikn
    public final jln w() {
        return this.t;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((v2.h) BuiltInParserKt.getBuiltInParserComponent().m2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // xsna.ikn
    public final DivAccessibility x() {
        return this.a;
    }

    @Override // xsna.ikn
    public final y3 y() {
        return this.J;
    }

    @Override // xsna.ikn
    public final zd z() {
        return this.Z;
    }

    public DivContainer() {
        this(null, null, e0, null, null, null, f0, null, null, null, null, g0, h0, null, i0, j0, null, null, null, null, null, k0, null, null, null, null, l0, null, m0, null, null, n0, null, null, o0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, p0, null, null, q0);
    }
}
