package com.yandex.go.shortcuts.dto.response;

import defpackage.dwq0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.izr0;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ShortcutIconSize;", "", "Companion", "izr0", "MEDIUM", "BIG", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ShortcutIconSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShortcutIconSize[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ShortcutIconSize BIG;
    public static final izr0 Companion;
    public static final ShortcutIconSize MEDIUM;

    static {
        ShortcutIconSize shortcutIconSize = new ShortcutIconSize("MEDIUM", 0);
        MEDIUM = shortcutIconSize;
        ShortcutIconSize shortcutIconSize2 = new ShortcutIconSize("BIG", 1);
        BIG = shortcutIconSize2;
        ShortcutIconSize[] shortcutIconSizeArr = {shortcutIconSize, shortcutIconSize2};
        $VALUES = shortcutIconSizeArr;
        $ENTRIES = kotlin.enums.a.a(shortcutIconSizeArr);
        Companion = new izr0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dwq0(22));
    }

    public static ShortcutIconSize valueOf(String str) {
        return (ShortcutIconSize) Enum.valueOf(ShortcutIconSize.class, str);
    }

    public static ShortcutIconSize[] values() {
        return (ShortcutIconSize[]) $VALUES.clone();
    }
}
