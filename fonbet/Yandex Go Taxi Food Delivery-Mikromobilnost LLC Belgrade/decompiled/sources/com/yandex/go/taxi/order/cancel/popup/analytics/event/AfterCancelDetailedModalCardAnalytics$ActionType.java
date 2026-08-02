package com.yandex.go.taxi.order.cancel.popup.analytics.event;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/taxi/order/cancel/popup/analytics/event/AfterCancelDetailedModalCardAnalytics$ActionType", "", "Lcom/yandex/go/taxi/order/cancel/popup/analytics/event/AfterCancelDetailedModalCardAnalytics$ActionType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ToSummary", "Deeplink", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AfterCancelDetailedModalCardAnalytics$ActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AfterCancelDetailedModalCardAnalytics$ActionType[] $VALUES;
    public static final AfterCancelDetailedModalCardAnalytics$ActionType Deeplink;
    public static final AfterCancelDetailedModalCardAnalytics$ActionType ToSummary;
    private final String eventValue;

    static {
        AfterCancelDetailedModalCardAnalytics$ActionType afterCancelDetailedModalCardAnalytics$ActionType = new AfterCancelDetailedModalCardAnalytics$ActionType("ToSummary", 0, "to_summary");
        ToSummary = afterCancelDetailedModalCardAnalytics$ActionType;
        AfterCancelDetailedModalCardAnalytics$ActionType afterCancelDetailedModalCardAnalytics$ActionType2 = new AfterCancelDetailedModalCardAnalytics$ActionType("Deeplink", 1, Constants.DEEPLINK);
        Deeplink = afterCancelDetailedModalCardAnalytics$ActionType2;
        AfterCancelDetailedModalCardAnalytics$ActionType[] afterCancelDetailedModalCardAnalytics$ActionTypeArr = {afterCancelDetailedModalCardAnalytics$ActionType, afterCancelDetailedModalCardAnalytics$ActionType2};
        $VALUES = afterCancelDetailedModalCardAnalytics$ActionTypeArr;
        $ENTRIES = a.a(afterCancelDetailedModalCardAnalytics$ActionTypeArr);
    }

    public AfterCancelDetailedModalCardAnalytics$ActionType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AfterCancelDetailedModalCardAnalytics$ActionType valueOf(String str) {
        return (AfterCancelDetailedModalCardAnalytics$ActionType) Enum.valueOf(AfterCancelDetailedModalCardAnalytics$ActionType.class, str);
    }

    public static AfterCancelDetailedModalCardAnalytics$ActionType[] values() {
        return (AfterCancelDetailedModalCardAnalytics$ActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
