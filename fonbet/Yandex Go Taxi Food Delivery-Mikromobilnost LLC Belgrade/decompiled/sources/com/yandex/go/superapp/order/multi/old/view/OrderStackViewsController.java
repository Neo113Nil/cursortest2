package com.yandex.go.superapp.order.multi.old.view;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.stack.OrderStackMvpView;
import defpackage.c780;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.k4o;
import defpackage.kz;
import defpackage.vz;
import defpackage.w511;
import defpackage.xw31;
import kotlin.Metadata;

/* loaded from: classes14.dex */
public final class OrderStackViewsController {
    public TranslateAnimation a;
    public TranslateAnimation b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/superapp/order/multi/old/view/OrderStackViewsController$TranslationDirection;", "", "TO_LEFT", "TO_RIGHT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class TranslationDirection {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TranslationDirection[] $VALUES;
        public static final TranslationDirection TO_LEFT;
        public static final TranslationDirection TO_RIGHT;

        static {
            TranslationDirection translationDirection = new TranslationDirection("TO_LEFT", 0);
            TO_LEFT = translationDirection;
            TranslationDirection translationDirection2 = new TranslationDirection("TO_RIGHT", 1);
            TO_RIGHT = translationDirection2;
            TranslationDirection[] translationDirectionArr = {translationDirection, translationDirection2};
            $VALUES = translationDirectionArr;
            $ENTRIES = kotlin.enums.a.a(translationDirectionArr);
        }

        public static TranslationDirection valueOf(String str) {
            return (TranslationDirection) Enum.valueOf(TranslationDirection.class, str);
        }

        public static TranslationDirection[] values() {
            return (TranslationDirection[]) $VALUES.clone();
        }
    }

    public final void a(View view, View view2, OrderStackMvpView.AnimationType animationType, TranslationDirection translationDirection, Runnable runnable) {
        if (view.isAttachedToWindow() && xw31.j(view) && view2.isAttachedToWindow() && xw31.j(view2)) {
            b(view2, animationType, translationDirection);
            c(view, animationType, runnable, translationDirection);
        } else {
            OneShotPreDrawListener.add(view2, new kz(this, view2, animationType, translationDirection, 5));
            OneShotPreDrawListener.add(view, new vz(this, view, animationType, runnable, translationDirection, 4));
        }
    }

    public final void b(final View view, OrderStackMvpView.AnimationType animationType, TranslationDirection translationDirection) {
        TranslateAnimation translateAnimation = this.a;
        if (translateAnimation != null) {
            translateAnimation.cancel();
        }
        this.a = null;
        int i = c780.a[animationType.ordinal()];
        if (i == 1) {
            if (translationDirection == null) {
                translationDirection = TranslationDirection.TO_RIGHT;
            }
            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, translationDirection == TranslationDirection.TO_LEFT ? -view.getWidth() : view.getWidth(), 0.0f, 0.0f);
            translateAnimation2.setDuration(500L);
            translateAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.yandex.go.superapp.order.multi.old.view.OrderStackViewsController$hideViewByTranslationAnimation$1$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    view.setVisibility(4);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            this.a = translateAnimation2;
            view.startAnimation(translateAnimation2);
            return;
        }
        if (i == 2) {
            cma1.b(0.0f, view).setDuration(200L).withEndAction(new ce0(this, view));
            return;
        }
        if (i != 3) {
            w511.b();
        } else if (view instanceof OrderViewContainer) {
            ((OrderViewContainer) view).setVisibility(4);
        } else {
            view.setVisibility(8);
        }
    }

    public final void c(final View view, OrderStackMvpView.AnimationType animationType, final Runnable runnable, TranslationDirection translationDirection) {
        TranslateAnimation translateAnimation = this.b;
        if (translateAnimation != null) {
            translateAnimation.cancel();
        }
        this.b = null;
        int i = c780.a[animationType.ordinal()];
        if (i == 1) {
            if (translationDirection == null) {
                translationDirection = TranslationDirection.TO_RIGHT;
            }
            view.setVisibility(4);
            view.setAlpha(1.0f);
            TranslateAnimation translateAnimation2 = new TranslateAnimation(translationDirection == TranslationDirection.TO_LEFT ? view.getWidth() : -view.getWidth(), 0.0f, 0.0f, 0.0f);
            translateAnimation2.setDuration(500L);
            translateAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.yandex.go.superapp.order.multi.old.view.OrderStackViewsController$showViewByTranslationAnimation$1$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    view.setVisibility(0);
                    runnable.run();
                }
            });
            this.b = translateAnimation2;
            view.startAnimation(translateAnimation2);
            return;
        }
        if (i == 2) {
            view.setX(0.0f);
            view.setAlpha(0.0f);
            view.setVisibility(0);
            cma1.b(1.0f, view).setDuration(200L).withEndAction(runnable);
            return;
        }
        if (i != 3) {
            w511.b();
            return;
        }
        view.setX(0.0f);
        view.setAlpha(1.0f);
        view.setVisibility(0);
        runnable.run();
    }
}
