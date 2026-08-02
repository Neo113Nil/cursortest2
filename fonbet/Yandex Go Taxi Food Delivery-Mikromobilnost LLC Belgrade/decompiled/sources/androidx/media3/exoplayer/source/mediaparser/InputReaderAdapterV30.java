package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaParser$SeekableInputReader;
import defpackage.apg;
import defpackage.tw21;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class InputReaderAdapterV30 implements MediaParser$SeekableInputReader {
    private long currentPosition;
    private apg dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public long getAndResetSeekPosition() {
        long j = this.lastSeekPosition;
        this.lastSeekPosition = -1L;
        return j;
    }

    public long getLength() {
        return this.resourceLength;
    }

    public long getPosition() {
        return this.currentPosition;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        apg apgVar = this.dataReader;
        int i3 = tw21.a;
        int read = apgVar.read(bArr, i, i2);
        this.currentPosition += read;
        return read;
    }

    public void seekToPosition(long j) {
        this.lastSeekPosition = j;
    }

    public void setCurrentPosition(long j) {
        this.currentPosition = j;
    }

    public void setDataReader(apg apgVar, long j) {
        this.dataReader = apgVar;
        this.resourceLength = j;
        this.lastSeekPosition = -1L;
    }
}
