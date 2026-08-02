package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m780 extends m83 {
    public final boolean g;

    public m780(boolean z) {
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m780) && this.g == ((m780) obj).g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g);
    }

    public final String toString() {
        return nzs.b("Active(hasBottomContent=", Extension.C_BRAKE, this.g);
    }
}
