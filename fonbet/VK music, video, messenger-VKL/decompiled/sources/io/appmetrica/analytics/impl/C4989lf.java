package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.j5g;

/* renamed from: io.appmetrica.analytics.impl.lf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4989lf implements InterfaceC4998lo {
    public final boolean a;

    public C4989lf(C5041nf c5041nf) {
        boolean z;
        List<C5015mf> list = c5041nf.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C5015mf) it.next()).c == EnumC4801e8.c) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        this.a = z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4998lo, xsna.wzs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C5015mf> invoke(List<? extends C5015mf> list, Af af) {
        C5015mf c5015mf = new C5015mf(af.a, af.b, af.e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C5015mf) it.next()).c == af.e) {
                    if (c5015mf.c == EnumC4801e8.c && this.a) {
                        return j5g.v0(c5015mf, list);
                    }
                    return null;
                }
            }
        }
        return j5g.v0(c5015mf, list);
    }
}
