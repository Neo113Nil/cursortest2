package xsna;

import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import xsna.cxl;
import xsna.hyl;
import xsna.lyl;
import xsna.qxl;
import xsna.wk50;

/* compiled from: DeliveryPointsMapInitActionApplier.kt */
/* loaded from: classes18.dex */
public final class ixl implements oj50<hyl, cxl, qxl> {
    public final f4z a;

    public ixl(f4z f4zVar) {
        this.a = f4zVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        hyl hylVar = (hyl) km50Var;
        cxl cxlVar = (cxl) kj50Var;
        hyl.b bVar = hylVar.d;
        boolean z = cxlVar instanceof cxl.k.e;
        f4z f4zVar = this.a;
        if (z) {
            if (bVar.a.b()) {
                return;
            }
            f4zVar.b(lyl.c.a);
            aVar.b(qxl.f.d.b);
            return;
        }
        if (cxlVar instanceof cxl.k.d) {
            f4zVar.b(lyl.c.a);
            aVar.b(qxl.f.c.b);
            return;
        }
        if (cxlVar instanceof cxl.k.b) {
            aVar.b(qxl.f.a.b);
            DeliveryPoint deliveryPoint = hylVar.f;
            if (deliveryPoint != null) {
                aVar.b(new qxl.e.a(new gk9(iwl.a(deliveryPoint), vm00.d), false));
            }
            if (hylVar.b()) {
                f4zVar.b(lyl.b.a);
                return;
            }
            return;
        }
        if (cxlVar instanceof cxl.k.c) {
            aVar.b(new qxl.f.b(((cxl.k.c) cxlVar).b));
            return;
        }
        if (cxlVar instanceof cxl.k.a) {
            aVar.b(new qxl.c());
            if (bVar.a.b()) {
                return;
            }
            Coordinates coordinates = hylVar.b.c;
            aVar.b(new qxl.e.a(coordinates != null ? new gk9(coordinates, vm00.c) : new gk9(Coordinates.e, vm00.b), false));
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
