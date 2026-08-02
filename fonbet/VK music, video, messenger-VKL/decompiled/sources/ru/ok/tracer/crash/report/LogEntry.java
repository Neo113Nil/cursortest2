package ru.ok.tracer.crash.report;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.OutputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import xsna.emb;
import xsna.jw5;
import xsna.wr;
import xsna.zcl;

/* compiled from: LogEntry.kt */
/* loaded from: classes9.dex */
public final class LogEntry {
    public static final Companion Companion = new Companion(null);
    private final int apiLineLength;
    private final byte[] messageBytes;
    private final long ts;

    /* compiled from: LogEntry.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ LogEntry invoke$default(Companion companion, long j, String str, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = Integer.MAX_VALUE;
            }
            return companion.invoke(j, str, i);
        }

        public final LogEntry invoke(long j, String str, int i) {
            return new LogEntry(j, LogEntryKt.coerceUtf8SizeAtMost(str.getBytes(emb.b), i), null);
        }

        public final LogEntry parseFromStorage(ByteBuffer byteBuffer) throws BufferUnderflowException {
            if (!byteBuffer.hasArray()) {
                throw new IllegalArgumentException("Only buffers with backing array supported");
            }
            long j = byteBuffer.getLong();
            int i = byteBuffer.getInt();
            if (byteBuffer.remaining() < i) {
                throw new BufferUnderflowException();
            }
            int position = byteBuffer.position() + byteBuffer.arrayOffset();
            LogEntry logEntry = new LogEntry(j, jw5.l(position, position + i, byteBuffer.array()), null);
            wr.c(i, byteBuffer);
            return logEntry;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LogEntry(long j, byte[] bArr, zcl zclVar) {
        this(j, bArr);
    }

    public static /* synthetic */ void writeToApi$default(LogEntry logEntry, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        logEntry.writeToApi(outputStream, i);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LogEntry)) {
            return false;
        }
        LogEntry logEntry = (LogEntry) obj;
        return this.ts == logEntry.ts && Arrays.equals(this.messageBytes, logEntry.messageBytes);
    }

    public final int getApiLineLength() {
        return this.apiLineLength;
    }

    public final long getTs() {
        return this.ts;
    }

    public int hashCode() {
        return Long.hashCode(this.ts) | Arrays.hashCode(this.messageBytes);
    }

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        writeToApi$default(this, byteArrayOutputStream, 0, 2, null);
        return byteArrayOutputStream.toString();
    }

    public final void writeToApi(OutputStream outputStream, int i) {
        LogEntryKt.writeAscii(outputStream, '#');
        LogEntryKt.writeAscii(outputStream, String.valueOf(i));
        LogEntryKt.writeAscii(outputStream, ' ');
        LogEntryKt.writeRFC3339(outputStream, this.ts);
        LogEntryKt.writeAscii(outputStream, " | ");
        outputStream.write(this.messageBytes);
        LogEntryKt.writeAscii(outputStream, '\n');
    }

    public final void writeToStorage(DataOutput dataOutput) {
        dataOutput.writeLong(this.ts);
        dataOutput.writeInt(this.messageBytes.length);
        dataOutput.write(this.messageBytes);
    }

    private LogEntry(long j, byte[] bArr) {
        this.ts = j;
        this.messageBytes = bArr;
        this.apiLineLength = bArr.length + 36;
    }
}
