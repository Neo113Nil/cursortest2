package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes9.dex */
public final class juu implements y9t0 {
    public final long a;
    public boolean b;
    public final yp6 c = new yp6();
    public final yp6 w = new yp6();
    public boolean x;
    public final /* synthetic */ luu y;

    public juu(luu luuVar, long j, boolean z) {
        this.y = luuVar;
        this.a = j;
        this.b = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        luu luuVar = this.y;
        synchronized (luuVar) {
            this.x = true;
            yp6 yp6Var = this.w;
            j = yp6Var.b;
            yp6Var.clear();
            luuVar.notifyAll();
        }
        if (j > 0) {
            luu luuVar2 = this.y;
            TimeZone timeZone = bg61.a;
            luuVar2.b.k(j);
        }
        this.y.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #2 {, blocks: (B:6:0x000d, B:8:0x001a, B:13:0x0024, B:33:0x00bf, B:64:0x00eb, B:65:0x00f0, B:15:0x002d, B:17:0x0033, B:19:0x0037, B:21:0x003b, B:22:0x0049, B:24:0x004d, B:26:0x0057, B:28:0x0074, B:30:0x0085, B:47:0x009e, B:51:0x00a8, B:54:0x00ae, B:55:0x00ba, B:58:0x00e1, B:59:0x00e8), top: B:5:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:15:0x002d, B:17:0x0033, B:19:0x0037, B:21:0x003b, B:22:0x0049, B:24:0x004d, B:26:0x0057, B:28:0x0074, B:30:0x0085, B:47:0x009e, B:51:0x00a8, B:54:0x00ae, B:55:0x00ba, B:58:0x00e1, B:59:0x00e8), top: B:14:0x002d, outer: #2, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1 A[SYNTHETIC] */
    @Override // defpackage.y9t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(yp6 yp6Var, long j) {
        boolean z;
        boolean z2;
        Throwable th;
        long j2;
        long j3;
        long j4 = 0;
        if (j < 0) {
            w511.f(qv10.j(j, "byteCount < 0: "));
            return 0L;
        }
        while (true) {
            luu luuVar = this.y;
            synchronized (luuVar) {
                luuVar.b.getClass();
                iuu iuuVar = luuVar.B;
                z = true;
                try {
                    if (!iuuVar.c && !iuuVar.a) {
                        z2 = false;
                        if (z2) {
                            luuVar.C.i();
                        }
                        if (luuVar.g() != null || this.b) {
                            th = null;
                        } else {
                            th = luuVar.F;
                            if (th == null) {
                                th = new StreamResetException(luuVar.g());
                            }
                        }
                        if (!this.x) {
                            throw new IOException("stream closed");
                        }
                        yp6 yp6Var2 = this.w;
                        long j5 = yp6Var2.b;
                        if (j5 > j4) {
                            j3 = yp6Var2.read(yp6Var, Math.min(j, j5));
                            d651.b(luuVar.c, j3, 0L, 2);
                            long a = luuVar.c.a();
                            if (th == null) {
                                j2 = j4;
                                if (a >= luuVar.b.J.a() / 2) {
                                    luuVar.b.v(luuVar.a, a);
                                    d651.b(luuVar.c, 0L, a, 1);
                                }
                            } else {
                                j2 = j4;
                            }
                            z = false;
                        } else {
                            j2 = j4;
                            if (this.b || th != null) {
                                z = false;
                            } else {
                                try {
                                    luuVar.wait();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            }
                            j3 = -1;
                        }
                    }
                    if (luuVar.g() != null) {
                    }
                    th = null;
                    if (!this.x) {
                    }
                } finally {
                    if (z2) {
                        luuVar.C.m();
                    }
                }
                z2 = true;
                if (z2) {
                }
            }
            ypr yprVar = this.y.b.I;
            long j6 = this.w.b;
            yprVar.getClass();
            if (!z) {
                if (j3 != -1) {
                    return j3;
                }
                if (th == null) {
                    return -1L;
                }
                throw th;
            }
            j4 = j2;
        }
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return this.y.C;
    }
}
