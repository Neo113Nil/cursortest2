package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class d6s0 {
    public final boolean a;

    public d6s0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d6s0) && this.a == ((d6s0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("ShowContentParams(maximizeScreenBrightness=", Extension.C_BRAKE, this.a);
    }

    public d6s0() {
        this(false);
    }
}
