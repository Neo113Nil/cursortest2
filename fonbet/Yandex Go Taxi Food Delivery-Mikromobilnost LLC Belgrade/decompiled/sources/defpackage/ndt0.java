package defpackage;

import androidx.lifecycle.Lifecycle;
import ru.yandex.taxi.map.overlay.pickup.d;
import ru.yandex.taxi.preorder.source.domain.r;

/* loaded from: classes6.dex */
public final class ndt0 implements Runnable {
    public final gmb0 a;
    public final /* synthetic */ r b;

    public ndt0(r rVar, gmb0 gmb0Var) {
        this.b = rVar;
        this.a = gmb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = this.b;
        d dVar = rVar.e;
        if (rVar.b.a.w.a(Lifecycle.State.STARTED)) {
            dVar.A.j = rVar.h.f();
            dVar.Pg(this.a);
        }
    }
}
