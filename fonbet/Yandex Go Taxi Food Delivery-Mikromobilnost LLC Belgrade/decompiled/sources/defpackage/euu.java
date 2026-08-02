package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import okhttp3.internal.http2.ErrorCode;

/* loaded from: classes9.dex */
public final class euu implements Closeable {
    public static final l6r0 S;
    public final htx0 A;
    public final htx0 B;
    public final htx0 C;
    public final n2g0 D;
    public long E;
    public long F;
    public long G;
    public long H;
    public final ypr I;
    public final l6r0 J;
    public l6r0 K;
    public final d651 L;
    public long M;
    public long N;
    public final jb7 O;
    public final muu P;
    public final duu Q;
    public final LinkedHashSet R;
    public final cuu a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final String c;
    public int w;
    public int x;
    public boolean y;
    public final mtx0 z;

    static {
        l6r0 l6r0Var = new l6r0();
        l6r0Var.b(4, 65535);
        l6r0Var.b(5, 16384);
        S = l6r0Var;
    }

    public euu(yuf0 yuf0Var) {
        this.a = (cuu) yuf0Var.d;
        String str = (String) yuf0Var.a;
        this.c = str == null ? null : str;
        this.x = 3;
        mtx0 mtx0Var = (mtx0) yuf0Var.b;
        this.z = mtx0Var;
        this.A = mtx0Var.d();
        this.B = mtx0Var.d();
        this.C = mtx0Var.d();
        this.D = (n2g0) yuf0Var.e;
        this.I = (ypr) yuf0Var.f;
        l6r0 l6r0Var = new l6r0();
        l6r0Var.b(4, 16777216);
        this.J = l6r0Var;
        this.K = S;
        this.L = new d651(0);
        this.N = r0.a();
        jb7 jb7Var = (jb7) yuf0Var.c;
        jb7 jb7Var2 = jb7Var != null ? jb7Var : null;
        this.O = jb7Var2;
        this.P = new muu((ici0) jb7Var2.w);
        this.Q = new duu(this, new huu((jci0) jb7Var2.c));
        this.R = new LinkedHashSet();
    }

    public final void a(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] objArr;
        TimeZone timeZone = bg61.a;
        try {
            e(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.b.values().toArray(new luu[0]);
                this.b.clear();
            }
        }
        luu[] luuVarArr = (luu[]) objArr;
        if (luuVarArr != null) {
            for (luu luuVar : luuVarArr) {
                try {
                    luuVar.c(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.P.close();
        } catch (IOException unused3) {
        }
        try {
            this.O.cancel();
        } catch (IOException unused4) {
        }
        this.A.g();
        this.B.g();
        this.C.g();
    }

    public final luu c(int i) {
        luu luuVar;
        synchronized (this) {
            luuVar = (luu) this.b.get(Integer.valueOf(i));
        }
        return luuVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final luu d(int i) {
        luu luuVar;
        synchronized (this) {
            luuVar = (luu) this.b.remove(Integer.valueOf(i));
            notifyAll();
        }
        return luuVar;
    }

    public final void e(ErrorCode errorCode) {
        synchronized (this.P) {
            synchronized (this) {
                if (this.y) {
                    return;
                }
                this.y = true;
                this.P.e(this.w, errorCode, yf61.a);
            }
        }
    }

    public final void flush() {
        this.P.flush();
    }

    public final void k(long j) {
        synchronized (this) {
            try {
                d651.b(this.L, j, 0L, 2);
                long a = this.L.a();
                if (a >= this.J.a() / 2) {
                    v(0, a);
                    d651.b(this.L, 0L, a, 1);
                }
                this.I.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.P.c);
        r6 = r2;
        r8.M += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i, boolean z, yp6 yp6Var, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.P.c(z, i, yp6Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.M;
                            long j4 = this.N;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.b.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j -= j2;
            this.P.c(z && j == 0, i, yp6Var, min);
        }
    }

    public final void o(int i, ErrorCode errorCode) {
        htx0.c(this.A, this.c + '[' + i + "] writeSynReset", 0L, new i4o(this, i, errorCode), 6);
    }

    public final void v(final int i, final long j) {
        htx0.c(this.A, this.c + '[' + i + "] windowUpdate", 0L, new sls() { // from class: ztu
            @Override // defpackage.sls
            public final Object invoke() {
                euu euuVar = euu.this;
                try {
                    euuVar.P.v(i, j);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    euuVar.a(errorCode, errorCode, e);
                }
                return zy11.a;
            }
        }, 6);
    }
}
