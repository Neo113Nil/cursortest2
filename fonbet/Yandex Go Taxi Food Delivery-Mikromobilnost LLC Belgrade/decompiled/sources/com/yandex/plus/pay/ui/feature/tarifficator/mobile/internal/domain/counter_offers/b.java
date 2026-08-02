package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CounterOffersLinkInteractor$InternalAction.values().length];
        try {
            iArr[CounterOffersLinkInteractor$InternalAction.RETRY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CounterOffersLinkInteractor$InternalAction.CHANGE_PAYMENT_METHOD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
