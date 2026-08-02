package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class l1z0 implements o1z0 {
    public final Uri a;
    public final Rect b;

    public l1z0(Uri uri, Rect rect) {
        this.a = uri;
        this.b = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1z0)) {
            return false;
        }
        l1z0 l1z0Var = (l1z0) obj;
        return this.a.equals(l1z0Var.a) && this.b.equals(l1z0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnQrDetected(uri=" + this.a + ", rect=" + this.b + Extension.C_BRAKE;
    }
}
