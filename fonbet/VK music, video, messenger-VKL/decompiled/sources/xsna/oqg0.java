package xsna;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import one.video.player.live.DebugInfo;
import one.video.player.live.media.utils.DecoderInterface$FrameAction;
import one.video.player.live.proto.rtmp.ProtocolException;
import one.video.player.live.stream.LiveStreamSource;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.j0h0;
import xsna.oqg0;

/* compiled from: RtmpPlayer.java */
/* loaded from: classes8.dex */
public abstract class oqg0 {
    public static final /* synthetic */ int w = 0;
    public final HandlerThread a;
    public final ConnectivityManager b;
    public final TelephonyManager c;
    public final b d;
    public volatile j0h0<c> e;
    public volatile j0h0<c> f;
    public volatile boolean g;
    public int h;
    public final HashMap i = new HashMap(4);
    public int j = -10000;
    public boolean k = true;
    public volatile boolean l = false;
    public a m;
    public awo0 n;
    public awo0 o;
    public long p;
    public long q;
    public int r;
    public boolean s;
    public int t;
    public long u;
    public final DebugInfo v;

    /* compiled from: RtmpPlayer.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Code restructure failed: missing block: B:150:0x0213, code lost:
        
            if (r14 != r0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0101, code lost:
        
            if (r14 != r0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0103, code lost:
        
            r2.g(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0125, code lost:
        
            if (r14 != r0) goto L69;
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[Catch: all -> 0x0054, Exception -> 0x0200, TryCatch #4 {Exception -> 0x0200, all -> 0x0054, blocks: (B:14:0x0020, B:16:0x002c, B:18:0x0047, B:21:0x004c, B:22:0x0056, B:24:0x005a, B:25:0x005d, B:28:0x006c, B:30:0x0074, B:35:0x0082, B:37:0x008e, B:38:0x009c, B:40:0x00a9, B:42:0x00ad, B:45:0x00b6, B:47:0x00be, B:52:0x00cc, B:54:0x00d9, B:57:0x00e9, B:59:0x00ed, B:61:0x00f5, B:62:0x00f8, B:69:0x0108, B:71:0x010c, B:77:0x011c, B:74:0x0128, B:75:0x0138, B:81:0x012d, B:82:0x0130, B:83:0x013d, B:85:0x0147, B:86:0x014a, B:88:0x0150, B:91:0x0159, B:95:0x015d, B:98:0x015e, B:100:0x0169, B:101:0x016e, B:102:0x0170, B:103:0x0189, B:105:0x0191, B:107:0x01a2, B:109:0x01aa, B:111:0x01bc, B:116:0x01c1, B:119:0x01c7, B:120:0x01cd, B:122:0x01d9, B:124:0x01e1, B:125:0x01e6, B:127:0x01ee, B:130:0x01f7), top: B:13:0x0020 }] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void handleMessage(Message message) {
            boolean z;
            boolean z2;
            int nanoTime;
            int i;
            int min;
            boolean z3;
            boolean z4;
            if (message.what != 234567) {
                super.handleMessage(message);
                return;
            }
            if (oqg0.this.g) {
                return;
            }
            oqg0 oqg0Var = oqg0.this;
            if (oqg0Var.m != null) {
                if (!oqg0Var.g) {
                    boolean z5 = oqg0Var.s;
                    boolean z6 = true;
                    loop0: while (true) {
                        boolean z7 = true;
                        while (true) {
                            if (z7) {
                                try {
                                    j0h0<c> j0h0Var = oqg0Var.e;
                                    j0h0<c> j0h0Var2 = oqg0Var.f;
                                    int d = oqg0Var.d();
                                    DebugInfo debugInfo = oqg0Var.v;
                                    if (debugInfo != null) {
                                        debugInfo.c(d, j0h0Var.d(), j0h0Var.c(), oqg0Var.r);
                                        DebugInfo debugInfo2 = oqg0Var.v;
                                        int d2 = j0h0Var2.d();
                                        int c = j0h0Var2.c();
                                        if (debugInfo2.H != d2 || debugInfo2.I != c) {
                                            debugInfo2.K = d2;
                                            debugInfo2.L = c;
                                        }
                                    }
                                    if (!oqg0Var.l) {
                                        oqg0Var.k();
                                    }
                                    int d3 = d + j0h0Var.d();
                                    int d4 = j0h0Var2.d();
                                    if (!oqg0Var.s && d3 <= 0) {
                                        if (oqg0Var.e.c() <= 0 && oqg0Var.f.c() <= 0) {
                                            z4 = false;
                                            if (!z4) {
                                                if (oqg0Var.n.a() < 4000) {
                                                    oqg0Var.r = Math.min(oqg0Var.r * 2, j0h0Var.b / 2);
                                                }
                                                awo0 awo0Var = oqg0Var.n;
                                                awo0Var.getClass();
                                                awo0Var.a = System.currentTimeMillis();
                                                oqg0Var.s = true;
                                            }
                                        }
                                        z4 = true;
                                        if (!z4) {
                                        }
                                    }
                                    if (oqg0Var.s) {
                                        oqg0Var.n();
                                        int i2 = oqg0Var.r;
                                        if (d3 < i2 && d4 < i2) {
                                            if (oqg0Var.e.c() <= 0 && oqg0Var.f.c() <= 0) {
                                                z3 = false;
                                                if (!z3 || oqg0Var.o.a() < oqg0Var.r || oqg0Var.n.a() < oqg0Var.r * 2) {
                                                    break loop0;
                                                }
                                            }
                                            z3 = true;
                                            if (!z3) {
                                                break loop0;
                                            } else {
                                                break loop0;
                                            }
                                        }
                                    }
                                    if (oqg0Var.s) {
                                        c e = j0h0Var.e();
                                        c e2 = j0h0Var2.e();
                                        if (e != null) {
                                            min = e2 == null ? e.d : Math.min(e.d, e2.d);
                                        } else if (e2 == null) {
                                            Log.wtf("xsna.oqg0", "Unexpected state, continue buffering!");
                                            z = oqg0Var.s;
                                        } else {
                                            min = e2.d;
                                        }
                                        oqg0Var.m(min);
                                        oqg0Var.s = false;
                                    }
                                    if (j0h0Var.d() >= 900) {
                                        j0h0Var.d();
                                        while (j0h0Var.d() > 100) {
                                            synchronized (j0h0Var) {
                                            }
                                        }
                                        c e3 = j0h0Var.e();
                                        j0h0Var.d();
                                        if (e3 != null) {
                                            oqg0Var.m(e3.d);
                                        }
                                        oqg0Var.r = 100;
                                    }
                                    nanoTime = oqg0Var.t + ((int) ((((System.nanoTime() - oqg0Var.u) + 500000) / 1000000) * 1.0d));
                                    boolean z8 = false;
                                    while (true) {
                                        c f = j0h0Var.f(nanoTime);
                                        if (f == null) {
                                            break;
                                        }
                                        oqg0Var.c(f.d, f.e, f.f, f.g, DecoderInterface$FrameAction.PLAY);
                                        z8 = true;
                                    }
                                    while (true) {
                                        c f2 = j0h0Var2.f(nanoTime);
                                        if (f2 == null) {
                                            break;
                                        }
                                        if (!oqg0Var.c(f2.d, f2.e, f2.f, f2.g, DecoderInterface$FrameAction.PLAY)) {
                                            j0h0Var2.b();
                                        }
                                        z8 = true;
                                    }
                                    DebugInfo debugInfo3 = oqg0Var.v;
                                    if (debugInfo3 != null) {
                                        if (z8) {
                                            debugInfo3.d(DebugInfo.c.SENT);
                                        } else {
                                            debugInfo3.d(DebugInfo.c.IDLE);
                                            debugInfo3.N++;
                                        }
                                    }
                                    if (!z8) {
                                        c e4 = j0h0Var.e();
                                        i = e4 != null ? e4.d - nanoTime : 0;
                                        c e5 = j0h0Var2.e();
                                        if (e5 != null) {
                                            i = Math.min(i, e5.d - nanoTime);
                                        }
                                        if (i >= 100) {
                                            break;
                                        }
                                    }
                                    z7 = z8;
                                } catch (Exception unused) {
                                    try {
                                        oqg0Var.h(13);
                                    } catch (Throwable th) {
                                        th = th;
                                        if (!z6 && z5 != (z2 = oqg0Var.s)) {
                                            oqg0Var.g(z2);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z6 = false;
                                    if (!z6) {
                                        oqg0Var.g(z2);
                                    }
                                    throw th;
                                }
                            } else {
                                z = oqg0Var.s;
                            }
                        }
                        oqg0Var.m(nanoTime + i);
                    }
                    DebugInfo debugInfo4 = oqg0Var.v;
                    if (debugInfo4 != null) {
                        int i3 = oqg0Var.r;
                        DebugInfo.c cVar = debugInfo4.b;
                        DebugInfo.c cVar2 = DebugInfo.c.BUFFERING;
                        if (cVar != cVar2) {
                            debugInfo4.d(cVar2);
                        }
                        debugInfo4.J = i3;
                        debugInfo4.M++;
                    }
                    z = oqg0Var.s;
                }
                oqg0.this.m.sendEmptyMessageDelayed(234567, 10L);
            }
        }
    }

    /* compiled from: RtmpPlayer.java */
    public class b extends aqg0 {
        public final awo0 A;
        public final LiveStreamSource B;
        public final HashMap C;
        public final j0h0<c> D;
        public final j0h0<c> E;
        public final /* synthetic */ pkz F;
        public final n06 x;
        public final n06 y;
        public final n06 z;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(pkz pkzVar, HandlerThread handlerThread, LiveStreamSource liveStreamSource, j0h0 j0h0Var, @Nullable j0h0 j0h0Var2, DebugInfo debugInfo) {
            super(handlerThread, r3.substring(0, r0), debugInfo);
            this.F = pkzVar;
            String str = liveStreamSource.b;
            int lastIndexOf = str.lastIndexOf(47);
            if (lastIndexOf < 0) {
                throw new RuntimeException("Invalid RTMP url:".concat(str));
            }
            this.A = new awo0();
            this.C = new HashMap(4);
            this.x = new n06(debugInfo);
            this.y = new n06(null);
            this.z = new n06(null);
            this.B = liveStreamSource;
            this.D = j0h0Var;
            this.E = j0h0Var2;
            if (debugInfo != null) {
                String str2 = liveStreamSource.b;
                debugInfo.a = null;
                if (str2 != null) {
                    try {
                        debugInfo.a = new URI(str2).getHost();
                    } catch (URISyntaxException e) {
                        e.toString();
                    }
                }
            }
        }

