package com.yandex.go.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/analytics/OrderFeedbackAnalytics$RateCloseReason", "", "Lcom/yandex/go/analytics/OrderFeedbackAnalytics$RateCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "RollOff", "Done", "Other", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OrderFeedbackAnalytics$RateCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderFeedbackAnalytics$RateCloseReason[] $VALUES;
    public static final OrderFeedbackAnalytics$RateCloseReason Done;
    public static final OrderFeedbackAnalytics$RateCloseReason Other;
    public static final OrderFeedbackAnalytics$RateCloseReason RollOff;
    private final String eventValue;

    static {
        OrderFeedbackAnalytics$RateCloseReason orderFeedbackAnalytics$RateCloseReason = new OrderFeedbackAnalytics$RateCloseReason("RollOff", 0, "roll_off");
        RollOff = orderFeedbackAnalytics$RateCloseReason;
        OrderFeedbackAnalytics$RateCloseReason orderFeedbackAnalytics$RateCloseReason2 = new OrderFeedbackAnalytics$RateCloseReason("Done", 1, "done");
        Done = orderFeedbackAnalytics$RateCloseReason2;
        OrderFeedbackAnalytics$RateCloseReason orderFeedbackAnalytics$RateCloseReason3 = new OrderFeedbackAnalytics$RateCloseReason("Other", 2, "other");
        Other = orderFeedbackAnalytics$RateCloseReason3;
        OrderFeedbackAnalytics$RateCloseReason[] orderFeedbackAnalytics$RateCloseReasonArr = {orderFeedbackAnalytics$RateCloseReason, orderFeedbackAnalytics$RateCloseReason2, orderFeedbackAnalytics$RateCloseReason3};
        $VALUES = orderFeedbackAnalytics$RateCloseReasonArr;
        $ENTRIES = kotlin.enums.a.a(orderFeedbackAnalytics$RateCloseReasonArr);
    }

    public OrderFeedbackAnalytics$RateCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static OrderFeedbackAnalytics$RateCloseReason valueOf(String str) {
        return (OrderFeedbackAnalytics$RateCloseReason) Enum.valueOf(OrderFeedbackAnalytics$RateCloseReason.class, str);
    }

    public static OrderFeedbackAnalytics$RateCloseReason[] values() {
        return (OrderFeedbackAnalytics$RateCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
