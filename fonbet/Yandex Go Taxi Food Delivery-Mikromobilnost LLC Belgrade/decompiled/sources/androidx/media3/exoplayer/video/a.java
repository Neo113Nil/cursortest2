package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.container.ObuParser$NotYetImplementedException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import com.google.common.collect.ImmutableList;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.a201;
import defpackage.a9z0;
import defpackage.ao31;
import defpackage.bo31;
import defpackage.d6z;
import defpackage.do31;
import defpackage.eh20;
import defpackage.f7s;
import defpackage.fd10;
import defpackage.g191;
import defpackage.gd10;
import defpackage.hpo0;
import defpackage.ikb1;
import defpackage.iyi0;
import defpackage.jr60;
import defpackage.kb;
import defpackage.kfc;
import defpackage.kr60;
import defpackage.kyg;
import defpackage.lb10;
import defpackage.lk91;
import defpackage.mnh;
import defpackage.ny61;
import defpackage.nyg;
import defpackage.o2x0;
import defpackage.o7s;
import defpackage.pb10;
import defpackage.qxc0;
import defpackage.qyg;
import defpackage.sb10;
import defpackage.sd10;
import defpackage.sf10;
import defpackage.t601;
import defpackage.teh;
import defpackage.tw21;
import defpackage.txc0;
import defpackage.ug3;
import defpackage.vis0;
import defpackage.w7o;
import defpackage.wb10;
import defpackage.xb10;
import defpackage.xl31;
import defpackage.y8z0;
import defpackage.yl31;
import defpackage.zl31;
import defpackage.zn31;
import io.appmetrica.analytics.RtmMessageConstraints;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes10.dex */
public final class a extends wb10 implements zl31 {
    public static boolean H4;
    public static final int[] V3 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean v4;
    public PlaceholderSurface B1;
    public long B2;
    public long B3;
    public vis0 C1;
    public do31 C2;
    public long C3;
    public final Context H0;
    public boolean H1;
    public do31 H2;
    public boolean H3;
    public final boolean I0;
    public final a201 J0;
    public final int K0;
    public final boolean L0;
    public final b M0;
    public final yl31 N0;
    public int N1;
    public int N2;
    public boolean N3;
    public final g191 O0;
    public final long P0;
    public final PriorityQueue Q0;
    public kb R0;
    public boolean S0;
    public boolean T0;
    public int T1;
    public boolean T2;
    public int T3;
    public long V1;
    public int V2;
    public int X1;
    public MediaCodecVideoRenderer$OnFrameRenderedListenerV23 X2;
    public qxc0 p1;
    public int p2;
    public boolean v1;
    public int v2;
    public xl31 v3;
    public List x1;
    public long x2;
    public Surface y1;
    public int y2;

