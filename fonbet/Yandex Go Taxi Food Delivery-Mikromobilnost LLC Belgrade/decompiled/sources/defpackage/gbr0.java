package defpackage;

import ru.yandex.taxi.animation.NavigationDirection;

/* loaded from: classes13.dex */
public final class gbr0 {
    public NavigationDirection a = NavigationDirection.FORWARD;

    public final void a() {
        NavigationDirection navigationDirection;
        int i = fbr0.a[this.a.ordinal()];
        if (i == 1) {
            navigationDirection = NavigationDirection.BACKWARD;
        } else if (i == 2) {
            navigationDirection = NavigationDirection.FORWARD;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            navigationDirection = NavigationDirection.NO_ANIMATE;
        }
        this.a = navigationDirection;
    }
}
