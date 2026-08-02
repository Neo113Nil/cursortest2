package com.yandex.go.order.tariffs_suggest.mapper;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/order/tariffs_suggest/mapper/ChangeStatusUiState$Status", "", "Lcom/yandex/go/order/tariffs_suggest/mapper/ChangeStatusUiState$Status;", "PENDING", "FAILED", "UNAVAILABLE", "SUCCESS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChangeStatusUiState$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChangeStatusUiState$Status[] $VALUES;
    public static final ChangeStatusUiState$Status FAILED;
    public static final ChangeStatusUiState$Status PENDING;
    public static final ChangeStatusUiState$Status SUCCESS;
    public static final ChangeStatusUiState$Status UNAVAILABLE;

    static {
        ChangeStatusUiState$Status changeStatusUiState$Status = new ChangeStatusUiState$Status("PENDING", 0);
        PENDING = changeStatusUiState$Status;
        ChangeStatusUiState$Status changeStatusUiState$Status2 = new ChangeStatusUiState$Status("FAILED", 1);
        FAILED = changeStatusUiState$Status2;
        ChangeStatusUiState$Status changeStatusUiState$Status3 = new ChangeStatusUiState$Status("UNAVAILABLE", 2);
        UNAVAILABLE = changeStatusUiState$Status3;
        ChangeStatusUiState$Status changeStatusUiState$Status4 = new ChangeStatusUiState$Status("SUCCESS", 3);
        SUCCESS = changeStatusUiState$Status4;
        ChangeStatusUiState$Status[] changeStatusUiState$StatusArr = {changeStatusUiState$Status, changeStatusUiState$Status2, changeStatusUiState$Status3, changeStatusUiState$Status4};
        $VALUES = changeStatusUiState$StatusArr;
        $ENTRIES = kotlin.enums.a.a(changeStatusUiState$StatusArr);
    }

    public static ChangeStatusUiState$Status valueOf(String str) {
        return (ChangeStatusUiState$Status) Enum.valueOf(ChangeStatusUiState$Status.class, str);
    }

    public static ChangeStatusUiState$Status[] values() {
        return (ChangeStatusUiState$Status[]) $VALUES.clone();
    }
}
