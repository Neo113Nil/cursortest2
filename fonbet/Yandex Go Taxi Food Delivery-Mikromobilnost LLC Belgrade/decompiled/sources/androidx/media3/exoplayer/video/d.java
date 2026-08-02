package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRecoverException;
import com.google.common.collect.ImmutableList;
import defpackage.a201;
import defpackage.a9z0;
import defpackage.ao31;
import defpackage.bo31;
import defpackage.co31;
import defpackage.d6z;
import defpackage.do31;
import defpackage.eh20;
import defpackage.ey91;
import defpackage.f7s;
import defpackage.fd10;
import defpackage.hpo0;
import defpackage.iyi0;
import defpackage.kb;
import defpackage.kfc;
import defpackage.kyg;
import defpackage.lb10;
import defpackage.lk91;
import defpackage.mb10;
import defpackage.mnh;
import defpackage.ny61;
import defpackage.nyg;
import defpackage.o2x0;
import defpackage.o7s;
import defpackage.pb10;
import defpackage.peh;
import defpackage.qxc0;
import defpackage.qyg;
import defpackage.sb10;
import defpackage.sd10;
import defpackage.sf10;
import defpackage.sii0;
import defpackage.t601;
import defpackage.teh;
import defpackage.tii0;
import defpackage.tw21;
import defpackage.txc0;
import defpackage.u9h;
import defpackage.vis0;
import defpackage.xb10;
import defpackage.xl31;
import defpackage.y8z0;
import defpackage.yl31;
import defpackage.z9c;
import defpackage.zl31;
import defpackage.zn31;
import io.appmetrica.analytics.RtmMessageConstraints;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.video.m3.player.impl.ExoPlayerExceptionKt;
import ru.yandex.video.m3.player.tracking.StrmEventLogger;

