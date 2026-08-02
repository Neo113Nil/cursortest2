package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class iyo0 implements myo0 {
    public final nyo0 a;

    public final boolean equals(Object obj) {
        if (obj instanceof iyo0) {
            return this.a == ((iyo0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(result=" + this.a + Extension.C_BRAKE;
    }
}
