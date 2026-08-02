package com.yandex.go.summary.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/summary/analytics/CancelModalCardAnalytics$ReorderModalButton", "", "Lcom/yandex/go/summary/analytics/CancelModalCardAnalytics$ReorderModalButton;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Order", "DoNothing", "go-client-android.features.summary:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CancelModalCardAnalytics$ReorderModalButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CancelModalCardAnalytics$ReorderModalButton[] $VALUES;
    public static final CancelModalCardAnalytics$ReorderModalButton DoNothing;
    public static final CancelModalCardAnalytics$ReorderModalButton Order;
    private final String eventValue;

    static {
        CancelModalCardAnalytics$ReorderModalButton cancelModalCardAnalytics$ReorderModalButton = new CancelModalCardAnalytics$ReorderModalButton("Order", 0, "order");
        Order = cancelModalCardAnalytics$ReorderModalButton;
        CancelModalCardAnalytics$ReorderModalButton cancelModalCardAnalytics$ReorderModalButton2 = new CancelModalCardAnalytics$ReorderModalButton("DoNothing", 1, "do_nothing");
        DoNothing = cancelModalCardAnalytics$ReorderModalButton2;
        CancelModalCardAnalytics$ReorderModalButton[] cancelModalCardAnalytics$ReorderModalButtonArr = {cancelModalCardAnalytics$ReorderModalButton, cancelModalCardAnalytics$ReorderModalButton2};
        $VALUES = cancelModalCardAnalytics$ReorderModalButtonArr;
        $ENTRIES = a.a(cancelModalCardAnalytics$ReorderModalButtonArr);
    }

    public CancelModalCardAnalytics$ReorderModalButton(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static CancelModalCardAnalytics$ReorderModalButton valueOf(String str) {
        return (CancelModalCardAnalytics$ReorderModalButton) Enum.valueOf(CancelModalCardAnalytics$ReorderModalButton.class, str);
    }

    public static CancelModalCardAnalytics$ReorderModalButton[] values() {
        return (CancelModalCardAnalytics$ReorderModalButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
