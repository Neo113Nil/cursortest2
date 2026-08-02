package yads;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* loaded from: classes10.dex */
public final class ol {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public final nl a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public ml f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public int v;
    public int w;
    public long x;
    public long y;
    public long z;

    public ol(wb0 wb0Var) {
        this.a = (nl) ni.a(wb0Var);
        if (mc3.a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    public final long a(long j) {
        return (j * 1000000) / this.g;
    }

    public final boolean b(long j) {
        if (j > a()) {
            return true;
        }
        if (!this.h) {
            return false;
        }
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && a() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(boolean z) {
        long j;
        boolean z2;
        long a;
        long j2;
        float f;
        long j3;
        long round;
        Method method;
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        long j4 = 1000;
        if (audioTrack.getPlayState() == 3) {
            long a2 = a(a());
            if (a2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.m >= ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
                    long[] jArr = this.b;
                    int i = this.v;
                    jArr[i] = a2 - nanoTime;
                    this.v = (i + 1) % 10;
                    int i2 = this.w;
                    if (i2 < 10) {
                        this.w = i2 + 1;
                    }
                    this.m = nanoTime;
                    this.l = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.w;
                        if (i3 >= i4) {
                            break;
                        }
                        this.l = (this.b[i3] / i4) + this.l;
                        i3++;
                        j4 = j4;
                    }
                }
                j = j4;
                if (!this.h) {
                    ml mlVar = this.f;
                    mlVar.getClass();
                    ll llVar = mlVar.a;
                    if (llVar != null && nanoTime - mlVar.e >= mlVar.d) {
                        mlVar.e = nanoTime;
                        boolean b = llVar.b();
                        int i5 = mlVar.b;
                        if (i5 != 0) {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 != 3) {
                                        if (i5 != 4) {
                                            throw new IllegalStateException();
                                        }
                                    } else if (b) {
                                        mlVar.a();
                                    }
                                } else if (!b) {
                                    mlVar.a();
                                }
                            } else if (!b) {
                                mlVar.a();
                            } else if (mlVar.a.e > mlVar.f) {
                                mlVar.a(2);
                            }
                        } else if (b) {
                            if (mlVar.a.a() >= mlVar.c) {
                                mlVar.f = mlVar.a.e;
                                mlVar.a(1);
                            }
                        } else if (nanoTime - mlVar.c > 500000) {
                            mlVar.a(3);
                        }
                        if (b) {
                            ll llVar2 = mlVar.a;
                            long a3 = llVar2 != null ? llVar2.a() : C.TIME_UNSET;
                            ll llVar3 = mlVar.a;
                            long j5 = llVar3 != null ? llVar3.e : -1L;
                            if (Math.abs(a3 - nanoTime) > 5000000) {
                                wb0 wb0Var = (wb0) this.a;
                                wb0Var.getClass();
                                StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                                sb.append(j5);
                                sb.append(", ");
                                sb.append(a3);
                                xsna.tj0.d(sb, ", ", nanoTime, ", ");
                                sb.append(a2);
                                sb.append(", ");
                                zb0 zb0Var = wb0Var.a;
                                sb.append(zb0Var.t.c == 0 ? zb0Var.B / r10.b : zb0Var.C);
                                sb.append(", ");
                                sb.append(wb0Var.a.d());
                                ji1.d("DefaultAudioSink", sb.toString());
                                mlVar.a(4);
                            } else if (Math.abs(a(j5) - a2) > 5000000) {
                                wb0 wb0Var2 = (wb0) this.a;
                                wb0Var2.getClass();
                                StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                                sb2.append(j5);
                                sb2.append(", ");
                                sb2.append(a3);
                                xsna.tj0.d(sb2, ", ", nanoTime, ", ");
                                sb2.append(a2);
                                sb2.append(", ");
                                zb0 zb0Var2 = wb0Var2.a;
                                sb2.append(zb0Var2.t.c == 0 ? zb0Var2.B / r9.b : zb0Var2.C);
                                sb2.append(", ");
                                sb2.append(wb0Var2.a.d());
                                ji1.d("DefaultAudioSink", sb2.toString());
                                mlVar.a(4);
                            } else if (mlVar.b == 4) {
                                mlVar.a();
                            }
                        }
                    }
                    if (this.q && (method = this.n) != null && nanoTime - this.r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = this.c;
                            audioTrack2.getClass();
                            Integer num = (Integer) method.invoke(audioTrack2, null);
                            int i6 = mc3.a;
                            long intValue = (num.intValue() * j) - this.i;
                            this.o = intValue;
                            long max = Math.max(intValue, 0L);
                            this.o = max;
                            if (max > 5000000) {
                                ((wb0) this.a).getClass();
                                ji1.d("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                this.o = 0L;
                            }
                        } catch (Exception unused) {
                            this.n = null;
                        }
                        this.r = nanoTime;
                    }
                }
                long nanoTime2 = System.nanoTime() / j;
                ml mlVar2 = this.f;
                mlVar2.getClass();
                z2 = mlVar2.b != 2;
                if (z2) {
                    a = this.w == 0 ? a(a()) : this.l + nanoTime2;
                    if (!z) {
                        a = Math.max(0L, a - this.o);
                    }
                } else {
                    ll llVar4 = mlVar2.a;
                    long a4 = a(llVar4 != null ? llVar4.e : -1L);
                    ll llVar5 = mlVar2.a;
                    long a5 = nanoTime2 - (llVar5 != null ? llVar5.a() : C.TIME_UNSET);
                    float f2 = this.j;
                    int i7 = mc3.a;
                    if (f2 != 1.0f) {
                        a5 = Math.round(a5 * f2);
                    }
                    a = a5 + a4;
                }
                if (this.D != z2) {
                    this.F = this.C;
                    this.E = this.B;
                }
                j2 = nanoTime2 - this.F;
                if (j2 >= 1000000) {
                    long j6 = this.E;
                    float f3 = this.j;
                    int i8 = mc3.a;
                    f = 1.0f;
                    if (f3 == 1.0f) {
                        round = j2;
                        j3 = 1000000;
                    } else {
                        j3 = 1000000;
                        round = Math.round(j2 * f3);
                    }
                    long j7 = (j2 * j) / j3;
                    a = (((j - j7) * (round + j6)) + (a * j7)) / j;
                } else {
                    f = 1.0f;
                }
                if (!this.k) {
                    long j8 = this.B;
                    if (a > j8) {
                        this.k = true;
                        long b2 = mc3.b(a - j8);
                        float f4 = this.j;
                        if (f4 != f) {
                            b2 = Math.round(b2 / f4);
                        }
                        long currentTimeMillis = System.currentTimeMillis() - mc3.b(b2);
                        gl glVar = ((wb0) this.a).a.r;
                        if (glVar != null) {
                            ((fl1) glVar).a.H0.b(currentTimeMillis);
                        }
                    }
                }
                this.C = nanoTime2;
                this.B = a;
                this.D = z2;
                return a;
            }
        }
        j = 1000;
        long nanoTime22 = System.nanoTime() / j;
        ml mlVar22 = this.f;
        mlVar22.getClass();
        if (mlVar22.b != 2) {
        }
        if (z2) {
        }
        if (this.D != z2) {
        }
        j2 = nanoTime22 - this.F;
        if (j2 >= 1000000) {
        }
        if (!this.k) {
        }
        this.C = nanoTime22;
        this.B = a;
        this.D = z2;
        return a;
    }

    public final long a() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (this.x != C.TIME_UNSET) {
            return Math.min(this.A, this.z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * this.g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.u = this.s;
            }
            playbackHeadPosition += this.u;
        }
        if (mc3.a <= 29) {
            if (playbackHeadPosition == 0 && this.s > 0 && playState == 3) {
                if (this.y == C.TIME_UNSET) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = C.TIME_UNSET;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }

    public final void a(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.c = audioTrack;
        this.d = i2;
        this.e = i3;
        this.f = new ml(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.h = z && mc3.a < 23 && (i == 5 || i == 6);
        boolean e = mc3.e(i);
        this.q = e;
        this.i = e ? a(i3 / i2) : -9223372036854775807L;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.p = false;
        this.x = C.TIME_UNSET;
        this.y = C.TIME_UNSET;
        this.r = 0L;
        this.o = 0L;
        this.j = 1.0f;
    }
}
