package xsna;

import com.facebook.soloader.MinElf;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Ref$IntRef;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.ErrorCode;
import xsna.fiv;

/* compiled from: Http2Connection.kt */
/* loaded from: classes8.dex */
public final class vhv implements Closeable {
    public static final e0j0 B;
    public final LinkedHashSet A;
    public final c b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final String d;
    public int e;
    public int f;
    public boolean g;
    public final TaskRunner h;
    public final x6o0 i;
    public final x6o0 j;
    public final x6o0 k;
    public final hr80 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public final e0j0 r;
    public e0j0 s;
    public long t;
    public long u;
    public long v;
    public long w;
    public final Socket x;
    public final okhttp3.internal.http2.c y;
    public final d z;

    /* compiled from: Http2Connection.kt */
    public static final class a {
        public final TaskRunner a;
        public Socket b;
        public String c;
        public bn8 d;
        public an8 e;
        public c f = c.a;
        public final hr80 g = hr80.d;
        public int h;

        public a(TaskRunner taskRunner) {
            this.a = taskRunner;
        }

        public final vhv a() {
            return new vhv(this);
        }

        public final void b(g8f0 g8f0Var) {
            this.f = g8f0Var;
        }

        public final void c(int i) {
            this.h = i;
        }

        public final void d(Socket socket, String str, e8f0 e8f0Var, d8f0 d8f0Var) throws IOException {
            this.b = socket;
            this.c = x2r0.h + ' ' + str;
            this.d = e8f0Var;
            this.e = d8f0Var;
        }
    }

    /* compiled from: Http2Connection.kt */
    public static final class b {
        public static e0j0 a() {
            return vhv.B;
        }
    }

    /* compiled from: Http2Connection.kt */
    public final class d implements gzs<s3q0> {
        public final okhttp3.internal.http2.b b;

        /* compiled from: TaskQueue.kt */
        public static final class a extends c5o0 {
            public final /* synthetic */ vhv e;
            public final /* synthetic */ int f;
            public final /* synthetic */ int g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, vhv vhvVar, int i, int i2) {
                super(str, true);
                this.e = vhvVar;
                this.f = i;
                this.g = i2;
            }

            @Override // xsna.c5o0
            public final long a() {
                vhv vhvVar = this.e;
                try {
                    vhvVar.y.k(this.f, this.g, true);
                    return -1L;
                } catch (IOException e) {
                    vhvVar.c(e);
                    return -1L;
                }
            }
        }

        public d(okhttp3.internal.http2.b bVar) {
            this.b = bVar;
        }

