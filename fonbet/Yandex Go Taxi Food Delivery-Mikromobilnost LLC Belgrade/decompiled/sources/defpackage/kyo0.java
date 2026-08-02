package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kyo0 implements myo0 {
    public final pyo0 a;

    public final boolean equals(Object obj) {
        if (obj instanceof kyo0) {
            return this.a == ((kyo0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Purchased(result=" + this.a + Extension.C_BRAKE;
    }
}
