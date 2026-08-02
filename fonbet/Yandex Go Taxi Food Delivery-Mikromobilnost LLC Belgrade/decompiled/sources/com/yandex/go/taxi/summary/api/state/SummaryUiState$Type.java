package com.yandex.go.taxi.summary.api.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/api/state/SummaryUiState$Type", "", "Lcom/yandex/go/taxi/summary/api/state/SummaryUiState$Type;", "NORMAL", "TRAP", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SummaryUiState$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SummaryUiState$Type[] $VALUES;
    public static final SummaryUiState$Type NORMAL;
    public static final SummaryUiState$Type TRAP;

    static {
        SummaryUiState$Type summaryUiState$Type = new SummaryUiState$Type("NORMAL", 0);
        NORMAL = summaryUiState$Type;
        SummaryUiState$Type summaryUiState$Type2 = new SummaryUiState$Type("TRAP", 1);
        TRAP = summaryUiState$Type2;
        SummaryUiState$Type[] summaryUiState$TypeArr = {summaryUiState$Type, summaryUiState$Type2};
        $VALUES = summaryUiState$TypeArr;
        $ENTRIES = a.a(summaryUiState$TypeArr);
    }

    public static SummaryUiState$Type valueOf(String str) {
        return (SummaryUiState$Type) Enum.valueOf(SummaryUiState$Type.class, str);
    }

    public static SummaryUiState$Type[] values() {
        return (SummaryUiState$Type[]) $VALUES.clone();
    }
}
