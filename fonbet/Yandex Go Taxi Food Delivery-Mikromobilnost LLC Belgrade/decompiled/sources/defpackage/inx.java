package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class inx implements jnx {
    public final Throwable a;

    public inx(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof inx) && jl40.l(this.a, ((inx) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return b64.m("Upload(error=", Extension.C_BRAKE, this.a);
    }

    public inx() {
        this(null);
    }
}
