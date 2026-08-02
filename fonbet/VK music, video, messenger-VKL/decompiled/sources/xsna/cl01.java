package xsna;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public abstract class cl01 extends hh01 {
    public static final WeakReference f = new WeakReference(null);
    public WeakReference e;

    public cl01(byte[] bArr) {
        super(bArr);
        this.e = f;
    }

    @Override // xsna.hh01
    public final byte[] f() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.e.get();
                if (bArr == null) {
                    bArr = g();
                    this.e = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    public abstract byte[] g();
}
