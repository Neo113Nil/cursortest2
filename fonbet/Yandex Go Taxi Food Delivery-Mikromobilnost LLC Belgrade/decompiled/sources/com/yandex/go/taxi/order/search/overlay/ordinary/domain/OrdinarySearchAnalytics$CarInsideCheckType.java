package com.yandex.go.taxi.order.search.overlay.ordinary.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/search/overlay/ordinary/domain/OrdinarySearchAnalytics$CarInsideCheckType", "", "Lcom/yandex/go/taxi/order/search/overlay/ordinary/domain/OrdinarySearchAnalytics$CarInsideCheckType;", "POLLING_CANDIDATE", "NEAREST_DRIVER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrdinarySearchAnalytics$CarInsideCheckType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrdinarySearchAnalytics$CarInsideCheckType[] $VALUES;
    public static final OrdinarySearchAnalytics$CarInsideCheckType NEAREST_DRIVER;
    public static final OrdinarySearchAnalytics$CarInsideCheckType POLLING_CANDIDATE;

    static {
        OrdinarySearchAnalytics$CarInsideCheckType ordinarySearchAnalytics$CarInsideCheckType = new OrdinarySearchAnalytics$CarInsideCheckType("POLLING_CANDIDATE", 0);
        POLLING_CANDIDATE = ordinarySearchAnalytics$CarInsideCheckType;
        OrdinarySearchAnalytics$CarInsideCheckType ordinarySearchAnalytics$CarInsideCheckType2 = new OrdinarySearchAnalytics$CarInsideCheckType("NEAREST_DRIVER", 1);
        NEAREST_DRIVER = ordinarySearchAnalytics$CarInsideCheckType2;
        OrdinarySearchAnalytics$CarInsideCheckType[] ordinarySearchAnalytics$CarInsideCheckTypeArr = {ordinarySearchAnalytics$CarInsideCheckType, ordinarySearchAnalytics$CarInsideCheckType2};
        $VALUES = ordinarySearchAnalytics$CarInsideCheckTypeArr;
        $ENTRIES = kotlin.enums.a.a(ordinarySearchAnalytics$CarInsideCheckTypeArr);
    }

    public static OrdinarySearchAnalytics$CarInsideCheckType valueOf(String str) {
        return (OrdinarySearchAnalytics$CarInsideCheckType) Enum.valueOf(OrdinarySearchAnalytics$CarInsideCheckType.class, str);
    }

    public static OrdinarySearchAnalytics$CarInsideCheckType[] values() {
        return (OrdinarySearchAnalytics$CarInsideCheckType[]) $VALUES.clone();
    }
}