        public final void a(boolean z, int i, bn8 bn8Var, int i2) throws IOException {
            boolean z2;
            long j;
            boolean z3;
            vhv vhvVar = vhv.this;
            long j2 = 0;
            if (i != 0 && (i & 1) == 0) {
                vl8 vl8Var = new vl8();
                long j3 = i2;
                bn8Var.G2(j3);
                bn8Var.read(vl8Var, j3);
                vhvVar.j.c(new zhv(vhvVar.d + '[' + i + "] onData", vhvVar, i, vl8Var, i2, z), 0L);
                return;
            }
            fiv h = vhvVar.h(i);
            if (h == null) {
                vhv.this.p(i, ErrorCode.PROTOCOL_ERROR);
                long j4 = i2;
                vhv.this.n(j4);
                bn8Var.skip(j4);
                return;
            }
            byte[] bArr = x2r0.a;
            fiv.b bVar = h.i;
            long j5 = i2;
            bVar.getClass();
            long j6 = j5;
            while (true) {
                boolean z4 = true;
                if (j6 <= j2) {
                    fiv fivVar = fiv.this;
                    byte[] bArr2 = x2r0.a;
                    fivVar.b.n(j5);
                    break;
                }
                synchronized (fiv.this) {
                    z2 = bVar.c;
                    j = j2;
                    z3 = bVar.e.c + j6 > bVar.b;
                    s3q0 s3q0Var = s3q0.a;
                }
                if (z3) {
                    bn8Var.skip(j6);
                    fiv.this.e(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z2) {
                    bn8Var.skip(j6);
                    break;
                }
                long read = bn8Var.read(bVar.d, j6);
                if (read == -1) {
                    throw new EOFException();
                }
                j6 -= read;
                fiv fivVar2 = fiv.this;
                synchronized (fivVar2) {
                    try {
                        if (bVar.f) {
                            bVar.d.m();
                        } else {
                            vl8 vl8Var2 = bVar.e;
                            if (vl8Var2.c != j) {
                                z4 = false;
                            }
                            vl8Var2.L2(bVar.d);
                            if (z4) {
                                fivVar2.notifyAll();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                j2 = j;
            }
            if (z) {
                h.i(x2r0.b, true);
            }
        }

        public final void c(int i, List list, boolean z) {
            vhv vhvVar = vhv.this;
            if (i != 0 && (i & 1) == 0) {
                vhvVar.j.c(new aiv(vhvVar.d + '[' + i + "] onHeaders", vhvVar, i, list, z), 0L);
                return;
            }
            synchronized (vhvVar) {
                fiv h = vhvVar.h(i);
                if (h != null) {
                    s3q0 s3q0Var = s3q0.a;
                    h.i(x2r0.u(list), z);
                    return;
                }
                if (vhvVar.g) {
                    return;
                }
                if (i <= vhvVar.e) {
                    return;
                }
                if (i % 2 == vhvVar.f % 2) {
                    return;
                }
                fiv fivVar = new fiv(i, vhvVar, false, z, x2r0.u(list));
                vhvVar.e = i;
                vhvVar.c.put(Integer.valueOf(i), fivVar);
                vhvVar.h.e().c(new xhv(vhvVar.d + '[' + i + "] onStream", vhvVar, fivVar), 0L);
            }
        }

        public final void d(int i, int i2, boolean z) {
            if (!z) {
                vhv.this.i.c(new a(i5s.a(new StringBuilder(), vhv.this.d, " ping"), vhv.this, i, i2), 0L);
                return;
            }
            vhv vhvVar = vhv.this;
            synchronized (vhvVar) {
                try {
                    if (i == 1) {
                        vhvVar.n++;
                    } else if (i != 2) {
                        if (i == 3) {
                            vhvVar.notifyAll();
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        vhvVar.p++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void e(int i, List list) {
            vhv vhvVar = vhv.this;
            synchronized (vhvVar) {
                if (vhvVar.A.contains(Integer.valueOf(i))) {
                    vhvVar.p(i, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                vhvVar.A.add(Integer.valueOf(i));
                vhvVar.j.c(new biv(vhvVar.d + '[' + i + "] onRequest", vhvVar, i, list), 0L);
            }
        }

        public final void g(int i, ErrorCode errorCode) {
            vhv vhvVar = vhv.this;
            if (i == 0 || (i & 1) != 0) {
                fiv j = vhvVar.j(i);
                if (j != null) {
                    synchronized (j) {
                        if (j.m == null) {
                            j.m = errorCode;
                            j.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            vhvVar.j.c(new civ(vhvVar.d + '[' + i + "] onReset", vhvVar, i, errorCode), 0L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [xsna.vhv] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v8 */
        @Override // xsna.gzs
        public final s3q0 invoke() {
            Throwable th;
            ErrorCode errorCode;
            ?? r0 = vhv.this;
            okhttp3.internal.http2.b bVar = this.b;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            ?? r3 = 1;
            IOException e = null;
            try {
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        r0.b(r3, errorCode2, e);
                        x2r0.c(bVar);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    errorCode = errorCode2;
                }
                if (!bVar.b(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                do {
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                        r3 = errorCode2;
                        r0.b(r3, errorCode2, e);
                        x2r0.c(bVar);
                        throw th;
                    }
                } while (bVar.b(false, this));
                errorCode = ErrorCode.NO_ERROR;
                try {
                    errorCode2 = ErrorCode.CANCEL;
                    r0.b(errorCode, errorCode2, null);
                    r3 = errorCode;
                } catch (IOException e3) {
                    e = e3;
                    errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    r0.b(errorCode2, errorCode2, e);
                    r3 = errorCode;
                    x2r0.c(bVar);
                    return s3q0.a;
                }
                x2r0.c(bVar);
                return s3q0.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class e extends c5o0 {
        public final /* synthetic */ vhv e;
        public final /* synthetic */ long f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, vhv vhvVar, long j) {
            super(str, true);
            this.e = vhvVar;
            this.f = j;
        }

        @Override // xsna.c5o0
        public final long a() {
            vhv vhvVar;
            boolean z;
            synchronized (this.e) {
                vhvVar = this.e;
                long j = vhvVar.n;
                long j2 = vhvVar.m;
                if (j < j2) {
                    z = true;
                } else {
                    vhvVar.m = j2 + 1;
                    z = false;
                }
            }
            if (z) {
                vhvVar.c(null);
                return -1L;
            }
            try {
                vhvVar.y.k(1, 0, false);
            } catch (IOException e) {
                vhvVar.c(e);
            }
            return this.f;
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class f extends c5o0 {
        public final /* synthetic */ vhv e;
        public final /* synthetic */ int f;
        public final /* synthetic */ ErrorCode g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, vhv vhvVar, int i, ErrorCode errorCode) {
            super(str, true);
            this.e = vhvVar;
            this.f = i;
            this.g = errorCode;
        }

        @Override // xsna.c5o0
        public final long a() {
            vhv vhvVar = this.e;
            try {
                vhvVar.y.m(this.f, this.g);
                return -1L;
            } catch (IOException e) {
                vhvVar.c(e);
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class g extends c5o0 {
        public final /* synthetic */ vhv e;
        public final /* synthetic */ int f;
        public final /* synthetic */ long g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, vhv vhvVar, int i, long j) {
            super(str, true);
            this.e = vhvVar;
            this.f = i;
            this.g = j;
        }

        @Override // xsna.c5o0
        public final long a() {
            vhv vhvVar = this.e;
            try {
                vhvVar.y.n(this.f, this.g);
                return -1L;
            } catch (IOException e) {
                vhvVar.c(e);
                return -1L;
            }
        }
    }

    static {
        e0j0 e0j0Var = new e0j0();
        e0j0Var.c(7, MinElf.PN_XNUM);
        e0j0Var.c(5, 16384);
        B = e0j0Var;
    }

    public vhv(a aVar) {
        this.b = aVar.f;
        String str = aVar.c;
        str = str == null ? null : str;
        this.d = str;
        this.f = 3;
        TaskRunner taskRunner = aVar.a;
        this.h = taskRunner;
        x6o0 e2 = taskRunner.e();
        this.i = e2;
        this.j = taskRunner.e();
        this.k = taskRunner.e();
        this.l = aVar.g;
        e0j0 e0j0Var = new e0j0();
        e0j0Var.c(7, C.DEFAULT_MUXED_BUFFER_SIZE);
        this.r = e0j0Var;
        this.s = B;
        this.w = r2.a();
        Socket socket = aVar.b;
        this.x = socket == null ? null : socket;
        an8 an8Var = aVar.e;
        this.y = new okhttp3.internal.http2.c(an8Var == null ? null : an8Var);
        bn8 bn8Var = aVar.d;
        this.z = new d(new okhttp3.internal.http2.b(bn8Var != null ? bn8Var : null));
        this.A = new LinkedHashSet();
        int i = aVar.h;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            e2.c(new e(fo8.a(str, " ping"), this, nanos), nanos);
        }
    }

    public static void m(vhv vhvVar) throws IOException {
        TaskRunner taskRunner = TaskRunner.i;
        okhttp3.internal.http2.c cVar = vhvVar.y;
        synchronized (cVar) {
            try {
                if (cVar.e) {
                    throw new IOException("closed");
                }
                Logger logger = okhttp3.internal.http2.c.g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(x2r0.h(">> CONNECTION " + uhv.b.o(), new Object[0]));
                }
                cVar.b.P0(uhv.b);
                cVar.b.flush();
            } finally {
            }
        }
        okhttp3.internal.http2.c cVar2 = vhvVar.y;
        e0j0 e0j0Var = vhvVar.r;
        synchronized (cVar2) {
            try {
                if (cVar2.e) {
                    throw new IOException("closed");
                }
                cVar2.h(0, Integer.bitCount(e0j0Var.a) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z = true;
                    if (((1 << i) & e0j0Var.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        cVar2.b.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        cVar2.b.writeInt(e0j0Var.b[i]);
                    }
                    i++;
                }
                cVar2.b.flush();
            } finally {
            }
        }
        if (vhvVar.r.a() != 65535) {
            vhvVar.y.n(0, r1 - MinElf.PN_XNUM);
        }
        taskRunner.e().c(new w6o0(vhvVar.d, vhvVar.z), 0L);
    }

    public final void b(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] objArr;
        byte[] bArr = x2r0.a;
        try {
            k(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.c.isEmpty()) {
                    objArr = null;
                } else {
                    objArr = this.c.values().toArray(new fiv[0]);
                    this.c.clear();
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        fiv[] fivVarArr = (fiv[]) objArr;
        if (fivVarArr != null) {
            for (fiv fivVar : fivVarArr) {
                try {
                    fivVar.c(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.y.close();
        } catch (IOException unused3) {
        }
        try {
            this.x.close();
        } catch (IOException unused4) {
        }
        this.i.f();
        this.j.f();
        this.k.f();
    }

    public final void c(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        b(errorCode, errorCode, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void flush() throws IOException {
        this.y.flush();
    }

    public final synchronized fiv h(int i) {
        return (fiv) this.c.get(Integer.valueOf(i));
    }

    public final synchronized boolean i(long j) {
        if (this.g) {
            return false;
        }
        if (this.p < this.o) {
            if (j >= this.q) {
                return false;
            }
        }
        return true;
    }

    public final synchronized fiv j(int i) {
        fiv fivVar;
        fivVar = (fiv) this.c.remove(Integer.valueOf(i));
        notifyAll();
        return fivVar;
    }

    public final void k(ErrorCode errorCode) throws IOException {
        synchronized (this.y) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.g = true;
                int i = this.e;
                ref$IntRef.element = i;
                s3q0 s3q0Var = s3q0.a;
                this.y.i(i, errorCode, x2r0.a);
            }
        }
    }

    public final synchronized void n(long j) {
        long j2 = this.t + j;
        this.t = j2;
        long j3 = j2 - this.u;
        if (j3 >= this.r.a() / 2) {
            q(0, j3);
            this.u += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.y.d);
        r6 = r2;
        r8.v += r6;
        r4 = xsna.s3q0.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(int i, boolean z, vl8 vl8Var, long j) throws IOException {
        int min;
        long j2;
        if (j == 0) {
            this.y.c(z, i, vl8Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.v;
                            long j4 = this.w;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.c.containsKey(Integer.valueOf(i))) {
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
            this.y.c(z && j == 0, i, vl8Var, min);
        }
    }

    public final void p(int i, ErrorCode errorCode) {
        this.i.c(new f(this.d + '[' + i + "] writeSynReset", this, i, errorCode), 0L);
    }

    public final void q(int i, long j) {
        this.i.c(new g(this.d + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    /* compiled from: Http2Connection.kt */
    /* loaded from: classes11.dex */
    public static abstract class c {
        public static final a a = new a();

        /* compiled from: Http2Connection.kt */
        public static final class a extends c {
            @Override // xsna.vhv.c
            public final void e(fiv fivVar) throws IOException {
                fivVar.c(ErrorCode.REFUSED_STREAM, null);
            }
        }

        public abstract void e(fiv fivVar) throws IOException;

        public void d(e0j0 e0j0Var) {
        }
    }
}
