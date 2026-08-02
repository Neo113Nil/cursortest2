package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class exx implements gxx {
    public final Throwable a;

    public /* synthetic */ exx(Throwable th) {
        this.a = th;
    }

    public static final /* synthetic */ exx a(Throwable th) {
        return new exx(th);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof exx) {
            return this.a.equals(((exx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.m("Error(throwable=", Extension.C_BRAKE, this.a);
    }
}
