package com.yandex.passport.sloth.ui.string;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/passport/sloth/ui/string/SlothString;", "", "ERROR_UNEXPECTED", "ERROR_404", "ERROR_CONNECTION_LOST", "BACK_BUTTON", "FATAL_ERROR_DIALOG_TEXT", "FATAL_ERROR_DIALOG_BUTTON", "DEBUG_INFORMATION_TITLE", "TRY_AGAIN", "BLOCKED_URL", "CLOSE", "passport-sloth-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SlothString {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlothString[] $VALUES;
    public static final SlothString BACK_BUTTON;
    public static final SlothString BLOCKED_URL;
    public static final SlothString CLOSE;
    public static final SlothString DEBUG_INFORMATION_TITLE;
    public static final SlothString ERROR_404;
    public static final SlothString ERROR_CONNECTION_LOST;
    public static final SlothString ERROR_UNEXPECTED;
    public static final SlothString FATAL_ERROR_DIALOG_BUTTON;
    public static final SlothString FATAL_ERROR_DIALOG_TEXT;
    public static final SlothString TRY_AGAIN;

    static {
        SlothString slothString = new SlothString("ERROR_UNEXPECTED", 0);
        ERROR_UNEXPECTED = slothString;
        SlothString slothString2 = new SlothString("ERROR_404", 1);
        ERROR_404 = slothString2;
        SlothString slothString3 = new SlothString("ERROR_CONNECTION_LOST", 2);
        ERROR_CONNECTION_LOST = slothString3;
        SlothString slothString4 = new SlothString("BACK_BUTTON", 3);
        BACK_BUTTON = slothString4;
        SlothString slothString5 = new SlothString("FATAL_ERROR_DIALOG_TEXT", 4);
        FATAL_ERROR_DIALOG_TEXT = slothString5;
        SlothString slothString6 = new SlothString("FATAL_ERROR_DIALOG_BUTTON", 5);
        FATAL_ERROR_DIALOG_BUTTON = slothString6;
        SlothString slothString7 = new SlothString("DEBUG_INFORMATION_TITLE", 6);
        DEBUG_INFORMATION_TITLE = slothString7;
        SlothString slothString8 = new SlothString("TRY_AGAIN", 7);
        TRY_AGAIN = slothString8;
        SlothString slothString9 = new SlothString("BLOCKED_URL", 8);
        BLOCKED_URL = slothString9;
        SlothString slothString10 = new SlothString("CLOSE", 9);
        CLOSE = slothString10;
        SlothString[] slothStringArr = {slothString, slothString2, slothString3, slothString4, slothString5, slothString6, slothString7, slothString8, slothString9, slothString10};
        $VALUES = slothStringArr;
        $ENTRIES = kotlin.enums.a.a(slothStringArr);
    }

    public static SlothString valueOf(String str) {
        return (SlothString) Enum.valueOf(SlothString.class, str);
    }

    public static SlothString[] values() {
        return (SlothString[]) $VALUES.clone();
    }
}
