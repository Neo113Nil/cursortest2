package defpackage;

import com.yandex.go.hiredriver.api.HireDriverOpenReason;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hku implements jku {
    public final Map a;

    public hku(Map map) {
        this.a = map;
        HireDriverOpenReason hireDriverOpenReason = HireDriverOpenReason.MENU;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hku) && jl40.l(this.a, ((hku) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("Deeplink(queryParams=", Extension.C_BRAKE, this.a);
    }
}
