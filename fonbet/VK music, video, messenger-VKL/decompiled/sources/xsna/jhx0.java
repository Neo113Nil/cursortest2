package xsna;

import android.net.Uri;
import java.util.Map;

/* compiled from: WebProxyData.kt */
/* loaded from: classes6.dex */
public final class jhx0 {
    public final Uri a;
    public final Map<String, String> b;

    public jhx0(Uri uri, Map<String, String> map) {
        this.a = uri;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhx0)) {
            return false;
        }
        jhx0 jhx0Var = (jhx0) obj;
        return epx.f(this.a, jhx0Var.a) && epx.f(this.b, jhx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebProxyInfo(url=");
        sb.append(this.a);
        sb.append(", headers=");
        return cjl0.a(sb, this.b, ')');
    }
}
