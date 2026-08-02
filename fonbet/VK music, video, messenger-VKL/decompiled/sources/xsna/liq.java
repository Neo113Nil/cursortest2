package xsna;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: FadeDrawable.java */
/* loaded from: classes.dex */
public final class liq extends uk3 {
    public final Drawable[] j;
    public final int k;
    public int l;
    public int m;
    public long n;
    public final int[] o;
    public final int[] p;
    public int q;
    public final boolean[] r;
    public int s;
    public boolean t;
    public final boolean u;

    public liq(Drawable[] drawableArr) {
        super(drawableArr);
        this.u = true;
        if (!(drawableArr.length >= 1)) {
            throw new IllegalStateException("At least one layer required!");
        }
        this.j = drawableArr;
        int[] iArr = new int[drawableArr.length];
        this.o = iArr;
        int[] iArr2 = new int[drawableArr.length];
        this.p = iArr2;
        this.q = 255;
        boolean[] zArr = new boolean[drawableArr.length];
        this.r = zArr;
        this.s = 0;
        this.k = 2;
        this.l = 2;
        Arrays.fill(iArr, 0);
        iArr[0] = 255;
        Arrays.fill(iArr2, 0);
        iArr2[0] = 255;
        Arrays.fill(zArr, false);
        zArr[0] = true;
    }

    @Override // xsna.uk3, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean g;
        int i;
        int i2 = this.l;
        Drawable[] drawableArr = this.j;
        int[] iArr = this.p;
        if (i2 == 0) {
            System.arraycopy(iArr, 0, this.o, 0, drawableArr.length);
            this.n = SystemClock.uptimeMillis();
            g = g(this.m == 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (!this.t && (i = this.k) >= 0) {
                boolean[] zArr = this.r;
                if (i < zArr.length && zArr[i]) {
                    this.t = true;
                }
            }
            this.l = g ? 2 : 1;
        } else if (i2 != 1) {
            g = true;
        } else {
            sex0.f(this.m > 0);
            g = g((SystemClock.uptimeMillis() - this.n) / this.m);
            this.l = g ? 2 : 1;
        }
        for (int i3 = 0; i3 < drawableArr.length; i3++) {
            Drawable drawable = drawableArr[i3];
            int ceil = (int) Math.ceil((iArr[i3] * this.q) / 255.0d);
            if (drawable != null && ceil > 0) {
                this.s++;
                if (this.u) {
                    drawable.mutate();
                }
                drawable.setAlpha(ceil);
                this.s--;
                drawable.draw(canvas);
            }
        }
        if (!g) {
            invalidateSelf();
        } else if (this.t) {
            this.t = false;
        }
    }

    public final void e() {
        this.s--;
        invalidateSelf();
    }

    public final void f() {
        this.l = 2;
        for (int i = 0; i < this.j.length; i++) {
            this.p[i] = this.r[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    public final boolean g(float f) {
        boolean z = true;
        for (int i = 0; i < this.j.length; i++) {
            boolean z2 = this.r[i];
            int i2 = (int) (((z2 ? 1 : -1) * 255 * f) + this.o[i]);
            int[] iArr = this.p;
            iArr[i] = i2;
            if (i2 < 0) {
                iArr[i] = 0;
            }
            if (iArr[i] > 255) {
                iArr[i] = 255;
            }
            if (z2 && iArr[i] < 255) {
                z = false;
            }
            if (!z2 && iArr[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.s == 0) {
            super.invalidateSelf();
        }
    }

    @Override // xsna.uk3, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.q != i) {
            this.q = i;
            invalidateSelf();
        }
    }
}
