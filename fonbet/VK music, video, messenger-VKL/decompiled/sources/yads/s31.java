package yads;

import android.graphics.Bitmap;
import xsna.epx;

/* loaded from: classes10.dex */
public final class s31 {
    public final String a;
    public final Bitmap b;

    public s31(String str, Bitmap bitmap) {
        this.a = str;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s31)) {
            return false;
        }
        s31 s31Var = (s31) obj;
        return epx.f(this.a, s31Var.a) && epx.f(this.b, s31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageData(url=" + this.a + ", bitmap=" + this.b + ")";
    }
}
