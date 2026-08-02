package defpackage;

import com.yandex.go.geosharing.controller.e;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.HashMap;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.orderforanother.model.FormedFrom;

/* loaded from: classes14.dex */
public final class g1t implements i580 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g1t(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.i580
    public final void a(TaxiOrder taxiOrder, boolean z) {
        pv70 pv70Var;
        switch (this.a) {
            case 0:
                if (z && taxiOrder.b.M == null) {
                    d1t d1tVar = (d1t) this.b;
                    DriveState driveState = taxiOrder.h.b;
                    e eVar = (e) d1tVar;
                    eVar.r = driveState;
                    switch (e1t.a[driveState.ordinal()]) {
                        case 1:
                            break;
                        case 2:
                        case 3:
                        case 4:
                            eVar.i();
                            eVar.h();
                            break;
                        case 5:
                        case 6:
                        case 7:
                            eVar.b.q = false;
                            eVar.j();
                            eVar.h();
                            break;
                        default:
                            eVar.j();
                            eVar.h();
                            break;
                    }
                }
                break;
            default:
                if (taxiOrder.h.b == DriveState.COMPLETE && (pv70Var = taxiOrder.b.M) != null) {
                    FormedFrom formedFrom = pv70Var.c;
                    if (formedFrom == null) {
                        formedFrom = FormedFrom.UNKNOWN;
                    }
                    FormedFrom formedFrom2 = FormedFrom.DIALOG;
                    qv70 qv70Var = (qv70) this.b;
                    if (formedFrom != formedFrom2) {
                        qv70Var.getClass();
                        qv70Var.a.a("OrderForAnother.RideInitFromReq", new HashMap(), 1, new HashMap());
                        break;
                    } else {
                        qv70Var.getClass();
                        qv70Var.a.a("OrderForAnother.RideInitFromWhoRide", new HashMap(), 1, new HashMap());
                        break;
                    }
                }
                break;
        }
    }
}
