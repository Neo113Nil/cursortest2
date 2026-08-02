package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class lr8 extends ye0 {
    public final long b;

    public lr8(long j) {
        super("care.webViewDidBecomeReady");
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lr8) && this.b == ((lr8) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return qv10.k(this.b, "WebViewDidBecomeReady(loadingTime=", Extension.C_BRAKE);
    }
}
