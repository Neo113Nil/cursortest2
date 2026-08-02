package defpackage;

import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation$Name;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.c3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes.dex */
public final class psk implements c4x, egk {
    public final String A;
    public final Expression B;
    public final DivLayoutProvider C;
    public final List D;
    public final DivEdgeInsets E;
    public final DivEdgeInsets F;
    public final Expression G;
    public final Expression H;
    public final List I;
    public final List J;
    public final Expression K;
    public final Expression L;
    public final Expression M;
    public final Expression N;
    public final List O;
    public final Expression P;
    public final Expression Q;
    public final List R;
    public final DivTransform S;
    public final List T;
    public final DivChangeTransition U;
    public final DivAppearanceTransition V;
    public final DivAppearanceTransition W;
    public final List X;
    public final List Y;
    public final List Z;
    public final DivAccessibility a;
    public final Expression a0;
    public final v3k b;
    public final DivVisibilityAction b0;
    public final pdk c;
    public final List c0;
    public final List d;
    public final DivSize d0;
    public final Expression e;
    public Integer e0;
    public final Expression f;
    public final Expression g;
    public final List h;
    public final hpk i;
    public final afk j;
    public final List k;
    public final DivBorder l;
    public final Expression m;
    public final Expression n;
    public final Expression o;
    public final Expression p;
    public final List q;
    public final List r;
    public final List s;
    public final List t;
    public final DivFocus u;
    public final List v;
    public final DivSize w;
    public final Expression x;
    public final List y;
    public final List z;

    static {
        ngd0.m(100L);
        ngd0.m(Double.valueOf(0.6d));
        ngd0.m(DivAnimation$Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        ngd0.m(valueOf);
        ngd0.m(valueOf);
        ngd0.m(Boolean.TRUE);
        ngd0.m(DivAlignmentHorizontal.CENTER);
        ngd0.m(DivAlignmentVertical.CENTER);
        Boolean bool = Boolean.FALSE;
        ngd0.m(bool);
        ngd0.m(Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR));
        ngd0.m(bool);
        ngd0.m(DivImageScale.FILL);
        ngd0.m(DivBlendMode.SOURCE_IN);
        ngd0.m(DivVisibility.VISIBLE);
    }

    public psk(DivAccessibility divAccessibility, v3k v3kVar, pdk pdkVar, List list, Expression expression, Expression expression2, Expression expression3, List list2, hpk hpkVar, afk afkVar, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, List list7, DivFocus divFocus, List list8, DivSize divSize, Expression expression8, List list9, List list10, String str, Expression expression9, DivLayoutProvider divLayoutProvider, List list11, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression10, Expression expression11, List list12, List list13, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list14, Expression expression16, Expression expression17, List list15, DivTransform divTransform, List list16, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list17, List list18, List list19, Expression expression18, DivVisibilityAction divVisibilityAction, List list20, DivSize divSize2) {
        this.a = divAccessibility;
        this.b = v3kVar;
        this.c = pdkVar;
        this.d = list;
        this.e = expression;
        this.f = expression2;
        this.g = expression3;
        this.h = list2;
        this.i = hpkVar;
        this.j = afkVar;
        this.k = list3;
        this.l = divBorder;
        this.m = expression4;
        this.n = expression5;
        this.o = expression6;
        this.p = expression7;
        this.q = list4;
        this.r = list5;
        this.s = list6;
        this.t = list7;
        this.u = divFocus;
        this.v = list8;
        this.w = divSize;
        this.x = expression8;
        this.y = list9;
        this.z = list10;
        this.A = str;
        this.B = expression9;
        this.C = divLayoutProvider;
        this.D = list11;
        this.E = divEdgeInsets;
        this.F = divEdgeInsets2;
        this.G = expression10;
        this.H = expression11;
        this.I = list12;
        this.J = list13;
        this.K = expression12;
        this.L = expression13;
        this.M = expression14;
        this.N = expression15;
        this.O = list14;
        this.P = expression16;
        this.Q = expression17;
        this.R = list15;
        this.S = divTransform;
        this.T = list16;
        this.U = divChangeTransition;
        this.V = divAppearanceTransition;
        this.W = divAppearanceTransition2;
        this.X = list17;
        this.Y = list18;
        this.Z = list19;
        this.a0 = expression18;
        this.b0 = divVisibilityAction;
        this.c0 = list20;
        this.d0 = divSize2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.util.List] */
    public static psk B(psk pskVar, ArrayList arrayList, String str, int i) {
        List list;
        List list2;
        String str2;
        DivAccessibility divAccessibility = pskVar.a;
        v3k v3kVar = pskVar.b;
        pdk pdkVar = pskVar.c;
        List list3 = pskVar.d;
        Expression expression = pskVar.e;
        Expression expression2 = pskVar.f;
        Expression expression3 = pskVar.g;
        List list4 = pskVar.h;
        hpk hpkVar = pskVar.i;
        afk afkVar = pskVar.j;
        List list5 = pskVar.k;
        DivBorder divBorder = pskVar.l;
        Expression expression4 = pskVar.m;
        Expression expression5 = pskVar.n;
        Expression expression6 = pskVar.o;
        Expression expression7 = pskVar.p;
        List list6 = pskVar.q;
        List list7 = pskVar.r;
        if ((i & 262144) != 0) {
            list = list7;
            arrayList = pskVar.s;
        } else {
            list = list7;
        }
        List list8 = pskVar.t;
        DivFocus divFocus = pskVar.u;
        List list9 = pskVar.v;
        DivSize divSize = pskVar.w;
        Expression expression8 = pskVar.x;
        List list10 = pskVar.y;
        List list11 = pskVar.z;
        if ((i & SelfTester_JCP.DECRYPT_CBC) != 0) {
            list2 = list11;
            str2 = pskVar.A;
        } else {
            list2 = list11;
            str2 = str;
        }
        return new psk(divAccessibility, v3kVar, pdkVar, list3, expression, expression2, expression3, list4, hpkVar, afkVar, list5, divBorder, expression4, expression5, expression6, expression7, list6, list, arrayList, list8, divFocus, list9, divSize, expression8, list10, list2, str2, pskVar.B, pskVar.C, pskVar.D, pskVar.E, pskVar.F, pskVar.G, pskVar.H, pskVar.I, pskVar.J, pskVar.K, pskVar.L, pskVar.M, pskVar.N, pskVar.O, pskVar.P, pskVar.Q, pskVar.R, pskVar.S, pskVar.T, pskVar.U, pskVar.V, pskVar.W, pskVar.X, pskVar.Y, pskVar.Z, pskVar.a0, pskVar.b0, pskVar.c0, pskVar.d0);
    }

