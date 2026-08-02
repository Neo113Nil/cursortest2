package defpackage;

import android.widget.ImageView;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes4.dex */
public final class gzt0 {
    public final rbv a;
    public final Integer b;
    public final ImageView.ScaleType c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Text g;
    public final Text.Constant h;
    public final int i;
    public final int j;
    public final Text k;
    public final boolean l;
    public final Text.Constant m;
    public final int n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final t451 t;

    public gzt0(rbv rbvVar, Integer num, ImageView.ScaleType scaleType, Integer num2, Integer num3, Integer num4, Text.Resource resource, Text.Constant constant, int i, Text.Resource resource2, Text.Constant constant2, int i2, boolean z, boolean z2, boolean z3, t451 t451Var, int i3) {
        int i4 = (i3 & 256) != 0 ? 2 : i;
        boolean z4 = (i3 & 2048) == 0;
        int i5 = ung0.ybColor_textIcon_secondary;
        boolean z5 = (524288 & i3) != 0 ? false : z2;
        boolean z6 = (2097152 & i3) != 0 ? true : z3;
        t451 t451Var2 = (i3 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? null : t451Var;
        this.a = rbvVar;
        this.b = num;
        this.c = scaleType;
        this.d = num2;
        this.e = num3;
        this.f = num4;
        this.g = resource;
        this.h = constant;
        this.i = i4;
        this.j = 0;
        this.k = resource2;
        this.l = z4;
        this.m = constant2;
        this.n = i5;
        this.o = i2;
        this.p = true;
        this.q = z;
        this.r = z5;
        this.s = z6;
        this.t = t451Var2;
    }

    public final Text a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzt0)) {
            return false;
        }
        gzt0 gzt0Var = (gzt0) obj;
        return jl40.l(this.a, gzt0Var.a) && jl40.l(this.b, gzt0Var.b) && this.c == gzt0Var.c && jl40.l(this.d, gzt0Var.d) && jl40.l(this.e, gzt0Var.e) && jl40.l(this.f, gzt0Var.f) && jl40.l(this.g, gzt0Var.g) && jl40.l(this.h, gzt0Var.h) && this.i == gzt0Var.i && this.j == gzt0Var.j && jl40.l(this.k, gzt0Var.k) && this.l == gzt0Var.l && jl40.l(this.m, gzt0Var.m) && this.n == gzt0Var.n && this.o == gzt0Var.o && this.p == gzt0Var.p && this.q == gzt0Var.q && this.r == gzt0Var.r && this.s == gzt0Var.s && jl40.l(this.t, gzt0Var.t);
    }

    public final int hashCode() {
        rbv rbvVar = this.a;
        int hashCode = (rbvVar == null ? 0 : rbvVar.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        Integer num2 = this.d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Text text = this.g;
        int b = oyr.b(this.j, oyr.b(this.i, xvz.d(this.h, (hashCode5 + (text == null ? 0 : text.hashCode())) * 31, 31), 31), 31);
        Text text2 = this.k;
        int e = unr0.e((b + (text2 == null ? 0 : text2.hashCode())) * 31, 31, this.l);
        Text.Constant constant = this.m;
        int e2 = unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(oyr.b(this.o, oyr.b(this.n, (e + (constant == null ? 0 : constant.hashCode())) * 31, 31), 31), 31, this.p), 31, false), 961, this.q), 31, this.r), 31, false), 31, this.s);
        t451 t451Var = this.t;
        return e2 + (t451Var != null ? t451Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StadiumButtonViewState(leftImage=");
        sb.append(this.a);
        sb.append(", leftImageBackground=");
        sb.append(this.b);
        sb.append(", leftImageScale=");
        sb.append(this.c);
        sb.append(", leftImagePadding=");
        sb.append(this.d);
        sb.append(", rightImageResource=");
        sb.append(this.e);
        sb.append(", rightImageBackground=");
        sb.append(this.f);
        sb.append(", rightImageContentDescription=");
        sb.append(this.g);
        sb.append(", primaryText=");
        sb.append(this.h);
        sb.append(", primaryTextMaxLines=");
        vfc.u(this.i, this.j, ", primaryTextFinDrawable=", ", primaryTextContentDescription=", sb);
        sb.append(this.k);
        sb.append(", isButtonTextImportantForAccessibility=");
        sb.append(this.l);
        sb.append(", secondaryText=");
        sb.append(this.m);
        sb.append(", secondaryTextColor=");
        sb.append(this.n);
        sb.append(", textGravity=");
        tse0.z(sb, this.o, ", isEnabled=", this.p, ", isProgressVisible=false, rightPartClickable=");
        nnm.v(", totalContentDescription=null, shouldSpoilerSecondaryText=", ", isSecondaryTextImportantForAccessibility=false, clickable=", sb, this.q, this.r);
        sb.append(this.s);
        sb.append(", widgetWithToggleViewState=");
        sb.append(this.t);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
