package com.ybsdk.feature.pinstorage.internal.data;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinStorageImpl$GetPinErrorReason.values().length];
        try {
            iArr[PinStorageImpl$GetPinErrorReason.DATA_NULL_OR_EMPTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinStorageImpl$GetPinErrorReason.NOTHING_FOR_DEVICE_ID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PinStorageImpl$GetPinErrorReason.NO_UID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PinStorageImpl$GetPinErrorReason.GET_ACCOUNT_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PinStorageImpl$GetPinErrorReason.DESERIALIZATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
