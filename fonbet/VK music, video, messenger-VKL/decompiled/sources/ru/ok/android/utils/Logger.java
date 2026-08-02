package ru.ok.android.utils;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import ru.ok.android.commons.io.NothingnessWriter;
import ru.ok.android.utils.log.FileLogger;
import xsna.ho8;

/* loaded from: classes11.dex */
public class Logger {

    @Deprecated
    public static final String METHOD_D = "d";

    @Deprecated
    public static final String METHOD_E = "e";

    @Deprecated
    public static final String METHOD_I = "i";

    @Deprecated
    public static final String METHOD_OPEN_D = "openD";

    @Deprecated
    public static final String METHOD_OPEN_E = "openE";

    @Deprecated
    public static final String METHOD_V = "v";

    @Deprecated
    public static final String METHOD_W = "w";

    @NonNull
    private static volatile Delegate delegate = LegacyDelegate.INSTANCE;
    private static volatile boolean loggingEnable = false;

    public static class LegacyDelegate implements Delegate {
        public static final LegacyDelegate INSTANCE = new LegacyDelegate();
        private volatile FileLogger fileLogger;

        private LegacyDelegate() {
        }

        public boolean isLogToFile() {
            return this.fileLogger == null;
        }

        @Override // ru.ok.android.utils.Logger.Delegate
        public void println(int i, @NonNull String str, @Nullable String str2, @Nullable Throwable th) {
            if (th != null) {
                if (str2 != null) {
                    StringBuilder b = ho8.b(str2, "\n");
                    b.append(Log.getStackTraceString(th));
                    str2 = b.toString();
                } else {
                    str2 = Log.getStackTraceString(th);
                }
            }
            Log.println(i, str, str2);
            FileLogger fileLogger = this.fileLogger;
            if (fileLogger != null) {
                fileLogger.log(i, str, str2, th);
            }
        }

