package androidx.media3.exoplayer.hls;

import android.media.MediaParser$SeekableInputReader;
import defpackage.c5p;
import java.io.IOException;

/* loaded from: classes10.dex */
final class MediaParserHlsMediaChunkExtractor$PeekingInputReader implements MediaParser$SeekableInputReader {
    private final c5p extractorInput;
    private int totalPeekedBytes;

    private MediaParserHlsMediaChunkExtractor$PeekingInputReader(c5p c5pVar) {
        this.extractorInput = c5pVar;
    }

    public long getLength() {
        return this.extractorInput.getLength();
    }

    public long getPosition() {
        return this.extractorInput.L();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int p = this.extractorInput.p(i, i2, bArr);
        this.totalPeekedBytes += p;
        return p;
    }

    public void seekToPosition(long j) {
        throw new UnsupportedOperationException();
    }
}
