package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.Collection;
import kotlin.a;

/* loaded from: classes2.dex */
public abstract class nx4 {
    public final xi a;
    public boolean b;
    public boolean c;
    public final ObjectAnimator e;
    public final ObjectAnimator f;
    public final ValueAnimator d = new ValueAnimator();
    public final i3y g = a.a(new f02(16, this));

    public nx4(xi xiVar) {
        this.a = xiVar;
        this.e = kxa1.c(xiVar.getExpandedView());
        this.f = kxa1.c(xiVar.getCollapsedView());
    }

    public static void d(ObjectAnimator objectAnimator) {
        objectAnimator.setFloatValues(0.0f, 1.0f);
        final View view = (View) objectAnimator.getTarget();
        objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.plus.acquisition.sdk.button.section.ui.impl.utils.AnimationUtilsKt$addOnStartListenerForFadeIn$$inlined$addListener$default$1
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
                view.setAlpha(0.0f);
                view.setVisibility(0);
            }
        });
    }

    public abstract Collection a();

    public abstract void b();

    public abstract void c();
}
