package xsna;

import android.net.Uri;
import java.util.Map;

/* compiled from: OneVideoDataSpec.kt */
/* loaded from: classes8.dex */
public final class lk80 {
    public final Uri a;
    public final String b;
    public final Map<String, String> c;
    public final long d;
    public final long e;
    public final int f;

    public lk80(Uri uri, String str, Map<String, String> map, long j, long j2, int i) {
        this.a = uri;
        this.b = str;
        this.c = map;
        this.d = j;
        this.e = j2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk80)) {
            return false;
        }
        lk80 lk80Var = (lk80) obj;
        return epx.f(this.a, lk80Var.a) && epx.f(this.b, lk80Var.b) && epx.f(this.c, lk80Var.c) && this.d == lk80Var.d && this.e == lk80Var.e && this.f == lk80Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + bh10.a(bh10.a(v11.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneVideoDataSpec(uri=");
        sb.append(this.a);
        sb.append(", httpMethod=");
        sb.append(this.b);
        sb.append(", httpRequestHeaders=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        tj0.d(sb, ", length=", this.e, ", flags=");
        return h5s.c(this.f, ")", sb);
    }
}
