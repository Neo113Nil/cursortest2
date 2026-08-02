package ru.ok.android.utils.log;

import android.content.Context;
import android.text.format.Time;
import com.vk.dto.common.ImageSizeKey;
import io.jsonwebtoken.JwtParser;
import xsna.tdj;

/* loaded from: classes9.dex */
public class FileLogger {
    private static volatile FileLogger instance;
    private final LineAppender appender;
    private ThreadLocal<Holder> holderThreadLocal = new ThreadLocal<>();

    public static class Holder {
        final Time date;
        long lastTime;
        String lastTimeFormatted;
        final StringBuilder sb;

        private Holder() {
            this.date = new Time();
            this.sb = new StringBuilder();
        }
    }

    private FileLogger(Context context) {
        this.appender = new SDCardFileAppender(getLogFilePath(context));
    }

    private static StringBuilder append2Digits(StringBuilder sb, int i) {
        if (i < 10) {
            sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
        }
        sb.append(i);
        return sb;
    }

    private static StringBuilder append3Digits(StringBuilder sb, int i) {
        if (i < 10) {
            sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
        }
        if (i < 100) {
            sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
        }
        sb.append(i);
        return sb;
    }

    private String buildLogLine(long j, int i, String str, String str2) {
        Holder holder = getHolder();
        format(holder, j);
        return buildLogLine(holder, i, str, str2);
    }

    private String format(Holder holder, long j) {
        String str;
        if (holder.lastTime == j && (str = holder.lastTimeFormatted) != null) {
            return str;
        }
        Time time = holder.date;
        time.set(j);
        String formatForLog = formatForLog(time, j, holder.sb);
        holder.lastTimeFormatted = formatForLog;
        holder.lastTime = j;
        return formatForLog;
    }

    public static final String formatForLog(Time time, long j, StringBuilder sb) {
        if (time == null) {
            return "";
        }
        if (sb == null) {
            sb = new StringBuilder();
        }
        sb.setLength(0);
        sb.append(time.year);
        sb.append('-');
        append2Digits(sb, time.month + 1).append('-');
        append2Digits(sb, time.monthDay).append(' ');
        append2Digits(sb, time.hour).append(':');
        append2Digits(sb, time.minute).append(':');
        append2Digits(sb, time.second).append(JwtParser.SEPARATOR_CHAR);
        append3Digits(sb, (int) (j % 1000));
        return sb.toString();
    }

    public static FileLogger from(Context context) {
        if (instance == null) {
            synchronized (FileLogger.class) {
                try {
                    if (instance == null) {
                        instance = new FileLogger(context);
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private Holder getHolder() {
        Holder holder = this.holderThreadLocal.get();
        if (holder != null) {
            return holder;
        }
        Holder holder2 = new Holder();
        this.holderThreadLocal.set(holder2);
        return holder2;
    }

    public static String getLogFilePath(Context context) {
        return getLogsDirPath(context) + "/ok.log";
    }

    public static String getLogsDirPath(Context context) {
        return "Android/data/" + context.getPackageName() + "/logs";
    }

    @Deprecated
    public void a(String str, String str2) {
        this.appender.append(buildLogLine(System.currentTimeMillis(), 7, str, str2));
    }

    @Deprecated
    public void d(String str, String str2) {
        this.appender.append(buildLogLine(System.currentTimeMillis(), 3, str, str2));
    }

    @Deprecated
    public void e(String str, String str2) {
        this.appender.append(buildLogLine(System.currentTimeMillis(), 6, str, str2));
    }

    public void flush() {
        this.appender.flush();
    }

    @Deprecated
    public void i(String str, String str2) {
        this.appender.append(buildLogLine(System.currentTimeMillis(), 4, str, str2));
    }

    @Deprecated
    public void log(int i, String str, String str2) {
        this.appender.append(buildLogLine(System.currentTimeMillis(), i, str, str2));
    }

    @Deprecated
    public void v(String str, String str2) {
        this.appender.append(buildLogLine(System.currentTimeMillis(), 2, str, str2));
    }

    @Deprecated
    public void w(String str, String str2) {
        this.appender.append(buildLogLine(System.currentTimeMillis(), 5, str, str2));
    }

    @Deprecated
    public void e(String str, String str2, Throwable th) {
        log(6, str, str2, th);
    }

    public void log(int i, String str, String str2, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        Holder holder = getHolder();
        format(holder, currentTimeMillis);
        this.appender.append(buildLogLine(holder, i, str, str2));
        log(holder, i, str, th);
    }

    @Deprecated
    public void w(String str, String str2, Throwable th) {
        log(5, str, str2, th);
    }

    private String buildLogLine(Holder holder, int i, String str, String str2) {
        StringBuilder sb = holder.sb;
        sb.setLength(0);
        sb.append(holder.lastTimeFormatted);
        if (i == 2) {
            sb.append(" V/");
        } else if (i == 4) {
            sb.append(" I/");
        } else if (i == 5) {
            sb.append(" W/");
        } else if (i == 6) {
            sb.append(" E/");
        } else if (i != 7) {
            sb.append(" D/");
        } else {
            sb.append(" A/");
        }
        return tdj.a(sb, str, ": ", str2);
    }

    private void log(Holder holder, int i, String str, Throwable th) {
        boolean z = false;
        while (true) {
            LineAppender lineAppender = this.appender;
            long j = holder.lastTime;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "Caused by: " : "");
            sb.append(th);
            String sb2 = sb.toString();
            FileLogger fileLogger = this;
            int i2 = i;
            String str2 = str;
            lineAppender.append(fileLogger.buildLogLine(j, i2, str2, sb2));
            StackTraceElement[] stackTrace = th == null ? null : th.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                int i3 = 0;
                while (i3 < length) {
                    fileLogger.appender.append(fileLogger.buildLogLine(holder.lastTime, i2, str2, stackTrace[i3].toString()));
                    i3++;
                    fileLogger = this;
                }
            }
            if (th != null) {
                z = true;
                th = th.getCause();
            }
            if (th == null) {
                return;
            }
            i = i2;
            str = str2;
        }
    }
}
