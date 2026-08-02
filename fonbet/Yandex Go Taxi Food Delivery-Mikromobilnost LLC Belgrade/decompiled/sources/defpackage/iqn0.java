package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class iqn0 implements jqn0 {
    public final lqn0 a;

    public final boolean equals(Object obj) {
        if (obj instanceof iqn0) {
            return this.a.equals(((iqn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Single(model=" + this.a + Extension.C_BRAKE;
    }
}
