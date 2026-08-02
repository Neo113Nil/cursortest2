package com.yandex.go.taxi.order.cancel.similar.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/cancel/similar/model/CancelSimilarUiState$TopContentType", "", "Lcom/yandex/go/taxi/order/cancel/similar/model/CancelSimilarUiState$TopContentType;", "ORDER_CARD", "IMAGE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CancelSimilarUiState$TopContentType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CancelSimilarUiState$TopContentType[] $VALUES;
    public static final CancelSimilarUiState$TopContentType IMAGE;
    public static final CancelSimilarUiState$TopContentType ORDER_CARD;

    static {
        CancelSimilarUiState$TopContentType cancelSimilarUiState$TopContentType = new CancelSimilarUiState$TopContentType("ORDER_CARD", 0);
        ORDER_CARD = cancelSimilarUiState$TopContentType;
        CancelSimilarUiState$TopContentType cancelSimilarUiState$TopContentType2 = new CancelSimilarUiState$TopContentType("IMAGE", 1);
        IMAGE = cancelSimilarUiState$TopContentType2;
        CancelSimilarUiState$TopContentType[] cancelSimilarUiState$TopContentTypeArr = {cancelSimilarUiState$TopContentType, cancelSimilarUiState$TopContentType2};
        $VALUES = cancelSimilarUiState$TopContentTypeArr;
        $ENTRIES = a.a(cancelSimilarUiState$TopContentTypeArr);
    }

    public static CancelSimilarUiState$TopContentType valueOf(String str) {
        return (CancelSimilarUiState$TopContentType) Enum.valueOf(CancelSimilarUiState$TopContentType.class, str);
    }

    public static CancelSimilarUiState$TopContentType[] values() {
        return (CancelSimilarUiState$TopContentType[]) $VALUES.clone();
    }
}
