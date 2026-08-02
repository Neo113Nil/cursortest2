package com.yandex.go.shortcuts.impl.interactors;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/shortcuts/impl/interactors/FallbackShortcutModelFactory$FallbackType", "", "Lcom/yandex/go/shortcuts/impl/interactors/FallbackShortcutModelFactory$FallbackType;", "ROUTE_ONLY", "ROUTE_WITH_SKELETON", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FallbackShortcutModelFactory$FallbackType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FallbackShortcutModelFactory$FallbackType[] $VALUES;
    public static final FallbackShortcutModelFactory$FallbackType ROUTE_ONLY;
    public static final FallbackShortcutModelFactory$FallbackType ROUTE_WITH_SKELETON;

    static {
        FallbackShortcutModelFactory$FallbackType fallbackShortcutModelFactory$FallbackType = new FallbackShortcutModelFactory$FallbackType("ROUTE_ONLY", 0);
        ROUTE_ONLY = fallbackShortcutModelFactory$FallbackType;
        FallbackShortcutModelFactory$FallbackType fallbackShortcutModelFactory$FallbackType2 = new FallbackShortcutModelFactory$FallbackType("ROUTE_WITH_SKELETON", 1);
        ROUTE_WITH_SKELETON = fallbackShortcutModelFactory$FallbackType2;
        FallbackShortcutModelFactory$FallbackType[] fallbackShortcutModelFactory$FallbackTypeArr = {fallbackShortcutModelFactory$FallbackType, fallbackShortcutModelFactory$FallbackType2};
        $VALUES = fallbackShortcutModelFactory$FallbackTypeArr;
        $ENTRIES = kotlin.enums.a.a(fallbackShortcutModelFactory$FallbackTypeArr);
    }

    public static FallbackShortcutModelFactory$FallbackType valueOf(String str) {
        return (FallbackShortcutModelFactory$FallbackType) Enum.valueOf(FallbackShortcutModelFactory$FallbackType.class, str);
    }

    public static FallbackShortcutModelFactory$FallbackType[] values() {
        return (FallbackShortcutModelFactory$FallbackType[]) $VALUES.clone();
    }
}
