package com.yandex.go.taxi.order.info;

import com.yandex.go.taxi.order.info.OrderInfoModalView;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderInfoModalView.State.values().length];
        try {
            iArr[OrderInfoModalView.State.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderInfoModalView.State.FREIGHTAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
