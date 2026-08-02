package ru.ok.tensorflow.util;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes9.dex */
public final class DefaultLogger implements Logger {
    private static final int DEFAULT_MIN_LOG_LEVEL = 3;
    private static final String DEFAULT_TAG = "ru/ok/tensorflow";
    private static final Set<String> IGNORED_CLASS_NAMES;
    private final String messagePrefix;
    private int minLogLevel;
    private final String tag;

    static {
        HashSet hashSet = new HashSet(3);
        IGNORED_CLASS_NAMES = hashSet;
        hashSet.add("dalvik.system.VMStack");
        hashSet.add("java.lang.Thread");
        hashSet.add(DefaultLogger.class.getCanonicalName());
    }

    public DefaultLogger(Class<?> cls) {
        this(cls.getSimpleName());
    }

    private static String getCallerSimpleName() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String className = stackTraceElement.getClassName();
            if (!IGNORED_CLASS_NAMES.contains(className)) {
                return className.split("\\.")[r0.length - 1];
            }
        }
        return "DefaultLogger";
    }

    private String toMessage(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.messagePrefix);
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // ru.ok.tensorflow.util.Logger
    public void d(String str, Object... objArr) {
        if (isLoggable(3)) {
            toMessage(str, objArr);
        }
    }

    @Override // ru.ok.tensorflow.util.Logger
    public void e(String str, Object... objArr) {
        if (isLoggable(6)) {
            Log.e(this.tag, toMessage(str, objArr));
        }
    }

    @Override // ru.ok.tensorflow.util.Logger
    public void i(String str, Object... objArr) {
        if (isLoggable(4)) {
            toMessage(str, objArr);
        }
    }

    public boolean isLoggable(int i) {
        return i >= this.minLogLevel || Log.isLoggable(this.tag, i);
    }

    public void setMinLogLevel(int i) {
        this.minLogLevel = i;
    }

    @Override // ru.ok.tensorflow.util.Logger
    public void v(String str, Object... objArr) {
        if (isLoggable(2)) {
            toMessage(str, objArr);
        }
    }

    @Override // ru.ok.tensorflow.util.Logger
    public void w(String str, Object... objArr) {
        if (isLoggable(5)) {
            toMessage(str, objArr);
        }
    }

    public DefaultLogger(String str) {
        this(DEFAULT_TAG, str);
    }

    public DefaultLogger(String str, String str2) {
        this.minLogLevel = 3;
        this.tag = str;
        str2 = str2 == null ? getCallerSimpleName() : str2;
        this.messagePrefix = str2.length() > 0 ? str2.concat(": ") : str2;
    }

    @Override // ru.ok.tensorflow.util.Logger
    public void d(Throwable th, String str, Object... objArr) {
        if (isLoggable(3)) {
            toMessage(str, objArr);
        }
    }

    @Override // ru.ok.tensorflow.util.Logger
    public void e(Throwable th, String str, Object... objArr) {
        if (isLoggable(6)) {
            Log.e(this.tag, toMessage(str, objArr), th);
        }
    }

    @Override // ru.ok.tensorflow.util.Logger
    public void i(Throwable th, String str, Object... objArr) {
        if (isLoggable(4)) {
            toMessage(str, objArr);
        }
    }

    @Override // ru.ok.tensorflow.util.Logger
    public void v(Throwable th, String str, Object... objArr) {
        if (isLoggable(2)) {
            toMessage(str, objArr);
        }
    }

    @Override // ru.ok.tensorflow.util.Logger
    public void w(Throwable th, String str, Object... objArr) {
        if (isLoggable(5)) {
            toMessage(str, objArr);
        }
    }

    public DefaultLogger() {
        this(DEFAULT_TAG, null);
    }

    public DefaultLogger(int i) {
        this(DEFAULT_TAG, null);
        this.minLogLevel = i;
    }
}
