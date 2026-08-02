package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class h3n0 implements l3n0 {
    public final Set a;

    public final boolean equals(Object obj) {
        if (obj instanceof h3n0) {
            return this.a.equals(((h3n0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RetryFailedAttempt(exams=" + this.a + Extension.C_BRAKE;
    }
}
