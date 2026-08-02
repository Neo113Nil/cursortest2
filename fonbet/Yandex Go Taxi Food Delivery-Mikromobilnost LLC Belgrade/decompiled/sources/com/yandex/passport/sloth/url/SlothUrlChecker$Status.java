package com.yandex.passport.sloth.url;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/passport/sloth/url/SlothUrlChecker$Status", "", "Lcom/yandex/passport/sloth/url/SlothUrlChecker$Status;", "ALLOWED", "REDIRECT_COMMAND", "BLOCKED", "EXTERNAL", "EXTERNAL_AND_CANCEL", "passport-sloth_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SlothUrlChecker$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlothUrlChecker$Status[] $VALUES;
    public static final SlothUrlChecker$Status ALLOWED;
    public static final SlothUrlChecker$Status BLOCKED;
    public static final SlothUrlChecker$Status EXTERNAL;
    public static final SlothUrlChecker$Status EXTERNAL_AND_CANCEL;
    public static final SlothUrlChecker$Status REDIRECT_COMMAND;

    static {
        SlothUrlChecker$Status slothUrlChecker$Status = new SlothUrlChecker$Status("ALLOWED", 0);
        ALLOWED = slothUrlChecker$Status;
        SlothUrlChecker$Status slothUrlChecker$Status2 = new SlothUrlChecker$Status("REDIRECT_COMMAND", 1);
        REDIRECT_COMMAND = slothUrlChecker$Status2;
        SlothUrlChecker$Status slothUrlChecker$Status3 = new SlothUrlChecker$Status("BLOCKED", 2);
        BLOCKED = slothUrlChecker$Status3;
        SlothUrlChecker$Status slothUrlChecker$Status4 = new SlothUrlChecker$Status("EXTERNAL", 3);
        EXTERNAL = slothUrlChecker$Status4;
        SlothUrlChecker$Status slothUrlChecker$Status5 = new SlothUrlChecker$Status("EXTERNAL_AND_CANCEL", 4);
        EXTERNAL_AND_CANCEL = slothUrlChecker$Status5;
        SlothUrlChecker$Status[] slothUrlChecker$StatusArr = {slothUrlChecker$Status, slothUrlChecker$Status2, slothUrlChecker$Status3, slothUrlChecker$Status4, slothUrlChecker$Status5};
        $VALUES = slothUrlChecker$StatusArr;
        $ENTRIES = kotlin.enums.a.a(slothUrlChecker$StatusArr);
    }

    public static SlothUrlChecker$Status valueOf(String str) {
        return (SlothUrlChecker$Status) Enum.valueOf(SlothUrlChecker$Status.class, str);
    }

    public static SlothUrlChecker$Status[] values() {
        return (SlothUrlChecker$Status[]) $VALUES.clone();
    }
}
