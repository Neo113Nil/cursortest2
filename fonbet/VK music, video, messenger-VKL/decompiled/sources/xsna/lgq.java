package xsna;

import android.util.Size;

/* compiled from: ExtraVideoDebugInfo.kt */
/* loaded from: classes5.dex */
public final class lgq {
    public final Size a;
    public final Long b;

    public lgq(Size size, Long l) {
        this.a = size;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgq)) {
            return false;
        }
        lgq lgqVar = (lgq) obj;
        return epx.f(this.a, lgqVar.a) && epx.f(this.b, lgqVar.b);
    }

    public final int hashCode() {
        Size size = this.a;
        int hashCode = (size == null ? 0 : size.hashCode()) * 31;
        Long l = this.b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "viewport=" + this.a + ", vfpo=" + this.b;
    }
}
