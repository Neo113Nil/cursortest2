package com.yx360.profile.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yx360/profile/api/model/PassportEnv;", "", "PRODUCTION", "TEAM_PRODUCTION", "TESTING", "TEAM_TESTING", "RC", "yx360-profile-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportEnv {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportEnv[] $VALUES;
    public static final PassportEnv PRODUCTION;
    public static final PassportEnv RC;
    public static final PassportEnv TEAM_PRODUCTION;
    public static final PassportEnv TEAM_TESTING;
    public static final PassportEnv TESTING;

    static {
        PassportEnv passportEnv = new PassportEnv("PRODUCTION", 0);
        PRODUCTION = passportEnv;
        PassportEnv passportEnv2 = new PassportEnv("TEAM_PRODUCTION", 1);
        TEAM_PRODUCTION = passportEnv2;
        PassportEnv passportEnv3 = new PassportEnv("TESTING", 2);
        TESTING = passportEnv3;
        PassportEnv passportEnv4 = new PassportEnv("TEAM_TESTING", 3);
        TEAM_TESTING = passportEnv4;
        PassportEnv passportEnv5 = new PassportEnv("RC", 4);
        RC = passportEnv5;
        PassportEnv[] passportEnvArr = {passportEnv, passportEnv2, passportEnv3, passportEnv4, passportEnv5};
        $VALUES = passportEnvArr;
        $ENTRIES = a.a(passportEnvArr);
    }

    public static PassportEnv valueOf(String str) {
        return (PassportEnv) Enum.valueOf(PassportEnv.class, str);
    }

    public static PassportEnv[] values() {
        return (PassportEnv[]) $VALUES.clone();
    }
}
