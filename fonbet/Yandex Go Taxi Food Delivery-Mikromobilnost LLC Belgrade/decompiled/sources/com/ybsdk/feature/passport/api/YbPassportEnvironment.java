package com.ybsdk.feature.passport.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/passport/api/YbPassportEnvironment;", "", "<init>", "(Ljava/lang/String;I)V", "TESTING", "PRODUCTION", "feature-passport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YbPassportEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbPassportEnvironment[] $VALUES;
    public static final YbPassportEnvironment TESTING = new YbPassportEnvironment("TESTING", 0);
    public static final YbPassportEnvironment PRODUCTION = new YbPassportEnvironment("PRODUCTION", 1);

    private static final /* synthetic */ YbPassportEnvironment[] $values() {
        return new YbPassportEnvironment[]{TESTING, PRODUCTION};
    }

    static {
        YbPassportEnvironment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YbPassportEnvironment(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YbPassportEnvironment valueOf(String str) {
        return (YbPassportEnvironment) Enum.valueOf(YbPassportEnvironment.class, str);
    }

    public static YbPassportEnvironment[] values() {
        return (YbPassportEnvironment[]) $VALUES.clone();
    }
}
