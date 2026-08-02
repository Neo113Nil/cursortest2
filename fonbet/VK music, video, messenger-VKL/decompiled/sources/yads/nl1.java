package yads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* loaded from: classes10.dex */
public abstract class nl1 extends ro {
    public static final byte[] F0 = {0, 0, 1, 103, 66, -64, AmfConstants.TYPE_DATE_MARKER, -38, 37, -112, 0, 0, 1, 104, -50, AmfConstants.TYPE_XML_DOCUMENT_MARKER, 19, 32, 0, 0, 1, 101, -120, -124, AmfConstants.TYPE_UNSUPPORTED_MARKER, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final long[] A;
    public qn0 A0;
    public nx0 B;
    public pa0 B0;
    public nx0 C;
    public long C0;
    public nk0 D;
    public long D0;
    public nk0 E;
    public int E0;
    public MediaCrypto F;
    public boolean G;
    public final long H;
    public float I;
    public float J;
    public el1 K;
    public nx0 L;
    public MediaFormat M;
    public boolean N;
    public float O;
    public ArrayDeque P;
    public ml1 Q;
    public jl1 R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public ir d0;
    public long e0;
    public int f0;
    public int g0;
    public ByteBuffer h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final cl1 n;
    public boolean n0;
    public final pl1 o;
    public int o0;
    public final boolean p;
    public int p0;
    public final float q;
    public int q0;
    public final sa0 r;
    public boolean r0;
    public final sa0 s;
    public boolean s0;
    public final sa0 t;
    public boolean t0;
    public final yo u;
    public long u0;
    public final r73 v;
    public long v0;
    public final ArrayList w;
    public boolean w0;
    public final MediaCodec.BufferInfo x;
    public boolean x0;
    public final long[] y;
    public boolean y0;
    public final long[] z;
    public boolean z0;

    public nl1(int i, ee0 ee0Var, pl1 pl1Var, boolean z, float f) {
        super(i);
        this.n = ee0Var;
        this.o = (pl1) ni.a(pl1Var);
        this.p = z;
        this.q = f;
        this.r = sa0.d();
        this.s = new sa0(0);
        this.t = new sa0(2);
        yo yoVar = new yo();
        this.u = yoVar;
        this.v = new r73();
        this.w = new ArrayList();
        this.x = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = C.TIME_UNSET;
        this.y = new long[10];
        this.z = new long[10];
        this.A = new long[10];
        this.C0 = C.TIME_UNSET;
        this.D0 = C.TIME_UNSET;
        yoVar.c(0);
        yoVar.d.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.o0 = 0;
        this.f0 = -1;
        this.g0 = -1;
        this.e0 = C.TIME_UNSET;
        this.u0 = C.TIME_UNSET;
        this.v0 = C.TIME_UNSET;
        this.p0 = 0;
        this.q0 = 0;
    }

    public abstract float a(float f, nx0[] nx0VarArr);

    public abstract int a(pl1 pl1Var, nx0 nx0Var);

    public abstract ArrayList a(pl1 pl1Var, nx0 nx0Var, boolean z);

    public abstract bl1 a(jl1 jl1Var, nx0 nx0Var, MediaCrypto mediaCrypto, float f);

    public abstract va0 a(jl1 jl1Var, nx0 nx0Var, nx0 nx0Var2);

    public abstract void a(Exception exc);

    public abstract void a(String str);

    public abstract void a(String str, long j, long j2);

    public abstract void a(nx0 nx0Var, MediaFormat mediaFormat);

    public void a(sa0 sa0Var) {
    }

    public abstract boolean a(long j, long j2, el1 el1Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, nx0 nx0Var);

    public abstract void b(sa0 sa0Var);

    public boolean b(nx0 nx0Var) {
        return false;
    }

    public final boolean c(long j, long j2) {
        boolean z;
        boolean a;
        el1 el1Var;
        ByteBuffer byteBuffer;
        int i;
        MediaCodec.BufferInfo bufferInfo;
        int a2;
        boolean z2;
        if (this.g0 < 0) {
            if (this.X && this.s0) {
                try {
                    a2 = this.K.a(this.x);
                } catch (IllegalStateException unused) {
                    t();
                    if (this.x0) {
                        u();
                    }
                    return false;
                }
            } else {
                a2 = this.K.a(this.x);
            }
            if (a2 < 0) {
                if (a2 != -2) {
                    if (this.c0 && (this.w0 || this.p0 == 2)) {
                        t();
                    }
                    return false;
                }
                this.t0 = true;
                MediaFormat a3 = this.K.a();
                if (this.S != 0 && a3.getInteger("width") == 32 && a3.getInteger("height") == 32) {
                    this.b0 = true;
                } else {
                    if (this.Z) {
                        a3.setInteger("channel-count", 1);
                    }
                    this.M = a3;
                    this.N = true;
                }
                return true;
            }
            if (this.b0) {
                this.b0 = false;
                this.K.a(false, a2);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.x;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                t();
                return false;
            }
            this.g0 = a2;
            ByteBuffer b = this.K.b(a2);
            this.h0 = b;
            if (b != null) {
                b.position(this.x.offset);
                ByteBuffer byteBuffer2 = this.h0;
                MediaCodec.BufferInfo bufferInfo3 = this.x;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.Y) {
                MediaCodec.BufferInfo bufferInfo4 = this.x;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                    long j3 = this.u0;
                    if (j3 != C.TIME_UNSET) {
                        bufferInfo4.presentationTimeUs = j3;
                    }
                }
            }
            long j4 = this.x.presentationTimeUs;
            int size = this.w.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z2 = false;
                    break;
                }
                if (((Long) this.w.get(i2)).longValue() == j4) {
                    this.w.remove(i2);
                    z2 = true;
                    break;
                }
                i2++;
            }
            this.i0 = z2;
            long j5 = this.v0;
            long j6 = this.x.presentationTimeUs;
            this.j0 = j5 == j6;
            b(j6);
        }
        if (this.X && this.s0) {
            try {
                el1Var = this.K;
                byteBuffer = this.h0;
                i = this.g0;
                bufferInfo = this.x;
                z = false;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                a = a(j, j2, el1Var, byteBuffer, i, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.i0, this.j0, this.C);
            } catch (IllegalStateException unused3) {
                t();
                if (this.x0) {
                    u();
                }
                return z;
            }
        } else {
            z = false;
            el1 el1Var2 = this.K;
            ByteBuffer byteBuffer3 = this.h0;
            int i3 = this.g0;
            MediaCodec.BufferInfo bufferInfo5 = this.x;
            a = a(j, j2, el1Var2, byteBuffer3, i3, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.i0, this.j0, this.C);
        }
        if (a) {
            a(this.x.presentationTimeUs);
            boolean z3 = (this.x.flags & 4) != 0 ? true : z;
            this.g0 = -1;
            this.h0 = null;
            if (!z3) {
                return true;
            }
            t();
        }
        return z;
    }

    @Override // yads.ro
    public boolean f() {
        return this.x0;
    }

    @Override // yads.ro
    public boolean g() {
        boolean isReady;
        if (this.B == null) {
            return false;
        }
        if (e()) {
            isReady = this.l;
        } else {
            ot2 ot2Var = this.h;
            ot2Var.getClass();
            isReady = ot2Var.isReady();
        }
        if (isReady || this.g0 >= 0) {
            return true;
        }
        return this.e0 != C.TIME_UNSET && SystemClock.elapsedRealtime() < this.e0;
    }

    @Override // yads.ro
    public final int l() {
        return 8;
    }

    public final boolean m() {
        if (this.r0) {
            this.p0 = 1;
            if (this.U || this.W) {
                this.q0 = 3;
                return false;
            }
            this.q0 = 2;
        } else {
            y();
        }
        return true;
    }

    public final boolean n() {
        boolean z;
        long j;
        int i;
        int i2;
        el1 el1Var = this.K;
        if (el1Var == null || this.p0 == 2 || this.w0) {
            return false;
        }
        if (this.f0 < 0) {
            int b = el1Var.b();
            this.f0 = b;
            if (b < 0) {
                return false;
            }
            this.s.d = this.K.a(b);
            this.s.b();
        }
        if (this.p0 == 1) {
            if (!this.c0) {
                this.s0 = true;
                this.K.a(this.f0, 0, 0L, 4);
                this.f0 = -1;
                this.s.d = null;
            }
            this.p0 = 2;
            return false;
        }
        if (this.a0) {
            this.a0 = false;
            this.s.d.put(F0);
            this.K.a(this.f0, 38, 0L, 0);
            this.f0 = -1;
            this.s.d = null;
            this.r0 = true;
            return true;
        }
        if (this.o0 == 1) {
            for (int i3 = 0; i3 < this.L.o.size(); i3++) {
                this.s.d.put((byte[]) this.L.o.get(i3));
            }
            this.o0 = 2;
        }
        int position = this.s.d.position();
        ox0 ox0Var = this.c;
        ox0Var.a = null;
        ox0Var.b = null;
        try {
            int a = a(ox0Var, this.s, 0);
            if (e()) {
                this.v0 = this.u0;
            }
            if (a == -3) {
                return false;
            }
            if (a == -5) {
                if (this.o0 == 2) {
                    this.s.b();
                    this.o0 = 1;
                }
                a(ox0Var);
                return true;
            }
            if (this.s.b(4)) {
                if (this.o0 == 2) {
                    this.s.b();
                    this.o0 = 1;
                }
                this.w0 = true;
                if (!this.r0) {
                    t();
                    return false;
                }
                try {
                    if (!this.c0) {
                        this.s0 = true;
                        this.K.a(this.f0, 0, 0L, 4);
                        this.f0 = -1;
                        this.s.d = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    nx0 nx0Var = this.B;
                    int errorCode = e.getErrorCode();
                    int i4 = mc3.a;
                    if (errorCode != 2 && errorCode != 4) {
                        if (errorCode != 10) {
                            if (errorCode != 7) {
                                if (errorCode != 8) {
                                    switch (errorCode) {
                                        case 15:
                                            break;
                                        case 16:
                                        case 18:
                                            break;
                                        case 17:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                            break;
                                        default:
                                            switch (errorCode) {
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                    i2 = AuthCode.StatusCode.AUTH_INFO_NOT_EXIST;
                                                    break;
                                                default:
                                                    i2 = AuthCode.StatusCode.PERMISSION_EXPIRED;
                                                    break;
                                            }
                                    }
                                    throw a(i2, nx0Var, (Exception) e, false);
                                }
                                i2 = AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
                                throw a(i2, nx0Var, (Exception) e, false);
                            }
                        }
                        i2 = AuthCode.StatusCode.PERMISSION_NOT_EXIST;
                        throw a(i2, nx0Var, (Exception) e, false);
                    }
                    i2 = AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
                    throw a(i2, nx0Var, (Exception) e, false);
                }
            }
            if (!this.r0 && !this.s.b(1)) {
                this.s.b();
                if (this.o0 == 2) {
                    this.o0 = 1;
                }
                return true;
            }
            boolean b2 = this.s.b(1073741824);
            if (b2) {
                m20 m20Var = this.s.c;
                if (position == 0) {
                    m20Var.getClass();
                } else {
                    if (m20Var.d == null) {
                        int[] iArr = new int[1];
                        m20Var.d = iArr;
                        m20Var.i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = m20Var.d;
                    iArr2[0] = iArr2[0] + position;
                }
            }
            if (this.T && !b2) {
                ByteBuffer byteBuffer = this.s.d;
                int position2 = byteBuffer.position();
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int i7 = i5 + 1;
                    if (i7 >= position2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i8 = byteBuffer.get(i5) & 255;
                    if (i6 == 3) {
                        if (i8 == 1 && (byteBuffer.get(i7) & 31) == 7) {
                            ByteBuffer duplicate = byteBuffer.duplicate();
                            duplicate.position(i5 - 3);
                            duplicate.limit(position2);
                            byteBuffer.position(0);
                            byteBuffer.put(duplicate);
                            break;
                        }
                    } else if (i8 == 0) {
                        i6++;
                    }
                    if (i8 != 0) {
                        i6 = 0;
                    }
                    i5 = i7;
                }
                if (this.s.d.position() == 0) {
                    return true;
                }
                this.T = false;
            }
            sa0 sa0Var = this.s;
            long j2 = sa0Var.f;
            ir irVar = this.d0;
            if (irVar != null) {
                nx0 nx0Var2 = this.B;
                if (irVar.b == 0) {
                    irVar.a = j2;
                }
                if (!irVar.c) {
                    ByteBuffer byteBuffer2 = sa0Var.d;
                    byteBuffer2.getClass();
                    int i9 = 0;
                    for (int i10 = 0; i10 < 4; i10++) {
                        i9 = (i9 << 8) | (byteBuffer2.get(i10) & 255);
                    }
                    int b3 = qw1.b(i9);
                    if (b3 == -1) {
                        irVar.c = true;
                        irVar.b = 0L;
                        irVar.a = sa0Var.f;
                        ji1.d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                        j2 = sa0Var.f;
                    } else {
                        z = b2;
                        long max = Math.max(0L, ((irVar.b - 529) * 1000000) / nx0Var2.A) + irVar.a;
                        irVar.b += b3;
                        j2 = max;
                        long j3 = this.u0;
                        ir irVar2 = this.d0;
                        nx0 nx0Var3 = this.B;
                        irVar2.getClass();
                        this.u0 = Math.max(j3, Math.max(0L, ((irVar2.b - 529) * 1000000) / nx0Var3.A) + irVar2.a);
                        j = j2;
                    }
                }
                z = b2;
                long j32 = this.u0;
                ir irVar22 = this.d0;
                nx0 nx0Var32 = this.B;
                irVar22.getClass();
                this.u0 = Math.max(j32, Math.max(0L, ((irVar22.b - 529) * 1000000) / nx0Var32.A) + irVar22.a);
                j = j2;
            } else {
                z = b2;
                j = j2;
            }
            if (this.s.b(Integer.MIN_VALUE)) {
                this.w.add(Long.valueOf(j));
            }
            if (this.y0) {
                this.v.a(this.B, j);
                this.y0 = false;
            }
            this.u0 = Math.max(this.u0, j);
            this.s.c();
            if (this.s.b(268435456)) {
                a(this.s);
            }
            b(this.s);
            try {
                if (z) {
                    this.K.a(this.f0, this.s.c, j);
                } else {
                    this.K.a(this.f0, this.s.d.limit(), j, 0);
                }
                this.f0 = -1;
                this.s.d = null;
                this.r0 = true;
                this.o0 = 0;
                this.B0.c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                nx0 nx0Var4 = this.B;
                int errorCode2 = e2.getErrorCode();
                int i11 = mc3.a;
                if (errorCode2 != 2 && errorCode2 != 4) {
                    if (errorCode2 != 10) {
                        if (errorCode2 != 7) {
                            if (errorCode2 != 8) {
                                switch (errorCode2) {
                                    case 15:
                                        break;
                                    case 16:
                                    case 18:
                                        break;
                                    case 17:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                        break;
                                    default:
                                        switch (errorCode2) {
                                            case 24:
                                            case 25:
                                            case 26:
                                            case 27:
                                            case 28:
                                                i = AuthCode.StatusCode.AUTH_INFO_NOT_EXIST;
                                                break;
                                            default:
                                                i = AuthCode.StatusCode.PERMISSION_EXPIRED;
                                                break;
                                        }
                                }
                                throw a(i, nx0Var4, (Exception) e2, false);
                            }
                            i = AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
                            throw a(i, nx0Var4, (Exception) e2, false);
                        }
                    }
                    i = AuthCode.StatusCode.PERMISSION_NOT_EXIST;
                    throw a(i, nx0Var4, (Exception) e2, false);
                }
                i = AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
                throw a(i, nx0Var4, (Exception) e2, false);
            }
        } catch (ra0 e3) {
            a(e3);
            c(0);
            o();
            return true;
        }
    }

    public final void o() {
        try {
            this.K.flush();
        } finally {
            w();
        }
    }

    public final boolean p() {
        if (this.K == null) {
            return false;
        }
        int i = this.q0;
        if (i == 3 || this.U || ((this.V && !this.t0) || (this.W && this.s0))) {
            u();
            return true;
        }
        if (i == 2) {
            int i2 = mc3.a;
            if (i2 < 23) {
                throw new IllegalStateException();
            }
            if (i2 >= 23) {
                try {
                    y();
                } catch (qn0 e) {
                    ji1.d("MediaCodecRenderer", ji1.a("Failed to update the DRM session, releasing the codec instead.", e));
                    u();
                    return true;
                }
            }
        }
        o();
        return false;
    }

    public boolean q() {
        return false;
    }

    public final void r() {
        nx0 nx0Var;
        if (this.K != null || this.k0 || (nx0Var = this.B) == null) {
            return;
        }
        if (this.E == null && b(nx0Var)) {
            nx0 nx0Var2 = this.B;
            this.m0 = false;
            this.u.b();
            this.t.b();
            this.l0 = false;
            this.k0 = false;
            String str = nx0Var2.m;
            if ("audio/mp4a-latm".equals(str) || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
                this.u.l = 32;
            } else {
                this.u.l = 1;
            }
            this.k0 = true;
            return;
        }
        nk0 nk0Var = this.E;
        nk0.a(this.D, nk0Var);
        this.D = nk0Var;
        String str2 = this.B.m;
        if (nk0Var != null) {
            if (this.F == null) {
                vx0 a = a(nk0Var);
                if (a != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(a.a, a.b);
                        this.F = mediaCrypto;
                        this.G = !a.c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e) {
                        throw a(AuthCode.StatusCode.PERMISSION_EXPIRED, this.B, e, false);
                    }
                } else if (this.D.c() == null) {
                    return;
                }
            }
            if (vx0.d) {
                int state = this.D.getState();
                if (state == 1) {
                    mk0 c = this.D.c();
                    c.getClass();
                    throw a(c.b, this.B, (Exception) c, false);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            a(this.F, this.G);
        } catch (ml1 e2) {
            throw a(4001, this.B, e2, false);
        }
    }

    public abstract void s();

    public final void t() {
        int i = this.q0;
        if (i == 1) {
            o();
            return;
        }
        if (i == 2) {
            o();
            y();
        } else if (i != 3) {
            this.x0 = true;
            v();
        } else {
            u();
            r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        try {
            el1 el1Var = this.K;
            if (el1Var != null) {
                el1Var.release();
                this.B0.b++;
                a(this.R.a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void w() {
        this.f0 = -1;
        this.s.d = null;
        this.g0 = -1;
        this.h0 = null;
        this.e0 = C.TIME_UNSET;
        this.s0 = false;
        this.r0 = false;
        this.a0 = false;
        this.b0 = false;
        this.i0 = false;
        this.j0 = false;
        this.w.clear();
        this.u0 = C.TIME_UNSET;
        this.v0 = C.TIME_UNSET;
        ir irVar = this.d0;
        if (irVar != null) {
            irVar.a = 0L;
            irVar.b = 0L;
            irVar.c = false;
        }
        this.p0 = 0;
        this.q0 = 0;
        this.o0 = this.n0 ? 1 : 0;
    }

    public final void x() {
        w();
        this.A0 = null;
        this.d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.c0 = false;
        this.n0 = false;
        this.o0 = 0;
        this.G = false;
    }

    public final void y() {
        try {
            this.F.setMediaDrmSession(a(this.E).b);
            nk0 nk0Var = this.E;
            nk0.a(this.D, nk0Var);
            this.D = nk0Var;
            this.p0 = 0;
            this.q0 = 0;
        } catch (MediaCryptoException e) {
            throw a(AuthCode.StatusCode.PERMISSION_EXPIRED, this.B, (Exception) e, false);
        }
    }

    public boolean a(jl1 jl1Var) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public final boolean b(long j, long j2) {
        ?? r15;
        if (this.x0) {
            throw new IllegalStateException();
        }
        yo yoVar = this.u;
        int i = yoVar.k;
        if (i > 0) {
            r15 = 0;
            if (!a(j, j2, null, yoVar.d, this.g0, 0, i, yoVar.f, yoVar.b(Integer.MIN_VALUE), this.u.b(4), this.C)) {
                return false;
            }
            a(this.u.j);
            this.u.b();
        } else {
            r15 = 0;
        }
        if (this.w0) {
            this.x0 = true;
            return r15;
        }
        if (this.l0) {
            if (!this.u.a(this.t)) {
                throw new IllegalStateException();
            }
            this.l0 = r15;
        }
        if (this.m0) {
            yo yoVar2 = this.u;
            if (yoVar2.k > 0) {
                return true;
            }
            this.m0 = r15;
            yoVar2.b();
            this.t.b();
            this.l0 = r15;
            this.k0 = r15;
            this.m0 = r15;
            r();
            if (!this.k0) {
                return r15;
            }
        }
        if (this.w0) {
            throw new IllegalStateException();
        }
        ox0 ox0Var = this.c;
        ox0Var.a = null;
        ox0Var.b = null;
        this.t.b();
        while (true) {
            this.t.b();
            int a = a(ox0Var, this.t, (int) r15);
            if (a == -5) {
                a(ox0Var);
                break;
            }
            if (a != -4) {
                if (a != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (this.t.b(4)) {
                    this.w0 = true;
                    break;
                }
                if (this.y0) {
                    nx0 nx0Var = this.B;
                    nx0Var.getClass();
                    this.C = nx0Var;
                    a(nx0Var, (MediaFormat) null);
                    this.y0 = r15;
                }
                this.t.c();
                if (!this.u.a(this.t)) {
                    this.l0 = true;
                    break;
                }
            }
        }
        yo yoVar3 = this.u;
        if (yoVar3.k > 0) {
            yoVar3.c();
        }
        if (this.u.k > 0 || this.w0 || this.m0) {
            return true;
        }
        return r15;
    }

    public final vx0 a(nk0 nk0Var) {
        k20 d = nk0Var.d();
        if (d != null && !(d instanceof vx0)) {
            throw a(AuthCode.StatusCode.WAITING_CONNECT, this.B, (Exception) new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + d), false);
        }
        return (vx0) d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0265, code lost:
    
        if (r2.B().equals(r6) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x018b, code lost:
    
        if (r6.L().equals(r13) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x019f, code lost:
    
        if (r6.z().equals(r3) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0124, code lost:
    
        if (r16.v().equals(r3) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0148, code lost:
    
        if (r16.p().equals(r3) != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(jl1 jl1Var, MediaCrypto mediaCrypto) {
        float a;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        ol1 ol1Var;
        boolean z4;
        String str = jl1Var.a;
        int i2 = mc3.a;
        if (i2 < 23) {
            a = -1.0f;
        } else {
            float f = this.J;
            nx0[] nx0VarArr = this.i;
            nx0VarArr.getClass();
            a = a(f, nx0VarArr);
        }
        float f2 = a > this.q ? a : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bl1 a2 = a(jl1Var, this.B, mediaCrypto, f2);
        if (i2 >= 31) {
            zf2 zf2Var = this.f;
            zf2Var.getClass();
            ll1.a(a2, zf2Var);
        }
        try {
            h83.a("createCodec:" + str);
            this.K = this.n.a(a2);
            h83.a();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.R = jl1Var;
            this.O = f2;
            this.L = this.B;
            if (i2 <= 25) {
                ol1 ol1Var2 = ql2.b;
                if (ol1Var2.p().equals(str)) {
                    String str2 = mc3.d;
                    if (str2.startsWith(ol1Var2.J()) || str2.startsWith(ol1Var2.F()) || str2.startsWith(ol1Var2.G()) || str2.startsWith(ol1Var2.I())) {
                        i = 2;
                        this.S = i;
                        this.T = i2 >= 21 && this.L.o.isEmpty() && ql2.b.r().equals(str);
                        if (i2 >= 18) {
                            if (i2 == 18) {
                                ol1 ol1Var3 = ql2.b;
                                if (!ol1Var3.u().equals(str)) {
                                }
                            }
                            if (i2 == 19) {
                                String str3 = mc3.d;
                                ol1 ol1Var4 = ql2.b;
                                if (str3.startsWith(ol1Var4.H())) {
                                    if (!ol1Var4.o().equals(str)) {
                                    }
                                }
                            }
                            z = false;
                            this.U = z;
                            this.V = i2 != 29 && ql2.b.d().equals(str);
                            if (i2 <= 23 || !ql2.b.D().equals(str)) {
                                if (i2 <= 19) {
                                    ol1 ol1Var5 = ql2.b;
                                    String l = ol1Var5.l();
                                    String str4 = mc3.b;
                                    if (!l.equals(str4)) {
                                    }
                                    if (!ol1Var5.y().equals(str)) {
                                    }
                                }
                                z2 = false;
                                this.W = z2;
                                this.X = i2 != 21 && ql2.b.C().equals(str);
                                if (i2 < 21) {
                                    ol1 ol1Var6 = ql2.b;
                                    if (ol1Var6.w().equals(str) && ol1Var6.K().equals(mc3.c)) {
                                        String str5 = mc3.b;
                                        if (str5.startsWith(ol1Var6.c()) || str5.startsWith(ol1Var6.j()) || str5.startsWith(ol1Var6.h()) || str5.startsWith(ol1Var6.i()) || str5.startsWith(ol1Var6.m()) || str5.startsWith(ol1Var6.n())) {
                                            z3 = true;
                                            this.Y = z3;
                                            this.Z = i2 > 18 && this.L.z == 1 && ql2.b.q().equals(str);
                                            String str6 = jl1Var.a;
                                            if ((i2 <= 25 || !ql2.b.E().equals(str6)) && (i2 > 17 || !ql2.b.x().equals(str6))) {
                                                if (i2 <= 29) {
                                                    ol1 ol1Var7 = ql2.b;
                                                    if (!ol1Var7.A().equals(str6)) {
                                                    }
                                                }
                                                ol1Var = ql2.b;
                                                if ((ol1Var.b().equals(mc3.c) || !ol1Var.a().equals(mc3.d) || !jl1Var.f) && !q()) {
                                                    z4 = false;
                                                    this.c0 = z4;
                                                    this.K.getClass();
                                                    if (ql2.b.e().equals(jl1Var.a)) {
                                                        this.d0 = new ir();
                                                    }
                                                    if (this.g == 2) {
                                                        this.e0 = SystemClock.elapsedRealtime() + 1000;
                                                    }
                                                    this.B0.a++;
                                                    a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                                }
                                            }
                                            z4 = true;
                                            this.c0 = z4;
                                            this.K.getClass();
                                            if (ql2.b.e().equals(jl1Var.a)) {
                                            }
                                            if (this.g == 2) {
                                            }
                                            this.B0.a++;
                                            a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                        }
                                    }
                                }
                                z3 = false;
                                this.Y = z3;
                                this.Z = i2 > 18 && this.L.z == 1 && ql2.b.q().equals(str);
                                String str62 = jl1Var.a;
                                if (i2 <= 25) {
                                }
                                if (i2 <= 29) {
                                }
                                ol1Var = ql2.b;
                                if (ol1Var.b().equals(mc3.c)) {
                                }
                                z4 = false;
                                this.c0 = z4;
                                this.K.getClass();
                                if (ql2.b.e().equals(jl1Var.a)) {
                                }
                                if (this.g == 2) {
                                }
                                this.B0.a++;
                                a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                            }
                            z2 = true;
                            this.W = z2;
                            this.X = i2 != 21 && ql2.b.C().equals(str);
                            if (i2 < 21) {
                            }
                            z3 = false;
                            this.Y = z3;
                            this.Z = i2 > 18 && this.L.z == 1 && ql2.b.q().equals(str);
                            String str622 = jl1Var.a;
                            if (i2 <= 25) {
                            }
                            if (i2 <= 29) {
                            }
                            ol1Var = ql2.b;
                            if (ol1Var.b().equals(mc3.c)) {
                            }
                            z4 = false;
                            this.c0 = z4;
                            this.K.getClass();
                            if (ql2.b.e().equals(jl1Var.a)) {
                            }
                            if (this.g == 2) {
                            }
                            this.B0.a++;
                            a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        }
                        z = true;
                        this.U = z;
                        this.V = i2 != 29 && ql2.b.d().equals(str);
                        if (i2 <= 23) {
                        }
                        if (i2 <= 19) {
                        }
                        z2 = false;
                        this.W = z2;
                        this.X = i2 != 21 && ql2.b.C().equals(str);
                        if (i2 < 21) {
                        }
                        z3 = false;
                        this.Y = z3;
                        this.Z = i2 > 18 && this.L.z == 1 && ql2.b.q().equals(str);
                        String str6222 = jl1Var.a;
                        if (i2 <= 25) {
                        }
                        if (i2 <= 29) {
                        }
                        ol1Var = ql2.b;
                        if (ol1Var.b().equals(mc3.c)) {
                        }
                        z4 = false;
                        this.c0 = z4;
                        this.K.getClass();
                        if (ql2.b.e().equals(jl1Var.a)) {
                        }
                        if (this.g == 2) {
                        }
                        this.B0.a++;
                        a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                }
            }
            if (i2 < 24) {
                ol1 ol1Var8 = ql2.b;
                if (ol1Var8.s().equals(str) || ol1Var8.t().equals(str)) {
                    String f3 = ol1Var8.f();
                    String str7 = mc3.b;
                    if (f3.equals(str7) || ol1Var8.g().equals(str7) || ol1Var8.k().equals(str7) || ol1Var8.M().equals(str7)) {
                        i = 1;
                        this.S = i;
                        this.T = i2 >= 21 && this.L.o.isEmpty() && ql2.b.r().equals(str);
                        if (i2 >= 18) {
                        }
                        z = true;
                        this.U = z;
                        this.V = i2 != 29 && ql2.b.d().equals(str);
                        if (i2 <= 23) {
                        }
                        if (i2 <= 19) {
                        }
                        z2 = false;
                        this.W = z2;
                        this.X = i2 != 21 && ql2.b.C().equals(str);
                        if (i2 < 21) {
                        }
                        z3 = false;
                        this.Y = z3;
                        this.Z = i2 > 18 && this.L.z == 1 && ql2.b.q().equals(str);
                        String str62222 = jl1Var.a;
                        if (i2 <= 25) {
                        }
                        if (i2 <= 29) {
                        }
                        ol1Var = ql2.b;
                        if (ol1Var.b().equals(mc3.c)) {
                        }
                        z4 = false;
                        this.c0 = z4;
                        this.K.getClass();
                        if (ql2.b.e().equals(jl1Var.a)) {
                        }
                        if (this.g == 2) {
                        }
                        this.B0.a++;
                        a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    }
                }
            }
            i = 0;
            this.S = i;
            this.T = i2 >= 21 && this.L.o.isEmpty() && ql2.b.r().equals(str);
            if (i2 >= 18) {
            }
            z = true;
            this.U = z;
            this.V = i2 != 29 && ql2.b.d().equals(str);
            if (i2 <= 23) {
            }
            if (i2 <= 19) {
            }
            z2 = false;
            this.W = z2;
            this.X = i2 != 21 && ql2.b.C().equals(str);
            if (i2 < 21) {
            }
            z3 = false;
            this.Y = z3;
            this.Z = i2 > 18 && this.L.z == 1 && ql2.b.q().equals(str);
            String str622222 = jl1Var.a;
            if (i2 <= 25) {
            }
            if (i2 <= 29) {
            }
            ol1Var = ql2.b;
            if (ol1Var.b().equals(mc3.c)) {
            }
            z4 = false;
            this.c0 = z4;
            this.K.getClass();
            if (ql2.b.e().equals(jl1Var.a)) {
            }
            if (this.g == 2) {
            }
            this.B0.a++;
            a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            h83.a();
            throw th;
        }
    }

    public final boolean c(int i) {
        ox0 ox0Var = this.c;
        ox0Var.a = null;
        ox0Var.b = null;
        this.r.b();
        int a = a(ox0Var, this.r, i | 4);
        if (a == -5) {
            a(ox0Var);
            return true;
        }
        if (a != -4 || !this.r.b(4)) {
            return false;
        }
        this.w0 = true;
        t();
        return false;
    }

    public void v() {
    }

    public final boolean c(nx0 nx0Var) {
        if (mc3.a >= 23 && this.K != null && this.q0 != 3 && this.g != 0) {
            float f = this.J;
            nx0[] nx0VarArr = this.i;
            nx0VarArr.getClass();
            float a = a(f, nx0VarArr);
            float f2 = this.O;
            if (f2 == a) {
                return true;
            }
            if (a == -1.0f) {
                if (this.r0) {
                    this.p0 = 1;
                    this.q0 = 3;
                    return false;
                }
                u();
                r();
                return false;
            }
            if (f2 == -1.0f && a <= this.q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", a);
            this.K.a(bundle);
            this.O = a;
        }
        return true;
    }

    public final List b(boolean z) {
        ArrayList a = a(this.o, this.B, z);
        if (!a.isEmpty() || !z) {
            return a;
        }
        ArrayList a2 = a(this.o, this.B, false);
        if (!a2.isEmpty()) {
            ji1.d("MediaCodecRenderer", "Drm session requires secure decoder for " + this.B.m + ", but no secure decoder available. Trying to proceed with " + a2 + ".");
        }
        return a2;
    }

    public final void b(long j) {
        Object a;
        r73 r73Var = this.v;
        synchronized (r73Var) {
            a = r73Var.a(j, true);
        }
        nx0 nx0Var = (nx0) a;
        if (nx0Var == null && this.N) {
            nx0Var = (nx0) this.v.c();
        }
        if (nx0Var != null) {
            this.C = nx0Var;
        } else if (!this.N || this.C == null) {
            return;
        }
        a(this.C, this.M);
        this.N = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MediaCrypto mediaCrypto, boolean z) {
        ml1 ml1Var;
        if (this.P == null) {
            try {
                List b = b(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.P = arrayDeque;
                if (this.p) {
                    arrayDeque.addAll(b);
                } else if (!b.isEmpty()) {
                    this.P.add((jl1) b.get(0));
                }
                this.Q = null;
            } catch (sl1 e) {
                throw new ml1(-49998, this.B, e, z);
            }
        }
        if (!this.P.isEmpty()) {
            jl1 jl1Var = (jl1) this.P.peekFirst();
            while (this.K == null) {
                jl1 jl1Var2 = (jl1) this.P.peekFirst();
                if (!a(jl1Var2)) {
                    return;
                }
                try {
                    a(jl1Var2, mediaCrypto);
                } catch (Exception e2) {
                    if (jl1Var2 == jl1Var) {
                        try {
                            ji1.d("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                            Thread.sleep(50L);
                            a(jl1Var2, mediaCrypto);
                        } catch (Exception e3) {
                            ji1.d("MediaCodecRenderer", ji1.a("Failed to initialize decoder: " + jl1Var2, e3));
                            this.P.removeFirst();
                            nx0 nx0Var = this.B;
                            ml1 ml1Var2 = new ml1("Decoder init failed: " + jl1Var2.a + ", " + nx0Var, e3, nx0Var.m, z, jl1Var2, mc3.a < 21 ? ml1.a(e3) : null);
                            a(ml1Var2);
                            ml1Var = this.Q;
                            if (ml1Var != null) {
                                this.Q = ml1Var2;
                            } else {
                                this.Q = new ml1(ml1Var.getMessage(), ml1Var.getCause(), ml1Var.b, ml1Var.c, ml1Var.d, ml1Var.e);
                            }
                            if (!this.P.isEmpty()) {
                                throw this.Q;
                            }
                        }
                    } else {
                        throw e2;
                    }
                    ji1.d("MediaCodecRenderer", ji1.a("Failed to initialize decoder: " + jl1Var2, e3));
                    this.P.removeFirst();
                    nx0 nx0Var2 = this.B;
                    ml1 ml1Var22 = new ml1("Decoder init failed: " + jl1Var2.a + ", " + nx0Var2, e3, nx0Var2.m, z, jl1Var2, mc3.a < 21 ? ml1.a(e3) : null);
                    a(ml1Var22);
                    ml1Var = this.Q;
                    if (ml1Var != null) {
                    }
                    if (!this.P.isEmpty()) {
                    }
                }
            }
            this.P = null;
            return;
        }
        throw new ml1(-49999, this.B, null, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r12 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ab, code lost:
    
        if (m() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00dd, code lost:
    
        if (m() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f1, code lost:
    
        if (m() == false) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public va0 a(ox0 ox0Var) {
        vx0 a;
        boolean z = true;
        this.y0 = true;
        nx0 nx0Var = ox0Var.b;
        nx0Var.getClass();
        int i = 0;
        if (nx0Var.m != null) {
            nk0 nk0Var = ox0Var.a;
            nk0.a(this.E, nk0Var);
            this.E = nk0Var;
            this.B = nx0Var;
            if (this.k0) {
                this.m0 = true;
                return null;
            }
            el1 el1Var = this.K;
            if (el1Var == null) {
                this.P = null;
                r();
                return null;
            }
            jl1 jl1Var = this.R;
            nx0 nx0Var2 = this.L;
            nk0 nk0Var2 = this.D;
            if (nk0Var2 != nk0Var) {
                if (nk0Var != null && nk0Var2 != null && mc3.a >= 23) {
                    UUID uuid = jr.e;
                    if (!uuid.equals(nk0Var2.b()) && !uuid.equals(nk0Var.b()) && (a = a(nk0Var)) != null) {
                        boolean a2 = a.c ? false : nk0Var.a(nx0Var.m);
                        if (!jl1Var.f) {
                        }
                    }
                }
                if (this.r0) {
                    this.p0 = 1;
                    this.q0 = 3;
                } else {
                    u();
                    r();
                }
                return new va0(jl1Var.a, nx0Var2, nx0Var, 0, 128);
            }
            boolean z2 = this.E != this.D;
            if (z2 && mc3.a < 23) {
                throw new IllegalStateException();
            }
            va0 a3 = a(jl1Var, nx0Var2, nx0Var);
            int i2 = a3.d;
            if (i2 != 0) {
                if (i2 == 1) {
                    if (c(nx0Var)) {
                        this.L = nx0Var;
                        if (!z2) {
                            if (this.r0) {
                                this.p0 = 1;
                                if (!this.U && !this.W) {
                                    this.q0 = 1;
                                } else {
                                    this.q0 = 3;
                                    i = 2;
                                }
                            }
                        }
                    }
                    i = 16;
                } else if (i2 == 2) {
                    if (c(nx0Var)) {
                        this.n0 = true;
                        this.o0 = 1;
                        int i3 = this.S;
                        if (i3 != 2 && (i3 != 1 || nx0Var.r != nx0Var2.r || nx0Var.s != nx0Var2.s)) {
                            z = false;
                        }
                        this.a0 = z;
                        this.L = nx0Var;
                        if (z2) {
                        }
                    }
                    i = 16;
                } else if (i2 == 3) {
                    if (c(nx0Var)) {
                        this.L = nx0Var;
                        if (z2) {
                        }
                    }
                    i = 16;
                } else {
                    throw new IllegalStateException();
                }
            } else if (this.r0) {
                this.p0 = 1;
                this.q0 = 3;
            } else {
                u();
                r();
            }
            return (a3.d == 0 || (this.K == el1Var && this.q0 != 3)) ? a3 : new va0(jl1Var.a, nx0Var2, nx0Var, 0, i);
        }
        throw a(4005, nx0Var, (Exception) new IllegalArgumentException(), false);
    }

    @Override // yads.ro
    public void a(long j, boolean z) {
        int i;
        this.w0 = false;
        this.x0 = false;
        this.z0 = false;
        if (this.k0) {
            this.u.b();
            this.t.b();
            this.l0 = false;
        } else if (p()) {
            r();
        }
        r73 r73Var = this.v;
        synchronized (r73Var) {
            i = r73Var.d;
        }
        if (i > 0) {
            this.y0 = true;
        }
        this.v.a();
        int i2 = this.E0;
        if (i2 != 0) {
            int i3 = i2 - 1;
            this.D0 = this.z[i3];
            this.C0 = this.y[i3];
            this.E0 = 0;
        }
    }

    public void a(long j) {
        while (true) {
            int i = this.E0;
            if (i == 0 || j < this.A[0]) {
                return;
            }
            long[] jArr = this.y;
            this.C0 = jArr[0];
            this.D0 = this.z[0];
            int i2 = i - 1;
            this.E0 = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.E0);
            long[] jArr3 = this.A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.E0);
            s();
        }
    }

    @Override // yads.ro
    public final void a(nx0[] nx0VarArr, long j, long j2) {
        if (this.D0 == C.TIME_UNSET) {
            if (this.C0 == C.TIME_UNSET) {
                this.C0 = j;
                this.D0 = j2;
                return;
            }
            throw new IllegalStateException();
        }
        int i = this.E0;
        if (i == this.z.length) {
            ji1.d("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.z[this.E0 - 1]);
        } else {
            this.E0 = i + 1;
        }
        long[] jArr = this.y;
        int i2 = this.E0 - 1;
        jArr[i2] = j;
        this.z[i2] = j2;
        this.A[i2] = this.u0;
    }

    @Override // yads.ro
    public final void a(long j, long j2) {
        boolean z = false;
        if (this.z0) {
            this.z0 = false;
            t();
        }
        qn0 qn0Var = this.A0;
        if (qn0Var == null) {
            try {
                if (this.x0) {
                    v();
                    return;
                }
                if (this.B != null || c(2)) {
                    r();
                    if (this.k0) {
                        h83.a("bypassRender");
                        while (b(j, j2)) {
                        }
                        h83.a();
                    } else if (this.K != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        h83.a("drainAndFeed");
                        while (c(j, j2) && (this.H == C.TIME_UNSET || SystemClock.elapsedRealtime() - elapsedRealtime < this.H)) {
                        }
                        while (n() && (this.H == C.TIME_UNSET || SystemClock.elapsedRealtime() - elapsedRealtime < this.H)) {
                        }
                        h83.a();
                    } else {
                        pa0 pa0Var = this.B0;
                        int i = pa0Var.d;
                        ot2 ot2Var = this.h;
                        ot2Var.getClass();
                        pa0Var.d = i + ot2Var.a(j - this.j);
                        c(1);
                    }
                    synchronized (this.B0) {
                    }
                    return;
                }
                return;
            } catch (IllegalStateException e) {
                int i2 = mc3.a;
                if (i2 < 21 || !(e instanceof MediaCodec.CodecException)) {
                    StackTraceElement[] stackTrace = e.getStackTrace();
                    if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        throw e;
                    }
                }
                a(e);
                if (i2 >= 21 && (e instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e).isRecoverable()) {
                    z = true;
                }
                if (z) {
                    u();
                }
                throw a(4003, this.B, a(e, this.R), z);
            }
        }
        this.A0 = null;
        throw qn0Var;
    }

    @Override // yads.ro
    public void a(float f, float f2) {
        this.I = f;
        this.J = f2;
        c(this.L);
    }

    @Override // yads.ro
    public final int a(nx0 nx0Var) {
        try {
            return a(this.o, nx0Var);
        } catch (sl1 e) {
            throw a(4002, nx0Var, (Exception) e, false);
        }
    }

    public il1 a(IllegalStateException illegalStateException, jl1 jl1Var) {
        return new il1(illegalStateException, jl1Var);
    }
}
