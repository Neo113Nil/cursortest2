package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jj0 {
    public final Uri a;
    public final String b;

    public jj0(Uri uri, String str) {
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
        if (!(obj instanceof jj0)) {
            return false;
        }
        jj0 jj0Var = (jj0) obj;
        return jl40.l(this.a, jj0Var.a) && jl40.l(this.b, jj0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AddPromocodeDeeplink(deeplinkUri=" + this.a + ", code=" + this.b + Extension.C_BRAKE;
    }
}
