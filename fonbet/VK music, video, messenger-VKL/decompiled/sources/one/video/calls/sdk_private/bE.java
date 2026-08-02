package one.video.calls.sdk_private;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.security.cert.X509Certificate;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Stream;
import one.video.calls.sdk_private.al;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bF;
import one.video.calls.sdk_private.f;
import one.video.calls.sdk_private.u;
import xsna.a690;
import xsna.ahz0;
import xsna.dez0;
import xsna.ggy0;
import xsna.go9;
import xsna.hby0;
import xsna.imy0;
import xsna.jey0;
import xsna.jmy0;
import xsna.jy70;
import xsna.kgy0;
import xsna.kq01;
import xsna.lgy0;
import xsna.mdy0;
import xsna.mky0;
import xsna.ngy0;
import xsna.nh8;
import xsna.nqk;
import xsna.ogy0;
import xsna.ojs;
import xsna.pjy0;
import xsna.qlb0;
import xsna.rgy0;
import xsna.rhh0;
import xsna.sb00;
import xsna.sby0;
import xsna.sdy0;
import xsna.sp;
import xsna.thy0;
import xsna.twx;
import xsna.vdy0;
import xsna.wky0;
import xsna.xe9;
import xsna.yky0;
import xsna.zby0;
import xsna.zfy0;

/* compiled from: QuicClientConnectionImpl.java */
/* loaded from: classes8.dex */
public final class bE extends bF implements f {
    public final InetAddress A;
    public final x B;
    public final jmy0 C;
    public volatile ngy0 D;
    public final mky0 E;
    public volatile u F;
    public final jey0 G;
    public final kgy0 H;
    public final long I;
    public final thy0 J;
    public volatile byte[] K;
    public final CountDownLatch L;
    public volatile u M;
    public final String N;
    public final List<Object> O;
    public boolean P;
    public volatile c Q;
    public final ArrayList R;
    public final vdy0 S;
    public volatile Thread T;
    public volatile String U;
    public volatile C5381ab V;
    public volatile boolean W;
    public final String v;
    public final String w;
    public final int x;
    public final one.video.calls.sdk_private.a y;
    public final DatagramSocket z;

    /* compiled from: QuicClientConnectionImpl.java */
    public static class a implements ahz0 {
        public final f.h b;

        public a(f.h hVar) {
            this.b = hVar;
        }

        @Override // xsna.ahz0
        public final boolean verify(String str, X509Certificate x509Certificate) {
            f.h hVar = this.b;
            if (hVar == null) {
                return false;
            }
            return hVar.verify(str, x509Certificate);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QuicClientConnectionImpl.java */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        private static c d;
        private static final /* synthetic */ c[] e;

        static {
            c cVar = new c("None", 0);
            a = cVar;
            c cVar2 = new c("Requested", 1);
            b = cVar2;
            c cVar3 = new c("Accepted", 2);
            c = cVar3;
            c cVar4 = new c("Refused", 3);
            d = cVar4;
            e = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) e.clone();
        }
    }

