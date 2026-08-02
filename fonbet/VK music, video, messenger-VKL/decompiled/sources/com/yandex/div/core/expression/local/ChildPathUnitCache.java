package com.yandex.div.core.expression.local;

import java.util.ArrayList;

/* compiled from: ChildPathUnitCache.kt */
/* loaded from: classes7.dex */
public final class ChildPathUnitCache {
    public static final ChildPathUnitCache INSTANCE = new ChildPathUnitCache();
    private static ArrayList<String> cache = new ArrayList<>();

    private ChildPathUnitCache() {
    }

    private final void ensureGenerated(int i) {
        if (cache.size() > i) {
            return;
        }
        cache.ensureCapacity(i + 1);
        int size = cache.size();
        if (size > i) {
            return;
        }
        while (true) {
            cache.add(size, "child#" + size);
            if (size == i) {
                return;
            } else {
                size++;
            }
        }
    }

    public final String getValue$div_release(int i) {
        ensureGenerated(i);
        return cache.get(i);
    }
}
