package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class zb0 implements jl {
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public bl[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public ql X;
    public boolean Y;
    public long Z;
    public final uk a;
    public boolean a0;
    public final sb0 b;
    public boolean b0;
    public final boolean c;
    public final st d;
    public final ca3 e;
    public final bl[] f;
    public final bl[] g;
    public final vy h;
    public final ol i;
    public final ArrayDeque j;
    public final boolean k;
    public final int l;
    public yb0 m;
    public final vb0 n;
    public final vb0 o;
    public final bc0 p;
    public zf2 q;
    public gl r;
    public rb0 s;
    public rb0 t;
    public AudioTrack u;
    public pk v;
    public ub0 w;
    public ub0 x;
    public ff2 y;
    public ByteBuffer z;

    public zb0(qb0 qb0Var) {
        this.a = qb0Var.a;
        sb0 sb0Var = qb0Var.b;
        this.b = sb0Var;
        int i = mc3.a;
        this.c = i >= 21 && qb0Var.c;
        this.k = i >= 23 && qb0Var.d;
        this.l = i >= 29 ? qb0Var.e : 0;
        this.p = qb0Var.f;
        vy vyVar = new vy(0);
        this.h = vyVar;
        vyVar.d();
        this.i = new ol(new wb0(this));
        st stVar = new st();
        this.d = stVar;
        ca3 ca3Var = new ca3();
        this.e = ca3Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new sq2(), stVar, ca3Var);
        Collections.addAll(arrayList, sb0Var.a());
        this.f = (bl[]) arrayList.toArray(new bl[0]);
        this.g = new bl[]{new fw0()};
        this.J = 1.0f;
        this.v = pk.h;
        this.W = 0;
        this.X = new ql();
        ff2 ff2Var = ff2.e;
        this.x = new ub0(ff2Var, false, 0L, 0L);
        this.y = ff2Var;
        this.R = -1;
        this.K = new bl[0];
        this.L = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.n = new vb0();
        this.o = new vb0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r0 != 4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r0 != 4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da A[LOOP:1: B:40:0x00d5->B:42:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea A[EDGE_INSN: B:43:0x00ea->B:44:0x00ea BREAK  A[LOOP:1: B:40:0x00d5->B:42:0x00da], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j) {
        ff2 ff2Var;
        int i;
        boolean z;
        bl[] blVarArr;
        gl glVar;
        if (!this.Y && MimeTypes.AUDIO_RAW.equals(this.t.a.m)) {
            int i2 = this.t.a.B;
            if (this.c) {
                int i3 = mc3.a;
                if (i2 != 536870912) {
                    if (i2 != 805306368) {
                    }
                }
            }
            sb0 sb0Var = this.b;
            ff2Var = c().a;
            h33 h33Var = sb0Var.c;
            float f = ff2Var.b;
            if (h33Var.c != f) {
                h33Var.c = f;
                h33Var.i = true;
            }
            float f2 = ff2Var.c;
            if (h33Var.d != f2) {
                h33Var.d = f2;
                h33Var.i = true;
            }
            ff2 ff2Var2 = ff2Var;
            i = 0;
            if (!this.Y && MimeTypes.AUDIO_RAW.equals(this.t.a.m)) {
                int i4 = this.t.a.B;
                if (this.c) {
                    int i5 = mc3.a;
                    if (i4 != 536870912) {
                        if (i4 != 805306368) {
                        }
                    }
                }
                sb0 sb0Var2 = this.b;
                boolean z2 = c().b;
                sb0Var2.b.m = z2;
                z = z2;
                this.j.add(new ub0(ff2Var2, z, Math.max(0L, j), (d() * 1000000) / this.t.e));
                bl[] blVarArr2 = this.t.i;
                ArrayList arrayList = new ArrayList();
                for (bl blVar : blVarArr2) {
                    if (blVar.isActive()) {
                        arrayList.add(blVar);
                    } else {
                        blVar.flush();
                    }
                }
                int size = arrayList.size();
                this.K = (bl[]) arrayList.toArray(new bl[size]);
                this.L = new ByteBuffer[size];
                while (true) {
                    blVarArr = this.K;
                    if (i < blVarArr.length) {
                        break;
                    }
                    bl blVar2 = blVarArr[i];
                    blVar2.flush();
                    this.L[i] = blVar2.a();
                    i++;
                }
                glVar = this.r;
                if (glVar == null) {
                    ((fl1) glVar).a.H0.b(z);
                    return;
                }
                return;
            }
            z = false;
            this.j.add(new ub0(ff2Var2, z, Math.max(0L, j), (d() * 1000000) / this.t.e));
            bl[] blVarArr22 = this.t.i;
            ArrayList arrayList2 = new ArrayList();
            while (r1 < r0) {
            }
            int size2 = arrayList2.size();
            this.K = (bl[]) arrayList2.toArray(new bl[size2]);
            this.L = new ByteBuffer[size2];
            while (true) {
                blVarArr = this.K;
                if (i < blVarArr.length) {
                }
                bl blVar22 = blVarArr[i];
                blVar22.flush();
                this.L[i] = blVar22.a();
                i++;
            }
            glVar = this.r;
            if (glVar == null) {
            }
        }
        ff2Var = ff2.e;
        ff2 ff2Var22 = ff2Var;
        i = 0;
        if (!this.Y) {
            int i42 = this.t.a.B;
            if (this.c) {
            }
            sb0 sb0Var22 = this.b;
            boolean z22 = c().b;
            sb0Var22.b.m = z22;
            z = z22;
            this.j.add(new ub0(ff2Var22, z, Math.max(0L, j), (d() * 1000000) / this.t.e));
            bl[] blVarArr222 = this.t.i;
            ArrayList arrayList22 = new ArrayList();
            while (r1 < r0) {
            }
            int size22 = arrayList22.size();
            this.K = (bl[]) arrayList22.toArray(new bl[size22]);
            this.L = new ByteBuffer[size22];
            while (true) {
                blVarArr = this.K;
                if (i < blVarArr.length) {
                }
                bl blVar222 = blVarArr[i];
                blVar222.flush();
                this.L[i] = blVar222.a();
                i++;
            }
            glVar = this.r;
            if (glVar == null) {
            }
        }
        z = false;
        this.j.add(new ub0(ff2Var22, z, Math.max(0L, j), (d() * 1000000) / this.t.e));
        bl[] blVarArr2222 = this.t.i;
        ArrayList arrayList222 = new ArrayList();
        while (r1 < r0) {
        }
        int size222 = arrayList222.size();
        this.K = (bl[]) arrayList222.toArray(new bl[size222]);
        this.L = new ByteBuffer[size222];
        while (true) {
            blVarArr = this.K;
            if (i < blVarArr.length) {
            }
            bl blVar2222 = blVarArr[i];
            blVar2222.flush();
            this.L[i] = blVar2222.a();
            i++;
        }
        glVar = this.r;
        if (glVar == null) {
        }
    }

    public final void b() {
        if (f()) {
            j();
            AudioTrack audioTrack = this.i.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.u.pause();
            }
            if (a(this.u)) {
                yb0 yb0Var = this.m;
                yb0Var.getClass();
                yb0Var.b(this.u);
            }
            AudioTrack audioTrack2 = this.u;
            this.u = null;
            if (mc3.a < 21 && !this.V) {
                this.W = 0;
            }
            rb0 rb0Var = this.s;
            if (rb0Var != null) {
                this.t = rb0Var;
                this.s = null;
            }
            ol olVar = this.i;
            olVar.l = 0L;
            olVar.w = 0;
            olVar.v = 0;
            olVar.m = 0L;
            olVar.C = 0L;
            olVar.F = 0L;
            olVar.k = false;
            olVar.c = null;
            olVar.f = null;
            vy vyVar = this.h;
            synchronized (vyVar) {
                vyVar.a = false;
            }
            new nb0(this, audioTrack2).start();
        }
        this.o.a = null;
        this.n.a = null;
    }

    public final ub0 c() {
        ub0 ub0Var = this.w;
        return ub0Var != null ? ub0Var : !this.j.isEmpty() ? (ub0) this.j.getLast() : this.x;
    }

    public final long d() {
        return this.t.c == 0 ? this.D / r0.d : this.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        boolean z;
        AudioTrack a;
        zf2 zf2Var;
        vy vyVar = this.h;
        synchronized (vyVar) {
            z = vyVar.a;
        }
        if (!z) {
            return false;
        }
        try {
            rb0 rb0Var = this.t;
            rb0Var.getClass();
            try {
                a = rb0Var.a(this.Y, this.v, this.W);
            } catch (fl e) {
                gl glVar = this.r;
                if (glVar != null) {
                    ji1.b("MediaCodecAudioRenderer", ji1.a("Audio sink error", e));
                    ((fl1) glVar).a.H0.b(e);
                }
                throw e;
            }
        } catch (fl e2) {
            rb0 rb0Var2 = this.t;
            if (rb0Var2.h > 1000000) {
                rb0 rb0Var3 = new rb0(rb0Var2.a, rb0Var2.b, rb0Var2.c, rb0Var2.d, rb0Var2.e, rb0Var2.f, rb0Var2.g, 1000000, rb0Var2.i);
                try {
                    try {
                        a = rb0Var3.a(this.Y, this.v, this.W);
                        this.t = rb0Var3;
                    } catch (fl e3) {
                        gl glVar2 = this.r;
                        if (glVar2 != null) {
                            ji1.b("MediaCodecAudioRenderer", ji1.a("Audio sink error", e3));
                            ((fl1) glVar2).a.H0.b(e3);
                        }
                        throw e3;
                    }
                } catch (fl e4) {
                    e2.addSuppressed(e4);
                    if (this.t.c == 1) {
                    }
                }
            }
            if (this.t.c == 1) {
                throw e2;
            }
            this.a0 = true;
            throw e2;
        }
        this.u = a;
        if (a(a)) {
            AudioTrack audioTrack = this.u;
            if (this.m == null) {
                this.m = new yb0(this);
            }
            this.m.a(audioTrack);
            if (this.l != 3) {
                AudioTrack audioTrack2 = this.u;
                nx0 nx0Var = this.t.a;
                audioTrack2.setOffloadDelayPadding(nx0Var.C, nx0Var.D);
            }
        }
        if (mc3.a >= 31 && (zf2Var = this.q) != null) {
            ob0.a(this.u, zf2Var);
        }
        this.W = this.u.getAudioSessionId();
        ol olVar = this.i;
        AudioTrack audioTrack3 = this.u;
        rb0 rb0Var4 = this.t;
        olVar.a(audioTrack3, rb0Var4.c == 2, rb0Var4.g, rb0Var4.d, rb0Var4.h);
        k();
        this.X.getClass();
        this.H = true;
        return true;
    }

    public final boolean f() {
        return this.u != null;
    }

    public final void g() {
        this.U = false;
        if (f()) {
            ol olVar = this.i;
            olVar.l = 0L;
            olVar.w = 0;
            olVar.v = 0;
            olVar.m = 0L;
            olVar.C = 0L;
            olVar.F = 0L;
            olVar.k = false;
            if (olVar.x == C.TIME_UNSET) {
                ml mlVar = olVar.f;
                mlVar.getClass();
                mlVar.a();
                this.u.pause();
            }
        }
    }

    public final void h() {
        this.U = true;
        if (f()) {
            ml mlVar = this.i.f;
            mlVar.getClass();
            mlVar.a();
            this.u.play();
        }
    }

    public final void i() {
        if (this.T) {
            return;
        }
        this.T = true;
        ol olVar = this.i;
        long d = d();
        olVar.z = olVar.a();
        olVar.x = SystemClock.elapsedRealtime() * 1000;
        olVar.A = d;
        this.u.stop();
        this.A = 0;
    }

    public final void j() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        int i = 0;
        this.b0 = false;
        this.F = 0;
        this.x = new ub0(c().a, c().b, 0L, 0L);
        this.I = 0L;
        this.w = null;
        this.j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.z = null;
        this.A = 0;
        this.e.o = 0L;
        while (true) {
            bl[] blVarArr = this.K;
            if (i >= blVarArr.length) {
                return;
            }
            bl blVar = blVarArr[i];
            blVar.flush();
            this.L[i] = blVar.a();
            i++;
        }
    }

    public final void k() {
        if (f()) {
            if (mc3.a >= 21) {
                this.u.setVolume(this.J);
                return;
            }
            AudioTrack audioTrack = this.u;
            float f = this.J;
            audioTrack.setStereoVolume(f, f);
        }
    }

    public final void b(long j) {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.L[i - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = bl.a;
                }
            }
            if (i == length) {
                a(byteBuffer, j);
            } else {
                bl blVar = this.K[i];
                if (i > this.R) {
                    blVar.a(byteBuffer);
                }
                ByteBuffer a = blVar.a();
                this.L[i] = a;
                if (a.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void a(nx0 nx0Var, int[] iArr) {
        bl[] blVarArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int max;
        int i7;
        int i8;
        bl[] blVarArr2;
        int[] iArr2;
        if (MimeTypes.AUDIO_RAW.equals(nx0Var.m)) {
            if (mc3.e(nx0Var.B)) {
                i = mc3.b(nx0Var.B, nx0Var.z);
                int i9 = nx0Var.B;
                if (this.c && (i9 == 536870912 || i9 == 805306368 || i9 == 4)) {
                    blVarArr2 = this.g;
                } else {
                    blVarArr2 = this.f;
                }
                ca3 ca3Var = this.e;
                int i10 = nx0Var.C;
                int i11 = nx0Var.D;
                ca3Var.i = i10;
                ca3Var.j = i11;
                if (mc3.a < 21 && nx0Var.z == 8 && iArr == null) {
                    iArr2 = new int[6];
                    for (int i12 = 0; i12 < 6; i12++) {
                        iArr2[i12] = i12;
                    }
                } else {
                    iArr2 = iArr;
                }
                this.d.i = iArr2;
                zk zkVar = new zk(nx0Var.A, nx0Var.z, nx0Var.B);
                for (bl blVar : blVarArr2) {
                    try {
                        zk a = blVar.a(zkVar);
                        if (blVar.isActive()) {
                            zkVar = a;
                        }
                    } catch (al e) {
                        throw new el(e, nx0Var);
                    }
                }
                int i13 = zkVar.c;
                int i14 = zkVar.a;
                int a2 = mc3.a(zkVar.b);
                blVarArr = blVarArr2;
                i2 = mc3.b(i13, zkVar.b);
                i3 = i14;
                i4 = i13;
                i5 = a2;
                i6 = 0;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            bl[] blVarArr3 = new bl[0];
            int i15 = nx0Var.A;
            if (a(nx0Var, this.v)) {
                String str = nx0Var.m;
                str.getClass();
                int b = iu1.b(str, nx0Var.j);
                blVarArr = blVarArr3;
                i = -1;
                i2 = -1;
                i3 = i15;
                i4 = b;
                i5 = mc3.a(nx0Var.z);
                i6 = 1;
            } else {
                Pair a3 = this.a.a(nx0Var);
                if (a3 != null) {
                    int intValue = ((Integer) a3.first).intValue();
                    int intValue2 = ((Integer) a3.second).intValue();
                    blVarArr = blVarArr3;
                    i = -1;
                    i2 = -1;
                    i3 = i15;
                    i4 = intValue;
                    i5 = intValue2;
                    i6 = 2;
                } else {
                    throw new el("Unable to configure passthrough for: " + nx0Var, nx0Var);
                }
            }
        }
        bc0 bc0Var = this.p;
        int minBufferSize = AudioTrack.getMinBufferSize(i3, i5, i4);
        if (minBufferSize != -2) {
            double d = this.k ? 8.0d : 1.0d;
            bc0Var.getClass();
            if (i6 == 0) {
                long j = i3;
                long j2 = 250000 * j;
                long j3 = i2;
                int a4 = wd1.a((j2 * j3) / 1000000);
                int a5 = wd1.a(((750000 * j) * j3) / 1000000);
                int i16 = mc3.a;
                max = Math.max(a4, Math.min(minBufferSize * 4, a5));
            } else if (i6 == 1) {
                switch (i4) {
                    case 5:
                        i7 = 80000;
                        break;
                    case 6:
                    case 18:
                        i7 = 768000;
                        break;
                    case 7:
                        i7 = 192000;
                        break;
                    case 8:
                        i7 = 2250000;
                        break;
                    case 9:
                        i7 = 40000;
                        break;
                    case 10:
                        i7 = 100000;
                        break;
                    case 11:
                        i7 = 16000;
                        break;
                    case 12:
                        i7 = 7000;
                        break;
                    case 13:
                    default:
                        throw new IllegalArgumentException();
                    case 14:
                        i7 = 3062500;
                        break;
                    case 15:
                        i7 = 8000;
                        break;
                    case 16:
                        i7 = 256000;
                        break;
                    case 17:
                        i7 = 336000;
                        break;
                }
                max = wd1.a((50000000 * i7) / 1000000);
            } else if (i6 == 2) {
                int i17 = i4 == 5 ? 500000 : 250000;
                switch (i4) {
                    case 5:
                        i8 = 80000;
                        break;
                    case 6:
                    case 18:
                        i8 = 768000;
                        break;
                    case 7:
                        i8 = 192000;
                        break;
                    case 8:
                        i8 = 2250000;
                        break;
                    case 9:
                        i8 = 40000;
                        break;
                    case 10:
                        i8 = 100000;
                        break;
                    case 11:
                        i8 = 16000;
                        break;
                    case 12:
                        i8 = 7000;
                        break;
                    case 13:
                    default:
                        throw new IllegalArgumentException();
                    case 14:
                        i8 = 3062500;
                        break;
                    case 15:
                        i8 = 8000;
                        break;
                    case 16:
                        i8 = 256000;
                        break;
                    case 17:
                        i8 = 336000;
                        break;
                }
                max = wd1.a((i17 * i8) / 1000000);
            } else {
                throw new IllegalArgumentException();
            }
            int max2 = (((Math.max(minBufferSize, (int) (max * d)) + i2) - 1) / i2) * i2;
            if (i4 == 0) {
                throw new el("Invalid output encoding (mode=" + i6 + ") for: " + nx0Var, nx0Var);
            }
            if (i5 != 0) {
                this.a0 = false;
                rb0 rb0Var = new rb0(nx0Var, i, i6, i2, i3, i5, i4, max2, blVarArr);
                if (f()) {
                    this.s = rb0Var;
                    return;
                } else {
                    this.t = rb0Var;
                    return;
                }
            }
            throw new el("Invalid output channel config (mode=" + i6 + ") for: " + nx0Var, nx0Var);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z;
        int i;
        bl[] blVarArr;
        if (this.R == -1) {
            this.R = 0;
            z = true;
            i = this.R;
            blVarArr = this.K;
            if (i < blVarArr.length) {
                bl blVar = blVarArr[i];
                if (z) {
                    blVar.b();
                }
                b(C.TIME_UNSET);
                if (!blVar.isEnded()) {
                    return false;
                }
                this.R++;
                z = true;
                i = this.R;
                blVarArr = this.K;
                if (i < blVarArr.length) {
                    ByteBuffer byteBuffer = this.O;
                    if (byteBuffer != null) {
                        a(byteBuffer, C.TIME_UNSET);
                        if (this.O != null) {
                            return false;
                        }
                    }
                    this.R = -1;
                    return true;
                }
            }
        } else {
            z = false;
            i = this.R;
            blVarArr = this.K;
            if (i < blVarArr.length) {
            }
        }
    }

    public final long a(boolean z) {
        long j;
        long j2;
        if (!f() || this.H) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.i.a(z), (d() * 1000000) / this.t.e);
        while (!this.j.isEmpty() && min >= ((ub0) this.j.getFirst()).d) {
            this.x = (ub0) this.j.remove();
        }
        ub0 ub0Var = this.x;
        long j3 = min - ub0Var.d;
        if (ub0Var.a.equals(ff2.e)) {
            j = this.x.c + j3;
        } else if (this.j.isEmpty()) {
            h33 h33Var = this.b.c;
            if (h33Var.o >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                long j4 = h33Var.n;
                h33Var.j.getClass();
                long j5 = j4 - ((r2.k * r2.b) * 2);
                int i = h33Var.h.a;
                int i2 = h33Var.g.a;
                if (i == i2) {
                    j2 = mc3.a(j3, j5, h33Var.o);
                } else {
                    j2 = mc3.a(j3, j5 * i, h33Var.o * i2);
                }
            } else {
                j2 = (long) (h33Var.c * j3);
            }
            j = j2 + this.x.c;
        } else {
            ub0 ub0Var2 = (ub0) this.j.getFirst();
            long j6 = ub0Var2.d - min;
            float f = this.x.a.b;
            int i3 = mc3.a;
            if (f != 1.0f) {
                j6 = Math.round(j6 * f);
            }
            j = ub0Var2.c - j6;
        }
        return ((this.b.b.t * 1000000) / this.t.e) + j;
    }

    public final int a(nx0 nx0Var) {
        if (!MimeTypes.AUDIO_RAW.equals(nx0Var.m)) {
            return ((this.a0 || !a(nx0Var, this.v)) && this.a.a(nx0Var) == null) ? 0 : 2;
        }
        if (!mc3.e(nx0Var.B)) {
            ji1.d("DefaultAudioSink", "Invalid PCM encoding: " + nx0Var.B);
            return 0;
        }
        int i = nx0Var.B;
        return (i == 2 || (this.c && i == 4)) ? 2 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x00a0, code lost:
    
        if (e() == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        if (r5.a() == 0) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02de, code lost:
    
        if (r5 == 0) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(ByteBuffer byteBuffer, long j, int i) {
        int i2;
        long j2;
        int i3;
        int i4;
        byte b;
        int i5;
        byte b2;
        int i6;
        ByteBuffer byteBuffer2 = this.M;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            throw new IllegalArgumentException();
        }
        if (this.s != null) {
            if (a()) {
                rb0 rb0Var = this.s;
                rb0 rb0Var2 = this.t;
                rb0Var.getClass();
                if (rb0Var2.c == rb0Var.c && rb0Var2.g == rb0Var.g && rb0Var2.e == rb0Var.e && rb0Var2.f == rb0Var.f && rb0Var2.d == rb0Var.d) {
                    this.t = this.s;
                    this.s = null;
                    if (a(this.u) && this.l != 3) {
                        if (this.u.getPlayState() == 3) {
                            this.u.setOffloadEndOfStream();
                        }
                        AudioTrack audioTrack = this.u;
                        nx0 nx0Var = this.t.a;
                        audioTrack.setOffloadDelayPadding(nx0Var.C, nx0Var.D);
                        this.b0 = true;
                    }
                } else {
                    i();
                    if (!f() || !this.i.b(d())) {
                        b();
                    }
                }
                a(j);
            }
            return false;
        }
        if (!f()) {
            try {
            } catch (fl e) {
                if (!e.c) {
                    vb0 vb0Var = this.n;
                    vb0Var.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (vb0Var.a == null) {
                        vb0Var.a = e;
                        vb0Var.b = 100 + elapsedRealtime;
                    }
                    if (elapsedRealtime >= vb0Var.b) {
                        Exception exc = vb0Var.a;
                        if (exc != e) {
                            exc.addSuppressed(e);
                        }
                        Exception exc2 = vb0Var.a;
                        vb0Var.a = null;
                        throw exc2;
                    }
                } else {
                    throw e;
                }
            }
        }
        this.n.a = null;
        if (this.H) {
            this.I = Math.max(0L, j);
            this.G = false;
            this.H = false;
            if (this.k && mc3.a >= 23) {
                a(this.y);
            }
            a(j);
            if (this.U) {
                h();
            }
        }
        ol olVar = this.i;
        long d = d();
        AudioTrack audioTrack2 = olVar.c;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        if (olVar.h) {
            if (playState == 2) {
                olVar.p = false;
                return false;
            }
            if (playState == 1) {
            }
        }
        boolean z = olVar.p;
        boolean b3 = olVar.b(d);
        olVar.p = b3;
        if (z && !b3 && playState != 1) {
            nl nlVar = olVar.a;
            int i7 = olVar.e;
            long b4 = mc3.b(olVar.i);
            wb0 wb0Var = (wb0) nlVar;
            if (wb0Var.a.r != null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                zb0 zb0Var = wb0Var.a;
                i2 = 2;
                ((fl1) zb0Var.r).a.H0.b(i7, b4, elapsedRealtime2 - zb0Var.Z);
                if (this.M == null) {
                    if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                        if (byteBuffer.hasRemaining()) {
                            rb0 rb0Var3 = this.t;
                            if (rb0Var3.c != 0 && this.F == 0) {
                                int i8 = rb0Var3.g;
                                char c = 16;
                                switch (i8) {
                                    case 5:
                                    case 6:
                                    case 18:
                                        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
                                            i3 = 1536;
                                            break;
                                        } else {
                                            i3 = h0.a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                            break;
                                        }
                                    case 7:
                                    case 8:
                                        int position = byteBuffer.position();
                                        byte b5 = byteBuffer.get(position);
                                        if (b5 != -2) {
                                            if (b5 == -1) {
                                                i4 = (byteBuffer.get(position + 4) & 7) << 4;
                                                b2 = byteBuffer.get(position + 7);
                                            } else if (b5 != 31) {
                                                i4 = (byteBuffer.get(position + 4) & 1) << 6;
                                                b = byteBuffer.get(position + 5);
                                            } else {
                                                i4 = (byteBuffer.get(position + 5) & 7) << 4;
                                                b2 = byteBuffer.get(position + 6);
                                            }
                                            i5 = b2 & 60;
                                            i3 = (((i5 >> i2) | i4) + 1) * 32;
                                            break;
                                        } else {
                                            i4 = (byteBuffer.get(position + 5) & 1) << 6;
                                            b = byteBuffer.get(position + 4);
                                        }
                                        i5 = b & 252;
                                        i3 = (((i5 >> i2) | i4) + 1) * 32;
                                    case 9:
                                        int position2 = byteBuffer.position();
                                        int i9 = mc3.a;
                                        int i10 = byteBuffer.getInt(position2);
                                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                            i10 = Integer.reverseBytes(i10);
                                        }
                                        i3 = qw1.b(i10);
                                        if (i3 == -1) {
                                            throw new IllegalArgumentException();
                                        }
                                        break;
                                    case 10:
                                    case 16:
                                        i3 = 1024;
                                        break;
                                    case 11:
                                    case 12:
                                        i3 = 2048;
                                        break;
                                    case 13:
                                    default:
                                        throw new IllegalStateException(nh2.a("Unexpected audio encoding: ", i8));
                                    case 14:
                                        int position3 = byteBuffer.position();
                                        int limit = byteBuffer.limit() - 10;
                                        int i11 = position3;
                                        while (true) {
                                            if (i11 <= limit) {
                                                int i12 = mc3.a;
                                                int i13 = byteBuffer.getInt(i11 + 4);
                                                char c2 = c;
                                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                    i13 = Integer.reverseBytes(i13);
                                                }
                                                if ((i13 & (-2)) == -126718022) {
                                                    i6 = i11 - position3;
                                                } else {
                                                    i11++;
                                                    c = c2;
                                                }
                                            } else {
                                                i6 = -1;
                                            }
                                        }
                                        if (i6 != -1) {
                                            i3 = (40 << ((byteBuffer.get((byteBuffer.position() + i6) + ((byteBuffer.get((byteBuffer.position() + i6) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                            break;
                                        } else {
                                            i3 = 0;
                                            break;
                                        }
                                    case 15:
                                        i3 = 512;
                                        break;
                                    case 17:
                                        byte[] bArr = new byte[16];
                                        int position4 = byteBuffer.position();
                                        byteBuffer.get(bArr);
                                        byteBuffer.position(position4);
                                        i3 = l0.a(new jc2(16, bArr)).c;
                                        break;
                                }
                                this.F = i3;
                            }
                            if (this.w != null) {
                                if (a()) {
                                    a(j);
                                    this.w = null;
                                }
                                return false;
                            }
                            long j3 = this.I;
                            if (this.t.c == 0) {
                                j2 = this.B / r10.b;
                            } else {
                                j2 = this.C;
                            }
                            long j4 = (((j2 - this.e.o) * 1000000) / r10.a.A) + j3;
                            if (!this.G && Math.abs(j4 - j) > 200000) {
                                gl glVar = this.r;
                                hl hlVar = new hl(j, j4);
                                fl1 fl1Var = (fl1) glVar;
                                fl1Var.getClass();
                                ji1.b("MediaCodecAudioRenderer", ji1.a("Audio sink error", hlVar));
                                fl1Var.a.H0.b(hlVar);
                                this.G = true;
                            }
                            if (this.G) {
                                if (a()) {
                                    long j5 = j - j4;
                                    this.I += j5;
                                    this.G = false;
                                    a(j);
                                    gl glVar2 = this.r;
                                    if (glVar2 != null && j5 != 0) {
                                        ((fl1) glVar2).a.O0 = true;
                                    }
                                }
                                return false;
                            }
                            if (this.t.c == 0) {
                                this.B += byteBuffer.remaining();
                            } else {
                                this.C = (this.F * i) + this.C;
                            }
                            this.M = byteBuffer;
                            this.N = i;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                }
                b(j);
                if (this.M.hasRemaining()) {
                    this.M = null;
                    this.N = 0;
                    return true;
                }
                ol olVar2 = this.i;
                long d2 = d();
                if (olVar2.y != C.TIME_UNSET && d2 > 0 && SystemClock.elapsedRealtime() - olVar2.y >= 200) {
                    ji1.d("DefaultAudioSink", "Resetting stalled audio track");
                    b();
                    return true;
                }
                return false;
            }
        }
        i2 = 2;
        if (this.M == null) {
        }
        b(j);
        if (this.M.hasRemaining()) {
        }
    }

    public final void a(ff2 ff2Var) {
        if (f()) {
            try {
                this.u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(ff2Var.b).setPitch(ff2Var.c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                ji1.d("DefaultAudioSink", ji1.a("Failed to set playback params", e));
            }
            ff2Var = new ff2(this.u.getPlaybackParams().getSpeed(), this.u.getPlaybackParams().getPitch());
            ol olVar = this.i;
            olVar.j = ff2Var.b;
            ml mlVar = olVar.f;
            if (mlVar != null) {
                mlVar.a();
            }
        }
        this.y = ff2Var;
    }

    public final void a(ql qlVar) {
        if (this.X.equals(qlVar)) {
            return;
        }
        qlVar.getClass();
        if (this.u != null) {
            this.X.getClass();
        }
        this.X = qlVar;
    }

    public final void a(fl1 fl1Var) {
        this.r = fl1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00da, code lost:
    
        if (r14 < r13) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ByteBuffer byteBuffer, long j) {
        ByteBuffer byteBuffer2;
        int write;
        gl glVar;
        mo2 mo2Var;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.O;
            if (byteBuffer3 == null) {
                this.O = byteBuffer;
                if (mc3.a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.P;
                    if (bArr == null || bArr.length < remaining) {
                        this.P = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.P, 0, remaining);
                    byteBuffer.position(position);
                    this.Q = 0;
                }
            } else if (byteBuffer3 != byteBuffer) {
                throw new IllegalArgumentException();
            }
            int remaining2 = byteBuffer.remaining();
            int i = mc3.a;
            if (i < 21) {
                ol olVar = this.i;
                int a = olVar.e - ((int) (this.D - (olVar.a() * olVar.d)));
                if (a > 0) {
                    write = this.u.write(this.P, this.Q, Math.min(remaining2, a));
                    if (write > 0) {
                        this.Q += write;
                        xsna.wr.c(write, byteBuffer);
                    }
                    byteBuffer2 = byteBuffer;
                } else {
                    byteBuffer2 = byteBuffer;
                    write = 0;
                }
            } else if (!this.Y) {
                byteBuffer2 = byteBuffer;
                write = this.u.write(byteBuffer2, remaining2, 1);
            } else if (j != C.TIME_UNSET) {
                AudioTrack audioTrack = this.u;
                if (i >= 26) {
                    byteBuffer2 = byteBuffer;
                    write = audioTrack.write(byteBuffer2, remaining2, 1, j * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.z == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.z = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.z.putInt(1431633921);
                    }
                    if (this.A == 0) {
                        this.z.putInt(4, remaining2);
                        this.z.putLong(8, j * 1000);
                        this.z.position(0);
                        this.A = remaining2;
                    }
                    int remaining3 = this.z.remaining();
                    if (remaining3 > 0) {
                        write = audioTrack.write(this.z, remaining3, 1);
                        if (write < 0) {
                            this.A = 0;
                        }
                    }
                    write = audioTrack.write(byteBuffer2, remaining2, 1);
                    if (write < 0) {
                        this.A = 0;
                    } else {
                        this.A -= write;
                    }
                }
            } else {
                throw new IllegalStateException();
            }
            this.Z = SystemClock.elapsedRealtime();
            if (write < 0) {
                boolean z = (i >= 24 && write == -6) || write == -32;
                if (z && this.t.c == 1) {
                    this.a0 = true;
                }
                il ilVar = new il(write, this.t.a, z);
                gl glVar2 = this.r;
                if (glVar2 != null) {
                    ji1.b("MediaCodecAudioRenderer", ji1.a("Audio sink error", ilVar));
                    ((fl1) glVar2).a.H0.b(ilVar);
                }
                if (!ilVar.c) {
                    vb0 vb0Var = this.o;
                    vb0Var.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (vb0Var.a == null) {
                        vb0Var.a = ilVar;
                        vb0Var.b = 100 + elapsedRealtime;
                    }
                    if (elapsedRealtime >= vb0Var.b) {
                        Exception exc = vb0Var.a;
                        if (exc != ilVar) {
                            exc.addSuppressed(ilVar);
                        }
                        Exception exc2 = vb0Var.a;
                        vb0Var.a = null;
                        throw exc2;
                    }
                    return;
                }
                throw ilVar;
            }
            this.o.a = null;
            if (a(this.u)) {
                if (this.E > 0) {
                    this.b0 = false;
                }
                if (this.U && (glVar = this.r) != null && write < remaining2 && !this.b0 && (mo2Var = ((fl1) glVar).a.Q0) != null) {
                    ((bo0) mo2Var).a.I = true;
                }
            }
            int i2 = this.t.c;
            if (i2 == 0) {
                this.D += write;
            }
            if (write == remaining2) {
                if (i2 != 0) {
                    if (byteBuffer2 != this.M) {
                        throw new IllegalStateException();
                    }
                    this.E = (this.F * this.N) + this.E;
                }
                this.O = null;
            }
        }
    }

    public final boolean a(nx0 nx0Var, pk pkVar) {
        int a;
        boolean isOffloadedPlaybackSupported;
        int i;
        int i2 = mc3.a;
        if (i2 >= 29 && this.l != 0) {
            String str = nx0Var.m;
            str.getClass();
            int b = iu1.b(str, nx0Var.j);
            if (b != 0 && (a = mc3.a(nx0Var.z)) != 0) {
                AudioFormat build = new AudioFormat.Builder().setSampleRate(nx0Var.A).setChannelMask(a).setEncoding(b).build();
                if (pkVar.g == null) {
                    pkVar.g = new ok(pkVar);
                }
                AudioAttributes audioAttributes = pkVar.g.a;
                if (i2 >= 31) {
                    i = AudioManager.getPlaybackOffloadSupport(build, audioAttributes);
                } else {
                    isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(build, audioAttributes);
                    if (isOffloadedPlaybackSupported) {
                        i = (i2 == 30 && mc3.d.startsWith("Pixel")) ? 2 : 1;
                    } else {
                        i = 0;
                    }
                }
                if (i != 0) {
                    if (i == 1) {
                        boolean z = (nx0Var.C == 0 && nx0Var.D == 0) ? false : true;
                        boolean z2 = this.l == 1;
                        if (!z || !z2) {
                        }
                    } else if (i != 2) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (mc3.a < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }
}
