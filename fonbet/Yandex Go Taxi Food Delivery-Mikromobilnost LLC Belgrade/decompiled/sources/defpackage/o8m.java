package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import com.ybsdk.core.design.spoiler.Spoiler;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.design.spoiler.b;
import com.ybsdk.feature.main.internal.widgets.gradient.ProductsV4GradientView;
import com.ybsdk.feature.savings.internal.views.SavingsCardView;
import com.ybsdk.feature.savings.internal.views.SavingsDivCardView;
import defpackage.q8m;
import defpackage.s8m;
import java.util.Collections;
import java.util.List;
import ru.yandex.taxi.eatskit.widget.placeholder.eats.EatsSplashView;

/* loaded from: classes3.dex */
public final /* synthetic */ class o8m implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ o8m(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final q8m q8mVar = (q8m) obj3;
                final SavingsCardView savingsCardView = (SavingsCardView) obj2;
                final SavingsCardView savingsCardView2 = (SavingsCardView) obj;
                valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.savings.internal.screens.dashboard.DragAndDropOnboardingAnimationHelper$swapViews$lambda$13$$inlined$doOnEnd$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        q8m q8mVar2 = q8m.this;
                        SavingsCardView savingsCardView3 = savingsCardView;
                        SavingsCardView savingsCardView4 = savingsCardView2;
                        q8mVar2.getClass();
                        savingsCardView3.animate().translationX(0.0f).setDuration(600L).setStartDelay(200L).start();
                        savingsCardView4.animate().translationX(0.0f).setDuration(600L).setStartDelay(200L).start();
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                break;
            case 1:
                final s8m s8mVar = (s8m) obj3;
                final SavingsDivCardView savingsDivCardView = (SavingsDivCardView) obj2;
                final SavingsDivCardView savingsDivCardView2 = (SavingsDivCardView) obj;
                valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.savings.internal.screens.dashboard.DragAndDropOnboardingAnimationHelperV2$swapViews$lambda$13$$inlined$doOnEnd$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        s8m s8mVar2 = s8m.this;
                        SavingsDivCardView savingsDivCardView3 = savingsDivCardView;
                        SavingsDivCardView savingsDivCardView4 = savingsDivCardView2;
                        s8mVar2.getClass();
                        savingsDivCardView3.animate().translationX(0.0f).setDuration(600L).setStartDelay(200L).start();
                        savingsDivCardView4.animate().translationX(0.0f).setDuration(600L).setStartDelay(200L).start();
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                break;
            case 2:
                ngn ngnVar = (ngn) obj3;
                ikz ikzVar = (ikz) obj2;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = ((kce0) obj).b;
                float f2 = ikzVar.h;
                RectF rectF = new RectF(floatValue, f, floatValue + f2, f2 + f);
                float a = ikzVar.a(1.0f);
                float f3 = rectF.left;
                float f4 = ikzVar.j;
                ngnVar.c = new jkz(rectF, new Rect((int) ((f3 + f4) - a), (int) (rectF.top + f4), (int) ((rectF.right - f4) - a), (int) (rectF.bottom - f4)), ikzVar.f, ikzVar.g, ikzVar.i);
                EatsSplashView eatsSplashView = ngnVar.b;
                if (eatsSplashView != null) {
                    eatsSplashView.invalidate();
                    break;
                }
                break;
            case 3:
                View view = (View) obj2;
                int paddingBottom = view.getPaddingBottom() + (((gfu) obj3).c - view.getHeight());
                int floatValue2 = (int) (((Float) ((ValueAnimator) obj).getAnimatedValue()).floatValue() * paddingBottom);
                if (paddingBottom <= 0) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
                    break;
                } else {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), floatValue2);
                    break;
                }
            case 4:
                w4e0 w4e0Var = (w4e0) obj3;
                w4e0Var.A(0, ((v1e0) obj2).f);
                w4e0Var.r(Collections.singletonList(new Subpolyline((PolylinePosition) obj, new PolylinePosition(((Integer) valueAnimator.getAnimatedValue()).intValue(), valueAnimator.getAnimatedFraction()))));
                break;
            case 5:
                ProductsV4GradientView.startGradientAnimation$lambda$12$lambda$11((List) obj3, (ProductsV4GradientView) obj2, (List) obj, valueAnimator);
                break;
            default:
                SpoilerTextView spoilerTextView = ((rdm0) obj3).a.h;
                spoilerTextView.setSpoiler(Spoiler.a(spoilerTextView.getSpoiler(), false, new Spoiler.a(b.a((b) obj2, ((Integer) valueAnimator.getAnimatedValue("width")).intValue()), b.a((b) obj, ((Integer) valueAnimator.getAnimatedValue("height")).intValue())), null, null, 13));
                break;
        }
    }
}
