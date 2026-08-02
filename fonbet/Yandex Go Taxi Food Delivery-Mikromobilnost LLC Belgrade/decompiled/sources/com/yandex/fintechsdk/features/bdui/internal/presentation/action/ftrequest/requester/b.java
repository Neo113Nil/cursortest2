package com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.requester;

import com.yandex.fintechsdk.core.network.api.request.RestMethod;
import defpackage.dbb1;
import defpackage.gw00;
import defpackage.kdx;
import defpackage.p6p;
import defpackage.v4j0;
import defpackage.w511;
import defpackage.wls;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes12.dex */
public final class b extends v4j0 {
    public final RestMethod b;
    public final String c;
    public final String d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final String h;

    public b(RestMethod restMethod, String str, String str2, Map map, Map map2, Map map3) {
        super(null);
        this.b = restMethod;
        this.c = str;
        this.d = str2;
        this.e = map;
        this.f = map2;
        this.g = map3;
        this.h = "ft_request_action-".concat(str2);
    }

    @Override // defpackage.v4j0
    public final kotlinx.serialization.json.c a() {
        int i = p6p.a[this.b.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        if (i != 3 && i != 4 && i != 5) {
            w511.b();
            return null;
        }
        kdx kdxVar = new kdx();
        Map map = this.e;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), dbb1.d(entry.getValue()));
            }
            final FTRequestActionRequest$body$1$2 fTRequestActionRequest$body$1$2 = new FTRequestActionRequest$body$1$2(2, kdxVar, kdx.class, "put", "put(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;", 8);
            linkedHashMap.forEach(new BiConsumer() { // from class: com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.requester.a
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ((FTRequestActionRequest$body$1$2) wls.this).invoke(obj, obj2);
                }
            });
        }
        return kdxVar.a();
    }

    @Override // defpackage.v4j0
    public final String b() {
        return this.c;
    }

    @Override // defpackage.v4j0
    public final RestMethod c() {
        return this.b;
    }

    @Override // defpackage.v4j0
    public final String d() {
        return this.h;
    }

    @Override // defpackage.v4j0
    public final String e() {
        return this.d;
    }

    @Override // defpackage.v4j0
    public final Map f() {
        Map map = this.f;
        return map == null ? kotlin.collections.b.f() : map;
    }

    @Override // defpackage.v4j0
    public final Map g() {
        Map map = this.g;
        return map == null ? kotlin.collections.b.f() : map;
    }
}
