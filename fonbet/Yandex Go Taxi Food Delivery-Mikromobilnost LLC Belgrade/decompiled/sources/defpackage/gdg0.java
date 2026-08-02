package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gdg0 {
    public final fdg0 a;
    public final rbv b;
    public final Text c;
    public final Text d;
    public final YbButtonView.a e;

    public gdg0(fdg0 fdg0Var, rbv rbvVar, Text text, Text text2, YbButtonView.a aVar) {
        this.a = fdg0Var;
        this.b = rbvVar;
        this.c = text;
        this.d = text2;
        this.e = aVar;
    }

    public final YbButtonView.a a() {
        return this.e;
    }

    public final Text b() {
        return this.d;
    }

    public final rbv c() {
        return this.b;
    }

    public final Text d() {
        return this.c;
    }

    public final fdg0 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdg0)) {
            return false;
        }
        gdg0 gdg0Var = (gdg0) obj;
        return this.a.equals(gdg0Var.a) && jl40.l(this.b, gdg0Var.b) && jl40.l(this.c, gdg0Var.c) && jl40.l(this.d, gdg0Var.d) && this.e.equals(gdg0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rbv rbvVar = this.b;
        return this.e.hashCode() + n.c(this.d, n.c(this.c, (hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QrRefreshViewState(toolbar=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", title=");
        ly3.C(sb, this.c, ", decription=", this.d, ", button=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
