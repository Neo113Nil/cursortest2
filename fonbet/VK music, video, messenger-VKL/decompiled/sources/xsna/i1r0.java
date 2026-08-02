package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserStorageModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: UsersMergeTask.kt */
/* loaded from: classes2.dex */
public final class i1r0 extends b920 {
    public final Map<Long, User> c;
    public final long d;

    public i1r0(long j, Collection collection) {
        HashMap hashMap = new HashMap(collection.size());
        for (Object obj : collection) {
            hashMap.put(Long.valueOf(((User) obj).b), obj);
        }
        this.c = hashMap;
        this.d = j;
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        Map<Long, User> map = this.c;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Long, User>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            User value = it.next().getValue();
            long j = this.d;
            arrayList.add(new UserStorageModel(value, 0L, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, false, 0, null, false, false, null, false, j, j, null, null, null, null, null, null, null, false, false, null, false, false, -1610612738, 2047, null));
        }
        w2wVar.I0().d().a(arrayList);
        Set<Long> keySet = map.keySet();
        ArrayList arrayList2 = new ArrayList(c5g.u(keySet, 10));
        Iterator<T> it2 = keySet.iterator();
        while (it2.hasNext()) {
            long longValue = ((Number) it2.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList2.add(Peer.a.b(longValue));
        }
        return ((wpp) w2wVar.L0(this, new b1r0(arrayList2, Source.CACHE))).c;
    }

    public i1r0(Map<Long, User> map, long j) {
        this.c = pn00.t(map);
        this.d = j;
    }
}
