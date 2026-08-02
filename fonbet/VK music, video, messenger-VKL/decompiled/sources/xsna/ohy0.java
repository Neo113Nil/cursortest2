package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ohy0 extends View {
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final c1z0 e;
    public RectF f;
    public long g;
    public float h;
    public float i;
    public float j;
    public int k;

    public ohy0(Context context) {
        super(context);
        this.b = new Paint();
        this.c = new Paint();
        this.d = new Paint();
        this.f = new RectF();
        this.g = 0L;
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.j = 230.0f;
        this.e = new c1z0(context);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        canvas.drawOval(this.f, this.c);
        if (this.h != this.i) {
            this.h = Math.min(this.h + (((SystemClock.uptimeMillis() - this.g) / 1000.0f) * this.j), this.i);
            this.g = SystemClock.uptimeMillis();
            z = true;
        } else {
            z = false;
        }
        float f = this.h;
        if (isInEditMode()) {
            f = 360.0f;
        }
        canvas.drawArc(this.f, -90.0f, f, false, this.b);
        Paint paint = this.d;
        paint.setColor(-1);
        paint.setTextSize(this.e.b(12));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        canvas.drawText(String.valueOf(this.k), (int) this.f.centerX(), (int) (this.f.centerY() - ((paint.ascent() + paint.descent()) / 2.0f)), paint);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = 28;
        c1z0 c1z0Var = this.e;
        int paddingRight = getPaddingRight() + getPaddingLeft() + c1z0Var.b(f);
        int paddingBottom = getPaddingBottom() + getPaddingTop() + c1z0Var.b(f);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            paddingRight = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingRight = Math.min(paddingRight, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingBottom = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(paddingRight, paddingBottom);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float f = 1;
        c1z0 c1z0Var = this.e;
        this.f = new RectF(c1z0Var.b(f) + paddingLeft, c1z0Var.b(f) + paddingTop, (i - paddingRight) - c1z0Var.b(f), (i2 - paddingBottom) - c1z0Var.b(f));
        Paint paint = this.b;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(c1z0Var.b(f));
        Paint paint2 = this.c;
        paint2.setColor(-2013265920);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setStrokeWidth(c1z0Var.b(4));
        invalidate();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.g = SystemClock.uptimeMillis();
        }
    }

    public void setDigit(int i) {
        this.k = i;
    }

    public void setMax(float f) {
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.j = 360.0f / f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000b, code lost:
    
        if (r3 < com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setProgress(float f) {
        float f2 = f <= 1.0f ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
        f = f2;
        float f3 = this.i;
        if (f == f3) {
            return;
        }
        if (this.h == f3) {
            this.g = SystemClock.uptimeMillis();
        }
        this.i = Math.min(f * 360.0f, 360.0f);
        invalidate();
    }
}
