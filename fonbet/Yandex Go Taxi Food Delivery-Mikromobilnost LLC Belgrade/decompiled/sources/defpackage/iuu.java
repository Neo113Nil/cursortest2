package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.InterruptedIOException;
import java.util.TimeZone;

/* loaded from: classes9.dex */
public final class iuu implements uis0 {
    public final boolean a;
    public final yp6 b = new yp6();
    public boolean c;
    public final /* synthetic */ luu w;

    public iuu(luu luuVar, boolean z) {
        this.w = luuVar;
        this.a = z;
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z) {
        long min;
        boolean z2;
        luu luuVar = this.w;
        synchronized (luuVar) {
            luuVar.D.i();
            while (luuVar.w >= luuVar.x && !this.a && !this.c && luuVar.g() == null) {
                try {
                    try {
                        luuVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    luuVar.D.m();
                    throw th;
                }
            }
            luuVar.D.m();
            luuVar.b();
            min = Math.min(luuVar.x - luuVar.w, this.b.b);
            luuVar.w += min;
            z2 = z && min == this.b.b;
        }
        this.w.D.i();
        try {
            luu luuVar2 = this.w;
            luuVar2.b.n(luuVar2.a, z2, this.b, min);
        } finally {
            this.w.D.m();
        }
    }

    @Override // defpackage.uis0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        luu luuVar = this.w;
        TimeZone timeZone = bg61.a;
        synchronized (luuVar) {
            if (this.c) {
                return;
            }
            boolean z = luuVar.g() == null;
            luu luuVar2 = this.w;
            if (!luuVar2.B.a) {
                if (this.b.b > 0) {
                    while (this.b.b > 0) {
                        a(true);
                    }
                } else if (z) {
                    luuVar2.b.n(luuVar2.a, true, null, 0L);
                }
            }
            luu luuVar3 = this.w;
            synchronized (luuVar3) {
                this.c = true;
                luuVar3.notifyAll();
            }
            this.w.b.flush();
            this.w.a();
        }
    }

    @Override // defpackage.uis0, java.io.Flushable
    public final void flush() {
        luu luuVar = this.w;
        TimeZone timeZone = bg61.a;
        synchronized (luuVar) {
            luuVar.b();
        }
        while (this.b.b > 0) {
            a(false);
            this.w.b.flush();
        }
    }

    @Override // defpackage.uis0
    public final ydz0 timeout() {
        return this.w.D;
    }

    @Override // defpackage.uis0
    public final void write(yp6 yp6Var, long j) {
        TimeZone timeZone = bg61.a;
        yp6 yp6Var2 = this.b;
        yp6Var2.write(yp6Var, j);
        while (yp6Var2.b >= PlaybackStateCompat.ACTION_PREPARE) {
            a(false);
        }
    }
}
