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
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.c3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes.dex */
public final class dbl implements c4x, egk {
    public final DivEdgeInsets A;
    public final DivEdgeInsets B;
    public final List C;
    public final List D;
    public final Expression E;
    public final Expression F;
    public final List G;
    public final String H;
    public final List I;
    public final List J;
    public final DivTransform K;
    public final List L;
    public final Expression M;
    public final DivChangeTransition N;
    public final DivAppearanceTransition O;
    public final DivAppearanceTransition P;
    public final List Q;
    public final List R;
    public final List S;
    public final Expression T;
    public final DivVisibilityAction U;
    public final List V;
    public final DivSize W;
    public Integer X;
    public Integer Y;
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
    public final List o;
    public final String p;
    public final List q;
    public final List r;
    public final DivFocus s;
    public final List t;
    public final DivSize u;
    public final List v;
    public final List w;
    public final String x;
    public final DivLayoutProvider y;
    public final List z;

    static {
        ngd0.m(100L);
        ngd0.m(Double.valueOf(0.6d));
        ngd0.m(DivAnimation$Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        ngd0.m(valueOf);
        ngd0.m(valueOf);
        Boolean bool = Boolean.TRUE;
        ngd0.m(bool);
        ngd0.m(bool);
        ngd0.m(DivTransitionSelector.STATE_CHANGE);
        ngd0.m(DivVisibility.VISIBLE);
    }

    public dbl(DivAccessibility divAccessibility, v3k v3kVar, pdk pdkVar, List list, Expression expression, Expression expression2, Expression expression3, List list2, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, String str, List list5, List list6, DivFocus divFocus, List list7, DivSize divSize, List list8, List list9, String str2, DivLayoutProvider divLayoutProvider, List list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, List list11, List list12, Expression expression8, Expression expression9, List list13, String str3, List list14, List list15, DivTransform divTransform, List list16, Expression expression10, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list17, List list18, List list19, Expression expression11, DivVisibilityAction divVisibilityAction, List list20, DivSize divSize2) {
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
        this.o = list4;
        this.p = str;
        this.q = list5;
        this.r = list6;
        this.s = divFocus;
        this.t = list7;
        this.u = divSize;
        this.v = list8;
        this.w = list9;
        this.x = str2;
        this.y = divLayoutProvider;
        this.z = list10;
        this.A = divEdgeInsets;
        this.B = divEdgeInsets2;
        this.C = list11;
        this.D = list12;
        this.E = expression8;
        this.F = expression9;
        this.G = list13;
        this.H = str3;
        this.I = list14;
        this.J = list15;
        this.K = divTransform;
        this.L = list16;
        this.M = expression10;
        this.N = divChangeTransition;
        this.O = divAppearanceTransition;
        this.P = divAppearanceTransition2;
        this.Q = list17;
        this.R = list18;
        this.S = list19;
        this.T = expression11;
        this.U = divVisibilityAction;
        this.V = list20;
        this.W = divSize2;
    }

    public static dbl B(dbl dblVar, String str, String str2, ArrayList arrayList, int i) {
        DivAccessibility divAccessibility;
        List list;
        String str3;
        DivAccessibility divAccessibility2 = dblVar.a;
        v3k v3kVar = dblVar.b;
        pdk pdkVar = dblVar.c;
        List list2 = dblVar.d;
        Expression expression = dblVar.e;
        Expression expression2 = dblVar.f;
        Expression expression3 = dblVar.g;
        List list3 = dblVar.h;
        List list4 = dblVar.i;
        DivBorder divBorder = dblVar.j;
        Expression expression4 = dblVar.k;
        Expression expression5 = dblVar.l;
        Expression expression6 = dblVar.m;
        Expression expression7 = dblVar.n;
        List list5 = dblVar.o;
        if ((i & 32768) != 0) {
            divAccessibility = divAccessibility2;
            str = dblVar.p;
        } else {
            divAccessibility = divAccessibility2;
        }
        List list6 = dblVar.q;
        List list7 = dblVar.r;
        DivFocus divFocus = dblVar.s;
        List list8 = dblVar.t;
        DivSize divSize = dblVar.u;
        List list9 = dblVar.v;
        List list10 = dblVar.w;
        if ((i & SelfTester_JCP.ENCRYPT_CNT) != 0) {
            list = list10;
            str3 = dblVar.x;
        } else {
            list = list10;
            str3 = str2;
        }
        DivLayoutProvider divLayoutProvider = dblVar.y;
        List list11 = dblVar.z;
        DivEdgeInsets divEdgeInsets = dblVar.A;
        DivEdgeInsets divEdgeInsets2 = dblVar.B;
        List list12 = dblVar.C;
        List list13 = dblVar.D;
        Expression expression8 = dblVar.E;
        Expression expression9 = dblVar.F;
        List list14 = dblVar.G;
        String str4 = dblVar.H;
        List list15 = dblVar.J;
        DivTransform divTransform = dblVar.K;
        List list16 = dblVar.L;
        Expression expression10 = dblVar.M;
        DivChangeTransition divChangeTransition = dblVar.N;
        DivAppearanceTransition divAppearanceTransition = dblVar.O;
        DivAppearanceTransition divAppearanceTransition2 = dblVar.P;
        List list17 = dblVar.Q;
        List list18 = dblVar.R;
        List list19 = dblVar.S;
        Expression expression11 = dblVar.T;
        DivVisibilityAction divVisibilityAction = dblVar.U;
        List list20 = dblVar.V;
        DivSize divSize2 = dblVar.W;
        dblVar.getClass();
        return new dbl(divAccessibility, v3kVar, pdkVar, list2, expression, expression2, expression3, list3, list4, divBorder, expression4, expression5, expression6, expression7, list5, str, list6, list7, divFocus, list8, divSize, list9, list, str3, divLayoutProvider, list11, divEdgeInsets, divEdgeInsets2, list12, list13, expression8, expression9, list14, str4, arrayList, list15, divTransform, list16, expression10, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list17, list18, list19, expression11, divVisibilityAction, list20, divSize2);
    }

    @Override // defpackage.egk
    public final DivBorder A() {
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:530:0x07d4, code lost:
    
        if (r1 == null) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0774, code lost:
    
        if (r1 == null) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0731, code lost:
    
        if (r1 == null) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x06ee, code lost:
    
        if (r1 == null) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x066d, code lost:
    
        if (r1 == null) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0618, code lost:
    
        if (r1 == null) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x050e, code lost:
    
        if (r1 == null) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x048f, code lost:
    
        if (r1 == null) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x044c, code lost:
    
        if (r1 == null) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x03e5, code lost:
    
        if (r1 == null) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0386, code lost:
    
        if (r1 == null) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0343, code lost:
    
        if (r1 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x02f6, code lost:
    
        if (r1 == null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x02a1, code lost:
    
        if (r1 == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x025e, code lost:
    
        if (r1 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0211, code lost:
    
        if (r1 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x014c, code lost:
    
        if (r1 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0109, code lost:
    
        if (r1 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0076, code lost:
    
        if (r1 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(dbl dblVar, rvo rvoVar, rvo rvoVar2) {
        if (dblVar != null) {
            DivAccessibility divAccessibility = dblVar.a;
            DivAccessibility divAccessibility2 = this.a;
            if (divAccessibility2 != null ? divAccessibility2.a(divAccessibility, rvoVar, rvoVar2) : divAccessibility == null) {
                v3k v3kVar = dblVar.b;
                v3k v3kVar2 = this.b;
                if ((v3kVar2 != null ? v3kVar2.a(v3kVar, rvoVar, rvoVar2) : v3kVar == null) && this.c.a(dblVar.c, rvoVar, rvoVar2)) {
                    List list = dblVar.d;
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
                            Expression expression2 = dblVar.e;
                            if (divAlignmentHorizontal == (expression2 != null ? (DivAlignmentHorizontal) expression2.a(rvoVar2) : null)) {
                                Expression expression3 = this.f;
                                DivAlignmentVertical divAlignmentVertical = expression3 != null ? (DivAlignmentVertical) expression3.a(rvoVar) : null;
                                Expression expression4 = dblVar.f;
                                if (divAlignmentVertical == (expression4 != null ? (DivAlignmentVertical) expression4.a(rvoVar2) : null) && ((Number) this.g.a(rvoVar)).doubleValue() == ((Number) dblVar.g.a(rvoVar2)).doubleValue()) {
                                    List list3 = dblVar.h;
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
                                            List list5 = dblVar.i;
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
                                                    DivBorder divBorder = dblVar.j;
                                                    DivBorder divBorder2 = this.j;
                                                    if ((divBorder2 != null ? divBorder2.a(divBorder, rvoVar, rvoVar2) : divBorder == null) && ((Boolean) this.k.a(rvoVar)).booleanValue() == ((Boolean) dblVar.k.a(rvoVar2)).booleanValue() && ((Boolean) this.l.a(rvoVar)).booleanValue() == ((Boolean) dblVar.l.a(rvoVar2)).booleanValue()) {
                                                        Expression expression5 = this.m;
                                                        Long l = expression5 != null ? (Long) expression5.a(rvoVar) : null;
                                                        Expression expression6 = dblVar.m;
                                                        if (jl40.l(l, expression6 != null ? (Long) expression6.a(rvoVar2) : null)) {
                                                            Expression expression7 = this.n;
                                                            String str = expression7 != null ? (String) expression7.a(rvoVar) : null;
                                                            Expression expression8 = dblVar.n;
                                                            if (jl40.l(str, expression8 != null ? (String) expression8.a(rvoVar2) : null)) {
                                                                List list7 = dblVar.o;
                                                                List list8 = this.o;
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
                                                                        if (jl40.l(this.p, dblVar.p)) {
                                                                            List list9 = dblVar.q;
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
                                                                                    List list11 = dblVar.r;
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
                                                                                            DivFocus divFocus = dblVar.s;
                                                                                            DivFocus divFocus2 = this.s;
                                                                                            if (divFocus2 != null ? divFocus2.a(divFocus, rvoVar, rvoVar2) : divFocus == null) {
                                                                                                List list13 = dblVar.t;
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
                                                                                                        if (this.u.a(dblVar.u, rvoVar, rvoVar2)) {
                                                                                                            List list15 = dblVar.v;
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
                                                                                                                    List list17 = dblVar.w;
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
                                                                                                                            if (jl40.l(this.x, dblVar.x)) {
                                                                                                                                DivLayoutProvider divLayoutProvider = dblVar.y;
                                                                                                                                DivLayoutProvider divLayoutProvider2 = this.y;
                                                                                                                                if (divLayoutProvider2 != null ? divLayoutProvider2.a(divLayoutProvider) : divLayoutProvider == null) {
                                                                                                                                    List list19 = dblVar.z;
                                                                                                                                    List list20 = this.z;
                                                                                                                                    if (list20 != null) {
                                                                                                                                        if (list19 != null && list20.size() == list19.size()) {
                                                                                                                                            int i19 = 0;
                                                                                                                                            for (Object obj10 : list20) {
                                                                                                                                                int i20 = i19 + 1;
                                                                                                                                                if (i19 < 0) {
                                                                                                                                                    scc.m();
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                if (!((v3k) obj10).a((v3k) list19.get(i19), rvoVar, rvoVar2)) {
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                i19 = i20;
                                                                                                                                            }
                                                                                                                                            DivEdgeInsets divEdgeInsets = dblVar.A;
                                                                                                                                            DivEdgeInsets divEdgeInsets2 = this.A;
                                                                                                                                            if (divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) {
                                                                                                                                                DivEdgeInsets divEdgeInsets3 = dblVar.B;
                                                                                                                                                DivEdgeInsets divEdgeInsets4 = this.B;
                                                                                                                                                if (divEdgeInsets4 != null ? divEdgeInsets4.a(divEdgeInsets3, rvoVar, rvoVar2) : divEdgeInsets3 == null) {
                                                                                                                                                    List list21 = dblVar.C;
                                                                                                                                                    List list22 = this.C;
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
                                                                                                                                                            List list23 = dblVar.D;
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
                                                                                                                                                                    Expression expression9 = this.E;
                                                                                                                                                                    String str2 = expression9 != null ? (String) expression9.a(rvoVar) : null;
                                                                                                                                                                    Expression expression10 = dblVar.E;
                                                                                                                                                                    if (jl40.l(str2, expression10 != null ? (String) expression10.a(rvoVar2) : null)) {
                                                                                                                                                                        Expression expression11 = this.F;
                                                                                                                                                                        Long l2 = expression11 != null ? (Long) expression11.a(rvoVar) : null;
                                                                                                                                                                        Expression expression12 = dblVar.F;
                                                                                                                                                                        if (jl40.l(l2, expression12 != null ? (Long) expression12.a(rvoVar2) : null)) {
                                                                                                                                                                            List list25 = dblVar.G;
                                                                                                                                                                            List list26 = this.G;
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
                                                                                                                                                                                    if (jl40.l(this.H, dblVar.H)) {
                                                                                                                                                                                        List list27 = dblVar.I;
                                                                                                                                                                                        List list28 = this.I;
                                                                                                                                                                                        if (list28.size() == list27.size()) {
                                                                                                                                                                                            Iterator it = list28.iterator();
                                                                                                                                                                                            int i27 = 0;
                                                                                                                                                                                            loop13: while (true) {
                                                                                                                                                                                                if (it.hasNext()) {
                                                                                                                                                                                                    Object next = it.next();
                                                                                                                                                                                                    int i28 = i27 + 1;
                                                                                                                                                                                                    if (i27 < 0) {
                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    cbl cblVar = (cbl) list27.get(i27);
                                                                                                                                                                                                    cbl cblVar2 = (cbl) next;
                                                                                                                                                                                                    if (cblVar == null) {
                                                                                                                                                                                                        cblVar2.getClass();
                                                                                                                                                                                                        return false;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    pdk pdkVar = cblVar2.a;
                                                                                                                                                                                                    pdk pdkVar2 = cblVar.a;
                                                                                                                                                                                                    if (!(pdkVar != null ? pdkVar.a(pdkVar2, rvoVar, rvoVar2) : pdkVar2 == null)) {
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    pdk pdkVar3 = cblVar2.b;
                                                                                                                                                                                                    pdk pdkVar4 = cblVar.b;
                                                                                                                                                                                                    if (!(pdkVar3 != null ? pdkVar3.a(pdkVar4, rvoVar, rvoVar2) : pdkVar4 == null)) {
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    m3k m3kVar = cblVar2.c;
                                                                                                                                                                                                    m3k m3kVar2 = cblVar.c;
                                                                                                                                                                                                    if (!(m3kVar != null ? m3kVar.a(m3kVar2, rvoVar, rvoVar2) : m3kVar2 == null) || !jl40.l(cblVar2.d, cblVar.d)) {
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    List list29 = cblVar2.e;
                                                                                                                                                                                                    List list30 = cblVar.e;
                                                                                                                                                                                                    if (list29 == null) {
                                                                                                                                                                                                        if (list30 != null) {
                                                                                                                                                                                                            break;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        i27 = i28;
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        if (list30 == null || list29.size() != list30.size()) {
                                                                                                                                                                                                            break;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        int i29 = 0;
                                                                                                                                                                                                        for (Object obj14 : list29) {
                                                                                                                                                                                                            int i30 = i29 + 1;
                                                                                                                                                                                                            if (i29 < 0) {
                                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (!((v3k) obj14).a((v3k) list30.get(i29), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                break loop13;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            i29 = i30;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        i27 = i28;
                                                                                                                                                                                                    }
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    List list31 = dblVar.J;
                                                                                                                                                                                                    List list32 = this.J;
                                                                                                                                                                                                    if (list32 != null) {
                                                                                                                                                                                                        if (list31 != null && list32.size() == list31.size()) {
                                                                                                                                                                                                            int i31 = 0;
                                                                                                                                                                                                            for (Object obj15 : list32) {
                                                                                                                                                                                                                int i32 = i31 + 1;
                                                                                                                                                                                                                if (i31 < 0) {
                                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (!((gil) obj15).a((gil) list31.get(i31), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                i31 = i32;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            DivTransform divTransform = dblVar.K;
                                                                                                                                                                                                            DivTransform divTransform2 = this.K;
                                                                                                                                                                                                            if (divTransform2 != null ? divTransform2.a(divTransform, rvoVar, rvoVar2) : divTransform == null) {
                                                                                                                                                                                                                List list33 = dblVar.L;
                                                                                                                                                                                                                List list34 = this.L;
                                                                                                                                                                                                                if (list34 != null) {
                                                                                                                                                                                                                    if (list33 != null && list34.size() == list33.size()) {
                                                                                                                                                                                                                        int i33 = 0;
                                                                                                                                                                                                                        for (Object obj16 : list34) {
                                                                                                                                                                                                                            int i34 = i33 + 1;
                                                                                                                                                                                                                            if (i33 < 0) {
                                                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (!((xjl) obj16).a((xjl) list33.get(i33), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            i33 = i34;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (this.M.a(rvoVar) == dblVar.M.a(rvoVar2)) {
                                                                                                                                                                                                                            DivChangeTransition divChangeTransition = dblVar.N;
                                                                                                                                                                                                                            DivChangeTransition divChangeTransition2 = this.N;
                                                                                                                                                                                                                            if (divChangeTransition2 != null ? divChangeTransition2.a(divChangeTransition, rvoVar, rvoVar2) : divChangeTransition == null) {
                                                                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition = dblVar.O;
                                                                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition2 = this.O;
                                                                                                                                                                                                                                if (divAppearanceTransition2 != null ? divAppearanceTransition2.a(divAppearanceTransition, rvoVar, rvoVar2) : divAppearanceTransition == null) {
                                                                                                                                                                                                                                    DivAppearanceTransition divAppearanceTransition3 = dblVar.P;
                                                                                                                                                                                                                                    DivAppearanceTransition divAppearanceTransition4 = this.P;
                                                                                                                                                                                                                                    if (divAppearanceTransition4 != null ? divAppearanceTransition4.a(divAppearanceTransition3, rvoVar, rvoVar2) : divAppearanceTransition3 == null) {
                                                                                                                                                                                                                                        List list35 = dblVar.Q;
                                                                                                                                                                                                                                        List list36 = this.Q;
                                                                                                                                                                                                                                        if (list36 != null) {
                                                                                                                                                                                                                                            if (list35 != null && list36.size() == list35.size()) {
                                                                                                                                                                                                                                                int i35 = 0;
                                                                                                                                                                                                                                                for (Object obj17 : list36) {
                                                                                                                                                                                                                                                    int i36 = i35 + 1;
                                                                                                                                                                                                                                                    if (i35 < 0) {
                                                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    if (((DivTransitionTrigger) obj17) != ((DivTransitionTrigger) list35.get(i35))) {
                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    i35 = i36;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                List list37 = dblVar.R;
                                                                                                                                                                                                                                                List list38 = this.R;
                                                                                                                                                                                                                                                if (list38 != null) {
                                                                                                                                                                                                                                                    if (list37 != null && list38.size() == list37.size()) {
                                                                                                                                                                                                                                                        int i37 = 0;
                                                                                                                                                                                                                                                        for (Object obj18 : list38) {
                                                                                                                                                                                                                                                            int i38 = i37 + 1;
                                                                                                                                                                                                                                                            if (i37 < 0) {
                                                                                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            if (!((lll) obj18).a((lll) list37.get(i37), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            i37 = i38;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        List list39 = dblVar.S;
                                                                                                                                                                                                                                                        List list40 = this.S;
                                                                                                                                                                                                                                                        if (list40 != null) {
                                                                                                                                                                                                                                                            if (list39 != null && list40.size() == list39.size()) {
                                                                                                                                                                                                                                                                int i39 = 0;
                                                                                                                                                                                                                                                                for (Object obj19 : list40) {
                                                                                                                                                                                                                                                                    int i40 = i39 + 1;
                                                                                                                                                                                                                                                                    if (i39 < 0) {
                                                                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    if (!((c3) obj19).a((c3) list39.get(i39), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    i39 = i40;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                if (this.T.a(rvoVar) == dblVar.T.a(rvoVar2)) {
                                                                                                                                                                                                                                                                    DivVisibilityAction divVisibilityAction = dblVar.U;
                                                                                                                                                                                                                                                                    DivVisibilityAction divVisibilityAction2 = this.U;
                                                                                                                                                                                                                                                                    if (divVisibilityAction2 != null ? divVisibilityAction2.f(divVisibilityAction, rvoVar, rvoVar2) : divVisibilityAction == null) {
                                                                                                                                                                                                                                                                        List list41 = dblVar.V;
                                                                                                                                                                                                                                                                        List list42 = this.V;
                                                                                                                                                                                                                                                                        if (list42 != null) {
                                                                                                                                                                                                                                                                            if (list41 != null && list42.size() == list41.size()) {
                                                                                                                                                                                                                                                                                int i41 = 0;
                                                                                                                                                                                                                                                                                for (Object obj20 : list42) {
                                                                                                                                                                                                                                                                                    int i42 = i41 + 1;
                                                                                                                                                                                                                                                                                    if (i41 < 0) {
                                                                                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    if (!((DivVisibilityAction) obj20).f((DivVisibilityAction) list41.get(i41), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    i41 = i42;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                if (this.W.a(dblVar.W, rvoVar, rvoVar2)) {
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
        Integer num = this.X;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(dbl.class).hashCode();
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
        int hashCode5 = hashCode4 + (expression3 != null ? expression3.hashCode() : 0);
        Expression expression4 = this.n;
        int hashCode6 = hashCode5 + (expression4 != null ? expression4.hashCode() : 0);
        List list4 = this.o;
        if (list4 != null) {
            Iterator it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((nnk) it4.next()).g();
            }
        } else {
            i4 = 0;
        }
        int i22 = hashCode6 + i4;
        String str = this.p;
        int hashCode7 = i22 + (str != null ? str.hashCode() : 0);
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
        int i23 = hashCode7 + i5;
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
        String str2 = this.x;
        int hashCode8 = i26 + (str2 != null ? str2.hashCode() : 0);
        DivLayoutProvider divLayoutProvider = this.y;
        int b5 = hashCode8 + (divLayoutProvider != null ? divLayoutProvider.b() : 0);
        List list10 = this.z;
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
        DivEdgeInsets divEdgeInsets = this.A;
        int b6 = i27 + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        DivEdgeInsets divEdgeInsets2 = this.B;
        int b7 = b6 + (divEdgeInsets2 != null ? divEdgeInsets2.b() : 0);
        List list11 = this.C;
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
        List list12 = this.D;
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
        Expression expression5 = this.E;
        int hashCode9 = i29 + (expression5 != null ? expression5.hashCode() : 0);
        Expression expression6 = this.F;
        int hashCode10 = hashCode9 + (expression6 != null ? expression6.hashCode() : 0);
        List list13 = this.G;
        if (list13 != null) {
            Iterator it13 = list13.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((v3k) it13.next()).b();
            }
        } else {
            i13 = 0;
        }
        int i30 = hashCode10 + i13;
        String str3 = this.H;
        int hashCode11 = i30 + (str3 != null ? str3.hashCode() : 0);
        List list14 = this.J;
        if (list14 != null) {
            Iterator it14 = list14.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((gil) it14.next()).b();
            }
        } else {
            i14 = 0;
        }
        int i31 = hashCode11 + i14;
        DivTransform divTransform = this.K;
        int b8 = i31 + (divTransform != null ? divTransform.b() : 0);
        List list15 = this.L;
        if (list15 != null) {
            Iterator it15 = list15.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((xjl) it15.next()).b();
            }
        } else {
            i15 = 0;
        }
        int hashCode12 = this.M.hashCode() + b8 + i15;
        DivChangeTransition divChangeTransition = this.N;
        int b9 = hashCode12 + (divChangeTransition != null ? divChangeTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition = this.O;
        int b10 = b9 + (divAppearanceTransition != null ? divAppearanceTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition2 = this.P;
        int b11 = b10 + (divAppearanceTransition2 != null ? divAppearanceTransition2.b() : 0);
        List list16 = this.Q;
        int hashCode13 = b11 + (list16 != null ? list16.hashCode() : 0);
        List list17 = this.R;
        if (list17 != null) {
            Iterator it16 = list17.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((lll) it16.next()).b();
            }
        } else {
            i16 = 0;
        }
        int i32 = hashCode13 + i16;
        List list18 = this.S;
        if (list18 != null) {
            Iterator it17 = list18.iterator();
            i17 = 0;
            while (it17.hasNext()) {
                i17 += ((c3) it17.next()).b();
            }
        } else {
            i17 = 0;
        }
        int hashCode14 = this.T.hashCode() + i32 + i17;
        DivVisibilityAction divVisibilityAction = this.U;
        int g = hashCode14 + (divVisibilityAction != null ? divVisibilityAction.g() : 0);
        List list19 = this.V;
        if (list19 != null) {
            Iterator it18 = list19.iterator();
            while (it18.hasNext()) {
                i18 += ((DivVisibilityAction) it18.next()).g();
            }
        }
        int b12 = this.W.b() + g + i18;
        this.X = Integer.valueOf(b12);
        return b12;
    }

    @Override // defpackage.egk
    public final Expression a() {
        return this.g;
    }

    @Override // defpackage.egk
    public final List b() {
        return this.V;
    }

    @Override // defpackage.egk
    public final Expression c() {
        return this.m;
    }

    @Override // defpackage.egk
    public final List d() {
        return this.S;
    }

    @Override // defpackage.egk
    public final DivEdgeInsets e() {
        return this.A;
    }

    @Override // defpackage.egk
    public final Expression f() {
        return this.F;
    }

    @Override // defpackage.egk
    public final Expression g() {
        return this.E;
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
        return this.T;
    }

    @Override // defpackage.egk
    public final DivSize getWidth() {
        return this.W;
    }

    @Override // defpackage.egk
    public final Expression h() {
        return this.e;
    }

    @Override // defpackage.egk
    public final List i() {
        return this.J;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition j() {
        return this.P;
    }

    @Override // defpackage.egk
    public final DivChangeTransition k() {
        return this.N;
    }

    @Override // defpackage.egk
    public final List l() {
        return this.o;
    }

    @Override // defpackage.egk
    public final DivTransform m() {
        return this.K;
    }

    @Override // defpackage.egk
    public final List n() {
        return this.Q;
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
        return ((fbl) ft6.b.G7.getValue()).b(ft6.a, this);
    }

    @Override // defpackage.egk
    public final DivEdgeInsets s() {
        return this.B;
    }

    @Override // defpackage.egk
    public final List t() {
        return this.G;
    }

    @Override // defpackage.egk
    public final DivLayoutProvider u() {
        return this.y;
    }

    @Override // defpackage.egk
    public final List v() {
        return this.R;
    }

    @Override // defpackage.egk
    public final DivVisibilityAction w() {
        return this.U;
    }

    @Override // defpackage.egk
    public final List x() {
        return this.t;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition y() {
        return this.O;
    }

    @Override // defpackage.egk
    public final List z() {
        return this.h;
    }
}
