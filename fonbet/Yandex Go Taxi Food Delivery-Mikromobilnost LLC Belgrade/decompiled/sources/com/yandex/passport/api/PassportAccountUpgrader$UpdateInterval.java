package com.yandex.passport.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/passport/api/PassportAccountUpgrader$UpdateInterval", "", "Lcom/yandex/passport/api/PassportAccountUpgrader$UpdateInterval;", "", "timeIntervalMillis", "J", "a", "()J", "ONE_HOUR", "THREE_HOURS", "SIX_HOURS", "TWELVE_HOURS", "ONE_DAY", "DEBUG", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportAccountUpgrader$UpdateInterval {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportAccountUpgrader$UpdateInterval[] $VALUES;
    public static final PassportAccountUpgrader$UpdateInterval DEBUG;
    public static final PassportAccountUpgrader$UpdateInterval ONE_DAY;
    public static final PassportAccountUpgrader$UpdateInterval ONE_HOUR;
    public static final PassportAccountUpgrader$UpdateInterval SIX_HOURS;
    public static final PassportAccountUpgrader$UpdateInterval THREE_HOURS;
    public static final PassportAccountUpgrader$UpdateInterval TWELVE_HOURS;
    private final long timeIntervalMillis;

    static {
        PassportAccountUpgrader$UpdateInterval passportAccountUpgrader$UpdateInterval = new PassportAccountUpgrader$UpdateInterval("ONE_HOUR", 0, 3600000L);
        ONE_HOUR = passportAccountUpgrader$UpdateInterval;
        PassportAccountUpgrader$UpdateInterval passportAccountUpgrader$UpdateInterval2 = new PassportAccountUpgrader$UpdateInterval("THREE_HOURS", 1, 10800000L);
        THREE_HOURS = passportAccountUpgrader$UpdateInterval2;
        PassportAccountUpgrader$UpdateInterval passportAccountUpgrader$UpdateInterval3 = new PassportAccountUpgrader$UpdateInterval("SIX_HOURS", 2, 21600000L);
        SIX_HOURS = passportAccountUpgrader$UpdateInterval3;
        PassportAccountUpgrader$UpdateInterval passportAccountUpgrader$UpdateInterval4 = new PassportAccountUpgrader$UpdateInterval("TWELVE_HOURS", 3, 43200000L);
        TWELVE_HOURS = passportAccountUpgrader$UpdateInterval4;
        PassportAccountUpgrader$UpdateInterval passportAccountUpgrader$UpdateInterval5 = new PassportAccountUpgrader$UpdateInterval("ONE_DAY", 4, 86400000L);
        ONE_DAY = passportAccountUpgrader$UpdateInterval5;
        PassportAccountUpgrader$UpdateInterval passportAccountUpgrader$UpdateInterval6 = new PassportAccountUpgrader$UpdateInterval("DEBUG", 5, 5000L);
        DEBUG = passportAccountUpgrader$UpdateInterval6;
        PassportAccountUpgrader$UpdateInterval[] passportAccountUpgrader$UpdateIntervalArr = {passportAccountUpgrader$UpdateInterval, passportAccountUpgrader$UpdateInterval2, passportAccountUpgrader$UpdateInterval3, passportAccountUpgrader$UpdateInterval4, passportAccountUpgrader$UpdateInterval5, passportAccountUpgrader$UpdateInterval6};
        $VALUES = passportAccountUpgrader$UpdateIntervalArr;
        $ENTRIES = kotlin.enums.a.a(passportAccountUpgrader$UpdateIntervalArr);
    }

    public PassportAccountUpgrader$UpdateInterval(String str, int i, long j) {
        this.timeIntervalMillis = j;
    }

    public static PassportAccountUpgrader$UpdateInterval valueOf(String str) {
        return (PassportAccountUpgrader$UpdateInterval) Enum.valueOf(PassportAccountUpgrader$UpdateInterval.class, str);
    }

    public static PassportAccountUpgrader$UpdateInterval[] values() {
        return (PassportAccountUpgrader$UpdateInterval[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final long getTimeIntervalMillis() {
        return this.timeIntervalMillis;
    }
}
