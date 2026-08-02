package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.order.provider.a;
import java.util.Iterator;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes6.dex */
public final class l6y0 implements j9s0 {
    public final zuj0 a;
    public final d6u0 b;

    public l6y0(zuj0 zuj0Var, d6u0 d6u0Var) {
        this.a = zuj0Var;
        this.b = d6u0Var;
    }

    @Override // defpackage.j9s0
    public final boolean a(Screen screen) {
        return true;
    }

    @Override // defpackage.j9s0
    public final x060 b() {
        Iterator it = ((a) ((n20) this.b.a.get())).l().iterator();
        while (it.hasNext()) {
            if (((o2y0) it.next()).c() == DriveState.SEARCH) {
                return new x060(((avj0) this.a).h(kyh0.toast_connection_lost_taxisearch), null);
            }
        }
        return null;
    }

    @Override // defpackage.j9s0
    public final boolean c(Screen screen) {
        return true;
    }
}
