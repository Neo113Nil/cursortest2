package com.yandex.passport.internal.push;

import com.yandex.passport.api.PushPlatform;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class h0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PushSubscriber$SubscriptionResult.values().length];
        try {
            iArr[PushSubscriber$SubscriptionResult.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PushSubscriber$SubscriptionResult.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PushSubscriber$SubscriptionResult.INAPPLICABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[PushPlatform.values().length];
        try {
            iArr2[PushPlatform.FCM.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PushPlatform.HMS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PushPlatform.RuStore.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
