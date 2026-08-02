package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lsw {
    public final h0h a;
    public final Uri b;

    public lsw(h0h h0hVar, Uri uri) {
        this.a = h0hVar;
        this.b = uri;
    }

    public final Uri a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsw)) {
            return false;
        }
        lsw lswVar = (lsw) obj;
        return this.a.equals(lswVar.a) && this.b.equals(lswVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InternalTypedDeeplink(converter=" + this.a + ", uri=" + this.b + Extension.C_BRAKE;
    }
}
