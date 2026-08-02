package com.yandex.passport.internal.badges;

import com.yandex.passport.data.network.core.m;
import com.yandex.passport.internal.a0;
import defpackage.auu0;
import defpackage.jl40;
import defpackage.k8u;
import defpackage.qcx;
import defpackage.zcx;
import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class f extends com.yandex.passport.common.domain.d {
    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        e eVar = (e) obj;
        zcx zcxVar = m.a;
        String b = eVar.b();
        zcxVar.getClass();
        Map map = (Map) zcxVar.b(new k8u(auu0.a, kotlinx.serialization.json.b.Companion.serializer(), 1), b);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            kotlinx.serialization.json.d dVar = value instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) value : null;
            if (!(dVar != null ? jl40.l(qcx.f(dVar), Boolean.TRUE) : false)) {
                key = null;
            }
            String str = (String) key;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return a0.u(eVar.a(), kotlin.collections.a.N0(arrayList));
    }
}
