package com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/masstransit/sdk/order/impl/tickets/uicomponents/MtTicketsPagerItemHelper$ExpirationAnimationDelayKind", "", "Lcom/yandex/go/masstransit/sdk/order/impl/tickets/uicomponents/MtTicketsPagerItemHelper$ExpirationAnimationDelayKind;", "ReplayFadeInThenDelay", "HeldOffScreenDelay", "StandardExpirationDelay", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MtTicketsPagerItemHelper$ExpirationAnimationDelayKind {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtTicketsPagerItemHelper$ExpirationAnimationDelayKind[] $VALUES;
    public static final MtTicketsPagerItemHelper$ExpirationAnimationDelayKind HeldOffScreenDelay;
    public static final MtTicketsPagerItemHelper$ExpirationAnimationDelayKind ReplayFadeInThenDelay;
    public static final MtTicketsPagerItemHelper$ExpirationAnimationDelayKind StandardExpirationDelay;

    static {
        MtTicketsPagerItemHelper$ExpirationAnimationDelayKind mtTicketsPagerItemHelper$ExpirationAnimationDelayKind = new MtTicketsPagerItemHelper$ExpirationAnimationDelayKind("ReplayFadeInThenDelay", 0);
        ReplayFadeInThenDelay = mtTicketsPagerItemHelper$ExpirationAnimationDelayKind;
        MtTicketsPagerItemHelper$ExpirationAnimationDelayKind mtTicketsPagerItemHelper$ExpirationAnimationDelayKind2 = new MtTicketsPagerItemHelper$ExpirationAnimationDelayKind("HeldOffScreenDelay", 1);
        HeldOffScreenDelay = mtTicketsPagerItemHelper$ExpirationAnimationDelayKind2;
        MtTicketsPagerItemHelper$ExpirationAnimationDelayKind mtTicketsPagerItemHelper$ExpirationAnimationDelayKind3 = new MtTicketsPagerItemHelper$ExpirationAnimationDelayKind("StandardExpirationDelay", 2);
        StandardExpirationDelay = mtTicketsPagerItemHelper$ExpirationAnimationDelayKind3;
        MtTicketsPagerItemHelper$ExpirationAnimationDelayKind[] mtTicketsPagerItemHelper$ExpirationAnimationDelayKindArr = {mtTicketsPagerItemHelper$ExpirationAnimationDelayKind, mtTicketsPagerItemHelper$ExpirationAnimationDelayKind2, mtTicketsPagerItemHelper$ExpirationAnimationDelayKind3};
        $VALUES = mtTicketsPagerItemHelper$ExpirationAnimationDelayKindArr;
        $ENTRIES = kotlin.enums.a.a(mtTicketsPagerItemHelper$ExpirationAnimationDelayKindArr);
    }

    public static MtTicketsPagerItemHelper$ExpirationAnimationDelayKind valueOf(String str) {
        return (MtTicketsPagerItemHelper$ExpirationAnimationDelayKind) Enum.valueOf(MtTicketsPagerItemHelper$ExpirationAnimationDelayKind.class, str);
    }

    public static MtTicketsPagerItemHelper$ExpirationAnimationDelayKind[] values() {
        return (MtTicketsPagerItemHelper$ExpirationAnimationDelayKind[]) $VALUES.clone();
    }
}
