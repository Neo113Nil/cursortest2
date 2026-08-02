package defpackage;

import com.ybsdk.api.entities.YBProduct;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class amt {
    public final YBProduct a;
    public final qxa1 b;

    public amt(YBProduct yBProduct, qxa1 qxa1Var) {
        this.a = yBProduct;
        this.b = qxa1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amt)) {
            return false;
        }
        amt amtVar = (amt) obj;
        return this.a == amtVar.a && this.b.equals(amtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GoActionDeeplinkParams(product=" + this.a + ", navigation=" + this.b + Extension.C_BRAKE;
    }
}
