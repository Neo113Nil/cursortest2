package defpackage;

import android.view.View;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import ru.yandex.taxi.animation.NavigationDirection;

/* loaded from: classes10.dex */
public final class aos0 implements oy01 {
    public static final aos0 e;
    public static final aos0 f;
    public static final aos0 g;
    public final NavigationDirection b;
    public final boolean c;
    public final FastOutSlowInInterpolator d = new FastOutSlowInInterpolator();

    static {
        NavigationDirection navigationDirection = NavigationDirection.FORWARD;
        e = new aos0(navigationDirection, true);
        f = new aos0(navigationDirection, false);
        g = new aos0(NavigationDirection.BACKWARD, true);
    }

    public aos0(NavigationDirection navigationDirection, boolean z) {
        this.b = navigationDirection;
        this.c = z;
    }

    @Override // defpackage.oy01
    public final int a() {
        return 300;
    }

    @Override // defpackage.oy01
    public final void b(View view, View view2) {
        if (view != null) {
            view.setTranslationX(0.0f);
        }
        if (view2 != null) {
            view2.setTranslationX(0.0f);
        }
    }

    @Override // defpackage.oy01
    public final void c(View view, View view2, float f2) {
        int width;
        if (view != null) {
            width = view.getWidth();
        } else if (view2 == null) {
            return;
        } else {
            width = view2.getWidth();
        }
        float f3 = width;
        float interpolation = this.d.getInterpolation(f2);
        NavigationDirection navigationDirection = this.b;
        NavigationDirection navigationDirection2 = NavigationDirection.FORWARD;
        boolean z = this.c;
        if (navigationDirection == navigationDirection2) {
            if (z && view != null) {
                view.setTranslationX((-interpolation) * f3);
            }
            if (view2 != null) {
                view2.setTranslationX((1.0f - interpolation) * f3);
                return;
            }
            return;
        }
        if (z && view != null) {
            view.setTranslationX(interpolation * f3);
        }
        if (view2 != null) {
            view2.setTranslationX((interpolation - 1.0f) * f3);
        }
    }

    @Override // defpackage.oy01
    public final void d(View view) {
    }
}
