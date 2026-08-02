package defpackage;

import android.animation.Animator;
import android.view.ViewGroup;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;

/* loaded from: classes11.dex */
public class lx80 extends Visibility {
    @Override // androidx.transition.Visibility
    public final Animator a0(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        Object obj = transitionValues2 != null ? transitionValues2.b : null;
        ax01 ax01Var = obj instanceof ax01 ? (ax01) obj : null;
        if (ax01Var != null) {
            ax01Var.transitionStarted(transitionValues2.b);
        }
        a(new jx80(this, ax01Var, transitionValues2));
        return super.a0(viewGroup, transitionValues, i, transitionValues2, i2);
    }

    @Override // androidx.transition.Visibility
    public final Animator c0(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        Object obj = transitionValues != null ? transitionValues.b : null;
        ax01 ax01Var = obj instanceof ax01 ? (ax01) obj : null;
        if (ax01Var != null) {
            ax01Var.transitionStarted(transitionValues.b);
        }
        a(new kx80(this, ax01Var, transitionValues));
        return super.c0(viewGroup, transitionValues, i, transitionValues2, i2);
    }
}
