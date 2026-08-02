package com.yandex.passport.api.exception;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/api/exception/PassportPollingExceptionType;", "", "ONE_TIME_LIMIT", "DAILY_LIMIT", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportPollingExceptionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportPollingExceptionType[] $VALUES;
    public static final PassportPollingExceptionType DAILY_LIMIT;
    public static final PassportPollingExceptionType ONE_TIME_LIMIT;

    static {
        PassportPollingExceptionType passportPollingExceptionType = new PassportPollingExceptionType("ONE_TIME_LIMIT", 0);
        ONE_TIME_LIMIT = passportPollingExceptionType;
        PassportPollingExceptionType passportPollingExceptionType2 = new PassportPollingExceptionType("DAILY_LIMIT", 1);
        DAILY_LIMIT = passportPollingExceptionType2;
        PassportPollingExceptionType[] passportPollingExceptionTypeArr = {passportPollingExceptionType, passportPollingExceptionType2};
        $VALUES = passportPollingExceptionTypeArr;
        $ENTRIES = kotlin.enums.a.a(passportPollingExceptionTypeArr);
    }

    public static PassportPollingExceptionType valueOf(String str) {
        return (PassportPollingExceptionType) Enum.valueOf(PassportPollingExceptionType.class, str);
    }

    public static PassportPollingExceptionType[] values() {
        return (PassportPollingExceptionType[]) $VALUES.clone();
    }
}
