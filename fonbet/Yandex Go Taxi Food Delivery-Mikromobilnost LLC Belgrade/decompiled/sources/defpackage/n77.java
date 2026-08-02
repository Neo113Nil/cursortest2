package defpackage;

import java.io.OutputStream;

/* loaded from: classes11.dex */
public final class n77 extends OutputStream {
    public final /* synthetic */ int a;

    private final void a(int i) {
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }

    private final void e(int i, int i2, byte[] bArr) {
    }

    private final void k(byte[] bArr) {
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "ByteStreams.nullOutputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                bArr.getClass();
                ffx.q(i, i2 + i, bArr.length);
                break;
            case 1:
            default:
                super.write(bArr, i, i2);
                break;
            case 2:
                break;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        switch (this.a) {
            case 0:
                bArr.getClass();
                break;
            case 1:
            default:
                super.write(bArr);
                break;
            case 2:
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.a;
    }
}
