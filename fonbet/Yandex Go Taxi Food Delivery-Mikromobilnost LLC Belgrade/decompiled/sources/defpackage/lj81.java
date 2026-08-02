package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes7.dex */
public final class lj81 implements cd81 {
    @Override // defpackage.cd81
    public final boolean a(Drawable drawable, Bitmap bitmap) {
        return bitmap.equals(((BitmapDrawable) drawable).getBitmap());
    }
}
