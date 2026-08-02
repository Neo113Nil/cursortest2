package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b0p {
    public final Uri a;
    public final boolean b;

    public b0p(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0p)) {
            return false;
        }
        b0p b0pVar = (b0p) obj;
        return jl40.l(this.a, b0pVar.a) && this.b == b0pVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExternalBrowserEntity(uri=" + this.a + ", useCustomTab=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ b0p(Uri uri) {
        this(uri, true);
    }
}
