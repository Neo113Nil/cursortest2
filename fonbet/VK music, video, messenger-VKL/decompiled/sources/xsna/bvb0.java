package xsna;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Pool.kt */
/* loaded from: classes2.dex */
public abstract class bvb0<T> {
    public final int a;
    public final edc<T> b;
    public final ReentrantLock c = new ReentrantLock(true);
    public int d;

    public bvb0(int i) {
        this.a = i;
        this.b = new edc<>(i);
    }

    public final T a() {
        T c;
        edc<T> edcVar = this.b;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (edcVar.b == edcVar.c) {
                c = null;
            } else {
                c = edcVar.c();
                if (c == null) {
                    this.d++;
                }
            }
            return c;
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract void b(T t);

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r1.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r2 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r0.d() < r9.a) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        b(r10);
        r0.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(T t) {
        boolean z;
        edc<T> edcVar = this.b;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            int d = edcVar.d();
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= d) {
                    z = false;
                    break;
                }
                if (i < 0 || i >= edcVar.d()) {
                    break;
                }
                if (edcVar.a[(edcVar.b + i) & edcVar.d] == t) {
                    z = true;
                    break;
                }
                i++;
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (Throwable th) {
            throw th;
        } finally {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "(acquireNullCount=" + this.d + ", poolSize=" + this.b.d() + ')';
    }
}
