package com.yandex.go.taxi.summary.shared.lifecycle;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/summary/shared/lifecycle/SummaryElement;", "", "ORDER_BUTTON", "TARIFF_VIEW_HOLDER", "shared"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SummaryElement {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryElement[] $VALUES;
    public static final SummaryElement ORDER_BUTTON;
    public static final SummaryElement TARIFF_VIEW_HOLDER;

    static {
        SummaryElement summaryElement = new SummaryElement("ORDER_BUTTON", 0);
        ORDER_BUTTON = summaryElement;
        SummaryElement summaryElement2 = new SummaryElement("TARIFF_VIEW_HOLDER", 1);
        TARIFF_VIEW_HOLDER = summaryElement2;
        SummaryElement[] summaryElementArr = {summaryElement, summaryElement2};
        $VALUES = summaryElementArr;
        $ENTRIES = kotlin.enums.a.a(summaryElementArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static SummaryElement valueOf(String str) {
        return (SummaryElement) Enum.valueOf(SummaryElement.class, str);
    }

    public static SummaryElement[] values() {
        return (SummaryElement[]) $VALUES.clone();
    }
}
