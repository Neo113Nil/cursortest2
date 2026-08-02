package xsna;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: RoundCornerColorDrawable.kt */
/* loaded from: classes17.dex */
public class wng0 extends Drawable {
    public static final /* synthetic */ qcy<Object>[] h = {new MutablePropertyReference1Impl(wng0.class, "color", "getColor()I", 0), p5j.a(0, wng0.class, "_alpha", "get_alpha()I", fpf0.a)};
    public final vng0 a;
    public final xuj b;
    public final vng0 c;
    public boolean d;
    public final Path e;
    public final Paint f;
    public final RectF g;

    public wng0() {
        this.a = new vng0(-16777216, this);
        this.b = new xuj(0);
        this.c = new vng0(255, this);
        this.d = true;
        this.e = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.f = paint;
        this.g = new RectF();
    }

    public static void e(int i, wng0 wng0Var) {
        wng0Var.b.b(i, 15);
        wng0Var.invalidateSelf();
    }

    public final int a() {
        return this.a.getValue(this, h[0]).intValue();
    }

    public final void b(int i) {
        this.a.setValue(this, h[0], Integer.valueOf(i));
    }

    public final void c(int i, int i2, int i3, int i4) {
        xuj xujVar = this.b;
        xujVar.a = i;
        xujVar.b = i2;
        xujVar.c = i3;
        xujVar.d = i4;
        invalidateSelf();
    }

    public final void d(xuj xujVar) {
        xuj xujVar2 = this.b;
        xujVar2.getClass();
        xujVar2.a = xujVar.a;
        xujVar2.b = xujVar.b;
        xujVar2.c = xujVar.c;
        xujVar2.d = xujVar.d;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF = this.g;
        if (rectF.width() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rectF.height() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        xuj xujVar = this.b;
        boolean a = xujVar.a();
        Paint paint = this.f;
        if (a) {
            canvas.drawRect(rectF, paint);
            return;
        }
        int i2 = xujVar.a;
        int i3 = xujVar.b;
        if (i2 != i3 || i3 != (i = xujVar.d) || xujVar.c != i) {
            canvas.drawPath(this.e, paint);
        } else {
            float f = i2;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c.getValue(this, h[1]).intValue();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        Path path = this.e;
        path.reset();
        xuj xujVar = this.b;
        float f = xujVar.a;
        float f2 = xujVar.b;
        float f3 = xujVar.d;
        float f4 = xujVar.c;
        path.addRoundRect(this.g, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CCW);
        if (this.d) {
            this.f.setColor(Color.argb((int) ((getAlpha() / 255.0f) * ((a() >> 24) & 255)), (a() >> 16) & 255, (a() >> 8) & 255, a() & 255));
            this.d = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.g.set(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setValue(this, h[1], Integer.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public wng0(int i, int i2) {
        this();
        b(i);
        e(i2, this);
    }
}
