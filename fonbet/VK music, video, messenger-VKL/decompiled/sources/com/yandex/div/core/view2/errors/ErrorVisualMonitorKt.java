package com.yandex.div.core.view2.errors;

import android.os.TransactionTooLargeException;

/* compiled from: ErrorVisualMonitor.kt */
/* loaded from: classes7.dex */
public final class ErrorVisualMonitorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean causedByTransactionTooLargeException(Throwable th) {
        Throwable cause;
        return (th instanceof TransactionTooLargeException) || ((cause = th.getCause()) != null && causedByTransactionTooLargeException(cause));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getFullStackMessage(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.getMessage());
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            sb.append('\n');
            sb.append(cause.getMessage());
        }
        return sb.toString();
    }
}
