package com.yandex.go.shortcuts.impl.analytic;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/shortcuts/impl/analytic/ShortcutAnalyticsImpl$CardMode", "", "Lcom/yandex/go/shortcuts/impl/analytic/ShortcutAnalyticsImpl$CardMode;", "", "analyticKey", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "OPENED", "CLOSED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShortcutAnalyticsImpl$CardMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShortcutAnalyticsImpl$CardMode[] $VALUES;
    public static final ShortcutAnalyticsImpl$CardMode CLOSED;
    public static final ShortcutAnalyticsImpl$CardMode OPENED;
    private final String analyticKey;

    static {
        ShortcutAnalyticsImpl$CardMode shortcutAnalyticsImpl$CardMode = new ShortcutAnalyticsImpl$CardMode("OPENED", 0, "opened");
        OPENED = shortcutAnalyticsImpl$CardMode;
        ShortcutAnalyticsImpl$CardMode shortcutAnalyticsImpl$CardMode2 = new ShortcutAnalyticsImpl$CardMode("CLOSED", 1, "closed");
        CLOSED = shortcutAnalyticsImpl$CardMode2;
        ShortcutAnalyticsImpl$CardMode[] shortcutAnalyticsImpl$CardModeArr = {shortcutAnalyticsImpl$CardMode, shortcutAnalyticsImpl$CardMode2};
        $VALUES = shortcutAnalyticsImpl$CardModeArr;
        $ENTRIES = kotlin.enums.a.a(shortcutAnalyticsImpl$CardModeArr);
    }

    public ShortcutAnalyticsImpl$CardMode(String str, int i, String str2) {
        this.analyticKey = str2;
    }

    public static ShortcutAnalyticsImpl$CardMode valueOf(String str) {
        return (ShortcutAnalyticsImpl$CardMode) Enum.valueOf(ShortcutAnalyticsImpl$CardMode.class, str);
    }

    public static ShortcutAnalyticsImpl$CardMode[] values() {
        return (ShortcutAnalyticsImpl$CardMode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticKey() {
        return this.analyticKey;
    }
}
