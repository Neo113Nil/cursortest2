package defpackage;

import java.util.List;
import java.util.Map;
import ru.yandex.taxi.masstransit.overlay.onmap.a;

/* loaded from: classes6.dex */
public final class gk40 implements ik40 {
    public final /* synthetic */ a a;

    public gk40(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.ik40
    public final void kf(boolean z) {
        this.a.f.c.b.b(new dzw0(z, 5), false);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        nk40 nk40Var = (nk40) obj;
        fw30 fw30Var = this.a.i;
        if (fw30Var != null) {
            fw30Var.d(nk40Var.a, nk40Var.b, nk40Var.c, new q6s0(true, true), null);
        }
    }

    @Override // defpackage.ik40
    public final void wf(List list, Map map) {
        this.a.f.c.c(map, list, true);
    }
}
