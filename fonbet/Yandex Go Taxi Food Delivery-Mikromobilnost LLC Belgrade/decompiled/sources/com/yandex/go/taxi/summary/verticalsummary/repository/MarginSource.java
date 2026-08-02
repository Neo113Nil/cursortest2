package com.yandex.go.taxi.summary.verticalsummary.repository;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/summary/verticalsummary/repository/MarginSource;", "", "BottomSheet", "ExternalState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MarginSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MarginSource[] $VALUES;
    public static final MarginSource BottomSheet;
    public static final MarginSource ExternalState;

    static {
        MarginSource marginSource = new MarginSource("BottomSheet", 0);
        BottomSheet = marginSource;
        MarginSource marginSource2 = new MarginSource("ExternalState", 1);
        ExternalState = marginSource2;
        MarginSource[] marginSourceArr = {marginSource, marginSource2};
        $VALUES = marginSourceArr;
        $ENTRIES = kotlin.enums.a.a(marginSourceArr);
    }

    public static MarginSource valueOf(String str) {
        return (MarginSource) Enum.valueOf(MarginSource.class, str);
    }

    public static MarginSource[] values() {
        return (MarginSource[]) $VALUES.clone();
    }
}
