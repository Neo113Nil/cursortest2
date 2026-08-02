package xsna;

import android.location.Location;
import com.vk.api.generated.address.dto.AddressFieldsDto;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import com.vk.api.generated.market.dto.MarketGetAddressesResponseDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.MetroStation;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vk.superapp.api.dto.identity.WebCountry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: MarketGetAddressesRequest.kt */
/* loaded from: classes15.dex */
public final class ez00 extends awi<VKList<Address>> {
    public final fz00 s;

    public ez00(fz00 fz00Var) {
        this.s = fz00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x021f  */
    @Override // xsna.xz2, xsna.nx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(l7r0 l7r0Var) {
        tfx tfxVar;
        ArrayList arrayList;
        mqt f;
        fz00 fz00Var = this.s;
        UserId userId = fz00Var.a;
        int i = (int) fz00Var.b;
        int i2 = fz00Var.c;
        Location location = fz00Var.d;
        Float valueOf = location != null ? Float.valueOf((float) location.getLatitude()) : null;
        Float valueOf2 = location != null ? Float.valueOf((float) location.getLongitude()) : null;
        List<AddressFieldsDto> list = fz00Var.e;
        tfx tfxVar2 = new tfx("market.getAddresses", new fq(19), new gq(25));
        tfx.n(tfxVar2, "owner_id", userId, 0L, 0L, 4);
        tfx.l(tfxVar2, "item_id", i, 0, 0, 8);
        tfxVar2.f(30, 0, 100, "count");
        tfxVar2.f(i2, 0, 100, SignalingProtocol.KEY_OFFSET);
        if (valueOf != null) {
            tfxVar = tfxVar2;
            tfxVar.h("latitude", valueOf.floatValue(), -90.0d, 90.0d);
        } else {
            tfxVar = tfxVar2;
        }
        if (valueOf2 != null) {
            tfxVar.h("longitude", valueOf2.floatValue(), -180.0d, 180.0d);
        }
        tfx tfxVar3 = tfxVar;
        if (list != null) {
            List<AddressFieldsDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AddressFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar3.i("fields", arrayList);
        }
        MarketGetAddressesResponseDto marketGetAddressesResponseDto = (MarketGetAddressesResponseDto) yfb.x(tfxVar3).f(l7r0Var);
        List<GroupsAddressDto> d = marketGetAddressesResponseDto.d();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = d.iterator();
        while (it2.hasNext()) {
            Integer u = ((GroupsAddressDto) it2.next()).u();
            if (u != null) {
                arrayList2.add(u);
            }
        }
        if (!arrayList2.isEmpty()) {
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    if (((Number) it3.next()).intValue() == 0) {
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it4 = d.iterator();
            while (it4.hasNext()) {
                Integer g = ((GroupsAddressDto) it4.next()).g();
                if (g != null) {
                    arrayList3.add(g);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it5 = d.iterator();
            while (it5.hasNext()) {
                Integer j = ((GroupsAddressDto) it5.next()).j();
                if (j != null) {
                    arrayList4.add(j);
                }
            }
            edi ediVar = new edi(9);
            dz2 x = yfb.x(ediVar.r(arrayList3));
            dz2 x2 = yfb.x(ediVar.s(arrayList4));
            tfx tfxVar4 = new tfx("database.getMetroStationsById", new com.vk.movika.sdk.android.defaultplayer.view.a(13), new er(11));
            tfxVar4.i("station_ids", arrayList2);
            f = new lqt(x, x2, yfb.x(tfxVar4)).f(l7r0Var);
            LinkedHashMap linkedHashMap = f.b;
            LinkedHashMap linkedHashMap2 = f.a;
            Map<Integer, MetroStation> map = f.c;
            List<GroupsAddressDto> d2 = marketGetAddressesResponseDto.d();
            ArrayList arrayList5 = new ArrayList(c5g.u(d2, 10));
            for (GroupsAddressDto groupsAddressDto : d2) {
                Address v = fz5.v(groupsAddressDto);
                Integer g2 = groupsAddressDto.g();
                v.h = g2 != null ? (WebCity) linkedHashMap2.getOrDefault(Integer.valueOf(g2.intValue()), null) : null;
                Integer j2 = groupsAddressDto.j();
                v.i = j2 != null ? (WebCountry) linkedHashMap.getOrDefault(Integer.valueOf(j2.intValue()), null) : null;
                Integer u2 = groupsAddressDto.u();
                if (u2 != null) {
                    v.l = u2.intValue();
                }
                Integer u3 = groupsAddressDto.u();
                v.p = u3 != null ? map.getOrDefault(Integer.valueOf(u3.intValue()), null) : null;
                arrayList5.add(v);
            }
            return new VKList(arrayList5);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator<T> it6 = d.iterator();
        while (it6.hasNext()) {
            Integer g3 = ((GroupsAddressDto) it6.next()).g();
            if (g3 != null) {
                arrayList6.add(g3);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator<T> it7 = d.iterator();
        while (it7.hasNext()) {
            Integer j3 = ((GroupsAddressDto) it7.next()).j();
            if (j3 != null) {
                arrayList7.add(j3);
            }
        }
        edi ediVar2 = new edi(9);
        f = new nqt(yfb.x(ediVar2.r(arrayList6)), yfb.x(ediVar2.s(arrayList7))).f(l7r0Var);
        LinkedHashMap linkedHashMap3 = f.b;
        LinkedHashMap linkedHashMap22 = f.a;
        Map<Integer, MetroStation> map2 = f.c;
        List<GroupsAddressDto> d22 = marketGetAddressesResponseDto.d();
        ArrayList arrayList52 = new ArrayList(c5g.u(d22, 10));
        while (r2.hasNext()) {
        }
        return new VKList(arrayList52);
    }
}
