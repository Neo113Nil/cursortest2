package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class e5t0 implements j5t0 {
    public final List a;

    public e5t0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e5t0) && this.a.equals(((e5t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("InitMapObjects(addedObjects=", Extension.C_BRAKE, this.a);
    }
}
