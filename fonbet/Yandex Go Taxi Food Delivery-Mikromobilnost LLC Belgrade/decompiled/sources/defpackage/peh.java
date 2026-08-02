package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.mediacodec.BaseMediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes10.dex */
public abstract class peh extends a95 {
    public static final byte[] L0 = {0, 0, 1, 103, 66, DerValue.TAG_PRIVATE, PKIBody._KRP, -38, 37, -112, 0, 0, 1, 104, -50, PKIBody._CCP, 19, BlobHeaderStructure.BLOB_VERSION, 0, 0, 1, 101, -120, -124, PKIBody._RP, -50, Alerts.alert_bad_certificate_status_response, 24, -96, 0, Alerts.alert_illegal_parameter, -65, DerValue.tag_UniversalString, 49, -61, 39, 93, Alerts.alert_no_application_protocol};
    public final boolean A;
    public long A0;
    public final float B;
    public boolean B0;
    public final nyg C;
    public boolean C0;
    public final nyg D;
    public boolean D0;
    public final nyg E;
    public boolean E0;
    public final ef5 F;
    public kyg F0;
    public final MediaCodec.BufferInfo G;
    public b45 G0;
    public final ArrayDeque H;
    public long H0;
    public pb10 I;
    public boolean I0;
    public a J;
    public boolean J0;
    public MediaFormat K;
    public aac K0;
    public ArrayDeque L;
    public BaseMediaCodecRenderer$DecoderInitializationException M;
    public sb10 N;
    public MediaCrypto O;
    public final long P;
    public float Q;
    public float R;
    public ByteBuffer S;
    public ExoPlaybackException T;
    public boolean U;
    public boolean V;
    public float W;
    public boolean Z;
    public final rv60 a;
    public j a0;
    public a b;
    public long b0;
    public a c;
    public int c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public long j0;
    public int k0;
    public int l0;
    public ub10 m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public int t0;
    public int u0;
    public int v0;
    public jmm w;
    public boolean w0;
    public jmm x;
    public boolean x0;
    public final mb10 y;
    public boolean y0;
    public final xb10 z;
    public long z0;

