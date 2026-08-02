package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.medianative.MediaNative;
import kotlin.Pair;

/* compiled from: StoryAvatarProcessor.kt */
/* loaded from: classes6.dex */
public final class cyl0 {
    public final int a;
    public final int b;

    public cyl0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean a(Bitmap bitmap) {
        float f = this.a / this.b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 0 && height > 0) {
            float f2 = width / height;
            boolean z = Math.abs(f2 - f) <= 0.15f;
            boolean z2 = Math.abs(f2 - 0.75f) < 0.05f;
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final Pair<Bitmap, RectF> b(Bitmap bitmap) {
        boolean a = a(bitmap);
        int i = this.b;
        int i2 = this.a;
        if (a) {
            Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            createBitmap.setHasAlpha(false);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint(6);
            float f = i;
            float f2 = i2;
            float max = Math.max(f / bitmap.getHeight(), f2 / bitmap.getWidth());
            float width = bitmap.getWidth() * max;
            float height = bitmap.getHeight() * max;
            float f3 = (f2 - width) * 0.5f;
            float f4 = (f - height) * 0.5f;
            RectF rectF = new RectF(f3, f4, width + f3, height + f4);
            canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
            Pair pair = new Pair(createBitmap, rectF);
            return new Pair<>((Bitmap) pair.d(), (RectF) pair.g());
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        Paint paint2 = new Paint(2);
        Rect rect = new Rect(0, 0, i2, i);
        Rect rect2 = new Rect(0, 0, i2, i);
        Bitmap b = kd7.b(bitmap, rect.width(), rect.height(), false, false);
        if (b != null) {
            MediaNative.blurBitmap(b, b.getWidth() / 4);
            canvas2.drawBitmap(b, rect, rect2, paint2);
            canvas2.drawColor(l8g.g(-16777216, 41));
        }
        float f5 = i2;
        float height2 = bitmap.getHeight() * (f5 / bitmap.getWidth());
        float f6 = (i - height2) * 0.5f;
        RectF rectF2 = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, f5, height2 + f6);
        canvas2.drawBitmap(bitmap, (Rect) null, rectF2, paint2);
        Pair pair2 = new Pair(createBitmap2, rectF2);
        return new Pair<>((Bitmap) pair2.d(), (RectF) pair2.g());
    }
}