        @Override // xsna.aqg0
        public final void e() {
            t();
        }

        @Override // xsna.aqg0
        public final void f() {
            jqg0 jqg0Var = new jqg0();
            iqg0 iqg0Var = jqg0Var.c;
            iqg0Var.a.a = this.r;
            iqg0Var.d.a = this.d;
            NetworkInfo activeNetworkInfo = this.F.b.getActiveNetworkInfo();
            String subtypeName = activeNetworkInfo != null ? activeNetworkInfo.getType() == 0 ? activeNetworkInfo.getSubtypeName() : activeNetworkInfo.getTypeName() : "unknown";
            if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
                StringBuilder b = ho8.b(subtypeName, ".");
                b.append(this.F.c.getNetworkOperatorName());
                subtypeName = b.toString();
            }
            DebugInfo debugInfo = this.v;
            if (debugInfo != null) {
                debugInfo.d = subtypeName;
            }
            iqg0Var.n.a = subtypeName;
            s(jqg0Var, new qqg0());
            String str = this.B.b;
            int lastIndexOf = str.lastIndexOf(47);
            if (lastIndexOf < 0) {
                throw new RuntimeException("Invalid RTMP url:".concat(str));
            }
            String substring = str.substring(lastIndexOf + 1);
            kqg0 kqg0Var = new kqg0("play");
            kqg0Var.c = new cw1(substring);
            s(kqg0Var, null);
        }

