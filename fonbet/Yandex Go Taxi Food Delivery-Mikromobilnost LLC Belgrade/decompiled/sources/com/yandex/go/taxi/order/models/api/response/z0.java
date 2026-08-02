package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.tls;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class z0 {
    public static OrderChangesDto a(tls tlsVar, String str) {
        OrderChangesDto.a aVar = new OrderChangesDto.a();
        tlsVar.invoke(aVar);
        LinkedHashMap linkedHashMap = aVar.a;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new OrderChangesDto.ChangesPayload((String) entry.getKey(), (List) entry.getValue()));
        }
        return new OrderChangesDto(str, arrayList);
    }

    public final KSerializer serializer() {
        return OrderChangesDto$$serializer.INSTANCE;
    }
}
