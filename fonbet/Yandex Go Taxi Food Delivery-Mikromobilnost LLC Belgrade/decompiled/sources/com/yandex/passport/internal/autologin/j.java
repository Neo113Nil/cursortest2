package com.yandex.passport.internal.autologin;

import com.yandex.passport.common.core.Uid;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public final class j implements Comparator {
    public final /* synthetic */ Map a;

    public j(Map map) {
        this.a = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Uid uid = ((c) obj2).a;
        Map map = this.a;
        List list = (List) map.get(uid);
        Integer valueOf = Integer.valueOf(list != null ? list.size() : 0);
        List list2 = (List) map.get(((c) obj).a);
        return valueOf.compareTo(Integer.valueOf(list2 != null ? list2.size() : 0));
    }
}
