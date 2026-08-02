package com.yandex.go.taxi.order.api.multi;

import defpackage.k4o;
import defpackage.v4y0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/api/multi/TaxiOrderPresentationType;", "", "Companion", "v4y0", "TRACKING", "DETAILS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderPresentationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiOrderPresentationType[] $VALUES;
    public static final v4y0 Companion;
    public static final TaxiOrderPresentationType DETAILS;
    public static final TaxiOrderPresentationType TRACKING;

    static {
        TaxiOrderPresentationType taxiOrderPresentationType = new TaxiOrderPresentationType("TRACKING", 0);
        TRACKING = taxiOrderPresentationType;
        TaxiOrderPresentationType taxiOrderPresentationType2 = new TaxiOrderPresentationType("DETAILS", 1);
        DETAILS = taxiOrderPresentationType2;
        TaxiOrderPresentationType[] taxiOrderPresentationTypeArr = {taxiOrderPresentationType, taxiOrderPresentationType2};
        $VALUES = taxiOrderPresentationTypeArr;
        $ENTRIES = a.a(taxiOrderPresentationTypeArr);
        Companion = new v4y0();
    }

    public static TaxiOrderPresentationType valueOf(String str) {
        return (TaxiOrderPresentationType) Enum.valueOf(TaxiOrderPresentationType.class, str);
    }

    public static TaxiOrderPresentationType[] values() {
        return (TaxiOrderPresentationType[]) $VALUES.clone();
    }

    public final boolean a() {
        return this == TRACKING;
    }
}
