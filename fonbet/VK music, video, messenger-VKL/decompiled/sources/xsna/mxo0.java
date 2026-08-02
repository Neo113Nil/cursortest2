package xsna;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: Timeout.kt */
/* loaded from: classes11.dex */
public class mxo0 {
    public static final a d = new a();
    public boolean a;
    public long b;
    public long c;

    public mxo0 a() {
        this.a = false;
        return this;
    }

    public mxo0 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public mxo0 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public mxo0 g(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "timeout < 0: ").toString());
        }
        this.c = timeUnit.toNanos(j);
        return this;
    }

    public long h() {
        return this.c;
    }

    /* compiled from: Timeout.kt */
    public static final class a extends mxo0 {
        @Override // xsna.mxo0
        public final void f() {
        }

        @Override // xsna.mxo0
        public final mxo0 d(long j) {
            return this;
        }

        @Override // xsna.mxo0
        public final mxo0 g(long j, TimeUnit timeUnit) {
            return this;
        }
    }
}
