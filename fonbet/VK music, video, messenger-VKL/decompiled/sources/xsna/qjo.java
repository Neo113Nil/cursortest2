package xsna;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: DrawableBytesTranscoder.java */
/* loaded from: classes12.dex */
public final class qjo implements bbg0<Drawable, byte[]> {
    public final tc7 b;
    public final ob7 c;
    public final xo9 d;

    public qjo(@NonNull tc7 tc7Var, @NonNull ob7 ob7Var, @NonNull xo9 xo9Var) {
        this.b = tc7Var;
        this.c = ob7Var;
        this.d = xo9Var;
    }

    @Override // xsna.bbg0
    @Nullable
    public final hag0<byte[]> c(@NonNull hag0<Drawable> hag0Var, @NonNull au80 au80Var) {
        Drawable drawable = hag0Var.get();
        if (drawable instanceof BitmapDrawable) {
            return this.c.c(wc7.c(((BitmapDrawable) drawable).getBitmap(), this.b), au80Var);
        }
        if (drawable instanceof gyt) {
            return this.d.c(hag0Var, au80Var);
        }
        return null;
    }
}
