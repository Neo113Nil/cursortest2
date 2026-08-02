package xsna;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.api.dto.story.WebStickerType;
import xsna.nov;
import xsna.vfv;
import xsna.ye10;

/* compiled from: StoryMarketItemStickerRedesigned.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class b6m0 extends FrameLayout implements no6 {
    public final Context b;
    public a6m0 c;
    public Animator d;
    public gzs<s3q0> e;
    public final z2l0 f;
    public final ye10 g;

    public b6m0(Context context, a6m0 a6m0Var) {
        super(context);
        this.b = context;
        this.c = a6m0Var;
        this.f = new z2l0(this);
        ye10 ye10Var = new ye10(context);
        this.g = ye10Var;
        getCommons().h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ye10Var.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        f4m.m(17, ye10Var);
        addView(ye10Var);
        ye10Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMaxWidth()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMaxHeight()), Integer.MIN_VALUE));
        b(this.c);
    }

    private final int getMaxHeight() {
        return iah0.p(this.b);
    }

    private final int getMaxWidth() {
        return (int) (iah0.z(this.b) * 0.7083333f);
    }

    @Override // xsna.nov
    public final boolean A0(float f, float f2) {
        return nov.a.e(this, f, f2);
    }

    @Override // xsna.nov
    public final nov C0() {
        l0u0 l0u0Var = new l0u0(kd7.i(this, null), this.g.getMeasuredWidth() * 2, WebStickerType.MARKET_ITEM, "");
        l0u0Var.q = b6m0.class;
        l0u0Var.t = this.c;
        l0u0Var.r = this;
        l0u0Var.s = new myd0(l0u0Var, 15);
        nov.a.b(this, l0u0Var);
        return l0u0Var;
    }

    @Override // xsna.nov
    public final nov E0(nov novVar) {
        b6m0 b6m0Var = new b6m0(this.b, this.c);
        ye10 ye10Var = this.g;
        b6m0Var.measure(View.MeasureSpec.makeMeasureSpec(ye10Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ye10Var.getMeasuredHeight(), 1073741824));
        b6m0Var.layout(0, 0, b6m0Var.getMeasuredWidth(), b6m0Var.getMeasuredHeight());
        nov.a.b(this, b6m0Var);
        return b6m0Var;
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

    public final void b(a6m0 a6m0Var) {
        ye10.c c4098c;
        this.c = a6m0Var;
        vfv vfvVar = a6m0Var.g;
        if (vfvVar == null) {
            return;
        }
        String str = vfvVar.c;
        ye10.a bVar = str != null ? new ye10.a.b(str) : ye10.a.C4097a.a;
        vfv.a aVar = vfvVar.d;
        String str2 = aVar != null ? aVar.b : null;
        if (str2 != null) {
            c4098c = new ye10.c.b(aVar.a, str2);
        } else if (aVar != null) {
            c4098c = new ye10.c.a(aVar.a);
        } else {
            String str3 = vfvVar.b;
            if (str3 == null) {
                str3 = "";
            }
            c4098c = new ye10.c.C4098c(str3);
        }
        this.g.setState(new ye10.b(bVar, new ye10.d.a(vfvVar.a), c4098c, vfvVar.e));
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
        return this.d;
    }

    @Override // xsna.nov
    public boolean getCanRotate() {
        return true;
    }

    @Override // xsna.nov
    public boolean getCanScale() {
        return true;
    }

    @Override // xsna.nov
    public boolean getCanStickToSafeZoneGuideLines() {
        return true;
    }

    @Override // xsna.nov
    public boolean getCanTranslateX() {
        return true;
    }

    @Override // xsna.nov
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
        return this.e;
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
        return this.g.getMeasuredHeight();
    }

    @Override // xsna.nov
    public float getOriginalStickerScale() {
        return getCommons().k();
    }

    @Override // xsna.nov
    public float getOriginalWidth() {
        return this.g.getMeasuredWidth();
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

    @Override // xsna.v4l0
    public final Object m() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.g.layout(i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMaxWidth()), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMaxHeight()), Integer.MIN_VALUE);
        ye10 ye10Var = this.g;
        ye10Var.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(ye10Var.getMeasuredWidth(), ye10Var.getMeasuredHeight());
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
        this.e = gzsVar;
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
        awt0.u(this, z);
        getCommons().setVisible(z);
    }

    @Override // xsna.nov
    public final void t0() {
        nov.a.j(this);
    }

    @Override // xsna.v4l0
    public final void update(Object obj) {
        b((a6m0) obj);
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
