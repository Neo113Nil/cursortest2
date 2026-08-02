package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import xsna.h3k0;

/* compiled from: PostingEditorCropImageProcessor.kt */
/* loaded from: classes4.dex */
public final class dfc0 extends s770 {
    public final h3k0 c;
    public final Rect d = new Rect();

    public dfc0(h3k0 h3k0Var) {
        this.c = h3k0Var;
    }

    @Override // xsna.s770
    public final Bitmap q(Bitmap bitmap) {
        h3k0.a a = this.c.a(bitmap.getWidth(), bitmap.getHeight());
        int i = a.d;
        int i2 = a.c;
        if (i2 != bitmap.getWidth() || i != bitmap.getHeight()) {
            int i3 = -a.a;
            Rect rect = this.d;
            rect.left = i3;
            rect.top = -a.b;
            rect.right = bitmap.getWidth() + i3;
            rect.bottom = bitmap.getHeight() + rect.top;
            try {
                Bitmap b = n3p.b(i2, i);
                new Canvas(b).drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
                return b;
            } catch (Throwable unused) {
            }
        }
        return bitmap;
    }
}
