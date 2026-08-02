package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class daa0 implements faa0 {
    public final Uri a;

    public daa0(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof daa0) && jl40.l(this.a, ((daa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.m(this.a, "FromDeeplink(deeplink=", Extension.C_BRAKE);
    }
}
