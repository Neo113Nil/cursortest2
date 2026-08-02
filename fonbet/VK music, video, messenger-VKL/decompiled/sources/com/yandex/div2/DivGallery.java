package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.v9;
import com.yandex.div2.w4;
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

/* compiled from: DivGallery.kt */
/* loaded from: classes8.dex */
public final class DivGallery implements JSONSerializable, Hashable, ikn {
    public static final Expression<Double> T;
    public static final Expression<CrossContentAlignment> U;
    public static final Expression<Long> V;
    public static final v9.c W;
    public static final Expression<Long> X;
    public static final Expression<Orientation> Y;
    public static final Expression<Boolean> Z;
    public static final Expression<ScrollMode> a0;
    public static final Expression<Scrollbar> b0;
    public static final Expression<DivVisibility> c0;
    public static final v9.b d0;
    public final Expression<String> A;
    public final Expression<Long> B;
    public final Expression<ScrollMode> C;
    public final Expression<Scrollbar> D;
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
    public Integer S;
    public final DivAccessibility a;
    public final Expression<DivAlignmentHorizontal> b;
    public final Expression<DivAlignmentVertical> c;
    public final Expression<Double> d;
    public final List<w0> e;
    public final List<m1> f;
    public final u1 g;
    public final Expression<Long> h;
    public final Expression<Long> i;
    public final Expression<CrossContentAlignment> j;
    public final Expression<Long> k;
    public final Expression<Long> l;
    public final List<v3> m;
    public final List<zkn> n;
    public final jln o;
    public final List<t4> p;
    public final v9 q;
    public final String r;
    public final o2 s;
    public final Expression<Long> t;
    public final List<a> u;
    public final vmn v;
    public final y3 w;
    public final Expression<Orientation> x;
    public final y3 y;
    public final Expression<Boolean> z;

    /* compiled from: DivGallery.kt */
    public enum CrossContentAlignment {
        START("start"),
        CENTER(TtmlNode.CENTER),
        END(TtmlNode.END);

        private final String value;
        public static final c Converter = new c();
        public static final izs<CrossContentAlignment, String> TO_STRING = b.i;
        public static final izs<String, CrossContentAlignment> FROM_STRING = a.i;

        /* compiled from: DivGallery.kt */
        public static final class a extends Lambda implements izs<String, CrossContentAlignment> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final CrossContentAlignment invoke(String str) {
                String str2 = str;
                CrossContentAlignment.Converter.getClass();
                CrossContentAlignment crossContentAlignment = CrossContentAlignment.START;
                if (epx.f(str2, crossContentAlignment.value)) {
                    return crossContentAlignment;
                }
                CrossContentAlignment crossContentAlignment2 = CrossContentAlignment.CENTER;
                if (epx.f(str2, crossContentAlignment2.value)) {
                    return crossContentAlignment2;
                }
                CrossContentAlignment crossContentAlignment3 = CrossContentAlignment.END;
                if (epx.f(str2, crossContentAlignment3.value)) {
                    return crossContentAlignment3;
                }
                return null;
            }
        }

