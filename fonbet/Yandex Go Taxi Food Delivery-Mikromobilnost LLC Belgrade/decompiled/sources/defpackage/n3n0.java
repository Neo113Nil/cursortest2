package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class n3n0 implements r3n0 {
    public final Throwable a;

    public n3n0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3n0) && this.a.equals(((n3n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.m("BookFailed(throwable=", Extension.C_BRAKE, this.a);
    }
}
