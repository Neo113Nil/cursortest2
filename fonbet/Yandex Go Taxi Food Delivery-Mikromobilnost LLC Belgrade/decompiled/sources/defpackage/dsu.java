package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class dsu {
    public final uru a;
    public final Map b;

    public dsu(Map map) {
        this.a = uru.a;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsu)) {
            return false;
        }
        dsu dsuVar = (dsu) obj;
        return jl40.l(this.a, dsuVar.a) && jl40.l(this.b, dsuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HostConfig(web=" + this.a + ", hosts=" + this.b + Extension.C_BRAKE;
    }

    public dsu() {
        this(0);
    }

    public /* synthetic */ dsu(int i) {
        this(b.f());
    }
}
