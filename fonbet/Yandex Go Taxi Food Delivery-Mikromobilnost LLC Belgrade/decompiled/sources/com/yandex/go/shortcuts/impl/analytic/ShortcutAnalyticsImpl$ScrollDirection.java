package com.yandex.go.shortcuts.impl.analytic;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/shortcuts/impl/analytic/ShortcutAnalyticsImpl$ScrollDirection", "", "Lcom/yandex/go/shortcuts/impl/analytic/ShortcutAnalyticsImpl$ScrollDirection;", "", "type", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "UP", "DOWN", "LEFT", "RIGHT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShortcutAnalyticsImpl$ScrollDirection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShortcutAnalyticsImpl$ScrollDirection[] $VALUES;
    public static final ShortcutAnalyticsImpl$ScrollDirection DOWN;
    public static final ShortcutAnalyticsImpl$ScrollDirection LEFT;
    public static final ShortcutAnalyticsImpl$ScrollDirection RIGHT;
    public static final ShortcutAnalyticsImpl$ScrollDirection UP;
    private final String type;

    static {
        ShortcutAnalyticsImpl$ScrollDirection shortcutAnalyticsImpl$ScrollDirection = new ShortcutAnalyticsImpl$ScrollDirection("UP", 0, "up");
        UP = shortcutAnalyticsImpl$ScrollDirection;
        ShortcutAnalyticsImpl$ScrollDirection shortcutAnalyticsImpl$ScrollDirection2 = new ShortcutAnalyticsImpl$ScrollDirection("DOWN", 1, "down");
        DOWN = shortcutAnalyticsImpl$ScrollDirection2;
        ShortcutAnalyticsImpl$ScrollDirection shortcutAnalyticsImpl$ScrollDirection3 = new ShortcutAnalyticsImpl$ScrollDirection("LEFT", 2, "left");
        LEFT = shortcutAnalyticsImpl$ScrollDirection3;
        ShortcutAnalyticsImpl$ScrollDirection shortcutAnalyticsImpl$ScrollDirection4 = new ShortcutAnalyticsImpl$ScrollDirection("RIGHT", 3, "right");
        RIGHT = shortcutAnalyticsImpl$ScrollDirection4;
        ShortcutAnalyticsImpl$ScrollDirection[] shortcutAnalyticsImpl$ScrollDirectionArr = {shortcutAnalyticsImpl$ScrollDirection, shortcutAnalyticsImpl$ScrollDirection2, shortcutAnalyticsImpl$ScrollDirection3, shortcutAnalyticsImpl$ScrollDirection4};
        $VALUES = shortcutAnalyticsImpl$ScrollDirectionArr;
        $ENTRIES = kotlin.enums.a.a(shortcutAnalyticsImpl$ScrollDirectionArr);
    }

    public ShortcutAnalyticsImpl$ScrollDirection(String str, int i, String str2) {
        this.type = str2;
    }

    public static ShortcutAnalyticsImpl$ScrollDirection valueOf(String str) {
        return (ShortcutAnalyticsImpl$ScrollDirection) Enum.valueOf(ShortcutAnalyticsImpl$ScrollDirection.class, str);
    }

    public static ShortcutAnalyticsImpl$ScrollDirection[] values() {
        return (ShortcutAnalyticsImpl$ScrollDirection[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
