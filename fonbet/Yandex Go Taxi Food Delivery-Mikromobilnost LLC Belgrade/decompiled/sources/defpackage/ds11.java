package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ds11 {
    public final Uri a;
    public final js11 b;

    public ds11(Uri uri, js11 js11Var) {
        this.a = uri;
        this.b = js11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds11)) {
            return false;
        }
        ds11 ds11Var = (ds11) obj;
        return jl40.l(this.a, ds11Var.a) && jl40.l(this.b, ds11Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        js11 js11Var = this.b;
        return hashCode + (js11Var == null ? 0 : js11Var.hashCode());
    }

    public final String toString() {
        return "UgcDeeplinkPayload(deeplink=" + this.a + ", location=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ ds11(Uri uri) {
        this(uri, null);
    }
}
