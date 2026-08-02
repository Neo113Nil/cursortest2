package com.yandex.passport.sloth.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/sloth/data/SlothTheme;", "", "LIGHT", "DARK", "FOLLOW_SYSTEM", "passport-sloth_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SlothTheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlothTheme[] $VALUES;
    public static final SlothTheme DARK;
    public static final SlothTheme FOLLOW_SYSTEM;
    public static final SlothTheme LIGHT;

    static {
        SlothTheme slothTheme = new SlothTheme("LIGHT", 0);
        LIGHT = slothTheme;
        SlothTheme slothTheme2 = new SlothTheme("DARK", 1);
        DARK = slothTheme2;
        SlothTheme slothTheme3 = new SlothTheme("FOLLOW_SYSTEM", 2);
        FOLLOW_SYSTEM = slothTheme3;
        SlothTheme[] slothThemeArr = {slothTheme, slothTheme2, slothTheme3};
        $VALUES = slothThemeArr;
        $ENTRIES = kotlin.enums.a.a(slothThemeArr);
    }

    public static SlothTheme valueOf(String str) {
        return (SlothTheme) Enum.valueOf(SlothTheme.class, str);
    }

    public static SlothTheme[] values() {
        return (SlothTheme[]) $VALUES.clone();
    }
}
