package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigation.screen.c;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.fragment.BaseFragment;

/* loaded from: classes9.dex */
public final class mhf {
    public final c a;
    public final r0 b = bvf0.c(null);

    public mhf(c cVar) {
        this.a = cVar;
    }

    public final BaseFragment a() {
        return (BaseFragment) this.b.getValue();
    }

    public final Screen b() {
        return this.a.b();
    }

    public final void c() {
        Screen screen = Screen.UNSUPPORTED;
        v40 a = a();
        if (a instanceof ihf) {
            screen = ((ihf) a).getTrackedScreen();
        }
        if (screen != null) {
            this.a.i(screen);
        }
    }
}
