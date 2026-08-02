package com.yandex.go.navigator.complete_route;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/navigator/complete_route/CancelMode;", "", "CANCEL_COMPLETION", "KEEP_NAVIGATOR_IN_BACKGROUND", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CancelMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CancelMode[] $VALUES;
    public static final CancelMode CANCEL_COMPLETION;
    public static final CancelMode KEEP_NAVIGATOR_IN_BACKGROUND;

    static {
        CancelMode cancelMode = new CancelMode("CANCEL_COMPLETION", 0);
        CANCEL_COMPLETION = cancelMode;
        CancelMode cancelMode2 = new CancelMode("KEEP_NAVIGATOR_IN_BACKGROUND", 1);
        KEEP_NAVIGATOR_IN_BACKGROUND = cancelMode2;
        CancelMode[] cancelModeArr = {cancelMode, cancelMode2};
        $VALUES = cancelModeArr;
        $ENTRIES = a.a(cancelModeArr);
    }

    public static CancelMode valueOf(String str) {
        return (CancelMode) Enum.valueOf(CancelMode.class, str);
    }

    public static CancelMode[] values() {
        return (CancelMode[]) $VALUES.clone();
    }
}
