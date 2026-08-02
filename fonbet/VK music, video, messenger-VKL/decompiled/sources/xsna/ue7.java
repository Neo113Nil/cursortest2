package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: BlendingDrawable.kt */
/* loaded from: classes17.dex */
public final class ue7 extends Drawable implements Drawable.Callback {
    public final int b;
    public final int c;
    public final Drawable d;
    public int e;
    public float f;
    public int[] g;

    public ue7(Drawable drawable, int i, int i2) {
        this.b = i;
        this.c = i2;
        Drawable mutate = drawable.mutate();
        this.d = mutate;
        this.e = i;
        this.g = new int[0];
        mutate.setCallback(this);
        setState(this.g);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.d.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        int[] iArr2 = this.g;
        int length = iArr2.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (iArr2[i] == 16842913) {
                z = true;
                break;
            }
            i++;
        }
        int length2 = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            if (iArr[i2] == 16842913) {
                z2 = true;
                break;
            }
            i2++;
        }
        super.onStateChange(iArr);
        if (z2 != z) {
            if (z2 && this.f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.e = this.c;
                this.f = 1.0f;
            } else if (!z2 && this.f == 1.0f) {
                this.e = this.b;
                this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
        this.d.setColorFilter(this.e, PorterDuff.Mode.SRC_IN);
        this.g = iArr;
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.d.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
