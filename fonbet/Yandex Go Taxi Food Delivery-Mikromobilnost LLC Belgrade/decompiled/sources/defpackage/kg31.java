package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kg31 implements pre {
    public final String a;
    public final ArrayList b;
    public final rh4 c;
    public final int d;
    public final o690 e;
    public final o690 f;
    public final String g;

    public kg31(String str, ArrayList arrayList, rh4 rh4Var, int i, o690 o690Var, o690 o690Var2, String str2) {
        this.a = str;
        this.b = arrayList;
        this.c = rh4Var;
        this.d = i;
        this.e = o690Var;
        this.f = o690Var2;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg31)) {
            return false;
        }
        kg31 kg31Var = (kg31) obj;
        return jl40.l(this.a, kg31Var.a) && this.b.equals(kg31Var.b) && jl40.l(this.c, kg31Var.c) && this.d == kg31Var.d && jl40.l(this.e, kg31Var.e) && jl40.l(this.f, kg31Var.f) && jl40.l(this.g, kg31Var.g);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "vertical-stack";
    }

    public final int hashCode() {
        int b = ly3.b(this.a.hashCode() * 31, 31, this.b);
        rh4 rh4Var = this.c;
        int b2 = oyr.b(this.d, (b + (rh4Var == null ? 0 : rh4Var.hashCode())) * 31, 31);
        o690 o690Var = this.e;
        int hashCode = (b2 + (o690Var == null ? 0 : o690Var.hashCode())) * 31;
        o690 o690Var2 = this.f;
        int hashCode2 = (hashCode + (o690Var2 == null ? 0 : o690Var2.hashCode())) * 31;
        String str = this.g;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = x4e.m("VerticalStackRemoteCoreWidget(id=", this.a, ", widgets=", ", background=", this.b);
        m.append(this.c);
        m.append(", cornerRadius=");
        m.append(this.d);
        m.append(", paddings=");
        m.append(this.e);
        m.append(", contentPaddings=");
        m.append(this.f);
        m.append(", metricaLabel=");
        return oyr.t(m, this.g, Extension.C_BRAKE);
    }
}
