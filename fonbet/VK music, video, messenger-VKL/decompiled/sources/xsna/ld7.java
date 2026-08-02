package xsna;

import android.graphics.Bitmap;
import java.util.Objects;

/* compiled from: BitmapWrapper.kt */
/* loaded from: classes4.dex */
public final class ld7 implements ota0 {
    public final Bitmap a;

    public ld7(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ld7) && ((ld7) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
