package com.yandex.go.taxi.tariffs.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/tariffs/models/TariffChangeReason;", "", "DEFAULT", "TOLL_ROAD_CHANGED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TariffChangeReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffChangeReason[] $VALUES;
    public static final TariffChangeReason DEFAULT;
    public static final TariffChangeReason TOLL_ROAD_CHANGED;

    static {
        TariffChangeReason tariffChangeReason = new TariffChangeReason("DEFAULT", 0);
        DEFAULT = tariffChangeReason;
        TariffChangeReason tariffChangeReason2 = new TariffChangeReason("TOLL_ROAD_CHANGED", 1);
        TOLL_ROAD_CHANGED = tariffChangeReason2;
        TariffChangeReason[] tariffChangeReasonArr = {tariffChangeReason, tariffChangeReason2};
        $VALUES = tariffChangeReasonArr;
        $ENTRIES = a.a(tariffChangeReasonArr);
    }

    public static TariffChangeReason valueOf(String str) {
        return (TariffChangeReason) Enum.valueOf(TariffChangeReason.class, str);
    }

    public static TariffChangeReason[] values() {
        return (TariffChangeReason[]) $VALUES.clone();
    }
}
