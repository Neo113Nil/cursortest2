package com.ybsdk.core.analytics.generated.delegates;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/TechEvents$TechReadDeviceIdStashResultResult", "", "Lcom/ybsdk/core/analytics/generated/delegates/TechEvents$TechReadDeviceIdStashResultResult;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "OK", "READ_ERROR", "DESERIALIZATION_ERROR", "NOT_MATCHES", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TechEvents$TechReadDeviceIdStashResultResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TechEvents$TechReadDeviceIdStashResultResult[] $VALUES;
    private final String originalValue;
    public static final TechEvents$TechReadDeviceIdStashResultResult OK = new TechEvents$TechReadDeviceIdStashResultResult("OK", 0, WriteBlocks.OK);
    public static final TechEvents$TechReadDeviceIdStashResultResult READ_ERROR = new TechEvents$TechReadDeviceIdStashResultResult("READ_ERROR", 1, WriteBlocks.READ_ERROR);
    public static final TechEvents$TechReadDeviceIdStashResultResult DESERIALIZATION_ERROR = new TechEvents$TechReadDeviceIdStashResultResult("DESERIALIZATION_ERROR", 2, "deserialization_error");
    public static final TechEvents$TechReadDeviceIdStashResultResult NOT_MATCHES = new TechEvents$TechReadDeviceIdStashResultResult("NOT_MATCHES", 3, "not_matches");

    private static final /* synthetic */ TechEvents$TechReadDeviceIdStashResultResult[] $values() {
        return new TechEvents$TechReadDeviceIdStashResultResult[]{OK, READ_ERROR, DESERIALIZATION_ERROR, NOT_MATCHES};
    }

    static {
        TechEvents$TechReadDeviceIdStashResultResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TechEvents$TechReadDeviceIdStashResultResult(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TechEvents$TechReadDeviceIdStashResultResult valueOf(String str) {
        return (TechEvents$TechReadDeviceIdStashResultResult) Enum.valueOf(TechEvents$TechReadDeviceIdStashResultResult.class, str);
    }

    public static TechEvents$TechReadDeviceIdStashResultResult[] values() {
        return (TechEvents$TechReadDeviceIdStashResultResult[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
