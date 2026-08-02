package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.ikn;
import xsna.jln;
import xsna.vmn;
import xsna.zkn;

/* compiled from: Div.kt */
/* loaded from: classes8.dex */
public abstract class a implements JSONSerializable, Hashable {
    public Integer a;
    public Integer b;

    /* compiled from: Div.kt */
    /* renamed from: com.yandex.div2.a$a, reason: collision with other inner class name */
    public static final class C2110a extends a {
        public final DivContainer c;

        public C2110a(DivContainer divContainer) {
            this.c = divContainer;
        }
    }

    /* compiled from: Div.kt */
    public static final class b extends a {
        public final g3 c;

        public b(g3 g3Var) {
            this.c = g3Var;
        }
    }

    /* compiled from: Div.kt */
    public static final class c extends a {
        public final DivGallery c;

        public c(DivGallery divGallery) {
            this.c = divGallery;
        }
    }

    /* compiled from: Div.kt */
    public static final class d extends a {
        public final y4 c;

        public d(y4 y4Var) {
            this.c = y4Var;
        }
    }

    /* compiled from: Div.kt */
    public static final class e extends a {
        public final b5 c;

        public e(b5 b5Var) {
            this.c = b5Var;
        }
    }

    /* compiled from: Div.kt */
    public static final class f extends a {
        public final e5 c;

        public f(e5 e5Var) {
            this.c = e5Var;
        }
    }

    /* compiled from: Div.kt */
    public static final class g extends a {
        public final DivIndicator c;

        public g(DivIndicator divIndicator) {
            this.c = divIndicator;
        }
    }

    /* compiled from: Div.kt */
    public static final class h extends a {
        public final DivInput c;

        public h(DivInput divInput) {
            this.c = divInput;
        }
    }

    /* compiled from: Div.kt */
    public static final class i extends a {
        public final DivPager c;

        public i(DivPager divPager) {
            this.c = divPager;
        }
    }

    /* compiled from: Div.kt */
    public static final class j extends a {
        public final e9 c;

        public j(e9 e9Var) {
            this.c = e9Var;
        }
    }

    /* compiled from: Div.kt */
    public static final class k extends a {
        public final DivSeparator c;

        public k(DivSeparator divSeparator) {
            this.c = divSeparator;
        }
    }

    /* compiled from: Div.kt */
    public static final class l extends a {
        public final fa c;

        public l(fa faVar) {
            this.c = faVar;
        }
    }

    /* compiled from: Div.kt */
    public static final class m extends a {
        public final ma c;

        public m(ma maVar) {
            this.c = maVar;
        }
    }

    /* compiled from: Div.kt */
    public static final class n extends a {
        public final db c;

        public n(db dbVar) {
            this.c = dbVar;
        }
    }

    /* compiled from: Div.kt */
    public static final class o extends a {
        public final DivTabs c;

        public o(DivTabs divTabs) {
            this.c = divTabs;
        }
    }

    /* compiled from: Div.kt */
    public static final class p extends a {
        public final DivText c;

        public p(DivText divText) {
            this.c = divText;
        }
    }

    /* compiled from: Div.kt */
    public static final class q extends a {
        public final rd c;

