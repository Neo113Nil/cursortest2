package com.yandex.passport.sloth.data;

import com.samsung.android.sdk.samsungpay.v2.card.IdvVerifyInfo;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/passport/sloth/data/SlothLoginAction;", "", "Companion", "com/yandex/passport/sloth/data/b", "EMPTY", IDialogId.INTENT_EXTRA_OUT_PASSWORD, "REGISTRATION", "MAGIC_LINK", IdvVerifyInfo.IDV_TYPE_SMS, "LOGIN_RESTORE", "REG_NEO_PHONISH", "passport-sloth_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SlothLoginAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlothLoginAction[] $VALUES;
    public static final b Companion;
    public static final SlothLoginAction EMPTY;
    public static final SlothLoginAction LOGIN_RESTORE;
    public static final SlothLoginAction MAGIC_LINK;
    public static final SlothLoginAction PASSWORD;
    public static final SlothLoginAction REGISTRATION;
    public static final SlothLoginAction REG_NEO_PHONISH;
    public static final SlothLoginAction SMS;

    static {
        SlothLoginAction slothLoginAction = new SlothLoginAction("EMPTY", 0);
        EMPTY = slothLoginAction;
        SlothLoginAction slothLoginAction2 = new SlothLoginAction(IDialogId.INTENT_EXTRA_OUT_PASSWORD, 1);
        PASSWORD = slothLoginAction2;
        SlothLoginAction slothLoginAction3 = new SlothLoginAction("REGISTRATION", 2);
        REGISTRATION = slothLoginAction3;
        SlothLoginAction slothLoginAction4 = new SlothLoginAction("MAGIC_LINK", 3);
        MAGIC_LINK = slothLoginAction4;
        SlothLoginAction slothLoginAction5 = new SlothLoginAction(IdvVerifyInfo.IDV_TYPE_SMS, 4);
        SMS = slothLoginAction5;
        SlothLoginAction slothLoginAction6 = new SlothLoginAction("LOGIN_RESTORE", 5);
        LOGIN_RESTORE = slothLoginAction6;
        SlothLoginAction slothLoginAction7 = new SlothLoginAction("REG_NEO_PHONISH", 6);
        REG_NEO_PHONISH = slothLoginAction7;
        SlothLoginAction[] slothLoginActionArr = {slothLoginAction, slothLoginAction2, slothLoginAction3, slothLoginAction4, slothLoginAction5, slothLoginAction6, slothLoginAction7};
        $VALUES = slothLoginActionArr;
        $ENTRIES = kotlin.enums.a.a(slothLoginActionArr);
        Companion = new b();
    }

    public static SlothLoginAction valueOf(String str) {
        return (SlothLoginAction) Enum.valueOf(SlothLoginAction.class, str);
    }

    public static SlothLoginAction[] values() {
        return (SlothLoginAction[]) $VALUES.clone();
    }
}
