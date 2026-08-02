package com.yandex.go.masstransit.sdk.order.api.tickets.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/api/tickets/analytics/MtTicketActivationType;", "", "QR", "NFC", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MtTicketActivationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtTicketActivationType[] $VALUES;
    public static final MtTicketActivationType NFC;
    public static final MtTicketActivationType QR;

    static {
        MtTicketActivationType mtTicketActivationType = new MtTicketActivationType("QR", 0);
        QR = mtTicketActivationType;
        MtTicketActivationType mtTicketActivationType2 = new MtTicketActivationType("NFC", 1);
        NFC = mtTicketActivationType2;
        MtTicketActivationType[] mtTicketActivationTypeArr = {mtTicketActivationType, mtTicketActivationType2};
        $VALUES = mtTicketActivationTypeArr;
        $ENTRIES = a.a(mtTicketActivationTypeArr);
    }

    public static MtTicketActivationType valueOf(String str) {
        return (MtTicketActivationType) Enum.valueOf(MtTicketActivationType.class, str);
    }

    public static MtTicketActivationType[] values() {
        return (MtTicketActivationType[]) $VALUES.clone();
    }
}
