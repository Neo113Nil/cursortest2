package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;

/* renamed from: io.appmetrica.analytics.impl.do, reason: invalid class name */
/* loaded from: classes8.dex */
public abstract class Cdo {
    public static final C4714ao a(Throwable th, V v, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        Qn a = th != null ? Rn.a(th, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Nl((StackTraceElement) it.next()));
            }
        }
        return new C4714ao(a, v, arrayList, null, null, null, str, bool);
    }
}
