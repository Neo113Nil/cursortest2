package xsna;

import java.io.RandomAccessFile;

/* compiled from: JvmFileHandle.kt */
/* loaded from: classes11.dex */
public final class uby extends y8r {
    public final RandomAccessFile f;

    public uby(boolean z, RandomAccessFile randomAccessFile) {
        super(z);
        this.f = randomAccessFile;
    }

    @Override // xsna.y8r
    public final synchronized void m() {
        this.f.close();
    }

    @Override // xsna.y8r
    public final synchronized void n() {
        this.f.getFD().sync();
    }

    @Override // xsna.y8r
    public final synchronized int o(long j, byte[] bArr, int i, int i2) {
        this.f.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = this.f.read(bArr, i, i2 - i3);
            if (read != -1) {
                i3 += read;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // xsna.y8r
    public final synchronized long p() {
        return this.f.length();
    }

    @Override // xsna.y8r
    public final synchronized void q(long j, byte[] bArr, int i, int i2) {
        this.f.seek(j);
        this.f.write(bArr, i, i2);
    }
}
