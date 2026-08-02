package com.yandex.go.superapp.print_animation_text;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import defpackage.a3f0;
import defpackage.agc0;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.scc;
import defpackage.sls;
import defpackage.tcc;
import defpackage.uqs;
import defpackage.v2f0;
import defpackage.w2f0;
import defpackage.w511;
import defpackage.x2f0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y2f0;
import defpackage.yo90;
import defpackage.yso;
import defpackage.z2f0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010\u0018J%\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\"H\u0002¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\"H\u0002¢\u0006\u0004\b&\u0010%J5\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010!\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\"H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020*H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u0010.\u001a\u00020\f2\u0006\u00100\u001a\u00020'H\u0002¢\u0006\u0004\b.\u00101J\u0017\u00102\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b2\u0010\u0018J\u0017\u00103\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b3\u0010\u0018J\u000f\u00104\u001a\u00020\fH\u0002¢\u0006\u0004\b4\u0010\u0010J+\u00109\u001a\u00020\u00062\f\u00107\u001a\b\u0012\u0004\u0012\u000206052\f\u00108\u001a\b\u0012\u0004\u0012\u00020605H\u0002¢\u0006\u0004\b9\u0010:J!\u0010;\u001a\u00020\f*\u00020*2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\"H\u0002¢\u0006\u0004\b;\u0010<J\u001b\u0010?\u001a\u00020>*\u00020\u00162\u0006\u0010=\u001a\u000206H\u0002¢\u0006\u0004\b?\u0010@R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0016\u0010J\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lcom/yandex/go/superapp/print_animation_text/PrintAnimationTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lz2f0;", "uiState", "Lzy11;", "render", "(Lz2f0;)V", "pauseAnimation", "()V", "resumeAnimation", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lx2f0;", "startAnimation", "(Lx2f0;)V", "planAnimationIteration", "Ljava/lang/Runnable;", "action", "", "delay", "planAction", "(Ljava/lang/Runnable;J)V", "animateToNextKeyframe", "duration", "Lkotlin/Function0;", "onEnd", "animateHide", "(JLsls;)V", "animateShow", "", "startValue", "endValue", "Landroid/animation/ValueAnimator;", "animateExpanding", "(FFJLsls;)Landroid/animation/ValueAnimator;", "animator", "animateClipBounds", "(Landroid/animation/ValueAnimator;)V", "expandProgress", "(F)V", "updateTextToNextKeyframe", "updateAnimatedText", "resetAnimation", "", "", "currentItems", "nextItems", "findCommonPrefix", "(Ljava/util/List;Ljava/util/List;)I", "addOnEndListener", "(Landroid/animation/ValueAnimator;Lsls;)V", "id", "", "itemText", "(Lx2f0;Ljava/lang/String;)Ljava/lang/CharSequence;", "Lz2f0;", "Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;", "interpolator", "Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;", "lastPlannedCallback", "Ljava/lang/Runnable;", "hideAnimator", "Landroid/animation/ValueAnimator;", "showAnimator", "currentKeyframeIndex", CA20Status.STATUS_USER_I, "fullTextWidth", "F", "intactTextWidth", "repeatCount", "Ljava/lang/Integer;", "", "isAnimationPaused", "Z", "print_animation_text"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PrintAnimationTextView extends RobotoTextView {
    private int currentKeyframeIndex;
    private float fullTextWidth;
    private ValueAnimator hideAnimator;
    private float intactTextWidth;
    private final FastOutSlowInInterpolator interpolator;
    private boolean isAnimationPaused;
    private Runnable lastPlannedCallback;
    private Integer repeatCount;
    private ValueAnimator showAnimator;
    private z2f0 uiState;

    public PrintAnimationTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.uiState = new y2f0(getText());
        this.interpolator = new FastOutSlowInInterpolator();
    }

    private final void addOnEndListener(ValueAnimator valueAnimator, final sls slsVar) {
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.superapp.print_animation_text.PrintAnimationTextView$addOnEndListener$1
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
        ofFloat.addUpdateListener(new yso(19, this));
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
        this.hideAnimator = animateExpanding(1.0f, 0.0f, duration, new a3f0(this, onEnd, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateHide$lambda$0(PrintAnimationTextView printAnimationTextView, sls slsVar) {
        printAnimationTextView.hideAnimator = null;
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
        this.showAnimator = animateExpanding(0.0f, 1.0f, duration, new a3f0(this, onEnd, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateShow$lambda$0(PrintAnimationTextView printAnimationTextView, sls slsVar) {
        printAnimationTextView.showAnimator = null;
        slsVar.invoke();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateToNextKeyframe(x2f0 uiState) {
        int i = this.currentKeyframeIndex;
        int size = (i + 1) % uiState.b.size();
        List list = uiState.b;
        w2f0 w2f0Var = (w2f0) a.S(i, list);
        List<String> list2 = w2f0Var != null ? w2f0Var.a : null;
        List<String> list3 = EmptyList.a;
        if (list2 == null) {
            list2 = list3;
        }
        w2f0 w2f0Var2 = (w2f0) a.S(size, list);
        List<String> list4 = w2f0Var2 != null ? w2f0Var2.a : null;
        if (list4 != null) {
            list3 = list4;
        }
        Iterator it = a.A0(list2, findCommonPrefix(list2, list3)).iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            CharSequence itemText = itemText(uiState, (String) it.next());
            f += getPaint().measureText(itemText, 0, itemText.length());
        }
        this.intactTextWidth = f;
        animateHide(uiState.e, new agc0(11, this, uiState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateToNextKeyframe$lambda$1(final PrintAnimationTextView printAnimationTextView, final x2f0 x2f0Var) {
        printAnimationTextView.updateTextToNextKeyframe(x2f0Var);
        printAnimationTextView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.superapp.print_animation_text.PrintAnimationTextView$animateToNextKeyframe$lambda$1$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                PrintAnimationTextView.this.animateClipBounds(0.0f);
                PrintAnimationTextView printAnimationTextView2 = PrintAnimationTextView.this;
                x2f0 x2f0Var2 = x2f0Var;
                printAnimationTextView2.planAction(new uqs(11, printAnimationTextView2, x2f0Var2), x2f0Var2.f);
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

    private final CharSequence itemText(x2f0 x2f0Var, String str) {
        v2f0 v2f0Var = (v2f0) x2f0Var.a.get(str);
        return v2f0Var != null ? v2f0Var.a : "";
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
    public final void planAnimationIteration(x2f0 uiState) {
        Integer num = this.repeatCount;
        if (this.currentKeyframeIndex == scc.f(uiState.b) && num != null) {
            num = Integer.valueOf(num.intValue() - 1);
            this.repeatCount = num;
        }
        if (num == null || num.intValue() > 0) {
            planAction(new yo90(18, this, uiState), uiState.d);
        }
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

    private final void startAnimation(x2f0 uiState) {
        this.currentKeyframeIndex = 0;
        this.repeatCount = uiState.h;
        updateAnimatedText(uiState);
        if (this.isAnimationPaused) {
            return;
        }
        planAnimationIteration(uiState);
    }

    private final void updateAnimatedText(x2f0 uiState) {
        w2f0 w2f0Var = (w2f0) a.S(this.currentKeyframeIndex, uiState.b);
        List list = w2f0Var != null ? w2f0Var.a : null;
        if (list == null) {
            list = EmptyList.a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(itemText(uiState, (String) it.next()));
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        CharSequence concat = TextUtils.concat((CharSequence[]) Arrays.copyOf(charSequenceArr, charSequenceArr.length));
        setText(concat);
        this.fullTextWidth = getPaint().measureText(concat, 0, concat.length());
    }

    private final void updateTextToNextKeyframe(x2f0 uiState) {
        this.currentKeyframeIndex = (this.currentKeyframeIndex + 1) % uiState.b.size();
        updateAnimatedText(uiState);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Rect clipBounds = getClipBounds();
        if (clipBounds != null) {
            boolean n = xw31.n(getContext());
            int i = clipBounds.left;
            canvas.translate(n ? -i : i, 0.0f);
        }
        super.onDraw(canvas);
    }

    public final void pauseAnimation() {
        this.isAnimationPaused = true;
        z2f0 z2f0Var = this.uiState;
        x2f0 x2f0Var = z2f0Var instanceof x2f0 ? (x2f0) z2f0Var : null;
        if (x2f0Var == null) {
            return;
        }
        resetAnimation();
        if (this.hideAnimator != null) {
            updateTextToNextKeyframe(x2f0Var);
        }
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.superapp.print_animation_text.PrintAnimationTextView$pauseAnimation$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                PrintAnimationTextView.this.setClipBounds(null);
            }
        });
    }

    public final void render(z2f0 uiState) {
        if (jl40.l(this.uiState, uiState)) {
            return;
        }
        this.uiState = uiState;
        resetAnimation();
        if (uiState instanceof y2f0) {
            setText(((y2f0) uiState).a);
        } else if (uiState instanceof x2f0) {
            startAnimation((x2f0) uiState);
        } else {
            w511.b();
        }
    }

    public final void resumeAnimation() {
        this.isAnimationPaused = false;
        z2f0 z2f0Var = this.uiState;
        x2f0 x2f0Var = z2f0Var instanceof x2f0 ? (x2f0) z2f0Var : null;
        if (x2f0Var == null) {
            return;
        }
        updateAnimatedText(x2f0Var);
        planAnimationIteration(x2f0Var);
    }

    public PrintAnimationTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PrintAnimationTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PrintAnimationTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.robotoTextViewStyle : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateClipBounds(ValueAnimator animator) {
        Object animatedValue = animator.getAnimatedValue();
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        animateClipBounds(f != null ? f.floatValue() : 1.0f);
    }
}
