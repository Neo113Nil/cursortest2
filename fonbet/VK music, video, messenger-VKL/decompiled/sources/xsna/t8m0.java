package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollContentColor;
import com.vk.dto.polls.PollGradient;
import com.vk.stickers.api.styles.StickerColorToken;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vkontakte.android.R;
import xsna.dqb0;

/* compiled from: StoryPollStickerDrawable.kt */
/* loaded from: classes6.dex */
public final class t8m0 extends Drawable {
    public static final Float[] k = {Float.valueOf(0.378f), Float.valueOf(0.387f), Float.valueOf(0.397f), Float.valueOf(0.404f), Float.valueOf(0.432f), Float.valueOf(0.464f)};
    public static final Float[] l = {Float.valueOf(0.909f), Float.valueOf(0.778f), Float.valueOf(0.263f)};
    public final boolean a;
    public final float b;
    public final boolean c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path g;
    public Bitmap h;
    public boolean i;
    public final Matrix j;

    public t8m0() {
        this(0);
    }

    public final LinearGradient a(float f, float f2, int i) {
        float width = getBounds().width() * 0.5f;
        float height = getBounds().height();
        return new LinearGradient(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, new int[]{0, i, i}, new float[]{f / height, f2 / height, 1.0f}, Shader.TileMode.CLAMP);
    }

    public final void b(PollBackground pollBackground, v2l0 v2l0Var) {
        LinearGradient linearGradient;
        this.i = pollBackground == null && this.c;
        if (pollBackground instanceof PhotoPoll) {
            PhotoPoll photoPoll = (PhotoPoll) pollBackground;
            Bitmap bitmap = photoPoll.g;
            if (bitmap == null) {
                int i = photoPoll.c;
                linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getBounds().width(), getBounds().height(), i, i, Shader.TileMode.CLAMP);
            } else {
                this.h = bitmap;
                this.j.setTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (getBounds().height() - bitmap.getHeight()) * 0.7f));
                float f = this.b;
                if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = getBounds().height() * 0.144f;
                }
                linearGradient = a(f, (getBounds().width() * 0.3f) + f, photoPoll.c);
            }
        } else if (pollBackground instanceof PollGradient) {
            linearGradient = dqb0.a.a(getBounds(), (PollGradient) pollBackground);
        } else {
            linearGradient = null;
            linearGradient = null;
            if ((pollBackground instanceof PollContentColor) && v2l0Var != null) {
                StickerCommonStyle stickerCommonStyle = ((PollContentColor) pollBackground).d;
                Context context = e43.a;
                linearGradient = a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, v2l0Var.b(context != null ? context : null, stickerCommonStyle, StickerColorToken.POLL_BACKGROUND));
            }
        }
        this.d.setShader(linearGradient);
        invalidateSelf();
    }

    public final void c(int i) {
        this.d.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getBounds().width(), getBounds().height(), i, i, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.h;
        Path path = this.g;
        if (bitmap != null) {
            canvas.clipPath(path);
            canvas.drawBitmap(bitmap, this.j, this.f);
        }
        canvas.drawPath(path, this.d);
        if (this.i) {
            canvas.drawPath(path, this.e);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float f;
        float f2;
        super.onBoundsChange(rect);
        float width = rect.width() / 16.0f;
        float f3 = this.a ? 0.0f : width;
        Paint paint = this.e;
        float strokeWidth = paint.getStrokeWidth();
        float strokeWidth2 = paint.getStrokeWidth();
        float width2 = rect.width() - paint.getStrokeWidth();
        float height = rect.height() - paint.getStrokeWidth();
        Path path = this.g;
        path.reset();
        float f4 = f3 + width;
        path.moveTo(strokeWidth, f4);
        path.quadTo(strokeWidth, f3, width, f3);
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Float[] fArr = k;
            path.lineTo(fArr[0].floatValue() * width2, f3);
            float floatValue = fArr[1].floatValue() * width2;
            float floatValue2 = fArr[2].floatValue() * width2;
            Float[] fArr2 = l;
            path.cubicTo(floatValue, f3, floatValue2, fArr2[0].floatValue() * f3, fArr[3].floatValue() * width2, fArr2[1].floatValue() * f3);
            path.cubicTo(fArr[4].floatValue() * width2, fArr2[2].floatValue() * f3, fArr[5].floatValue() * width2, strokeWidth2, width2 * 0.5f, strokeWidth2);
            path.cubicTo((1.0f - fArr[5].floatValue()) * width2, strokeWidth2, (1.0f - fArr[4].floatValue()) * width2, fArr2[2].floatValue() * f3, (1.0f - fArr[3].floatValue()) * width2, fArr2[1].floatValue() * f3);
            f2 = f4;
            f = width2;
            path = path;
            float f5 = f3;
            path.cubicTo((1.0f - fArr[2].floatValue()) * width2, fArr2[0].floatValue() * f3, (1.0f - fArr[1].floatValue()) * width2, f5, (1.0f - fArr[0].floatValue()) * width2, f3);
            f3 = f5;
        } else {
            f = width2;
            f2 = f4;
        }
        float f6 = f - width;
        path.lineTo(f6, f3);
        path.quadTo(f, f3, f, f2);
        float f7 = height - width;
        path.lineTo(f, f7);
        path.quadTo(f, height, f6, height);
        path.lineTo(width, height);
        path.quadTo(strokeWidth, height, strokeWidth, f7);
        path.lineTo(strokeWidth, f2);
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
        this.e.setAlpha(i);
        this.f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f.setColorFilter(colorFilter);
    }

    public /* synthetic */ t8m0(int i) {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, true);
    }

    public t8m0(float f, boolean z, boolean z2) {
        this.a = z;
        this.b = f;
        this.c = z2;
        this.d = rqi.b(1, -1);
        Paint paint = new Paint(1);
        paint.setColor(e43.a.getColor(R.color.vk_gray_200));
        paint.setStrokeWidth(iah0.b(0.5f));
        paint.setStyle(Paint.Style.STROKE);
        this.e = paint;
        this.f = new Paint(2);
        this.g = new Path();
        this.j = new Matrix();
        b(null, null);
    }
}
