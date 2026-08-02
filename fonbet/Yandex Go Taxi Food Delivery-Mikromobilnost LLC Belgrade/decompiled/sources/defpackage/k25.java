package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import com.yandex.div.core.images.BitmapSource;

/* loaded from: classes.dex */
public abstract class k25 extends btk {
    @Override // defpackage.btk
    public final void f(r8 r8Var) {
        if (r8Var instanceof thk) {
            i(((thk) r8Var).c, (BitmapSource) r8Var.b);
        } else if (r8Var instanceof uhk) {
            h(((uhk) r8Var).c, (BitmapSource) r8Var.b);
        }
    }

    @Override // defpackage.btk
    public void g(bd7 bd7Var) {
        i(bd7Var.a(), bd7Var.d());
    }

    public void h(Drawable drawable, BitmapSource bitmapSource) {
        if (drawable instanceof BitmapDrawable) {
            i(((BitmapDrawable) drawable).getBitmap(), bitmapSource);
            return;
        }
        if (drawable instanceof PictureDrawable) {
            k((PictureDrawable) drawable, bitmapSource);
        } else if (drawable instanceof AnimatedImageDrawable) {
            j((AnimatedImageDrawable) drawable, bitmapSource);
        } else {
            j(drawable, bitmapSource);
        }
    }

    public abstract void i(Bitmap bitmap, BitmapSource bitmapSource);

    public abstract void j(Drawable drawable, BitmapSource bitmapSource);

    public void k(PictureDrawable pictureDrawable, BitmapSource bitmapSource) {
        j(pictureDrawable, bitmapSource);
    }
}
