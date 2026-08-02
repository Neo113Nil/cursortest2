package com.yandex.plus.home.feature.webviews.internalapi.authorization;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internalapi/authorization/LogoutResult;", "", "SUCCESS", "CANCEL", "ERROR", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogoutResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogoutResult[] $VALUES;
    public static final LogoutResult CANCEL;
    public static final LogoutResult ERROR;
    public static final LogoutResult SUCCESS;

    static {
        LogoutResult logoutResult = new LogoutResult("SUCCESS", 0);
        SUCCESS = logoutResult;
        LogoutResult logoutResult2 = new LogoutResult("CANCEL", 1);
        CANCEL = logoutResult2;
        LogoutResult logoutResult3 = new LogoutResult("ERROR", 2);
        ERROR = logoutResult3;
        LogoutResult[] logoutResultArr = {logoutResult, logoutResult2, logoutResult3};
        $VALUES = logoutResultArr;
        $ENTRIES = a.a(logoutResultArr);
    }

    public static LogoutResult valueOf(String str) {
        return (LogoutResult) Enum.valueOf(LogoutResult.class, str);
    }

    public static LogoutResult[] values() {
        return (LogoutResult[]) $VALUES.clone();
    }
}
