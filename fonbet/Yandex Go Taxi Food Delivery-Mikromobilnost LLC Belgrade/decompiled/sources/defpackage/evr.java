package defpackage;

import com.yandex.go.preorder.mode.SourcePointMode;
import com.yandex.go.route.interactor.c;
import java.util.HashMap;
import ru.yandex.taxi.layers.presentation.walkroute.simple.b;
import ru.yandex.taxi.preorder.source.mode.interactor.e;

/* loaded from: classes6.dex */
public final class evr {
    public final cvr a;
    public final rjt0 b;
    public final lgv0 c;
    public final e d;
    public final b e;
    public final c f;
    public final tit0 g;

    public evr(cvr cvrVar, rjt0 rjt0Var, lgv0 lgv0Var, e eVar, b bVar, c cVar, tit0 tit0Var) {
        this.a = cvrVar;
        this.b = rjt0Var;
        this.c = lgv0Var;
        this.d = eVar;
        this.e = bVar;
        this.f = cVar;
        this.g = tit0Var;
    }

    public final void a() {
        mgv0 mgv0Var = this.c.b;
        mgv0Var.d = false;
        mgv0Var.e = null;
        mgv0Var.f = null;
        e eVar = this.d;
        if (dvr.a[eVar.a.a().ordinal()] == 1) {
            g641 g641Var = this.e.d;
            if (g641Var != null) {
                g641Var.Jg(true);
            }
            this.a.b(false);
        } else {
            if (this.f.g() == null) {
                return;
            }
            this.g.m = false;
            eVar.h(SourcePointMode.ROUTE, true, true);
        }
        rjt0 rjt0Var = this.b;
        rjt0Var.b.a("Routes.FocusRouteTapped", rjt0Var.o.getModeName());
    }

    public final void b() {
        if (this.a.b(true)) {
            rjt0 rjt0Var = this.b;
            kgl0 kgl0Var = rjt0Var.b;
            String modeName = rjt0Var.o.getModeName();
            kgl0Var.getClass();
            HashMap hashMap = new HashMap();
            if (modeName != null) {
                hashMap.put("mode", modeName);
            }
            kgl0Var.a.a("Routes.FocusRouteShown", hashMap, 1, new HashMap());
        }
    }
}
