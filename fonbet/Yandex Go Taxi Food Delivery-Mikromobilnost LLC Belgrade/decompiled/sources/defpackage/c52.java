package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class c52 implements bnr0 {
    public static final c52 b = new c52(b.f());
    public final Map a;

    public c52(Map map) {
        this.a = map;
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        if (!(bnr0Var instanceof c52)) {
            return this;
        }
        return new c52(b.n(this.a, ((c52) bnr0Var).a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c52) && jl40.l(this.a, ((c52) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("AnalyticsSharedData(analytics=", Extension.C_BRAKE, this.a);
    }
}
