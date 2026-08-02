package yads;

/* loaded from: classes10.dex */
public final class vy {
    public boolean a;

    public vy() {
        this(0);
    }

    public final synchronized void a() {
        while (!this.a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        return this.a;
    }

    public final synchronized boolean d() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }

    public vy(int i) {
    }
}
