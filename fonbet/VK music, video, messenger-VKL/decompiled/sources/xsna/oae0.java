package xsna;

import android.net.Uri;
import java.util.Map;

/* compiled from: ProxyRequestInfo.kt */
/* loaded from: classes3.dex */
public final class oae0 {
    public final Uri a;
    public final Object b;

    public oae0(Uri uri, Map<String, String> map) {
        this.a = uri;
        this.b = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.String>] */
    public final Map<String, String> a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oae0)) {
            return false;
        }
        oae0 oae0Var = (oae0) obj;
        return this.a.equals(oae0Var.a) && this.b.equals(oae0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProxyRequestInfo(url=");
        sb.append(this.a);
        sb.append(", headers=");
        return k73.c(sb, this.b, ')');
    }
}
