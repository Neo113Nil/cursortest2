package com.ybsdk.feature.pfm.internal.ui.interactors;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/pfm/internal/ui/interactors/PfmAnalyticsInteractor$Companion$SourceType", "", "Lcom/ybsdk/feature/pfm/internal/ui/interactors/PfmAnalyticsInteractor$Companion$SourceType;", "<init>", "(Ljava/lang/String;I)V", "FILTERS", "CATEGORIES", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmAnalyticsInteractor$Companion$SourceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PfmAnalyticsInteractor$Companion$SourceType[] $VALUES;
    public static final PfmAnalyticsInteractor$Companion$SourceType FILTERS = new PfmAnalyticsInteractor$Companion$SourceType("FILTERS", 0);
    public static final PfmAnalyticsInteractor$Companion$SourceType CATEGORIES = new PfmAnalyticsInteractor$Companion$SourceType("CATEGORIES", 1);

    private static final /* synthetic */ PfmAnalyticsInteractor$Companion$SourceType[] $values() {
        return new PfmAnalyticsInteractor$Companion$SourceType[]{FILTERS, CATEGORIES};
    }

    static {
        PfmAnalyticsInteractor$Companion$SourceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PfmAnalyticsInteractor$Companion$SourceType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PfmAnalyticsInteractor$Companion$SourceType valueOf(String str) {
        return (PfmAnalyticsInteractor$Companion$SourceType) Enum.valueOf(PfmAnalyticsInteractor$Companion$SourceType.class, str);
    }

    public static PfmAnalyticsInteractor$Companion$SourceType[] values() {
        return (PfmAnalyticsInteractor$Companion$SourceType[]) $VALUES.clone();
    }
}
