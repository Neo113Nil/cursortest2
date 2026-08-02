package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.Transition;
import java.util.List;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public final class ej70 implements Transition.TransitionListener {
    public final /* synthetic */ fj70 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ ConstraintLayout c;

    public ej70(fj70 fj70Var, List list, ConstraintLayout constraintLayout) {
        this.a = fj70Var;
        this.b = list;
        this.c = constraintLayout;
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a.c0(this.b);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        h8 h8Var = new h8(3, this.c);
        while (h8Var.hasNext()) {
            View view = (View) h8Var.next();
            ButtonComponent buttonComponent = view instanceof ButtonComponent ? (ButtonComponent) view : null;
            if (buttonComponent != null) {
                buttonComponent.setText((CharSequence) null);
            }
        }
    }
}
