package com.yandex.go.shortcuts.factory;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/shortcuts/factory/SavedPlaceFactory$CreationCacheStrategy", "", "Lcom/yandex/go/shortcuts/factory/SavedPlaceFactory$CreationCacheStrategy;", "WITHOUT_CACHE", "FROM_CACHE_IF_POSSIBLE", "ONLY_FROM_CACHE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SavedPlaceFactory$CreationCacheStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SavedPlaceFactory$CreationCacheStrategy[] $VALUES;
    public static final SavedPlaceFactory$CreationCacheStrategy FROM_CACHE_IF_POSSIBLE;
    public static final SavedPlaceFactory$CreationCacheStrategy ONLY_FROM_CACHE;
    public static final SavedPlaceFactory$CreationCacheStrategy WITHOUT_CACHE;

    static {
        SavedPlaceFactory$CreationCacheStrategy savedPlaceFactory$CreationCacheStrategy = new SavedPlaceFactory$CreationCacheStrategy("WITHOUT_CACHE", 0);
        WITHOUT_CACHE = savedPlaceFactory$CreationCacheStrategy;
        SavedPlaceFactory$CreationCacheStrategy savedPlaceFactory$CreationCacheStrategy2 = new SavedPlaceFactory$CreationCacheStrategy("FROM_CACHE_IF_POSSIBLE", 1);
        FROM_CACHE_IF_POSSIBLE = savedPlaceFactory$CreationCacheStrategy2;
        SavedPlaceFactory$CreationCacheStrategy savedPlaceFactory$CreationCacheStrategy3 = new SavedPlaceFactory$CreationCacheStrategy("ONLY_FROM_CACHE", 2);
        ONLY_FROM_CACHE = savedPlaceFactory$CreationCacheStrategy3;
        SavedPlaceFactory$CreationCacheStrategy[] savedPlaceFactory$CreationCacheStrategyArr = {savedPlaceFactory$CreationCacheStrategy, savedPlaceFactory$CreationCacheStrategy2, savedPlaceFactory$CreationCacheStrategy3};
        $VALUES = savedPlaceFactory$CreationCacheStrategyArr;
        $ENTRIES = a.a(savedPlaceFactory$CreationCacheStrategyArr);
    }

    public static SavedPlaceFactory$CreationCacheStrategy valueOf(String str) {
        return (SavedPlaceFactory$CreationCacheStrategy) Enum.valueOf(SavedPlaceFactory$CreationCacheStrategy.class, str);
    }

    public static SavedPlaceFactory$CreationCacheStrategy[] values() {
        return (SavedPlaceFactory$CreationCacheStrategy[]) $VALUES.clone();
    }
}
