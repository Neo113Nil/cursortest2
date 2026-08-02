package com.yandex.go.payments.sbp.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/payments/sbp/domain/ErrorType;", "", "DEFAULT_ERROR", "REDIRECTION_ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ErrorType[] $VALUES;
    public static final ErrorType DEFAULT_ERROR;
    public static final ErrorType REDIRECTION_ERROR;

    static {
        ErrorType errorType = new ErrorType("DEFAULT_ERROR", 0);
        DEFAULT_ERROR = errorType;
        ErrorType errorType2 = new ErrorType("REDIRECTION_ERROR", 1);
        REDIRECTION_ERROR = errorType2;
        ErrorType[] errorTypeArr = {errorType, errorType2};
        $VALUES = errorTypeArr;
        $ENTRIES = kotlin.enums.a.a(errorTypeArr);
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) $VALUES.clone();
    }
}
