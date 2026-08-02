package com.ybsdk.api.pro;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/api/pro/ErrorType;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PDD", "UNKNOWN", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ErrorType[] $VALUES;
    public static final ErrorType PDD;
    public static final ErrorType UNKNOWN;
    private final String value;

    static {
        ErrorType errorType = new ErrorType("PDD", 0, "pdd");
        PDD = errorType;
        ErrorType errorType2 = new ErrorType("UNKNOWN", 1, "unknown");
        UNKNOWN = errorType2;
        ErrorType[] errorTypeArr = {errorType, errorType2};
        $VALUES = errorTypeArr;
        $ENTRIES = kotlin.enums.a.a(errorTypeArr);
    }

    public ErrorType(String str, int i, String str2) {
        this.value = str2;
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
