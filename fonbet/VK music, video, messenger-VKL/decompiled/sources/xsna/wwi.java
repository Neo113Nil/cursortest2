package xsna;

/* compiled from: ConditionVariable.java */
/* loaded from: classes12.dex */
public final class wwi {
    public final dvf a;
    public boolean b;

    public wwi() {
        this(dvf.a);
    }

    public final synchronized void a() throws InterruptedException {
        while (!this.b) {
            this.a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.b) {
            try {
                this.a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j) {
        if (j <= 0) {
            return this.b;
        }
        long elapsedRealtime = this.a.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        if (j2 < elapsedRealtime) {
            b();
        } else {
            boolean z = false;
            while (!this.b && elapsedRealtime < j2) {
                try {
                    this.a.getClass();
                    wait(j2 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z = true;
                }
                elapsedRealtime = this.a.elapsedRealtime();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        return this.b;
    }

    public final synchronized void d() {
        this.b = false;
    }

    public final synchronized boolean e() {
        return this.b;
    }

    public final synchronized boolean f() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public wwi(dvf dvfVar) {
        this.a = dvfVar;
    }
}
