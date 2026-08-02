package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.impl.router.b;
import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderOverrides;
import com.yandex.go.taxi.order.models.api.response.OrderCommitResponse;
import com.yandex.mapkit.map.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.preorder.CameraAnimationUpdateType;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes14.dex */
public final /* synthetic */ class ku4 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ku4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                c.m((c) this.b, (Promotion) obj, (String) this.c, new pu4((Runnable) this.x), (esc) this.w, 16);
                return;
            case 1:
                TaxiOrder taxiOrder = (TaxiOrder) this.b;
                bd80 bd80Var = (bd80) this.c;
                OrderCommitResponse orderCommitResponse = (OrderCommitResponse) this.w;
                DriveState driveState = (DriveState) this.x;
                TaxiOrder taxiOrder2 = (TaxiOrder) obj;
                if (!taxiOrder.K()) {
                    bd80Var.c.b("createFromDraftAndSave", new IllegalStateException("Double order creation detected"), new uh60(26, orderCommitResponse));
                }
                if (!taxiOrder2.C()) {
                    String str = orderCommitResponse.b;
                    synchronized (taxiOrder2) {
                        TaxiOrderOverrides taxiOrderOverrides = taxiOrder2.h;
                        taxiOrderOverrides.getClass();
                        taxiOrder2.h = TaxiOrderOverrides.a(taxiOrderOverrides, null, null, str, 3);
                    }
                }
                taxiOrder2.T(driveState);
                return;
            case 2:
                d0l0 d0l0Var = (d0l0) this.b;
                final y0l0 y0l0Var = (y0l0) this.c;
                final o2y0 o2y0Var = (o2y0) this.w;
                RouteChangeType routeChangeType = (RouteChangeType) this.x;
                final Address address = (Address) obj;
                boolean a = z81.a(d0l0Var.b(), address);
                final int i = 1;
                if (!y0l0Var.g.d().b || a) {
                    y0l0Var.b(o2y0Var, address, true);
                    return;
                } else {
                    final int i2 = 0;
                    y0l0Var.h.a(new f0f0(o2y0Var, Collections.singletonList(address), routeChangeType, new Runnable() { // from class: t0l0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    y0l0Var.b(o2y0Var, address, true);
                                    break;
                                default:
                                    y0l0Var.b(o2y0Var, address, false);
                                    break;
                            }
                        }
                    }, new Runnable() { // from class: t0l0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    y0l0Var.b(o2y0Var, address, true);
                                    break;
                                default:
                                    y0l0Var.b(o2y0Var, address, false);
                                    break;
                            }
                        }
                    }));
                    return;
                }
            case 3:
                b bVar = (b) this.b;
                List list = (List) this.c;
                gwz0 gwz0Var = (gwz0) this.w;
                r330 r330Var = (r330) this.x;
                eor eorVar = (eor) obj;
                hwz0 hwz0Var = bVar.b;
                hwz0Var.getClass();
                List list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((gwz0) it.next()).a);
                }
                if (!jl40.l(hwz0Var.c, arrayList)) {
                    bVar.a();
                }
                r330Var.addFloatButton(eorVar, gwz0Var.d == ProductMode$Taxi.TopItemAlign.LEFT ? 8388611 : 8388613);
                bVar.f.add(eorVar);
                bVar.b.c.add(gwz0Var.a);
                return;
            default:
                final met0 met0Var = (met0) this.b;
                final agt0 agt0Var = (agt0) this.c;
                final zzs zzsVar = (zzs) this.w;
                final zzs zzsVar2 = (zzs) this.x;
                if (((Boolean) obj).booleanValue()) {
                    met0Var.accept(Boolean.TRUE, CameraAnimationUpdateType.ANIMATE_TO_TRANSLATED_POINT);
                    return;
                } else {
                    gh00 gh00Var = (gh00) agt0Var.a;
                    gh00Var.D(a.F(zzsVar), Math.max(gh00Var.j(), agt0Var.b.b), 500.0f, new Map.CameraCallback() { // from class: yft0
                        @Override // com.yandex.mapkit.map.Map.CameraCallback
                        public final void onMoveFinished(final boolean z) {
                            final met0 met0Var2 = met0Var;
                            agt0.this.b(zzsVar, zzsVar2, new Consumer() { // from class: xft0
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj2) {
                                    met0.this.accept(Boolean.valueOf(z), CameraAnimationUpdateType.ANIMATE_TO_POINT_AND_ZOOM_IF_NEEDED);
                                }
                            });
                        }
                    });
                    return;
                }
        }
    }
}
