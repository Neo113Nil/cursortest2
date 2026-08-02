package com.yandex.passport.internal.sso;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((c) obj2).e).compareTo(Integer.valueOf(((c) obj).e));
    }
}
