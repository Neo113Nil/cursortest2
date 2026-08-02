package ru.ok.tracer.lite.crash.report;

/* compiled from: LogEntryLite.kt */
/* loaded from: classes9.dex */
public final class LogEntryLite {
    private final String messageString;
    private final long ts;

    public LogEntryLite(long j, String str) {
        this.ts = j;
        this.messageString = str;
    }

    public static /* synthetic */ void appendToApi$default(LogEntryLite logEntryLite, Appendable appendable, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        logEntryLite.appendToApi(appendable, i);
    }

    public final void appendToApi(Appendable appendable, int i) {
        appendable.append("#");
        appendable.append(String.valueOf(i));
        appendable.append(" ");
        LogEntryLiteKt.appendRFC3339(appendable, this.ts);
        appendable.append(" | ");
        appendable.append(this.messageString);
        appendable.append("\n");
    }

    public final String getMessageString() {
        return this.messageString;
    }

    public final long getTs() {
        return this.ts;
    }
}
