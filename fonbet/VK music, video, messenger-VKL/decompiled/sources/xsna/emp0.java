package xsna;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: TransitionAutoPlayHolderOneShotCompositeListener.kt */
/* loaded from: classes2.dex */
public final class emp0 implements dmp0 {
    public final LinkedHashMap<Object, cmp0> b = new LinkedHashMap<>();

    @Override // xsna.dmp0
    public final void b() {
        LinkedHashMap<Object, cmp0> linkedHashMap = this.b;
        Iterator<T> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((dmp0) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