        @Override // xsna.aqg0
        public final void i(final int i) {
            super.i(i);
            g(new Runnable() { // from class: xsna.pqg0
                @Override // java.lang.Runnable
                public final void run() {
                    oqg0.b bVar = oqg0.b.this;
                    pkz pkzVar = bVar.F;
                    if (bVar != pkzVar.d) {
                        return;
                    }
                    pkzVar.h(i);
                }
            });
        }

        @Override // xsna.aqg0
        public final void j(ByteBuffer byteBuffer) {
            wv1 wv1Var;
            try {
                byte b = byteBuffer.get();
                aw1 aw1Var = null;
                if (5 != b && b == 3) {
                    aw1Var = new aw1();
                    aw1Var.deserialize(byteBuffer);
                }
                if (aw1Var == null || (wv1Var = (wv1) aw1Var.a.get("rotation")) == null || !(wv1Var instanceof zv1)) {
                    return;
                }
                double d = ((zv1) wv1Var).a;
                qkz qkzVar = this.F.x;
                if (qkzVar.n != d) {
                    qkzVar.n = d;
                    okz okzVar = qkzVar.d;
                    if (okzVar != null) {
                        qkzVar.g(okzVar.m, okzVar.n, d);
                    }
                }
            } catch (ProtocolException unused) {
            }
        }

