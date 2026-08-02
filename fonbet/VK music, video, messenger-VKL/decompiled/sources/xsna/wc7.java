package xsna;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: BitmapResource.java */
/* loaded from: classes12.dex */
public final class wc7 implements hag0<Bitmap>, hzw {
    public final Bitmap b;
    public final tc7 c;

    public wc7(@NonNull Bitmap bitmap, @NonNull tc7 tc7Var) {
        nr2.r(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        nr2.r(tc7Var, "BitmapPool must not be null");
        this.c = tc7Var;
    }

    @Nullable
    public static wc7 c(@Nullable Bitmap bitmap, @NonNull tc7 tc7Var) {
        if (bitmap == null) {
            return null;
        }
        return new wc7(bitmap, tc7Var);
    }

    @Override // xsna.hag0
    public final void a() {
        this.c.c(this.b);
    }

    @Override // xsna.hag0
    @NonNull
    public final Class<Bitmap> b() {
        return Bitmap.class;
    }

    @Override // xsna.hag0
    @NonNull
    public final Bitmap get() {
        return this.b;
    }

    @Override // xsna.hag0
    public final int getSize() {
        return s2r0.c(this.b);
    }

    @Override // xsna.hzw
    public final void initialize() {
        this.b.prepareToDraw();
    }
}
