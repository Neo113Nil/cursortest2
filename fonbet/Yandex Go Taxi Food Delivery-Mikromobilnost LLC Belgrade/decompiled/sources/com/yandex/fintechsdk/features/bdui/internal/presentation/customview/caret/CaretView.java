package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.du8;
import defpackage.gu8;
import defpackage.yg5;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/caret/CaretView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Lgu8;", "params", "<init>", "(Landroid/content/Context;Lgu8;)V", "Lzy11;", "startBlinkAnimation", "()V", "onDetachedFromWindow", "onAttachedToWindow", "Lyg5;", "expressionResolver", "applyExpressionResolver", "(Lyg5;)V", "Lgu8;", "Landroid/animation/ObjectAnimator;", "animator", "Landroid/animation/ObjectAnimator;", "Companion", "du8", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CaretView extends View {

    @Deprecated
    public static final String ALPHA_PROPERTY = "alpha";
    private static final du8 Companion = new du8();
    private ObjectAnimator animator;
    private final gu8 params;

    public CaretView(Context context, gu8 gu8Var) {
        super(context);
        this.params = gu8Var;
    }

    private final void startBlinkAnimation() {
        gu8 gu8Var = this.params;
        if (gu8Var == null) {
            return;
        }
        long j = (long) (gu8Var.b * 1000.0d);
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ALPHA_PROPERTY, gu8Var.d, gu8Var.c);
        ofFloat.setDuration(j);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.start();
        this.animator = ofFloat;
    }

    public final void applyExpressionResolver(yg5 expressionResolver) {
        Integer resolveColor;
        gu8 gu8Var = this.params;
        if (gu8Var == null || expressionResolver == null || (resolveColor = expressionResolver.resolveColor(gu8Var.a)) == null) {
            return;
        }
        setBackgroundColor(resolveColor.intValue());
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startBlinkAnimation();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }
}
