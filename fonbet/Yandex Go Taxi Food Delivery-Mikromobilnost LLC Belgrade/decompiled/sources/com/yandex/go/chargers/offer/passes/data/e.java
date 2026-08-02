package com.yandex.go.chargers.offer.passes.data;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersPassesDataSource$RequestType.values().length];
        try {
            iArr[ChargersPassesDataSource$RequestType.PURCHASE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersPassesDataSource$RequestType.STATE_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
