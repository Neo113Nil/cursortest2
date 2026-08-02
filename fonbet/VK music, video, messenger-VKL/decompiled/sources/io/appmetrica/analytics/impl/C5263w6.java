package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.g5g;

/* renamed from: io.appmetrica.analytics.impl.w6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5263w6 implements Ra {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Throwable th, V v) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Ra) it.next()).a(th, v);
        }
    }

    public final void a(Ra... raArr) {
        g5g.A(this.a, raArr);
    }

    public final void a(List<? extends Ra> list) {
        this.a.addAll(list);
    }

    public final void a() {
        this.a.clear();
    }
}
