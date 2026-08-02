package com.yandex.go.masstransit.sdk.order.api.tickets.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/api/tickets/analytics/MtTicketTappedButtonName;", "", "NameRoute", "VisualCode", "HowActivate", "Activate", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MtTicketTappedButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtTicketTappedButtonName[] $VALUES;
    public static final MtTicketTappedButtonName Activate;
    public static final MtTicketTappedButtonName HowActivate;
    public static final MtTicketTappedButtonName NameRoute;
    public static final MtTicketTappedButtonName VisualCode;

    static {
        MtTicketTappedButtonName mtTicketTappedButtonName = new MtTicketTappedButtonName("NameRoute", 0);
        NameRoute = mtTicketTappedButtonName;
        MtTicketTappedButtonName mtTicketTappedButtonName2 = new MtTicketTappedButtonName("VisualCode", 1);
        VisualCode = mtTicketTappedButtonName2;
        MtTicketTappedButtonName mtTicketTappedButtonName3 = new MtTicketTappedButtonName("HowActivate", 2);
        HowActivate = mtTicketTappedButtonName3;
        MtTicketTappedButtonName mtTicketTappedButtonName4 = new MtTicketTappedButtonName("Activate", 3);
        Activate = mtTicketTappedButtonName4;
        MtTicketTappedButtonName[] mtTicketTappedButtonNameArr = {mtTicketTappedButtonName, mtTicketTappedButtonName2, mtTicketTappedButtonName3, mtTicketTappedButtonName4};
        $VALUES = mtTicketTappedButtonNameArr;
        $ENTRIES = a.a(mtTicketTappedButtonNameArr);
    }

    public static MtTicketTappedButtonName valueOf(String str) {
        return (MtTicketTappedButtonName) Enum.valueOf(MtTicketTappedButtonName.class, str);
    }

    public static MtTicketTappedButtonName[] values() {
        return (MtTicketTappedButtonName[]) $VALUES.clone();
    }
}
