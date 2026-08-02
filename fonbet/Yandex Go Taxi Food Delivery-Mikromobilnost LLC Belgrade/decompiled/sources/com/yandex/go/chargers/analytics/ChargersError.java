package com.yandex.go.chargers.analytics;

import com.yandex.payment.common.result.ResultType;
import defpackage.k4o;
import defpackage.yx9;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/chargers/analytics/ChargersError;", "", "", "groupId", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "defMessage", "a", "Companion", "yx9", "Discovery", "Station", "Qr", "Offer", "OfferCreateOrder", "ActiveOrder", "ActiveOrderCancelled", "ActiveOrderPreparing", "ActiveOrderRequest", "PreFinish", "Finishing", "FinishingParserError", "Feedback", "FeedbackSend", "Debt", "PollingOrdersMapper", "DiscountsList", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersError {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersError[] $VALUES;
    public static final ChargersError ActiveOrder;
    public static final ChargersError ActiveOrderCancelled;
    public static final ChargersError ActiveOrderPreparing;
    public static final ChargersError ActiveOrderRequest;
    public static final yx9 Companion;
    public static final String DEFAULT_MESSAGE = "unknown";
    public static final ChargersError Debt;
    public static final ChargersError DiscountsList;
    public static final ChargersError Discovery;
    public static final ChargersError Feedback;
    public static final ChargersError FeedbackSend;
    public static final ChargersError Finishing;
    public static final ChargersError FinishingParserError;
    public static final ChargersError Offer;
    public static final ChargersError OfferCreateOrder;
    public static final ChargersError PollingOrdersMapper;
    public static final ChargersError PreFinish;
    public static final ChargersError Qr;
    public static final ChargersError Station;
    private final String defMessage;
    private final String groupId;

    static {
        ChargersError chargersError = new ChargersError("Discovery", 0, "Chargers.Discovery", "Failed to get data");
        Discovery = chargersError;
        ChargersError chargersError2 = new ChargersError("Station", 1, "Chargers.Station");
        Station = chargersError2;
        ChargersError chargersError3 = new ChargersError("Qr", 2, "Chargers.Qr");
        Qr = chargersError3;
        ChargersError chargersError4 = new ChargersError("Offer", 3, "Chargers.Offer");
        Offer = chargersError4;
        ChargersError chargersError5 = new ChargersError("OfferCreateOrder", 4, "Chargers.Offer.CreateOrder");
        OfferCreateOrder = chargersError5;
        ChargersError chargersError6 = new ChargersError("ActiveOrder", 5, "Chargers.ActiveOrder");
        ActiveOrder = chargersError6;
        ChargersError chargersError7 = new ChargersError("ActiveOrderCancelled", 6, "Chargers.ActiveOrder.Cancelled");
        ActiveOrderCancelled = chargersError7;
        ChargersError chargersError8 = new ChargersError("ActiveOrderPreparing", 7, "Chargers.ActiveOrder.Preparing", ResultType.RESULT_TYPE_FAILURE);
        ActiveOrderPreparing = chargersError8;
        ChargersError chargersError9 = new ChargersError("ActiveOrderRequest", 8, "Chargers.ActiveOrder.Request");
        ActiveOrderRequest = chargersError9;
        ChargersError chargersError10 = new ChargersError("PreFinish", 9, "Chargers.PreFinish");
        PreFinish = chargersError10;
        ChargersError chargersError11 = new ChargersError("Finishing", 10, "Chargers.Finishing", "finishing_state_push_failed");
        Finishing = chargersError11;
        ChargersError chargersError12 = new ChargersError("FinishingParserError", 11, "Chargers.Finishing.ParserError");
        FinishingParserError = chargersError12;
        ChargersError chargersError13 = new ChargersError("Feedback", 12, "Chargers.Feedback");
        Feedback = chargersError13;
        ChargersError chargersError14 = new ChargersError("FeedbackSend", 13, "Chargers.Feedback.Send");
        FeedbackSend = chargersError14;
        ChargersError chargersError15 = new ChargersError("Debt", 14, "Chargers.Debt");
        Debt = chargersError15;
        ChargersError chargersError16 = new ChargersError("PollingOrdersMapper", 15, "Chargers.Polling.OrdersMapper");
        PollingOrdersMapper = chargersError16;
        ChargersError chargersError17 = new ChargersError("DiscountsList", 16, "Chargers.Discounts.List");
        DiscountsList = chargersError17;
        ChargersError[] chargersErrorArr = {chargersError, chargersError2, chargersError3, chargersError4, chargersError5, chargersError6, chargersError7, chargersError8, chargersError9, chargersError10, chargersError11, chargersError12, chargersError13, chargersError14, chargersError15, chargersError16, chargersError17};
        $VALUES = chargersErrorArr;
        $ENTRIES = a.a(chargersErrorArr);
        Companion = new yx9();
    }

    public ChargersError(String str, int i, String str2, String str3) {
        this.groupId = str2;
        this.defMessage = str3;
    }

    public static ChargersError valueOf(String str) {
        return (ChargersError) Enum.valueOf(ChargersError.class, str);
    }

    public static ChargersError[] values() {
        return (ChargersError[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getDefMessage() {
        return this.defMessage;
    }

    /* renamed from: b, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    public /* synthetic */ ChargersError(String str, int i, String str2) {
        this(str, i, str2, "unknown");
    }
}
