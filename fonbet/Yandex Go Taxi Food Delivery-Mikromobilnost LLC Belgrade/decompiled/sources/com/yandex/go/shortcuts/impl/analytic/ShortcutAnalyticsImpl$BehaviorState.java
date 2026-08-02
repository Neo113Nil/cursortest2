package com.yandex.go.shortcuts.impl.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"com/yandex/go/shortcuts/impl/analytic/ShortcutAnalyticsImpl$BehaviorState", "", "Lcom/yandex/go/shortcuts/impl/analytic/ShortcutAnalyticsImpl$BehaviorState;", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "", "value", CA20Status.STATUS_USER_I, "getValue", "()I", "COLLAPSED", "ANCHORED", "REVEALED", "EXPANDED", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ShortcutAnalyticsImpl$BehaviorState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShortcutAnalyticsImpl$BehaviorState[] $VALUES;
    public static final ShortcutAnalyticsImpl$BehaviorState ANCHORED;
    public static final ShortcutAnalyticsImpl$BehaviorState COLLAPSED;
    public static final ShortcutAnalyticsImpl$BehaviorState EXPANDED;
    public static final ShortcutAnalyticsImpl$BehaviorState REVEALED;
    public static final ShortcutAnalyticsImpl$BehaviorState UNKNOWN;
    private final String text;
    private final int value;

    static {
        ShortcutAnalyticsImpl$BehaviorState shortcutAnalyticsImpl$BehaviorState = new ShortcutAnalyticsImpl$BehaviorState("COLLAPSED", 0, "mini", 0);
        COLLAPSED = shortcutAnalyticsImpl$BehaviorState;
        ShortcutAnalyticsImpl$BehaviorState shortcutAnalyticsImpl$BehaviorState2 = new ShortcutAnalyticsImpl$BehaviorState("ANCHORED", 1, "center", 1);
        ANCHORED = shortcutAnalyticsImpl$BehaviorState2;
        ShortcutAnalyticsImpl$BehaviorState shortcutAnalyticsImpl$BehaviorState3 = new ShortcutAnalyticsImpl$BehaviorState("REVEALED", 2, "revealed", 2);
        REVEALED = shortcutAnalyticsImpl$BehaviorState3;
        ShortcutAnalyticsImpl$BehaviorState shortcutAnalyticsImpl$BehaviorState4 = new ShortcutAnalyticsImpl$BehaviorState("EXPANDED", 3, "fullscreen", 3);
        EXPANDED = shortcutAnalyticsImpl$BehaviorState4;
        ShortcutAnalyticsImpl$BehaviorState shortcutAnalyticsImpl$BehaviorState5 = new ShortcutAnalyticsImpl$BehaviorState("UNKNOWN", 4, "unknown", -1);
        UNKNOWN = shortcutAnalyticsImpl$BehaviorState5;
        ShortcutAnalyticsImpl$BehaviorState[] shortcutAnalyticsImpl$BehaviorStateArr = {shortcutAnalyticsImpl$BehaviorState, shortcutAnalyticsImpl$BehaviorState2, shortcutAnalyticsImpl$BehaviorState3, shortcutAnalyticsImpl$BehaviorState4, shortcutAnalyticsImpl$BehaviorState5};
        $VALUES = shortcutAnalyticsImpl$BehaviorStateArr;
        $ENTRIES = kotlin.enums.a.a(shortcutAnalyticsImpl$BehaviorStateArr);
    }

    public ShortcutAnalyticsImpl$BehaviorState(String str, int i, String str2, int i2) {
        this.text = str2;
        this.value = i2;
    }

    public static ShortcutAnalyticsImpl$BehaviorState valueOf(String str) {
        return (ShortcutAnalyticsImpl$BehaviorState) Enum.valueOf(ShortcutAnalyticsImpl$BehaviorState.class, str);
    }

    public static ShortcutAnalyticsImpl$BehaviorState[] values() {
        return (ShortcutAnalyticsImpl$BehaviorState[]) $VALUES.clone();
    }
}