/* loaded from: classes10.dex */
public abstract class d extends peh implements zl31 {
    public static final int[] L5 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean M5;
    public static boolean N5;
    public kb B1;
    public int B2;
    public do31 B3;
    public boolean C1;
    public long C2;
    public do31 C3;
    public boolean H1;
    public int H2;
    public int H3;
    public long H4;
    public boolean I5;
    public u9h J5;
    public boolean K5;
    public z9c M0;
    public long M4;
    public int N0;
    public qxc0 N1;
    public int N2;
    public boolean N3;
    public boolean N4;
    public StrmEventLogger O0;
    public final Context P0;
    public final boolean Q0;
    public final a201 R0;
    public final int S0;
    public final boolean T0;
    public boolean T1;
    public int T2;
    public int T3;
    public List V1;
    public long V2;
    public YandexMediaCodecVideoRenderer$OnFrameRenderedListenerV23 V3;
    public Surface X1;
    public int X2;
    public boolean X4;
    public final b p1;
    public vis0 p2;
    public final yl31 v1;
    public PlaceholderSurface v2;
    public long v3;
    public xl31 v4;
    public final long x1;
    public boolean x2;
    public final PriorityQueue y1;
    public int y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, mb10 mb10Var, xb10 xb10Var, long j, boolean z, Handler handler, co31 co31Var) {
        super(2, mb10Var, xb10Var, z, 30.0f);
        int i = mb10.K2;
        this.M0 = z9c.c;
        this.J5 = new u9h();
        this.K5 = false;
        Context applicationContext = context.getApplicationContext();
        this.P0 = applicationContext;
        this.S0 = 50;
        this.N1 = null;
        this.R0 = new a201(handler, co31Var);
        this.Q0 = this.N1 == null;
        this.p1 = new b(applicationContext, this, j);
        this.v1 = new yl31();
        this.T0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.p2 = vis0.c;
        this.y2 = 1;
        this.B2 = 0;
        this.B3 = do31.d;
        this.T3 = 0;
        this.C3 = null;
        this.H3 = -1000;
        this.H4 = -9223372036854775807L;
        this.M4 = -9223372036854775807L;
        this.y1 = new PriorityQueue();
        this.x1 = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (r3.equals("video/av01") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int j0(sb10 sb10Var, androidx.media3.common.a aVar) {
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

    public static int l0(sb10 sb10Var, androidx.media3.common.a aVar) {
        int i = aVar.o;
        List list = aVar.q;
        if (i == -1) {
            return j0(sb10Var, aVar);
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return aVar.o + i2;
    }

    @Override // defpackage.peh
    public final boolean E(androidx.media3.common.a aVar) {
        qxc0 qxc0Var = this.N1;
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

    @Override // defpackage.peh
    public final void F(Exception exc) {
        lk91.f("YMediaCodecVideoRendere", "Video codec error", exc);
        a201 a201Var = this.R0;
        Handler handler = (Handler) a201Var.b;
        if (handler != null) {
            handler.post(new t601(29, a201Var, exc));
        }
    }

    @Override // defpackage.peh
    public final void H(String str) {
        a201 a201Var = this.R0;
        Handler handler = (Handler) a201Var.b;
        if (handler != null) {
            handler.post(new bo31(0, a201Var, str));
        }
    }

    @Override // defpackage.peh
    public qyg I(o7s o7sVar) {
        qyg I = super.I(o7sVar);
        androidx.media3.common.a aVar = o7sVar.b;
        aVar.getClass();
        a201 a201Var = this.R0;
        Handler handler = (Handler) a201Var.b;
        if (handler != null) {
            handler.post(new hpo0(22, a201Var, aVar, I));
        }
        return I;
    }

    @Override // defpackage.peh
    public final void J(androidx.media3.common.a aVar, MediaFormat mediaFormat) {
        int integer;
        int i;
        pb10 pb10Var = this.I;
        if (pb10Var != null) {
            pb10Var.setVideoScalingMode(this.y2);
        }
        if (this.N3) {
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
        this.B3 = new do31(i, integer, f);
        qxc0 qxc0Var = this.N1;
        if (qxc0Var == null || !this.N4) {
            this.p1.i(aVar.w);
            this.N4 = false;
            return;
        }
        f7s a = aVar.a();
        a.t = i;
        a.u = integer;
        a.x = f;
        androidx.media3.common.a aVar2 = new androidx.media3.common.a(a);
        List list = this.V1;
        if (list == null) {
            list = ImmutableList.p();
        }
        qxc0Var.e(aVar2, list);
        throw null;
    }

    @Override // defpackage.peh
    public final void L(long j) {
        super.L(j);
        if (this.N3) {
            return;
        }
        this.T2--;
    }

    @Override // defpackage.peh
    public final void M() {
        qxc0 qxc0Var = this.N1;
        if (qxc0Var != null) {
            qxc0Var.p();
            this.N1.m(this.G0.b, -this.H4);
        } else {
            this.p1.d(2);
        }
        this.N4 = true;
        p0();
    }

    @Override // defpackage.peh
    public final void N(nyg nygVar) {
        Surface surface;
        boolean z = this.N3;
        if (!z) {
            this.T2++;
        }
        if (tw21.a >= 23 || !z) {
            return;
        }
        long j = nygVar.y;
        f0(j);
        do31 do31Var = this.B3;
        boolean equals = do31Var.equals(do31.d);
        a201 a201Var = this.R0;
        if (!equals && !do31Var.equals(this.C3)) {
            this.C3 = do31Var;
            a201Var.w(do31Var);
        }
        this.F0.e++;
        if (this.p1.e() && (surface = this.X1) != null) {
            a201Var.q(surface);
            this.x2 = true;
        }
        L(j);
    }

    @Override // defpackage.peh
    public final void O(j jVar) {
    }

    @Override // defpackage.peh
    public final boolean Q(long j, long j2, pb10 pb10Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.a aVar) {
        pb10Var.getClass();
        long j4 = j3 - this.G0.c;
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.y1;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i4++;
            priorityQueue.poll();
        }
        v0(i4, 0);
        qxc0 qxc0Var = this.N1;
        if (qxc0Var == null) {
            int a = this.p1.a(j3, j, j2, this.G0.b, z, z2, this.v1);
            yl31 yl31Var = this.v1;
            if (a == 0) {
                ((o2x0) getClock()).getClass();
                long nanoTime = System.nanoTime();
                xl31 xl31Var = this.v4;
                if (xl31Var != null) {
                    xl31Var.c(j4, nanoTime, aVar, this.K);
                }
                q0(pb10Var, i, nanoTime);
                w0(yl31Var.a);
                return true;
            }
            if (a == 1) {
                long j5 = yl31Var.b;
                long j6 = yl31Var.a;
                if (j5 == this.v3) {
                    u0(pb10Var, i);
                } else {
                    xl31 xl31Var2 = this.v4;
                    if (xl31Var2 != null) {
                        xl31Var2.c(j4, j5, aVar, this.K);
                    }
                    q0(pb10Var, i, j5);
                }
                w0(j6);
                this.v3 = j5;
                return true;
            }
            if (a == 2) {
                Trace.beginSection("dropVideoBuffer");
                pb10Var.b(i);
                Trace.endSection();
                v0(0, 1);
                w0(yl31Var.a);
                return true;
            }
            if (a == 3) {
                u0(pb10Var, i);
                w0(yl31Var.a);
                return true;
            }
            if (a != 4 && a != 5) {
                ny61.r(String.valueOf(a));
            }
        } else {
            if (z && !z2) {
                u0(pb10Var, i);
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

    @Override // defpackage.peh
    public final void T() {
        qxc0 qxc0Var = this.N1;
        if (qxc0Var != null) {
            qxc0Var.p();
        }
    }

    @Override // defpackage.peh
    public final void U() {
        super.U();
        this.y1.clear();
        this.X4 = false;
        this.T2 = 0;
    }

    @Override // defpackage.peh
    public final boolean Z(nyg nygVar) {
        if (!hasReadStreamToEnd() && !nygVar.b(536870912)) {
            long j = this.M4;
            if (j != -9223372036854775807L && j - (nygVar.y - this.G0.c) > 100000 && !nygVar.b(1073741824)) {
                boolean z = nygVar.y < getLastResetPositionUs();
                if ((z || this.X4) && !nygVar.b(SelfTester_JCP.IMITA) && nygVar.b(SelfTester_JCP.DECRYPT_CBC)) {
                    nygVar.d();
                    if (z) {
                        this.F0.d++;
                        return true;
                    }
                    if (this.X4) {
                        this.y1.add(Long.valueOf(nygVar.y));
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.zl31
    public final boolean c(long j, long j2) {
        return j < -30000 && j2 > 100000;
    }

    @Override // defpackage.peh
    public final int c0(xb10 xb10Var, androidx.media3.common.a aVar) {
        androidx.media3.common.a aVar2;
        boolean z;
        int i = 0;
        if (!eh20.p(aVar.n)) {
            return iyi0.a(0, 0, 0, 0);
        }
        boolean z2 = true;
        boolean z3 = aVar.r != null;
        u9h u9hVar = this.J5;
        Context context = this.P0;
        List a = u9hVar.a(context, xb10Var, aVar, z3, false);
        boolean z4 = z3;
        if (z4 && a.isEmpty()) {
            aVar2 = aVar;
            a = this.J5.a(context, xb10Var, aVar2, false, false);
        } else {
            aVar2 = aVar;
        }
        if (a.isEmpty()) {
            return iyi0.a(1, 0, 0, 0);
        }
        int i2 = aVar2.M;
        if (i2 != 0 && i2 != 2) {
            return iyi0.a(2, 0, 0, 0);
        }
        sb10 sb10Var = (sb10) a.get(0);
        boolean e = sb10Var.e(aVar2);
        if (!e) {
            for (int i3 = 1; i3 < a.size(); i3++) {
                sb10 sb10Var2 = (sb10) a.get(i3);
                if (sb10Var2.e(aVar2)) {
                    z = false;
                    sb10Var = sb10Var2;
                    break;
                }
            }
        }
        z = true;
        z2 = e;
        int i4 = z2 ? 4 : 3;
        int i5 = sb10Var.g(aVar2) ? 16 : 8;
        int i6 = sb10Var.h ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (tw21.a >= 26 && "video/dolby-vision".equals(aVar2.n) && !ey91.d(context)) {
            i7 = 256;
        }
        int i8 = i7;
        if (z2) {
            androidx.media3.common.a aVar3 = aVar2;
            List a2 = this.J5.a(context, xb10Var, aVar3, z4, true);
            if (!a2.isEmpty()) {
                sb10 sb10Var3 = (sb10) fd10.h(aVar3, a2).get(0);
                if (sb10Var3.e(aVar3) && sb10Var3.g(aVar3)) {
                    i = 32;
                }
            }
        }
        return iyi0.d(i4, i5, i, i6, i8, 0);
    }

    @Override // defpackage.fyi0
    public final void enableMayRenderStartOfStream() {
        qxc0 qxc0Var = this.N1;
        if (qxc0Var != null) {
            qxc0Var.a();
            return;
        }
        b bVar = this.p1;
        if (bVar.e == 0) {
            bVar.e = 1;
        }
    }

    @Override // defpackage.zl31
    public final boolean f(long j, long j2, boolean z, boolean z2) {
        int skipSource;
        long j3 = this.x1;
        if (j3 != -9223372036854775807L) {
            this.X4 = j2 > getLastResetPositionUs() + 200000 && j < j3;
        }
        if (j >= -500000 || z || (skipSource = skipSource(j2)) == 0) {
            return false;
        }
        kyg kygVar = this.F0;
        PriorityQueue priorityQueue = this.y1;
        if (z2) {
            int i = kygVar.d + skipSource;
            kygVar.d = i;
            kygVar.f += this.T2;
            kygVar.d = priorityQueue.size() + i;
        } else {
            kygVar.j++;
            v0(priorityQueue.size() + skipSource, this.T2);
        }
        if (q()) {
            C();
        }
        qxc0 qxc0Var = this.N1;
        if (qxc0Var != null) {
            qxc0Var.b(false);
        }
        return true;
    }

    @Override // defpackage.fyi0, defpackage.iyi0
    public final String getName() {
        return "YMediaCodecVideoRendere";
    }

    @Override // defpackage.zl31
    public final boolean h(long j, boolean z) {
        return j < -30000 && !z;
    }

    public abstract boolean h0(String str);

    @Override // defpackage.peh, defpackage.a95, defpackage.xyc0
    public final void handleMessage(int i, Object obj) {
        if (i == 1) {
            s0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            xl31 xl31Var = (xl31) obj;
            this.v4 = xl31Var;
            qxc0 qxc0Var = this.N1;
            if (qxc0Var != null) {
                qxc0Var.o(xl31Var);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.T3 != intValue) {
                this.T3 = intValue;
                if (this.N3) {
                    S();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.y2 = intValue2;
            pb10 pb10Var = this.I;
            if (pb10Var != null) {
                pb10Var.setVideoScalingMode(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.B2 = intValue3;
            qxc0 qxc0Var2 = this.N1;
            if (qxc0Var2 != null) {
                qxc0Var2.j(intValue3);
                return;
            }
            c cVar = this.p1.b;
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
            this.V1 = list;
            qxc0 qxc0Var3 = this.N1;
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
            this.p2 = vis0Var;
            qxc0 qxc0Var4 = this.N1;
            if (qxc0Var4 != null) {
                Surface surface = this.X1;
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
            Surface surface2 = this.X1;
            s0(null);
            obj.getClass();
            ((a) obj).handleMessage(1, surface2);
            return;
        }
        obj.getClass();
        this.H3 = ((Integer) obj).intValue();
        pb10 pb10Var2 = this.I;
        if (pb10Var2 != null && tw21.a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.H3));
            pb10Var2.setParameters(bundle);
        }
    }

    public final MediaCodecRecoverException i0(RuntimeException runtimeException, IllegalStateException illegalStateException) {
        sb10 sb10Var = this.N;
        return new MediaCodecRecoverException(runtimeException, sb10Var, (MediaCodecVideoDecoderException) k(illegalStateException, sb10Var), this.M0);
    }

    @Override // defpackage.a95, defpackage.fyi0
    public final boolean isEnded() {
        return this.C0 && this.N1 == null;
    }

    @Override // defpackage.peh, defpackage.fyi0
    public final boolean isReady() {
        boolean isReady = super.isReady();
        qxc0 qxc0Var = this.N1;
        if (qxc0Var != null) {
            return qxc0Var.e.f.a.b(false);
        }
        if (isReady && (this.I == null || this.N3)) {
            return true;
        }
        return this.p1.b(isReady);
    }

    @Override // defpackage.peh
    public final qyg j(sb10 sb10Var, androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        qyg b = sb10Var.b(aVar, aVar2);
        int i = b.e;
        kb kbVar = this.B1;
        kbVar.getClass();
        if (aVar2.u > kbVar.a || aVar2.v > kbVar.b) {
            i |= 256;
        }
        if (l0(sb10Var, aVar2) > kbVar.c) {
            i |= 64;
        }
        if (this.I5 && sb10Var.a.startsWith("OMX.MTK.VIDEO.DECODER.AVC")) {
            i |= 2;
        }
        if (this.K5) {
            Pair d = fd10.d(aVar);
            Pair d2 = fd10.d(aVar2);
            if (d != null && d2 != null) {
                Integer num = (Integer) d.first;
                Integer num2 = (Integer) d2.first;
                Integer num3 = (Integer) d.second;
                Integer num4 = (Integer) d2.second;
                boolean z = num2.intValue() > num.intValue();
                boolean z2 = num4.intValue() > num3.intValue();
                if (z || z2) {
                    i |= 2;
                }
            }
        }
        int i2 = i;
        return new qyg(sb10Var.a, aVar, aVar2, i2 == 0 ? b.d : 0, i2);
    }

    @Override // defpackage.peh
    public final MediaCodecDecoderException k(IllegalStateException illegalStateException, sb10 sb10Var) {
        if (!(illegalStateException instanceof MediaCodec.CodecException)) {
            return new MediaCodecVideoDecoderException(illegalStateException, sb10Var, this.X1);
        }
        MediaCodec.CodecException codecException = (MediaCodec.CodecException) illegalStateException;
        boolean isRecoverable = codecException.isRecoverable();
        boolean isTransient = codecException.isTransient();
        pb10 pb10Var = this.I;
        PersistableBundle metrics = pb10Var != null ? pb10Var.getMetrics() : null;
        return metrics != null ? new EnhancedMediaCodecVideoDecoderException(illegalStateException, sb10Var, this.X1, isRecoverable, isTransient, metrics) : new EnhancedMediaCodecVideoDecoderException(illegalStateException, sb10Var, this.X1, isRecoverable, isTransient);
    }

    public final lb10 k0() {
        float u = tw21.a < 23 ? -1.0f : u(this.R, getStreamFormats());
        return x(this.N, this.b, this.O, u > this.B ? u : -1.0f);
    }

    public final Surface m0(sb10 sb10Var) {
        qxc0 qxc0Var = this.N1;
        if (qxc0Var != null) {
            qxc0Var.c();
            throw null;
        }
        Surface surface = this.X1;
        if (surface != null) {
            return surface;
        }
        if (tw21.a >= 35 && sb10Var.k) {
            return null;
        }
        d6z.x(t0(sb10Var));
        PlaceholderSurface placeholderSurface = this.v2;
        if (placeholderSurface != null && placeholderSurface.secure != sb10Var.g && placeholderSurface != null) {
            placeholderSurface.release();
            this.v2 = null;
        }
        if (this.v2 == null) {
            this.v2 = PlaceholderSurface.newInstance(this.P0, sb10Var.g);
        }
        return this.v2;
    }

    public final boolean n0(sb10 sb10Var) {
        if (this.N1 != null) {
            return true;
        }
        Surface surface = this.X1;
        if (surface == null || !surface.isValid()) {
            return (tw21.a >= 35 && sb10Var.k) || t0(sb10Var);
        }
        return true;
    }

    public final void o0() {
        if (this.H2 > 0) {
            ((o2x0) getClock()).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.C2;
            int i = this.H2;
            a201 a201Var = this.R0;
            Handler handler = (Handler) a201Var.b;
            if (handler != null) {
                handler.post(new zn31(a201Var, i, j));
            }
            this.H2 = 0;
            this.C2 = elapsedRealtime;
        }
    }

    @Override // defpackage.peh, defpackage.a95
    public final void onDisabled() {
        a201 a201Var = this.R0;
        this.C3 = null;
        this.M4 = -9223372036854775807L;
        qxc0 qxc0Var = this.N1;
        if (qxc0Var != null) {
            qxc0Var.e.f.a.d(0);
        } else {
            this.p1.d(0);
        }
        p0();
        this.x2 = false;
        this.V3 = null;
        try {
            super.onDisabled();
        } finally {
            a201Var.f(this.F0);
            a201Var.w(do31.d);
        }
    }

    @Override // defpackage.peh, defpackage.a95
    public final void onEnabled(boolean z, boolean z2) {
        super.onEnabled(z, z2);
        boolean z3 = getConfiguration().b;
        d6z.x((z3 && this.T3 == 0) ? false : true);
        if (this.N3 != z3) {
            this.N3 = z3;
            S();
        }
        kyg kygVar = this.F0;
        a201 a201Var = this.R0;
        Handler handler = (Handler) a201Var.b;
        if (handler != null) {
            handler.post(new ao31(a201Var, kygVar, 0));
        }
        boolean z4 = this.T1;
        b bVar = this.p1;
        if (!z4) {
            if (this.V1 != null && this.N1 == null) {
                teh tehVar = new teh(this.P0, bVar);
                tehVar.A = getClock();
                txc0 c = tehVar.c();
                c.n = 1;
                SparseArray sparseArray = c.d;
                d6z.x(!tw21.k(sparseArray, 0));
                qxc0 qxc0Var = new qxc0(c, c.a);
                c.h.add(qxc0Var);
                sparseArray.put(0, qxc0Var);
                this.N1 = qxc0Var;
            }
            this.T1 = true;
        }
        qxc0 qxc0Var2 = this.N1;
        if (qxc0Var2 == null) {
            bVar.l = getClock();
            bVar.e = z2 ? 1 : 0;
            return;
        }
        qxc0Var2.d = com.google.common.util.concurrent.b.a();
        xl31 xl31Var = this.v4;
        if (xl31Var != null) {
            this.N1.o(xl31Var);
        }
        if (this.X1 != null && !this.p2.equals(vis0.c)) {
            this.N1.k(this.X1, this.p2);
        }
        this.N1.j(this.B2);
        this.N1.l(this.Q);
        List list = this.V1;
        if (list != null) {
            this.N1.n(list);
        }
        this.N1.f(z2);
        if (this.a0 != null) {
            this.N1.getClass();
        }
    }

    @Override // defpackage.peh, defpackage.a95
    public final void onPositionReset(long j, boolean z) {
        qxc0 qxc0Var = this.N1;
        if (qxc0Var != null) {
            if (!z) {
                qxc0Var.b(true);
            }
            this.N1.m(this.G0.b, -this.H4);
            this.N4 = true;
        }
        super.onPositionReset(j, z);
        qxc0 qxc0Var2 = this.N1;
        b bVar = this.p1;
        if (qxc0Var2 == null) {
            bVar.h();
        }
        if (z) {
            qxc0 qxc0Var3 = this.N1;
            if (qxc0Var3 != null) {
                qxc0Var3.e.f.a.c(false);
            } else {
                bVar.c(false);
            }
        }
        p0();
        this.N2 = 0;
    }

    @Override // defpackage.a95
    public final void onRelease() {
        super.onRelease();
        qxc0 qxc0Var = this.N1;
        if (qxc0Var == null || !this.Q0) {
            return;
        }
        qxc0Var.i();
    }

    @Override // defpackage.peh, defpackage.a95
    public void onReset() {
        try {
            super.onReset();
        } finally {
            this.T1 = false;
            this.H4 = -9223372036854775807L;
            PlaceholderSurface placeholderSurface = this.v2;
            if (placeholderSurface != null) {
                placeholderSurface.release();
                this.v2 = null;
            }
        }
    }

    @Override // defpackage.a95
    public void onStarted() {
        this.H2 = 0;
        ((o2x0) getClock()).getClass();
        this.C2 = SystemClock.elapsedRealtime();
        this.V2 = 0L;
        this.X2 = 0;
        qxc0 qxc0Var = this.N1;
        if (qxc0Var != null) {
            qxc0Var.g();
        } else {
            this.p1.f();
        }
    }

    @Override // defpackage.a95
    public void onStopped() {
        o0();
        int i = this.X2;
        if (i != 0) {
            long j = this.V2;
            a201 a201Var = this.R0;
            Handler handler = (Handler) a201Var.b;
            if (handler != null) {
                handler.post(new zn31(a201Var, j, i));
            }
            this.V2 = 0L;
            this.X2 = 0;
        }
        qxc0 qxc0Var = this.N1;
        if (qxc0Var != null) {
            qxc0Var.h();
        } else {
            this.p1.g();
        }
    }

    @Override // defpackage.peh, defpackage.a95
    public final void onStreamChanged(androidx.media3.common.a[] aVarArr, long j, long j2, sf10 sf10Var) {
        super.onStreamChanged(aVarArr, j, j2, sf10Var);
        if (this.H4 == -9223372036854775807L) {
            this.H4 = j;
        }
        a9z0 timeline = getTimeline();
        if (timeline.q()) {
            this.M4 = -9223372036854775807L;
        } else {
            sf10Var.getClass();
            this.M4 = timeline.h(sf10Var.a, new y8z0()).d;
        }
    }

    public final void p0() {
        int i;
        pb10 pb10Var;
        if (!this.N3 || (i = tw21.a) < 23 || (pb10Var = this.I) == null) {
            return;
        }
        this.V3 = new YandexMediaCodecVideoRenderer$OnFrameRenderedListenerV23(this, pb10Var);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            pb10Var.setParameters(bundle);
        }
    }

    public final void q0(pb10 pb10Var, int i, long j) {
        Surface surface;
        Trace.beginSection("renderOutputBuffer");
        pb10Var.c(i, j);
        Trace.endSection();
        this.F0.e++;
        this.N2 = 0;
        if (this.N1 == null) {
            do31 do31Var = this.B3;
            boolean equals = do31Var.equals(do31.d);
            a201 a201Var = this.R0;
            if (!equals && !do31Var.equals(this.C3)) {
                this.C3 = do31Var;
                a201Var.w(do31Var);
            }
            if (!this.p1.e() || (surface = this.X1) == null) {
                return;
            }
            a201Var.q(surface);
            this.x2 = true;
        }
    }

    public final void r0(IllegalStateException illegalStateException) {
        StrmEventLogger strmEventLogger = this.O0;
        if (strmEventLogger != null) {
            strmEventLogger.logError(ExoPlayerExceptionKt.toPlayerError(k(illegalStateException, this.N)));
        }
    }

    @Override // defpackage.peh, defpackage.fyi0
    public final void render(long j, long j2) {
        qxc0 qxc0Var = this.N1;
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

    @Override // defpackage.peh
    public final int s(nyg nygVar) {
        return (tw21.a < 34 || !this.N3 || nygVar.y >= getLastResetPositionUs()) ? 0 : 32;
    }

    public final void s0(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.X1;
        a201 a201Var = this.R0;
        if (surface2 == surface) {
            if (surface != null) {
                do31 do31Var = this.C3;
                if (do31Var != null) {
                    a201Var.w(do31Var);
                }
                Surface surface3 = this.X1;
                if (surface3 == null || !this.x2) {
                    return;
                }
                a201Var.q(surface3);
                return;
            }
            return;
        }
        this.X1 = surface;
        qxc0 qxc0Var = this.N1;
        b bVar = this.p1;
        if (qxc0Var == null) {
            bVar.j(surface);
        }
        this.x2 = false;
        int state = getState();
        pb10 pb10Var = this.I;
        if (pb10Var != null && this.N1 == null) {
            sb10 sb10Var = this.N;
            sb10Var.getClass();
            boolean n0 = n0(sb10Var);
            int i = tw21.a;
            if (i < 23 || !n0 || this.C1) {
                S();
                C();
            } else {
                Surface m0 = m0(sb10Var);
                if (i >= 23 && m0 != null) {
                    pb10Var.g(m0);
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
            do31 do31Var2 = this.C3;
            if (do31Var2 != null) {
                a201Var.w(do31Var2);
            }
        } else {
            this.C3 = null;
            qxc0 qxc0Var2 = this.N1;
            if (qxc0Var2 != null) {
                txc0 txc0Var = qxc0Var2.e;
                int i2 = vis0.c.a;
                txc0Var.j = null;
            }
        }
        if (state == 2) {
            qxc0 qxc0Var3 = this.N1;
            if (qxc0Var3 != null) {
                qxc0Var3.e.f.a.c(true);
            } else {
                bVar.c(true);
            }
        }
        p0();
    }

    @Override // defpackage.peh, defpackage.fyi0
    public final void setPlaybackSpeed(float f, float f2) {
        super.setPlaybackSpeed(f, f2);
        qxc0 qxc0Var = this.N1;
        if (qxc0Var != null) {
            qxc0Var.l(f);
        } else {
            this.p1.k(f);
        }
    }

    @Override // defpackage.peh
    public final boolean t() {
        return this.N3 && tw21.a < 23;
    }

    public final boolean t0(sb10 sb10Var) {
        if (tw21.a < 23 || this.N3 || h0(sb10Var.a)) {
            return false;
        }
        return !sb10Var.g || PlaceholderSurface.isSecureSupported(this.P0);
    }

    @Override // defpackage.peh
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

    public final void u0(pb10 pb10Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        pb10Var.b(i);
        Trace.endSection();
        this.F0.f++;
    }

    @Override // defpackage.peh
    public final ArrayList v(xb10 xb10Var, androidx.media3.common.a aVar, boolean z) {
        return fd10.h(aVar, this.J5.a(this.P0, xb10Var, aVar, z, this.N3));
    }

    public final void v0(int i, int i2) {
        kyg kygVar = this.F0;
        kygVar.h += i;
        int i3 = i + i2;
        kygVar.g += i3;
        this.H2 += i3;
        int i4 = this.N2 + i3;
        this.N2 = i4;
        kygVar.i = Math.max(i4, kygVar.i);
        int i5 = this.S0;
        if (i5 <= 0 || this.H2 < i5) {
            return;
        }
        o0();
    }

    public final void w0(long j) {
        kyg kygVar = this.F0;
        kygVar.k += j;
        kygVar.l++;
        this.V2 += j;
        this.X2++;
    }

    @Override // defpackage.peh
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
        int j0;
        String str = sb10Var.c;
        androidx.media3.common.a[] streamFormats = getStreamFormats();
        int i4 = aVar.u;
        float f2 = aVar.w;
        kfc kfcVar2 = aVar.B;
        int i5 = aVar.v;
        int l0 = l0(sb10Var, aVar);
        if (streamFormats.length == 1) {
            if (l0 != -1 && (j0 = j0(sb10Var, aVar)) != -1) {
                l0 = Math.min((int) (l0 * 1.5f), j0);
            }
            kbVar = new kb(i4, i5, l0);
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
                    l0 = Math.max(l0, l0(sb10Var, aVar2));
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
                    int i15 = L5[i14];
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
                    l0 = Math.max(l0, j0(sb10Var, new androidx.media3.common.a(a2)));
                    lk91.j("Codec max resolution adjusted to: " + i6 + RemoteBioParameters.X + i7);
                }
            } else {
                kfcVar = kfcVar2;
                i = i5;
            }
            kbVar = new kb(i6, i7, l0);
        }
        this.B1 = kbVar;
        int i19 = this.N3 ? this.T3 : 0;
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
        if (this.T0) {
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
            mediaFormat.setInteger("importance", Math.max(0, -this.H3));
        }
        Surface m0 = m0(sb10Var);
        if (this.N1 != null && !tw21.S(this.P0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new lb10(sb10Var, mediaFormat, aVar, m0, mediaCrypto, null);
    }

    @Override // defpackage.peh
    public final void y(IllegalStateException illegalStateException) {
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (!z) {
            StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
            if (stackTrace.length <= 0) {
                throw illegalStateException;
            }
            if (!stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                throw illegalStateException;
            }
        }
        int i = tii0.a[this.M0.b.ordinal()];
        if (i == 1) {
            int i2 = this.N0;
            if (i2 >= this.M0.a) {
                g0(illegalStateException);
                throw null;
            }
            this.N0 = i2 + 1;
            r0(illegalStateException);
            lb10 k0 = k0();
            try {
                try {
                    sii0 sii0Var = (sii0) this.I;
                    if (sii0Var != null) {
                        sii0Var.t(k0);
                    }
                    return;
                } finally {
                }
            } catch (RuntimeException e) {
                throw createRendererException(i0(e, illegalStateException), this.b, false, 1000000);
            }
        }
        if (i == 2) {
            int i3 = this.N0;
            if (i3 >= this.M0.a) {
                g0(illegalStateException);
                throw null;
            }
            this.N0 = i3 + 1;
            r0(illegalStateException);
            lb10 k02 = k0();
            try {
                try {
                    sii0 sii0Var2 = (sii0) this.I;
                    if (sii0Var2 != null) {
                        sii0Var2.m(k02);
                    }
                    return;
                } finally {
                }
            } catch (RuntimeException e2) {
                throw createRendererException(i0(e2, illegalStateException), this.b, false, 1000000);
            }
        }
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                g0(illegalStateException);
                throw null;
            }
            r0(illegalStateException);
            try {
                try {
                    sii0 sii0Var3 = (sii0) this.I;
                    if (sii0Var3 != null) {
                        sii0Var3.reset();
                    }
                    S();
                    throw createRendererException(k(illegalStateException, this.N), this.b, false, 4003);
                } catch (RuntimeException e3) {
                    throw createRendererException(i0(e3, illegalStateException), this.b, false, 1000000);
                }
            } catch (Throwable th) {
                S();
                throw th;
            }
        }
        if (this.N0 >= this.M0.a || !z) {
            g0(illegalStateException);
            throw null;
        }
        r0(illegalStateException);
        try {
            try {
                lb10 k03 = k0();
                sii0 sii0Var4 = (sii0) this.I;
                if (sii0Var4 != null && !sii0Var4.n((MediaCodec.CodecException) illegalStateException, k03)) {
                    sii0Var4.m(k03);
                }
                U();
                this.N0++;
            } catch (RuntimeException e4) {
                throw createRendererException(i0(e4, illegalStateException), this.b, false, 1000000);
            }
        } finally {
        }
    }

    @Override // defpackage.peh
    public final void z(nyg nygVar) {
        if (this.H1) {
            ByteBuffer byteBuffer = nygVar.z;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if ((b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) || b3 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    pb10 pb10Var = this.I;
                    pb10Var.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    pb10Var.setParameters(bundle);
                }
            }
        }
    }
}
