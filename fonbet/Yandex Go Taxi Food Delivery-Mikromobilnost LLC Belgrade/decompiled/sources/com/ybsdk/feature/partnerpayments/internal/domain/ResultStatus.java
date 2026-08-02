package com.ybsdk.feature.partnerpayments.internal.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/domain/ResultStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAILED", "IN_PROGRESS", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResultStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ResultStatus[] $VALUES;
    public static final ResultStatus SUCCESS = new ResultStatus("SUCCESS", 0);
    public static final ResultStatus FAILED = new ResultStatus("FAILED", 1);
    public static final ResultStatus IN_PROGRESS = new ResultStatus("IN_PROGRESS", 2);

    private static final /* synthetic */ ResultStatus[] $values() {
        return new ResultStatus[]{SUCCESS, FAILED, IN_PROGRESS};
    }

    static {
        ResultStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ResultStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ResultStatus valueOf(String str) {
        return (ResultStatus) Enum.valueOf(ResultStatus.class, str);
    }

    public static ResultStatus[] values() {
        return (ResultStatus[]) $VALUES.clone();
    }
}
