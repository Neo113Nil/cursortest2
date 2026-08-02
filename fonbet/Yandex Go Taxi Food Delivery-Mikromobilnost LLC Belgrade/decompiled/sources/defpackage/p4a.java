package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class p4a {
    public final ArrayList a;

    public final boolean equals(Object obj) {
        if (obj instanceof p4a) {
            return this.a.equals(((p4a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.q("ChargersMultiOrderPayload(orderIds=", Extension.C_BRAKE, this.a);
    }
}
