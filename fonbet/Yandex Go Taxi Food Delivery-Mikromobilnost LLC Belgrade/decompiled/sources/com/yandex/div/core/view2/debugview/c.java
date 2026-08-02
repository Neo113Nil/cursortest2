package com.yandex.div.core.view2.debugview;

import android.os.TransactionTooLargeException;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class c {
    public static final String a(List list) {
        return "Last 25 errors:\n".concat(kotlin.collections.a.X(kotlin.collections.a.A0(list, 25), "\n", null, null, DebugViewModelProviderKt$errorsToDetails$errorsList$1.w, 30));
    }

    public static final String b(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.getMessage());
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            sb.append('\n');
            sb.append(cause.getMessage());
        }
        return sb.toString();
    }

    public static final String c(List list) {
        return "Last 25 warnings:\n".concat(kotlin.collections.a.X(kotlin.collections.a.A0(list, 25), "\n", null, null, DebugViewModelProviderKt$warningsToDetails$warningsList$1.w, 30));
    }

    public static final boolean d(Throwable th) {
        Throwable cause;
        return (th instanceof TransactionTooLargeException) || ((cause = th.getCause()) != null && d(cause));
    }
}
