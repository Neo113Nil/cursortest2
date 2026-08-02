package androidx.fragment.app;

import android.view.View;
import defpackage.fot0;
import defpackage.iot0;

/* loaded from: classes.dex */
public abstract class e {
    public final iot0 a;

    public e(iot0 iot0Var) {
        this.a = iot0Var;
    }

    public final boolean a() {
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State;
        iot0 iot0Var = this.a;
        View view = iot0Var.c.mView;
        if (view != null) {
            SpecialEffectsController$Operation$State.Companion.getClass();
            specialEffectsController$Operation$State = fot0.a(view);
        } else {
            specialEffectsController$Operation$State = null;
        }
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = iot0Var.a;
        if (specialEffectsController$Operation$State == specialEffectsController$Operation$State2) {
            return true;
        }
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State3 = SpecialEffectsController$Operation$State.VISIBLE;
        return (specialEffectsController$Operation$State == specialEffectsController$Operation$State3 || specialEffectsController$Operation$State2 == specialEffectsController$Operation$State3) ? false : true;
    }
}
