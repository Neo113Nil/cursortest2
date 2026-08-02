package ru.ok.tracer.base.stacktrace;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.IdentityHashMap;
import java.util.Map;
import xsna.epx;
import xsna.s3q0;

/* compiled from: ThrowableUtils.kt */
/* loaded from: classes9.dex */
public final class ThrowableUtils {
    private static final Appendable appendIndent(Appendable appendable, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            appendable.append("\t");
        }
        return appendable;
    }

    public static final void appendStackTraceTo(Throwable th, Appendable appendable) {
        appendStackTraceTo$default(th, appendable, 0, null, th.getStackTrace(), 0, new IdentityHashMap(), 22, null);
    }

    public static /* synthetic */ void appendStackTraceTo$default(Throwable th, Appendable appendable, int i, String str, StackTraceElement[] stackTraceElementArr, int i2, Map map, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            str = "";
        }
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        appendStackTraceTo(th, appendable, i, str, stackTraceElementArr, i2, map);
    }

    public static final void appendTo(StackTraceElement stackTraceElement, Appendable appendable, int i, String str) {
        String fileName;
        appendIndent(appendable, i).append(str);
        if (stackTraceElement.isNativeMethod()) {
            fileName = "Native Method";
        } else {
            fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "Unknown Source";
            }
        }
        appendable.append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(fileName);
        if (stackTraceElement.getLineNumber() >= 0) {
            appendable.append(StringUtils.PROCESS_POSTFIX_DELIMITER).append(String.valueOf(stackTraceElement.getLineNumber()));
        }
        appendable.append(")").append('\n');
    }

    public static /* synthetic */ void appendTo$default(StackTraceElement stackTraceElement, Appendable appendable, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            str = "at ";
        }
        appendTo(stackTraceElement, appendable, i, str);
    }

    private static final int framesInCommon(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int length = stackTraceElementArr.length - 1;
        for (int length2 = stackTraceElementArr2.length - 1; length >= 0 && length2 >= 0 && epx.f(stackTraceElementArr[length], stackTraceElementArr2[length2]); length2--) {
            length--;
        }
        return (stackTraceElementArr.length - 1) - length;
    }

    private static final int framesRepeat(Throwable th, StackTraceElement[] stackTraceElementArr) {
        if (th instanceof StackOverflowError) {
            StackTraceElement stackTraceElement = stackTraceElementArr[0];
            int length = stackTraceElementArr.length;
            for (int i = 1; i < length; i++) {
                if (epx.f(stackTraceElement, stackTraceElementArr[i])) {
                    return i;
                }
            }
        }
        return 0;
    }

    private static final <T> void plusAssign(Map<T, s3q0> map, T t) {
        map.put(t, s3q0.a);
    }

    private static final void appendStackTraceTo(Throwable th, Appendable appendable, int i, String str, StackTraceElement[] stackTraceElementArr, int i2, Map<Throwable, s3q0> map) {
        if (map.containsKey(th)) {
            appendIndent(appendable, 1).append("[CIRCULAR REFERENCE: ").append(th.toString()).append(X3.j.e).append('\n');
            return;
        }
        plusAssign(map, th);
        appendIndent(appendable, i).append(str).append(th.toString()).append('\n');
        int framesRepeat = framesRepeat(th, stackTraceElementArr);
        int length = framesRepeat > 0 ? framesRepeat : stackTraceElementArr.length - i2;
        for (int i3 = 0; i3 < length; i3++) {
            appendTo$default(stackTraceElementArr[i3], appendable, i + 1, null, 4, null);
        }
        if (framesRepeat > 0) {
            appendIndent(appendable, i + 1).append("... ").append(String.valueOf(framesRepeat)).append(" calls repeat").append('\n');
        } else if (i2 != 0) {
            appendIndent(appendable, i + 1).append("... ").append(String.valueOf(i2)).append(" more").append('\n');
        }
        for (Throwable th2 : th.getSuppressed()) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            appendStackTraceTo(th2, appendable, i + 1, "Suppressed: ", stackTrace, framesInCommon(stackTraceElementArr, stackTrace), map);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            appendStackTraceTo(cause, appendable, i, "Caused by: ", stackTrace2, framesInCommon(stackTraceElementArr, stackTrace2), map);
        }
    }
}
