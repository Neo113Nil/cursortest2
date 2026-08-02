package com.yandex.passport.api.internal.integration;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TestInternalDataResponder$Method.values().length];
        try {
            iArr[TestInternalDataResponder$Method.VERSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TestInternalDataResponder$Method.ALL_ACCOUNTS_FROM_BACKUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TestInternalDataResponder$Method.LOGIN_ACCOUNT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
