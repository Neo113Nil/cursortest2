package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class nq60 {
    public final long[] b;
    public final boolean[] c;
    public volatile boolean d;
    public volatile boolean f;
    public final ReentrantLock a = new ReentrantLock();
    public final ReentrantLock e = new ReentrantLock();

    public nq60(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r12.f != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int[] iArr) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            boolean z = false;
            boolean z2 = false;
            for (int i : iArr) {
                long[] jArr = this.b;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    this.d = true;
                    z2 = true;
                }
            }
            if (!z2 && !this.d) {
            }
            z = true;
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r14.f != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            boolean z = false;
            boolean z2 = false;
            for (int i : iArr) {
                long[] jArr = this.b;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    this.d = true;
                    z2 = true;
                }
            }
            if (!z2 && !this.d) {
            }
            z = true;
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
