package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.c7;
import com.yandex.div2.n7;
import com.yandex.div2.v9;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.ann;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.ikn;
import xsna.izs;
import xsna.jln;
import xsna.knn;
import xsna.krn;
import xsna.pnn;
import xsna.unn;
import xsna.vmn;
import xsna.zkn;

/* compiled from: DivPager.kt */
/* loaded from: classes8.dex */
public final class DivPager implements JSONSerializable, Hashable, ikn {
    public final Expression<Boolean> A;
    public final Expression<String> B;
    public final Expression<Long> C;
    public final Expression<ItemAlignment> D;
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
    public final Expression<ItemAlignment> i;
    public final Expression<Long> j;
    public final List<v3> k;
    public final List<zkn> l;
    public final jln m;
    public final List<t4> n;
    public final v9 o;
    public final String p;
    public final Expression<Boolean> q;
    public final o2 r;
    public final q4 s;
    public final List<a> t;
    public final unn u;
    public final vmn v;
    public final y3 w;
    public final Expression<Orientation> x;
    public final y3 y;
    public final c7 z;

    /* compiled from: DivPager.kt */
    public enum ItemAlignment {
        START("start"),
        CENTER(TtmlNode.CENTER),
        END(TtmlNode.END);

        private final String value;
        public static final c Converter = new c();
        public static final izs<ItemAlignment, String> TO_STRING = b.i;
        public static final izs<String, ItemAlignment> FROM_STRING = a.i;

        /* compiled from: DivPager.kt */
        public static final class a extends Lambda implements izs<String, ItemAlignment> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final ItemAlignment invoke(String str) {
                String str2 = str;
                ItemAlignment.Converter.getClass();
                ItemAlignment itemAlignment = ItemAlignment.START;
                if (epx.f(str2, itemAlignment.value)) {
                    return itemAlignment;
                }
                ItemAlignment itemAlignment2 = ItemAlignment.CENTER;
                if (epx.f(str2, itemAlignment2.value)) {
                    return itemAlignment2;
                }
                ItemAlignment itemAlignment3 = ItemAlignment.END;
                if (epx.f(str2, itemAlignment3.value)) {
                    return itemAlignment3;
                }
                return null;
            }
        }

