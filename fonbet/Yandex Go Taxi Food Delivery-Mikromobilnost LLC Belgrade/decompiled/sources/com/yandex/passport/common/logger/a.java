package com.yandex.passport.common.logger;

import defpackage.evu0;
import defpackage.jl40;

/* loaded from: classes8.dex */
public final class a {
    public static c a = b.a;

    public static String a() {
        if (!a.isEnabled()) {
            return "Passport";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int length = stackTrace.length;
        for (int i = 1; i < length; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!jl40.l(stackTraceElement.getClassName(), a.class.getName()) && evu0.H(stackTraceElement.getClassName(), "java.lang.Thread", 0, false, 6) != 0) {
                StringBuilder sb = new StringBuilder();
                String className = stackTraceElement.getClassName();
                sb.append(evu0.e0('.', className, className));
                sb.append('[');
                sb.append(stackTraceElement.getLineNumber());
                sb.append(']');
                return sb.toString();
            }
        }
        return "Passport";
    }

    public static void b(LogLevel logLevel, String str, String str2, Throwable th) {
        if (a.isEnabled()) {
            if (th == null) {
                c cVar = a;
                if (str == null) {
                    str = a();
                }
                cVar.b(logLevel, str, str2);
                return;
            }
            c cVar2 = a;
            if (str == null) {
                str = a();
            }
            cVar2.a(logLevel, str, str2, th);
        }
    }

    public static /* synthetic */ void c(LogLevel logLevel, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        b(logLevel, str, str2, null);
    }
}
