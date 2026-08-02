package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/webcard/WebCardMode;", "", "Fullscreen", "Top", "Middle", "Bottom", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebCardMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebCardMode[] $VALUES;
    public static final WebCardMode Bottom;
    public static final WebCardMode Fullscreen;
    public static final WebCardMode Middle;
    public static final WebCardMode Top;

    static {
        WebCardMode webCardMode = new WebCardMode("Fullscreen", 0);
        Fullscreen = webCardMode;
        WebCardMode webCardMode2 = new WebCardMode("Top", 1);
        Top = webCardMode2;
        WebCardMode webCardMode3 = new WebCardMode("Middle", 2);
        Middle = webCardMode3;
        WebCardMode webCardMode4 = new WebCardMode("Bottom", 3);
        Bottom = webCardMode4;
        WebCardMode[] webCardModeArr = {webCardMode, webCardMode2, webCardMode3, webCardMode4};
        $VALUES = webCardModeArr;
        $ENTRIES = kotlin.enums.a.a(webCardModeArr);
    }

    public static WebCardMode valueOf(String str) {
        return (WebCardMode) Enum.valueOf(WebCardMode.class, str);
    }

    public static WebCardMode[] values() {
        return (WebCardMode[]) $VALUES.clone();
    }
}
