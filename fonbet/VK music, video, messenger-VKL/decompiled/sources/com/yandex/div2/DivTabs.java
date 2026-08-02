package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.jb;
import com.yandex.div2.kb;
import com.yandex.div2.lb;
import com.yandex.div2.v9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.ikn;
import xsna.izs;
import xsna.jln;
import xsna.krn;
import xsna.vmn;
import xsna.zkn;

/* compiled from: DivTabs.kt */
/* loaded from: classes8.dex */
public final class DivTabs implements JSONSerializable, Hashable, ikn {
    public final y3 A;
    public final Expression<Boolean> B;
    public final b C;
    public final TabTitleStyle D;
    public final y3 E;
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
    public final List<v3> i;
    public final Expression<Boolean> j;
    public final List<zkn> k;
    public final jln l;
    public final List<t4> m;
    public final Expression<Boolean> n;
    public final v9 o;
    public final String p;
    public final List<a> q;
    public final vmn r;
    public final y3 s;
    public final y3 t;
    public final Expression<Boolean> u;
    public final Expression<String> v;
    public final Expression<Long> w;
    public final List<DivAction> x;
    public final Expression<Long> y;
    public final Expression<Integer> z;

    /* compiled from: DivTabs.kt */
    public static final class TabTitleStyle implements JSONSerializable, Hashable {
        public static final Expression<DivSizeUnit> A;
        public static final Expression<DivFontWeight> B;
        public static final Expression<Integer> C;
        public static final Expression<Long> D;
        public static final Expression<Double> E;
        public static final y3 F;
        public static final Expression<Integer> v;
        public static final Expression<Integer> w;
        public static final Expression<Long> x;
        public static final Expression<AnimationType> y;
        public static final Expression<Long> z;
        public final Expression<Integer> a;
        public final Expression<JSONObject> b;
        public final Expression<DivFontWeight> c;
        public final Expression<Integer> d;
        public final Expression<Long> e;
        public final Expression<AnimationType> f;
        public final Expression<Long> g;
        public final y2 h;
        public final Expression<String> i;
        public final Expression<Long> j;
        public final Expression<DivSizeUnit> k;
        public final Expression<DivFontWeight> l;
        public final Expression<Integer> m;
        public final Expression<JSONObject> n;
        public final Expression<DivFontWeight> o;
        public final Expression<Integer> p;
        public final Expression<Long> q;
        public final Expression<Double> r;
        public final Expression<Long> s;
        public final y3 t;
        public Integer u;

        /* compiled from: DivTabs.kt */
        public enum AnimationType {
            SLIDE("slide"),
            FADE("fade"),
            NONE("none");

            private final String value;
            public static final c Converter = new c();
            public static final izs<AnimationType, String> TO_STRING = b.i;
            public static final izs<String, AnimationType> FROM_STRING = a.i;

            /* compiled from: DivTabs.kt */
            public static final class a extends Lambda implements izs<String, AnimationType> {
                public static final a i = new a(1);

                @Override // xsna.izs
                public final AnimationType invoke(String str) {
                    String str2 = str;
                    AnimationType.Converter.getClass();
                    AnimationType animationType = AnimationType.SLIDE;
                    if (epx.f(str2, animationType.value)) {
                        return animationType;
                    }
                    AnimationType animationType2 = AnimationType.FADE;
                    if (epx.f(str2, animationType2.value)) {
                        return animationType2;
                    }
                    AnimationType animationType3 = AnimationType.NONE;
                    if (epx.f(str2, animationType3.value)) {
                        return animationType3;
                    }
                    return null;
                }
            }

            /* compiled from: DivTabs.kt */
            public static final class b extends Lambda implements izs<AnimationType, String> {
                public static final b i = new b(1);

                @Override // xsna.izs
                public final String invoke(AnimationType animationType) {
                    AnimationType.Converter.getClass();
                    return animationType.value;
                }
            }

            /* compiled from: DivTabs.kt */
            public static final class c {
            }

