package yads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* loaded from: classes10.dex */
public final class cm1 extends nl1 {
    public static final int[] p1 = {1920, 1600, 1440, CoverVideoUploadTask.y, VideoRecord.DEFAULT_MAX_DIMENSION, 854, 640, 540, 480};
    public static boolean q1;
    public static boolean r1;
    public final Context G0;
    public final yi3 H0;
    public final gk3 I0;
    public final long J0;
    public final int K0;
    public final boolean L0;
    public am1 M0;
    public boolean N0;
    public boolean O0;
    public Surface P0;
    public ie2 Q0;
    public boolean R0;
    public int S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public long W0;
    public long X0;
    public long Y0;
    public int Z0;
    public int a1;
    public int b1;
    public long c1;
    public long d1;
    public long e1;
    public int f1;
    public int g1;
    public int h1;
    public int i1;
    public float j1;
    public sk3 k1;
    public boolean l1;
    public int m1;
    public bm1 n1;
    public ri3 o1;

    public cm1(Context context, ee0 ee0Var, pl1 pl1Var, boolean z, Handler handler, xn0 xn0Var) {
        super(2, ee0Var, pl1Var, z, 30.0f);
        this.J0 = 5000L;
        this.K0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.G0 = applicationContext;
        this.H0 = new yi3(applicationContext);
        this.I0 = new gk3(handler, xn0Var);
        this.L0 = B();
        this.X0 = C.TIME_UNSET;
        this.g1 = -1;
        this.h1 = -1;
        this.j1 = -1.0f;
        this.S0 = 1;
        this.m1 = 0;
        A();
    }

    public static boolean B() {
        return ql2.g.Z0().equals(mc3.c);
    }

