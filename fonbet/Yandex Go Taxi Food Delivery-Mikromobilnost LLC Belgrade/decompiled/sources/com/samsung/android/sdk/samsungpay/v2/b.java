package com.samsung.android.sdk.samsungpay.v2;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes11.dex */
abstract class b {
    private long a;
    protected boolean b;
    private final Object c = new Object();
    private int d;
    private a e;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            b bVar;
            synchronized (b.this.c) {
                bVar = b.this;
                bVar.b = false;
            }
            bVar.g();
        }
    }

    public b(long j) {
        this.a = 30000L;
        if (j > 0) {
            this.a = j;
        }
        c();
    }

    private int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    private void c() {
        this.b = false;
        this.d = 4;
    }

    private void i(boolean z) {
        this.b = z;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cannot clone instance of this class");
    }

    public boolean d() {
        return b() <= 0;
    }

    public boolean e() {
        boolean z;
        synchronized (this.c) {
            z = this.b;
        }
        return z;
    }

    public void f() {
        synchronized (this.c) {
            try {
                try {
                    this.e.cancel();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    c();
                    throw th;
                }
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void g();

    public boolean h() {
        synchronized (this.c) {
            try {
                if (d()) {
                    f();
                    return false;
                }
                this.d--;
                try {
                    this.e = new a();
                    new Timer().schedule(this.e, this.a);
                    i(true);
                    return true;
                } catch (Exception unused) {
                    i(false);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
