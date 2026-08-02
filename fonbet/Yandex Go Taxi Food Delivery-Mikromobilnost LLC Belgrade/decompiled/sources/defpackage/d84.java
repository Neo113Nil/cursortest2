package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes10.dex */
public final class d84 {
    public final Size a;
    public final Rect b;
    public final int c;

    public d84(int i, Rect rect, Size size) {
        this.a = size;
        this.b = rect;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d84)) {
            return false;
        }
        d84 d84Var = (d84) obj;
        return this.a.equals(d84Var.a) && this.b.equals(d84Var.b) && this.c == d84Var.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResolutionInfoInternal{resolution=");
        sb.append(this.a);
        sb.append(", cropRect=");
        sb.append(this.b);
        sb.append(", rotationDegrees=");
        return oyr.m(this.c, "}", sb);
    }
}
