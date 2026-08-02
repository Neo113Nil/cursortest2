package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class p2g0 extends s2g0 {
    public final String a;
    public final Map b;

    public p2g0(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2g0)) {
            return false;
        }
        p2g0 p2g0Var = (p2g0) obj;
        return jl40.l(this.a, p2g0Var.a) && jl40.l(this.b, p2g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("DeliveryStateChanged(deliveryId=", this.a, ", meta=", Extension.C_BRAKE, this.b);
    }
}
