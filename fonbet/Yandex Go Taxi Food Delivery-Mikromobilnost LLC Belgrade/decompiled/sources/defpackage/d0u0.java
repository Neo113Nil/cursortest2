package defpackage;

import android.view.View;
import ru.yandex.taxi.animation.NavigationDirection;

/* loaded from: classes10.dex */
public final class d0u0 implements oy01 {
    public static final d0u0 d = new d0u0(NavigationDirection.FORWARD);
    public static final d0u0 e = new d0u0(NavigationDirection.BACKWARD);
    public final float b;
    public final float c;

    public d0u0(NavigationDirection navigationDirection) {
        NavigationDirection navigationDirection2 = NavigationDirection.FORWARD;
        this.b = navigationDirection == navigationDirection2 ? 0.5f : 1.2f;
        this.c = navigationDirection != navigationDirection2 ? 0.5f : 1.2f;
    }

    @Override // defpackage.oy01
    public final int a() {
        return 300;
    }

    @Override // defpackage.oy01
    public final void b(View view, View view2) {
        if (view2 != null) {
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            view2.setAlpha(1.0f);
        }
        if (view != null) {
            view.setAlpha(0.0f);
        }
    }

    @Override // defpackage.oy01
    public final void c(View view, View view2, float f) {
        if (view2 != null) {
            float f2 = f < 0.5f ? 0.0f : (f - 0.5f) * 2.0f;
            view2.setAlpha(f2);
            float f3 = (f2 * 1.0f) + ((1.0f - f2) * this.b);
            view2.setScaleX(f3);
            view2.setScaleY(f3);
        }
        if (view != null) {
            float f4 = f < 0.5f ? f * 2.0f : 1.0f;
            float f5 = 1.0f - f4;
            view.setAlpha(f5);
            float f6 = (this.c * f4) + f5;
            view.setScaleY(f6);
            view.setScaleX(f6);
        }
    }
}
