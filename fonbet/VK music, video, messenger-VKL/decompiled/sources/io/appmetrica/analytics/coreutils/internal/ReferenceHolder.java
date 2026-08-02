package io.appmetrica.analytics.coreutils.internal;

import java.util.LinkedHashSet;
import java.util.Set;
import xsna.j5g;

/* loaded from: classes8.dex */
public final class ReferenceHolder {
    private final LinkedHashSet a = new LinkedHashSet();

    public final Set<Object> peekReferences() {
        return j5g.S0(this.a);
    }

    public final void removeReference(Object obj) {
        this.a.remove(obj);
    }

    public final void storeReference(Object obj) {
        this.a.add(obj);
    }
}
