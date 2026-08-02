package xsna;

import java.io.IOException;

/* compiled from: StartOffsetExtractorInput.java */
/* loaded from: classes12.dex */
public final class iqk0 implements qgq {
    public final qgq a;
    public final long b;

    public iqk0(qgq qgqVar, long j) {
        this.a = qgqVar;
        fxc0.p(qgqVar.getPosition() >= j);
        this.b = j;
    }

    @Override // xsna.qgq
    public final int a(int i, int i2, byte[] bArr) throws IOException {
        return this.a.a(i, i2, bArr);
    }

    @Override // xsna.qgq
    public final void advancePeekPosition(int i) throws IOException {
        this.a.advancePeekPosition(i);
    }

    @Override // xsna.qgq
    public final long getLength() {
        return this.a.getLength() - this.b;
    }

    @Override // xsna.qgq
    public final long getPeekPosition() {
        return this.a.getPeekPosition() - this.b;
    }

    @Override // xsna.qgq
    public final long getPosition() {
        return this.a.getPosition() - this.b;
    }

    @Override // xsna.qgq
    public final boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.a.peekFully(bArr, i, i2, z);
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.a.read(bArr, i, i2);
    }

    @Override // xsna.qgq
    public final boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.a.readFully(bArr, 0, i2, z);
    }

    @Override // xsna.qgq
    public final void resetPeekPosition() {
        this.a.resetPeekPosition();
    }

    @Override // xsna.qgq
    public final int skip(int i) throws IOException {
        return this.a.skip(i);
    }

    @Override // xsna.qgq
    public final boolean skipFully(int i, boolean z) throws IOException {
        return this.a.skipFully(i, true);
    }

    @Override // xsna.qgq
    public final void peekFully(byte[] bArr, int i, int i2) throws IOException {
        this.a.peekFully(bArr, i, i2);
    }

    @Override // xsna.qgq
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.a.readFully(bArr, i, i2);
    }

    @Override // xsna.qgq
    public final void skipFully(int i) throws IOException {
        this.a.skipFully(i);
    }
}
