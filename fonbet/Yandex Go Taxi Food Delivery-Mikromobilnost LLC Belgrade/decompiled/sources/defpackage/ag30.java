package defpackage;

import java.util.List;
import ru.yandex.taxi.masstransit.detailedroute.overlay.a;
import ru.yandex.taxi.masstransit.overlay.e;

/* loaded from: classes6.dex */
public final class ag30 implements dg30 {
    public final /* synthetic */ a a;

    public ag30(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.dg30
    public final void Z0(float f) {
        a aVar = this.a;
        fw30 fw30Var = aVar.i;
        if (f < 13.0f) {
            if (fw30Var != null) {
                fw30Var.c();
            }
        } else if (fw30Var != null) {
            fw30Var.i();
        }
        boolean g = aVar.c.g(f);
        fw30 fw30Var2 = aVar.i;
        if (g) {
            if (fw30Var2 != null) {
                fw30Var2.l = true;
                fw30Var2.j();
            }
        } else if (fw30Var2 != null) {
            fw30Var2.l = false;
            fw30Var2.j();
        }
        if (jl40.l(aVar.k, Boolean.valueOf(g))) {
            return;
        }
        aVar.k = Boolean.valueOf(g);
    }

    @Override // defpackage.dg30
    public final void b5(n2j n2jVar) {
        m2j m2jVar = n2jVar.a;
        List list = n2jVar.b;
        List list2 = n2jVar.e;
        a aVar = this.a;
        q6s0 q6s0Var = list2 != null ? new q6s0(false, false) : aVar.b;
        fw30 fw30Var = aVar.i;
        if (fw30Var != null) {
            fw30Var.d(m2jVar.a, m2jVar.b, m2jVar.c, q6s0Var, list2);
        }
        boolean isEmpty = list.isEmpty();
        e eVar = aVar.f;
        if (isEmpty) {
            eVar.b();
        } else {
            eVar.c(n2jVar.c, list, n2jVar.d instanceof hf30);
        }
    }

    @Override // defpackage.dg30
    public final void w0(boolean z) {
        uo21 uo21Var = this.a.g;
        if (z) {
            uo21Var.attach();
        } else {
            uo21Var.detach();
        }
    }
}