    public bE(final String str, String str2, int i, long j, thy0 thy0Var, kgy0 kgy0Var, sp spVar, ArrayList arrayList, mdy0 mdy0Var) throws UnknownHostException, SocketException {
        super(kgy0Var, bI.a, spVar);
        this.L = new CountDownLatch(1);
        this.O = dez0.b();
        this.Q = c.a;
        int i2 = 0;
        this.W = false;
        this.N = "h3";
        this.I = j;
        this.J = thy0Var;
        kgy0Var.toString();
        this.H = kgy0Var;
        this.v = str;
        this.w = str2;
        this.x = i;
        if (str != null) {
            int length = str.length();
            while (i2 < length) {
                int codePointAt = str.codePointAt(i2);
                if (!Character.isWhitespace(codePointAt)) {
                    cY$a cy_a = cY$a.c;
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    int i3 = yky0.a[cy_a.ordinal()];
                    InetAddress inetAddress = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? null : (InetAddress) Stream.of((Object[]) allByName).sorted(new wky0()).findFirst().orElseThrow(new Supplier() { // from class: xsna.xky0
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new UnknownHostException(go9.b("No address found for ", str));
                        }
                    }) : (InetAddress) Stream.of((Object[]) allByName).sorted(new jy70(1)).findFirst().orElseThrow(new Supplier() { // from class: xsna.vky0
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new UnknownHostException(go9.b("No address found for ", str));
                        }
                    }) : (InetAddress) Stream.of((Object[]) allByName).filter(new nqk(1)).findFirst().orElseThrow(new Supplier() { // from class: xsna.uky0
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new UnknownHostException(go9.b("No IPv6 address found for ", str));
                        }
                    }) : (InetAddress) Stream.of((Object[]) allByName).filter(new nh8(1)).findFirst().orElseThrow(new Supplier() { // from class: xsna.tky0
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new UnknownHostException(go9.b("No IPv4 address found for ", str));
                        }
                    });
                    this.A = inetAddress;
                    boolean z = inetAddress instanceof Inet4Address;
                    this.R = arrayList;
                    DatagramSocket a2 = (mdy0Var != null ? mdy0Var : new a690(11)).a();
                    this.z = a2;
                    this.j = new bx(this, spVar);
                    final x xVar = new x(this.a, z ? 1252 : 1232, a2, new InetSocketAddress(inetAddress, i), this, spVar);
                    this.B = xVar;
                    xVar.j.c = aF.values();
                    this.j.f = new IntSupplier() { // from class: xsna.fgy0
                        @Override // java.util.function.IntSupplier
                        public final int getAsInt() {
                            return one.video.calls.sdk_private.x.this.i();
                        }
                    };
                    this.S = xVar.k;
                    this.C = new jmy0(a2, spVar, new ggy0(this), new ojs(this, 2));
                    this.E = new mky0(this, bI.a, spVar, thy0Var, this.t);
                    this.G = new jey0(xVar, new zfy0(this), spVar);
                    this.p = bF.f.a;
                    t tVar = new t();
                    tVar.a = this;
                    this.y = new one.video.calls.sdk_private.a(tVar, this);
                    return;
                }
                i2 += Character.charCount(codePointAt);
            }
        }
        throw new IllegalArgumentException("hostname must be set");
    }

    @Override // one.video.calls.sdk_private.f
    public final void d() throws IOException {
        synchronized (this) {
            try {
                if (this.p != bF.f.a) {
                    throw new IllegalStateException("Cannot connect a connection that is in state " + this.p);
                }
                this.E.e(this.J);
                u uVar = new u();
                thy0 thy0Var = this.J;
                int i = thy0Var.a;
                if (i <= 0) {
                    throw new IllegalArgumentException("maxIdleTimeout must be set");
                }
                uVar.b = i;
                long j = thy0Var.d;
                if (j <= 0) {
                    throw new IllegalArgumentException("maxConnectionBufferSize must be set");
                }
                uVar.c = j;
                long j2 = thy0Var.e;
                if (j2 <= 0) {
                    throw new IllegalArgumentException("maxBidirectionalStreamBufferSize must be set");
                }
                uVar.f = j2;
                long j3 = thy0Var.f;
                if (j3 <= 0) {
                    throw new IllegalArgumentException("maxBidirectionalStreamBufferSize must be set");
                }
                uVar.d = j3;
                uVar.e = j3;
                int i2 = thy0Var.c;
                if (i2 < 0) {
                    throw new IllegalArgumentException("maxOpenBidirectionalStreams must be set");
                }
                uVar.g = i2;
                int i3 = thy0Var.b;
                if (i3 < 0) {
                    throw new IllegalArgumentException("maxOpenUnidirectionalStreams must be set");
                }
                uVar.h = i3;
                int i4 = thy0Var.g;
                if (i4 < 2) {
                    throw new IllegalArgumentException("activeConnectionIdLimit must be set");
                }
                uVar.m = i4;
                int i5 = thy0Var.h;
                if (i5 < 1200) {
                    throw new IllegalArgumentException("maxUdpPayloadSize must be set");
                }
                uVar.p = i5;
                if (this.u == bF.c.b) {
                    uVar.s = 65535L;
                }
                this.J.getClass();
                this.F = uVar;
                u uVar2 = this.F;
                jey0 jey0Var = this.G;
                uVar2.n = jey0Var.f;
                List list = Collections.EMPTY_LIST;
                kq01.b(jey0Var.g);
                kq01.b(this.G.f);
                sby0 sby0Var = this.e;
                hby0 hby0Var = this.G.e;
                sby0Var.d(hby0Var != null ? hby0Var.b : new byte[0]);
                this.C.d.start();
                x xVar = this.B;
                xVar.p = this.e;
                xVar.n.start();
                this.T = new Thread(new Runnable() { // from class: one.video.calls.sdk_private.s
                    /* JADX WARN: Type inference failed for: r7v0, types: [xsna.egy0] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        final bE bEVar = bE.this;
                        Thread currentThread = Thread.currentThread();
                        sby0 sby0Var2 = bEVar.e;
                        lgy0 lgy0Var = bEVar.a;
                        jey0 jey0Var2 = bEVar.G;
                        int i6 = jey0Var2.a;
                        byte[] bArr = jey0Var2.g;
                        ngy0 ngy0Var = new ngy0(sby0Var2, lgy0Var, i6, bEVar.p(), new BiFunction() { // from class: xsna.egy0
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj, Object obj2) {
                                boolean z;
                                bE bEVar2 = bE.this;
                                ByteBuffer byteBuffer = (ByteBuffer) obj;
                                byte[] bArr2 = new byte[16];
                                byteBuffer.get(bArr2);
                                if (bEVar2.G.e.a.values().stream().filter(new bby0(0)).anyMatch(new raw(bArr2, 1))) {
                                    z = true;
                                    bEVar2.h(new one.video.calls.sdk_private.al(al.a.c, true, null, null));
                                    if (!bEVar2.p.h()) {
                                        bEVar2.B.g();
                                        bEVar2.E.f();
                                        bEVar2.p = bF.f.e;
                                        try {
                                            bEVar2.s.schedule(new r44(bEVar2, 22), bEVar2.r().i() * 3, TimeUnit.MILLISECONDS);
                                        } catch (RejectedExecutionException unused) {
                                        }
                                    }
                                } else {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                        }, bI.a, bEVar.c);
                        ngy0Var.i = bArr;
                        bEVar.D = ngy0Var;
                        rhh0 rhh0Var = new rhh0(bEVar.D);
                        int i7 = 0;
                        while (!currentThread.isInterrupted()) {
                            try {
                                imy0 imy0Var = (imy0) bEVar.C.e.poll(15L, TimeUnit.SECONDS);
                                if (imy0Var != null) {
                                    bEVar.J.getClass();
                                    Duration between = Duration.between(imy0Var.a, Instant.now());
                                    i7++;
                                    imy0Var.b.limit();
                                    imy0Var.b.limit();
                                    between.toMillis();
                                    rhh0Var.i(imy0Var.b, new com.vk.movika.sdk.base.data.converter.c(imy0Var.a, i7));
                                    bEVar.B.h();
                                    bEVar.l();
                                    bEVar.C.e.isEmpty();
                                }
                            } catch (InterruptedException unused) {
                                return;
                            } catch (bD unused2) {
                                e = new bJ(ap$a.PROTOCOL_VIOLATION);
                                bEVar.m(e.a.n, e.getMessage());
                                bEVar.B.h();
                                bEVar.l();
                                return;
                            } catch (RuntimeException e) {
                                bEVar.w(e);
                                return;
                            } catch (bJ e2) {
                                e = e2;
                                bEVar.m(e.a.n, e.getMessage());
                                bEVar.B.h();
                                bEVar.l();
                                return;
                            }
                        }
                    }
                }, "receiver-loop");
                this.T.setDaemon(true);
                this.T.start();
                String str = this.N;
                boolean isEmpty = list.isEmpty();
                one.video.calls.sdk_private.a aVar = this.y;
                String str2 = this.w;
                if (str2 == null) {
                    str2 = this.v;
                }
                aVar.g = str2;
                aVar.h.addAll(this.R);
                if (this.a.a.b()) {
                    u uVar3 = this.F;
                    kgy0 kgy0Var = kgy0.c;
                    Object[] objArr = {kgy0Var, kgy0.b};
                    ArrayList arrayList = new ArrayList(2);
                    for (int i6 = 0; i6 < 2; i6++) {
                        Object obj = objArr[i6];
                        Objects.requireNonNull(obj);
                        arrayList.add(obj);
                    }
                    uVar3.r = new u.b(kgy0Var, Collections.unmodifiableList(arrayList));
                }
                this.y.k.add(new y(this.a.a, this.F, bI.a));
                this.y.k.add(new twx(str));
                if (!isEmpty) {
                    this.y.k.add(new sb00());
                }
                try {
                    Object[] objArr2 = {f.g.rsa_pss_rsae_sha256, f.g.rsa_pss_rsae_sha384, f.g.rsa_pss_rsae_sha512, f.g.ecdsa_secp256r1_sha256, f.g.ecdsa_secp384r1_sha384, f.g.ecdsa_secp521r1_sha512};
                    ArrayList arrayList2 = new ArrayList(6);
                    for (int i7 = 0; i7 < 6; i7++) {
                        Object obj2 = objArr2[i7];
                        Objects.requireNonNull(obj2);
                        arrayList2.add(obj2);
                    }
                    this.y.e(f.e.secp256r1, Collections.unmodifiableList(arrayList2));
                } catch (IOException unused) {
                }
                if (!list.isEmpty()) {
                    throw null;
                }
                List<sdy0> list2 = Collections.EMPTY_LIST;
                try {
                    if (!this.L.await(this.I, TimeUnit.MILLISECONDS)) {
                        this.p = bF.f.g;
                        this.B.g();
                        q();
                        throw new ConnectException("Connection timed out after " + this.I + " ms");
                    }
                    if (this.p != bF.f.c) {
                        this.p = bF.f.g;
                        this.B.g();
                        q();
                        throw new ConnectException("Handshake error: " + (this.U != null ? this.U : ""));
                    }
                    if (!list.isEmpty()) {
                        for (sdy0 sdy0Var : list2) {
                            if (sdy0Var != null) {
                                pjy0 pjy0Var = (pjy0) sdy0Var;
                                boolean z = this.Q == c.c;
                                pjy0Var.k = false;
                                if (z) {
                                    throw null;
                                }
                                pjy0Var.g.m();
                                pjy0Var.g.write((byte[]) null);
                                pjy0Var.l = true;
                            }
                        }
                    }
                } catch (InterruptedException unused2) {
                    this.p = bF.f.g;
                    this.B.g();
                    q();
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // one.video.calls.sdk_private.f
    public final boolean e() {
        return this.p == bF.f.c;
    }

    @Override // one.video.calls.sdk_private.bF
    public final void f(Exception exc) {
        if (this.p == bF.f.b) {
            this.U = exc.toString();
        }
    }

    @Override // one.video.calls.sdk_private.bF
    public final void i(zby0 zby0Var) {
        long j;
        String str;
        if (this.p == bF.f.b) {
            String str2 = null;
            String str3 = "";
            if (zby0Var.i()) {
                int i = zby0Var.e;
                if (i == -1) {
                    j = zby0Var.b;
                    byte[] bArr = zby0Var.d;
                    if (bArr != null) {
                        try {
                            str2 = new String(bArr, C.UTF8_NAME);
                        } catch (UnsupportedEncodingException unused) {
                        }
                        str3 = go9.b(": ", str2);
                    }
                    str = "transport error ";
                    str3 = qlb0.a(j, str, str3);
                } else {
                    if (i == -1) {
                        throw new IllegalStateException("Close does not have a TLS error");
                    }
                    long j2 = i;
                    byte[] bArr2 = zby0Var.d;
                    if (bArr2 != null) {
                        try {
                            str2 = new String(bArr2, C.UTF8_NAME);
                        } catch (UnsupportedEncodingException unused2) {
                        }
                        str3 = go9.b(": ", str2);
                    }
                    str3 = qlb0.a(j2, "TLS error ", str3);
                }
            } else if (zby0Var.g()) {
                j = zby0Var.b;
                byte[] bArr3 = zby0Var.d;
                if (bArr3 != null) {
                    try {
                        str2 = new String(bArr3, C.UTF8_NAME);
                    } catch (UnsupportedEncodingException unused3) {
                    }
                    str3 = go9.b(": ", str2);
                }
                str = "application protocol error ";
                str3 = qlb0.a(j, str, str3);
            }
            this.U = go9.b("Server closed connection: ", str3);
        }
    }

    @Override // one.video.calls.sdk_private.bF
    public final bF.b p() {
        return new bF.b(this, new ogy0(new rgy0(new bF.h(this, new bF.e(this, this, this.c)))));
    }

    @Override // one.video.calls.sdk_private.bF
    public final void q() {
        super.q();
        this.L.countDown();
        jmy0 jmy0Var = this.C;
        jmy0Var.f = true;
        jmy0Var.d.interrupt();
        this.z.close();
        if (this.T != null) {
            this.T.interrupt();
        }
    }

    @Override // one.video.calls.sdk_private.bF
    public final x r() {
        return this.B;
    }

    @Override // one.video.calls.sdk_private.bF
    public final vdy0 s() {
        return this.S;
    }

    @Override // one.video.calls.sdk_private.bF
    public final mky0 t() {
        return this.E;
    }

    public final String toString() {
        String b = kq01.b(this.G.g);
        String b2 = kq01.b(this.G.f);
        int i = this.a.a.a;
        ao$a ao_a = i == 1 ? ao$a.a : i == 1798521807 ? ao$a.b : null;
        InetSocketAddress inetSocketAddress = new InetSocketAddress(this.A, this.x);
        StringBuilder a2 = xe9.a("ClientConnection[", b, DomExceptionUtils.SEPARATOR, b2, "(");
        a2.append(ao_a);
        a2.append(") with ");
        a2.append(inetSocketAddress);
        a2.append(X3.j.e);
        return a2.toString();
    }

    @Override // one.video.calls.sdk_private.bF
    public final jey0 u() {
        return this.G;
    }

    @Override // one.video.calls.sdk_private.bF
    public final /* bridge */ /* synthetic */ one.video.calls.sdk_private.a v() {
        return this.y;
    }

    public final void w(Throwable th) {
        if (this.p == bF.f.b) {
            this.U = th.toString();
        }
        this.p = bF.f.h;
        this.L.countDown();
        this.B.g();
        q();
        this.E.f();
    }

    public final void x(u uVar) throws bJ {
        if (uVar.p < 1200) {
            throw new bJ(ap$a.TRANSPORT_PARAMETER_ERROR);
        }
        if (uVar.i > 20) {
            throw new bJ(ap$a.TRANSPORT_PARAMETER_ERROR);
        }
        if (uVar.l >= 16384) {
            throw new bJ(ap$a.TRANSPORT_PARAMETER_ERROR);
        }
        if (uVar.m < 2) {
            throw new bJ(ap$a.TRANSPORT_PARAMETER_ERROR);
        }
        byte[] bArr = uVar.q;
        if (bArr != null && bArr.length != 16) {
            throw new bJ(ap$a.TRANSPORT_PARAMETER_ERROR, "Invalid stateless reset token length");
        }
        if (uVar.k != null) {
            hby0 hby0Var = this.G.e;
            if ((hby0Var != null ? hby0Var.b : new byte[0]).length == 0) {
                throw new bJ(ap$a.TRANSPORT_PARAMETER_ERROR, "Unexpected preferred address parameter for server using zero-length connection ID");
            }
            if (uVar.k.c.length == 0) {
                throw new bJ(ap$a.TRANSPORT_PARAMETER_ERROR, "Preferred address with zero-length connection ID");
            }
        }
    }
}
