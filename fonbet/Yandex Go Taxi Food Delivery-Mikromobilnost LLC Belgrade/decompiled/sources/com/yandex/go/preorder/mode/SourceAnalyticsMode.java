package com.yandex.go.preorder.mode;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/preorder/mode/SourceAnalyticsMode;", "", "", "modeName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MAIN", "ROUTE", "EDIT", "EDIT_DESTINATION", "SUMMARY_NO_ROUTE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SourceAnalyticsMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SourceAnalyticsMode[] $VALUES;
    public static final SourceAnalyticsMode EDIT;
    public static final SourceAnalyticsMode EDIT_DESTINATION;
    public static final SourceAnalyticsMode MAIN;
    public static final SourceAnalyticsMode ROUTE;
    public static final SourceAnalyticsMode SUMMARY_NO_ROUTE;
    private final String modeName;

    static {
        SourceAnalyticsMode sourceAnalyticsMode = new SourceAnalyticsMode("MAIN", 0, "Main");
        MAIN = sourceAnalyticsMode;
        SourceAnalyticsMode sourceAnalyticsMode2 = new SourceAnalyticsMode("ROUTE", 1, "SummaryRoute");
        ROUTE = sourceAnalyticsMode2;
        SourceAnalyticsMode sourceAnalyticsMode3 = new SourceAnalyticsMode("EDIT", 2, "Edit");
        EDIT = sourceAnalyticsMode3;
        SourceAnalyticsMode sourceAnalyticsMode4 = new SourceAnalyticsMode("EDIT_DESTINATION", 3, "EditDestination");
        EDIT_DESTINATION = sourceAnalyticsMode4;
        SourceAnalyticsMode sourceAnalyticsMode5 = new SourceAnalyticsMode("SUMMARY_NO_ROUTE", 4, "SummaryNoRoute");
        SUMMARY_NO_ROUTE = sourceAnalyticsMode5;
        SourceAnalyticsMode[] sourceAnalyticsModeArr = {sourceAnalyticsMode, sourceAnalyticsMode2, sourceAnalyticsMode3, sourceAnalyticsMode4, sourceAnalyticsMode5};
        $VALUES = sourceAnalyticsModeArr;
        $ENTRIES = a.a(sourceAnalyticsModeArr);
    }

    public SourceAnalyticsMode(String str, int i, String str2) {
        this.modeName = str2;
    }

    public static SourceAnalyticsMode valueOf(String str) {
        return (SourceAnalyticsMode) Enum.valueOf(SourceAnalyticsMode.class, str);
    }

    public static SourceAnalyticsMode[] values() {
        return (SourceAnalyticsMode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getModeName() {
        return this.modeName;
    }
}
