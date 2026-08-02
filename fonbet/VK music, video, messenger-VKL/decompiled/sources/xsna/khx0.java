package xsna;

import android.net.Uri;
import java.util.Map;

/* compiled from: WebProxyData.kt */
/* loaded from: classes6.dex */
public final class khx0 {
    public final Uri a;
    public final String b;
    public final Map<String, String> c;
    public final jhx0 d;

    public khx0(Uri uri, String str, Map<String, String> map, jhx0 jhx0Var) {
        this.a = uri;
        this.b = str;
        this.c = map;
        this.d = jhx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khx0)) {
            return false;
        }
        khx0 khx0Var = (khx0) obj;
        return epx.f(this.a, khx0Var.a) && epx.f(this.b, khx0Var.b) && epx.f(this.c, khx0Var.c) && epx.f(this.d, khx0Var.d);
    }

    public final int hashCode() {
        int a = v11.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        jhx0 jhx0Var = this.d;
        return a + (jhx0Var == null ? 0 : jhx0Var.hashCode());
    }

    public final String toString() {
        return "WebProxyRequest(url=" + this.a + ", method=" + this.b + ", headers=" + this.c + ", proxy=" + this.d + ')';
    }
}
