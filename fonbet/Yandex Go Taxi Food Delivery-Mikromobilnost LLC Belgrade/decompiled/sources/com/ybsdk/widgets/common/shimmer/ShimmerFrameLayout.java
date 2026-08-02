package com.ybsdk.widgets.common.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.core.utils.ColorModel;
import defpackage.bwb0;
import defpackage.hur0;
import defpackage.iur0;
import defpackage.jl40;
import defpackage.jur0;
import defpackage.k4o;
import defpackage.kp50;
import defpackage.kur0;
import defpackage.lur0;
import defpackage.ntr0;
import defpackage.ny61;
import defpackage.rje;
import defpackage.t3i0;
import defpackage.ttx;
import defpackage.utx;
import defpackage.vtx;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J7\u0010,\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\fH\u0014¢\u0006\u0004\b.\u0010\u0018J\u000f\u0010/\u001a\u00020\fH\u0014¢\u0006\u0004\b/\u0010\u0018J\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0014¢\u0006\u0004\b2\u00103J\u001f\u00107\u001a\u00020\f2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u0006H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u001d2\u0006\u0010:\u001a\u000209H\u0014¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcom/ybsdk/widgets/common/shimmer/ShimmerFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lntr0;", "shimmerArgs", "Lzy11;", "setShimmer", "(Lntr0;)V", "Landroid/content/res/TypedArray;", "typedArray", "fromAttributes", "(Landroid/content/Context;Landroid/content/res/TypedArray;)Lntr0;", "Llur0;", "shimmerStatus", "render", "(Llur0;)V", "startShimmer", "()V", "stopShimmer", "times", "playShimmer", "(I)V", "", "isShimmerStarted", "()Z", BackendConfig.Restrictions.ENABLED, "setAutoStart", "(Z)V", "Lcom/ybsdk/core/utils/ColorModel;", "color", "setColor", "(Lcom/ybsdk/core/utils/ColorModel;)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "Landroid/graphics/drawable/Drawable;", "who", "verifyDrawable", "(Landroid/graphics/drawable/Drawable;)Z", CA20Status.STATUS_USER_I, "Landroid/graphics/Paint;", "contentPaint", "Landroid/graphics/Paint;", "Lcom/ybsdk/widgets/common/shimmer/ShimmerDrawable;", "shimmerDrawable", "Lcom/ybsdk/widgets/common/shimmer/ShimmerDrawable;", "currentStatus", "Llur0;", "isViewVisible", "Z", "Lvtx;", "startedShimmerType", "Lvtx;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class ShimmerFrameLayout extends FrameLayout {
    private final Paint contentPaint;
    private lur0 currentStatus;
    private final int defStyleAttr;
    private boolean isViewVisible;
    private final ShimmerDrawable shimmerDrawable;
    private vtx startedShimmerType;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.defStyleAttr = i;
        this.contentPaint = new Paint();
        ShimmerDrawable shimmerDrawable = new ShimmerDrawable(context);
        this.shimmerDrawable = shimmerDrawable;
        this.isViewVisible = true;
        setWillNotDraw(false);
        shimmerDrawable.setCallback(this);
        if (attributeSet == null) {
            setShimmer(new ntr0(context, 0.0f, 0, 0L, 0L, false, false, null, null, 4094));
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t3i0.YbSdkShimmerFrameLayout, i, 0);
        setShimmer(fromAttributes(context, obtainStyledAttributes));
        obtainStyledAttributes.recycle();
    }

    private final ntr0 fromAttributes(Context context, TypedArray typedArray) {
        float f = typedArray.getFloat(t3i0.YbSdkShimmerFrameLayout_ybsdk_shimmer_gradient_highlight_alpha, 0.6f);
        boolean z = typedArray.getBoolean(t3i0.YbSdkShimmerFrameLayout_ybsdk_shimmer_hardware_layer, true);
        boolean z2 = typedArray.getBoolean(t3i0.YbSdkShimmerFrameLayout_ybsdk_shimmer_auto_start, true);
        int i = typedArray.getInt(t3i0.YbSdkShimmerFrameLayout_ybsdk_shimmer_duration, 1250);
        int i2 = typedArray.getInt(t3i0.YbSdkShimmerFrameLayout_ybsdk_shimmer_repeat_delay, 75);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(t3i0.YbSdkShimmerFrameLayout_ybsdk_shimmer_fixed_width, 0);
        if (dimensionPixelSize < 0) {
            ny61.r("FixedWidth must be >= 0");
            return null;
        }
        ColorModel e = rje.e(typedArray, t3i0.YbSdkShimmerFrameLayout_ybsdk_shimmer_color_attr, ntr0.n);
        k4o entries = ShimmerArgs$GradientShape.getEntries();
        int i3 = t3i0.YbSdkShimmerFrameLayout_ybsdk_shimmer_gradient_shape;
        ShimmerArgs$GradientShape shimmerArgs$GradientShape = ntr0.o;
        ShimmerArgs$GradientShape shimmerArgs$GradientShape2 = (ShimmerArgs$GradientShape) kotlin.collections.a.S(typedArray.getInt(i3, shimmerArgs$GradientShape.ordinal()), entries);
        return new ntr0(context, f, dimensionPixelSize, i, i2, z2, z, e, shimmerArgs$GradientShape2 == null ? shimmerArgs$GradientShape : shimmerArgs$GradientShape2, 324);
    }

    public static /* synthetic */ void playShimmer$default(ShimmerFrameLayout shimmerFrameLayout, int i, int i2, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: playShimmer");
            return;
        }
        if ((i2 & 1) != 0) {
            i = 1;
        }
        shimmerFrameLayout.playShimmer(i);
    }

    private final void setShimmer(ntr0 shimmerArgs) {
        this.shimmerDrawable.setShimmer(shimmerArgs);
        if (shimmerArgs.f) {
            setLayerType(shimmerArgs.i ? 2 : 0, this.contentPaint);
        } else {
            setLayerType(0, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.shimmerDrawable.draw(canvas);
    }

    public final boolean isShimmerStarted() {
        return this.shimmerDrawable.isShimmerStarted();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.shimmerDrawable.maybeStartShimmer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.shimmerDrawable.stopShimmer();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.shimmerDrawable.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        boolean isShown = isShown();
        if (isShown == this.isViewVisible) {
            return;
        }
        this.isViewVisible = isShown;
        if (!isShown) {
            if (!this.shimmerDrawable.isShimmerStarted()) {
                this.startedShimmerType = null;
            }
            this.shimmerDrawable.stopShimmer();
            return;
        }
        vtx vtxVar = this.startedShimmerType;
        if (vtxVar != null) {
            if (vtxVar instanceof ttx) {
                this.shimmerDrawable.playShimmer(((ttx) vtxVar).a);
            } else if (vtxVar.equals(utx.a)) {
                this.shimmerDrawable.startShimmer();
            } else {
                w511.b();
            }
        }
    }

    public final void playShimmer(int times) {
        this.startedShimmerType = new ttx(times);
        this.shimmerDrawable.playShimmer(times);
    }

    public final void render(lur0 shimmerStatus) {
        if (jl40.l(this.currentStatus, shimmerStatus)) {
            return;
        }
        bwb0 bwb0Var = shimmerStatus.a;
        this.currentStatus = shimmerStatus;
        if (shimmerStatus instanceof jur0) {
            setAlpha(1.0f);
            setVisibility(0);
            int i = 0;
            while (true) {
                if (!(i < getChildCount())) {
                    return;
                }
                int i2 = i + 1;
                View childAt = getChildAt(i);
                if (childAt == null) {
                    ny61.s();
                    return;
                } else {
                    childAt.setVisibility(8);
                    i = i2;
                }
            }
        } else if (shimmerStatus instanceof kur0) {
            setVisibility(0);
            setAlpha(1.0f);
            com.ybsdk.rconfig.b bVar = bwb0Var.a;
            com.ybsdk.rconfig.b bVar2 = bwb0Var.a;
            setTranslationY(kp50.t(-bVar.m().getShimmerSlideAnimationOffset()));
            animate().translationY(0.0f).setDuration(bVar2.m().getShimmerSlideAnimationDurationMs()).start();
            int i3 = 0;
            while (true) {
                if (!(i3 < getChildCount())) {
                    return;
                }
                int i4 = i3 + 1;
                View childAt2 = getChildAt(i3);
                if (childAt2 == null) {
                    ny61.s();
                    return;
                } else {
                    com.ybsdk.core.utils.ext.view.b.c(childAt2, true, bVar2.m().getShowShimmerVisibilityAnimationMs(), 0, 0L, null, 28);
                    i3 = i4;
                }
            }
        } else if (shimmerStatus instanceof iur0) {
            int i5 = 0;
            while (true) {
                if (!(i5 < getChildCount())) {
                    return;
                }
                int i6 = i5 + 1;
                View childAt3 = getChildAt(i5);
                if (childAt3 == null) {
                    ny61.s();
                    return;
                } else {
                    com.ybsdk.core.utils.ext.view.b.c(childAt3, true, bwb0Var.a.m().getShowShimmerVisibilityAnimationMs(), 0, 0L, null, 28);
                    i5 = i6;
                }
            }
        } else {
            if (!(shimmerStatus instanceof hur0)) {
                w511.b();
                return;
            }
            com.ybsdk.rconfig.b bVar3 = bwb0Var.a;
            com.ybsdk.core.utils.ext.view.b.c(this, false, bVar3.m().getContentFadeInAnimationDurationMs(), 0, bVar3.m().getContentFadeInAnimationDelayMs(), null, 20);
            int i7 = 0;
            while (true) {
                if (!(i7 < getChildCount())) {
                    return;
                }
                int i8 = i7 + 1;
                View childAt4 = getChildAt(i7);
                if (childAt4 == null) {
                    ny61.s();
                    return;
                } else {
                    com.ybsdk.core.utils.ext.view.b.c(childAt4, false, bVar3.m().getHideShimmerAnimationDurationMs(), 0, 0L, null, 28);
                    i7 = i8;
                }
            }
        }
    }

    public final void setAutoStart(boolean enabled) {
        this.shimmerDrawable.setAutoStart(enabled);
    }

    public final void setColor(ColorModel color) {
        this.shimmerDrawable.setColor(color);
    }

    public final void startShimmer() {
        this.startedShimmerType = utx.a;
        this.shimmerDrawable.startShimmer();
    }

    public final void stopShimmer() {
        this.startedShimmerType = null;
        this.shimmerDrawable.stopShimmer();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who.equals(this.shimmerDrawable);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ShimmerFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }
}
