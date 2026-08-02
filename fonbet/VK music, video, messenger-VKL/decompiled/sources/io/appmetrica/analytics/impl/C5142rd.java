package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.rd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5142rd extends AbstractC4733bh {
    public final ArrayList b;

    public C5142rd(C4927j5 c4927j5) {
        super(c4927j5);
        String b = c4927j5.b().b();
        b = b == null ? "empty" : b;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{b}, 1));
        LinkedHashMap a = C5342za.k().o().a(b);
        ArrayList arrayList = new ArrayList(a.size());
        for (Map.Entry entry : a.entrySet()) {
            arrayList.add(new Pair(entry.getValue(), new C4806ed(c4927j5, (String) entry.getKey())));
        }
        this.b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(C4722b6 c4722b6) {
        ArrayList arrayList;
        if (this.a.t.c() && ((arrayList = this.b) == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) pair.d();
                C4806ed c4806ed = (C4806ed) pair.g();
                if (moduleServiceEventHandler.handle(new C4884hd(c4806ed.b, c4806ed.a, new C4858gd(c4806ed.d, c4806ed.c, c4722b6)), c4722b6)) {
                    return true;
                }
            }
        }
        return false;
    }
}
