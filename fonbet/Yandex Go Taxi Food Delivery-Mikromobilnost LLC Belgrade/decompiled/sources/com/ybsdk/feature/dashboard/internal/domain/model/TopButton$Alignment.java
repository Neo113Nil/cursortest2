package com.ybsdk.feature.dashboard.internal.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/dashboard/internal/domain/model/TopButton$Alignment", "", "Lcom/ybsdk/feature/dashboard/internal/domain/model/TopButton$Alignment;", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TopButton$Alignment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TopButton$Alignment[] $VALUES;
    public static final TopButton$Alignment LEFT = new TopButton$Alignment("LEFT", 0);
    public static final TopButton$Alignment RIGHT = new TopButton$Alignment("RIGHT", 1);

    private static final /* synthetic */ TopButton$Alignment[] $values() {
        return new TopButton$Alignment[]{LEFT, RIGHT};
    }

    static {
        TopButton$Alignment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TopButton$Alignment(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TopButton$Alignment valueOf(String str) {
        return (TopButton$Alignment) Enum.valueOf(TopButton$Alignment.class, str);
    }

    public static TopButton$Alignment[] values() {
        return (TopButton$Alignment[]) $VALUES.clone();
    }
}
