package ru.ok.media.utils;

/* loaded from: classes9.dex */
public class TimedEvent {
    private volatile long lastSignal = -1;

    public long elapsed() {
        return elapsed(0);
    }

    public void signal() {
        this.lastSignal = System.currentTimeMillis();
    }

    public void signalOnce() {
        if (this.lastSignal < 0) {
            signal();
        }
    }

    public long elapsed(int i) {
        return this.lastSignal < 0 ? i : System.currentTimeMillis() - this.lastSignal;
    }
}
