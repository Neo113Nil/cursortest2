package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.c;
import com.ybsdk.widgets.common.e;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class on01 {
    public final List a;
    public final String b;
    public final Text c;
    public final Text.Resource d;
    public final kao e;
    public final e f;
    public final boolean g;
    public final boolean h;
    public final stz0 i;
    public final boolean j;
    public final boolean k;

    public on01(List list, String str, Text.Constant constant, Text.Resource resource, kao kaoVar, c cVar, boolean z, boolean z2, stz0 stz0Var, boolean z3, boolean z4) {
        this.a = list;
        this.b = str;
        this.c = constant;
        this.d = resource;
        this.e = kaoVar;
        this.f = cVar;
        this.g = z;
        this.h = z2;
        this.i = stz0Var;
        this.j = z3;
        this.k = z4;
    }

    public final boolean a() {
        return this.g;
    }

    public final kao b() {
        return this.e;
    }

    public final Text c() {
        return this.d;
    }

    public final Text d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on01)) {
            return false;
        }
        on01 on01Var = (on01) obj;
        return jl40.l(this.a, on01Var.a) && jl40.l(this.b, on01Var.b) && jl40.l(this.c, on01Var.c) && this.d.equals(on01Var.d) && jl40.l(this.e, on01Var.e) && jl40.l(this.f, on01Var.f) && this.g == on01Var.g && this.h == on01Var.h && this.i.equals(on01Var.i) && this.j == on01Var.j && this.k == on01Var.k;
    }

    public final e f() {
        return this.f;
    }

    public final List g() {
        return this.a;
    }

    public final boolean h() {
        return this.k;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Text text = this.c;
        int b2 = uw51.b(this.d, (b + (text == null ? 0 : text.hashCode())) * 31, 31);
        kao kaoVar = this.e;
        int hashCode = (b2 + (kaoVar == null ? 0 : kaoVar.hashCode())) * 31;
        e eVar = this.f;
        return Boolean.hashCode(this.k) + unr0.e((this.i.hashCode() + unr0.e(unr0.e((hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31, 31, this.g), 31, this.h)) * 31, 31, this.j);
    }

    public final boolean i() {
        return this.h;
    }

    public final stz0 j() {
        return this.i;
    }

    public final boolean k() {
        return this.j;
    }

    public final String toString() {
        StringBuilder s = xvz.s("TransferPhoneInputViewState(recyclerItems=", this.a, ", filterText=", this.b, ", filterPrefix=");
        s.append(this.c);
        s.append(", filterPlaceholder=");
        s.append(this.d);
        s.append(", errorView=");
        s.append(this.e);
        s.append(", fullscreenView=");
        s.append(this.f);
        s.append(", animateRecycler=");
        nnm.v(", scrollToTop=", ", toolbarState=", s, this.g, this.h);
        s.append(this.i);
        s.append(", isInputInteractive=");
        s.append(this.j);
        s.append(", requestFocus=");
        return x4e.i(s, this.k, Extension.C_BRAKE);
    }
}
