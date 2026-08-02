package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kp80 implements mp80 {
    public final fm80 a;
    public final List b;

    public kp80(fm80 fm80Var, List list) {
        this.a = fm80Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp80)) {
            return false;
        }
        kp80 kp80Var = (kp80) obj;
        return jl40.l(this.a, kp80Var.a) && jl40.l(this.b, kp80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Empty(config=" + this.a + ", chips=" + this.b + Extension.C_BRAKE;
    }
}
