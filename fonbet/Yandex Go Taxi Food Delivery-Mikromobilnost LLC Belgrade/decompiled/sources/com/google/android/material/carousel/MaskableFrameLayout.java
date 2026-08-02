package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.shape.ShapeableDelegateV22;
import com.google.android.material.shape.ShapeableDelegateV33;
import com.google.android.material.shape.b;
import defpackage.kxb;
import defpackage.ly00;
import defpackage.mj2;
import defpackage.pz60;
import defpackage.s6;
import defpackage.sb2;
import defpackage.uir0;
import defpackage.vir0;
import defpackage.xre;

/* loaded from: classes11.dex */
public class MaskableFrameLayout extends FrameLayout implements ly00, uir0 {
    private static final int NOT_SET = -1;
    private View.OnHoverListener hoverListener;
    private boolean isHovered;
    private final RectF maskRect;
    private float maskXPercentage;
    private pz60 onMaskChangedListener;
    private Boolean savedForceCompatClippingEnabled;
    private final Rect screenBoundsRect;
    private com.google.android.material.shape.b shapeAppearanceModel;
    private final vir0 shapeableDelegate;

    public MaskableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maskXPercentage = -1.0f;
        this.maskRect = new RectF();
        this.screenBoundsRect = new Rect();
        this.shapeableDelegate = Build.VERSION.SDK_INT >= 33 ? new ShapeableDelegateV33(this) : new ShapeableDelegateV22(this);
        this.savedForceCompatClippingEnabled = null;
        this.isHovered = false;
        setShapeAppearanceModel(com.google.android.material.shape.b.j(context, attributeSet, i, 0).a());
    }

    private /* synthetic */ void lambda$dispatchDraw$1(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    private static xre lambda$setShapeAppearanceModel$0(xre xreVar) {
        return xreVar instanceof s6 ? new kxb(((s6) xreVar).a) : xreVar;
    }

    private void maybeUpdateFocusRingDrawableShapeAppearance(Drawable drawable, com.google.android.material.shape.b bVar) {
        FocusRingDrawable findAndMutate = FocusRingDrawable.findAndMutate(drawable);
        if (findAndMutate != null) {
            findAndMutate.setFocusRingShapeAppearance(bVar);
        }
    }

    private void onMaskChanged() {
        vir0 vir0Var = this.shapeableDelegate;
        vir0Var.d = this.maskRect;
        vir0Var.c();
        vir0Var.a(this);
    }

    private void updateMaskRectForMaskXPercentage() {
        if (this.maskXPercentage != -1.0f) {
            float b = mj2.b(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.maskXPercentage);
            setMaskRectF(new RectF(b, 0.0f, getWidth() - b, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        vir0 vir0Var = this.shapeableDelegate;
        Path path = vir0Var.e;
        if (!vir0Var.b() || path.isEmpty()) {
            lambda$dispatchDraw$1(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        lambda$dispatchDraw$1(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        RectF rectF = this.maskRect;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public RectF getMaskRectF() {
        return this.maskRect;
    }

    @Deprecated
    public float getMaskXPercentage() {
        return this.maskXPercentage;
    }

    @Override // defpackage.uir0
    public com.google.android.material.shape.b getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.savedForceCompatClippingEnabled;
        if (bool != null) {
            vir0 vir0Var = this.shapeableDelegate;
            boolean booleanValue = bool.booleanValue();
            if (booleanValue != vir0Var.a) {
                vir0Var.a = booleanValue;
                vir0Var.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.savedForceCompatClippingEnabled = Boolean.valueOf(this.shapeableDelegate.a);
        vir0 vir0Var = this.shapeableDelegate;
        if (true != vir0Var.a) {
            vir0Var.a = true;
            vir0Var.a(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!this.maskRect.isEmpty() && (action == 9 || action == 10 || action == 7)) {
            if (!this.maskRect.contains(motionEvent.getX(), motionEvent.getY())) {
                if (this.isHovered && this.hoverListener != null) {
                    motionEvent.setAction(10);
                    this.hoverListener.onHover(this, motionEvent);
                }
                this.isHovered = false;
                return false;
            }
        }
        if (this.hoverListener != null) {
            if (!this.isHovered && action == 7) {
                motionEvent.setAction(9);
                this.isHovered = true;
            }
            if (action == 7 || action == 9) {
                this.isHovered = true;
            }
            this.hoverListener.onHover(this, motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.getBoundsInScreen(this.screenBoundsRect);
        if (getX() > 0.0f) {
            this.screenBoundsRect.left = (int) (r0.left + this.maskRect.left);
        }
        if (getY() > 0.0f) {
            this.screenBoundsRect.top = (int) (r0.top + this.maskRect.top);
        }
        Rect rect = this.screenBoundsRect;
        rect.right = Math.round(this.maskRect.width()) + rect.left;
        Rect rect2 = this.screenBoundsRect;
        rect2.bottom = Math.round(this.maskRect.height()) + rect2.top;
        accessibilityNodeInfo.setBoundsInScreen(this.screenBoundsRect);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.maskRect.isEmpty()) {
            if (!this.maskRect.contains(motionEvent.getX(), motionEvent.getY())) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.maskXPercentage != -1.0f) {
            updateMaskRectForMaskXPercentage();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.maskRect.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.maskRect.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setForceCompatClipping(boolean z) {
        vir0 vir0Var = this.shapeableDelegate;
        if (z != vir0Var.a) {
            vir0Var.a = z;
            vir0Var.a(this);
        }
    }

    @Override // defpackage.ly00
    public void setMaskRectF(RectF rectF) {
        this.maskRect.set(rectF);
        onMaskChanged();
    }

    @Deprecated
    public void setMaskXPercentage(float f) {
        float j = sb2.j(f, 0.0f, 1.0f);
        if (this.maskXPercentage != j) {
            this.maskXPercentage = j;
            updateMaskRectForMaskXPercentage();
        }
    }

    @Override // android.view.View
    public void setOnHoverListener(View.OnHoverListener onHoverListener) {
        this.hoverListener = onHoverListener;
    }

    public void setOnMaskChangedListener(pz60 pz60Var) {
    }

    @Override // defpackage.uir0
    public void setShapeAppearanceModel(com.google.android.material.shape.b bVar) {
        b.a m = bVar.m();
        m.e = lambda$setShapeAppearanceModel$0(bVar.e);
        m.f = lambda$setShapeAppearanceModel$0(bVar.f);
        m.h = lambda$setShapeAppearanceModel$0(bVar.h);
        m.g = lambda$setShapeAppearanceModel$0(bVar.g);
        com.google.android.material.shape.b a = m.a();
        this.shapeAppearanceModel = a;
        vir0 vir0Var = this.shapeableDelegate;
        vir0Var.c = a;
        vir0Var.c();
        vir0Var.a(this);
        maybeUpdateFocusRingDrawableShapeAppearance(getBackground(), this.shapeAppearanceModel);
        maybeUpdateFocusRingDrawableShapeAppearance(getForeground(), this.shapeAppearanceModel);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(Context context) {
        this(context, null);
    }
}