    @Override // defpackage.egk
    public final DivBorder A() {
        return this.l;
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
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Integer num = this.e0;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(psk.class).hashCode();
        int i19 = 0;
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
        int i20 = b2 + i;
        Expression expression = this.e;
        int hashCode2 = i20 + (expression != null ? expression.hashCode() : 0);
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
        int i21 = hashCode3 + i2;
        hpk hpkVar = this.i;
        int b3 = i21 + (hpkVar != null ? hpkVar.b() : 0);
        afk afkVar = this.j;
        int b4 = b3 + (afkVar != null ? afkVar.b() : 0);
        List list3 = this.k;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((kfk) it3.next()).b();
            }
        } else {
            i3 = 0;
        }
        int i22 = b4 + i3;
        DivBorder divBorder = this.l;
        int hashCode4 = this.m.hashCode() + i22 + (divBorder != null ? divBorder.b() : 0);
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
        int i23 = hashCode5 + i4;
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
        int i24 = i23 + i5;
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
        int i25 = i24 + i6;
        List list7 = this.t;
        if (list7 != null) {
            Iterator it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((qpk) it7.next()).b();
            }
        } else {
            i7 = 0;
        }
        int i26 = i25 + i7;
        DivFocus divFocus = this.u;
        int b5 = i26 + (divFocus != null ? divFocus.b() : 0);
        List list8 = this.v;
        if (list8 != null) {
            Iterator it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((irk) it8.next()).b();
            }
        } else {
            i8 = 0;
        }
        int hashCode6 = this.x.hashCode() + this.w.b() + b5 + i8;
        List list9 = this.y;
        if (list9 != null) {
            Iterator it9 = list9.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((v3k) it9.next()).b();
            }
        } else {
            i9 = 0;
        }
        int i27 = hashCode6 + i9;
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
        int i28 = i27 + i10;
        String str = this.A;
        int hashCode7 = this.B.hashCode() + i28 + (str != null ? str.hashCode() : 0);
        DivLayoutProvider divLayoutProvider = this.C;
        int b6 = hashCode7 + (divLayoutProvider != null ? divLayoutProvider.b() : 0);
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
        int i29 = b6 + i11;
        DivEdgeInsets divEdgeInsets = this.E;
        int b7 = i29 + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        DivEdgeInsets divEdgeInsets2 = this.F;
        int hashCode8 = this.H.hashCode() + this.G.hashCode() + b7 + (divEdgeInsets2 != null ? divEdgeInsets2.b() : 0);
        List list12 = this.I;
        if (list12 != null) {
            Iterator it12 = list12.iterator();
            i12 = 0;
            while (it12.hasNext()) {
                i12 += ((v3k) it12.next()).b();
            }
        } else {
            i12 = 0;
        }
        int i30 = hashCode8 + i12;
        List list13 = this.J;
        if (list13 != null) {
            Iterator it13 = list13.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((v3k) it13.next()).b();
            }
        } else {
            i13 = 0;
        }
        int i31 = i30 + i13;
        Expression expression4 = this.K;
        int hashCode9 = i31 + (expression4 != null ? expression4.hashCode() : 0);
        Expression expression5 = this.L;
        int hashCode10 = hashCode9 + (expression5 != null ? expression5.hashCode() : 0);
        Expression expression6 = this.M;
        int hashCode11 = this.N.hashCode() + hashCode10 + (expression6 != null ? expression6.hashCode() : 0);
        List list14 = this.O;
        if (list14 != null) {
            Iterator it14 = list14.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((v3k) it14.next()).b();
            }
        } else {
            i14 = 0;
        }
        int i32 = hashCode11 + i14;
        Expression expression7 = this.P;
        int hashCode12 = this.Q.hashCode() + i32 + (expression7 != null ? expression7.hashCode() : 0);
        List list15 = this.R;
        if (list15 != null) {
            Iterator it15 = list15.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((gil) it15.next()).b();
            }
        } else {
            i15 = 0;
        }
        int i33 = hashCode12 + i15;
        DivTransform divTransform = this.S;
        int b8 = i33 + (divTransform != null ? divTransform.b() : 0);
        List list16 = this.T;
        if (list16 != null) {
            Iterator it16 = list16.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((xjl) it16.next()).b();
            }
        } else {
            i16 = 0;
        }
        int i34 = b8 + i16;
        DivChangeTransition divChangeTransition = this.U;
        int b9 = i34 + (divChangeTransition != null ? divChangeTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition = this.V;
        int b10 = b9 + (divAppearanceTransition != null ? divAppearanceTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition2 = this.W;
        int b11 = b10 + (divAppearanceTransition2 != null ? divAppearanceTransition2.b() : 0);
        List list17 = this.X;
        int hashCode13 = b11 + (list17 != null ? list17.hashCode() : 0);
        List list18 = this.Y;
        if (list18 != null) {
            Iterator it17 = list18.iterator();
            i17 = 0;
            while (it17.hasNext()) {
                i17 += ((lll) it17.next()).b();
            }
        } else {
            i17 = 0;
        }
        int i35 = hashCode13 + i17;
        List list19 = this.Z;
        if (list19 != null) {
            Iterator it18 = list19.iterator();
            i18 = 0;
            while (it18.hasNext()) {
                i18 += ((c3) it18.next()).b();
            }
        } else {
            i18 = 0;
        }
        int hashCode14 = this.a0.hashCode() + i35 + i18;
        DivVisibilityAction divVisibilityAction = this.b0;
        int g = hashCode14 + (divVisibilityAction != null ? divVisibilityAction.g() : 0);
        List list20 = this.c0;
        if (list20 != null) {
            Iterator it19 = list20.iterator();
            while (it19.hasNext()) {
                i19 += ((DivVisibilityAction) it19.next()).g();
            }
        }
        int b12 = this.d0.b() + g + i19;
        this.e0 = Integer.valueOf(b12);
        return b12;
    }

    @Override // defpackage.egk
    public final Expression a() {
        return this.g;
    }

    @Override // defpackage.egk
    public final List b() {
        return this.c0;
    }

    @Override // defpackage.egk
    public final Expression c() {
        return this.n;
    }

    @Override // defpackage.egk
    public final List d() {
        return this.Z;
    }

    @Override // defpackage.egk
    public final DivEdgeInsets e() {
        return this.E;
    }

    @Override // defpackage.egk
    public final Expression f() {
        return this.M;
    }

    @Override // defpackage.egk
    public final Expression g() {
        return this.L;
    }

    @Override // defpackage.egk
    public final List getBackground() {
        return this.k;
    }

    @Override // defpackage.egk
    public final List getExtensions() {
        return this.s;
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
        return this.a0;
    }

    @Override // defpackage.egk
    public final DivSize getWidth() {
        return this.d0;
    }

    @Override // defpackage.egk
    public final Expression h() {
        return this.e;
    }

    @Override // defpackage.egk
    public final List i() {
        return this.R;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition j() {
        return this.W;
    }

    @Override // defpackage.egk
    public final DivChangeTransition k() {
        return this.U;
    }

    @Override // defpackage.egk
    public final List l() {
        return this.q;
    }

    @Override // defpackage.egk
    public final DivTransform m() {
        return this.S;
    }

    @Override // defpackage.egk
    public final List n() {
        return this.X;
    }

    @Override // defpackage.egk
    public final Expression o() {
        return this.f;
    }

    @Override // defpackage.egk
    public final DivFocus p() {
        return this.u;
    }

    @Override // defpackage.egk
    public final DivAccessibility q() {
        return this.a;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((dtk) ft6.b.i4.getValue()).b(ft6.a, this);
    }

    @Override // defpackage.egk
    public final DivEdgeInsets s() {
        return this.F;
    }

    @Override // defpackage.egk
    public final List t() {
        return this.O;
    }

    @Override // defpackage.egk
    public final DivLayoutProvider u() {
        return this.C;
    }

    @Override // defpackage.egk
    public final List v() {
        return this.Y;
    }

    @Override // defpackage.egk
    public final DivVisibilityAction w() {
        return this.b0;
    }

    @Override // defpackage.egk
    public final List x() {
        return this.v;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition y() {
        return this.V;
    }

    @Override // defpackage.egk
    public final List z() {
        return this.h;
    }
}
