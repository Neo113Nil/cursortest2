package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: BasicOwnerGrid.kt */
/* loaded from: classes17.dex */
public abstract class lt6 extends y490 {
    public final mde f;
    public List<ClipGridParams.Data.Profile> g;

    public lt6(mde mdeVar, UserId userId, wee weeVar, z490 z490Var, sdq0 sdq0Var) {
        super(userId, z490Var, weeVar, sdq0Var);
        this.f = mdeVar;
        this.g = EmptyList.b;
    }

    public final void d(nee neeVar, boolean z, boolean z2) {
        UserId userId;
        Long l;
        List<ClipGridParams.Data.Profile> list = this.g;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            userId = this.b;
            if (!hasNext) {
                break;
            }
            ClipGridParams.Data.Profile profile = (ClipGridParams.Data.Profile) it.next();
            if (epx.f(profile.b.b.b, userId)) {
                HashMap<String, Long> hashMap = neeVar.i;
                String str = neeVar.h;
                ClipsAuthor clipsAuthor = profile.b;
                Map<String, Long> linkedHashMap = hashMap != null ? new LinkedHashMap<>() : null;
                if (linkedHashMap != null) {
                    for (Map.Entry<String, Long> entry : clipsAuthor.c.entrySet()) {
                        String key = entry.getKey();
                        long longValue = entry.getValue().longValue();
                        if (hashMap != null && (l = hashMap.get(key)) != null) {
                            longValue = l.longValue();
                        }
                        linkedHashMap.put(key, Long.valueOf(longValue));
                    }
                }
                if (str == null) {
                    str = clipsAuthor.i;
                }
                if (linkedHashMap == null) {
                    linkedHashMap = clipsAuthor.c;
                }
                profile = new ClipGridParams.Data.Profile(ClipsAuthor.e(clipsAuthor, linkedHashMap, str, 125));
            }
            arrayList.add(profile);
        }
        this.g = arrayList;
        boolean z3 = z2 || z;
        wee weeVar = this.a;
        weeVar.y3(userId, arrayList, z3);
        weeVar.fh(userId, this.g);
        weeVar.Cj(userId, this.g);
        weeVar.d7(userId, this.g);
    }
}
