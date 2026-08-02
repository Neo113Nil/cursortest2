package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ev01 {
    public final Text a;
    public final Text b;
    public final Text c;
    public final rbv d;

    public ev01(rbv rbvVar, Text text, Text text2, Text text3) {
        this.a = text;
        this.b = text2;
        this.c = text3;
        this.d = rbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev01)) {
            return false;
        }
        ev01 ev01Var = (ev01) obj;
        return jl40.l(this.a, ev01Var.a) && jl40.l(this.b, ev01Var.b) && this.c.equals(ev01Var.c) && this.d.equals(ev01Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + n.c(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder p = n.p("State(title=", this.a, ", description=", this.b, ", primaryLinkText=");
        p.append(this.c);
        p.append(", image=");
        p.append(this.d);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
