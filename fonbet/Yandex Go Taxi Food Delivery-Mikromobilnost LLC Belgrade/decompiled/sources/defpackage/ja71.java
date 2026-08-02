package defpackage;

import android.media.MediaCodec;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.UUID;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;
import yads.bj1;
import yads.fj1;
import yads.lj1;
import yads.lk0;
import yads.ta0;
import yads.zm0;

/* loaded from: classes7.dex */
public abstract class ja71 extends gy61 {
    public static final byte[] T0 = {0, 0, 1, 103, 66, DerValue.TAG_PRIVATE, PKIBody._KRP, -38, 37, -112, 0, 0, 1, 104, -50, PKIBody._CCP, 19, BlobHeaderStructure.BLOB_VERSION, 0, 0, 1, 101, -120, -124, PKIBody._RP, -50, Alerts.alert_bad_certificate_status_response, 24, -96, 0, Alerts.alert_illegal_parameter, -65, DerValue.tag_UniversalString, 49, -61, 39, 93, Alerts.alert_no_application_protocol};
    public boolean A0;
    public boolean B0;
    public final quz C;
    public int C0;
    public final boolean D;
    public int D0;
    public final float E;
    public int E0;
    public final yh81 F;
    public boolean F0;
    public final yh81 G;
    public boolean G0;
    public final yh81 H;
    public boolean H0;
    public final rz71 I;
    public long I0;
    public final t781 J;
    public long J0;
    public final ArrayList K;
    public boolean K0;
    public final MediaCodec.BufferInfo L;
    public boolean L0;
    public final long[] M;
    public boolean M0;
    public final long[] N;
    public boolean N0;
    public final long[] O;
    public zm0 O0;
    public qd81 P;
    public h881 P0;
    public qd81 Q;
    public long Q0;
    public ji41 R;
    public long R0;
    public ji41 S;
    public int S0;
    public final long T;
    public float U;
    public float V;
    public ss81 W;
    public qd81 Z;
    public final ul81 a;
    public MediaFormat a0;
    public boolean b0;
    public float c0;
    public ArrayDeque d0;
    public fj1 e0;
    public aq61 f0;
    public int g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public oj81 r0;
    public long s0;
    public int t0;
    public int u0;
    public ByteBuffer v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    public ja71(int i, ul81 ul81Var, quz quzVar, boolean z, float f) {
        super(i);
        this.a = ul81Var;
        quzVar.getClass();
        this.C = quzVar;
        this.D = z;
        this.E = f;
        this.F = new yh81(0);
        this.G = new yh81(0);
        this.H = new yh81(2);
        rz71 rz71Var = new rz71();
        this.I = rz71Var;
        this.J = new t781();
        this.K = new ArrayList();
        this.L = new MediaCodec.BufferInfo();
        this.U = 1.0f;
        this.V = 1.0f;
        this.T = -9223372036854775807L;
        this.M = new long[10];
        this.N = new long[10];
        this.O = new long[10];
        this.Q0 = -9223372036854775807L;
        this.R0 = -9223372036854775807L;
        rz71Var.g(0);
        rz71Var.c.order(ByteOrder.nativeOrder());
        this.c0 = -1.0f;
        this.g0 = 0;
        this.C0 = 0;
        this.t0 = -1;
        this.u0 = -1;
        this.s0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        this.D0 = 0;
        this.E0 = 0;
    }

    public abstract boolean A(long j, long j2, ss81 ss81Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, qd81 qd81Var);

    public boolean B(aq61 aq61Var) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final void C(long j) {
        Object a;
        qd81 qd81Var;
        t781 t781Var = this.J;
        synchronized (t781Var) {
            a = t781Var.a(j, true);
        }
        qd81 qd81Var2 = (qd81) a;
        if (qd81Var2 == null && this.b0) {
            t781 t781Var2 = this.J;
            synchronized (t781Var2) {
                int i = t781Var2.d;
                qd81Var = null;
                if (i != 0) {
                    if (i <= 0) {
                        throw new IllegalStateException();
                    }
                    ?? r2 = t781Var2.b;
                    int i2 = t781Var2.c;
                    ?? r4 = r2[i2];
                    r2[i2] = 0;
                    t781Var2.c = (i2 + 1) % r2.length;
                    t781Var2.d = i - 1;
                    qd81Var = r4;
                }
            }
            qd81Var2 = qd81Var;
        }
        if (qd81Var2 != null) {
            this.Q = qd81Var2;
        } else if (!this.b0 || this.Q == null) {
            return;
        }
        y(this.Q, this.a0);
        this.b0 = false;
    }

    public abstract void D(yh81 yh81Var);

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r17.y0 == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(long j, long j2) {
        rz71 rz71Var;
        boolean z;
        boolean z2;
        if (this.L0) {
            ny61.k();
            return false;
        }
        rz71 rz71Var2 = this.I;
        int i = rz71Var2.B;
        if (i > 0) {
            rz71Var = rz71Var2;
            z = false;
            if (!A(j, j2, null, rz71Var2.c, this.u0, 0, i, rz71Var2.x, rz71Var2.c(Integer.MIN_VALUE), rz71Var2.c(4), this.Q)) {
                return false;
            }
            t(rz71Var.A);
            rz71Var.e();
        } else {
            rz71Var = rz71Var2;
            z = false;
        }
        if (this.K0) {
            this.L0 = true;
            return z;
        }
        boolean z3 = this.z0;
        yh81 yh81Var = this.H;
        if (!z3) {
            z2 = z;
        } else {
            if (!rz71Var.h(yh81Var)) {
                boolean z4 = z;
                ny61.k();
                return z4;
            }
            z2 = z;
            this.z0 = z2;
        }
        if (this.A0) {
            if (rz71Var.B <= 0) {
                this.A0 = z2;
                rz71Var.e();
                yh81Var.e();
                this.z0 = z2;
                this.y0 = z2;
                this.A0 = z2;
                N();
            }
        }
        if (this.K0) {
            ny61.k();
            return false;
        }
        og81 og81Var = this.c;
        og81Var.a = null;
        og81Var.b = null;
        yh81Var.e();
        while (true) {
            yh81Var.e();
            int a = a(og81Var, yh81Var, 0);
            if (a == -5) {
                q(og81Var);
                break;
            }
            if (a != -4) {
                if (a != -3) {
                    ny61.k();
                    return false;
                }
            } else {
                if (yh81Var.c(4)) {
                    this.K0 = true;
                    break;
                }
                if (this.M0) {
                    qd81 qd81Var = this.P;
                    qd81Var.getClass();
                    this.Q = qd81Var;
                    y(qd81Var, null);
                    this.M0 = false;
                }
                yh81Var.f();
                if (!rz71Var.h(yh81Var)) {
                    this.z0 = true;
                    break;
                }
            }
        }
        if (rz71Var.B > 0) {
            rz71Var.f();
        }
        return rz71Var.B > 0 || this.K0 || this.A0;
    }

    public boolean F(qd81 qd81Var) {
        return false;
    }

