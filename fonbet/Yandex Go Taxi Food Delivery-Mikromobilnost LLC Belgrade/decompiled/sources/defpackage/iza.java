package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class iza {
    public final Map a;

    public iza() {
        this(b.f());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iza) && jl40.l(this.a, ((iza) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("CharityDeeplink(queryParams=", Extension.C_BRAKE, this.a);
    }

    public iza(Map map) {
        this.a = map;
    }
}
