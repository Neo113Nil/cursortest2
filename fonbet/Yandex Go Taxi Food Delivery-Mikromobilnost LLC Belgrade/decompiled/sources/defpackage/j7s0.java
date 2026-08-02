package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class j7s0 implements ig5 {
    public static final h7s0 Companion = new h7s0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(6)), null};
    public final Map a;
    public final String b;

    public /* synthetic */ j7s0(int i, String str, Map map) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, f7s0.a.getDescriptor());
            throw null;
        }
        this.a = map;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7s0)) {
            return false;
        }
        j7s0 j7s0Var = (j7s0) obj;
        return jl40.l(this.a, j7s0Var.a) && jl40.l(this.b, j7s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowNativeScreenAction(params=" + this.a + ", route=" + this.b + Extension.C_BRAKE;
    }
}
