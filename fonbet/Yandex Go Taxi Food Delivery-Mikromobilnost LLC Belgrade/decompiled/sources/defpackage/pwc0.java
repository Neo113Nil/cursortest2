package defpackage;

import java.util.Collections;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class pwc0 {
    public final long a;

    public pwc0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pwc0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return zkb1.b(Collections.singletonList(Long.valueOf(this.a)), Collections.singletonList(Long.valueOf(((pwc0) obj).a)));
    }

    public final int hashCode() {
        return Collections.singletonList(Long.valueOf(this.a)).hashCode();
    }

    public final String toString() {
        return qv10.k(this.a, "PlatformVideoViewCreationParams(playerId=", Extension.C_BRAKE);
    }
}
