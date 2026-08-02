package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.OrderCancelProcessingObserver;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class s {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderCancelProcessingObserver.ProcessingState.values().length];
        try {
            iArr[OrderCancelProcessingObserver.ProcessingState.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderCancelProcessingObserver.ProcessingState.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OrderCancelProcessingObserver.ProcessingState.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OrderCancelProcessingObserver.ProcessingState.COMPLETE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
