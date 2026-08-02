package defpackage;

import com.ybsdk.feature.qr.payments.api.data.BoostStrategy;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ka6 {
    public final BoostStrategy a;
    public final Map b;

    public ka6(BoostStrategy boostStrategy, Map map) {
        this.a = boostStrategy;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka6)) {
            return false;
        }
        ka6 ka6Var = (ka6) obj;
        return this.a == ka6Var.a && jl40.l(this.b, ka6Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "BoostStrategyEntity(strategy=" + this.a + ", boostWidgetVariables=" + this.b + Extension.C_BRAKE;
    }
}
