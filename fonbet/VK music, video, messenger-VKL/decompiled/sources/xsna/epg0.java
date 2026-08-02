package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: RoundedDrawable.java */
/* loaded from: classes.dex */
public abstract class epg0 extends Drawable implements jog0, tjp0 {

    @Nullable
    public ujp0 D;
    public final Drawable b;

    @Nullable
    public float[] l;

    @Nullable
    public RectF q;

    @Nullable
    public Matrix w;

    @Nullable
    public Matrix x;
    public boolean c = false;
    public boolean d = false;
    public float e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public final Path f = new Path();
    public boolean g = true;
    public int h = 0;
    public final Path i = new Path();
    public final float[] j = new float[8];
    public final float[] k = new float[8];
    public final RectF m = new RectF();
    public final RectF n = new RectF();
    public final RectF o = new RectF();
    public final RectF p = new RectF();
    public final Matrix r = new Matrix();
    public final Matrix s = new Matrix();
    public final Matrix t = new Matrix();
    public final Matrix u = new Matrix();
    public final Matrix v = new Matrix();
    public final Matrix y = new Matrix();
    public float z = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public boolean A = false;
    public boolean B = false;
    public boolean C = true;

    public epg0(Drawable drawable) {
        this.b = drawable;
    }

    @Override // xsna.jog0
    public final void a(float f, int i) {
        if (this.h == i && this.e == f) {
            return;
        }
        this.h = i;
        this.e = f;
        this.C = true;
        invalidateSelf();
    }

    public final void b() {
        if (this.C) {
            Path path = this.i;
            path.reset();
            float f = this.e / 2.0f;
            RectF rectF = this.m;
            rectF.inset(f, f);
            boolean z = this.c;
            float[] fArr = this.k;
            float[] fArr2 = this.j;
            if (z) {
                path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                for (int i = 0; i < fArr.length; i++) {
                    fArr[i] = (fArr2[i] + this.z) - (this.e / 2.0f);
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            float f2 = (-this.e) / 2.0f;
            rectF.inset(f2, f2);
            Path path2 = this.f;
            path2.reset();
            float f3 = this.z + (this.A ? this.e : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            rectF.inset(f3, f3);
            if (this.c) {
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else if (this.A) {
                if (this.l == null) {
                    this.l = new float[8];
                }
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    this.l[i2] = fArr2[i2] - this.e;
                }
                path2.addRoundRect(rectF, this.l, Path.Direction.CW);
            } else {
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
            }
            float f4 = -f3;
            rectF.inset(f4, f4);
            path2.setFillType(Path.FillType.WINDING);
            this.C = false;
        }
    }

    @Override // xsna.tjp0
    public final void c(@Nullable ujp0 ujp0Var) {
        this.D = ujp0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.b.clearColorFilter();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        if (((r3 == null && r7 == null) ? true : (r3 == null || r7 == null) ? false : r3.equals(r7)) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d() {
        Matrix matrix;
        RectF rectF;
        ujp0 ujp0Var = this.D;
        Matrix matrix2 = this.t;
        RectF rectF2 = this.m;
        if (ujp0Var != null) {
            ujp0Var.m(matrix2);
            this.D.b(rectF2);
        } else {
            matrix2.reset();
            rectF2.set(getBounds());
        }
        Drawable drawable = this.b;
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF3 = this.o;
        rectF3.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intrinsicWidth, intrinsicHeight);
        Rect bounds = drawable.getBounds();
        RectF rectF4 = this.p;
        rectF4.set(bounds);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix3 = this.r;
        matrix3.setRectToRect(rectF3, rectF4, scaleToFit);
        if (this.A) {
            RectF rectF5 = this.q;
            if (rectF5 == null) {
                this.q = new RectF(rectF2);
            } else {
                rectF5.set(rectF2);
            }
            RectF rectF6 = this.q;
            float f = this.e;
            rectF6.inset(f, f);
            if (this.w == null) {
                this.w = new Matrix();
            }
            this.w.setRectToRect(rectF2, this.q, scaleToFit);
        } else {
            Matrix matrix4 = this.w;
            if (matrix4 != null) {
                matrix4.reset();
            }
        }
        Matrix matrix5 = this.u;
        boolean equals = matrix2.equals(matrix5);
        Matrix matrix6 = this.s;
        if (equals && matrix3.equals(matrix6)) {
            Matrix matrix7 = this.w;
            if (matrix7 != null) {
                Matrix matrix8 = this.x;
            }
            rectF = this.n;
            if (rectF2.equals(rectF)) {
                this.C = true;
                rectF.set(rectF2);
                return;
            }
            return;
        }
        this.g = true;
        matrix2.invert(this.v);
        Matrix matrix9 = this.y;
        matrix9.set(matrix2);
        if (this.A && (matrix = this.w) != null) {
            matrix9.postConcat(matrix);
        }
        matrix9.preConcat(matrix3);
        matrix5.set(matrix2);
        matrix6.set(matrix3);
        if (this.A) {
            Matrix matrix10 = this.x;
            if (matrix10 == null) {
                Matrix matrix11 = this.w;
                this.x = matrix11 == null ? null : new Matrix(matrix11);
            } else {
                matrix10.set(this.w);
            }
        } else {
            Matrix matrix12 = this.x;
            if (matrix12 != null) {
                matrix12.reset();
            }
        }
        rectF = this.n;
        if (rectF2.equals(rectF)) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (lhs.d()) {
            lhs.a("RoundedDrawable#draw");
        }
        this.b.draw(canvas);
        if (lhs.d()) {
            lhs.b();
        }
    }

    @Override // xsna.jog0
    public final void e(boolean z) {
        if (this.B != z) {
            this.B = z;
            invalidateSelf();
        }
    }

    @Override // xsna.jog0
    public final void f(boolean z) {
        this.c = z;
        this.C = true;
        invalidateSelf();
    }

    @Override // xsna.jog0
    public final void g(float f) {
        if (this.z != f) {
            this.z = f;
            this.C = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final ColorFilter getColorFilter() {
        return this.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.b.getOpacity();
    }

    @Override // xsna.jog0
    public final void i(float[] fArr) {
        float[] fArr2 = this.j;
        if (fArr == null) {
            Arrays.fill(fArr2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.d = false;
        } else {
            sex0.b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
            this.d = false;
            for (int i = 0; i < 8; i++) {
                this.d |= fArr[i] > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
        this.C = true;
        invalidateSelf();
    }

    @Override // xsna.jog0
    public final void j(float f) {
        sex0.f(f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Arrays.fill(this.j, f);
        this.d = f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.C = true;
        invalidateSelf();
    }

    @Override // xsna.jog0
    public final void n(boolean z) {
        if (this.A != z) {
            this.A = z;
            this.C = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.b.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    @Override // xsna.jog0
    public void k() {
    }
}
