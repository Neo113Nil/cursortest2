package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.e43;
import xsna.j5g;

/* renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4868gn implements InterfaceC5076oo {
    public final ArrayList a;

    public C4868gn(String str, List<String> list, int i, Vn vn, Co co, V2 v2) {
        List H0 = j5g.H0(j5g.O0(j5g.S0(list)), i);
        ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
        int i2 = 0;
        for (Object obj : H0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            arrayList.add(new C4919in(str + '_' + i2, (String) obj, vn, co, v2));
            i2 = i3;
        }
        this.a = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5076oo
    public final void a(C5050no c5050no) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((C4919in) it.next()).a(c5050no);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5076oo
    public final void a(PublicLogger publicLogger) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((C4919in) it.next()).e = publicLogger;
        }
    }
}
