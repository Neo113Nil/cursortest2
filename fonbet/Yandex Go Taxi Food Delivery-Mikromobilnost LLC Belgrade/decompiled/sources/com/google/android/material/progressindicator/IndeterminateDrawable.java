package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import defpackage.avb;
import defpackage.bk2;
import defpackage.cxg0;
import defpackage.dcm;
import defpackage.fcm;
import defpackage.gjy;
import defpackage.n85;
import defpackage.niy;
import defpackage.pvb;
import defpackage.unr0;
import defpackage.xqv;

/* loaded from: classes11.dex */
public final class IndeterminateDrawable<S extends n85> extends DrawableWithAnimatedVisibilityChange {
    private xqv animatorDelegate;
    private fcm drawingDelegate;
    private Drawable staticDummyDrawable;

    public IndeterminateDrawable(Context context, n85 n85Var, fcm fcmVar, xqv xqvVar) {
        super(context, n85Var);
        setDrawingDelegate(fcmVar);
        setAnimatorDelegate(xqvVar);
    }

    public static IndeterminateDrawable<pvb> createCircularDrawable(Context context, pvb pvbVar, avb avbVar) {
        IndeterminateDrawable<pvb> indeterminateDrawable = new IndeterminateDrawable<>(context, pvbVar, avbVar, pvbVar.q == 1 ? new b(context, pvbVar) : new a(pvbVar));
        indeterminateDrawable.setStaticDummyDrawable(VectorDrawableCompat.create(context.getResources(), cxg0.ic_mtrl_arrow_circle, null));
        return indeterminateDrawable;
    }

    public static IndeterminateDrawable<gjy> createLinearDrawable(Context context, gjy gjyVar, niy niyVar) {
        return new IndeterminateDrawable<>(context, gjyVar, niyVar, gjyVar.q == 0 ? new c(gjyVar) : new d(context, gjyVar));
    }

    private boolean isSystemAnimatorDisabled() {
        return this.animatorDurationScaleProvider != null && bk2.a(this.context.getContentResolver()) == 0.0f;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0105  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        int i;
        Drawable drawable;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.clipBounds)) {
            if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
                drawable.setBounds(getBounds());
                this.staticDummyDrawable.setTint(this.baseSpec.e[0]);
                this.staticDummyDrawable.draw(canvas);
                return;
            }
            canvas.save();
            fcm fcmVar = this.drawingDelegate;
            Rect bounds = getBounds();
            float growFraction = getGrowFraction();
            boolean isShowing = isShowing();
            boolean isHiding = isHiding();
            fcmVar.a.d();
            fcmVar.a(canvas, bounds, growFraction, isShowing, isHiding);
            int i2 = this.baseSpec.i;
            int alpha = getAlpha();
            n85 n85Var = this.baseSpec;
            boolean z = (n85Var instanceof gjy) || ((n85Var instanceof pvb) && ((pvb) n85Var).u);
            boolean z2 = z && i2 == 0 && !n85Var.b(false);
            if (z2) {
                this.drawingDelegate.d(canvas, this.paint, 0.0f, 1.0f, this.baseSpec.f, alpha, 0);
            } else if (z) {
                dcm dcmVar = (dcm) this.animatorDelegate.b.get(0);
                dcm dcmVar2 = (dcm) unr0.k(1, this.animatorDelegate.b);
                fcm fcmVar2 = this.drawingDelegate;
                if (fcmVar2 instanceof niy) {
                    i = i2;
                    fcmVar2.d(canvas, this.paint, 0.0f, dcmVar.a, this.baseSpec.f, alpha, i);
                    this.drawingDelegate.d(canvas, this.paint, dcmVar2.b, 1.0f, this.baseSpec.f, alpha, i);
                } else {
                    i = i2;
                    canvas.save();
                    canvas.rotate(dcmVar2.g);
                    this.drawingDelegate.d(canvas, this.paint, dcmVar2.b, dcmVar.a + 1.0f, this.baseSpec.f, alpha, i);
                    canvas.restore();
                }
                for (int i3 = 0; i3 < this.animatorDelegate.b.size(); i3++) {
                    dcm dcmVar3 = (dcm) this.animatorDelegate.b.get(i3);
                    dcmVar3.f = getPhaseFraction();
                    this.drawingDelegate.c(canvas, this.paint, dcmVar3, getAlpha());
                    if (i3 > 0 && !z2 && z) {
                        this.drawingDelegate.d(canvas, this.paint, ((dcm) this.animatorDelegate.b.get(i3 - 1)).b, dcmVar3.a, this.baseSpec.f, alpha, i);
                    }
                }
                canvas.restore();
            }
            i = i2;
            while (i3 < this.animatorDelegate.b.size()) {
            }
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public xqv getAnimatorDelegate() {
        return this.animatorDelegate;
    }

    public fcm getDrawingDelegate() {
        return this.drawingDelegate;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawingDelegate.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawingDelegate.f();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public Drawable getStaticDummyDrawable() {
        return this.staticDummyDrawable;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(Animatable2Compat.a aVar) {
        super.registerAnimationCallback(aVar);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public void setAnimatorDelegate(xqv xqvVar) {
        this.animatorDelegate = xqvVar;
        xqvVar.a = this;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public void setDrawingDelegate(fcm fcmVar) {
        this.drawingDelegate = fcmVar;
    }

    public void setStaticDummyDrawable(Drawable drawable) {
        this.staticDummyDrawable = drawable;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.animatorDelegate.a();
        }
        if (z && z3) {
            this.animatorDelegate.f();
        }
        return visibleInternal;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(Animatable2Compat.a aVar) {
        return super.unregisterAnimationCallback(aVar);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        return super.setVisible(z, z2, z3);
    }

    public static IndeterminateDrawable<gjy> createLinearDrawable(Context context, gjy gjyVar) {
        return createLinearDrawable(context, gjyVar, new niy(gjyVar));
    }

    public static IndeterminateDrawable<pvb> createCircularDrawable(Context context, pvb pvbVar) {
        return createCircularDrawable(context, pvbVar, new avb(pvbVar));
    }
}
