package com.yandex.passport.sloth.ui.error;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/sloth/ui/error/ButtonMode;", "", "HIDDEN", "CANCEL", "CLOSE", "passport-sloth-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ButtonMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonMode[] $VALUES;
    public static final ButtonMode CANCEL;
    public static final ButtonMode CLOSE;
    public static final ButtonMode HIDDEN;

    static {
        ButtonMode buttonMode = new ButtonMode("HIDDEN", 0);
        HIDDEN = buttonMode;
        ButtonMode buttonMode2 = new ButtonMode("CANCEL", 1);
        CANCEL = buttonMode2;
        ButtonMode buttonMode3 = new ButtonMode("CLOSE", 2);
        CLOSE = buttonMode3;
        ButtonMode[] buttonModeArr = {buttonMode, buttonMode2, buttonMode3};
        $VALUES = buttonModeArr;
        $ENTRIES = kotlin.enums.a.a(buttonModeArr);
    }

    public static ButtonMode valueOf(String str) {
        return (ButtonMode) Enum.valueOf(ButtonMode.class, str);
    }

    public static ButtonMode[] values() {
        return (ButtonMode[]) $VALUES.clone();
    }
}
