package defpackage;

import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class f0k0 extends pyj0 {
    public final Pair a;

    public f0k0(Pair pair) {
        this.a = pair;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0k0) && this.a.equals(((f0k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResultSuccess(result=" + this.a + Extension.C_BRAKE;
    }
}