    public static boolean C() {
        int i = mc3.a;
        if (i <= 28) {
            dm1 dm1Var = ql2.g;
            String r = dm1Var.r();
            String str = mc3.b;
            if (r.equals(str) || dm1Var.I().equals(str) || dm1Var.K().equals(str) || dm1Var.J().equals(str) || dm1Var.Q0().equals(str) || dm1Var.P0().equals(str) || dm1Var.d1().equals(str) || dm1Var.e1().equals(str)) {
                return true;
            }
        }
        if (i <= 27 && ql2.g.w0().equals(mc3.b)) {
            return true;
        }
        if (i > 26) {
            return false;
        }
        dm1 dm1Var2 = ql2.g;
        String a = dm1Var2.a();
        String str2 = mc3.b;
        if (!a.equals(str2) && !dm1Var2.b().equals(str2) && !dm1Var2.c().equals(str2) && !dm1Var2.d().equals(str2) && !dm1Var2.e().equals(str2) && !dm1Var2.f().equals(str2) && !dm1Var2.g().equals(str2) && !dm1Var2.h().equals(str2) && !dm1Var2.i().equals(str2) && !dm1Var2.j().equals(str2) && !dm1Var2.k().equals(str2) && !dm1Var2.l().equals(str2) && !dm1Var2.m().equals(str2) && !dm1Var2.s().equals(str2) && !dm1Var2.t().equals(str2) && !dm1Var2.u().equals(str2) && !dm1Var2.v().equals(str2) && !dm1Var2.w().equals(str2) && !dm1Var2.y().equals(str2) && !dm1Var2.z().equals(str2) && !dm1Var2.A().equals(str2) && !dm1Var2.B().equals(str2) && !dm1Var2.C().equals(str2) && !dm1Var2.D().equals(str2) && !dm1Var2.E().equals(str2) && !dm1Var2.F().equals(str2) && !dm1Var2.G().equals(str2) && !dm1Var2.H().equals(str2) && !dm1Var2.L().equals(str2) && !dm1Var2.M().equals(str2) && !dm1Var2.N().equals(str2) && !dm1Var2.O().equals(str2) && !dm1Var2.P().equals(str2) && !dm1Var2.Q().equals(str2) && !dm1Var2.R().equals(str2) && !dm1Var2.S().equals(str2) && !dm1Var2.T().equals(str2) && !dm1Var2.U().equals(str2) && !dm1Var2.V().equals(str2) && !dm1Var2.W().equals(str2) && !dm1Var2.X().equals(str2) && !dm1Var2.Y().equals(str2) && !dm1Var2.Z().equals(str2) && !dm1Var2.a0().equals(str2) && !dm1Var2.b0().equals(str2) && !dm1Var2.c0().equals(str2) && !dm1Var2.d0().equals(str2) && !dm1Var2.e0().equals(str2) && !dm1Var2.f0().equals(str2) && !dm1Var2.g0().equals(str2) && !dm1Var2.h0().equals(str2) && !dm1Var2.i0().equals(str2) && !dm1Var2.j0().equals(str2) && !dm1Var2.k0().equals(str2) && !dm1Var2.l0().equals(str2) && !dm1Var2.m0().equals(str2) && !dm1Var2.n0().equals(str2) && !dm1Var2.o0().equals(str2) && !dm1Var2.p0().equals(str2) && !dm1Var2.q0().equals(str2) && !dm1Var2.r0().equals(str2) && !dm1Var2.s0().equals(str2) && !dm1Var2.t0().equals(str2) && !dm1Var2.u0().equals(str2) && !dm1Var2.v0().equals(str2) && !dm1Var2.x0().equals(str2) && !dm1Var2.y0().equals(str2) && !dm1Var2.z0().equals(str2) && !dm1Var2.A0().equals(str2) && !dm1Var2.B0().equals(str2) && !dm1Var2.C0().equals(str2) && !dm1Var2.D0().equals(str2) && !dm1Var2.E0().equals(str2) && !dm1Var2.F0().equals(str2) && !dm1Var2.H0().equals(str2) && !dm1Var2.I0().equals(str2) && !dm1Var2.K0().equals(str2) && !dm1Var2.L0().equals(str2) && !dm1Var2.M0().equals(str2) && !dm1Var2.N0().equals(str2) && !dm1Var2.O0().equals(str2) && !dm1Var2.R0().equals(str2) && !dm1Var2.S0().equals(str2) && !dm1Var2.T0().equals(str2) && !dm1Var2.U0().equals(str2) && !dm1Var2.V0().equals(str2) && !dm1Var2.W0().equals(str2) && !dm1Var2.X0().equals(str2) && !dm1Var2.Y0().equals(str2) && !dm1Var2.a1().equals(str2) && !dm1Var2.b1().equals(str2) && !dm1Var2.f1().equals(str2) && !dm1Var2.g1().equals(str2) && !dm1Var2.h1().equals(str2) && !dm1Var2.i1().equals(str2) && !dm1Var2.j1().equals(str2) && !dm1Var2.k1().equals(str2) && !dm1Var2.l1().equals(str2) && !dm1Var2.m1().equals(str2) && !dm1Var2.n1().equals(str2) && !dm1Var2.o1().equals(str2) && !dm1Var2.p1().equals(str2) && !dm1Var2.q1().equals(str2) && !dm1Var2.r1().equals(str2) && !dm1Var2.s1().equals(str2) && !dm1Var2.t1().equals(str2) && !dm1Var2.u1().equals(str2) && !dm1Var2.v1().equals(str2) && !dm1Var2.w1().equals(str2) && !dm1Var2.x1().equals(str2) && !dm1Var2.y1().equals(str2) && !dm1Var2.z1().equals(str2) && !dm1Var2.A1().equals(str2) && !dm1Var2.B1().equals(str2) && !dm1Var2.C1().equals(str2) && !dm1Var2.D1().equals(str2) && !dm1Var2.E1().equals(str2) && !dm1Var2.G1().equals(str2) && !dm1Var2.H1().equals(str2) && !dm1Var2.I1().equals(str2) && !dm1Var2.F1().equals(str2) && !dm1Var2.J1().equals(str2) && !dm1Var2.K1().equals(str2) && !dm1Var2.L1().equals(str2) && !dm1Var2.M1().equals(str2) && !dm1Var2.N1().equals(str2) && !dm1Var2.O1().equals(str2) && !dm1Var2.P1().equals(str2) && !dm1Var2.Q1().equals(str2) && !dm1Var2.R1().equals(str2) && !dm1Var2.S1().equals(str2) && !dm1Var2.T1().equals(str2) && !dm1Var2.U1().equals(str2) && !dm1Var2.V1().equals(str2) && !dm1Var2.W1().equals(str2) && !dm1Var2.X1().equals(str2) && !dm1Var2.Y1().equals(str2) && !dm1Var2.Z1().equals(str2) && !dm1Var2.a2().equals(str2) && !dm1Var2.b2().equals(str2)) {
            String n = dm1Var2.n();
            String str3 = mc3.d;
            if (!n.equals(str3) && !dm1Var2.o().equals(str3) && !dm1Var2.G0().equals(str3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(String str) {
        if (str.startsWith(ql2.g.c1())) {
            return false;
        }
        synchronized (cm1.class) {
            try {
                if (!q1) {
                    r1 = C();
                    q1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r1;
    }

    public final void A() {
        this.k1 = null;
    }

    public final void D() {
        int i = this.g1;
        if (i == -1 && this.h1 == -1) {
            return;
        }
        sk3 sk3Var = this.k1;
        if (sk3Var != null && sk3Var.b == i && sk3Var.c == this.h1 && sk3Var.d == this.i1 && sk3Var.e == this.j1) {
            return;
        }
        sk3 sk3Var2 = new sk3(i, this.h1, this.i1, this.j1);
        this.k1 = sk3Var2;
        this.I0.b(sk3Var2);
    }

    @Override // yads.nl1
    public final va0 a(jl1 jl1Var, nx0 nx0Var, nx0 nx0Var2) {
        va0 a = jl1Var.a(nx0Var, nx0Var2);
        int i = a.e;
        int i2 = nx0Var2.r;
        am1 am1Var = this.M0;
        if (i2 > am1Var.a || nx0Var2.s > am1Var.b) {
            i |= 256;
        }
        if (b(nx0Var2, jl1Var) > this.M0.c) {
            i |= 64;
        }
        int i3 = i;
        return new va0(jl1Var.a, nx0Var, nx0Var2, i3 != 0 ? 0 : a.d, i3);
    }

    public final void c(long j) {
        pa0 pa0Var = this.B0;
        pa0Var.k += j;
        pa0Var.l++;
        this.e1 += j;
        this.f1++;
    }

    @Override // yads.ro
    public final String d() {
        return "MediaCodecVideoRenderer";
    }

    @Override // yads.nl1, yads.ro
    public final boolean g() {
        ie2 ie2Var;
        if (super.g() && (this.T0 || (((ie2Var = this.Q0) != null && this.P0 == ie2Var) || this.K == null || this.l1))) {
            this.X0 = C.TIME_UNSET;
            return true;
        }
        if (this.X0 == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.X0) {
            return true;
        }
        this.X0 = C.TIME_UNSET;
        return false;
    }

    @Override // yads.ro
    public final void h() {
        this.k1 = null;
        z();
        this.R0 = false;
        this.n1 = null;
        try {
            this.B = null;
            this.C0 = C.TIME_UNSET;
            this.D0 = C.TIME_UNSET;
            this.E0 = 0;
            p();
        } finally {
            this.I0.a(this.B0);
        }
    }

    @Override // yads.ro, yads.bg2
    public final void handleMessage(int i, Object obj) {
        boolean z;
        if (i != 1) {
            if (i == 7) {
                this.o1 = (ri3) obj;
                return;
            }
            if (i == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.m1 != intValue) {
                    this.m1 = intValue;
                    if (this.l1) {
                        u();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 4) {
                int intValue2 = ((Integer) obj).intValue();
                this.S0 = intValue2;
                el1 el1Var = this.K;
                if (el1Var != null) {
                    el1Var.setVideoScalingMode(intValue2);
                    return;
                }
                return;
            }
            if (i != 5) {
                return;
            }
            yi3 yi3Var = this.H0;
            int intValue3 = ((Integer) obj).intValue();
            if (yi3Var.j == intValue3) {
                return;
            }
            yi3Var.j = intValue3;
            yi3Var.a(true);
            return;
        }
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = surface;
        if (surface == null) {
            ie2 ie2Var = this.Q0;
            if (ie2Var != null) {
                surface2 = ie2Var;
            } else {
                jl1 jl1Var = this.R;
                surface2 = surface;
                if (jl1Var != null) {
                    surface2 = surface;
                    if (b(jl1Var)) {
                        Context context = this.G0;
                        boolean z2 = jl1Var.f;
                        int i2 = ie2.e;
                        if (z2) {
                            synchronized (ie2.class) {
                                try {
                                    if (!ie2.f) {
                                        ie2.e = tz0.a(context) ? tz0.c() ? 1 : 2 : 0;
                                        ie2.f = true;
                                    }
                                    z = ie2.e != 0;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (!z) {
                                throw new IllegalStateException();
                            }
                        }
                        ie2 a = new he2().a(z2 ? ie2.e : 0);
                        this.Q0 = a;
                        surface2 = a;
                    }
                }
            }
        }
        if (this.P0 == surface2) {
            if (surface2 == null || surface2 == this.Q0) {
                return;
            }
            sk3 sk3Var = this.k1;
            if (sk3Var != null) {
                this.I0.b(sk3Var);
            }
            if (this.R0) {
                this.I0.a(this.P0);
                return;
            }
            return;
        }
        this.P0 = surface2;
        yi3 yi3Var2 = this.H0;
        yi3Var2.getClass();
        Surface surface3 = surface2 instanceof ie2 ? null : surface2;
        Surface surface4 = yi3Var2.e;
        if (surface4 != surface3) {
            if (mc3.a >= 30 && surface4 != null && yi3Var2.j != Integer.MIN_VALUE && yi3Var2.h != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                yi3Var2.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                si3.a(surface4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            yi3Var2.e = surface3;
            yi3Var2.a(true);
        }
        this.R0 = false;
        int i3 = this.g;
        el1 el1Var2 = this.K;
        if (el1Var2 != null) {
            if (mc3.a < 23 || surface2 == null || this.N0) {
                u();
                r();
            } else {
                el1Var2.a(surface2);
            }
        }
        if (surface2 == null || surface2 == this.Q0) {
            this.k1 = null;
            z();
            return;
        }
        sk3 sk3Var2 = this.k1;
        if (sk3Var2 != null) {
            this.I0.b(sk3Var2);
        }
        z();
        if (i3 == 2) {
            this.X0 = this.J0 > 0 ? SystemClock.elapsedRealtime() + this.J0 : C.TIME_UNSET;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.ro
    public final void i() {
        try {
            try {
                this.m0 = false;
                this.u.b();
                this.t.b();
                this.l0 = false;
                this.k0 = false;
                u();
            } finally {
                nk0.a(this.E, null);
                this.E = null;
            }
        } finally {
            ie2 ie2Var = this.Q0;
            if (ie2Var != null) {
                if (this.P0 == ie2Var) {
                    this.P0 = null;
                }
                ie2Var.release();
                this.Q0 = null;
            }
        }
    }

    @Override // yads.ro
    public final void j() {
        this.Z0 = 0;
        this.Y0 = SystemClock.elapsedRealtime();
        this.d1 = SystemClock.elapsedRealtime() * 1000;
        this.e1 = 0L;
        this.f1 = 0;
        this.H0.a();
    }

    @Override // yads.ro
    public final void k() {
        Surface surface;
        this.X0 = C.TIME_UNSET;
        if (this.Z0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.I0.a(this.Z0, elapsedRealtime - this.Y0);
            this.Z0 = 0;
            this.Y0 = elapsedRealtime;
        }
        int i = this.f1;
        if (i != 0) {
            this.I0.c(i, this.e1);
            this.e1 = 0L;
            this.f1 = 0;
        }
        yi3 yi3Var = this.H0;
        yi3Var.d = false;
        ui3 ui3Var = yi3Var.b;
        if (ui3Var != null) {
            ui3Var.a();
            xi3 xi3Var = yi3Var.c;
            xi3Var.getClass();
            xi3Var.c.sendEmptyMessage(2);
        }
        if (mc3.a < 30 || (surface = yi3Var.e) == null || yi3Var.j == Integer.MIN_VALUE || yi3Var.h == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        yi3Var.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        si3.a(surface, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // yads.nl1
    public final boolean q() {
        return this.l1 && mc3.a < 23;
    }

    @Override // yads.nl1
    public final void s() {
        z();
    }

    @Override // yads.nl1
    public final void w() {
        super.w();
        this.b1 = 0;
    }

    public final void z() {
        el1 el1Var;
        this.T0 = false;
        if (mc3.a < 23 || !this.l1 || (el1Var = this.K) == null) {
            return;
        }
        this.n1 = new bm1(this, el1Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007b, code lost:
    
        if (r3.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(nx0 nx0Var, jl1 jl1Var) {
        int i;
        int intValue;
        int i2 = nx0Var.r;
        int i3 = nx0Var.s;
        if (i2 == -1 || i3 == -1) {
            return -1;
        }
        String str = nx0Var.m;
        char c = 1;
        if ("video/dolby-vision".equals(str)) {
            Pair b = xl1.b(nx0Var);
            str = (b == null || !((intValue = ((Integer) b.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(MimeTypes.VIDEO_H263)) {
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
                if (str.equals(MimeTypes.VIDEO_MP4V)) {
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
                if (str.equals(MimeTypes.VIDEO_VP8)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals(MimeTypes.VIDEO_VP9)) {
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
                i = i3 * i2;
                i4 = 2;
                break;
            case 2:
            case 6:
                i = i3 * i2;
                break;
            case 4:
                dm1 dm1Var = ql2.g;
                String x = dm1Var.x();
                String str2 = mc3.d;
                if (!x.equals(str2) && (!dm1Var.q().equals(mc3.c) || (!dm1Var.J0().equals(str2) && (!dm1Var.p().equals(str2) || !jl1Var.f)))) {
                    i = ((i3 + 15) / 16) * ((i2 + 15) / 16) * 256;
                    i4 = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    public static int b(nx0 nx0Var, jl1 jl1Var) {
        if (nx0Var.n != -1) {
            int size = nx0Var.o.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((byte[]) nx0Var.o.get(i2)).length;
            }
            return nx0Var.n + i;
        }
        return a(nx0Var, jl1Var);
    }

    @Override // yads.nl1
    public final void b(sa0 sa0Var) {
        boolean z = this.l1;
        if (!z) {
            this.b1++;
        }
        if (mc3.a >= 23 || !z) {
            return;
        }
        long j = sa0Var.f;
        b(j);
        D();
        this.B0.e++;
        this.V0 = true;
        if (!this.T0) {
            this.T0 = true;
            this.I0.a(this.P0);
            this.R0 = true;
        }
        a(j);
    }

    @Override // yads.nl1
    public final float a(float f, nx0[] nx0VarArr) {
        float f2 = -1.0f;
        for (nx0 nx0Var : nx0VarArr) {
            float f3 = nx0Var.t;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // yads.nl1
    public final ArrayList a(pl1 pl1Var, nx0 nx0Var, boolean z) {
        return xl1.a(a(pl1Var, nx0Var, z, this.l1), nx0Var);
    }

    public static s51 a(pl1 pl1Var, nx0 nx0Var, boolean z, boolean z2) {
        String str = nx0Var.m;
        if (str == null) {
            p51 p51Var = s51.c;
            return tn2.f;
        }
        List decoderInfos = pl1Var.getDecoderInfos(str, z, z2);
        String a = xl1.a(nx0Var);
        if (a == null) {
            return s51.a((Collection) decoderInfos);
        }
        List decoderInfos2 = pl1Var.getDecoderInfos(a, z, z2);
        p51 p51Var2 = s51.c;
        return new o51().a(decoderInfos).a(decoderInfos2).a();
    }

    public final boolean b(jl1 jl1Var) {
        boolean z;
        int i;
        if (mc3.a >= 23 && !this.l1 && !b(jl1Var.a)) {
            if (jl1Var.f) {
                Context context = this.G0;
                synchronized (ie2.class) {
                    try {
                        if (!ie2.f) {
                            if (tz0.a(context)) {
                                i = tz0.c() ? 1 : 2;
                            } else {
                                i = 0;
                            }
                            ie2.e = i;
                            ie2.f = true;
                        }
                        z = ie2.e != 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // yads.nl1
    public final bl1 a(jl1 jl1Var, nx0 nx0Var, MediaCrypto mediaCrypto, float f) {
        am1 am1Var;
        Point point;
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        Pair b;
        int a;
        ie2 ie2Var = this.Q0;
        if (ie2Var != null && ie2Var.b != jl1Var.f) {
            if (this.P0 == ie2Var) {
                this.P0 = null;
            }
            ie2Var.release();
            this.Q0 = null;
        }
        String str = jl1Var.c;
        nx0[] nx0VarArr = this.i;
        nx0VarArr.getClass();
        int i6 = nx0Var.r;
        int i7 = nx0Var.s;
        int b2 = b(nx0Var, jl1Var);
        if (nx0VarArr.length == 1) {
            if (b2 != -1 && (a = a(nx0Var, jl1Var)) != -1) {
                b2 = Math.min((int) (b2 * 1.5f), a);
            }
            am1Var = new am1(i6, i7, b2);
        } else {
            int length = nx0VarArr.length;
            boolean z3 = false;
            for (int i8 = 0; i8 < length; i8++) {
                nx0 nx0Var2 = nx0VarArr[i8];
                if (nx0Var.y != null && nx0Var2.y == null) {
                    mx0 mx0Var = new mx0(nx0Var2);
                    mx0Var.w = nx0Var.y;
                    nx0Var2 = new nx0(mx0Var);
                }
                if (jl1Var.a(nx0Var, nx0Var2).d != 0) {
                    int i9 = nx0Var2.r;
                    z3 |= i9 == -1 || nx0Var2.s == -1;
                    i6 = Math.max(i6, i9);
                    i7 = Math.max(i7, nx0Var2.s);
                    b2 = Math.max(b2, b(nx0Var2, jl1Var));
                }
            }
            if (z3) {
                ji1.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i6 + "x" + i7);
                int i10 = nx0Var.s;
                int i11 = nx0Var.r;
                boolean z4 = i10 > i11;
                int i12 = z4 ? i10 : i11;
                if (z4) {
                    i10 = i11;
                }
                float f2 = i10 / i12;
                int[] iArr = p1;
                int i13 = 0;
                while (i13 < 9) {
                    int i14 = iArr[i13];
                    int i15 = (int) (i14 * f2);
                    if (i14 <= i12 || i15 <= i10) {
                        break;
                    }
                    int i16 = i10;
                    float f3 = f2;
                    if (mc3.a >= 21) {
                        int i17 = z4 ? i15 : i14;
                        if (!z4) {
                            i14 = i15;
                        }
                        point = jl1Var.a(i17, i14);
                        z = z4;
                        i = i12;
                        if (jl1Var.a(point.x, point.y, nx0Var.t)) {
                            break;
                        }
                        i13++;
                        i10 = i16;
                        f2 = f3;
                        z4 = z;
                        i12 = i;
                    } else {
                        z = z4;
                        i = i12;
                        try {
                            int i18 = ((i14 + 15) / 16) * 16;
                            int i19 = ((i15 + 15) / 16) * 16;
                            if (i18 * i19 <= xl1.a()) {
                                int i20 = z ? i19 : i18;
                                if (!z) {
                                    i18 = i19;
                                }
                                point = new Point(i20, i18);
                            } else {
                                i13++;
                                i10 = i16;
                                f2 = f3;
                                z4 = z;
                                i12 = i;
                            }
                        } catch (sl1 unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i6 = Math.max(i6, point.x);
                    i7 = Math.max(i7, point.y);
                    mx0 mx0Var2 = new mx0(nx0Var);
                    mx0Var2.p = i6;
                    mx0Var2.q = i7;
                    b2 = Math.max(b2, a(new nx0(mx0Var2), jl1Var));
                    ji1.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i6 + "x" + i7);
                }
            }
            am1Var = new am1(i6, i7, b2);
        }
        this.M0 = am1Var;
        boolean z5 = this.L0;
        int i21 = this.l1 ? this.m1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", nx0Var.r);
        mediaFormat.setInteger("height", nx0Var.s);
        List list = nx0Var.o;
        for (int i22 = 0; i22 < list.size(); i22++) {
            mediaFormat.setByteBuffer(nh2.a("csd-", i22), ByteBuffer.wrap((byte[]) list.get(i22)));
        }
        float f4 = nx0Var.t;
        if (f4 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f4);
        }
        rm1.a(mediaFormat, "rotation-degrees", nx0Var.u);
        mx mxVar = nx0Var.y;
        if (mxVar != null) {
            rm1.a(mediaFormat, "color-transfer", mxVar.d);
            rm1.a(mediaFormat, "color-standard", mxVar.b);
            rm1.a(mediaFormat, "color-range", mxVar.c);
            byte[] bArr = mxVar.e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(nx0Var.m) && (b = xl1.b(nx0Var)) != null) {
            rm1.a(mediaFormat, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, ((Integer) b.first).intValue());
        }
        mediaFormat.setInteger("max-width", am1Var.a);
        mediaFormat.setInteger("max-height", am1Var.b);
        rm1.a(mediaFormat, "max-input-size", am1Var.c);
        if (mc3.a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z5) {
            z2 = true;
            mediaFormat.setInteger("no-post-process", 1);
            i2 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z2 = true;
            i2 = 0;
        }
        if (i21 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z2);
            mediaFormat.setInteger("audio-session-id", i21);
        }
        if (this.P0 == null) {
            if (b(jl1Var)) {
                if (this.Q0 == null) {
                    Context context = this.G0;
                    boolean z6 = jl1Var.f;
                    int i23 = ie2.e;
                    if (z6) {
                        synchronized (ie2.class) {
                            try {
                                if (ie2.f) {
                                    i3 = 1;
                                } else {
                                    if (tz0.a(context)) {
                                        i5 = tz0.c() ? 1 : 2;
                                    } else {
                                        i5 = i2;
                                    }
                                    ie2.e = i5;
                                    i3 = 1;
                                    ie2.f = true;
                                }
                                i4 = ie2.e != 0 ? i3 : i2;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (i4 == 0) {
                            throw new IllegalStateException();
                        }
                    }
                    this.Q0 = new he2().a(z6 ? ie2.e : i2);
                }
                this.P0 = this.Q0;
            } else {
                throw new IllegalStateException();
            }
        }
        return new bl1(jl1Var, mediaFormat, nx0Var, this.P0, mediaCrypto);
    }

    @Override // yads.nl1
    public final void a(sa0 sa0Var) {
        if (this.O0) {
            ByteBuffer byteBuffer = sa0Var.g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    el1 el1Var = this.K;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    el1Var.a(bundle);
                }
            }
        }
    }

    @Override // yads.nl1
    public final void a(Exception exc) {
        ji1.b("MediaCodecVideoRenderer", ji1.a("Video codec error", exc));
        this.I0.b(exc);
    }

    @Override // yads.nl1
    public final void a(String str, long j, long j2) {
        this.I0.a(str, j, j2);
        this.N0 = b(str);
        jl1 jl1Var = this.R;
        jl1Var.getClass();
        this.O0 = jl1Var.a();
        if (mc3.a < 23 || !this.l1) {
            return;
        }
        el1 el1Var = this.K;
        el1Var.getClass();
        this.n1 = new bm1(this, el1Var);
    }

    @Override // yads.nl1
    public final void a(String str) {
        this.I0.a(str);
    }

    @Override // yads.ro
    public final void a(boolean z) {
        this.B0 = new pa0();
        no2 no2Var = this.d;
        no2Var.getClass();
        boolean z2 = no2Var.a;
        if (z2 && this.m1 == 0) {
            throw new IllegalStateException();
        }
        if (this.l1 != z2) {
            this.l1 = z2;
            u();
        }
        this.I0.b(this.B0);
        this.U0 = z;
        this.V0 = false;
    }

    @Override // yads.nl1
    public final va0 a(ox0 ox0Var) {
        va0 a = super.a(ox0Var);
        this.I0.a(ox0Var.b, a);
        return a;
    }

    @Override // yads.nl1
    public final void a(nx0 nx0Var, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        el1 el1Var = this.K;
        if (el1Var != null) {
            el1Var.setVideoScalingMode(this.S0);
        }
        if (this.l1) {
            this.g1 = nx0Var.r;
            this.h1 = nx0Var.s;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.g1 = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.h1 = integer2;
        }
        float f = nx0Var.v;
        this.j1 = f;
        if (mc3.a >= 21) {
            int i = nx0Var.u;
            if (i == 90 || i == 270) {
                int i2 = this.g1;
                this.g1 = this.h1;
                this.h1 = i2;
                this.j1 = 1.0f / f;
            }
        } else {
            this.i1 = nx0Var.u;
        }
        yi3 yi3Var = this.H0;
        yi3Var.f = nx0Var.t;
        lv0 lv0Var = yi3Var.a;
        kv0 kv0Var = lv0Var.a;
        kv0Var.d = 0L;
        kv0Var.e = 0L;
        kv0Var.f = 0L;
        kv0Var.h = 0;
        Arrays.fill(kv0Var.g, false);
        kv0 kv0Var2 = lv0Var.b;
        kv0Var2.d = 0L;
        kv0Var2.e = 0L;
        kv0Var2.f = 0L;
        kv0Var2.h = 0;
        Arrays.fill(kv0Var2.g, false);
        lv0Var.c = false;
        lv0Var.d = C.TIME_UNSET;
        lv0Var.e = 0;
        yi3Var.b();
    }

    @Override // yads.nl1, yads.ro
    public final void a(long j, boolean z) {
        super.a(j, z);
        z();
        yi3 yi3Var = this.H0;
        yi3Var.m = 0L;
        yi3Var.p = -1L;
        yi3Var.n = -1L;
        long j2 = C.TIME_UNSET;
        this.c1 = C.TIME_UNSET;
        this.W0 = C.TIME_UNSET;
        this.a1 = 0;
        if (z) {
            if (this.J0 > 0) {
                j2 = SystemClock.elapsedRealtime() + this.J0;
            }
            this.X0 = j2;
            return;
        }
        this.X0 = C.TIME_UNSET;
    }

    @Override // yads.nl1
    public final void a(long j) {
        super.a(j);
        if (this.l1) {
            return;
        }
        this.b1--;
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x0074, code lost:
    
        if (r8.g[(int) ((r13 - 1) % 15)] == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x030a  */
    @Override // yads.nl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j, long j2, el1 el1Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, nx0 nx0Var) {
        long j4;
        long j5;
        int i4;
        int i5;
        boolean z3;
        long j6;
        long j7;
        boolean z4;
        long j8;
        el1Var.getClass();
        if (this.W0 == C.TIME_UNSET) {
            this.W0 = j;
        }
        if (j3 != this.c1) {
            yi3 yi3Var = this.H0;
            j5 = -1;
            long j9 = yi3Var.n;
            if (j9 != -1) {
                yi3Var.p = j9;
                yi3Var.q = yi3Var.o;
            }
            yi3Var.m++;
            lv0 lv0Var = yi3Var.a;
            long j10 = j3 * 1000;
            j4 = 1000;
            lv0Var.a.a(j10);
            if (lv0Var.a.a()) {
                lv0Var.c = false;
            } else if (lv0Var.d != C.TIME_UNSET) {
                if (lv0Var.c) {
                    kv0 kv0Var = lv0Var.b;
                    j8 = 0;
                    long j11 = kv0Var.d;
                    if (j11 != 0) {
                    }
                    lv0Var.c = true;
                    lv0Var.b.a(j10);
                } else {
                    j8 = 0;
                }
                kv0 kv0Var2 = lv0Var.b;
                long j12 = j8;
                kv0Var2.d = j12;
                kv0Var2.e = j12;
                kv0Var2.f = j12;
                kv0Var2.h = 0;
                Arrays.fill(kv0Var2.g, false);
                lv0Var.b.a(lv0Var.d);
                lv0Var.c = true;
                lv0Var.b.a(j10);
            }
            if (lv0Var.c && lv0Var.b.a()) {
                kv0 kv0Var3 = lv0Var.a;
                lv0Var.a = lv0Var.b;
                lv0Var.b = kv0Var3;
                lv0Var.c = false;
            }
            lv0Var.d = j10;
            lv0Var.e = lv0Var.a.a() ? 0 : lv0Var.e + 1;
            yi3Var.b();
            this.c1 = j3;
        } else {
            j4 = 1000;
            j5 = -1;
        }
        long j13 = this.D0;
        long j14 = j3 - j13;
        if (z && !z2) {
            h83.a("skipVideoBuffer");
            el1Var.a(false, i);
            h83.a();
            this.B0.f++;
            return true;
        }
        double d = this.I;
        boolean z5 = this.g == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * j4;
        long j15 = (long) ((j3 - j) / d);
        if (z5) {
            j15 -= elapsedRealtime - j2;
        }
        if (this.P0 == this.Q0) {
            if (j15 >= -30000) {
                return false;
            }
            h83.a("skipVideoBuffer");
            el1Var.a(false, i);
            h83.a();
            this.B0.f++;
            c(j15);
            return true;
        }
        long j16 = elapsedRealtime - this.d1;
        boolean z6 = this.V0 ? !this.T0 : z5 || this.U0;
        if (this.X0 == C.TIME_UNSET && j >= j13 && (z6 || (z5 && j15 < -30000 && j16 > 100000))) {
            long nanoTime = System.nanoTime();
            ri3 ri3Var = this.o1;
            if (ri3Var != null) {
                ri3Var.a(j14, nanoTime, nx0Var, this.M);
            }
            if (mc3.a >= 21) {
                D();
                h83.a("releaseOutputBuffer");
                el1Var.a(i, nanoTime);
                h83.a();
                this.d1 = SystemClock.elapsedRealtime() * j4;
                z4 = true;
                this.B0.e++;
                this.a1 = 0;
                this.V0 = true;
                if (!this.T0) {
                    this.T0 = true;
                    this.I0.a(this.P0);
                    this.R0 = true;
                }
            } else {
                z4 = true;
                D();
                h83.a("releaseOutputBuffer");
                el1Var.a(true, i);
                h83.a();
                this.d1 = SystemClock.elapsedRealtime() * j4;
                this.B0.e++;
                this.a1 = 0;
                this.V0 = true;
                if (!this.T0) {
                    this.T0 = true;
                    this.I0.a(this.P0);
                    this.R0 = true;
                }
            }
            c(j15);
            return z4;
        }
        if (!z5 || j == this.W0) {
            return false;
        }
        long nanoTime2 = System.nanoTime();
        long j17 = (j15 * j4) + nanoTime2;
        yi3 yi3Var2 = this.H0;
        if (yi3Var2.p != j5 && yi3Var2.a.a.a()) {
            lv0 lv0Var2 = yi3Var2.a;
            if (lv0Var2.a.a()) {
                kv0 kv0Var4 = lv0Var2.a;
                long j18 = kv0Var4.e;
                j7 = j18 == 0 ? 0L : kv0Var4.f / j18;
            } else {
                j7 = -9223372036854775807L;
            }
            long j19 = yi3Var2.q + ((long) (((yi3Var2.m - yi3Var2.p) * j7) / yi3Var2.i));
            if (Math.abs(j17 - j19) <= 20000000) {
                j17 = j19;
            } else {
                yi3Var2.m = 0L;
                long j20 = j5;
                yi3Var2.p = j20;
                yi3Var2.n = j20;
            }
        }
        yi3Var2.n = yi3Var2.m;
        yi3Var2.o = j17;
        xi3 xi3Var = yi3Var2.c;
        if (xi3Var != null && yi3Var2.k != C.TIME_UNSET) {
            long j21 = xi3Var.b;
            if (j21 != C.TIME_UNSET) {
                long j22 = yi3Var2.k;
                long j23 = (((j17 - j21) / j22) * j22) + j21;
                if (j17 <= j23) {
                    j6 = j23 - j22;
                } else {
                    j6 = j23;
                    j23 += j22;
                }
                if (j23 - j17 >= j17 - j6) {
                    j23 = j6;
                }
                j17 = j23 - yi3Var2.l;
            }
        }
        long j24 = j17;
        long j25 = (j24 - nanoTime2) / j4;
        boolean z7 = this.X0 != C.TIME_UNSET;
        if (j25 < -500000 && !z2) {
            ot2 ot2Var = this.h;
            ot2Var.getClass();
            int a = ot2Var.a(j - this.j);
            if (a != 0) {
                if (z7) {
                    pa0 pa0Var = this.B0;
                    pa0Var.d += a;
                    pa0Var.f += this.b1;
                } else {
                    pa0 pa0Var2 = this.B0;
                    pa0Var2.j++;
                    int i6 = this.b1;
                    pa0Var2.h += a;
                    int i7 = a + i6;
                    pa0Var2.g += i7;
                    this.Z0 += i7;
                    int i8 = this.a1 + i7;
                    this.a1 = i8;
                    pa0Var2.i = Math.max(i8, pa0Var2.i);
                    int i9 = this.K0;
                    if (i9 > 0 && (i5 = this.Z0) >= i9 && i5 > 0) {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        this.I0.a(this.Z0, elapsedRealtime2 - this.Y0);
                        z3 = false;
                        this.Z0 = 0;
                        this.Y0 = elapsedRealtime2;
                        if (p()) {
                            r();
                        }
                        return z3;
                    }
                }
                z3 = false;
                if (p()) {
                }
                return z3;
            }
        }
        if (j25 < -30000 && !z2) {
            if (z7) {
                h83.a("skipVideoBuffer");
                el1Var.a(false, i);
                h83.a();
                this.B0.f++;
            } else {
                h83.a("dropVideoBuffer");
                el1Var.a(false, i);
                h83.a();
                pa0 pa0Var3 = this.B0;
                pa0Var3.h = pa0Var3.h;
                pa0Var3.g++;
                this.Z0++;
                int i10 = this.a1 + 1;
                this.a1 = i10;
                pa0Var3.i = Math.max(i10, pa0Var3.i);
                int i11 = this.K0;
                if (i11 > 0 && (i4 = this.Z0) >= i11 && i4 > 0) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    this.I0.a(this.Z0, elapsedRealtime3 - this.Y0);
                    this.Z0 = 0;
                    this.Y0 = elapsedRealtime3;
                }
            }
            c(j25);
            return true;
        }
        if (mc3.a >= 21) {
            if (j25 < 50000) {
                ri3 ri3Var2 = this.o1;
                if (ri3Var2 != null) {
                    ri3Var2.a(j14, j24, nx0Var, this.M);
                }
                D();
                h83.a("releaseOutputBuffer");
                el1Var.a(i, j24);
                h83.a();
                this.d1 = SystemClock.elapsedRealtime() * j4;
                this.B0.e++;
                this.a1 = 0;
                this.V0 = true;
                if (!this.T0) {
                    this.T0 = true;
                    this.I0.a(this.P0);
                    this.R0 = true;
                }
                c(j25);
                return true;
            }
        } else if (j25 < ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
            if (j25 > SignalingTransport.SERVER_PING_TIMEOUT_MIN) {
                try {
                    Thread.sleep((j25 - 10000) / j4);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            ri3 ri3Var3 = this.o1;
            if (ri3Var3 != null) {
                ri3Var3.a(j14, j24, nx0Var, this.M);
            }
            D();
            h83.a("releaseOutputBuffer");
            el1Var.a(true, i);
            h83.a();
            this.d1 = SystemClock.elapsedRealtime() * j4;
            this.B0.e++;
            this.a1 = 0;
            this.V0 = true;
            if (!this.T0) {
                this.T0 = true;
                this.I0.a(this.P0);
                this.R0 = true;
            }
            c(j25);
            return true;
        }
        return false;
    }

    @Override // yads.nl1, yads.ro
    public final void a(float f, float f2) {
        this.I = f;
        this.J = f2;
        c(this.L);
        yi3 yi3Var = this.H0;
        yi3Var.i = f;
        yi3Var.m = 0L;
        yi3Var.p = -1L;
        yi3Var.n = -1L;
        yi3Var.a(false);
    }

    @Override // yads.nl1
    public final boolean a(jl1 jl1Var) {
        return this.P0 != null || b(jl1Var);
    }

    @Override // yads.nl1
    public final int a(pl1 pl1Var, nx0 nx0Var) {
        boolean z;
        int i = 0;
        if (!"video".equals(iu1.c(nx0Var.m))) {
            return ro.a(0, 0, 0);
        }
        boolean z2 = nx0Var.p != null;
        s51 a = a(pl1Var, nx0Var, z2, false);
        if (z2 && a.isEmpty()) {
            a = a(pl1Var, nx0Var, false, false);
        }
        if (a.isEmpty()) {
            return ro.a(1, 0, 0);
        }
        int i2 = nx0Var.F;
        if (i2 != 0 && i2 != 2) {
            return ro.a(2, 0, 0);
        }
        jl1 jl1Var = (jl1) a.get(0);
        boolean a2 = jl1Var.a(nx0Var);
        if (!a2) {
            for (int i3 = 1; i3 < a.size(); i3++) {
                jl1 jl1Var2 = (jl1) a.get(i3);
                if (jl1Var2.a(nx0Var)) {
                    z = false;
                    a2 = true;
                    jl1Var = jl1Var2;
                    break;
                }
            }
        }
        z = true;
        int i4 = a2 ? 4 : 3;
        int i5 = jl1Var.b(nx0Var) ? 16 : 8;
        int i6 = jl1Var.g ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (a2) {
            s51 a3 = a(pl1Var, nx0Var, z2, true);
            if (!a3.isEmpty()) {
                jl1 jl1Var3 = (jl1) xl1.a(a3, nx0Var).get(0);
                if (jl1Var3.a(nx0Var) && jl1Var3.b(nx0Var)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // yads.nl1
    public final il1 a(IllegalStateException illegalStateException, jl1 jl1Var) {
        return new zl1(illegalStateException, jl1Var, this.P0);
    }
}
