package io.appmetrica.analytics.coreutils.internal.system;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* loaded from: classes8.dex */
public final class SystemServiceUtils {
    public static final SystemServiceUtils INSTANCE = new SystemServiceUtils();

    private SystemServiceUtils() {
    }

    public static final <T, S> S accessSystemServiceByNameSafely(Context context, String str, String str2, String str3, FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafely(context.getSystemService(str), str2, str3, functionWithThrowable);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T, S> S accessSystemServiceByNameSafelyOrDefault(Context context, String str, String str2, String str3, S s, FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafelyOrDefault(context.getSystemService(str), str2, str3, s, functionWithThrowable);
        } catch (Throwable unused) {
            return s;
        }
    }

    public static final <T, S> S accessSystemServiceSafely(T t, String str, String str2, FunctionWithThrowable<T, S> functionWithThrowable) {
        if (t == null) {
            return null;
        }
        try {
            return functionWithThrowable.apply(t);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T, S> S accessSystemServiceSafelyOrDefault(T t, String str, String str2, S s, FunctionWithThrowable<T, S> functionWithThrowable) {
        S s2 = (S) accessSystemServiceSafely(t, str, str2, functionWithThrowable);
        return s2 == null ? s : s2;
    }
}
