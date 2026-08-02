package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: DrawableSource.kt */
@vby
/* loaded from: classes17.dex */
public final class eko implements dko {
    public final Drawable a;

    public /* synthetic */ eko(Drawable drawable) {
        this.a = drawable;
    }

    public static final /* synthetic */ eko b(Drawable drawable) {
        return new eko(drawable);
    }

    @Override // xsna.dko
    public final Drawable a(Context context) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eko) {
            return epx.f(this.a, ((eko) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DrawableSourceDrawable(drawable=" + this.a + ')';
    }
}