        /* compiled from: DivPager.kt */
        public static final class b extends Lambda implements izs<ItemAlignment, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(ItemAlignment itemAlignment) {
                ItemAlignment.Converter.getClass();
                return itemAlignment.value;
            }
        }

        /* compiled from: DivPager.kt */
        public static final class c {
        }

        ItemAlignment(String str) {
            this.value = str;
        }
    }

    /* compiled from: DivPager.kt */
    public enum Orientation {
        HORIZONTAL("horizontal"),
        VERTICAL("vertical");

        private final String value;
        public static final c Converter = new c();
        public static final izs<Orientation, String> TO_STRING = b.i;
        public static final izs<String, Orientation> FROM_STRING = a.i;

        /* compiled from: DivPager.kt */
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

        /* compiled from: DivPager.kt */
        public static final class b extends Lambda implements izs<Orientation, String> {
            public static final b i = new b(1);

            @Override // xsna.izs
            public final String invoke(Orientation orientation) {
                Orientation.Converter.getClass();
                return orientation.value;
            }
        }

        /* compiled from: DivPager.kt */
        public static final class c {
        }

        Orientation(String str) {
            this.value = str;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Expression.Companion.constant$default(companion, ItemAlignment.START, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        new v9.c(new krn(null, null, null));
        Boolean bool = Boolean.FALSE;
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, Orientation.HORIZONTAL, null, 2, null);
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, ItemAlignment.CENTER, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivPager(DivAccessibility divAccessibility, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list, List<? extends m1> list2, u1 u1Var, Expression<Long> expression4, Expression<ItemAlignment> expression5, Expression<Long> expression6, List<v3> list3, List<zkn> list4, jln jlnVar, List<t4> list5, v9 v9Var, String str, Expression<Boolean> expression7, o2 o2Var, q4 q4Var, List<? extends a> list6, unn unnVar, vmn vmnVar, y3 y3Var, Expression<Orientation> expression8, y3 y3Var2, c7 c7Var, Expression<Boolean> expression9, Expression<String> expression10, Expression<Long> expression11, Expression<ItemAlignment> expression12, List<DivAction> list7, List<DivTooltip> list8, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list9, List<DivTrigger> list10, List<? extends md> list11, Expression<DivVisibility> expression13, zd zdVar, List<zd> list12, v9 v9Var2) {
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
        this.k = list3;
        this.l = list4;
        this.m = jlnVar;
        this.n = list5;
        this.o = v9Var;
        this.p = str;
        this.q = expression7;
        this.r = o2Var;
        this.s = q4Var;
        this.t = list6;
        this.u = unnVar;
        this.v = vmnVar;
        this.w = y3Var;
        this.x = expression8;
        this.y = y3Var2;
        this.z = c7Var;
        this.A = expression9;
        this.B = expression10;
        this.C = expression11;
        this.D = expression12;
        this.E = list7;
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

    public static DivPager B(DivPager divPager, String str, List list, int i) {
        DivAccessibility divAccessibility;
        DivAccessibility divAccessibility2 = divPager.a;
        Expression<DivAlignmentHorizontal> expression = divPager.b;
        Expression<DivAlignmentVertical> expression2 = divPager.c;
        Expression<Double> expression3 = divPager.d;
        List<w0> list2 = divPager.e;
        List<m1> list3 = divPager.f;
        u1 u1Var = divPager.g;
        Expression<Long> expression4 = divPager.h;
        Expression<ItemAlignment> expression5 = divPager.i;
        Expression<Long> expression6 = divPager.j;
        List<v3> list4 = divPager.k;
        List<zkn> list5 = divPager.l;
        jln jlnVar = divPager.m;
        List<t4> list6 = divPager.n;
        v9 v9Var = divPager.o;
        if ((i & 32768) != 0) {
            divAccessibility = divAccessibility2;
            str = divPager.p;
        } else {
            divAccessibility = divAccessibility2;
        }
        Expression<Boolean> expression7 = divPager.q;
        o2 o2Var = divPager.r;
        q4 q4Var = divPager.s;
        unn unnVar = divPager.u;
        vmn vmnVar = divPager.v;
        y3 y3Var = divPager.w;
        Expression<Orientation> expression8 = divPager.x;
        y3 y3Var2 = divPager.y;
        c7 c7Var = divPager.z;
        Expression<Boolean> expression9 = divPager.A;
        Expression<String> expression10 = divPager.B;
        Expression<Long> expression11 = divPager.C;
        Expression<ItemAlignment> expression12 = divPager.D;
        List<DivAction> list7 = divPager.E;
        List<DivTooltip> list8 = divPager.F;
        hd hdVar = divPager.G;
        d2 d2Var = divPager.H;
        e1 e1Var = divPager.I;
        e1 e1Var2 = divPager.J;
        List<DivTransitionTrigger> list9 = divPager.K;
        List<DivTrigger> list10 = divPager.L;
        List<md> list11 = divPager.M;
        Expression<DivVisibility> expression13 = divPager.N;
        zd zdVar = divPager.O;
        List<zd> list12 = divPager.P;
        v9 v9Var2 = divPager.Q;
        divPager.getClass();
        return new DivPager(divAccessibility, expression, expression2, expression3, list2, list3, u1Var, expression4, expression5, expression6, list4, list5, jlnVar, list6, v9Var, str, expression7, o2Var, q4Var, list, unnVar, vmnVar, y3Var, expression8, y3Var2, c7Var, expression9, expression10, expression11, expression12, list7, list8, hdVar, d2Var, e1Var, e1Var2, list9, list10, list11, expression13, zdVar, list12, v9Var2);
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x04b9, code lost:
    
        if (r4.e.evaluate(r38).doubleValue() == r5.e.evaluate(r39).doubleValue()) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x057a, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0822, code lost:
    
        if (r18 == null) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x07b4, code lost:
    
        if (r20 == null) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0767, code lost:
    
        if (r21 == null) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x071a, code lost:
    
        if (r22 == null) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x067a, code lost:
    
        if (r27 == null) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x062d, code lost:
    
        if (r28 == null) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x056f, code lost:
    
        if (r4.f.evaluate(r38).booleanValue() == r5.f.evaluate(r39).booleanValue()) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0578, code lost:
    
        if (r4 == null) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x038b, code lost:
    
        if (r5.a.evaluate(r38).doubleValue() == r4.a.evaluate(r39).doubleValue()) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x038d, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x03cc, code lost:
    
        if (r4 != null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0336, code lost:
    
        if (r7 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x02a5, code lost:
    
        if (r9 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x024c, code lost:
    
        if (r11 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0205, code lost:
    
        if (r12 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0162, code lost:
    
        if (r14 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x011a, code lost:
    
        if (r15 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:487:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(DivPager divPager, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean a;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (divPager == null) {
            return false;
        }
        List<zd> list = divPager.P;
        zd zdVar = divPager.O;
        List<md> list2 = divPager.M;
        List<DivTrigger> list3 = divPager.L;
        List<DivTransitionTrigger> list4 = divPager.K;
        e1 e1Var = divPager.J;
        e1 e1Var2 = divPager.I;
        d2 d2Var = divPager.H;
        hd hdVar = divPager.G;
        List<DivTooltip> list5 = divPager.F;
        List<DivAction> list6 = divPager.E;
        c7 c7Var = divPager.z;
        y3 y3Var = divPager.y;
        List<zd> list7 = list;
        y3 y3Var2 = divPager.w;
        vmn vmnVar = divPager.v;
        List<md> list8 = list2;
        List<a> list9 = divPager.t;
        List<DivTrigger> list10 = list3;
        o2 o2Var = divPager.r;
        List<DivTransitionTrigger> list11 = list4;
        List<t4> list12 = divPager.n;
        jln jlnVar = divPager.m;
        List<zkn> list13 = divPager.l;
        List<v3> list14 = divPager.k;
        u1 u1Var = divPager.g;
        List<DivTooltip> list15 = list5;
        List<m1> list16 = divPager.f;
        List<DivAction> list17 = list6;
        List<w0> list18 = divPager.e;
        DivAccessibility divAccessibility = divPager.a;
        DivAccessibility divAccessibility2 = this.a;
        if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
            return false;
        }
        Expression<DivAlignmentHorizontal> expression = this.b;
        DivAlignmentHorizontal evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<DivAlignmentHorizontal> expression2 = divPager.b;
        if (evaluate != (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression<DivAlignmentVertical> expression3 = this.c;
        DivAlignmentVertical evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<DivAlignmentVertical> expression4 = divPager.c;
        if (evaluate2 != (expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        if (!(this.d.evaluate(expressionResolver).doubleValue() == divPager.d.evaluate(expressionResolver2).doubleValue())) {
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
        Expression<Long> expression6 = divPager.h;
        if (!epx.f(evaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null) || this.i.evaluate(expressionResolver) != divPager.i.evaluate(expressionResolver2) || this.j.evaluate(expressionResolver).longValue() != divPager.j.evaluate(expressionResolver2).longValue()) {
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
        if (!z5 || !this.o.a(divPager.o, expressionResolver, expressionResolver2) || !epx.f(this.p, divPager.p) || this.q.evaluate(expressionResolver).booleanValue() != divPager.q.evaluate(expressionResolver2).booleanValue()) {
            return false;
        }
        o2 o2Var2 = this.r;
        if (!(o2Var2 != null ? o2Var2.a(o2Var, expressionResolver, expressionResolver2) : o2Var == null) || !this.s.a(divPager.s, expressionResolver, expressionResolver2)) {
            return false;
        }
        List<a> list24 = this.t;
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
        unn unnVar = divPager.u;
        unn unnVar2 = this.u;
        unnVar2.getClass();
        if (unnVar != null) {
            if (unnVar2 instanceof unn.c) {
                pnn pnnVar = ((unn.c) unnVar2).b;
                Object a2 = unnVar.a();
                pnn pnnVar2 = a2 instanceof pnn ? (pnn) a2 : null;
                if (pnnVar2 == null) {
                    pnnVar.getClass();
                } else {
                    u7 u7Var = pnnVar.a;
                    u7 u7Var2 = pnnVar2.a;
                    if (u7Var2 == null) {
                        u7Var.getClass();
                    }
                }
            } else if (unnVar2 instanceof unn.a) {
                ann annVar = ((unn.a) unnVar2).b;
                Object a3 = unnVar.a();
                ann annVar2 = a3 instanceof ann ? (ann) a3 : null;
                if (annVar2 == null) {
                    annVar.getClass();
                } else {
                    a = annVar.a.a(annVar2.a, expressionResolver, expressionResolver2);
                }
            } else {
                if (!(unnVar2 instanceof unn.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                knn knnVar = ((unn.b) unnVar2).b;
                Object a4 = unnVar.a();
                knn knnVar2 = a4 instanceof knn ? (knn) a4 : null;
                knnVar.getClass();
            }
            if (a) {
                return false;
            }
            vmn vmnVar2 = this.v;
            if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
                return false;
            }
            y3 y3Var3 = this.w;
            if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null) || this.x.evaluate(expressionResolver) != divPager.x.evaluate(expressionResolver2)) {
                return false;
            }
            y3 y3Var4 = this.y;
            if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null)) {
                return false;
            }
            c7 c7Var2 = this.z;
            if (c7Var2 != null) {
                if (c7Var != null) {
                    if (c7Var2 instanceof c7.b) {
                        j7 j7Var = ((c7.b) c7Var2).b;
                        Object a5 = c7Var.a();
                        j7 j7Var2 = a5 instanceof j7 ? (j7) a5 : null;
                        if (j7Var2 == null) {
                            j7Var.getClass();
                        } else if (j7Var.a.evaluate(expressionResolver) == j7Var2.a.evaluate(expressionResolver2)) {
                            if (j7Var.b.evaluate(expressionResolver).doubleValue() == j7Var2.b.evaluate(expressionResolver2).doubleValue()) {
                                if (j7Var.c.evaluate(expressionResolver).doubleValue() == j7Var2.c.evaluate(expressionResolver2).doubleValue()) {
                                    if (j7Var.d.evaluate(expressionResolver).doubleValue() == j7Var2.d.evaluate(expressionResolver2).doubleValue()) {
                                    }
                                }
                            }
                        }
                    } else {
                        if (!(c7Var2 instanceof c7.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        g7 g7Var = ((c7.a) c7Var2).b;
                        Object a6 = c7Var.a();
                        g7 g7Var2 = a6 instanceof g7 ? (g7) a6 : null;
                        if (g7Var2 == null) {
                            g7Var.getClass();
                        } else if (g7Var.a.evaluate(expressionResolver) == g7Var2.a.evaluate(expressionResolver2)) {
                            if (g7Var.b.evaluate(expressionResolver).doubleValue() == g7Var2.b.evaluate(expressionResolver2).doubleValue()) {
                                if (g7Var.c.evaluate(expressionResolver).doubleValue() == g7Var2.c.evaluate(expressionResolver2).doubleValue()) {
                                    if (g7Var.d.evaluate(expressionResolver).doubleValue() == g7Var2.d.evaluate(expressionResolver2).doubleValue()) {
                                        if (g7Var.e.evaluate(expressionResolver).doubleValue() == g7Var2.e.evaluate(expressionResolver2).doubleValue()) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z7 = false;
            }
            if (!z7 || this.A.evaluate(expressionResolver).booleanValue() != divPager.A.evaluate(expressionResolver2).booleanValue()) {
                return false;
            }
            Expression<String> expression7 = this.B;
            String evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
            Expression<String> expression8 = divPager.B;
            if (!epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
                return false;
            }
            Expression<Long> expression9 = this.C;
            Long evaluate5 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
            Expression<Long> expression10 = divPager.C;
            if (!epx.f(evaluate5, expression10 != null ? expression10.evaluate(expressionResolver2) : null) || this.D.evaluate(expressionResolver) != divPager.D.evaluate(expressionResolver2)) {
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
                        z12 = true;
                    }
                    z12 = false;
                    break;
                }
                return false;
            }
            if (!z12 || this.N.evaluate(expressionResolver) != divPager.N.evaluate(expressionResolver2)) {
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
                        z13 = true;
                    }
                    z13 = false;
                    break;
                }
                return false;
            }
            return z13 && this.Q.a(divPager.Q, expressionResolver, expressionResolver2);
        }
        a = false;
        if (a) {
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
        return this.w;
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
        return this.C;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.S;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        int i = 0;
        List<a> list = this.t;
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
        return this.B;
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
        return this.l;
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
        int hashCode = fpf0.a(DivPager.class).hashCode();
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
        int hashCode4 = this.j.hashCode() + this.i.hashCode() + hash2 + (expression3 != null ? expression3.hashCode() : 0);
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
        int i13 = hashCode4 + i3;
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
        int hashCode5 = this.q.hashCode() + hash4 + (str != null ? str.hashCode() : 0);
        o2 o2Var = this.r;
        int hash5 = this.u.hash() + this.s.hash() + hashCode5 + (o2Var != null ? o2Var.hash() : 0);
        vmn vmnVar = this.v;
        int hash6 = hash5 + (vmnVar != null ? vmnVar.hash() : 0);
        y3 y3Var = this.w;
        int hashCode6 = this.x.hashCode() + hash6 + (y3Var != null ? y3Var.hash() : 0);
        y3 y3Var2 = this.y;
        int hash7 = hashCode6 + (y3Var2 != null ? y3Var2.hash() : 0);
        c7 c7Var = this.z;
        int hashCode7 = this.A.hashCode() + hash7 + (c7Var != null ? c7Var.hash() : 0);
        Expression<String> expression4 = this.B;
        int hashCode8 = hashCode7 + (expression4 != null ? expression4.hashCode() : 0);
        Expression<Long> expression5 = this.C;
        int hashCode9 = this.D.hashCode() + hashCode8 + (expression5 != null ? expression5.hashCode() : 0);
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
        int i15 = hashCode9 + i6;
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
        int hash8 = i16 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.H;
        int hash9 = hash8 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.I;
        int hash10 = hash9 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.J;
        int hash11 = hash10 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list8 = this.K;
        int hashCode10 = hash11 + (list8 != null ? list8.hashCode() : 0);
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
        int i17 = hashCode10 + i8;
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
        int hashCode11 = this.N.hashCode() + i17 + i9;
        zd zdVar = this.O;
        int hash12 = hashCode11 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list11 = this.P;
        if (list11 != null) {
            Iterator<T> it10 = list11.iterator();
            while (it10.hasNext()) {
                i10 += ((zd) it10.next()).hash();
            }
        }
        int hash13 = this.Q.hash() + hash12 + i10;
        this.R = Integer.valueOf(hash13);
        return hash13;
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
        return ((n7.g) BuiltInParserKt.getBuiltInParserComponent().z5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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
}
