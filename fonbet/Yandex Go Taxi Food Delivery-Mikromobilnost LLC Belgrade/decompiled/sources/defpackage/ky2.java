package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.AppStateRepositoryImpl$appResumedFlow$$inlined$simpleCallbackApiToFlow$1;

/* loaded from: classes9.dex */
public final class ky2 implements yw60 {
    public volatile boolean a;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();

    @Override // defpackage.yw60
    public final void a(boolean z) {
        boolean z2 = this.a;
        boolean j = j();
        this.a = true;
        qyy0.c(new gy2(this, z2, j));
    }

    @Override // defpackage.yw60
    public final void b() {
        boolean z = this.a;
        boolean j = j();
        this.a = false;
        qyy0.c(new gy2(this, z, j));
    }

    public final void d(fy2 fy2Var) {
        if (this.c.add(fy2Var)) {
            fy2Var.a(this.a, j());
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        return "AppStateRepositoryImpl";
    }

    public final tpr i() {
        return e.t(e.g(new AppStateRepositoryImpl$appResumedFlow$$inlined$simpleCallbackApiToFlow$1(new d8(4, this), null)));
    }

    public final boolean j() {
        return this.a || !this.b.isEmpty();
    }

    public final void k(Class cls) {
        boolean z = this.a;
        boolean j = j();
        this.b.add(cls);
        qyy0.c(new gy2(this, z, j));
    }

    public final void m(Class cls) {
        boolean z = this.a;
        boolean j = j();
        this.b.remove(cls);
        qyy0.c(new gy2(this, z, j));
    }
}
