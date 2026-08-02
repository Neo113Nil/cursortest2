package com.yandex.go.taxi.order.cancel.similar.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/cancel/similar/model/CancelSimilarButton$State", "", "Lcom/yandex/go/taxi/order/cancel/similar/model/CancelSimilarButton$State;", "IDLE", "LOADING", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CancelSimilarButton$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CancelSimilarButton$State[] $VALUES;
    public static final CancelSimilarButton$State IDLE;
    public static final CancelSimilarButton$State LOADING;

    static {
        CancelSimilarButton$State cancelSimilarButton$State = new CancelSimilarButton$State("IDLE", 0);
        IDLE = cancelSimilarButton$State;
        CancelSimilarButton$State cancelSimilarButton$State2 = new CancelSimilarButton$State("LOADING", 1);
        LOADING = cancelSimilarButton$State2;
        CancelSimilarButton$State[] cancelSimilarButton$StateArr = {cancelSimilarButton$State, cancelSimilarButton$State2};
        $VALUES = cancelSimilarButton$StateArr;
        $ENTRIES = a.a(cancelSimilarButton$StateArr);
    }

    public static CancelSimilarButton$State valueOf(String str) {
        return (CancelSimilarButton$State) Enum.valueOf(CancelSimilarButton$State.class, str);
    }

    public static CancelSimilarButton$State[] values() {
        return (CancelSimilarButton$State[]) $VALUES.clone();
    }
}
