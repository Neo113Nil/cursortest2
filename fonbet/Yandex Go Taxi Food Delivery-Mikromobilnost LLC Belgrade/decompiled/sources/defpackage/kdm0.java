package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.entities.CellType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kdm0 {
    public final rbv a;
    public final Text b;
    public final Text c;
    public final Text d;
    public final String e;
    public final CellType f;

    public kdm0(rbv rbvVar, Text text, Text text2, Text text3, String str, CellType cellType) {
        this.a = rbvVar;
        this.b = text;
        this.c = text2;
        this.d = text3;
        this.e = str;
        this.f = cellType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdm0)) {
            return false;
        }
        kdm0 kdm0Var = (kdm0) obj;
        return jl40.l(this.a, kdm0Var.a) && jl40.l(this.b, kdm0Var.b) && jl40.l(this.c, kdm0Var.c) && jl40.l(this.d, kdm0Var.d) && jl40.l(this.e, kdm0Var.e) && this.f == kdm0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(n.c(this.d, n.c(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        String a = jr.a(this.e);
        StringBuilder sb = new StringBuilder("NoAccountWidgetState(image=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        ly3.C(sb, this.c, ", buttonTitle=", this.d, ", action=");
        sb.append(a);
        sb.append(", cellType=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
