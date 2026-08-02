package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LinearGradientDrawable.kt */
/* loaded from: classes16.dex */
public final class z7z extends Drawable {
    public final ArrayList a;
    public final List<Float> b;
    public final float c;
    public final Paint d = new Paint(1);
    public Paint e;
    public Float f;

    public z7z(ArrayList arrayList, List list, float f) {
        this.a = arrayList;
        this.b = list;
        this.c = f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Float f = this.f;
        Paint paint = this.d;
        if (f != null) {
            canvas.drawRoundRect(new RectF(getBounds()), f.floatValue(), f.floatValue(), paint);
            Paint paint2 = this.e;
            if (paint2 != null) {
                canvas.drawRoundRect(new RectF(getBounds()), f.floatValue(), f.floatValue(), paint2);
                return;
            }
            return;
        }
        canvas.drawRect(new RectF(getBounds()), paint);
        Paint paint3 = this.e;
        if (paint3 != null) {
            canvas.drawRect(new RectF(getBounds()), paint3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        float width = rect.width();
        float height = rect.height();
        int[] N0 = j5g.N0(this.a);
        float[] L0 = j5g.L0(this.b);
        float f = (((90.0f - this.c) % 360.0f) + 360.0f) % 360.0f;
        float hypot = (float) Math.hypot(width, height);
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (hypot != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = (float) Math.acos(width / hypot);
        }
        float radians = (float) Math.toRadians(f);
        float abs = Math.abs(((float) Math.cos(((f < 90.0f || f > 180.0f) && (f < 270.0f || f > 360.0f)) ? radians - f2 : (3.1415927f - radians) - f2)) * hypot) / 2.0f;
        double d = radians;
        float cos = ((float) Math.cos(d)) * abs;
        float sin = abs * ((float) Math.sin(d));
        float f3 = width / 2.0f;
        float f4 = height / 2.0f;
        float f5 = f3 - cos;
        float f6 = f4 + sin;
        float f7 = f3 + cos;
        float f8 = f4 - sin;
        if (L0.length != N0.length) {
            L0 = null;
        }
        this.d.setShader(new LinearGradient(f5, f6, f7, f8, N0, L0, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
