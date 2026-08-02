package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.j5g;

/* renamed from: io.appmetrica.analytics.impl.z3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5335z3 implements InterfaceC4998lo {
    @Override // io.appmetrica.analytics.impl.InterfaceC4998lo, xsna.wzs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<D3> invoke(List<D3> list, D3 d3) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                EnumC4801e8 enumC4801e8 = ((D3) it.next()).b;
                EnumC4801e8 enumC4801e82 = d3.b;
                if (enumC4801e8 == enumC4801e82) {
                    if (enumC4801e82 != EnumC4801e8.c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((D3) obj).b != EnumC4801e8.c) {
                            arrayList.add(obj);
                        }
                    }
                    return j5g.v0(d3, arrayList);
                }
            }
        }
        return j5g.v0(d3, list);
    }
}
