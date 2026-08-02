package com.yandex.passport.sloth.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/sloth/ui/SlothUiWish;", "", "BACK", "CANCEL", "FINISH_LOGIN", "passport-sloth-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SlothUiWish {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlothUiWish[] $VALUES;
    public static final SlothUiWish BACK;
    public static final SlothUiWish CANCEL;
    public static final SlothUiWish FINISH_LOGIN;

    static {
        SlothUiWish slothUiWish = new SlothUiWish("BACK", 0);
        BACK = slothUiWish;
        SlothUiWish slothUiWish2 = new SlothUiWish("CANCEL", 1);
        CANCEL = slothUiWish2;
        SlothUiWish slothUiWish3 = new SlothUiWish("FINISH_LOGIN", 2);
        FINISH_LOGIN = slothUiWish3;
        SlothUiWish[] slothUiWishArr = {slothUiWish, slothUiWish2, slothUiWish3};
        $VALUES = slothUiWishArr;
        $ENTRIES = kotlin.enums.a.a(slothUiWishArr);
    }

    public static SlothUiWish valueOf(String str) {
        return (SlothUiWish) Enum.valueOf(SlothUiWish.class, str);
    }

    public static SlothUiWish[] values() {
        return (SlothUiWish[]) $VALUES.clone();
    }
}
