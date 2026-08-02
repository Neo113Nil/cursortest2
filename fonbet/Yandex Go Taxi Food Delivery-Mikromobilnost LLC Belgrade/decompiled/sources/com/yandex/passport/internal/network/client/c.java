package com.yandex.passport.internal.network.client;

import com.yandex.passport.common.core.Environment;
import defpackage.kbs;
import java.util.Map;

/* loaded from: classes8.dex */
public final class c {
    public final Map a;
    public final Map b;

    public c(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final a a(Environment environment) {
        a aVar = (a) this.a.get(environment);
        if (aVar != null) {
            return aVar;
        }
        kbs.g("You must specify one of the possible passport environments");
        return null;
    }

    public final e b(Environment environment) {
        e eVar = (e) this.b.get(environment);
        if (eVar != null) {
            return eVar;
        }
        kbs.g("You must specify one of the possible passport environments");
        return null;
    }
}
