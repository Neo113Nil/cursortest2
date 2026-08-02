package com.yandex.attachments.view;

import android.view.animation.Interpolator;
import com.yandex.attachments.view.ZoomableImageView;
import defpackage.g8e;
import defpackage.pf61;

/* loaded from: classes11.dex */
public final class a implements Runnable {
    public pf61 a;
    public pf61 b;
    public long w;
    public final /* synthetic */ ZoomableImageView y;
    public final pf61 c = new pf61(1.0f, 0.0f, 0.0f);
    public long x = 250;

    public a(ZoomableImageView zoomableImageView) {
        this.y = zoomableImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Interpolator interpolator;
        if (this.a == null || this.b == null) {
            return;
        }
        float min = Math.min(1.0f, ((System.currentTimeMillis() - this.w) * 1.0f) / this.x);
        interpolator = ZoomableImageView.INTERPOLATOR;
        float interpolation = interpolator.getInterpolation(min);
        pf61 pf61Var = this.a;
        float f = pf61Var.a;
        pf61 pf61Var2 = this.b;
        float b = g8e.b(pf61Var2.a, f, interpolation, f);
        pf61 pf61Var3 = this.c;
        pf61Var3.a = b;
        float f2 = pf61Var.b;
        pf61Var3.b = g8e.b(pf61Var2.b, f2, interpolation, f2);
        float f3 = pf61Var.c;
        pf61Var3.c = g8e.b(pf61Var2.c, f3, interpolation, f3);
        ZoomableImageView zoomableImageView = this.y;
        zoomableImageView.updateScene(pf61Var3);
        if (interpolation < 1.0f) {
            zoomableImageView.postOnAnimation(this);
            return;
        }
        zoomableImageView.mIsAnimating = false;
        this.x = 250L;
        zoomableImageView.mState = ZoomableImageView.State.STATE_NONE;
        zoomableImageView.fixBoundsIfNeeded();
        zoomableImageView.onActionEnd();
    }
}
