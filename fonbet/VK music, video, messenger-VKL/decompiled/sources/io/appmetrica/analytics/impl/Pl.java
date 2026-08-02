package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class Pl {
    public final /* synthetic */ Rl a;

    public Pl(Rl rl) {
        this.a = rl;
    }

    public final void a(String str, Tl tl, C5100pm c5100pm) {
        ArrayList arrayList;
        synchronized (this.a.b) {
            try {
                Collection collection = (Collection) this.a.a.a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC4712am) it.next()).a(tl, c5100pm);
        }
    }
}
