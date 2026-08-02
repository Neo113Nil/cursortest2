package xsna;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import xsna.f5h0;

/* compiled from: ScaleTypeDrawable.kt */
/* loaded from: classes.dex */
public final class a5h0 extends j9s {
    public f5h0.d f;
    public Object g;
    public PointF h;
    public int i;
    public int j;
    public Matrix k;
    public final Matrix l;

    public a5h0(Drawable drawable, f5h0.d dVar) {
        super(drawable);
        this.l = new Matrix();
        this.f = dVar;
    }

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        r();
        if (this.k == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.k);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // xsna.j9s, xsna.ujp0
    public final void m(Matrix matrix) {
        o(matrix);
        r();
        Matrix matrix2 = this.k;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // xsna.j9s, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        q();
    }

    @Override // xsna.j9s
    public final Drawable p(Drawable drawable) {
        Drawable p = super.p(drawable);
        q();
        return p;
    }

    public final void q() {
        Drawable drawable = this.b;
        if (drawable == null) {
            this.j = 0;
            this.i = 0;
            this.k = null;
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.i = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.j = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
            this.k = null;
            return;
        }
        if (intrinsicWidth == width && intrinsicHeight == height) {
            drawable.setBounds(bounds);
            this.k = null;
            return;
        }
        if (this.f == f5h0.m.a) {
            drawable.setBounds(bounds);
            this.k = null;
            return;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        Matrix matrix = this.l;
        matrix.reset();
        f5h0.d dVar = this.f;
        PointF pointF = this.h;
        dVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
        this.k = matrix;
    }

    public final void r() {
        boolean z;
        f5h0.d dVar = this.f;
        if (dVar instanceof f5h0.p) {
            Float state = ((f5h0.p) dVar).getState();
            z = !state.equals(this.g);
            this.g = state;
        } else {
            z = false;
        }
        Drawable drawable = this.b;
        if (drawable == null) {
            return;
        }
        if (this.i == drawable.getIntrinsicWidth() && this.j == drawable.getIntrinsicHeight() && !z) {
            return;
        }
        q();
    }

    public final void s(PointF pointF) {
        if (cq70.a(this.h, pointF)) {
            return;
        }
        if (pointF == null) {
            this.h = null;
        } else {
            if (this.h == null) {
                this.h = new PointF();
            }
            this.h.set(pointF);
        }
        q();
        invalidateSelf();
    }

    public final void t(f5h0.d dVar) {
        if (cq70.a(this.f, dVar)) {
            return;
        }
        this.f = dVar;
        this.g = null;
        q();
        invalidateSelf();
    }
}
