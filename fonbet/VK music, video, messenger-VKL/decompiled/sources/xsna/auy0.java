package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.c1z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class auy0 extends View {
    public final Rect b;
    public final Paint c;
    public final LightingColorFilter d;
    public final float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Bitmap j;
    public int k;
    public int l;

    public auy0(Context context) {
        super(context);
        Paint paint = new Paint();
        this.c = paint;
        paint.setFilterBitmap(true);
        this.e = c1z0.a.a;
        this.f = c1z0.d(10, context);
        this.g = c1z0.d(10, context);
        this.h = c1z0.d(10, context);
        this.i = c1z0.d(10, context);
        this.b = new Rect();
        this.d = new LightingColorFilter(-3355444, 1);
    }

    public final void a(Bitmap bitmap, boolean z) {
        this.j = bitmap;
        if (bitmap == null) {
            this.l = 0;
            this.k = 0;
        } else if (z) {
            float f = this.e;
            float f2 = f > 1.0f ? 2.0f : 1.0f;
            this.l = (int) ((bitmap.getHeight() / f2) * f);
            this.k = (int) ((this.j.getWidth() / f2) * f);
        } else {
            this.k = bitmap.getWidth();
            this.l = this.j.getHeight();
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.j != null) {
            int i = this.g;
            Rect rect = this.b;
            rect.left = i;
            rect.top = this.f;
            rect.right = getMeasuredWidth() - this.h;
            rect.bottom = getMeasuredHeight() - this.i;
            canvas.drawBitmap(this.j, (Rect) null, rect, this.c);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = size - (this.g + this.h);
        int i6 = size2 - (this.f + this.i);
        if (this.j == null || (i3 = this.k) <= 0 || (i4 = this.l) <= 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        float f = i3;
        float f2 = i4;
        float f3 = f / f2;
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (mode == 0 && mode2 == 0) {
            i5 = i3;
            i6 = i4;
        } else if (mode == 0) {
            i5 = (int) (i6 * f3);
        } else {
            float f4 = i5;
            if (mode2 != 0) {
                float f5 = f4 / f;
                float f6 = i6;
                if (Math.min(f5, f6 / f2) != f5 || f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i5 = (int) (f6 * f3);
                }
            }
            i6 = (int) (f4 / f3);
        }
        setMeasuredDimension(i5 + this.g + this.h, i6 + this.f + this.i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        Paint paint = this.c;
        if (action == 0) {
            paint.setColorFilter(this.d);
            invalidate();
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return super.onTouchEvent(motionEvent);
            }
        } else if (motionEvent.getX() >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && motionEvent.getX() <= getMeasuredWidth() && motionEvent.getY() >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && motionEvent.getY() <= getMeasuredHeight()) {
            performClick();
        }
        paint.setColorFilter(null);
        invalidate();
        return true;
    }

    public void setPadding(int i) {
        this.f = i;
        this.i = i;
        this.g = i;
        this.h = i;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f = i2;
        this.i = i4;
        this.g = i;
        this.h = i3;
    }
}
