package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class b8o0 implements c8o0 {
    public final ArrayList a;

    public final boolean equals(Object obj) {
        if (obj instanceof b8o0) {
            return this.a.equals(((b8o0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.q("Start(packageIds=", Extension.C_BRAKE, this.a);
    }
}
