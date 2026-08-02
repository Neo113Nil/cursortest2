package com.yandex.passport.api;

import com.samsung.android.sdk.samsungpay.v2.card.IdvVerifyInfo;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/passport/api/PassportLoginAction;", "", "CAROUSEL", "SOCIAL", IDialogId.INTENT_EXTRA_OUT_PASSWORD, "TOTP", "REGISTRATION", "PHONISH", "AUTOLOGIN", "EMPTY", "MAILISH_GIMAP", "MAGIC_LINK", "TRACK_ID", "QR_ON_TV", IdvVerifyInfo.IDV_TYPE_SMS, "LOGIN_RESTORE", "REG_NEO_PHONISH", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportLoginAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportLoginAction[] $VALUES;
    public static final PassportLoginAction AUTOLOGIN;
    public static final PassportLoginAction CAROUSEL;
    public static final PassportLoginAction EMPTY;
    public static final PassportLoginAction LOGIN_RESTORE;
    public static final PassportLoginAction MAGIC_LINK;
    public static final PassportLoginAction MAILISH_GIMAP;
    public static final PassportLoginAction PASSWORD;
    public static final PassportLoginAction PHONISH;
    public static final PassportLoginAction QR_ON_TV;
    public static final PassportLoginAction REGISTRATION;
    public static final PassportLoginAction REG_NEO_PHONISH;
    public static final PassportLoginAction SMS;
    public static final PassportLoginAction SOCIAL;
    public static final PassportLoginAction TOTP;
    public static final PassportLoginAction TRACK_ID;

    static {
        PassportLoginAction passportLoginAction = new PassportLoginAction("CAROUSEL", 0);
        CAROUSEL = passportLoginAction;
        PassportLoginAction passportLoginAction2 = new PassportLoginAction("SOCIAL", 1);
        SOCIAL = passportLoginAction2;
        PassportLoginAction passportLoginAction3 = new PassportLoginAction(IDialogId.INTENT_EXTRA_OUT_PASSWORD, 2);
        PASSWORD = passportLoginAction3;
        PassportLoginAction passportLoginAction4 = new PassportLoginAction("TOTP", 3);
        TOTP = passportLoginAction4;
        PassportLoginAction passportLoginAction5 = new PassportLoginAction("REGISTRATION", 4);
        REGISTRATION = passportLoginAction5;
        PassportLoginAction passportLoginAction6 = new PassportLoginAction("PHONISH", 5);
        PHONISH = passportLoginAction6;
        PassportLoginAction passportLoginAction7 = new PassportLoginAction("AUTOLOGIN", 6);
        AUTOLOGIN = passportLoginAction7;
        PassportLoginAction passportLoginAction8 = new PassportLoginAction("EMPTY", 7);
        EMPTY = passportLoginAction8;
        PassportLoginAction passportLoginAction9 = new PassportLoginAction("MAILISH_GIMAP", 8);
        MAILISH_GIMAP = passportLoginAction9;
        PassportLoginAction passportLoginAction10 = new PassportLoginAction("MAGIC_LINK", 9);
        MAGIC_LINK = passportLoginAction10;
        PassportLoginAction passportLoginAction11 = new PassportLoginAction("TRACK_ID", 10);
        TRACK_ID = passportLoginAction11;
        PassportLoginAction passportLoginAction12 = new PassportLoginAction("QR_ON_TV", 11);
        QR_ON_TV = passportLoginAction12;
        PassportLoginAction passportLoginAction13 = new PassportLoginAction(IdvVerifyInfo.IDV_TYPE_SMS, 12);
        SMS = passportLoginAction13;
        PassportLoginAction passportLoginAction14 = new PassportLoginAction("LOGIN_RESTORE", 13);
        LOGIN_RESTORE = passportLoginAction14;
        PassportLoginAction passportLoginAction15 = new PassportLoginAction("REG_NEO_PHONISH", 14);
        REG_NEO_PHONISH = passportLoginAction15;
        PassportLoginAction[] passportLoginActionArr = {passportLoginAction, passportLoginAction2, passportLoginAction3, passportLoginAction4, passportLoginAction5, passportLoginAction6, passportLoginAction7, passportLoginAction8, passportLoginAction9, passportLoginAction10, passportLoginAction11, passportLoginAction12, passportLoginAction13, passportLoginAction14, passportLoginAction15};
        $VALUES = passportLoginActionArr;
        $ENTRIES = kotlin.enums.a.a(passportLoginActionArr);
    }

    public static PassportLoginAction valueOf(String str) {
        return (PassportLoginAction) Enum.valueOf(PassportLoginAction.class, str);
    }

    public static PassportLoginAction[] values() {
        return (PassportLoginAction[]) $VALUES.clone();
    }
}
