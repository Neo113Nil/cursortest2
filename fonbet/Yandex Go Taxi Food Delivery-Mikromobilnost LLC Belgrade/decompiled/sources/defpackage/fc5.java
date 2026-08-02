package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import defpackage.oy01;
import defpackage.tje;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public class fc5 {
    public ValueAnimator a;
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(Runnable runnable, String str) {
        if (runnable == null) {
            runnable = pwf0.c;
        }
        this.b.put(str, runnable);
    }

    public final void b(final View view, final View view2, final oy01 oy01Var, ValueAnimator valueAnimator) {
        int a = oy01Var.a();
        if (a <= 0) {
            Iterator it = this.b.values().iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            e();
            return;
        }
        this.a = valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.setDuration(a);
        }
        ValueAnimator valueAnimator2 = this.a;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ec5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    oy01.this.c(view, view2, ((Float) valueAnimator3.getAnimatedValue()).floatValue());
                }
            });
        }
        ValueAnimator valueAnimator3 = this.a;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.transition.BaseTransitionManager$doTransition$3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    oy01.this.b(view, view2);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    oy01.this.d(view2);
                    Iterator it2 = this.b.values().iterator();
                    while (it2.hasNext()) {
                        ((Runnable) it2.next()).run();
                    }
                    this.e();
                    View view3 = view2;
                    if (view3 != null) {
                        tje.Q(view3);
                    }
                }
            });
        }
        ValueAnimator valueAnimator4 = this.a;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    public final boolean c() {
        ValueAnimator valueAnimator = this.a;
        return (valueAnimator == null || valueAnimator == null || !valueAnimator.isRunning()) ? false : true;
    }

    public void d() {
        ValueAnimator valueAnimator;
        if (!c() || (valueAnimator = this.a) == null) {
            return;
        }
        valueAnimator.cancel();
    }

    public void e() {
        this.a = null;
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