    public final boolean G() {
        if (rf71.a >= 23 && this.W != null && this.E0 != 3 && this.g != 0) {
            float f = this.V;
            qd81[] qd81VarArr = this.i;
            qd81VarArr.getClass();
            float l = l(f, qd81VarArr);
            float f2 = this.c0;
            if (f2 != l) {
                if (l == -1.0f) {
                    if (this.F0) {
                        this.D0 = 1;
                        this.E0 = 3;
                        return false;
                    }
                    Q();
                    N();
                    return false;
                }
                if (f2 != -1.0f || l > this.E) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", l);
                    this.W.a(bundle);
                    this.c0 = l;
                }
            }
        }
        return true;
    }

    public final boolean H(int i) {
        og81 og81Var = this.c;
        og81Var.a = null;
        og81Var.b = null;
        yh81 yh81Var = this.F;
        yh81Var.e();
        int a = a(og81Var, yh81Var, i | 4);
        if (a == -5) {
            q(og81Var);
            return true;
        }
        if (a != -4 || !yh81Var.c(4)) {
            return false;
        }
        this.K0 = true;
        P();
        return false;
    }

    public final boolean I(long j, long j2) {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean A;
        int k;
        boolean z3;
        int i = this.u0;
        MediaCodec.BufferInfo bufferInfo2 = this.L;
        if (i < 0) {
            if (this.l0 && this.G0) {
                try {
                    k = this.W.k(bufferInfo2);
                } catch (IllegalStateException unused) {
                    P();
                    if (this.L0) {
                        Q();
                    }
                }
            } else {
                k = this.W.k(bufferInfo2);
            }
            if (k < 0) {
                if (k != -2) {
                    if (this.q0 && (this.K0 || this.D0 == 2)) {
                        P();
                        return false;
                    }
                    return false;
                }
                this.H0 = true;
                MediaFormat a = this.W.a();
                if (this.g0 != 0 && a.getInteger("width") == 32 && a.getInteger("height") == 32) {
                    this.p0 = true;
                    return true;
                }
                if (this.n0) {
                    a.setInteger("channel-count", 1);
                }
                this.a0 = a;
                this.b0 = true;
                return true;
            }
            if (this.p0) {
                this.p0 = false;
                this.W.d(false, k);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                P();
                return false;
            }
            this.u0 = k;
            ByteBuffer m = this.W.m(k);
            this.v0 = m;
            if (m != null) {
                m.position(bufferInfo2.offset);
                this.v0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.m0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j3 = this.I0;
                if (j3 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j3;
                }
            }
            long j4 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.K;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z3 = false;
                    break;
                }
                if (((Long) arrayList.get(i2)).longValue() == j4) {
                    arrayList.remove(i2);
                    z3 = true;
                    break;
                }
                i2++;
            }
            this.w0 = z3;
            long j5 = this.J0;
            long j6 = bufferInfo2.presentationTimeUs;
            this.x0 = j5 == j6;
            C(j6);
        }
        if (this.l0 && this.G0) {
            try {
                z = false;
                z2 = true;
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                A = A(j, j2, this.W, this.v0, this.u0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.w0, this.x0, this.Q);
            } catch (IllegalStateException unused3) {
                P();
                if (!this.L0) {
                    return z;
                }
                Q();
                return z;
            }
        } else {
            z = false;
            z2 = true;
            bufferInfo = bufferInfo2;
            A = A(j, j2, this.W, this.v0, this.u0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.w0, this.x0, this.Q);
        }
        if (!A) {
            return z;
        }
        t(bufferInfo.presentationTimeUs);
        boolean z4 = (bufferInfo.flags & 4) != 0 ? z2 : z;
        this.u0 = -1;
        this.v0 = null;
        if (!z4) {
            return z2;
        }
        P();
        return z;
    }

    public final boolean J() {
        if (!this.F0) {
            U();
            throw null;
        }
        this.D0 = 1;
        if (this.i0 || this.k0) {
            this.E0 = 3;
            return false;
        }
        this.E0 = 2;
        return true;
    }

    public final boolean K() {
        l271 l271Var;
        boolean z;
        int i;
        int i2;
        ss81 ss81Var = this.W;
        if (ss81Var != null && this.D0 != 2 && !this.K0) {
            int i3 = this.t0;
            yh81 yh81Var = this.G;
            if (i3 < 0) {
                int b = ss81Var.b();
                this.t0 = b;
                if (b >= 0) {
                    yh81Var.c = this.W.e(b);
                    yh81Var.e();
                }
            }
            if (this.D0 == 1) {
                if (!this.q0) {
                    this.G0 = true;
                    this.W.l(this.t0, 0, 0L, 4);
                    this.t0 = -1;
                    yh81Var.c = null;
                }
                this.D0 = 2;
                return false;
            }
            if (this.o0) {
                this.o0 = false;
                yh81Var.c.put(T0);
                this.W.l(this.t0, 38, 0L, 0);
                this.t0 = -1;
                yh81Var.c = null;
                this.F0 = true;
                return true;
            }
            if (this.C0 == 1) {
                for (int i4 = 0; i4 < this.Z.G.size(); i4++) {
                    yh81Var.c.put((byte[]) this.Z.G.get(i4));
                }
                this.C0 = 2;
            }
            ByteBuffer byteBuffer = yh81Var.c;
            l271 l271Var2 = yh81Var.b;
            int position = byteBuffer.position();
            og81 og81Var = this.c;
            og81Var.a = null;
            og81Var.b = null;
            try {
                int a = a(og81Var, yh81Var, 0);
                if (d()) {
                    this.J0 = this.I0;
                }
                if (a != -3) {
                    if (a == -5) {
                        if (this.C0 == 2) {
                            yh81Var.e();
                            this.C0 = 1;
                        }
                        q(og81Var);
                        return true;
                    }
                    if (!yh81Var.c(4)) {
                        if (this.F0 || yh81Var.c(1)) {
                            boolean c = yh81Var.c(1073741824);
                            if (c) {
                                if (position == 0) {
                                    l271Var2.getClass();
                                } else {
                                    if (l271Var2.d == null) {
                                        int[] iArr = new int[1];
                                        l271Var2.d = iArr;
                                        l271Var2.i.numBytesOfClearData = iArr;
                                    }
                                    int[] iArr2 = l271Var2.d;
                                    iArr2[0] = iArr2[0] + position;
                                }
                            }
                            if (this.h0 && !c) {
                                ByteBuffer byteBuffer2 = yh81Var.c;
                                int position2 = byteBuffer2.position();
                                int i5 = 0;
                                int i6 = 0;
                                while (true) {
                                    int i7 = i6 + 1;
                                    if (i7 >= position2) {
                                        byteBuffer2.clear();
                                        break;
                                    }
                                    int i8 = byteBuffer2.get(i6) & 255;
                                    if (i5 == 3) {
                                        if (i8 == 1 && (byteBuffer2.get(i7) & 31) == 7) {
                                            ByteBuffer duplicate = byteBuffer2.duplicate();
                                            duplicate.position(i6 - 3);
                                            duplicate.limit(position2);
                                            byteBuffer2.position(0);
                                            byteBuffer2.put(duplicate);
                                            break;
                                        }
                                    } else if (i8 == 0) {
                                        i5++;
                                    }
                                    if (i8 != 0) {
                                        i5 = 0;
                                    }
                                    i6 = i7;
                                }
                                if (yh81Var.c.position() != 0) {
                                    this.h0 = false;
                                }
                            }
                            long j = yh81Var.x;
                            oj81 oj81Var = this.r0;
                            if (oj81Var != null) {
                                qd81 qd81Var = this.P;
                                if (oj81Var.b == 0) {
                                    oj81Var.a = j;
                                }
                                if (!oj81Var.c) {
                                    ByteBuffer byteBuffer3 = yh81Var.c;
                                    byteBuffer3.getClass();
                                    int i9 = 0;
                                    for (int i10 = 0; i10 < 4; i10++) {
                                        i9 = (i9 << 8) | (byteBuffer3.get(i10) & 255);
                                    }
                                    int c2 = gea1.c(i9);
                                    if (c2 == -1) {
                                        oj81Var.c = true;
                                        oj81Var.b = 0L;
                                        oj81Var.a = yh81Var.x;
                                        nba1.e();
                                        j = yh81Var.x;
                                    } else {
                                        z = c;
                                        j = Math.max(0L, ((oj81Var.b - 529) * 1000000) / qd81Var.S) + oj81Var.a;
                                        oj81Var.b += c2;
                                        long j2 = this.I0;
                                        oj81 oj81Var2 = this.r0;
                                        qd81 qd81Var2 = this.P;
                                        oj81Var2.getClass();
                                        l271Var = l271Var2;
                                        this.I0 = Math.max(j2, Math.max(0L, ((oj81Var2.b - 529) * 1000000) / qd81Var2.S) + oj81Var2.a);
                                    }
                                }
                                z = c;
                                long j22 = this.I0;
                                oj81 oj81Var22 = this.r0;
                                qd81 qd81Var22 = this.P;
                                oj81Var22.getClass();
                                l271Var = l271Var2;
                                this.I0 = Math.max(j22, Math.max(0L, ((oj81Var22.b - 529) * 1000000) / qd81Var22.S) + oj81Var22.a);
                            } else {
                                l271Var = l271Var2;
                                z = c;
                            }
                            if (yh81Var.c(Integer.MIN_VALUE)) {
                                this.K.add(Long.valueOf(j));
                            }
                            if (this.M0) {
                                this.J.c(this.P, j);
                                this.M0 = false;
                            }
                            this.I0 = Math.max(this.I0, j);
                            yh81Var.f();
                            if (yh81Var.c(SelfTester_JCP.IMITA)) {
                                z(yh81Var);
                            }
                            D(yh81Var);
                            ss81 ss81Var2 = this.W;
                            int i11 = this.t0;
                            try {
                                if (z) {
                                    ss81Var2.h(i11, l271Var, j);
                                } else {
                                    ss81Var2.l(i11, yh81Var.c.limit(), j, 0);
                                }
                                this.t0 = -1;
                                yh81Var.c = null;
                                this.F0 = true;
                                this.C0 = 0;
                                this.P0.c++;
                                return true;
                            } catch (MediaCodec.CryptoException e) {
                                qd81 qd81Var3 = this.P;
                                int errorCode = e.getErrorCode();
                                int i12 = rf71.a;
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
                                                                i = 6002;
                                                                break;
                                                            default:
                                                                i = 6006;
                                                                break;
                                                        }
                                                }
                                                throw a(e, qd81Var3, false, i);
                                            }
                                            i = 6003;
                                            throw a(e, qd81Var3, false, i);
                                        }
                                    }
                                    i = 6004;
                                    throw a(e, qd81Var3, false, i);
                                }
                                i = 6005;
                                throw a(e, qd81Var3, false, i);
                            }
                        }
                        yh81Var.e();
                        if (this.C0 == 2) {
                            this.C0 = 1;
                            return true;
                        }
                        return true;
                    }
                    if (this.C0 == 2) {
                        yh81Var.e();
                        this.C0 = 1;
                    }
                    this.K0 = true;
                    if (!this.F0) {
                        P();
                        return false;
                    }
                    try {
                        if (!this.q0) {
                            this.G0 = true;
                            this.W.l(this.t0, 0, 0L, 4);
                            this.t0 = -1;
                            yh81Var.c = null;
                            return false;
                        }
                    } catch (MediaCodec.CryptoException e2) {
                        qd81 qd81Var4 = this.P;
                        int errorCode2 = e2.getErrorCode();
                        int i13 = rf71.a;
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
                                                        i2 = 6002;
                                                        break;
                                                    default:
                                                        i2 = 6006;
                                                        break;
                                                }
                                        }
                                        throw a(e2, qd81Var4, false, i2);
                                    }
                                    i2 = 6003;
                                    throw a(e2, qd81Var4, false, i2);
                                }
                            }
                            i2 = 6004;
                            throw a(e2, qd81Var4, false, i2);
                        }
                        i2 = 6005;
                        throw a(e2, qd81Var4, false, i2);
                    }
                }
            } catch (ta0 e3) {
                w(e3);
                H(0);
                n();
                return true;
            }
        }
        return false;
    }

    public final boolean L() {
        if (this.W == null) {
            return false;
        }
        int i = this.E0;
        if (i == 3 || this.i0 || ((this.j0 && !this.H0) || (this.k0 && this.G0))) {
            Q();
            return true;
        }
        if (i == 2) {
            int i2 = rf71.a;
            if (i2 < 23) {
                ny61.k();
                return false;
            }
            if (i2 >= 23) {
                try {
                    U();
                    throw null;
                } catch (zm0 e) {
                    nba1.b("Failed to update the DRM session, releasing the codec instead.", e);
                    nba1.e();
                    Q();
                    return true;
                }
            }
        }
        n();
        return false;
    }

    public boolean M() {
        return false;
    }

    public final void N() {
        qd81 qd81Var;
        if (this.W != null || this.y0 || (qd81Var = this.P) == null) {
            return;
        }
        if (this.S != null || !F(qd81Var)) {
            ji41 ji41Var = this.S;
            this.R = ji41Var;
            qd81 qd81Var2 = this.P;
            String str = qd81Var2.E;
            if (ji41Var != null) {
                lk0 lk0Var = (lk0) ji41Var.b;
                if (wj61.a) {
                    throw a(lk0Var, qd81Var2, false, lk0Var.b);
                }
            }
            try {
                s();
                return;
            } catch (fj1 e) {
                throw a(e, this.P, false, 4001);
            }
        }
        qd81 qd81Var3 = this.P;
        this.A0 = false;
        rz71 rz71Var = this.I;
        rz71Var.e();
        this.H.e();
        this.z0 = false;
        this.y0 = false;
        String str2 = qd81Var3.E;
        if ("audio/mp4a-latm".equals(str2) || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
            rz71Var.C = 32;
        } else {
            rz71Var.C = 1;
        }
        this.y0 = true;
    }

    public abstract void O();

    public final void P() {
        int i = this.E0;
        if (i == 1) {
            n();
            return;
        }
        if (i == 2) {
            n();
            U();
            throw null;
        }
        if (i != 3) {
            this.L0 = true;
            R();
        } else {
            Q();
            N();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q() {
        try {
            ss81 ss81Var = this.W;
            if (ss81Var != null) {
                ss81Var.release();
                this.P0.b++;
                x(this.f0.a);
            }
        } finally {
            this.W = null;
            this.R = null;
            T();
        }
    }

    public void R() {
    }

    public void S() {
        this.t0 = -1;
        this.G.c = null;
        this.u0 = -1;
        this.v0 = null;
        this.s0 = -9223372036854775807L;
        this.G0 = false;
        this.F0 = false;
        this.o0 = false;
        this.p0 = false;
        this.w0 = false;
        this.x0 = false;
        this.K.clear();
        this.I0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        oj81 oj81Var = this.r0;
        if (oj81Var != null) {
            oj81Var.a = 0L;
            oj81Var.b = 0L;
            oj81Var.c = false;
        }
        this.D0 = 0;
        this.E0 = 0;
        this.C0 = this.B0 ? 1 : 0;
    }

    public final void T() {
        S();
        this.O0 = null;
        this.r0 = null;
        this.d0 = null;
        this.f0 = null;
        this.Z = null;
        this.a0 = null;
        this.b0 = false;
        this.H0 = false;
        this.c0 = -1.0f;
        this.g0 = 0;
        this.h0 = false;
        this.i0 = false;
        this.j0 = false;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = false;
        this.q0 = false;
        this.B0 = false;
        this.C0 = 0;
    }

    public final void U() {
        try {
            this.S.getClass();
            throw null;
        } catch (MediaCryptoException e) {
            throw a(e, this.P, false, 6006);
        }
    }

    @Override // defpackage.gy61
    public final void a(long j, long j2) {
        boolean z = false;
        if (this.N0) {
            this.N0 = false;
            P();
        }
        zm0 zm0Var = this.O0;
        if (zm0Var != null) {
            this.O0 = null;
            throw zm0Var;
        }
        try {
            if (this.L0) {
                R();
                return;
            }
            if (this.P != null || H(2)) {
                N();
                if (this.y0) {
                    dda1.i("bypassRender");
                    while (E(j, j2)) {
                    }
                    dda1.h();
                } else if (this.W != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    dda1.i("drainAndFeed");
                    while (I(j, j2) && (this.T == -9223372036854775807L || SystemClock.elapsedRealtime() - elapsedRealtime < this.T)) {
                    }
                    while (K() && (this.T == -9223372036854775807L || SystemClock.elapsedRealtime() - elapsedRealtime < this.T)) {
                    }
                    dda1.h();
                } else {
                    h881 h881Var = this.P0;
                    int i = h881Var.d;
                    dg81 dg81Var = this.h;
                    dg81Var.getClass();
                    h881Var.d = i + dg81Var.d(j - this.j);
                    H(1);
                }
                synchronized (this.P0) {
                }
            }
        } catch (IllegalStateException e) {
            int i2 = rf71.a;
            if (i2 < 21 || !(e instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e;
                }
            }
            w(e);
            if (i2 >= 21) {
                if (e instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e).isRecoverable() : false) {
                    z = true;
                }
            }
            if (z) {
                Q();
            }
            throw a(r(e, this.f0), this.P, z, 4003);
        }
    }

    @Override // defpackage.gy61
    public boolean e() {
        return this.L0;
    }

    @Override // defpackage.gy61
    public boolean f() {
        boolean c;
        if (this.P == null) {
            return false;
        }
        if (d()) {
            c = this.l;
        } else {
            dg81 dg81Var = this.h;
            dg81Var.getClass();
            c = dg81Var.c();
        }
        if (c || this.u0 >= 0) {
            return true;
        }
        return this.s0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.s0;
    }

    @Override // defpackage.gy61
    public final int k() {
        return 8;
    }

    public abstract float l(float f, qd81[] qd81VarArr);

    public abstract int m(quz quzVar, qd81 qd81Var);

    public abstract ArrayList n(quz quzVar, qd81 qd81Var);

    public final void n() {
        try {
            this.W.flush();
        } finally {
            S();
        }
    }

    public abstract si81 o(aq61 aq61Var, qd81 qd81Var, float f);

    public abstract ko81 p(aq61 aq61Var, qd81 qd81Var, qd81 qd81Var2);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (J() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008f, code lost:
    
        if (J() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a4, code lost:
    
        if (J() == false) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ko81 q(og81 og81Var) {
        int i;
        boolean z = true;
        this.M0 = true;
        qd81 qd81Var = og81Var.b;
        qd81Var.getClass();
        int i2 = 0;
        if (qd81Var.E == null) {
            throw a(new IllegalArgumentException(), qd81Var, false, 4005);
        }
        ji41 ji41Var = og81Var.a;
        this.S = ji41Var;
        this.P = qd81Var;
        if (this.y0) {
            this.A0 = true;
            return null;
        }
        ss81 ss81Var = this.W;
        if (ss81Var == null) {
            this.d0 = null;
            N();
            return null;
        }
        aq61 aq61Var = this.f0;
        qd81 qd81Var2 = this.Z;
        ji41 ji41Var2 = this.R;
        if (ji41Var2 != ji41Var) {
            if (ji41Var != null && ji41Var2 != null && rf71.a >= 23) {
                UUID uuid = sm81.e;
                UUID uuid2 = sm81.a;
                if (!uuid.equals(uuid2)) {
                    uuid.equals(uuid2);
                }
            }
            if (this.F0) {
                this.D0 = 1;
                this.E0 = 3;
            } else {
                Q();
                N();
            }
            return new ko81(aq61Var.a, qd81Var2, qd81Var, 0, 128);
        }
        boolean z2 = ji41Var != ji41Var2;
        if (z2 && rf71.a < 23) {
            ny61.k();
            return null;
        }
        ko81 p = p(aq61Var, qd81Var2, qd81Var);
        int i3 = p.d;
        if (i3 != 0) {
            if (i3 == 1) {
                if (G()) {
                    this.Z = qd81Var;
                    if (!z2) {
                        if (this.F0) {
                            this.D0 = 1;
                            if (this.i0 || this.k0) {
                                this.E0 = 3;
                                i = 2;
                            } else {
                                this.E0 = 1;
                            }
                        }
                    }
                }
                i2 = 16;
            } else if (i3 == 2) {
                if (G()) {
                    this.B0 = true;
                    this.C0 = 1;
                    int i4 = this.g0;
                    if (i4 != 2 && (i4 != 1 || qd81Var.J != qd81Var2.J || qd81Var.K != qd81Var2.K)) {
                        z = false;
                    }
                    this.o0 = z;
                    this.Z = qd81Var;
                    if (z2) {
                    }
                }
                i2 = 16;
            } else {
                if (i3 != 3) {
                    ny61.k();
                    return null;
                }
                if (G()) {
                    this.Z = qd81Var;
                    if (z2) {
                    }
                }
                i2 = 16;
            }
            return (i3 != 0 || (this.W == ss81Var && this.E0 != 3)) ? p : new ko81(aq61Var.a, qd81Var2, qd81Var, 0, i);
        }
        if (this.F0) {
            this.D0 = 1;
            this.E0 = 3;
        } else {
            Q();
            N();
        }
        i = i2;
        if (i3 != 0) {
        }
    }

    public bj1 r(IllegalStateException illegalStateException, aq61 aq61Var) {
        return new bj1(illegalStateException, aq61Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        fj1 fj1Var;
        if (this.d0 == null) {
            try {
                ArrayList n = n(this.C, this.P);
                n.isEmpty();
                ArrayDeque arrayDeque = new ArrayDeque();
                this.d0 = arrayDeque;
                if (this.D) {
                    arrayDeque.addAll(n);
                } else if (!n.isEmpty()) {
                    this.d0.add((aq61) n.get(0));
                }
                this.e0 = null;
            } catch (lj1 e) {
                throw new fj1(this.P, e, -49998);
            }
        }
        if (this.d0.isEmpty()) {
            throw new fj1(this.P, null, -49999);
        }
        aq61 aq61Var = (aq61) this.d0.peekFirst();
        while (this.W == null) {
            aq61 aq61Var2 = (aq61) this.d0.peekFirst();
            if (!B(aq61Var2)) {
                return;
            }
            try {
                v(aq61Var2);
            } catch (Exception e2) {
                if (aq61Var2 != aq61Var) {
                    throw e2;
                }
                try {
                    nba1.e();
                    Thread.sleep(50L);
                    v(aq61Var2);
                } catch (Exception e3) {
                    nba1.b("Failed to initialize decoder: " + aq61Var2, e3);
                    nba1.e();
                    this.d0.removeFirst();
                    qd81 qd81Var = this.P;
                    fj1 fj1Var2 = new fj1("Decoder init failed: " + aq61Var2.a + Extension.FIX_SPACE + qd81Var, e3, qd81Var.E, false, aq61Var2, (rf71.a >= 21 || !(e3 instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) e3).getDiagnosticInfo());
                    w(fj1Var2);
                    fj1Var = this.e0;
                    if (fj1Var != null) {
                    }
                    if (!this.d0.isEmpty()) {
                    }
                }
                nba1.b("Failed to initialize decoder: " + aq61Var2, e3);
                nba1.e();
                this.d0.removeFirst();
                qd81 qd81Var2 = this.P;
                fj1 fj1Var22 = new fj1("Decoder init failed: " + aq61Var2.a + Extension.FIX_SPACE + qd81Var2, e3, qd81Var2.E, false, aq61Var2, (rf71.a >= 21 || !(e3 instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) e3).getDiagnosticInfo());
                w(fj1Var22);
                fj1Var = this.e0;
                if (fj1Var != null) {
                    this.e0 = fj1Var22;
                } else {
                    this.e0 = new fj1(fj1Var.getMessage(), fj1Var.getCause(), fj1Var.b, fj1Var.c, fj1Var.d, fj1Var.e);
                }
                if (!this.d0.isEmpty()) {
                    throw this.e0;
                }
            }
        }
        this.d0 = null;
    }

    public void t(long j) {
        while (true) {
            int i = this.S0;
            if (i == 0) {
                return;
            }
            long[] jArr = this.O;
            if (j < jArr[0]) {
                return;
            }
            long[] jArr2 = this.M;
            this.Q0 = jArr2[0];
            long[] jArr3 = this.N;
            this.R0 = jArr3[0];
            int i2 = i - 1;
            this.S0 = i2;
            System.arraycopy(jArr2, 1, jArr2, 0, i2);
            System.arraycopy(jArr3, 1, jArr3, 0, this.S0);
            System.arraycopy(jArr, 1, jArr, 0, this.S0);
            O();
        }
    }

    public abstract void u(long j, long j2, String str);

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0387, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("T01YLmFsbHdpbm5lci52aWRlby5kZWNvZGVyLmF2Yw==", 0), defpackage.uza.a).equals(r5) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03b2, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("T01YLmJyb2FkY29tLnZpZGVvX2RlY29kZXIudHVubmVsLnNlY3VyZQ==", 0), r4).equals(r5) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0243, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("c3R2bTg=", 0), r11).equals(r6) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0265, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("T01YLmFtbG9naWMuYXZjLmRlY29kZXIuYXdlc29tZS5zZWN1cmU=", 0), r11).equals(r5) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0199, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("T01YLlNFQy5hdmMuZGVjLnNlY3VyZQ==", 0), r14).equals(r5) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d5, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("T01YLkV4eW5vcy5hdmMuZGVjLnNlY3VyZQ==", 0), r11).equals(r5) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0216, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("T01YLmdvb2dsZS52b3JiaXMuZGVjb2Rlcg==", 0), defpackage.uza.a).equals(r5) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x036b, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("T01YLnJrLnZpZGVvX2RlY29kZXIuYXZj", 0), defpackage.uza.a).equals(r5) == false) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x041a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(aq61 aq61Var) {
        float l;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        byte[] decode;
        Charset charset;
        boolean z8;
        String str = aq61Var.a;
        int i2 = rf71.a;
        if (i2 < 23) {
            l = -1.0f;
        } else {
            float f = this.V;
            qd81[] qd81VarArr = this.i;
            qd81VarArr.getClass();
            l = l(f, qd81VarArr);
        }
        float f2 = l > this.E ? l : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        si81 o = o(aq61Var, this.P, f2);
        if (i2 >= 31) {
            wl61 wl61Var = this.f;
            wl61Var.getClass();
            f471.a(o, wl61Var);
        }
        try {
            dda1.i("createCodec:" + str);
            this.W = this.a.a(o);
            dda1.h();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f0 = aq61Var;
            this.c0 = f2;
            this.Z = this.P;
            if (i2 <= 25) {
                mf81.b.getClass();
                byte[] decode2 = Base64.decode("T01YLkV4eW5vcy5hdmMuZGVjLnNlY3VyZQ==", 0);
                Charset charset2 = uza.a;
                if (new String(decode2, charset2).equals(str)) {
                    String str2 = rf71.d;
                    if (str2.startsWith(new String(Base64.decode("U00tVDU4NQ==", 0), charset2)) || str2.startsWith(new String(Base64.decode("U00tQTUxMA==", 0), charset2)) || str2.startsWith(new String(Base64.decode("U00tQTUyMA==", 0), charset2)) || str2.startsWith(new String(Base64.decode("U00tSjcwMA==", 0), charset2))) {
                        i = 2;
                        this.g0 = i;
                        qd81 qd81Var = this.Z;
                        if (i2 < 21 && qd81Var.G.isEmpty()) {
                            mf81.b.getClass();
                            if (new String(Base64.decode("T01YLk1USy5WSURFTy5ERUNPREVSLkFWQw==", 0), uza.a).equals(str)) {
                                z = true;
                                this.h0 = z;
                                if (i2 >= 18) {
                                    if (i2 == 18) {
                                        mf81.b.getClass();
                                        byte[] decode3 = Base64.decode("T01YLlNFQy5hdmMuZGVj", 0);
                                        Charset charset3 = uza.a;
                                        if (!new String(decode3, charset3).equals(str)) {
                                        }
                                    }
                                    if (i2 == 19) {
                                        String str3 = rf71.d;
                                        mf81.b.getClass();
                                        byte[] decode4 = Base64.decode("U00tRzgwMA==", 0);
                                        Charset charset4 = uza.a;
                                        if (str3.startsWith(new String(decode4, charset4))) {
                                            if (!new String(Base64.decode("T01YLkV4eW5vcy5hdmMuZGVj", 0), charset4).equals(str)) {
                                            }
                                        }
                                    }
                                    z2 = false;
                                    this.i0 = z2;
                                    if (i2 == 29) {
                                        mf81.b.getClass();
                                        if (new String(Base64.decode("YzIuYW5kcm9pZC5hYWMuZGVjb2Rlcg==", 0), uza.a).equals(str)) {
                                            z3 = true;
                                            this.j0 = z3;
                                            if (i2 <= 23) {
                                                mf81.b.getClass();
                                            }
                                            if (i2 <= 19) {
                                                mf81.b.getClass();
                                                byte[] decode5 = Base64.decode("aGIyMDAw", 0);
                                                Charset charset5 = uza.a;
                                                String str4 = new String(decode5, charset5);
                                                String str5 = rf71.b;
                                                if (!str4.equals(str5)) {
                                                }
                                                if (!new String(Base64.decode("T01YLmFtbG9naWMuYXZjLmRlY29kZXIuYXdlc29tZQ==", 0), charset5).equals(str)) {
                                                }
                                                z4 = true;
                                                this.k0 = z4;
                                                if (i2 == 21) {
                                                    mf81.b.getClass();
                                                    if (new String(Base64.decode("T01YLmdvb2dsZS5hYWMuZGVjb2Rlcg==", 0), uza.a).equals(str)) {
                                                        z5 = true;
                                                        this.l0 = z5;
                                                        if (i2 < 21) {
                                                            mf81.b.getClass();
                                                            byte[] decode6 = Base64.decode("T01YLlNFQy5tcDMuZGVj", 0);
                                                            Charset charset6 = uza.a;
                                                            if (new String(decode6, charset6).equals(str) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset6).equals(rf71.c)) {
                                                                String str6 = rf71.b;
                                                                if (str6.startsWith(new String(Base64.decode("YmFmZmlu", 0), charset6)) || str6.startsWith(new String(Base64.decode("Z3JhbmQ=", 0), charset6)) || str6.startsWith(new String(Base64.decode("Zm9ydHVuYQ==", 0), charset6)) || str6.startsWith(new String(Base64.decode("Z3ByaW1lbHRl", 0), charset6)) || str6.startsWith(new String(Base64.decode("ajJ5MThsdGU=", 0), charset6)) || str6.startsWith(new String(Base64.decode("bXMwMQ==", 0), charset6))) {
                                                                    z6 = true;
                                                                    this.m0 = z6;
                                                                    qd81 qd81Var2 = this.Z;
                                                                    if (i2 <= 18 && qd81Var2.R == 1) {
                                                                        mf81.b.getClass();
                                                                        if (new String(Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLk1QMw==", 0), uza.a).equals(str)) {
                                                                            z7 = true;
                                                                            this.n0 = z7;
                                                                            if (i2 <= 25) {
                                                                                mf81.b.getClass();
                                                                            }
                                                                            if (i2 <= 17) {
                                                                                mf81.b.getClass();
                                                                            }
                                                                            if (i2 <= 29) {
                                                                                mf81.b.getClass();
                                                                                byte[] decode7 = Base64.decode("T01YLmJyb2FkY29tLnZpZGVvX2RlY29kZXIudHVubmVs", 0);
                                                                                Charset charset7 = uza.a;
                                                                                if (!new String(decode7, charset7).equals(str)) {
                                                                                }
                                                                                z8 = true;
                                                                                this.q0 = z8;
                                                                                this.W.getClass();
                                                                                mf81.b.getClass();
                                                                                if (new String(Base64.decode("YzIuYW5kcm9pZC5tcDMuZGVjb2Rlcg==", 0), uza.a).equals(str)) {
                                                                                    this.r0 = new oj81();
                                                                                }
                                                                                if (this.g == 2) {
                                                                                    this.s0 = SystemClock.elapsedRealtime() + 1000;
                                                                                }
                                                                                this.P0.a++;
                                                                                u(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                                                                            }
                                                                            mf81.b.getClass();
                                                                            decode = Base64.decode("QW1hem9u", 0);
                                                                            charset = uza.a;
                                                                            if ((new String(decode, charset).equals(rf71.c) || !new String(Base64.decode("QUZUUw==", 0), charset).equals(rf71.d) || !aq61Var.f) && !M()) {
                                                                                z8 = false;
                                                                                this.q0 = z8;
                                                                                this.W.getClass();
                                                                                mf81.b.getClass();
                                                                                if (new String(Base64.decode("YzIuYW5kcm9pZC5tcDMuZGVjb2Rlcg==", 0), uza.a).equals(str)) {
                                                                                }
                                                                                if (this.g == 2) {
                                                                                }
                                                                                this.P0.a++;
                                                                                u(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                                                                            }
                                                                            z8 = true;
                                                                            this.q0 = z8;
                                                                            this.W.getClass();
                                                                            mf81.b.getClass();
                                                                            if (new String(Base64.decode("YzIuYW5kcm9pZC5tcDMuZGVjb2Rlcg==", 0), uza.a).equals(str)) {
                                                                            }
                                                                            if (this.g == 2) {
                                                                            }
                                                                            this.P0.a++;
                                                                            u(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                                                                        }
                                                                    }
                                                                    z7 = false;
                                                                    this.n0 = z7;
                                                                    if (i2 <= 25) {
                                                                    }
                                                                    if (i2 <= 17) {
                                                                    }
                                                                    if (i2 <= 29) {
                                                                    }
                                                                    mf81.b.getClass();
                                                                    decode = Base64.decode("QW1hem9u", 0);
                                                                    charset = uza.a;
                                                                    if (new String(decode, charset).equals(rf71.c)) {
                                                                    }
                                                                    z8 = false;
                                                                    this.q0 = z8;
                                                                    this.W.getClass();
                                                                    mf81.b.getClass();
                                                                    if (new String(Base64.decode("YzIuYW5kcm9pZC5tcDMuZGVjb2Rlcg==", 0), uza.a).equals(str)) {
                                                                    }
                                                                    if (this.g == 2) {
                                                                    }
                                                                    this.P0.a++;
                                                                    u(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                                                                }
                                                            }
                                                        }
                                                        z6 = false;
                                                        this.m0 = z6;
                                                        qd81 qd81Var22 = this.Z;
                                                        if (i2 <= 18) {
                                                            mf81.b.getClass();
                                                            if (new String(Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLk1QMw==", 0), uza.a).equals(str)) {
                                                            }
                                                        }
                                                        z7 = false;
                                                        this.n0 = z7;
                                                        if (i2 <= 25) {
                                                        }
                                                        if (i2 <= 17) {
                                                        }
                                                        if (i2 <= 29) {
                                                        }
                                                        mf81.b.getClass();
                                                        decode = Base64.decode("QW1hem9u", 0);
                                                        charset = uza.a;
                                                        if (new String(decode, charset).equals(rf71.c)) {
                                                        }
                                                        z8 = false;
                                                        this.q0 = z8;
                                                        this.W.getClass();
                                                        mf81.b.getClass();
                                                        if (new String(Base64.decode("YzIuYW5kcm9pZC5tcDMuZGVjb2Rlcg==", 0), uza.a).equals(str)) {
                                                        }
                                                        if (this.g == 2) {
                                                        }
                                                        this.P0.a++;
                                                        u(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                                                    }
                                                }
                                                z5 = false;
                                                this.l0 = z5;
                                                if (i2 < 21) {
                                                }
                                                z6 = false;
                                                this.m0 = z6;
                                                qd81 qd81Var222 = this.Z;
                                                if (i2 <= 18) {
                                                }
                                                z7 = false;
                                                this.n0 = z7;
                                                if (i2 <= 25) {
                                                }
                                                if (i2 <= 17) {
                                                }
                                                if (i2 <= 29) {
                                                }
                                                mf81.b.getClass();
                                                decode = Base64.decode("QW1hem9u", 0);
                                                charset = uza.a;
                                                if (new String(decode, charset).equals(rf71.c)) {
                                                }
                                                z8 = false;
                                                this.q0 = z8;
                                                this.W.getClass();
                                                mf81.b.getClass();
                                                if (new String(Base64.decode("YzIuYW5kcm9pZC5tcDMuZGVjb2Rlcg==", 0), uza.a).equals(str)) {
                                                }
                                                if (this.g == 2) {
                                                }
                                                this.P0.a++;
                                                u(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                                            }
                                            z4 = false;
                                            this.k0 = z4;
                                            if (i2 == 21) {
                                            }
                                            z5 = false;
                                            this.l0 = z5;
                                            if (i2 < 21) {
                                            }
                                            z6 = false;
                                            this.m0 = z6;
                                            qd81 qd81Var2222 = this.Z;
                                            if (i2 <= 18) {
                                            }
                                            z7 = false;
                                            this.n0 = z7;
                                            if (i2 <= 25) {
                                            }
                                            if (i2 <= 17) {
                                            }
                                            if (i2 <= 29) {
                                            }
                                            mf81.b.getClass();
                                            decode = Base64.decode("QW1hem9u", 0);
                                            charset = uza.a;
                                            if (new String(decode, charset).equals(rf71.c)) {
                                            }
                                            z8 = false;
                                            this.q0 = z8;
                                            this.W.getClass();
                                            mf81.b.getClass();
                                            if (new String(Base64.decode("YzIuYW5kcm9pZC5tcDMuZGVjb2Rlcg==", 0), uza.a).equals(str)) {
                                            }
                                            if (this.g == 2) {
                                            }
                                            this.P0.a++;
                                            u(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                                        }
                                    }
                                    z3 = false;
                                    this.j0 = z3;
                                    if (i2 <= 23) {
                                    }
                                    if (i2 <= 19) {
                                    }
                                    z4 = false;
                                    this.k0 = z4;
                                    if (i2 == 21) {
                                    }
                                    z5 = false;
                                    this.l0 = z5;
                                    if (i2 < 21) {
                                    }
                                    z6 = false;
                                    this.m0 = z6;
                                    qd81 qd81Var22222 = this.Z;
                                    if (i2 <= 18) {
                                    }
                                    z7 = false;
                                    this.n0 = z7;
                                    if (i2 <= 25) {
                                    }
                                    if (i2 <= 17) {
                                    }
                                    if (i2 <= 29) {
                                    }
                                    mf81.b.getClass();
                                    decode = Base64.decode("QW1hem9u", 0);
                                    charset = uza.a;
                                    if (new String(decode, charset).equals(rf71.c)) {
                                    }
                                    z8 = false;
                                    this.q0 = z8;
                                    this.W.getClass();
                                    mf81.b.getClass();
                                    if (new String(Base64.decode("YzIuYW5kcm9pZC5tcDMuZGVjb2Rlcg==", 0), uza.a).equals(str)) {
                                    }
                                    if (this.g == 2) {
                                    }
                                    this.P0.a++;
                                    u(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                                }
                                z2 = true;
                                this.i0 = z2;
                                if (i2 == 29) {
                                }
                                z3 = false;
                                this.j0 = z3;
                                if (i2 <= 23) {
                                }
                                if (i2 <= 19) {
                                }
                                z4 = false;
                                this.k0 = z4;
                                if (i2 == 21) {
                                }
                                z5 = false;
                                this.l0 = z5;
                                if (i2 < 21) {
                                }
                                z6 = false;
                                this.m0 = z6;
                                qd81 qd81Var222222 = this.Z;
                                if (i2 <= 18) {
                                }
                                z7 = false;
                                this.n0 = z7;
                                if (i2 <= 25) {
                                }
                                if (i2 <= 17) {
                                }
                                if (i2 <= 29) {
                                }
                                mf81.b.getClass();
                                decode = Base64.decode("QW1hem9u", 0);
                                charset = uza.a;
                                if (new String(decode, charset).equals(rf71.c)) {
                                }
                                z8 = false;
                                this.q0 = z8;
                                this.W.getClass();
                                mf81.b.getClass();
                                if (new String(Base64.decode("YzIuYW5kcm9pZC5tcDMuZGVjb2Rlcg==", 0), uza.a).equals(str)) {
                                }
                                if (this.g == 2) {
                                }
                                this.P0.a++;
                                u(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                            }
                        }
                        z = false;
                        this.h0 = z;
                        if (i2 >= 18) {
                        }
                        z2 = true;
                        this.i0 = z2;
                        if (i2 == 29) {
                        }
                        z3 = false;
                        this.j0 = z3;
                        if (i2 <= 23) {
                        }
                        if (i2 <= 19) {
                        }
                        z4 = false;
                        this.k0 = z4;
                        if (i2 == 21) {
                        }
                        z5 = false;
                        this.l0 = z5;
                        if (i2 < 21) {
                        }
                        z6 = false;
                        this.m0 = z6;
                        qd81 qd81Var2222222 = this.Z;
                        if (i2 <= 18) {
                        }
                        z7 = false;
                        this.n0 = z7;
                        if (i2 <= 25) {
                        }
                        if (i2 <= 17) {
                        }
                        if (i2 <= 29) {
                        }
                        mf81.b.getClass();
                        decode = Base64.decode("QW1hem9u", 0);
                        charset = uza.a;
                        if (new String(decode, charset).equals(rf71.c)) {
                        }
                        z8 = false;
                        this.q0 = z8;
                        this.W.getClass();
                        mf81.b.getClass();
                        if (new String(Base64.decode("YzIuYW5kcm9pZC5tcDMuZGVjb2Rlcg==", 0), uza.a).equals(str)) {
                        }
                        if (this.g == 2) {
                        }
                        this.P0.a++;
                        u(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                    }
                }
            }
            if (i2 < 24) {
                mf81.b.getClass();
                byte[] decode8 = Base64.decode("T01YLk52aWRpYS5oMjY0LmRlY29kZQ==", 0);
                Charset charset8 = uza.a;
                if (new String(decode8, charset8).equals(str) || new String(Base64.decode("T01YLk52aWRpYS5oMjY0LmRlY29kZS5zZWN1cmU=", 0), charset8).equals(str)) {
                    String str7 = new String(Base64.decode("ZmxvdW5kZXI=", 0), charset8);
                    String str8 = rf71.b;
                    if (str7.equals(str8) || new String(Base64.decode("ZmxvdW5kZXJfbHRl", 0), charset8).equals(str8) || new String(Base64.decode("Z3JvdXBlcg==", 0), charset8).equals(str8) || new String(Base64.decode("dGlsYXBpYQ==", 0), charset8).equals(str8)) {
                        i = 1;
                        this.g0 = i;
                        qd81 qd81Var3 = this.Z;
                        if (i2 < 21) {
                            mf81.b.getClass();
                            if (new String(Base64.decode("T01YLk1USy5WSURFTy5ERUNPREVSLkFWQw==", 0), uza.a).equals(str)) {
                            }
                        }
                        z = false;
                        this.h0 = z;
                        if (i2 >= 18) {
                        }
                        z2 = true;
                        this.i0 = z2;
                        if (i2 == 29) {
                        }
                        z3 = false;
                        this.j0 = z3;
                        if (i2 <= 23) {
                        }
                        if (i2 <= 19) {
                        }
                        z4 = false;
                        this.k0 = z4;
                        if (i2 == 21) {
                        }
                        z5 = false;
                        this.l0 = z5;
                        if (i2 < 21) {
                        }
                        z6 = false;
                        this.m0 = z6;
                        qd81 qd81Var22222222 = this.Z;
                        if (i2 <= 18) {
                        }
                        z7 = false;
                        this.n0 = z7;
                        if (i2 <= 25) {
                        }
                        if (i2 <= 17) {
                        }
                        if (i2 <= 29) {
                        }
                        mf81.b.getClass();
                        decode = Base64.decode("QW1hem9u", 0);
                        charset = uza.a;
                        if (new String(decode, charset).equals(rf71.c)) {
                        }
                        z8 = false;
                        this.q0 = z8;
                        this.W.getClass();
                        mf81.b.getClass();
                        if (new String(Base64.decode("YzIuYW5kcm9pZC5tcDMuZGVjb2Rlcg==", 0), uza.a).equals(str)) {
                        }
                        if (this.g == 2) {
                        }
                        this.P0.a++;
                        u(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                    }
                }
            }
            i = 0;
            this.g0 = i;
            qd81 qd81Var32 = this.Z;
            if (i2 < 21) {
            }
            z = false;
            this.h0 = z;
            if (i2 >= 18) {
            }
            z2 = true;
            this.i0 = z2;
            if (i2 == 29) {
            }
            z3 = false;
            this.j0 = z3;
            if (i2 <= 23) {
            }
            if (i2 <= 19) {
            }
            z4 = false;
            this.k0 = z4;
            if (i2 == 21) {
            }
            z5 = false;
            this.l0 = z5;
            if (i2 < 21) {
            }
            z6 = false;
            this.m0 = z6;
            qd81 qd81Var222222222 = this.Z;
            if (i2 <= 18) {
            }
            z7 = false;
            this.n0 = z7;
            if (i2 <= 25) {
            }
            if (i2 <= 17) {
            }
            if (i2 <= 29) {
            }
            mf81.b.getClass();
            decode = Base64.decode("QW1hem9u", 0);
            charset = uza.a;
            if (new String(decode, charset).equals(rf71.c)) {
            }
            z8 = false;
            this.q0 = z8;
            this.W.getClass();
            mf81.b.getClass();
            if (new String(Base64.decode("YzIuYW5kcm9pZC5tcDMuZGVjb2Rlcg==", 0), uza.a).equals(str)) {
            }
            if (this.g == 2) {
            }
            this.P0.a++;
            u(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
        } catch (Throwable th) {
            dda1.h();
            throw th;
        }
    }

    public abstract void w(Exception exc);

    public abstract void x(String str);

    public abstract void y(qd81 qd81Var, MediaFormat mediaFormat);

    public void z(yh81 yh81Var) {
    }

    @Override // defpackage.gy61
    public final void a(qd81[] qd81VarArr, long j, long j2) {
        if (this.R0 == -9223372036854775807L) {
            if (this.Q0 == -9223372036854775807L) {
                this.Q0 = j;
                this.R0 = j2;
                return;
            } else {
                ny61.k();
                return;
            }
        }
        int i = this.S0;
        long[] jArr = this.N;
        if (i == jArr.length) {
            long j3 = jArr[i - 1];
            nba1.e();
        } else {
            this.S0 = i + 1;
        }
        int i2 = this.S0 - 1;
        this.M[i2] = j;
        jArr[i2] = j2;
        this.O[i2] = this.I0;
    }

    @Override // defpackage.gy61
    public void a(long j, boolean z) {
        int i;
        this.K0 = false;
        this.L0 = false;
        this.N0 = false;
        if (this.y0) {
            this.I.e();
            this.H.e();
            this.z0 = false;
        } else if (L()) {
            N();
        }
        t781 t781Var = this.J;
        synchronized (t781Var) {
            i = t781Var.d;
        }
        if (i > 0) {
            this.M0 = true;
        }
        this.J.b();
        int i2 = this.S0;
        if (i2 != 0) {
            int i3 = i2 - 1;
            this.R0 = this.N[i3];
            this.Q0 = this.M[i3];
            this.S0 = 0;
        }
    }

    @Override // defpackage.gy61
    public void a(float f, float f2) {
        this.U = f;
        this.V = f2;
        G();
    }

    @Override // defpackage.gy61
    public final int a(qd81 qd81Var) {
        try {
            return m(this.C, qd81Var);
        } catch (lj1 e) {
            throw this.a(e, qd81Var, false, 4002);
        }
    }
}
