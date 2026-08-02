package xsna;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import xsna.nov;

/* compiled from: ViewGroupSticker.kt */
/* loaded from: classes6.dex */
public abstract class nxt0 extends ViewGroup implements nov {
    public final z2l0 b;
    public gzs<s3q0> c;
    public Animator d;
    public o1l0 e;

    public nxt0(Context context) {
        super(context);
        this.b = new z2l0(this);
        getCommons().h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.nov
    public final boolean A0(float f, float f2) {
        return nov.a.e(this, f, f2);
    }

    @Override // xsna.nov
    public final boolean B0() {
        return getOriginalHeight() > getOriginalWidth();
    }

    public nov C0() {
        return copy();
    }

    public nov E0(nov novVar) {
        nxt0 nxt0Var = (nxt0) novVar;
        nxt0Var.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        nxt0Var.layout(0, 0, nxt0Var.getMeasuredWidth(), nxt0Var.getMeasuredHeight());
        nov.a.b(this, nxt0Var);
        return nxt0Var;
    }

    public void F0(Canvas canvas, boolean z) {
        nov.a.a(this, canvas, z);
    }

    public void G0(Canvas canvas) {
        draw(canvas);
    }

    @Override // xsna.nov
    public final boolean H0() {
        return getCommons().isVisible();
    }

    public void a(float f, float f2, float f3) {
        nov.a.f(this, f, f2, f3);
    }

    @Override // xsna.nov
    public final nov copy() {
        return E0(null);
    }

    @Override // xsna.nov
    public final boolean d() {
        return getCommons().d();
    }

    public void e(float f, float f2) {
        nov.a.i(this, f, f2);
    }

    public final o1l0 getAccessibilityListener() {
        return this.e;
    }

    @Override // xsna.nov
    public String getAccessibilityText() {
        String obj;
        CharSequence contentDescription = getContentDescription();
        return (contentDescription == null || (obj = contentDescription.toString()) == null) ? "" : obj;
    }

    @Override // android.view.View, xsna.nov
    public float getBottom() {
        return getCommons().getBottom();
    }

    @Override // xsna.nov
    public Animator getBounceAnimator() {
        return this.d;
    }

    public boolean getCanRotate() {
        return true;
    }

    public boolean getCanScale() {
        return true;
    }

    public boolean getCanStickToSafeZoneGuideLines() {
        return true;
    }

    public boolean getCanTranslateX() {
        return true;
    }

    public boolean getCanTranslateY() {
        return true;
    }

    @Override // xsna.nov
    public float getCenterX() {
        return getCommons().getCenterX();
    }

    @Override // xsna.nov
    public float getCenterY() {
        return getCommons().getCenterY();
    }

    @Override // xsna.nov
    public oov getCommons() {
        return this.b;
    }

    public PointF[] getFillPoints() {
        return getCommons().getFillPoints();
    }

    @Override // xsna.nov
    public boolean getInDraggingMode() {
        return getCommons().getInDraggingMode();
    }

    @Override // xsna.nov
    public boolean getInEditMode() {
        return getCommons().getInEditMode();
    }

    @Override // xsna.nov
    public gzs<s3q0> getInvalidator() {
        return this.c;
    }

    @Override // android.view.View, xsna.nov
    public float getLeft() {
        return getCommons().getLeft();
    }

    public float getMaxScaleLimit() {
        return 2.1474836E9f;
    }

    public float getMinScaleLimit() {
        return 0.1f;
    }

    public int getMovePointersCount() {
        return 1;
    }

    public abstract /* synthetic */ float getOriginalHeight();

    @Override // xsna.nov
    public float getOriginalStickerScale() {
        return getCommons().k();
    }

    public abstract /* synthetic */ float getOriginalWidth();

    @Override // xsna.nov
    public float getRealHeight() {
        return nov.a.c(this);
    }

    @Override // xsna.nov
    public float getRealWidth() {
        return nov.a.d(this);
    }

    @Override // android.view.View, xsna.nov
    public float getRight() {
        return getCommons().getRight();
    }

    public int getStickerAlpha() {
        return an10.b(getAlpha() * 255);
    }

    public int getStickerLayerType() {
        return 6;
    }

    @Override // xsna.nov
    public Matrix getStickerMatrix() {
        return getCommons().getTransformMatrix();
    }

    @Override // xsna.nov
    public float getStickerRotation() {
        return pov.b(getStickerMatrix());
    }

    @Override // xsna.nov
    public float getStickerScale() {
        return getCommons().c();
    }

    @Override // xsna.nov
    public float getStickerTranslationX() {
        return pov.e(getStickerMatrix());
    }

    @Override // xsna.nov
    public float getStickerTranslationY() {
        return pov.f(getStickerMatrix());
    }

    @Override // android.view.View, xsna.nov
    public float getTop() {
        return getCommons().getTop();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(an10.b(getOriginalWidth()), an10.b(getOriginalHeight()));
    }

    public final void setAccessibilityListener(o1l0 o1l0Var) {
        this.e = o1l0Var;
    }

    @Override // xsna.nov
    public void setBounceAnimator(Animator animator) {
        this.d = animator;
    }

    public void setInDraggingMode(boolean z) {
        getCommons().n(z);
    }

    @Override // xsna.nov
    public void setInEditMode(boolean z) {
        getCommons().setInEditMode(z);
    }

    @Override // xsna.nov
    public void setInvalidator(gzs<s3q0> gzsVar) {
        this.c = gzsVar;
    }

    public void setOriginalStickerScale(float f) {
        getCommons().g(f);
    }

    public void setRemovable(boolean z) {
        getCommons().setRemovable(z);
    }

    @Override // xsna.nov
    public void setStatic(boolean z) {
        getCommons().setStatic(z);
    }

    @Override // xsna.nov
    public void setStickerAccessibilityListener(o1l0 o1l0Var) {
        this.e = o1l0Var;
    }

    public void setStickerAlpha(int i) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha(i);
        }
        float f = i / 255;
        setAlpha(f);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).setAlpha(f);
        }
    }

    @Override // xsna.nov
    public void setStickerMatrix(Matrix matrix) {
        getCommons().getTransformMatrix().set(matrix);
    }

    public void setStickerRotation(float f) {
        nov.a.g(f, this);
    }

    public void setStickerScale(float f) {
        nov.a.h(f, this);
    }

    @Override // xsna.nov
    public void setStickerTranslationX(float f) {
        getStickerMatrix().setTranslate(f, getStickerTranslationY());
    }

    @Override // xsna.nov
    public void setStickerTranslationY(float f) {
        getStickerMatrix().setTranslate(getStickerTranslationX(), f);
    }

    @Override // xsna.nov
    public void setStickerVisible(boolean z) {
        awt0.u(this, z);
        getCommons().setVisible(z);
    }

    @Override // xsna.nov
    public final void t0() {
        nov.a.j(this);
    }

    public boolean v0() {
        return getCommons().v0();
    }

    public void w0(float f, float f2) {
        getCommons().w0(f, f2);
    }

    @Override // xsna.nov
    public void x0(RectF rectF, float f, float f2) {
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
    }

    public void y0(float f, float f2, float f3, boolean z) {
        getCommons().y0(f, f2, f3, z);
    }

    @Override // xsna.nov
    public boolean z0() {
        return false;
    }

    @Override // xsna.nov
    public final void startEncoding() {
    }

    public void stopEncoding() {
    }

    @Override // xsna.nov
    public void setTimestampMsValue(int i) {
    }
}
