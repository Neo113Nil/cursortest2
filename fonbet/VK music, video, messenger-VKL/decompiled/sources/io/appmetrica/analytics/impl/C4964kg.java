package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import xsna.j5g;

/* renamed from: io.appmetrica.analytics.impl.kg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4964kg implements InterfaceC4861gg {
    public final /* synthetic */ C5068og a;

    public C4964kg(C5068og c5068og) {
        this.a = c5068og;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4861gg
    public final void a() {
        C5068og c5068og = this.a;
        ArrayList arrayList = c5068og.g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C5298xg c5298xg = (C5298xg) next;
            c5068og.c.getClass();
            String str = c5298xg != null ? c5298xg.a : null;
            if (str != null && str.length() != 0) {
                arrayList2.add(next);
            }
        }
        c5068og.a(c5068og.c.a(j5g.V(arrayList2)));
    }
}
