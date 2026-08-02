package com.yandex.go.shortcuts.dto.response;

import defpackage.dwq0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.l1s0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ShortcutTitleSize;", "", "Companion", "l1s0", "REGULAR", "EXTENDED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ShortcutTitleSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShortcutTitleSize[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final l1s0 Companion;
    public static final ShortcutTitleSize EXTENDED;
    public static final ShortcutTitleSize REGULAR;

    static {
        ShortcutTitleSize shortcutTitleSize = new ShortcutTitleSize("REGULAR", 0);
        REGULAR = shortcutTitleSize;
        ShortcutTitleSize shortcutTitleSize2 = new ShortcutTitleSize("EXTENDED", 1);
        EXTENDED = shortcutTitleSize2;
        ShortcutTitleSize[] shortcutTitleSizeArr = {shortcutTitleSize, shortcutTitleSize2};
        $VALUES = shortcutTitleSizeArr;
        $ENTRIES = kotlin.enums.a.a(shortcutTitleSizeArr);
        Companion = new l1s0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dwq0(23));
    }

    public static ShortcutTitleSize valueOf(String str) {
        return (ShortcutTitleSize) Enum.valueOf(ShortcutTitleSize.class, str);
    }

    public static ShortcutTitleSize[] values() {
        return (ShortcutTitleSize[]) $VALUES.clone();
    }
}
