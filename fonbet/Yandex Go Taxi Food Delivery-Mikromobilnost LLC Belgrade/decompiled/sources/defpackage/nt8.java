package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.care.ui.n;

/* loaded from: classes4.dex */
public final class nt8 implements pt8 {
    public final n a;

    public nt8(n nVar) {
        this.a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nt8) && this.a == ((nt8) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Camera(photoProcessingDelegate=" + this.a + Extension.C_BRAKE;
    }
}
