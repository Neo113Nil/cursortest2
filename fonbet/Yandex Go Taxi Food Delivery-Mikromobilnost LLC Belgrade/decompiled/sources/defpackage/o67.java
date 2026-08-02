package defpackage;

/* loaded from: classes9.dex */
public class o67 {
    public final x43 a = new x43();
    public int b;

    public final void a(byte[] bArr) {
        synchronized (this) {
            int i = this.b;
            if (bArr.length + i < h63.a) {
                this.b = i + (bArr.length / 2);
                this.a.addLast(bArr);
            }
        }
    }

    public final byte[] b(int i) {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.a.n();
            if (bArr != null) {
                this.b -= bArr.length / 2;
            } else {
                bArr = null;
            }
        }
        return bArr == null ? new byte[i] : bArr;
    }
}
