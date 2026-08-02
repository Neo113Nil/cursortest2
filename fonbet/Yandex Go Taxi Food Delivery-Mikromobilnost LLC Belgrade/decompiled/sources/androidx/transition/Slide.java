package androidx.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes10.dex */
public class Slide extends Visibility {
    public static final DecelerateInterpolator k0 = new DecelerateInterpolator();
    public static final AccelerateInterpolator l0 = new AccelerateInterpolator();
    public static final AnonymousClass6 m0 = new AnonymousClass6();
    public CalculateSlide j0 = m0;

    /* renamed from: androidx.transition.Slide$1, reason: invalid class name */
    public class AnonymousClass1 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$2, reason: invalid class name */
    public class AnonymousClass2 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float a(View view, ViewGroup viewGroup) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$3, reason: invalid class name */
    public class AnonymousClass3 extends CalculateSlideVertical {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.Slide$4, reason: invalid class name */
    public class AnonymousClass4 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$5, reason: invalid class name */
    public class AnonymousClass5 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float a(View view, ViewGroup viewGroup) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$6, reason: invalid class name */
    public class AnonymousClass6 extends CalculateSlideVertical {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    public interface CalculateSlide {
        float a(View view, ViewGroup viewGroup);

        float b(View view, ViewGroup viewGroup);
    }

    public static abstract class CalculateSlideHorizontal implements CalculateSlide {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY();
        }
    }

    public static abstract class CalculateSlideVertical implements CalculateSlide {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    public Slide() {
        e0();
    }

    @Override // androidx.transition.Transition
    public final boolean D() {
        return true;
    }

    @Override // androidx.transition.Visibility
    public final Animator Z(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return TranslationAnimationCreator.a(view, transitionValues2, iArr[0], iArr[1], this.j0.a(view, viewGroup), this.j0.b(view, viewGroup), translationX, translationY, k0, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator b0(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.a.get("android:slide:screenPosition");
        return TranslationAnimationCreator.a(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.j0.a(view, viewGroup), this.j0.b(view, viewGroup), l0, this);
    }

    public final void e0() {
        this.j0 = m0;
        SidePropagation sidePropagation = new SidePropagation();
        sidePropagation.c = 80;
        this.V = sidePropagation;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        Visibility.X(transitionValues);
        int[] iArr = new int[2];
        transitionValues.b.getLocationOnScreen(iArr);
        transitionValues.a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        Visibility.X(transitionValues);
        int[] iArr = new int[2];
        transitionValues.b.getLocationOnScreen(iArr);
        transitionValues.a.put("android:slide:screenPosition", iArr);
    }

    public Slide(int i) {
        e0();
    }
}