    public a(gd10 gd10Var) {
        super(2, gd10Var.d, gd10Var.c, gd10Var.f, gd10Var.j);
        Context applicationContext = gd10Var.a.getApplicationContext();
        this.H0 = applicationContext;
        this.K0 = gd10Var.i;
        this.p1 = null;
        this.J0 = new a201(gd10Var.g, gd10Var.h);
        this.I0 = this.p1 == null;
        this.M0 = new b(applicationContext, this, gd10Var.e);
        this.N0 = new yl31();
        this.L0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.C1 = vis0.c;
        this.N1 = 1;
        this.T1 = 0;
        this.C2 = do31.d;
        this.V2 = 0;
        this.H2 = null;
        this.N2 = -1000;
        this.B3 = -9223372036854775807L;
        this.C3 = -9223372036854775807L;
        this.O0 = gd10Var.k ? new g191() : null;
        this.Q0 = new PriorityQueue();
        long j = gd10Var.l;
        this.P0 = j != -9223372036854775807L ? -j : -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (r3.equals("video/av01") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g0(sb10 sb10Var, androidx.media3.common.a aVar) {
        int i = aVar.u;
        int i2 = aVar.v;
        if (i != -1 && i2 != -1) {
            String str = aVar.n;
            str.getClass();
            char c = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair d = fd10.d(aVar);
                if (d != null) {
                    int intValue = ((Integer) d.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 3:
                case 5:
                    return ((i * i2) * 3) / 4;
                case 2:
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case 4:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !sb10Var.g)))) {
                        return ((tw21.f(i2, 16) * tw21.f(i, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public static List h0(Context context, xb10 xb10Var, androidx.media3.common.a aVar, boolean z, boolean z2) {
        String str = aVar.n;
        if (str == null) {
            return ImmutableList.p();
        }
        if (tw21.a >= 26 && "video/dolby-vision".equals(str) && !ikb1.c(context)) {
            String b = fd10.b(aVar);
            List p = b == null ? ImmutableList.p() : xb10Var.getDecoderInfos(b, z, z2);
            if (!p.isEmpty()) {
                return p;
            }
        }
        return fd10.g(xb10Var, aVar, z, z2);
    }

    public static int i0(sb10 sb10Var, androidx.media3.common.a aVar) {
        int i = aVar.o;
        List list = aVar.q;
        if (i == -1) {
            return g0(sb10Var, aVar);
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return aVar.o + i2;
    }

    @Override // defpackage.wb10
    public final boolean D(androidx.media3.common.a aVar) {
        qxc0 qxc0Var = this.p1;
        if (qxc0Var == null) {
            return true;
        }
        try {
            qxc0Var.d(aVar);
            throw null;
        } catch (VideoSink$VideoSinkException e) {
            throw createRendererException(e, aVar, RtmMessageConstraints.MAX_STACK_LENGTH_DEFAULT);
        }
    }

    @Override // defpackage.wb10
    public final void E(Exception exc) {
        lk91.f("MediaCodecVideoRenderer", "Video codec error", exc);
        a201 a201Var = this.J0;
        Handler handler = (Handler) a201Var.b;
        if (handler != null) {
            handler.post(new t601(29, a201Var, exc));
        }
    }

    @Override // defpackage.wb10
    public final void F(long j, long j2, String str) {
        String str2;
        a201 a201Var = this.J0;
        Handler handler = (Handler) a201Var.b;
        if (handler != null) {
            str2 = str;
            handler.post(new ug3(a201Var, str2, j, j2, 2));
        } else {
            str2 = str;
        }
        this.S0 = f0(str2);
        sb10 sb10Var = this.U;
        sb10Var.getClass();
        this.T0 = sb10Var.f();
        m0();
    }

    @Override // defpackage.wb10
    public final void G(String str) {
        a201 a201Var = this.J0;
        Handler handler = (Handler) a201Var.b;
        if (handler != null) {
            handler.post(new bo31(0, a201Var, str));
        }
    }

    @Override // defpackage.wb10
    public final qyg H(o7s o7sVar) {
        qyg H = super.H(o7sVar);
        androidx.media3.common.a aVar = o7sVar.b;
        aVar.getClass();
        a201 a201Var = this.J0;
        Handler handler = (Handler) a201Var.b;
        if (handler != null) {
            handler.post(new hpo0(22, a201Var, aVar, H));
        }
        return H;
    }

    @Override // defpackage.wb10
    public final void I(androidx.media3.common.a aVar, MediaFormat mediaFormat) {
        int integer;
        int i;
        pb10 pb10Var = this.N;
        if (pb10Var != null) {
            pb10Var.setVideoScalingMode(this.N1);
        }
        if (this.T2) {
            i = aVar.u;
            integer = aVar.v;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = aVar.y;
        int i2 = aVar.x;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.C2 = new do31(i, integer, f);
        qxc0 qxc0Var = this.p1;
        if (qxc0Var == null || !this.H3) {
            this.M0.i(aVar.w);
            this.H3 = false;
            return;
        }
        f7s a = aVar.a();
        a.t = i;
        a.u = integer;
        a.x = f;
        androidx.media3.common.a aVar2 = new androidx.media3.common.a(a);
        List list = this.x1;
        if (list == null) {
            list = ImmutableList.p();
        }
        qxc0Var.e(aVar2, list);
        throw null;
    }

    @Override // defpackage.wb10
    public final void K(long j) {
        super.K(j);
        if (this.T2) {
            return;
        }
        this.v2--;
    }

    @Override // defpackage.wb10
    public final void L() {
        qxc0 qxc0Var = this.p1;
        if (qxc0Var != null) {
            qxc0Var.p();
            this.p1.m(this.D0.b, -this.B3);
        } else {
            this.M0.d(2);
        }
        this.H3 = true;
        m0();
    }

    @Override // defpackage.wb10
    public final void M(nyg nygVar) {
        Surface surface;
        ByteBuffer byteBuffer;
        g191 g191Var = this.O0;
        if (g191Var != null) {
            sb10 sb10Var = this.U;
            sb10Var.getClass();
            if (sb10Var.b.equals("video/av01") && (byteBuffer = nygVar.w) != null) {
                g191Var.T(androidx.media3.container.a.b(byteBuffer));
            }
        }
        this.T3 = 0;
        boolean z = this.T2;
        if (!z) {
            this.v2++;
        }
        if (tw21.a >= 23 || !z) {
            return;
        }
        long j = nygVar.y;
        e0(j);
        do31 do31Var = this.C2;
        boolean equals = do31Var.equals(do31.d);
        a201 a201Var = this.J0;
        if (!equals && !do31Var.equals(this.H2)) {
            this.H2 = do31Var;
            a201Var.w(do31Var);
        }
        this.C0.e++;
        if (this.M0.e() && (surface = this.y1) != null) {
            a201Var.q(surface);
            this.H1 = true;
        }
        K(j);
    }

    @Override // defpackage.wb10
    public final void N(j jVar) {
    }

    @Override // defpackage.wb10
    public final boolean P(long j, long j2, pb10 pb10Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.a aVar) {
        pb10Var.getClass();
        long j4 = j3 - this.D0.c;
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.Q0;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i4++;
            priorityQueue.poll();
        }
        r0(i4, 0);
        qxc0 qxc0Var = this.p1;
        if (qxc0Var == null) {
            int a = this.M0.a(j3, j, j2, this.D0.b, z, z2, this.N0);
            yl31 yl31Var = this.N0;
            if (a == 0) {
                ((o2x0) getClock()).getClass();
                long nanoTime = System.nanoTime();
                xl31 xl31Var = this.v3;
                if (xl31Var != null) {
                    xl31Var.c(j4, nanoTime, aVar, this.P);
                }
                n0(pb10Var, i, nanoTime);
                s0(yl31Var.a);
                return true;
            }
            if (a == 1) {
                long j5 = yl31Var.b;
                long j6 = yl31Var.a;
                if (j5 == this.B2) {
                    q0(pb10Var, i);
                } else {
                    xl31 xl31Var2 = this.v3;
                    if (xl31Var2 != null) {
                        xl31Var2.c(j4, j5, aVar, this.P);
                    }
                    n0(pb10Var, i, j5);
                }
                s0(j6);
                this.B2 = j5;
                return true;
            }
            if (a == 2) {
                Trace.beginSection("dropVideoBuffer");
                pb10Var.b(i);
                Trace.endSection();
                r0(0, 1);
                s0(yl31Var.a);
                return true;
            }
            if (a == 3) {
                q0(pb10Var, i);
                s0(yl31Var.a);
                return true;
            }
            if (a != 4 && a != 5) {
                ny61.r(String.valueOf(a));
            }
        } else {
            if (z && !z2) {
                q0(pb10Var, i);
                return true;
            }
            d6z.x(false);
            int i5 = qxc0Var.e.n;
            if (i5 != -1 && i5 == 0) {
                d6z.z(null);
                throw null;
            }
        }
        return false;
    }

    @Override // defpackage.wb10
    public final void S() {
        qxc0 qxc0Var = this.p1;
        if (qxc0Var != null) {
            qxc0Var.p();
        }
    }

    @Override // defpackage.wb10
    public final void T() {
        super.T();
        this.Q0.clear();
        this.N3 = false;
        this.v2 = 0;
        this.T3 = 0;
        g191 g191Var = this.O0;
        if (g191Var != null) {
            g191Var.a = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x010b, code lost:
    
        if ((r10 + 1) < 8) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010e, code lost:
    
        if (r10 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0110, code lost:
    
        r3 = ((defpackage.jr60) r9.get(r10)).b.limit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011d, code lost:
    
        r3 = r7.position();
     */
    @Override // defpackage.wb10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y(nyg nygVar) {
        ByteBuffer byteBuffer;
        boolean z;
        kr60 kr60Var;
        w7o w7oVar;
        if (!hasReadStreamToEnd() && !nygVar.b(536870912)) {
            long j = this.C3;
            if (j != -9223372036854775807L && j - (nygVar.y - this.D0.c) > 100000 && !nygVar.b(1073741824)) {
                boolean z2 = nygVar.y < getLastResetPositionUs();
                if ((z2 || this.N3) && !nygVar.b(SelfTester_JCP.IMITA)) {
                    boolean b = nygVar.b(SelfTester_JCP.DECRYPT_CBC);
                    PriorityQueue priorityQueue = this.Q0;
                    if (b) {
                        nygVar.d();
                        if (z2) {
                            this.C0.d++;
                            return true;
                        }
                        if (this.N3) {
                            priorityQueue.add(Long.valueOf(nygVar.y));
                            this.T3++;
                            return true;
                        }
                    } else {
                        g191 g191Var = this.O0;
                        if (g191Var != null) {
                            sb10 sb10Var = this.U;
                            sb10Var.getClass();
                            if (sb10Var.b.equals("video/av01") && (byteBuffer = nygVar.w) != null) {
                                boolean z3 = z2 || this.T3 <= 0;
                                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                                asReadOnlyBuffer.flip();
                                ArrayList b2 = androidx.media3.container.a.b(asReadOnlyBuffer);
                                g191Var.T(b2);
                                int size = b2.size() - 1;
                                int i = 0;
                                while (true) {
                                    if (size < 0) {
                                        z = false;
                                        break;
                                    }
                                    jr60 jr60Var = (jr60) b2.get(size);
                                    int i2 = jr60Var.a;
                                    z = false;
                                    if (i2 != 2 && i2 != 15) {
                                        if ((i2 == 3 && !z3) || ((i2 != 6 && i2 != 3) || (kr60Var = (kr60) g191Var.a) == null)) {
                                            break;
                                        }
                                        try {
                                            w7oVar = new w7o(kr60Var, jr60Var);
                                        } catch (ObuParser$NotYetImplementedException unused) {
                                            w7oVar = null;
                                        }
                                        if (w7oVar != null) {
                                            if (w7oVar.a) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    if (((jr60) b2.get(size)).a == 6 || ((jr60) b2.get(size)).a == 3) {
                                        i++;
                                    }
                                    size--;
                                }
                                int limit = asReadOnlyBuffer.limit();
                                kb kbVar = this.R0;
                                kbVar.getClass();
                                boolean z4 = kbVar.c + limit < asReadOnlyBuffer.capacity() ? true : z;
                                if (limit == asReadOnlyBuffer.limit() || !z4) {
                                    return z;
                                }
                                ByteBuffer byteBuffer2 = nygVar.w;
                                byteBuffer2.getClass();
                                byteBuffer2.position(limit);
                                if (z2) {
                                    this.C0.d++;
                                } else if (this.N3) {
                                    priorityQueue.add(Long.valueOf(nygVar.y));
                                    this.T3++;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.wb10
    public final boolean Z(sb10 sb10Var) {
        return k0(sb10Var);
    }

    @Override // defpackage.wb10
    public final int b0(xb10 xb10Var, androidx.media3.common.a aVar) {
        boolean z;
        int i = 0;
        if (!eh20.p(aVar.n)) {
            return iyi0.a(0, 0, 0, 0);
        }
        boolean z2 = aVar.r != null;
        Context context = this.H0;
        List h0 = h0(context, xb10Var, aVar, z2, false);
        if (z2 && h0.isEmpty()) {
            h0 = h0(context, xb10Var, aVar, false, false);
        }
        if (h0.isEmpty()) {
            return iyi0.a(1, 0, 0, 0);
        }
        int i2 = aVar.M;
        if (i2 != 0 && i2 != 2) {
            return iyi0.a(2, 0, 0, 0);
        }
        sb10 sb10Var = (sb10) h0.get(0);
        boolean e = sb10Var.e(aVar);
        if (!e) {
            for (int i3 = 1; i3 < h0.size(); i3++) {
                sb10 sb10Var2 = (sb10) h0.get(i3);
                if (sb10Var2.e(aVar)) {
                    z = false;
                    e = true;
                    sb10Var = sb10Var2;
                    break;
                }
            }
        }
        z = true;
        int i4 = e ? 4 : 3;
        int i5 = sb10Var.g(aVar) ? 16 : 8;
        int i6 = sb10Var.h ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (tw21.a >= 26 && "video/dolby-vision".equals(aVar.n) && !ikb1.c(context)) {
            i7 = 256;
        }
        int i8 = i7;
        if (e) {
            List h02 = h0(context, xb10Var, aVar, z2, true);
            if (!h02.isEmpty()) {
                sb10 sb10Var3 = (sb10) fd10.h(aVar, h02).get(0);
                if (sb10Var3.e(aVar) && sb10Var3.g(aVar)) {
                    i = 32;
                }
            }
        }
        return iyi0.d(i4, i5, i, i6, i8, 0);
    }

    @Override // defpackage.zl31
    public final boolean c(long j, long j2) {
        return j < -30000 && j2 > 100000;
    }

    @Override // defpackage.fyi0
    public final void enableMayRenderStartOfStream() {
        qxc0 qxc0Var = this.p1;
        if (qxc0Var != null) {
            qxc0Var.a();
            return;
        }
        b bVar = this.M0;
        if (bVar.e == 0) {
            bVar.e = 1;
        }
    }

    @Override // defpackage.zl31
    public final boolean f(long j, long j2, boolean z, boolean z2) {
        int skipSource;
        long j3 = this.P0;
        if (j3 != -9223372036854775807L) {
            this.N3 = j2 > getLastResetPositionUs() + 200000 && j < j3;
        }
        if (j >= -500000 || z || (skipSource = skipSource(j2)) == 0) {
            return false;
        }
        kyg kygVar = this.C0;
        PriorityQueue priorityQueue = this.Q0;
        if (z2) {
            int i = kygVar.d + skipSource;
            kygVar.d = i;
            kygVar.f += this.v2;
            kygVar.d = priorityQueue.size() + i;
        } else {
            kygVar.j++;
            r0(priorityQueue.size() + skipSource, this.v2);
        }
        if (q()) {
            B();
        }
        qxc0 qxc0Var = this.p1;
        if (qxc0Var != null) {
            qxc0Var.b(false);
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0736, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x08b7, code lost:
    
        if (r13.equals("JSN-L21") == false) goto L664;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f0(String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (a.class) {
            try {
                if (!v4) {
                    int i = tw21.a;
                    char c = 28;
                    if (i <= 28) {
                        String str2 = Build.DEVICE;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1339091551:
                                if (str2.equals("dangal")) {
                                    z2 = false;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -1220081023:
                                if (str2.equals("dangalFHD")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -1220066608:
                                if (str2.equals("dangalUHD")) {
                                    z2 = 2;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -1012436106:
                                if (str2.equals("oneday")) {
                                    z2 = 3;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -760312546:
                                if (str2.equals("aquaman")) {
                                    z2 = 4;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -64886864:
                                if (str2.equals("magnolia")) {
                                    z2 = 5;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 3415681:
                                if (str2.equals("once")) {
                                    z2 = 6;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 825323514:
                                if (str2.equals("machuca")) {
                                    z2 = 7;
                                    break;
                                }
                                z2 = -1;
                                break;
                            default:
                                z2 = -1;
                                break;
                        }
                        switch (z2) {
                            case false:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                                z3 = true;
                                break;
                        }
                        H4 = z3;
                        v4 = true;
                    }
                    if (i > 27 || !"HWEML".equals(Build.DEVICE)) {
                        String str3 = Build.MODEL;
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -349662828:
                                if (str3.equals("AFTJMST12")) {
                                    z = false;
                                    break;
                                }
                                z = -1;
                                break;
                            case -321033677:
                                if (str3.equals("AFTKMST12")) {
                                    z = true;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2006354:
                                if (str3.equals("AFTA")) {
                                    z = 2;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2006367:
                                if (str3.equals("AFTN")) {
                                    z = 3;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2006371:
                                if (str3.equals("AFTR")) {
                                    z = 4;
                                    break;
                                }
                                z = -1;
                                break;
                            case 1785421873:
                                if (str3.equals("AFTEU011")) {
                                    z = 5;
                                    break;
                                }
                                z = -1;
                                break;
                            case 1785421876:
                                if (str3.equals("AFTEU014")) {
                                    z = 6;
                                    break;
                                }
                                z = -1;
                                break;
                            case 1798172390:
                                if (str3.equals("AFTSO001")) {
                                    z = 7;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2119412532:
                                if (str3.equals("AFTEUFF014")) {
                                    z = 8;
                                    break;
                                }
                                z = -1;
                                break;
                            default:
                                z = -1;
                                break;
                        }
                        switch (z) {
                            default:
                                if (i <= 26) {
                                    String str4 = Build.DEVICE;
                                    str4.getClass();
                                    switch (str4.hashCode()) {
                                        case -2144781245:
                                            if (str4.equals("GIONEE_SWW1609")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2144781185:
                                            if (str4.equals("GIONEE_SWW1627")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2144781160:
                                            if (str4.equals("GIONEE_SWW1631")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2097309513:
                                            if (str4.equals("K50a40")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -2022874474:
                                            if (str4.equals("CP8676_I02")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1978993182:
                                            if (str4.equals("NX541J")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1978990237:
                                            if (str4.equals("NX573J")) {
                                                c = 6;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1936688988:
                                            if (str4.equals("PGN528")) {
                                                c = 7;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1936688066:
                                            if (str4.equals("PGN610")) {
                                                c = '\b';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1936688065:
                                            if (str4.equals("PGN611")) {
                                                c = '\t';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1931988508:
                                            if (str4.equals("AquaPowerM")) {
                                                c = '\n';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1885099851:
                                            if (str4.equals("RAIJIN")) {
                                                c = 11;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1696512866:
                                            if (str4.equals("XT1663")) {
                                                c = '\f';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1680025915:
                                            if (str4.equals("ComioS1")) {
                                                c = HexString.LF;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1615810839:
                                            if (str4.equals("Phantom6")) {
                                                c = 14;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1600724499:
                                            if (str4.equals("pacificrim")) {
                                                c = 15;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1554255044:
                                            if (str4.equals("vernee_M5")) {
                                                c = 16;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1481772737:
                                            if (str4.equals("panell_dl")) {
                                                c = 17;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1481772730:
                                            if (str4.equals("panell_ds")) {
                                                c = 18;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1481772729:
                                            if (str4.equals("panell_dt")) {
                                                c = 19;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1320080169:
                                            if (str4.equals("GiONEE_GBL7319")) {
                                                c = 20;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1217592143:
                                            if (str4.equals("BRAVIA_ATV2")) {
                                                c = 21;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1180384755:
                                            if (str4.equals("iris60")) {
                                                c = 22;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1139198265:
                                            if (str4.equals("Slate_Pro")) {
                                                c = 23;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1052835013:
                                            if (str4.equals("namath")) {
                                                c = 24;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -993250464:
                                            if (str4.equals("A10-70F")) {
                                                c = 25;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -993250458:
                                            if (str4.equals("A10-70L")) {
                                                c = 26;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -965403638:
                                            if (str4.equals("s905x018")) {
                                                c = 27;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -958336948:
                                            break;
                                        case -879245230:
                                            if (str4.equals("tcl_eu")) {
                                                c = 29;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -842500323:
                                            if (str4.equals("nicklaus_f")) {
                                                c = 30;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -821392978:
                                            if (str4.equals("A7000-a")) {
                                                c = 31;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -797483286:
                                            if (str4.equals("SVP-DTV15")) {
                                                c = HexString.CHAR_SPACE;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -794946968:
                                            if (str4.equals("watson")) {
                                                c = '!';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -788334647:
                                            if (str4.equals("whyred")) {
                                                c = OpenList.CHAR_QUOTE;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -782144577:
                                            if (str4.equals("OnePlus5T")) {
                                                c = '#';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -575125681:
                                            if (str4.equals("GiONEE_CBL7513")) {
                                                c = '$';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -521118391:
                                            if (str4.equals("GIONEE_GBL7360")) {
                                                c = '%';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -430914369:
                                            if (str4.equals("Pixi4-7_3G")) {
                                                c = '&';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -290434366:
                                            if (str4.equals("taido_row")) {
                                                c = '\'';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -282781963:
                                            if (str4.equals("BLACK-1X")) {
                                                c = '(';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -277133239:
                                            if (str4.equals("Z12_PRO")) {
                                                c = ')';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -173639913:
                                            if (str4.equals("ELUGA_A3_Pro")) {
                                                c = '*';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -56598463:
                                            if (str4.equals("woods_fn")) {
                                                c = '+';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2126:
                                            if (str4.equals("C1")) {
                                                c = HexString.CHAR_COMMA;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2564:
                                            if (str4.equals("Q5")) {
                                                c = LicenseUtility.SEPARATOR;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2715:
                                            if (str4.equals("V1")) {
                                                c = '.';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2719:
                                            if (str4.equals("V5")) {
                                                c = '/';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3091:
                                            if (str4.equals("b5")) {
                                                c = MoneyInputEditView.DEFAULT_VALUE;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3483:
                                            if (str4.equals("mh")) {
                                                c = '1';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 73405:
                                            if (str4.equals("JGZ")) {
                                                c = '2';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 75537:
                                            if (str4.equals("M04")) {
                                                c = '3';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 75739:
                                            if (str4.equals("M5c")) {
                                                c = '4';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76779:
                                            if (str4.equals("MX6")) {
                                                c = '5';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 78669:
                                            if (str4.equals("P85")) {
                                                c = '6';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 79305:
                                            if (str4.equals("PLE")) {
                                                c = '7';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 80618:
                                            if (str4.equals("QX1")) {
                                                c = '8';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 88274:
                                            if (str4.equals("Z80")) {
                                                c = '9';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 98846:
                                            if (str4.equals("cv1")) {
                                                c = ':';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 98848:
                                            if (str4.equals("cv3")) {
                                                c = ';';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 99329:
                                            if (str4.equals("deb")) {
                                                c = '<';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 101481:
                                            if (str4.equals("flo")) {
                                                c = '=';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1513190:
                                            if (str4.equals("1601")) {
                                                c = '>';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1514184:
                                            if (str4.equals("1713")) {
                                                c = '?';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1514185:
                                            if (str4.equals("1714")) {
                                                c = '@';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133089:
                                            if (str4.equals("F01H")) {
                                                c = 'A';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133091:
                                            if (str4.equals("F01J")) {
                                                c = 'B';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133120:
                                            if (str4.equals("F02H")) {
                                                c = 'C';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133151:
                                            if (str4.equals("F03H")) {
                                                c = 'D';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133182:
                                            if (str4.equals("F04H")) {
                                                c = 'E';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2133184:
                                            if (str4.equals("F04J")) {
                                                c = 'F';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2436959:
                                            if (str4.equals("P681")) {
                                                c = 'G';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2463773:
                                            if (str4.equals("Q350")) {
                                                c = 'H';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2464648:
                                            if (str4.equals("Q427")) {
                                                c = 'I';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2689555:
                                            if (str4.equals("XE2X")) {
                                                c = 'J';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3154429:
                                            if (str4.equals("fugu")) {
                                                c = 'K';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3284551:
                                            if (str4.equals("kate")) {
                                                c = 'L';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3351335:
                                            if (str4.equals("mido")) {
                                                c = 'M';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3386211:
                                            if (str4.equals("p212")) {
                                                c = 'N';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 41325051:
                                            if (str4.equals("MEIZU_M5")) {
                                                c = 'O';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 51349633:
                                            if (str4.equals("601LV")) {
                                                c = 'P';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 51350594:
                                            if (str4.equals("602LV")) {
                                                c = 'Q';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 55178625:
                                            if (str4.equals("Aura_Note_2")) {
                                                c = 'R';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 61542055:
                                            if (str4.equals("A1601")) {
                                                c = 'S';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 65355429:
                                            if (str4.equals("E5643")) {
                                                c = 'T';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66214468:
                                            if (str4.equals("F3111")) {
                                                c = 'U';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66214470:
                                            if (str4.equals("F3113")) {
                                                c = 'V';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66214473:
                                            if (str4.equals("F3116")) {
                                                c = 'W';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66215429:
                                            if (str4.equals("F3211")) {
                                                c = 'X';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66215431:
                                            if (str4.equals("F3213")) {
                                                c = 'Y';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66215433:
                                            if (str4.equals("F3215")) {
                                                c = 'Z';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 66216390:
                                            if (str4.equals("F3311")) {
                                                c = '[';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76402249:
                                            if (str4.equals("PRO7S")) {
                                                c = CSPStore.UNIQUE_SEPARATOR;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76404105:
                                            if (str4.equals("Q4260")) {
                                                c = ']';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 76404911:
                                            if (str4.equals("Q4310")) {
                                                c = '^';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 80963634:
                                            if (str4.equals("V23GB")) {
                                                c = '_';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 82882791:
                                            if (str4.equals("X3_HK")) {
                                                c = '`';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 98715550:
                                            if (str4.equals("i9031")) {
                                                c = 'a';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 101370885:
                                            if (str4.equals("l5460")) {
                                                c = 'b';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 102844228:
                                            if (str4.equals("le_x6")) {
                                                c = 'c';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 165221241:
                                            if (str4.equals("A2016a40")) {
                                                c = 'd';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 182191441:
                                            if (str4.equals("CPY83_I00")) {
                                                c = 'e';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 245388979:
                                            if (str4.equals("marino_f")) {
                                                c = 'f';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 287431619:
                                            if (str4.equals("griffin")) {
                                                c = 'g';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 307593612:
                                            if (str4.equals("A7010a48")) {
                                                c = 'h';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 308517133:
                                            if (str4.equals("A7020a48")) {
                                                c = 'i';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316215098:
                                            if (str4.equals("TB3-730F")) {
                                                c = 'j';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316215116:
                                            if (str4.equals("TB3-730X")) {
                                                c = 'k';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316246811:
                                            if (str4.equals("TB3-850F")) {
                                                c = 'l';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 316246818:
                                            if (str4.equals("TB3-850M")) {
                                                c = 'm';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 407160593:
                                            if (str4.equals("Pixi5-10_4G")) {
                                                c = 'n';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 507412548:
                                            if (str4.equals("QM16XE_U")) {
                                                c = 'o';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 793982701:
                                            if (str4.equals("GIONEE_WBL5708")) {
                                                c = 'p';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 794038622:
                                            if (str4.equals("GIONEE_WBL7365")) {
                                                c = 'q';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 794040393:
                                            if (str4.equals("GIONEE_WBL7519")) {
                                                c = 'r';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 835649806:
                                            if (str4.equals("manning")) {
                                                c = 's';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 917340916:
                                            if (str4.equals("A7000plus")) {
                                                c = 't';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 958008161:
                                            if (str4.equals("j2xlteins")) {
                                                c = 'u';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1060579533:
                                            if (str4.equals("panell_d")) {
                                                c = 'v';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1150207623:
                                            if (str4.equals("LS-5017")) {
                                                c = 'w';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1176899427:
                                            if (str4.equals("itel_S41")) {
                                                c = 'x';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1280332038:
                                            if (str4.equals("hwALE-H")) {
                                                c = 'y';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1306947716:
                                            if (str4.equals("EverStar_S")) {
                                                c = 'z';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1349174697:
                                            if (str4.equals("htc_e56ml_dtul")) {
                                                c = '{';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1522194893:
                                            if (str4.equals("woods_f")) {
                                                c = '|';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1691543273:
                                            if (str4.equals("CPH1609")) {
                                                c = '}';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1691544261:
                                            if (str4.equals("CPH1715")) {
                                                c = '~';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1709443163:
                                            if (str4.equals("iball8735_9806")) {
                                                c = 127;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1865889110:
                                            if (str4.equals("santoni")) {
                                                c = 128;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1906253259:
                                            if (str4.equals("PB2-670M")) {
                                                c = 129;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1977196784:
                                            if (str4.equals("Infinix-X572")) {
                                                c = 130;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2006372676:
                                            if (str4.equals("BRAVIA_ATV3_4K")) {
                                                c = 131;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2019281702:
                                            if (str4.equals("DM-01K")) {
                                                c = 132;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2029784656:
                                            if (str4.equals("HWBLN-H")) {
                                                c = 133;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2030379515:
                                            if (str4.equals("HWCAM-H")) {
                                                c = 134;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2033393791:
                                            if (str4.equals("ASUS_X00AD_2")) {
                                                c = 135;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2047190025:
                                            if (str4.equals("ELUGA_Note")) {
                                                c = 136;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2047252157:
                                            if (str4.equals("ELUGA_Prim")) {
                                                c = 137;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2048319463:
                                            if (str4.equals("HWVNS-H")) {
                                                c = 138;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2048855701:
                                            if (str4.equals("HWWAS-H")) {
                                                c = 139;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    switch (c) {
                                    }
                                }
                                break;
                            case false:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                                break;
                        }
                        H4 = z3;
                        v4 = true;
                    }
                    z3 = true;
                    H4 = z3;
                    v4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return H4;
    }

    @Override // defpackage.fyi0, defpackage.iyi0
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.zl31
    public final boolean h(long j, boolean z) {
        return j < -30000 && !z;
    }

    @Override // defpackage.wb10, defpackage.a95, defpackage.xyc0
    public final void handleMessage(int i, Object obj) {
        if (i == 1) {
            o0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            xl31 xl31Var = (xl31) obj;
            this.v3 = xl31Var;
            qxc0 qxc0Var = this.p1;
            if (qxc0Var != null) {
                qxc0Var.o(xl31Var);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.V2 != intValue) {
                this.V2 = intValue;
                if (this.T2) {
                    R();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.N1 = intValue2;
            pb10 pb10Var = this.N;
            if (pb10Var != null) {
                pb10Var.setVideoScalingMode(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.T1 = intValue3;
            qxc0 qxc0Var2 = this.p1;
            if (qxc0Var2 != null) {
                qxc0Var2.j(intValue3);
                return;
            }
            c cVar = this.M0.b;
            if (cVar.j == intValue3) {
                return;
            }
            cVar.j = intValue3;
            cVar.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.x1 = list;
            qxc0 qxc0Var3 = this.p1;
            if (qxc0Var3 != null) {
                qxc0Var3.n(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            vis0 vis0Var = (vis0) obj;
            if (vis0Var.a == 0 || vis0Var.b == 0) {
                return;
            }
            this.C1 = vis0Var;
            qxc0 qxc0Var4 = this.p1;
            if (qxc0Var4 != null) {
                Surface surface = this.y1;
                d6z.z(surface);
                qxc0Var4.k(surface, vis0Var);
                return;
            }
            return;
        }
        if (i != 16) {
            if (i != 17) {
                super.handleMessage(i, obj);
                return;
            }
            Surface surface2 = this.y1;
            o0(null);
            obj.getClass();
            ((a) obj).handleMessage(1, surface2);
            return;
        }
        obj.getClass();
        this.N2 = ((Integer) obj).intValue();
        pb10 pb10Var2 = this.N;
        if (pb10Var2 != null && tw21.a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.N2));
            pb10Var2.setParameters(bundle);
        }
    }

    @Override // defpackage.a95, defpackage.fyi0
    public final boolean isEnded() {
        return this.y0 && this.p1 == null;
    }

    @Override // defpackage.wb10, defpackage.fyi0
    public final boolean isReady() {
        boolean isReady = super.isReady();
        qxc0 qxc0Var = this.p1;
        if (qxc0Var != null) {
            return qxc0Var.e.f.a.b(false);
        }
        if (isReady && (this.N == null || this.T2)) {
            return true;
        }
        return this.M0.b(isReady);
    }

    @Override // defpackage.wb10
    public final qyg j(sb10 sb10Var, androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        qyg b = sb10Var.b(aVar, aVar2);
        int i = b.e;
        kb kbVar = this.R0;
        kbVar.getClass();
        if (aVar2.u > kbVar.a || aVar2.v > kbVar.b) {
            i |= 256;
        }
        if (i0(sb10Var, aVar2) > kbVar.c) {
            i |= 64;
        }
        int i2 = i;
        return new qyg(sb10Var.a, aVar, aVar2, i2 != 0 ? 0 : b.d, i2);
    }

    public final Surface j0(sb10 sb10Var) {
        qxc0 qxc0Var = this.p1;
        if (qxc0Var != null) {
            qxc0Var.c();
            throw null;
        }
        Surface surface = this.y1;
        if (surface != null) {
            return surface;
        }
        if (tw21.a >= 35 && sb10Var.k) {
            return null;
        }
        d6z.x(p0(sb10Var));
        PlaceholderSurface placeholderSurface = this.B1;
        if (placeholderSurface != null && placeholderSurface.secure != sb10Var.g && placeholderSurface != null) {
            placeholderSurface.release();
            this.B1 = null;
        }
        if (this.B1 == null) {
            this.B1 = PlaceholderSurface.newInstance(this.H0, sb10Var.g);
        }
        return this.B1;
    }

    @Override // defpackage.wb10
    public final MediaCodecDecoderException k(IllegalStateException illegalStateException, sb10 sb10Var) {
        return new MediaCodecVideoDecoderException(illegalStateException, sb10Var, this.y1);
    }

    public final boolean k0(sb10 sb10Var) {
        if (this.p1 != null) {
            return true;
        }
        Surface surface = this.y1;
        if (surface == null || !surface.isValid()) {
            return (tw21.a >= 35 && sb10Var.k) || p0(sb10Var);
        }
        return true;
    }

    public final void l0() {
        if (this.X1 > 0) {
            ((o2x0) getClock()).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.V1;
            int i = this.X1;
            a201 a201Var = this.J0;
            Handler handler = (Handler) a201Var.b;
            if (handler != null) {
                handler.post(new zn31(a201Var, i, j));
            }
            this.X1 = 0;
            this.V1 = elapsedRealtime;
        }
    }

    public final void m0() {
        int i;
        pb10 pb10Var;
        if (!this.T2 || (i = tw21.a) < 23 || (pb10Var = this.N) == null) {
            return;
        }
        this.X2 = new MediaCodecVideoRenderer$OnFrameRenderedListenerV23(this, pb10Var);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            pb10Var.setParameters(bundle);
        }
    }

    public final void n0(pb10 pb10Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        pb10Var.c(i, j);
        Trace.endSection();
        this.C0.e++;
        this.p2 = 0;
        if (this.p1 == null) {
            do31 do31Var = this.C2;
            boolean equals = do31Var.equals(do31.d);
            a201 a201Var = this.J0;
            if (!equals && !do31Var.equals(this.H2)) {
                this.H2 = do31Var;
                a201Var.w(do31Var);
            }
            if (!this.M0.e() || (surface = this.y1) == null) {
                return;
            }
            a201Var.q(surface);
            this.H1 = true;
        }
    }

    public final void o0(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.y1;
        a201 a201Var = this.J0;
        if (surface2 == surface) {
            if (surface != null) {
                do31 do31Var = this.H2;
                if (do31Var != null) {
                    a201Var.w(do31Var);
                }
                Surface surface3 = this.y1;
                if (surface3 == null || !this.H1) {
                    return;
                }
                a201Var.q(surface3);
                return;
            }
            return;
        }
        this.y1 = surface;
        qxc0 qxc0Var = this.p1;
        b bVar = this.M0;
        if (qxc0Var == null) {
            bVar.j(surface);
        }
        this.H1 = false;
        int state = getState();
        pb10 pb10Var = this.N;
        if (pb10Var != null && this.p1 == null) {
            sb10 sb10Var = this.U;
            sb10Var.getClass();
            boolean k0 = k0(sb10Var);
            int i = tw21.a;
            if (i < 23 || !k0 || this.S0) {
                R();
                B();
            } else {
                Surface j0 = j0(sb10Var);
                if (i >= 23 && j0 != null) {
                    pb10Var.g(j0);
                } else {
                    if (i < 35) {
                        ny61.k();
                        return;
                    }
                    pb10Var.e();
                }
            }
        }
        if (surface != null) {
            do31 do31Var2 = this.H2;
            if (do31Var2 != null) {
                a201Var.w(do31Var2);
            }
        } else {
            this.H2 = null;
            qxc0 qxc0Var2 = this.p1;
            if (qxc0Var2 != null) {
                txc0 txc0Var = qxc0Var2.e;
                int i2 = vis0.c.a;
                txc0Var.j = null;
            }
        }
        if (state == 2) {
            qxc0 qxc0Var3 = this.p1;
            if (qxc0Var3 != null) {
                qxc0Var3.e.f.a.c(true);
            } else {
                bVar.c(true);
            }
        }
        m0();
    }

    @Override // defpackage.wb10, defpackage.a95
    public final void onDisabled() {
        a201 a201Var = this.J0;
        this.H2 = null;
        this.C3 = -9223372036854775807L;
        qxc0 qxc0Var = this.p1;
        if (qxc0Var != null) {
            qxc0Var.e.f.a.d(0);
        } else {
            this.M0.d(0);
        }
        m0();
        this.H1 = false;
        this.X2 = null;
        try {
            super.onDisabled();
        } finally {
            a201Var.f(this.C0);
            a201Var.w(do31.d);
        }
    }

    @Override // defpackage.wb10, defpackage.a95
    public final void onEnabled(boolean z, boolean z2) {
        super.onEnabled(z, z2);
        boolean z3 = getConfiguration().b;
        d6z.x((z3 && this.V2 == 0) ? false : true);
        if (this.T2 != z3) {
            this.T2 = z3;
            R();
        }
        kyg kygVar = this.C0;
        a201 a201Var = this.J0;
        Handler handler = (Handler) a201Var.b;
        if (handler != null) {
            handler.post(new ao31(a201Var, kygVar, 0));
        }
        boolean z4 = this.v1;
        b bVar = this.M0;
        if (!z4) {
            if (this.x1 != null && this.p1 == null) {
                teh tehVar = new teh(this.H0, bVar);
                tehVar.A = getClock();
                txc0 c = tehVar.c();
                c.n = 1;
                SparseArray sparseArray = c.d;
                d6z.x(!tw21.k(sparseArray, 0));
                qxc0 qxc0Var = new qxc0(c, c.a);
                c.h.add(qxc0Var);
                sparseArray.put(0, qxc0Var);
                this.p1 = qxc0Var;
            }
            this.v1 = true;
        }
        qxc0 qxc0Var2 = this.p1;
        if (qxc0Var2 == null) {
            bVar.l = getClock();
            bVar.e = z2 ? 1 : 0;
            return;
        }
        qxc0Var2.d = com.google.common.util.concurrent.b.a();
        xl31 xl31Var = this.v3;
        if (xl31Var != null) {
            this.p1.o(xl31Var);
        }
        if (this.y1 != null && !this.C1.equals(vis0.c)) {
            this.p1.k(this.y1, this.C1);
        }
        this.p1.j(this.T1);
        this.p1.l(this.L);
        List list = this.x1;
        if (list != null) {
            this.p1.n(list);
        }
        this.p1.f(z2);
        if (this.I != null) {
            this.p1.getClass();
        }
    }

    @Override // defpackage.wb10, defpackage.a95
    public final void onPositionReset(long j, boolean z) {
        qxc0 qxc0Var = this.p1;
        if (qxc0Var != null) {
            if (!z) {
                qxc0Var.b(true);
            }
            this.p1.m(this.D0.b, -this.B3);
            this.H3 = true;
        }
        super.onPositionReset(j, z);
        qxc0 qxc0Var2 = this.p1;
        b bVar = this.M0;
        if (qxc0Var2 == null) {
            bVar.h();
        }
        if (z) {
            qxc0 qxc0Var3 = this.p1;
            if (qxc0Var3 != null) {
                qxc0Var3.e.f.a.c(false);
            } else {
                bVar.c(false);
            }
        }
        m0();
        this.p2 = 0;
    }

    @Override // defpackage.a95
    public final void onRelease() {
        super.onRelease();
        qxc0 qxc0Var = this.p1;
        if (qxc0Var == null || !this.I0) {
            return;
        }
        qxc0Var.i();
    }

    @Override // defpackage.wb10, defpackage.a95
    public final void onReset() {
        try {
            super.onReset();
        } finally {
            this.v1 = false;
            this.B3 = -9223372036854775807L;
            PlaceholderSurface placeholderSurface = this.B1;
            if (placeholderSurface != null) {
                placeholderSurface.release();
                this.B1 = null;
            }
        }
    }

    @Override // defpackage.a95
    public final void onStarted() {
        this.X1 = 0;
        ((o2x0) getClock()).getClass();
        this.V1 = SystemClock.elapsedRealtime();
        this.x2 = 0L;
        this.y2 = 0;
        qxc0 qxc0Var = this.p1;
        if (qxc0Var != null) {
            qxc0Var.g();
        } else {
            this.M0.f();
        }
    }

    @Override // defpackage.a95
    public final void onStopped() {
        l0();
        int i = this.y2;
        if (i != 0) {
            long j = this.x2;
            a201 a201Var = this.J0;
            Handler handler = (Handler) a201Var.b;
            if (handler != null) {
                handler.post(new zn31(a201Var, j, i));
            }
            this.x2 = 0L;
            this.y2 = 0;
        }
        qxc0 qxc0Var = this.p1;
        if (qxc0Var != null) {
            qxc0Var.h();
        } else {
            this.M0.g();
        }
    }

    @Override // defpackage.wb10, defpackage.a95
    public final void onStreamChanged(androidx.media3.common.a[] aVarArr, long j, long j2, sf10 sf10Var) {
        super.onStreamChanged(aVarArr, j, j2, sf10Var);
        if (this.B3 == -9223372036854775807L) {
            this.B3 = j;
        }
        a9z0 timeline = getTimeline();
        if (timeline.q()) {
            this.C3 = -9223372036854775807L;
        } else {
            sf10Var.getClass();
            this.C3 = timeline.h(sf10Var.a, new y8z0()).d;
        }
    }

    public final boolean p0(sb10 sb10Var) {
        if (tw21.a < 23 || this.T2 || f0(sb10Var.a)) {
            return false;
        }
        return !sb10Var.g || PlaceholderSurface.isSecureSupported(this.H0);
    }

    public final void q0(pb10 pb10Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        pb10Var.b(i);
        Trace.endSection();
        this.C0.f++;
    }

    public final void r0(int i, int i2) {
        kyg kygVar = this.C0;
        kygVar.h += i;
        int i3 = i + i2;
        kygVar.g += i3;
        this.X1 += i3;
        int i4 = this.p2 + i3;
        this.p2 = i4;
        kygVar.i = Math.max(i4, kygVar.i);
        int i5 = this.K0;
        if (i5 <= 0 || this.X1 < i5) {
            return;
        }
        l0();
    }

    @Override // defpackage.wb10, defpackage.fyi0
    public final void render(long j, long j2) {
        qxc0 qxc0Var = this.p1;
        if (qxc0Var != null) {
            try {
                mnh mnhVar = qxc0Var.e.f;
                mnhVar.getClass();
                try {
                    mnhVar.c.b(j, j2);
                } catch (ExoPlaybackException e) {
                    throw new VideoSink$VideoSinkException(e, mnhVar.e);
                }
            } catch (VideoSink$VideoSinkException e2) {
                throw createRendererException(e2, e2.format, 7001);
            }
        }
        super.render(j, j2);
    }

    @Override // defpackage.wb10
    public final int s(nyg nygVar) {
        return (tw21.a < 34 || !this.T2 || nygVar.y >= getLastResetPositionUs()) ? 0 : 32;
    }

    public final void s0(long j) {
        kyg kygVar = this.C0;
        kygVar.k += j;
        kygVar.l++;
        this.x2 += j;
        this.y2++;
    }

    @Override // defpackage.wb10, defpackage.fyi0
    public final void setPlaybackSpeed(float f, float f2) {
        super.setPlaybackSpeed(f, f2);
        qxc0 qxc0Var = this.p1;
        if (qxc0Var != null) {
            qxc0Var.l(f);
        } else {
            this.M0.k(f);
        }
    }

    @Override // defpackage.wb10
    public final boolean t() {
        return this.T2 && tw21.a < 23;
    }

    @Override // defpackage.wb10
    public final float u(float f, androidx.media3.common.a[] aVarArr) {
        float f2 = -1.0f;
        for (androidx.media3.common.a aVar : aVarArr) {
            float f3 = aVar.w;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // defpackage.wb10
    public final ArrayList v(xb10 xb10Var, androidx.media3.common.a aVar, boolean z) {
        return fd10.h(aVar, h0(this.H0, xb10Var, aVar, z, this.T2));
    }

    @Override // defpackage.wb10
    public final lb10 x(sb10 sb10Var, androidx.media3.common.a aVar, MediaCrypto mediaCrypto, float f) {
        kfc kfcVar;
        int i;
        kb kbVar;
        Point point;
        int i2;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i3;
        char c;
        boolean z;
        Pair d;
        int g0;
        String str = sb10Var.c;
        androidx.media3.common.a[] streamFormats = getStreamFormats();
        int i4 = aVar.u;
        float f2 = aVar.w;
        kfc kfcVar2 = aVar.B;
        int i5 = aVar.v;
        int i0 = i0(sb10Var, aVar);
        if (streamFormats.length == 1) {
            if (i0 != -1 && (g0 = g0(sb10Var, aVar)) != -1) {
                i0 = Math.min((int) (i0 * 1.5f), g0);
            }
            kbVar = new kb(i4, i5, i0);
            kfcVar = kfcVar2;
            i = i5;
        } else {
            int length = streamFormats.length;
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            boolean z2 = false;
            while (i8 < length) {
                androidx.media3.common.a aVar2 = streamFormats[i8];
                androidx.media3.common.a[] aVarArr = streamFormats;
                if (kfcVar2 != null && aVar2.B == null) {
                    f7s a = aVar2.a();
                    a.A = kfcVar2;
                    aVar2 = new androidx.media3.common.a(a);
                }
                qyg b = sb10Var.b(aVar, aVar2);
                int i9 = length;
                int i10 = aVar2.v;
                if (b.d != 0) {
                    int i11 = aVar2.u;
                    i3 = i8;
                    c = 65535;
                    z2 |= i11 == -1 || i10 == -1;
                    i6 = Math.max(i6, i11);
                    i7 = Math.max(i7, i10);
                    i0 = Math.max(i0, i0(sb10Var, aVar2));
                } else {
                    i3 = i8;
                    c = 65535;
                }
                length = i9;
                i8 = i3 + 1;
                streamFormats = aVarArr;
            }
            if (z2) {
                lk91.j("Resolutions unknown. Codec max resolution: " + i6 + RemoteBioParameters.X + i7);
                boolean z3 = i5 > i4;
                int i12 = z3 ? i5 : i4;
                int i13 = z3 ? i4 : i5;
                boolean z4 = z3;
                float f3 = i13 / i12;
                int i14 = 0;
                while (i14 < 9) {
                    int i15 = V3[i14];
                    int i16 = i14;
                    int i17 = (int) (i15 * f3);
                    if (i15 <= i12 || i17 <= i13) {
                        break;
                    }
                    if (z4) {
                        i15 = i17;
                    }
                    if (z4) {
                        i17 = i15;
                    }
                    int i18 = i12;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = sb10Var.d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        kfcVar = kfcVar2;
                        i2 = i13;
                        point2 = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i2 = i13;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        kfcVar = kfcVar2;
                        point2 = new Point(tw21.f(i15, widthAlignment) * widthAlignment, tw21.f(i17, heightAlignment) * heightAlignment);
                    }
                    if (point2 != null) {
                        point = point2;
                        i = i5;
                        if (sb10Var.h(point2.x, point2.y, f2)) {
                            break;
                        }
                    } else {
                        i = i5;
                    }
                    i14 = i16 + 1;
                    i5 = i;
                    i12 = i18;
                    kfcVar2 = kfcVar;
                    i13 = i2;
                }
                kfcVar = kfcVar2;
                i = i5;
                point = null;
                if (point != null) {
                    i6 = Math.max(i6, point.x);
                    i7 = Math.max(i7, point.y);
                    f7s a2 = aVar.a();
                    a2.t = i6;
                    a2.u = i7;
                    i0 = Math.max(i0, g0(sb10Var, new androidx.media3.common.a(a2)));
                    lk91.j("Codec max resolution adjusted to: " + i6 + RemoteBioParameters.X + i7);
                }
            } else {
                kfcVar = kfcVar2;
                i = i5;
            }
            kbVar = new kb(i6, i7, i0);
        }
        this.R0 = kbVar;
        int i19 = this.T2 ? this.V2 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i4);
        mediaFormat.setInteger("height", i);
        sd10.c(mediaFormat, aVar.q);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        sd10.b(mediaFormat, "rotation-degrees", aVar.x);
        sd10.a(mediaFormat, kfcVar);
        if ("video/dolby-vision".equals(aVar.n) && (d = fd10.d(aVar)) != null) {
            sd10.b(mediaFormat, "profile", ((Integer) d.first).intValue());
        }
        mediaFormat.setInteger("max-width", kbVar.a);
        mediaFormat.setInteger("max-height", kbVar.b);
        sd10.b(mediaFormat, "max-input-size", kbVar.c);
        int i20 = tw21.a;
        if (i20 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.L0) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i19 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i19);
        }
        if (i20 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.N2));
        }
        Surface j0 = j0(sb10Var);
        if (this.p1 != null && !tw21.S(this.H0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new lb10(sb10Var, mediaFormat, aVar, j0, mediaCrypto, null);
    }

    @Override // defpackage.wb10
    public final void y(nyg nygVar) {
        if (this.T0) {
            ByteBuffer byteBuffer = nygVar.z;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        pb10 pb10Var = this.N;
                        pb10Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        pb10Var.setParameters(bundle);
                    }
                }
            }
        }
    }
}
