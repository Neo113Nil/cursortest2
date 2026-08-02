package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import flex.animation.player.interpolator.InterpolationType;
import flex.core.model.Document$TransitionSettings$Option$Interpolator;

/* loaded from: classes9.dex */
public final class iuw {
    public static BaseInterpolator a(InterpolationType interpolationType) {
        int i = huw.b[interpolationType.ordinal()];
        if (i == 1) {
            return new LinearInterpolator();
        }
        if (i == 2) {
            return new AccelerateInterpolator();
        }
        if (i == 3) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new AccelerateDecelerateInterpolator();
        }
        w511.b();
        return null;
    }

    public static BaseInterpolator b(Document$TransitionSettings$Option$Interpolator document$TransitionSettings$Option$Interpolator) {
        int i = huw.a[document$TransitionSettings$Option$Interpolator.ordinal()];
        if (i == 1) {
            return new LinearInterpolator();
        }
        if (i == 2) {
            return new AccelerateInterpolator();
        }
        if (i == 3) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new AccelerateDecelerateInterpolator();
        }
        w511.b();
        return null;
    }
}
