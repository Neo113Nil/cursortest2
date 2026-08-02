package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.foundation.layout.a;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import ru.yandex.taxi.masstransit.model.CheckoutUIState$PaymentCheckoutUIState;
import ru.yandex.taxi.widget.PlaceholderView;

/* loaded from: classes6.dex */
public final /* synthetic */ class i0z implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ i0z(f930 f930Var) {
        this.a = 10;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean d;
        su30 su30Var;
        int i = this.a;
        int i2 = 7;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                j0z.b((fid) obj, vng.O(7));
                return zy11Var;
            case 1:
                View inflate = ((LayoutInflater) obj).inflate(umh0.ybsdk_item_transfer_loading, (ViewGroup) obj2, false);
                int i3 = mah0.startIcon;
                if (((SkeletonView) cma1.O(i3, inflate)) != null) {
                    i3 = mah0.title;
                    if (((SkeletonView) cma1.O(i3, inflate)) != null) {
                        return new wz51((ShimmerFrameLayout) inflate, 13);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            case 2:
                dvx dvxVar = (dvx) obj;
                dvx dvxVar2 = (dvx) obj2;
                if (jl40.l(dvxVar, dvxVar2) && dvxVar.a() == dvxVar2.a()) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 3:
                ((yn50) ((g9v) obj2)).a();
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                kj20.c((fid) obj, vng.O(1));
                return zy11Var;
            case 5:
                ((Integer) obj2).getClass();
                pmb1.a((fid) obj, vng.O(1));
                return zy11Var;
            case 6:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    pmb1.b(287.0f, 6, 28, 0L, 0L, btsVar, null);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 7:
                ((Integer) obj2).getClass();
                bts btsVar2 = (bts) ((fid) obj);
                btsVar2.e0(-511854661);
                float f = ff6.a;
                WeakHashMap weakHashMap = a.w;
                pfy pfyVar = new pfy(vuz.o(btsVar2).l, 48);
                btsVar2.t(false);
                return pfyVar;
            case 8:
                ((Integer) obj2).getClass();
                xnb1.b((fid) obj, vng.O(1));
                return zy11Var;
            case 9:
                View inflate2 = ((LayoutInflater) obj).inflate(poh0.ybsdk_day_item, (ViewGroup) obj2, false);
                int i4 = fch0.text;
                TextView textView = (TextView) cma1.O(i4, inflate2);
                if (textView != null) {
                    return new d161((FrameLayout) inflate2, textView);
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i4)));
                return null;
            case 10:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar2;
                if (btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar3.e0(1457843717);
                    btsVar3.t(false);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 11:
                ((Integer) obj2).getClass();
                zk91.e((fid) obj, vng.O(1));
                return zy11Var;
            case 12:
                ((Integer) obj2).getClass();
                zk91.c((fid) obj, vng.O(1));
                return zy11Var;
            case 13:
                ((Integer) obj2).getClass();
                zk91.d((fid) obj, vng.O(1));
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                zk91.b((fid) obj, vng.O(1));
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                zk91.a((fid) obj, vng.O(1));
                return zy11Var;
            case 16:
                d = e3n.d(((CheckoutUIState$PaymentCheckoutUIState) obj).d.c, ((CheckoutUIState$PaymentCheckoutUIState) obj2).d.c);
                break;
            case 17:
                d = jl40.l((Address) obj, (Address) obj2);
                break;
            case 18:
                igl0 igl0Var = (igl0) obj2;
                ArrayList arrayList = ((igl0) obj).a;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((c040) it.next()).a);
                }
                ArrayList arrayList3 = igl0Var.a;
                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((c040) it2.next()).a);
                }
                d = arrayList2.equals(arrayList4);
                break;
            case 19:
                return Boolean.valueOf(Math.abs(((zs7) obj).a.getZoom() - ((zs7) obj2).a.getZoom()) < 0.1f);
            case 20:
                ((Integer) obj2).getClass();
                cl91.l((fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                cl91.d((fid) obj, vng.O(1));
                return zy11Var;
            case 22:
                Set set = (Set) obj2;
                if (jl40.l((Set) obj, set) && set != null) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 23:
                View inflate3 = ((LayoutInflater) obj).inflate(uqh0.mt_loading_route_view_holder, (ViewGroup) obj2, false);
                if (inflate3 != null) {
                    return new b0b(new y2j((PlaceholderView) inflate3, 4), i2);
                }
                ny61.t("rootView");
                return null;
            case 24:
                ((Integer) obj2).getClass();
                uob1.i((fid) obj, vng.O(1));
                return zy11Var;
            case 25:
                uu30 uu30Var = (uu30) obj;
                uu30 uu30Var2 = (uu30) obj2;
                ZoneAddress zoneAddress = uu30Var.a;
                Address address = zoneAddress != null ? zoneAddress.a : null;
                ZoneAddress zoneAddress2 = uu30Var2.a;
                if (jl40.l(address, zoneAddress2 != null ? zoneAddress2.a : null)) {
                    ZoneAddress zoneAddress3 = uu30Var.a;
                    Zone zone = zoneAddress3 != null ? zoneAddress3.b : null;
                    ZoneAddress zoneAddress4 = uu30Var2.a;
                    if (jl40.l(zone, zoneAddress4 != null ? zoneAddress4.b : null)) {
                        r5 = true;
                    }
                }
                return Boolean.valueOf(r5);
            case 26:
                py30 py30Var = (py30) obj;
                py30 py30Var2 = (py30) obj2;
                if ((py30Var.d != null && py30Var2.d != null) || ((su30Var = py30Var.b) != null && jl40.l(su30Var, py30Var2.b))) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 27:
                d = jl40.l(((uu30) obj).a, ((uu30) obj2).a);
                break;
            case 28:
                d = ((ru.yandex.taxi.masstransit.geopayment.tickets.model.a) obj).c((ru.yandex.taxi.masstransit.geopayment.tickets.model.a) obj2);
                break;
            default:
                uu30 uu30Var3 = (uu30) obj;
                uu30 uu30Var4 = (uu30) obj2;
                ZoneAddress zoneAddress5 = uu30Var3.a;
                Address address2 = zoneAddress5 != null ? zoneAddress5.a : null;
                ZoneAddress zoneAddress6 = uu30Var4.a;
                if (jl40.l(address2, zoneAddress6 != null ? zoneAddress6.a : null)) {
                    ZoneAddress zoneAddress7 = uu30Var3.a;
                    Zone zone2 = zoneAddress7 != null ? zoneAddress7.b : null;
                    ZoneAddress zoneAddress8 = uu30Var4.a;
                    if (jl40.l(zone2, zoneAddress8 != null ? zoneAddress8.b : null)) {
                        r5 = true;
                    }
                }
                return Boolean.valueOf(r5);
        }
        return Boolean.valueOf(d);
    }

    public /* synthetic */ i0z(int i, int i2) {
        this.a = i2;
    }

    public /* synthetic */ i0z(int i) {
        this.a = i;
    }
}
