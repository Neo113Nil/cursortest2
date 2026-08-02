package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class clk implements c4x, egk {
    public final DivChangeTransition A;
    public final DivAppearanceTransition B;
    public final DivAppearanceTransition C;
    public final List D;
    public final List E;
    public final List F;
    public final Expression G;
    public final DivVisibilityAction H;
    public final List I;
    public final DivSize J;
    public Integer K;
    public Integer L;
    public final DivAccessibility a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final List e;
    public final List f;
    public final DivBorder g;
    public final Expression h;
    public final JSONObject i;
    public final String j;
    public final List k;
    public final List l;
    public final DivFocus m;
    public final List n;
    public final DivSize o;
    public final String p;
    public final List q;
    public final DivLayoutProvider r;
    public final DivEdgeInsets s;
    public final DivEdgeInsets t;
    public final Expression u;
    public final Expression v;
    public final List w;
    public final List x;
    public final DivTransform y;
    public final List z;

    static {
        ngd0.m(Double.valueOf(1.0d));
        ngd0.m(DivVisibility.VISIBLE);
    }

    public clk(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, JSONObject jSONObject, String str, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str2, List list6, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression5, Expression expression6, List list7, List list8, DivTransform divTransform, List list9, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list10, List list11, List list12, Expression expression7, DivVisibilityAction divVisibilityAction, List list13, DivSize divSize2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = list2;
        this.g = divBorder;
        this.h = expression4;
        this.i = jSONObject;
        this.j = str;
        this.k = list3;
        this.l = list4;
        this.m = divFocus;
        this.n = list5;
        this.o = divSize;
        this.p = str2;
        this.q = list6;
        this.r = divLayoutProvider;
        this.s = divEdgeInsets;
        this.t = divEdgeInsets2;
        this.u = expression5;
        this.v = expression6;
        this.w = list7;
        this.x = list8;
        this.y = divTransform;
        this.z = list9;
        this.A = divChangeTransition;
        this.B = divAppearanceTransition;
        this.C = divAppearanceTransition2;
        this.D = list10;
        this.E = list11;
        this.F = list12;
        this.G = expression7;
        this.H = divVisibilityAction;
        this.I = list13;
        this.J = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    public static clk B(clk clkVar, String str, ArrayList arrayList, int i) {
        DivAccessibility divAccessibility;
        String str2;
        DivAccessibility divAccessibility2 = clkVar.a;
        Expression expression = clkVar.b;
        Expression expression2 = clkVar.c;
        Expression expression3 = clkVar.d;
        List list = clkVar.e;
        List list2 = clkVar.f;
        DivBorder divBorder = clkVar.g;
        Expression expression4 = clkVar.h;
        JSONObject jSONObject = clkVar.i;
        String str3 = clkVar.j;
        List list3 = clkVar.k;
        List list4 = clkVar.l;
        DivFocus divFocus = clkVar.m;
        List list5 = clkVar.n;
        DivSize divSize = clkVar.o;
        if ((i & 32768) != 0) {
            divAccessibility = divAccessibility2;
            str2 = clkVar.p;
        } else {
            divAccessibility = divAccessibility2;
            str2 = str;
        }
        String str4 = str2;
        ArrayList arrayList2 = (i & 65536) != 0 ? clkVar.q : arrayList;
        DivLayoutProvider divLayoutProvider = clkVar.r;
        DivEdgeInsets divEdgeInsets = clkVar.s;
        DivEdgeInsets divEdgeInsets2 = clkVar.t;
        Expression expression5 = clkVar.u;
        Expression expression6 = clkVar.v;
        List list6 = clkVar.w;
        List list7 = clkVar.x;
        DivTransform divTransform = clkVar.y;
        List list8 = clkVar.z;
        DivChangeTransition divChangeTransition = clkVar.A;
        DivAppearanceTransition divAppearanceTransition = clkVar.B;
        DivAppearanceTransition divAppearanceTransition2 = clkVar.C;
        List list9 = clkVar.D;
        List list10 = clkVar.E;
        List list11 = clkVar.F;
        Expression expression7 = clkVar.G;
        DivVisibilityAction divVisibilityAction = clkVar.H;
        List list12 = clkVar.I;
        DivSize divSize2 = clkVar.J;
        clkVar.getClass();
        return new clk(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, jSONObject, str3, list3, list4, divFocus, list5, divSize, str4, arrayList2, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expression5, expression6, list6, list7, divTransform, list8, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list9, list10, list11, expression7, divVisibilityAction, list12, divSize2);
    }

    @Override // defpackage.egk
    public final DivBorder A() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:335:0x0509, code lost:
    
        if (r3 == null) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x04a9, code lost:
    
        if (r3 == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0466, code lost:
    
        if (r3 == null) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0423, code lost:
    
        if (r3 == null) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x03b0, code lost:
    
        if (r3 == null) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x035b, code lost:
    
        if (r3 == null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0318, code lost:
    
        if (r3 == null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0263, code lost:
    
        if (r3 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x020c, code lost:
    
        if (r3 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x01b7, code lost:
    
        if (r3 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0174, code lost:
    
        if (r3 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x00ed, code lost:
    
        if (r3 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x00aa, code lost:
    
        if (r3 == null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(clk clkVar, rvo rvoVar, rvo rvoVar2) {
        if (clkVar != null) {
            DivAccessibility divAccessibility = clkVar.a;
            DivAccessibility divAccessibility2 = this.a;
            if (divAccessibility2 != null ? divAccessibility2.a(divAccessibility, rvoVar, rvoVar2) : divAccessibility == null) {
                Expression expression = this.b;
                DivAlignmentHorizontal divAlignmentHorizontal = expression != null ? (DivAlignmentHorizontal) expression.a(rvoVar) : null;
                Expression expression2 = clkVar.b;
                if (divAlignmentHorizontal == (expression2 != null ? (DivAlignmentHorizontal) expression2.a(rvoVar2) : null)) {
                    Expression expression3 = this.c;
                    DivAlignmentVertical divAlignmentVertical = expression3 != null ? (DivAlignmentVertical) expression3.a(rvoVar) : null;
                    Expression expression4 = clkVar.c;
                    if (divAlignmentVertical == (expression4 != null ? (DivAlignmentVertical) expression4.a(rvoVar2) : null) && ((Number) this.d.a(rvoVar)).doubleValue() == ((Number) clkVar.d.a(rvoVar2)).doubleValue()) {
                        List list = clkVar.e;
                        List list2 = this.e;
                        if (list2 != null) {
                            if (list != null && list2.size() == list.size()) {
                                int i = 0;
                                for (Object obj : list2) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    if (!((ydk) obj).a((ydk) list.get(i), rvoVar, rvoVar2)) {
                                        break;
                                    }
                                    i = i2;
                                }
                                List list3 = clkVar.f;
                                List list4 = this.f;
                                if (list4 != null) {
                                    if (list3 != null && list4.size() == list3.size()) {
                                        int i3 = 0;
                                        for (Object obj2 : list4) {
                                            int i4 = i3 + 1;
                                            if (i3 < 0) {
                                                scc.m();
                                                throw null;
                                            }
                                            if (!((kfk) obj2).a((kfk) list3.get(i3), rvoVar, rvoVar2)) {
                                                break;
                                            }
                                            i3 = i4;
                                        }
                                        DivBorder divBorder = clkVar.g;
                                        DivBorder divBorder2 = this.g;
                                        if (divBorder2 != null ? divBorder2.a(divBorder, rvoVar, rvoVar2) : divBorder == null) {
                                            Expression expression5 = this.h;
                                            Long l = expression5 != null ? (Long) expression5.a(rvoVar) : null;
                                            Expression expression6 = clkVar.h;
                                            if (jl40.l(l, expression6 != null ? (Long) expression6.a(rvoVar2) : null) && jl40.l(this.i, clkVar.i) && jl40.l(this.j, clkVar.j)) {
                                                List list5 = clkVar.k;
                                                List list6 = this.k;
                                                if (list6 != null) {
                                                    if (list5 != null && list6.size() == list5.size()) {
                                                        int i5 = 0;
                                                        for (Object obj3 : list6) {
                                                            int i6 = i5 + 1;
                                                            if (i5 < 0) {
                                                                scc.m();
                                                                throw null;
                                                            }
                                                            if (!((nnk) obj3).f((nnk) list5.get(i5), rvoVar, rvoVar2)) {
                                                                break;
                                                            }
                                                            i5 = i6;
                                                        }
                                                        List list7 = clkVar.l;
                                                        List list8 = this.l;
                                                        if (list8 != null) {
                                                            if (list7 != null && list8.size() == list7.size()) {
                                                                int i7 = 0;
                                                                for (Object obj4 : list8) {
                                                                    int i8 = i7 + 1;
                                                                    if (i7 < 0) {
                                                                        scc.m();
                                                                        throw null;
                                                                    }
                                                                    if (!((bpk) obj4).a((bpk) list7.get(i7))) {
                                                                        break;
                                                                    }
                                                                    i7 = i8;
                                                                }
                                                                DivFocus divFocus = clkVar.m;
                                                                DivFocus divFocus2 = this.m;
                                                                if (divFocus2 != null ? divFocus2.a(divFocus, rvoVar, rvoVar2) : divFocus == null) {
                                                                    List list9 = clkVar.n;
                                                                    List list10 = this.n;
                                                                    if (list10 != null) {
                                                                        if (list9 != null && list10.size() == list9.size()) {
                                                                            int i9 = 0;
                                                                            for (Object obj5 : list10) {
                                                                                int i10 = i9 + 1;
                                                                                if (i9 < 0) {
                                                                                    scc.m();
                                                                                    throw null;
                                                                                }
                                                                                if (!((irk) obj5).a((irk) list9.get(i9))) {
                                                                                    break;
                                                                                }
                                                                                i9 = i10;
                                                                            }
                                                                            if (this.o.a(clkVar.o, rvoVar, rvoVar2) && jl40.l(this.p, clkVar.p)) {
                                                                                List list11 = clkVar.q;
                                                                                List list12 = this.q;
                                                                                if (list12 != null) {
                                                                                    if (list11 != null && list12.size() == list11.size()) {
                                                                                        int i11 = 0;
                                                                                        for (Object obj6 : list12) {
                                                                                            int i12 = i11 + 1;
                                                                                            if (i11 < 0) {
                                                                                                scc.m();
                                                                                                throw null;
                                                                                            }
                                                                                            if (!((m3k) obj6).a((m3k) list11.get(i11), rvoVar, rvoVar2)) {
                                                                                                break;
                                                                                            }
                                                                                            i11 = i12;
                                                                                        }
                                                                                        DivLayoutProvider divLayoutProvider = clkVar.r;
                                                                                        DivLayoutProvider divLayoutProvider2 = this.r;
                                                                                        if (divLayoutProvider2 != null ? divLayoutProvider2.a(divLayoutProvider) : divLayoutProvider == null) {
                                                                                            DivEdgeInsets divEdgeInsets = clkVar.s;
                                                                                            DivEdgeInsets divEdgeInsets2 = this.s;
                                                                                            if (divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) {
                                                                                                DivEdgeInsets divEdgeInsets3 = clkVar.t;
                                                                                                DivEdgeInsets divEdgeInsets4 = this.t;
                                                                                                if (divEdgeInsets4 != null ? divEdgeInsets4.a(divEdgeInsets3, rvoVar, rvoVar2) : divEdgeInsets3 == null) {
                                                                                                    Expression expression7 = this.u;
                                                                                                    String str = expression7 != null ? (String) expression7.a(rvoVar) : null;
                                                                                                    Expression expression8 = clkVar.u;
                                                                                                    if (jl40.l(str, expression8 != null ? (String) expression8.a(rvoVar2) : null)) {
                                                                                                        Expression expression9 = this.v;
                                                                                                        Long l2 = expression9 != null ? (Long) expression9.a(rvoVar) : null;
                                                                                                        Expression expression10 = clkVar.v;
                                                                                                        if (jl40.l(l2, expression10 != null ? (Long) expression10.a(rvoVar2) : null)) {
                                                                                                            List list13 = clkVar.w;
                                                                                                            List list14 = this.w;
                                                                                                            if (list14 != null) {
                                                                                                                if (list13 != null && list14.size() == list13.size()) {
                                                                                                                    int i13 = 0;
                                                                                                                    for (Object obj7 : list14) {
                                                                                                                        int i14 = i13 + 1;
                                                                                                                        if (i13 < 0) {
                                                                                                                            scc.m();
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        if (!((v3k) obj7).a((v3k) list13.get(i13), rvoVar, rvoVar2)) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        i13 = i14;
                                                                                                                    }
                                                                                                                    List list15 = clkVar.x;
                                                                                                                    List list16 = this.x;
                                                                                                                    if (list16 != null) {
                                                                                                                        if (list15 != null && list16.size() == list15.size()) {
                                                                                                                            int i15 = 0;
                                                                                                                            for (Object obj8 : list16) {
                                                                                                                                int i16 = i15 + 1;
                                                                                                                                if (i15 < 0) {
                                                                                                                                    scc.m();
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                if (!((gil) obj8).a((gil) list15.get(i15), rvoVar, rvoVar2)) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                i15 = i16;
                                                                                                                            }
                                                                                                                            DivTransform divTransform = clkVar.y;
                                                                                                                            DivTransform divTransform2 = this.y;
                                                                                                                            if (divTransform2 != null ? divTransform2.a(divTransform, rvoVar, rvoVar2) : divTransform == null) {
                                                                                                                                List list17 = clkVar.z;
                                                                                                                                List list18 = this.z;
                                                                                                                                if (list18 != null) {
                                                                                                                                    if (list17 != null && list18.size() == list17.size()) {
                                                                                                                                        int i17 = 0;
                                                                                                                                        for (Object obj9 : list18) {
                                                                                                                                            int i18 = i17 + 1;
                                                                                                                                            if (i17 < 0) {
                                                                                                                                                scc.m();
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            if (!((xjl) obj9).a((xjl) list17.get(i17), rvoVar, rvoVar2)) {
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i17 = i18;
                                                                                                                                        }
                                                                                                                                        DivChangeTransition divChangeTransition = clkVar.A;
                                                                                                                                        DivChangeTransition divChangeTransition2 = this.A;
                                                                                                                                        if (divChangeTransition2 != null ? divChangeTransition2.a(divChangeTransition, rvoVar, rvoVar2) : divChangeTransition == null) {
                                                                                                                                            DivAppearanceTransition divAppearanceTransition = clkVar.B;
                                                                                                                                            DivAppearanceTransition divAppearanceTransition2 = this.B;
                                                                                                                                            if (divAppearanceTransition2 != null ? divAppearanceTransition2.a(divAppearanceTransition, rvoVar, rvoVar2) : divAppearanceTransition == null) {
                                                                                                                                                DivAppearanceTransition divAppearanceTransition3 = clkVar.C;
                                                                                                                                                DivAppearanceTransition divAppearanceTransition4 = this.C;
                                                                                                                                                if (divAppearanceTransition4 != null ? divAppearanceTransition4.a(divAppearanceTransition3, rvoVar, rvoVar2) : divAppearanceTransition3 == null) {
                                                                                                                                                    List list19 = clkVar.D;
                                                                                                                                                    List list20 = this.D;
                                                                                                                                                    if (list20 != null) {
                                                                                                                                                        if (list19 != null && list20.size() == list19.size()) {
                                                                                                                                                            int i19 = 0;
                                                                                                                                                            for (Object obj10 : list20) {
                                                                                                                                                                int i20 = i19 + 1;
                                                                                                                                                                if (i19 < 0) {
                                                                                                                                                                    scc.m();
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (((DivTransitionTrigger) obj10) != ((DivTransitionTrigger) list19.get(i19))) {
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                i19 = i20;
                                                                                                                                                            }
                                                                                                                                                            List list21 = clkVar.E;
                                                                                                                                                            List list22 = this.E;
                                                                                                                                                            if (list22 != null) {
                                                                                                                                                                if (list21 != null && list22.size() == list21.size()) {
                                                                                                                                                                    int i21 = 0;
                                                                                                                                                                    for (Object obj11 : list22) {
                                                                                                                                                                        int i22 = i21 + 1;
                                                                                                                                                                        if (i21 < 0) {
                                                                                                                                                                            scc.m();
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        if (!((lll) obj11).a((lll) list21.get(i21), rvoVar, rvoVar2)) {
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        i21 = i22;
                                                                                                                                                                    }
                                                                                                                                                                    List list23 = clkVar.F;
                                                                                                                                                                    List list24 = this.F;
                                                                                                                                                                    if (list24 != null) {
                                                                                                                                                                        if (list23 != null && list24.size() == list23.size()) {
                                                                                                                                                                            int i23 = 0;
                                                                                                                                                                            for (Object obj12 : list24) {
                                                                                                                                                                                int i24 = i23 + 1;
                                                                                                                                                                                if (i23 < 0) {
                                                                                                                                                                                    scc.m();
                                                                                                                                                                                    throw null;
                                                                                                                                                                                }
                                                                                                                                                                                if (!((c3) obj12).a((c3) list23.get(i23), rvoVar, rvoVar2)) {
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                i23 = i24;
                                                                                                                                                                            }
                                                                                                                                                                            if (this.G.a(rvoVar) == clkVar.G.a(rvoVar2)) {
                                                                                                                                                                                DivVisibilityAction divVisibilityAction = clkVar.H;
                                                                                                                                                                                DivVisibilityAction divVisibilityAction2 = this.H;
                                                                                                                                                                                if (divVisibilityAction2 != null ? divVisibilityAction2.f(divVisibilityAction, rvoVar, rvoVar2) : divVisibilityAction == null) {
                                                                                                                                                                                    List list25 = clkVar.I;
                                                                                                                                                                                    List list26 = this.I;
                                                                                                                                                                                    if (list26 != null) {
                                                                                                                                                                                        if (list25 != null && list26.size() == list25.size()) {
                                                                                                                                                                                            int i25 = 0;
                                                                                                                                                                                            for (Object obj13 : list26) {
                                                                                                                                                                                                int i26 = i25 + 1;
                                                                                                                                                                                                if (i25 < 0) {
                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (!((DivVisibilityAction) obj13).f((DivVisibilityAction) list25.get(i25), rvoVar, rvoVar2)) {
                                                                                                                                                                                                    break;
                                                                                                                                                                                                }
                                                                                                                                                                                                i25 = i26;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (this.J.a(clkVar.J, rvoVar, rvoVar2)) {
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
        Integer num = this.K;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(clk.class).hashCode();
        int i11 = 0;
        DivAccessibility divAccessibility = this.a;
        int b = hashCode + (divAccessibility != null ? divAccessibility.b() : 0);
        Expression expression = this.b;
        int hashCode2 = b + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.c;
        int hashCode3 = this.d.hashCode() + hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        List list = this.e;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((ydk) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i12 = hashCode3 + i;
        List list2 = this.f;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((kfk) it2.next()).b();
            }
        } else {
            i2 = 0;
        }
        int i13 = i12 + i2;
        DivBorder divBorder = this.g;
        int b2 = i13 + (divBorder != null ? divBorder.b() : 0);
        Expression expression3 = this.h;
        int hashCode4 = b2 + (expression3 != null ? expression3.hashCode() : 0);
        JSONObject jSONObject = this.i;
        int hashCode5 = this.j.hashCode() + hashCode4 + (jSONObject != null ? jSONObject.hashCode() : 0);
        List list3 = this.k;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((nnk) it3.next()).g();
            }
        } else {
            i3 = 0;
        }
        int i14 = hashCode5 + i3;
        List list4 = this.l;
        if (list4 != null) {
            Iterator it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((bpk) it4.next()).b();
            }
        } else {
            i4 = 0;
        }
        int i15 = i14 + i4;
        DivFocus divFocus = this.m;
        int b3 = i15 + (divFocus != null ? divFocus.b() : 0);
        List list5 = this.n;
        if (list5 != null) {
            Iterator it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((irk) it5.next()).b();
            }
        } else {
            i5 = 0;
        }
        int b4 = this.o.b() + b3 + i5;
        String str = this.p;
        int hashCode6 = b4 + (str != null ? str.hashCode() : 0);
        DivLayoutProvider divLayoutProvider = this.r;
        int b5 = hashCode6 + (divLayoutProvider != null ? divLayoutProvider.b() : 0);
        DivEdgeInsets divEdgeInsets = this.s;
        int b6 = b5 + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        DivEdgeInsets divEdgeInsets2 = this.t;
        int b7 = b6 + (divEdgeInsets2 != null ? divEdgeInsets2.b() : 0);
        Expression expression4 = this.u;
        int hashCode7 = b7 + (expression4 != null ? expression4.hashCode() : 0);
        Expression expression5 = this.v;
        int hashCode8 = hashCode7 + (expression5 != null ? expression5.hashCode() : 0);
        List list6 = this.w;
        if (list6 != null) {
            Iterator it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((v3k) it6.next()).b();
            }
        } else {
            i6 = 0;
        }
        int i16 = hashCode8 + i6;
        List list7 = this.x;
        if (list7 != null) {
            Iterator it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((gil) it7.next()).b();
            }
        } else {
            i7 = 0;
        }
        int i17 = i16 + i7;
        DivTransform divTransform = this.y;
        int b8 = i17 + (divTransform != null ? divTransform.b() : 0);
        List list8 = this.z;
        if (list8 != null) {
            Iterator it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((xjl) it8.next()).b();
            }
        } else {
            i8 = 0;
        }
        int i18 = b8 + i8;
        DivChangeTransition divChangeTransition = this.A;
        int b9 = i18 + (divChangeTransition != null ? divChangeTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition = this.B;
        int b10 = b9 + (divAppearanceTransition != null ? divAppearanceTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition2 = this.C;
        int b11 = b10 + (divAppearanceTransition2 != null ? divAppearanceTransition2.b() : 0);
        List list9 = this.D;
        int hashCode9 = b11 + (list9 != null ? list9.hashCode() : 0);
        List list10 = this.E;
        if (list10 != null) {
            Iterator it9 = list10.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((lll) it9.next()).b();
            }
        } else {
            i9 = 0;
        }
        int i19 = hashCode9 + i9;
        List list11 = this.F;
        if (list11 != null) {
            Iterator it10 = list11.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((c3) it10.next()).b();
            }
        } else {
            i10 = 0;
        }
        int hashCode10 = this.G.hashCode() + i19 + i10;
        DivVisibilityAction divVisibilityAction = this.H;
        int g = hashCode10 + (divVisibilityAction != null ? divVisibilityAction.g() : 0);
        List list12 = this.I;
        if (list12 != null) {
            Iterator it11 = list12.iterator();
            while (it11.hasNext()) {
                i11 += ((DivVisibilityAction) it11.next()).g();
            }
        }
        int b12 = this.J.b() + g + i11;
        this.K = Integer.valueOf(b12);
        return b12;
    }

    @Override // defpackage.egk
    public final Expression a() {
        return this.d;
    }

    @Override // defpackage.egk
    public final List b() {
        return this.I;
    }

    @Override // defpackage.egk
    public final Expression c() {
        return this.h;
    }

    @Override // defpackage.egk
    public final List d() {
        return this.F;
    }

    @Override // defpackage.egk
    public final DivEdgeInsets e() {
        return this.s;
    }

    @Override // defpackage.egk
    public final Expression f() {
        return this.v;
    }

    @Override // defpackage.egk
    public final Expression g() {
        return this.u;
    }

    @Override // defpackage.egk
    public final List getBackground() {
        return this.f;
    }

    @Override // defpackage.egk
    public final List getExtensions() {
        return this.l;
    }

    @Override // defpackage.egk
    public final DivSize getHeight() {
        return this.o;
    }

    @Override // defpackage.egk
    public final String getId() {
        return this.p;
    }

    @Override // defpackage.egk
    public final Expression getVisibility() {
        return this.G;
    }

    @Override // defpackage.egk
    public final DivSize getWidth() {
        return this.J;
    }

    @Override // defpackage.egk
    public final Expression h() {
        return this.b;
    }

    @Override // defpackage.egk
    public final List i() {
        return this.x;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition j() {
        return this.C;
    }

    @Override // defpackage.egk
    public final DivChangeTransition k() {
        return this.A;
    }

    @Override // defpackage.egk
    public final List l() {
        return this.k;
    }

    @Override // defpackage.egk
    public final DivTransform m() {
        return this.y;
    }

    @Override // defpackage.egk
    public final List n() {
        return this.D;
    }

    @Override // defpackage.egk
    public final Expression o() {
        return this.c;
    }

    @Override // defpackage.egk
    public final DivFocus p() {
        return this.m;
    }

    @Override // defpackage.egk
    public final DivAccessibility q() {
        return this.a;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((ulk) ft6.b.K2.getValue()).b(ft6.a, this);
    }

    @Override // defpackage.egk
    public final DivEdgeInsets s() {
        return this.t;
    }

    @Override // defpackage.egk
    public final List t() {
        return this.w;
    }

    @Override // defpackage.egk
    public final DivLayoutProvider u() {
        return this.r;
    }

    @Override // defpackage.egk
    public final List v() {
        return this.E;
    }

    @Override // defpackage.egk
    public final DivVisibilityAction w() {
        return this.H;
    }

    @Override // defpackage.egk
    public final List x() {
        return this.n;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition y() {
        return this.B;
    }

    @Override // defpackage.egk
    public final List z() {
        return this.e;
    }
}
