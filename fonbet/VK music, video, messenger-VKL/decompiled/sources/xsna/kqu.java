package xsna;

import com.vk.im.engine.models.groups.Group;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: GroupsMergeTask.kt */
/* loaded from: classes2.dex */
public final class kqu extends b920 {
    public final Map<Long, Group> c;
    public final long d;

    public kqu(Map<Long, Group> map, long j) {
        this.c = map;
        this.d = j;
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        Map<Long, Group> map = this.c;
        if (map.isEmpty()) {
            return jgp.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), Group.zb((Group) entry.getValue(), false, false, this.d, 0, null, 536869887));
        }
        w2wVar.I0().n().a(linkedHashMap.values());
        return linkedHashMap;
    }
}
