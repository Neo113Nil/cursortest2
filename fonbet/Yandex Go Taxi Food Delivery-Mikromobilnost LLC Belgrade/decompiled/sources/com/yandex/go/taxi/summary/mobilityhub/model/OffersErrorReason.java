package com.yandex.go.taxi.summary.mobilityhub.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/model/OffersErrorReason;", "", "TransportLoadingError", "RouteStatsLoadingError", "HubLoadingError", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OffersErrorReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OffersErrorReason[] $VALUES;
    public static final OffersErrorReason HubLoadingError;
    public static final OffersErrorReason RouteStatsLoadingError;
    public static final OffersErrorReason TransportLoadingError;

    static {
        OffersErrorReason offersErrorReason = new OffersErrorReason("TransportLoadingError", 0);
        TransportLoadingError = offersErrorReason;
        OffersErrorReason offersErrorReason2 = new OffersErrorReason("RouteStatsLoadingError", 1);
        RouteStatsLoadingError = offersErrorReason2;
        OffersErrorReason offersErrorReason3 = new OffersErrorReason("HubLoadingError", 2);
        HubLoadingError = offersErrorReason3;
        OffersErrorReason[] offersErrorReasonArr = {offersErrorReason, offersErrorReason2, offersErrorReason3};
        $VALUES = offersErrorReasonArr;
        $ENTRIES = a.a(offersErrorReasonArr);
    }

    public static OffersErrorReason valueOf(String str) {
        return (OffersErrorReason) Enum.valueOf(OffersErrorReason.class, str);
    }

    public static OffersErrorReason[] values() {
        return (OffersErrorReason[]) $VALUES.clone();
    }
}
