package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation$Name;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.c3;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes.dex */
public final class hsk implements c4x, egk {
    public final List A;
    public final DivEdgeInsets B;
    public final DivEdgeInsets C;
    public final List D;
    public final List E;
    public final Expression F;
    public final Expression G;
    public final List H;
    public final List I;
    public final DivTransform J;
    public final List K;
    public final DivChangeTransition L;
    public final DivAppearanceTransition M;
    public final DivAppearanceTransition N;
    public final List O;
    public final List P;
    public final List Q;
    public final Expression R;
    public final DivVisibilityAction S;
    public final List T;
    public final DivSize U;
    public Integer V;
    public Integer W;
    public final DivAccessibility a;
    public final v3k b;
    public final pdk c;
    public final List d;
    public final Expression e;
    public final Expression f;
    public final Expression g;
    public final List h;
    public final List i;
    public final DivBorder j;
    public final Expression k;
    public final Expression l;
    public final Expression m;
    public final Expression n;
    public final Expression o;
    public final List p;
    public final List q;
    public final List r;
    public final DivFocus s;
    public final List t;
    public final DivSize u;
    public final List v;
    public final List w;
    public final String x;
    public final List y;
    public final DivLayoutProvider z;

    static {
        ngd0.m(100L);
        ngd0.m(Double.valueOf(0.6d));
        ngd0.m(DivAnimation$Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        ngd0.m(valueOf);
        ngd0.m(valueOf);
        ngd0.m(Boolean.TRUE);
        ngd0.m(DivAlignmentHorizontal.START);
        ngd0.m(DivAlignmentVertical.TOP);
        ngd0.m(DivVisibility.VISIBLE);
    }

    public hsk(DivAccessibility divAccessibility, v3k v3kVar, pdk pdkVar, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, List list4, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str, List list10, DivLayoutProvider divLayoutProvider, List list11, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, List list12, List list13, Expression expression9, Expression expression10, List list14, List list15, DivTransform divTransform, List list16, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list17, List list18, List list19, Expression expression11, DivVisibilityAction divVisibilityAction, List list20, DivSize divSize2) {
        this.a = divAccessibility;
        this.b = v3kVar;
        this.c = pdkVar;
        this.d = list;
        this.e = expression;
        this.f = expression2;
        this.g = expression3;
        this.h = list2;
        this.i = list3;
        this.j = divBorder;
        this.k = expression4;
        this.l = expression5;
        this.m = expression6;
        this.n = expression7;
        this.o = expression8;
        this.p = list4;
        this.q = list5;
        this.r = list6;
        this.s = divFocus;
        this.t = list7;
        this.u = divSize;
        this.v = list8;
        this.w = list9;
        this.x = str;
        this.y = list10;
        this.z = divLayoutProvider;
        this.A = list11;
        this.B = divEdgeInsets;
        this.C = divEdgeInsets2;
        this.D = list12;
        this.E = list13;
        this.F = expression9;
        this.G = expression10;
        this.H = list14;
        this.I = list15;
        this.J = divTransform;
        this.K = list16;
        this.L = divChangeTransition;
        this.M = divAppearanceTransition;
        this.N = divAppearanceTransition2;
        this.O = list17;
        this.P = list18;
        this.Q = list19;
        this.R = expression11;
        this.S = divVisibilityAction;
        this.T = list20;
        this.U = divSize2;
    }

    public static hsk B(hsk hskVar, String str, List list, int i) {
        List list2;
        DivAccessibility divAccessibility = hskVar.a;
        v3k v3kVar = hskVar.b;
        pdk pdkVar = hskVar.c;
        List list3 = hskVar.d;
        Expression expression = hskVar.e;
        Expression expression2 = hskVar.f;
        Expression expression3 = hskVar.g;
        List list4 = hskVar.h;
        List list5 = hskVar.i;
        DivBorder divBorder = hskVar.j;
        Expression expression4 = hskVar.k;
        Expression expression5 = hskVar.l;
        Expression expression6 = hskVar.m;
        Expression expression7 = hskVar.n;
        Expression expression8 = hskVar.o;
        List list6 = hskVar.p;
        List list7 = hskVar.q;
        List list8 = hskVar.r;
        DivFocus divFocus = hskVar.s;
        List list9 = hskVar.t;
        DivSize divSize = hskVar.u;
        List list10 = hskVar.v;
        List list11 = hskVar.w;
        if ((i & SelfTester_JCP.ENCRYPT_CNT) != 0) {
            list2 = list11;
            str = hskVar.x;
        } else {
            list2 = list11;
        }
        DivLayoutProvider divLayoutProvider = hskVar.z;
        List list12 = hskVar.A;
        DivEdgeInsets divEdgeInsets = hskVar.B;
        DivEdgeInsets divEdgeInsets2 = hskVar.C;
        List list13 = hskVar.D;
        List list14 = hskVar.E;
        Expression expression9 = hskVar.F;
        Expression expression10 = hskVar.G;
        List list15 = hskVar.H;
        List list16 = hskVar.I;
        DivTransform divTransform = hskVar.J;
        List list17 = hskVar.K;
        DivChangeTransition divChangeTransition = hskVar.L;
        DivAppearanceTransition divAppearanceTransition = hskVar.M;
        DivAppearanceTransition divAppearanceTransition2 = hskVar.N;
        List list18 = hskVar.O;
        List list19 = hskVar.P;
        List list20 = hskVar.Q;
        Expression expression11 = hskVar.R;
        DivVisibilityAction divVisibilityAction = hskVar.S;
        List list21 = hskVar.T;
        DivSize divSize2 = hskVar.U;
        hskVar.getClass();
        return new hsk(divAccessibility, v3kVar, pdkVar, list3, expression, expression2, expression3, list4, list5, divBorder, expression4, expression5, expression6, expression7, expression8, list6, list7, list8, divFocus, list9, divSize, list10, list2, str, list, divLayoutProvider, list12, divEdgeInsets, divEdgeInsets2, list13, list14, expression9, expression10, list15, list16, divTransform, list17, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list18, list19, list20, expression11, divVisibilityAction, list21, divSize2);
    }

    @Override // defpackage.egk
    public final DivBorder A() {
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:471:0x0738, code lost:
    
        if (r1 == null) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x06d8, code lost:
    
        if (r1 == null) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0695, code lost:
    
        if (r1 == null) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0652, code lost:
    
        if (r1 == null) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x05df, code lost:
    
        if (r1 == null) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x058a, code lost:
    
        if (r1 == null) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0547, code lost:
    
        if (r1 == null) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x04c8, code lost:
    
        if (r1 == null) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0485, code lost:
    
        if (r1 == null) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x041e, code lost:
    
        if (r1 == null) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x03c9, code lost:
    
        if (r1 == null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x037c, code lost:
    
        if (r1 == null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0339, code lost:
    
        if (r1 == null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x02ec, code lost:
    
        if (r1 == null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0297, code lost:
    
        if (r1 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0254, code lost:
    
        if (r1 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0211, code lost:
    
        if (r1 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x014c, code lost:
    
        if (r1 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0109, code lost:
    
        if (r1 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0076, code lost:
    
        if (r1 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(hsk hskVar, rvo rvoVar, rvo rvoVar2) {
        if (hskVar != null) {
            DivAccessibility divAccessibility = hskVar.a;
            DivAccessibility divAccessibility2 = this.a;
            if (divAccessibility2 != null ? divAccessibility2.a(divAccessibility, rvoVar, rvoVar2) : divAccessibility == null) {
                v3k v3kVar = hskVar.b;
                v3k v3kVar2 = this.b;
                if ((v3kVar2 != null ? v3kVar2.a(v3kVar, rvoVar, rvoVar2) : v3kVar == null) && this.c.a(hskVar.c, rvoVar, rvoVar2)) {
                    List list = hskVar.d;
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
                            Expression expression2 = hskVar.e;
                            if (divAlignmentHorizontal == (expression2 != null ? (DivAlignmentHorizontal) expression2.a(rvoVar2) : null)) {
                                Expression expression3 = this.f;
                                DivAlignmentVertical divAlignmentVertical = expression3 != null ? (DivAlignmentVertical) expression3.a(rvoVar) : null;
                                Expression expression4 = hskVar.f;
                                if (divAlignmentVertical == (expression4 != null ? (DivAlignmentVertical) expression4.a(rvoVar2) : null) && ((Number) this.g.a(rvoVar)).doubleValue() == ((Number) hskVar.g.a(rvoVar2)).doubleValue()) {
                                    List list3 = hskVar.h;
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
                                            List list5 = hskVar.i;
                                            List list6 = this.i;
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
                                                    DivBorder divBorder = hskVar.j;
                                                    DivBorder divBorder2 = this.j;
                                                    if ((divBorder2 != null ? divBorder2.a(divBorder, rvoVar, rvoVar2) : divBorder == null) && ((Boolean) this.k.a(rvoVar)).booleanValue() == ((Boolean) hskVar.k.a(rvoVar2)).booleanValue() && ((Number) this.l.a(rvoVar)).longValue() == ((Number) hskVar.l.a(rvoVar2)).longValue()) {
                                                        Expression expression5 = this.m;
                                                        Long l = expression5 != null ? (Long) expression5.a(rvoVar) : null;
                                                        Expression expression6 = hskVar.m;
                                                        if (jl40.l(l, expression6 != null ? (Long) expression6.a(rvoVar2) : null) && this.n.a(rvoVar) == hskVar.n.a(rvoVar2) && this.o.a(rvoVar) == hskVar.o.a(rvoVar2)) {
                                                            List list7 = hskVar.p;
                                                            List list8 = this.p;
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
                                                                    List list9 = hskVar.q;
                                                                    List list10 = this.q;
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
                                                                            List list11 = hskVar.r;
                                                                            List list12 = this.r;
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
                                                                                    DivFocus divFocus = hskVar.s;
                                                                                    DivFocus divFocus2 = this.s;
                                                                                    if (divFocus2 != null ? divFocus2.a(divFocus, rvoVar, rvoVar2) : divFocus == null) {
                                                                                        List list13 = hskVar.t;
                                                                                        List list14 = this.t;
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
                                                                                                if (this.u.a(hskVar.u, rvoVar, rvoVar2)) {
                                                                                                    List list15 = hskVar.v;
                                                                                                    List list16 = this.v;
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
                                                                                                            List list17 = hskVar.w;
                                                                                                            List list18 = this.w;
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
                                                                                                                    if (jl40.l(this.x, hskVar.x)) {
                                                                                                                        List list19 = hskVar.y;
                                                                                                                        List list20 = this.y;
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
                                                                                                                                DivLayoutProvider divLayoutProvider = hskVar.z;
                                                                                                                                DivLayoutProvider divLayoutProvider2 = this.z;
                                                                                                                                if (divLayoutProvider2 != null ? divLayoutProvider2.a(divLayoutProvider) : divLayoutProvider == null) {
                                                                                                                                    List list21 = hskVar.A;
                                                                                                                                    List list22 = this.A;
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
                                                                                                                                            DivEdgeInsets divEdgeInsets = hskVar.B;
                                                                                                                                            DivEdgeInsets divEdgeInsets2 = this.B;
                                                                                                                                            if (divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) {
                                                                                                                                                DivEdgeInsets divEdgeInsets3 = hskVar.C;
                                                                                                                                                DivEdgeInsets divEdgeInsets4 = this.C;
                                                                                                                                                if (divEdgeInsets4 != null ? divEdgeInsets4.a(divEdgeInsets3, rvoVar, rvoVar2) : divEdgeInsets3 == null) {
                                                                                                                                                    List list23 = hskVar.D;
                                                                                                                                                    List list24 = this.D;
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
                                                                                                                                                            List list25 = hskVar.E;
                                                                                                                                                            List list26 = this.E;
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
                                                                                                                                                                    Expression expression7 = this.F;
                                                                                                                                                                    String str = expression7 != null ? (String) expression7.a(rvoVar) : null;
                                                                                                                                                                    Expression expression8 = hskVar.F;
                                                                                                                                                                    if (jl40.l(str, expression8 != null ? (String) expression8.a(rvoVar2) : null)) {
                                                                                                                                                                        Expression expression9 = this.G;
                                                                                                                                                                        Long l2 = expression9 != null ? (Long) expression9.a(rvoVar) : null;
                                                                                                                                                                        Expression expression10 = hskVar.G;
                                                                                                                                                                        if (jl40.l(l2, expression10 != null ? (Long) expression10.a(rvoVar2) : null)) {
                                                                                                                                                                            List list27 = hskVar.H;
                                                                                                                                                                            List list28 = this.H;
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
                                                                                                                                                                                    List list29 = hskVar.I;
                                                                                                                                                                                    List list30 = this.I;
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
                                                                                                                                                                                            DivTransform divTransform = hskVar.J;
                                                                                                                                                                                            DivTransform divTransform2 = this.J;
                                                                                                                                                                                            if (divTransform2 != null ? divTransform2.a(divTransform, rvoVar, rvoVar2) : divTransform == null) {
                                                                                                                                                                                                List list31 = hskVar.K;
                                                                                                                                                                                                List list32 = this.K;
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
                                                                                                                                                                                                        DivChangeTransition divChangeTransition = hskVar.L;
                                                                                                                                                                                                        DivChangeTransition divChangeTransition2 = this.L;
                                                                                                                                                                                                        if (divChangeTransition2 != null ? divChangeTransition2.a(divChangeTransition, rvoVar, rvoVar2) : divChangeTransition == null) {
                                                                                                                                                                                                            DivAppearanceTransition divAppearanceTransition = hskVar.M;
                                                                                                                                                                                                            DivAppearanceTransition divAppearanceTransition2 = this.M;
                                                                                                                                                                                                            if (divAppearanceTransition2 != null ? divAppearanceTransition2.a(divAppearanceTransition, rvoVar, rvoVar2) : divAppearanceTransition == null) {
                                                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition3 = hskVar.N;
                                                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition4 = this.N;
                                                                                                                                                                                                                if (divAppearanceTransition4 != null ? divAppearanceTransition4.a(divAppearanceTransition3, rvoVar, rvoVar2) : divAppearanceTransition3 == null) {
                                                                                                                                                                                                                    List list33 = hskVar.O;
                                                                                                                                                                                                                    List list34 = this.O;
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
                                                                                                                                                                                                                            List list35 = hskVar.P;
                                                                                                                                                                                                                            List list36 = this.P;
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
                                                                                                                                                                                                                                    List list37 = hskVar.Q;
                                                                                                                                                                                                                                    List list38 = this.Q;
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
                                                                                                                                                                                                                                            if (this.R.a(rvoVar) == hskVar.R.a(rvoVar2)) {
                                                                                                                                                                                                                                                DivVisibilityAction divVisibilityAction = hskVar.S;
                                                                                                                                                                                                                                                DivVisibilityAction divVisibilityAction2 = this.S;
                                                                                                                                                                                                                                                if (divVisibilityAction2 != null ? divVisibilityAction2.f(divVisibilityAction, rvoVar, rvoVar2) : divVisibilityAction == null) {
                                                                                                                                                                                                                                                    List list39 = hskVar.T;
                                                                                                                                                                                                                                                    List list40 = this.T;
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
                                                                                                                                                                                                                                                            if (this.U.a(hskVar.U, rvoVar, rvoVar2)) {
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
        Integer num = this.V;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(hsk.class).hashCode();
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
        List list3 = this.i;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((kfk) it3.next()).b();
            }
        } else {
            i3 = 0;
        }
        int i21 = i20 + i3;
        DivBorder divBorder = this.j;
        int hashCode4 = this.l.hashCode() + this.k.hashCode() + i21 + (divBorder != null ? divBorder.b() : 0);
        Expression expression3 = this.m;
        int hashCode5 = this.o.hashCode() + this.n.hashCode() + hashCode4 + (expression3 != null ? expression3.hashCode() : 0);
        List list4 = this.p;
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
        List list5 = this.q;
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
        List list6 = this.r;
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
        DivFocus divFocus = this.s;
        int b3 = i24 + (divFocus != null ? divFocus.b() : 0);
        List list7 = this.t;
        if (list7 != null) {
            Iterator it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((irk) it7.next()).b();
            }
        } else {
            i7 = 0;
        }
        int b4 = this.u.b() + b3 + i7;
        List list8 = this.v;
        if (list8 != null) {
            Iterator it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((v3k) it8.next()).b();
            }
        } else {
            i8 = 0;
        }
        int i25 = b4 + i8;
        List list9 = this.w;
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
        String str = this.x;
        int hashCode6 = i26 + (str != null ? str.hashCode() : 0);
        DivLayoutProvider divLayoutProvider = this.z;
        int b5 = hashCode6 + (divLayoutProvider != null ? divLayoutProvider.b() : 0);
        List list10 = this.A;
        if (list10 != null) {
            Iterator it10 = list10.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((v3k) it10.next()).b();
            }
        } else {
            i10 = 0;
        }
        int i27 = b5 + i10;
        DivEdgeInsets divEdgeInsets = this.B;
        int b6 = i27 + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        DivEdgeInsets divEdgeInsets2 = this.C;
        int b7 = b6 + (divEdgeInsets2 != null ? divEdgeInsets2.b() : 0);
        List list11 = this.D;
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
        List list12 = this.E;
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
        Expression expression4 = this.F;
        int hashCode7 = i29 + (expression4 != null ? expression4.hashCode() : 0);
        Expression expression5 = this.G;
        int hashCode8 = hashCode7 + (expression5 != null ? expression5.hashCode() : 0);
        List list13 = this.H;
        if (list13 != null) {
            Iterator it13 = list13.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((v3k) it13.next()).b();
            }
        } else {
            i13 = 0;
        }
        int i30 = hashCode8 + i13;
        List list14 = this.I;
        if (list14 != null) {
            Iterator it14 = list14.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((gil) it14.next()).b();
            }
        } else {
            i14 = 0;
        }
        int i31 = i30 + i14;
        DivTransform divTransform = this.J;
        int b8 = i31 + (divTransform != null ? divTransform.b() : 0);
        List list15 = this.K;
        if (list15 != null) {
            Iterator it15 = list15.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((xjl) it15.next()).b();
            }
        } else {
            i15 = 0;
        }
        int i32 = b8 + i15;
        DivChangeTransition divChangeTransition = this.L;
        int b9 = i32 + (divChangeTransition != null ? divChangeTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition = this.M;
        int b10 = b9 + (divAppearanceTransition != null ? divAppearanceTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition2 = this.N;
        int b11 = b10 + (divAppearanceTransition2 != null ? divAppearanceTransition2.b() : 0);
        List list16 = this.O;
        int hashCode9 = b11 + (list16 != null ? list16.hashCode() : 0);
        List list17 = this.P;
        if (list17 != null) {
            Iterator it16 = list17.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((lll) it16.next()).b();
            }
        } else {
            i16 = 0;
        }
        int i33 = hashCode9 + i16;
        List list18 = this.Q;
        if (list18 != null) {
            Iterator it17 = list18.iterator();
            i17 = 0;
            while (it17.hasNext()) {
                i17 += ((c3) it17.next()).b();
            }
        } else {
            i17 = 0;
        }
        int hashCode10 = this.R.hashCode() + i33 + i17;
        DivVisibilityAction divVisibilityAction = this.S;
        int g = hashCode10 + (divVisibilityAction != null ? divVisibilityAction.g() : 0);
        List list19 = this.T;
        if (list19 != null) {
            Iterator it18 = list19.iterator();
            while (it18.hasNext()) {
                i18 += ((DivVisibilityAction) it18.next()).g();
            }
        }
        int b12 = this.U.b() + g + i18;
        this.V = Integer.valueOf(b12);
        return b12;
    }

    @Override // defpackage.egk
    public final Expression a() {
        return this.g;
    }

    @Override // defpackage.egk
    public final List b() {
        return this.T;
    }

    @Override // defpackage.egk
    public final Expression c() {
        return this.m;
    }

    @Override // defpackage.egk
    public final List d() {
        return this.Q;
    }

    @Override // defpackage.egk
    public final DivEdgeInsets e() {
        return this.B;
    }

    @Override // defpackage.egk
    public final Expression f() {
        return this.G;
    }

    @Override // defpackage.egk
    public final Expression g() {
        return this.F;
    }

    @Override // defpackage.egk
    public final List getBackground() {
        return this.i;
    }

    @Override // defpackage.egk
    public final List getExtensions() {
        return this.r;
    }

    @Override // defpackage.egk
    public final DivSize getHeight() {
        return this.u;
    }

    @Override // defpackage.egk
    public final String getId() {
        return this.x;
    }

    @Override // defpackage.egk
    public final Expression getVisibility() {
        return this.R;
    }

    @Override // defpackage.egk
    public final DivSize getWidth() {
        return this.U;
    }

    @Override // defpackage.egk
    public final Expression h() {
        return this.e;
    }

    @Override // defpackage.egk
    public final List i() {
        return this.I;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition j() {
        return this.N;
    }

    @Override // defpackage.egk
    public final DivChangeTransition k() {
        return this.L;
    }

    @Override // defpackage.egk
    public final List l() {
        return this.p;
    }

    @Override // defpackage.egk
    public final DivTransform m() {
        return this.J;
    }

    @Override // defpackage.egk
    public final List n() {
        return this.O;
    }

    @Override // defpackage.egk
    public final Expression o() {
        return this.f;
    }

    @Override // defpackage.egk
    public final DivFocus p() {
        return this.s;
    }

    @Override // defpackage.egk
    public final DivAccessibility q() {
        return this.a;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((isk) ft6.b.c4.getValue()).b(ft6.a, this);
    }

    @Override // defpackage.egk
    public final DivEdgeInsets s() {
        return this.C;
    }

    @Override // defpackage.egk
    public final List t() {
        return this.H;
    }

    @Override // defpackage.egk
    public final DivLayoutProvider u() {
        return this.z;
    }

    @Override // defpackage.egk
    public final List v() {
        return this.P;
    }

    @Override // defpackage.egk
    public final DivVisibilityAction w() {
        return this.S;
    }

    @Override // defpackage.egk
    public final List x() {
        return this.t;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition y() {
        return this.M;
    }

    @Override // defpackage.egk
    public final List z() {
        return this.h;
    }
}
