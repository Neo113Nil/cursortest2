package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class bm3 {
    public final boolean a;

    public bm3(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bm3) && this.a == ((bm3) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("AuthVisualProperties(isBackButtonHidden=", Extension.C_BRAKE, this.a);
    }

    public bm3() {
        this(false);
    }
}
