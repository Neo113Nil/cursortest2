package xsna;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: ImageViewExt.kt */
/* loaded from: classes.dex */
public final class omw {
    public static void a(ImageView imageView, int i) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        dhr0.a.getClass();
        imageView.setImageTintList(anj.b(i, dhr0.E()));
        imageView.setImageTintMode(mode);
    }

    public static void b(ImageView imageView, int i) {
        dhr0.a.j0(imageView, i, PorterDuff.Mode.SRC_ATOP);
    }

    public static final void c(int i, Drawable drawable, ImageView imageView) {
        dhr0.a.getClass();
        dhr0.k0(i, drawable, imageView);
    }

    public static final void d(ImageView imageView, int i, int i2) {
        dhr0.a.l0(imageView, i, i2);
    }
}
