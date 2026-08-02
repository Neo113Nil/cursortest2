package xsna;

import java.lang.ref.WeakReference;
import ru.ok.gl.util.MathUtil;

/* compiled from: RecordTimings.java */
/* loaded from: classes3.dex */
public final class nhf0 {
    public volatile WeakReference<vky> a;
    public volatile long b;
    public final MathUtil.Ema c = new MathUtil.Ema(40);
    public long d = 0;
    public final Object e = new Object();

    public final void a() {
        synchronized (this.e) {
            this.d = 0L;
            this.c.reset();
        }
    }

    public final void b(long j) {
        synchronized (this.e) {
            try {
                if (this.d != 0) {
                    this.c.add(j - r1);
                }
                this.d = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
