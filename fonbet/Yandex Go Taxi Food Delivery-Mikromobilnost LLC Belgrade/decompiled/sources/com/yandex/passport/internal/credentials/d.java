package com.yandex.passport.internal.credentials;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.j;
import com.yandex.passport.internal.properties.p;
import defpackage.i3y;
import defpackage.jl40;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class d {
    public static final i3y b = kotlin.a.a(new com.yandex.passport.common.network.a(4));
    public static final i3y c = kotlin.a.a(new com.yandex.passport.common.network.a(5));
    public static final i3y d = kotlin.a.a(new com.yandex.passport.common.network.a(6));
    public final p a;

    public d(p pVar) {
        this.a = pVar;
    }

    public final j a(String str, Environment environment) {
        Object obj;
        Iterator it = ((List) d.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((j) obj).getDecryptedId(), str)) {
                break;
            }
        }
        j jVar = (j) obj;
        if (jVar != null) {
            return jVar;
        }
        p pVar = this.a;
        j jVar2 = (j) pVar.A.get(environment);
        j jVar3 = jl40.l(jVar2 != null ? jVar2.getDecryptedId() : null, str) ? jVar2 : null;
        return jVar3 == null ? com.yandex.passport.internal.util.p.g(pVar, environment) : jVar3;
    }
}
