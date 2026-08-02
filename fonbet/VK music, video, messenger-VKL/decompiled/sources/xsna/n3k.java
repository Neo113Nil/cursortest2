package xsna;

import android.graphics.Bitmap;

/* compiled from: CoverViewState.kt */
/* loaded from: classes7.dex */
public final class n3k {
    public final Bitmap a;

    public n3k(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3k) && epx.f(this.a, ((n3k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qr.c(new StringBuilder("CoverViewState(image="), this.a, ')');
    }
}
