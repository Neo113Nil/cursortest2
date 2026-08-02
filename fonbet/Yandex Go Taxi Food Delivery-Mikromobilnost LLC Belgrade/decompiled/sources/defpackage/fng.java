package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fng {
    public final List a;
    public final boolean b;
    public final kao c;
    public final String d;
    public final Text e;
    public final Text f;
    public final ColorModel g;
    public final dq51 h;
    public final riw0 i;
    public final boolean j;
    public final rhg k;
    public final rbv l;
    public final boolean m;
    public final rbv n;
    public final skg o;
    public final ColorModel p;
    public final ColorModel q;
    public final boolean r;
    public final List s;
    public final YbButtonView.a t;
    public final llg u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;

    public fng(ListBuilder listBuilder, boolean z, kao kaoVar, String str, Text text, Text.Constant constant, ColorModel colorModel, dq51 dq51Var, riw0 riw0Var, boolean z2, qhg qhgVar, rbv rbvVar, boolean z3, rbv rbvVar2, skg skgVar, ColorModel colorModel2, ColorModel colorModel3, boolean z4, List list, YbButtonView.a aVar, llg llgVar, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.a = listBuilder;
        this.b = z;
        this.c = kaoVar;
        this.d = str;
        this.e = text;
        this.f = constant;
        this.g = colorModel;
        this.h = dq51Var;
        this.i = riw0Var;
        this.j = z2;
        this.k = qhgVar;
        this.l = rbvVar;
        this.m = z3;
        this.n = rbvVar2;
        this.o = skgVar;
        this.p = colorModel2;
        this.q = colorModel3;
        this.r = z4;
        this.s = list;
        this.t = aVar;
        this.u = llgVar;
        this.v = z5;
        this.w = z6;
        this.x = z7;
        this.y = z8;
    }

    public final Text a() {
        return this.e;
    }

    public final String b() {
        return this.d;
    }

    public final ColorModel c() {
        return this.p;
    }

    public final YbButtonView.a d() {
        return this.t;
    }

    public final rhg e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fng)) {
            return false;
        }
        fng fngVar = (fng) obj;
        return jl40.l(this.a, fngVar.a) && this.b == fngVar.b && jl40.l(this.c, fngVar.c) && this.d.equals(fngVar.d) && jl40.l(this.e, fngVar.e) && jl40.l(this.f, fngVar.f) && this.g.equals(fngVar.g) && jl40.l(this.h, fngVar.h) && this.i.equals(fngVar.i) && this.j == fngVar.j && jl40.l(this.k, fngVar.k) && jl40.l(this.l, fngVar.l) && this.m == fngVar.m && this.n.equals(fngVar.n) && jl40.l(this.o, fngVar.o) && this.p.equals(fngVar.p) && this.q.equals(fngVar.q) && this.r == fngVar.r && jl40.l(this.s, fngVar.s) && jl40.l(this.t, fngVar.t) && this.u.equals(fngVar.u) && this.v == fngVar.v && this.w == fngVar.w && this.x == fngVar.x && this.y == fngVar.y;
    }

    public final dq51 f() {
        return this.h;
    }

    public final kao g() {
        return this.c;
    }

    public final List h() {
        return this.a;
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        kao kaoVar = this.c;
        int b = unr0.b((e + (kaoVar == null ? 0 : kaoVar.hashCode())) * 31, 31, this.d);
        Text text = this.e;
        int hashCode = (b + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.f;
        int d = vfc.d(this.g, (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31, 31);
        dq51 dq51Var = this.h;
        int e2 = unr0.e((this.i.hashCode() + ((d + (dq51Var == null ? 0 : dq51Var.hashCode())) * 31)) * 31, 31, this.j);
        rhg rhgVar = this.k;
        int hashCode2 = (e2 + (rhgVar == null ? 0 : rhgVar.hashCode())) * 31;
        rbv rbvVar = this.l;
        int c = ly3.c(this.n, unr0.e((hashCode2 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31, 31, this.m), 31);
        skg skgVar = this.o;
        int e3 = unr0.e(vfc.d(this.q, vfc.d(this.p, (c + (skgVar == null ? 0 : skgVar.hashCode())) * 31, 31), 31), 31, this.r);
        List list = this.s;
        int hashCode3 = (e3 + (list == null ? 0 : list.hashCode())) * 31;
        YbButtonView.a aVar = this.t;
        return Boolean.hashCode(this.y) + unr0.e(unr0.e(unr0.e((this.u.hashCode() + ((hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31)) * 31, 31, this.v), 31, this.w), 31, this.x);
    }

    public final boolean i() {
        return this.b;
    }

    public final skg j() {
        return this.o;
    }

    public final llg k() {
        return this.u;
    }

    public final boolean l() {
        return this.y;
    }

    public final boolean m() {
        return this.x;
    }

    public final boolean n() {
        return this.w;
    }

    public final boolean o() {
        return this.j;
    }

    public final ColorModel p() {
        return this.g;
    }

    public final Text q() {
        return this.f;
    }

    public final riw0 r() {
        return this.i;
    }

    public final ColorModel s() {
        return this.q;
    }

    public final List t() {
        return this.s;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DashboardViewState(listItems=");
        sb.append(this.a);
        sb.append(", loading=");
        sb.append(this.b);
        sb.append(", errorState=");
        sb.append(this.c);
        sb.append(", balance=");
        sb.append(this.d);
        sb.append(", accountHeaderText=");
        ly3.C(sb, this.e, ", subtitleText=", this.f, ", subtitleColor=");
        sb.append(this.g);
        sb.append(", cardStatus=");
        sb.append(this.h);
        sb.append(", supportButton=");
        sb.append(this.i);
        sb.append(", showProfileButton=");
        sb.append(this.j);
        sb.append(", bottomSheetState=");
        sb.append(this.k);
        sb.append(", userAvatarImageModel=");
        sb.append(this.l);
        sb.append(", isCardVisible=");
        sb.append(this.m);
        sb.append(", walletIcon=");
        sb.append(this.n);
        sb.append(", logoInfo=");
        sb.append(this.o);
        sb.append(", balanceColor=");
        sb.append(this.p);
        sb.append(", titleColor=");
        sb.append(this.q);
        sb.append(", isBalanceBottomButtonsVisible=");
        sb.append(this.r);
        sb.append(", topButtons=");
        sb.append(this.s);
        sb.append(", bottomButtonState=");
        sb.append(this.t);
        sb.append(", shimmerState=");
        sb.append(this.u);
        sb.append(", isLoadingOrError=");
        sb.append(this.v);
        sb.append(", shouldShowSubtitleView=");
        nnm.v(", shouldShowRecyclerToolbar=", ", shouldShowContainerToolbar=", sb, this.w, this.x);
        return x4e.i(sb, this.y, Extension.C_BRAKE);
    }

    public final rbv u() {
        return this.l;
    }

    public final rbv v() {
        return this.n;
    }

    public final boolean w() {
        return this.r;
    }

    public final boolean x() {
        return this.m;
    }

    public final boolean y() {
        return this.v;
    }
}
