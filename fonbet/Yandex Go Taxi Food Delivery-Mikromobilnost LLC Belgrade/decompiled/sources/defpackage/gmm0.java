package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class gmm0 extends kr {
    public static final fmm0 Companion = new fmm0();
    public static final i3y[] c;
    public final v5x a;
    public final Map b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new jrl0(3)), a.b(lazyThreadSafetyMode, new jrl0(4))};
    }

    public /* synthetic */ gmm0(int i, v5x v5xVar, Map map) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, emm0.a.getDescriptor());
            throw null;
        }
        this.a = v5xVar;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gmm0.class != obj.getClass()) {
            return false;
        }
        gmm0 gmm0Var = (gmm0) obj;
        return jl40.l(this.a, gmm0Var.a) && jl40.l(this.b, gmm0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "ScenarioAction(scenario=" + this.a + ", effects=" + this.b + Extension.C_BRAKE;
    }
}
