package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class Ba {
    public final HashMap a;
    public final boolean b;

    public Ba() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.a.toString();
    }

    public Ba(boolean z) {
        this.a = new HashMap();
        this.b = z;
    }
}
