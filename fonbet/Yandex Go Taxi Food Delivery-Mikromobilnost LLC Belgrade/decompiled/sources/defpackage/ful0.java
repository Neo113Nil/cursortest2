package defpackage;

import com.yandex.go.safety.center.experiment.SafetyCenterWebConfig;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ful0 {
    public final SafetyCenterWebConfig a;
    public final Map b;
    public final String c;

    public ful0(SafetyCenterWebConfig safetyCenterWebConfig, Map map, String str) {
        this.a = safetyCenterWebConfig;
        this.b = map;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ful0)) {
            return false;
        }
        ful0 ful0Var = (ful0) obj;
        return jl40.l(this.a, ful0Var.a) && jl40.l(this.b, ful0Var.b) && jl40.l(this.c, ful0Var.c);
    }

    public final int hashCode() {
        int d = unr0.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafetyCenterWebData(config=");
        sb.append(this.a);
        sb.append(", l10n=");
        sb.append(this.b);
        sb.append(", orderId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
