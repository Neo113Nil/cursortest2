package xsna;

import com.facebook.soloader.MinElf;
import com.ironsource.B5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import okhttp3.Protocol;
import okhttp3.g;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.o;
import okhttp3.p;
import okio.ByteString;
import xsna.xhx0;

/* compiled from: RealWebSocket.kt */
/* loaded from: classes8.dex */
public final class p8f0 implements phx0, xhx0.a {
    public static final List<Protocol> x = Collections.singletonList(Protocol.HTTP_1_1);
    public final okhttp3.p a;
    public final uhx0 b;
    public final Random c;
    public final long d;
    public final long f;
    public final String g;
    public f8f0 h;
    public d i;
    public xhx0 j;
    public yhx0 k;
    public final x6o0 l;
    public String m;
    public j8f0 n;
    public long q;
    public boolean r;
    public String t;
    public boolean u;
    public int v;
    public boolean w;
    public thx0 e = null;
    public final ArrayDeque<ByteString> o = new ArrayDeque<>();
    public final ArrayDeque<Object> p = new ArrayDeque<>();
    public int s = -1;

    /* compiled from: RealWebSocket.kt */
    public static final class a {
        public final int a;
        public final ByteString b;

        public a(int i, ByteString byteString) {
            this.a = i;
            this.b = byteString;
        }
    }

    /* compiled from: RealWebSocket.kt */
    public static final class b {
        public final int a;
        public final ByteString b;

        public b(int i, ByteString byteString) {
            this.a = i;
            this.b = byteString;
        }
    }

    /* compiled from: RealWebSocket.kt */
    public static abstract class c implements Closeable {
        public final bn8 b;
        public final an8 c;

        public c(bn8 bn8Var, an8 an8Var) {
            this.b = bn8Var;
            this.c = an8Var;
        }
    }

    /* compiled from: RealWebSocket.kt */
    public final class d extends c5o0 {
        public d() {
            super(i5s.a(new StringBuilder(), p8f0.this.m, " writer"), true);
        }

        @Override // xsna.c5o0
        public final long a() {
            p8f0 p8f0Var = p8f0.this;
            try {
                return p8f0Var.n() ? 0L : -1L;
            } catch (IOException e) {
                p8f0Var.i(e, null);
                return -1L;
            }
        }
    }

    /* compiled from: RealWebSocket.kt */
    public static final class e implements lb9 {
        public final /* synthetic */ okhttp3.p c;

        public e(okhttp3.p pVar) {
            this.c = pVar;
        }

