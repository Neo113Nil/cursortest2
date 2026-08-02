package com.yandex.passport.internal.report;

import com.yandex.passport.internal.report.reporters.WebCardReporter$Source2Fa;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class xd {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebCardReporter$Source2Fa.values().length];
        try {
            iArr[WebCardReporter$Source2Fa.DataPush.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebCardReporter$Source2Fa.NotificationPush.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
