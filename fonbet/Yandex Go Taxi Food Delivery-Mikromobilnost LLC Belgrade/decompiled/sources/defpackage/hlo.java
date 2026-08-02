package defpackage;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class hlo implements Enumeration {
    public final Enumeration a;

    public hlo(ilo iloVar) {
        this.a = Collections.enumeration(iloVar.a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return new HashMap((Map) this.a.nextElement());
    }
}
