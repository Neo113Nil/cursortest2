package com.yandex.mapkit.maps.core.algorithm;

import defpackage.tls;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"T", "", "Lkotlin/Function1;", "", "comparator", "", "lowerBound", "(Ljava/util/List;Ltls;)I", "exported-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LowerBoundKt {
    public static final <T> int lowerBound(List<? extends T> list, tls tlsVar) {
        if (list.isEmpty()) {
            return -1;
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            if (((Boolean) tlsVar.invoke(list.get(i2))).booleanValue()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        if (i == list.size()) {
            return -1;
        }
        return i;
    }
}
