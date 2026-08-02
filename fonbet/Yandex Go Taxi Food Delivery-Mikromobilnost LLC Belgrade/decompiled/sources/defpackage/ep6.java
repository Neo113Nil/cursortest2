package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ep6 {
    public final Text a;
    public final Text b;
    public final rbv c;
    public final YbButtonView.a d;
    public final boolean e;

    public ep6(Text text, Text text2, rbv rbvVar, YbButtonView.a aVar, boolean z) {
        this.a = text;
        this.b = text2;
        this.c = rbvVar;
        this.d = aVar;
        this.e = z;
    }

    public final YbButtonView.a a() {
        return this.d;
    }

    public final rbv b() {
        return this.c;
    }

    public final boolean c() {
        return this.e;
    }

    public final Text d() {
        return this.b;
    }

    public final Text e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep6)) {
            return false;
        }
        ep6 ep6Var = (ep6) obj;
        return jl40.l(this.a, ep6Var.a) && jl40.l(this.b, ep6Var.b) && jl40.l(this.c, ep6Var.c) && jl40.l(this.d, ep6Var.d) && this.e == ep6Var.e;
    }

    public final int hashCode() {
        int c = n.c(this.b, this.a.hashCode() * 31, 31);
        rbv rbvVar = this.c;
        int hashCode = (c + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        YbButtonView.a aVar = this.d;
        return Boolean.hashCode(this.e) + ((hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder p = n.p("BudgetChargesSearchStatusSuccessViewState(title=", this.a, ", subtitle=", this.b, ", image=");
        p.append(this.c);
        p.append(", button=");
        p.append(this.d);
        p.append(", showProgress=");
        return x4e.i(p, this.e, Extension.C_BRAKE);
    }
}
