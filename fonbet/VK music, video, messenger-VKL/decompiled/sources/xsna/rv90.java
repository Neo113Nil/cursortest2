package xsna;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: PerHostRequestsQueue.kt */
/* loaded from: classes2.dex */
public final class rv90 {
    public final int a;
    public final Set<ckv> b = Collections.newSetFromMap(new IdentityHashMap());
    public final LinkedList<ckv> c = new LinkedList<>();
    public final Set<ckv> d = Collections.newSetFromMap(new IdentityHashMap());

    public rv90(int i) {
        this.a = i;
    }

    public final boolean a(ckv ckvVar) {
        Set<ckv> set = this.d;
        if (!set.contains(ckvVar)) {
            return false;
        }
        set.remove(ckvVar);
        Set<ckv> set2 = this.b;
        boolean remove = set2.remove(ckvVar);
        LinkedList<ckv> linkedList = this.c;
        if (!remove) {
            linkedList.removeIf(new hfg(new nl30(ckvVar, 12), 1));
            return true;
        }
        if (linkedList.isEmpty()) {
            return true;
        }
        set2.add(linkedList.remove(0));
        return true;
    }
}
