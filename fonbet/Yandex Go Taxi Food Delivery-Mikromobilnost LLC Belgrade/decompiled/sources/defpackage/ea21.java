package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditViewState$StepChange;
import com.ybsdk.widgets.common.LoadableInput;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ea21 {
    public final hfb1 a;
    public final String b;
    public final LoadableInput.LoadingState c;
    public final Text.Resource d;
    public final Text e;
    public final Text f;
    public final List g;
    public final boolean h;
    public final int i;
    public final Text j;
    public final Text k;
    public final boolean l;
    public final List m;
    public final boolean n;
    public final Text.Resource o;
    public final boolean p;
    public final Text q;
    public final UpgradeEditViewState$StepChange r;

    public ea21(hfb1 hfb1Var, String str, LoadableInput.LoadingState loadingState, Text.Resource resource, Text text, Text text2, List list, boolean z, int i, Text text3, Text text4, boolean z2, List list2, boolean z3, Text.Resource resource2, boolean z4, Text text5, UpgradeEditViewState$StepChange upgradeEditViewState$StepChange) {
        this.a = hfb1Var;
        this.b = str;
        this.c = loadingState;
        this.d = resource;
        this.e = text;
        this.f = text2;
        this.g = list;
        this.h = z;
        this.i = i;
        this.j = text3;
        this.k = text4;
        this.l = z2;
        this.m = list2;
        this.n = z3;
        this.o = resource2;
        this.p = z4;
        this.q = text5;
        this.r = upgradeEditViewState$StepChange;
    }

    public final boolean a() {
        return this.n;
    }

    public final Text b() {
        return this.o;
    }

    public final Text c() {
        return this.q;
    }

    public final boolean d() {
        return this.p;
    }

    public final Text e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea21)) {
            return false;
        }
        ea21 ea21Var = (ea21) obj;
        return this.a.equals(ea21Var.a) && this.b.equals(ea21Var.b) && this.c == ea21Var.c && this.d.equals(ea21Var.d) && this.e.equals(ea21Var.e) && jl40.l(this.f, ea21Var.f) && this.g.equals(ea21Var.g) && this.h == ea21Var.h && this.i == ea21Var.i && jl40.l(this.j, ea21Var.j) && jl40.l(this.k, ea21Var.k) && this.l == ea21Var.l && jl40.l(this.m, ea21Var.m) && this.n == ea21Var.n && this.o.equals(ea21Var.o) && this.p == ea21Var.p && jl40.l(this.q, ea21Var.q) && this.r == ea21Var.r;
    }

    public final String f() {
        return this.b;
    }

    public final hfb1 g() {
        return this.a;
    }

    public final Text h() {
        return this.d;
    }

    public final int hashCode() {
        int e = unr0.e(uw51.b(this.o, unr0.e(unr0.c(unr0.e(n.c(this.k, n.c(this.j, oyr.b(this.i, unr0.e(unr0.c(n.c(this.f, n.c(this.e, uw51.b(this.d, (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31), 31), 31, this.g), 31, this.h), 31), 31), 31), 31, this.l), 31, this.m), 31, this.n), 31), 31, this.p);
        Text text = this.q;
        return this.r.hashCode() + ((e + (text == null ? 0 : text.hashCode())) * 31);
    }

    public final LoadableInput.LoadingState i() {
        return this.c;
    }

    public final List j() {
        return this.m;
    }

    public final Text k() {
        return this.f;
    }

    public final int l() {
        return this.i;
    }

    public final Text m() {
        return this.k;
    }

    public final Text n() {
        return this.j;
    }

    public final boolean o() {
        return this.h;
    }

    public final UpgradeEditViewState$StepChange p() {
        return this.r;
    }

    public final List q() {
        return this.g;
    }

    public final boolean r() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpgradeEditViewState(inputType=");
        sb.append(this.a);
        sb.append(", inputText=");
        sb.append(this.b);
        sb.append(", loadingState=");
        sb.append(this.c);
        sb.append(", labelText=");
        sb.append(this.d);
        sb.append(", helperText=");
        ly3.C(sb, this.e, ", placeholderText=", this.f, ", suggests=");
        nzs.p(sb, this.g, ", showSuggests=", this.h, ", progress=");
        sb.append(this.i);
        sb.append(", progressText=");
        sb.append(this.j);
        sb.append(", progressDescription=");
        sb.append(this.k);
        sb.append(", isFormatterNeeded=");
        sb.append(this.l);
        sb.append(", pattern=");
        nzs.p(sb, this.m, ", buttonBackVisible=", this.n, ", buttonNextText=");
        sb.append(this.o);
        sb.append(", hasError=");
        sb.append(this.p);
        sb.append(", errorText=");
        sb.append(this.q);
        sb.append(", stepChange=");
        sb.append(this.r);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
