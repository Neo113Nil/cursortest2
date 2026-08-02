package com.yandex.go.scooters.passes.data;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersPassesRepositoryImpl$RequestType.values().length];
        try {
            iArr[ScootersPassesRepositoryImpl$RequestType.PURCHASE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersPassesRepositoryImpl$RequestType.STATE_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
