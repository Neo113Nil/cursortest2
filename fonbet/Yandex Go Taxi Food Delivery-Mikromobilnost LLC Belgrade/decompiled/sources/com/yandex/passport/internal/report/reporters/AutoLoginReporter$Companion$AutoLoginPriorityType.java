package com.yandex.passport.internal.report.reporters;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/passport/internal/report/reporters/AutoLoginReporter$Companion$AutoLoginPriorityType", "", "Lcom/yandex/passport/internal/report/reporters/AutoLoginReporter$Companion$AutoLoginPriorityType;", "NULL", "DEFAULT", "BY_CLIENT_ID", "BY_APP_ID", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AutoLoginReporter$Companion$AutoLoginPriorityType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoLoginReporter$Companion$AutoLoginPriorityType[] $VALUES;
    public static final AutoLoginReporter$Companion$AutoLoginPriorityType BY_APP_ID;
    public static final AutoLoginReporter$Companion$AutoLoginPriorityType BY_CLIENT_ID;
    public static final AutoLoginReporter$Companion$AutoLoginPriorityType DEFAULT;
    public static final AutoLoginReporter$Companion$AutoLoginPriorityType NULL;

    static {
        AutoLoginReporter$Companion$AutoLoginPriorityType autoLoginReporter$Companion$AutoLoginPriorityType = new AutoLoginReporter$Companion$AutoLoginPriorityType("NULL", 0);
        NULL = autoLoginReporter$Companion$AutoLoginPriorityType;
        AutoLoginReporter$Companion$AutoLoginPriorityType autoLoginReporter$Companion$AutoLoginPriorityType2 = new AutoLoginReporter$Companion$AutoLoginPriorityType("DEFAULT", 1);
        DEFAULT = autoLoginReporter$Companion$AutoLoginPriorityType2;
        AutoLoginReporter$Companion$AutoLoginPriorityType autoLoginReporter$Companion$AutoLoginPriorityType3 = new AutoLoginReporter$Companion$AutoLoginPriorityType("BY_CLIENT_ID", 2);
        BY_CLIENT_ID = autoLoginReporter$Companion$AutoLoginPriorityType3;
        AutoLoginReporter$Companion$AutoLoginPriorityType autoLoginReporter$Companion$AutoLoginPriorityType4 = new AutoLoginReporter$Companion$AutoLoginPriorityType("BY_APP_ID", 3);
        BY_APP_ID = autoLoginReporter$Companion$AutoLoginPriorityType4;
        AutoLoginReporter$Companion$AutoLoginPriorityType[] autoLoginReporter$Companion$AutoLoginPriorityTypeArr = {autoLoginReporter$Companion$AutoLoginPriorityType, autoLoginReporter$Companion$AutoLoginPriorityType2, autoLoginReporter$Companion$AutoLoginPriorityType3, autoLoginReporter$Companion$AutoLoginPriorityType4};
        $VALUES = autoLoginReporter$Companion$AutoLoginPriorityTypeArr;
        $ENTRIES = kotlin.enums.a.a(autoLoginReporter$Companion$AutoLoginPriorityTypeArr);
    }

    public static AutoLoginReporter$Companion$AutoLoginPriorityType valueOf(String str) {
        return (AutoLoginReporter$Companion$AutoLoginPriorityType) Enum.valueOf(AutoLoginReporter$Companion$AutoLoginPriorityType.class, str);
    }

    public static AutoLoginReporter$Companion$AutoLoginPriorityType[] values() {
        return (AutoLoginReporter$Companion$AutoLoginPriorityType[]) $VALUES.clone();
    }
}