        @Override // xsna.aqg0
        public final void k(lqg0 lqg0Var) {
            String str = lqg0Var.d.b.a;
            str.getClass();
            if (str.equals("NetStream.Play.UnpublishNotify")) {
                this.F.x.f();
            }
        }

        @Override // xsna.aqg0
        public final void l() {
            super.l();
            this.a.post(new ux3(this, 8));
        }

        @Override // xsna.aqg0
        public final void m(int i) {
            this.F.x.h(i);
        }

        @Override // xsna.aqg0
        public final void n() {
            this.F.x.j();
        }

        @Override // xsna.aqg0
        public final void o() {
            this.F.x.k();
        }

        @Override // xsna.aqg0
        public final void p() {
            this.F.x.l();
        }

        @Override // xsna.aqg0
        public final void r(int i, int i2, int i3, byte b, ByteBuffer byteBuffer) throws ProtocolException {
            boolean z;
            boolean z2;
            int i4;
            if (this.F.g) {
                return;
            }
            if (b != 8 && b != 9) {
                super.r(i, i2, i3, b, byteBuffer);
                return;
            }
            awo0 awo0Var = this.A;
            if (awo0Var.a < 0) {
                awo0Var.a = System.currentTimeMillis();
            }
            long remaining = byteBuffer.remaining();
            this.x.a(remaining);
            int position = byteBuffer.position();
            if (b == 8) {
                this.y.a(remaining);
                if (byteBuffer.remaining() < 2) {
                    i4 = i3;
                    z = false;
                } else {
                    if (((byteBuffer.get() & 255) >>> 4) != 10) {
                        return;
                    }
                    z = byteBuffer.get() == 0;
                    i4 = i3;
                }
                z2 = true;
            } else {
                this.z.a(remaining);
                byte b2 = byteBuffer.get();
                boolean z3 = ((b2 & 255) >>> 4) == 1;
                if ((b2 & AmfConstants.TYPE_XML_DOCUMENT_MARKER) != 7) {
                    return;
                }
                byte b3 = byteBuffer.get();
                wr.c(3, byteBuffer);
                z = b3 == 0;
                pkz pkzVar = this.F;
                int i5 = pkzVar.j;
                if (i3 == i5) {
                    i3 = i5 + 1;
                }
                if (!z) {
                    pkzVar.j = i3;
                }
                z2 = z3;
                i4 = i3;
            }
            if (z) {
                byte[] bArr = (byte[]) this.C.get(Byte.valueOf(b));
                if (bArr != null && bArr.length == byteBuffer.remaining()) {
                    for (int i6 = 0; i6 < bArr.length; i6++) {
                        if (bArr[i6] == byteBuffer.get(byteBuffer.position() + i6)) {
                        }
                    }
                    return;
                }
                byte[] bArr2 = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr2);
                this.C.put(Byte.valueOf(b), bArr2);
                return;
            }
            byteBuffer.position(position);
            c cVar = new c(i4, z2, b, byteBuffer, (byte[]) this.C.get(Byte.valueOf(b)));
            if (b == 8) {
                this.D.a(cVar);
                DebugInfo debugInfo = this.v;
                if (debugInfo != null) {
                    byteBuffer.remaining();
                    long currentTimeMillis = System.currentTimeMillis();
                    AtomicLong atomicLong = debugInfo.x;
                    long j = currentTimeMillis - atomicLong.get();
                    int i7 = debugInfo.w + 1;
                    debugInfo.w = i7;
                    if (j >= 1000) {
                        debugInfo.y.set((int) ((i7 * 1000.0f) / j));
                        atomicLong.set(currentTimeMillis);
                        debugInfo.w = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            this.E.a(cVar);
            DebugInfo debugInfo2 = this.v;
            if (debugInfo2 != null) {
                byteBuffer.remaining();
                long currentTimeMillis2 = System.currentTimeMillis();
                AtomicLong atomicLong2 = debugInfo2.k;
                long j2 = currentTimeMillis2 - atomicLong2.get();
                int i8 = debugInfo2.j + 1;
                debugInfo2.j = i8;
                if (j2 >= 1000) {
                    debugInfo2.l.set((int) ((i8 * 1000.0f) / j2));
                    atomicLong2.set(currentTimeMillis2);
                    debugInfo2.j = 0;
                }
            }
        }
    }

    /* compiled from: RtmpPlayer.java */
    public static class c extends j0h0.a {
        public final int d;
        public final byte e;
        public final ByteBuffer f;
        public final byte[] g;

        public c(int i, boolean z, byte b, ByteBuffer byteBuffer, byte[] bArr) {
            super(i, z);
            this.d = i;
            this.e = b;
            this.f = byteBuffer;
            this.g = bArr;
        }

        @Override // xsna.j0h0.a
        public final int a() {
            return this.d;
        }
    }

    public oqg0(ArrayList arrayList, HandlerThread handlerThread, @NonNull Context context, @Nullable DebugInfo debugInfo) {
        LiveStreamSource liveStreamSource;
        this.v = debugInfo;
        this.a = handlerThread;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.c = (TelephonyManager) context.getSystemService("phone");
        Iterator it = arrayList.iterator();
        LiveStreamSource liveStreamSource2 = null;
        while (true) {
            if (!it.hasNext()) {
                liveStreamSource = liveStreamSource2;
                break;
            }
            LiveStreamSource liveStreamSource3 = (LiveStreamSource) it.next();
            if (liveStreamSource3.d) {
                liveStreamSource = liveStreamSource3;
                break;
            } else if (liveStreamSource2 == null || liveStreamSource3.c > liveStreamSource2.c) {
                liveStreamSource2 = liveStreamSource3;
            }
        }
        synchronized (this) {
            this.e = new j0h0<>(500, 1000, false, this.v);
            this.f = new j0h0<>(400, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, true, this.v);
            this.d = new b((pkz) this, this.a, liveStreamSource, this.e, this.f, this.v);
        }
    }

    public abstract ByteBuffer a(int i, int i2);

    public abstract ByteBuffer b(int i, int i2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i, byte b2, ByteBuffer byteBuffer, byte[] bArr, DecoderInterface$FrameAction decoderInterface$FrameAction) throws ProtocolException {
        ByteBuffer b3;
        int i2;
        ByteBuffer byteBuffer2;
        byte[] bArr2 = bArr;
        if (bArr2 != null) {
            Byte valueOf = Byte.valueOf(b2);
            HashMap hashMap = this.i;
            if (bArr2 != hashMap.get(valueOf)) {
                hashMap.put(Byte.valueOf(b2), bArr2);
                char c2 = '\b';
                if (b2 != 8) {
                    int i3 = (byteBuffer.get() & 255) >>> 4;
                    if (i3 == 10) {
                        byteBuffer.get();
                    }
                    if (bArr2 != null) {
                        f(i3, ByteBuffer.wrap(bArr2));
                    }
                    ByteBuffer a2 = a(i3, byteBuffer.remaining());
                    if (a2 != null) {
                        a2.put(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
                        int position = a2.position();
                        a2.rewind();
                        a2.limit(position);
                        e(i, byteBuffer, decoderInterface$FrameAction);
                        return false;
                    }
                } else if (b2 == 9) {
                    byte b4 = byteBuffer.get();
                    int i4 = (b4 & 255) >>> 4;
                    int i5 = b4 & AmfConstants.TYPE_XML_DOCUMENT_MARKER;
                    if (i5 == 7) {
                        int i6 = byteBuffer.getInt();
                        int i7 = i6 >> 24;
                        int i8 = (i6 << 8) >> 8;
                        int i9 = 1;
                        if (bArr2 != null) {
                            ByteBuffer wrap = ByteBuffer.wrap(bArr2);
                            byte[] bArr3 = fai.b;
                            int i10 = (wrap.get(wrap.position() + 4) & 3) + 1;
                            ByteBuffer allocate = ByteBuffer.allocate(wrap.remaining() * 2);
                            if (wrap.get() != 1) {
                                byteBuffer2 = null;
                            } else {
                                wrap.position(wrap.position() + 4);
                                int i11 = wrap.get() & 31;
                                while (true) {
                                    int i12 = wrap.getShort() & 65535;
                                    int i13 = wrap.get(wrap.position()) & 31;
                                    if (7 == i13 || c2 == i13) {
                                        i2 = 1;
                                        allocate.putInt(1);
                                        int limit = wrap.limit();
                                        wrap.limit(wrap.position() + i12);
                                        allocate.put(wrap);
                                        wrap.limit(limit);
                                    } else {
                                        wr.c(i12, wrap);
                                        i2 = 1;
                                    }
                                    i11--;
                                    if (i11 == 0) {
                                        wr.c(i2, wrap);
                                    }
                                    if (wrap.remaining() <= 2) {
                                        break;
                                    }
                                    c2 = '\b';
                                }
                                allocate.limit(allocate.position());
                                allocate.rewind();
                                byteBuffer2 = allocate;
                            }
                            if (byteBuffer2 != null) {
                                this.h = i10;
                                j(i5, byteBuffer2);
                            }
                            i9 = 1;
                        }
                        if (i7 != i9 || this.h <= 0 || (b3 = b(i5, byteBuffer.remaining() + 10)) == null) {
                            return false;
                        }
                        b3.rewind();
                        b3.limit(b3.capacity());
                        int i14 = this.h;
                        byte[] bArr4 = fai.b;
                        while (byteBuffer.remaining() > i14) {
                            int i15 = i14;
                            int i16 = 0;
                            while (true) {
                                int i17 = i15 - 1;
                                if (i15 <= 0) {
                                    break;
                                }
                                i16 = (byteBuffer.get() & 255) | (i16 << 8);
                                i15 = i17;
                            }
                            if (i16 > 5000000 || i16 > byteBuffer.remaining()) {
                                StringBuilder b5 = ji.b(i16, "nal unit size is incorrect: ", "; remaining: ");
                                b5.append(byteBuffer.remaining());
                                throw new RuntimeException(b5.toString());
                            }
                            b3.put(fai.b);
                            int limit2 = byteBuffer.limit();
                            byteBuffer.limit(byteBuffer.position() + i16);
                            b3.put(byteBuffer);
                            byteBuffer.limit(limit2);
                        }
                        int position2 = b3.position();
                        b3.rewind();
                        b3.limit(position2);
                        boolean z = i4 == 1;
                        if (this.k && z) {
                            this.k = false;
                            b3.get(new byte[position2]);
                            b3.rewind();
                        }
                        return i(i, i8, b3, decoderInterface$FrameAction);
                    }
                }
                return false;
            }
        }
        bArr2 = null;
        char c22 = '\b';
        if (b2 != 8) {
        }
        return false;
    }

    public abstract int d();

    public abstract void e(int i, ByteBuffer byteBuffer, DecoderInterface$FrameAction decoderInterface$FrameAction);

    public abstract void f(int i, ByteBuffer byteBuffer);

    public abstract void g(boolean z);

    public abstract void h(int i);

    public abstract boolean i(int i, int i2, ByteBuffer byteBuffer, DecoderInterface$FrameAction decoderInterface$FrameAction);

    public abstract void j(int i, ByteBuffer byteBuffer);

    public final void k() throws ProtocolException {
        boolean isEmpty;
        j0h0.a aVar;
        c cVar;
        if (!this.l) {
            do {
                j0h0<c> j0h0Var = this.f;
                synchronized (j0h0Var) {
                    try {
                        isEmpty = j0h0Var.e.isEmpty();
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                if (!isEmpty) {
                    this.f.b();
                    j0h0<c> j0h0Var2 = this.f;
                    synchronized (j0h0Var2) {
                        try {
                            aVar = (j0h0.a) j0h0Var2.e.poll();
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                    }
                    cVar = (c) aVar;
                    if (cVar == null) {
                    }
                }
            } while (!cVar.c);
            this.l = true;
            if (c(cVar.d, cVar.e, cVar.f, cVar.g, DecoderInterface$FrameAction.PLAY_IMMEDIATELY)) {
                return;
            }
            this.f.b();
        }
    }

    public final void l() {
        this.l = false;
        this.n = new awo0();
        this.o = new awo0();
        this.p = -1L;
        this.q = -1L;
        this.r = 100;
        this.s = true;
        this.t = 0;
        g(true);
        b bVar = this.d;
        String str = bVar.d;
        if (bVar.i == null) {
            try {
                URI uri = new URI(str);
                bVar.r = uri.getPath().replace(DomExceptionUtils.SEPARATOR, "");
                Thread thread = new Thread(new bqg0(bVar, uri), "rtmp client read thread");
                bVar.i = thread;
                thread.start();
            } catch (URISyntaxException e) {
                Log.e("xsna.aqg0", "Error parsing url \"" + str + "\"", e);
                throw new RuntimeException(e);
            }
        }
        a aVar = new a(this.a.getLooper());
        this.m = aVar;
        aVar.sendEmptyMessageDelayed(234567, 0L);
    }

    public final void m(int i) throws ProtocolException {
        this.u = System.nanoTime() - 100000000;
        this.t = i;
        DebugInfo debugInfo = this.v;
        if (debugInfo != null) {
            debugInfo.getClass();
        }
        int i2 = this.t - 1;
        while (true) {
            c f = this.e.f(i2);
            if (f == null) {
                break;
            } else {
                c(f.d, f.e, f.f, f.g, DecoderInterface$FrameAction.DROP);
            }
        }
        while (true) {
            c f2 = this.f.f(i2);
            if (f2 == null) {
                return;
            } else {
                c(f2.d, f2.e, f2.f, f2.g, DecoderInterface$FrameAction.PLAY_IMMEDIATELY);
            }
        }
    }

    public final void n() {
        j0h0.a aVar;
        j0h0.a aVar2;
        j0h0<c> j0h0Var = this.e;
        synchronized (j0h0Var) {
            aVar = (j0h0.a) j0h0Var.e.peekLast();
        }
        c cVar = (c) aVar;
        if (cVar != null) {
            long j = cVar.d;
            if (j != this.p) {
                this.p = j;
                awo0 awo0Var = this.o;
                awo0Var.getClass();
                awo0Var.a = System.currentTimeMillis();
            }
        }
        j0h0<c> j0h0Var2 = this.f;
        synchronized (j0h0Var2) {
            aVar2 = (j0h0.a) j0h0Var2.e.peekLast();
        }
        c cVar2 = (c) aVar2;
        if (cVar2 != null) {
            long j2 = cVar2.d;
            if (j2 != this.q) {
                this.q = j2;
                awo0 awo0Var2 = this.o;
                awo0Var2.getClass();
                awo0Var2.a = System.currentTimeMillis();
            }
        }
    }
}
