package defpackage;

import android.view.View;
import androidx.fragment.app.SpecialEffectsController$Operation$State;

/* loaded from: classes.dex */
public final class fot0 {
    public static SpecialEffectsController$Operation$State a(View view) {
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? SpecialEffectsController$Operation$State.INVISIBLE : b(view.getVisibility());
    }

    public static SpecialEffectsController$Operation$State b(int i) {
        if (i == 0) {
            return SpecialEffectsController$Operation$State.VISIBLE;
        }
        if (i == 4) {
            return SpecialEffectsController$Operation$State.INVISIBLE;
        }
        if (i == 8) {
            return SpecialEffectsController$Operation$State.GONE;
        }
        ny61.g(oyr.i(i, "Unknown visibility "));
        return null;
    }
}