        /* compiled from: DivGallery.kt */
        public static final class b extends Lambda implements izs<CrossContentAlignment, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(CrossContentAlignment crossContentAlignment) {
                CrossContentAlignment.Converter.getClass();
                return crossContentAlignment.value;
            }
        }

        /* compiled from: DivGallery.kt */
        public static final class c {
        }

        CrossContentAlignment(String str) {
            this.value = str;
        }
    }

    /* compiled from: DivGallery.kt */
    public enum Orientation {
        HORIZONTAL("horizontal"),
        VERTICAL("vertical");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Orientation, String> TO_STRING = b.i;
        public static final izs<String, Orientation> FROM_STRING = a.i;

        /* compiled from: DivGallery.kt */
        public static final class a extends Lambda implements izs<String, Orientation> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Orientation invoke(String str) {
                String str2 = str;
                Orientation.Converter.getClass();
                Orientation orientation = Orientation.HORIZONTAL;
                if (epx.f(str2, orientation.value)) {
                    return orientation;
                }
                Orientation orientation2 = Orientation.VERTICAL;
                if (epx.f(str2, orientation2.value)) {
                    return orientation2;
                }
                return null;
            }
        }

        /* compiled from: DivGallery.kt */
        public static final class b extends Lambda implements izs<Orientation, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Orientation orientation) {
                Orientation.Converter.getClass();
                return orientation.value;
            }
        }

        /* compiled from: DivGallery.kt */
        public static final class c {
        }

        Orientation(String str) {
            this.value = str;
        }
    }

    /* compiled from: DivGallery.kt */
    public enum ScrollMode {
        PAGING("paging"),
        DEFAULT(BuildConfig.FLAVOR);

        private final String value;
        public static final c Converter = new c();
        public static final izs<ScrollMode, String> TO_STRING = b.i;
        public static final izs<String, ScrollMode> FROM_STRING = a.i;

        /* compiled from: DivGallery.kt */
        public static final class a extends Lambda implements izs<String, ScrollMode> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final ScrollMode invoke(String str) {
                String str2 = str;
                ScrollMode.Converter.getClass();
                ScrollMode scrollMode = ScrollMode.PAGING;
                if (epx.f(str2, scrollMode.value)) {
                    return scrollMode;
                }
                ScrollMode scrollMode2 = ScrollMode.DEFAULT;
                if (epx.f(str2, scrollMode2.value)) {
                    return scrollMode2;
                }
                return null;
            }
        }

        /* compiled from: DivGallery.kt */
        public static final class b extends Lambda implements izs<ScrollMode, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(ScrollMode scrollMode) {
                ScrollMode.Converter.getClass();
                return scrollMode.value;
            }
        }

        /* compiled from: DivGallery.kt */
        public static final class c {
        }

        ScrollMode(String str) {
            this.value = str;
        }
    }

    /* compiled from: DivGallery.kt */
    public enum Scrollbar {
        NONE("none"),
        AUTO("auto");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Scrollbar, String> TO_STRING = b.i;
        public static final izs<String, Scrollbar> FROM_STRING = a.i;

        /* compiled from: DivGallery.kt */
        public static final class a extends Lambda implements izs<String, Scrollbar> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Scrollbar invoke(String str) {
                String str2 = str;
                Scrollbar.Converter.getClass();
                Scrollbar scrollbar = Scrollbar.NONE;
                if (epx.f(str2, scrollbar.value)) {
                    return scrollbar;
                }
                Scrollbar scrollbar2 = Scrollbar.AUTO;
                if (epx.f(str2, scrollbar2.value)) {
                    return scrollbar2;
                }
                return null;
            }
        }

        /* compiled from: DivGallery.kt */
        public static final class b extends Lambda implements izs<Scrollbar, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Scrollbar scrollbar) {
                Scrollbar.Converter.getClass();
                return scrollbar.value;
            }
        }

        /* compiled from: DivGallery.kt */
        public static final class c {
        }

        Scrollbar(String str) {
            this.value = str;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        T = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        U = Expression.Companion.constant$default(companion, CrossContentAlignment.START, null, 2, null);
        V = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        W = new v9.c(new krn(null, null, null));
        X = Expression.Companion.constant$default(companion, 8L, null, 2, null);
        Y = Expression.Companion.constant$default(companion, Orientation.HORIZONTAL, null, 2, null);
        Z = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        a0 = Expression.Companion.constant$default(companion, ScrollMode.DEFAULT, null, 2, null);
        b0 = Expression.Companion.constant$default(companion, Scrollbar.NONE, null, 2, null);
        c0 = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        d0 = new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivGallery(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list, List<? extends m1> list2, u1 u1Var, Expression<Long> expression4, Expression<Long> expression5, Expression<CrossContentAlignment> expression6, Expression<Long> expression7, Expression<Long> expression8, List<v3> list3, List<zkn> list4, jln jlnVar, List<t4> list5, v9 v9Var, String str, o2 o2Var, Expression<Long> expression9, List<? extends a> list6, vmn vmnVar, y3 y3Var, Expression<Orientation> expression10, y3 y3Var2, Expression<Boolean> expression11, Expression<String> expression12, Expression<Long> expression13, Expression<ScrollMode> expression14, Expression<Scrollbar> expression15, List<DivAction> list7, List<DivTooltip> list8, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list9, List<DivTrigger> list10, List<? extends md> list11, Expression<DivVisibility> expression16, zd zdVar, List<zd> list12, v9 v9Var2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = list2;
        this.g = u1Var;
        this.h = expression4;
        this.i = expression5;
        this.j = expression6;
        this.k = expression7;
        this.l = expression8;
        this.m = list3;
        this.n = list4;
        this.o = jlnVar;
        this.p = list5;
        this.q = v9Var;
        this.r = str;
        this.s = o2Var;
        this.t = expression9;
        this.u = list6;
        this.v = vmnVar;
        this.w = y3Var;
        this.x = expression10;
        this.y = y3Var2;
        this.z = expression11;
        this.A = expression12;
        this.B = expression13;
        this.C = expression14;
        this.D = expression15;
        this.E = list7;
        this.F = list8;
        this.G = hdVar;
        this.H = d2Var;
        this.I = e1Var;
        this.J = e1Var2;
        this.K = list9;
        this.L = list10;
        this.M = list11;
        this.N = expression16;
        this.O = zdVar;
        this.P = list12;
        this.Q = v9Var2;
    }

    public static DivGallery B(DivGallery divGallery, String str, List list, int i) {
        v9 v9Var;
        DivAccessibility divAccessibility = divGallery.a;
        Expression<DivAlignmentHorizontal> expression = divGallery.b;
        Expression<DivAlignmentVertical> expression2 = divGallery.c;
        Expression<Double> expression3 = divGallery.d;
        List<w0> list2 = divGallery.e;
        List<m1> list3 = divGallery.f;
        u1 u1Var = divGallery.g;
        Expression<Long> expression4 = divGallery.h;
        Expression<Long> expression5 = divGallery.i;
        Expression<CrossContentAlignment> expression6 = divGallery.j;
        Expression<Long> expression7 = divGallery.k;
        Expression<Long> expression8 = divGallery.l;
        List<v3> list4 = divGallery.m;
        List<zkn> list5 = divGallery.n;
        jln jlnVar = divGallery.o;
        List<t4> list6 = divGallery.p;
        v9 v9Var2 = divGallery.q;
        if ((i & 131072) != 0) {
            v9Var = v9Var2;
            str = divGallery.r;
        } else {
            v9Var = v9Var2;
        }
        o2 o2Var = divGallery.s;
        Expression<Long> expression9 = divGallery.t;
        vmn vmnVar = divGallery.v;
        y3 y3Var = divGallery.w;
        Expression<Orientation> expression10 = divGallery.x;
        y3 y3Var2 = divGallery.y;
        Expression<Boolean> expression11 = divGallery.z;
        Expression<String> expression12 = divGallery.A;
        Expression<Long> expression13 = divGallery.B;
        Expression<ScrollMode> expression14 = divGallery.C;
        Expression<Scrollbar> expression15 = divGallery.D;
        List<DivAction> list7 = divGallery.E;
        List<DivTooltip> list8 = divGallery.F;
        hd hdVar = divGallery.G;
        d2 d2Var = divGallery.H;
        e1 e1Var = divGallery.I;
        e1 e1Var2 = divGallery.J;
        List<DivTransitionTrigger> list9 = divGallery.K;
        List<DivTrigger> list10 = divGallery.L;
        List<md> list11 = divGallery.M;
        Expression<DivVisibility> expression16 = divGallery.N;
        zd zdVar = divGallery.O;
        List<zd> list12 = divGallery.P;
        v9 v9Var3 = divGallery.Q;
        divGallery.getClass();
        return new DivGallery(divAccessibility, expression, expression2, expression3, list2, list3, u1Var, expression4, expression5, expression6, expression7, expression8, list4, list5, jlnVar, list6, v9Var, str, o2Var, expression9, list, vmnVar, y3Var, expression10, y3Var2, expression11, expression12, expression13, expression14, expression15, list7, list8, hdVar, d2Var, e1Var, e1Var2, list9, list10, list11, expression16, zdVar, list12, v9Var3);
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:383:0x066a, code lost:
    
        if (r17 == null) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x05fc, code lost:
    
        if (r19 == null) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x05af, code lost:
    
        if (r20 == null) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0562, code lost:
    
        if (r21 == null) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x04c2, code lost:
    
        if (r26 == null) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0475, code lost:
    
        if (r27 == null) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x036a, code lost:
    
        if (r7 == null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x02e1, code lost:
    
        if (r9 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0288, code lost:
    
        if (r11 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0241, code lost:
    
        if (r12 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x015e, code lost:
    
        if (r14 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0116, code lost:
    
        if (r15 == null) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(DivGallery divGallery, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (divGallery == null) {
            return false;
        }
        List<zd> list = divGallery.P;
        zd zdVar = divGallery.O;
        List<md> list2 = divGallery.M;
        List<DivTrigger> list3 = divGallery.L;
        List<DivTransitionTrigger> list4 = divGallery.K;
        e1 e1Var = divGallery.J;
        e1 e1Var2 = divGallery.I;
        d2 d2Var = divGallery.H;
        hd hdVar = divGallery.G;
        List<DivTooltip> list5 = divGallery.F;
        List<DivAction> list6 = divGallery.E;
        y3 y3Var = divGallery.y;
        List<zd> list7 = list;
        y3 y3Var2 = divGallery.w;
        vmn vmnVar = divGallery.v;
        List<md> list8 = list2;
        List<a> list9 = divGallery.u;
        List<DivTrigger> list10 = list3;
        o2 o2Var = divGallery.s;
        List<DivTransitionTrigger> list11 = list4;
        List<t4> list12 = divGallery.p;
        jln jlnVar = divGallery.o;
        List<zkn> list13 = divGallery.n;
        List<v3> list14 = divGallery.m;
        u1 u1Var = divGallery.g;
        List<DivTooltip> list15 = list5;
        List<m1> list16 = divGallery.f;
        List<DivAction> list17 = list6;
        List<w0> list18 = divGallery.e;
        DivAccessibility divAccessibility = divGallery.a;
        DivAccessibility divAccessibility2 = this.a;
        if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expression = this.b;
        DivAlignmentHorizontal evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expression2 = divGallery.b;
        if (evaluate != (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.c;
        DivAlignmentVertical evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expression4 = divGallery.c;
        if (evaluate2 != (expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(this.d.evaluate(expressionResolver).doubleValue() == divGallery.d.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<w0> list19 = this.e;
        if (list19 != null) {
            if (list18 != null) {
                if (list19.size() == list18.size()) {
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
                        if (((w0) next).a(list18.get(i), expressionResolver, expressionResolver2)) {
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
            if (list16 != null) {
                if (list20.size() == list16.size()) {
                    int i3 = 0;
                    for (Object obj : list20) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((m1) obj).a(list16.get(i3), expressionResolver, expressionResolver2)) {
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
        Expression<Long> expression6 = divGallery.h;
        if (!epx.f(evaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression7 = this.i;
        Long evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<Long> expression8 = divGallery.i;
        if (!epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null) || this.j.evaluate(expressionResolver) != divGallery.j.evaluate(expressionResolver2)) {
            return false;
        }
        Expression<Long> expression9 = this.k;
        Long evaluate5 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
        Expression<Long> expression10 = divGallery.k;
        if (!epx.f(evaluate5, expression10 != null ? expression10.evaluate(expressionResolver2) : null) || this.l.evaluate(expressionResolver).longValue() != divGallery.l.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<v3> list21 = this.m;
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
        List<zkn> list22 = this.n;
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
        jln jlnVar2 = this.o;
        if (!(jlnVar2 != null ? jlnVar2.a(jlnVar, expressionResolver, expressionResolver2) : jlnVar == null)) {
            return false;
        }
        List<t4> list23 = this.p;
        if (list23 != null) {
            if (list12 != null) {
                if (list23.size() == list12.size()) {
                    int i9 = 0;
                    for (Object obj4 : list23) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((t4) obj4).a(list12.get(i9))) {
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
        if (!z5 || !this.q.a(divGallery.q, expressionResolver, expressionResolver2) || !epx.f(this.r, divGallery.r)) {
            return false;
        }
        o2 o2Var2 = this.s;
        if (!(o2Var2 != null ? o2Var2.a(o2Var, expressionResolver, expressionResolver2) : o2Var == null) || this.t.evaluate(expressionResolver).longValue() != divGallery.t.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        List<a> list24 = this.u;
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
        vmn vmnVar2 = this.v;
        if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
            return false;
        }
        y3 y3Var3 = this.w;
        if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null) || this.x.evaluate(expressionResolver) != divGallery.x.evaluate(expressionResolver2)) {
            return false;
        }
        y3 y3Var4 = this.y;
        if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null) || this.z.evaluate(expressionResolver).booleanValue() != divGallery.z.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        Expression<String> expression11 = this.A;
        String evaluate6 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
        Expression<String> expression12 = divGallery.A;
        if (!epx.f(evaluate6, expression12 != null ? expression12.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<Long> expression13 = this.B;
        Long evaluate7 = expression13 != null ? expression13.evaluate(expressionResolver) : null;
        Expression<Long> expression14 = divGallery.B;
        if (!epx.f(evaluate7, expression14 != null ? expression14.evaluate(expressionResolver2) : null) || this.C.evaluate(expressionResolver) != divGallery.C.evaluate(expressionResolver2) || this.D.evaluate(expressionResolver) != divGallery.D.evaluate(expressionResolver2)) {
            return false;
        }
        List<DivAction> list25 = this.E;
        if (list25 != null) {
            if (list17 != null) {
                if (list25.size() == list17.size()) {
                    int i13 = 0;
                    for (Object obj6 : list25) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivAction> list26 = list17;
                        if (((DivAction) obj6).a(list26.get(i13), expressionResolver, expressionResolver2)) {
                            i13 = i14;
                            list17 = list26;
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
        List<DivTooltip> list27 = this.F;
        if (list27 != null) {
            if (list15 != null) {
                if (list27.size() == list15.size()) {
                    int i15 = 0;
                    for (Object obj7 : list27) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTooltip> list28 = list15;
                        if (((DivTooltip) obj7).a(list28.get(i15), expressionResolver, expressionResolver2)) {
                            i15 = i16;
                            list15 = list28;
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
        List<DivTransitionTrigger> list29 = this.K;
        if (list29 != null) {
            if (list11 != null) {
                if (list29.size() == list11.size()) {
                    int i17 = 0;
                    for (Object obj8 : list29) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            e43.t();
                            throw null;
                        }
                        List<DivTransitionTrigger> list30 = list11;
                        if (((DivTransitionTrigger) obj8) == list30.get(i17)) {
                            i17 = i18;
                            list11 = list30;
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
        List<DivTrigger> list31 = this.L;
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
        List<md> list33 = this.M;
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
        if (!z11 || this.N.evaluate(expressionResolver) != divGallery.N.evaluate(expressionResolver2)) {
            return false;
        }
        zd zdVar2 = this.O;
        if (!(zdVar2 != null ? zdVar2.g(zdVar, expressionResolver, expressionResolver2) : zdVar == null)) {
            return false;
        }
        List<zd> list35 = this.P;
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
        return z12 && this.Q.a(divGallery.Q, expressionResolver, expressionResolver2);
    }

    @Override // xsna.ikn
    public final Expression<Double> a() {
        return this.d;
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
        return this.g;
    }

    @Override // xsna.ikn
    public final Expression<Long> e() {
        return this.i;
    }

    @Override // xsna.ikn
    public final List<md> f() {
        return this.M;
    }

    @Override // xsna.ikn
    public final y3 g() {
        return this.w;
    }

    @Override // xsna.ikn
    public final List<m1> getBackground() {
        return this.f;
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
        return this.N;
    }

    @Override // xsna.ikn
    public final v9 getWidth() {
        return this.Q;
    }

    @Override // xsna.ikn
    public final Expression<Long> h() {
        return this.B;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.S;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        int i = 0;
        List<a> list = this.u;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                i += ((a) it.next()).hash();
            }
        }
        int i2 = propertiesHash + i;
        this.S = Integer.valueOf(i2);
        return i2;
    }

    @Override // xsna.ikn
    public final Expression<String> i() {
        return this.A;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentHorizontal> j() {
        return this.b;
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
        return this.n;
    }

    @Override // xsna.ikn
    public final List<DivAction> n() {
        return this.E;
    }

    @Override // xsna.ikn
    public final vmn o() {
        return this.v;
    }

    @Override // xsna.ikn
    public final List<DivTrigger> p() {
        return this.L;
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
        Integer num = this.R;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(DivGallery.class).hashCode();
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
        Expression<Long> expression4 = this.i;
        int hashCode5 = this.j.hashCode() + hashCode4 + (expression4 != null ? expression4.hashCode() : 0);
        Expression<Long> expression5 = this.k;
        int hashCode6 = this.l.hashCode() + hashCode5 + (expression5 != null ? expression5.hashCode() : 0);
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
        int i13 = hashCode6 + i3;
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
        int hashCode7 = hash4 + (str != null ? str.hashCode() : 0);
        o2 o2Var = this.s;
        int hashCode8 = this.t.hashCode() + hashCode7 + (o2Var != null ? o2Var.hash() : 0);
        vmn vmnVar = this.v;
        int hash5 = hashCode8 + (vmnVar != null ? vmnVar.hash() : 0);
        y3 y3Var = this.w;
        int hashCode9 = this.x.hashCode() + hash5 + (y3Var != null ? y3Var.hash() : 0);
        y3 y3Var2 = this.y;
        int hashCode10 = this.z.hashCode() + hashCode9 + (y3Var2 != null ? y3Var2.hash() : 0);
        Expression<String> expression6 = this.A;
        int hashCode11 = hashCode10 + (expression6 != null ? expression6.hashCode() : 0);
        Expression<Long> expression7 = this.B;
        int hashCode12 = this.D.hashCode() + this.C.hashCode() + hashCode11 + (expression7 != null ? expression7.hashCode() : 0);
        List<DivAction> list6 = this.E;
        if (list6 != null) {
            Iterator<T> it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((DivAction) it6.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i15 = hashCode12 + i6;
        List<DivTooltip> list7 = this.F;
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
        hd hdVar = this.G;
        int hash6 = i16 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.H;
        int hash7 = hash6 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.I;
        int hash8 = hash7 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.J;
        int hash9 = hash8 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list8 = this.K;
        int hashCode13 = hash9 + (list8 != null ? list8.hashCode() : 0);
        List<DivTrigger> list9 = this.L;
        if (list9 != null) {
            Iterator<T> it8 = list9.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((DivTrigger) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int i17 = hashCode13 + i8;
        List<md> list10 = this.M;
        if (list10 != null) {
            Iterator<T> it9 = list10.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((md) it9.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int hashCode14 = this.N.hashCode() + i17 + i9;
        zd zdVar = this.O;
        int hash10 = hashCode14 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list11 = this.P;
        if (list11 != null) {
            Iterator<T> it10 = list11.iterator();
            while (it10.hasNext()) {
                i10 += ((zd) it10.next()).hash();
            }
        }
        int hash11 = this.Q.hash() + hash10 + i10;
        this.R = Integer.valueOf(hash11);
        return hash11;
    }

    @Override // xsna.ikn
    public final e1 q() {
        return this.I;
    }

    @Override // xsna.ikn
    public final List<w0> r() {
        return this.e;
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
        return this.m;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentVertical> v() {
        return this.c;
    }

    @Override // xsna.ikn
    public final jln w() {
        return this.o;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((w4.h) BuiltInParserKt.getBuiltInParserComponent().L3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // xsna.ikn
    public final DivAccessibility x() {
        return this.a;
    }

    @Override // xsna.ikn
    public final y3 y() {
        return this.y;
    }

    @Override // xsna.ikn
    public final zd z() {
        return this.O;
    }

    public DivGallery() {
        this(null, null, null, T, null, null, null, null, null, U, null, V, null, null, null, null, W, null, null, X, null, null, null, Y, null, Z, null, null, a0, b0, null, null, null, null, null, null, null, null, null, c0, null, null, d0);
    }
}
