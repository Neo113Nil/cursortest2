package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/OtpCodeEvents$OtpCodePushHandleResultResult", "", "Lcom/ybsdk/core/analytics/generated/delegates/OtpCodeEvents$OtpCodePushHandleResultResult;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "UNAUTHORIZED", "UNKNOWN_ERROR", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtpCodeEvents$OtpCodePushHandleResultResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OtpCodeEvents$OtpCodePushHandleResultResult[] $VALUES;
    public static final OtpCodeEvents$OtpCodePushHandleResultResult UNAUTHORIZED = new OtpCodeEvents$OtpCodePushHandleResultResult("UNAUTHORIZED", 0, "unauthorized");
    public static final OtpCodeEvents$OtpCodePushHandleResultResult UNKNOWN_ERROR = new OtpCodeEvents$OtpCodePushHandleResultResult("UNKNOWN_ERROR", 1, "unknown_error");
    private final String originalValue;

    private static final /* synthetic */ OtpCodeEvents$OtpCodePushHandleResultResult[] $values() {
        return new OtpCodeEvents$OtpCodePushHandleResultResult[]{UNAUTHORIZED, UNKNOWN_ERROR};
    }

    static {
        OtpCodeEvents$OtpCodePushHandleResultResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OtpCodeEvents$OtpCodePushHandleResultResult(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static OtpCodeEvents$OtpCodePushHandleResultResult valueOf(String str) {
        return (OtpCodeEvents$OtpCodePushHandleResultResult) Enum.valueOf(OtpCodeEvents$OtpCodePushHandleResultResult.class, str);
    }

    public static OtpCodeEvents$OtpCodePushHandleResultResult[] values() {
        return (OtpCodeEvents$OtpCodePushHandleResultResult[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
