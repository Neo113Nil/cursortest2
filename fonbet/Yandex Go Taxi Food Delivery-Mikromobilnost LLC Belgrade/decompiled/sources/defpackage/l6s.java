package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.PaymentInfoComplementDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.PaymentInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointCommentImageDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.definitions.RoutePointContactDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormClientStateDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormStateContactDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormStateCostCenterDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormStateDeliveryExtraDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate.FormStateRoutePointDto;

/* loaded from: classes5.dex */
public final class l6s {
    public final jwh a;
    public final JsonAdapter b;
    public final JsonAdapter c;
    public final JsonAdapter d;
    public final JsonAdapter e;

    public l6s(jwh jwhVar, Moshi moshi) {
        this.a = jwhVar;
        this.b = moshi.adapter(FormClientStateDto.class);
        this.c = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class));
        this.d = moshi.adapter(RoutePointCommentImageDto.class);
        this.e = moshi.adapter(Object.class);
    }

    public static FormStateRoutePointDto b(qv0 qv0Var, boolean z) {
        oo0 oo0Var = qv0Var.a;
        if (oo0Var == null) {
            return null;
        }
        a0t a0tVar = oo0Var.f;
        List g = scc.g(String.valueOf(a0tVar.b), String.valueOf(a0tVar.a));
        FormStateRoutePointDto.TypeDto typeDto = z ? FormStateRoutePointDto.TypeDto.SOURCE : FormStateRoutePointDto.TypeDto.DESTINATION;
        String str = oo0Var.c;
        String str2 = oo0Var.e;
        String str3 = oo0Var.a;
        String str4 = oo0Var.d;
        String str5 = qv0Var.b;
        String str6 = evu0.J(str5) ? null : str5;
        String str7 = qv0Var.f;
        String str8 = evu0.J(str7) ? null : str7;
        String str9 = qv0Var.d;
        String str10 = evu0.J(str9) ? null : str9;
        String str11 = qv0Var.c;
        String str12 = evu0.J(str11) ? null : str11;
        String str13 = qv0Var.e;
        String str14 = evu0.J(str13) ? null : str13;
        RoutePointContactDto c = c(qv0Var.g);
        List list = qv0Var.h;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof lkb0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lkb0 lkb0Var = (lkb0) it.next();
            arrayList2.add(new RoutePointCommentImageDto(lkb0Var.b(), lkb0Var.a()));
        }
        return new FormStateRoutePointDto(str2, str3, str4, str6, str8, str10, str12, c, str14, typeDto, str, g, arrayList2);
    }

    public static RoutePointContactDto c(s9e s9eVar) {
        if (s9eVar.equals(new s9e(0))) {
            return null;
        }
        return new RoutePointContactDto(s9eVar.b, s9eVar.a);
    }

    public static FormClientStateDto d(j6s j6sVar) {
        ArrayList arrayList;
        PaymentInfoDto paymentInfoDto;
        ArrayList arrayList2;
        ArrayList e = e(j6sVar.c);
        Map map = j6sVar.e;
        if (map.isEmpty()) {
            map = null;
        }
        if (map != null) {
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new FormStateContactDto(((Number) entry.getKey()).intValue(), ((s9e) entry.getValue()).b));
            }
        } else {
            arrayList = null;
        }
        mea0 mea0Var = j6sVar.b;
        if (mea0Var != null) {
            String str = j6sVar.g;
            String str2 = mea0Var.b;
            String str3 = mea0Var.a;
            List<k1a0> list = mea0Var.g;
            ArrayList arrayList3 = new ArrayList(tcc.n(list, 10));
            for (k1a0 k1a0Var : list) {
                arrayList3.add(new PaymentInfoComplementDto(k1a0Var.a, k1a0Var.b));
            }
            paymentInfoDto = new PaymentInfoDto(str2, str3, str, arrayList3);
        } else {
            paymentInfoDto = null;
        }
        e0l0 e0l0Var = j6sVar.d;
        if (e0l0Var.a.isEmpty()) {
            e0l0Var = null;
        }
        ArrayList e2 = e0l0Var != null ? e(e0l0Var) : null;
        List list2 = j6sVar.f;
        if (list2 != null) {
            List<bwe> list3 = list2;
            ArrayList arrayList4 = new ArrayList(tcc.n(list3, 10));
            for (bwe bweVar : list3) {
                arrayList4.add(new FormStateCostCenterDto(bweVar.b, bweVar.a, bweVar.c, Boolean.valueOf(bweVar.d)));
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        l9i l9iVar = j6sVar.h;
        return new FormClientStateDto(e, arrayList, paymentInfoDto, e2, arrayList2, l9iVar != null ? new FormStateDeliveryExtraDto(Boolean.valueOf(l9iVar.a), Boolean.valueOf(l9iVar.b), Boolean.FALSE) : null, j6sVar.i);
    }

    public static ArrayList e(e0l0 e0l0Var) {
        List list = e0l0Var.a;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            FormStateRoutePointDto b = b((qv0) obj, i == 0);
            if (b != null) {
                arrayList.add(b);
            }
            i = i2;
        }
        return arrayList;
    }

    public final Map a(FormClientStateDto formClientStateDto) {
        Object jsonValue = this.b.toJsonValue(formClientStateDto);
        Map map = jsonValue instanceof Map ? (Map) jsonValue : null;
        return map == null ? b.f() : map;
    }

    public final LinkedHashMap f(j6s j6sVar) {
        if (j6sVar.c.a.isEmpty()) {
            this.a.a.o("Delivery.OrderForm.Failed.StartLocationNull", null, new LinkedHashMap());
        }
        return b.n(j6sVar.a, a(d(j6sVar)));
    }
}
