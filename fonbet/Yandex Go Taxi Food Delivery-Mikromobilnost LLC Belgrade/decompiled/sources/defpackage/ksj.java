package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ksj {
    public final Uri a;

    public ksj(Uri uri) {
        this.a = uri;
    }

    public final Uri a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ksj) && jl40.l(this.a, ((ksj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.m(this.a, "DiscoveryDeeplink(deeplinkUri=", Extension.C_BRAKE);
    }
}
