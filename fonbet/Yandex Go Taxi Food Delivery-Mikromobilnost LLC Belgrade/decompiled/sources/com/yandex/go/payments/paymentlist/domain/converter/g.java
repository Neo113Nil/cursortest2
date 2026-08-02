package com.yandex.go.payments.paymentlist.domain.converter;

import java.util.Comparator;

/* loaded from: classes13.dex */
public final class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((d) obj).a.getOrderNumber()).compareTo(Integer.valueOf(((d) obj2).a.getOrderNumber()));
    }
}
