package xsna;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import xsna.nov;

/* compiled from: VideoMsgStencilSticker.kt */
/* loaded from: classes6.dex */
public final class gxs0 extends ViewGroup implements nov {
    public final String b;
    public final hxs0 c;
    public final Matrix d;
    public Bitmap e;
    public final jxs0 f;
    public gzs<s3q0> g;
    public Animator h;

    public gxs0(Context context, String str) {
        super(context);
        this.b = str;
        hxs0 hxs0Var = new hxs0(context);
        hxs0Var.setStencil(str);
        addView(hxs0Var, new ViewGroup.LayoutParams(-1, -1));
        this.c = hxs0Var;
        this.d = new Matrix();
        this.f = new jxs0(this);
    }

    @Override // xsna.nov
    public final boolean A0(float f, float f2) {
        return nov.a.e(this, f, f2);
    }

    @Override // xsna.nov
    public final nov C0() {
        return copy();
    }

    @Override // xsna.nov
    public final nov E0(nov novVar) {
        gxs0 gxs0Var = new gxs0(getContext(), this.b);
        gxs0Var.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        gxs0Var.layout(0, 0, gxs0Var.getMeasuredWidth(), gxs0Var.getMeasuredHeight());
        gxs0Var.b(this.d);
        int measuredWidth = gxs0Var.getMeasuredWidth();
        int measuredHeight = gxs0Var.getMeasuredHeight();
        hxs0 hxs0Var = gxs0Var.c;
        hxs0Var.b(measuredWidth, measuredHeight);
        Bitmap bitmap = this.e;
        gxs0Var.e = bitmap;
        hxs0Var.setBackgroundBitmap(bitmap);
        nov.a.b(this, gxs0Var);
        return gxs0Var;
    }

    @Override // xsna.nov
    public final void F0(Canvas canvas, boolean z) {
        nov.a.a(this, canvas, z);
    }

    @Override // xsna.nov
    public final void G0(Canvas canvas) {
        draw(canvas);
    }

    @Override // xsna.nov
    public final boolean H0() {
        return getCommons().isVisible();
    }

    @Override // xsna.nov
    public final void a(float f, float f2, float f3) {
        nov.a.f(this, f, f2, f3);
    }

    public final void b(Matrix matrix) {
        this.d.set(matrix);
        hxs0 hxs0Var = this.c;
        hxs0Var.c.set(matrix);
        if (hxs0Var.getWidth() <= 0 || hxs0Var.getHeight() <= 0 || hxs0Var.b.isEmpty()) {
            return;
        }
        hxs0Var.b(hxs0Var.getWidth(), hxs0Var.getHeight());
        hxs0Var.invalidate();
    }

    @Override // xsna.nov
    public final nov copy() {
        return E0(null);
    }

    @Override // xsna.nov
    public final boolean d() {
        return getCommons().d();
    }

    @Override // xsna.nov
    public final void e(float f, float f2) {
        nov.a.i(this, f, f2);
    }

    @Override // xsna.nov
    public String getAccessibilityText() {
        return "";
    }

    @Override // android.view.View, xsna.nov
    public float getBottom() {
        return getCommons().getBottom();
    }

    @Override // xsna.nov
    public Animator getBounceAnimator() {
        return this.h;
    }

    @Override // xsna.nov
    public boolean getCanRotate() {
        return false;
    }

    @Override // xsna.nov
    public boolean getCanScale() {
        return false;
    }

    @Override // xsna.nov
    public boolean getCanStickToSafeZoneGuideLines() {
        return true;
    }

    @Override // xsna.nov
    public boolean getCanTranslateX() {
        return false;
    }

    @Override // xsna.nov
    public boolean getCanTranslateY() {
        return false;
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
        return this.f;
    }

    @Override // xsna.nov
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
        return this.g;
    }

    @Override // android.view.View, xsna.nov
    public float getLeft() {
        return getCommons().getLeft();
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
    public float getOriginalHeight() {
        return getMeasuredHeight();
    }

    @Override // xsna.nov
    public float getOriginalStickerScale() {
        return getCommons().k();
    }

    @Override // xsna.nov
    public float getOriginalWidth() {
        return getMeasuredWidth();
    }

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

    @Override // xsna.nov
    public int getStickerAlpha() {
        return an10.b(getAlpha() * 255);
    }

    @Override // xsna.nov
    public int getStickerLayerType() {
        return 3;
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

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override // xsna.nov
    public void setBounceAnimator(Animator animator) {
        this.h = animator;
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
        this.g = gzsVar;
    }

    public void setOriginalStickerScale(float f) {
        getCommons().g(f);
    }

    @Override // xsna.nov
    public void setRemovable(boolean z) {
        getCommons().setRemovable(z);
    }

    @Override // xsna.nov
    public void setStatic(boolean z) {
        getCommons().setStatic(z);
    }

    @Override // xsna.nov
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
        getCommons().setVisible(z);
    }

    @Override // xsna.nov
    public final void t0() {
        nov.a.j(this);
    }

    @Override // xsna.nov
    public final boolean v0() {
        return getCommons().v0();
    }

    @Override // xsna.nov
    public final void w0(float f, float f2) {
        getCommons().w0(f, f2);
    }

    @Override // xsna.nov
    public final void x0(RectF rectF, float f, float f2) {
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
    }

    @Override // xsna.nov
    public final void y0(float f, float f2, float f3, boolean z) {
        getCommons().y0(f, f2, f3, z);
    }

    @Override // xsna.nov
    public final boolean z0() {
        return false;
    }

    @Override // xsna.nov
    public final void startEncoding() {
    }

    @Override // xsna.nov
    public final void stopEncoding() {
    }

    @Override // xsna.nov
    public void setStickerAccessibilityListener(o1l0 o1l0Var) {
    }

    @Override // xsna.nov
    public void setTimestampMsValue(int i) {
    }
}
