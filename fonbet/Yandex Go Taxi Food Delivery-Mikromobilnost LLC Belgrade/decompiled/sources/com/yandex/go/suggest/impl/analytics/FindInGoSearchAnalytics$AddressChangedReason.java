package com.yandex.go.suggest.impl.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/suggest/impl/analytics/FindInGoSearchAnalytics$AddressChangedReason", "", "Lcom/yandex/go/suggest/impl/analytics/FindInGoSearchAnalytics$AddressChangedReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Initial", "AddressChanged", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FindInGoSearchAnalytics$AddressChangedReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FindInGoSearchAnalytics$AddressChangedReason[] $VALUES;
    public static final FindInGoSearchAnalytics$AddressChangedReason AddressChanged;
    public static final FindInGoSearchAnalytics$AddressChangedReason Initial;
    private final String eventValue;

    static {
        FindInGoSearchAnalytics$AddressChangedReason findInGoSearchAnalytics$AddressChangedReason = new FindInGoSearchAnalytics$AddressChangedReason("Initial", 0, "initial");
        Initial = findInGoSearchAnalytics$AddressChangedReason;
        FindInGoSearchAnalytics$AddressChangedReason findInGoSearchAnalytics$AddressChangedReason2 = new FindInGoSearchAnalytics$AddressChangedReason("AddressChanged", 1, "address_changed");
        AddressChanged = findInGoSearchAnalytics$AddressChangedReason2;
        FindInGoSearchAnalytics$AddressChangedReason[] findInGoSearchAnalytics$AddressChangedReasonArr = {findInGoSearchAnalytics$AddressChangedReason, findInGoSearchAnalytics$AddressChangedReason2};
        $VALUES = findInGoSearchAnalytics$AddressChangedReasonArr;
        $ENTRIES = a.a(findInGoSearchAnalytics$AddressChangedReasonArr);
    }

    public FindInGoSearchAnalytics$AddressChangedReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static FindInGoSearchAnalytics$AddressChangedReason valueOf(String str) {
        return (FindInGoSearchAnalytics$AddressChangedReason) Enum.valueOf(FindInGoSearchAnalytics$AddressChangedReason.class, str);
    }

    public static FindInGoSearchAnalytics$AddressChangedReason[] values() {
        return (FindInGoSearchAnalytics$AddressChangedReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