        public void setLogToFile(boolean z, Context context) {
            if (!z) {
                this.fileLogger = null;
                return;
            }
            if (this.fileLogger == null) {
                synchronized (this) {
                    try {
                        if (this.fileLogger == null) {
                            this.fileLogger = FileLogger.from(context);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    /* loaded from: classes9.dex */
    public @interface MethodType {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static String buildMessageString(@NonNull StackTraceElement stackTraceElement, String str) {
        return stackTraceElement.getMethodName() + " (" + stackTraceElement.getLineNumber() + "): " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static String buildTag(@NonNull StackTraceElement stackTraceElement) {
        return Thread.currentThread().getName() + ": " + stackTraceElement.getClassName();
    }

    @NonNull
    private static StackTraceElement caller() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTrace.length; i++) {
            if (stackTrace[i].getMethodName().equals("getStackTrace")) {
                String methodName = stackTrace[i + 2].getMethodName();
                for (int i2 = i + 3; i2 < stackTrace.length; i2++) {
                    if (!stackTrace[i2].getMethodName().equals(methodName)) {
                        return stackTrace[i2];
                    }
                }
            }
        }
        throw new AssertionError();
    }

    public static void d(String str, Object... objArr) {
        if (isLoggingEnable()) {
            try {
                d(String.format(str, objArr));
            } catch (Exception unused) {
                d(str);
            }
        }
    }

    public static void e(String str, Object... objArr) {
        if (isLoggingEnable()) {
            try {
                e(String.format(str, objArr));
            } catch (Exception unused) {
                e(str);
            }
        }
    }

    public static void i(String str) {
        if (isLoggingEnable()) {
            delegate.println(5, caller(), str, (Throwable) null);
        }
    }

    @Deprecated
    public static boolean isLogToFile() {
        return LegacyDelegate.INSTANCE.isLogToFile();
    }

    public static boolean isLoggingEnable() {
        return loggingEnable;
    }

    @Deprecated
    public static void log(int i, @Nullable String str, @Nullable String str2) {
        if (isLoggingEnable()) {
            delegate.println(i, Thread.currentThread().getName() + ": " + str, str2, (Throwable) null);
        }
    }

    @NonNull
    public static Appendable openD() {
        return openD(null);
    }

    @NonNull
    public static Appendable openE() {
        return openD(null);
    }

    public static void println(int i, String str, @Nullable String str2, @Nullable Throwable th) {
        if (isLoggingEnable()) {
            delegate.println(i, str, str2, th);
        }
    }

    @Deprecated
    public static void raw(String str, String str2, String str3, Throwable th) {
        char c;
        if (isLoggingEnable()) {
            int hashCode = str.hashCode();
            if (hashCode == 100) {
                if (str.equals("d")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode == 101) {
                if (str.equals(METHOD_E)) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode == 105) {
                if (str.equals("i")) {
                    c = 3;
                }
                c = 65535;
            } else if (hashCode != 118) {
                if (hashCode == 119 && str.equals(METHOD_W)) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("v")) {
                    c = 4;
                }
                c = 65535;
            }
            if (c == 0) {
                delegate.println(6, str2, str3, th);
                return;
            }
            if (c == 1) {
                delegate.println(5, str2, str3, th);
                return;
            }
            if (c == 2) {
                delegate.println(3, str2, str3, th);
            } else if (c != 3) {
                delegate.println(2, str2, str3, th);
            } else {
                delegate.println(4, str2, str3, th);
            }
        }
    }

    public static void setDelegate(@NonNull Delegate delegate2) {
        delegate = delegate2;
    }

    @Deprecated
    public static void setLogToFile(boolean z, Context context) {
        LegacyDelegate.INSTANCE.setLogToFile(z, context);
    }

    public static void setLoggingEnabled(boolean z) {
        loggingEnable = z;
    }

    public static void v(String str) {
        if (isLoggingEnable()) {
            delegate.println(2, caller(), str, (Throwable) null);
        }
    }

    public static void w(String str, Object... objArr) {
        if (isLoggingEnable()) {
            try {
                w(String.format(str, objArr));
            } catch (Exception unused) {
                w(str);
            }
        }
    }

    public interface Delegate {
        @NonNull
        default LogWriter open(int i, @NonNull String str, String str2) {
            println(i, str, str2, (Throwable) null);
            return new LogWriter(i, str, str2);
        }

        default void println(int i, @NonNull StackTraceElement stackTraceElement, String str, Throwable th) {
            println(i, Logger.buildTag(stackTraceElement), Logger.buildMessageString(stackTraceElement, str), th);
        }

        void println(int i, @NonNull String str, @Nullable String str2, @Nullable Throwable th);

        @NonNull
        default LogWriter open(int i, @NonNull StackTraceElement stackTraceElement, String str) {
            String buildTag = Logger.buildTag(stackTraceElement);
            println(i, buildTag, Logger.buildMessageString(stackTraceElement, str), (Throwable) null);
            return new LogWriter(i, buildTag, str);
        }
    }

    /* loaded from: classes9.dex */
    public static class LogWriter implements Appendable {
        private static final String PREFIX_SEPARATOR = ": ";
        private final StringBuilder line;
        private final int prefixLength;
        private final int priority;

        @NonNull
        private final String tag;

        public LogWriter(int i, @NonNull String str, @NonNull String str2) {
            StringBuilder sb = new StringBuilder();
            this.line = sb;
            this.tag = str;
            this.priority = i;
            if (str2.length() == 0) {
                this.prefixLength = 0;
                return;
            }
            this.prefixLength = str2.length() + 2;
            sb.append(str2);
            sb.append(PREFIX_SEPARATOR);
        }

        @Override // java.lang.Appendable
        @NonNull
        public Appendable append(@Nullable CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "null";
            }
            return append(charSequence, 0, charSequence.length());
        }

        @Override // java.lang.Appendable
        @NonNull
        public Appendable append(@Nullable CharSequence charSequence, int i, int i2) {
            if (charSequence == null) {
                charSequence = "null";
            }
            int i3 = i;
            while (i < i2) {
                if (charSequence.charAt(i) == '\n') {
                    this.line.append(charSequence, i3, i);
                    Logger.delegate.println(this.priority, this.tag, this.line.toString(), (Throwable) null);
                    StringBuilder sb = this.line;
                    sb.delete(this.prefixLength, sb.length());
                    i3 = i + 1;
                }
                i++;
            }
            if (i3 < i) {
                this.line.append(charSequence, i3, i);
            }
            return this;
        }

        @Override // java.lang.Appendable
        @NonNull
        public Appendable append(char c) {
            if (c == '\n') {
                Logger.delegate.println(this.priority, this.tag, this.line.toString(), (Throwable) null);
                StringBuilder sb = this.line;
                sb.delete(this.prefixLength, sb.length());
                return this;
            }
            this.line.append(c);
            return this;
        }
    }

    @NonNull
    public static Appendable openD(String str) {
        if (!isLoggingEnable()) {
            return NothingnessWriter.INSTANCE;
        }
        return delegate.open(3, caller(), str);
    }

    @NonNull
    public static Appendable openE(String str) {
        if (!isLoggingEnable()) {
            return NothingnessWriter.INSTANCE;
        }
        return delegate.open(6, caller(), str);
    }

    public static void d() {
        d("");
    }

    public static void e(Throwable th, String str, Object... objArr) {
        if (isLoggingEnable()) {
            try {
                e(th, String.format(str, objArr));
            } catch (Exception unused) {
                e(th, str);
            }
        }
    }

    public static void v(String str, Object... objArr) {
        if (isLoggingEnable()) {
            try {
                v(String.format(str, objArr));
            } catch (Exception unused) {
                v(str);
            }
        }
    }

    public static void w(Throwable th, String str, Object... objArr) {
        if (isLoggingEnable()) {
            try {
                w(th, String.format(str, objArr));
            } catch (Exception unused) {
                w(th, str);
            }
        }
    }

    public static void d(String str) {
        if (isLoggingEnable()) {
            delegate.println(3, caller(), str, (Throwable) null);
        }
    }

    public static void e(Throwable th) {
        if (isLoggingEnable()) {
            e(th, "error");
        }
    }

    public static void w(String str) {
        if (isLoggingEnable()) {
            delegate.println(5, caller(), str, (Throwable) null);
        }
    }

    @Deprecated
    public static void e(int i) {
        if (isLoggingEnable()) {
            e((Throwable) null, "int value = " + i);
        }
    }

    public static void w(Throwable th, String str) {
        if (isLoggingEnable()) {
            delegate.println(5, caller(), str, th);
        }
    }

    @Deprecated
    public static void e(float f) {
        if (isLoggingEnable()) {
            e((Throwable) null, "float value = " + f);
        }
    }

    @Deprecated
    public static void e(boolean z) {
        if (isLoggingEnable()) {
            e((Throwable) null, "boolean value = " + z);
        }
    }

    public static void e(String str) {
        if (isLoggingEnable()) {
            e((Throwable) null, str);
        }
    }

    public static void e(Throwable th, String str) {
        if (isLoggingEnable()) {
            delegate.println(6, caller(), str, th);
        }
    }
}
