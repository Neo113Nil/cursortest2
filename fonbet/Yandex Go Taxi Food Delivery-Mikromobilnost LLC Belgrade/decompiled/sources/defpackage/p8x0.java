package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class p8x0 implements r9x0 {
    public final Map a;

    public p8x0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8x0) && this.a.equals(((p8x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("ChangeClientStateAction(stateDiff=", Extension.C_BRAKE, this.a);
    }
}
