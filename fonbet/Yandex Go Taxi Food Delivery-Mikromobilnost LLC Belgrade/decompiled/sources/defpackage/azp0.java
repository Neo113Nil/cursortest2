package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class azp0 {
    public final Float a;
    public final Float b;
    public final List c;

    public azp0(Float f, Float f2, List list) {
        this.a = f;
        this.b = f2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!azp0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        azp0 azp0Var = (azp0) obj;
        return jl40.k(this.a, azp0Var.a) && jl40.k(this.b, azp0Var.b) && jl40.l(this.c, azp0Var.c);
    }

    public final int hashCode() {
        Float f = this.a;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.b;
        int hashCode2 = (hashCode + (f2 != null ? f2.hashCode() : 0)) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Paddings(top=");
        sb.append(this.a);
        sb.append(", bottom=");
        sb.append(this.b);
        sb.append(", clipToSafeArea=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
