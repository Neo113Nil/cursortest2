package xsna;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: AndroidLog.kt */
/* loaded from: classes11.dex */
public final class qa2 extends Handler {
    public static final qa2 a = new qa2();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        CopyOnWriteArraySet<Logger> copyOnWriteArraySet = oa2.a;
        String loggerName = logRecord.getLoggerName();
        int c = crx0.c(logRecord);
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String str = oa2.b.get(loggerName);
        if (str == null) {
            str = erm0.D0(23, loggerName);
        }
        if (Log.isLoggable(str, c)) {
            if (thrown != null) {
                StringBuilder b = v1v.b(message, '\n');
                b.append(Log.getStackTraceString(thrown));
                message = b.toString();
            }
            int length = message.length();
            int i = 0;
            while (i < length) {
                int L = drm0.L(message, '\n', i, 4);
                if (L == -1) {
                    L = length;
                }
                while (true) {
                    min = Math.min(L, i + 4000);
                    Log.println(c, str, message.substring(i, min));
                    if (min >= L) {
                        break;
                    } else {
                        i = min;
                    }
                }
                i = min + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
