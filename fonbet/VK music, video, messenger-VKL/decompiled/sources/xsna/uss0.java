package xsna;

import android.graphics.Bitmap;
import java.util.Map;

/* compiled from: VideoMediaMetadata.kt */
/* loaded from: classes3.dex */
public final class uss0 {
    public final Map<String, String> a;
    public final Map<String, Long> b;
    public final Map<String, Bitmap> c;

    public uss0(Map<String, String> map, Map<String, Long> map2, Map<String, Bitmap> map3) {
        this.a = map;
        this.b = map2;
        this.c = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uss0)) {
            return false;
        }
        uss0 uss0Var = (uss0) obj;
        return epx.f(this.a, uss0Var.a) && epx.f(this.b, uss0Var.b) && epx.f(this.c, uss0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + v11.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMediaMetadata(strings=");
        sb.append(this.a);
        sb.append(", longs=");
        sb.append(this.b);
        sb.append(", bitmaps=");
        return cjl0.a(sb, this.c, ')');
    }
}
