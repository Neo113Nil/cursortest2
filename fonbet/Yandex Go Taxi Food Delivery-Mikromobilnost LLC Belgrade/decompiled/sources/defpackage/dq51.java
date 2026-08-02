package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dq51 {
    public final rbv a;
    public final rbv b;
    public final Text c;
    public final Text.Resource d;
    public final boolean e;

    public dq51(nbv nbvVar, rbv rbvVar, Text.Resource resource, Text.Resource resource2, boolean z) {
        this.a = nbvVar;
        this.b = rbvVar;
        this.c = resource;
        this.d = resource2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq51)) {
            return false;
        }
        dq51 dq51Var = (dq51) obj;
        return jl40.l(this.a, dq51Var.a) && jl40.l(this.b, dq51Var.b) && jl40.l(this.c, dq51Var.c) && this.d.equals(dq51Var.d) && this.e == dq51Var.e;
    }

    public final int hashCode() {
        rbv rbvVar = this.a;
        int c = ly3.c(this.b, (rbvVar == null ? 0 : rbvVar.hashCode()) * 31, 31);
        Text text = this.c;
        return Boolean.hashCode(this.e) + uw51.b(this.d, (c + (text != null ? text.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(imageStatus=");
        sb.append(this.a);
        sb.append(", imageCard=");
        sb.append(this.b);
        sb.append(", tooltip=");
        sb.append(this.c);
        sb.append(", contentDescription=");
        sb.append(this.d);
        sb.append(", hasProgress=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
