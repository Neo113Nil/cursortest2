package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class h5s0 {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof h5s0) {
            return this.a == ((h5s0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("ShouldShowPreview(shouldShowPreview=", Extension.C_BRAKE, this.a);
    }
}
