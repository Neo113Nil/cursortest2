package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fno0 {
    public final Uri a;

    public /* synthetic */ fno0(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fno0) {
            return jl40.l(this.a, ((fno0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return g8e.m(this.a, "ScootersPromocodesPayload(deeplink=", Extension.C_BRAKE);
    }
}
