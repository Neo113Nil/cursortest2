package com.ybsdk.feature.pfm.internal.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/feature/pfm/internal/domain/entities/FilterEntity$Mode", "", "Lcom/ybsdk/feature/pfm/internal/domain/entities/FilterEntity$Mode;", "<init>", "(Ljava/lang/String;I)V", "IDLE", "SELECTABLE", "SELECTABLE_AND_RESETTABLE", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilterEntity$Mode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FilterEntity$Mode[] $VALUES;
    public static final FilterEntity$Mode IDLE = new FilterEntity$Mode("IDLE", 0);
    public static final FilterEntity$Mode SELECTABLE = new FilterEntity$Mode("SELECTABLE", 1);
    public static final FilterEntity$Mode SELECTABLE_AND_RESETTABLE = new FilterEntity$Mode("SELECTABLE_AND_RESETTABLE", 2);

    private static final /* synthetic */ FilterEntity$Mode[] $values() {
        return new FilterEntity$Mode[]{IDLE, SELECTABLE, SELECTABLE_AND_RESETTABLE};
    }

    static {
        FilterEntity$Mode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private FilterEntity$Mode(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static FilterEntity$Mode valueOf(String str) {
        return (FilterEntity$Mode) Enum.valueOf(FilterEntity$Mode.class, str);
    }

    public static FilterEntity$Mode[] values() {
        return (FilterEntity$Mode[]) $VALUES.clone();
    }
}
