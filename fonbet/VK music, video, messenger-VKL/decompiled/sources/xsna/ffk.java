package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: CropContentLayout.kt */
/* loaded from: classes4.dex */
public final class ffk extends FrameLayout {
    public final rhk b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Matrix f;
    public final Matrix g;
    public afk h;
    public boolean i;
    public boolean j;

    public ffk(Context context) {
        super(context, null, 0);
        rhk rhkVar = new rhk(context, null, 0);
        rhkVar.setClipChildren(false);
        this.b = rhkVar;
        setClipChildren(false);
        addView(rhkVar);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Matrix();
        this.g = new Matrix();
        this.h = new cfk(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!this.j) {
            super.dispatchDraw(canvas);
            return;
        }
        float x0 = this.h.getX0();
        float y0 = this.h.getY0();
        float x1 = this.h.getX1();
        float y1 = this.h.getY1();
        RectF rectF = this.d;
        rectF.set(x0, y0, x1, y1);
        if (!this.i && !rectF.isEmpty()) {
            canvas.clipRect(rectF);
        }
        canvas.concat(this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Matrix matrix = this.g;
        matrix.reset();
        this.f.invert(matrix);
        obtain.transform(matrix);
        return super.dispatchTouchEvent(obtain);
    }

    public final rhk getMirror() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.c;
        rectF.set(i, i2, i3, i4);
        RectF rectF2 = this.e;
        if (rectF2.isEmpty()) {
            rectF2.set(rectF);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.c;
        rectF.bottom = i2;
        rectF.right = i;
        invalidate();
    }

    public final void setClippingEnabled(boolean z) {
        this.j = z;
    }

    public final void setContentMatrix$android_release(Matrix matrix) {
        this.f.set(matrix);
        invalidate();
    }

    public final void setCropArea(afk afkVar) {
        this.h = afkVar;
    }

    public final void setCropping(boolean z) {
        this.i = z;
    }
}
