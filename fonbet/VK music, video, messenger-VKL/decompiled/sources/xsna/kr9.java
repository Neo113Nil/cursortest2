package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import xsna.nov;

/* compiled from: CanvasSticker.kt */
/* loaded from: classes6.dex */
public abstract class kr9 implements nov {
    public int b = -1;
    public final z2l0 c;
    public gzs<s3q0> d;
    public ValueAnimator e;
    public o1l0 f;
    public int g;

    public kr9() {
        z2l0 z2l0Var = new z2l0(this);
        this.c = z2l0Var;
        z2l0Var.h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.g = 255;
    }

    @Override // xsna.nov
    public boolean A0(float f, float f2) {
        return nov.a.e(this, f, f2);
    }

    @Override // xsna.nov
    public nov C0() {
        return copy();
    }

    @Override // xsna.nov
    public nov E0(nov novVar) {
        nov.a.b(this, null);
        return null;
    }

    @Override // xsna.nov
    public final void F0(Canvas canvas, boolean z) {
        nov.a.a(this, canvas, z);
    }

    @Override // xsna.nov
    public boolean H0() {
        return this.c.p;
    }

    @Override // xsna.nov
    public final void a(float f, float f2, float f3) {
        nov.a.f(this, f, f2, f3);
    }

    @Override // xsna.nov
    public final nov copy() {
        return E0(null);
    }

    @Override // xsna.nov
    public boolean d() {
        return this.c.o;
    }

    @Override // xsna.nov
    public final void e(float f, float f2) {
        nov.a.i(this, f, f2);
    }

    @Override // xsna.nov
    public final String getAccessibilityText() {
        return "";
    }

    @Override // xsna.nov
    public final float getBottom() {
        return this.c.getBottom();
    }

    @Override // xsna.nov
    public final Animator getBounceAnimator() {
        return this.e;
    }

    @Override // xsna.nov
    public final boolean getCanRotate() {
        return true;
    }

    @Override // xsna.nov
    public final boolean getCanScale() {
        return true;
    }

    @Override // xsna.nov
    public final boolean getCanStickToSafeZoneGuideLines() {
        return true;
    }

    @Override // xsna.nov
    public final boolean getCanTranslateX() {
        return true;
    }

    @Override // xsna.nov
    public final boolean getCanTranslateY() {
        return true;
    }

    @Override // xsna.nov
    public final float getCenterX() {
        return this.c.e.centerX();
    }

    @Override // xsna.nov
    public final float getCenterY() {
        return this.c.e.centerY();
    }

    @Override // xsna.nov
    public final oov getCommons() {
        return this.c;
    }

    @Override // xsna.nov
    public final PointF[] getFillPoints() {
        return this.c.getFillPoints();
    }

    @Override // xsna.nov
    public final boolean getInDraggingMode() {
        return this.c.r;
    }

    @Override // xsna.nov
    public final boolean getInEditMode() {
        return this.c.s;
    }

    @Override // xsna.nov
    public final gzs<s3q0> getInvalidator() {
        return this.d;
    }

    @Override // xsna.nov
    public final float getLeft() {
        return this.c.getLeft();
    }

    @Override // xsna.nov
    public float getMaxScaleLimit() {
        return 2.1474836E9f;
    }

    @Override // xsna.nov
    public float getMinScaleLimit() {
        return 0.1f;
    }

    @Override // xsna.nov
    public int getMovePointersCount() {
        return 1;
    }

    @Override // xsna.nov
    public final float getOriginalStickerScale() {
        return this.c.m;
    }

    @Override // xsna.nov
    public final float getRealHeight() {
        return nov.a.c(this);
    }

    @Override // xsna.nov
    public final float getRealWidth() {
        return nov.a.d(this);
    }

    @Override // xsna.nov
    public final float getRight() {
        return this.c.getRight();
    }

    @Override // xsna.nov
    public int getStickerAlpha() {
        return this.g;
    }

    @Override // xsna.nov
    public int getStickerLayerType() {
        return 6;
    }

    @Override // xsna.nov
    public final Matrix getStickerMatrix() {
        return this.c.n;
    }

    @Override // xsna.nov
    public final float getStickerRotation() {
        return pov.b(this.c.n);
    }

    @Override // xsna.nov
    public final float getStickerScale() {
        return this.c.l;
    }

    @Override // xsna.nov
    public final float getStickerTranslationX() {
        return pov.e(this.c.n);
    }

    @Override // xsna.nov
    public final float getStickerTranslationY() {
        return pov.f(this.c.n);
    }

    @Override // xsna.nov
    public final float getTop() {
        return this.c.getTop();
    }

    public io.reactivex.rxjava3.core.q<nov> k() {
        return io.reactivex.rxjava3.core.q.T(E0(null));
    }

    public final float o() {
        this.c.n.getValues(new float[9]);
        return (float) Math.rint(((float) Math.atan2(r0[1], r0[0])) * 57.29577951308232d);
    }

    @Override // xsna.nov
    public final void setBounceAnimator(Animator animator) {
        this.e = (ValueAnimator) animator;
    }

    @Override // xsna.nov
    public final void setInEditMode(boolean z) {
        this.c.setInEditMode(z);
    }

    @Override // xsna.nov
    public final void setInvalidator(gzs<s3q0> gzsVar) {
        this.d = gzsVar;
    }

    @Override // xsna.nov
    public final void setRemovable(boolean z) {
        this.c.q = z;
    }

    @Override // xsna.nov
    public void setStatic(boolean z) {
        this.c.o = z;
    }

    @Override // xsna.nov
    public final void setStickerAccessibilityListener(o1l0 o1l0Var) {
        this.f = o1l0Var;
    }

    @Override // xsna.nov
    public void setStickerAlpha(int i) {
        this.g = i;
    }

    @Override // xsna.nov
    public final void setStickerMatrix(Matrix matrix) {
        ((z2l0) getCommons()).getTransformMatrix().set(matrix);
    }

    @Override // xsna.nov
    public final void setStickerTranslationX(float f) {
        getStickerMatrix().setTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getStickerTranslationY());
    }

    @Override // xsna.nov
    public final void setStickerTranslationY(float f) {
        getStickerMatrix().setTranslate(getStickerTranslationX(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.nov
    public void setStickerVisible(boolean z) {
        this.c.p = z;
    }

    @Override // xsna.nov
    public void setTimestampMsValue(int i) {
        this.b = i;
    }

    @Override // xsna.nov
    public final void t0() {
        nov.a.j(this);
    }

    @Override // xsna.nov
    public final boolean v0() {
        return this.c.q;
    }

    @Override // xsna.nov
    public final void w0(float f, float f2) {
        this.c.w0(f, f2);
    }

    @Override // xsna.nov
    public final void x0(RectF rectF, float f, float f2) {
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
    }

    @Override // xsna.nov
    public final void y0(float f, float f2, float f3, boolean z) {
        this.c.y0(f, f2, f3, z);
    }

    @Override // xsna.nov
    public boolean z0() {
        return false;
    }

    @Override // xsna.nov
    public void startEncoding() {
    }

    @Override // xsna.nov
    public void stopEncoding() {
    }
}
