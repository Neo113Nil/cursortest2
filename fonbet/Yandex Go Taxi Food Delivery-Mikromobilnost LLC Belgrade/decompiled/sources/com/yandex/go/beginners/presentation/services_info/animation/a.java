package com.yandex.go.beginners.presentation.services_info.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import com.yandex.go.beginners.presentation.services_info.views.CommonServicesContainer;
import com.yandex.go.beginners.presentation.services_info.views.ServiceMainInfoItemView;
import com.yandex.go.beginners.presentation.services_info.views.ServicesDescriptionsContainer;
import com.yandex.go.beginners.presentation.services_info.views.ServicesMainInfoContainer;
import defpackage.hvq0;
import defpackage.j73;
import defpackage.kn1;
import defpackage.lwq0;
import defpackage.mxp0;
import defpackage.qje;
import defpackage.tcc;
import defpackage.vf2;
import defpackage.w511;
import defpackage.w6s0;
import defpackage.xng0;
import defpackage.zvq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.badge.DiscountBadgeView;

/* loaded from: classes12.dex */
public final class a {
    public final CommonServicesContainer a;
    public final ButtonComponent b;
    public final DiscountBadgeView c;
    public final kn1 d;
    public final zvq0 e;
    public final hvq0 f;
    public final w6s0 g;
    public boolean h;
    public Animator i;

    public a(CommonServicesContainer commonServicesContainer, ButtonComponent buttonComponent, DiscountBadgeView discountBadgeView, kn1 kn1Var, zvq0 zvq0Var, hvq0 hvq0Var, w6s0 w6s0Var) {
        this.a = commonServicesContainer;
        this.b = buttonComponent;
        this.c = discountBadgeView;
        this.d = kn1Var;
        this.e = zvq0Var;
        this.f = hvq0Var;
        this.g = w6s0Var;
        this.h = !commonServicesContainer.getHasServices();
    }

