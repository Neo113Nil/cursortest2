package com.yandex.go.summary.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/summary/analytics/SummaryAnalytics$ModalType", "", "Lcom/yandex/go/summary/analytics/SummaryAnalytics$ModalType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Default", "ChildSeats", "go-client-android.features.summary:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SummaryAnalytics$ModalType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryAnalytics$ModalType[] $VALUES;
    public static final SummaryAnalytics$ModalType ChildSeats;
    public static final SummaryAnalytics$ModalType Default;
    private final String eventValue;

    static {
        SummaryAnalytics$ModalType summaryAnalytics$ModalType = new SummaryAnalytics$ModalType("Default", 0, "default");
        Default = summaryAnalytics$ModalType;
        SummaryAnalytics$ModalType summaryAnalytics$ModalType2 = new SummaryAnalytics$ModalType("ChildSeats", 1, "child_seats");
        ChildSeats = summaryAnalytics$ModalType2;
        SummaryAnalytics$ModalType[] summaryAnalytics$ModalTypeArr = {summaryAnalytics$ModalType, summaryAnalytics$ModalType2};
        $VALUES = summaryAnalytics$ModalTypeArr;
        $ENTRIES = a.a(summaryAnalytics$ModalTypeArr);
    }

    public SummaryAnalytics$ModalType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SummaryAnalytics$ModalType valueOf(String str) {
        return (SummaryAnalytics$ModalType) Enum.valueOf(SummaryAnalytics$ModalType.class, str);
    }

    public static SummaryAnalytics$ModalType[] values() {
        return (SummaryAnalytics$ModalType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
