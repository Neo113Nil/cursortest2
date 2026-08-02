package com.yandex.quark.network;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/quark/network/HttpErrorCode;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", JCP.RAW_PREFIX, "HTTP_INIT_FAILED", "HTTP_UNEXPECTED_ERROR", "HTTP_CLIENT_TERMINATED", "HTTP_CLIENT_TIMEOUT", "INVALID_URL", "quark-core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpErrorCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HttpErrorCode[] $VALUES;
    private final int code;
    public static final HttpErrorCode NONE = new HttpErrorCode(JCP.RAW_PREFIX, 0, -1);
    public static final HttpErrorCode HTTP_INIT_FAILED = new HttpErrorCode("HTTP_INIT_FAILED", 1, 0);
    public static final HttpErrorCode HTTP_UNEXPECTED_ERROR = new HttpErrorCode("HTTP_UNEXPECTED_ERROR", 2, 1);
    public static final HttpErrorCode HTTP_CLIENT_TERMINATED = new HttpErrorCode("HTTP_CLIENT_TERMINATED", 3, 2);
    public static final HttpErrorCode HTTP_CLIENT_TIMEOUT = new HttpErrorCode("HTTP_CLIENT_TIMEOUT", 4, 3);
    public static final HttpErrorCode INVALID_URL = new HttpErrorCode("INVALID_URL", 5, 4);

    private static final /* synthetic */ HttpErrorCode[] $values() {
        return new HttpErrorCode[]{NONE, HTTP_INIT_FAILED, HTTP_UNEXPECTED_ERROR, HTTP_CLIENT_TERMINATED, HTTP_CLIENT_TIMEOUT, INVALID_URL};
    }

    static {
        HttpErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private HttpErrorCode(String str, int i, int i2) {
        this.code = i2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static HttpErrorCode valueOf(String str) {
        return (HttpErrorCode) Enum.valueOf(HttpErrorCode.class, str);
    }

    public static HttpErrorCode[] values() {
        return (HttpErrorCode[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
