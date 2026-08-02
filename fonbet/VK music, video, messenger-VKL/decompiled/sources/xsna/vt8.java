package xsna;

/* compiled from: ArrayPools.kt */
/* loaded from: classes8.dex */
public class vt8 {
    public final sk3<byte[]> a = new sk3<>();
    public int b;

    public final void a(byte[] bArr) {
        synchronized (this) {
            try {
                int i = this.b;
                if (bArr.length + i < dl3.a) {
                    this.b = i + (bArr.length / 2);
                    this.a.addLast(bArr);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final byte[] b(int i) {
        byte[] m;
        synchronized (this) {
            m = this.a.m();
            if (m != null) {
                this.b -= m.length / 2;
            } else {
                m = null;
            }
        }
        return m == null ? new byte[i] : m;
    }
}
