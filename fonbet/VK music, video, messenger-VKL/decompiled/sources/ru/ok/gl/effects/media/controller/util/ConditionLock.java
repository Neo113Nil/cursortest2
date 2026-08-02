package ru.ok.gl.effects.media.controller.util;

/* loaded from: classes9.dex */
public class ConditionLock {
    private final Object lock;
    private final boolean notifyAll;
    private volatile boolean state;

    public ConditionLock(boolean z) {
        this(z, true);
    }

    public void await(boolean z) {
        synchronized (this.lock) {
            while (z != this.state) {
                try {
                    this.lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public boolean get() {
        return this.state;
    }

    public void set(boolean z) {
        synchronized (this.lock) {
            try {
                this.state = z;
                if (this.notifyAll) {
                    this.lock.notifyAll();
                } else {
                    this.lock.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ConditionLock(boolean z, boolean z2) {
        this.lock = new Object();
        this.notifyAll = z2;
        set(z);
    }

    public void await(boolean z, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.lock) {
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                while (true) {
                    long j2 = j - (currentTimeMillis2 - currentTimeMillis);
                    if (z == this.state || j2 <= 0) {
                        break;
                    }
                    this.lock.wait(j2);
                    currentTimeMillis2 = System.currentTimeMillis();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
