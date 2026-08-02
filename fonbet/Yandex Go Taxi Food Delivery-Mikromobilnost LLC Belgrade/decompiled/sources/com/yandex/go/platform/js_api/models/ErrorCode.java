package com.yandex.go.platform.js_api.models;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j6o;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0081\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/platform/js_api/models/ErrorCode;", "", "Companion", "j6o", "Unknown", "Failed", "Canceled", CA20Status.STATUS_USER_DESCRIPTION_I, "Incognito", "NoDefaultAccount", "AccountNotFound", "AccountNotAuthorized", "CredentialsNotFound", "IOError", "NumberFormat", "InvalidOptions", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ErrorCode[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ErrorCode AccountNotAuthorized;
    public static final ErrorCode AccountNotFound;
    public static final ErrorCode Canceled;
    public static final j6o Companion;
    public static final ErrorCode CredentialsNotFound;
    public static final ErrorCode Failed;
    public static final ErrorCode IOError;
    public static final ErrorCode Inactive;
    public static final ErrorCode Incognito;
    public static final ErrorCode InvalidOptions;
    public static final ErrorCode NoDefaultAccount;
    public static final ErrorCode NumberFormat;
    public static final ErrorCode Unknown;

    static {
        ErrorCode errorCode = new ErrorCode("Unknown", 0);
        Unknown = errorCode;
        ErrorCode errorCode2 = new ErrorCode("Failed", 1);
        Failed = errorCode2;
        ErrorCode errorCode3 = new ErrorCode("Canceled", 2);
        Canceled = errorCode3;
        ErrorCode errorCode4 = new ErrorCode(CA20Status.STATUS_USER_DESCRIPTION_I, 3);
        Inactive = errorCode4;
        ErrorCode errorCode5 = new ErrorCode("Incognito", 4);
        Incognito = errorCode5;
        ErrorCode errorCode6 = new ErrorCode("NoDefaultAccount", 5);
        NoDefaultAccount = errorCode6;
        ErrorCode errorCode7 = new ErrorCode("AccountNotFound", 6);
        AccountNotFound = errorCode7;
        ErrorCode errorCode8 = new ErrorCode("AccountNotAuthorized", 7);
        AccountNotAuthorized = errorCode8;
        ErrorCode errorCode9 = new ErrorCode("CredentialsNotFound", 8);
        CredentialsNotFound = errorCode9;
        ErrorCode errorCode10 = new ErrorCode("IOError", 9);
        IOError = errorCode10;
        ErrorCode errorCode11 = new ErrorCode("NumberFormat", 10);
        NumberFormat = errorCode11;
        ErrorCode errorCode12 = new ErrorCode("InvalidOptions", 11);
        InvalidOptions = errorCode12;
        ErrorCode[] errorCodeArr = {errorCode, errorCode2, errorCode3, errorCode4, errorCode5, errorCode6, errorCode7, errorCode8, errorCode9, errorCode10, errorCode11, errorCode12};
        $VALUES = errorCodeArr;
        $ENTRIES = kotlin.enums.a.a(errorCodeArr);
        Companion = new j6o();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, ErrorCode$Companion$1.w);
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) $VALUES.clone();
    }
}
