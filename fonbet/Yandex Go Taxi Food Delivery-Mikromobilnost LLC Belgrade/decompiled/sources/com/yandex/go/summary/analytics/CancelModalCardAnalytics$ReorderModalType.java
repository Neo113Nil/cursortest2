package com.yandex.go.summary.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/go/summary/analytics/CancelModalCardAnalytics$ReorderModalType", "", "Lcom/yandex/go/summary/analytics/CancelModalCardAnalytics$ReorderModalType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "REORDER", "go-client-android.features.summary:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CancelModalCardAnalytics$ReorderModalType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CancelModalCardAnalytics$ReorderModalType[] $VALUES;
    public static final CancelModalCardAnalytics$ReorderModalType REORDER;
    private final String eventValue = "REORDER";

    static {
        CancelModalCardAnalytics$ReorderModalType cancelModalCardAnalytics$ReorderModalType = new CancelModalCardAnalytics$ReorderModalType();
        REORDER = cancelModalCardAnalytics$ReorderModalType;
        CancelModalCardAnalytics$ReorderModalType[] cancelModalCardAnalytics$ReorderModalTypeArr = {cancelModalCardAnalytics$ReorderModalType};
        $VALUES = cancelModalCardAnalytics$ReorderModalTypeArr;
        $ENTRIES = a.a(cancelModalCardAnalytics$ReorderModalTypeArr);
    }

    public static CancelModalCardAnalytics$ReorderModalType valueOf(String str) {
        return (CancelModalCardAnalytics$ReorderModalType) Enum.valueOf(CancelModalCardAnalytics$ReorderModalType.class, str);
    }

    public static CancelModalCardAnalytics$ReorderModalType[] values() {
        return (CancelModalCardAnalytics$ReorderModalType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
