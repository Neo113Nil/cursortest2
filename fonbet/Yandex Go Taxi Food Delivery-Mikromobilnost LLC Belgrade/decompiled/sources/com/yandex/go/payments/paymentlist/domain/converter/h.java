package com.yandex.go.payments.paymentlist.domain.converter;

import java.util.Comparator;

/* loaded from: classes8.dex */
public final class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((d) obj).a.getOrderNumber()).compareTo(Integer.valueOf(((d) obj2).a.getOrderNumber()));
    }
}
