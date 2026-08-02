package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class bz20 implements fz20 {
    public final boolean a;

    public bz20(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz20) && this.a == ((bz20) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("Fullscreen(hasTopCorners=", Extension.C_BRAKE, this.a);
    }

    public bz20() {
        this(false);
    }
}
