package com.yandex.div.internal.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import xsna.ttp0;
import xsna.zk3;

/* compiled from: Collections.kt */
/* loaded from: classes7.dex */
public final class CollectionsKt {
    public static final boolean allIsNullOrEmpty(List<?>... listArr) {
        for (List<?> list : listArr) {
            if (list != null && !list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static final <K, V> Map<K, V> arrayMap() {
        return new zk3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> immutableCopy(List<? extends T> list) {
        return ttp0.f(list) ? Collections.unmodifiableList(new ArrayList(list)) : list;
    }
}
