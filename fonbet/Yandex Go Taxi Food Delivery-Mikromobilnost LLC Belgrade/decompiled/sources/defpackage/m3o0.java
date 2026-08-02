package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class m3o0 implements p3o0 {
    public final Throwable a;

    public m3o0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m3o0) && this.a.equals(((m3o0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.m("ScootersOfferErrorResult(throwable=", Extension.C_BRAKE, this.a);
    }
}
