package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class k8m0 extends n8m0 {
    public final Text.Constant b;
    public final Text c;
    public final rr51 d;
    public final Text e;
    public final Text.Constant f;
    public final j8m0 g;
    public final Text.Constant h;
    public final boolean i;
    public final ArrayList j;
    public final YbButtonViewGroup.b k;
    public final lur0 l;
    public final boolean m;

    public k8m0(Text.Constant constant, Text.Constant constant2, rr51 rr51Var, Text.Constant constant3, Text.Constant constant4, j8m0 j8m0Var, Text.Constant constant5, boolean z, ArrayList arrayList, YbButtonViewGroup.b bVar, lur0 lur0Var, boolean z2) {
        super(lur0Var);
        this.b = constant;
        this.c = constant2;
        this.d = rr51Var;
        this.e = constant3;
        this.f = constant4;
        this.g = j8m0Var;
        this.h = constant5;
        this.i = z;
        this.j = arrayList;
        this.k = bVar;
        this.l = lur0Var;
        this.m = z2;
    }

    public final Text b() {
        return this.h;
    }

    public final YbButtonViewGroup.b c() {
        return this.k;
    }

    public final boolean d() {
        return this.i;
    }

    public final rr51 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8m0)) {
            return false;
        }
        k8m0 k8m0Var = (k8m0) obj;
        return this.b.equals(k8m0Var.b) && jl40.l(this.c, k8m0Var.c) && jl40.l(this.d, k8m0Var.d) && jl40.l(this.e, k8m0Var.e) && this.f.equals(k8m0Var.f) && this.g.equals(k8m0Var.g) && this.h.equals(k8m0Var.h) && this.i == k8m0Var.i && this.j.equals(k8m0Var.j) && jl40.l(this.k, k8m0Var.k) && this.l.equals(k8m0Var.l) && this.m == k8m0Var.m;
    }

    public final Text f() {
        return this.f;
    }

    public final Text g() {
        return this.e;
    }

    public final boolean h() {
        return this.m;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Text text = this.c;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        rr51 rr51Var = this.d;
        int hashCode3 = (hashCode2 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        Text text2 = this.e;
        int b = ly3.b(unr0.e(xvz.d(this.h, (this.g.hashCode() + xvz.d(this.f, (hashCode3 + (text2 == null ? 0 : text2.hashCode())) * 31, 31)) * 31, 31), 31, this.i), 31, this.j);
        YbButtonViewGroup.b bVar = this.k;
        return Boolean.hashCode(this.m) + ((this.l.hashCode() + ((b + (bVar != null ? bVar.hashCode() : 0)) * 31)) * 31);
    }

    public final Text i() {
        return this.c;
    }

    public final j8m0 j() {
        return this.g;
    }

    public final Text k() {
        return this.b;
    }

    public final List l() {
        return this.j;
    }

    public final String toString() {
        return "Content(title=" + this.b + ", subtitle=" + this.c + ", divSubtitle=" + this.d + ", goal=" + this.e + ", gains=" + this.f + ", theme=" + this.g + ", balance=" + this.h + ", canAnimateBalance=" + this.i + ", widgets=" + this.j + ", buttonsState=" + this.k + ", shimmerTimeStatus=" + this.l + ", shouldRenderContent=" + this.m + Extension.C_BRAKE;
    }
}
