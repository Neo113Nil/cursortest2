package com.yandex.go.masstransit.sdk.order.api.tickets.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/api/tickets/analytics/MtTicketOrderAction;", "", "Scroll", "TicketPaging", "Deeplink", "CopyToClipboard", "Update", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MtTicketOrderAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtTicketOrderAction[] $VALUES;
    public static final MtTicketOrderAction CopyToClipboard;
    public static final MtTicketOrderAction Deeplink;
    public static final MtTicketOrderAction Scroll;
    public static final MtTicketOrderAction TicketPaging;
    public static final MtTicketOrderAction Update;

    static {
        MtTicketOrderAction mtTicketOrderAction = new MtTicketOrderAction("Scroll", 0);
        Scroll = mtTicketOrderAction;
        MtTicketOrderAction mtTicketOrderAction2 = new MtTicketOrderAction("TicketPaging", 1);
        TicketPaging = mtTicketOrderAction2;
        MtTicketOrderAction mtTicketOrderAction3 = new MtTicketOrderAction("Deeplink", 2);
        Deeplink = mtTicketOrderAction3;
        MtTicketOrderAction mtTicketOrderAction4 = new MtTicketOrderAction("CopyToClipboard", 3);
        CopyToClipboard = mtTicketOrderAction4;
        MtTicketOrderAction mtTicketOrderAction5 = new MtTicketOrderAction("Update", 4);
        Update = mtTicketOrderAction5;
        MtTicketOrderAction[] mtTicketOrderActionArr = {mtTicketOrderAction, mtTicketOrderAction2, mtTicketOrderAction3, mtTicketOrderAction4, mtTicketOrderAction5};
        $VALUES = mtTicketOrderActionArr;
        $ENTRIES = a.a(mtTicketOrderActionArr);
    }

    public static MtTicketOrderAction valueOf(String str) {
        return (MtTicketOrderAction) Enum.valueOf(MtTicketOrderAction.class, str);
    }

    public static MtTicketOrderAction[] values() {
        return (MtTicketOrderAction[]) $VALUES.clone();
    }
}
