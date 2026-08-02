package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import xsna.epx;

/* loaded from: classes10.dex */
public final class gq implements eq {
    @Override // yads.eq
    public final boolean a(Drawable drawable, Bitmap bitmap) {
        return epx.f(bitmap, ((BitmapDrawable) drawable).getBitmap());
    }
}
