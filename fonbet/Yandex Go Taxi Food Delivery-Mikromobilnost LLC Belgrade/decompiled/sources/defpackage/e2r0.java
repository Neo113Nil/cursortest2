package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class e2r0 implements gr00 {
    public final boolean a;

    public e2r0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2r0) && this.a == ((e2r0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("SetCameraZoomEnabled(enabled=", Extension.C_BRAKE, this.a);
    }
}
