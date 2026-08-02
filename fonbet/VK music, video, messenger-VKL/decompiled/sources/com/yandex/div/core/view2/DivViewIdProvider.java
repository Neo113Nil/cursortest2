package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div.internal.util.CollectionsKt;
import java.util.Map;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.iut0;

/* compiled from: DivViewIdProvider.kt */
/* loaded from: classes7.dex */
public final class DivViewIdProvider {
    private final Map<String, Integer> cache = CollectionsKt.arrayMap();

    public final int getViewId(String str) {
        if (str == null) {
            return -1;
        }
        Map<String, Integer> map = this.cache;
        Integer num = map.get(str);
        if (num == null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            num = Integer.valueOf(View.generateViewId());
            map.put(str, num);
        }
        return num.intValue();
    }
}
