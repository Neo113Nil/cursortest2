package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.polls.PhotoPoll;
import java.util.List;
import xsna.hfr;

/* compiled from: PollBackgroundDrawables.kt */
/* loaded from: classes18.dex */
public final class taa0 extends Drawable {
    public static final /* synthetic */ int o = 0;
    public final Bitmap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final PorterDuffColorFilter f;
    public final Paint g;
    public final Rect h;
    public final Rect i;
    public final RectF j;
    public final Path k;
    public float l;
    public float m;
    public LinearGradient n;

    /* compiled from: PollBackgroundDrawables.kt */
    public static final class a {
        public static ImageSize a(PhotoPoll photoPoll, final int i, final int i2) {
            Object next;
            float f = i / i2;
            List<ImageSize> list = photoPoll.d;
            hfr.a aVar = new hfr.a(rli0.j(new i5g(list), new izs() { // from class: xsna.raa0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    Image image = ((ImageSize) obj).d;
                    return Boolean.valueOf(image.b >= i && image.c >= i2);
                }
            }));
            if (aVar.hasNext()) {
                next = aVar.next();
                if (aVar.hasNext()) {
                    Image image = ((ImageSize) next).d;
                    float abs = Math.abs((image.b / image.c) - f);
                    do {
                        Object next2 = aVar.next();
                        Image image2 = ((ImageSize) next2).d;
                        float abs2 = Math.abs((image2.b / image2.c) - f);
                        if (Float.compare(abs, abs2) > 0) {
                            next = next2;
                            abs = abs2;
                        }
                    } while (aVar.hasNext());
                }
            } else {
                next = null;
            }
            ImageSize imageSize = (ImageSize) next;
            return imageSize == null ? list.get(0) : imageSize;
        }
    }

    public taa0(Bitmap bitmap, int i, int i2, int i3, int i4) {
        this.a = bitmap;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(1711276032, PorterDuff.Mode.SRC_ATOP);
        this.f = porterDuffColorFilter;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setColorFilter(porterDuffColorFilter);
        this.g = paint;
        this.h = new Rect();
        this.i = new Rect();
        this.j = new RectF();
        this.k = new Path();
        this.l = -1.0f;
        this.m = -1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.clipPath(this.k);
        Rect rect = this.h;
        Paint paint = this.g;
        canvas.drawRect(rect, paint);
        paint.setShader(null);
        canvas.drawBitmap(this.a, rect, this.i, paint);
        LinearGradient linearGradient = this.n;
        if (linearGradient != null) {
            paint.setShader(linearGradient);
            float f = this.e;
            canvas.drawRoundRect(this.j, f, f, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        new Rect(i, i2, i3, i4);
        float width = getBounds().width();
        float height = getBounds().height();
        int i5 = this.c;
        float f = i5 <= 0 ? width : i5;
        Bitmap bitmap = this.a;
        float height2 = bitmap.getHeight();
        int i6 = this.d;
        float f2 = i6;
        this.m = Math.min(bitmap.getWidth() / f, height2 / f2);
        this.l = yq.a(this.m, f, bitmap.getWidth(), 2.0f);
        float height3 = bitmap.getHeight();
        float f3 = this.m;
        float f4 = f3 * f2;
        float f5 = (height3 - f4) / 2.0f;
        float f6 = this.l;
        this.h.set((int) f6, (int) f5, (int) ((f3 * f) + f6), (int) (f4 + f5));
        this.i.set(0, 0, (int) f, i6);
        RectF rectF = this.j;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
        Path path = this.k;
        path.reset();
        float f7 = this.e;
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        int i7 = this.b;
        float f8 = width / 2.0f;
        this.n = new LinearGradient(f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f8, height, new int[]{0, i7, i7}, new float[]{(0.66f * f2) / height, f2 / height, 1.0f}, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == null) {
            colorFilter = this.f;
        }
        this.g.setColorFilter(colorFilter);
    }
}
