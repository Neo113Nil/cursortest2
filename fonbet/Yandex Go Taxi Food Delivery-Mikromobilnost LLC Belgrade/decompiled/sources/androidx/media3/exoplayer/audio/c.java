package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.exoplayer.audio.a;
import com.google.common.collect.ImmutableList;
import defpackage.ah3;
import defpackage.b6h;
import defpackage.b9t0;
import defpackage.bh3;
import defpackage.c6h;
import defpackage.ch3;
import defpackage.d6h;
import defpackage.d6z;
import defpackage.ddf;
import defpackage.df90;
import defpackage.eg3;
import defpackage.eh20;
import defpackage.f6h;
import defpackage.g6h;
import defpackage.ga4;
import defpackage.gcs0;
import defpackage.gg3;
import defpackage.h6h;
import defpackage.hg3;
import defpackage.i6h;
import defpackage.if11;
import defpackage.inh;
import defpackage.j6h;
import defpackage.ji9;
import defpackage.l9;
import defpackage.lk91;
import defpackage.lxc0;
import defpackage.m83;
import defpackage.mg3;
import defpackage.ng3;
import defpackage.ny61;
import defpackage.o2x0;
import defpackage.og3;
import defpackage.oxe;
import defpackage.oyr;
import defpackage.ph3;
import defpackage.piv;
import defpackage.pjz0;
import defpackage.q501;
import defpackage.q6h;
import defpackage.qh3;
import defpackage.qjz0;
import defpackage.sae;
import defpackage.th3;
import defpackage.tw21;
import defpackage.ue3;
import defpackage.unr0;
import defpackage.v8e;
import defpackage.vyc0;
import defpackage.w511;
import defpackage.w5w;
import defpackage.wwf;
import defpackage.xub1;
import defpackage.xvz;
import defpackage.ye3;
import defpackage.z5h;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes10.dex */
public final class c implements ch3 {
    public static final Object k0 = new Object();
    public static ScheduledExecutorService l0;
    public static int m0;
    public ue3 A;
    public g6h B;
    public g6h C;
    public lxc0 D;
    public boolean E;
    public ByteBuffer F;
    public int G;
    public long H;
    public long I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public boolean N;
    public long O;
    public float P;
    public ByteBuffer Q;
    public int R;
    public ByteBuffer S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public ga4 Z;
    public final Context a;
    public ddf a0;
    public final wwf b;
    public boolean b0;
    public final boolean c;
    public long c0;
    public final ji9 d;
    public long d0;
    public final if11 e;
    public boolean e0;
    public final ImmutableList f;
    public boolean f0;
    public final ImmutableList g;
    public Looper g0;
    public final th3 h;
    public long h0;
    public final ArrayDeque i;
    public long i0;
    public final boolean j;
    public Handler j0;
    public int k;
    public b l;
    public final i6h m;
    public final i6h n;
    public final b6h o;
    public final z5h p;
    public final c6h q;
    public vyc0 r;
    public bh3 s;
    public f6h t;
    public f6h u;
    public mg3 v;
    public AudioTrack w;
    public ye3 x;
    public a y;
    public wwf z;

    public c(d6h d6hVar) {
        Context context = d6hVar.a;
        this.a = context;
        this.A = ue3.c;
        this.x = context != null ? null : d6hVar.b;
        this.b = d6hVar.c;
        this.c = d6hVar.d;
        this.j = tw21.a >= 23 && d6hVar.e;
        this.k = 0;
        this.o = d6hVar.g;
        z5h z5hVar = d6hVar.i;
        z5hVar.getClass();
        this.p = z5hVar;
        this.h = new th3(new sae(27, this));
        ji9 ji9Var = new ji9();
        this.d = ji9Var;
        if11 if11Var = new if11();
        this.e = if11Var;
        this.f = ImmutableList.t(new qjz0(), ji9Var, if11Var);
        this.g = ImmutableList.t(new pjz0(), ji9Var, if11Var);
        this.P = 1.0f;
        this.Y = 0;
        this.Z = new ga4();
        lxc0 lxc0Var = lxc0.d;
        this.C = new g6h(lxc0Var, 0L, 0L);
        this.D = lxc0Var;
        this.E = false;
        this.i = new ArrayDeque();
        this.m = new i6h();
        this.n = new i6h();
        this.q = d6hVar.h;
    }

