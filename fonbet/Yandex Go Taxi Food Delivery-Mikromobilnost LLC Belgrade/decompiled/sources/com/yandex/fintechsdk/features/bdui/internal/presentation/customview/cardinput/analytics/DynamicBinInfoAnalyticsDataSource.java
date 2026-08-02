package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/analytics/DynamicBinInfoAnalyticsDataSource;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "DIEHARD", "TOVARISCH", "LOCAL", "CACHED", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DynamicBinInfoAnalyticsDataSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DynamicBinInfoAnalyticsDataSource[] $VALUES;
    public static final DynamicBinInfoAnalyticsDataSource CACHED;
    public static final DynamicBinInfoAnalyticsDataSource DIEHARD;
    public static final DynamicBinInfoAnalyticsDataSource LOCAL;
    public static final DynamicBinInfoAnalyticsDataSource TOVARISCH;
    private final String value;

    static {
        DynamicBinInfoAnalyticsDataSource dynamicBinInfoAnalyticsDataSource = new DynamicBinInfoAnalyticsDataSource("DIEHARD", 0, "diehard");
        DIEHARD = dynamicBinInfoAnalyticsDataSource;
        DynamicBinInfoAnalyticsDataSource dynamicBinInfoAnalyticsDataSource2 = new DynamicBinInfoAnalyticsDataSource("TOVARISCH", 1, "tovarisch");
        TOVARISCH = dynamicBinInfoAnalyticsDataSource2;
        DynamicBinInfoAnalyticsDataSource dynamicBinInfoAnalyticsDataSource3 = new DynamicBinInfoAnalyticsDataSource("LOCAL", 2, "local");
        LOCAL = dynamicBinInfoAnalyticsDataSource3;
        DynamicBinInfoAnalyticsDataSource dynamicBinInfoAnalyticsDataSource4 = new DynamicBinInfoAnalyticsDataSource("CACHED", 3, "cached");
        CACHED = dynamicBinInfoAnalyticsDataSource4;
        DynamicBinInfoAnalyticsDataSource[] dynamicBinInfoAnalyticsDataSourceArr = {dynamicBinInfoAnalyticsDataSource, dynamicBinInfoAnalyticsDataSource2, dynamicBinInfoAnalyticsDataSource3, dynamicBinInfoAnalyticsDataSource4};
        $VALUES = dynamicBinInfoAnalyticsDataSourceArr;
        $ENTRIES = a.a(dynamicBinInfoAnalyticsDataSourceArr);
    }

    public DynamicBinInfoAnalyticsDataSource(String str, int i, String str2) {
        this.value = str2;
    }

    public static DynamicBinInfoAnalyticsDataSource valueOf(String str) {
        return (DynamicBinInfoAnalyticsDataSource) Enum.valueOf(DynamicBinInfoAnalyticsDataSource.class, str);
    }

    public static DynamicBinInfoAnalyticsDataSource[] values() {
        return (DynamicBinInfoAnalyticsDataSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
