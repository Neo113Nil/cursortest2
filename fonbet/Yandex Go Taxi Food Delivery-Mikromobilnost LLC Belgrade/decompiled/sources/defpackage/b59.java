package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class b59 {
    public final boolean a;

    public b59(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b59) && this.a == ((b59) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("CashbackVisibilityModel(isCashbackEnabled=", Extension.C_BRAKE, this.a);
    }
}
