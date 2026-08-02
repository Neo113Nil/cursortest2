package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class czs {
    public final boolean a;

    public czs(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof czs) && this.a == ((czs) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("GeoButtonState(isVisible=", Extension.C_BRAKE, this.a);
    }

    public czs() {
        this(false);
    }
}
