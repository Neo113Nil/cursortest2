package xsna;

import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: TooManyRequestBackoffGlobal.kt */
/* loaded from: classes.dex */
public final class k2p0 implements m2p0 {
    public static final k2p0 b = new k2p0();
    public static final ArrayDeque<Long> c = new ArrayDeque<>();
    public static final ReentrantLock d = new ReentrantLock(true);

    @Override // xsna.m2p0
    public final void a(final int i, final long j) {
        gzs gzsVar = new gzs() { // from class: xsna.j2p0
            @Override // xsna.gzs
            public final Object invoke() {
                ReentrantLock reentrantLock = k2p0.d;
                reentrantLock.lockInterruptibly();
                try {
                    ArrayDeque<Long> arrayDeque = k2p0.c;
                    int size = arrayDeque.size();
                    int i2 = i;
                    if (i2 == size) {
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        int i3 = 0;
                        if (i2 > arrayDeque.size()) {
                            int size2 = i2 - arrayDeque.size();
                            while (i3 < size2) {
                                arrayDeque.addFirst(0L);
                                i3++;
                            }
                        } else {
                            int size3 = arrayDeque.size() - i2;
                            while (i3 < size3) {
                                arrayDeque.removeFirst();
                                i3++;
                            }
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                    reentrantLock.unlock();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    ArrayDeque<Long> arrayDeque2 = k2p0.c;
                    arrayDeque2.addLast(Long.valueOf(elapsedRealtime));
                    long longValue = j - (elapsedRealtime - arrayDeque2.removeFirst().longValue());
                    if (longValue > 0) {
                        Thread.sleep(longValue);
                    }
                    return s3q0.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        };
        ReentrantLock reentrantLock = d;
        reentrantLock.lockInterruptibly();
        try {
            gzsVar.invoke();
        } finally {
            reentrantLock.unlock();
        }
    }
}
