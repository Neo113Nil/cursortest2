package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.common.models.DeliveryPointId;
import com.vk.ecomm.cart.impl.common.models.geo.City;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.points_map.feature.model.DeliveryPointsMode;
import com.vk.ecomm.cart.impl.search_address.model.SearchAddressResult;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.cxl;
import xsna.hyl;
import xsna.lyl;
import xsna.qxl;

/* compiled from: DeliveryPointsMapFeature.kt */
/* loaded from: classes18.dex */
public final class fxl extends wk50<kyl, hyl, cxl, qxl> {
    public final f4z f;
    public final f4z g;
    public final nyl h;
    public io.reactivex.rxjava3.disposables.c i;
    public final mj50<hyl, cxl, qxl> j;

    /* compiled from: DeliveryPointsMapFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeliveryPointsMode.values().length];
            try {
                iArr[DeliveryPointsMode.SELECT_DELIVERY_POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeliveryPointsMode.SHOW_DELIVERY_POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fxl(wxl wxlVar) {
        super(null, wxlVar);
        f4z f4zVar = new f4z();
        this.f = f4zVar;
        this.g = new f4z();
        this.h = new nyl(new yd10());
        this.j = O(new ixl(f4zVar));
    }

    @Override // xsna.wk50
    public final void N(hyl hylVar, cxl cxlVar) {
        hyl hylVar2 = hylVar;
        cxl cxlVar2 = cxlVar;
        DeliveryPoint deliveryPoint = hylVar2.f;
        hyl.b bVar = hylVar2.d;
        if (cxlVar2 instanceof cxl.k) {
            this.j.a(hylVar2, cxlVar2);
            return;
        }
        if (cxlVar2 instanceof cxl.r) {
            cxl.r rVar = (cxl.r) cxlVar2;
            T(new qxl.e.c(rVar.b, rVar.c));
            if (hylVar2.b()) {
                C(cxl.l.b);
                return;
            }
            return;
        }
        if (cxlVar2 instanceof cxl.q) {
            T(qxl.e.b.b);
            return;
        }
        boolean z = cxlVar2 instanceof cxl.s;
        vm00 vm00Var = vm00.d;
        if (z) {
            SearchAddressResult searchAddressResult = ((cxl.s) cxlVar2).b;
            if (searchAddressResult instanceof SearchAddressResult.Found) {
                T(new qxl.e.a(new gk9(((SearchAddressResult.Found) searchAddressResult).c, vm00Var), false));
                return;
            }
            return;
        }
        if (cxlVar2 instanceof cxl.l) {
            U(hylVar2);
            return;
        }
        boolean z2 = cxlVar2 instanceof cxl.b;
        f4z f4zVar = this.f;
        if (z2) {
            if (deliveryPoint == null || !hylVar2.b()) {
                f4zVar.b(lyl.a.a);
                return;
            } else {
                T(qxl.b.b);
                return;
            }
        }
        if (cxlVar2 instanceof cxl.n) {
            T(qxl.i.a.b);
            return;
        }
        if (cxlVar2 instanceof cxl.o) {
            T(qxl.i.b.b);
            return;
        }
        if (cxlVar2 instanceof cxl.m) {
            T(new qxl.c());
            return;
        }
        if (cxlVar2 instanceof cxl.p) {
            T(new qxl.d(((cxl.p) cxlVar2).b));
            return;
        }
        if (cxlVar2 instanceof cxl.j) {
            f4zVar.b(new lyl.e(bVar.a.a.a));
            return;
        }
        if (cxlVar2 instanceof cxl.g) {
            Coordinates coordinates = bVar.b;
            if (coordinates != null) {
                T(new qxl.e.a(new gk9(coordinates, vm00Var), true));
                f4zVar.b(lyl.g.a);
                return;
            } else {
                T(new qxl.i.c(true));
                f4zVar.b(lyl.f.a);
                return;
            }
        }
        if (cxlVar2 instanceof cxl.h) {
            T(new qxl.i.c(false));
            f4zVar.b(lyl.f.a);
            return;
        }
        if (cxlVar2 instanceof cxl.i) {
            U(hylVar2);
            return;
        }
        if (cxlVar2 instanceof cxl.d) {
            T(new qxl.e.a(new gk9(((cxl.d) cxlVar2).b, new vm00(Math.min(bVar.a.a.b.a + 2.0f, 17.0f))), bVar.a.b));
            return;
        }
        if (cxlVar2 instanceof cxl.e) {
            DeliveryPointId deliveryPointId = ((cxl.e) cxlVar2).b;
            DeliveryPoint deliveryPoint2 = bVar.c.get(deliveryPointId);
            Coordinates a2 = deliveryPoint2 != null ? iwl.a(deliveryPoint2) : null;
            vm00 vm00Var2 = bVar.a.a.b;
            if (a2 != null) {
                int i = a.$EnumSwitchMapping$0[hylVar2.c.ordinal()];
                if (i == 1) {
                    vm00Var = vm00.e;
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (vm00Var2.a < vm00Var.a) {
                    vm00Var2 = vm00Var;
                }
                T(new qxl.j(deliveryPointId));
                T(new qxl.e.a(new gk9(a2, vm00Var2), false));
                return;
            }
            return;
        }
        if (cxlVar2 instanceof cxl.c) {
            T(qxl.b.b);
            return;
        }
        if (cxlVar2 instanceof cxl.u) {
            if (deliveryPoint != null) {
                this.g.b(deliveryPoint);
            }
        } else {
            if (cxlVar2 instanceof cxl.f) {
                f4zVar.b(new lyl.d(hylVar2.h));
                return;
            }
            if (cxlVar2 instanceof cxl.t) {
                T(qxl.h.b);
                T(qxl.b.b);
                C(cxl.l.b);
            } else {
                if (!(cxlVar2 instanceof cxl.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new qxl.k(((cxl.a) cxlVar2).b));
                T(qxl.b.b);
                C(cxl.l.b);
            }
        }
    }

    public final void U(hyl hylVar) {
        if (hylVar.e.b > 25000.0d) {
            T(qxl.a.b);
            io.reactivex.rxjava3.disposables.c cVar = this.i;
            if (cVar != null) {
                cVar.dispose();
                return;
            }
            return;
        }
        T(qxl.g.b.b);
        io.reactivex.rxjava3.disposables.c cVar2 = this.i;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        hyl.a aVar = hylVar.b;
        City city = aVar.b;
        if (city != null) {
            int i = city.c;
            Coordinates coordinates = hylVar.d.a.a.a;
            int i2 = hylVar.e.b;
            List<Integer> list = aVar.d;
            UserId userId = aVar.a;
            this.i = a7f0.a.f(this, this.h.a(i, list, 0, coordinates, Integer.valueOf(i2), hylVar.h.b, userId), new l2k(this, 3), new rmg(this, 9), 1);
        }
    }
}
