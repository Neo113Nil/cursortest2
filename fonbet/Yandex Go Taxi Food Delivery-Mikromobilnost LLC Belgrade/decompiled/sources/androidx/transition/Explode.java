package androidx.transition;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.Transition;

/* loaded from: classes10.dex */
public class Explode extends Visibility {
    public static final DecelerateInterpolator k0 = new DecelerateInterpolator();
    public static final AccelerateInterpolator l0 = new AccelerateInterpolator();
    public final int[] j0 = new int[2];

    public Explode() {
        this.V = new CircularPropagation();
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
        Rect rect = (Rect) transitionValues2.a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        e0(viewGroup, rect, this.j0);
        return TranslationAnimationCreator.a(view, transitionValues2, rect.left, rect.top, translationX + r0[0], translationY + r0[1], translationX, translationY, k0, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator b0(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        float f;
        float f2;
        if (transitionValues == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues.a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.b.getTag(R.id.transition_position);
        if (iArr != null) {
            f = (r7 - rect.left) + translationX;
            f2 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        e0(viewGroup, rect, this.j0);
        return TranslationAnimationCreator.a(view, transitionValues, i, i2, translationX, translationY, f + r0[0], f2 + r0[1], l0, this);
    }

    public final void e0(ViewGroup viewGroup, Rect rect, int[] iArr) {
        int centerX;
        int centerY;
        int[] iArr2 = this.j0;
        viewGroup.getLocationOnScreen(iArr2);
        int i = iArr2[0];
        int i2 = iArr2[1];
        Transition.EpicenterCallback epicenterCallback = this.W;
        Rect a = epicenterCallback == null ? null : epicenterCallback.a();
        if (a == null) {
            centerX = Math.round(viewGroup.getTranslationX()) + (viewGroup.getWidth() / 2) + i;
            centerY = Math.round(viewGroup.getTranslationY()) + (viewGroup.getHeight() / 2) + i2;
        } else {
            centerX = a.centerX();
            centerY = a.centerY();
        }
        float centerX2 = rect.centerX() - centerX;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float sqrt = (float) Math.sqrt((centerY2 * centerY2) + (centerX2 * centerX2));
        int i3 = centerX - i;
        int i4 = centerY - i2;
        float max = Math.max(i3, viewGroup.getWidth() - i3);
        float max2 = Math.max(i4, viewGroup.getHeight() - i4);
        float sqrt2 = (float) Math.sqrt((max2 * max2) + (max * max));
        iArr[0] = Math.round((centerX2 / sqrt) * sqrt2);
        iArr[1] = Math.round(sqrt2 * (centerY2 / sqrt));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        Visibility.X(transitionValues);
        f0(transitionValues);
    }

    public final void f0(TransitionValues transitionValues) {
        View view = transitionValues.b;
        int[] iArr = this.j0;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        transitionValues.a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        Visibility.X(transitionValues);
        f0(transitionValues);
    }
}