        @Override // xsna.lb9
        public final void onFailure(okhttp3.d dVar, IOException iOException) {
            p8f0.this.i(iOException, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
        
            if (r10 == null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
        
            r8 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
        
            if (r12 == null) goto L31;
         */
        @Override // xsna.lb9
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onResponse(okhttp3.d dVar, okhttp3.u uVar) {
            u1q u1qVar = uVar.n;
            try {
                p8f0.this.g(uVar, u1qVar);
                u1qVar.a.j();
                g8f0 b = u1qVar.d.b();
                Socket socket = b.d;
                e8f0 e8f0Var = b.h;
                d8f0 d8f0Var = b.i;
                int i = 0;
                socket.setSoTimeout(0);
                b.n();
                j8f0 j8f0Var = new j8f0(e8f0Var, d8f0Var, u1qVar);
                okhttp3.k kVar = uVar.g;
                int size = kVar.size();
                int i2 = 0;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                Integer num = null;
                Integer num2 = null;
                while (i2 < size) {
                    if (brm0.w(kVar.c(i2), "Sec-WebSocket-Extensions", true)) {
                        String f = kVar.f(i2);
                        int i3 = i;
                        while (i3 < f.length()) {
                            okhttp3.k kVar2 = kVar;
                            int g = x2r0.g(',', i3, i, 4, f);
                            int f2 = x2r0.f(f, i3, g, ';');
                            String y = x2r0.y(i3, f2, f);
                            int i4 = f2 + 1;
                            if (y.equalsIgnoreCase("permessage-deflate")) {
                                if (z) {
                                    z4 = true;
                                }
                                i3 = i4;
                                while (i3 < g) {
                                    int f3 = x2r0.f(f, i3, g, ';');
                                    int f4 = x2r0.f(f, i3, f3, B5.U);
                                    String y2 = x2r0.y(i3, f4, f);
                                    String X = f4 < f3 ? drm0.X(x2r0.y(f4 + 1, f3, f)) : null;
                                    int i5 = f3 + 1;
                                    int i6 = g;
                                    if (y2.equalsIgnoreCase("client_max_window_bits")) {
                                        if (num != null) {
                                            z4 = true;
                                        }
                                        num = X != null ? arm0.m(10, X) : null;
                                    } else if (y2.equalsIgnoreCase("client_no_context_takeover")) {
                                        if (z2) {
                                            z4 = true;
                                        }
                                        if (X != null) {
                                            z4 = true;
                                        }
                                        i3 = i5;
                                        z2 = true;
                                    } else {
                                        if (y2.equalsIgnoreCase("server_max_window_bits")) {
                                            if (num2 != null) {
                                                z4 = true;
                                            }
                                            num2 = X != null ? arm0.m(10, X) : null;
                                        } else if (y2.equalsIgnoreCase("server_no_context_takeover")) {
                                            if (z3) {
                                                z4 = true;
                                            }
                                            if (X != null) {
                                                z4 = true;
                                            }
                                            i3 = i5;
                                            z3 = true;
                                        }
                                        i3 = i5;
                                        z4 = true;
                                    }
                                    g = i6;
                                }
                                z = true;
                            } else {
                                i3 = i4;
                                z4 = true;
                            }
                            kVar = kVar2;
                            i = 0;
                        }
                    }
                    i2++;
                    kVar = kVar;
                    i = 0;
                }
                p8f0.this.e = new thx0(z, num, z2, num2, z3, z4);
                if (z4 || num != null || (num2 != null && !new k9x(8, 15, 1).e(num2.intValue()))) {
                    p8f0 p8f0Var = p8f0.this;
                    synchronized (p8f0Var) {
                        p8f0Var.p.clear();
                        p8f0Var.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    p8f0.this.j(x2r0.h + " WebSocket " + this.c.a.h(), j8f0Var);
                    p8f0 p8f0Var2 = p8f0.this;
                    p8f0Var2.b.onOpen(p8f0Var2, uVar);
                    p8f0.this.k();
                } catch (Exception e) {
                    p8f0.this.i(e, null);
                }
            } catch (IOException e2) {
                p8f0.this.i(e2, uVar);
                x2r0.c(uVar);
                if (u1qVar != null) {
                    u1qVar.a(-1L, true, true, null);
                }
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class f extends c5o0 {
        public final /* synthetic */ p8f0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, p8f0 p8f0Var) {
            super(str, true);
            this.e = p8f0Var;
        }

        @Override // xsna.c5o0
        public final long a() {
            this.e.cancel();
            return -1L;
        }
    }

    public p8f0(TaskRunner taskRunner, okhttp3.p pVar, uhx0 uhx0Var, Random random, long j, long j2) {
        this.a = pVar;
        this.b = uhx0Var;
        this.c = random;
        this.d = j;
        this.f = j2;
        this.l = taskRunner.e();
        String str = pVar.b;
        if (!"GET".equals(str)) {
            throw new IllegalArgumentException(go9.b("Request must be GET: ", str).toString());
        }
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        s3q0 s3q0Var = s3q0.a;
        this.g = ByteString.a.c(bArr).h();
    }

    @Override // xsna.xhx0.a
    public final synchronized void a(ByteString byteString) {
        try {
            if (!this.u && (!this.r || !this.p.isEmpty())) {
                this.o.add(byteString);
                l();
            }
        } finally {
        }
    }

    @Override // xsna.xhx0.a
    public final void b(int i, String str) {
        j8f0 j8f0Var;
        xhx0 xhx0Var;
        yhx0 yhx0Var;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            try {
                if (this.s != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.s = i;
                this.t = str;
                j8f0Var = null;
                if (this.r && this.p.isEmpty()) {
                    j8f0 j8f0Var2 = this.n;
                    this.n = null;
                    xhx0Var = this.j;
                    this.j = null;
                    yhx0Var = this.k;
                    this.k = null;
                    this.l.f();
                    j8f0Var = j8f0Var2;
                } else {
                    xhx0Var = null;
                    yhx0Var = null;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.b.onClosing(this, i, str);
            if (j8f0Var != null) {
                this.b.onClosed(this, i, str);
            }
        } finally {
            if (j8f0Var != null) {
                x2r0.c(j8f0Var);
            }
            if (xhx0Var != null) {
                x2r0.c(xhx0Var);
            }
            if (yhx0Var != null) {
                x2r0.c(yhx0Var);
            }
        }
    }

    @Override // xsna.xhx0.a
    public final void c(ByteString byteString) throws IOException {
        this.b.onMessage(this, byteString);
    }

    @Override // xsna.phx0
    public final void cancel() {
        this.h.cancel();
    }

    @Override // xsna.phx0
    public final boolean close(int i, String str) {
        String str2;
        synchronized (this) {
            ByteString byteString = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    byteString = new ByteString(str.getBytes(emb.b));
                    byteString.c = str;
                    if (byteString.n() > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.u && !this.r) {
                    this.r = true;
                    this.p.add(new a(i, byteString));
                    l();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // xsna.xhx0.a
    public final void d(String str) throws IOException {
        this.b.onMessage(this, str);
    }

    @Override // xsna.xhx0.a
    public final synchronized void e() {
        this.w = false;
    }

    @Override // xsna.phx0
    public final boolean f(ByteString byteString) {
        return m(2, byteString);
    }

    public final void g(okhttp3.u uVar, u1q u1qVar) throws IOException {
        okhttp3.k kVar = uVar.g;
        int i = uVar.e;
        if (i != 101) {
            throw new ProtocolException(ho8.a(vq.a("Expected HTTP 101 response but was '", i, ' '), uVar.d, '\''));
        }
        String a2 = kVar.a("Connection");
        if (a2 == null) {
            a2 = null;
        }
        if (!"Upgrade".equalsIgnoreCase(a2)) {
            throw new ProtocolException(air.b('\'', "Expected 'Connection' header value 'Upgrade' but was '", a2));
        }
        String a3 = kVar.a("Upgrade");
        if (a3 == null) {
            a3 = null;
        }
        if (!"websocket".equalsIgnoreCase(a3)) {
            throw new ProtocolException(air.b('\'', "Expected 'Upgrade' header value 'websocket' but was '", a3));
        }
        String a4 = kVar.a("Sec-WebSocket-Accept");
        String str = a4 != null ? a4 : null;
        String a5 = i5s.a(new StringBuilder(), this.g, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        ByteString byteString = new ByteString(a5.getBytes(emb.b));
        byteString.c = a5;
        String h = byteString.l(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).h();
        if (epx.f(h, str)) {
            if (u1qVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + h + "' but was '" + str + '\'');
    }

    public final void h(okhttp3.o oVar) {
        okhttp3.p pVar = this.a;
        if (pVar.c.a("Sec-WebSocket-Extensions") != null) {
            i(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        o.a e2 = oVar.e();
        g.a aVar = okhttp3.g.a;
        byte[] bArr = x2r0.a;
        e2.e = new n2r0(aVar);
        ArrayList arrayList = new ArrayList(x);
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList).toString());
        }
        if (arrayList.contains(protocol) && arrayList.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList).toString());
        }
        if (arrayList.contains(Protocol.HTTP_1_0)) {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayList).toString());
        }
        if (arrayList.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayList.remove(Protocol.SPDY_3);
        if (!arrayList.equals(e2.s)) {
            e2.B = null;
        }
        e2.s = Collections.unmodifiableList(arrayList);
        okhttp3.o oVar2 = new okhttp3.o(e2);
        p.a b2 = pVar.b();
        b2.c.h("Upgrade", "websocket");
        b2.c.h("Connection", "Upgrade");
        b2.c.h("Sec-WebSocket-Key", this.g);
        b2.c.h("Sec-WebSocket-Version", "13");
        b2.c.h("Sec-WebSocket-Extensions", "permessage-deflate");
        okhttp3.p b3 = b2.b();
        f8f0 f8f0Var = new f8f0(oVar2, b3, true);
        this.h = f8f0Var;
        f8f0Var.f9(new e(b3));
    }

    public final void i(Exception exc, okhttp3.u uVar) {
        synchronized (this) {
            if (this.u) {
                return;
            }
            this.u = true;
            j8f0 j8f0Var = this.n;
            this.n = null;
            xhx0 xhx0Var = this.j;
            this.j = null;
            yhx0 yhx0Var = this.k;
            this.k = null;
            this.l.f();
            s3q0 s3q0Var = s3q0.a;
            try {
                this.b.onFailure(this, exc, uVar);
            } finally {
                if (j8f0Var != null) {
                    x2r0.c(j8f0Var);
                }
                if (xhx0Var != null) {
                    x2r0.c(xhx0Var);
                }
                if (yhx0Var != null) {
                    x2r0.c(yhx0Var);
                }
            }
        }
    }

    public final void j(String str, j8f0 j8f0Var) throws IOException {
        thx0 thx0Var = this.e;
        synchronized (this) {
            try {
                this.m = str;
                this.n = j8f0Var;
                this.k = new yhx0(j8f0Var.c, this.c, thx0Var.a, thx0Var.c, this.f);
                this.i = new d();
                long j = this.d;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.l.c(new q8f0(str.concat(" ping"), this, nanos), nanos);
                }
                if (!this.p.isEmpty()) {
                    l();
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.j = new xhx0(j8f0Var.b, this, thx0Var.a, thx0Var.e);
    }

    public final void k() throws IOException {
        while (this.s == -1) {
            xhx0 xhx0Var = this.j;
            xhx0Var.n();
            if (!xhx0Var.j) {
                xhx0.a aVar = xhx0Var.c;
                vl8 vl8Var = xhx0Var.m;
                int i = xhx0Var.g;
                if (i != 1 && i != 2) {
                    byte[] bArr = x2r0.a;
                    throw new ProtocolException("Unknown opcode: ".concat(Integer.toHexString(i)));
                }
                while (!xhx0Var.f) {
                    long j = xhx0Var.h;
                    if (j > 0) {
                        xhx0Var.b.z1(vl8Var, j);
                    }
                    if (xhx0Var.i) {
                        if (xhx0Var.k) {
                            x920 x920Var = xhx0Var.n;
                            if (x920Var == null) {
                                x920Var = new x920(xhx0Var.e);
                                xhx0Var.n = x920Var;
                            }
                            Inflater inflater = x920Var.d;
                            vl8 vl8Var2 = x920Var.c;
                            if (vl8Var2.c != 0) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            if (x920Var.b) {
                                inflater.reset();
                            }
                            vl8Var2.L2(vl8Var);
                            vl8Var2.N(MinElf.PN_XNUM);
                            long bytesRead = inflater.getBytesRead() + vl8Var2.c;
                            do {
                                x920Var.e.b(vl8Var, Long.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        if (i == 1) {
                            aVar.d(vl8Var.x());
                        } else {
                            aVar.c(vl8Var.F0(vl8Var.c));
                        }
                    } else {
                        while (!xhx0Var.f) {
                            xhx0Var.n();
                            if (!xhx0Var.j) {
                                break;
                            } else {
                                xhx0Var.m();
                            }
                        }
                        if (xhx0Var.g != 0) {
                            int i2 = xhx0Var.g;
                            byte[] bArr2 = x2r0.a;
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(Integer.toHexString(i2)));
                        }
                    }
                }
                throw new IOException("closed");
            }
            xhx0Var.m();
        }
    }

    public final void l() {
        byte[] bArr = x2r0.a;
        d dVar = this.i;
        if (dVar != null) {
            this.l.c(dVar, 0L);
        }
    }

    public final synchronized boolean m(int i, ByteString byteString) {
        if (!this.u && !this.r) {
            if (this.q + byteString.n() > 16777216) {
                close(1001, null);
                return false;
            }
            this.q += byteString.n();
            this.p.add(new b(i, byteString));
            l();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d5, code lost:
    
        if (r2 < 3000) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #1 {all -> 0x0085, blocks: (B:21:0x007c, B:29:0x0088, B:31:0x008c, B:32:0x0095, B:35:0x00a2, B:39:0x00a6, B:40:0x00a7, B:41:0x00a8, B:43:0x00ac, B:49:0x0122, B:51:0x0126, B:54:0x013c, B:55:0x013e, B:67:0x00d7, B:70:0x00fc, B:71:0x0105, B:76:0x00eb, B:77:0x0106, B:79:0x0110, B:80:0x0117, B:81:0x013f, B:82:0x0144, B:34:0x0096, B:48:0x011f), top: B:19:0x007a, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0132 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0137 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:21:0x007c, B:29:0x0088, B:31:0x008c, B:32:0x0095, B:35:0x00a2, B:39:0x00a6, B:40:0x00a7, B:41:0x00a8, B:43:0x00ac, B:49:0x0122, B:51:0x0126, B:54:0x013c, B:55:0x013e, B:67:0x00d7, B:70:0x00fc, B:71:0x0105, B:76:0x00eb, B:77:0x0106, B:79:0x0110, B:80:0x0117, B:81:0x013f, B:82:0x0144, B:34:0x0096, B:48:0x011f), top: B:19:0x007a, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:21:0x007c, B:29:0x0088, B:31:0x008c, B:32:0x0095, B:35:0x00a2, B:39:0x00a6, B:40:0x00a7, B:41:0x00a8, B:43:0x00ac, B:49:0x0122, B:51:0x0126, B:54:0x013c, B:55:0x013e, B:67:0x00d7, B:70:0x00fc, B:71:0x0105, B:76:0x00eb, B:77:0x0106, B:79:0x0110, B:80:0x0117, B:81:0x013f, B:82:0x0144, B:34:0x0096, B:48:0x011f), top: B:19:0x007a, inners: #0, #3 }] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [xsna.yhx0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() throws IOException {
        Object obj;
        String str;
        ?? r8;
        int i;
        j8f0 j8f0Var;
        ?? r7;
        synchronized (this) {
            try {
                if (this.u) {
                    return false;
                }
                yhx0 yhx0Var = this.k;
                ByteString poll = this.o.poll();
                String str2 = null;
                try {
                    if (poll == null) {
                        obj = this.p.poll();
                        if (obj instanceof a) {
                            i = this.s;
                            str = this.t;
                            if (i != -1) {
                                j8f0Var = this.n;
                                this.n = null;
                                xhx0 xhx0Var = this.j;
                                this.j = null;
                                r8 = this.k;
                                this.k = null;
                                this.l.f();
                                r7 = xhx0Var;
                            } else {
                                ((a) obj).getClass();
                                this.l.c(new f(this.m + " cancel", this), TimeUnit.MILLISECONDS.toNanos(60000L));
                                j8f0Var = null;
                                r7 = 0;
                                r8 = null;
                            }
                            s3q0 s3q0Var = s3q0.a;
                            if (poll == null) {
                                yhx0Var.b(10, poll);
                            } else if (obj instanceof b) {
                                b bVar = (b) obj;
                                yhx0Var.c(bVar.a, bVar.b);
                                synchronized (this) {
                                    this.q -= bVar.b.n();
                                }
                            } else {
                                if (!(obj instanceof a)) {
                                    throw new AssertionError();
                                }
                                a aVar = (a) obj;
                                int i2 = aVar.a;
                                ByteString byteString = aVar.b;
                                yhx0Var.getClass();
                                ByteString byteString2 = ByteString.d;
                                if (i2 != 0 || byteString != null) {
                                    if (i2 != 0) {
                                        if (i2 >= 1000 && i2 < 5000) {
                                            if (1004 <= i2) {
                                                if (i2 < 1007) {
                                                    str2 = "Code " + i2 + " is reserved and may not be used.";
                                                    if (str2 != null) {
                                                        throw new IllegalArgumentException(str2.toString());
                                                    }
                                                }
                                            }
                                            if (1015 <= i2) {
                                            }
                                            if (str2 != null) {
                                            }
                                        }
                                        str2 = "Code must be in range [1000,5000): " + i2;
                                        if (str2 != null) {
                                        }
                                    }
                                    vl8 vl8Var = new vl8();
                                    vl8Var.P(i2);
                                    if (byteString != null) {
                                        byteString.B(vl8Var, byteString.n());
                                    }
                                    byteString2 = vl8Var.F0(vl8Var.c);
                                }
                                try {
                                    yhx0Var.b(8, byteString2);
                                    if (j8f0Var != null) {
                                        this.b.onClosed(this, i, str);
                                    }
                                } finally {
                                    yhx0Var.i = true;
                                }
                            }
                            return true;
                        }
                        if (obj == null) {
                            return false;
                        }
                        str = null;
                    } else {
                        obj = null;
                        str = null;
                    }
                    if (poll == null) {
                    }
                    return true;
                } finally {
                    if (j8f0Var != null) {
                        x2r0.c(j8f0Var);
                    }
                    if (r7 != 0) {
                        x2r0.c(r7);
                    }
                    if (r8 != null) {
                        x2r0.c(r8);
                    }
                }
                String str3 = str;
                r8 = str3;
                i = -1;
                j8f0Var = r8;
                r7 = str3;
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.phx0
    public final okhttp3.p request() {
        return this.a;
    }

    @Override // xsna.phx0
    public final boolean send(String str) {
        ByteString byteString = new ByteString(str.getBytes(emb.b));
        byteString.c = str;
        return m(1, byteString);
    }
}
