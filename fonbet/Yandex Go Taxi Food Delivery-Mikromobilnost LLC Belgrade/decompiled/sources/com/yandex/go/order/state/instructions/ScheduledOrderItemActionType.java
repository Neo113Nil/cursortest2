package com.yandex.go.order.state.instructions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.vnm0;
import defpackage.znm0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/order/state/instructions/ScheduledOrderItemActionType;", "", "Companion", "znm0", "SELECT_TIME_SLOT", "UNSUPPORTED", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScheduledOrderItemActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScheduledOrderItemActionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final znm0 Companion;
    public static final ScheduledOrderItemActionType SELECT_TIME_SLOT;
    public static final ScheduledOrderItemActionType UNSUPPORTED;

    static {
        ScheduledOrderItemActionType scheduledOrderItemActionType = new ScheduledOrderItemActionType("SELECT_TIME_SLOT", 0);
        SELECT_TIME_SLOT = scheduledOrderItemActionType;
        ScheduledOrderItemActionType scheduledOrderItemActionType2 = new ScheduledOrderItemActionType("UNSUPPORTED", 1);
        UNSUPPORTED = scheduledOrderItemActionType2;
        ScheduledOrderItemActionType[] scheduledOrderItemActionTypeArr = {scheduledOrderItemActionType, scheduledOrderItemActionType2};
        $VALUES = scheduledOrderItemActionTypeArr;
        $ENTRIES = kotlin.enums.a.a(scheduledOrderItemActionTypeArr);
        Companion = new znm0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(2));
    }

    public static ScheduledOrderItemActionType valueOf(String str) {
        return (ScheduledOrderItemActionType) Enum.valueOf(ScheduledOrderItemActionType.class, str);
    }

    public static ScheduledOrderItemActionType[] values() {
        return (ScheduledOrderItemActionType[]) $VALUES.clone();
    }
}
