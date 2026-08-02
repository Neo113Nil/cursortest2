package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.vkontakte.android.R;

/* compiled from: ExclusiveAlbumBlurPostProcessor.kt */
/* loaded from: classes16.dex */
public final class y2q extends mk6 {
    public final Paint c = new Paint(1);
    public final Rect d = new Rect();
    public final ppj0 e = new ppj0("ExclusiveAlbumBlurPostProcessor");

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return this.e;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        Rect rect = this.d;
        Paint paint = this.c;
        paint.reset();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setStyle(Paint.Style.FILL);
        uvf<Bitmap> c = hta0Var.c(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        try {
            Bitmap r = c.r();
            Canvas canvas = new Canvas(r);
            rect.set(0, 0, r.getWidth(), r.getHeight());
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            NativeBlurFilter.iterativeBoxBlur(r, 2, 64);
            paint.setColor(dhr0.t.c(R.attr.vk_legacy_background_card_alpha));
            canvas.drawRect(rect, paint);
            return c.n();
        } finally {
            c.close();
        }
    }

    @Override // xsna.mk6, xsna.ktc0
    public final String getName() {
        return "ExclusiveAlbumBlurPostProcessor";
    }

    public final String toString() {
        return "ExclusiveAlbumBlurPostProcessor";
    }
}
