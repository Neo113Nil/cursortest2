package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import defpackage.afk;
import defpackage.bpk;
import defpackage.c4x;
import defpackage.egk;
import defpackage.ft6;
import defpackage.gil;
import defpackage.i9l;
import defpackage.irk;
import defpackage.j9l;
import defpackage.jl40;
import defpackage.kfk;
import defpackage.kvo;
import defpackage.lll;
import defpackage.lql;
import defpackage.m3k;
import defpackage.ngd0;
import defpackage.nnk;
import defpackage.nzk;
import defpackage.pdk;
import defpackage.qoi0;
import defpackage.rvo;
import defpackage.scc;
import defpackage.tls;
import defpackage.v3k;
import defpackage.vjk;
import defpackage.xjl;
import defpackage.ydk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class DivContainer implements c4x, egk {
    public static final pdk f0;
    public static final kvo g0;
    public static final kvo h0;
    public static final kvo i0;
    public static final kvo j0;
    public static final kvo k0;
    public static final j9l l0;
    public static final kvo m0;
    public static final kvo n0;
    public static final kvo o0;
    public static final kvo p0;
    public static final kvo q0;
    public static final i9l r0;
    public final Expression A;
    public final List B;
    public final Expression C;
    public final DivLayoutProvider D;
    public final vjk E;
    public final Expression F;
    public final List G;
    public final DivEdgeInsets H;
    public final Expression I;
    public final DivEdgeInsets J;
    public final List K;
    public final List L;
    public final Expression M;
    public final Expression N;
    public final List O;
    public final vjk P;
    public final List Q;
    public final DivTransform R;
    public final List S;
    public final DivChangeTransition T;
    public final DivAppearanceTransition U;
    public final DivAppearanceTransition V;
    public final List W;
    public final List X;
    public final List Y;
    public final Expression Z;
    public final DivAccessibility a;
    public final DivVisibilityAction a0;
    public final v3k b;
    public final List b0;
    public final pdk c;
    public final DivSize c0;
    public final List d;
    public Integer d0;
    public final Expression e;
    public Integer e0;
    public final Expression f;
    public final Expression g;
    public final List h;
    public final afk i;
    public final List j;
    public final DivBorder k;
    public final Expression l;
    public final Expression m;
    public final Expression n;
    public final Expression o;
    public final Expression p;
    public final List q;
    public final List r;
    public final List s;
    public final DivFocus t;
    public final List u;
    public final DivSize v;
    public final List w;
    public final List x;
    public final String y;
    public final DivCollectionItemBuilder z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/DivContainer$LayoutMode;", "", "", "value", "Ljava/lang/String;", "Converter", "com/yandex/div2/r", "NO_WRAP", "WRAP", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LayoutMode {
        NO_WRAP("no_wrap"),
        WRAP("wrap");

        private final String value;
        public static final r Converter = new r();
        public static final tls TO_STRING = DivContainer$LayoutMode$Converter$TO_STRING$1.w;
        public static final tls FROM_STRING = DivContainer$LayoutMode$Converter$FROM_STRING$1.w;

        LayoutMode(String str) {
            this.value = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/div2/DivContainer$Orientation;", "", "", "value", "Ljava/lang/String;", "Converter", "com/yandex/div2/s", "VERTICAL", "HORIZONTAL", "OVERLAP", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Orientation {
        VERTICAL("vertical"),
        HORIZONTAL("horizontal"),
        OVERLAP("overlap");

        private final String value;
        public static final s Converter = new s();
        public static final tls TO_STRING = DivContainer$Orientation$Converter$TO_STRING$1.w;
        public static final tls FROM_STRING = DivContainer$Orientation$Converter$FROM_STRING$1.w;

        Orientation(String str) {
            this.value = str;
        }
    }

    static {
        kvo m = ngd0.m(100L);
        kvo m2 = ngd0.m(Double.valueOf(0.6d));
        kvo m3 = ngd0.m(DivAnimation$Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        f0 = new pdk(m, m2, m3, ngd0.m(valueOf));
        g0 = ngd0.m(valueOf);
        Boolean bool = Boolean.TRUE;
        h0 = ngd0.m(bool);
        i0 = ngd0.m(bool);
        j0 = ngd0.m(DivContentAlignmentHorizontal.START);
        k0 = ngd0.m(DivContentAlignmentVertical.TOP);
        l0 = new j9l(new lql(null, null, null));
        m0 = ngd0.m(0L);
        n0 = ngd0.m(LayoutMode.NO_WRAP);
        o0 = ngd0.m(0L);
        p0 = ngd0.m(Orientation.VERTICAL);
        q0 = ngd0.m(DivVisibility.VISIBLE);
        r0 = new i9l(new nzk(null, null, null));
    }

    public DivContainer(DivAccessibility divAccessibility, v3k v3kVar, pdk pdkVar, List list, Expression expression, Expression expression2, Expression expression3, List list2, afk afkVar, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, DivCollectionItemBuilder divCollectionItemBuilder, Expression expression9, List list10, Expression expression10, DivLayoutProvider divLayoutProvider, vjk vjkVar, Expression expression11, List list11, DivEdgeInsets divEdgeInsets, Expression expression12, DivEdgeInsets divEdgeInsets2, List list12, List list13, Expression expression13, Expression expression14, List list14, vjk vjkVar2, List list15, DivTransform divTransform, List list16, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list17, List list18, List list19, Expression expression15, DivVisibilityAction divVisibilityAction, List list20, DivSize divSize2) {
        this.a = divAccessibility;
        this.b = v3kVar;
        this.c = pdkVar;
        this.d = list;
        this.e = expression;
        this.f = expression2;
        this.g = expression3;
        this.h = list2;
        this.i = afkVar;
        this.j = list3;
        this.k = divBorder;
        this.l = expression4;
        this.m = expression5;
        this.n = expression6;
        this.o = expression7;
        this.p = expression8;
        this.q = list4;
        this.r = list5;
        this.s = list6;
        this.t = divFocus;
        this.u = list7;
        this.v = divSize;
        this.w = list8;
        this.x = list9;
        this.y = str;
        this.z = divCollectionItemBuilder;
        this.A = expression9;
        this.B = list10;
        this.C = expression10;
        this.D = divLayoutProvider;
        this.E = vjkVar;
        this.F = expression11;
        this.G = list11;
        this.H = divEdgeInsets;
        this.I = expression12;
        this.J = divEdgeInsets2;
        this.K = list12;
        this.L = list13;
        this.M = expression13;
        this.N = expression14;
        this.O = list14;
        this.P = vjkVar2;
        this.Q = list15;
        this.R = divTransform;
        this.S = list16;
        this.T = divChangeTransition;
        this.U = divAppearanceTransition;
        this.V = divAppearanceTransition2;
        this.W = list17;
        this.X = list18;
        this.Y = list19;
        this.Z = expression15;
        this.a0 = divVisibilityAction;
        this.b0 = list20;
        this.c0 = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.util.List] */
    public static DivContainer B(DivContainer divContainer, ArrayList arrayList, String str, List list, int i) {
        List list2;
        List list3;
        String str2;
        DivAccessibility divAccessibility = divContainer.a;
        v3k v3kVar = divContainer.b;
        pdk pdkVar = divContainer.c;
        List list4 = divContainer.d;
        Expression expression = divContainer.e;
        Expression expression2 = divContainer.f;
        Expression expression3 = divContainer.g;
        List list5 = divContainer.h;
        afk afkVar = divContainer.i;
        List list6 = divContainer.j;
        DivBorder divBorder = divContainer.k;
        Expression expression4 = divContainer.l;
        Expression expression5 = divContainer.m;
        Expression expression6 = divContainer.n;
        Expression expression7 = divContainer.o;
        Expression expression8 = divContainer.p;
        List list7 = divContainer.q;
        List list8 = divContainer.r;
        if ((i & 262144) != 0) {
            list2 = list8;
            arrayList = divContainer.s;
        } else {
            list2 = list8;
        }
        DivFocus divFocus = divContainer.t;
        List list9 = divContainer.u;
        DivSize divSize = divContainer.v;
        List list10 = divContainer.w;
        List list11 = divContainer.x;
        if ((i & 16777216) != 0) {
            list3 = list11;
            str2 = divContainer.y;
        } else {
            list3 = list11;
            str2 = str;
        }
        DivCollectionItemBuilder divCollectionItemBuilder = divContainer.z;
        Expression expression9 = divContainer.A;
        Expression expression10 = divContainer.C;
        DivLayoutProvider divLayoutProvider = divContainer.D;
        vjk vjkVar = divContainer.E;
        Expression expression11 = divContainer.F;
        List list12 = divContainer.G;
        DivEdgeInsets divEdgeInsets = divContainer.H;
        Expression expression12 = divContainer.I;
        DivEdgeInsets divEdgeInsets2 = divContainer.J;
        List list13 = divContainer.K;
        List list14 = divContainer.L;
        Expression expression13 = divContainer.M;
        Expression expression14 = divContainer.N;
        List list15 = divContainer.O;
        vjk vjkVar2 = divContainer.P;
        List list16 = divContainer.Q;
        DivTransform divTransform = divContainer.R;
        List list17 = divContainer.S;
        DivChangeTransition divChangeTransition = divContainer.T;
        DivAppearanceTransition divAppearanceTransition = divContainer.U;
        DivAppearanceTransition divAppearanceTransition2 = divContainer.V;
        List list18 = divContainer.W;
        List list19 = divContainer.X;
        List list20 = divContainer.Y;
        Expression expression15 = divContainer.Z;
        DivVisibilityAction divVisibilityAction = divContainer.a0;
        List list21 = divContainer.b0;
        DivSize divSize2 = divContainer.c0;
        divContainer.getClass();
        return new DivContainer(divAccessibility, v3kVar, pdkVar, list4, expression, expression2, expression3, list5, afkVar, list6, divBorder, expression4, expression5, expression6, expression7, expression8, list7, list2, arrayList, divFocus, list9, divSize, list10, list3, str2, divCollectionItemBuilder, expression9, list, expression10, divLayoutProvider, vjkVar, expression11, list12, divEdgeInsets, expression12, divEdgeInsets2, list13, list14, expression13, expression14, list15, vjkVar2, list16, divTransform, list17, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list18, list19, list20, expression15, divVisibilityAction, list21, divSize2);
    }

    @Override // defpackage.egk
    public final DivBorder A() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:495:0x07d2, code lost:
    
        if (r1 == null) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0772, code lost:
    
        if (r1 == null) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x072f, code lost:
    
        if (r1 == null) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x06ec, code lost:
    
        if (r1 == null) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0679, code lost:
    
        if (r1 == null) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0624, code lost:
    
        if (r1 == null) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x05cf, code lost:
    
        if (r1 == null) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0550, code lost:
    
        if (r1 == null) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x050d, code lost:
    
        if (r1 == null) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0498, code lost:
    
        if (r1 == null) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0407, code lost:
    
        if (r1 == null) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x038c, code lost:
    
        if (r1 == null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0349, code lost:
    
        if (r1 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x02fc, code lost:
    
        if (r1 == null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x02a7, code lost:
    
        if (r1 == null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0264, code lost:
    
        if (r1 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0221, code lost:
    
        if (r1 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x015e, code lost:
    
        if (r1 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0109, code lost:
    
        if (r1 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0076, code lost:
    
        if (r1 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(DivContainer divContainer, rvo rvoVar, rvo rvoVar2) {
        if (divContainer != null) {
            DivAccessibility divAccessibility = divContainer.a;
            DivAccessibility divAccessibility2 = this.a;
            if (divAccessibility2 != null ? divAccessibility2.a(divAccessibility, rvoVar, rvoVar2) : divAccessibility == null) {
                v3k v3kVar = divContainer.b;
                v3k v3kVar2 = this.b;
                if ((v3kVar2 != null ? v3kVar2.a(v3kVar, rvoVar, rvoVar2) : v3kVar == null) && this.c.a(divContainer.c, rvoVar, rvoVar2)) {
                    List list = divContainer.d;
                    List list2 = this.d;
                    if (list2 != null) {
                        if (list != null && list2.size() == list.size()) {
                            int i = 0;
                            for (Object obj : list2) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    scc.m();
                                    throw null;
                                }
                                if (!((v3k) obj).a((v3k) list.get(i), rvoVar, rvoVar2)) {
                                    break;
                                }
                                i = i2;
                            }
                            Expression expression = this.e;
                            DivAlignmentHorizontal divAlignmentHorizontal = expression != null ? (DivAlignmentHorizontal) expression.a(rvoVar) : null;
                            Expression expression2 = divContainer.e;
                            if (divAlignmentHorizontal == (expression2 != null ? (DivAlignmentHorizontal) expression2.a(rvoVar2) : null)) {
                                Expression expression3 = this.f;
                                DivAlignmentVertical divAlignmentVertical = expression3 != null ? (DivAlignmentVertical) expression3.a(rvoVar) : null;
                                Expression expression4 = divContainer.f;
                                if (divAlignmentVertical == (expression4 != null ? (DivAlignmentVertical) expression4.a(rvoVar2) : null) && ((Number) this.g.a(rvoVar)).doubleValue() == ((Number) divContainer.g.a(rvoVar2)).doubleValue()) {
                                    List list3 = divContainer.h;
                                    List list4 = this.h;
                                    if (list4 != null) {
                                        if (list3 != null && list4.size() == list3.size()) {
                                            int i3 = 0;
                                            for (Object obj2 : list4) {
                                                int i4 = i3 + 1;
                                                if (i3 < 0) {
                                                    scc.m();
                                                    throw null;
                                                }
                                                if (!((ydk) obj2).a((ydk) list3.get(i3), rvoVar, rvoVar2)) {
                                                    break;
                                                }
                                                i3 = i4;
                                            }
                                            afk afkVar = divContainer.i;
                                            afk afkVar2 = this.i;
                                            if (afkVar2 != null ? afkVar2.a(afkVar, rvoVar, rvoVar2) : afkVar == null) {
                                                List list5 = divContainer.j;
                                                List list6 = this.j;
                                                if (list6 != null) {
                                                    if (list5 != null && list6.size() == list5.size()) {
                                                        int i5 = 0;
                                                        for (Object obj3 : list6) {
                                                            int i6 = i5 + 1;
                                                            if (i5 < 0) {
                                                                scc.m();
                                                                throw null;
                                                            }
                                                            if (!((kfk) obj3).a((kfk) list5.get(i5), rvoVar, rvoVar2)) {
                                                                break;
                                                            }
                                                            i5 = i6;
                                                        }
                                                        DivBorder divBorder = divContainer.k;
                                                        DivBorder divBorder2 = this.k;
                                                        if ((divBorder2 != null ? divBorder2.a(divBorder, rvoVar, rvoVar2) : divBorder == null) && ((Boolean) this.l.a(rvoVar)).booleanValue() == ((Boolean) divContainer.l.a(rvoVar2)).booleanValue() && ((Boolean) this.m.a(rvoVar)).booleanValue() == ((Boolean) divContainer.m.a(rvoVar2)).booleanValue()) {
                                                            Expression expression5 = this.n;
                                                            Long l = expression5 != null ? (Long) expression5.a(rvoVar) : null;
                                                            Expression expression6 = divContainer.n;
                                                            if (jl40.l(l, expression6 != null ? (Long) expression6.a(rvoVar2) : null) && this.o.a(rvoVar) == divContainer.o.a(rvoVar2) && this.p.a(rvoVar) == divContainer.p.a(rvoVar2)) {
                                                                List list7 = divContainer.q;
                                                                List list8 = this.q;
                                                                if (list8 != null) {
                                                                    if (list7 != null && list8.size() == list7.size()) {
                                                                        int i7 = 0;
                                                                        for (Object obj4 : list8) {
                                                                            int i8 = i7 + 1;
                                                                            if (i7 < 0) {
                                                                                scc.m();
                                                                                throw null;
                                                                            }
                                                                            if (!((nnk) obj4).f((nnk) list7.get(i7), rvoVar, rvoVar2)) {
                                                                                break;
                                                                            }
                                                                            i7 = i8;
                                                                        }
                                                                        List list9 = divContainer.r;
                                                                        List list10 = this.r;
                                                                        if (list10 != null) {
                                                                            if (list9 != null && list10.size() == list9.size()) {
                                                                                int i9 = 0;
                                                                                for (Object obj5 : list10) {
                                                                                    int i10 = i9 + 1;
                                                                                    if (i9 < 0) {
                                                                                        scc.m();
                                                                                        throw null;
                                                                                    }
                                                                                    if (!((v3k) obj5).a((v3k) list9.get(i9), rvoVar, rvoVar2)) {
                                                                                        break;
                                                                                    }
                                                                                    i9 = i10;
                                                                                }
                                                                                List list11 = divContainer.s;
                                                                                List list12 = this.s;
                                                                                if (list12 != null) {
                                                                                    if (list11 != null && list12.size() == list11.size()) {
                                                                                        int i11 = 0;
                                                                                        for (Object obj6 : list12) {
                                                                                            int i12 = i11 + 1;
                                                                                            if (i11 < 0) {
                                                                                                scc.m();
                                                                                                throw null;
                                                                                            }
                                                                                            if (!((bpk) obj6).a((bpk) list11.get(i11))) {
                                                                                                break;
                                                                                            }
                                                                                            i11 = i12;
                                                                                        }
                                                                                        DivFocus divFocus = divContainer.t;
                                                                                        DivFocus divFocus2 = this.t;
                                                                                        if (divFocus2 != null ? divFocus2.a(divFocus, rvoVar, rvoVar2) : divFocus == null) {
                                                                                            List list13 = divContainer.u;
                                                                                            List list14 = this.u;
                                                                                            if (list14 != null) {
                                                                                                if (list13 != null && list14.size() == list13.size()) {
                                                                                                    int i13 = 0;
                                                                                                    for (Object obj7 : list14) {
                                                                                                        int i14 = i13 + 1;
                                                                                                        if (i13 < 0) {
                                                                                                            scc.m();
                                                                                                            throw null;
                                                                                                        }
                                                                                                        if (!((irk) obj7).a((irk) list13.get(i13))) {
                                                                                                            break;
                                                                                                        }
                                                                                                        i13 = i14;
                                                                                                    }
                                                                                                    if (this.v.a(divContainer.v, rvoVar, rvoVar2)) {
                                                                                                        List list15 = divContainer.w;
                                                                                                        List list16 = this.w;
                                                                                                        if (list16 != null) {
                                                                                                            if (list15 != null && list16.size() == list15.size()) {
                                                                                                                int i15 = 0;
                                                                                                                for (Object obj8 : list16) {
                                                                                                                    int i16 = i15 + 1;
                                                                                                                    if (i15 < 0) {
                                                                                                                        scc.m();
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    if (!((v3k) obj8).a((v3k) list15.get(i15), rvoVar, rvoVar2)) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    i15 = i16;
                                                                                                                }
                                                                                                                List list17 = divContainer.x;
                                                                                                                List list18 = this.x;
                                                                                                                if (list18 != null) {
                                                                                                                    if (list17 != null && list18.size() == list17.size()) {
                                                                                                                        int i17 = 0;
                                                                                                                        for (Object obj9 : list18) {
                                                                                                                            int i18 = i17 + 1;
                                                                                                                            if (i17 < 0) {
                                                                                                                                scc.m();
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            if (!((v3k) obj9).a((v3k) list17.get(i17), rvoVar, rvoVar2)) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i17 = i18;
                                                                                                                        }
                                                                                                                        if (jl40.l(this.y, divContainer.y)) {
                                                                                                                            DivCollectionItemBuilder divCollectionItemBuilder = divContainer.z;
                                                                                                                            DivCollectionItemBuilder divCollectionItemBuilder2 = this.z;
                                                                                                                            if ((divCollectionItemBuilder2 != null ? divCollectionItemBuilder2.a(divCollectionItemBuilder, rvoVar, rvoVar2) : divCollectionItemBuilder == null) && ((Number) this.A.a(rvoVar)).longValue() == ((Number) divContainer.A.a(rvoVar2)).longValue()) {
                                                                                                                                List list19 = divContainer.B;
                                                                                                                                List list20 = this.B;
                                                                                                                                if (list20 != null) {
                                                                                                                                    if (list19 != null && list20.size() == list19.size()) {
                                                                                                                                        int i19 = 0;
                                                                                                                                        for (Object obj10 : list20) {
                                                                                                                                            int i20 = i19 + 1;
                                                                                                                                            if (i19 < 0) {
                                                                                                                                                scc.m();
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            if (!((m3k) obj10).a((m3k) list19.get(i19), rvoVar, rvoVar2)) {
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i19 = i20;
                                                                                                                                        }
                                                                                                                                        if (this.C.a(rvoVar) == divContainer.C.a(rvoVar2)) {
                                                                                                                                            DivLayoutProvider divLayoutProvider = divContainer.D;
                                                                                                                                            DivLayoutProvider divLayoutProvider2 = this.D;
                                                                                                                                            if (divLayoutProvider2 != null ? divLayoutProvider2.a(divLayoutProvider) : divLayoutProvider == null) {
                                                                                                                                                vjk vjkVar = divContainer.E;
                                                                                                                                                vjk vjkVar2 = this.E;
                                                                                                                                                if ((vjkVar2 != null ? vjkVar2.a(vjkVar, rvoVar, rvoVar2) : vjkVar == null) && ((Number) this.F.a(rvoVar)).longValue() == ((Number) divContainer.F.a(rvoVar2)).longValue()) {
                                                                                                                                                    List list21 = divContainer.G;
                                                                                                                                                    List list22 = this.G;
                                                                                                                                                    if (list22 != null) {
                                                                                                                                                        if (list21 != null && list22.size() == list21.size()) {
                                                                                                                                                            int i21 = 0;
                                                                                                                                                            for (Object obj11 : list22) {
                                                                                                                                                                int i22 = i21 + 1;
                                                                                                                                                                if (i21 < 0) {
                                                                                                                                                                    scc.m();
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (!((v3k) obj11).a((v3k) list21.get(i21), rvoVar, rvoVar2)) {
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                i21 = i22;
                                                                                                                                                            }
                                                                                                                                                            DivEdgeInsets divEdgeInsets = divContainer.H;
                                                                                                                                                            DivEdgeInsets divEdgeInsets2 = this.H;
                                                                                                                                                            if ((divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) && this.I.a(rvoVar) == divContainer.I.a(rvoVar2)) {
                                                                                                                                                                DivEdgeInsets divEdgeInsets3 = divContainer.J;
                                                                                                                                                                DivEdgeInsets divEdgeInsets4 = this.J;
                                                                                                                                                                if (divEdgeInsets4 != null ? divEdgeInsets4.a(divEdgeInsets3, rvoVar, rvoVar2) : divEdgeInsets3 == null) {
                                                                                                                                                                    List list23 = divContainer.K;
                                                                                                                                                                    List list24 = this.K;
                                                                                                                                                                    if (list24 != null) {
                                                                                                                                                                        if (list23 != null && list24.size() == list23.size()) {
                                                                                                                                                                            int i23 = 0;
                                                                                                                                                                            for (Object obj12 : list24) {
                                                                                                                                                                                int i24 = i23 + 1;
                                                                                                                                                                                if (i23 < 0) {
                                                                                                                                                                                    scc.m();
                                                                                                                                                                                    throw null;
                                                                                                                                                                                }
                                                                                                                                                                                if (!((v3k) obj12).a((v3k) list23.get(i23), rvoVar, rvoVar2)) {
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                i23 = i24;
                                                                                                                                                                            }
                                                                                                                                                                            List list25 = divContainer.L;
                                                                                                                                                                            List list26 = this.L;
                                                                                                                                                                            if (list26 != null) {
                                                                                                                                                                                if (list25 != null && list26.size() == list25.size()) {
                                                                                                                                                                                    int i25 = 0;
                                                                                                                                                                                    for (Object obj13 : list26) {
                                                                                                                                                                                        int i26 = i25 + 1;
                                                                                                                                                                                        if (i25 < 0) {
                                                                                                                                                                                            scc.m();
                                                                                                                                                                                            throw null;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (!((v3k) obj13).a((v3k) list25.get(i25), rvoVar, rvoVar2)) {
                                                                                                                                                                                            break;
                                                                                                                                                                                        }
                                                                                                                                                                                        i25 = i26;
                                                                                                                                                                                    }
                                                                                                                                                                                    Expression expression7 = this.M;
                                                                                                                                                                                    String str = expression7 != null ? (String) expression7.a(rvoVar) : null;
                                                                                                                                                                                    Expression expression8 = divContainer.M;
                                                                                                                                                                                    if (jl40.l(str, expression8 != null ? (String) expression8.a(rvoVar2) : null)) {
                                                                                                                                                                                        Expression expression9 = this.N;
                                                                                                                                                                                        Long l2 = expression9 != null ? (Long) expression9.a(rvoVar) : null;
                                                                                                                                                                                        Expression expression10 = divContainer.N;
                                                                                                                                                                                        if (jl40.l(l2, expression10 != null ? (Long) expression10.a(rvoVar2) : null)) {
                                                                                                                                                                                            List list27 = divContainer.O;
                                                                                                                                                                                            List list28 = this.O;
                                                                                                                                                                                            if (list28 != null) {
                                                                                                                                                                                                if (list27 != null && list28.size() == list27.size()) {
                                                                                                                                                                                                    int i27 = 0;
                                                                                                                                                                                                    for (Object obj14 : list28) {
                                                                                                                                                                                                        int i28 = i27 + 1;
                                                                                                                                                                                                        if (i27 < 0) {
                                                                                                                                                                                                            scc.m();
                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (!((v3k) obj14).a((v3k) list27.get(i27), rvoVar, rvoVar2)) {
                                                                                                                                                                                                            break;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        i27 = i28;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    vjk vjkVar3 = divContainer.P;
                                                                                                                                                                                                    vjk vjkVar4 = this.P;
                                                                                                                                                                                                    if (vjkVar4 != null ? vjkVar4.a(vjkVar3, rvoVar, rvoVar2) : vjkVar3 == null) {
                                                                                                                                                                                                        List list29 = divContainer.Q;
                                                                                                                                                                                                        List list30 = this.Q;
                                                                                                                                                                                                        if (list30 != null) {
                                                                                                                                                                                                            if (list29 != null && list30.size() == list29.size()) {
                                                                                                                                                                                                                int i29 = 0;
                                                                                                                                                                                                                for (Object obj15 : list30) {
                                                                                                                                                                                                                    int i30 = i29 + 1;
                                                                                                                                                                                                                    if (i29 < 0) {
                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (!((gil) obj15).a((gil) list29.get(i29), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    i29 = i30;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                DivTransform divTransform = divContainer.R;
                                                                                                                                                                                                                DivTransform divTransform2 = this.R;
                                                                                                                                                                                                                if (divTransform2 != null ? divTransform2.a(divTransform, rvoVar, rvoVar2) : divTransform == null) {
                                                                                                                                                                                                                    List list31 = divContainer.S;
                                                                                                                                                                                                                    List list32 = this.S;
                                                                                                                                                                                                                    if (list32 != null) {
                                                                                                                                                                                                                        if (list31 != null && list32.size() == list31.size()) {
                                                                                                                                                                                                                            int i31 = 0;
                                                                                                                                                                                                                            for (Object obj16 : list32) {
                                                                                                                                                                                                                                int i32 = i31 + 1;
                                                                                                                                                                                                                                if (i31 < 0) {
                                                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (!((xjl) obj16).a((xjl) list31.get(i31), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                i31 = i32;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            DivChangeTransition divChangeTransition = divContainer.T;
                                                                                                                                                                                                                            DivChangeTransition divChangeTransition2 = this.T;
                                                                                                                                                                                                                            if (divChangeTransition2 != null ? divChangeTransition2.a(divChangeTransition, rvoVar, rvoVar2) : divChangeTransition == null) {
                                                                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition = divContainer.U;
                                                                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition2 = this.U;
                                                                                                                                                                                                                                if (divAppearanceTransition2 != null ? divAppearanceTransition2.a(divAppearanceTransition, rvoVar, rvoVar2) : divAppearanceTransition == null) {
                                                                                                                                                                                                                                    DivAppearanceTransition divAppearanceTransition3 = divContainer.V;
                                                                                                                                                                                                                                    DivAppearanceTransition divAppearanceTransition4 = this.V;
                                                                                                                                                                                                                                    if (divAppearanceTransition4 != null ? divAppearanceTransition4.a(divAppearanceTransition3, rvoVar, rvoVar2) : divAppearanceTransition3 == null) {
                                                                                                                                                                                                                                        List list33 = divContainer.W;
                                                                                                                                                                                                                                        List list34 = this.W;
                                                                                                                                                                                                                                        if (list34 != null) {
                                                                                                                                                                                                                                            if (list33 != null && list34.size() == list33.size()) {
                                                                                                                                                                                                                                                int i33 = 0;
                                                                                                                                                                                                                                                for (Object obj17 : list34) {
                                                                                                                                                                                                                                                    int i34 = i33 + 1;
                                                                                                                                                                                                                                                    if (i33 < 0) {
                                                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    if (((DivTransitionTrigger) obj17) != ((DivTransitionTrigger) list33.get(i33))) {
                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    i33 = i34;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                List list35 = divContainer.X;
                                                                                                                                                                                                                                                List list36 = this.X;
                                                                                                                                                                                                                                                if (list36 != null) {
                                                                                                                                                                                                                                                    if (list35 != null && list36.size() == list35.size()) {
                                                                                                                                                                                                                                                        int i35 = 0;
                                                                                                                                                                                                                                                        for (Object obj18 : list36) {
                                                                                                                                                                                                                                                            int i36 = i35 + 1;
                                                                                                                                                                                                                                                            if (i35 < 0) {
                                                                                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            if (!((lll) obj18).a((lll) list35.get(i35), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            i35 = i36;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        List list37 = divContainer.Y;
                                                                                                                                                                                                                                                        List list38 = this.Y;
                                                                                                                                                                                                                                                        if (list38 != null) {
                                                                                                                                                                                                                                                            if (list37 != null && list38.size() == list37.size()) {
                                                                                                                                                                                                                                                                int i37 = 0;
                                                                                                                                                                                                                                                                for (Object obj19 : list38) {
                                                                                                                                                                                                                                                                    int i38 = i37 + 1;
                                                                                                                                                                                                                                                                    if (i37 < 0) {
                                                                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    if (!((c3) obj19).a((c3) list37.get(i37), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    i37 = i38;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                if (this.Z.a(rvoVar) == divContainer.Z.a(rvoVar2)) {
                                                                                                                                                                                                                                                                    DivVisibilityAction divVisibilityAction = divContainer.a0;
                                                                                                                                                                                                                                                                    DivVisibilityAction divVisibilityAction2 = this.a0;
                                                                                                                                                                                                                                                                    if (divVisibilityAction2 != null ? divVisibilityAction2.f(divVisibilityAction, rvoVar, rvoVar2) : divVisibilityAction == null) {
                                                                                                                                                                                                                                                                        List list39 = divContainer.b0;
                                                                                                                                                                                                                                                                        List list40 = this.b0;
                                                                                                                                                                                                                                                                        if (list40 != null) {
                                                                                                                                                                                                                                                                            if (list39 != null && list40.size() == list39.size()) {
                                                                                                                                                                                                                                                                                int i39 = 0;
                                                                                                                                                                                                                                                                                for (Object obj20 : list40) {
                                                                                                                                                                                                                                                                                    int i40 = i39 + 1;
                                                                                                                                                                                                                                                                                    if (i39 < 0) {
                                                                                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    if (!((DivVisibilityAction) obj20).f((DivVisibilityAction) list39.get(i39), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    i39 = i40;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                if (this.c0.a(divContainer.c0, rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                                    return true;
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
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int D() {
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
        int i17;
        Integer num = this.d0;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(DivContainer.class).hashCode();
        int i18 = 0;
        DivAccessibility divAccessibility = this.a;
        int b = hashCode + (divAccessibility != null ? divAccessibility.b() : 0);
        v3k v3kVar = this.b;
        int b2 = this.c.b() + b + (v3kVar != null ? v3kVar.b() : 0);
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((v3k) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i19 = b2 + i;
        Expression expression = this.e;
        int hashCode2 = i19 + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.f;
        int hashCode3 = this.g.hashCode() + hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        List list2 = this.h;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((ydk) it2.next()).b();
            }
        } else {
            i2 = 0;
        }
        int i20 = hashCode3 + i2;
        afk afkVar = this.i;
        int b3 = i20 + (afkVar != null ? afkVar.b() : 0);
        List list3 = this.j;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((kfk) it3.next()).b();
            }
        } else {
            i3 = 0;
        }
        int i21 = b3 + i3;
        DivBorder divBorder = this.k;
        int hashCode4 = this.m.hashCode() + this.l.hashCode() + i21 + (divBorder != null ? divBorder.b() : 0);
        Expression expression3 = this.n;
        int hashCode5 = this.p.hashCode() + this.o.hashCode() + hashCode4 + (expression3 != null ? expression3.hashCode() : 0);
        List list4 = this.q;
        if (list4 != null) {
            Iterator it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((nnk) it4.next()).g();
            }
        } else {
            i4 = 0;
        }
        int i22 = hashCode5 + i4;
        List list5 = this.r;
        if (list5 != null) {
            Iterator it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((v3k) it5.next()).b();
            }
        } else {
            i5 = 0;
        }
        int i23 = i22 + i5;
        List list6 = this.s;
        if (list6 != null) {
            Iterator it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((bpk) it6.next()).b();
            }
        } else {
            i6 = 0;
        }
        int i24 = i23 + i6;
        DivFocus divFocus = this.t;
        int b4 = i24 + (divFocus != null ? divFocus.b() : 0);
        List list7 = this.u;
        if (list7 != null) {
            Iterator it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((irk) it7.next()).b();
            }
        } else {
            i7 = 0;
        }
        int b5 = this.v.b() + b4 + i7;
        List list8 = this.w;
        if (list8 != null) {
            Iterator it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((v3k) it8.next()).b();
            }
        } else {
            i8 = 0;
        }
        int i25 = b5 + i8;
        List list9 = this.x;
        if (list9 != null) {
            Iterator it9 = list9.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((v3k) it9.next()).b();
            }
        } else {
            i9 = 0;
        }
        int i26 = i25 + i9;
        String str = this.y;
        int hashCode6 = i26 + (str != null ? str.hashCode() : 0);
        DivCollectionItemBuilder divCollectionItemBuilder = this.z;
        int hashCode7 = this.C.hashCode() + this.A.hashCode() + hashCode6 + (divCollectionItemBuilder != null ? divCollectionItemBuilder.b() : 0);
        DivLayoutProvider divLayoutProvider = this.D;
        int b6 = hashCode7 + (divLayoutProvider != null ? divLayoutProvider.b() : 0);
        vjk vjkVar = this.E;
        int hashCode8 = this.F.hashCode() + b6 + (vjkVar != null ? vjkVar.b() : 0);
        List list10 = this.G;
        if (list10 != null) {
            Iterator it10 = list10.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((v3k) it10.next()).b();
            }
        } else {
            i10 = 0;
        }
        int i27 = hashCode8 + i10;
        DivEdgeInsets divEdgeInsets = this.H;
        int hashCode9 = this.I.hashCode() + i27 + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        DivEdgeInsets divEdgeInsets2 = this.J;
        int b7 = hashCode9 + (divEdgeInsets2 != null ? divEdgeInsets2.b() : 0);
        List list11 = this.K;
        if (list11 != null) {
            Iterator it11 = list11.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((v3k) it11.next()).b();
            }
        } else {
            i11 = 0;
        }
        int i28 = b7 + i11;
        List list12 = this.L;
        if (list12 != null) {
            Iterator it12 = list12.iterator();
            i12 = 0;
            while (it12.hasNext()) {
                i12 += ((v3k) it12.next()).b();
            }
        } else {
            i12 = 0;
        }
        int i29 = i28 + i12;
        Expression expression4 = this.M;
        int hashCode10 = i29 + (expression4 != null ? expression4.hashCode() : 0);
        Expression expression5 = this.N;
        int hashCode11 = hashCode10 + (expression5 != null ? expression5.hashCode() : 0);
        List list13 = this.O;
        if (list13 != null) {
            Iterator it13 = list13.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((v3k) it13.next()).b();
            }
        } else {
            i13 = 0;
        }
        int i30 = hashCode11 + i13;
        vjk vjkVar2 = this.P;
        int b8 = i30 + (vjkVar2 != null ? vjkVar2.b() : 0);
        List list14 = this.Q;
        if (list14 != null) {
            Iterator it14 = list14.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((gil) it14.next()).b();
            }
        } else {
            i14 = 0;
        }
        int i31 = b8 + i14;
        DivTransform divTransform = this.R;
        int b9 = i31 + (divTransform != null ? divTransform.b() : 0);
        List list15 = this.S;
        if (list15 != null) {
            Iterator it15 = list15.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((xjl) it15.next()).b();
            }
        } else {
            i15 = 0;
        }
        int i32 = b9 + i15;
        DivChangeTransition divChangeTransition = this.T;
        int b10 = i32 + (divChangeTransition != null ? divChangeTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition = this.U;
        int b11 = b10 + (divAppearanceTransition != null ? divAppearanceTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition2 = this.V;
        int b12 = b11 + (divAppearanceTransition2 != null ? divAppearanceTransition2.b() : 0);
        List list16 = this.W;
        int hashCode12 = b12 + (list16 != null ? list16.hashCode() : 0);
        List list17 = this.X;
        if (list17 != null) {
            Iterator it16 = list17.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((lll) it16.next()).b();
            }
        } else {
            i16 = 0;
        }
        int i33 = hashCode12 + i16;
        List list18 = this.Y;
        if (list18 != null) {
            Iterator it17 = list18.iterator();
            i17 = 0;
            while (it17.hasNext()) {
                i17 += ((c3) it17.next()).b();
            }
        } else {
            i17 = 0;
        }
        int hashCode13 = this.Z.hashCode() + i33 + i17;
        DivVisibilityAction divVisibilityAction = this.a0;
        int g = hashCode13 + (divVisibilityAction != null ? divVisibilityAction.g() : 0);
        List list19 = this.b0;
        if (list19 != null) {
            Iterator it18 = list19.iterator();
            while (it18.hasNext()) {
                i18 += ((DivVisibilityAction) it18.next()).g();
            }
        }
        int b13 = this.c0.b() + g + i18;
        this.d0 = Integer.valueOf(b13);
        return b13;
    }

    @Override // defpackage.egk
    public final Expression a() {
        return this.g;
    }

    @Override // defpackage.egk
    public final List b() {
        return this.b0;
    }

    @Override // defpackage.egk
    public final Expression c() {
        return this.n;
    }

    @Override // defpackage.egk
    public final List d() {
        return this.Y;
    }

    @Override // defpackage.egk
    public final DivEdgeInsets e() {
        return this.H;
    }

    @Override // defpackage.egk
    public final Expression f() {
        return this.N;
    }

    @Override // defpackage.egk
    public final Expression g() {
        return this.M;
    }

    @Override // defpackage.egk
    public final List getBackground() {
        return this.j;
    }

    @Override // defpackage.egk
    public final List getExtensions() {
        return this.s;
    }

    @Override // defpackage.egk
    public final DivSize getHeight() {
        return this.v;
    }

    @Override // defpackage.egk
    public final String getId() {
        return this.y;
    }

    @Override // defpackage.egk
    public final Expression getVisibility() {
        return this.Z;
    }

    @Override // defpackage.egk
    public final DivSize getWidth() {
        return this.c0;
    }

    @Override // defpackage.egk
    public final Expression h() {
        return this.e;
    }

    @Override // defpackage.egk
    public final List i() {
        return this.Q;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition j() {
        return this.V;
    }

    @Override // defpackage.egk
    public final DivChangeTransition k() {
        return this.T;
    }

    @Override // defpackage.egk
    public final List l() {
        return this.q;
    }

    @Override // defpackage.egk
    public final DivTransform m() {
        return this.R;
    }

    @Override // defpackage.egk
    public final List n() {
        return this.W;
    }

    @Override // defpackage.egk
    public final Expression o() {
        return this.f;
    }

    @Override // defpackage.egk
    public final DivFocus p() {
        return this.t;
    }

    @Override // defpackage.egk
    public final DivAccessibility q() {
        return this.a;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((t) ft6.b.v2.getValue()).b(ft6.a, this);
    }

    @Override // defpackage.egk
    public final DivEdgeInsets s() {
        return this.J;
    }

    @Override // defpackage.egk
    public final List t() {
        return this.O;
    }

    @Override // defpackage.egk
    public final DivLayoutProvider u() {
        return this.D;
    }

    @Override // defpackage.egk
    public final List v() {
        return this.X;
    }

    @Override // defpackage.egk
    public final DivVisibilityAction w() {
        return this.a0;
    }

    @Override // defpackage.egk
    public final List x() {
        return this.u;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition y() {
        return this.U;
    }

    @Override // defpackage.egk
    public final List z() {
        return this.h;
    }

    public DivContainer() {
        this(null, null, f0, null, null, null, g0, null, null, null, null, h0, i0, null, j0, k0, null, null, null, null, null, l0, null, null, null, null, m0, null, n0, null, null, o0, null, null, p0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, q0, null, null, r0);
    }
}