    public peh(int i, mb10 mb10Var, xb10 xb10Var, boolean z, float f) {
        super(i);
        this.y = mb10Var;
        xb10Var.getClass();
        this.z = xb10Var;
        this.A = z;
        this.B = f;
        this.C = new nyg(0);
        this.D = new nyg(0);
        this.E = new nyg(2);
        ef5 ef5Var = new ef5();
        this.F = ef5Var;
        this.G = new MediaCodec.BufferInfo();
        this.Q = 1.0f;
        this.R = 1.0f;
        this.P = -9223372036854775807L;
        this.H = new ArrayDeque();
        this.G0 = b45.e;
        ef5Var.f(0);
        ef5Var.w.order(ByteOrder.nativeOrder());
        this.a = new rv60();
        this.W = -1.0f;
        this.c0 = 0;
        this.t0 = 0;
        this.k0 = -1;
        this.l0 = -1;
        this.j0 = -9223372036854775807L;
        this.z0 = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.b0 = -9223372036854775807L;
        this.u0 = 0;
        this.v0 = 0;
        this.F0 = new kyg();
        this.J0 = false;
        this.K0 = aac.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(sb10 sb10Var, MediaCrypto mediaCrypto) {
        int i;
        ub10 ub10Var;
        boolean equals;
        String stringId;
        LogSessionId unused;
        a aVar = this.b;
        aVar.getClass();
        String str = sb10Var.a;
        int i2 = tw21.a;
        float u = i2 < 23 ? -1.0f : u(this.R, getStreamFormats());
        float f = u > this.B ? u : -1.0f;
        ((o2x0) getClock()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        lb10 x = x(sb10Var, aVar, mediaCrypto, f);
        if (i2 >= 31) {
            LogSessionId a = getPlayerId().a();
            unused = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a.equals(LogSessionId.LOG_SESSION_ID_NONE);
            if (!equals) {
                MediaFormat mediaFormat = x.b;
                stringId = a.getStringId();
                mediaFormat.setString("log-session-id", stringId);
            }
        }
        try {
            Trace.beginSection("createCodec:" + str);
            mb10 mb10Var = this.y;
            pb10 o = (!(mb10Var instanceof xwo) || (ub10Var = this.m0) == null) ? mb10Var.o(x) : ((xwo) mb10Var).p(x, ub10Var);
            this.I = o;
            o.i(new sr4(3, this));
            Trace.endSection();
            ((o2x0) getClock()).getClass();
            float f2 = f;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!sb10Var.e(aVar)) {
                String c = a.c(aVar);
                Locale locale = Locale.US;
                lk91.j("Format exceeds selected codec's capabilities [" + c + Extension.FIX_SPACE + str + "]");
            }
            this.N = sb10Var;
            this.W = f2;
            this.J = aVar;
            if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i = 2;
                    this.c0 = i;
                    this.d0 = i2 != 29 && "c2.android.aac.decoder".equals(str);
                    this.e0 = (i2 > 23 && "OMX.google.vorbis.decoder".equals(str)) || (this.U && str.startsWith("OMX.amlogic.avc.decoder.awesome") && !str.contains("awesome2")) || (this.Z && str.startsWith("OMX.amlogic.avc.decoder.awesome2"));
                    this.f0 = i2 != 21 && "OMX.google.aac.decoder".equals(str);
                    String str3 = sb10Var.a;
                    this.i0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && sb10Var.g) || t());
                    this.I.getClass();
                    if (getState() == 2) {
                        ((o2x0) getClock()).getClass();
                        this.j0 = SystemClock.elapsedRealtime() + 1000;
                    }
                    this.F0.a++;
                    G(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                }
            }
            if (i2 < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                String str4 = Build.DEVICE;
                if ("flounder".equals(str4) || "flounder_lte".equals(str4) || "grouper".equals(str4) || "tilapia".equals(str4)) {
                    i = 1;
                    this.c0 = i;
                    this.d0 = i2 != 29 && "c2.android.aac.decoder".equals(str);
                    this.e0 = (i2 > 23 && "OMX.google.vorbis.decoder".equals(str)) || (this.U && str.startsWith("OMX.amlogic.avc.decoder.awesome") && !str.contains("awesome2")) || (this.Z && str.startsWith("OMX.amlogic.avc.decoder.awesome2"));
                    this.f0 = i2 != 21 && "OMX.google.aac.decoder".equals(str);
                    String str32 = sb10Var.a;
                    if (i2 <= 25) {
                        this.i0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str32)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str32) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str32) || "OMX.bcm.vdec.avc.tunnel".equals(str32) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str32) || "OMX.bcm.vdec.hevc.tunnel".equals(str32) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str32))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && sb10Var.g) || t());
                        this.I.getClass();
                        if (getState() == 2) {
                        }
                        this.F0.a++;
                        G(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                    }
                    this.i0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str32)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str32) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str32) || "OMX.bcm.vdec.avc.tunnel".equals(str32) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str32) || "OMX.bcm.vdec.hevc.tunnel".equals(str32) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str32))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && sb10Var.g) || t());
                    this.I.getClass();
                    if (getState() == 2) {
                    }
                    this.F0.a++;
                    G(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
                }
            }
            i = 0;
            this.c0 = i;
            this.d0 = i2 != 29 && "c2.android.aac.decoder".equals(str);
            this.e0 = (i2 > 23 && "OMX.google.vorbis.decoder".equals(str)) || (this.U && str.startsWith("OMX.amlogic.avc.decoder.awesome") && !str.contains("awesome2")) || (this.Z && str.startsWith("OMX.amlogic.avc.decoder.awesome2"));
            this.f0 = i2 != 21 && "OMX.google.aac.decoder".equals(str);
            String str322 = sb10Var.a;
            this.i0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str322)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str322) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str322) || "OMX.bcm.vdec.avc.tunnel".equals(str322) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str322) || "OMX.bcm.vdec.hevc.tunnel".equals(str322) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str322))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && sb10Var.g) || t());
            this.I.getClass();
            if (getState() == 2) {
            }
            this.F0.a++;
            G(elapsedRealtime2, elapsedRealtime2 - elapsedRealtime, str);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean B(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        a aVar = this.c;
        return (aVar != null && Objects.equals(aVar.n, "audio/opus") && xub1.e(j, j2)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r7 != 4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008a, code lost:
    
        if (r2.getError() != null) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C() {
        a aVar;
        MediaCrypto mediaCrypto;
        if (this.I != null || this.p0 || (aVar = this.b) == null) {
            return;
        }
        String str = aVar.n;
        boolean z = true;
        if (this.x == null && b0(aVar)) {
            l();
            boolean equals = "audio/mp4a-latm".equals(str);
            ef5 ef5Var = this.F;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                ef5Var.getClass();
                ef5Var.D = 32;
            } else {
                ef5Var.getClass();
                ef5Var.D = 1;
            }
            this.p0 = true;
            return;
        }
        W(this.x);
        if (this.w != null) {
            d6z.x(this.O == null);
            jmm jmmVar = this.w;
            rcf b = jmmVar.b();
            if (pfs.c && (b instanceof pfs)) {
                int state = jmmVar.getState();
                if (state == 1) {
                    DrmSession$DrmSessionException error = jmmVar.getError();
                    error.getClass();
                    throw createRendererException(error, this.b, error.errorCode);
                }
            }
            if (b != null) {
                if (b instanceof pfs) {
                    pfs pfsVar = (pfs) b;
                    try {
                        this.O = new MediaCrypto(pfsVar.a, pfsVar.b);
                    } catch (MediaCryptoException e) {
                        throw createRendererException(e, this.b, 6006);
                    }
                }
            }
        }
        try {
            jmm jmmVar2 = this.w;
            if (jmmVar2 != null) {
                if (jmmVar2.getState() != 3) {
                    if (this.w.getState() == 4) {
                    }
                }
                jmm jmmVar3 = this.w;
                d6z.z(str);
                if (jmmVar3.i(str)) {
                    D(this.O, z);
                    mediaCrypto = this.O;
                    if (mediaCrypto == null && this.I == null) {
                        mediaCrypto.release();
                        this.O = null;
                        return;
                    }
                }
            }
            z = false;
            D(this.O, z);
            mediaCrypto = this.O;
            if (mediaCrypto == null) {
            }
        } catch (BaseMediaCodecRenderer$DecoderInitializationException e2) {
            throw createRendererException(e2, aVar, 4001);
        }
    }

    public final void D(MediaCrypto mediaCrypto, boolean z) {
        aac aacVar = this.K0;
        boolean z2 = this.J0;
        boolean z3 = this.A;
        int i = 0;
        ArrayDeque arrayDeque = null;
        if (!z2 && !aacVar.a) {
            a aVar = this.b;
            aVar.getClass();
            if (this.L == null) {
                try {
                    List r = r(z);
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.L = arrayDeque2;
                    if (z3) {
                        arrayDeque2.addAll(r);
                    } else {
                        ArrayList arrayList = (ArrayList) r;
                        if (!arrayList.isEmpty()) {
                            this.L.add((sb10) arrayList.get(0));
                        }
                    }
                    this.M = null;
                } catch (MediaCodecUtil$DecoderQueryException e) {
                    throw new BaseMediaCodecRenderer$DecoderInitializationException(aVar, e, z, -49998);
                }
            }
            if (this.L.isEmpty()) {
                throw new BaseMediaCodecRenderer$DecoderInitializationException(aVar, (MediaCodecUtil$DecoderQueryException) null, z, -49999);
            }
            ArrayDeque arrayDeque3 = this.L;
            arrayDeque3.getClass();
            while (this.I == null) {
                sb10 sb10Var = (sb10) arrayDeque3.peekFirst();
                sb10Var.getClass();
                if (!E(aVar) || !a0(sb10Var)) {
                    return;
                }
                try {
                    A(sb10Var, mediaCrypto);
                } catch (Exception e2) {
                    lk91.k("Failed to initialize decoder: " + sb10Var, e2);
                    arrayDeque3.removeFirst();
                    BaseMediaCodecRenderer$DecoderInitializationException baseMediaCodecRenderer$DecoderInitializationException = new BaseMediaCodecRenderer$DecoderInitializationException(aVar, e2, z, sb10Var);
                    F(baseMediaCodecRenderer$DecoderInitializationException);
                    if (this.M == null) {
                        this.M = baseMediaCodecRenderer$DecoderInitializationException;
                    } else {
                        BaseMediaCodecRenderer$DecoderInitializationException baseMediaCodecRenderer$DecoderInitializationException2 = this.M;
                        this.M = new BaseMediaCodecRenderer$DecoderInitializationException(baseMediaCodecRenderer$DecoderInitializationException2.getMessage(), baseMediaCodecRenderer$DecoderInitializationException2.getCause(), baseMediaCodecRenderer$DecoderInitializationException2.mimeType, baseMediaCodecRenderer$DecoderInitializationException2.secureDecoderRequired, baseMediaCodecRenderer$DecoderInitializationException2.codecInfo, baseMediaCodecRenderer$DecoderInitializationException2.diagnosticInfo, baseMediaCodecRenderer$DecoderInitializationException);
                    }
                    if (arrayDeque3.isEmpty()) {
                        throw this.M;
                    }
                }
            }
            this.L = null;
            return;
        }
        if (this.L == null) {
            try {
                List r2 = r(z);
                ArrayDeque arrayDeque4 = new ArrayDeque();
                this.L = arrayDeque4;
                if (z3) {
                    arrayDeque4.addAll(r2);
                } else {
                    ArrayList arrayList2 = (ArrayList) r2;
                    if (!arrayList2.isEmpty()) {
                        this.L.add((sb10) arrayList2.get(0));
                    }
                }
                this.M = null;
            } catch (MediaCodecUtil$DecoderQueryException e3) {
                throw new BaseMediaCodecRenderer$DecoderInitializationException(this.b, e3, z, -49998);
            }
        }
        if (this.L.isEmpty()) {
            throw new BaseMediaCodecRenderer$DecoderInitializationException(this.b, (MediaCodecUtil$DecoderQueryException) null, z, -49999);
        }
        sb10 sb10Var2 = (sb10) this.L.peekFirst();
        while (this.I == null) {
            sb10 sb10Var3 = (sb10) this.L.peekFirst();
            if (!a0(sb10Var3)) {
                return;
            }
            try {
                A(sb10Var3, mediaCrypto);
            } catch (Exception e4) {
                e = e4;
                try {
                    if (!aacVar.a || sb10Var3 != sb10Var2) {
                        throw e;
                    }
                    int i2 = i;
                    int i3 = i2;
                    while (aacVar.b > i2) {
                        i2++;
                        boolean z4 = aacVar.d;
                        long j = aacVar.c;
                        if (z4) {
                            Thread.sleep(j * i2);
                        } else {
                            Thread.sleep(j);
                        }
                        try {
                            A(sb10Var3, mediaCrypto);
                            i3 = 1;
                        } catch (Exception e5) {
                            e = e5;
                        }
                    }
                    if (i3 == 0) {
                        throw e;
                    }
                } catch (Exception e6) {
                    lk91.k("Failed to initialize decoder: " + sb10Var3, e6);
                    this.L.removeFirst();
                    BaseMediaCodecRenderer$DecoderInitializationException baseMediaCodecRenderer$DecoderInitializationException3 = new BaseMediaCodecRenderer$DecoderInitializationException(this.b, e6, z, sb10Var3);
                    F(baseMediaCodecRenderer$DecoderInitializationException3);
                    BaseMediaCodecRenderer$DecoderInitializationException baseMediaCodecRenderer$DecoderInitializationException4 = this.M;
                    if (baseMediaCodecRenderer$DecoderInitializationException4 == null) {
                        this.M = baseMediaCodecRenderer$DecoderInitializationException3;
                    } else {
                        this.M = new BaseMediaCodecRenderer$DecoderInitializationException(baseMediaCodecRenderer$DecoderInitializationException4.getMessage(), baseMediaCodecRenderer$DecoderInitializationException4.getCause(), baseMediaCodecRenderer$DecoderInitializationException4.mimeType, baseMediaCodecRenderer$DecoderInitializationException4.secureDecoderRequired, baseMediaCodecRenderer$DecoderInitializationException4.codecInfo, baseMediaCodecRenderer$DecoderInitializationException4.diagnosticInfo, baseMediaCodecRenderer$DecoderInitializationException3);
                    }
                    if (this.L.isEmpty()) {
                        throw this.M;
                    }
                }
            }
            i = 0;
            arrayDeque = null;
        }
        this.L = arrayDeque;
    }

    public boolean E(a aVar) {
        return true;
    }

    public abstract void F(Exception exc);

    public abstract void G(long j, long j2, String str);

    public abstract void H(String str);

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0153, code lost:
    
        if (m() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
    
        if (r4.i(r2) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0110, code lost:
    
        if (m() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0141, code lost:
    
        if (m() == false) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qyg I(o7s o7sVar) {
        a aVar;
        rcf b;
        rcf b2;
        boolean z = true;
        this.D0 = true;
        a aVar2 = o7sVar.b;
        aVar2.getClass();
        String str = aVar2.n;
        if (str == null) {
            throw createRendererException(new IllegalArgumentException("Sample MIME type is null."), aVar2, 4005);
        }
        if (!str.equals("video/av01") || aVar2.q.isEmpty()) {
            aVar = aVar2;
        } else {
            f7s a = aVar2.a();
            a.p = null;
            aVar = new a(a);
        }
        jmm jmmVar = o7sVar.a;
        jmm.c(this.x, jmmVar);
        this.x = jmmVar;
        this.b = aVar;
        if (this.p0) {
            this.r0 = true;
            return null;
        }
        pb10 pb10Var = this.I;
        if (pb10Var == null) {
            this.L = null;
            C();
            return null;
        }
        sb10 sb10Var = this.N;
        sb10Var.getClass();
        a aVar3 = this.J;
        aVar3.getClass();
        jmm jmmVar2 = this.w;
        jmm jmmVar3 = this.x;
        int i = 2;
        if (jmmVar2 != jmmVar3) {
            if (jmmVar3 != null && jmmVar2 != null && (b = jmmVar3.b()) != null && (b2 = jmmVar2.b()) != null && b.getClass().equals(b2.getClass())) {
                if (b instanceof pfs) {
                    if (jmmVar3.f().equals(jmmVar2.f()) && tw21.a >= 23) {
                        UUID uuid = b87.e;
                        if (!uuid.equals(jmmVar2.f()) && !uuid.equals(jmmVar3.f())) {
                            if (!sb10Var.g) {
                                if (jmmVar3.getState() != 2) {
                                    if (jmmVar3.getState() == 3 || jmmVar3.getState() == 4) {
                                        String str2 = aVar.n;
                                        str2.getClass();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.w0) {
                this.u0 = 1;
                this.v0 = 3;
            } else {
                S();
                C();
            }
            return new qyg(sb10Var.a, aVar3, aVar, 0, 128);
        }
        boolean z2 = this.x != this.w;
        d6z.x(!z2 || tw21.a >= 23);
        qyg j = j(sb10Var, aVar3, aVar);
        int i2 = j.d;
        if (i2 != 0) {
            if (i2 == 1) {
                if (d0(aVar)) {
                    this.J = aVar;
                    if (!z2) {
                        if (this.w0) {
                            this.u0 = 1;
                            if (this.e0) {
                                this.v0 = 3;
                            } else {
                                this.v0 = 1;
                            }
                        }
                    }
                }
                i = 16;
            } else if (i2 == 2) {
                if (d0(aVar)) {
                    this.s0 = true;
                    this.t0 = 1;
                    int i3 = this.c0;
                    if (i3 != 2 && (i3 != 1 || aVar.u != aVar3.u || aVar.v != aVar3.v)) {
                        z = false;
                    }
                    this.g0 = z;
                    this.J = aVar;
                    if (z2) {
                    }
                }
                i = 16;
            } else {
                if (i2 != 3) {
                    ny61.k();
                    return null;
                }
                if (d0(aVar)) {
                    this.J = aVar;
                    if (z2) {
                    }
                }
                i = 16;
            }
            return i2 == 0 ? (this.I != pb10Var || this.v0 == 3) ? new qyg(sb10Var.a, aVar3, aVar, 0, i) : j : j;
        }
        if (this.w0) {
            this.u0 = 1;
            this.v0 = 3;
        } else {
            S();
            C();
        }
        i = 0;
        if (i2 == 0) {
        }
    }

    public abstract void J(a aVar, MediaFormat mediaFormat);

    public void K() {
    }

    public void L(long j) {
        this.H0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.H;
            if (arrayDeque.isEmpty() || j < ((b45) arrayDeque.peek()).a) {
                return;
            }
            b45 b45Var = (b45) arrayDeque.poll();
            b45Var.getClass();
            X(b45Var);
            M();
        }
    }

    public abstract void M();

    public void N(nyg nygVar) {
    }

    public void O(j jVar) {
    }

    public final void P() {
        int i = this.v0;
        if (i == 1) {
            p();
            return;
        }
        if (i == 2) {
            p();
            e0();
        } else if (i != 3) {
            this.C0 = true;
            T();
        } else {
            S();
            C();
        }
    }

    public abstract boolean Q(long j, long j2, pb10 pb10Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, a aVar);

    public final boolean R(int i) {
        o7s formatHolder = getFormatHolder();
        nyg nygVar = this.C;
        nygVar.d();
        int readSource = readSource(formatHolder, nygVar, i | 4);
        if (readSource == -5) {
            I(formatHolder);
            return true;
        }
        if (readSource != -4 || !nygVar.b(4)) {
            return false;
        }
        this.B0 = true;
        P();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void S() {
        try {
            Trace.beginSection("releaseCodec");
            pb10 pb10Var = this.I;
            if (pb10Var != null) {
                pb10Var.release();
                this.F0.b++;
                sb10 sb10Var = this.N;
                sb10Var.getClass();
                H(sb10Var.a);
            }
            this.I = null;
            try {
                MediaCrypto mediaCrypto = this.O;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.I = null;
            try {
                MediaCrypto mediaCrypto2 = this.O;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public abstract void T();

    public void U() {
        this.k0 = -1;
        this.D.w = null;
        this.l0 = -1;
        this.S = null;
        this.j0 = -9223372036854775807L;
        this.x0 = false;
        this.b0 = -9223372036854775807L;
        this.w0 = false;
        this.g0 = false;
        this.h0 = false;
        this.n0 = false;
        this.o0 = false;
        this.z0 = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.u0 = 0;
        this.v0 = 0;
        this.t0 = this.s0 ? 1 : 0;
    }

    public final void V() {
        U();
        this.T = null;
        this.L = null;
        this.N = null;
        this.J = null;
        this.K = null;
        this.V = false;
        this.y0 = false;
        this.W = -1.0f;
        this.c0 = 0;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.i0 = false;
        this.s0 = false;
        this.t0 = 0;
    }

    public final void W(jmm jmmVar) {
        jmm.c(this.w, jmmVar);
        this.w = jmmVar;
    }

    public final void X(b45 b45Var) {
        this.G0 = b45Var;
        if (b45Var.c != -9223372036854775807L) {
            this.I0 = true;
            K();
        }
    }

    public final boolean Y(long j) {
        long j2 = this.P;
        if (j2 == -9223372036854775807L) {
            return true;
        }
        ((o2x0) getClock()).getClass();
        return SystemClock.elapsedRealtime() - j < j2;
    }

    public boolean Z(nyg nygVar) {
        return false;
    }

    public abstract boolean a0(sb10 sb10Var);

    public boolean b0(a aVar) {
        return false;
    }

    public abstract int c0(xb10 xb10Var, a aVar);

    public final boolean d0(a aVar) {
        if (tw21.a >= 23 && this.I != null && this.v0 != 3 && getState() != 0) {
            float f = this.R;
            aVar.getClass();
            float u = u(f, getStreamFormats());
            float f2 = this.W;
            if (f2 != u) {
                if (u == -1.0f) {
                    if (this.w0) {
                        this.u0 = 1;
                        this.v0 = 3;
                        return false;
                    }
                    S();
                    C();
                    return false;
                }
                if (f2 != -1.0f || u > this.B) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", u);
                    pb10 pb10Var = this.I;
                    pb10Var.getClass();
                    pb10Var.setParameters(bundle);
                    this.W = u;
                }
            }
        }
        return true;
    }

    public final void e0() {
        rcf b = this.x.b();
        if (b instanceof pfs) {
            try {
                MediaCrypto mediaCrypto = this.O;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((pfs) b).b);
            } catch (MediaCryptoException e) {
                throw createRendererException(e, this.b, 6006);
            }
        }
        W(this.x);
        this.u0 = 0;
        this.v0 = 0;
    }

    public final void f0(long j) {
        a aVar = (a) this.G0.d.f(j);
        if (aVar == null && this.I0 && this.K != null) {
            aVar = (a) this.G0.d.e();
        }
        if (aVar != null) {
            this.c = aVar;
        } else if (!this.V || this.c == null) {
            return;
        }
        a aVar2 = this.c;
        aVar2.getClass();
        J(aVar2, this.K);
        this.V = false;
        this.I0 = false;
    }

    public final void g0(IllegalStateException illegalStateException) {
        F(illegalStateException);
        boolean z = (illegalStateException instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        if (z) {
            S();
        }
        MediaCodecDecoderException k = k(illegalStateException, this.N);
        throw createRendererException(k, this.b, z, k.errorCode == 1101 ? 4006 : 4003);
    }

    @Override // defpackage.fyi0
    public final long getDurationToProgressUs(long j, long j2) {
        return w(j, j2);
    }

    @Override // defpackage.a95, defpackage.xyc0
    public void handleMessage(int i, Object obj) {
        if (i != 11) {
            super.handleMessage(i, obj);
            return;
        }
        j jVar = (j) obj;
        jVar.getClass();
        this.a0 = jVar;
        O(jVar);
    }

    public final boolean i(long j, long j2) {
        ef5 ef5Var;
        d6z.x(!this.C0);
        ef5 ef5Var2 = this.F;
        if (ef5Var2.l()) {
            ByteBuffer byteBuffer = ef5Var2.w;
            int i = this.l0;
            int i2 = ef5Var2.C;
            long j3 = ef5Var2.y;
            boolean B = B(getLastResetPositionUs(), ef5Var2.B);
            boolean b = ef5Var2.b(4);
            a aVar = this.c;
            aVar.getClass();
            ef5Var = ef5Var2;
            if (!Q(j, j2, null, byteBuffer, i, 0, i2, j3, B, b, aVar)) {
                return false;
            }
            L(ef5Var.B);
            ef5Var.d();
        } else {
            ef5Var = ef5Var2;
        }
        if (this.B0) {
            this.C0 = true;
            return false;
        }
        boolean z = this.q0;
        nyg nygVar = this.E;
        if (z) {
            d6z.x(ef5Var.k(nygVar));
            this.q0 = false;
        }
        if (this.r0) {
            if (ef5Var.l()) {
                return true;
            }
            l();
            this.r0 = false;
            C();
            if (!this.p0) {
                return false;
            }
        }
        d6z.x(!this.B0);
        o7s formatHolder = getFormatHolder();
        nygVar.d();
        do {
            nygVar.d();
            int readSource = readSource(formatHolder, nygVar, 0);
            if (readSource == -5) {
                I(formatHolder);
                break;
            }
            if (readSource == -4) {
                if (!nygVar.b(4)) {
                    this.z0 = Math.max(this.z0, nygVar.y);
                    if (hasReadStreamToEnd() || this.D.b(536870912)) {
                        this.A0 = this.z0;
                    }
                    if (this.D0) {
                        a aVar2 = this.b;
                        aVar2.getClass();
                        this.c = aVar2;
                        if (Objects.equals(aVar2.n, "audio/opus") && !this.c.q.isEmpty()) {
                            int d = xub1.d((byte[]) this.c.q.get(0));
                            f7s a = this.c.a();
                            a.F = d;
                            this.c = new a(a);
                        }
                        J(this.c, null);
                        this.D0 = false;
                    }
                    nygVar.j();
                    a aVar3 = this.c;
                    if (aVar3 != null && Objects.equals(aVar3.n, "audio/opus")) {
                        if (nygVar.b(SelfTester_JCP.IMITA)) {
                            nygVar.b = this.c;
                            z(nygVar);
                        }
                        if (xub1.e(getLastResetPositionUs(), nygVar.y)) {
                            this.a.a(nygVar, this.c.q);
                        }
                    }
                    if (ef5Var.l()) {
                        long lastResetPositionUs = getLastResetPositionUs();
                        if (B(lastResetPositionUs, ef5Var.B) != B(lastResetPositionUs, nygVar.y)) {
                            break;
                        }
                    }
                } else {
                    this.B0 = true;
                    this.A0 = this.z0;
                    break;
                }
            } else {
                if (readSource != -3) {
                    ny61.k();
                    return false;
                }
                if (hasReadStreamToEnd()) {
                    this.A0 = this.z0;
                }
            }
        } while (ef5Var.k(nygVar));
        this.q0 = true;
        if (ef5Var.l()) {
            ef5Var.j();
        }
        return ef5Var.l() || this.B0 || this.r0;
    }

    @Override // defpackage.fyi0
    public boolean isReady() {
        if (this.b == null) {
            return false;
        }
        if (isSourceReady() || this.l0 >= 0) {
            return true;
        }
        if (this.j0 == -9223372036854775807L) {
            return false;
        }
        ((o2x0) getClock()).getClass();
        return SystemClock.elapsedRealtime() < this.j0;
    }

    public abstract qyg j(sb10 sb10Var, a aVar, a aVar2);

    public MediaCodecDecoderException k(IllegalStateException illegalStateException, sb10 sb10Var) {
        return new MediaCodecDecoderException(illegalStateException, sb10Var);
    }

    public final void l() {
        this.r0 = false;
        this.F.d();
        this.E.d();
        this.q0 = false;
        this.p0 = false;
        rv60 rv60Var = this.a;
        rv60Var.getClass();
        rv60Var.a = og3.a;
        rv60Var.c = 0;
        rv60Var.b = 2;
    }

    public final boolean m() {
        if (!this.w0) {
            e0();
            return true;
        }
        this.u0 = 1;
        if (this.e0) {
            this.v0 = 3;
            return false;
        }
        this.v0 = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(long j, long j2) {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean Q;
        ByteBuffer byteBuffer;
        int i;
        int i2;
        long j3;
        boolean z3;
        boolean z4;
        a aVar;
        int s;
        pb10 pb10Var = this.I;
        pb10Var.getClass();
        int i3 = this.l0;
        MediaCodec.BufferInfo bufferInfo2 = this.G;
        if (i3 < 0) {
            try {
                if (this.f0) {
                    try {
                        if (this.x0) {
                            Trace.beginSection("dequeueOutputBufferIndex");
                            s = pb10Var.s(bufferInfo2);
                            if (s >= 0) {
                                if (s == -2) {
                                    this.y0 = true;
                                    pb10 pb10Var2 = this.I;
                                    pb10Var2.getClass();
                                    MediaFormat outputFormat = pb10Var2.getOutputFormat();
                                    if (this.c0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                                        this.h0 = true;
                                        return true;
                                    }
                                    this.K = outputFormat;
                                    this.V = true;
                                    return true;
                                }
                                if (this.i0 && (this.B0 || this.u0 == 2)) {
                                    P();
                                }
                                long j4 = this.b0;
                                if (j4 != -9223372036854775807L) {
                                    long j5 = j4 + 100;
                                    ((o2x0) getClock()).getClass();
                                    if (j5 < System.currentTimeMillis()) {
                                        P();
                                        return false;
                                    }
                                }
                                return false;
                            }
                            if (this.h0) {
                                this.h0 = false;
                                pb10Var.b(s);
                                return true;
                            }
                            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                                P();
                                return false;
                            }
                            this.l0 = s;
                            ByteBuffer outputBuffer = pb10Var.getOutputBuffer(s);
                            this.S = outputBuffer;
                            if (outputBuffer != null) {
                                outputBuffer.position(bufferInfo2.offset);
                                this.S.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            this.n0 = bufferInfo2.presentationTimeUs < getLastResetPositionUs();
                            long j6 = this.A0;
                            this.o0 = j6 != -9223372036854775807L && j6 <= bufferInfo2.presentationTimeUs;
                            f0(bufferInfo2.presentationTimeUs);
                        }
                    } catch (IllegalStateException unused) {
                        P();
                        if (this.C0) {
                            S();
                        }
                        return false;
                    } finally {
                    }
                }
                Trace.beginSection("dequeueOutputBufferIndex");
                s = pb10Var.s(bufferInfo2);
                if (s >= 0) {
                }
            } finally {
            }
        }
        if (this.f0 && this.x0) {
            try {
                try {
                    Trace.beginSection("processOutputBuffer");
                    byteBuffer = this.S;
                    i = this.l0;
                    i2 = bufferInfo2.flags;
                    j3 = bufferInfo2.presentationTimeUs;
                    z3 = this.n0;
                    z4 = this.o0;
                    aVar = this.c;
                    aVar.getClass();
                    z = false;
                    z2 = true;
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    z = false;
                }
                try {
                    Q = Q(j, j2, pb10Var, byteBuffer, i, i2, 1, j3, z3, z4, aVar);
                } catch (IllegalStateException unused3) {
                    P();
                    if (this.C0) {
                        S();
                    }
                    return z;
                }
            } finally {
            }
        } else {
            z = false;
            z2 = true;
            bufferInfo = bufferInfo2;
            try {
                Trace.beginSection("processOutputBuffer");
                ByteBuffer byteBuffer2 = this.S;
                int i4 = this.l0;
                int i5 = bufferInfo.flags;
                long j7 = bufferInfo.presentationTimeUs;
                boolean z5 = this.n0;
                boolean z6 = this.o0;
                a aVar2 = this.c;
                aVar2.getClass();
                Q = Q(j, j2, pb10Var, byteBuffer2, i4, i5, 1, j7, z5, z6, aVar2);
            } finally {
            }
        }
        if (!Q) {
            return z;
        }
        L(bufferInfo.presentationTimeUs);
        boolean z7 = (bufferInfo.flags & 4) != 0 ? z2 : z;
        if (!z7 && this.x0 && this.o0) {
            ((o2x0) getClock()).getClass();
            this.b0 = System.currentTimeMillis();
        }
        this.l0 = -1;
        this.S = null;
        if (!z7) {
            return z2;
        }
        P();
        return z;
    }

    public final boolean o() {
        pb10 pb10Var = this.I;
        if (pb10Var != null && this.u0 != 2 && !this.B0) {
            int i = this.k0;
            nyg nygVar = this.D;
            if (i < 0) {
                int y = pb10Var.y();
                this.k0 = y;
                if (y >= 0) {
                    nygVar.w = pb10Var.getInputBuffer(y);
                    nygVar.d();
                }
            }
            if (this.u0 == 1) {
                if (!this.i0) {
                    this.x0 = true;
                    pb10Var.a(this.k0, 0, 0L, 4);
                    this.k0 = -1;
                    nygVar.w = null;
                }
                this.u0 = 2;
                return false;
            }
            if (this.g0) {
                this.g0 = false;
                ByteBuffer byteBuffer = nygVar.w;
                byteBuffer.getClass();
                byteBuffer.put(L0);
                pb10Var.a(this.k0, 38, 0L, 0);
                this.k0 = -1;
                nygVar.w = null;
                this.w0 = true;
                return true;
            }
            if (this.t0 == 1) {
                int i2 = 0;
                while (true) {
                    a aVar = this.J;
                    aVar.getClass();
                    if (i2 >= aVar.q.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.J.q.get(i2);
                    ByteBuffer byteBuffer2 = nygVar.w;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i2++;
                }
                this.t0 = 2;
            }
            ByteBuffer byteBuffer3 = nygVar.w;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            o7s formatHolder = getFormatHolder();
            try {
                int readSource = readSource(formatHolder, nygVar, 0);
                if (readSource == -3) {
                    if (hasReadStreamToEnd()) {
                        this.A0 = this.z0;
                        return false;
                    }
                } else {
                    if (readSource == -5) {
                        if (this.t0 == 2) {
                            nygVar.d();
                            this.t0 = 1;
                        }
                        I(formatHolder);
                        return true;
                    }
                    if (!nygVar.b(4)) {
                        if (!this.w0 && !nygVar.b(1)) {
                            nygVar.d();
                            if (this.t0 == 2) {
                                this.t0 = 1;
                                return true;
                            }
                        } else if (!Z(nygVar)) {
                            boolean b = nygVar.b(1073741824);
                            if (b) {
                                ucf ucfVar = nygVar.c;
                                if (position == 0) {
                                    ucfVar.getClass();
                                } else {
                                    if (ucfVar.d == null) {
                                        int[] iArr = new int[1];
                                        ucfVar.d = iArr;
                                        ucfVar.i.numBytesOfClearData = iArr;
                                    }
                                    int[] iArr2 = ucfVar.d;
                                    iArr2[0] = iArr2[0] + position;
                                }
                            }
                            long j = nygVar.y;
                            if (this.D0) {
                                ArrayDeque arrayDeque = this.H;
                                if (arrayDeque.isEmpty()) {
                                    w8z0 w8z0Var = this.G0.d;
                                    a aVar2 = this.b;
                                    aVar2.getClass();
                                    w8z0Var.a(j, aVar2);
                                } else {
                                    w8z0 w8z0Var2 = ((b45) arrayDeque.peekLast()).d;
                                    a aVar3 = this.b;
                                    aVar3.getClass();
                                    w8z0Var2.a(j, aVar3);
                                }
                                this.D0 = false;
                            }
                            this.z0 = Math.max(this.z0, j);
                            if (hasReadStreamToEnd() || nygVar.b(536870912)) {
                                this.A0 = this.z0;
                            }
                            nygVar.j();
                            if (nygVar.b(SelfTester_JCP.IMITA)) {
                                z(nygVar);
                            }
                            N(nygVar);
                            int s = s(nygVar);
                            if (b) {
                                Trace.beginSection("queueSecureInputBuffer");
                                pb10Var.f(this.k0, nygVar.c, j, s);
                            } else {
                                Trace.beginSection("queueInputBuffer");
                                int i3 = this.k0;
                                ByteBuffer byteBuffer4 = nygVar.w;
                                byteBuffer4.getClass();
                                pb10Var.a(i3, byteBuffer4.limit(), j, s);
                            }
                            Trace.endSection();
                            this.k0 = -1;
                            nygVar.w = null;
                            this.w0 = true;
                            this.t0 = 0;
                            this.F0.c++;
                            return true;
                        }
                        return true;
                    }
                    this.A0 = this.z0;
                    if (this.t0 == 2) {
                        nygVar.d();
                        this.t0 = 1;
                    }
                    this.B0 = true;
                    if (!this.w0) {
                        P();
                        return false;
                    }
                    if (!this.i0) {
                        this.x0 = true;
                        Trace.beginSection("queueEosBuffer");
                        pb10Var.a(this.k0, 0, 0L, 4);
                        this.k0 = -1;
                        nygVar.w = null;
                        Trace.endSection();
                        return false;
                    }
                }
            } catch (DecoderInputBuffer$InsufficientCapacityException e) {
                F(e);
                R(0);
                p();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.a95
    public void onDisabled() {
        this.b = null;
        X(b45.e);
        this.H.clear();
        q();
    }

    @Override // defpackage.a95
    public void onEnabled(boolean z, boolean z2) {
        this.F0 = new kyg();
    }

    @Override // defpackage.a95
    public void onPositionReset(long j, boolean z) {
        this.B0 = false;
        this.C0 = false;
        this.E0 = false;
        if (this.p0) {
            this.F.d();
            this.E.d();
            this.q0 = false;
            rv60 rv60Var = this.a;
            rv60Var.getClass();
            rv60Var.a = og3.a;
            rv60Var.c = 0;
            rv60Var.b = 2;
        } else if (q()) {
            C();
        }
        if (this.G0.d.h() > 0) {
            this.D0 = true;
        }
        this.G0.d.b();
        this.H.clear();
    }

    @Override // defpackage.a95
    public void onReset() {
        try {
            l();
            S();
        } finally {
            jmm.c(this.x, null);
            this.x = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // defpackage.a95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStreamChanged(a[] aVarArr, long j, long j2, sf10 sf10Var) {
        if (this.G0.c == -9223372036854775807L) {
            X(new b45(-9223372036854775807L, j, j2));
            return;
        }
        ArrayDeque arrayDeque = this.H;
        if (arrayDeque.isEmpty()) {
            long j3 = this.z0;
            if (j3 != -9223372036854775807L) {
                long j4 = this.H0;
                if (j4 != -9223372036854775807L) {
                }
            }
            X(new b45(-9223372036854775807L, j, j2));
            if (this.G0.c != -9223372036854775807L) {
                M();
                return;
            }
            return;
        }
        arrayDeque.add(new b45(this.z0, j, j2));
    }

    public final void p() {
        try {
            pb10 pb10Var = this.I;
            d6z.z(pb10Var);
            pb10Var.flush();
        } finally {
            U();
        }
    }

    public boolean q() {
        if (this.I == null) {
            return false;
        }
        int i = this.v0;
        if (i == 3 || ((this.d0 && !this.y0) || (this.e0 && this.x0))) {
            S();
            return true;
        }
        if (i == 2) {
            int i2 = tw21.a;
            d6z.x(i2 >= 23);
            if (i2 >= 23) {
                try {
                    e0();
                } catch (ExoPlaybackException e) {
                    lk91.k("Failed to update the DRM session, releasing the codec instead.", e);
                    S();
                    return true;
                }
            }
        }
        p();
        return false;
    }

    public final List r(boolean z) {
        a aVar = this.b;
        aVar.getClass();
        xb10 xb10Var = this.z;
        ArrayList v = v(xb10Var, aVar, z);
        if (!v.isEmpty() || !z) {
            return v;
        }
        ArrayList v2 = v(xb10Var, aVar, false);
        if (!v2.isEmpty()) {
            lk91.j("Drm session requires secure decoder for " + aVar.n + ", but no secure decoder available. Trying to proceed with " + v2 + Extension.DOT_CHAR);
        }
        return v2;
    }

    @Override // defpackage.fyi0
    public void render(long j, long j2) {
        if (this.E0) {
            this.E0 = false;
            P();
        }
        ExoPlaybackException exoPlaybackException = this.T;
        if (exoPlaybackException != null) {
            this.T = null;
            throw exoPlaybackException;
        }
        try {
            if (this.C0) {
                T();
                return;
            }
            if (this.b != null || R(2)) {
                C();
                if (this.p0) {
                    Trace.beginSection("bypassRender");
                    while (i(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.I != null) {
                    ((o2x0) getClock()).getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainOutput");
                    while (n(j, j2) && Y(elapsedRealtime)) {
                    }
                    Trace.endSection();
                    Trace.beginSection("feedInput");
                    while (o() && Y(elapsedRealtime)) {
                    }
                    Trace.endSection();
                } else {
                    this.F0.d += skipSource(j);
                    R(1);
                }
                synchronized (this.F0) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw createRendererException(e, this.b, tw21.A(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            y(e2);
        }
    }

    public int s(nyg nygVar) {
        return 0;
    }

    @Override // defpackage.fyi0
    public void setPlaybackSpeed(float f, float f2) {
        this.Q = f;
        this.R = f2;
        d0(this.J);
    }

    @Override // defpackage.iyi0
    public final int supportsFormat(a aVar) {
        try {
            return c0(this.z, aVar);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw this.createRendererException(e, aVar, 4002);
        }
    }

    @Override // defpackage.a95, defpackage.iyi0
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public boolean t() {
        return false;
    }

    public abstract float u(float f, a[] aVarArr);

    public abstract ArrayList v(xb10 xb10Var, a aVar, boolean z);

    public long w(long j, long j2) {
        return 10000L;
    }

    public abstract lb10 x(sb10 sb10Var, a aVar, MediaCrypto mediaCrypto, float f);

    public void y(IllegalStateException illegalStateException) {
        if (!(illegalStateException instanceof MediaCodec.CodecException)) {
            StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
            if (stackTrace.length <= 0) {
                throw illegalStateException;
            }
            if (!stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                throw illegalStateException;
            }
        }
        g0(illegalStateException);
        throw null;
    }

    public abstract void z(nyg nygVar);
}
