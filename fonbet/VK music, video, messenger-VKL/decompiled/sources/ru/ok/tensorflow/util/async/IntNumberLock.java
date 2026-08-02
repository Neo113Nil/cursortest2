package ru.ok.tensorflow.util.async;

/* loaded from: classes9.dex */
public class IntNumberLock {
    private final Object lock;
    private final boolean notifyAll;
    private volatile int stateNumber;

    public IntNumberLock(int i) {
        this(i, true);
    }

    public void await(int i) {
        synchronized (this.lock) {
            while (i != this.stateNumber) {
                try {
                    this.lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void decrement() {
        synchronized (this.lock) {
            set(this.stateNumber - 1);
        }
    }

    public int get() {
        return this.stateNumber;
    }

    public void increment() {
        synchronized (this.lock) {
            set(this.stateNumber + 1);
        }
    }

    public void set(int i) {
        synchronized (this.lock) {
            try {
                this.stateNumber = i;
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

    public IntNumberLock(int i, boolean z) {
        this.lock = new Object();
        this.notifyAll = z;
        set(i);
    }

    public void await(int i, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.lock) {
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                while (true) {
                    long j2 = j - (currentTimeMillis2 - currentTimeMillis);
                    if (i == this.stateNumber || j2 <= 0) {
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
