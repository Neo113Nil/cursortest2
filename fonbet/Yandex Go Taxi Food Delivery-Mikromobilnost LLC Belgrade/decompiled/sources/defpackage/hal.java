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
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class hal implements c4x, egk {
    public final List A;
    public final aok B;
    public final gal C;
    public final String D;
    public final aok E;
    public final gal F;
    public final String G;
    public final aok H;
    public final aok I;
    public final List J;
    public final aok K;
    public final aok L;
    public final DivTransform M;
    public final List N;
    public final DivChangeTransition O;
    public final DivAppearanceTransition P;
    public final DivAppearanceTransition Q;
    public final List R;
    public final List S;
    public final List T;
    public final Expression U;
    public final DivVisibilityAction V;
    public final List W;
    public final DivSize X;
    public Integer Y;
    public final DivAccessibility a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final List e;
    public final List f;
    public final DivBorder g;
    public final Expression h;
    public final List i;
    public final List j;
    public final DivFocus k;
    public final List l;
    public final DivSize m;
    public final String n;
    public final Expression o;
    public final DivLayoutProvider p;
    public final DivEdgeInsets q;
    public final Expression r;
    public final Expression s;
    public final DivEdgeInsets t;
    public final List u;
    public final List v;
    public final List w;
    public final Expression x;
    public final Expression y;
    public final DivAccessibility z;

    static {
        ngd0.m(Double.valueOf(1.0d));
        ngd0.m(Boolean.TRUE);
        ngd0.m(100L);
        ngd0.m(0L);
        ngd0.m(DivVisibility.VISIBLE);
    }

    public hal(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression5, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression6, Expression expression7, DivEdgeInsets divEdgeInsets2, List list6, List list7, List list8, Expression expression8, Expression expression9, DivAccessibility divAccessibility2, List list9, aok aokVar, gal galVar, String str2, aok aokVar2, gal galVar2, String str3, aok aokVar3, aok aokVar4, List list10, aok aokVar5, aok aokVar6, DivTransform divTransform, List list11, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list12, List list13, List list14, Expression expression10, DivVisibilityAction divVisibilityAction, List list15, DivSize divSize2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = list2;
        this.g = divBorder;
        this.h = expression4;
        this.i = list3;
        this.j = list4;
        this.k = divFocus;
        this.l = list5;
        this.m = divSize;
        this.n = str;
        this.o = expression5;
        this.p = divLayoutProvider;
        this.q = divEdgeInsets;
        this.r = expression6;
        this.s = expression7;
        this.t = divEdgeInsets2;
        this.u = list6;
        this.v = list7;
        this.w = list8;
        this.x = expression8;
        this.y = expression9;
        this.z = divAccessibility2;
        this.A = list9;
        this.B = aokVar;
        this.C = galVar;
        this.D = str2;
        this.E = aokVar2;
        this.F = galVar2;
        this.G = str3;
        this.H = aokVar3;
        this.I = aokVar4;
        this.J = list10;
        this.K = aokVar5;
        this.L = aokVar6;
        this.M = divTransform;
        this.N = list11;
        this.O = divChangeTransition;
        this.P = divAppearanceTransition;
        this.Q = divAppearanceTransition2;
        this.R = list12;
        this.S = list13;
        this.T = list14;
        this.U = expression10;
        this.V = divVisibilityAction;
        this.W = list15;
        this.X = divSize2;
    }

    public static hal B(hal halVar, String str) {
        DivAccessibility divAccessibility = halVar.a;
        Expression expression = halVar.b;
        Expression expression2 = halVar.c;
        Expression expression3 = halVar.d;
        List list = halVar.e;
        List list2 = halVar.f;
        DivBorder divBorder = halVar.g;
        Expression expression4 = halVar.h;
        List list3 = halVar.i;
        List list4 = halVar.j;
        DivFocus divFocus = halVar.k;
        List list5 = halVar.l;
        DivSize divSize = halVar.m;
        Expression expression5 = halVar.o;
        DivLayoutProvider divLayoutProvider = halVar.p;
        DivEdgeInsets divEdgeInsets = halVar.q;
        Expression expression6 = halVar.r;
        Expression expression7 = halVar.s;
        DivEdgeInsets divEdgeInsets2 = halVar.t;
        List list6 = halVar.u;
        List list7 = halVar.v;
        List list8 = halVar.w;
        Expression expression8 = halVar.x;
        Expression expression9 = halVar.y;
        DivAccessibility divAccessibility2 = halVar.z;
        List list9 = halVar.A;
        aok aokVar = halVar.B;
        gal galVar = halVar.C;
        String str2 = halVar.D;
        aok aokVar2 = halVar.E;
        gal galVar2 = halVar.F;
        String str3 = halVar.G;
        aok aokVar3 = halVar.H;
        aok aokVar4 = halVar.I;
        List list10 = halVar.J;
        aok aokVar5 = halVar.K;
        aok aokVar6 = halVar.L;
        DivTransform divTransform = halVar.M;
        List list11 = halVar.N;
        DivChangeTransition divChangeTransition = halVar.O;
        DivAppearanceTransition divAppearanceTransition = halVar.P;
        DivAppearanceTransition divAppearanceTransition2 = halVar.Q;
        List list12 = halVar.R;
        List list13 = halVar.S;
        List list14 = halVar.T;
        Expression expression10 = halVar.U;
        DivVisibilityAction divVisibilityAction = halVar.V;
        List list15 = halVar.W;
        DivSize divSize2 = halVar.X;
        halVar.getClass();
        return new hal(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, list3, list4, divFocus, list5, divSize, str, expression5, divLayoutProvider, divEdgeInsets, expression6, expression7, divEdgeInsets2, list6, list7, list8, expression8, expression9, divAccessibility2, list9, aokVar, galVar, str2, aokVar2, galVar2, str3, aokVar3, aokVar4, list10, aokVar5, aokVar6, divTransform, list11, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list12, list13, list14, expression10, divVisibilityAction, list15, divSize2);
    }

    @Override // defpackage.egk
    public final DivBorder A() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:455:0x06dc, code lost:
    
        if (r3 == null) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x067c, code lost:
    
        if (r3 == null) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0639, code lost:
    
        if (r3 == null) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x05f6, code lost:
    
        if (r3 == null) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0583, code lost:
    
        if (r3 == null) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x051a, code lost:
    
        if (r3 == null) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x045f, code lost:
    
        if (r3 == null) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x03ce, code lost:
    
        if (r3 == null) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x031a, code lost:
    
        if (r3 == null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x02d7, code lost:
    
        if (r3 == null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x01f8, code lost:
    
        if (r3 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x01a3, code lost:
    
        if (r3 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0160, code lost:
    
        if (r3 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x00ed, code lost:
    
        if (r3 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x00aa, code lost:
    
        if (r3 == null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(hal halVar, rvo rvoVar, rvo rvoVar2) {
        if (halVar != null) {
            DivAccessibility divAccessibility = halVar.a;
            DivAccessibility divAccessibility2 = this.a;
            if (divAccessibility2 != null ? divAccessibility2.a(divAccessibility, rvoVar, rvoVar2) : divAccessibility == null) {
                Expression expression = this.b;
                DivAlignmentHorizontal divAlignmentHorizontal = expression != null ? (DivAlignmentHorizontal) expression.a(rvoVar) : null;
                Expression expression2 = halVar.b;
                if (divAlignmentHorizontal == (expression2 != null ? (DivAlignmentHorizontal) expression2.a(rvoVar2) : null)) {
                    Expression expression3 = this.c;
                    DivAlignmentVertical divAlignmentVertical = expression3 != null ? (DivAlignmentVertical) expression3.a(rvoVar) : null;
                    Expression expression4 = halVar.c;
                    if (divAlignmentVertical == (expression4 != null ? (DivAlignmentVertical) expression4.a(rvoVar2) : null) && ((Number) this.d.a(rvoVar)).doubleValue() == ((Number) halVar.d.a(rvoVar2)).doubleValue()) {
                        List list = halVar.e;
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
                                List list3 = halVar.f;
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
                                        DivBorder divBorder = halVar.g;
                                        DivBorder divBorder2 = this.g;
                                        if (divBorder2 != null ? divBorder2.a(divBorder, rvoVar, rvoVar2) : divBorder == null) {
                                            Expression expression5 = this.h;
                                            Long l = expression5 != null ? (Long) expression5.a(rvoVar) : null;
                                            Expression expression6 = halVar.h;
                                            if (jl40.l(l, expression6 != null ? (Long) expression6.a(rvoVar2) : null)) {
                                                List list5 = halVar.i;
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
                                                            if (!((nnk) obj3).f((nnk) list5.get(i5), rvoVar, rvoVar2)) {
                                                                break;
                                                            }
                                                            i5 = i6;
                                                        }
                                                        List list7 = halVar.j;
                                                        List list8 = this.j;
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
                                                                DivFocus divFocus = halVar.k;
                                                                DivFocus divFocus2 = this.k;
                                                                if (divFocus2 != null ? divFocus2.a(divFocus, rvoVar, rvoVar2) : divFocus == null) {
                                                                    List list9 = halVar.l;
                                                                    List list10 = this.l;
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
                                                                            if (this.m.a(halVar.m, rvoVar, rvoVar2) && jl40.l(this.n, halVar.n) && ((Boolean) this.o.a(rvoVar)).booleanValue() == ((Boolean) halVar.o.a(rvoVar2)).booleanValue()) {
                                                                                DivLayoutProvider divLayoutProvider = halVar.p;
                                                                                DivLayoutProvider divLayoutProvider2 = this.p;
                                                                                if (divLayoutProvider2 != null ? divLayoutProvider2.a(divLayoutProvider) : divLayoutProvider == null) {
                                                                                    DivEdgeInsets divEdgeInsets = halVar.q;
                                                                                    DivEdgeInsets divEdgeInsets2 = this.q;
                                                                                    if ((divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) && ((Number) this.r.a(rvoVar)).longValue() == ((Number) halVar.r.a(rvoVar2)).longValue() && ((Number) this.s.a(rvoVar)).longValue() == ((Number) halVar.s.a(rvoVar2)).longValue()) {
                                                                                        DivEdgeInsets divEdgeInsets3 = halVar.t;
                                                                                        DivEdgeInsets divEdgeInsets4 = this.t;
                                                                                        if (divEdgeInsets4 != null ? divEdgeInsets4.a(divEdgeInsets3, rvoVar, rvoVar2) : divEdgeInsets3 == null) {
                                                                                            List list11 = halVar.u;
                                                                                            List list12 = this.u;
                                                                                            if (list12 != null) {
                                                                                                if (list11 != null && list12.size() == list11.size()) {
                                                                                                    int i11 = 0;
                                                                                                    for (Object obj6 : list12) {
                                                                                                        int i12 = i11 + 1;
                                                                                                        if (i11 < 0) {
                                                                                                            scc.m();
                                                                                                            throw null;
                                                                                                        }
                                                                                                        if (!((v3k) obj6).a((v3k) list11.get(i11), rvoVar, rvoVar2)) {
                                                                                                            break;
                                                                                                        }
                                                                                                        i11 = i12;
                                                                                                    }
                                                                                                    List list13 = halVar.v;
                                                                                                    List list14 = this.v;
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
                                                                                                            List list15 = halVar.w;
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
                                                                                                                        fal falVar = (fal) list15.get(i15);
                                                                                                                        fal falVar2 = (fal) obj8;
                                                                                                                        if (falVar == null) {
                                                                                                                            falVar2.getClass();
                                                                                                                            return false;
                                                                                                                        }
                                                                                                                        Expression expression7 = falVar2.a;
                                                                                                                        Long l2 = expression7 != null ? (Long) expression7.a(rvoVar) : null;
                                                                                                                        Expression expression8 = falVar.a;
                                                                                                                        if (!jl40.l(l2, expression8 != null ? (Long) expression8.a(rvoVar2) : null)) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        DivEdgeInsets divEdgeInsets5 = falVar2.b;
                                                                                                                        DivEdgeInsets divEdgeInsets6 = falVar.b;
                                                                                                                        if (!(divEdgeInsets5 != null ? divEdgeInsets5.a(divEdgeInsets6, rvoVar, rvoVar2) : divEdgeInsets6 == null)) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        Expression expression9 = falVar2.c;
                                                                                                                        Long l3 = expression9 != null ? (Long) expression9.a(rvoVar) : null;
                                                                                                                        Expression expression10 = falVar.c;
                                                                                                                        if (!jl40.l(l3, expression10 != null ? (Long) expression10.a(rvoVar2) : null)) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        aok aokVar = falVar2.d;
                                                                                                                        aok aokVar2 = falVar.d;
                                                                                                                        if (!(aokVar != null ? aokVar.a(aokVar2, rvoVar, rvoVar2) : aokVar2 == null)) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        aok aokVar3 = falVar2.e;
                                                                                                                        aok aokVar4 = falVar.e;
                                                                                                                        if (!(aokVar3 != null ? aokVar3.a(aokVar4, rvoVar, rvoVar2) : aokVar4 == null)) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        i15 = i16;
                                                                                                                    }
                                                                                                                    Expression expression11 = this.x;
                                                                                                                    String str = expression11 != null ? (String) expression11.a(rvoVar) : null;
                                                                                                                    Expression expression12 = halVar.x;
                                                                                                                    if (jl40.l(str, expression12 != null ? (String) expression12.a(rvoVar2) : null)) {
                                                                                                                        Expression expression13 = this.y;
                                                                                                                        Long l4 = expression13 != null ? (Long) expression13.a(rvoVar) : null;
                                                                                                                        Expression expression14 = halVar.y;
                                                                                                                        if (jl40.l(l4, expression14 != null ? (Long) expression14.a(rvoVar2) : null)) {
                                                                                                                            DivAccessibility divAccessibility3 = halVar.z;
                                                                                                                            DivAccessibility divAccessibility4 = this.z;
                                                                                                                            if (divAccessibility4 != null ? divAccessibility4.a(divAccessibility3, rvoVar, rvoVar2) : divAccessibility3 == null) {
                                                                                                                                List list17 = halVar.A;
                                                                                                                                List list18 = this.A;
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
                                                                                                                                        aok aokVar5 = halVar.B;
                                                                                                                                        aok aokVar6 = this.B;
                                                                                                                                        if (aokVar6 != null ? aokVar6.a(aokVar5, rvoVar, rvoVar2) : aokVar5 == null) {
                                                                                                                                            gal galVar = halVar.C;
                                                                                                                                            gal galVar2 = this.C;
                                                                                                                                            if ((galVar2 != null ? galVar2.a(galVar, rvoVar, rvoVar2) : galVar == null) && jl40.l(this.D, halVar.D) && this.E.a(halVar.E, rvoVar, rvoVar2)) {
                                                                                                                                                gal galVar3 = halVar.F;
                                                                                                                                                gal galVar4 = this.F;
                                                                                                                                                if ((galVar4 != null ? galVar4.a(galVar3, rvoVar, rvoVar2) : galVar3 == null) && jl40.l(this.G, halVar.G)) {
                                                                                                                                                    aok aokVar7 = halVar.H;
                                                                                                                                                    aok aokVar8 = this.H;
                                                                                                                                                    if (aokVar8 != null ? aokVar8.a(aokVar7, rvoVar, rvoVar2) : aokVar7 == null) {
                                                                                                                                                        aok aokVar9 = halVar.I;
                                                                                                                                                        aok aokVar10 = this.I;
                                                                                                                                                        if (aokVar10 != null ? aokVar10.a(aokVar9, rvoVar, rvoVar2) : aokVar9 == null) {
                                                                                                                                                            List list19 = halVar.J;
                                                                                                                                                            List list20 = this.J;
                                                                                                                                                            if (list20 != null) {
                                                                                                                                                                if (list19 != null && list20.size() == list19.size()) {
                                                                                                                                                                    int i19 = 0;
                                                                                                                                                                    for (Object obj10 : list20) {
                                                                                                                                                                        int i20 = i19 + 1;
                                                                                                                                                                        if (i19 < 0) {
                                                                                                                                                                            scc.m();
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        if (!((gil) obj10).a((gil) list19.get(i19), rvoVar, rvoVar2)) {
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        i19 = i20;
                                                                                                                                                                    }
                                                                                                                                                                    if (this.K.a(halVar.K, rvoVar, rvoVar2) && this.L.a(halVar.L, rvoVar, rvoVar2)) {
                                                                                                                                                                        DivTransform divTransform = halVar.M;
                                                                                                                                                                        DivTransform divTransform2 = this.M;
                                                                                                                                                                        if (divTransform2 != null ? divTransform2.a(divTransform, rvoVar, rvoVar2) : divTransform == null) {
                                                                                                                                                                            List list21 = halVar.N;
                                                                                                                                                                            List list22 = this.N;
                                                                                                                                                                            if (list22 != null) {
                                                                                                                                                                                if (list21 != null && list22.size() == list21.size()) {
                                                                                                                                                                                    int i21 = 0;
                                                                                                                                                                                    for (Object obj11 : list22) {
                                                                                                                                                                                        int i22 = i21 + 1;
                                                                                                                                                                                        if (i21 < 0) {
                                                                                                                                                                                            scc.m();
                                                                                                                                                                                            throw null;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (!((xjl) obj11).a((xjl) list21.get(i21), rvoVar, rvoVar2)) {
                                                                                                                                                                                            break;
                                                                                                                                                                                        }
                                                                                                                                                                                        i21 = i22;
                                                                                                                                                                                    }
                                                                                                                                                                                    DivChangeTransition divChangeTransition = halVar.O;
                                                                                                                                                                                    DivChangeTransition divChangeTransition2 = this.O;
                                                                                                                                                                                    if (divChangeTransition2 != null ? divChangeTransition2.a(divChangeTransition, rvoVar, rvoVar2) : divChangeTransition == null) {
                                                                                                                                                                                        DivAppearanceTransition divAppearanceTransition = halVar.P;
                                                                                                                                                                                        DivAppearanceTransition divAppearanceTransition2 = this.P;
                                                                                                                                                                                        if (divAppearanceTransition2 != null ? divAppearanceTransition2.a(divAppearanceTransition, rvoVar, rvoVar2) : divAppearanceTransition == null) {
                                                                                                                                                                                            DivAppearanceTransition divAppearanceTransition3 = halVar.Q;
                                                                                                                                                                                            DivAppearanceTransition divAppearanceTransition4 = this.Q;
                                                                                                                                                                                            if (divAppearanceTransition4 != null ? divAppearanceTransition4.a(divAppearanceTransition3, rvoVar, rvoVar2) : divAppearanceTransition3 == null) {
                                                                                                                                                                                                List list23 = halVar.R;
                                                                                                                                                                                                List list24 = this.R;
                                                                                                                                                                                                if (list24 != null) {
                                                                                                                                                                                                    if (list23 != null && list24.size() == list23.size()) {
                                                                                                                                                                                                        int i23 = 0;
                                                                                                                                                                                                        for (Object obj12 : list24) {
                                                                                                                                                                                                            int i24 = i23 + 1;
                                                                                                                                                                                                            if (i23 < 0) {
                                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (((DivTransitionTrigger) obj12) != ((DivTransitionTrigger) list23.get(i23))) {
                                                                                                                                                                                                                break;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            i23 = i24;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        List list25 = halVar.S;
                                                                                                                                                                                                        List list26 = this.S;
                                                                                                                                                                                                        if (list26 != null) {
                                                                                                                                                                                                            if (list25 != null && list26.size() == list25.size()) {
                                                                                                                                                                                                                int i25 = 0;
                                                                                                                                                                                                                for (Object obj13 : list26) {
                                                                                                                                                                                                                    int i26 = i25 + 1;
                                                                                                                                                                                                                    if (i25 < 0) {
                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (!((lll) obj13).a((lll) list25.get(i25), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    i25 = i26;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                List list27 = halVar.T;
                                                                                                                                                                                                                List list28 = this.T;
                                                                                                                                                                                                                if (list28 != null) {
                                                                                                                                                                                                                    if (list27 != null && list28.size() == list27.size()) {
                                                                                                                                                                                                                        int i27 = 0;
                                                                                                                                                                                                                        for (Object obj14 : list28) {
                                                                                                                                                                                                                            int i28 = i27 + 1;
                                                                                                                                                                                                                            if (i27 < 0) {
                                                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (!((c3) obj14).a((c3) list27.get(i27), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            i27 = i28;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (this.U.a(rvoVar) == halVar.U.a(rvoVar2)) {
                                                                                                                                                                                                                            DivVisibilityAction divVisibilityAction = halVar.V;
                                                                                                                                                                                                                            DivVisibilityAction divVisibilityAction2 = this.V;
                                                                                                                                                                                                                            if (divVisibilityAction2 != null ? divVisibilityAction2.f(divVisibilityAction, rvoVar, rvoVar2) : divVisibilityAction == null) {
                                                                                                                                                                                                                                List list29 = halVar.W;
                                                                                                                                                                                                                                List list30 = this.W;
                                                                                                                                                                                                                                if (list30 != null) {
                                                                                                                                                                                                                                    if (list29 != null && list30.size() == list29.size()) {
                                                                                                                                                                                                                                        int i29 = 0;
                                                                                                                                                                                                                                        for (Object obj15 : list30) {
                                                                                                                                                                                                                                            int i30 = i29 + 1;
                                                                                                                                                                                                                                            if (i29 < 0) {
                                                                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (!((DivVisibilityAction) obj15).f((DivVisibilityAction) list29.get(i29), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            i29 = i30;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (this.X.a(halVar.X, rvoVar, rvoVar2)) {
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
        Integer num = this.Y;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(hal.class).hashCode();
        int i15 = 0;
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
        int i16 = hashCode3 + i;
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
        int i17 = i16 + i2;
        DivBorder divBorder = this.g;
        int b2 = i17 + (divBorder != null ? divBorder.b() : 0);
        Expression expression3 = this.h;
        int hashCode4 = b2 + (expression3 != null ? expression3.hashCode() : 0);
        List list3 = this.i;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((nnk) it3.next()).g();
            }
        } else {
            i3 = 0;
        }
        int i18 = hashCode4 + i3;
        List list4 = this.j;
        if (list4 != null) {
            Iterator it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((bpk) it4.next()).b();
            }
        } else {
            i4 = 0;
        }
        int i19 = i18 + i4;
        DivFocus divFocus = this.k;
        int b3 = i19 + (divFocus != null ? divFocus.b() : 0);
        List list5 = this.l;
        if (list5 != null) {
            Iterator it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((irk) it5.next()).b();
            }
        } else {
            i5 = 0;
        }
        int b4 = this.m.b() + b3 + i5;
        String str = this.n;
        int hashCode5 = this.o.hashCode() + b4 + (str != null ? str.hashCode() : 0);
        DivLayoutProvider divLayoutProvider = this.p;
        int b5 = hashCode5 + (divLayoutProvider != null ? divLayoutProvider.b() : 0);
        DivEdgeInsets divEdgeInsets = this.q;
        int hashCode6 = this.s.hashCode() + this.r.hashCode() + b5 + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        DivEdgeInsets divEdgeInsets2 = this.t;
        int b6 = hashCode6 + (divEdgeInsets2 != null ? divEdgeInsets2.b() : 0);
        List list6 = this.u;
        if (list6 != null) {
            Iterator it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((v3k) it6.next()).b();
            }
        } else {
            i6 = 0;
        }
        int i20 = b6 + i6;
        List list7 = this.v;
        if (list7 != null) {
            Iterator it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((v3k) it7.next()).b();
            }
        } else {
            i7 = 0;
        }
        int i21 = i20 + i7;
        List<fal> list8 = this.w;
        if (list8 != null) {
            i8 = 0;
            for (fal falVar : list8) {
                Integer num2 = falVar.f;
                if (num2 != null) {
                    i14 = num2.intValue();
                } else {
                    int hashCode7 = qoi0.a(fal.class).hashCode();
                    Expression expression4 = falVar.a;
                    int hashCode8 = hashCode7 + (expression4 != null ? expression4.hashCode() : 0);
                    DivEdgeInsets divEdgeInsets3 = falVar.b;
                    int b7 = hashCode8 + (divEdgeInsets3 != null ? divEdgeInsets3.b() : 0);
                    Expression expression5 = falVar.c;
                    int hashCode9 = b7 + (expression5 != null ? expression5.hashCode() : 0);
                    aok aokVar = falVar.d;
                    int b8 = hashCode9 + (aokVar != null ? aokVar.b() : 0);
                    aok aokVar2 = falVar.e;
                    int b9 = b8 + (aokVar2 != null ? aokVar2.b() : 0);
                    falVar.f = Integer.valueOf(b9);
                    i14 = b9;
                }
                i8 += i14;
            }
        } else {
            i8 = 0;
        }
        int i22 = i21 + i8;
        Expression expression6 = this.x;
        int hashCode10 = i22 + (expression6 != null ? expression6.hashCode() : 0);
        Expression expression7 = this.y;
        int hashCode11 = hashCode10 + (expression7 != null ? expression7.hashCode() : 0);
        DivAccessibility divAccessibility2 = this.z;
        int b10 = hashCode11 + (divAccessibility2 != null ? divAccessibility2.b() : 0);
        List list9 = this.A;
        if (list9 != null) {
            Iterator it8 = list9.iterator();
            i9 = 0;
            while (it8.hasNext()) {
                i9 += ((v3k) it8.next()).b();
            }
        } else {
            i9 = 0;
        }
        int i23 = b10 + i9;
        aok aokVar3 = this.B;
        int b11 = i23 + (aokVar3 != null ? aokVar3.b() : 0);
        gal galVar = this.C;
        int b12 = b11 + (galVar != null ? galVar.b() : 0);
        String str2 = this.D;
        int b13 = this.E.b() + b12 + (str2 != null ? str2.hashCode() : 0);
        gal galVar2 = this.F;
        int b14 = b13 + (galVar2 != null ? galVar2.b() : 0);
        String str3 = this.G;
        int hashCode12 = b14 + (str3 != null ? str3.hashCode() : 0);
        aok aokVar4 = this.H;
        int b15 = hashCode12 + (aokVar4 != null ? aokVar4.b() : 0);
        aok aokVar5 = this.I;
        int b16 = b15 + (aokVar5 != null ? aokVar5.b() : 0);
        List list10 = this.J;
        if (list10 != null) {
            Iterator it9 = list10.iterator();
            i10 = 0;
            while (it9.hasNext()) {
                i10 += ((gil) it9.next()).b();
            }
        } else {
            i10 = 0;
        }
        int b17 = this.L.b() + this.K.b() + b16 + i10;
        DivTransform divTransform = this.M;
        int b18 = b17 + (divTransform != null ? divTransform.b() : 0);
        List list11 = this.N;
        if (list11 != null) {
            Iterator it10 = list11.iterator();
            i11 = 0;
            while (it10.hasNext()) {
                i11 += ((xjl) it10.next()).b();
            }
        } else {
            i11 = 0;
        }
        int i24 = b18 + i11;
        DivChangeTransition divChangeTransition = this.O;
        int b19 = i24 + (divChangeTransition != null ? divChangeTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition = this.P;
        int b20 = b19 + (divAppearanceTransition != null ? divAppearanceTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition2 = this.Q;
        int b21 = b20 + (divAppearanceTransition2 != null ? divAppearanceTransition2.b() : 0);
        List list12 = this.R;
        int hashCode13 = b21 + (list12 != null ? list12.hashCode() : 0);
        List list13 = this.S;
        if (list13 != null) {
            Iterator it11 = list13.iterator();
            i12 = 0;
            while (it11.hasNext()) {
                i12 += ((lll) it11.next()).b();
            }
        } else {
            i12 = 0;
        }
        int i25 = hashCode13 + i12;
        List list14 = this.T;
        if (list14 != null) {
            Iterator it12 = list14.iterator();
            i13 = 0;
            while (it12.hasNext()) {
                i13 += ((c3) it12.next()).b();
            }
        } else {
            i13 = 0;
        }
        int hashCode14 = this.U.hashCode() + i25 + i13;
        DivVisibilityAction divVisibilityAction = this.V;
        int g = hashCode14 + (divVisibilityAction != null ? divVisibilityAction.g() : 0);
        List list15 = this.W;
        if (list15 != null) {
            Iterator it13 = list15.iterator();
            while (it13.hasNext()) {
                i15 += ((DivVisibilityAction) it13.next()).g();
            }
        }
        int b22 = this.X.b() + g + i15;
        this.Y = Integer.valueOf(b22);
        return b22;
    }

    @Override // defpackage.egk
    public final Expression a() {
        return this.d;
    }

    @Override // defpackage.egk
    public final List b() {
        return this.W;
    }

    @Override // defpackage.egk
    public final Expression c() {
        return this.h;
    }

    @Override // defpackage.egk
    public final List d() {
        return this.T;
    }

    @Override // defpackage.egk
    public final DivEdgeInsets e() {
        return this.q;
    }

    @Override // defpackage.egk
    public final Expression f() {
        return this.y;
    }

    @Override // defpackage.egk
    public final Expression g() {
        return this.x;
    }

    @Override // defpackage.egk
    public final List getBackground() {
        return this.f;
    }

    @Override // defpackage.egk
    public final List getExtensions() {
        return this.j;
    }

    @Override // defpackage.egk
    public final DivSize getHeight() {
        return this.m;
    }

    @Override // defpackage.egk
    public final String getId() {
        return this.n;
    }

    @Override // defpackage.egk
    public final Expression getVisibility() {
        return this.U;
    }

    @Override // defpackage.egk
    public final DivSize getWidth() {
        return this.X;
    }

    @Override // defpackage.egk
    public final Expression h() {
        return this.b;
    }

    @Override // defpackage.egk
    public final List i() {
        return this.J;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition j() {
        return this.Q;
    }

    @Override // defpackage.egk
    public final DivChangeTransition k() {
        return this.O;
    }

    @Override // defpackage.egk
    public final List l() {
        return this.i;
    }

    @Override // defpackage.egk
    public final DivTransform m() {
        return this.M;
    }

    @Override // defpackage.egk
    public final List n() {
        return this.R;
    }

    @Override // defpackage.egk
    public final Expression o() {
        return this.c;
    }

    @Override // defpackage.egk
    public final DivFocus p() {
        return this.k;
    }

    @Override // defpackage.egk
    public final DivAccessibility q() {
        return this.a;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((mal) ft6.b.u7.getValue()).b(ft6.a, this);
    }

    @Override // defpackage.egk
    public final DivEdgeInsets s() {
        return this.t;
    }

    @Override // defpackage.egk
    public final List t() {
        return this.A;
    }

    @Override // defpackage.egk
    public final DivLayoutProvider u() {
        return this.p;
    }

    @Override // defpackage.egk
    public final List v() {
        return this.S;
    }

    @Override // defpackage.egk
    public final DivVisibilityAction w() {
        return this.V;
    }

    @Override // defpackage.egk
    public final List x() {
        return this.l;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition y() {
        return this.P;
    }

    @Override // defpackage.egk
    public final List z() {
        return this.e;
    }
}
