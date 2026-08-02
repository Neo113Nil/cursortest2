package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class obs0 implements bnr0 {
    public final Map a;

    public obs0(Map map) {
        this.a = map;
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        if (!(bnr0Var instanceof obs0)) {
            return this;
        }
        return new obs0(b.n(this.a, ((obs0) bnr0Var).a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obs0.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((obs0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("SignalsSharedData(signals=", Extension.C_BRAKE, this.a);
    }
}
