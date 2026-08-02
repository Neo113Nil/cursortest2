package com.yandex.go.masstransit.sdk.client_api;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/ErrorCode;", "", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MosmetroAuthRequired", "ClientError", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ErrorCode[] $VALUES;
    public static final ErrorCode ClientError;
    public static final ErrorCode MosmetroAuthRequired;
    private final String code;

    static {
        ErrorCode errorCode = new ErrorCode("MosmetroAuthRequired", 0, "mosmetro_auth_required");
        MosmetroAuthRequired = errorCode;
        ErrorCode errorCode2 = new ErrorCode("ClientError", 1, "_");
        ClientError = errorCode2;
        ErrorCode[] errorCodeArr = {errorCode, errorCode2};
        $VALUES = errorCodeArr;
        $ENTRIES = kotlin.enums.a.a(errorCodeArr);
    }

    public ErrorCode(String str, int i, String str2) {
        this.code = str2;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }
}
