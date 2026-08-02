package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class elj {
    public final m6e0 a = new m6e0(10);
    public final ycs0 b = new ycs0();
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            kbs.g("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}