        public q(rd rdVar) {
            this.c = rdVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:543:0x090f, code lost:
    
        if (r43 == null) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x08a1, code lost:
    
        if (r19 == null) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0854, code lost:
    
        if (r20 == null) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0807, code lost:
    
        if (r21 == null) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0767, code lost:
    
        if (r26 == null) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x06ec, code lost:
    
        if (r27 == null) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0631, code lost:
    
        if (r28 == null) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x05e4, code lost:
    
        if (r29 == null) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x053b, code lost:
    
        if (r32 == null) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x04be, code lost:
    
        if (r34 == null) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0471, code lost:
    
        if (r35 == null) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x0400, code lost:
    
        if (r36 == null) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x039f, code lost:
    
        if (r38 == null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0352, code lost:
    
        if (r5 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x030b, code lost:
    
        if (r0 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x02c4, code lost:
    
        if (r7 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x0215, code lost:
    
        if (r9 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x01aa, code lost:
    
        if (r12 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x0108, code lost:
    
        if (r13 == null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(a aVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
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
        if (aVar != null) {
            if (!(this instanceof f)) {
                if (this instanceof d) {
                    d dVar = (d) this;
                    ikn b2 = aVar.b();
                    return dVar.c.B(b2 instanceof y4 ? (y4) b2 : null, expressionResolver, expressionResolver2);
                }
                if (this instanceof p) {
                    p pVar = (p) this;
                    ikn b3 = aVar.b();
                    return pVar.c.B(b3 instanceof DivText ? (DivText) b3 : null, expressionResolver, expressionResolver2);
                }
                if (this instanceof k) {
                    k kVar = (k) this;
                    ikn b4 = aVar.b();
                    return kVar.c.B(b4 instanceof DivSeparator ? (DivSeparator) b4 : null, expressionResolver, expressionResolver2);
                }
                if (this instanceof C2110a) {
                    C2110a c2110a = (C2110a) this;
                    ikn b5 = aVar.b();
                    return c2110a.c.C(b5 instanceof DivContainer ? (DivContainer) b5 : null, expressionResolver, expressionResolver2);
                }
                if (this instanceof e) {
                    e eVar = (e) this;
                    ikn b6 = aVar.b();
                    return eVar.c.C(b6 instanceof b5 ? (b5) b6 : null, expressionResolver, expressionResolver2);
                }
                if (this instanceof c) {
                    c cVar = (c) this;
                    ikn b7 = aVar.b();
                    return cVar.c.C(b7 instanceof DivGallery ? (DivGallery) b7 : null, expressionResolver, expressionResolver2);
                }
                if (this instanceof i) {
                    i iVar = (i) this;
                    ikn b8 = aVar.b();
                    return iVar.c.C(b8 instanceof DivPager ? (DivPager) b8 : null, expressionResolver, expressionResolver2);
                }
                if (this instanceof o) {
                    o oVar = (o) this;
                    ikn b9 = aVar.b();
                    return oVar.c.C(b9 instanceof DivTabs ? (DivTabs) b9 : null, expressionResolver, expressionResolver2);
                }
                if (this instanceof m) {
                    m mVar = (m) this;
                    ikn b10 = aVar.b();
                    return mVar.c.C(b10 instanceof ma ? (ma) b10 : null, expressionResolver, expressionResolver2);
                }
                if (this instanceof b) {
                    b bVar = (b) this;
                    ikn b11 = aVar.b();
                    return bVar.c.C(b11 instanceof g3 ? (g3) b11 : null, expressionResolver, expressionResolver2);
                }
                if (this instanceof g) {
                    g gVar = (g) this;
                    ikn b12 = aVar.b();
                    return gVar.c.B(b12 instanceof DivIndicator ? (DivIndicator) b12 : null, expressionResolver, expressionResolver2);
                }
                if (this instanceof l) {
                    l lVar = (l) this;
                    ikn b13 = aVar.b();
                    return lVar.c.B(b13 instanceof fa ? (fa) b13 : null, expressionResolver, expressionResolver2);
                }
                if (this instanceof n) {
                    n nVar = (n) this;
                    ikn b14 = aVar.b();
                    return nVar.c.C(b14 instanceof db ? (db) b14 : null, expressionResolver, expressionResolver2);
                }
                if (this instanceof h) {
                    h hVar = (h) this;
                    ikn b15 = aVar.b();
                    return hVar.c.B(b15 instanceof DivInput ? (DivInput) b15 : null, expressionResolver, expressionResolver2);
                }
                if (this instanceof j) {
                    j jVar = (j) this;
                    ikn b16 = aVar.b();
                    return jVar.c.B(b16 instanceof e9 ? (e9) b16 : null, expressionResolver, expressionResolver2);
                }
                if (!(this instanceof q)) {
                    throw new NoWhenBranchMatchedException();
                }
                q qVar = (q) this;
                ikn b17 = aVar.b();
                return qVar.c.C(b17 instanceof rd ? (rd) b17 : null, expressionResolver, expressionResolver2);
            }
            f fVar = (f) this;
            ikn b18 = aVar.b();
            e5 e5Var = b18 instanceof e5 ? (e5) b18 : null;
            e5 e5Var2 = fVar.c;
            e5Var2.getClass();
            if (e5Var != null) {
                List<zd> list = e5Var.b0;
                zd zdVar = e5Var.a0;
                List<md> list2 = e5Var.Y;
                List<DivTrigger> list3 = e5Var.X;
                List<DivTransitionTrigger> list4 = e5Var.W;
                e1 e1Var = e5Var.V;
                e1 e1Var2 = e5Var.U;
                d2 d2Var = e5Var.T;
                hd hdVar = e5Var.S;
                List<DivTooltip> list5 = e5Var.R;
                List<DivAction> list6 = e5Var.O;
                List<DivAction> list7 = e5Var.J;
                List<zd> list8 = list;
                List<DivAction> list9 = e5Var.I;
                y3 y3Var = e5Var.F;
                List<md> list10 = list2;
                y3 y3Var2 = e5Var.E;
                List<DivTrigger> list11 = list3;
                List<DivAction> list12 = e5Var.D;
                List<DivTransitionTrigger> list13 = list4;
                vmn vmnVar = e5Var.C;
                List<DivAction> list14 = e5Var.z;
                List<DivAction> list15 = e5Var.y;
                List<t4> list16 = e5Var.v;
                jln jlnVar = e5Var.u;
                List<DivTooltip> list17 = list5;
                List<e4> list18 = e5Var.t;
                List<DivAction> list19 = list6;
                List<zkn> list20 = e5Var.s;
                List<DivAction> list21 = list7;
                List<DivAction> list22 = e5Var.r;
                List<DivAction> list23 = list9;
                List<v3> list24 = e5Var.q;
                u1 u1Var = e5Var.l;
                List<m1> list25 = e5Var.k;
                List<DivAction> list26 = list12;
                j1 j1Var = e5Var.j;
                b4 b4Var = e5Var.i;
                List<DivAction> list27 = list14;
                List<w0> list28 = e5Var.h;
                List<DivAction> list29 = list15;
                List<DivAction> list30 = e5Var.d;
                List<t4> list31 = list16;
                DivAction divAction = e5Var.b;
                DivAccessibility divAccessibility = e5Var.a;
                List<e4> list32 = list18;
                DivAccessibility divAccessibility2 = e5Var2.a;
                if (!(divAccessibility2 != null ? divAccessibility2.a(divAccessibility, expressionResolver, expressionResolver2) : divAccessibility == null)) {
                    return false;
                }
                DivAction divAction2 = e5Var2.b;
                if (!(divAction2 != null ? divAction2.a(divAction, expressionResolver, expressionResolver2) : divAction == null) || !e5Var2.c.a(e5Var.c, expressionResolver, expressionResolver2)) {
                    return false;
                }
                List<DivAction> list33 = e5Var2.d;
                if (list33 != null) {
                    if (list30 != null) {
                        if (list33.size() == list30.size()) {
                            int i2 = 0;
                            for (Object obj : list33) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (((DivAction) obj).a(list30.get(i2), expressionResolver, expressionResolver2)) {
                                    i2 = i3;
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
                Expression<DivAlignmentHorizontal> expression = e5Var2.e;
                DivAlignmentHorizontal evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
                Expression<DivAlignmentHorizontal> expression2 = e5Var.e;
                if (evaluate != (expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
                    return false;
                }
                Expression<DivAlignmentVertical> expression3 = e5Var2.f;
                DivAlignmentVertical evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
                Expression<DivAlignmentVertical> expression4 = e5Var.f;
                if (evaluate2 != (expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                    return false;
                }
                if (!(e5Var2.g.evaluate(expressionResolver).doubleValue() == e5Var.g.evaluate(expressionResolver2).doubleValue())) {
                    return false;
                }
                List<w0> list34 = e5Var2.h;
                if (list34 != null) {
                    if (list28 != null) {
                        if (list34.size() == list28.size()) {
                            int i4 = 0;
                            for (Object obj2 : list34) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (((w0) obj2).a(list28.get(i4), expressionResolver, expressionResolver2)) {
                                    i4 = i5;
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
                b4 b4Var2 = e5Var2.i;
                if (!(b4Var2 != null ? b4Var2.a(b4Var, expressionResolver, expressionResolver2) : b4Var == null)) {
                    return false;
                }
                j1 j1Var2 = e5Var2.j;
                if (!(j1Var2 != null ? j1Var2.a(j1Var, expressionResolver, expressionResolver2) : j1Var == null)) {
                    return false;
                }
                List<m1> list35 = e5Var2.k;
                if (list35 != null) {
                    if (list25 != null) {
                        if (list35.size() == list25.size()) {
                            int i6 = 0;
                            for (Object obj3 : list35) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (((m1) obj3).a(list25.get(i6), expressionResolver, expressionResolver2)) {
                                    i6 = i7;
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
                u1 u1Var2 = e5Var2.l;
                if (!(u1Var2 != null ? u1Var2.a(u1Var, expressionResolver, expressionResolver2) : u1Var == null) || e5Var2.m.evaluate(expressionResolver).booleanValue() != e5Var.m.evaluate(expressionResolver2).booleanValue()) {
                    return false;
                }
                Expression<Long> expression5 = e5Var2.n;
                Long evaluate3 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
                Expression<Long> expression6 = e5Var.n;
                if (!epx.f(evaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null) || e5Var2.o.evaluate(expressionResolver) != e5Var.o.evaluate(expressionResolver2) || e5Var2.p.evaluate(expressionResolver) != e5Var.p.evaluate(expressionResolver2)) {
                    return false;
                }
                List<v3> list36 = e5Var2.q;
                if (list36 != null) {
                    if (list24 != null) {
                        if (list36.size() == list24.size()) {
                            int i8 = 0;
                            for (Object obj4 : list36) {
                                int i9 = i8 + 1;
                                if (i8 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (((v3) obj4).g(list24.get(i8), expressionResolver, expressionResolver2)) {
                                    i8 = i9;
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
                List<DivAction> list37 = e5Var2.r;
                if (list37 != null) {
                    if (list22 != null) {
                        if (list37.size() == list22.size()) {
                            int i10 = 0;
                            for (Object obj5 : list37) {
                                int i11 = i10 + 1;
                                if (i10 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (((DivAction) obj5).a(list22.get(i10), expressionResolver, expressionResolver2)) {
                                    i10 = i11;
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
                List<zkn> list38 = e5Var2.s;
                if (list38 != null) {
                    if (list20 != null) {
                        if (list38.size() == list20.size()) {
                            int i12 = 0;
                            for (Object obj6 : list38) {
                                int i13 = i12 + 1;
                                if (i12 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                if (((zkn) obj6).a(list20.get(i12))) {
                                    i12 = i13;
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
                List<e4> list39 = e5Var2.t;
                if (list39 != null) {
                    if (list32 != null) {
                        if (list39.size() == list32.size()) {
                            int i14 = 0;
                            for (Object obj7 : list39) {
                                int i15 = i14 + 1;
                                if (i14 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                List<e4> list40 = list32;
                                if (((e4) obj7).a(list40.get(i14), expressionResolver, expressionResolver2)) {
                                    i14 = i15;
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
                if (!z7) {
                    return false;
                }
                jln jlnVar2 = e5Var2.u;
                if (!(jlnVar2 != null ? jlnVar2.a(jlnVar, expressionResolver, expressionResolver2) : jlnVar == null)) {
                    return false;
                }
                List<t4> list41 = e5Var2.v;
                if (list41 != null) {
                    if (list31 != null) {
                        if (list41.size() == list31.size()) {
                            int i16 = 0;
                            for (Object obj8 : list41) {
                                int i17 = i16 + 1;
                                if (i16 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                List<t4> list42 = list31;
                                if (((t4) obj8).a(list42.get(i16))) {
                                    i16 = i17;
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
                if (!z8 || !e5Var2.w.a(e5Var.w, expressionResolver, expressionResolver2) || e5Var2.x.evaluate(expressionResolver).booleanValue() != e5Var.x.evaluate(expressionResolver2).booleanValue()) {
                    return false;
                }
                List<DivAction> list43 = e5Var2.y;
                if (list43 != null) {
                    if (list29 != null) {
                        if (list43.size() == list29.size()) {
                            int i18 = 0;
                            for (Object obj9 : list43) {
                                int i19 = i18 + 1;
                                if (i18 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                List<DivAction> list44 = list29;
                                if (((DivAction) obj9).a(list44.get(i18), expressionResolver, expressionResolver2)) {
                                    i18 = i19;
                                    list29 = list44;
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
                List<DivAction> list45 = e5Var2.z;
                if (list45 != null) {
                    if (list27 != null) {
                        if (list45.size() == list27.size()) {
                            int i20 = 0;
                            for (Object obj10 : list45) {
                                int i21 = i20 + 1;
                                if (i20 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                List<DivAction> list46 = list27;
                                if (((DivAction) obj10).a(list46.get(i20), expressionResolver, expressionResolver2)) {
                                    i20 = i21;
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
                if (!z10 || !epx.f(e5Var2.A, e5Var.A) || !epx.f(e5Var2.B.evaluate(expressionResolver), e5Var.B.evaluate(expressionResolver2))) {
                    return false;
                }
                vmn vmnVar2 = e5Var2.C;
                if (!(vmnVar2 != null ? vmnVar2.a(vmnVar) : vmnVar == null)) {
                    return false;
                }
                List<DivAction> list47 = e5Var2.D;
                if (list47 != null) {
                    if (list26 != null) {
                        if (list47.size() == list26.size()) {
                            int i22 = 0;
                            for (Object obj11 : list47) {
                                int i23 = i22 + 1;
                                if (i22 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                List<DivAction> list48 = list26;
                                if (((DivAction) obj11).a(list48.get(i22), expressionResolver, expressionResolver2)) {
                                    i22 = i23;
                                    list26 = list48;
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
                y3 y3Var3 = e5Var2.E;
                if (!(y3Var3 != null ? y3Var3.a(y3Var2, expressionResolver, expressionResolver2) : y3Var2 == null)) {
                    return false;
                }
                y3 y3Var4 = e5Var2.F;
                if (!(y3Var4 != null ? y3Var4.a(y3Var, expressionResolver, expressionResolver2) : y3Var == null) || e5Var2.G.evaluate(expressionResolver).intValue() != e5Var.G.evaluate(expressionResolver2).intValue() || e5Var2.H.evaluate(expressionResolver).booleanValue() != e5Var.H.evaluate(expressionResolver2).booleanValue()) {
                    return false;
                }
                List<DivAction> list49 = e5Var2.I;
                if (list49 != null) {
                    if (list23 != null) {
                        if (list49.size() == list23.size()) {
                            int i24 = 0;
                            for (Object obj12 : list49) {
                                int i25 = i24 + 1;
                                if (i24 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                List<DivAction> list50 = list23;
                                if (((DivAction) obj12).a(list50.get(i24), expressionResolver, expressionResolver2)) {
                                    i24 = i25;
                                    list23 = list50;
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
                List<DivAction> list51 = e5Var2.J;
                if (list51 != null) {
                    if (list21 != null) {
                        if (list51.size() == list21.size()) {
                            int i26 = 0;
                            for (Object obj13 : list51) {
                                int i27 = i26 + 1;
                                if (i26 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                List<DivAction> list52 = list21;
                                if (((DivAction) obj13).a(list52.get(i26), expressionResolver, expressionResolver2)) {
                                    i26 = i27;
                                    list21 = list52;
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
                Expression<String> expression7 = e5Var2.K;
                String evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
                Expression<String> expression8 = e5Var.K;
                if (!epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
                    return false;
                }
                Expression<String> expression9 = e5Var2.L;
                String evaluate5 = expression9 != null ? expression9.evaluate(expressionResolver) : null;
                Expression<String> expression10 = e5Var.L;
                if (!epx.f(evaluate5, expression10 != null ? expression10.evaluate(expressionResolver2) : null)) {
                    return false;
                }
                Expression<Long> expression11 = e5Var2.M;
                Long evaluate6 = expression11 != null ? expression11.evaluate(expressionResolver) : null;
                Expression<Long> expression12 = e5Var.M;
                if (!epx.f(evaluate6, expression12 != null ? expression12.evaluate(expressionResolver2) : null) || e5Var2.N.evaluate(expressionResolver) != e5Var.N.evaluate(expressionResolver2)) {
                    return false;
                }
                List<DivAction> list53 = e5Var2.O;
                if (list53 != null) {
                    if (list19 != null) {
                        if (list53.size() == list19.size()) {
                            int i28 = 0;
                            for (Object obj14 : list53) {
                                int i29 = i28 + 1;
                                if (i28 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                List<DivAction> list54 = list19;
                                if (((DivAction) obj14).a(list54.get(i28), expressionResolver, expressionResolver2)) {
                                    i28 = i29;
                                    list19 = list54;
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
                Expression<Integer> expression13 = e5Var2.P;
                Integer evaluate7 = expression13 != null ? expression13.evaluate(expressionResolver) : null;
                Expression<Integer> expression14 = e5Var.P;
                if (!epx.f(evaluate7, expression14 != null ? expression14.evaluate(expressionResolver2) : null) || e5Var2.Q.evaluate(expressionResolver) != e5Var.Q.evaluate(expressionResolver2)) {
                    return false;
                }
                List<DivTooltip> list55 = e5Var2.R;
                if (list55 != null) {
                    if (list17 != null) {
                        if (list55.size() == list17.size()) {
                            int i30 = 0;
                            for (Object obj15 : list55) {
                                int i31 = i30 + 1;
                                if (i30 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                List<DivTooltip> list56 = list17;
                                if (((DivTooltip) obj15).a(list56.get(i30), expressionResolver, expressionResolver2)) {
                                    i30 = i31;
                                    list17 = list56;
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
                hd hdVar2 = e5Var2.S;
                if (!(hdVar2 != null ? hdVar2.a(hdVar, expressionResolver, expressionResolver2) : hdVar == null)) {
                    return false;
                }
                d2 d2Var2 = e5Var2.T;
                if (!(d2Var2 != null ? d2Var2.a(d2Var, expressionResolver, expressionResolver2) : d2Var == null)) {
                    return false;
                }
                e1 e1Var3 = e5Var2.U;
                if (!(e1Var3 != null ? e1Var3.a(e1Var2, expressionResolver, expressionResolver2) : e1Var2 == null)) {
                    return false;
                }
                e1 e1Var4 = e5Var2.V;
                if (!(e1Var4 != null ? e1Var4.a(e1Var, expressionResolver, expressionResolver2) : e1Var == null)) {
                    return false;
                }
                List<DivTransitionTrigger> list57 = e5Var2.W;
                if (list57 != null) {
                    if (list13 != null) {
                        if (list57.size() == list13.size()) {
                            int i32 = 0;
                            for (Object obj16 : list57) {
                                int i33 = i32 + 1;
                                if (i32 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                List<DivTransitionTrigger> list58 = list13;
                                if (((DivTransitionTrigger) obj16) == list58.get(i32)) {
                                    i32 = i33;
                                    list13 = list58;
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
                List<DivTrigger> list59 = e5Var2.X;
                if (list59 != null) {
                    if (list11 != null) {
                        if (list59.size() == list11.size()) {
                            int i34 = 0;
                            for (Object obj17 : list59) {
                                int i35 = i34 + 1;
                                if (i34 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                List<DivTrigger> list60 = list11;
                                if (((DivTrigger) obj17).a(list60.get(i34), expressionResolver, expressionResolver2)) {
                                    i34 = i35;
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
                List<md> list61 = e5Var2.Y;
                if (list61 != null) {
                    if (list10 != null) {
                        if (list61.size() == list10.size()) {
                            int i36 = 0;
                            for (Object obj18 : list61) {
                                int i37 = i36 + 1;
                                if (i36 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                List<md> list62 = list10;
                                if (((md) obj18).a(list62.get(i36), expressionResolver, expressionResolver2)) {
                                    i36 = i37;
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
                if (!z18 || e5Var2.Z.evaluate(expressionResolver) != e5Var.Z.evaluate(expressionResolver2)) {
                    return false;
                }
                zd zdVar2 = e5Var2.a0;
                if (!(zdVar2 != null ? zdVar2.g(zdVar, expressionResolver, expressionResolver2) : zdVar == null)) {
                    return false;
                }
                List<zd> list63 = e5Var2.b0;
                if (list63 != null) {
                    if (list8 != null) {
                        if (list63.size() == list8.size()) {
                            int i38 = 0;
                            for (Object obj19 : list63) {
                                int i39 = i38 + 1;
                                if (i38 < 0) {
                                    e43.t();
                                    throw null;
                                }
                                List<zd> list64 = list8;
                                if (((zd) obj19).g(list64.get(i38), expressionResolver, expressionResolver2)) {
                                    i38 = i39;
                                    list8 = list64;
                                }
                            }
                            z19 = true;
                        }
                        z19 = false;
                        break;
                    }
                    return false;
                }
                return z19 && e5Var2.c0.a(e5Var.c0, expressionResolver, expressionResolver2);
            }
        }
        return false;
    }

    public final ikn b() {
        if (this instanceof f) {
            return ((f) this).c;
        }
        if (this instanceof d) {
            return ((d) this).c;
        }
        if (this instanceof p) {
            return ((p) this).c;
        }
        if (this instanceof k) {
            return ((k) this).c;
        }
        if (this instanceof C2110a) {
            return ((C2110a) this).c;
        }
        if (this instanceof e) {
            return ((e) this).c;
        }
        if (this instanceof c) {
            return ((c) this).c;
        }
        if (this instanceof i) {
            return ((i) this).c;
        }
        if (this instanceof o) {
            return ((o) this).c;
        }
        if (this instanceof m) {
            return ((m) this).c;
        }
        if (this instanceof b) {
            return ((b) this).c;
        }
        if (this instanceof g) {
            return ((g) this).c;
        }
        if (this instanceof l) {
            return ((l) this).c;
        }
        if (this instanceof n) {
            return ((n) this).c;
        }
        if (this instanceof h) {
            return ((h) this).c;
        }
        if (this instanceof j) {
            return ((j) this).c;
        }
        if (this instanceof q) {
            return ((q) this).c;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int hash;
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(getClass()).hashCode();
        if (this instanceof f) {
            hash = ((f) this).c.hash();
        } else if (this instanceof d) {
            hash = ((d) this).c.hash();
        } else if (this instanceof p) {
            hash = ((p) this).c.hash();
        } else if (this instanceof k) {
            hash = ((k) this).c.hash();
        } else if (this instanceof C2110a) {
            hash = ((C2110a) this).c.hash();
        } else if (this instanceof e) {
            hash = ((e) this).c.hash();
        } else if (this instanceof c) {
            hash = ((c) this).c.hash();
        } else if (this instanceof i) {
            hash = ((i) this).c.hash();
        } else if (this instanceof o) {
            hash = ((o) this).c.hash();
        } else if (this instanceof m) {
            hash = ((m) this).c.hash();
        } else if (this instanceof b) {
            hash = ((b) this).c.hash();
        } else if (this instanceof g) {
            hash = ((g) this).c.hash();
        } else if (this instanceof l) {
            hash = ((l) this).c.hash();
        } else if (this instanceof n) {
            hash = ((n) this).c.hash();
        } else if (this instanceof h) {
            hash = ((h) this).c.hash();
        } else if (this instanceof j) {
            hash = ((j) this).c.hash();
        } else {
            if (!(this instanceof q)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((q) this).c.hash();
        }
        int i2 = hashCode + hash;
        this.b = Integer.valueOf(i2);
        return i2;
    }

    @Override // com.yandex.div.data.Hashable
    public final int propertiesHash() {
        int propertiesHash;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(getClass()).hashCode();
        if (this instanceof f) {
            propertiesHash = ((f) this).c.propertiesHash();
        } else if (this instanceof d) {
            propertiesHash = ((d) this).c.propertiesHash();
        } else if (this instanceof p) {
            propertiesHash = ((p) this).c.propertiesHash();
        } else if (this instanceof k) {
            propertiesHash = ((k) this).c.propertiesHash();
        } else if (this instanceof C2110a) {
            propertiesHash = ((C2110a) this).c.propertiesHash();
        } else if (this instanceof e) {
            propertiesHash = ((e) this).c.propertiesHash();
        } else if (this instanceof c) {
            propertiesHash = ((c) this).c.propertiesHash();
        } else if (this instanceof i) {
            propertiesHash = ((i) this).c.propertiesHash();
        } else if (this instanceof o) {
            propertiesHash = ((o) this).c.propertiesHash();
        } else if (this instanceof m) {
            propertiesHash = ((m) this).c.propertiesHash();
        } else if (this instanceof b) {
            propertiesHash = ((b) this).c.propertiesHash();
        } else if (this instanceof g) {
            propertiesHash = ((g) this).c.propertiesHash();
        } else if (this instanceof l) {
            propertiesHash = ((l) this).c.propertiesHash();
        } else if (this instanceof n) {
            propertiesHash = ((n) this).c.propertiesHash();
        } else if (this instanceof h) {
            propertiesHash = ((h) this).c.propertiesHash();
        } else if (this instanceof j) {
            propertiesHash = ((j) this).c.propertiesHash();
        } else {
            if (!(this instanceof q)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((q) this).c.propertiesHash();
        }
        int i2 = hashCode + propertiesHash;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((p6) BuiltInParserKt.getBuiltInParserComponent().z9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
