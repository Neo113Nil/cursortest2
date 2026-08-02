package com.yandex.passport.api.internal.integration;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/passport/api/internal/integration/TestInternalDataResponder$Method", "", "Lcom/yandex/passport/api/internal/integration/TestInternalDataResponder$Method;", "VERSION", "ALL_ACCOUNTS_FROM_BACKUP", "LOGIN_ACCOUNT", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TestInternalDataResponder$Method {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TestInternalDataResponder$Method[] $VALUES;
    public static final TestInternalDataResponder$Method ALL_ACCOUNTS_FROM_BACKUP;
    public static final TestInternalDataResponder$Method LOGIN_ACCOUNT;
    public static final TestInternalDataResponder$Method VERSION;

    static {
        TestInternalDataResponder$Method testInternalDataResponder$Method = new TestInternalDataResponder$Method("VERSION", 0);
        VERSION = testInternalDataResponder$Method;
        TestInternalDataResponder$Method testInternalDataResponder$Method2 = new TestInternalDataResponder$Method("ALL_ACCOUNTS_FROM_BACKUP", 1);
        ALL_ACCOUNTS_FROM_BACKUP = testInternalDataResponder$Method2;
        TestInternalDataResponder$Method testInternalDataResponder$Method3 = new TestInternalDataResponder$Method("LOGIN_ACCOUNT", 2);
        LOGIN_ACCOUNT = testInternalDataResponder$Method3;
        TestInternalDataResponder$Method[] testInternalDataResponder$MethodArr = {testInternalDataResponder$Method, testInternalDataResponder$Method2, testInternalDataResponder$Method3};
        $VALUES = testInternalDataResponder$MethodArr;
        $ENTRIES = kotlin.enums.a.a(testInternalDataResponder$MethodArr);
    }

    public static TestInternalDataResponder$Method valueOf(String str) {
        return (TestInternalDataResponder$Method) Enum.valueOf(TestInternalDataResponder$Method.class, str);
    }

    public static TestInternalDataResponder$Method[] values() {
        return (TestInternalDataResponder$Method[]) $VALUES.clone();
    }
}
