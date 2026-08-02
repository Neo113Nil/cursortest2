package xsna;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: ViewModelStore.kt */
/* loaded from: classes.dex */
public final class wyt0 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((nyt0) it.next()).f();
        }
        linkedHashMap.clear();
    }
}
