package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;
import yads.bk;
import yads.ck;
import yads.dk;
import yads.ek;
import yads.xj;

/* loaded from: classes7.dex */
public final class n671 {
    public long A;
    public int B;
    public boolean C;
    public boolean D;
    public long E;
    public float F;
    public lv81[] G;
    public ByteBuffer[] H;
    public ByteBuffer I;
    public int J;
    public ByteBuffer K;
    public byte[] L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public zp71 T;
    public boolean U;
    public long V;
    public boolean W;
    public boolean X;
    public final b981 a;
    public final vi71 b;
    public final tn71 c;
    public final uz61 d;
    public final lv81[] e;
    public final lv81[] f;
    public final sh71 g;
    public final wj71 h;
    public final ArrayDeque i;
    public n371 j;
    public final ul61 k;
    public final ul61 l;
    public final r400 m;
    public wl61 n;
    public sl81 o;
    public as81 p;
    public as81 q;
    public AudioTrack r;
    public ws71 s;
    public nh61 t;
    public nh61 u;
    public ByteBuffer v;
    public int w;
    public long x;
    public long y;
    public long z;

    public n671(oo81 oo81Var) {
        this.a = oo81Var.a;
        vi71 vi71Var = oo81Var.b;
        this.b = vi71Var;
        int i = rf71.a;
        this.m = oo81Var.c;
        sh71 sh71Var = new sh71();
        this.g = sh71Var;
        sh71Var.c();
        this.h = new wj71(new ji41(16, this));
        tn71 tn71Var = new tn71();
        this.c = tn71Var;
        uz61 uz61Var = new uz61();
        this.d = uz61Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new m981(), tn71Var, uz61Var);
        Collections.addAll(arrayList, (lv81[]) vi71Var.b);
        this.e = (lv81[]) arrayList.toArray(new lv81[0]);
        this.f = new lv81[]{new vk71()};
        this.F = 1.0f;
        this.s = ws71.z;
        this.S = 0;
        this.T = new zp71();
        this.u = new nh61(kv71.w, false, 0L, 0L);
        this.N = -1;
        this.G = new lv81[0];
        this.H = new ByteBuffer[0];
        this.i = new ArrayDeque();
        this.k = new ul61();
        this.l = new ul61();
    }

    public static boolean h(AudioTrack audioTrack) {
        return rf71.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final int a(qd81 qd81Var) {
        String str = qd81Var.E;
        int i = qd81Var.T;
        if (!"audio/raw".equals(str)) {
            if (!this.W) {
                int i2 = rf71.a;
            }
            if (this.a.a(qd81Var) == null) {
                return 0;
            }
        } else {
            if (!rf71.z(i)) {
                nba1.e();
                return 0;
            }
            if (i != 2) {
                return 1;
            }
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d1 A[Catch: Exception -> 0x01d7, TRY_LEAVE, TryCatch #0 {Exception -> 0x01d7, blocks: (B:52:0x01ac, B:54:0x01d1), top: B:51:0x01ac }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(boolean z) {
        long j;
        boolean z2;
        long a;
        long j2;
        float f;
        long j3;
        ArrayDeque arrayDeque;
        boolean equals;
        long j4;
        long j5;
        long j6;
        long j7;
        long round;
        long j8;
        boolean z3;
        long j9;
        long j10;
        Method method;
        long max;
        AudioTimestamp audioTimestamp;
        if (!n() || this.D) {
            return Long.MIN_VALUE;
        }
        wj71 wj71Var = this.h;
        AudioTrack audioTrack = wj71Var.c;
        long[] jArr = wj71Var.b;
        n671 n671Var = (n671) wj71Var.a.b;
        audioTrack.getClass();
        long j11 = 0;
        if (audioTrack.getPlayState() == 3) {
            long a2 = (wj71Var.a() * 1000000) / wj71Var.g;
            if (a2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                j = 1000000;
                if (nanoTime - wj71Var.m >= 30000) {
                    int i = wj71Var.v;
                    jArr[i] = a2 - nanoTime;
                    wj71Var.v = (i + 1) % 10;
                    int i2 = wj71Var.w;
                    if (i2 < 10) {
                        wj71Var.w = i2 + 1;
                    }
                    wj71Var.m = nanoTime;
                    wj71Var.l = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = wj71Var.w;
                        if (i3 >= i4) {
                            break;
                        }
                        wj71Var.l = (jArr[i3] / i4) + wj71Var.l;
                        i3++;
                        j11 = j11;
                    }
                }
                long j12 = j11;
                if (!wj71Var.h) {
                    qh3 qh3Var = wj71Var.f;
                    qh3Var.getClass();
                    rd71 rd71Var = (rd71) qh3Var.f;
                    if (rd71Var != null) {
                        AudioTimestamp audioTimestamp2 = (AudioTimestamp) rd71Var.e;
                        j8 = 500000;
                        if (nanoTime - qh3Var.d >= qh3Var.c) {
                            qh3Var.d = nanoTime;
                            z3 = ((AudioTrack) rd71Var.d).getTimestamp(audioTimestamp2);
                            if (z3) {
                                long j13 = audioTimestamp2.framePosition;
                                audioTimestamp = audioTimestamp2;
                                if (rd71Var.b > j13) {
                                    rd71Var.a++;
                                }
                                rd71Var.b = j13;
                                rd71Var.c = j13 + (rd71Var.a << 32);
                            } else {
                                audioTimestamp = audioTimestamp2;
                            }
                            int i5 = qh3Var.a;
                            if (i5 != 0) {
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            if (i5 != 4) {
                                                ny61.k();
                                                return j12;
                                            }
                                        } else if (z3) {
                                            qh3Var.a();
                                        }
                                    } else if (!z3) {
                                        qh3Var.a();
                                    }
                                } else if (!z3) {
                                    qh3Var.a();
                                } else if (rd71Var.c > qh3Var.e) {
                                    qh3Var.b(2);
                                }
                            } else if (z3) {
                                if (audioTimestamp.nanoTime / 1000 >= qh3Var.b) {
                                    qh3Var.e = rd71Var.c;
                                    qh3Var.b(1);
                                }
                            } else if (nanoTime - qh3Var.b > 500000) {
                                qh3Var.b(3);
                            }
                            if (z3) {
                                j9 = 5000000;
                            } else {
                                long j14 = rd71Var != null ? ((AudioTimestamp) rd71Var.e).nanoTime / 1000 : -9223372036854775807L;
                                if (rd71Var != null) {
                                    j9 = 5000000;
                                    j10 = rd71Var.c;
                                } else {
                                    j9 = 5000000;
                                    j10 = -1;
                                }
                                if (Math.abs(j14 - nanoTime) > j9) {
                                    if (n671Var.q.c == 0) {
                                        long j15 = n671Var.x / r3.b;
                                    }
                                    n671Var.l();
                                    nba1.e();
                                    qh3Var.b(4);
                                } else if (Math.abs(((j10 * 1000000) / wj71Var.g) - a2) > j9) {
                                    if (n671Var.q.c == 0) {
                                        long j16 = n671Var.x / r3.b;
                                    }
                                    n671Var.l();
                                    nba1.e();
                                    qh3Var.b(4);
                                } else if (qh3Var.a == 4) {
                                    qh3Var.a();
                                }
                            }
                            if (wj71Var.q && (method = wj71Var.n) != null && nanoTime - wj71Var.r >= j8) {
                                try {
                                    AudioTrack audioTrack2 = wj71Var.c;
                                    audioTrack2.getClass();
                                    Integer num = (Integer) method.invoke(audioTrack2, null);
                                    int i6 = rf71.a;
                                    long intValue = (num.intValue() * 1000) - wj71Var.i;
                                    wj71Var.o = intValue;
                                    max = Math.max(intValue, j12);
                                    wj71Var.o = max;
                                    if (max > j9) {
                                        nba1.e();
                                        wj71Var.o = j12;
                                    }
                                } catch (Exception unused) {
                                    wj71Var.n = null;
                                }
                                wj71Var.r = nanoTime;
                            }
                        }
                    } else {
                        j8 = 500000;
                    }
                    z3 = false;
                    if (z3) {
                    }
                    if (wj71Var.q) {
                        AudioTrack audioTrack22 = wj71Var.c;
                        audioTrack22.getClass();
                        Integer num2 = (Integer) method.invoke(audioTrack22, null);
                        int i62 = rf71.a;
                        long intValue2 = (num2.intValue() * 1000) - wj71Var.i;
                        wj71Var.o = intValue2;
                        max = Math.max(intValue2, j12);
                        wj71Var.o = max;
                        if (max > j9) {
                        }
                        wj71Var.r = nanoTime;
                    }
                }
                long nanoTime2 = System.nanoTime() / 1000;
                qh3 qh3Var2 = wj71Var.f;
                qh3Var2.getClass();
                rd71 rd71Var2 = (rd71) qh3Var2.f;
                z2 = qh3Var2.a != 2;
                if (z2) {
                    a = wj71Var.w == 0 ? (wj71Var.a() * j) / wj71Var.g : wj71Var.l + nanoTime2;
                    if (!z) {
                        a = Math.max(0L, a - wj71Var.o);
                    }
                } else {
                    long j17 = ((rd71Var2 != null ? rd71Var2.c : -1L) * j) / wj71Var.g;
                    long j18 = nanoTime2 - (rd71Var2 != null ? ((AudioTimestamp) rd71Var2.e).nanoTime / 1000 : -9223372036854775807L);
                    float f2 = wj71Var.j;
                    int i7 = rf71.a;
                    if (f2 != 1.0f) {
                        j18 = Math.round(j18 * f2);
                    }
                    a = j18 + j17;
                }
                if (wj71Var.D != z2) {
                    wj71Var.F = wj71Var.C;
                    wj71Var.E = wj71Var.B;
                }
                j2 = nanoTime2 - wj71Var.F;
                if (j2 >= j) {
                    long j19 = wj71Var.E;
                    float f3 = wj71Var.j;
                    int i8 = rf71.a;
                    if (f3 == 1.0f) {
                        f = 1.0f;
                        j6 = a;
                        round = j2;
                        j7 = round;
                    } else {
                        f = 1.0f;
                        j6 = a;
                        j7 = j2;
                        round = Math.round(j2 * f3);
                    }
                    long j20 = (j7 * 1000) / j;
                    j3 = (((1000 - j20) * (round + j19)) + (j6 * j20)) / 1000;
                } else {
                    f = 1.0f;
                    j3 = a;
                }
                if (!wj71Var.k) {
                    long j21 = wj71Var.B;
                    if (j3 > j21) {
                        wj71Var.k = true;
                        long u = rf71.u(j3 - j21);
                        float f4 = wj71Var.j;
                        if (f4 != f) {
                            u = Math.round(u / f4);
                        }
                        long currentTimeMillis = System.currentTimeMillis() - rf71.u(u);
                        sl81 sl81Var = n671Var.o;
                        if (sl81Var != null) {
                            hn71 hn71Var = ((u191) sl81Var.a).v1;
                            ((Handler) hn71Var.b).post(new x191(hn71Var, currentTimeMillis));
                        }
                    }
                }
                wj71Var.C = nanoTime2;
                wj71Var.B = j3;
                wj71Var.D = z2;
                long min = Math.min(j3, (l() * j) / this.q.e);
                while (true) {
                    arrayDeque = this.i;
                    if (!!arrayDeque.isEmpty() || min < ((nh61) arrayDeque.getFirst()).d) {
                        break;
                    }
                    this.u = (nh61) arrayDeque.remove();
                }
                nh61 nh61Var = this.u;
                long j22 = min - nh61Var.d;
                equals = nh61Var.a.equals(kv71.w);
                vi71 vi71Var = this.b;
                if (!equals) {
                    j4 = this.u.c + j22;
                } else if (arrayDeque.isEmpty()) {
                    j871 j871Var = (j871) vi71Var.w;
                    if (j871Var.o >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                        long j23 = j871Var.n;
                        j871Var.j.getClass();
                        long j24 = j23 - ((r4.k * r4.b) * 2);
                        int i9 = j871Var.h.a;
                        int i10 = j871Var.g.a;
                        long j25 = j871Var.o;
                        j5 = i9 == i10 ? rf71.h(j22, j24, j25) : rf71.h(j22, j24 * i9, j25 * i10);
                    } else {
                        j5 = (long) (j871Var.c * j22);
                    }
                    j4 = j5 + this.u.c;
                } else {
                    nh61 nh61Var2 = (nh61) arrayDeque.getFirst();
                    long j26 = nh61Var2.d - min;
                    float f5 = this.u.a.a;
                    int i11 = rf71.a;
                    if (f5 != f) {
                        j26 = Math.round(j26 * f5);
                    }
                    j4 = nh61Var2.c - j26;
                }
                return ((((tn61) vi71Var.c).t * j) / this.q.e) + j4;
            }
        }
        j = 1000000;
        long nanoTime22 = System.nanoTime() / 1000;
        qh3 qh3Var22 = wj71Var.f;
        qh3Var22.getClass();
        rd71 rd71Var22 = (rd71) qh3Var22.f;
        if (qh3Var22.a != 2) {
        }
        if (z2) {
        }
        if (wj71Var.D != z2) {
        }
        j2 = nanoTime22 - wj71Var.F;
        if (j2 >= j) {
        }
        if (!wj71Var.k) {
        }
        wj71Var.C = nanoTime22;
        wj71Var.B = j3;
        wj71Var.D = z2;
        long min2 = Math.min(j3, (l() * j) / this.q.e);
        while (true) {
            arrayDeque = this.i;
            if (!arrayDeque.isEmpty()) {
                break;
            }
            break;
            this.u = (nh61) arrayDeque.remove();
        }
        nh61 nh61Var3 = this.u;
        long j222 = min2 - nh61Var3.d;
        equals = nh61Var3.a.equals(kv71.w);
        vi71 vi71Var2 = this.b;
        if (!equals) {
        }
        return ((((tn61) vi71Var2.c).t * j) / this.q.e) + j4;
    }

    public final void c(long j) {
        kv71 kv71Var;
        boolean z;
        boolean z2 = this.U;
        vi71 vi71Var = this.b;
        if (z2 || !"audio/raw".equals(this.q.a.E)) {
            kv71Var = kv71.w;
        } else {
            int i = this.q.a.T;
            kv71Var = k().a;
            j871 j871Var = (j871) vi71Var.w;
            float f = kv71Var.a;
            if (j871Var.c != f) {
                j871Var.c = f;
                j871Var.i = true;
            }
            float f2 = kv71Var.b;
            if (j871Var.d != f2) {
                j871Var.d = f2;
                j871Var.i = true;
            }
        }
        kv71 kv71Var2 = kv71Var;
        int i2 = 0;
        if (this.U || !"audio/raw".equals(this.q.a.E)) {
            z = false;
        } else {
            int i3 = this.q.a.T;
            boolean z3 = k().b;
            ((tn61) vi71Var.c).m = z3;
            z = z3;
        }
        this.i.add(new nh61(kv71Var2, z, Math.max(0L, j), (l() * 1000000) / this.q.e));
        lv81[] lv81VarArr = this.q.i;
        ArrayList arrayList = new ArrayList();
        for (lv81 lv81Var : lv81VarArr) {
            if (lv81Var.isActive()) {
                arrayList.add(lv81Var);
            } else {
                lv81Var.flush();
            }
        }
        int size = arrayList.size();
        this.G = (lv81[]) arrayList.toArray(new lv81[size]);
        this.H = new ByteBuffer[size];
        while (true) {
            lv81[] lv81VarArr2 = this.G;
            if (i2 >= lv81VarArr2.length) {
                break;
            }
            lv81 lv81Var2 = lv81VarArr2[i2];
            lv81Var2.flush();
            this.H[i2] = lv81Var2.a();
            i2++;
        }
        sl81 sl81Var = this.o;
        if (sl81Var != null) {
            hn71 hn71Var = ((u191) sl81Var.a).v1;
            ((Handler) hn71Var.b).post(new rg3(hn71Var, z, 16));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00dd, code lost:
    
        if (r13 < r12) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ByteBuffer byteBuffer, long j) {
        ByteBuffer byteBuffer2;
        int write;
        sl81 sl81Var;
        cq71 cq71Var;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.K;
            if (byteBuffer3 == null) {
                this.K = byteBuffer;
                if (rf71.a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.L;
                    if (bArr == null || bArr.length < remaining) {
                        this.L = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.L, 0, remaining);
                    byteBuffer.position(position);
                    this.M = 0;
                }
            } else if (byteBuffer3 != byteBuffer) {
                w511.q();
                return;
            }
            int remaining2 = byteBuffer.remaining();
            int i = rf71.a;
            if (i < 21) {
                long j2 = this.z;
                wj71 wj71Var = this.h;
                int a = wj71Var.e - ((int) (j2 - (wj71Var.a() * wj71Var.d)));
                if (a > 0) {
                    write = this.r.write(this.L, this.M, Math.min(remaining2, a));
                    if (write > 0) {
                        this.M += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                    byteBuffer2 = byteBuffer;
                } else {
                    byteBuffer2 = byteBuffer;
                    write = 0;
                }
            } else if (!this.U) {
                byteBuffer2 = byteBuffer;
                write = this.r.write(byteBuffer2, remaining2, 1);
            } else {
                if (j == -9223372036854775807L) {
                    ny61.k();
                    return;
                }
                AudioTrack audioTrack = this.r;
                if (i >= 26) {
                    byteBuffer2 = byteBuffer;
                    write = audioTrack.write(byteBuffer2, remaining2, 1, j * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.v == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.v = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.v.putInt(1431633921);
                    }
                    if (this.w == 0) {
                        this.v.putInt(4, remaining2);
                        this.v.putLong(8, j * 1000);
                        this.v.position(0);
                        this.w = remaining2;
                    }
                    int remaining3 = this.v.remaining();
                    if (remaining3 > 0) {
                        write = audioTrack.write(this.v, remaining3, 1);
                        if (write < 0) {
                            this.w = 0;
                        }
                    }
                    write = audioTrack.write(byteBuffer2, remaining2, 1);
                    if (write < 0) {
                        this.w = 0;
                    } else {
                        this.w -= write;
                    }
                }
            }
            this.V = SystemClock.elapsedRealtime();
            ul61 ul61Var = this.l;
            if (write >= 0) {
                ul61Var.a = null;
                if (h(this.r)) {
                    if (this.A > 0) {
                        this.X = false;
                    }
                    if (this.Q && (sl81Var = this.o) != null && write < remaining2 && !this.X && (cq71Var = ((u191) sl81Var.a).X1) != null) {
                        cq71Var.a.H = true;
                    }
                }
                int i2 = this.q.c;
                if (i2 == 0) {
                    this.z += write;
                }
                if (write == remaining2) {
                    if (i2 != 0) {
                        if (byteBuffer2 != this.I) {
                            ny61.k();
                            return;
                        }
                        this.A = (this.B * this.J) + this.A;
                    }
                    this.K = null;
                    return;
                }
                return;
            }
            boolean z = (i >= 24 && write == -6) || write == -32;
            if (z && this.q.c == 1) {
                this.W = true;
            }
            ek ekVar = new ek(write, this.q.a, z);
            sl81 sl81Var2 = this.o;
            if (sl81Var2 != null) {
                nba1.c("MediaCodecAudioRenderer", nba1.b("Audio sink error", ekVar));
                ((u191) sl81Var2.a).v1.o(ekVar);
            }
            if (ekVar.c) {
                throw ekVar;
            }
            ul61Var.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (ul61Var.a == null) {
                ul61Var.a = ekVar;
                ul61Var.b = 100 + elapsedRealtime;
            }
            if (elapsedRealtime >= ul61Var.b) {
                Exception exc = ul61Var.a;
                if (exc != ekVar) {
                    exc.addSuppressed(ekVar);
                }
                Exception exc2 = ul61Var.a;
                ul61Var.a = null;
                throw exc2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void e(qd81 qd81Var, int[] iArr) {
        int intValue;
        lv81[] lv81VarArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int max;
        int[] iArr2;
        String str = qd81Var.E;
        int i7 = qd81Var.S;
        int i8 = qd81Var.R;
        int i9 = qd81Var.T;
        if (!"audio/raw".equals(str)) {
            lv81[] lv81VarArr2 = new lv81[0];
            int i10 = rf71.a;
            Pair a = this.a.a(qd81Var);
            if (a == null) {
                throw new bk("Unable to configure passthrough for: " + qd81Var, qd81Var);
            }
            int intValue2 = ((Integer) a.first).intValue();
            intValue = ((Integer) a.second).intValue();
            lv81VarArr = lv81VarArr2;
            i = i7;
            i2 = -1;
            i3 = 2;
            i4 = intValue2;
            i5 = -1;
        } else {
            if (!rf71.z(i9)) {
                w511.q();
                return;
            }
            int b = rf71.b(i9, i8);
            int i11 = qd81Var.U;
            int i12 = qd81Var.V;
            uz61 uz61Var = this.d;
            uz61Var.i = i11;
            uz61Var.j = i12;
            if (rf71.a < 21 && i8 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i13 = 0; i13 < 6; i13++) {
                    iArr2[i13] = i13;
                }
            } else {
                iArr2 = iArr;
            }
            this.c.i = iArr2;
            mp81 mp81Var = new mp81(i7, i8, i9);
            lv81[] lv81VarArr3 = this.e;
            for (lv81 lv81Var : lv81VarArr3) {
                try {
                    mp81 b2 = lv81Var.b(mp81Var);
                    if (lv81Var.isActive()) {
                        mp81Var = b2;
                    }
                } catch (xj e) {
                    throw new bk(e, qd81Var);
                }
            }
            i4 = mp81Var.c;
            int i14 = mp81Var.b;
            i = mp81Var.a;
            intValue = rf71.a(i14);
            i5 = rf71.b(i4, i14);
            lv81VarArr = lv81VarArr3;
            i2 = b;
            i3 = 0;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i, intValue, i4);
        if (minBufferSize == -2) {
            ny61.k();
            return;
        }
        this.m.getClass();
        if (i3 != 0) {
            int i15 = 80000;
            if (i3 != 1) {
                if (i3 != 2) {
                    w511.q();
                    return;
                }
                int i16 = i4 == 5 ? 500000 : 250000;
                switch (i4) {
                    case 5:
                        max = aka1.e((i16 * i15) / 1000000);
                        break;
                    case 6:
                    case 18:
                        i15 = 768000;
                        max = aka1.e((i16 * i15) / 1000000);
                        break;
                    case 7:
                        i15 = 192000;
                        max = aka1.e((i16 * i15) / 1000000);
                        break;
                    case 8:
                        i15 = 2250000;
                        max = aka1.e((i16 * i15) / 1000000);
                        break;
                    case 9:
                        i15 = 40000;
                        max = aka1.e((i16 * i15) / 1000000);
                        break;
                    case 10:
                        i15 = 100000;
                        max = aka1.e((i16 * i15) / 1000000);
                        break;
                    case 11:
                        i15 = 16000;
                        max = aka1.e((i16 * i15) / 1000000);
                        break;
                    case 12:
                        i15 = 7000;
                        max = aka1.e((i16 * i15) / 1000000);
                        break;
                    case 13:
                    default:
                        w511.q();
                        return;
                    case 14:
                        i15 = 3062500;
                        max = aka1.e((i16 * i15) / 1000000);
                        break;
                    case 15:
                        i15 = 8000;
                        max = aka1.e((i16 * i15) / 1000000);
                        break;
                    case 16:
                        i15 = 256000;
                        max = aka1.e((i16 * i15) / 1000000);
                        break;
                    case 17:
                        i15 = 336000;
                        max = aka1.e((i16 * i15) / 1000000);
                        break;
                }
            } else {
                switch (i4) {
                    case 5:
                        max = aka1.e((50000000 * i15) / 1000000);
                        break;
                    case 6:
                    case 18:
                        i15 = 768000;
                        max = aka1.e((50000000 * i15) / 1000000);
                        break;
                    case 7:
                        i15 = 192000;
                        max = aka1.e((50000000 * i15) / 1000000);
                        break;
                    case 8:
                        i15 = 2250000;
                        max = aka1.e((50000000 * i15) / 1000000);
                        break;
                    case 9:
                        i15 = 40000;
                        max = aka1.e((50000000 * i15) / 1000000);
                        break;
                    case 10:
                        i15 = 100000;
                        max = aka1.e((50000000 * i15) / 1000000);
                        break;
                    case 11:
                        i15 = 16000;
                        max = aka1.e((50000000 * i15) / 1000000);
                        break;
                    case 12:
                        i15 = 7000;
                        max = aka1.e((50000000 * i15) / 1000000);
                        break;
                    case 13:
                    default:
                        w511.q();
                        return;
                    case 14:
                        i15 = 3062500;
                        max = aka1.e((50000000 * i15) / 1000000);
                        break;
                    case 15:
                        i15 = 8000;
                        max = aka1.e((50000000 * i15) / 1000000);
                        break;
                    case 16:
                        i15 = 256000;
                        max = aka1.e((50000000 * i15) / 1000000);
                        break;
                    case 17:
                        i15 = 336000;
                        max = aka1.e((50000000 * i15) / 1000000);
                        break;
                }
            }
            i6 = i;
        } else {
            long j = i;
            i6 = i;
            long j2 = i5;
            max = Math.max(aka1.e(((250000 * j) * j2) / 1000000), Math.min(minBufferSize * 4, aka1.e(((750000 * j) * j2) / 1000000)));
        }
        int max2 = (((Math.max(minBufferSize, (int) (max * 1.0d)) + i5) - 1) / i5) * i5;
        if (i4 == 0) {
            throw new bk("Invalid output encoding (mode=" + i3 + ") for: " + qd81Var, qd81Var);
        }
        if (intValue == 0) {
            throw new bk("Invalid output channel config (mode=" + i3 + ") for: " + qd81Var, qd81Var);
        }
        this.W = false;
        as81 as81Var = new as81(qd81Var, i2, i3, i5, i6, intValue, i4, max2, lv81VarArr);
        if (n()) {
            this.p = as81Var;
        } else {
            this.q = as81Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r9.K != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f() {
        boolean z;
        int i;
        lv81[] lv81VarArr;
        if (this.N != -1) {
            z = false;
            i = this.N;
            lv81VarArr = this.G;
            if (i < lv81VarArr.length) {
            }
            return false;
        }
        this.N = 0;
        z = true;
        i = this.N;
        lv81VarArr = this.G;
        if (i < lv81VarArr.length) {
            lv81 lv81Var = lv81VarArr[i];
            if (z) {
                lv81Var.b();
            }
            j(-9223372036854775807L);
            if (lv81Var.c()) {
                this.N++;
                z = true;
                i = this.N;
                lv81VarArr = this.G;
                if (i < lv81VarArr.length) {
                    ByteBuffer byteBuffer = this.K;
                    if (byteBuffer != null) {
                        d(byteBuffer, -9223372036854775807L);
                    }
                    this.N = -1;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x009d, code lost:
    
        if (m() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0119, code lost:
    
        if (r7.a() == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02f3, code lost:
    
        if (r5 == 0) goto L153;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(long j, ByteBuffer byteBuffer, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        byte b;
        int i6;
        byte b2;
        int i7;
        ByteBuffer byteBuffer2 = this.I;
        boolean z2 = false;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            w511.q();
            return false;
        }
        as81 as81Var = this.p;
        wj71 wj71Var = this.h;
        if (as81Var != null) {
            if (f()) {
                as81 as81Var2 = this.p;
                as81 as81Var3 = this.q;
                as81Var2.getClass();
                if (as81Var3.c == as81Var2.c && as81Var3.g == as81Var2.g && as81Var3.e == as81Var2.e && as81Var3.f == as81Var2.f && as81Var3.d == as81Var2.d) {
                    this.q = this.p;
                    this.p = null;
                    if (h(this.r)) {
                        if (this.r.getPlayState() == 3) {
                            this.r.setOffloadEndOfStream();
                        }
                        AudioTrack audioTrack = this.r;
                        qd81 qd81Var = this.q.a;
                        audioTrack.setOffloadDelayPadding(qd81Var.U, qd81Var.V);
                        this.X = true;
                    }
                } else {
                    o();
                    if (!n() || !wj71Var.b(l())) {
                        i();
                    }
                }
                c(j);
            }
            return false;
        }
        boolean n = n();
        ul61 ul61Var = this.k;
        if (!n) {
            try {
            } catch (ck e) {
                if (e.c) {
                    throw e;
                }
                ul61Var.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (ul61Var.a == null) {
                    ul61Var.a = e;
                    ul61Var.b = 100 + elapsedRealtime;
                }
                if (elapsedRealtime >= ul61Var.b) {
                    Exception exc = ul61Var.a;
                    if (exc != e) {
                        exc.addSuppressed(e);
                    }
                    Exception exc2 = ul61Var.a;
                    ul61Var.a = null;
                    throw exc2;
                }
            }
        }
        ul61Var.a = null;
        if (this.D) {
            this.E = Math.max(0L, j);
            this.C = false;
            this.D = false;
            c(j);
            if (this.Q) {
                this.Q = true;
                if (n()) {
                    qh3 qh3Var = wj71Var.f;
                    qh3Var.getClass();
                    qh3Var.a();
                    this.r.play();
                }
            }
        }
        long l = l();
        AudioTrack audioTrack2 = wj71Var.c;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        if (wj71Var.h) {
            if (playState == 2) {
                wj71Var.p = false;
                return false;
            }
            if (playState == 1) {
            }
        }
        boolean z3 = wj71Var.p;
        boolean b3 = wj71Var.b(l);
        wj71Var.p = b3;
        if (z3 && !b3 && playState != 1) {
            n671 n671Var = (n671) wj71Var.a.b;
            int i8 = wj71Var.e;
            long u = rf71.u(wj71Var.i);
            if (n671Var.o != null) {
                i2 = 2;
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - n671Var.V;
                hn71 hn71Var = ((u191) n671Var.o.a).v1;
                ((Handler) hn71Var.b).post(new x191(hn71Var, i8, u, elapsedRealtime2));
                if (this.I != null) {
                    if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
                        w511.q();
                        return false;
                    }
                    if (byteBuffer.hasRemaining()) {
                        as81 as81Var4 = this.q;
                        if (as81Var4.c != 0 && this.B == 0) {
                            int i9 = as81Var4.g;
                            char c = 16;
                            switch (i9) {
                                case 5:
                                case 6:
                                case 18:
                                    z = false;
                                    if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                        i4 = aba1.a[((byteBuffer.get(byteBuffer.position() + 4) & DerValue.TAG_PRIVATE) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                    } else {
                                        i4 = HProv.ALG_TYPE_BLOCK;
                                    }
                                    this.B = i4;
                                    break;
                                case 7:
                                case 8:
                                    z = false;
                                    int position = byteBuffer.position();
                                    byte b4 = byteBuffer.get(position);
                                    if (b4 != -2) {
                                        if (b4 == -1) {
                                            i5 = (byteBuffer.get(position + 4) & 7) << 4;
                                            b2 = byteBuffer.get(position + 7);
                                        } else if (b4 != 31) {
                                            i5 = (byteBuffer.get(position + 4) & 1) << 6;
                                            b = byteBuffer.get(position + 5);
                                        } else {
                                            i5 = (byteBuffer.get(position + 5) & 7) << 4;
                                            b2 = byteBuffer.get(position + 6);
                                        }
                                        i6 = b2 & Alerts.alert_export_restriction;
                                        i4 = (((i6 >> i2) | i5) + 1) * 32;
                                        this.B = i4;
                                        break;
                                    } else {
                                        i5 = (byteBuffer.get(position + 5) & 1) << 6;
                                        b = byteBuffer.get(position + 4);
                                    }
                                    i6 = b & 252;
                                    i4 = (((i6 >> i2) | i5) + 1) * 32;
                                    this.B = i4;
                                case 9:
                                    z = false;
                                    int position2 = byteBuffer.position();
                                    int i10 = rf71.a;
                                    int i11 = byteBuffer.getInt(position2);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i11 = Integer.reverseBytes(i11);
                                    }
                                    i4 = gea1.c(i11);
                                    if (i4 == -1) {
                                        w511.q();
                                        return false;
                                    }
                                    this.B = i4;
                                    break;
                                case 10:
                                case 16:
                                    z = false;
                                    i4 = 1024;
                                    this.B = i4;
                                    break;
                                case 11:
                                case 12:
                                    z = false;
                                    i4 = 2048;
                                    this.B = i4;
                                    break;
                                case 13:
                                default:
                                    ny61.r(q8a1.c(i9, "Unexpected audio encoding: "));
                                    return false;
                                case 14:
                                    int position3 = byteBuffer.position();
                                    int limit = byteBuffer.limit() - 10;
                                    int i12 = position3;
                                    while (true) {
                                        if (i12 <= limit) {
                                            int i13 = rf71.a;
                                            int i14 = byteBuffer.getInt(i12 + 4);
                                            char c2 = c;
                                            z = z2;
                                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                i14 = Integer.reverseBytes(i14);
                                            }
                                            if ((i14 & (-2)) == -126718022) {
                                                i7 = i12 - position3;
                                            } else {
                                                i12++;
                                                c = c2;
                                                z2 = z ? 1 : 0;
                                            }
                                        } else {
                                            z = z2;
                                            i7 = -1;
                                        }
                                    }
                                    if (i7 == -1) {
                                        i4 = z ? 1 : 0;
                                    } else {
                                        i4 = (40 << ((byteBuffer.get((byteBuffer.position() + i7) + (((byteBuffer.get((byteBuffer.position() + i7) + 7) & 255) == 187 ? true : z ? 1 : 0) != false ? 9 : 8)) >> 4) & 7)) * 16;
                                    }
                                    this.B = i4;
                                    break;
                                case 15:
                                    i4 = 512;
                                    z = false;
                                    this.B = i4;
                                    break;
                                case 17:
                                    byte[] bArr = new byte[16];
                                    int position4 = byteBuffer.position();
                                    byteBuffer.get(bArr);
                                    byteBuffer.position(position4);
                                    uh81 uh81Var = new uh81();
                                    uh81Var.a = bArr;
                                    uh81Var.d = 16;
                                    i4 = xca1.a(uh81Var).c;
                                    z = false;
                                    this.B = i4;
                                    break;
                            }
                        } else {
                            z = false;
                        }
                        if (this.t != null) {
                            if (!f()) {
                                return z;
                            }
                            c(j);
                            this.t = null;
                        }
                        long j2 = ((((this.q.c == 0 ? this.x / r8.b : this.y) - this.d.o) * 1000000) / r8.a.S) + this.E;
                        if (!this.C && Math.abs(j2 - j) > 200000) {
                            sl81 sl81Var = this.o;
                            StringBuilder w = unr0.w(j2, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                            w.append(j);
                            dk dkVar = new dk(w.toString());
                            sl81Var.getClass();
                            nba1.c("MediaCodecAudioRenderer", nba1.b("Audio sink error", dkVar));
                            ((u191) sl81Var.a).v1.o(dkVar);
                            this.C = true;
                        }
                        if (this.C) {
                            if (!f()) {
                                return z;
                            }
                            long j3 = j - j2;
                            this.E += j3;
                            this.C = z;
                            c(j);
                            sl81 sl81Var2 = this.o;
                            if (sl81Var2 != null && j3 != 0) {
                                ((u191) sl81Var2.a).T1 = true;
                            }
                        }
                        if (this.q.c == 0) {
                            this.x += byteBuffer.remaining();
                        } else {
                            this.y = (this.B * i) + this.y;
                        }
                        this.I = byteBuffer;
                        this.J = i;
                        i3 = 0;
                    }
                    return true;
                }
                i3 = 0;
                j(j);
                if (this.I.hasRemaining()) {
                    this.I = null;
                    this.J = i3;
                    return true;
                }
                long l2 = l();
                if (wj71Var.y == -9223372036854775807L || l2 <= 0 || SystemClock.elapsedRealtime() - wj71Var.y < 200) {
                    return false;
                }
                nba1.e();
                i();
                return true;
            }
        }
        i2 = 2;
        if (this.I != null) {
        }
        j(j);
        if (this.I.hasRemaining()) {
        }
    }

    public final void i() {
        if (n()) {
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.A = 0L;
            this.X = false;
            this.B = 0;
            this.u = new nh61(k().a, k().b, 0L, 0L);
            this.E = 0L;
            this.t = null;
            this.i.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.P = false;
            this.O = false;
            this.N = -1;
            this.v = null;
            this.w = 0;
            this.d.o = 0L;
            int i = 0;
            while (true) {
                lv81[] lv81VarArr = this.G;
                if (i >= lv81VarArr.length) {
                    break;
                }
                lv81 lv81Var = lv81VarArr[i];
                lv81Var.flush();
                this.H[i] = lv81Var.a();
                i++;
            }
            AudioTrack audioTrack = this.h.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.r.pause();
            }
            if (h(this.r)) {
                n371 n371Var = this.j;
                n371Var.getClass();
                this.r.unregisterStreamEventCallback(n371Var.b);
                n371Var.a.removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.r;
            this.r = null;
            if (rf71.a < 21 && !this.R) {
                this.S = 0;
            }
            as81 as81Var = this.p;
            if (as81Var != null) {
                this.q = as81Var;
                this.p = null;
            }
            wj71 wj71Var = this.h;
            wj71Var.l = 0L;
            wj71Var.w = 0;
            wj71Var.v = 0;
            wj71Var.m = 0L;
            wj71Var.C = 0L;
            wj71Var.F = 0L;
            wj71Var.k = false;
            wj71Var.c = null;
            wj71Var.f = null;
            sh71 sh71Var = this.g;
            synchronized (sh71Var) {
                sh71Var.a = false;
            }
            new cbv(this, audioTrack2).start();
        }
        this.l.a = null;
        this.k.a = null;
    }

    public final void j(long j) {
        ByteBuffer byteBuffer;
        int length = this.G.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.H[i - 1];
            } else {
                byteBuffer = this.I;
                if (byteBuffer == null) {
                    byteBuffer = lv81.a;
                }
            }
            if (i == length) {
                d(byteBuffer, j);
            } else {
                lv81 lv81Var = this.G[i];
                if (i > this.N) {
                    lv81Var.a(byteBuffer);
                }
                ByteBuffer a = lv81Var.a();
                this.H[i] = a;
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

    public final nh61 k() {
        nh61 nh61Var = this.t;
        if (nh61Var != null) {
            return nh61Var;
        }
        ArrayDeque arrayDeque = this.i;
        return !arrayDeque.isEmpty() ? (nh61) arrayDeque.getLast() : this.u;
    }

    public final long l() {
        return this.q.c == 0 ? this.z / r0.d : this.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        boolean z;
        AudioTrack a;
        wl61 wl61Var;
        as81 as81Var;
        sh71 sh71Var = this.g;
        synchronized (sh71Var) {
            z = sh71Var.a;
        }
        if (!z) {
            return false;
        }
        try {
            as81Var = this.q;
            as81Var.getClass();
        } catch (ck e) {
            as81 as81Var2 = this.q;
            if (as81Var2.h > 1000000) {
                as81 as81Var3 = new as81(as81Var2.a, as81Var2.b, as81Var2.c, as81Var2.d, as81Var2.e, as81Var2.f, as81Var2.g, 1000000, as81Var2.i);
                try {
                    try {
                        a = as81Var3.a(this.U, this.s, this.S);
                        this.q = as81Var3;
                    } catch (ck e2) {
                        sl81 sl81Var = this.o;
                        if (sl81Var != null) {
                            nba1.c("MediaCodecAudioRenderer", nba1.b("Audio sink error", e2));
                            ((u191) sl81Var.a).v1.o(e2);
                        }
                        throw e2;
                    }
                } catch (ck e3) {
                    e.addSuppressed(e3);
                    if (this.q.c == 1) {
                    }
                }
            }
            if (this.q.c == 1) {
                throw e;
            }
            this.W = true;
            throw e;
        }
        try {
            a = as81Var.a(this.U, this.s, this.S);
            this.r = a;
            if (h(a)) {
                AudioTrack audioTrack = this.r;
                if (this.j == null) {
                    this.j = new n371(this);
                }
                n371 n371Var = this.j;
                Handler handler = n371Var.a;
                Objects.requireNonNull(handler);
                audioTrack.registerStreamEventCallback(new j6h(handler), n371Var.b);
                AudioTrack audioTrack2 = this.r;
                qd81 qd81Var = this.q.a;
                audioTrack2.setOffloadDelayPadding(qd81Var.U, qd81Var.V);
            }
            int i = rf71.a;
            if (i >= 31 && (wl61Var = this.n) != null) {
                zh81.a(this.r, wl61Var);
            }
            this.S = this.r.getAudioSessionId();
            wj71 wj71Var = this.h;
            AudioTrack audioTrack3 = this.r;
            as81 as81Var4 = this.q;
            boolean z2 = as81Var4.c == 2;
            int i2 = as81Var4.g;
            int i3 = as81Var4.d;
            int i4 = as81Var4.h;
            wj71Var.c = audioTrack3;
            wj71Var.d = i3;
            wj71Var.e = i4;
            wj71Var.f = new qh3(audioTrack3, 1);
            wj71Var.g = audioTrack3.getSampleRate();
            wj71Var.h = z2 && i < 23 && (i2 == 5 || i2 == 6);
            boolean z3 = rf71.z(i2);
            wj71Var.q = z3;
            wj71Var.i = z3 ? ((i4 / i3) * 1000000) / wj71Var.g : -9223372036854775807L;
            wj71Var.s = 0L;
            wj71Var.t = 0L;
            wj71Var.u = 0L;
            wj71Var.p = false;
            wj71Var.x = -9223372036854775807L;
            wj71Var.y = -9223372036854775807L;
            wj71Var.r = 0L;
            wj71Var.o = 0L;
            wj71Var.j = 1.0f;
            if (n()) {
                AudioTrack audioTrack4 = this.r;
                float f = this.F;
                if (i >= 21) {
                    audioTrack4.setVolume(f);
                } else {
                    audioTrack4.setStereoVolume(f, f);
                }
            }
            this.T.getClass();
            this.D = true;
            return true;
        } catch (ck e4) {
            sl81 sl81Var2 = this.o;
            if (sl81Var2 != null) {
                nba1.c("MediaCodecAudioRenderer", nba1.b("Audio sink error", e4));
                ((u191) sl81Var2.a).v1.o(e4);
            }
            throw e4;
        }
    }

    public final boolean n() {
        return this.r != null;
    }

    public final void o() {
        if (this.P) {
            return;
        }
        this.P = true;
        long l = l();
        wj71 wj71Var = this.h;
        wj71Var.z = wj71Var.a();
        wj71Var.x = SystemClock.elapsedRealtime() * 1000;
        wj71Var.A = l;
        this.r.stop();
        this.w = 0;
    }
}
