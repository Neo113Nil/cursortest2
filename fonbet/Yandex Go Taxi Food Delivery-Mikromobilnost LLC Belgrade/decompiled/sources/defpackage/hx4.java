package defpackage;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.address.models.PlainAddress;
import java.util.LinkedHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public abstract class hx4 extends vfx {
    public static PlainAddress c(ncx ncxVar) {
        String str;
        String g;
        Boolean f;
        c m = qcx.m(ncxVar.t());
        b bVar = (b) m.get("is_userplace");
        boolean booleanValue = (bVar == null || (f = qcx.f(qcx.n(bVar))) == null) ? false : f.booleanValue();
        b bVar2 = (b) m.get("zone_name");
        String str2 = "";
        if (bVar2 == null || (str = qcx.g(qcx.n(bVar2))) == null) {
            str = "";
        }
        if (!booleanValue) {
            AddressDTO addressDTO = (AddressDTO) ncxVar.d().a(AddressDTO.Companion.serializer(), m);
            PlainAddress.Companion.getClass();
            PlainAddress plainAddress = new PlainAddress(addressDTO);
            plainAddress.p(str);
            return plainAddress;
        }
        b bVar3 = (b) m.get("place_type");
        if (bVar3 != null && (g = qcx.g(qcx.n(bVar3))) != null) {
            str2 = g;
        }
        PlaceType.Companion.getClass();
        PlaceType a = i3c0.a(str2);
        b bVar4 = (b) m.get("datum_type");
        String g2 = bVar4 != null ? qcx.g(qcx.n(bVar4)) : null;
        FavoriteAddressDatumType.Companion.getClass();
        FavoriteAddressDatumType a2 = wcp.a(g2);
        b bVar5 = (b) m.get("id");
        String g3 = bVar5 != null ? qcx.g(qcx.n(bVar5)) : null;
        b bVar6 = (b) m.get("address");
        if (bVar6 == null) {
            yci0.m("Missing 'address' field for user place");
            return null;
        }
        AddressDTO addressDTO2 = (AddressDTO) ncxVar.d().a(AddressDTO.Companion.serializer(), bVar6);
        PlainAddress.Companion.getClass();
        return new PlainAddress(addressDTO2, g3, a, a2);
    }

    public static void d(vcx vcxVar, Address address) {
        sbx d = vcxVar.d();
        KSerializer serializer = AddressDTO.Companion.serializer();
        AddressDTO address2 = address.getAddress();
        d.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(qcx.m(gwk0.J(d, address2, serializer)));
        String zoneName = address.getZoneName();
        if (zoneName != null) {
            if (zoneName.length() <= 0) {
                zoneName = null;
            }
            if (zoneName != null) {
                linkedHashMap.put("zone_name", qcx.c(zoneName));
            }
        }
        String pickMethod = address.getPickMethod();
        if (pickMethod != null) {
            if (pickMethod.length() <= 0) {
                pickMethod = null;
            }
            if (pickMethod != null) {
                linkedHashMap.put("metrica_method", qcx.c(pickMethod));
            }
        }
        String pickAction = address.getPickAction();
        if (pickAction != null) {
            if (pickAction.length() <= 0) {
                pickAction = null;
            }
            if (pickAction != null) {
                linkedHashMap.put("metrica_action", qcx.c(pickAction));
            }
        }
        String J1 = address.J1();
        if (J1 != null) {
            String str = J1.length() > 0 ? J1 : null;
            if (str != null) {
                linkedHashMap.put("porchnumber", qcx.c(str));
            }
        }
        Object extraData = address.getExtraData();
        if (extraData != null) {
            sbx d2 = vcxVar.d();
            KSerializer J = gtq0.J(qoi0.a(extraData.getClass()));
            d2.getClass();
            linkedHashMap.put("extra_data", gwk0.J(d2, extraData, J));
        }
        vcxVar.p(new c(linkedHashMap));
    }
}
