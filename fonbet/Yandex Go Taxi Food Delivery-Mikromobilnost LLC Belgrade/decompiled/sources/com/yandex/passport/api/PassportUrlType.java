package com.yandex.passport.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/passport/api/PassportUrlType;", "", "BACKEND", "FRONTEND", "WEBAM", "SOCIAL", "APP_LINK", "FRONTEND_ID", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PassportUrlType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportUrlType[] $VALUES;
    public static final PassportUrlType APP_LINK;
    public static final PassportUrlType BACKEND;
    public static final PassportUrlType FRONTEND;
    public static final PassportUrlType FRONTEND_ID;
    public static final PassportUrlType SOCIAL;
    public static final PassportUrlType WEBAM;

    static {
        PassportUrlType passportUrlType = new PassportUrlType("BACKEND", 0);
        BACKEND = passportUrlType;
        PassportUrlType passportUrlType2 = new PassportUrlType("FRONTEND", 1);
        FRONTEND = passportUrlType2;
        PassportUrlType passportUrlType3 = new PassportUrlType("WEBAM", 2);
        WEBAM = passportUrlType3;
        PassportUrlType passportUrlType4 = new PassportUrlType("SOCIAL", 3);
        SOCIAL = passportUrlType4;
        PassportUrlType passportUrlType5 = new PassportUrlType("APP_LINK", 4);
        APP_LINK = passportUrlType5;
        PassportUrlType passportUrlType6 = new PassportUrlType("FRONTEND_ID", 5);
        FRONTEND_ID = passportUrlType6;
        PassportUrlType[] passportUrlTypeArr = {passportUrlType, passportUrlType2, passportUrlType3, passportUrlType4, passportUrlType5, passportUrlType6};
        $VALUES = passportUrlTypeArr;
        $ENTRIES = kotlin.enums.a.a(passportUrlTypeArr);
    }

    public static PassportUrlType valueOf(String str) {
        return (PassportUrlType) Enum.valueOf(PassportUrlType.class, str);
    }

    public static PassportUrlType[] values() {
        return (PassportUrlType[]) $VALUES.clone();
    }
}
