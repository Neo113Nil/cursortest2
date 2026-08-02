package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.hfr;

/* compiled from: _Sequences.kt */
/* loaded from: classes8.dex */
public final class oli0 implements uki0<Object> {
    public final /* synthetic */ LinkedHashSet a;
    public final /* synthetic */ hfr b;

    public oli0(LinkedHashSet linkedHashSet, hfr hfrVar) {
        this.a = linkedHashSet;
        this.b = hfrVar;
    }

    @Override // xsna.uki0
    public final Iterator<Object> iterator() {
        Collection B = g5g.B(this.a);
        boolean isEmpty = B.isEmpty();
        hfr hfrVar = this.b;
        return isEmpty ? new hfr.a(hfrVar) : new hfr.a(rli0.l(hfrVar, new uh40(B, 26)));
    }
}
