package defpackage;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.sequences.b;
import ru.yandex.taxi.object.RouteVehicleType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ld0l0;", "", "Companion", "zzk0", "yzk0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d0l0 {
    public static final zzk0 Companion = new zzk0();
    public static final i3y[] f = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new eqj0(19))};
    public final ZoneAddress a;
    public final List b;
    public final RouteVehicleType c;
    public final i3y d;
    public final i3y e;

    public /* synthetic */ d0l0(int i, ZoneAddress zoneAddress, List list) {
        this.a = (i & 1) == 0 ? null : zoneAddress;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        this.c = RouteVehicleType.TAXI;
        this.d = a.a(new wzk0(this, 0));
        this.e = a.a(new wzk0(this, 1));
    }

    public final List a() {
        return (List) this.d.getValue();
    }

    public final Address b() {
        return (Address) kotlin.collections.a.b0(this.b);
    }

    public final boolean c() {
        return this.a == null && this.b.isEmpty();
    }

    public final List d(boolean z, boolean z2) {
        ZoneAddress zoneAddress = this.a;
        if (zoneAddress == null) {
            return EmptyList.a;
        }
        List list = this.b;
        int i = 1;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        if (!z2) {
            arrayList.add(zoneAddress.a.B());
        }
        b.r(new yw01(b.g(new h73(i, list), new wsg(z, i)), new qda0(28)), arrayList);
        return arrayList;
    }

    public final d0l0 e(int i) {
        List list = this.b;
        if (!vez0.g0(i, "Can't remove destination address", list)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.remove(i);
        return new d0l0(this.a, arrayList, this.c);
    }

    public final d0l0 f(Address address, boolean z) {
        List list;
        if (!z && z81.b(address, b())) {
            return this;
        }
        List list2 = this.b;
        if (list2.isEmpty()) {
            list = Collections.singletonList(address);
        } else {
            ArrayList arrayList = new ArrayList(list2);
            arrayList.set(scc.f(arrayList), address);
            list = arrayList;
        }
        return new d0l0(this.a, list, this.c);
    }

    public final boolean g(d0l0 d0l0Var) {
        List d = d(false, false);
        List d2 = d0l0Var.d(false, false);
        if (this.c == d0l0Var.c && d.size() == d2.size()) {
            int size = d.size();
            for (int i = 0; i < size; i++) {
                zzs zzsVar = (zzs) d.get(i);
                zzs zzsVar2 = (zzs) d2.get(i);
                uzs uzsVar = zzs.Companion;
                if (zzsVar.a(zzsVar2, 1.0E-6d)) {
                }
            }
            return true;
        }
        return false;
    }

    public final Address h() {
        ZoneAddress zoneAddress = this.a;
        if (zoneAddress != null) {
            return zoneAddress.a;
        }
        return null;
    }

    public final d0l0 i(Address address) {
        List list = this.b;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(address);
        return new d0l0(this.a, arrayList, this.c);
    }

    public final d0l0 j(int i, Address address) {
        List list = this.b;
        if (vez0.g0(i, "Can't update destination address", list)) {
            Address address2 = (Address) list.get(i);
            if (!z81.b(address2, address) || address2.f0()) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.set(i, address);
                return new d0l0(this.a, arrayList, this.c);
            }
        }
        return this;
    }

    public final d0l0 k(List list) {
        return new d0l0(this.a, list, this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d0l0 l(ZoneAddress zoneAddress) {
        Address h = h();
        Address address = zoneAddress != null ? zoneAddress.a : null;
        boolean z = false;
        boolean z2 = address != null && address.f0();
        AddressDTO addressDTO = z81.a;
        if (address != h) {
            if (h != null && address != null && z81.e(address).equals(z81.e(h)) && address.getGeoPointAcquisitionType() == h.getGeoPointAcquisitionType()) {
                if (address.getAddress() != h.getAddress()) {
                    z = z81.b(address, h);
                }
            }
            if (z) {
                Zone zone = zoneAddress != null ? zoneAddress.b : null;
                ZoneAddress zoneAddress2 = this.a;
                if (zone == (zoneAddress2 != null ? zoneAddress2.b : null) && !z2) {
                    if (h != null && address != null) {
                        h.y1(address.getRequestTime());
                        PlainAddress plainAddress = (PlainAddress) h;
                        plainAddress.a(address.x0());
                        plainAddress.b(address.a0());
                        zzs originPoint = address.getOriginPoint();
                        if (originPoint != null) {
                            plainAddress.k(originPoint);
                        }
                    }
                    return this;
                }
            }
            return new d0l0(zoneAddress, this.b, this.c);
        }
        z = true;
        if (z) {
        }
        return new d0l0(zoneAddress, this.b, this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0l0() {
        this((ZoneAddress) null, (List) (0 == true ? 1 : 0), 7);
    }

    public d0l0(ZoneAddress zoneAddress, List list, RouteVehicleType routeVehicleType) {
        this.a = zoneAddress;
        this.b = list;
        this.c = routeVehicleType;
        final int i = 0;
        this.d = a.a(new sls(this) { // from class: xzk0
            public final /* synthetic */ d0l0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                Object obj = EmptyList.a;
                d0l0 d0l0Var = this.b;
                switch (i2) {
                    case 0:
                        ZoneAddress zoneAddress2 = d0l0Var.a;
                        List list2 = d0l0Var.b;
                        if (zoneAddress2 == null) {
                            return obj;
                        }
                        ArrayList arrayList = new ArrayList(list2.size() + 1);
                        arrayList.add(zoneAddress2.a);
                        arrayList.addAll(list2);
                        return arrayList;
                    default:
                        List list3 = d0l0Var.b;
                        if (list3.size() >= 2) {
                            int size = list3.size() - 1;
                            obj = new ArrayList(size);
                            for (int i3 = 0; i3 < size; i3++) {
                                obj.add(((Address) list3.get(i3)).B());
                            }
                        }
                        return obj;
                }
            }
        });
        final int i2 = 1;
        this.e = a.a(new sls(this) { // from class: xzk0
            public final /* synthetic */ d0l0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                Object obj = EmptyList.a;
                d0l0 d0l0Var = this.b;
                switch (i22) {
                    case 0:
                        ZoneAddress zoneAddress2 = d0l0Var.a;
                        List list2 = d0l0Var.b;
                        if (zoneAddress2 == null) {
                            return obj;
                        }
                        ArrayList arrayList = new ArrayList(list2.size() + 1);
                        arrayList.add(zoneAddress2.a);
                        arrayList.addAll(list2);
                        return arrayList;
                    default:
                        List list3 = d0l0Var.b;
                        if (list3.size() >= 2) {
                            int size = list3.size() - 1;
                            obj = new ArrayList(size);
                            for (int i3 = 0; i3 < size; i3++) {
                                obj.add(((Address) list3.get(i3)).B());
                            }
                        }
                        return obj;
                }
            }
        });
    }

    public /* synthetic */ d0l0(ZoneAddress zoneAddress, List list, int i) {
        this((i & 1) != 0 ? null : zoneAddress, (i & 2) != 0 ? EmptyList.a : list, RouteVehicleType.TAXI);
    }
}
