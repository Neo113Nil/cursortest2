package com.ybsdk.core.analytics.generated;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/core/analytics/generated/ResultCommon;", "", "originalValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getOriginalValue", "()Ljava/lang/String;", "ERROR", "OK", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResultCommon {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ResultCommon[] $VALUES;
    public static final ResultCommon ERROR = new ResultCommon("ERROR", 0, "error");
    public static final ResultCommon OK = new ResultCommon("OK", 1, WriteBlocks.OK);
    private final String originalValue;

    private static final /* synthetic */ ResultCommon[] $values() {
        return new ResultCommon[]{ERROR, OK};
    }

    static {
        ResultCommon[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ResultCommon(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ResultCommon valueOf(String str) {
        return (ResultCommon) Enum.valueOf(ResultCommon.class, str);
    }

    public static ResultCommon[] values() {
        return (ResultCommon[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
