package defpackage;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.route.interactor.b;
import com.yandex.go.zone.repository.o;

/* loaded from: classes12.dex */
public final class jy0 {
    public final o a;
    public final b b;
    public final n11 c;
    public final e2t d;
    public final h2t e;

    public jy0(o oVar, b bVar, n11 n11Var, e2t e2tVar, h2t h2tVar) {
        this.a = oVar;
        this.b = bVar;
        this.c = n11Var;
        this.d = e2tVar;
        this.e = h2tVar;
    }

    public final void a(pv0 pv0Var) {
        this.b.m(new ZoneAddress(pv0Var.a, this.a.f(pv0Var.a.getZoneName())), null);
        n11 n11Var = this.c;
        n11Var.a = null;
        n11Var.b = null;
    }

    public final void b() {
        n11 n11Var = this.c;
        g2t g2tVar = n11Var.b;
        if (g2tVar != null) {
            ((f2t) ((e2t) this.e.a)).b(g2tVar);
        }
        pv0 pv0Var = n11Var.a;
        if (pv0Var != null) {
            a(pv0Var);
        }
        n11Var.a = null;
        n11Var.b = null;
    }
}
