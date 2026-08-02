package com.yandex.go.superapp.orders.card.header.trails;

import com.yandex.go.superapp.orders.card.header.trails.OrderCardIconStackView;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderCardIconStackView.Order.values().length];
        try {
            iArr[OrderCardIconStackView.Order.Descending.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderCardIconStackView.Order.Ascending.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