    public static final void a(final a aVar) {
        ValueAnimator valueAnimator;
        AnimatorSet animatorSet;
        TextView serviceName;
        ServiceMainInfoItemView mainService = aVar.c().getMainService();
        if (mainService == null) {
            return;
        }
        kn1 kn1Var = aVar.d;
        List<ServiceMainInfoItemView> othersServices = aVar.c().getOthersServices();
        CommonServicesAnimationManager$Durations commonServicesAnimationManager$Durations = CommonServicesAnimationManager$Durations.InitialDelay;
        long time = commonServicesAnimationManager$Durations.getTime();
        CommonServicesAnimationManager$Durations commonServicesAnimationManager$Durations2 = CommonServicesAnimationManager$Durations.MoveToNextService;
        long time2 = commonServicesAnimationManager$Durations2.getTime();
        AnimatorSet s = kn1Var.s(mainService, time2);
        lwq0 lwq0Var = (lwq0) kotlin.collections.a.R(othersServices);
        ValueAnimator valueAnimator2 = null;
        if (lwq0Var == null || (serviceName = lwq0Var.getServiceName()) == null) {
            valueAnimator = null;
        } else {
            valueAnimator = ValueAnimator.ofObject((ArgbEvaluator) kn1Var.w, Integer.valueOf(serviceName.getCurrentTextColor()), Integer.valueOf(kn1Var.c));
            valueAnimator.setDuration(time2);
            valueAnimator.addUpdateListener(new mxp0(5, othersServices));
        }
        List A = j73.A(new Animator[]{s, valueAnimator});
        boolean isEmpty = ((ArrayList) A).isEmpty();
        if (isEmpty) {
            animatorSet = null;
        } else if (isEmpty) {
            w511.b();
            return;
        } else {
            animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(time);
            animatorSet.playTogether(A);
        }
        hvq0 hvq0Var = aVar.f;
        ServicesDescriptionsContainer descriptionsContainer = aVar.a.getServicesInfoContainer().getDescriptionsContainer();
        long time3 = commonServicesAnimationManager$Durations.getTime();
        long time4 = commonServicesAnimationManager$Durations2.getTime();
        hvq0Var.getClass();
        View currentDescriptionView = descriptionsContainer.getCurrentDescriptionView();
        if (currentDescriptionView != null) {
            valueAnimator2 = hvq0.a(currentDescriptionView, time4, 0.0f, 1.0f);
            valueAnimator2.setStartDelay(time3);
        }
        List A2 = j73.A(new Animator[]{animatorSet, valueAnimator2});
        if (A2.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(A2);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.beginners.presentation.services_info.animation.CommonServicesAnimationManager$playInitialStateAnimator$lambda$0$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                a.b(a.this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        Animator animator = aVar.i;
        if (animator != null) {
            animator.cancel();
        }
        aVar.i = animatorSet2;
        animatorSet2.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final a aVar) {
        ServiceMainInfoItemView mainService = aVar.c().getMainService();
        ServiceMainInfoItemView nextService = aVar.c().getNextService();
        if (mainService == null || nextService == null) {
            aVar.d(CommonServicesAnimationManager$Durations.MoveToFinalScreen.getTime());
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(CommonServicesAnimationManager$Durations.SlidingDelay.getTime());
            zvq0 zvq0Var = aVar.e;
            List<ServiceMainInfoItemView> othersServices = aVar.c().getOthersServices();
            long time = CommonServicesAnimationManager$Durations.MoveToNextService.getTime();
            zvq0Var.getClass();
            float textWidth = mainService.getTextWidth();
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setInterpolator(new OvershootInterpolator(0.6f));
            animatorSet2.setDuration(time);
            float x = mainService.getX();
            mainService.getLocationOnScreen(new int[2]);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(x, -((mainService.getMeasuredWidth() * 1.5f) + new Point(r10[0], r10[1]).x));
            ofFloat.addUpdateListener(new mxp0(4, mainService));
            List<ServiceMainInfoItemView> list = othersServices;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf(((ServiceMainInfoItemView) it.next()).getX()));
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, textWidth);
            ofFloat2.addUpdateListener(new vf2(17, othersServices, arrayList));
            animatorSet2.playTogether(ofFloat, ofFloat2);
            kn1 kn1Var = aVar.d;
            CommonServicesAnimationManager$Durations commonServicesAnimationManager$Durations = CommonServicesAnimationManager$Durations.MoveToNextService;
            AnimatorSet s = kn1Var.s(nextService, commonServicesAnimationManager$Durations.getTime());
            hvq0 hvq0Var = aVar.f;
            ServicesDescriptionsContainer descriptionsContainer = aVar.a.getServicesInfoContainer().getDescriptionsContainer();
            long time2 = commonServicesAnimationManager$Durations.getTime();
            hvq0Var.getClass();
            View currentDescriptionView = descriptionsContainer.getCurrentDescriptionView();
            View newDescriptionView = descriptionsContainer.getNewDescriptionView();
            if (currentDescriptionView != null || newDescriptionView != null) {
                long j = time2 / 2;
                ValueAnimator a = newDescriptionView != null ? hvq0.a(newDescriptionView, j, 0.0f, 1.0f) : null;
                r3 = currentDescriptionView != null ? hvq0.a(currentDescriptionView, j, 1.0f, 0.0f) : null;
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially((List<Animator>) j73.A(new Animator[]{r3, a}));
                r3 = animatorSet3;
            }
            animatorSet.playTogether(j73.A(new Animator[]{animatorSet2, s, r3}));
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.beginners.presentation.services_info.animation.CommonServicesAnimationManager$getSlidingAnimator$lambda$0$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    boolean updateMainServicePosition = a.this.a.updateMainServicePosition();
                    a aVar2 = a.this;
                    if (updateMainServicePosition) {
                        a.b(aVar2);
                    } else {
                        aVar2.d(CommonServicesAnimationManager$Durations.MoveToFinalScreen.getTime());
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
            r3 = animatorSet;
        }
        if (r3 != null) {
            Animator animator = aVar.i;
            if (animator != null) {
                animator.cancel();
            }
            aVar.i = r3;
            r3.start();
        }
    }

    public final ServicesMainInfoContainer c() {
        return this.a.getServicesInfoContainer().getMainInfoContainer();
    }

    public final void d(long j) {
        if (this.h) {
            return;
        }
        this.h = true;
        long time = CommonServicesAnimationManager$Durations.MoveToNextService.getTime();
        this.g.getClass();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setStartDelay(j);
        ofFloat.setDuration(time);
        final OvershootInterpolator overshootInterpolator = new OvershootInterpolator(0.6f);
        final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        final ButtonComponent buttonComponent = this.b;
        Context context = buttonComponent.getContext();
        final CommonServicesContainer commonServicesContainer = this.a;
        final float f = -commonServicesContainer.getServicesInfoContainer().getMeasuredWidth();
        final int t = qje.t(xng0.controlMinor, context);
        final int u = qje.u(context.getTheme(), xng0.controlMain);
        final int u2 = qje.u(context.getTheme(), xng0.textOnControlMinor);
        final int u3 = qje.u(context.getTheme(), xng0.textOnControl);
        final float alpha = buttonComponent.getAlpha();
        final DiscountBadgeView discountBadgeView = this.c;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: v6s0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float b = g8e.b(f, 0.0f, overshootInterpolator.getInterpolation(animatedFraction), 0.0f);
                CommonServicesContainer commonServicesContainer2 = commonServicesContainer;
                commonServicesContainer2.getFinalScreen().setTranslationX(b);
                commonServicesContainer2.getServicesInfoContainer().setTranslationX(b);
                Integer valueOf = Integer.valueOf(t);
                Integer valueOf2 = Integer.valueOf(u);
                ArgbEvaluator argbEvaluator2 = argbEvaluator;
                Object evaluate = argbEvaluator2.evaluate(animatedFraction, valueOf, valueOf2);
                Object evaluate2 = argbEvaluator2.evaluate(animatedFraction, Integer.valueOf(u2), Integer.valueOf(u3));
                int intValue = ((Integer) evaluate).intValue();
                ButtonComponent buttonComponent2 = buttonComponent;
                buttonComponent2.setButtonBackground(intValue);
                buttonComponent2.setButtonTitleColor(((Integer) evaluate2).intValue());
                float f2 = alpha;
                buttonComponent2.setAlpha(((1.0f - f2) * animatedFraction) + f2);
                float f3 = ((-0.5f) * animatedFraction) + 1.5f;
                DiscountBadgeView discountBadgeView2 = discountBadgeView;
                discountBadgeView2.setAlpha(animatedFraction);
                discountBadgeView2.setScaleX(f3);
                discountBadgeView2.setScaleY(f3);
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.beginners.presentation.services_info.animation.ShowFinalServiceInfoAnimatorHolder$showFinalScreenAnimator$lambda$0$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ButtonComponent.this.setEnabled(true);
            }
        });
        Animator animator = this.i;
        if (animator != null) {
            animator.cancel();
        }
        this.i = ofFloat;
        ofFloat.start();
    }
}