    public static boolean r(AudioTrack audioTrack) {
        return tw21.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void A() {
        if (q()) {
            try {
                this.w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.D.a).setPitch(this.D.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                lk91.k("Failed to set playback params", e);
            }
            lxc0 lxc0Var = new lxc0(this.w.getPlaybackParams().getSpeed(), this.w.getPlaybackParams().getPitch());
            this.D = lxc0Var;
            float f = lxc0Var.a;
            th3 th3Var = this.h;
            th3Var.i = f;
            qh3 qh3Var = th3Var.e;
            if (qh3Var != null) {
                qh3Var.c();
            }
            th3Var.e();
        }
    }

    public final void B(ga4 ga4Var) {
        if (this.Z.equals(ga4Var)) {
            return;
        }
        ga4Var.getClass();
        if (this.w != null) {
            this.Z.getClass();
        }
        this.Z = ga4Var;
    }

    public final void C(int i) {
        d6z.x(tw21.a >= 29);
        this.k = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        byte b;
        int i2;
        int i3;
        d6z.x(this.S == null);
        if (byteBuffer.hasRemaining()) {
            if (this.u.c == 0) {
                int e0 = (int) tw21.e0(tw21.W(20L), this.u.e, 1000000L, RoundingMode.UP);
                long m = m();
                long j = e0;
                if (m < j) {
                    f6h f6hVar = this.u;
                    int i4 = f6hVar.g;
                    int i5 = f6hVar.d;
                    int i6 = (int) m;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i6 < e0) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i4 == 4) {
                                float h = tw21.h(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i3 = (int) (h < 0.0f ? (-h) * (-2.1474836E9f) : h * 2.1474836E9f);
                            } else if (i4 == 21) {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            } else if (i4 != 22) {
                                if (i4 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i4 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else if (i4 != 1610612736) {
                                    ny61.k();
                                    return;
                                } else {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                }
                                i3 = i | i2;
                            } else {
                                i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            int i7 = (int) ((i3 * i6) / j);
                            if (i4 != 2) {
                                byteBuffer2.put((byte) (i7 >> 16));
                                byteBuffer2.put((byte) (i7 >> 24));
                            } else if (i4 == 3) {
                                byteBuffer2.put((byte) (i7 >> 24));
                            } else if (i4 != 4) {
                                if (i4 == 21) {
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 24));
                                } else if (i4 == 22) {
                                    byteBuffer2.put((byte) i7);
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 24));
                                } else if (i4 == 268435456) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                } else if (i4 == 1342177280) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 8));
                                } else {
                                    if (i4 != 1610612736) {
                                        ny61.k();
                                        return;
                                    }
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) i7);
                                }
                            } else if (i7 < 0) {
                                byteBuffer2.putFloat((-i7) / (-2.1474836E9f));
                            } else {
                                byteBuffer2.putFloat(i7 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + i5) {
                                i6++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        int i72 = (int) ((i3 * i6) / j);
                        if (i4 != 2) {
                        }
                        if (byteBuffer.position() != position + i5) {
                        }
                    }
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.flip();
                    this.S = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.S = byteBuffer2;
        }
    }

    public final void E(lxc0 lxc0Var) {
        this.D = new lxc0(tw21.h(lxc0Var.a, 0.1f, 8.0f), tw21.h(lxc0Var.b, 0.1f, 8.0f));
        if (G()) {
            A();
            return;
        }
        g6h g6hVar = new g6h(lxc0Var, -9223372036854775807L, -9223372036854775807L);
        if (q()) {
            this.B = g6hVar;
        } else {
            this.C = g6hVar;
        }
    }

    public final boolean F(androidx.media3.common.a aVar) {
        return k(aVar) != 0;
    }

    public final boolean G() {
        f6h f6hVar = this.u;
        return f6hVar != null && f6hVar.j && tw21.a >= 23;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r1 != 4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        if (r1 != 4) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j) {
        lxc0 lxc0Var;
        boolean G = G();
        boolean z = this.c;
        boolean z2 = false;
        wwf wwfVar = this.b;
        if (G) {
            lxc0Var = lxc0.d;
        } else {
            if (!this.b0) {
                f6h f6hVar = this.u;
                if (f6hVar.c == 0) {
                    int i = f6hVar.a.F;
                    if (z) {
                        int i2 = tw21.a;
                        if (i != 21) {
                            if (i != 1342177280) {
                                if (i != 22) {
                                    if (i != 1610612736) {
                                    }
                                }
                            }
                        }
                    }
                    lxc0Var = this.D;
                    b9t0 b9t0Var = (b9t0) wwfVar.c;
                    float f = lxc0Var.a;
                    b9t0Var.getClass();
                    d6z.l(f > 0.0f);
                    if (b9t0Var.c != f) {
                        b9t0Var.c = f;
                        b9t0Var.i = true;
                    }
                    float f2 = lxc0Var.b;
                    d6z.l(f2 > 0.0f);
                    if (b9t0Var.d != f2) {
                        b9t0Var.d = f2;
                        b9t0Var.i = true;
                    }
                    this.D = lxc0Var;
                }
            }
            lxc0Var = lxc0.d;
            this.D = lxc0Var;
        }
        lxc0 lxc0Var2 = lxc0Var;
        if (!this.b0) {
            f6h f6hVar2 = this.u;
            if (f6hVar2.c == 0) {
                int i3 = f6hVar2.a.F;
                if (z) {
                    int i4 = tw21.a;
                    if (i3 != 21) {
                        if (i3 != 1342177280) {
                            if (i3 != 22) {
                                if (i3 != 1610612736) {
                                }
                            }
                        }
                    }
                }
                z2 = this.E;
                ((gcs0) wwfVar.b).o = z2;
            }
        }
        this.E = z2;
        this.i.add(new g6h(lxc0Var2, Math.max(0L, j), tw21.c0(this.u.e, m())));
        mg3 mg3Var = this.u.i;
        this.v = mg3Var;
        mg3Var.a();
        bh3 bh3Var = this.s;
        if (bh3Var != null) {
            bh3Var.onSkipSilenceEnabledChanged(this.E);
        }
    }

    public final AudioTrack b(ah3 ah3Var, ue3 ue3Var, int i, androidx.media3.common.a aVar) {
        try {
            AudioTrack a = ((q6h) this.q).a(ah3Var, ue3Var, i);
            int state = a.getState();
            if (state == 1) {
                return a;
            }
            try {
                a.release();
            } catch (Exception unused) {
            }
            throw new AudioSink$InitializationException(state, ah3Var.b, ah3Var.c, ah3Var.a, aVar, ah3Var.e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new AudioSink$InitializationException(0, ah3Var.b, ah3Var.c, ah3Var.a, aVar, ah3Var.e, e);
        }
    }

    public final AudioTrack c(f6h f6hVar) {
        try {
            return b(f6hVar.a(), this.A, this.Y, f6hVar.a);
        } catch (AudioSink$InitializationException e) {
            bh3 bh3Var = this.s;
            if (bh3Var != null) {
                bh3Var.onAudioSinkError(e);
            }
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b8, code lost:
    
        if (r9 > 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01bb, code lost:
    
        if (r11 > 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01be, code lost:
    
        if (r11 < 0) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(androidx.media3.common.a aVar, int[] iArr) {
        mg3 mg3Var;
        int intValue;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        int i8;
        int y;
        s();
        String str = aVar.n;
        int i9 = aVar.E;
        int i10 = aVar.D;
        int i11 = aVar.F;
        boolean equals = "audio/raw".equals(str);
        boolean z4 = this.j;
        if (equals) {
            d6z.l(tw21.R(i11));
            int t = tw21.t(i11) * i10;
            ImmutableList.a aVar2 = new ImmutableList.a();
            if (this.c && (i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736 || i11 == 4)) {
                aVar2.d(this.g);
            } else {
                aVar2.d(this.f);
                aVar2.b((og3[]) this.b.a);
            }
            mg3Var = new mg3(aVar2.g());
            if (mg3Var.equals(this.v)) {
                mg3Var = this.v;
            }
            int i12 = aVar.G;
            int i13 = aVar.H;
            if11 if11Var = this.e;
            if11Var.i = i12;
            if11Var.j = i13;
            this.d.i = iArr;
            ng3 ng3Var = new ng3(i9, i10, i11);
            try {
                ImmutableList immutableList = mg3Var.a;
                if (ng3Var.equals(ng3.e)) {
                    throw new AudioProcessor$UnhandledAudioFormatException(ng3Var);
                }
                for (int i14 = 0; i14 < immutableList.size(); i14++) {
                    og3 og3Var = (og3) immutableList.get(i14);
                    ng3 d = og3Var.d(ng3Var);
                    if (og3Var.isActive()) {
                        d6z.x(!d.equals(ng3.e));
                        ng3Var = d;
                    }
                }
                int i15 = ng3Var.b;
                int i16 = ng3Var.c;
                int i17 = ng3Var.a;
                intValue = tw21.s(i15);
                i3 = tw21.t(i16) * i15;
                i5 = i16;
                z = z4;
                i2 = t;
                i4 = 0;
                i = i17;
            } catch (AudioProcessor$UnhandledAudioFormatException e) {
                throw new AudioSink$ConfigurationException(e, aVar);
            }
        } else {
            mg3Var = new mg3(ImmutableList.p());
            hg3 j = this.k != 0 ? j(aVar) : hg3.d;
            if (this.k != 0 && j.a) {
                str.getClass();
                int d2 = eh20.d(str, aVar.k);
                int s = tw21.s(i10);
                boolean z5 = j.b;
                i5 = d2;
                i4 = 1;
                i3 = -1;
                i6 = s;
                i = i9;
                z2 = z5;
                z = true;
                i2 = -1;
                if (i5 != 0) {
                    throw new AudioSink$ConfigurationException("Invalid output encoding (mode=" + i4 + ") for: " + aVar, aVar);
                }
                if (i6 == 0) {
                    throw new AudioSink$ConfigurationException("Invalid output channel config (mode=" + i4 + ") for: " + aVar, aVar);
                }
                int i18 = aVar.j;
                if ("audio/vnd.dts.hd;profile=lbr".equals(str) && i18 == -1) {
                    i18 = 768000;
                }
                int minBufferSize = AudioTrack.getMinBufferSize(i, i6, i5);
                d6z.x(minBufferSize != -2);
                int i19 = i3 != -1 ? i3 : 1;
                double d3 = z ? 8.0d : 1.0d;
                ((q501) this.o).getClass();
                if (i4 != 0) {
                    if (i4 == 1) {
                        i7 = i2;
                        i8 = com.google.common.primitives.a.b((50000000 * q501.y(i5)) / 1000000);
                    } else {
                        if (i4 != 2) {
                            w511.q();
                            return;
                        }
                        int i20 = i5 == 5 ? 500000 : i5 == 8 ? 1000000 : 250000;
                        if (i18 != -1) {
                            RoundingMode roundingMode = RoundingMode.CEILING;
                            roundingMode.getClass();
                            y = i18 / 8;
                            int i21 = i18 - (8 * y);
                            if (i21 != 0) {
                                int i22 = ((i18 ^ 8) >> 31) | 1;
                                switch (w5w.a[roundingMode.ordinal()]) {
                                    case 1:
                                        if (i21 != 0) {
                                            w511.w("mode was UNNECESSARY, but rounding was necessary");
                                            return;
                                        }
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        y += i22;
                                        break;
                                    case 5:
                                        break;
                                    case 6:
                                    case 7:
                                    case 8:
                                        int abs = Math.abs(i21);
                                        int abs2 = abs - (Math.abs(8) - abs);
                                        if (abs2 == 0) {
                                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                            RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                                            break;
                                        }
                                        break;
                                    default:
                                        ny61.w();
                                        return;
                                }
                            }
                        } else {
                            y = q501.y(i5);
                        }
                        i7 = i2;
                        i8 = com.google.common.primitives.a.b((i20 * y) / 1000000);
                    }
                    z3 = z;
                } else {
                    i7 = i2;
                    long j2 = i;
                    z3 = z;
                    long j3 = i19;
                    i8 = tw21.i(minBufferSize * 4, com.google.common.primitives.a.b(((250000 * j2) * j3) / 1000000), com.google.common.primitives.a.b(((750000 * j2) * j3) / 1000000));
                }
                this.e0 = false;
                f6h f6hVar = new f6h(aVar, i7, i4, i3, i, i6, i5, (((Math.max(minBufferSize, (int) (i8 * d3)) + i19) - 1) / i19) * i19, mg3Var, z3, z2, this.b0);
                if (q()) {
                    this.t = f6hVar;
                    return;
                } else {
                    this.u = f6hVar;
                    return;
                }
            }
            Pair d4 = this.x.d(aVar, this.A);
            if (d4 == null) {
                throw new AudioSink$ConfigurationException("Unable to configure passthrough for: " + aVar, aVar);
            }
            int intValue2 = ((Integer) d4.first).intValue();
            intValue = ((Integer) d4.second).intValue();
            i = i9;
            z = z4;
            i2 = -1;
            i3 = -1;
            i4 = 2;
            i5 = intValue2;
        }
        i6 = intValue;
        z2 = false;
        if (i5 != 0) {
        }
    }

    public final void e(long j) {
        int write;
        bh3 bh3Var;
        boolean z;
        i6h i6hVar = this.n;
        if (this.S == null) {
            return;
        }
        if (i6hVar.a != null) {
            synchronized (k0) {
                z = m0 > 0;
            }
            if (z || SystemClock.elapsedRealtime() < i6hVar.c) {
                return;
            }
        }
        int remaining = this.S.remaining();
        if (this.b0) {
            d6z.x(j != -9223372036854775807L);
            if (j == Long.MIN_VALUE) {
                j = this.c0;
            } else {
                this.c0 = j;
            }
            AudioTrack audioTrack = this.w;
            ByteBuffer byteBuffer = this.S;
            if (tw21.a >= 26) {
                write = audioTrack.write(byteBuffer, remaining, 1, 1000 * j);
            } else {
                if (this.F == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.F = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.F.putInt(1431633921);
                }
                if (this.G == 0) {
                    this.F.putInt(4, remaining);
                    this.F.putLong(8, j * 1000);
                    this.F.position(0);
                    this.G = remaining;
                }
                int remaining2 = this.F.remaining();
                if (remaining2 > 0) {
                    int write2 = audioTrack.write(this.F, remaining2, 1);
                    if (write2 < 0) {
                        this.G = 0;
                        write = write2;
                    } else if (write2 < remaining2) {
                        write = 0;
                    }
                }
                write = audioTrack.write(byteBuffer, remaining, 1);
                if (write < 0) {
                    this.G = 0;
                } else {
                    this.G -= write;
                }
            }
        } else {
            write = this.w.write(this.S, remaining, 1);
        }
        this.d0 = SystemClock.elapsedRealtime();
        if (write < 0) {
            if ((tw21.a >= 24 && write == -6) || write == -32) {
                if (m() <= 0) {
                    if (r(this.w)) {
                        if (this.u.c == 1) {
                            this.e0 = true;
                        }
                    }
                }
                r2 = true;
            }
            AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(this.u.a, write, r2);
            bh3 bh3Var2 = this.s;
            if (bh3Var2 != null) {
                bh3Var2.onAudioSinkError(audioSink$WriteException);
            }
            if (!audioSink$WriteException.isRecoverable || this.a == null) {
                i6hVar.a(audioSink$WriteException);
                return;
            } else {
                this.x = ye3.c;
                throw audioSink$WriteException;
            }
        }
        i6hVar.a = null;
        i6hVar.b = -9223372036854775807L;
        i6hVar.c = -9223372036854775807L;
        if (r(this.w)) {
            if (this.K > 0) {
                this.f0 = false;
            }
            if (this.W && (bh3Var = this.s) != null && write < remaining && !this.f0) {
                bh3Var.y();
            }
        }
        int i = this.u.c;
        if (i == 0) {
            this.J += write;
        }
        if (write == remaining) {
            if (i != 0) {
                d6z.x(this.S == this.Q);
                this.K = (this.L * this.R) + this.K;
            }
            this.S = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f() {
        ByteBuffer byteBuffer;
        if (!this.v.d()) {
            e(Long.MIN_VALUE);
            return this.S == null;
        }
        mg3 mg3Var = this.v;
        if (mg3Var.d() && !mg3Var.d) {
            mg3Var.d = true;
            ((og3) mg3Var.b.get(0)).b();
        }
        w(Long.MIN_VALUE);
        if (!this.v.c() || ((byteBuffer = this.S) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final void g() {
        wwf wwfVar;
        if (q()) {
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.f0 = false;
            this.L = 0;
            this.C = new g6h(this.D, 0L, 0L);
            this.O = 0L;
            this.B = null;
            this.i.clear();
            this.Q = null;
            this.R = 0;
            this.S = null;
            this.U = false;
            this.T = false;
            this.V = false;
            this.F = null;
            this.G = 0;
            this.e.o = 0L;
            mg3 mg3Var = this.u.i;
            this.v = mg3Var;
            mg3Var.a();
            AudioTrack audioTrack = this.h.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.w.pause();
            }
            if (r(this.w)) {
                b bVar = this.l;
                bVar.getClass();
                this.w.unregisterStreamEventCallback(bVar.b);
                bVar.a.removeCallbacksAndMessages(null);
            }
            ah3 a = this.u.a();
            f6h f6hVar = this.t;
            if (f6hVar != null) {
                this.u = f6hVar;
                this.t = null;
            }
            th3 th3Var = this.h;
            th3Var.e();
            th3Var.c = null;
            th3Var.e = null;
            if (tw21.a >= 24 && (wwfVar = this.z) != null) {
                AudioTrack audioTrack2 = (AudioTrack) wwfVar.a;
                h6h h6hVar = (h6h) wwfVar.c;
                h6hVar.getClass();
                audioTrack2.removeOnRoutingChangedListener(h6hVar);
                wwfVar.c = null;
                this.z = null;
            }
            AudioTrack audioTrack3 = this.w;
            bh3 bh3Var = this.s;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (k0) {
                try {
                    if (l0 == null) {
                        l0 = Executors.newSingleThreadScheduledExecutor(new inh(1));
                    }
                    m0++;
                    l0.schedule(new l9(audioTrack3, bh3Var, handler, a, 8), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.w = null;
        }
        i6h i6hVar = this.n;
        i6hVar.a = null;
        i6hVar.b = -9223372036854775807L;
        i6hVar.c = -9223372036854775807L;
        i6h i6hVar2 = this.m;
        i6hVar2.a = null;
        i6hVar2.b = -9223372036854775807L;
        i6hVar2.c = -9223372036854775807L;
        this.h0 = 0L;
        this.i0 = 0L;
        Handler handler2 = this.j0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final long h() {
        if (!q()) {
            return -9223372036854775807L;
        }
        if (tw21.a < 23) {
            return tw21.e0(this.u.h, 1000000L, this.u.c == 0 ? r0.e * r0.d : q501.y(r0.g), RoundingMode.DOWN);
        }
        AudioTrack audioTrack = this.w;
        f6h f6hVar = this.u;
        if (f6hVar.c == 0) {
            return tw21.c0(f6hVar.e, audioTrack.getBufferSizeInFrames());
        }
        return tw21.e0(audioTrack.getBufferSizeInFrames(), 1000000L, q501.y(f6hVar.g), RoundingMode.DOWN);
    }

    public final long i() {
        ArrayDeque arrayDeque;
        long j;
        if (!q() || this.N) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.h.a(), tw21.c0(this.u.e, m()));
        while (true) {
            arrayDeque = this.i;
            if (arrayDeque.isEmpty() || min < ((g6h) arrayDeque.getFirst()).c) {
                break;
            }
            this.C = (g6h) arrayDeque.remove();
        }
        g6h g6hVar = this.C;
        long j2 = min - g6hVar.c;
        long D = tw21.D(g6hVar.a.a, j2);
        boolean isEmpty = arrayDeque.isEmpty();
        wwf wwfVar = this.b;
        if (isEmpty) {
            b9t0 b9t0Var = (b9t0) wwfVar.c;
            if (b9t0Var.isActive()) {
                if (b9t0Var.o >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                    long j3 = b9t0Var.n;
                    b9t0Var.j.getClass();
                    long j4 = j3 - ((r8.k * r8.b) * 2);
                    int i = b9t0Var.h.a;
                    int i2 = b9t0Var.g.a;
                    long j5 = b9t0Var.o;
                    j2 = i == i2 ? tw21.e0(j2, j4, j5, RoundingMode.DOWN) : tw21.e0(j2, j4 * i, j5 * i2, RoundingMode.DOWN);
                } else {
                    j2 = (long) (b9t0Var.c * j2);
                }
            }
            g6h g6hVar2 = this.C;
            j = g6hVar2.b + j2;
            g6hVar2.d = j2 - D;
        } else {
            g6h g6hVar3 = this.C;
            j = g6hVar3.b + D + g6hVar3.d;
        }
        long j6 = ((gcs0) wwfVar.b).q;
        long c0 = tw21.c0(this.u.e, j6) + j;
        long j7 = this.h0;
        if (j6 > j7) {
            long c02 = tw21.c0(this.u.e, j6 - j7);
            this.h0 = j6;
            this.i0 += c02;
            if (this.j0 == null) {
                this.j0 = new Handler(Looper.myLooper());
            }
            this.j0.removeCallbacksAndMessages(null);
            this.j0.postDelayed(new oxe(16, this), 100L);
        }
        return c0;
    }

    public final hg3 j(androidx.media3.common.a aVar) {
        boolean booleanValue;
        int playbackOffloadSupport;
        if (this.e0) {
            return hg3.d;
        }
        ue3 ue3Var = this.A;
        z5h z5hVar = this.p;
        z5hVar.getClass();
        aVar.getClass();
        int i = aVar.E;
        ue3Var.getClass();
        int i2 = tw21.a;
        if (i2 < 29 || i == -1) {
            return hg3.d;
        }
        Context context = z5hVar.a;
        Boolean bool = z5hVar.b;
        boolean z = false;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = eg3.i(context).getParameters("offloadVariableRateSupported");
                z5hVar.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                z5hVar.b = Boolean.FALSE;
            }
            booleanValue = z5hVar.b.booleanValue();
        }
        String str = aVar.n;
        str.getClass();
        int d = eh20.d(str, aVar.k);
        if (d == 0 || i2 < tw21.q(d)) {
            return hg3.d;
        }
        int s = tw21.s(aVar.D);
        if (s == 0) {
            return hg3.d;
        }
        try {
            AudioFormat r = tw21.r(i, s, d);
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(r, ue3Var.a().a)) {
                    return hg3.d;
                }
                gg3 gg3Var = new gg3();
                gg3Var.a = true;
                gg3Var.c = booleanValue;
                return gg3Var.a();
            }
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(r, ue3Var.a().a);
            if (playbackOffloadSupport == 0) {
                return hg3.d;
            }
            gg3 gg3Var2 = new gg3();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            gg3Var2.a = true;
            gg3Var2.b = z;
            gg3Var2.c = booleanValue;
            return gg3Var2.a();
        } catch (IllegalArgumentException unused) {
            return hg3.d;
        }
    }

    public final int k(androidx.media3.common.a aVar) {
        s();
        String str = aVar.n;
        int i = aVar.F;
        if ("audio/raw".equals(str)) {
            if (!tw21.R(i)) {
                xvz.v(i, "Invalid PCM encoding: ");
                return 0;
            }
            if (i != 2 && (!this.c || i != 4)) {
                return 1;
            }
        } else if (this.x.d(aVar, this.A) == null) {
            return 0;
        }
        return 2;
    }

    public final long l() {
        return this.u.c == 0 ? this.H / r0.b : this.I;
    }

    public final long m() {
        f6h f6hVar = this.u;
        if (f6hVar.c != 0) {
            return this.K;
        }
        long j = this.J;
        long j2 = f6hVar.d;
        int i = tw21.a;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x00b7, code lost:
    
        if (p() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0116, code lost:
    
        if (r9.b() == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x038d, code lost:
    
        if (r13 == 0) goto L210;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(final long j, ByteBuffer byteBuffer, int i) {
        int i2;
        int c;
        int i3;
        byte b;
        int i4;
        byte b2;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        ph3 ph3Var;
        ByteBuffer byteBuffer2 = this.Q;
        d6z.l(byteBuffer2 == null || byteBuffer == byteBuffer2);
        f6h f6hVar = this.t;
        th3 th3Var = this.h;
        if (f6hVar != null) {
            if (f()) {
                f6h f6hVar2 = this.t;
                f6h f6hVar3 = this.u;
                f6hVar2.getClass();
                if (f6hVar3.c == f6hVar2.c && f6hVar3.g == f6hVar2.g && f6hVar3.e == f6hVar2.e && f6hVar3.f == f6hVar2.f && f6hVar3.d == f6hVar2.d && f6hVar3.j == f6hVar2.j && f6hVar3.k == f6hVar2.k) {
                    this.u = this.t;
                    this.t = null;
                    AudioTrack audioTrack = this.w;
                    if (audioTrack != null && r(audioTrack) && this.u.k) {
                        if (this.w.getPlayState() == 3) {
                            this.w.setOffloadEndOfStream();
                            th3Var.G = true;
                            qh3 qh3Var = th3Var.e;
                            if (qh3Var != null && (ph3Var = (ph3) qh3Var.f) != null) {
                                ph3Var.f = true;
                            }
                        }
                        AudioTrack audioTrack2 = this.w;
                        androidx.media3.common.a aVar = this.u.a;
                        audioTrack2.setOffloadDelayPadding(aVar.G, aVar.H);
                        this.f0 = true;
                    }
                } else {
                    v();
                    if (!o()) {
                        g();
                    }
                }
                a(j);
            }
            return false;
        }
        boolean q = q();
        i6h i6hVar = this.m;
        if (!q) {
            try {
            } catch (AudioSink$InitializationException e) {
                if (e.isRecoverable) {
                    throw e;
                }
                i6hVar.a(e);
                return false;
            }
        }
        i6hVar.a = null;
        i6hVar.b = -9223372036854775807L;
        i6hVar.c = -9223372036854775807L;
        if (this.N) {
            this.O = Math.max(0L, j);
            this.M = false;
            this.N = false;
            if (G()) {
                A();
            }
            a(j);
            if (this.W) {
                u();
            }
        }
        long m = m();
        AudioTrack audioTrack3 = th3Var.c;
        audioTrack3.getClass();
        int playState = audioTrack3.getPlayState();
        if (th3Var.g) {
            if (playState == 2) {
                th3Var.o = false;
                return false;
            }
            if (playState == 1) {
            }
        }
        boolean z2 = th3Var.o;
        boolean d = th3Var.d(m);
        th3Var.o = d;
        if (z2 && !d && playState != 1) {
            sae saeVar = th3Var.a;
            int i9 = th3Var.d;
            long l02 = tw21.l0(th3Var.h);
            c cVar = (c) saeVar.b;
            if (cVar.s != null) {
                cVar.s.s(i9, l02, SystemClock.elapsedRealtime() - cVar.d0);
            }
        }
        if (this.Q == null) {
            d6z.l(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                f6h f6hVar4 = this.u;
                if (f6hVar4.c != 0 && this.L == 0) {
                    int i10 = f6hVar4.g;
                    if (i10 != 20) {
                        if (i10 != 30) {
                            switch (i10) {
                                case 5:
                                case 6:
                                    if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                        c = m83.a[((byteBuffer.get(byteBuffer.position() + 4) & DerValue.TAG_PRIVATE) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                        break;
                                    } else {
                                        c = HProv.ALG_TYPE_BLOCK;
                                        break;
                                    }
                                case 7:
                                case 8:
                                    break;
                                case 9:
                                    int i11 = byteBuffer.getInt(byteBuffer.position());
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i11 = Integer.reverseBytes(i11);
                                    }
                                    if ((i11 & (-2097152)) == -2097152 && (i6 = (i11 >>> 19) & 3) != 1 && (i7 = (i11 >>> 17) & 3) != 0) {
                                        z = false;
                                        int i12 = (i11 >>> 12) & 15;
                                        int i13 = (i11 >>> 10) & 3;
                                        if (i12 != 0 && i12 != 15 && i13 != 3) {
                                            i5 = 1152;
                                            if (i7 != 1) {
                                                if (i7 != 2) {
                                                    if (i7 != 3) {
                                                        w511.q();
                                                        return false;
                                                    }
                                                    i5 = 384;
                                                }
                                            } else if (i6 != 3) {
                                                i5 = 576;
                                            }
                                            if (i5 != -1) {
                                                w511.q();
                                                return z;
                                            }
                                            c = i5;
                                            break;
                                        }
                                    } else {
                                        z = false;
                                    }
                                    i5 = -1;
                                    if (i5 != -1) {
                                    }
                                    break;
                                case 10:
                                    c = 1024;
                                    break;
                                case 11:
                                case 12:
                                    c = 2048;
                                    break;
                                default:
                                    char c2 = 16;
                                    switch (i10) {
                                        case 14:
                                            int position = byteBuffer.position();
                                            int limit = byteBuffer.limit() - 10;
                                            int i14 = position;
                                            while (true) {
                                                if (i14 <= limit) {
                                                    int i15 = byteBuffer.getInt(i14 + 4);
                                                    char c3 = c2;
                                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                        i15 = Integer.reverseBytes(i15);
                                                    }
                                                    if ((i15 & (-2)) == -126718022) {
                                                        i8 = i14 - position;
                                                    } else {
                                                        i14++;
                                                        c2 = c3;
                                                    }
                                                } else {
                                                    i8 = -1;
                                                }
                                            }
                                            if (i8 == -1) {
                                                c = 0;
                                                break;
                                            } else {
                                                c = (40 << ((byteBuffer.get((byteBuffer.position() + i8) + ((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                                break;
                                            }
                                        case 15:
                                            c = 512;
                                            break;
                                        case 16:
                                            break;
                                        case 17:
                                            byte[] bArr = new byte[16];
                                            int position2 = byteBuffer.position();
                                            byteBuffer.get(bArr);
                                            byteBuffer.position(position2);
                                            c = eg3.l(new df90(bArr, 16)).c;
                                            break;
                                        case 18:
                                            break;
                                        default:
                                            ny61.r(oyr.i(i10, "Unexpected audio encoding: "));
                                            return false;
                                    }
                            }
                        }
                        if (byteBuffer.getInt(0) != -233094848 && byteBuffer.getInt(0) != -398277519) {
                            if (byteBuffer.getInt(0) == 622876772) {
                                c = 4096;
                            } else {
                                int position3 = byteBuffer.position();
                                byte b3 = byteBuffer.get(position3);
                                if (b3 != -2) {
                                    if (b3 == -1) {
                                        i3 = (byteBuffer.get(position3 + 4) & 7) << 4;
                                        b2 = byteBuffer.get(position3 + 7);
                                    } else if (b3 != 31) {
                                        i3 = (byteBuffer.get(position3 + 4) & 1) << 6;
                                        b = byteBuffer.get(position3 + 5);
                                    } else {
                                        i3 = (byteBuffer.get(position3 + 5) & 7) << 4;
                                        b2 = byteBuffer.get(position3 + 6);
                                    }
                                    i4 = b2 & Alerts.alert_export_restriction;
                                    c = (((i4 >> 2) | i3) + 1) * 32;
                                } else {
                                    i3 = (byteBuffer.get(position3 + 5) & 1) << 6;
                                    b = byteBuffer.get(position3 + 4);
                                }
                                i4 = b & 252;
                                c = (((i4 >> 2) | i3) + 1) * 32;
                            }
                        }
                        c = 1024;
                    } else {
                        if ((byteBuffer.get(5) & 2) == 0) {
                            i2 = 0;
                        } else {
                            byte b4 = byteBuffer.get(26);
                            int i16 = 28;
                            int i17 = 28;
                            for (int i18 = 0; i18 < b4; i18++) {
                                i17 += byteBuffer.get(i18 + 27);
                            }
                            byte b5 = byteBuffer.get(i17 + 26);
                            for (int i19 = 0; i19 < b5; i19++) {
                                i16 += byteBuffer.get(i17 + 27 + i19);
                            }
                            i2 = i17 + i16;
                        }
                        int i20 = byteBuffer.get(i2 + 26) + DerValue.tag_GeneralString + i2;
                        c = (int) ((xub1.c(byteBuffer.get(i20), byteBuffer.limit() - i20 > 1 ? byteBuffer.get(i20 + 1) : (byte) 0) * 48000) / 1000000);
                    }
                    this.L = c;
                }
                if (this.B != null) {
                    if (f()) {
                        a(j);
                        this.B = null;
                    }
                    return false;
                }
                final long c0 = tw21.c0(this.u.a.E, l() - this.e.o) + this.O;
                if (!this.M && Math.abs(c0 - j) > 200000) {
                    bh3 bh3Var = this.s;
                    if (bh3Var != null) {
                        bh3Var.onAudioSinkError(new Exception(j, c0) { // from class: androidx.media3.exoplayer.audio.AudioSink$UnexpectedDiscontinuityException
                            public final long actualPresentationTimeUs;
                            public final long expectedPresentationTimeUs;

                            /* JADX WARN: Illegal instructions before constructor call */
                            {
                                super(r0.toString());
                                StringBuilder w = unr0.w(c0, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                w.append(j);
                                this.actualPresentationTimeUs = j;
                                this.expectedPresentationTimeUs = c0;
                            }
                        });
                    }
                    this.M = true;
                }
                if (this.M) {
                    if (f()) {
                        long j2 = j - c0;
                        this.O += j2;
                        this.M = false;
                        a(j);
                        bh3 bh3Var2 = this.s;
                        if (bh3Var2 != null && j2 != 0) {
                            bh3Var2.I();
                        }
                    }
                    return false;
                }
                if (this.u.c == 0) {
                    this.H += byteBuffer.remaining();
                } else {
                    this.I = (this.L * i) + this.I;
                }
                this.Q = byteBuffer;
                this.R = i;
            }
            return true;
        }
        w(j);
        if (!this.Q.hasRemaining()) {
            this.Q = null;
            this.R = 0;
            return true;
        }
        long m2 = m();
        if (th3Var.y != -9223372036854775807L && m2 > 0) {
            ((o2x0) th3Var.I).getClass();
            if (SystemClock.elapsedRealtime() - th3Var.y >= 200) {
                lk91.j("Resetting stalled audio track");
                g();
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        if (q()) {
            return !(tw21.a >= 29 && this.w.isOffloadedPlayback() && this.V) && this.h.d(m());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p() {
        AudioTrack c;
        a aVar;
        vyc0 vyc0Var;
        boolean equals;
        boolean z;
        LogSessionId unused;
        i6h i6hVar = this.m;
        if (i6hVar.a != null) {
            synchronized (k0) {
                z = m0 > 0;
            }
            if (z || SystemClock.elapsedRealtime() < i6hVar.c) {
                return false;
            }
        }
        try {
            f6h f6hVar = this.u;
            f6hVar.getClass();
            c = c(f6hVar);
        } catch (AudioSink$InitializationException e) {
            f6h f6hVar2 = this.u;
            if (f6hVar2.h > 1000000) {
                f6h f6hVar3 = new f6h(f6hVar2.a, f6hVar2.b, f6hVar2.c, f6hVar2.d, f6hVar2.e, f6hVar2.f, f6hVar2.g, 1000000, f6hVar2.i, f6hVar2.j, f6hVar2.k, f6hVar2.l);
                try {
                    c = c(f6hVar3);
                    this.u = f6hVar3;
                } catch (AudioSink$InitializationException e2) {
                    e.addSuppressed(e2);
                    if (this.u.c == 1) {
                        throw e;
                    }
                    this.e0 = true;
                    throw e;
                }
            }
            if (this.u.c == 1) {
            }
        }
        this.w = c;
        if (r(c)) {
            AudioTrack audioTrack = this.w;
            if (this.l == null) {
                this.l = new b(this);
            }
            b bVar = this.l;
            Handler handler = bVar.a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new j6h(handler), bVar.b);
            f6h f6hVar4 = this.u;
            if (f6hVar4.k) {
                AudioTrack audioTrack2 = this.w;
                androidx.media3.common.a aVar2 = f6hVar4.a;
                audioTrack2.setOffloadDelayPadding(aVar2.G, aVar2.H);
            }
        }
        int i = tw21.a;
        if (i >= 31 && (vyc0Var = this.r) != null) {
            AudioTrack audioTrack3 = this.w;
            LogSessionId a = vyc0Var.a();
            unused = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a.equals(LogSessionId.LOG_SESSION_ID_NONE);
            if (!equals) {
                audioTrack3.setLogSessionId(a);
            }
        }
        this.Y = this.w.getAudioSessionId();
        th3 th3Var = this.h;
        AudioTrack audioTrack4 = this.w;
        f6h f6hVar5 = this.u;
        boolean z2 = f6hVar5.c == 2;
        int i2 = f6hVar5.g;
        int i3 = f6hVar5.d;
        int i4 = f6hVar5.h;
        th3Var.c = audioTrack4;
        th3Var.d = i4;
        th3Var.e = new qh3(audioTrack4, 0);
        th3Var.f = audioTrack4.getSampleRate();
        th3Var.g = z2 && i < 23 && (i2 == 5 || i2 == 6);
        boolean R = tw21.R(i2);
        th3Var.p = R;
        th3Var.h = R ? tw21.c0(th3Var.f, i4 / i3) : -9223372036854775807L;
        th3Var.s = 0L;
        th3Var.t = 0L;
        th3Var.G = false;
        th3Var.H = 0L;
        th3Var.u = 0L;
        th3Var.o = false;
        th3Var.x = -9223372036854775807L;
        th3Var.y = -9223372036854775807L;
        th3Var.q = 0L;
        th3Var.n = 0L;
        th3Var.i = 1.0f;
        if (q()) {
            this.w.setVolume(this.P);
        }
        this.Z.getClass();
        ddf ddfVar = this.a0;
        if (ddfVar != null && i >= 23) {
            this.w.setPreferredDevice((AudioDeviceInfo) ddfVar.b);
            a aVar3 = this.y;
            if (aVar3 != null) {
                aVar3.b((AudioDeviceInfo) this.a0.b);
            }
        }
        if (i >= 24 && (aVar = this.y) != null) {
            AudioTrack audioTrack5 = this.w;
            final wwf wwfVar = new wwf();
            wwfVar.a = audioTrack5;
            wwfVar.b = aVar;
            wwfVar.c = new AudioRouting.OnRoutingChangedListener() { // from class: h6h
                @Override // android.media.AudioRouting.OnRoutingChangedListener
                public final void onRoutingChanged(AudioRouting audioRouting) {
                    AudioDeviceInfo routedDevice;
                    wwf wwfVar2 = wwf.this;
                    if (((h6h) wwfVar2.c) == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                        return;
                    }
                    ((a) wwfVar2.b).b(routedDevice);
                }
            };
            audioTrack5.addOnRoutingChangedListener((h6h) wwfVar.c, new Handler(Looper.myLooper()));
            this.z = wwfVar;
        }
        this.N = true;
        bh3 bh3Var = this.s;
        if (bh3Var != null) {
            bh3Var.onAudioTrackInitialized(this.u.a());
        }
        return true;
    }

    public final boolean q() {
        return this.w != null;
    }

    public final void s() {
        Context context;
        ye3 c;
        AudioCapabilitiesReceiver$AudioDeviceCallbackV23 audioCapabilitiesReceiver$AudioDeviceCallbackV23;
        if (this.y == null && (context = this.a) != null) {
            this.g0 = Looper.myLooper();
            a aVar = new a(context, new v8e(11, this), this.A, this.a0);
            this.y = aVar;
            if (aVar.j) {
                c = aVar.g;
                c.getClass();
            } else {
                aVar.j = true;
                AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver audioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver = aVar.f;
                if (audioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver != null) {
                    audioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver.register();
                }
                int i = tw21.a;
                Handler handler = aVar.c;
                Context context2 = aVar.a;
                if (i >= 23 && (audioCapabilitiesReceiver$AudioDeviceCallbackV23 = aVar.d) != null) {
                    eg3.i(context2).registerAudioDeviceCallback(audioCapabilitiesReceiver$AudioDeviceCallbackV23, handler);
                }
                c = ye3.c(context2, context2.registerReceiver(aVar.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), aVar.i, aVar.h);
                aVar.g = c;
            }
            this.x = c;
        }
        this.x.getClass();
    }

    public final void t() {
        this.W = false;
        if (q()) {
            th3 th3Var = this.h;
            th3Var.e();
            if (th3Var.x == -9223372036854775807L) {
                qh3 qh3Var = th3Var.e;
                qh3Var.getClass();
                qh3Var.c();
            } else {
                th3Var.z = th3Var.b();
                if (!r(this.w)) {
                    return;
                }
            }
            this.w.pause();
        }
    }

    public final void u() {
        this.W = true;
        if (q()) {
            th3 th3Var = this.h;
            if (th3Var.x != -9223372036854775807L) {
                ((o2x0) th3Var.I).getClass();
                th3Var.x = tw21.W(SystemClock.elapsedRealtime());
            }
            qh3 qh3Var = th3Var.e;
            qh3Var.getClass();
            qh3Var.c();
            this.w.play();
        }
    }

    public final void v() {
        if (this.U) {
            return;
        }
        this.U = true;
        long m = m();
        th3 th3Var = this.h;
        th3Var.z = th3Var.b();
        ((o2x0) th3Var.I).getClass();
        th3Var.x = tw21.W(SystemClock.elapsedRealtime());
        th3Var.A = m;
        if (r(this.w)) {
            this.V = false;
        }
        this.w.stop();
        this.G = 0;
    }

    public final void w(long j) {
        ByteBuffer byteBuffer;
        e(j);
        if (this.S != null) {
            return;
        }
        if (!this.v.d()) {
            ByteBuffer byteBuffer2 = this.Q;
            if (byteBuffer2 != null) {
                D(byteBuffer2);
                e(j);
                return;
            }
            return;
        }
        while (!this.v.c()) {
            do {
                mg3 mg3Var = this.v;
                if (mg3Var.d()) {
                    ByteBuffer byteBuffer3 = mg3Var.c[mg3Var.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        mg3Var.e(og3.a);
                        byteBuffer = mg3Var.c[mg3Var.b()];
                    }
                } else {
                    byteBuffer = og3.a;
                }
                if (byteBuffer.hasRemaining()) {
                    D(byteBuffer);
                    e(j);
                } else {
                    ByteBuffer byteBuffer4 = this.Q;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    mg3 mg3Var2 = this.v;
                    ByteBuffer byteBuffer5 = this.Q;
                    if (mg3Var2.d() && !mg3Var2.d) {
                        mg3Var2.e(byteBuffer5);
                    }
                }
            } while (this.S == null);
            return;
        }
    }

    public final void x() {
        AudioCapabilitiesReceiver$AudioDeviceCallbackV23 audioCapabilitiesReceiver$AudioDeviceCallbackV23;
        a aVar = this.y;
        if (aVar != null) {
            Context context = aVar.a;
            if (aVar.j) {
                aVar.g = null;
                if (tw21.a >= 23 && (audioCapabilitiesReceiver$AudioDeviceCallbackV23 = aVar.d) != null) {
                    eg3.i(context).unregisterAudioDeviceCallback(audioCapabilitiesReceiver$AudioDeviceCallbackV23);
                }
                context.unregisterReceiver(aVar.e);
                AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver audioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver = aVar.f;
                if (audioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver != null) {
                    audioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver.unregister();
                }
                aVar.j = false;
            }
        }
    }

    public final void y() {
        g();
        piv listIterator = this.f.listIterator(0);
        while (listIterator.hasNext()) {
            ((og3) listIterator.next()).reset();
        }
        piv listIterator2 = this.g.listIterator(0);
        while (listIterator2.hasNext()) {
            ((og3) listIterator2.next()).reset();
        }
        mg3 mg3Var = this.v;
        if (mg3Var != null) {
            ImmutableList immutableList = mg3Var.a;
            for (int i = 0; i < immutableList.size(); i++) {
                og3 og3Var = (og3) immutableList.get(i);
                og3Var.flush();
                og3Var.reset();
            }
            mg3Var.c = new ByteBuffer[0];
            ng3 ng3Var = ng3.e;
            mg3Var.d = false;
        }
        this.W = false;
        this.e0 = false;
    }

    public final void z(ue3 ue3Var) {
        if (this.A.equals(ue3Var)) {
            return;
        }
        this.A = ue3Var;
        if (this.b0) {
            return;
        }
        a aVar = this.y;
        if (aVar != null) {
            aVar.i = ue3Var;
            aVar.a(ye3.b(aVar.a, ue3Var, aVar.h));
        }
        g();
    }
}
