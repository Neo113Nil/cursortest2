package com.yandex.go.taxi.order.cancel.similar.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/cancel/similar/model/CancelSimilarUiState$State", "", "Lcom/yandex/go/taxi/order/cancel/similar/model/CancelSimilarUiState$State;", "IDLE", "SUCCESS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CancelSimilarUiState$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CancelSimilarUiState$State[] $VALUES;
    public static final CancelSimilarUiState$State IDLE;
    public static final CancelSimilarUiState$State SUCCESS;

    static {
        CancelSimilarUiState$State cancelSimilarUiState$State = new CancelSimilarUiState$State("IDLE", 0);
        IDLE = cancelSimilarUiState$State;
        CancelSimilarUiState$State cancelSimilarUiState$State2 = new CancelSimilarUiState$State("SUCCESS", 1);
        SUCCESS = cancelSimilarUiState$State2;
        CancelSimilarUiState$State[] cancelSimilarUiState$StateArr = {cancelSimilarUiState$State, cancelSimilarUiState$State2};
        $VALUES = cancelSimilarUiState$StateArr;
        $ENTRIES = a.a(cancelSimilarUiState$StateArr);
    }

    public static CancelSimilarUiState$State valueOf(String str) {
        return (CancelSimilarUiState$State) Enum.valueOf(CancelSimilarUiState$State.class, str);
    }

    public static CancelSimilarUiState$State[] values() {
        return (CancelSimilarUiState$State[]) $VALUES.clone();
    }
}
