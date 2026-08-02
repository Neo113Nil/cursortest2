package io.opentelemetry.api.trace;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class StatusCode {
    private static final /* synthetic */ StatusCode[] $VALUES;
    public static final StatusCode ERROR;
    public static final StatusCode OK;
    public static final StatusCode UNSET;

    static {
        StatusCode statusCode = new StatusCode("UNSET", 0);
        UNSET = statusCode;
        StatusCode statusCode2 = new StatusCode("OK", 1);
        OK = statusCode2;
        StatusCode statusCode3 = new StatusCode("ERROR", 2);
        ERROR = statusCode3;
        $VALUES = new StatusCode[]{statusCode, statusCode2, statusCode3};
    }

    public StatusCode() {
        throw null;
    }

    public static StatusCode valueOf(String str) {
        return (StatusCode) Enum.valueOf(StatusCode.class, str);
    }

    public static StatusCode[] values() {
        return (StatusCode[]) $VALUES.clone();
    }
}
