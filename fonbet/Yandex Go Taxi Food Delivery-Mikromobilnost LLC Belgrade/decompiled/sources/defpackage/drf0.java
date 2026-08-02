package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class drf0 {
    public final Uri a;
    public final String b;

    public drf0(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final Uri b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drf0)) {
            return false;
        }
        drf0 drf0Var = (drf0) obj;
        return jl40.l(this.a, drf0Var.a) && jl40.l(this.b, drf0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PromocodeDeeplink(deeplinkUri=" + this.a + ", code=" + this.b + Extension.C_BRAKE;
    }
}
