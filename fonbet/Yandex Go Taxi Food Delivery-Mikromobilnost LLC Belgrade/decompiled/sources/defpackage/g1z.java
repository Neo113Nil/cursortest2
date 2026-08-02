package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class g1z {
    public final List a;

    public g1z(int i) {
        this.a = scc.g(new lup0(), new lup0(), new lup0(), new lup0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1z) && jl40.l(this.a, ((g1z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("LoadingState(items=", Extension.C_BRAKE, this.a);
    }

    public g1z() {
        this(0);
    }
}
