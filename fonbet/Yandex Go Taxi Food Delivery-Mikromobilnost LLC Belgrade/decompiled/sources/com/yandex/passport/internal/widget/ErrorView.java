package com.yandex.passport.internal.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.a1;
import com.yandex.passport.R;
import defpackage.sls;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001/B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u001b\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/yandex/passport/internal/widget/ErrorView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onAttachedToWindow", "()V", "", Constants.KEY_MESSAGE, "show", "(Ljava/lang/String;)V", "hide", "Lkotlin/Function0;", "listener", "addOnHideListener", "(Lsls;)V", "setAnimationUpdateListener$passport_release", "setAnimationUpdateListener", "", "durationShow", "J", "Landroid/animation/Animator;", "currentAnimation", "Landroid/animation/Animator;", "anchorId", CA20Status.STATUS_USER_I, "Landroid/view/View;", "anchor", "Landroid/view/View;", "animationUpdateListener", "Lsls;", "textVerticalPadding", "", "hideListener", "Ljava/util/List;", "", "hidden", "Z", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "firstInitializer", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "com/yandex/passport/internal/widget/c", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ErrorView extends AppCompatTextView {
    public static final int $stable = 8;
    private View anchor;
    private int anchorId;
    private sls animationUpdateListener;
    private Animator currentAnimation;
    private final long durationShow;
    private ViewTreeObserver.OnGlobalLayoutListener firstInitializer;
    private boolean hidden;
    private final List<sls> hideListener;
    private final int textVerticalPadding;

    public ErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.durationShow = context.getResources().getInteger(R.integer.passport_animation_duration);
        this.animationUpdateListener = new a1(24);
        this.textVerticalPadding = com.yandex.passport.legacy.d.c(4, context);
        this.hideListener = new ArrayList();
        this.hidden = true;
        this.firstInitializer = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.yandex.passport.internal.widget.ErrorView$firstInitializer$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                View view;
                View view2;
                int i2;
                int i3;
                view = ErrorView.this.anchor;
                if (view != null) {
                    int[] iArr = new int[2];
                    view2 = ErrorView.this.anchor;
                    if (view2 == null) {
                        view2 = null;
                    }
                    view2.getLocationOnScreen(iArr);
                    ErrorView errorView = ErrorView.this;
                    int i4 = iArr[1];
                    i2 = errorView.textVerticalPadding;
                    int i5 = i2 + i4;
                    i3 = ErrorView.this.textVerticalPadding;
                    errorView.setPadding(0, i5, 0, i3);
                    ErrorView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                ErrorView.this.setTranslationY(-r4.getMeasuredHeight());
            }
        };
        setBackgroundColor(context.getColor(R.color.passport_half_black));
        setTextColor(context.getColor(R.color.passport_white));
        setGravity(17);
        TypedArray typedArray = null;
        try {
            typedArray = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.PassportErrorView, i, 0);
            this.anchorId = typedArray.getResourceId(R.styleable.PassportErrorView_passport_anchor, 0);
            typedArray.recycle();
            getViewTreeObserver().addOnGlobalLayoutListener(this.firstInitializer);
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hide$lambda$2(ErrorView errorView, ValueAnimator valueAnimator) {
        errorView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        errorView.animationUpdateListener.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$1(ErrorView errorView, ValueAnimator valueAnimator) {
        errorView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        errorView.animationUpdateListener.invoke();
    }

    public final void addOnHideListener(sls listener) {
        this.hideListener.add(listener);
    }

    public void hide() {
        if (this.hidden) {
            return;
        }
        Animator animator = this.currentAnimation;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getTranslationY(), -getMeasuredHeight());
        ofFloat.setDuration(this.durationShow);
        ofFloat.addUpdateListener(new b(this, 0));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.passport.internal.widget.ErrorView$hide$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                List list;
                ErrorView.this.hidden = true;
                list = ErrorView.this.hideListener;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((sls) it.next()).invoke();
                }
            }
        });
        ofFloat.start();
        this.currentAnimation = ofFloat;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.anchorId > 0) {
            this.anchor = getRootView().findViewById(this.anchorId);
        }
    }

    public final void setAnimationUpdateListener$passport_release(sls listener) {
        this.animationUpdateListener = listener;
    }

    public void show(String message) {
        this.hidden = false;
        setText(message);
        setVisibility(0);
        Animator animator = this.currentAnimation;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(-getMeasuredHeight(), 0.0f);
        ofFloat.setDuration(this.durationShow);
        ofFloat.addUpdateListener(new b(this, 1));
        ofFloat.start();
        this.currentAnimation = ofFloat;
    }

    public ErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ErrorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ErrorView(Context context) {
        this(context, null, 0, 6, null);
    }
}
