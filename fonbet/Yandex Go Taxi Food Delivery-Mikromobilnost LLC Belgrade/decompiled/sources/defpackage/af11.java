package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class af11 implements bnr0 {
    public final Map a;

    public af11(Map map) {
        this.a = map;
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        if (!(bnr0Var instanceof af11)) {
            return this;
        }
        return new af11(b.n(this.a, ((af11) bnr0Var).a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return af11.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((af11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("TriggersSharedData2(triggers=", Extension.C_BRAKE, this.a);
    }
}
