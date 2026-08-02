package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ir21 {
    public final boolean a;

    public ir21(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir21) && this.a == ((ir21) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("UserPhotoUploadingPermissions(isCameraPermissionGranted=", Extension.C_BRAKE, this.a);
    }
}
