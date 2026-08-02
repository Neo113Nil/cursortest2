package ru.ok.tracer.lite.crash.report;

import android.util.Log;
import java.util.List;
import xsna.erm0;
import xsna.j5g;
import xsna.s3q0;
import xsna.sk3;
import xsna.zcl;

/* compiled from: LogStorageLite.kt */
/* loaded from: classes11.dex */
public final class LogStorageLite {
    private final sk3<LogEntryLite> logsDeque;
    private int logsLength;
    private final int maxLogsLength;

    public LogStorageLite() {
        this(0, 1, null);
    }

    public final List<LogEntryLite> getLogs$tracer_lite_crash_report_release() {
        List<LogEntryLite> O0;
        synchronized (this.logsDeque) {
            O0 = j5g.O0(this.logsDeque);
        }
        return O0;
    }

    public final void log(String str) {
        int i = this.maxLogsLength - 36;
        if (i <= 0) {
            Log.e("Tracer", "Logs length too limited");
            return;
        }
        String D0 = erm0.D0(i, str);
        LogEntryLite logEntryLite = new LogEntryLite(System.currentTimeMillis(), D0);
        synchronized (this.logsDeque) {
            try {
                this.logsDeque.addLast(logEntryLite);
                this.logsLength = D0.length() + 36 + this.logsLength;
                while (this.logsLength > 65536) {
                    this.logsLength -= this.logsDeque.removeFirst().getMessageString().length() + 36;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public LogStorageLite(int i) {
        this.maxLogsLength = i;
        this.logsDeque = new sk3<>();
    }

    public /* synthetic */ LogStorageLite(int i, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 65536 : i);
    }
}
