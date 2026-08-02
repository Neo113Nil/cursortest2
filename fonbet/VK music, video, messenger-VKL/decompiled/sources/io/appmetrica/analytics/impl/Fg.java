package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* loaded from: classes8.dex */
public final class Fg {
    public Fg(InterfaceC4701ab interfaceC4701ab) {
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC4701ab a(Context context, IHandlerExecutor iHandlerExecutor) {
        C5171sg c5171sg;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c5171sg = new C5171sg(context, iHandlerExecutor);
            } catch (Throwable unused) {
            }
            return c5171sg != null ? new Eg() : c5171sg;
        }
        c5171sg = null;
        if (c5171sg != null) {
        }
    }
}
