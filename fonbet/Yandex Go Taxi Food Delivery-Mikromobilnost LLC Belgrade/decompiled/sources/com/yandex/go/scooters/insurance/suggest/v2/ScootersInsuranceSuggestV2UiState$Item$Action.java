package com.yandex.go.scooters.insurance.suggest.v2;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/scooters/insurance/suggest/v2/ScootersInsuranceSuggestV2UiState$Item$Action", "", "Lcom/yandex/go/scooters/insurance/suggest/v2/ScootersInsuranceSuggestV2UiState$Item$Action;", "DETAILS", "PROVIDER_INFO", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersInsuranceSuggestV2UiState$Item$Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersInsuranceSuggestV2UiState$Item$Action[] $VALUES;
    public static final ScootersInsuranceSuggestV2UiState$Item$Action DETAILS;
    public static final ScootersInsuranceSuggestV2UiState$Item$Action PROVIDER_INFO;

    static {
        ScootersInsuranceSuggestV2UiState$Item$Action scootersInsuranceSuggestV2UiState$Item$Action = new ScootersInsuranceSuggestV2UiState$Item$Action("DETAILS", 0);
        DETAILS = scootersInsuranceSuggestV2UiState$Item$Action;
        ScootersInsuranceSuggestV2UiState$Item$Action scootersInsuranceSuggestV2UiState$Item$Action2 = new ScootersInsuranceSuggestV2UiState$Item$Action("PROVIDER_INFO", 1);
        PROVIDER_INFO = scootersInsuranceSuggestV2UiState$Item$Action2;
        ScootersInsuranceSuggestV2UiState$Item$Action[] scootersInsuranceSuggestV2UiState$Item$ActionArr = {scootersInsuranceSuggestV2UiState$Item$Action, scootersInsuranceSuggestV2UiState$Item$Action2};
        $VALUES = scootersInsuranceSuggestV2UiState$Item$ActionArr;
        $ENTRIES = kotlin.enums.a.a(scootersInsuranceSuggestV2UiState$Item$ActionArr);
    }

    public static ScootersInsuranceSuggestV2UiState$Item$Action valueOf(String str) {
        return (ScootersInsuranceSuggestV2UiState$Item$Action) Enum.valueOf(ScootersInsuranceSuggestV2UiState$Item$Action.class, str);
    }

    public static ScootersInsuranceSuggestV2UiState$Item$Action[] values() {
        return (ScootersInsuranceSuggestV2UiState$Item$Action[]) $VALUES.clone();
    }
}
