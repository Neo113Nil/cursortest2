package xsna;

import com.vk.ecomm.cart.impl.common.models.geo.Address;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import xsna.ezj;
import xsna.mzj;
import xsna.pk00;
import xsna.wk50;
import xsna.xyj;

/* compiled from: CourierMapInitActionApplier.kt */
/* loaded from: classes18.dex */
public final class dzj implements oj50<tzj, xyj, mzj> {
    public final wj50<ezj> a;

    public dzj(f4z f4zVar) {
        this.a = f4zVar;
    }

    public static void b(dzj dzjVar, wk50.a aVar, Coordinates coordinates, int i) {
        aVar.b(new mzj.d(new pk00.b(new gk9(coordinates, (i & 2) != 0 ? vm00.d : vm00.b), (i & 4) == 0)));
        aVar.b(mzj.c.b.b);
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        Coordinates coordinates;
        tzj tzjVar = (tzj) km50Var;
        xyj xyjVar = (xyj) kj50Var;
        Address address = tzjVar.e;
        tj00 tj00Var = tzjVar.b;
        boolean z = xyjVar instanceof xyj.c.e;
        ezj.c cVar = ezj.c.a;
        wj50<ezj> wj50Var = this.a;
        if (z) {
            Address address2 = ((xyj.c.e) xyjVar).b;
            if (tj00Var.b() || address2 == null) {
                return;
            }
            wj50Var.b(cVar);
            aVar.b(new mzj.c.e(address2));
            return;
        }
        if (xyjVar instanceof xyj.c.d) {
            if (tj00Var.b()) {
                return;
            }
            wj50Var.b(cVar);
            aVar.b(mzj.c.d.b);
            return;
        }
        if (xyjVar instanceof xyj.c.a) {
            aVar.b(new mzj.c.a(((xyj.c.a) xyjVar).b));
            return;
        }
        if (xyjVar instanceof xyj.c.C4056c) {
            if (tj00Var.b() || tzjVar.d == null) {
                return;
            }
            if ((address != null ? address.e : null) == null || !address.d) {
                aVar.b(mzj.c.C3379c.b);
                wj50Var.b(ezj.b.a);
                return;
            } else {
                aVar.b(new mzj.d(new pk00.b(new gk9(address.e, vm00.d), false)));
                aVar.b(mzj.c.b.b);
                return;
            }
        }
        if (xyjVar instanceof xyj.c.b.C4055b) {
            b(this, aVar, ((xyj.c.b.C4055b) xyjVar).b, 2);
            return;
        }
        if (xyjVar instanceof xyj.c.b.a) {
            if (address == null || (coordinates = address.e) == null) {
                b(this, aVar, Coordinates.e, 4);
            } else {
                b(this, aVar, coordinates, 6);
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
