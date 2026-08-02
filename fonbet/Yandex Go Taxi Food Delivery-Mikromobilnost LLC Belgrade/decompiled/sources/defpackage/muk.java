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
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivInput$Autocapitalization;
import com.yandex.div2.DivInput$EnterKeyType;
import com.yandex.div2.DivInput$KeyboardType;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.c3;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class muk implements c4x, egk {
    public final String A;
    public final Expression B;
    public final Expression C;
    public final DivLayoutProvider D;
    public final Expression E;
    public final Expression F;
    public final DivEdgeInsets G;
    public final pvk H;
    public final Expression I;
    public final Expression J;
    public final luk K;
    public final DivEdgeInsets L;
    public final Expression M;
    public final Expression N;
    public final Expression O;
    public final List P;
    public final Expression Q;
    public final Expression R;
    public final Expression S;
    public final String T;
    public final List U;
    public final DivTransform V;
    public final List W;
    public final DivChangeTransition X;
    public final DivAppearanceTransition Y;
    public final DivAppearanceTransition Z;
    public final DivAccessibility a;
    public final List a0;
    public final Expression b;
    public final List b0;
    public final Expression c;
    public final List c0;
    public final Expression d;
    public final List d0;
    public final List e;
    public final Expression e0;
    public final Expression f;
    public final DivVisibilityAction f0;
    public final List g;
    public final List g0;
    public final DivBorder h;
    public final DivSize h0;
    public final Expression i;
    public Integer i0;
    public final List j;
    public final List k;
    public final Expression l;
    public final List m;
    public final List n;
    public final DivFocus o;
    public final Expression p;
    public final Expression q;
    public final Expression r;
    public final Expression s;
    public final Expression t;
    public final Expression u;
    public final List v;
    public final DivSize w;
    public final Expression x;
    public final Expression y;
    public final Expression z;

    static {
        ngd0.m(Double.valueOf(1.0d));
        ngd0.m(DivInput$Autocapitalization.AUTO);
        ngd0.m(DivInput$EnterKeyType.DEFAULT);
        ngd0.m(12L);
        ngd0.m(DivSizeUnit.SP);
        ngd0.m(1929379840);
        ngd0.m(Boolean.TRUE);
        ngd0.m(DivInput$KeyboardType.MULTI_LINE_TEXT);
        ngd0.m(Double.valueOf(0.0d));
        ngd0.m(Boolean.FALSE);
        ngd0.m(DivAlignmentHorizontal.START);
        ngd0.m(DivAlignmentVertical.CENTER);
        ngd0.m(Integer.valueOf(ModalContentViewContainer.BASE_SHADOW_COLOR));
        ngd0.m(DivVisibility.VISIBLE);
    }

    public muk(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, List list2, DivBorder divBorder, Expression expression5, List list3, List list4, Expression expression6, List list5, List list6, DivFocus divFocus, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, DivSize divSize, Expression expression13, Expression expression14, Expression expression15, String str, Expression expression16, Expression expression17, DivLayoutProvider divLayoutProvider, Expression expression18, Expression expression19, DivEdgeInsets divEdgeInsets, pvk pvkVar, Expression expression20, Expression expression21, luk lukVar, DivEdgeInsets divEdgeInsets2, Expression expression22, Expression expression23, Expression expression24, List list8, Expression expression25, Expression expression26, Expression expression27, String str2, List list9, DivTransform divTransform, List list10, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list11, List list12, List list13, List list14, Expression expression28, DivVisibilityAction divVisibilityAction, List list15, DivSize divSize2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = expression4;
        this.g = list2;
        this.h = divBorder;
        this.i = expression5;
        this.j = list3;
        this.k = list4;
        this.l = expression6;
        this.m = list5;
        this.n = list6;
        this.o = divFocus;
        this.p = expression7;
        this.q = expression8;
        this.r = expression9;
        this.s = expression10;
        this.t = expression11;
        this.u = expression12;
        this.v = list7;
        this.w = divSize;
        this.x = expression13;
        this.y = expression14;
        this.z = expression15;
        this.A = str;
        this.B = expression16;
        this.C = expression17;
        this.D = divLayoutProvider;
        this.E = expression18;
        this.F = expression19;
        this.G = divEdgeInsets;
        this.H = pvkVar;
        this.I = expression20;
        this.J = expression21;
        this.K = lukVar;
        this.L = divEdgeInsets2;
        this.M = expression22;
        this.N = expression23;
        this.O = expression24;
        this.P = list8;
        this.Q = expression25;
        this.R = expression26;
        this.S = expression27;
        this.T = str2;
        this.U = list9;
        this.V = divTransform;
        this.W = list10;
        this.X = divChangeTransition;
        this.Y = divAppearanceTransition;
        this.Z = divAppearanceTransition2;
        this.a0 = list11;
        this.b0 = list12;
        this.c0 = list13;
        this.d0 = list14;
        this.e0 = expression28;
        this.f0 = divVisibilityAction;
        this.g0 = list15;
        this.h0 = divSize2;
    }

    @Override // defpackage.egk
    public final DivBorder A() {
        return this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:472:0x07a7, code lost:
    
        if (r3 == null) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0747, code lost:
    
        if (r3 == null) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0704, code lost:
    
        if (r3 == null) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x06c1, code lost:
    
        if (r3 == null) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x067e, code lost:
    
        if (r3 == null) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x060b, code lost:
    
        if (r3 == null) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x05b6, code lost:
    
        if (r3 == null) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0533, code lost:
    
        if (r3 == null) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0338, code lost:
    
        if (r3 == null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0245, code lost:
    
        if (r3 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0202, code lost:
    
        if (r3 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x01b1, code lost:
    
        if (r3 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x016e, code lost:
    
        if (r3 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x00fb, code lost:
    
        if (r3 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x00aa, code lost:
    
        if (r3 == null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(muk mukVar, rvo rvoVar, rvo rvoVar2) {
        if (mukVar != null) {
            DivAccessibility divAccessibility = mukVar.a;
            DivAccessibility divAccessibility2 = this.a;
            if (divAccessibility2 != null ? divAccessibility2.a(divAccessibility, rvoVar, rvoVar2) : divAccessibility == null) {
                Expression expression = this.b;
                DivAlignmentHorizontal divAlignmentHorizontal = expression != null ? (DivAlignmentHorizontal) expression.a(rvoVar) : null;
                Expression expression2 = mukVar.b;
                if (divAlignmentHorizontal == (expression2 != null ? (DivAlignmentHorizontal) expression2.a(rvoVar2) : null)) {
                    Expression expression3 = this.c;
                    DivAlignmentVertical divAlignmentVertical = expression3 != null ? (DivAlignmentVertical) expression3.a(rvoVar) : null;
                    Expression expression4 = mukVar.c;
                    if (divAlignmentVertical == (expression4 != null ? (DivAlignmentVertical) expression4.a(rvoVar2) : null) && ((Number) this.d.a(rvoVar)).doubleValue() == ((Number) mukVar.d.a(rvoVar2)).doubleValue()) {
                        List list = mukVar.e;
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
                                if (this.f.a(rvoVar) == mukVar.f.a(rvoVar2)) {
                                    List list3 = mukVar.g;
                                    List list4 = this.g;
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
                                            DivBorder divBorder = mukVar.h;
                                            DivBorder divBorder2 = this.h;
                                            if (divBorder2 != null ? divBorder2.a(divBorder, rvoVar, rvoVar2) : divBorder == null) {
                                                Expression expression5 = this.i;
                                                Long l = expression5 != null ? (Long) expression5.a(rvoVar) : null;
                                                Expression expression6 = mukVar.i;
                                                if (jl40.l(l, expression6 != null ? (Long) expression6.a(rvoVar2) : null)) {
                                                    List list5 = mukVar.j;
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
                                                                if (!((nnk) obj3).f((nnk) list5.get(i5), rvoVar, rvoVar2)) {
                                                                    break;
                                                                }
                                                                i5 = i6;
                                                            }
                                                            List list7 = mukVar.k;
                                                            List list8 = this.k;
                                                            if (list8 != null) {
                                                                if (list7 != null && list8.size() == list7.size()) {
                                                                    int i7 = 0;
                                                                    for (Object obj4 : list8) {
                                                                        int i8 = i7 + 1;
                                                                        if (i7 < 0) {
                                                                            scc.m();
                                                                            throw null;
                                                                        }
                                                                        if (!((v3k) obj4).a((v3k) list7.get(i7), rvoVar, rvoVar2)) {
                                                                            break;
                                                                        }
                                                                        i7 = i8;
                                                                    }
                                                                    if (this.l.a(rvoVar) == mukVar.l.a(rvoVar2)) {
                                                                        List list9 = mukVar.m;
                                                                        List list10 = this.m;
                                                                        if (list10 != null) {
                                                                            if (list9 != null && list10.size() == list9.size()) {
                                                                                int i9 = 0;
                                                                                for (Object obj5 : list10) {
                                                                                    int i10 = i9 + 1;
                                                                                    if (i9 < 0) {
                                                                                        scc.m();
                                                                                        throw null;
                                                                                    }
                                                                                    if (!((bpk) obj5).a((bpk) list9.get(i9))) {
                                                                                        break;
                                                                                    }
                                                                                    i9 = i10;
                                                                                }
                                                                                List list11 = mukVar.n;
                                                                                List list12 = this.n;
                                                                                if (list12 != null) {
                                                                                    if (list11 != null && list12.size() == list11.size()) {
                                                                                        int i11 = 0;
                                                                                        for (Object obj6 : list12) {
                                                                                            int i12 = i11 + 1;
                                                                                            if (i11 < 0) {
                                                                                                scc.m();
                                                                                                throw null;
                                                                                            }
                                                                                            if (!((ruk) obj6).a((ruk) list11.get(i11), rvoVar, rvoVar2)) {
                                                                                                break;
                                                                                            }
                                                                                            i11 = i12;
                                                                                        }
                                                                                        DivFocus divFocus = mukVar.o;
                                                                                        DivFocus divFocus2 = this.o;
                                                                                        if (divFocus2 != null ? divFocus2.a(divFocus, rvoVar, rvoVar2) : divFocus == null) {
                                                                                            Expression expression7 = this.p;
                                                                                            String str = expression7 != null ? (String) expression7.a(rvoVar) : null;
                                                                                            Expression expression8 = mukVar.p;
                                                                                            if (jl40.l(str, expression8 != null ? (String) expression8.a(rvoVar2) : null) && ((Number) this.q.a(rvoVar)).longValue() == ((Number) mukVar.q.a(rvoVar2)).longValue() && this.r.a(rvoVar) == mukVar.r.a(rvoVar2)) {
                                                                                                Expression expression9 = this.s;
                                                                                                JSONObject jSONObject = expression9 != null ? (JSONObject) expression9.a(rvoVar) : null;
                                                                                                Expression expression10 = mukVar.s;
                                                                                                if (jl40.l(jSONObject, expression10 != null ? (JSONObject) expression10.a(rvoVar2) : null)) {
                                                                                                    Expression expression11 = this.t;
                                                                                                    DivFontWeight divFontWeight = expression11 != null ? (DivFontWeight) expression11.a(rvoVar) : null;
                                                                                                    Expression expression12 = mukVar.t;
                                                                                                    if (divFontWeight == (expression12 != null ? (DivFontWeight) expression12.a(rvoVar2) : null)) {
                                                                                                        Expression expression13 = this.u;
                                                                                                        Long l2 = expression13 != null ? (Long) expression13.a(rvoVar) : null;
                                                                                                        Expression expression14 = mukVar.u;
                                                                                                        if (jl40.l(l2, expression14 != null ? (Long) expression14.a(rvoVar2) : null)) {
                                                                                                            List list13 = mukVar.v;
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
                                                                                                                        if (!((irk) obj7).a((irk) list13.get(i13))) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        i13 = i14;
                                                                                                                    }
                                                                                                                    if (this.w.a(mukVar.w, rvoVar, rvoVar2)) {
                                                                                                                        Expression expression15 = this.x;
                                                                                                                        Integer num = expression15 != null ? (Integer) expression15.a(rvoVar) : null;
                                                                                                                        Expression expression16 = mukVar.x;
                                                                                                                        if (jl40.l(num, expression16 != null ? (Integer) expression16.a(rvoVar2) : null) && ((Number) this.y.a(rvoVar)).intValue() == ((Number) mukVar.y.a(rvoVar2)).intValue()) {
                                                                                                                            Expression expression17 = this.z;
                                                                                                                            String str2 = expression17 != null ? (String) expression17.a(rvoVar) : null;
                                                                                                                            Expression expression18 = mukVar.z;
                                                                                                                            if (jl40.l(str2, expression18 != null ? (String) expression18.a(rvoVar2) : null) && jl40.l(this.A, mukVar.A) && ((Boolean) this.B.a(rvoVar)).booleanValue() == ((Boolean) mukVar.B.a(rvoVar2)).booleanValue() && this.C.a(rvoVar) == mukVar.C.a(rvoVar2)) {
                                                                                                                                DivLayoutProvider divLayoutProvider = mukVar.D;
                                                                                                                                DivLayoutProvider divLayoutProvider2 = this.D;
                                                                                                                                if ((divLayoutProvider2 != null ? divLayoutProvider2.a(divLayoutProvider) : divLayoutProvider == null) && ((Number) this.E.a(rvoVar)).doubleValue() == ((Number) mukVar.E.a(rvoVar2)).doubleValue()) {
                                                                                                                                    Expression expression19 = this.F;
                                                                                                                                    Long l3 = expression19 != null ? (Long) expression19.a(rvoVar) : null;
                                                                                                                                    Expression expression20 = mukVar.F;
                                                                                                                                    if (jl40.l(l3, expression20 != null ? (Long) expression20.a(rvoVar2) : null)) {
                                                                                                                                        DivEdgeInsets divEdgeInsets = mukVar.G;
                                                                                                                                        DivEdgeInsets divEdgeInsets2 = this.G;
                                                                                                                                        if (divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) {
                                                                                                                                            pvk pvkVar = mukVar.H;
                                                                                                                                            pvk pvkVar2 = this.H;
                                                                                                                                            if (pvkVar2 != null ? pvkVar2.a(pvkVar, rvoVar, rvoVar2) : pvkVar == null) {
                                                                                                                                                Expression expression21 = this.I;
                                                                                                                                                Long l4 = expression21 != null ? (Long) expression21.a(rvoVar) : null;
                                                                                                                                                Expression expression22 = mukVar.I;
                                                                                                                                                if (jl40.l(l4, expression22 != null ? (Long) expression22.a(rvoVar2) : null)) {
                                                                                                                                                    Expression expression23 = this.J;
                                                                                                                                                    Long l5 = expression23 != null ? (Long) expression23.a(rvoVar) : null;
                                                                                                                                                    Expression expression24 = mukVar.J;
                                                                                                                                                    if (jl40.l(l5, expression24 != null ? (Long) expression24.a(rvoVar2) : null)) {
                                                                                                                                                        luk lukVar = mukVar.K;
                                                                                                                                                        luk lukVar2 = this.K;
                                                                                                                                                        if (lukVar2 != null ? lukVar2.a(lukVar, rvoVar, rvoVar2) : lukVar == null) {
                                                                                                                                                            DivEdgeInsets divEdgeInsets3 = mukVar.L;
                                                                                                                                                            DivEdgeInsets divEdgeInsets4 = this.L;
                                                                                                                                                            if (divEdgeInsets4 != null ? divEdgeInsets4.a(divEdgeInsets3, rvoVar, rvoVar2) : divEdgeInsets3 == null) {
                                                                                                                                                                Expression expression25 = this.M;
                                                                                                                                                                String str3 = expression25 != null ? (String) expression25.a(rvoVar) : null;
                                                                                                                                                                Expression expression26 = mukVar.M;
                                                                                                                                                                if (jl40.l(str3, expression26 != null ? (String) expression26.a(rvoVar2) : null)) {
                                                                                                                                                                    Expression expression27 = this.N;
                                                                                                                                                                    Long l6 = expression27 != null ? (Long) expression27.a(rvoVar) : null;
                                                                                                                                                                    Expression expression28 = mukVar.N;
                                                                                                                                                                    if (jl40.l(l6, expression28 != null ? (Long) expression28.a(rvoVar2) : null) && ((Boolean) this.O.a(rvoVar)).booleanValue() == ((Boolean) mukVar.O.a(rvoVar2)).booleanValue()) {
                                                                                                                                                                        List list15 = mukVar.P;
                                                                                                                                                                        List list16 = this.P;
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
                                                                                                                                                                                if (this.Q.a(rvoVar) == mukVar.Q.a(rvoVar2) && this.R.a(rvoVar) == mukVar.R.a(rvoVar2) && ((Number) this.S.a(rvoVar)).intValue() == ((Number) mukVar.S.a(rvoVar2)).intValue() && jl40.l(this.T, mukVar.T)) {
                                                                                                                                                                                    List list17 = mukVar.U;
                                                                                                                                                                                    List list18 = this.U;
                                                                                                                                                                                    if (list18 != null) {
                                                                                                                                                                                        if (list17 != null && list18.size() == list17.size()) {
                                                                                                                                                                                            int i17 = 0;
                                                                                                                                                                                            for (Object obj9 : list18) {
                                                                                                                                                                                                int i18 = i17 + 1;
                                                                                                                                                                                                if (i17 < 0) {
                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (!((gil) obj9).a((gil) list17.get(i17), rvoVar, rvoVar2)) {
                                                                                                                                                                                                    break;
                                                                                                                                                                                                }
                                                                                                                                                                                                i17 = i18;
                                                                                                                                                                                            }
                                                                                                                                                                                            DivTransform divTransform = mukVar.V;
                                                                                                                                                                                            DivTransform divTransform2 = this.V;
                                                                                                                                                                                            if (divTransform2 != null ? divTransform2.a(divTransform, rvoVar, rvoVar2) : divTransform == null) {
                                                                                                                                                                                                List list19 = mukVar.W;
                                                                                                                                                                                                List list20 = this.W;
                                                                                                                                                                                                if (list20 != null) {
                                                                                                                                                                                                    if (list19 != null && list20.size() == list19.size()) {
                                                                                                                                                                                                        int i19 = 0;
                                                                                                                                                                                                        for (Object obj10 : list20) {
                                                                                                                                                                                                            int i20 = i19 + 1;
                                                                                                                                                                                                            if (i19 < 0) {
                                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (!((xjl) obj10).a((xjl) list19.get(i19), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                break;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            i19 = i20;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        DivChangeTransition divChangeTransition = mukVar.X;
                                                                                                                                                                                                        DivChangeTransition divChangeTransition2 = this.X;
                                                                                                                                                                                                        if (divChangeTransition2 != null ? divChangeTransition2.a(divChangeTransition, rvoVar, rvoVar2) : divChangeTransition == null) {
                                                                                                                                                                                                            DivAppearanceTransition divAppearanceTransition = mukVar.Y;
                                                                                                                                                                                                            DivAppearanceTransition divAppearanceTransition2 = this.Y;
                                                                                                                                                                                                            if (divAppearanceTransition2 != null ? divAppearanceTransition2.a(divAppearanceTransition, rvoVar, rvoVar2) : divAppearanceTransition == null) {
                                                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition3 = mukVar.Z;
                                                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition4 = this.Z;
                                                                                                                                                                                                                if (divAppearanceTransition4 != null ? divAppearanceTransition4.a(divAppearanceTransition3, rvoVar, rvoVar2) : divAppearanceTransition3 == null) {
                                                                                                                                                                                                                    List list21 = mukVar.a0;
                                                                                                                                                                                                                    List list22 = this.a0;
                                                                                                                                                                                                                    if (list22 != null) {
                                                                                                                                                                                                                        if (list21 != null && list22.size() == list21.size()) {
                                                                                                                                                                                                                            int i21 = 0;
                                                                                                                                                                                                                            for (Object obj11 : list22) {
                                                                                                                                                                                                                                int i22 = i21 + 1;
                                                                                                                                                                                                                                if (i21 < 0) {
                                                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (((DivTransitionTrigger) obj11) != ((DivTransitionTrigger) list21.get(i21))) {
                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                i21 = i22;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            List list23 = mukVar.b0;
                                                                                                                                                                                                                            List list24 = this.b0;
                                                                                                                                                                                                                            if (list24 != null) {
                                                                                                                                                                                                                                if (list23 != null && list24.size() == list23.size()) {
                                                                                                                                                                                                                                    int i23 = 0;
                                                                                                                                                                                                                                    for (Object obj12 : list24) {
                                                                                                                                                                                                                                        int i24 = i23 + 1;
                                                                                                                                                                                                                                        if (i23 < 0) {
                                                                                                                                                                                                                                            scc.m();
                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (!((ewk) obj12).a((ewk) list23.get(i23), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        i23 = i24;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    List list25 = mukVar.c0;
                                                                                                                                                                                                                                    List list26 = this.c0;
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
                                                                                                                                                                                                                                            List list27 = mukVar.d0;
                                                                                                                                                                                                                                            List list28 = this.d0;
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
                                                                                                                                                                                                                                                    if (this.e0.a(rvoVar) == mukVar.e0.a(rvoVar2)) {
                                                                                                                                                                                                                                                        DivVisibilityAction divVisibilityAction = mukVar.f0;
                                                                                                                                                                                                                                                        DivVisibilityAction divVisibilityAction2 = this.f0;
                                                                                                                                                                                                                                                        if (divVisibilityAction2 != null ? divVisibilityAction2.f(divVisibilityAction, rvoVar, rvoVar2) : divVisibilityAction == null) {
                                                                                                                                                                                                                                                            List list29 = mukVar.g0;
                                                                                                                                                                                                                                                            List list30 = this.g0;
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
                                                                                                                                                                                                                                                                    if (this.h0.a(mukVar.h0, rvoVar, rvoVar2)) {
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
        return false;
    }

    public final int C() {
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
        Integer num = this.i0;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(muk.class).hashCode();
        int i14 = 0;
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
        int hashCode4 = this.f.hashCode() + hashCode3 + i;
        List list2 = this.g;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((kfk) it2.next()).b();
            }
        } else {
            i2 = 0;
        }
        int i15 = hashCode4 + i2;
        DivBorder divBorder = this.h;
        int b2 = i15 + (divBorder != null ? divBorder.b() : 0);
        Expression expression3 = this.i;
        int hashCode5 = b2 + (expression3 != null ? expression3.hashCode() : 0);
        List list3 = this.j;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((nnk) it3.next()).g();
            }
        } else {
            i3 = 0;
        }
        int i16 = hashCode5 + i3;
        List list4 = this.k;
        if (list4 != null) {
            Iterator it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((v3k) it4.next()).b();
            }
        } else {
            i4 = 0;
        }
        int hashCode6 = this.l.hashCode() + i16 + i4;
        List list5 = this.m;
        if (list5 != null) {
            Iterator it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((bpk) it5.next()).b();
            }
        } else {
            i5 = 0;
        }
        int i17 = hashCode6 + i5;
        List list6 = this.n;
        if (list6 != null) {
            Iterator it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((ruk) it6.next()).b();
            }
        } else {
            i6 = 0;
        }
        int i18 = i17 + i6;
        DivFocus divFocus = this.o;
        int b3 = i18 + (divFocus != null ? divFocus.b() : 0);
        Expression expression4 = this.p;
        int hashCode7 = this.r.hashCode() + this.q.hashCode() + b3 + (expression4 != null ? expression4.hashCode() : 0);
        Expression expression5 = this.s;
        int hashCode8 = hashCode7 + (expression5 != null ? expression5.hashCode() : 0);
        Expression expression6 = this.t;
        int hashCode9 = hashCode8 + (expression6 != null ? expression6.hashCode() : 0);
        Expression expression7 = this.u;
        int hashCode10 = hashCode9 + (expression7 != null ? expression7.hashCode() : 0);
        List list7 = this.v;
        if (list7 != null) {
            Iterator it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((irk) it7.next()).b();
            }
        } else {
            i7 = 0;
        }
        int b4 = this.w.b() + hashCode10 + i7;
        Expression expression8 = this.x;
        int hashCode11 = this.y.hashCode() + b4 + (expression8 != null ? expression8.hashCode() : 0);
        Expression expression9 = this.z;
        int hashCode12 = hashCode11 + (expression9 != null ? expression9.hashCode() : 0);
        String str = this.A;
        int hashCode13 = this.C.hashCode() + this.B.hashCode() + hashCode12 + (str != null ? str.hashCode() : 0);
        DivLayoutProvider divLayoutProvider = this.D;
        int hashCode14 = this.E.hashCode() + hashCode13 + (divLayoutProvider != null ? divLayoutProvider.b() : 0);
        Expression expression10 = this.F;
        int hashCode15 = hashCode14 + (expression10 != null ? expression10.hashCode() : 0);
        DivEdgeInsets divEdgeInsets = this.G;
        int b5 = hashCode15 + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        pvk pvkVar = this.H;
        int b6 = b5 + (pvkVar != null ? pvkVar.b() : 0);
        Expression expression11 = this.I;
        int hashCode16 = b6 + (expression11 != null ? expression11.hashCode() : 0);
        Expression expression12 = this.J;
        int hashCode17 = hashCode16 + (expression12 != null ? expression12.hashCode() : 0);
        luk lukVar = this.K;
        int b7 = hashCode17 + (lukVar != null ? lukVar.b() : 0);
        DivEdgeInsets divEdgeInsets2 = this.L;
        int b8 = b7 + (divEdgeInsets2 != null ? divEdgeInsets2.b() : 0);
        Expression expression13 = this.M;
        int hashCode18 = b8 + (expression13 != null ? expression13.hashCode() : 0);
        Expression expression14 = this.N;
        int hashCode19 = this.O.hashCode() + hashCode18 + (expression14 != null ? expression14.hashCode() : 0);
        List list8 = this.P;
        if (list8 != null) {
            Iterator it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((v3k) it8.next()).b();
            }
        } else {
            i8 = 0;
        }
        int hashCode20 = this.T.hashCode() + this.S.hashCode() + this.R.hashCode() + this.Q.hashCode() + hashCode19 + i8;
        List list9 = this.U;
        if (list9 != null) {
            Iterator it9 = list9.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((gil) it9.next()).b();
            }
        } else {
            i9 = 0;
        }
        int i19 = hashCode20 + i9;
        DivTransform divTransform = this.V;
        int b9 = i19 + (divTransform != null ? divTransform.b() : 0);
        List list10 = this.W;
        if (list10 != null) {
            Iterator it10 = list10.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((xjl) it10.next()).b();
            }
        } else {
            i10 = 0;
        }
        int i20 = b9 + i10;
        DivChangeTransition divChangeTransition = this.X;
        int b10 = i20 + (divChangeTransition != null ? divChangeTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition = this.Y;
        int b11 = b10 + (divAppearanceTransition != null ? divAppearanceTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition2 = this.Z;
        int b12 = b11 + (divAppearanceTransition2 != null ? divAppearanceTransition2.b() : 0);
        List list11 = this.a0;
        int hashCode21 = b12 + (list11 != null ? list11.hashCode() : 0);
        List list12 = this.b0;
        if (list12 != null) {
            Iterator it11 = list12.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((ewk) it11.next()).b();
            }
        } else {
            i11 = 0;
        }
        int i21 = hashCode21 + i11;
        List list13 = this.c0;
        if (list13 != null) {
            Iterator it12 = list13.iterator();
            i12 = 0;
            while (it12.hasNext()) {
                i12 += ((lll) it12.next()).b();
            }
        } else {
            i12 = 0;
        }
        int i22 = i21 + i12;
        List list14 = this.d0;
        if (list14 != null) {
            Iterator it13 = list14.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((c3) it13.next()).b();
            }
        } else {
            i13 = 0;
        }
        int hashCode22 = this.e0.hashCode() + i22 + i13;
        DivVisibilityAction divVisibilityAction = this.f0;
        int g = hashCode22 + (divVisibilityAction != null ? divVisibilityAction.g() : 0);
        List list15 = this.g0;
        if (list15 != null) {
            Iterator it14 = list15.iterator();
            while (it14.hasNext()) {
                i14 += ((DivVisibilityAction) it14.next()).g();
            }
        }
        int b13 = this.h0.b() + g + i14;
        this.i0 = Integer.valueOf(b13);
        return b13;
    }

    @Override // defpackage.egk
    public final Expression a() {
        return this.d;
    }

    @Override // defpackage.egk
    public final List b() {
        return this.g0;
    }

    @Override // defpackage.egk
    public final Expression c() {
        return this.i;
    }

    @Override // defpackage.egk
    public final List d() {
        return this.d0;
    }

    @Override // defpackage.egk
    public final DivEdgeInsets e() {
        return this.G;
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
        return this.g;
    }

    @Override // defpackage.egk
    public final List getExtensions() {
        return this.m;
    }

    @Override // defpackage.egk
    public final DivSize getHeight() {
        return this.w;
    }

    @Override // defpackage.egk
    public final String getId() {
        return this.A;
    }

    @Override // defpackage.egk
    public final Expression getVisibility() {
        return this.e0;
    }

    @Override // defpackage.egk
    public final DivSize getWidth() {
        return this.h0;
    }

    @Override // defpackage.egk
    public final Expression h() {
        return this.b;
    }

    @Override // defpackage.egk
    public final List i() {
        return this.U;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition j() {
        return this.Z;
    }

    @Override // defpackage.egk
    public final DivChangeTransition k() {
        return this.X;
    }

    @Override // defpackage.egk
    public final List l() {
        return this.j;
    }

    @Override // defpackage.egk
    public final DivTransform m() {
        return this.V;
    }

    @Override // defpackage.egk
    public final List n() {
        return this.a0;
    }

    @Override // defpackage.egk
    public final Expression o() {
        return this.c;
    }

    @Override // defpackage.egk
    public final DivFocus p() {
        return this.o;
    }

    @Override // defpackage.egk
    public final DivAccessibility q() {
        return this.a;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((jvk) ft6.b.R4.getValue()).b(ft6.a, this);
    }

    @Override // defpackage.egk
    public final DivEdgeInsets s() {
        return this.L;
    }

    @Override // defpackage.egk
    public final List t() {
        return this.P;
    }

    @Override // defpackage.egk
    public final DivLayoutProvider u() {
        return this.D;
    }

    @Override // defpackage.egk
    public final List v() {
        return this.c0;
    }

    @Override // defpackage.egk
    public final DivVisibilityAction w() {
        return this.f0;
    }

    @Override // defpackage.egk
    public final List x() {
        return this.v;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition y() {
        return this.Y;
    }

    @Override // defpackage.egk
    public final List z() {
        return this.e;
    }
}
