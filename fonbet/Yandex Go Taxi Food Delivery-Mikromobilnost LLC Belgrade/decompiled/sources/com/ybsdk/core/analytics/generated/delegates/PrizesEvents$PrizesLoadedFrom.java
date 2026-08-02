package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/PrizesEvents$PrizesLoadedFrom", "", "Lcom/ybsdk/core/analytics/generated/delegates/PrizesEvents$PrizesLoadedFrom;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "MAIN_SCREEN", "DASHBOARD", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PrizesEvents$PrizesLoadedFrom {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PrizesEvents$PrizesLoadedFrom[] $VALUES;
    private final String originalValue;
    public static final PrizesEvents$PrizesLoadedFrom MAIN_SCREEN = new PrizesEvents$PrizesLoadedFrom("MAIN_SCREEN", 0, "main_screen");
    public static final PrizesEvents$PrizesLoadedFrom DASHBOARD = new PrizesEvents$PrizesLoadedFrom("DASHBOARD", 1, "dashboard");

    private static final /* synthetic */ PrizesEvents$PrizesLoadedFrom[] $values() {
        return new PrizesEvents$PrizesLoadedFrom[]{MAIN_SCREEN, DASHBOARD};
    }

    static {
        PrizesEvents$PrizesLoadedFrom[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PrizesEvents$PrizesLoadedFrom(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PrizesEvents$PrizesLoadedFrom valueOf(String str) {
        return (PrizesEvents$PrizesLoadedFrom) Enum.valueOf(PrizesEvents$PrizesLoadedFrom.class, str);
    }

    public static PrizesEvents$PrizesLoadedFrom[] values() {
        return (PrizesEvents$PrizesLoadedFrom[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
