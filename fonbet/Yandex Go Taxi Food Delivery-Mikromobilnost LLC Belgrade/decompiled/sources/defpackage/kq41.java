package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class kq41 {
    public final Uri a;
    public final sls b;

    public kq41(Uri uri, sls slsVar) {
        this.a = uri;
        this.b = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq41)) {
            return false;
        }
        kq41 kq41Var = (kq41) obj;
        return jl40.l(this.a, kq41Var.a) && jl40.l(this.b, kq41Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sls slsVar = this.b;
        return hashCode + (slsVar == null ? 0 : slsVar.hashCode());
    }

    public final String toString() {
        return "WebViewFromDeeplinkPayload(deeplink=" + this.a + ", onClose=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ kq41(Uri uri) {
        this(uri, null);
    }
}
