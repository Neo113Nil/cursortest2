package com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import defpackage.a5w0;
import defpackage.b5w0;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.sls;
import defpackage.vtj;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yi;
import defpackage.z4w0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010\u001bJ%\u0010'\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u001f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0%H\u0002¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u001f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0%H\u0002¢\u0006\u0004\b)\u0010(J5\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010$\u001a\u00020\u001f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0%H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020-H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00101\u001a\u00020\f2\u0006\u00103\u001a\u00020*H\u0002¢\u0006\u0004\b1\u00104J\u0017\u00105\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b5\u0010\u001bJ\u0017\u00106\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b6\u0010\u001bJ\u000f\u00107\u001a\u00020\fH\u0002¢\u0006\u0004\b7\u0010\u0011J+\u0010<\u001a\u00020\u00062\f\u0010:\u001a\b\u0012\u0004\u0012\u000209082\f\u0010;\u001a\b\u0012\u0004\u0012\u00020908H\u0002¢\u0006\u0004\b<\u0010=J!\u0010>\u001a\u00020\f*\u00020-2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0%H\u0002¢\u0006\u0004\b>\u0010?J\u001b\u0010B\u001a\u00020A*\u00020\u00192\u0006\u0010@\u001a\u000209H\u0002¢\u0006\u0004\bB\u0010CR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006W"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/main/searchbar/views/DiscoveryMapSearchbarAnimatedTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lb5w0;", "uiState", "Lzy11;", "render$impl", "(Lb5w0;)V", "render", "pauseAnimation$impl", "()V", "pauseAnimation", "resumeAnimation$impl", "resumeAnimation", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lz4w0;", "startAnimation", "(Lz4w0;)V", "planAnimationIteration", "Ljava/lang/Runnable;", "action", "", "delay", "planAction", "(Ljava/lang/Runnable;J)V", "animateToNextKeyframe", "duration", "Lkotlin/Function0;", "onEnd", "animateHide", "(JLsls;)V", "animateShow", "", "startValue", "endValue", "Landroid/animation/ValueAnimator;", "animateExpanding", "(FFJLsls;)Landroid/animation/ValueAnimator;", "animator", "animateClipBounds", "(Landroid/animation/ValueAnimator;)V", "expandProgress", "(F)V", "updateTextToNextKeyframe", "updateAnimatedText", "resetAnimation", "", "", "currentItems", "nextItems", "findCommonPrefix", "(Ljava/util/List;Ljava/util/List;)I", "addOnEndListener", "(Landroid/animation/ValueAnimator;Lsls;)V", "id", "", "itemText", "(Lz4w0;Ljava/lang/String;)Ljava/lang/CharSequence;", "Lb5w0;", "Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;", "interpolator", "Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;", "lastPlannedCallback", "Ljava/lang/Runnable;", "hideAnimator", "Landroid/animation/ValueAnimator;", "showAnimator", "currentKeyframeIndex", CA20Status.STATUS_USER_I, "fullTextWidth", "F", "intactTextWidth", "repeatCount", "Ljava/lang/Integer;", "", "isAnimationPaused", "Z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DiscoveryMapSearchbarAnimatedTextView extends RobotoTextView {
    private int currentKeyframeIndex;
    private float fullTextWidth;
    private ValueAnimator hideAnimator;
    private float intactTextWidth;
    private final FastOutSlowInInterpolator interpolator;
    private boolean isAnimationPaused;
    private Runnable lastPlannedCallback;
    private Integer repeatCount;
    private ValueAnimator showAnimator;
    private b5w0 uiState;

    public DiscoveryMapSearchbarAnimatedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.uiState = new a5w0(getText());
        this.interpolator = new FastOutSlowInInterpolator();
    }

    private final void addOnEndListener(ValueAnimator valueAnimator, final sls slsVar) {
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.DiscoveryMapSearchbarAnimatedTextView$addOnEndListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                sls.this.invoke();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateClipBounds(float expandProgress) {
        int width = getWidth() / 2;
        float f = this.intactTextWidth;
        float f2 = width;
        float b = g8e.b(this.fullTextWidth, f, expandProgress, f) / 2.0f;
        setClipBounds(new Rect((int) (f2 - b), 0, (int) (f2 + b), getHeight()));
        invalidate();
    }

    private final ValueAnimator animateExpanding(float startValue, float endValue, long duration, sls onEnd) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(startValue, endValue);
        ofFloat.setDuration(duration);
        ofFloat.setInterpolator(this.interpolator);
        ofFloat.addUpdateListener(new yi(21, this));
        addOnEndListener(ofFloat, onEnd);
        ofFloat.start();
        return ofFloat;
    }

    private final void animateHide(long duration, sls onEnd) {
        ValueAnimator valueAnimator = this.showAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.showAnimator = null;
        ValueAnimator valueAnimator2 = this.hideAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.hideAnimator = animateExpanding(1.0f, 0.0f, duration, new vtj(this, onEnd, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateHide$lambda$0(DiscoveryMapSearchbarAnimatedTextView discoveryMapSearchbarAnimatedTextView, sls slsVar) {
        discoveryMapSearchbarAnimatedTextView.hideAnimator = null;
        slsVar.invoke();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateShow(long duration, sls onEnd) {
        ValueAnimator valueAnimator = this.hideAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.hideAnimator = null;
        ValueAnimator valueAnimator2 = this.showAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.showAnimator = animateExpanding(0.0f, 1.0f, duration, new vtj(this, onEnd, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateShow$lambda$0(DiscoveryMapSearchbarAnimatedTextView discoveryMapSearchbarAnimatedTextView, sls slsVar) {
        discoveryMapSearchbarAnimatedTextView.showAnimator = null;
        slsVar.invoke();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateToNextKeyframe(z4w0 uiState) {
        throw null;
    }

    private static final zy11 animateToNextKeyframe$lambda$1(final DiscoveryMapSearchbarAnimatedTextView discoveryMapSearchbarAnimatedTextView, final z4w0 z4w0Var) {
        discoveryMapSearchbarAnimatedTextView.updateTextToNextKeyframe(z4w0Var);
        discoveryMapSearchbarAnimatedTextView.addOnLayoutChangeListener(new View.OnLayoutChangeListener(z4w0Var) { // from class: com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.DiscoveryMapSearchbarAnimatedTextView$animateToNextKeyframe$lambda$1$$inlined$doOnNextLayout$1
            final /* synthetic */ z4w0 $uiState$inlined;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                DiscoveryMapSearchbarAnimatedTextView.this.animateClipBounds(0.0f);
                throw null;
            }
        });
        return zy11.a;
    }

    private final int findCommonPrefix(List<String> currentItems, List<String> nextItems) {
        int min = Math.min(currentItems.size(), nextItems.size());
        for (int i = 0; i < min; i++) {
            if (!jl40.l(currentItems.get(i), nextItems.get(i))) {
                return i;
            }
        }
        return min;
    }

    private final CharSequence itemText(z4w0 z4w0Var, String str) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void planAction(Runnable action, long delay) {
        Runnable runnable = this.lastPlannedCallback;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.lastPlannedCallback = action;
        postDelayed(action, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void planAnimationIteration(z4w0 uiState) {
        throw null;
    }

    private final void resetAnimation() {
        removeCallbacks(this.lastPlannedCallback);
        ValueAnimator valueAnimator = this.hideAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.showAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    private final void startAnimation(z4w0 uiState) {
        this.currentKeyframeIndex = 0;
        throw null;
    }

    private final void updateAnimatedText(z4w0 uiState) {
        throw null;
    }

    private final void updateTextToNextKeyframe(z4w0 uiState) {
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Rect clipBounds = getClipBounds();
        if (clipBounds != null) {
            boolean n = xw31.n(getContext());
            float f = clipBounds.left;
            if (n) {
                f = -f;
            }
            canvas.translate(f, 0.0f);
        }
        super.onDraw(canvas);
    }

    public final void pauseAnimation$impl() {
        this.isAnimationPaused = true;
    }

    public final void render$impl(b5w0 uiState) {
        if (jl40.l(this.uiState, uiState)) {
            return;
        }
        this.uiState = uiState;
        resetAnimation();
        if (uiState instanceof a5w0) {
            setText(((a5w0) uiState).a);
        } else {
            w511.b();
        }
    }

    public final void resumeAnimation$impl() {
        this.isAnimationPaused = false;
    }

    public DiscoveryMapSearchbarAnimatedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DiscoveryMapSearchbarAnimatedTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DiscoveryMapSearchbarAnimatedTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.robotoTextViewStyle : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateClipBounds(ValueAnimator animator) {
        Object animatedValue = animator.getAnimatedValue();
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        animateClipBounds(f != null ? f.floatValue() : 1.0f);
    }
}
