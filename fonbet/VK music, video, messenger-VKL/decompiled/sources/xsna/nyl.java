package xsna;

import com.google.gson.Gson;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.points_map.feature.data.dto.SelectedDeliveryPointFilterDto;
import com.vk.internal.api.GsonHolder;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dcr;
import xsna.hfr;

/* compiled from: DeliveryPointsRepositoryImpl.kt */
/* loaded from: classes18.dex */
public final class nyl {
    public final yd10 a;
    public final swl b = new swl();
    public final vyl c = new vyl();

    public nyl(yd10 yd10Var) {
        this.a = yd10Var;
    }

    public final io.reactivex.rxjava3.internal.operators.single.r a(int i, List list, int i2, Coordinates coordinates, Integer num, List list2, UserId userId) {
        Gson a = GsonHolder.a();
        this.c.getClass();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        hfr.a aVar = new hfr.a(rli0.j(rli0.k(new i5g(list2), dcr.a.class), new rd1(13)));
        while (aVar.hasNext()) {
            dcr.a aVar2 = (dcr.a) aVar.next();
            String str = aVar2.e;
            int i3 = aVar2.d;
            List list3 = (List) linkedHashMap.get(str);
            if (list3 != null) {
                list3.add(Integer.valueOf(i3));
            } else {
                linkedHashMap.put(aVar2.e, e43.o(Integer.valueOf(i3)));
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new SelectedDeliveryPointFilterDto((String) entry.getKey(), (List) entry.getValue()));
        }
        String json = a.toJson(arrayList);
        Float valueOf = coordinates != null ? Float.valueOf((float) coordinates.b) : null;
        Float valueOf2 = coordinates != null ? Float.valueOf((float) coordinates.c) : null;
        Integer valueOf3 = Integer.valueOf(i);
        Integer valueOf4 = Integer.valueOf(i2);
        this.a.getClass();
        tfx tfxVar = new tfx("market.getCheckoutDeliveryPoints", new iq(16), new jq(21));
        tfx.l(tfxVar, AnalyticsBaseParamsConstantsKt.COUNTRY_ID, 1, 0, 0, 8);
        tfx.l(tfxVar, "city_id", valueOf3.intValue(), 0, 0, 8);
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, valueOf4.intValue(), 0, 0, 8);
        tfxVar.f(1000, 0, 1000, "count");
        if (list != null) {
            tfxVar.i("service_ids", list);
        }
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        }
        if (valueOf != null) {
            tfxVar.h("latitude", valueOf.floatValue(), -90.0d, 90.0d);
        }
        if (valueOf2 != null) {
            tfxVar.h("longitude", valueOf2.floatValue(), -180.0d, 180.0d);
        }
        tfx.l(tfxVar, "radius", num.intValue(), 0, 0, 8);
        if (json != null) {
            tfx.o(tfxVar, "filters", json, 0, 0, 12);
            tfxVar = tfxVar;
        }
        return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.w0(yfb.x(tfxVar)).l(new ju1(new l2i(this, 3), 21)), new gv(new myl(i2, this, i, list, coordinates, num, list2, userId), 16));
    }
}
