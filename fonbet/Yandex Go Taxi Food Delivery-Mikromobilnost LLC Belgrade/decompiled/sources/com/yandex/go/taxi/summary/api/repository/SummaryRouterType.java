package com.yandex.go.taxi.summary.api.repository;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/taxi/summary/api/repository/SummaryRouterType;", "", "", "text", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "VERTICAL_SUMMARY", "COMPOSE_SUMMARY", "VIEW_SUMMARY", "RIDA_SUMMARY", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SummaryRouterType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryRouterType[] $VALUES;
    public static final SummaryRouterType COMPOSE_SUMMARY;
    public static final SummaryRouterType RIDA_SUMMARY;
    public static final SummaryRouterType VERTICAL_SUMMARY;
    public static final SummaryRouterType VIEW_SUMMARY;
    private final String text;

    static {
        SummaryRouterType summaryRouterType = new SummaryRouterType("VERTICAL_SUMMARY", 0, "vertical_summary");
        VERTICAL_SUMMARY = summaryRouterType;
        SummaryRouterType summaryRouterType2 = new SummaryRouterType("COMPOSE_SUMMARY", 1, "compose_summary");
        COMPOSE_SUMMARY = summaryRouterType2;
        SummaryRouterType summaryRouterType3 = new SummaryRouterType("VIEW_SUMMARY", 2, "view_summary");
        VIEW_SUMMARY = summaryRouterType3;
        SummaryRouterType summaryRouterType4 = new SummaryRouterType("RIDA_SUMMARY", 3, "rida_summary");
        RIDA_SUMMARY = summaryRouterType4;
        SummaryRouterType[] summaryRouterTypeArr = {summaryRouterType, summaryRouterType2, summaryRouterType3, summaryRouterType4};
        $VALUES = summaryRouterTypeArr;
        $ENTRIES = a.a(summaryRouterTypeArr);
    }

    public SummaryRouterType(String str, int i, String str2) {
        this.text = str2;
    }

    public static SummaryRouterType valueOf(String str) {
        return (SummaryRouterType) Enum.valueOf(SummaryRouterType.class, str);
    }

    public static SummaryRouterType[] values() {
        return (SummaryRouterType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
