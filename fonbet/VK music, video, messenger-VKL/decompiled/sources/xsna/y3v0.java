package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkMicDrawable.kt */
/* loaded from: classes17.dex */
public final class y3v0 extends Drawable {
    public static final LinearInterpolator m = new LinearInterpolator();
    public final Drawable a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable[] e;
    public float f;
    public float g;
    public final ValueAnimator h;
    public long i;
    public final LinearInterpolator j;
    public int k;
    public int l;

    public y3v0(Context context) {
        Drawable mutate = m33.a(R.drawable.vk_icon_microphone_slash_color_alt_black_28, context).mutate();
        this.a = mutate;
        Drawable mutate2 = m33.a(R.drawable.vk_mic_active_bottom, context).mutate();
        this.b = mutate2;
        Drawable mutate3 = m33.a(R.drawable.vk_icon_deprecated_vk_mic_active_oval, context).mutate();
        this.c = mutate3;
        Drawable mutate4 = m33.a(R.drawable.vk_icon_deprecated_vk_mic_active_oval, context).mutate();
        this.d = mutate4;
        this.e = new Drawable[]{mutate, mutate2, mutate3, mutate4};
        this.f = 0.4f;
        this.g = 0.4f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.addUpdateListener(new oex(this, 2));
        this.h = ofFloat;
        this.i = 100L;
        this.j = m;
        b(-16777216);
        if (this.l != -1) {
            this.l = -1;
            mutate4.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            invalidateSelf();
        }
    }

    public final void a(float f, boolean z) {
        float f2;
        boolean z2 = f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z2) {
            f2 = -1.0f;
        } else {
            if (z2) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        }
        float f3 = this.f;
        boolean z3 = f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z4 = Math.abs(f3 - f) <= 0.01f;
        if (z3 || z4) {
            return;
        }
        this.f = f2;
        ValueAnimator valueAnimator = this.h;
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !z || !isVisible()) {
            valueAnimator.cancel();
            this.g = this.f;
            invalidateSelf();
        } else {
            valueAnimator.cancel();
            valueAnimator.setFloatValues(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.g), this.f);
            valueAnimator.setDuration(this.i);
            valueAnimator.setInterpolator(this.j);
            valueAnimator.start();
        }
    }

    public final void b(int i) {
        if (this.k != i) {
            this.k = i;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
            this.a.setColorFilter(porterDuffColorFilter);
            this.b.setColorFilter(porterDuffColorFilter);
            this.c.setColorFilter(porterDuffColorFilter);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = this.g < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z) {
            this.a.draw(canvas);
            return;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        this.b.draw(canvas);
        this.c.draw(canvas);
        canvas.clipRect(getBounds().left, (int) (((1.0f - this.g) * Math.abs(-0.58f) * getBounds().height()) + getBounds().top + (getBounds().height() * 0.07f) + getBounds().top + getBounds().top), getBounds().right, getBounds().bottom);
        this.d.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        for (Drawable drawable : this.e) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        for (Drawable drawable : this.e) {
            drawable.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (!z) {
            this.h.cancel();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
