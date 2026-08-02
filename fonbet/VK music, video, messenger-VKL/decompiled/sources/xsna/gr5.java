package xsna;

import android.graphics.Bitmap;
import xsna.fzd0;

/* compiled from: UserEditableData.kt */
/* loaded from: classes5.dex */
public final class gr5 {
    public final Bitmap a;
    public final fzd0.b b;

    public gr5(Bitmap bitmap, fzd0.b bVar) {
        this.a = bitmap;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5)) {
            return false;
        }
        gr5 gr5Var = (gr5) obj;
        return epx.f(this.a, gr5Var.a) && epx.f(this.b, gr5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "New(thumb=" + this.a + ", params=" + this.b + ')';
    }
}
