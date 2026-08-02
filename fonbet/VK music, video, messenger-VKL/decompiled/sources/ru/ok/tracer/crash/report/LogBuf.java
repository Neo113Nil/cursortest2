package ru.ok.tracer.crash.report;

import java.util.Iterator;
import xsna.gcy;
import xsna.s3q0;
import xsna.sk3;
import xsna.wk3;
import xsna.zcl;

/* compiled from: LogBuf.kt */
/* loaded from: classes9.dex */
public final class LogBuf implements Iterable<LogEntry>, gcy {
    private final sk3<LogEntry> deque;
    private int length;
    private final int maxLogsLength;

    public LogBuf() {
        this(0, 1, null);
    }

    public final void addLast(LogEntry logEntry) {
        synchronized (this.deque) {
            try {
                this.deque.addLast(logEntry);
                this.length += logEntry.getApiLineLength();
                while (this.length > this.maxLogsLength) {
                    LogEntry l = this.deque.l();
                    if (l == null) {
                        this.length = 0;
                    } else {
                        this.length -= l.getApiLineLength();
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<LogEntry> iterator() {
        LogEntry[] logEntryArr;
        synchronized (this.deque) {
            logEntryArr = (LogEntry[]) this.deque.toArray(new LogEntry[0]);
        }
        return new wk3(logEntryArr);
    }

    public final boolean offerFirst(LogEntry logEntry) {
        synchronized (this.deque) {
            int apiLineLength = logEntry.getApiLineLength();
            if (this.length + apiLineLength > this.maxLogsLength) {
                return false;
            }
            this.deque.addFirst(logEntry);
            this.length += apiLineLength;
            return true;
        }
    }

    public LogBuf(int i) {
        this.maxLogsLength = i;
        this.deque = new sk3<>();
    }

    public /* synthetic */ LogBuf(int i, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i);
    }
}
