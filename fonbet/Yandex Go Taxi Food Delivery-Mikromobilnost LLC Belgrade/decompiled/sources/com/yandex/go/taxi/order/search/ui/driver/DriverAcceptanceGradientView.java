package com.yandex.go.taxi.order.search.ui.driver;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yandex.go.taxi.order.search.ui.driver.DriverAcceptanceGradientView;
import defpackage.bxl;
import defpackage.j73;
import defpackage.jl40;
import defpackage.mqg0;
import defpackage.sls;
import defpackage.uhm;
import defpackage.vhm;
import defpackage.whm;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001AB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u001f\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010 \u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0016H\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0001¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0006¢\u0006\u0004\b)\u0010\bJ\u000f\u0010*\u001a\u00020\u0006H\u0014¢\u0006\u0004\b*\u0010\bR\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\"\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/yandex/go/taxi/order/search/ui/driver/DriverAcceptanceGradientView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "detachFromView", "()V", "updateGradient", "addLayoutUpdateListener", "", "isVisibleOnScreen", "()Z", "Landroid/animation/AnimatorSet;", "createAnimator", "()Landroid/animation/AnimatorSet;", "runAnimationIfItNeed", "Lkotlin/Pair;", "", "getLocation", "(Landroid/view/View;)Lkotlin/Pair;", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "view", "attachToView", "(Landroid/view/View;)V", "playAnimation", "onDetachedFromWindow", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Ljava/lang/ref/WeakReference;", "anchorRef", "Ljava/lang/ref/WeakReference;", "lastAnchorLocation", "Lkotlin/Pair;", "gradientRadius", "F", "drawingPart", "animator", "Landroid/animation/AnimatorSet;", "needToPlayAnimation", "Z", "Lkotlin/Function0;", "updateListener", "Lsls;", "getAnchor", "()Landroid/view/View;", "anchor", "Companion", "whm", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DriverAcceptanceGradientView extends View {
    public static final int $stable = 8;

    @Deprecated
    public static final float ANCHOR_SCALE = 2.2f;

    @Deprecated
    public static final long ANIMATION_DURATION = 500;
    private static final whm Companion = new whm();

    @Deprecated
    public static final float START_DRAWING_PART = 0.5f;
    private WeakReference<View> anchorRef;
    private AnimatorSet animator;
    private float drawingPart;
    private float gradientRadius;
    private Pair<Float, Float> lastAnchorLocation;
    private boolean needToPlayAnimation;
    private final Paint paint;
    private sls updateListener;

    public DriverAcceptanceGradientView(Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
        this.anchorRef = new WeakReference<>(null);
        Float valueOf = Float.valueOf(0.0f);
        this.lastAnchorLocation = new Pair<>(valueOf, valueOf);
        this.drawingPart = 0.5f;
        this.animator = createAnimator();
    }

    private final void addLayoutUpdateListener() {
        this.updateListener = new bxl(8, this);
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        sls slsVar = this.updateListener;
        viewTreeObserver.addOnGlobalLayoutListener(slsVar != null ? new vhm(0, slsVar) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 addLayoutUpdateListener$lambda$0(DriverAcceptanceGradientView driverAcceptanceGradientView) {
        View anchor = driverAcceptanceGradientView.getAnchor();
        Pair<Float, Float> location = anchor != null ? driverAcceptanceGradientView.getLocation(anchor) : null;
        if (location != null && !jl40.l(driverAcceptanceGradientView.lastAnchorLocation, location)) {
            driverAcceptanceGradientView.lastAnchorLocation = location;
            driverAcceptanceGradientView.requestLayout();
        }
        driverAcceptanceGradientView.runAnimationIfItNeed();
        return zy11.a;
    }

    private final AnimatorSet createAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        final int i = 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: thm
            public final /* synthetic */ DriverAcceptanceGradientView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                DriverAcceptanceGradientView driverAcceptanceGradientView = this.b;
                switch (i2) {
                    case 0:
                        DriverAcceptanceGradientView.createAnimator$lambda$0$0(driverAcceptanceGradientView, valueAnimator);
                        break;
                    default:
                        DriverAcceptanceGradientView.createAnimator$lambda$1$0(driverAcceptanceGradientView, valueAnimator);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 0.0f);
        final int i2 = 1;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: thm
            public final /* synthetic */ DriverAcceptanceGradientView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i2;
                DriverAcceptanceGradientView driverAcceptanceGradientView = this.b;
                switch (i22) {
                    case 0:
                        DriverAcceptanceGradientView.createAnimator$lambda$0$0(driverAcceptanceGradientView, valueAnimator);
                        break;
                    default:
                        DriverAcceptanceGradientView.createAnimator$lambda$1$0(driverAcceptanceGradientView, valueAnimator);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new AnimUtils$AnimationEndListener(new uhm(i, this)));
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAnimator$lambda$0$0(DriverAcceptanceGradientView driverAcceptanceGradientView, ValueAnimator valueAnimator) {
        driverAcceptanceGradientView.drawingPart = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        driverAcceptanceGradientView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAnimator$lambda$1$0(DriverAcceptanceGradientView driverAcceptanceGradientView, ValueAnimator valueAnimator) {
        driverAcceptanceGradientView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachFromView() {
        this.anchorRef = new WeakReference<>(null);
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        sls slsVar = this.updateListener;
        viewTreeObserver.removeOnGlobalLayoutListener(slsVar != null ? new vhm(1, slsVar) : null);
    }

    private final View getAnchor() {
        return this.anchorRef.get();
    }

    private final Pair<Float, Float> getLocation(View view) {
        view.getLocationOnScreen(new int[2]);
        return new Pair<>(Float.valueOf(j73.B(r1)), Float.valueOf(j73.N(r1)));
    }

    private final boolean isVisibleOnScreen() {
        return (getMeasuredWidth() == 0 || getMeasuredHeight() == 0) ? false : true;
    }

    private final void runAnimationIfItNeed() {
        if (this.needToPlayAnimation && isVisibleOnScreen()) {
            this.needToPlayAnimation = false;
            this.animator.start();
        }
    }

    private final void updateGradient() {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        if (this.gradientRadius == measuredWidth || measuredWidth == 0.0f) {
            return;
        }
        int color = getContext().getColor(mqg0.component_green_high);
        this.gradientRadius = measuredWidth;
        this.paint.setShader(new RadialGradient(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.gradientRadius, new int[]{color, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void attachToView(View view) {
        if (view.getParent() == null) {
            return;
        }
        detachFromView();
        this.anchorRef = new WeakReference<>(view);
        setZ(view.getZ() - 5.0f);
        addLayoutUpdateListener();
        invalidate();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        detachFromView();
        this.animator.cancel();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.gradientRadius * this.drawingPart, this.paint);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View anchor = getAnchor();
        if (anchor == null) {
            return;
        }
        Pair<Float, Float> location = getLocation(this);
        float floatValue = ((Number) location.getFirst()).floatValue();
        float floatValue2 = ((Number) location.getSecond()).floatValue();
        Pair<Float, Float> location2 = getLocation(anchor);
        float floatValue3 = ((Number) location2.getFirst()).floatValue();
        float floatValue4 = ((Number) location2.getSecond()).floatValue();
        float f = floatValue3 - floatValue;
        float width = (getWidth() - anchor.getMeasuredWidth()) / 2;
        setX((f - width) + getX());
        setY(((floatValue4 - floatValue2) - width) + getY());
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        View anchor = getAnchor();
        setMeasuredDimension((int) ((anchor != null ? anchor.getMeasuredWidth() : 0) * 2.2f), (int) ((getAnchor() != null ? r0.getHeight() : 0) * 2.2f));
        updateGradient();
    }

    public final void playAnimation() {
        this.animator.cancel();
        this.animator.setCurrentPlayTime(0L);
        this.needToPlayAnimation = true;
        runAnimationIfItNeed();
    }
}