            AnimationType(String str) {
                this.value = str;
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            v = Expression.Companion.constant$default(companion, -9120, null, 2, null);
            w = Expression.Companion.constant$default(companion, -872415232, null, 2, null);
            x = Expression.Companion.constant$default(companion, 300L, null, 2, null);
            y = Expression.Companion.constant$default(companion, AnimationType.SLIDE, null, 2, null);
            z = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            A = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            B = Expression.Companion.constant$default(companion, DivFontWeight.REGULAR, null, 2, null);
            C = Expression.Companion.constant$default(companion, Integer.MIN_VALUE, null, 2, null);
            D = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            E = Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
            F = new y3(Expression.Companion.constant$default(companion, 6L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 6L, null, 2, null), 82);
        }

        public TabTitleStyle() {
            this(0);
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.u;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = this.a.hashCode() + fpf0.a(TabTitleStyle.class).hashCode();
            Expression<JSONObject> expression = this.b;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
            Expression<DivFontWeight> expression2 = this.c;
            int hashCode3 = this.f.hashCode() + this.e.hashCode() + this.d.hashCode() + hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
            Expression<Long> expression3 = this.g;
            int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            y2 y2Var = this.h;
            int hash = hashCode4 + (y2Var != null ? y2Var.hash() : 0);
            Expression<String> expression4 = this.i;
            int hashCode5 = this.l.hashCode() + this.k.hashCode() + this.j.hashCode() + hash + (expression4 != null ? expression4.hashCode() : 0);
            Expression<Integer> expression5 = this.m;
            int hashCode6 = hashCode5 + (expression5 != null ? expression5.hashCode() : 0);
            Expression<JSONObject> expression6 = this.n;
            int hashCode7 = hashCode6 + (expression6 != null ? expression6.hashCode() : 0);
            Expression<DivFontWeight> expression7 = this.o;
            int hashCode8 = this.r.hashCode() + this.q.hashCode() + this.p.hashCode() + hashCode7 + (expression7 != null ? expression7.hashCode() : 0);
            Expression<Long> expression8 = this.s;
            int hash2 = this.t.hash() + hashCode8 + (expression8 != null ? expression8.hashCode() : 0);
            this.u = Integer.valueOf(hash2);
            return hash2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((lb.f) BuiltInParserKt.getBuiltInParserComponent().R7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public TabTitleStyle(Expression<Integer> expression, Expression<JSONObject> expression2, Expression<DivFontWeight> expression3, Expression<Integer> expression4, Expression<Long> expression5, Expression<AnimationType> expression6, Expression<Long> expression7, y2 y2Var, Expression<String> expression8, Expression<Long> expression9, Expression<DivSizeUnit> expression10, Expression<DivFontWeight> expression11, Expression<Integer> expression12, Expression<JSONObject> expression13, Expression<DivFontWeight> expression14, Expression<Integer> expression15, Expression<Long> expression16, Expression<Double> expression17, Expression<Long> expression18, y3 y3Var) {
            this.a = expression;
            this.b = expression2;
            this.c = expression3;
            this.d = expression4;
            this.e = expression5;
            this.f = expression6;
            this.g = expression7;
            this.h = y2Var;
            this.i = expression8;
            this.j = expression9;
            this.k = expression10;
            this.l = expression11;
            this.m = expression12;
            this.n = expression13;
            this.o = expression14;
            this.p = expression15;
            this.q = expression16;
            this.r = expression17;
            this.s = expression18;
            this.t = y3Var;
        }

        public /* synthetic */ TabTitleStyle(int i) {
            this(v, null, null, w, x, y, null, null, null, z, A, B, null, null, null, C, D, E, null, F);
        }
    }

    /* compiled from: DivTabs.kt */
    public static final class a implements JSONSerializable, Hashable {
        public final com.yandex.div2.a a;
        public final Expression<String> b;
        public final DivAction c;
        public Integer d;

        public a(com.yandex.div2.a aVar, Expression<String> expression, DivAction divAction) {
            this.a = aVar;
            this.b = expression;
            this.c = divAction;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.d;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = this.b.hashCode() + this.a.hash() + fpf0.a(a.class).hashCode();
            DivAction divAction = this.c;
            int hash = hashCode + (divAction != null ? divAction.hash() : 0);
            this.d = Integer.valueOf(hash);
            return hash;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((gb) BuiltInParserKt.getBuiltInParserComponent().X7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* compiled from: DivTabs.kt */
    public static final class b implements JSONSerializable, Hashable {
        public final q4 a;
        public final Expression<Uri> b;
        public final q4 c;
        public Integer d;

        static {
            Expression.Companion companion = Expression.Companion;
            Expression.Companion.constant$default(companion, 12L, null, 2, null);
            Expression.Companion.constant$default(companion, 12L, null, 2, null);
        }

        public b(q4 q4Var, Expression<Uri> expression, q4 q4Var2) {
            this.a = q4Var;
            this.b = expression;
            this.c = q4Var2;
        }

        @Override // com.yandex.div.data.Hashable
        public final int hash() {
            Integer num = this.d;
            if (num != null) {
                return num.intValue();
            }
            int hash = this.c.hash() + this.b.hashCode() + this.a.hash() + fpf0.a(b.class).hashCode();
            this.d = Integer.valueOf(hash);
            return hash;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((kb.a) BuiltInParserKt.getBuiltInParserComponent().U7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, 12L, null, 2, null);
        Expression.Companion.constant$default(companion, 12L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 8L, null, 2, null);
        Expression.Companion.constant$default(companion, 12L, null, 2, null);
        Expression.Companion.constant$default(companion, 12L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivTabs(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list, List<? extends m1> list2, u1 u1Var, Expression<Long> expression4, List<v3> list3, Expression<Boolean> expression5, List<zkn> list4, jln jlnVar, List<t4> list5, Expression<Boolean> expression6, v9 v9Var, String str, List<a> list6, vmn vmnVar, y3 y3Var, y3 y3Var2, Expression<Boolean> expression7, Expression<String> expression8, Expression<Long> expression9, List<DivAction> list7, Expression<Long> expression10, Expression<Integer> expression11, y3 y3Var3, Expression<Boolean> expression12, b bVar, TabTitleStyle tabTitleStyle, y3 y3Var4, List<DivTooltip> list8, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list9, List<DivTrigger> list10, List<? extends md> list11, Expression<DivVisibility> expression13, zd zdVar, List<zd> list12, v9 v9Var2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = list2;
        this.g = u1Var;
        this.h = expression4;
        this.i = list3;
        this.j = expression5;
        this.k = list4;
        this.l = jlnVar;
        this.m = list5;
        this.n = expression6;
        this.o = v9Var;
        this.p = str;
        this.q = list6;
        this.r = vmnVar;
        this.s = y3Var;
        this.t = y3Var2;
        this.u = expression7;
        this.v = expression8;
        this.w = expression9;
        this.x = list7;
        this.y = expression10;
        this.z = expression11;
        this.A = y3Var3;
        this.B = expression12;
        this.C = bVar;
        this.D = tabTitleStyle;
        this.E = y3Var4;
        this.F = list8;
        this.G = hdVar;
        this.H = d2Var;
        this.I = e1Var;
        this.J = e1Var2;
        this.K = list9;
        this.L = list10;
        this.M = list11;
        this.N = expression13;
        this.O = zdVar;
        this.P = list12;
        this.Q = v9Var2;
    }

    public static DivTabs B(DivTabs divTabs, String str, ArrayList arrayList, int i) {
        DivAccessibility divAccessibility;
        DivAccessibility divAccessibility2 = divTabs.a;
        Expression<DivAlignmentHorizontal> expression = divTabs.b;
        Expression<DivAlignmentVertical> expression2 = divTabs.c;
        Expression<Double> expression3 = divTabs.d;
        List<w0> list = divTabs.e;
        List<m1> list2 = divTabs.f;
        u1 u1Var = divTabs.g;
        Expression<Long> expression4 = divTabs.h;
        List<v3> list3 = divTabs.i;
        Expression<Boolean> expression5 = divTabs.j;
        List<zkn> list4 = divTabs.k;
        jln jlnVar = divTabs.l;
        List<t4> list5 = divTabs.m;
        Expression<Boolean> expression6 = divTabs.n;
        v9 v9Var = divTabs.o;
        if ((i & 32768) != 0) {
            divAccessibility = divAccessibility2;
            str = divTabs.p;
        } else {
            divAccessibility = divAccessibility2;
        }
        vmn vmnVar = divTabs.r;
        y3 y3Var = divTabs.s;
        y3 y3Var2 = divTabs.t;
        Expression<Boolean> expression7 = divTabs.u;
        Expression<String> expression8 = divTabs.v;
        Expression<Long> expression9 = divTabs.w;
        List<DivAction> list6 = divTabs.x;
        Expression<Long> expression10 = divTabs.y;
        Expression<Integer> expression11 = divTabs.z;
        y3 y3Var3 = divTabs.A;
        Expression<Boolean> expression12 = divTabs.B;
        b bVar = divTabs.C;
        TabTitleStyle tabTitleStyle = divTabs.D;
        y3 y3Var4 = divTabs.E;
        List<DivTooltip> list7 = divTabs.F;
        hd hdVar = divTabs.G;
        d2 d2Var = divTabs.H;
        e1 e1Var = divTabs.I;
        e1 e1Var2 = divTabs.J;
        List<DivTransitionTrigger> list8 = divTabs.K;
        List<DivTrigger> list9 = divTabs.L;
        List<md> list10 = divTabs.M;
        Expression<DivVisibility> expression13 = divTabs.N;
        zd zdVar = divTabs.O;
        List<zd> list11 = divTabs.P;
        v9 v9Var2 = divTabs.Q;
        divTabs.getClass();
        return new DivTabs(divAccessibility, expression, expression2, expression3, list, list2, u1Var, expression4, list3, expression5, list4, jlnVar, list5, expression6, v9Var, str, arrayList, vmnVar, y3Var, y3Var2, expression7, expression8, expression9, list6, expression10, expression11, y3Var3, expression12, bVar, tabTitleStyle, y3Var4, list7, hdVar, d2Var, e1Var, e1Var2, list8, list9, list10, expression13, zdVar, list11, v9Var2);
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:317:0x06be, code lost:
    
        if (r4.t.a(r15.t, r37, r38) != false) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x06c5, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x08c2, code lost:
    
        if (r17 == null) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0854, code lost:
    
        if (r19 == null) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0807, code lost:
    
        if (r20 == null) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x07ba, code lost:
    
        if (r21 == null) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x071a, code lost:
    
        if (r26 == null) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x06c3, code lost:
    
        if (r15 == null) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0413, code lost:
    
        if (r30 == null) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0291, code lost:
    
        if (r9 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0238, code lost:
    
        if (r11 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x01d7, code lost:
    
        if (r12 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x015e, code lost:
    
        if (r14 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0116, code lost:
    
        if (r15 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:554:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0335 A[LOOP:11: B:556:0x02e2->B:564:0x0335, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:565:0x02d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(DivTabs divTabs, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (divTabs == null) {
            return false;
        }
        List<zd> list = divTabs.P;
        zd zdVar = divTabs.O;
        List<md> list2 = divTabs.M;
        List<DivTrigger> list3 = divTabs.L;
        List<DivTransitionTrigger> list4 = divTabs.K;
        e1 e1Var = divTabs.J;
        e1 e1Var2 = divTabs.I;
        d2 d2Var = divTabs.H;
        hd hdVar = divTabs.G;
        List<DivTooltip> list5 = divTabs.F;
        TabTitleStyle tabTitleStyle = divTabs.D;
        b bVar = divTabs.C;
        List<zd> list6 = list;
        List<DivAction> list7 = divTabs.x;
        y3 y3Var = divTabs.t;
        List<md> list8 = list2;
        y3 y3Var2 = divTabs.s;
        List<DivTrigger> list9 = list3;
        vmn vmnVar = divTabs.r;
        List<DivTransitionTrigger> list10 = list4;
        List<t4> list11 = divTabs.m;
        jln jlnVar = divTabs.l;
        List<zkn> list12 = divTabs.k;
        List<v3> list13 = divTabs.i;
        u1 u1Var = divTabs.g;
        List<DivTooltip> list14 = list5;
        List<m1> list15 = divTabs.f;
        List<w0> list16 = divTabs.e;
        DivAccessibility divAccessibility = divTabs.a;
        List<DivAction> list17 = list7;
        DivAccessibility divAccessibility2 = this.a;
        if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expression = this.b;
        DivAlignmentHorizontal evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expression2 = divTabs.b;
        if (evaluate != (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.c;
        DivAlignmentVertical evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expression4 = divTabs.c;
        if (evaluate2 != (expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(this.d.evaluate(expressionResolver).doubleValue() == divTabs.d.evaluate(expressionResolver2).doubleValue())) {
            return false;
        }
        List<w0> list18 = this.e;
        if (list18 != null) {
            if (list16 != null) {
                if (list18.size() == list16.size()) {
                    Iterator it = list18.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        Iterator it2 = it;
                        if (((w0) next).a(list16.get(i), expressionResolver, expressionResolver2)) {
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
        List<m1> list19 = this.f;
        if (list19 != null) {
            if (list15 != null) {
                if (list19.size() == list15.size()) {
                    int i3 = 0;
                    for (Object obj : list19) {
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
        Expression<Long> expression6 = divTabs.h;
        if (!epx.f(evaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<v3> list20 = this.i;
        if (list20 != null) {
            if (list13 != null) {
                if (list20.size() == list13.size()) {
                    int i5 = 0;
                    for (Object obj2 : list20) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((v3) obj2).g(list13.get(i5), expressionResolver, expressionResolver2)) {
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
        if (!z3 || this.j.evaluate(expressionResolver).booleanValue() != divTabs.j.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        List<zkn> list21 = this.k;
        if (list21 != null) {
            if (list12 != null) {
                if (list21.size() == list12.size()) {
                    int i7 = 0;
                    for (Object obj3 : list21) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((zkn) obj3).a(list12.get(i7))) {
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
        jln jlnVar2 = this.l;
        if (!(jlnVar2 != null ? jlnVar2.a(jlnVar, expressionResolver, expressionResolver2) : jlnVar == null)) {
            return false;
        }
        List<t4> list22 = this.m;
        if (list22 != null) {
            if (list11 != null) {
                if (list22.size() == list11.size()) {
                    int i9 = 0;
                    for (Object obj4 : list22) {
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
        if (!z5 || this.n.evaluate(expressionResolver).booleanValue() != divTabs.n.evaluate(expressionResolver2).booleanValue() || !this.o.a(divTabs.o, expressionResolver, expressionResolver2) || !epx.f(this.p, divTabs.p)) {
            return false;
        }
        List<a> list23 = divTabs.q;
        List<a> list24 = this.q;
        if (list24.size() == list23.size()) {
            int i11 = 0;
            for (Object obj5 : list24) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    e43.t();
                    throw null;
                }
                a aVar = list23.get(i11);
                a aVar2 = (a) obj5;
                aVar2.getClass();
                if (aVar != null) {
                    DivAction divAction = aVar.c;
                    if (aVar2.a.a(aVar.a, expressionResolver, expressionResolver2) && epx.f(aVar2.b.evaluate(expressionResolver), aVar.b.evaluate(expressionResolver2))) {
                        DivAction divAction2 = aVar2.c;
                        if (divAction2 != null ? divAction2.a(divAction, expressionResolver, expressionResolver2) : divAction == null) {
                            z7 = true;
                            if (!z7) {
                                i11 = i12;
                            }
                        }
                    }
                }
                z7 = false;
                if (!z7) {
                }
            }
            z6 = true;
            if (z6) {
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
            if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null) || this.u.evaluate(expressionResolver).booleanValue() != divTabs.u.evaluate(expressionResolver2).booleanValue()) {
                return false;
            }
            Expression<String> expression7 = this.v;
            String evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
            Expression<String> expression8 = divTabs.v;
            if (!epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<Long> expression9 = this.w;
            Long evaluate5 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
            Expression<Long> expression10 = divTabs.w;
            if (!epx.f(evaluate5, expression10 != null ? expression10.evaluate(expressionResolver2) : null)) {
                return false;
            }
            List<DivAction> list25 = this.x;
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
                        z8 = true;
                    }
                    z8 = false;
                    break;
                }
                return false;
            }
            if (!z8 || this.y.evaluate(expressionResolver).longValue() != divTabs.y.evaluate(expressionResolver2).longValue() || this.z.evaluate(expressionResolver).intValue() != divTabs.z.evaluate(expressionResolver2).intValue() || !this.A.a(divTabs.A, expressionResolver, expressionResolver2) || this.B.evaluate(expressionResolver).booleanValue() != divTabs.B.evaluate(expressionResolver2).booleanValue()) {
                return false;
            }
            b bVar2 = this.C;
            if (!(bVar2 == null ? bVar == null : bVar != null && bVar2.a.a(bVar.a, expressionResolver, expressionResolver2) && epx.f(bVar2.b.evaluate(expressionResolver), bVar.b.evaluate(expressionResolver2)) && bVar2.c.a(bVar.c, expressionResolver, expressionResolver2))) {
                return false;
            }
            TabTitleStyle tabTitleStyle2 = this.D;
            if (tabTitleStyle2 != null) {
                if (tabTitleStyle != null) {
                    y2 y2Var = tabTitleStyle.h;
                    if (tabTitleStyle2.a.evaluate(expressionResolver).intValue() == tabTitleStyle.a.evaluate(expressionResolver2).intValue()) {
                        Expression<JSONObject> expression11 = tabTitleStyle2.b;
                        JSONObject evaluate6 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
                        Expression<JSONObject> expression12 = tabTitleStyle.b;
                        if (epx.f(evaluate6, expression12 != null ? expression12.evaluate(expressionResolver2) : null)) {
                            Expression<DivFontWeight> expression13 = tabTitleStyle2.c;
                            DivFontWeight evaluate7 = expression13 != null ? expression13.evaluate(expressionResolver) : null;
                            Expression<DivFontWeight> expression14 = tabTitleStyle.c;
                            if (evaluate7 == (expression14 != null ? expression14.evaluate(expressionResolver2) : null) && tabTitleStyle2.d.evaluate(expressionResolver).intValue() == tabTitleStyle.d.evaluate(expressionResolver2).intValue() && tabTitleStyle2.e.evaluate(expressionResolver).longValue() == tabTitleStyle.e.evaluate(expressionResolver2).longValue() && tabTitleStyle2.f.evaluate(expressionResolver) == tabTitleStyle.f.evaluate(expressionResolver2)) {
                                Expression<Long> expression15 = tabTitleStyle2.g;
                                Long evaluate8 = expression15 != null ? expression15.evaluate(expressionResolver) : null;
                                Expression<Long> expression16 = tabTitleStyle.g;
                                if (epx.f(evaluate8, expression16 != null ? expression16.evaluate(expressionResolver2) : null)) {
                                    y2 y2Var2 = tabTitleStyle2.h;
                                    if (y2Var2 != null ? y2Var2.a(y2Var, expressionResolver, expressionResolver2) : y2Var == null) {
                                        Expression<String> expression17 = tabTitleStyle2.i;
                                        String evaluate9 = expression17 != null ? expression17.evaluate(expressionResolver) : null;
                                        Expression<String> expression18 = tabTitleStyle.i;
                                        if (epx.f(evaluate9, expression18 != null ? expression18.evaluate(expressionResolver2) : null) && tabTitleStyle2.j.evaluate(expressionResolver).longValue() == tabTitleStyle.j.evaluate(expressionResolver2).longValue() && tabTitleStyle2.k.evaluate(expressionResolver) == tabTitleStyle.k.evaluate(expressionResolver2) && tabTitleStyle2.l.evaluate(expressionResolver) == tabTitleStyle.l.evaluate(expressionResolver2)) {
                                            Expression<Integer> expression19 = tabTitleStyle2.m;
                                            Integer evaluate10 = expression19 != null ? expression19.evaluate(expressionResolver) : null;
                                            Expression<Integer> expression20 = tabTitleStyle.m;
                                            if (epx.f(evaluate10, expression20 != null ? expression20.evaluate(expressionResolver2) : null)) {
                                                Expression<JSONObject> expression21 = tabTitleStyle2.n;
                                                JSONObject evaluate11 = expression21 != null ? expression21.evaluate(expressionResolver) : null;
                                                Expression<JSONObject> expression22 = tabTitleStyle.n;
                                                if (epx.f(evaluate11, expression22 != null ? expression22.evaluate(expressionResolver2) : null)) {
                                                    Expression<DivFontWeight> expression23 = tabTitleStyle2.o;
                                                    DivFontWeight evaluate12 = expression23 != null ? expression23.evaluate(expressionResolver) : null;
                                                    Expression<DivFontWeight> expression24 = tabTitleStyle.o;
                                                    if (evaluate12 == (expression24 != null ? expression24.evaluate(expressionResolver2) : null) && tabTitleStyle2.p.evaluate(expressionResolver).intValue() == tabTitleStyle.p.evaluate(expressionResolver2).intValue() && tabTitleStyle2.q.evaluate(expressionResolver).longValue() == tabTitleStyle.q.evaluate(expressionResolver2).longValue()) {
                                                        if (tabTitleStyle2.r.evaluate(expressionResolver).doubleValue() == tabTitleStyle.r.evaluate(expressionResolver2).doubleValue()) {
                                                            Expression<Long> expression25 = tabTitleStyle2.s;
                                                            Long evaluate13 = expression25 != null ? expression25.evaluate(expressionResolver) : null;
                                                            Expression<Long> expression26 = tabTitleStyle.s;
                                                            if (epx.f(evaluate13, expression26 != null ? expression26.evaluate(expressionResolver2) : null)) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z9 = false;
            }
            if (!z9 || !this.E.a(divTabs.E, expressionResolver, expressionResolver2)) {
                return false;
            }
            List<DivTooltip> list27 = this.F;
            if (list27 != null) {
                if (list14 != null) {
                    if (list27.size() == list14.size()) {
                        int i15 = 0;
                        for (Object obj7 : list27) {
                            int i16 = i15 + 1;
                            if (i15 < 0) {
                                e43.t();
                                throw null;
                            }
                            List<DivTooltip> list28 = list14;
                            if (((DivTooltip) obj7).a(list28.get(i15), expressionResolver, expressionResolver2)) {
                                i15 = i16;
                                list14 = list28;
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
                if (list10 != null) {
                    if (list29.size() == list10.size()) {
                        int i17 = 0;
                        for (Object obj8 : list29) {
                            int i18 = i17 + 1;
                            if (i17 < 0) {
                                e43.t();
                                throw null;
                            }
                            List<DivTransitionTrigger> list30 = list10;
                            if (((DivTransitionTrigger) obj8) == list30.get(i17)) {
                                i17 = i18;
                                list10 = list30;
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
            List<DivTrigger> list31 = this.L;
            if (list31 != null) {
                if (list9 != null) {
                    if (list31.size() == list9.size()) {
                        int i19 = 0;
                        for (Object obj9 : list31) {
                            int i20 = i19 + 1;
                            if (i19 < 0) {
                                e43.t();
                                throw null;
                            }
                            List<DivTrigger> list32 = list9;
                            if (((DivTrigger) obj9).a(list32.get(i19), expressionResolver, expressionResolver2)) {
                                i19 = i20;
                                list9 = list32;
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
                        z13 = true;
                    }
                    z13 = false;
                    break;
                }
                return false;
            }
            if (!z13 || this.N.evaluate(expressionResolver) != divTabs.N.evaluate(expressionResolver2)) {
                return false;
            }
            zd zdVar2 = this.O;
            if (!(zdVar2 != null ? zdVar2.g(zdVar, expressionResolver, expressionResolver2) : zdVar == null)) {
                return false;
            }
            List<zd> list35 = this.P;
            if (list35 != null) {
                if (list6 != null) {
                    if (list35.size() == list6.size()) {
                        int i23 = 0;
                        for (Object obj11 : list35) {
                            int i24 = i23 + 1;
                            if (i23 < 0) {
                                e43.t();
                                throw null;
                            }
                            List<zd> list36 = list6;
                            if (((zd) obj11).g(list36.get(i23), expressionResolver, expressionResolver2)) {
                                i23 = i24;
                                list6 = list36;
                            }
                        }
                        z14 = true;
                    }
                    z14 = false;
                    break;
                }
                return false;
            }
            return z14 && this.Q.a(divTabs.Q, expressionResolver, expressionResolver2);
        }
        z6 = false;
        if (z6) {
        }
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
        return this.h;
    }

    @Override // xsna.ikn
    public final List<md> f() {
        return this.M;
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
        return this.N;
    }

    @Override // xsna.ikn
    public final v9 getWidth() {
        return this.Q;
    }

    @Override // xsna.ikn
    public final Expression<Long> h() {
        return this.w;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.S;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        Iterator<T> it = this.q.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((a) it.next()).hash();
        }
        int i2 = propertiesHash + i;
        this.S = Integer.valueOf(i2);
        return i2;
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
        return this.J;
    }

    @Override // xsna.ikn
    public final List<DivTransitionTrigger> l() {
        return this.K;
    }

    @Override // xsna.ikn
    public final List<zkn> m() {
        return this.k;
    }

    @Override // xsna.ikn
    public final List<DivAction> n() {
        return this.x;
    }

    @Override // xsna.ikn
    public final vmn o() {
        return this.r;
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
        int hashCode = fpf0.a(DivTabs.class).hashCode();
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
        int hashCode5 = this.j.hashCode() + hashCode4 + i3;
        List<zkn> list4 = this.k;
        if (list4 != null) {
            Iterator<T> it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((zkn) it4.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i13 = hashCode5 + i4;
        jln jlnVar = this.l;
        int hash3 = i13 + (jlnVar != null ? jlnVar.hash() : 0);
        List<t4> list5 = this.m;
        if (list5 != null) {
            Iterator<T> it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((t4) it5.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int hash4 = this.o.hash() + this.n.hashCode() + hash3 + i5;
        String str = this.p;
        int hashCode6 = hash4 + (str != null ? str.hashCode() : 0);
        vmn vmnVar = this.r;
        int hash5 = hashCode6 + (vmnVar != null ? vmnVar.hash() : 0);
        y3 y3Var = this.s;
        int hash6 = hash5 + (y3Var != null ? y3Var.hash() : 0);
        y3 y3Var2 = this.t;
        int hashCode7 = this.u.hashCode() + hash6 + (y3Var2 != null ? y3Var2.hash() : 0);
        Expression<String> expression4 = this.v;
        int hashCode8 = hashCode7 + (expression4 != null ? expression4.hashCode() : 0);
        Expression<Long> expression5 = this.w;
        int hashCode9 = hashCode8 + (expression5 != null ? expression5.hashCode() : 0);
        List<DivAction> list6 = this.x;
        if (list6 != null) {
            Iterator<T> it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((DivAction) it6.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int hashCode10 = this.B.hashCode() + this.A.hash() + this.z.hashCode() + this.y.hashCode() + hashCode9 + i6;
        b bVar = this.C;
        int hash7 = hashCode10 + (bVar != null ? bVar.hash() : 0);
        TabTitleStyle tabTitleStyle = this.D;
        int hash8 = this.E.hash() + hash7 + (tabTitleStyle != null ? tabTitleStyle.hash() : 0);
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
        int i14 = hash8 + i7;
        hd hdVar = this.G;
        int hash9 = i14 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.H;
        int hash10 = hash9 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.I;
        int hash11 = hash10 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.J;
        int hash12 = hash11 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list8 = this.K;
        int hashCode11 = hash12 + (list8 != null ? list8.hashCode() : 0);
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
        int i15 = hashCode11 + i8;
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
        int hashCode12 = this.N.hashCode() + i15 + i9;
        zd zdVar = this.O;
        int hash13 = hashCode12 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list11 = this.P;
        if (list11 != null) {
            Iterator<T> it10 = list11.iterator();
            while (it10.hasNext()) {
                i10 += ((zd) it10.next()).hash();
            }
        }
        int hash14 = this.Q.hash() + hash13 + i10;
        this.R = Integer.valueOf(hash14);
        return hash14;
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
        return this.i;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentVertical> v() {
        return this.c;
    }

    @Override // xsna.ikn
    public final jln w() {
        return this.l;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((jb.d) BuiltInParserKt.getBuiltInParserComponent().O7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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
        return this.O;
    }
}
