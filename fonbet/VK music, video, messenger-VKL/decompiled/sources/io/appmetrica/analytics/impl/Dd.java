package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.ArrayList;
import java.util.List;
import xsna.c5g;

/* loaded from: classes8.dex */
public final class Dd {
    public static ArrayList a() {
        C5013md c5013md;
        List<String> a = C5030n4.l().m.a();
        ArrayList arrayList = new ArrayList(c5g.u(a, 10));
        for (String str : a) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleClientEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c5013md = new C5013md(str, false);
            } else {
                C5030n4.l().m().b.add((ModuleClientEntryPoint) loadAndInstantiateClassWithDefaultConstructor);
                c5013md = new C5013md(str, true);
            }
            arrayList.add(c5013md);
        }
        return arrayList;
    }
}
