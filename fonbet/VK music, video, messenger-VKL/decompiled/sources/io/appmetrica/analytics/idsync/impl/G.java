package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.c5g;
import xsna.on00;

/* loaded from: classes8.dex */
public final class G {
    public final ModulePreferences a;
    public final F b = new F();
    public final String c = "request_state";
    public final Map d = new LinkedHashMap(a());

    public G(ModulePreferences modulePreferences) {
        this.a = modulePreferences;
    }

    public final LinkedHashMap a() {
        List<E> model = this.b.toModel(this.a.getString(this.c, null));
        int e = on00.e(c5g.u(model, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj : model) {
            linkedHashMap.put(((E) obj).a, obj);
        }
        return linkedHashMap;
    }
}
