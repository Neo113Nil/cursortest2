package xsna;

import java.io.IOException;

/* compiled from: ExtractorInput.java */
/* loaded from: classes12.dex */
public interface qgq extends suk {
    int a(int i, int i2, byte[] bArr) throws IOException;

    void advancePeekPosition(int i) throws IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    void peekFully(byte[] bArr, int i, int i2) throws IOException;

    boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException;

    void readFully(byte[] bArr, int i, int i2) throws IOException;

    boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException;

    void resetPeekPosition();

    int skip(int i) throws IOException;

    void skipFully(int i) throws IOException;

    boolean skipFully(int i, boolean z) throws IOException;
}
