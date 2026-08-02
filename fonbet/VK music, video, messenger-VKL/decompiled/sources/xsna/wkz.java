package xsna;

/* compiled from: LivePresenter.java */
/* loaded from: classes3.dex */
public final class wkz implements cvp {
    public Object b;

    public void a(byte b, boolean z, boolean z2) {
        byte[] bArr = (byte[]) this.b;
        byte b2 = (byte) (b & 31);
        bArr[17] = b2;
        if (z) {
            bArr[17] = (byte) (b2 | 128);
        } else if (z2) {
            bArr[17] = (byte) (b2 | 64);
        }
    }

    public void b(int i, int i2) {
        byte[] bArr = (byte[]) this.b;
        bArr[0] = 36;
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i2 >> 8) & 255);
        bArr[3] = (byte) (i2 & 255);
    }

    @Override // xsna.cvp
    public void c() {
        ((com.vk.libvideo.live.impl.views.live.b) this.b).a();
    }

    public void d() {
        byte[] bArr = (byte[]) this.b;
        bArr[5] = (byte) (bArr[5] | 128);
    }

    public void e(int i) {
        byte[] bArr = (byte[]) this.b;
        bArr[6] = (byte) ((i >> 8) & 255);
        bArr[7] = (byte) (i & 255);
    }

    public void f(int i) {
        byte[] bArr = (byte[]) this.b;
        bArr[12] = (byte) ((i >> 24) & 255);
        bArr[13] = (byte) ((i >> 16) & 255);
        bArr[14] = (byte) ((i >> 8) & 255);
        bArr[15] = (byte) (i & 255);
    }

    public void g(int i) {
        byte[] bArr = (byte[]) this.b;
        bArr[8] = (byte) ((i >> 24) & 255);
        bArr[9] = (byte) ((i >> 16) & 255);
        bArr[10] = (byte) ((i >> 8) & 255);
        bArr[11] = (byte) (i & 255);
    }

    public void h() {
        byte[] bArr = (byte[]) this.b;
        bArr[4] = (byte) (bArr[4] | 128);
    }
}
