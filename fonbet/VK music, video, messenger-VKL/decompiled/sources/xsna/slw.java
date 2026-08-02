package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: ImageSource.kt */
@vby
/* loaded from: classes17.dex */
public final class slw implements rlw {
    public final Drawable a;

    public final /* synthetic */ Drawable a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof slw) {
            return epx.f(this.a, ((slw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImageSourceDrawable(drawable=" + this.a + ')';
    }
}
