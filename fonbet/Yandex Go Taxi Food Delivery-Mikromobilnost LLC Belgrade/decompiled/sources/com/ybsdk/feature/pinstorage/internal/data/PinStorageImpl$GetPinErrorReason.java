package com.ybsdk.feature.pinstorage.internal.data;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/ybsdk/feature/pinstorage/internal/data/PinStorageImpl$GetPinErrorReason", "", "Lcom/ybsdk/feature/pinstorage/internal/data/PinStorageImpl$GetPinErrorReason;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NO_UID", "GET_ACCOUNT_ERROR", "DATA_NULL_OR_EMPTY", "NOTHING_FOR_DEVICE_ID", "DESERIALIZATION", "feature-pin-storage-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PinStorageImpl$GetPinErrorReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinStorageImpl$GetPinErrorReason[] $VALUES;
    public static final PinStorageImpl$GetPinErrorReason DATA_NULL_OR_EMPTY;
    public static final PinStorageImpl$GetPinErrorReason DESERIALIZATION;
    public static final PinStorageImpl$GetPinErrorReason GET_ACCOUNT_ERROR;
    public static final PinStorageImpl$GetPinErrorReason NOTHING_FOR_DEVICE_ID;
    public static final PinStorageImpl$GetPinErrorReason NO_UID;
    private final String code;

    static {
        PinStorageImpl$GetPinErrorReason pinStorageImpl$GetPinErrorReason = new PinStorageImpl$GetPinErrorReason("NO_UID", 0, "NO_UID");
        NO_UID = pinStorageImpl$GetPinErrorReason;
        PinStorageImpl$GetPinErrorReason pinStorageImpl$GetPinErrorReason2 = new PinStorageImpl$GetPinErrorReason("GET_ACCOUNT_ERROR", 1, "GET_ACCOUNT_ERROR");
        GET_ACCOUNT_ERROR = pinStorageImpl$GetPinErrorReason2;
        PinStorageImpl$GetPinErrorReason pinStorageImpl$GetPinErrorReason3 = new PinStorageImpl$GetPinErrorReason("DATA_NULL_OR_EMPTY", 2, "DATA_NULL_OR_EMPTY");
        DATA_NULL_OR_EMPTY = pinStorageImpl$GetPinErrorReason3;
        PinStorageImpl$GetPinErrorReason pinStorageImpl$GetPinErrorReason4 = new PinStorageImpl$GetPinErrorReason("NOTHING_FOR_DEVICE_ID", 3, "NOTHING_FOR_DEVICE_ID");
        NOTHING_FOR_DEVICE_ID = pinStorageImpl$GetPinErrorReason4;
        PinStorageImpl$GetPinErrorReason pinStorageImpl$GetPinErrorReason5 = new PinStorageImpl$GetPinErrorReason("DESERIALIZATION", 4, "DESERIALIZATION");
        DESERIALIZATION = pinStorageImpl$GetPinErrorReason5;
        PinStorageImpl$GetPinErrorReason[] pinStorageImpl$GetPinErrorReasonArr = {pinStorageImpl$GetPinErrorReason, pinStorageImpl$GetPinErrorReason2, pinStorageImpl$GetPinErrorReason3, pinStorageImpl$GetPinErrorReason4, pinStorageImpl$GetPinErrorReason5};
        $VALUES = pinStorageImpl$GetPinErrorReasonArr;
        $ENTRIES = kotlin.enums.a.a(pinStorageImpl$GetPinErrorReasonArr);
    }

    public PinStorageImpl$GetPinErrorReason(String str, int i, String str2) {
        this.code = str2;
    }

    public static PinStorageImpl$GetPinErrorReason valueOf(String str) {
        return (PinStorageImpl$GetPinErrorReason) Enum.valueOf(PinStorageImpl$GetPinErrorReason.class, str);
    }

    public static PinStorageImpl$GetPinErrorReason[] values() {
        return (PinStorageImpl$GetPinErrorReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }
}
