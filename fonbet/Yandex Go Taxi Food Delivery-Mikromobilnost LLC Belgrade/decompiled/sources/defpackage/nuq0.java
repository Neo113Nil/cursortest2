package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class nuq0 {
    public final boolean a;

    public nuq0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nuq0) && this.a == ((nuq0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("Service(isDoorToDoor=", Extension.C_BRAKE, this.a);
    }

    public nuq0() {
        this(false);
    }
}
