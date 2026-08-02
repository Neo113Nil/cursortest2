package defpackage;

import com.yandex.go.superapp.api.repository.SuperAppRecenterPointRepository$Type;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.superapp.order.multi.old.recenter.SuperAppRecenterInteractor$invalidate$$inlined$safeCollectIn$1;
import com.yandex.go.superapp.order.multi.old.recenter.SuperAppRecenterInteractor$invalidate$$inlined$safeCollectIn$2;
import com.yandex.go.superapp.order.multi.old.recenter.b;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.view.l;
import com.yandex.mapkit.geometry.BoundingBox;
import java.util.ArrayList;
import kotlinx.coroutines.a;
import kotlinx.coroutines.c;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.multiorder.multi.ServiceType;

/* loaded from: classes14.dex */
public final class m6w0 {
    public final dr00 a;
    public final ry70 b;
    public final l1t c;
    public final g d;
    public final n6w0 e;
    public final y980 f;
    public final l g;
    public final hbp0 h = new hbp0(new czo0(14), "", null);
    public c i = a.a();
    public c j = a.a();
    public g18 k = g18.u1;

    public m6w0(dr00 dr00Var, ry70 ry70Var, l1t l1tVar, g gVar, n6w0 n6w0Var, y980 y980Var, l lVar) {
        this.a = dr00Var;
        this.b = ry70Var;
        this.c = l1tVar;
        this.d = gVar;
        this.e = n6w0Var;
        this.f = y980Var;
        this.g = lVar;
    }

    public final void a(SuperAppRecenterPointRepository$Type superAppRecenterPointRepository$Type) {
        n6w0 n6w0Var = this.e;
        ArrayList arrayList = n6w0Var.c;
        ArrayList b = !arrayList.isEmpty() ? n6w0Var.b(arrayList) : n6w0Var.a();
        if (!c() || b.isEmpty()) {
            return;
        }
        oxv0 oxv0Var = (b.size() == 1 && (superAppRecenterPointRepository$Type == null || superAppRecenterPointRepository$Type == SuperAppRecenterPointRepository$Type.LOGISTICS || superAppRecenterPointRepository$Type == SuperAppRecenterPointRepository$Type.LOGISTICS_NO_ANIMATION || superAppRecenterPointRepository$Type == SuperAppRecenterPointRepository$Type.LINKED)) ? new oxv0(3) : null;
        fi6 fi6Var = new fi6();
        fi6Var.e(b);
        BoundingBox g = fi6Var.g();
        boolean z = !(superAppRecenterPointRepository$Type == SuperAppRecenterPointRepository$Type.LOGISTICS_NO_ANIMATION) && (this.g.b() != OrderScreen.BUNDLED_ORDER_DETAILS || superAppRecenterPointRepository$Type != SuperAppRecenterPointRepository$Type.EATS);
        dr00 dr00Var = this.a;
        if (oxv0Var == null) {
            ((fr00) dr00Var).a(g, z, null);
        } else {
            ((fr00) dr00Var).a(g, z, oxv0Var);
        }
    }

    public final void b(boolean z) {
        if (!z) {
            this.k.cancel();
            this.j.a(null);
            this.i.a(null);
            return;
        }
        this.i.a(null);
        SuperAppRecenterInteractor$invalidate$$inlined$safeCollectIn$1 superAppRecenterInteractor$invalidate$$inlined$safeCollectIn$1 = new SuperAppRecenterInteractor$invalidate$$inlined$safeCollectIn$1(e.t(new ru.yandex.taxi.superapp.orders.ui.e(this.b.a)), null, this);
        hbp0 hbp0Var = this.h;
        this.i = tje.N(hbp0Var, null, null, superAppRecenterInteractor$invalidate$$inlined$safeCollectIn$1, 3);
        this.k.cancel();
        this.k = ((m1t) this.c).a.h(new zw70(2, this));
        this.j.a(null);
        this.j = tje.N(hbp0Var, null, null, new SuperAppRecenterInteractor$invalidate$$inlined$safeCollectIn$2(new b(e.o(e.c(this.e.b)), this), null, this), 3);
    }

    public final boolean c() {
        return !g.f(this.d.a(), ServiceType.TAXI) || this.g.b() == OrderScreen.BUNDLED_ORDER_DETAILS;
    }
}
