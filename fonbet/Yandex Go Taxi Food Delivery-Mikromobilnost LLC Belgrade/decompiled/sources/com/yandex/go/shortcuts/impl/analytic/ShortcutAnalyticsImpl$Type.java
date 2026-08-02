package com.yandex.go.shortcuts.impl.analytic;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/shortcuts/impl/analytic/ShortcutAnalyticsImpl$Type", "", "Lcom/yandex/go/shortcuts/impl/analytic/ShortcutAnalyticsImpl$Type;", "", "analyticKey", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ACTION", "SHORTCUT", "BUTTON", "STACK_ITEM", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShortcutAnalyticsImpl$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShortcutAnalyticsImpl$Type[] $VALUES;
    public static final ShortcutAnalyticsImpl$Type ACTION;
    public static final ShortcutAnalyticsImpl$Type BUTTON;
    public static final ShortcutAnalyticsImpl$Type SHORTCUT;
    public static final ShortcutAnalyticsImpl$Type STACK_ITEM;
    private final String analyticKey;

    static {
        ShortcutAnalyticsImpl$Type shortcutAnalyticsImpl$Type = new ShortcutAnalyticsImpl$Type("ACTION", 0, "Header");
        ACTION = shortcutAnalyticsImpl$Type;
        ShortcutAnalyticsImpl$Type shortcutAnalyticsImpl$Type2 = new ShortcutAnalyticsImpl$Type("SHORTCUT", 1, "Suggest");
        SHORTCUT = shortcutAnalyticsImpl$Type2;
        ShortcutAnalyticsImpl$Type shortcutAnalyticsImpl$Type3 = new ShortcutAnalyticsImpl$Type("BUTTON", 2, "service_bar");
        BUTTON = shortcutAnalyticsImpl$Type3;
        ShortcutAnalyticsImpl$Type shortcutAnalyticsImpl$Type4 = new ShortcutAnalyticsImpl$Type("STACK_ITEM", 3, "stack_item");
        STACK_ITEM = shortcutAnalyticsImpl$Type4;
        ShortcutAnalyticsImpl$Type[] shortcutAnalyticsImpl$TypeArr = {shortcutAnalyticsImpl$Type, shortcutAnalyticsImpl$Type2, shortcutAnalyticsImpl$Type3, shortcutAnalyticsImpl$Type4};
        $VALUES = shortcutAnalyticsImpl$TypeArr;
        $ENTRIES = kotlin.enums.a.a(shortcutAnalyticsImpl$TypeArr);
    }

    public ShortcutAnalyticsImpl$Type(String str, int i, String str2) {
        this.analyticKey = str2;
    }

    public static ShortcutAnalyticsImpl$Type valueOf(String str) {
        return (ShortcutAnalyticsImpl$Type) Enum.valueOf(ShortcutAnalyticsImpl$Type.class, str);
    }

    public static ShortcutAnalyticsImpl$Type[] values() {
        return (ShortcutAnalyticsImpl$Type[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticKey() {
        return this.analyticKey;
    }
}
