package xsna;

import android.view.ViewConfiguration;
import androidx.compose.runtime.a;

/* compiled from: SplineBasedFloatDecayAnimationSpec.android.kt */
/* loaded from: classes11.dex */
public final class ilk0 {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final l7l a(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(904445851, 0, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        azl azlVar = (azl) aVar.r(uvi.h);
        boolean n = aVar.n(azlVar.getDensity());
        Object x = aVar.x();
        if (n || x == a.C0011a.a) {
            x = new m7l(new hlk0(azlVar));
            aVar.R(x);
        }
        l7l l7lVar = (l7l) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return l7lVar;
    }
}
