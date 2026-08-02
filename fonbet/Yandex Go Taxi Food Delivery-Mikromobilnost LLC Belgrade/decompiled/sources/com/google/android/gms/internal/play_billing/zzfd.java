package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeoutException;

/* loaded from: classes11.dex */
final class zzfd extends TimeoutException {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
