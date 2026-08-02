package com.yandex.go.taxi.order.promotions.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/promotions/model/TaxiOrderPopupModalBehaviourType;", "", "TAXI_SEARCH", "RIDE_AUTO", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderPopupModalBehaviourType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiOrderPopupModalBehaviourType[] $VALUES;
    public static final TaxiOrderPopupModalBehaviourType RIDE_AUTO;
    public static final TaxiOrderPopupModalBehaviourType TAXI_SEARCH;

    static {
        TaxiOrderPopupModalBehaviourType taxiOrderPopupModalBehaviourType = new TaxiOrderPopupModalBehaviourType("TAXI_SEARCH", 0);
        TAXI_SEARCH = taxiOrderPopupModalBehaviourType;
        TaxiOrderPopupModalBehaviourType taxiOrderPopupModalBehaviourType2 = new TaxiOrderPopupModalBehaviourType("RIDE_AUTO", 1);
        RIDE_AUTO = taxiOrderPopupModalBehaviourType2;
        TaxiOrderPopupModalBehaviourType[] taxiOrderPopupModalBehaviourTypeArr = {taxiOrderPopupModalBehaviourType, taxiOrderPopupModalBehaviourType2};
        $VALUES = taxiOrderPopupModalBehaviourTypeArr;
        $ENTRIES = a.a(taxiOrderPopupModalBehaviourTypeArr);
    }

    public static TaxiOrderPopupModalBehaviourType valueOf(String str) {
        return (TaxiOrderPopupModalBehaviourType) Enum.valueOf(TaxiOrderPopupModalBehaviourType.class, str);
    }

    public static TaxiOrderPopupModalBehaviourType[] values() {
        return (TaxiOrderPopupModalBehaviourType[]) $VALUES.clone();
    }
}
