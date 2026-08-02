package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class b2m implements peo {
    public final boolean a;
    public final List b;

    public b2m(boolean z, List list) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2m)) {
            return false;
        }
        b2m b2mVar = (b2m) obj;
        return this.a == b2mVar.a && jl40.l(this.b, b2mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DocumentReloadRequestedEvent(retryAfterError=" + this.a + ", patchParams=" + this.b + Extension.C_BRAKE;
    }
}
