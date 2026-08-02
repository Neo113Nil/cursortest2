package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.ImageSize;
import com.vk.dto.polls.PollTile;
import java.util.Iterator;

/* compiled from: PollBackgroundDrawables.kt */
/* loaded from: classes18.dex */
public final class vrb0 extends Drawable {
    public static final /* synthetic */ int d = 0;
    public final float a;
    public final Paint b;
    public final RectF c;

    /* compiled from: PollBackgroundDrawables.kt */
    public static final class a {
        public static ImageSize a(PollTile pollTile, int i) {
            Object obj;
            Iterator<T> it = pollTile.f.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    float f = i;
                    float abs = Math.abs((f / ((ImageSize) next).d.b) - 2.0f);
                    do {
                        Object next2 = it.next();
                        float abs2 = Math.abs((f / ((ImageSize) next2).d.b) - 2.0f);
                        if (Float.compare(abs, abs2) > 0) {
                            next = next2;
                            abs = abs2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            ImageSize imageSize = (ImageSize) obj;
            return imageSize == null ? pollTile.f.get(0) : imageSize;
        }
    }

    public vrb0(Bitmap bitmap, float f) {
        this.a = f;
        Paint c = x9.c(true);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        c.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        this.b = c;
        this.c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float width = getBounds().width();
        float height = getBounds().height();
        RectF rectF = this.c;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
        float f = this.a;
        canvas.drawRoundRect(rectF, f, f, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
