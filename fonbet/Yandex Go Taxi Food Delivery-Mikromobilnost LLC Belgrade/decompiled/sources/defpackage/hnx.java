package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hnx implements jnx {
    public final Throwable a;

    public hnx(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hnx) && jl40.l(this.a, ((hnx) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return b64.m("CameraInitialization(error=", Extension.C_BRAKE, this.a);
    }

    public hnx() {
        this(null);
    }
}
