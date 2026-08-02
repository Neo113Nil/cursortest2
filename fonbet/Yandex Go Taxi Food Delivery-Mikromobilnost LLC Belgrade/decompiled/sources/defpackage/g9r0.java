package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class g9r0 implements e9r0 {
    public final String a;
    public final Text b;
    public final Text c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final q8r0 h;
    public final int i;
    public final rbv j;

    public g9r0(String str, Text text, Text text2, boolean z, boolean z2, boolean z3, boolean z4, q8r0 q8r0Var, rbv rbvVar) {
        int i = l1i0.Widget_YB_Text_Title1;
        this.a = str;
        this.b = text;
        this.c = text2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = q8r0Var;
        this.i = i;
        this.j = rbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9r0)) {
            return false;
        }
        g9r0 g9r0Var = (g9r0) obj;
        return jl40.l(this.a, g9r0Var.a) && jl40.l(this.b, g9r0Var.b) && jl40.l(this.c, g9r0Var.c) && this.d == g9r0Var.d && this.e == g9r0Var.e && this.f == g9r0Var.f && this.g == g9r0Var.g && jl40.l(this.h, g9r0Var.h) && this.i == g9r0Var.i && jl40.l(this.j, g9r0Var.j);
    }

    @Override // defpackage.e9r0
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        int b = oyr.b(this.i, (this.h.hashCode() + unr0.e(unr0.e(unr0.e(unr0.e(n.c(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 961, 29791);
        rbv rbvVar = this.j;
        return b + (rbvVar == null ? 0 : rbvVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsListSwitchItem(key=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", enabled=");
        sb.append(this.d);
        sb.append(", checked=");
        nnm.v(", isLoading=", ", clickable=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", payload=");
        sb.append(this.h);
        sb.append(", action=null, titleStyle=");
        sb.append(this.i);
        sb.append(", descriptionEndIcon=null, subtitleAction=null, image=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
