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
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivText$Truncate;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.c3;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ffl implements c4x, egk {
    public final List A;
    public final DivSize B;
    public final List C;
    public final List D;
    public final String E;
    public final List F;
    public final DivLayoutProvider G;
    public final Expression H;
    public final Expression I;
    public final List J;
    public final DivEdgeInsets K;
    public final Expression L;
    public final Expression M;
    public final DivEdgeInsets N;
    public final List O;
    public final List P;
    public final List Q;
    public final Expression R;
    public final Expression S;
    public final Expression T;
    public final List U;
    public final Expression V;
    public final Expression W;
    public final Expression X;
    public final Expression Y;
    public final Expression Z;
    public final DivAccessibility a;
    public final mfl a0;
    public final v3k b;
    public final m8l b0;
    public final pdk c;
    public final Expression c0;
    public final List d;
    public final List d0;
    public final Expression e;
    public final DivTransform e0;
    public final Expression f;
    public final List f0;
    public final Expression g;
    public final DivChangeTransition g0;
    public final List h;
    public final DivAppearanceTransition h0;
    public final Expression i;
    public final DivAppearanceTransition i0;
    public final List j;
    public final List j0;
    public final DivBorder k;
    public final Expression k0;
    public final Expression l;
    public final Expression l0;
    public final Expression m;
    public final List m0;
    public final List n;
    public final List n0;
    public final List o;
    public final Expression o0;
    public final afl p;
    public final DivVisibilityAction p0;
    public final List q;
    public final List q0;
    public final DivFocus r;
    public final DivSize r0;
    public final Expression s;
    public Integer s0;
    public final Expression t;
    public final Expression u;
    public final Expression v;
    public final Expression w;
    public final Expression x;
    public final Expression y;
    public final Expression z;

    static {
        ngd0.m(100L);
        ngd0.m(Double.valueOf(0.6d));
        ngd0.m(DivAnimation$Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        ngd0.m(valueOf);
        ngd0.m(valueOf);
        ngd0.m(Boolean.TRUE);
        ngd0.m(12L);
        ngd0.m(DivSizeUnit.SP);
        ngd0.m(Double.valueOf(0.0d));
        Boolean bool = Boolean.FALSE;
        ngd0.m(bool);
        DivLineStyle divLineStyle = DivLineStyle.NONE;
        ngd0.m(divLineStyle);
        ngd0.m(DivAlignmentHorizontal.START);
        ngd0.m(DivAlignmentVertical.TOP);
        ngd0.m(Integer.valueOf(ModalContentViewContainer.BASE_SHADOW_COLOR));
        ngd0.m(bool);
        ngd0.m(DivText$Truncate.END);
        ngd0.m(divLineStyle);
        ngd0.m(DivVisibility.VISIBLE);
    }

    public ffl(DivAccessibility divAccessibility, v3k v3kVar, pdk pdkVar, List list, Expression expression, Expression expression2, Expression expression3, List list2, Expression expression4, List list3, DivBorder divBorder, Expression expression5, Expression expression6, List list4, List list5, afl aflVar, List list6, DivFocus divFocus, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list7, DivSize divSize, List list8, List list9, String str, List list10, DivLayoutProvider divLayoutProvider, Expression expression15, Expression expression16, List list11, DivEdgeInsets divEdgeInsets, Expression expression17, Expression expression18, DivEdgeInsets divEdgeInsets2, List list12, List list13, List list14, Expression expression19, Expression expression20, Expression expression21, List list15, Expression expression22, Expression expression23, Expression expression24, Expression expression25, Expression expression26, mfl mflVar, m8l m8lVar, Expression expression27, List list16, DivTransform divTransform, List list17, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list18, Expression expression28, Expression expression29, List list19, List list20, Expression expression30, DivVisibilityAction divVisibilityAction, List list21, DivSize divSize2) {
        this.a = divAccessibility;
        this.b = v3kVar;
        this.c = pdkVar;
        this.d = list;
        this.e = expression;
        this.f = expression2;
        this.g = expression3;
        this.h = list2;
        this.i = expression4;
        this.j = list3;
        this.k = divBorder;
        this.l = expression5;
        this.m = expression6;
        this.n = list4;
        this.o = list5;
        this.p = aflVar;
        this.q = list6;
        this.r = divFocus;
        this.s = expression7;
        this.t = expression8;
        this.u = expression9;
        this.v = expression10;
        this.w = expression11;
        this.x = expression12;
        this.y = expression13;
        this.z = expression14;
        this.A = list7;
        this.B = divSize;
        this.C = list8;
        this.D = list9;
        this.E = str;
        this.F = list10;
        this.G = divLayoutProvider;
        this.H = expression15;
        this.I = expression16;
        this.J = list11;
        this.K = divEdgeInsets;
        this.L = expression17;
        this.M = expression18;
        this.N = divEdgeInsets2;
        this.O = list12;
        this.P = list13;
        this.Q = list14;
        this.R = expression19;
        this.S = expression20;
        this.T = expression21;
        this.U = list15;
        this.V = expression22;
        this.W = expression23;
        this.X = expression24;
        this.Y = expression25;
        this.Z = expression26;
        this.a0 = mflVar;
        this.b0 = m8lVar;
        this.c0 = expression27;
        this.d0 = list16;
        this.e0 = divTransform;
        this.f0 = list17;
        this.g0 = divChangeTransition;
        this.h0 = divAppearanceTransition;
        this.i0 = divAppearanceTransition2;
        this.j0 = list18;
        this.k0 = expression28;
        this.l0 = expression29;
        this.m0 = list19;
        this.n0 = list20;
        this.o0 = expression30;
        this.p0 = divVisibilityAction;
        this.q0 = list21;
        this.r0 = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.util.List] */
    public static ffl B(ffl fflVar, ArrayList arrayList, String str, int i) {
        afl aflVar;
        List list;
        String str2;
        DivAccessibility divAccessibility = fflVar.a;
        v3k v3kVar = fflVar.b;
        pdk pdkVar = fflVar.c;
        List list2 = fflVar.d;
        Expression expression = fflVar.e;
        Expression expression2 = fflVar.f;
        Expression expression3 = fflVar.g;
        List list3 = fflVar.h;
        Expression expression4 = fflVar.i;
        List list4 = fflVar.j;
        DivBorder divBorder = fflVar.k;
        Expression expression5 = fflVar.l;
        Expression expression6 = fflVar.m;
        List list5 = fflVar.n;
        List list6 = fflVar.o;
        afl aflVar2 = fflVar.p;
        if ((i & 65536) != 0) {
            aflVar = aflVar2;
            arrayList = fflVar.q;
        } else {
            aflVar = aflVar2;
        }
        DivFocus divFocus = fflVar.r;
        Expression expression7 = fflVar.s;
        Expression expression8 = fflVar.t;
        Expression expression9 = fflVar.u;
        Expression expression10 = fflVar.v;
        Expression expression11 = fflVar.w;
        Expression expression12 = fflVar.x;
        Expression expression13 = fflVar.y;
        Expression expression14 = fflVar.z;
        List list7 = fflVar.A;
        DivSize divSize = fflVar.B;
        List list8 = fflVar.C;
        List list9 = fflVar.D;
        if ((i & 1073741824) != 0) {
            list = list9;
            str2 = fflVar.E;
        } else {
            list = list9;
            str2 = str;
        }
        return new ffl(divAccessibility, v3kVar, pdkVar, list2, expression, expression2, expression3, list3, expression4, list4, divBorder, expression5, expression6, list5, list6, aflVar, arrayList, divFocus, expression7, expression8, expression9, expression10, expression11, expression12, expression13, expression14, list7, divSize, list8, list, str2, fflVar.F, fflVar.G, fflVar.H, fflVar.I, fflVar.J, fflVar.K, fflVar.L, fflVar.M, fflVar.N, fflVar.O, fflVar.P, fflVar.Q, fflVar.R, fflVar.S, fflVar.T, fflVar.U, fflVar.V, fflVar.W, fflVar.X, fflVar.Y, fflVar.Z, fflVar.a0, fflVar.b0, fflVar.c0, fflVar.d0, fflVar.e0, fflVar.f0, fflVar.g0, fflVar.h0, fflVar.i0, fflVar.j0, fflVar.k0, fflVar.l0, fflVar.m0, fflVar.n0, fflVar.o0, fflVar.p0, fflVar.q0, fflVar.r0);
    }

    @Override // defpackage.egk
    public final DivBorder A() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x031f, code lost:
    
        if (defpackage.jl40.l(r4.d.a(r12), r1.d.a(r13)) != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0ac6, code lost:
    
        if (r1 == null) goto L782;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0a66, code lost:
    
        if (r1 == null) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x0a23, code lost:
    
        if (r1 == null) goto L735;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x09c4, code lost:
    
        if (r1 == null) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x0951, code lost:
    
        if (r1 == null) goto L673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x08fc, code lost:
    
        if (r1 == null) goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x07c2, code lost:
    
        if (r1 == null) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0729, code lost:
    
        if (r1 == null) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x06e6, code lost:
    
        if (r1 == null) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x06a3, code lost:
    
        if (r1 == null) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x0600, code lost:
    
        if (r1 == null) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x0571, code lost:
    
        if (r1 == null) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x0524, code lost:
    
        if (r1 == null) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x04e1, code lost:
    
        if (r1 == null) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x0494, code lost:
    
        if (r1 == null) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x0365, code lost:
    
        if (r1 == null) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x030d, code lost:
    
        if (r6 == null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x02ca, code lost:
    
        if (r6 == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x0287, code lost:
    
        if (r6 == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x0322, code lost:
    
        if (r1 == null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x023a, code lost:
    
        if (r1 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x01f7, code lost:
    
        if (r1 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x016a, code lost:
    
        if (r1 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x0109, code lost:
    
        if (r1 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x0076, code lost:
    
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:519:0x088f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(ffl fflVar, rvo rvoVar, rvo rvoVar2) {
        boolean z;
        c4x a;
        c4x a2;
        if (fflVar != null) {
            DivAccessibility divAccessibility = fflVar.a;
            DivAccessibility divAccessibility2 = this.a;
            if (divAccessibility2 != null ? divAccessibility2.a(divAccessibility, rvoVar, rvoVar2) : divAccessibility == null) {
                v3k v3kVar = fflVar.b;
                v3k v3kVar2 = this.b;
                if ((v3kVar2 != null ? v3kVar2.a(v3kVar, rvoVar, rvoVar2) : v3kVar == null) && this.c.a(fflVar.c, rvoVar, rvoVar2)) {
                    List list = fflVar.d;
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
                            Expression expression2 = fflVar.e;
                            if (divAlignmentHorizontal == (expression2 != null ? (DivAlignmentHorizontal) expression2.a(rvoVar2) : null)) {
                                Expression expression3 = this.f;
                                DivAlignmentVertical divAlignmentVertical = expression3 != null ? (DivAlignmentVertical) expression3.a(rvoVar) : null;
                                Expression expression4 = fflVar.f;
                                if (divAlignmentVertical == (expression4 != null ? (DivAlignmentVertical) expression4.a(rvoVar2) : null) && ((Number) this.g.a(rvoVar)).doubleValue() == ((Number) fflVar.g.a(rvoVar2)).doubleValue()) {
                                    List list3 = fflVar.h;
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
                                            Expression expression5 = this.i;
                                            Boolean bool = expression5 != null ? (Boolean) expression5.a(rvoVar) : null;
                                            Expression expression6 = fflVar.i;
                                            if (jl40.l(bool, expression6 != null ? (Boolean) expression6.a(rvoVar2) : null)) {
                                                List list5 = fflVar.j;
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
                                                        DivBorder divBorder = fflVar.k;
                                                        DivBorder divBorder2 = this.k;
                                                        if ((divBorder2 != null ? divBorder2.a(divBorder, rvoVar, rvoVar2) : divBorder == null) && ((Boolean) this.l.a(rvoVar)).booleanValue() == ((Boolean) fflVar.l.a(rvoVar2)).booleanValue()) {
                                                            Expression expression7 = this.m;
                                                            Long l = expression7 != null ? (Long) expression7.a(rvoVar) : null;
                                                            Expression expression8 = fflVar.m;
                                                            if (jl40.l(l, expression8 != null ? (Long) expression8.a(rvoVar2) : null)) {
                                                                List list7 = fflVar.n;
                                                                List list8 = this.n;
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
                                                                        List list9 = fflVar.o;
                                                                        List list10 = this.o;
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
                                                                                afl aflVar = fflVar.p;
                                                                                afl aflVar2 = this.p;
                                                                                if (aflVar2 != null) {
                                                                                    if (aflVar != null) {
                                                                                        List list11 = aflVar2.a;
                                                                                        List list12 = aflVar.a;
                                                                                        if (list11 != null) {
                                                                                            if (list12 != null && list11.size() == list12.size()) {
                                                                                                int i11 = 0;
                                                                                                for (Object obj6 : list11) {
                                                                                                    int i12 = i11 + 1;
                                                                                                    if (i11 < 0) {
                                                                                                        scc.m();
                                                                                                        throw null;
                                                                                                    }
                                                                                                    if (!((v3k) obj6).a((v3k) list12.get(i11), rvoVar, rvoVar2)) {
                                                                                                        break;
                                                                                                    }
                                                                                                    i11 = i12;
                                                                                                }
                                                                                                List list13 = aflVar2.b;
                                                                                                List list14 = aflVar.b;
                                                                                                if (list13 != null) {
                                                                                                    if (list14 != null && list13.size() == list14.size()) {
                                                                                                        int i13 = 0;
                                                                                                        for (Object obj7 : list13) {
                                                                                                            int i14 = i13 + 1;
                                                                                                            if (i13 < 0) {
                                                                                                                scc.m();
                                                                                                                throw null;
                                                                                                            }
                                                                                                            if (!((cfl) obj7).a((cfl) list14.get(i13), rvoVar, rvoVar2)) {
                                                                                                                break;
                                                                                                            }
                                                                                                            i13 = i14;
                                                                                                        }
                                                                                                        List list15 = aflVar2.c;
                                                                                                        List list16 = aflVar.c;
                                                                                                        if (list15 != null) {
                                                                                                            if (list16 != null && list15.size() == list16.size()) {
                                                                                                                int i15 = 0;
                                                                                                                for (Object obj8 : list15) {
                                                                                                                    int i16 = i15 + 1;
                                                                                                                    if (i15 < 0) {
                                                                                                                        scc.m();
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    if (!((dfl) obj8).a((dfl) list16.get(i15), rvoVar, rvoVar2)) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    i15 = i16;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        List list17 = fflVar.q;
                                                                                        List list18 = this.q;
                                                                                        if (list18 != null) {
                                                                                            if (list17 != null && list18.size() == list17.size()) {
                                                                                                int i17 = 0;
                                                                                                for (Object obj9 : list18) {
                                                                                                    int i18 = i17 + 1;
                                                                                                    if (i17 < 0) {
                                                                                                        scc.m();
                                                                                                        throw null;
                                                                                                    }
                                                                                                    if (!((bpk) obj9).a((bpk) list17.get(i17))) {
                                                                                                        break;
                                                                                                    }
                                                                                                    i17 = i18;
                                                                                                }
                                                                                                DivFocus divFocus = fflVar.r;
                                                                                                DivFocus divFocus2 = this.r;
                                                                                                if (divFocus2 != null ? divFocus2.a(divFocus, rvoVar, rvoVar2) : divFocus == null) {
                                                                                                    Expression expression9 = this.s;
                                                                                                    Integer num = expression9 != null ? (Integer) expression9.a(rvoVar) : null;
                                                                                                    Expression expression10 = fflVar.s;
                                                                                                    if (jl40.l(num, expression10 != null ? (Integer) expression10.a(rvoVar2) : null)) {
                                                                                                        Expression expression11 = this.t;
                                                                                                        String str = expression11 != null ? (String) expression11.a(rvoVar) : null;
                                                                                                        Expression expression12 = fflVar.t;
                                                                                                        if (jl40.l(str, expression12 != null ? (String) expression12.a(rvoVar2) : null)) {
                                                                                                            Expression expression13 = this.u;
                                                                                                            String str2 = expression13 != null ? (String) expression13.a(rvoVar) : null;
                                                                                                            Expression expression14 = fflVar.u;
                                                                                                            if (jl40.l(str2, expression14 != null ? (String) expression14.a(rvoVar2) : null) && ((Number) this.v.a(rvoVar)).longValue() == ((Number) fflVar.v.a(rvoVar2)).longValue() && this.w.a(rvoVar) == fflVar.w.a(rvoVar2)) {
                                                                                                                Expression expression15 = this.x;
                                                                                                                JSONObject jSONObject = expression15 != null ? (JSONObject) expression15.a(rvoVar) : null;
                                                                                                                Expression expression16 = fflVar.x;
                                                                                                                if (jl40.l(jSONObject, expression16 != null ? (JSONObject) expression16.a(rvoVar2) : null)) {
                                                                                                                    Expression expression17 = this.y;
                                                                                                                    DivFontWeight divFontWeight = expression17 != null ? (DivFontWeight) expression17.a(rvoVar) : null;
                                                                                                                    Expression expression18 = fflVar.y;
                                                                                                                    if (divFontWeight == (expression18 != null ? (DivFontWeight) expression18.a(rvoVar2) : null)) {
                                                                                                                        Expression expression19 = this.z;
                                                                                                                        Long l2 = expression19 != null ? (Long) expression19.a(rvoVar) : null;
                                                                                                                        Expression expression20 = fflVar.z;
                                                                                                                        if (jl40.l(l2, expression20 != null ? (Long) expression20.a(rvoVar2) : null)) {
                                                                                                                            List list19 = fflVar.A;
                                                                                                                            List list20 = this.A;
                                                                                                                            if (list20 != null) {
                                                                                                                                if (list19 != null && list20.size() == list19.size()) {
                                                                                                                                    int i19 = 0;
                                                                                                                                    for (Object obj10 : list20) {
                                                                                                                                        int i20 = i19 + 1;
                                                                                                                                        if (i19 < 0) {
                                                                                                                                            scc.m();
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        if (!((irk) obj10).a((irk) list19.get(i19))) {
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        i19 = i20;
                                                                                                                                    }
                                                                                                                                    if (this.B.a(fflVar.B, rvoVar, rvoVar2)) {
                                                                                                                                        List list21 = fflVar.C;
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
                                                                                                                                                List list23 = fflVar.D;
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
                                                                                                                                                        if (jl40.l(this.E, fflVar.E)) {
                                                                                                                                                            List list25 = fflVar.F;
                                                                                                                                                            List list26 = this.F;
                                                                                                                                                            if (list26 != null) {
                                                                                                                                                                if (list25 != null && list26.size() == list25.size()) {
                                                                                                                                                                    int i25 = 0;
                                                                                                                                                                    for (Object obj13 : list26) {
                                                                                                                                                                        int i26 = i25 + 1;
                                                                                                                                                                        if (i25 < 0) {
                                                                                                                                                                            scc.m();
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        if (!((cfl) obj13).a((cfl) list25.get(i25), rvoVar, rvoVar2)) {
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        i25 = i26;
                                                                                                                                                                    }
                                                                                                                                                                    DivLayoutProvider divLayoutProvider = fflVar.G;
                                                                                                                                                                    DivLayoutProvider divLayoutProvider2 = this.G;
                                                                                                                                                                    if ((divLayoutProvider2 != null ? divLayoutProvider2.a(divLayoutProvider) : divLayoutProvider == null) && ((Number) this.H.a(rvoVar)).doubleValue() == ((Number) fflVar.H.a(rvoVar2)).doubleValue()) {
                                                                                                                                                                        Expression expression21 = this.I;
                                                                                                                                                                        Long l3 = expression21 != null ? (Long) expression21.a(rvoVar) : null;
                                                                                                                                                                        Expression expression22 = fflVar.I;
                                                                                                                                                                        if (jl40.l(l3, expression22 != null ? (Long) expression22.a(rvoVar2) : null)) {
                                                                                                                                                                            List list27 = fflVar.J;
                                                                                                                                                                            List list28 = this.J;
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
                                                                                                                                                                                    DivEdgeInsets divEdgeInsets = fflVar.K;
                                                                                                                                                                                    DivEdgeInsets divEdgeInsets2 = this.K;
                                                                                                                                                                                    if (divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) {
                                                                                                                                                                                        Expression expression23 = this.L;
                                                                                                                                                                                        Long l4 = expression23 != null ? (Long) expression23.a(rvoVar) : null;
                                                                                                                                                                                        Expression expression24 = fflVar.L;
                                                                                                                                                                                        if (jl40.l(l4, expression24 != null ? (Long) expression24.a(rvoVar2) : null)) {
                                                                                                                                                                                            Expression expression25 = this.M;
                                                                                                                                                                                            Long l5 = expression25 != null ? (Long) expression25.a(rvoVar) : null;
                                                                                                                                                                                            Expression expression26 = fflVar.M;
                                                                                                                                                                                            if (jl40.l(l5, expression26 != null ? (Long) expression26.a(rvoVar2) : null)) {
                                                                                                                                                                                                DivEdgeInsets divEdgeInsets3 = fflVar.N;
                                                                                                                                                                                                DivEdgeInsets divEdgeInsets4 = this.N;
                                                                                                                                                                                                if (divEdgeInsets4 != null ? divEdgeInsets4.a(divEdgeInsets3, rvoVar, rvoVar2) : divEdgeInsets3 == null) {
                                                                                                                                                                                                    List list29 = fflVar.O;
                                                                                                                                                                                                    List list30 = this.O;
                                                                                                                                                                                                    if (list30 != null) {
                                                                                                                                                                                                        if (list29 != null && list30.size() == list29.size()) {
                                                                                                                                                                                                            int i29 = 0;
                                                                                                                                                                                                            for (Object obj15 : list30) {
                                                                                                                                                                                                                int i30 = i29 + 1;
                                                                                                                                                                                                                if (i29 < 0) {
                                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (!((v3k) obj15).a((v3k) list29.get(i29), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                i29 = i30;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            List list31 = fflVar.P;
                                                                                                                                                                                                            List list32 = this.P;
                                                                                                                                                                                                            if (list32 != null) {
                                                                                                                                                                                                                if (list31 != null && list32.size() == list31.size()) {
                                                                                                                                                                                                                    int i31 = 0;
                                                                                                                                                                                                                    for (Object obj16 : list32) {
                                                                                                                                                                                                                        int i32 = i31 + 1;
                                                                                                                                                                                                                        if (i31 < 0) {
                                                                                                                                                                                                                            scc.m();
                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (!((v3k) obj16).a((v3k) list31.get(i31), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        i31 = i32;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    List list33 = fflVar.Q;
                                                                                                                                                                                                                    List list34 = this.Q;
                                                                                                                                                                                                                    if (list34 != null) {
                                                                                                                                                                                                                        if (list33 != null && list34.size() == list33.size()) {
                                                                                                                                                                                                                            int i33 = 0;
                                                                                                                                                                                                                            for (Object obj17 : list34) {
                                                                                                                                                                                                                                int i34 = i33 + 1;
                                                                                                                                                                                                                                if (i33 < 0) {
                                                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (!((dfl) obj17).a((dfl) list33.get(i33), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                i33 = i34;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            Expression expression27 = this.R;
                                                                                                                                                                                                                            String str3 = expression27 != null ? (String) expression27.a(rvoVar) : null;
                                                                                                                                                                                                                            Expression expression28 = fflVar.R;
                                                                                                                                                                                                                            if (jl40.l(str3, expression28 != null ? (String) expression28.a(rvoVar2) : null)) {
                                                                                                                                                                                                                                Expression expression29 = this.S;
                                                                                                                                                                                                                                Long l6 = expression29 != null ? (Long) expression29.a(rvoVar) : null;
                                                                                                                                                                                                                                Expression expression30 = fflVar.S;
                                                                                                                                                                                                                                if (jl40.l(l6, expression30 != null ? (Long) expression30.a(rvoVar2) : null) && ((Boolean) this.T.a(rvoVar)).booleanValue() == ((Boolean) fflVar.T.a(rvoVar2)).booleanValue()) {
                                                                                                                                                                                                                                    List list35 = fflVar.U;
                                                                                                                                                                                                                                    List list36 = this.U;
                                                                                                                                                                                                                                    if (list36 != null) {
                                                                                                                                                                                                                                        if (list35 != null && list36.size() == list35.size()) {
                                                                                                                                                                                                                                            int i35 = 0;
                                                                                                                                                                                                                                            for (Object obj18 : list36) {
                                                                                                                                                                                                                                                int i36 = i35 + 1;
                                                                                                                                                                                                                                                if (i35 < 0) {
                                                                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (!((v3k) obj18).a((v3k) list35.get(i35), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                i35 = i36;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (this.V.a(rvoVar) == fflVar.V.a(rvoVar2) && jl40.l(this.W.a(rvoVar), fflVar.W.a(rvoVar2)) && this.X.a(rvoVar) == fflVar.X.a(rvoVar2) && this.Y.a(rvoVar) == fflVar.Y.a(rvoVar2) && ((Number) this.Z.a(rvoVar)).intValue() == ((Number) fflVar.Z.a(rvoVar2)).intValue()) {
                                                                                                                                                                                                                                                mfl mflVar = fflVar.a0;
                                                                                                                                                                                                                                                mfl mflVar2 = this.a0;
                                                                                                                                                                                                                                                if (mflVar2 != null) {
                                                                                                                                                                                                                                                    if (mflVar != null) {
                                                                                                                                                                                                                                                        if (mflVar2 instanceof kfl) {
                                                                                                                                                                                                                                                            vyk a3 = ((kfl) mflVar2).a();
                                                                                                                                                                                                                                                            if (mflVar instanceof kfl) {
                                                                                                                                                                                                                                                                a2 = ((kfl) mflVar).a();
                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                if (!(mflVar instanceof lfl)) {
                                                                                                                                                                                                                                                                    w511.b();
                                                                                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                a2 = ((lfl) mflVar).a();
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            z = a3.a(a2 instanceof vyk ? (vyk) a2 : null, rvoVar, rvoVar2);
                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                            if (!(mflVar2 instanceof lfl)) {
                                                                                                                                                                                                                                                                w511.b();
                                                                                                                                                                                                                                                                return false;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            k5l a4 = ((lfl) mflVar2).a();
                                                                                                                                                                                                                                                            if (mflVar instanceof kfl) {
                                                                                                                                                                                                                                                                a = ((kfl) mflVar).a();
                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                if (!(mflVar instanceof lfl)) {
                                                                                                                                                                                                                                                                    w511.b();
                                                                                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                a = ((lfl) mflVar).a();
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            z = a4.a(a instanceof k5l ? (k5l) a : null, rvoVar, rvoVar2);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        if (z) {
                                                                                                                                                                                                                                                            m8l m8lVar = fflVar.b0;
                                                                                                                                                                                                                                                            m8l m8lVar2 = this.b0;
                                                                                                                                                                                                                                                            if ((m8lVar2 != null ? m8lVar2.a(m8lVar, rvoVar, rvoVar2) : m8lVar == null) && ((Boolean) this.c0.a(rvoVar)).booleanValue() == ((Boolean) fflVar.c0.a(rvoVar2)).booleanValue()) {
                                                                                                                                                                                                                                                                List list37 = fflVar.d0;
                                                                                                                                                                                                                                                                List list38 = this.d0;
                                                                                                                                                                                                                                                                if (list38 != null) {
                                                                                                                                                                                                                                                                    if (list37 != null && list38.size() == list37.size()) {
                                                                                                                                                                                                                                                                        int i37 = 0;
                                                                                                                                                                                                                                                                        for (Object obj19 : list38) {
                                                                                                                                                                                                                                                                            int i38 = i37 + 1;
                                                                                                                                                                                                                                                                            if (i37 < 0) {
                                                                                                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            if (!((gil) obj19).a((gil) list37.get(i37), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            i37 = i38;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        DivTransform divTransform = fflVar.e0;
                                                                                                                                                                                                                                                                        DivTransform divTransform2 = this.e0;
                                                                                                                                                                                                                                                                        if (divTransform2 != null ? divTransform2.a(divTransform, rvoVar, rvoVar2) : divTransform == null) {
                                                                                                                                                                                                                                                                            List list39 = fflVar.f0;
                                                                                                                                                                                                                                                                            List list40 = this.f0;
                                                                                                                                                                                                                                                                            if (list40 != null) {
                                                                                                                                                                                                                                                                                if (list39 != null && list40.size() == list39.size()) {
                                                                                                                                                                                                                                                                                    int i39 = 0;
                                                                                                                                                                                                                                                                                    for (Object obj20 : list40) {
                                                                                                                                                                                                                                                                                        int i40 = i39 + 1;
                                                                                                                                                                                                                                                                                        if (i39 < 0) {
                                                                                                                                                                                                                                                                                            scc.m();
                                                                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        if (!((xjl) obj20).a((xjl) list39.get(i39), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        i39 = i40;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    DivChangeTransition divChangeTransition = fflVar.g0;
                                                                                                                                                                                                                                                                                    DivChangeTransition divChangeTransition2 = this.g0;
                                                                                                                                                                                                                                                                                    if (divChangeTransition2 != null ? divChangeTransition2.a(divChangeTransition, rvoVar, rvoVar2) : divChangeTransition == null) {
                                                                                                                                                                                                                                                                                        DivAppearanceTransition divAppearanceTransition = fflVar.h0;
                                                                                                                                                                                                                                                                                        DivAppearanceTransition divAppearanceTransition2 = this.h0;
                                                                                                                                                                                                                                                                                        if (divAppearanceTransition2 != null ? divAppearanceTransition2.a(divAppearanceTransition, rvoVar, rvoVar2) : divAppearanceTransition == null) {
                                                                                                                                                                                                                                                                                            DivAppearanceTransition divAppearanceTransition3 = fflVar.i0;
                                                                                                                                                                                                                                                                                            DivAppearanceTransition divAppearanceTransition4 = this.i0;
                                                                                                                                                                                                                                                                                            if (divAppearanceTransition4 != null ? divAppearanceTransition4.a(divAppearanceTransition3, rvoVar, rvoVar2) : divAppearanceTransition3 == null) {
                                                                                                                                                                                                                                                                                                List list41 = fflVar.j0;
                                                                                                                                                                                                                                                                                                List list42 = this.j0;
                                                                                                                                                                                                                                                                                                if (list42 != null) {
                                                                                                                                                                                                                                                                                                    if (list41 != null && list42.size() == list41.size()) {
                                                                                                                                                                                                                                                                                                        int i41 = 0;
                                                                                                                                                                                                                                                                                                        for (Object obj21 : list42) {
                                                                                                                                                                                                                                                                                                            int i42 = i41 + 1;
                                                                                                                                                                                                                                                                                                            if (i41 < 0) {
                                                                                                                                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            if (((DivTransitionTrigger) obj21) != ((DivTransitionTrigger) list41.get(i41))) {
                                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            i41 = i42;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        if (this.k0.a(rvoVar) == fflVar.k0.a(rvoVar2) && this.l0.a(rvoVar) == fflVar.l0.a(rvoVar2)) {
                                                                                                                                                                                                                                                                                                            List list43 = fflVar.m0;
                                                                                                                                                                                                                                                                                                            List list44 = this.m0;
                                                                                                                                                                                                                                                                                                            if (list44 != null) {
                                                                                                                                                                                                                                                                                                                if (list43 != null && list44.size() == list43.size()) {
                                                                                                                                                                                                                                                                                                                    int i43 = 0;
                                                                                                                                                                                                                                                                                                                    for (Object obj22 : list44) {
                                                                                                                                                                                                                                                                                                                        int i44 = i43 + 1;
                                                                                                                                                                                                                                                                                                                        if (i43 < 0) {
                                                                                                                                                                                                                                                                                                                            scc.m();
                                                                                                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        if (!((lll) obj22).a((lll) list43.get(i43), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        i43 = i44;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    List list45 = fflVar.n0;
                                                                                                                                                                                                                                                                                                                    List list46 = this.n0;
                                                                                                                                                                                                                                                                                                                    if (list46 != null) {
                                                                                                                                                                                                                                                                                                                        if (list45 != null && list46.size() == list45.size()) {
                                                                                                                                                                                                                                                                                                                            int i45 = 0;
                                                                                                                                                                                                                                                                                                                            for (Object obj23 : list46) {
                                                                                                                                                                                                                                                                                                                                int i46 = i45 + 1;
                                                                                                                                                                                                                                                                                                                                if (i45 < 0) {
                                                                                                                                                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                if (!((c3) obj23).a((c3) list45.get(i45), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                i45 = i46;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            if (this.o0.a(rvoVar) == fflVar.o0.a(rvoVar2)) {
                                                                                                                                                                                                                                                                                                                                DivVisibilityAction divVisibilityAction = fflVar.p0;
                                                                                                                                                                                                                                                                                                                                DivVisibilityAction divVisibilityAction2 = this.p0;
                                                                                                                                                                                                                                                                                                                                if (divVisibilityAction2 != null ? divVisibilityAction2.f(divVisibilityAction, rvoVar, rvoVar2) : divVisibilityAction == null) {
                                                                                                                                                                                                                                                                                                                                    List list47 = fflVar.q0;
                                                                                                                                                                                                                                                                                                                                    List list48 = this.q0;
                                                                                                                                                                                                                                                                                                                                    if (list48 != null) {
                                                                                                                                                                                                                                                                                                                                        if (list47 != null && list48.size() == list47.size()) {
                                                                                                                                                                                                                                                                                                                                            int i47 = 0;
                                                                                                                                                                                                                                                                                                                                            for (Object obj24 : list48) {
                                                                                                                                                                                                                                                                                                                                                int i48 = i47 + 1;
                                                                                                                                                                                                                                                                                                                                                if (i47 < 0) {
                                                                                                                                                                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                if (!((DivVisibilityAction) obj24).f((DivVisibilityAction) list47.get(i47), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                i47 = i48;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            if (this.r0.a(fflVar.r0, rvoVar, rvoVar2)) {
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
                                                                                                                                                                                                                                                    z = false;
                                                                                                                                                                                                                                                    if (z) {
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                    if (mflVar == null) {
                                                                                                                                                                                                                                                        z = true;
                                                                                                                                                                                                                                                        if (z) {
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    z = false;
                                                                                                                                                                                                                                                    if (z) {
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

    /* JADX WARN: Removed duplicated region for block: B:192:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0412  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        List list;
        int i18;
        List list2;
        int i19;
        List list3;
        int i20;
        List list4;
        int i21;
        List list5;
        int b;
        int i22;
        int i23;
        int i24;
        Integer num = this.s0;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(ffl.class).hashCode();
        int i25 = 0;
        DivAccessibility divAccessibility = this.a;
        int b2 = hashCode + (divAccessibility != null ? divAccessibility.b() : 0);
        v3k v3kVar = this.b;
        int b3 = this.c.b() + b2 + (v3kVar != null ? v3kVar.b() : 0);
        List list6 = this.d;
        if (list6 != null) {
            Iterator it = list6.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((v3k) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i26 = b3 + i;
        Expression expression = this.e;
        int hashCode2 = i26 + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.f;
        int hashCode3 = this.g.hashCode() + hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        List list7 = this.h;
        if (list7 != null) {
            Iterator it2 = list7.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((ydk) it2.next()).b();
            }
        } else {
            i2 = 0;
        }
        int i27 = hashCode3 + i2;
        Expression expression3 = this.i;
        int hashCode4 = i27 + (expression3 != null ? expression3.hashCode() : 0);
        List list8 = this.j;
        if (list8 != null) {
            Iterator it3 = list8.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((kfk) it3.next()).b();
            }
        } else {
            i3 = 0;
        }
        int i28 = hashCode4 + i3;
        DivBorder divBorder = this.k;
        int hashCode5 = this.l.hashCode() + i28 + (divBorder != null ? divBorder.b() : 0);
        Expression expression4 = this.m;
        int hashCode6 = hashCode5 + (expression4 != null ? expression4.hashCode() : 0);
        List list9 = this.n;
        if (list9 != null) {
            Iterator it4 = list9.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((nnk) it4.next()).g();
            }
        } else {
            i4 = 0;
        }
        int i29 = hashCode6 + i4;
        List list10 = this.o;
        if (list10 != null) {
            Iterator it5 = list10.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((v3k) it5.next()).b();
            }
        } else {
            i5 = 0;
        }
        int i30 = i29 + i5;
        afl aflVar = this.p;
        if (aflVar != null) {
            Integer num2 = aflVar.e;
            if (num2 != null) {
                i6 = num2.intValue();
            } else {
                int hashCode7 = qoi0.a(afl.class).hashCode();
                List list11 = aflVar.a;
                if (list11 != null) {
                    Iterator it6 = list11.iterator();
                    i22 = 0;
                    while (it6.hasNext()) {
                        i22 += ((v3k) it6.next()).b();
                    }
                } else {
                    i22 = 0;
                }
                int i31 = hashCode7 + i22;
                List list12 = aflVar.b;
                if (list12 != null) {
                    Iterator it7 = list12.iterator();
                    i23 = 0;
                    while (it7.hasNext()) {
                        i23 += ((cfl) it7.next()).b();
                    }
                } else {
                    i23 = 0;
                }
                int i32 = i31 + i23;
                List list13 = aflVar.c;
                if (list13 != null) {
                    Iterator it8 = list13.iterator();
                    i24 = 0;
                    while (it8.hasNext()) {
                        i24 += ((dfl) it8.next()).b();
                    }
                } else {
                    i24 = 0;
                }
                int hashCode8 = i32 + i24 + aflVar.d.hashCode();
                aflVar.e = Integer.valueOf(hashCode8);
                i6 = hashCode8;
            }
        } else {
            i6 = 0;
        }
        int i33 = i30 + i6;
        List list14 = this.q;
        if (list14 != null) {
            Iterator it9 = list14.iterator();
            i7 = 0;
            while (it9.hasNext()) {
                i7 += ((bpk) it9.next()).b();
            }
        } else {
            i7 = 0;
        }
        int i34 = i33 + i7;
        DivFocus divFocus = this.r;
        int b4 = i34 + (divFocus != null ? divFocus.b() : 0);
        Expression expression5 = this.s;
        int hashCode9 = b4 + (expression5 != null ? expression5.hashCode() : 0);
        Expression expression6 = this.t;
        int hashCode10 = hashCode9 + (expression6 != null ? expression6.hashCode() : 0);
        Expression expression7 = this.u;
        int hashCode11 = this.w.hashCode() + this.v.hashCode() + hashCode10 + (expression7 != null ? expression7.hashCode() : 0);
        Expression expression8 = this.x;
        int hashCode12 = hashCode11 + (expression8 != null ? expression8.hashCode() : 0);
        Expression expression9 = this.y;
        int hashCode13 = hashCode12 + (expression9 != null ? expression9.hashCode() : 0);
        Expression expression10 = this.z;
        int hashCode14 = hashCode13 + (expression10 != null ? expression10.hashCode() : 0);
        List list15 = this.A;
        if (list15 != null) {
            Iterator it10 = list15.iterator();
            i8 = 0;
            while (it10.hasNext()) {
                i8 += ((irk) it10.next()).b();
            }
        } else {
            i8 = 0;
        }
        int b5 = this.B.b() + hashCode14 + i8;
        List list16 = this.C;
        if (list16 != null) {
            Iterator it11 = list16.iterator();
            i9 = 0;
            while (it11.hasNext()) {
                i9 += ((v3k) it11.next()).b();
            }
        } else {
            i9 = 0;
        }
        int i35 = b5 + i9;
        List list17 = this.D;
        if (list17 != null) {
            Iterator it12 = list17.iterator();
            i10 = 0;
            while (it12.hasNext()) {
                i10 += ((v3k) it12.next()).b();
            }
        } else {
            i10 = 0;
        }
        int i36 = i35 + i10;
        String str = this.E;
        int hashCode15 = i36 + (str != null ? str.hashCode() : 0);
        List list18 = this.F;
        if (list18 != null) {
            Iterator it13 = list18.iterator();
            i11 = 0;
            while (it13.hasNext()) {
                i11 += ((cfl) it13.next()).b();
            }
        } else {
            i11 = 0;
        }
        int i37 = hashCode15 + i11;
        DivLayoutProvider divLayoutProvider = this.G;
        int hashCode16 = this.H.hashCode() + i37 + (divLayoutProvider != null ? divLayoutProvider.b() : 0);
        Expression expression11 = this.I;
        int hashCode17 = hashCode16 + (expression11 != null ? expression11.hashCode() : 0);
        List list19 = this.J;
        if (list19 != null) {
            Iterator it14 = list19.iterator();
            i12 = 0;
            while (it14.hasNext()) {
                i12 += ((v3k) it14.next()).b();
            }
        } else {
            i12 = 0;
        }
        int i38 = hashCode17 + i12;
        DivEdgeInsets divEdgeInsets = this.K;
        int b6 = i38 + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        Expression expression12 = this.L;
        int hashCode18 = b6 + (expression12 != null ? expression12.hashCode() : 0);
        Expression expression13 = this.M;
        int hashCode19 = hashCode18 + (expression13 != null ? expression13.hashCode() : 0);
        DivEdgeInsets divEdgeInsets2 = this.N;
        int b7 = hashCode19 + (divEdgeInsets2 != null ? divEdgeInsets2.b() : 0);
        List list20 = this.O;
        if (list20 != null) {
            Iterator it15 = list20.iterator();
            i13 = 0;
            while (it15.hasNext()) {
                i13 += ((v3k) it15.next()).b();
            }
        } else {
            i13 = 0;
        }
        int i39 = b7 + i13;
        List list21 = this.P;
        if (list21 != null) {
            Iterator it16 = list21.iterator();
            i14 = 0;
            while (it16.hasNext()) {
                i14 += ((v3k) it16.next()).b();
            }
        } else {
            i14 = 0;
        }
        int i40 = i39 + i14;
        List list22 = this.Q;
        if (list22 != null) {
            Iterator it17 = list22.iterator();
            i15 = 0;
            while (it17.hasNext()) {
                i15 += ((dfl) it17.next()).b();
            }
        } else {
            i15 = 0;
        }
        int i41 = i40 + i15;
        Expression expression14 = this.R;
        int hashCode20 = i41 + (expression14 != null ? expression14.hashCode() : 0);
        Expression expression15 = this.S;
        int hashCode21 = this.T.hashCode() + hashCode20 + (expression15 != null ? expression15.hashCode() : 0);
        List list23 = this.U;
        if (list23 != null) {
            Iterator it18 = list23.iterator();
            i16 = 0;
            while (it18.hasNext()) {
                i16 += ((v3k) it18.next()).b();
            }
        } else {
            i16 = 0;
        }
        int hashCode22 = this.Z.hashCode() + this.Y.hashCode() + this.X.hashCode() + this.W.hashCode() + this.V.hashCode() + hashCode21 + i16;
        mfl mflVar = this.a0;
        if (mflVar != null) {
            Integer num3 = mflVar.a;
            if (num3 != null) {
                i17 = num3.intValue();
            } else {
                int hashCode23 = qoi0.a(mflVar.getClass()).hashCode();
                if (mflVar instanceof kfl) {
                    b = ((kfl) mflVar).a().b();
                } else if (mflVar instanceof lfl) {
                    b = ((lfl) mflVar).a().b();
                } else {
                    w511.b();
                }
                int i42 = hashCode23 + b;
                mflVar.a = Integer.valueOf(i42);
                i17 = i42;
            }
            int i43 = hashCode22 + i17;
            m8l m8lVar = this.b0;
            int hashCode24 = this.c0.hashCode() + i43 + (m8lVar == null ? m8lVar.b() : 0);
            list = this.d0;
            if (list == null) {
                Iterator it19 = list.iterator();
                i18 = 0;
                while (it19.hasNext()) {
                    i18 += ((gil) it19.next()).b();
                }
            } else {
                i18 = 0;
            }
            int i44 = hashCode24 + i18;
            DivTransform divTransform = this.e0;
            int b8 = i44 + (divTransform == null ? divTransform.b() : 0);
            list2 = this.f0;
            if (list2 == null) {
                Iterator it20 = list2.iterator();
                i19 = 0;
                while (it20.hasNext()) {
                    i19 += ((xjl) it20.next()).b();
                }
            } else {
                i19 = 0;
            }
            int i45 = b8 + i19;
            DivChangeTransition divChangeTransition = this.g0;
            int b9 = i45 + (divChangeTransition == null ? divChangeTransition.b() : 0);
            DivAppearanceTransition divAppearanceTransition = this.h0;
            int b10 = b9 + (divAppearanceTransition == null ? divAppearanceTransition.b() : 0);
            DivAppearanceTransition divAppearanceTransition2 = this.i0;
            int b11 = b10 + (divAppearanceTransition2 == null ? divAppearanceTransition2.b() : 0);
            List list24 = this.j0;
            int hashCode25 = this.l0.hashCode() + this.k0.hashCode() + b11 + (list24 == null ? list24.hashCode() : 0);
            list3 = this.m0;
            if (list3 == null) {
                Iterator it21 = list3.iterator();
                i20 = 0;
                while (it21.hasNext()) {
                    i20 += ((lll) it21.next()).b();
                }
            } else {
                i20 = 0;
            }
            int i46 = hashCode25 + i20;
            list4 = this.n0;
            if (list4 == null) {
                Iterator it22 = list4.iterator();
                i21 = 0;
                while (it22.hasNext()) {
                    i21 += ((c3) it22.next()).b();
                }
            } else {
                i21 = 0;
            }
            int hashCode26 = this.o0.hashCode() + i46 + i21;
            DivVisibilityAction divVisibilityAction = this.p0;
            int g = hashCode26 + (divVisibilityAction == null ? divVisibilityAction.g() : 0);
            list5 = this.q0;
            if (list5 != null) {
                Iterator it23 = list5.iterator();
                while (it23.hasNext()) {
                    i25 += ((DivVisibilityAction) it23.next()).g();
                }
            }
            int b12 = this.r0.b() + g + i25;
            this.s0 = Integer.valueOf(b12);
            return b12;
        }
        i17 = 0;
        int i432 = hashCode22 + i17;
        m8l m8lVar2 = this.b0;
        int hashCode242 = this.c0.hashCode() + i432 + (m8lVar2 == null ? m8lVar2.b() : 0);
        list = this.d0;
        if (list == null) {
        }
        int i442 = hashCode242 + i18;
        DivTransform divTransform2 = this.e0;
        int b82 = i442 + (divTransform2 == null ? divTransform2.b() : 0);
        list2 = this.f0;
        if (list2 == null) {
        }
        int i452 = b82 + i19;
        DivChangeTransition divChangeTransition2 = this.g0;
        int b92 = i452 + (divChangeTransition2 == null ? divChangeTransition2.b() : 0);
        DivAppearanceTransition divAppearanceTransition3 = this.h0;
        int b102 = b92 + (divAppearanceTransition3 == null ? divAppearanceTransition3.b() : 0);
        DivAppearanceTransition divAppearanceTransition22 = this.i0;
        int b112 = b102 + (divAppearanceTransition22 == null ? divAppearanceTransition22.b() : 0);
        List list242 = this.j0;
        int hashCode252 = this.l0.hashCode() + this.k0.hashCode() + b112 + (list242 == null ? list242.hashCode() : 0);
        list3 = this.m0;
        if (list3 == null) {
        }
        int i462 = hashCode252 + i20;
        list4 = this.n0;
        if (list4 == null) {
        }
        int hashCode262 = this.o0.hashCode() + i462 + i21;
        DivVisibilityAction divVisibilityAction2 = this.p0;
        int g2 = hashCode262 + (divVisibilityAction2 == null ? divVisibilityAction2.g() : 0);
        list5 = this.q0;
        if (list5 != null) {
        }
        int b122 = this.r0.b() + g2 + i25;
        this.s0 = Integer.valueOf(b122);
        return b122;
    }

    @Override // defpackage.egk
    public final Expression a() {
        return this.g;
    }

    @Override // defpackage.egk
    public final List b() {
        return this.q0;
    }

    @Override // defpackage.egk
    public final Expression c() {
        return this.m;
    }

    @Override // defpackage.egk
    public final List d() {
        return this.n0;
    }

    @Override // defpackage.egk
    public final DivEdgeInsets e() {
        return this.K;
    }

    @Override // defpackage.egk
    public final Expression f() {
        return this.S;
    }

    @Override // defpackage.egk
    public final Expression g() {
        return this.R;
    }

    @Override // defpackage.egk
    public final List getBackground() {
        return this.j;
    }

    @Override // defpackage.egk
    public final List getExtensions() {
        return this.q;
    }

    @Override // defpackage.egk
    public final DivSize getHeight() {
        return this.B;
    }

    @Override // defpackage.egk
    public final String getId() {
        return this.E;
    }

    @Override // defpackage.egk
    public final Expression getVisibility() {
        return this.o0;
    }

    @Override // defpackage.egk
    public final DivSize getWidth() {
        return this.r0;
    }

    @Override // defpackage.egk
    public final Expression h() {
        return this.e;
    }

    @Override // defpackage.egk
    public final List i() {
        return this.d0;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition j() {
        return this.i0;
    }

    @Override // defpackage.egk
    public final DivChangeTransition k() {
        return this.g0;
    }

    @Override // defpackage.egk
    public final List l() {
        return this.n;
    }

    @Override // defpackage.egk
    public final DivTransform m() {
        return this.e0;
    }

    @Override // defpackage.egk
    public final List n() {
        return this.j0;
    }

    @Override // defpackage.egk
    public final Expression o() {
        return this.f;
    }

    @Override // defpackage.egk
    public final DivFocus p() {
        return this.r;
    }

    @Override // defpackage.egk
    public final DivAccessibility q() {
        return this.a;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((vfl) ft6.b.K8.getValue()).b(ft6.a, this);
    }

    @Override // defpackage.egk
    public final DivEdgeInsets s() {
        return this.N;
    }

    @Override // defpackage.egk
    public final List t() {
        return this.U;
    }

    @Override // defpackage.egk
    public final DivLayoutProvider u() {
        return this.G;
    }

    @Override // defpackage.egk
    public final List v() {
        return this.m0;
    }

    @Override // defpackage.egk
    public final DivVisibilityAction w() {
        return this.p0;
    }

    @Override // defpackage.egk
    public final List x() {
        return this.A;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition y() {
        return this.h0;
    }

    @Override // defpackage.egk
    public final List z() {
        return this.h;
    }
}
