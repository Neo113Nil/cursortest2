package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class i4a {
    public final ArrayList a;

    public final boolean equals(Object obj) {
        if (obj instanceof i4a) {
            return this.a.equals(((i4a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.q("ChargersMultiOrderModalPayload(orderIds=", Extension.C_BRAKE, this.a);
    }
}
