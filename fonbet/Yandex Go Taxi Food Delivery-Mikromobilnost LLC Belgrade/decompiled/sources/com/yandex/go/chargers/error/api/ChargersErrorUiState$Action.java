package com.yandex.go.chargers.error.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/chargers/error/api/ChargersErrorUiState$Action", "", "Lcom/yandex/go/chargers/error/api/ChargersErrorUiState$Action;", "CLOSE", "RETRY", "FIND_ANOTHER_STATION", "RETURN_TO_PAYMENT", "SUPPORT", "go-client-android.features.chargers.error:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersErrorUiState$Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersErrorUiState$Action[] $VALUES;
    public static final ChargersErrorUiState$Action CLOSE;
    public static final ChargersErrorUiState$Action FIND_ANOTHER_STATION;
    public static final ChargersErrorUiState$Action RETRY;
    public static final ChargersErrorUiState$Action RETURN_TO_PAYMENT;
    public static final ChargersErrorUiState$Action SUPPORT;

    static {
        ChargersErrorUiState$Action chargersErrorUiState$Action = new ChargersErrorUiState$Action("CLOSE", 0);
        CLOSE = chargersErrorUiState$Action;
        ChargersErrorUiState$Action chargersErrorUiState$Action2 = new ChargersErrorUiState$Action("RETRY", 1);
        RETRY = chargersErrorUiState$Action2;
        ChargersErrorUiState$Action chargersErrorUiState$Action3 = new ChargersErrorUiState$Action("FIND_ANOTHER_STATION", 2);
        FIND_ANOTHER_STATION = chargersErrorUiState$Action3;
        ChargersErrorUiState$Action chargersErrorUiState$Action4 = new ChargersErrorUiState$Action("RETURN_TO_PAYMENT", 3);
        RETURN_TO_PAYMENT = chargersErrorUiState$Action4;
        ChargersErrorUiState$Action chargersErrorUiState$Action5 = new ChargersErrorUiState$Action("SUPPORT", 4);
        SUPPORT = chargersErrorUiState$Action5;
        ChargersErrorUiState$Action[] chargersErrorUiState$ActionArr = {chargersErrorUiState$Action, chargersErrorUiState$Action2, chargersErrorUiState$Action3, chargersErrorUiState$Action4, chargersErrorUiState$Action5};
        $VALUES = chargersErrorUiState$ActionArr;
        $ENTRIES = kotlin.enums.a.a(chargersErrorUiState$ActionArr);
    }

    public static ChargersErrorUiState$Action valueOf(String str) {
        return (ChargersErrorUiState$Action) Enum.valueOf(ChargersErrorUiState$Action.class, str);
    }

    public static ChargersErrorUiState$Action[] values() {
        return (ChargersErrorUiState$Action[]) $VALUES.clone();
    }
}
