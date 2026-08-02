package com.yandex.go.charity.js;

import defpackage.di7;
import defpackage.hza;
import defpackage.k52;
import defpackage.qcx;
import defpackage.sbx;
import defpackage.wls;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.analytics.j;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class CharityCallApiJsPlugin$apply$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        hza hzaVar = (hza) this.receiver;
        hzaVar.getClass();
        c cVar = (c) sbx.d.b(c.Companion.serializer(), (String) obj);
        b bVar = (b) cVar.get("name");
        String g = bVar != null ? qcx.g(qcx.n(bVar)) : null;
        b bVar2 = (b) cVar.get(Constants.KEY_DATA);
        LinkedHashMap linkedHashMap = bVar2 != null ? new LinkedHashMap(qcx.m(bVar2)) : new LinkedHashMap();
        if (!linkedHashMap.containsKey("client_id")) {
            linkedHashMap.put("client_id", qcx.c("go"));
        }
        if (!linkedHashMap.containsKey("platform")) {
            linkedHashMap.put("platform", qcx.c(ConstantDeviceInfo.APP_PLATFORM));
        }
        if (g == null) {
            return new di7(null, "{}");
        }
        ((j) hzaVar.a).u(new k52(g, new c(linkedHashMap)));
        return new di7("{}", null);
    }
}
