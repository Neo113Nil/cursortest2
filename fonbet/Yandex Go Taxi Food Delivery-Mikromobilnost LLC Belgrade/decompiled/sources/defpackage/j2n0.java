package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class j2n0 implements n2n0 {
    public final List a;

    public final boolean equals(Object obj) {
        if (obj instanceof j2n0) {
            return this.a.equals(((j2n0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("BookSuccess(bookingVehicles=", Extension.C_BRAKE, this.a);
    }
}
