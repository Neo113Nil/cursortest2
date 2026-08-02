package defpackage;

import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes5.dex */
public final class bbm {
    public final BitmapDrawable a;

    public bbm(BitmapDrawable bitmapDrawable) {
        this.a = bitmapDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbm) && this.a.equals(((bbm) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(30) + oyr.b(53, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", width=53, height=30)";
    }
}
