package com.yandex.messaging.internal.view.timeline;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.widget.TextView;

/* loaded from: classes15.dex */
public final class a0 {
    public final TextView a;
    public QuoteHighlightOverlay$HighlightDrawable b;

    public a0(TextView textView) {
        this.a = textView;
    }

    public static void b(final a0 a0Var, int i, int i2, int i3) {
        TextView textView = a0Var.a;
        Layout layout = textView.getLayout();
        if (layout == null) {
            return;
        }
        a0Var.a();
        Path path = new Path();
        layout.getSelectionPath(i, i2, path);
        path.offset(textView.getTotalPaddingLeft() - textView.getScrollX(), textView.getTotalPaddingTop() - textView.getScrollY());
        final QuoteHighlightOverlay$HighlightDrawable quoteHighlightOverlay$HighlightDrawable = new QuoteHighlightOverlay$HighlightDrawable(path, i3, 80);
        quoteHighlightOverlay$HighlightDrawable.setBounds(0, 0, textView.getWidth(), textView.getHeight());
        a0Var.b = quoteHighlightOverlay$HighlightDrawable;
        textView.getOverlay().add(quoteHighlightOverlay$HighlightDrawable);
        textView.invalidate();
        ValueAnimator ofInt = ValueAnimator.ofInt(80, 0);
        ofInt.setDuration(3000L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.messaging.internal.view.timeline.z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                QuoteHighlightOverlay$HighlightDrawable.this.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.messaging.internal.view.timeline.QuoteHighlightOverlay$highlight$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                a0 a0Var2 = a0.this;
                QuoteHighlightOverlay$HighlightDrawable quoteHighlightOverlay$HighlightDrawable2 = quoteHighlightOverlay$HighlightDrawable;
                TextView textView2 = a0Var2.a;
                textView2.getOverlay().remove(quoteHighlightOverlay$HighlightDrawable2);
                if (a0Var2.b == quoteHighlightOverlay$HighlightDrawable2) {
                    a0Var2.b = null;
                }
                textView2.invalidate();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                a0 a0Var2 = a0.this;
                QuoteHighlightOverlay$HighlightDrawable quoteHighlightOverlay$HighlightDrawable2 = quoteHighlightOverlay$HighlightDrawable;
                TextView textView2 = a0Var2.a;
                textView2.getOverlay().remove(quoteHighlightOverlay$HighlightDrawable2);
                if (a0Var2.b == quoteHighlightOverlay$HighlightDrawable2) {
                    a0Var2.b = null;
                }
                textView2.invalidate();
            }
        });
        ofInt.start();
    }

    public final void a() {
        QuoteHighlightOverlay$HighlightDrawable quoteHighlightOverlay$HighlightDrawable = this.b;
        TextView textView = this.a;
        if (quoteHighlightOverlay$HighlightDrawable != null) {
            textView.getOverlay().remove(quoteHighlightOverlay$HighlightDrawable);
        }
        this.b = null;
        textView.invalidate();
    }
}
