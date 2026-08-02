package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.tuz;

/* loaded from: classes10.dex */
public final class ho0 implements Handler.Callback, pn1, v83, io1, ce0, ag2 {
    public boolean A;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public go0 L;
    public long M;
    public int N;
    public boolean O;
    public qn0 P;
    public final ro[] b;
    public final Set c;
    public final ro[] d;
    public final w83 e;
    public final x83 f;
    public final tg1 g;
    public final im h;
    public final m63 i;
    public final HandlerThread j;
    public final Looper k;
    public final v73 l;
    public final t73 m;
    public final long n;
    public final boolean o;
    public final de0 p;
    public final ArrayList q;
    public final xv r;
    public final eo0 s;
    public final un1 t;
    public final jo1 u;
    public final sg1 v;
    public final long w;
    public ay2 x;
    public df2 y;
    public do0 z;
    public boolean G = false;
    public boolean B = false;
    public long Q = C.TIME_UNSET;

    public ho0(ro[] roVarArr, w83 w83Var, x83 x83Var, tg1 tg1Var, im imVar, int i, se seVar, ay2 ay2Var, yd0 yd0Var, long j, Looper looper, j63 j63Var, eo0 eo0Var, zf2 zf2Var) {
        this.s = eo0Var;
        this.b = roVarArr;
        this.e = w83Var;
        this.f = x83Var;
        this.g = tg1Var;
        this.h = imVar;
        this.F = i;
        this.x = ay2Var;
        this.v = yd0Var;
        this.w = j;
        this.r = j63Var;
        zd0 zd0Var = (zd0) tg1Var;
        this.n = zd0Var.a();
        this.o = zd0Var.b();
        df2 a = df2.a(x83Var);
        this.y = a;
        this.z = new do0(a);
        this.d = new ro[roVarArr.length];
        for (int i2 = 0; i2 < roVarArr.length; i2++) {
            roVarArr[i2].a(i2, zf2Var);
            this.d[i2] = roVarArr[i2].b();
        }
        this.p = new de0(this, j63Var);
        this.q = new ArrayList();
        this.c = pz2.a();
        this.l = new v73();
        this.m = new t73();
        w83Var.a(this, imVar);
        this.O = true;
        Handler handler = new Handler(looper);
        this.t = new un1(seVar, handler);
        this.u = new jo1(this, seVar, handler, zf2Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.k = looper2;
        this.i = j63Var.a(looper2, this);
    }

    public final void a(co0 co0Var, int i) {
        this.z.a(1);
        jo1 jo1Var = this.u;
        if (i == -1) {
            i = jo1Var.b.size();
        }
        a(jo1Var.a(i, co0Var.a, co0Var.b), false);
    }

    public final long b() {
        rn1 rn1Var = this.t.i;
        if (rn1Var == null) {
            return 0L;
        }
        long j = rn1Var.o;
        if (!rn1Var.d) {
            return j;
        }
        int i = 0;
        while (true) {
            ro[] roVarArr = this.b;
            if (i >= roVarArr.length) {
                return j;
            }
            if (b(roVarArr[i])) {
                ro roVar = this.b[i];
                if (roVar.h != rn1Var.c[i]) {
                    continue;
                } else {
                    long j2 = roVar.k;
                    if (j2 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j = Math.max(j2, j);
                }
            }
            i++;
        }
    }

    public final void c(qn1 qn1Var) {
        rn1 rn1Var = this.t.j;
        if (rn1Var == null || rn1Var.a != qn1Var) {
            return;
        }
        float f = this.p.getPlaybackParameters().b;
        w73 w73Var = this.y.a;
        rn1Var.d = true;
        m83 trackGroups = rn1Var.a.getTrackGroups();
        rn1Var.m = trackGroups;
        x83 a = rn1Var.j.a(rn1Var.i, trackGroups, rn1Var.f.a, w73Var);
        for (pp0 pp0Var : a.c) {
            if (pp0Var != null) {
                pp0Var.a(f);
            }
        }
        tn1 tn1Var = rn1Var.f;
        long j = tn1Var.b;
        long j2 = tn1Var.e;
        if (j2 != C.TIME_UNSET && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long a2 = rn1Var.a(a, j, false, new boolean[rn1Var.i.length]);
        long j3 = rn1Var.o;
        tn1 tn1Var2 = rn1Var.f;
        long j4 = tn1Var2.b;
        rn1Var.o = (j4 - a2) + j3;
        if (a2 != j4) {
            tn1Var2 = new tn1(tn1Var2.a, a2, tn1Var2.c, tn1Var2.d, tn1Var2.e, tn1Var2.f, tn1Var2.g, tn1Var2.h, tn1Var2.i);
        }
        rn1Var.f = tn1Var2;
        a(rn1Var.n);
        if (rn1Var == this.t.h) {
            b(rn1Var.f.b);
            a(new boolean[this.b.length]);
            df2 df2Var = this.y;
            zn1 zn1Var = df2Var.b;
            long j5 = rn1Var.f.b;
            this.y = a(zn1Var, j5, df2Var.c, j5, false, 5);
        }
        d();
    }

    public final void d() {
        int i;
        rn1 rn1Var = this.t.j;
        if (rn1Var != null) {
            if ((!rn1Var.d ? 0L : rn1Var.a.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                rn1 rn1Var2 = this.t.j;
                long a = a(rn1Var2.d ? rn1Var2.a.getNextLoadPositionUs() : 0L);
                if (rn1Var2 != this.t.h) {
                    long j = rn1Var2.f.b;
                }
                tg1 tg1Var = this.g;
                float f = this.p.getPlaybackParameters().b;
                zd0 zd0Var = (zd0) tg1Var;
                ib0 ib0Var = zd0Var.a;
                synchronized (ib0Var) {
                    i = ib0Var.e * ib0Var.b;
                }
                boolean z = i >= zd0Var.j;
                long j2 = zd0Var.b;
                if (f > 1.0f) {
                    int i2 = mc3.a;
                    if (f != 1.0f) {
                        j2 = Math.round(j2 * f);
                    }
                    j2 = Math.min(j2, zd0Var.c);
                }
                if (a < Math.max(j2, 500000L)) {
                    r1 = zd0Var.g || !z;
                    zd0Var.k = r1;
                    if (!r1 && a < 500000) {
                        ji1.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    }
                } else if (a >= zd0Var.c || z) {
                    zd0Var.k = false;
                }
                r1 = zd0Var.k;
            }
        }
        this.E = r1;
        if (r1) {
            rn1 rn1Var3 = this.t.j;
            long j3 = this.M;
            if (rn1Var3.l != null) {
                throw new IllegalStateException();
            }
            rn1Var3.a.continueLoading(j3 - rn1Var3.o);
        }
        n();
    }

    public final void e() {
        a(this.u.a(), true);
    }

    public final void f() {
        this.z.a(1);
        throw null;
    }

    public final void g() {
        this.z.a(1);
        a(false, false, false, true);
        ((zd0) this.g).a(false);
        b(this.y.a.c() ? 4 : 2);
        jo1 jo1Var = this.u;
        dc0 dc0Var = (dc0) this.h;
        dc0Var.getClass();
        if (jo1Var.k) {
            throw new IllegalStateException();
        }
        jo1Var.l = dc0Var;
        for (int i = 0; i < jo1Var.b.size(); i++) {
            ho1 ho1Var = (ho1) jo1Var.b.get(i);
            jo1Var.a(ho1Var);
            jo1Var.i.add(ho1Var);
        }
        jo1Var.k = true;
        this.i.a.sendEmptyMessage(2);
    }

    public final synchronized boolean h() {
        if (!this.A && this.j.isAlive()) {
            this.i.a.sendEmptyMessage(7);
            a(new c63() { // from class: xsna.jzy0
                @Override // yads.c63
                public final Object get() {
                    return yads.ho0.this.c();
                }
            }, this.w);
            return this.A;
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        rn1 rn1Var;
        try {
            switch (message.what) {
                case 0:
                    g();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    a();
                    break;
                case 3:
                    a((go0) message.obj);
                    break;
                case 4:
                    a((ff2) message.obj);
                    break;
                case 5:
                    this.x = (ay2) message.obj;
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    i();
                    return true;
                case 8:
                    c((qn1) message.obj);
                    break;
                case 9:
                    b((qn1) message.obj);
                    break;
                case 10:
                    j();
                    break;
                case 11:
                    a(message.arg1);
                    break;
                case 12:
                    e(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    cg2 cg2Var = (cg2) message.obj;
                    cg2Var.getClass();
                    if (cg2Var.f != this.k) {
                        this.i.a(15, cg2Var).b();
                        break;
                    } else {
                        a(cg2Var);
                        int i = this.y.e;
                        if (i == 3 || i == 2) {
                            this.i.a.sendEmptyMessage(2);
                            break;
                        }
                    }
                case 15:
                    c((cg2) message.obj);
                    break;
                case 16:
                    ff2 ff2Var = (ff2) message.obj;
                    a(ff2Var, ff2Var.b, true, false);
                    break;
                case 17:
                    a((co0) message.obj);
                    break;
                case 18:
                    a((co0) message.obj, message.arg1);
                    break;
                case 19:
                    a2.a(message.obj);
                    f();
                    throw null;
                case 20:
                    a(message.arg1, message.arg2, (wz2) message.obj);
                    break;
                case 21:
                    a((wz2) message.obj);
                    break;
                case 22:
                    e();
                    break;
                case 23:
                    d(message.arg1 != 0);
                    break;
                case 24:
                    c(message.arg1 == 1);
                    break;
                case 25:
                    b(true);
                    break;
                default:
                    return false;
            }
        } catch (mk0 e) {
            a(e, e.b);
        } catch (pc2 e2) {
            int i2 = e2.c;
            if (i2 == 1) {
                r4 = e2.b ? 3001 : Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE;
            } else if (i2 == 4) {
                r4 = e2.b ? 3002 : 3004;
            }
            a(e2, r4);
        } catch (q30 e3) {
            a(e3, e3.b);
        } catch (zo e4) {
            a(e4, 1002);
        } catch (IOException e5) {
            a(e5, 2000);
        } catch (RuntimeException e6) {
            qn0 qn0Var = new qn0(2, e6, ((e6 instanceof IllegalStateException) || (e6 instanceof IllegalArgumentException)) ? 1004 : 1000, 0);
            ji1.b("ExoPlayerImplInternal", ji1.a("Playback error", qn0Var));
            a(true, false);
            this.y = this.y.a(qn0Var);
        } catch (qn0 e7) {
            e = e7;
            if (e.d == 1 && (rn1Var = this.t.i) != null) {
                zn1 zn1Var = rn1Var.f.a;
                String message2 = e.getMessage();
                int i3 = mc3.a;
                e = new qn0(message2, e.getCause(), e.b, e.d, e.e, e.f, e.g, e.h, zn1Var, e.c, e.j);
            }
            if (e.j && this.P == null) {
                ji1.d("ExoPlayerImplInternal", ji1.a("Recoverable renderer error", e));
                this.P = e;
                m63 m63Var = this.i;
                l63 a = m63Var.a(25, e);
                Handler handler = m63Var.a;
                Message message3 = a.a;
                message3.getClass();
                handler.sendMessageAtFrontOfQueue(message3);
                a.a();
                z = false;
            } else {
                qn0 qn0Var2 = this.P;
                if (qn0Var2 != null) {
                    qn0Var2.addSuppressed(e);
                    e = this.P;
                }
                ji1.b("ExoPlayerImplInternal", ji1.a("Playback error", e));
                z = false;
                a(true, false);
                this.y = this.y.a(e);
            }
        }
        z = false;
        do0 do0Var = this.z;
        df2 df2Var = this.y;
        boolean z2 = do0Var.a | (do0Var.b != df2Var ? true : z);
        do0Var.a = z2;
        do0Var.b = df2Var;
        if (!z2) {
            return true;
        }
        ((tuz) this.s).a(do0Var);
        this.z = new do0(this.y);
        return true;
    }

    public final void i() {
        a(true, false, true, false);
        ((zd0) this.g).a(true);
        b(1);
        this.j.quit();
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void j() {
        int i;
        boolean z;
        int i2;
        float f = this.p.getPlaybackParameters().b;
        un1 un1Var = this.t;
        rn1 rn1Var = un1Var.h;
        rn1 rn1Var2 = un1Var.i;
        boolean z2 = true;
        for (rn1 rn1Var3 = rn1Var; rn1Var3 != null && rn1Var3.d; rn1Var3 = rn1Var3.l) {
            x83 a = rn1Var3.j.a(rn1Var3.i, rn1Var3.m, rn1Var3.f.a, this.y.a);
            boolean z3 = false;
            for (pp0 pp0Var : a.c) {
                if (pp0Var != null) {
                    pp0Var.a(f);
                }
            }
            x83 x83Var = rn1Var3.n;
            if (x83Var != null && x83Var.c.length == a.c.length) {
                for (0; i2 < a.c.length; i2 + 1) {
                    i2 = (mc3.a(a.b[i2], x83Var.b[i2]) && mc3.a(a.c[i2], x83Var.c[i2])) ? i2 + 1 : 0;
                }
                if (rn1Var3 == rn1Var2) {
                    z2 = false;
                }
            }
            if (z2) {
                un1 un1Var2 = this.t;
                rn1 rn1Var4 = un1Var2.h;
                boolean a2 = un1Var2.a(rn1Var4);
                boolean[] zArr = new boolean[this.b.length];
                long a3 = rn1Var4.a(a, this.y.r, a2, zArr);
                df2 df2Var = this.y;
                if (df2Var.e == 4 || a3 == df2Var.r) {
                    z = false;
                } else {
                    z = false;
                    z3 = true;
                }
                df2 df2Var2 = this.y;
                boolean z4 = z;
                i = 4;
                this.y = a(df2Var2.b, a3, df2Var2.c, df2Var2.d, z3, 5);
                if (z3) {
                    b(a3);
                }
                boolean[] zArr2 = new boolean[this.b.length];
                ?? r8 = z4;
                while (true) {
                    ro[] roVarArr = this.b;
                    if (r8 >= roVarArr.length) {
                        break;
                    }
                    ro roVar = roVarArr[r8];
                    boolean b = b(roVar);
                    zArr2[r8] = b;
                    ot2 ot2Var = rn1Var4.c[r8];
                    if (b) {
                        if (ot2Var != roVar.h) {
                            a(roVar);
                        } else if (zArr[r8]) {
                            long j = this.M;
                            roVar.l = z4;
                            roVar.k = j;
                            roVar.a(j, z4);
                        }
                    }
                    r8++;
                }
                a(zArr2);
            } else {
                i = 4;
                this.t.a(rn1Var3);
                if (rn1Var3.d) {
                    rn1Var3.a(a, Math.max(rn1Var3.f.b, this.M - rn1Var3.o), false, new boolean[rn1Var3.i.length]);
                }
            }
            a(true);
            if (this.y.e != i) {
                d();
                o();
                this.i.a.sendEmptyMessage(2);
                return;
            }
            return;
        }
    }

    public final void k() {
        rn1 rn1Var = this.t.h;
        this.C = rn1Var != null && rn1Var.f.h && this.B;
    }

    public final boolean l() {
        df2 df2Var = this.y;
        return df2Var.l && df2Var.m == 0;
    }

    public final void m() {
        int i;
        de0 de0Var = this.p;
        de0Var.g = false;
        n43 n43Var = de0Var.b;
        if (n43Var.c) {
            n43Var.a(n43Var.a());
            n43Var.c = false;
        }
        for (ro roVar : this.b) {
            if (b(roVar) && (i = roVar.g) == 2) {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                roVar.g = 1;
                roVar.k();
            }
        }
    }

    public final void n() {
        rn1 rn1Var = this.t.j;
        boolean z = this.E || (rn1Var != null && rn1Var.a.isLoading());
        df2 df2Var = this.y;
        if (z != df2Var.g) {
            this.y = new df2(df2Var.a, df2Var.b, df2Var.c, df2Var.d, df2Var.e, df2Var.f, z, df2Var.h, df2Var.i, df2Var.j, df2Var.k, df2Var.l, df2Var.m, df2Var.n, df2Var.p, df2Var.q, df2Var.r, df2Var.o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        long j;
        long j2;
        boolean z;
        float f;
        float f2;
        rn1 rn1Var = this.t.h;
        if (rn1Var == null) {
            return;
        }
        long readDiscontinuity = rn1Var.d ? rn1Var.a.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != C.TIME_UNSET) {
            b(readDiscontinuity);
            if (readDiscontinuity != this.y.r) {
                df2 df2Var = this.y;
                this.y = a(df2Var.b, readDiscontinuity, df2Var.c, readDiscontinuity, true, 5);
            }
        } else {
            de0 de0Var = this.p;
            boolean z2 = rn1Var != this.t.i;
            ro roVar = de0Var.d;
            if (roVar == null || roVar.f() || (!de0Var.d.g() && (z2 || de0Var.d.e()))) {
                de0Var.f = true;
                if (de0Var.g) {
                    n43 n43Var = de0Var.b;
                    if (!n43Var.c) {
                        ((j63) n43Var.b).getClass();
                        n43Var.e = SystemClock.elapsedRealtime();
                        n43Var.c = true;
                    }
                }
            } else {
                al1 al1Var = de0Var.e;
                al1Var.getClass();
                long a = al1Var.a();
                if (de0Var.f) {
                    if (a < de0Var.b.a()) {
                        n43 n43Var2 = de0Var.b;
                        if (n43Var2.c) {
                            n43Var2.a(n43Var2.a());
                            n43Var2.c = false;
                        }
                    } else {
                        de0Var.f = false;
                        if (de0Var.g) {
                            n43 n43Var3 = de0Var.b;
                            if (!n43Var3.c) {
                                ((j63) n43Var3.b).getClass();
                                n43Var3.e = SystemClock.elapsedRealtime();
                                n43Var3.c = true;
                            }
                        }
                    }
                }
                de0Var.b.a(a);
                ff2 playbackParameters = al1Var.getPlaybackParameters();
                if (!playbackParameters.equals(de0Var.b.f)) {
                    de0Var.b.a(playbackParameters);
                    ((ho0) de0Var.c).i.a(16, playbackParameters).b();
                }
            }
            long a2 = de0Var.a();
            this.M = a2;
            long j3 = a2 - rn1Var.o;
            long j4 = this.y.r;
            if (!this.q.isEmpty() && !this.y.b.a()) {
                if (this.O) {
                    this.O = false;
                }
                df2 df2Var2 = this.y;
                df2Var2.a.a(df2Var2.b.a);
                int min = Math.min(this.N, this.q.size());
                if (min > 0 && this.q.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < this.q.size() && this.q.get(min) != null) {
                    throw new ClassCastException();
                }
                this.N = min;
            }
            this.y.r = j3;
        }
        rn1 rn1Var2 = this.t.j;
        df2 df2Var3 = this.y;
        if (rn1Var2.d) {
            long bufferedPositionUs = rn1Var2.e ? rn1Var2.a.getBufferedPositionUs() : Long.MIN_VALUE;
            j = bufferedPositionUs == Long.MIN_VALUE ? rn1Var2.f.e : bufferedPositionUs;
        } else {
            j = rn1Var2.f.b;
        }
        df2Var3.p = j;
        df2 df2Var4 = this.y;
        df2Var4.q = a(df2Var4.p);
        df2 df2Var5 = this.y;
        if (!df2Var5.l || df2Var5.e != 3 || !a(df2Var5.a, df2Var5.b)) {
            return;
        }
        df2 df2Var6 = this.y;
        if (df2Var6.n.b != 1.0f) {
            return;
        }
        sg1 sg1Var = this.v;
        long a3 = a(df2Var6.a, df2Var6.b.a, df2Var6.r);
        long a4 = a(this.y.p);
        yd0 yd0Var = (yd0) sg1Var;
        if (yd0Var.d != C.TIME_UNSET) {
            long j5 = a3 - a4;
            long j6 = yd0Var.n;
            if (j6 == C.TIME_UNSET) {
                yd0Var.n = j5;
                yd0Var.o = 0L;
            } else {
                float f3 = yd0Var.c;
                long max = Math.max(j5, (long) (((1.0f - f3) * j5) + (j6 * f3)));
                yd0Var.n = max;
                long abs = Math.abs(j5 - max);
                long j7 = yd0Var.o;
                float f4 = yd0Var.c;
                yd0Var.o = (long) (((1.0f - f4) * abs) + (j7 * f4));
            }
            if (yd0Var.m != C.TIME_UNSET) {
                j2 = 1000;
                f2 = SystemClock.elapsedRealtime() - yd0Var.m < 1000 ? yd0Var.l : 1.0f;
            } else {
                j2 = 1000;
            }
            yd0Var.m = SystemClock.elapsedRealtime();
            long j8 = (yd0Var.o * 3) + yd0Var.n;
            if (yd0Var.i > j8) {
                float a5 = mc3.a(j2);
                f = 1.0E-7f;
                z = false;
                long[] jArr = {j8, yd0Var.f, yd0Var.i - (((long) ((yd0Var.l - 1.0f) * a5)) + ((long) ((yd0Var.j - 1.0f) * a5)))};
                long j9 = jArr[0];
                for (int i = 1; i < 3; i++) {
                    long j10 = jArr[i];
                    if (j10 > j9) {
                        j9 = j10;
                    }
                }
                yd0Var.i = j9;
            } else {
                z = false;
                f = 1.0E-7f;
                long max2 = a3 - ((long) (Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, yd0Var.l - 1.0f) / 1.0E-7f));
                long j11 = yd0Var.i;
                int i2 = mc3.a;
                long max3 = Math.max(j11, Math.min(max2, j8));
                yd0Var.i = max3;
                long j12 = yd0Var.h;
                if (j12 != C.TIME_UNSET && max3 > j12) {
                    yd0Var.i = j12;
                }
            }
            long j13 = a3 - yd0Var.i;
            if (Math.abs(j13) < yd0Var.a) {
                yd0Var.l = 1.0f;
            } else {
                float f5 = (j13 * f) + 1.0f;
                float f6 = yd0Var.k;
                float f7 = yd0Var.j;
                int i3 = mc3.a;
                yd0Var.l = Math.max(f6, Math.min(f5, f7));
            }
            f2 = yd0Var.l;
            if (this.p.getPlaybackParameters().b == f2) {
                this.p.a(new ff2(f2, this.y.n.c));
                a(this.y.n, this.p.getPlaybackParameters().b, z, z);
                return;
            }
            return;
        }
        z = false;
        if (this.p.getPlaybackParameters().b == f2) {
        }
    }

    public final void e(boolean z) {
        this.G = z;
        un1 un1Var = this.t;
        w73 w73Var = this.y.a;
        un1Var.g = z;
        if (!un1Var.a(w73Var)) {
            b(true);
        }
        a(false);
    }

    public static void a(cg2 cg2Var) {
        synchronized (cg2Var) {
        }
        try {
            cg2Var.a.handleMessage(cg2Var.d, cg2Var.e);
        } finally {
            cg2Var.a(true);
        }
    }

    public final void b(qn1 qn1Var) {
        qn1 qn1Var2;
        rn1 rn1Var = this.t.j;
        if (rn1Var == null || (qn1Var2 = rn1Var.a) != qn1Var) {
            return;
        }
        long j = this.M;
        if (rn1Var.l == null) {
            if (rn1Var.d) {
                qn1Var2.reevaluateBuffer(j - rn1Var.o);
            }
            d();
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(ro roVar) {
        if (b(roVar)) {
            de0 de0Var = this.p;
            if (roVar == de0Var.d) {
                de0Var.e = null;
                de0Var.d = null;
                de0Var.f = true;
            }
            int i = roVar.g;
            if (i == 2) {
                if (i == 2) {
                    roVar.g = 1;
                    roVar.k();
                } else {
                    throw new IllegalStateException();
                }
            }
            if (roVar.g == 1) {
                ox0 ox0Var = roVar.c;
                ox0Var.a = null;
                ox0Var.b = null;
                roVar.g = 0;
                roVar.h = null;
                roVar.i = null;
                roVar.l = false;
                roVar.h();
                this.K--;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static boolean b(ro roVar) {
        return roVar.g != 0;
    }

    public final void b(cg2 cg2Var) {
        try {
            a(cg2Var);
        } catch (qn0 e) {
            ji1.b("ExoPlayerImplInternal", ji1.a("Unexpected error delivering message on external thread.", e));
            throw new RuntimeException(e);
        }
    }

    public final void b(long j) {
        rn1 rn1Var = this.t.h;
        long j2 = j + (rn1Var == null ? 1000000000000L : rn1Var.o);
        this.M = j2;
        this.p.b.a(j2);
        for (ro roVar : this.b) {
            if (b(roVar)) {
                long j3 = this.M;
                roVar.l = false;
                roVar.k = j3;
                roVar.a(j3, false);
            }
        }
        for (rn1 rn1Var2 = this.t.h; rn1Var2 != null; rn1Var2 = rn1Var2.l) {
            for (pp0 pp0Var : rn1Var2.n.c) {
                if (pp0Var != null) {
                    pp0Var.h();
                }
            }
        }
    }

    public final /* synthetic */ Boolean c() {
        return Boolean.valueOf(this.A);
    }

    public final void c(cg2 cg2Var) {
        Looper looper = cg2Var.f;
        if (!looper.getThread().isAlive()) {
            ji1.d("TAG", "Trying to send message on a dead thread.");
            cg2Var.a(false);
        } else {
            ((j63) this.r).getClass();
            new Handler(looper, null).post(new xsna.b0(6, this, cg2Var));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:277:0x0519, code lost:
    
        if (l() == false) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x05c9, code lost:
    
        if (r8 >= r4.j) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0643, code lost:
    
        if (l() == false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0646, code lost:
    
        if (r6 == false) goto L408;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64, types: [int] */
    /* JADX WARN: Type inference failed for: r0v85, types: [yads.x83] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [int] */
    /* JADX WARN: Type inference failed for: r10v30, types: [yads.x83] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [int] */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r4v83, types: [int] */
    /* JADX WARN: Type inference failed for: r4v89 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v72, types: [int] */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r6v31, types: [yads.pp0[]] */
    /* JADX WARN: Type inference failed for: r6v32, types: [yads.pp0] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32, types: [int] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r8v36, types: [yads.x83] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [int] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        long j;
        long j2;
        boolean z;
        boolean z2;
        long j3;
        long j4;
        long j5;
        boolean z3;
        boolean z4;
        long j6;
        df2 df2Var;
        boolean z5;
        int i;
        rn1 rn1Var;
        ot2 ot2Var;
        boolean z6;
        tn1 a;
        boolean z7;
        rn1 rn1Var2;
        rn1 rn1Var3;
        boolean z8;
        rn1 rn1Var4;
        rn1 rn1Var5;
        rn1 a2;
        boolean z9;
        ?? r4;
        ro[] roVarArr;
        boolean z10;
        ((j63) this.r).getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.i.a.removeMessages(2);
        if (this.y.a.c() || !this.u.k) {
            j = -9223372036854775807L;
            j2 = uptimeMillis;
            z = false;
            z2 = true;
        } else {
            un1 un1Var = this.t;
            long j7 = this.M;
            rn1 rn1Var6 = un1Var.j;
            if (rn1Var6 != null) {
                if (rn1Var6.l == null) {
                    if (rn1Var6.d) {
                        rn1Var6.a.reevaluateBuffer(j7 - rn1Var6.o);
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            un1 un1Var2 = this.t;
            rn1 rn1Var7 = un1Var2.j;
            if (rn1Var7 == null || (!rn1Var7.f.i && rn1Var7.d && ((!rn1Var7.e || rn1Var7.a.getBufferedPositionUs() == Long.MIN_VALUE) && un1Var2.j.f.e != C.TIME_UNSET && un1Var2.k < 100))) {
                un1 un1Var3 = this.t;
                long j8 = this.M;
                df2 df2Var2 = this.y;
                rn1 rn1Var8 = un1Var3.j;
                if (rn1Var8 == null) {
                    w73 w73Var = df2Var2.a;
                    zn1 zn1Var = df2Var2.b;
                    long j9 = df2Var2.c;
                    j = -9223372036854775807L;
                    long j10 = df2Var2.r;
                    z6 = true;
                    w73Var.a(zn1Var.a, un1Var3.a);
                    if (zn1Var.a()) {
                        j2 = uptimeMillis;
                        a = un1Var3.a(w73Var, zn1Var.a, zn1Var.b, zn1Var.c, j9, zn1Var.d);
                    } else {
                        j2 = uptimeMillis;
                        a = un1Var3.a(w73Var, zn1Var.a, j10, j9, zn1Var.d);
                    }
                } else {
                    j = -9223372036854775807L;
                    j2 = uptimeMillis;
                    z6 = true;
                    a = un1Var3.a(df2Var2.a, rn1Var8, j8);
                }
                tn1 tn1Var = a;
                if (tn1Var != null) {
                    un1 un1Var4 = this.t;
                    ro[] roVarArr2 = this.d;
                    w83 w83Var = this.e;
                    ib0 ib0Var = ((zd0) this.g).a;
                    jo1 jo1Var = this.u;
                    x83 x83Var = this.f;
                    rn1 rn1Var9 = un1Var4.j;
                    rn1 rn1Var10 = new rn1(roVarArr2, rn1Var9 == null ? 1000000000000L : (rn1Var9.o + rn1Var9.f.e) - tn1Var.b, w83Var, ib0Var, jo1Var, tn1Var, x83Var);
                    rn1 rn1Var11 = un1Var4.j;
                    if (rn1Var11 != null) {
                        if (rn1Var10 != rn1Var11.l) {
                            rn1Var11.a();
                            rn1Var11.l = rn1Var10;
                        }
                    } else {
                        un1Var4.h = rn1Var10;
                        un1Var4.i = rn1Var10;
                    }
                    un1Var4.l = null;
                    un1Var4.j = rn1Var10;
                    un1Var4.k++;
                    un1Var4.c();
                    rn1Var10.a.a(this, tn1Var.b);
                    if (this.t.h == rn1Var10) {
                        b(tn1Var.b);
                    }
                    z7 = false;
                    a(false);
                } else {
                    z7 = false;
                }
            } else {
                j = -9223372036854775807L;
                j2 = uptimeMillis;
                z7 = false;
                z6 = true;
            }
            if (this.E) {
                rn1 rn1Var12 = this.t.j;
                if (rn1Var12 != null) {
                    if ((!rn1Var12.d ? 0L : rn1Var12.a.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                        z10 = z6;
                        this.E = z10;
                        n();
                    }
                }
                z10 = z7;
                this.E = z10;
                n();
            } else {
                d();
            }
            rn1 rn1Var13 = this.t.i;
            if (rn1Var13 != null) {
                if (rn1Var13.l != null && !this.C) {
                    if (rn1Var13.d) {
                        ?? r2 = z7;
                        while (true) {
                            ro[] roVarArr3 = this.b;
                            if (r2 < roVarArr3.length) {
                                ro roVar = roVarArr3[r2];
                                ot2 ot2Var2 = rn1Var13.c[r2];
                                if (roVar.h != ot2Var2) {
                                    break;
                                }
                                if (ot2Var2 != null && !roVar.e()) {
                                    rn1 rn1Var14 = rn1Var13.l;
                                    if (!rn1Var13.f.f) {
                                        break;
                                    }
                                    if (!rn1Var14.d) {
                                        break;
                                    }
                                    if (!(roVar instanceof e73) && !(roVar instanceof zt1) && roVar.k < rn1Var14.f.b + rn1Var14.o) {
                                        break;
                                    }
                                }
                                r2++;
                            } else {
                                rn1 rn1Var15 = rn1Var13.l;
                                if (rn1Var15.d || this.M >= rn1Var15.f.b + rn1Var15.o) {
                                    ?? r8 = rn1Var13.n;
                                    un1 un1Var5 = this.t;
                                    rn1 rn1Var16 = un1Var5.i;
                                    if (rn1Var16 != null && (rn1Var2 = rn1Var16.l) != null) {
                                        un1Var5.i = rn1Var2;
                                        un1Var5.c();
                                        rn1 rn1Var17 = un1Var5.i;
                                        ?? r10 = rn1Var17.n;
                                        w73 w73Var2 = this.y.a;
                                        z2 = z6;
                                        a(w73Var2, rn1Var17.f.a, w73Var2, rn1Var13.f.a, C.TIME_UNSET);
                                        if (rn1Var17.d && rn1Var17.a.readDiscontinuity() != j) {
                                            long j11 = rn1Var17.f.b + rn1Var17.o;
                                            ro[] roVarArr4 = this.b;
                                            int length = roVarArr4.length;
                                            for (?? r5 = z7; r5 < length; r5++) {
                                                ro roVar2 = roVarArr4[r5];
                                                if (roVar2.h != null) {
                                                    a(roVar2, j11);
                                                }
                                            }
                                        } else {
                                            for (?? r0 = z7; r0 < this.b.length; r0++) {
                                                boolean a3 = r8.a(r0);
                                                boolean a4 = r10.a(r0);
                                                if (a3 && !this.b[r0].l) {
                                                    boolean z11 = this.d[r0].b == -2 ? z2 : z7;
                                                    no2 no2Var = r8.b[r0];
                                                    no2 no2Var2 = r10.b[r0];
                                                    if (!a4 || !no2Var2.equals(no2Var) || z11) {
                                                        a(this.b[r0], rn1Var17.f.b + rn1Var17.o);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                }
                            }
                        }
                    }
                } else {
                    z2 = z6;
                    if (rn1Var13.f.i || this.C) {
                        ?? r22 = z7;
                        while (true) {
                            ro[] roVarArr5 = this.b;
                            if (r22 >= roVarArr5.length) {
                                break;
                            }
                            ro roVar3 = roVarArr5[r22];
                            ot2 ot2Var3 = rn1Var13.c[r22];
                            if (ot2Var3 != null && roVar3.h == ot2Var3 && roVar3.e()) {
                                long j12 = rn1Var13.f.e;
                                a(roVar3, (j12 == j || j12 == Long.MIN_VALUE) ? j : rn1Var13.o + j12);
                            }
                            r22++;
                        }
                    }
                }
                un1 un1Var6 = this.t;
                rn1Var3 = un1Var6.i;
                if (rn1Var3 != null && un1Var6.h != rn1Var3 && !rn1Var3.g) {
                    ?? r02 = rn1Var3.n;
                    boolean z12 = z7;
                    r4 = z12;
                    while (true) {
                        roVarArr = this.b;
                        if (r4 >= roVarArr.length) {
                            ro roVar4 = roVarArr[r4];
                            if (b(roVar4)) {
                                boolean z13 = roVar4.h != rn1Var3.c[r4] ? z2 : z7;
                                if (!r02.a(r4) || z13) {
                                    if (!roVar4.l) {
                                        ?? r6 = r02.c[r4];
                                        int f = r6 != 0 ? r6.f() : z7;
                                        nx0[] nx0VarArr = new nx0[f];
                                        for (?? r9 = z7; r9 < f; r9++) {
                                            nx0VarArr[r9] = r6.a(r9);
                                        }
                                        ot2 ot2Var4 = rn1Var3.c[r4];
                                        long j13 = rn1Var3.f.b;
                                        long j14 = rn1Var3.o;
                                        long j15 = j13 + j14;
                                        if (!roVar4.l) {
                                            roVar4.h = ot2Var4;
                                            if (roVar4.k == Long.MIN_VALUE) {
                                                roVar4.k = j15;
                                            }
                                            roVar4.i = nx0VarArr;
                                            roVar4.j = j14;
                                            roVar4.a(nx0VarArr, j15, j14);
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    } else if (roVar4.f()) {
                                        a(roVar4);
                                    } else {
                                        z12 = z2;
                                    }
                                }
                            }
                            z7 = false;
                            r4++;
                        } else if (!z12) {
                            a(new boolean[roVarArr.length]);
                        }
                    }
                }
                z8 = false;
                while (l() && !this.C && (rn1Var4 = this.t.h) != null && (rn1Var5 = rn1Var4.l) != null && this.M >= rn1Var5.f.b + rn1Var5.o && rn1Var5.g) {
                    if (z8) {
                        do0 do0Var = this.z;
                        df2 df2Var3 = this.y;
                        boolean z14 = do0Var.a | (do0Var.b != df2Var3 ? z2 : false);
                        do0Var.a = z14;
                        do0Var.b = df2Var3;
                        if (z14) {
                            ((tuz) this.s).a(do0Var);
                            this.z = new do0(this.y);
                        }
                    }
                    a2 = this.t.a();
                    a2.getClass();
                    if (this.y.b.a.equals(a2.f.a.a)) {
                        zn1 zn1Var2 = this.y.b;
                        if (zn1Var2.b == -1) {
                            zn1 zn1Var3 = a2.f.a;
                            if (zn1Var3.b == -1 && zn1Var2.e != zn1Var3.e) {
                                z9 = z2;
                                tn1 tn1Var2 = a2.f;
                                boolean z15 = z9;
                                zn1 zn1Var4 = tn1Var2.a;
                                long j16 = tn1Var2.b;
                                this.y = a(zn1Var4, j16, tn1Var2.c, j16, !z15, 0);
                                k();
                                o();
                                z8 = z2;
                            }
                        }
                    }
                    z9 = false;
                    tn1 tn1Var22 = a2.f;
                    boolean z152 = z9;
                    zn1 zn1Var42 = tn1Var22.a;
                    long j162 = tn1Var22.b;
                    this.y = a(zn1Var42, j162, tn1Var22.c, j162, !z152, 0);
                    k();
                    o();
                    z8 = z2;
                }
                z = false;
            }
            z2 = z6;
            un1 un1Var62 = this.t;
            rn1Var3 = un1Var62.i;
            if (rn1Var3 != null) {
                ?? r022 = rn1Var3.n;
                boolean z122 = z7;
                r4 = z122;
                while (true) {
                    roVarArr = this.b;
                    if (r4 >= roVarArr.length) {
                    }
                    z7 = false;
                    r4++;
                }
            }
            z8 = false;
            while (l()) {
                if (z8) {
                }
                a2 = this.t.a();
                a2.getClass();
                if (this.y.b.a.equals(a2.f.a.a)) {
                }
                z9 = false;
                tn1 tn1Var222 = a2.f;
                boolean z1522 = z9;
                zn1 zn1Var422 = tn1Var222.a;
                long j1622 = tn1Var222.b;
                this.y = a(zn1Var422, j1622, tn1Var222.c, j1622, !z1522, 0);
                k();
                o();
                z8 = z2;
            }
            z = false;
        }
        int i2 = this.y.e;
        if (i2 == z2 || i2 == 4) {
            return;
        }
        rn1 rn1Var18 = this.t.h;
        if (rn1Var18 == null) {
            this.i.a.sendEmptyMessageAtTime(2, j2 + 10);
            return;
        }
        long j17 = j;
        h83.a("doSomeWork");
        o();
        if (rn1Var18.d) {
            j3 = 10;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            j5 = 1000;
            j4 = j17;
            rn1Var18.a.discardBuffer(this.y.r - this.n, this.o);
            ?? r102 = z;
            z3 = z2;
            z4 = z3;
            while (true) {
                ro[] roVarArr6 = this.b;
                if (r102 >= roVarArr6.length) {
                    break;
                }
                ro roVar5 = roVarArr6[r102];
                if (b(roVar5)) {
                    roVar5.a(this.M, elapsedRealtime);
                    z3 = (z3 && roVar5.f()) ? z2 : z;
                    boolean z16 = rn1Var18.c[r102] != roVar5.h ? z2 : z;
                    boolean z17 = (z16 || ((z16 || !roVar5.e()) ? z : z2) || roVar5.g() || roVar5.f()) ? z2 : z;
                    z4 = (z4 && z17) ? z2 : z;
                    if (!z17) {
                        ot2 ot2Var5 = roVar5.h;
                        ot2Var5.getClass();
                        ot2Var5.a();
                    }
                }
                r102++;
            }
        } else {
            j3 = 10;
            j4 = j17;
            j5 = 1000;
            rn1Var18.a.maybeThrowPrepareError();
            z3 = z2;
            z4 = z3;
        }
        long j18 = rn1Var18.f.e;
        boolean z18 = (z3 && rn1Var18.d && (j18 == j4 || j18 <= this.y.r)) ? z2 : z;
        if (z18 && this.C) {
            this.C = z;
            a(z, this.y.m, z, 5);
        }
        if (z18 && rn1Var18.f.i) {
            b(4);
            m();
        } else {
            df2 df2Var4 = this.y;
            if (df2Var4.e == 2) {
                if (this.K == 0) {
                    rn1 rn1Var19 = this.t.h;
                    long j19 = rn1Var19.f.e;
                    if (rn1Var19.d) {
                        if (j19 != j4) {
                            if (df2Var4.r >= j19) {
                            }
                        }
                        b(3);
                        this.P = null;
                        if (l()) {
                            z2 = true;
                        } else {
                            this.D = false;
                            de0 de0Var = this.p;
                            z2 = true;
                            de0Var.g = true;
                            n43 n43Var = de0Var.b;
                            if (!n43Var.c) {
                                ((j63) n43Var.b).getClass();
                                n43Var.e = SystemClock.elapsedRealtime();
                                n43Var.c = true;
                            }
                            for (ro roVar6 : this.b) {
                                if (b(roVar6)) {
                                    if (roVar6.g == 1) {
                                        roVar6.g = 2;
                                        roVar6.j();
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                }
                            }
                        }
                    }
                } else if (z4) {
                    if (df2Var4.g) {
                        long j20 = a(df2Var4.a, this.t.h.f.a) ? ((yd0) this.v).i : j4;
                        rn1 rn1Var20 = this.t.j;
                        boolean z19 = (!rn1Var20.d || (rn1Var20.e && rn1Var20.a.getBufferedPositionUs() != Long.MIN_VALUE) || !rn1Var20.f.i) ? z : z2;
                        boolean z20 = (!rn1Var20.f.a.a() || rn1Var20.d) ? z : z2;
                        if (!z19 && !z20) {
                            tg1 tg1Var = this.g;
                            long a5 = a(this.y.p);
                            float f2 = this.p.getPlaybackParameters().b;
                            boolean z21 = this.D;
                            zd0 zd0Var = (zd0) tg1Var;
                            zd0Var.getClass();
                            if (f2 == 1.0f) {
                                j6 = j20;
                            } else {
                                j6 = j20;
                                a5 = Math.round(a5 / f2);
                            }
                            long j21 = z21 ? zd0Var.e : zd0Var.d;
                            if (j6 != j4) {
                                j21 = Math.min(j6 / 2, j21);
                            }
                            if (j21 > 0 && a5 < j21) {
                                if (!zd0Var.g) {
                                    ib0 ib0Var2 = zd0Var.a;
                                    synchronized (ib0Var2) {
                                        int i3 = ib0Var2.e * ib0Var2.b;
                                    }
                                }
                                z2 = true;
                            }
                        }
                    }
                    b(3);
                    this.P = null;
                    if (l()) {
                    }
                }
            }
            df2 df2Var5 = this.y;
            if (df2Var5.e == 3) {
                if (this.K == 0) {
                    rn1 rn1Var21 = this.t.h;
                    long j22 = rn1Var21.f.e;
                    if (rn1Var21.d) {
                        if (j22 != j4) {
                            if (df2Var5.r >= j22) {
                            }
                        }
                    }
                    this.D = l();
                    b(2);
                    if (this.D) {
                        for (rn1 rn1Var22 = this.t.h; rn1Var22 != null; rn1Var22 = rn1Var22.l) {
                            for (pp0 pp0Var : rn1Var22.n.c) {
                                if (pp0Var != null) {
                                    pp0Var.i();
                                }
                            }
                        }
                        yd0 yd0Var = (yd0) this.v;
                        long j23 = yd0Var.i;
                        if (j23 != j4) {
                            long j24 = j23 + yd0Var.b;
                            yd0Var.i = j24;
                            long j25 = yd0Var.h;
                            if (j25 != j4 && j24 > j25) {
                                yd0Var.i = j25;
                            }
                            yd0Var.m = j4;
                        }
                    }
                    m();
                }
            }
        }
        if (this.y.e == 2) {
            int i4 = 0;
            while (true) {
                ro[] roVarArr7 = this.b;
                if (i4 >= roVarArr7.length) {
                    break;
                }
                if (b(roVarArr7[i4]) && (ot2Var = this.b[i4].h) == rn1Var18.c[i4]) {
                    ot2Var.getClass();
                    ot2Var.a();
                }
                i4++;
            }
            df2 df2Var6 = this.y;
            if (!df2Var6.g && df2Var6.q < 500000 && (rn1Var = this.t.j) != null) {
                if ((rn1Var.d ? rn1Var.a.getNextLoadPositionUs() : 0L) != Long.MIN_VALUE) {
                    if (this.Q == C.TIME_UNSET) {
                        ((j63) this.r).getClass();
                        this.Q = SystemClock.elapsedRealtime();
                    } else {
                        ((j63) this.r).getClass();
                        if (SystemClock.elapsedRealtime() - this.Q >= 4000) {
                            throw new IllegalStateException("Playback stuck buffering and not loading");
                        }
                    }
                    boolean z22 = (l() || this.y.e != 3) ? false : z2;
                    if (this.J || !this.I || !z22) {
                        z2 = false;
                    }
                    df2Var = this.y;
                    if (df2Var.o == z2) {
                        z5 = z2;
                        this.y = new df2(df2Var.a, df2Var.b, df2Var.c, df2Var.d, df2Var.e, df2Var.f, df2Var.g, df2Var.h, df2Var.i, df2Var.j, df2Var.k, df2Var.l, df2Var.m, df2Var.n, df2Var.p, df2Var.q, df2Var.r, z5);
                    } else {
                        z5 = z2;
                    }
                    this.I = false;
                    if (!z5 || (i = this.y.e) == 4) {
                    }
                    if (!z22 && i != 2) {
                        if (i == 3 && this.K != 0) {
                            this.i.a.sendEmptyMessageAtTime(2, j2 + j5);
                        }
                    } else {
                        this.i.a.sendEmptyMessageAtTime(2, j2 + j3);
                    }
                    h83.a();
                    return;
                }
            }
        }
        this.Q = C.TIME_UNSET;
        if (l()) {
        }
        if (this.J) {
        }
        z2 = false;
        df2Var = this.y;
        if (df2Var.o == z2) {
        }
        this.I = false;
        if (z5) {
        }
    }

    public final void c(boolean z) {
        if (z == this.J) {
            return;
        }
        this.J = z;
        if (z || !this.y.o) {
            return;
        }
        this.i.a.sendEmptyMessage(2);
    }

    public final void d(boolean z) {
        this.B = z;
        k();
        if (this.C) {
            un1 un1Var = this.t;
            if (un1Var.i != un1Var.h) {
                b(true);
                a(false);
            }
        }
    }

    public final void b(boolean z) {
        zn1 zn1Var = this.t.h.f.a;
        long a = a(zn1Var, this.y.r, true, false);
        if (a != this.y.r) {
            df2 df2Var = this.y;
            this.y = a(zn1Var, a, df2Var.c, df2Var.d, z, 5);
        }
    }

    public final void b(int i) {
        df2 df2Var = this.y;
        if (df2Var.e != i) {
            if (i != 2) {
                this.Q = C.TIME_UNSET;
            }
            this.y = df2Var.a(i);
        }
    }

    public final void a(boolean[] zArr) {
        int i;
        al1 al1Var;
        rn1 rn1Var = this.t.i;
        x83 x83Var = rn1Var.n;
        for (int i2 = 0; i2 < this.b.length; i2++) {
            if (!x83Var.a(i2) && this.c.remove(this.b[i2])) {
                ro roVar = this.b[i2];
                if (roVar.g == 0) {
                    ox0 ox0Var = roVar.c;
                    ox0Var.a = null;
                    ox0Var.b = null;
                    roVar.i();
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        int i3 = 0;
        while (i3 < this.b.length) {
            if (x83Var.a(i3)) {
                boolean z = zArr[i3];
                ro roVar2 = this.b[i3];
                if (!b(roVar2)) {
                    un1 un1Var = this.t;
                    rn1 rn1Var2 = un1Var.i;
                    boolean z2 = rn1Var2 == un1Var.h;
                    x83 x83Var2 = rn1Var2.n;
                    no2 no2Var = x83Var2.b[i3];
                    pp0 pp0Var = x83Var2.c[i3];
                    int f = pp0Var != null ? pp0Var.f() : 0;
                    nx0[] nx0VarArr = new nx0[f];
                    for (int i4 = 0; i4 < f; i4++) {
                        nx0VarArr[i4] = pp0Var.a(i4);
                    }
                    boolean z3 = l() && this.y.e == 3;
                    boolean z4 = !z && z3;
                    this.K++;
                    this.c.add(roVar2);
                    ot2 ot2Var = rn1Var2.c[i3];
                    i = i3;
                    long j = this.M;
                    boolean z5 = z2;
                    long j2 = rn1Var2.f.b;
                    long j3 = rn1Var2.o;
                    boolean z6 = z3;
                    long j4 = j2 + j3;
                    if (roVar2.g == 0) {
                        roVar2.d = no2Var;
                        roVar2.g = 1;
                        roVar2.a(z5);
                        if (!roVar2.l) {
                            roVar2.h = ot2Var;
                            if (roVar2.k == Long.MIN_VALUE) {
                                roVar2.k = j4;
                            }
                            roVar2.i = nx0VarArr;
                            roVar2.j = j3;
                            roVar2.a(nx0VarArr, j4, j3);
                            roVar2.l = false;
                            roVar2.k = j;
                            roVar2.a(j, z4);
                            roVar2.handleMessage(11, new bo0(this));
                            de0 de0Var = this.p;
                            de0Var.getClass();
                            al1 c = roVar2.c();
                            if (c != null && c != (al1Var = de0Var.e)) {
                                if (al1Var == null) {
                                    de0Var.e = c;
                                    de0Var.d = roVar2;
                                    ((gl1) c).a(de0Var.b.f);
                                } else {
                                    throw new qn0(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000, 0);
                                }
                            }
                            if (!z6) {
                                continue;
                            } else if (roVar2.g == 1) {
                                roVar2.g = 2;
                                roVar2.j();
                            } else {
                                throw new IllegalStateException();
                            }
                            i3 = i + 1;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            i = i3;
            i3 = i + 1;
        }
        rn1Var.g = true;
    }

    public final long a(w73 w73Var, Object obj, long j) {
        long elapsedRealtime;
        w73Var.a(w73Var.a(obj, this.m).d, this.l, 0L);
        v73 v73Var = this.l;
        if (v73Var.g != C.TIME_UNSET && v73Var.a()) {
            v73 v73Var2 = this.l;
            if (v73Var2.j) {
                long j2 = v73Var2.h;
                int i = mc3.a;
                if (j2 == C.TIME_UNSET) {
                    elapsedRealtime = System.currentTimeMillis();
                } else {
                    elapsedRealtime = j2 + SystemClock.elapsedRealtime();
                }
                return mc3.a(elapsedRealtime - this.l.g) - (j + this.m.f);
            }
        }
        return C.TIME_UNSET;
    }

    public final Pair a(w73 w73Var) {
        long j = 0;
        if (w73Var.c()) {
            return Pair.create(df2.s, 0L);
        }
        Pair a = w73Var.a(this.l, this.m, w73Var.a(this.G), C.TIME_UNSET);
        zn1 a2 = this.t.a(w73Var, a.first, 0L);
        long longValue = ((Long) a.second).longValue();
        if (a2.a()) {
            w73Var.a(a2.a, this.m);
            if (a2.c == this.m.a(a2.b)) {
                j = this.m.h.d;
            }
        } else {
            j = longValue;
        }
        return Pair.create(a2, Long.valueOf(j));
    }

    public final long a(long j) {
        rn1 rn1Var = this.t.j;
        if (rn1Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.M - rn1Var.o));
    }

    public final void a(IOException iOException, int i) {
        qn0 qn0Var = new qn0(0, iOException, i, 0);
        rn1 rn1Var = this.t.h;
        if (rn1Var != null) {
            zn1 zn1Var = rn1Var.f.a;
            String message = qn0Var.getMessage();
            int i2 = mc3.a;
            qn0Var = new qn0(message, qn0Var.getCause(), qn0Var.b, qn0Var.d, qn0Var.e, qn0Var.f, qn0Var.g, qn0Var.h, zn1Var, qn0Var.c, qn0Var.j);
        }
        ji1.b("ExoPlayerImplInternal", ji1.a("Playback error", qn0Var));
        a(false, false);
        this.y = this.y.a(qn0Var);
    }

    public final void a(boolean z) {
        long j;
        rn1 rn1Var = this.t.j;
        zn1 zn1Var = rn1Var == null ? this.y.b : rn1Var.f.a;
        boolean equals = this.y.k.equals(zn1Var);
        if (!equals) {
            this.y = this.y.a(zn1Var);
        }
        df2 df2Var = this.y;
        if (rn1Var == null) {
            j = df2Var.r;
        } else if (!rn1Var.d) {
            j = rn1Var.f.b;
        } else {
            long bufferedPositionUs = rn1Var.e ? rn1Var.a.getBufferedPositionUs() : Long.MIN_VALUE;
            j = bufferedPositionUs == Long.MIN_VALUE ? rn1Var.f.e : bufferedPositionUs;
        }
        df2Var.p = j;
        df2 df2Var2 = this.y;
        df2Var2.q = a(df2Var2.p);
        if ((!equals || z) && rn1Var != null && rn1Var.d) {
            a(rn1Var.n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x01fd, code lost:
    
        if (r6.e[r10] == 2) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0210, code lost:
    
        if (r6.h.a(r5.b).h != false) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0362 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(w73 w73Var, boolean z) {
        long j;
        v73 v73Var;
        int i;
        long j2;
        Object obj;
        long j3;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        w73 w73Var2;
        long j4;
        long j5;
        zn1 a;
        ?? r7;
        boolean z6;
        long j6;
        fo0 fo0Var;
        long j7;
        int i4;
        boolean z7;
        int i5;
        w73 w73Var3;
        zn1 zn1Var;
        long j8;
        long j9;
        boolean z8;
        w73 w73Var4;
        Object obj2;
        long j10;
        int i6;
        boolean z9;
        long j11;
        w73 w73Var5;
        w73 w73Var6;
        un1 un1Var;
        df2 df2Var = this.y;
        go0 go0Var = this.L;
        un1 un1Var2 = this.t;
        int i7 = this.F;
        boolean z10 = this.G;
        v73 v73Var2 = this.l;
        t73 t73Var = this.m;
        if (w73Var.c()) {
            w73Var2 = w73Var;
            fo0Var = new fo0(df2.s, 0L, C.TIME_UNSET, false, true, false);
        } else {
            zn1 zn1Var2 = df2Var.b;
            Object obj3 = zn1Var2.a;
            w73 w73Var7 = df2Var.a;
            boolean z11 = w73Var7.c() || w73Var7.a(zn1Var2.a, t73Var).g;
            if (!df2Var.b.a() && !z11) {
                j = df2Var.r;
            } else {
                j = df2Var.c;
            }
            if (go0Var != null) {
                Pair a2 = a(w73Var, go0Var, true, i7, z10, v73Var2, t73Var);
                if (a2 == null) {
                    i2 = w73Var.a(z10);
                    v73Var = v73Var2;
                    j3 = j;
                    obj = obj3;
                    i3 = -1;
                    z2 = false;
                    z3 = true;
                    z4 = false;
                    if (i2 == i3) {
                        w73Var2 = w73Var;
                        Pair a3 = w73Var2.a(v73Var, t73Var, i2, C.TIME_UNSET);
                        obj = a3.first;
                        j4 = ((Long) a3.second).longValue();
                        j5 = -9223372036854775807L;
                    } else {
                        w73Var2 = w73Var;
                        j4 = j3;
                        j5 = j4;
                    }
                    a = un1Var2.a(w73Var2, obj, j4);
                    int i8 = a.e;
                    r7 = (zn1Var2.a.equals(obj) || zn1Var2.a() || a.a() || !(i8 != i3 || ((i4 = zn1Var2.e) != i3 && i8 >= i4))) ? 0 : 1;
                    t73 a4 = w73Var2.a(obj, t73Var);
                    if (!z11 && j == j5 && zn1Var2.a.equals(a.a)) {
                        if (zn1Var2.a()) {
                            if (a4.h.a(zn1Var2.b).h) {
                                int i9 = zn1Var2.b;
                                int i10 = zn1Var2.c;
                                d6 a5 = a4.h.a(i9);
                                if (a5.c == -1 || a5.e[i10] != 4) {
                                    int i11 = zn1Var2.b;
                                    int i12 = zn1Var2.c;
                                    d6 a6 = a4.h.a(i11);
                                    if (a6.c != -1) {
                                    }
                                    z6 = true;
                                    if (r7 == 0 || z6) {
                                        a = zn1Var2;
                                    }
                                    if (a.a()) {
                                        if (a.equals(zn1Var2)) {
                                            j7 = df2Var.r;
                                        } else {
                                            w73Var2.a(a.a, t73Var);
                                            if (a.c == t73Var.a(a.b)) {
                                                j7 = t73Var.h.d;
                                            } else {
                                                j6 = 0;
                                            }
                                        }
                                        j6 = j7;
                                    } else {
                                        j6 = j4;
                                    }
                                    fo0Var = new fo0(a, j6, j5, z2, z3, z4);
                                }
                            }
                        }
                        if (a.a()) {
                        }
                    }
                    z6 = false;
                    if (r7 == 0) {
                    }
                    a = zn1Var2;
                    if (a.a()) {
                    }
                    fo0Var = new fo0(a, j6, j5, z2, z3, z4);
                } else {
                    if (go0Var.c == C.TIME_UNSET) {
                        j3 = j;
                        obj = obj3;
                        z7 = false;
                        i5 = w73Var.a(a2.first, t73Var).d;
                    } else {
                        obj = a2.first;
                        j3 = ((Long) a2.second).longValue();
                        z7 = true;
                        i5 = -1;
                    }
                    z4 = z7;
                    if (df2Var.e == 4) {
                        v73Var = v73Var2;
                        i2 = i5;
                        i3 = -1;
                        z2 = true;
                    } else {
                        v73Var = v73Var2;
                        i2 = i5;
                        i3 = -1;
                        z2 = false;
                    }
                    z3 = false;
                    if (i2 == i3) {
                    }
                    a = un1Var2.a(w73Var2, obj, j4);
                    int i82 = a.e;
                    if (zn1Var2.a.equals(obj)) {
                    }
                    t73 a42 = w73Var2.a(obj, t73Var);
                    if (!z11) {
                        if (zn1Var2.a()) {
                        }
                        if (a.a()) {
                        }
                    }
                    z6 = false;
                    if (r7 == 0) {
                    }
                    a = zn1Var2;
                    if (a.a()) {
                    }
                    fo0Var = new fo0(a, j6, j5, z2, z3, z4);
                }
            } else {
                Object obj4 = obj3;
                if (df2Var.a.c()) {
                    i2 = w73Var.a(z10);
                    v73Var = v73Var2;
                } else {
                    if (w73Var.a(obj4) == -1) {
                        Object a7 = a(v73Var2, t73Var, i7, z10, obj4, df2Var.a, w73Var);
                        v73Var = v73Var2;
                        t73Var = t73Var;
                        obj4 = obj4;
                        if (a7 == null) {
                            i = w73Var.a(z10);
                            z5 = true;
                            i2 = i;
                            z3 = z5;
                            j3 = j;
                            obj = obj4;
                            i3 = -1;
                            z2 = false;
                            z4 = false;
                            if (i2 == i3) {
                            }
                            a = un1Var2.a(w73Var2, obj, j4);
                            int i822 = a.e;
                            if (zn1Var2.a.equals(obj)) {
                            }
                            t73 a422 = w73Var2.a(obj, t73Var);
                            if (!z11) {
                            }
                            z6 = false;
                            if (r7 == 0) {
                            }
                            a = zn1Var2;
                            if (a.a()) {
                            }
                            fo0Var = new fo0(a, j6, j5, z2, z3, z4);
                        } else {
                            i = w73Var.a(a7, t73Var).d;
                        }
                    } else {
                        v73Var = v73Var2;
                        if (j == C.TIME_UNSET) {
                            i2 = w73Var.a(obj4, t73Var).d;
                        } else if (z11) {
                            df2Var.a.a(zn1Var2.a, t73Var);
                            if (df2Var.a.a(t73Var.d, v73Var, 0L).p == df2Var.a.a(zn1Var2.a)) {
                                Pair a8 = w73Var.a(v73Var, t73Var, w73Var.a(obj4, t73Var).d, j + t73Var.f);
                                obj = a8.first;
                                j2 = ((Long) a8.second).longValue();
                            } else {
                                j2 = j;
                                obj = obj4;
                            }
                            j3 = j2;
                            i2 = -1;
                            i3 = -1;
                            z2 = false;
                            z3 = false;
                            z4 = true;
                            if (i2 == i3) {
                            }
                            a = un1Var2.a(w73Var2, obj, j4);
                            int i8222 = a.e;
                            if (zn1Var2.a.equals(obj)) {
                            }
                            t73 a4222 = w73Var2.a(obj, t73Var);
                            if (!z11) {
                            }
                            z6 = false;
                            if (r7 == 0) {
                            }
                            a = zn1Var2;
                            if (a.a()) {
                            }
                            fo0Var = new fo0(a, j6, j5, z2, z3, z4);
                        } else {
                            i = -1;
                        }
                    }
                    z5 = false;
                    i2 = i;
                    z3 = z5;
                    j3 = j;
                    obj = obj4;
                    i3 = -1;
                    z2 = false;
                    z4 = false;
                    if (i2 == i3) {
                    }
                    a = un1Var2.a(w73Var2, obj, j4);
                    int i82222 = a.e;
                    if (zn1Var2.a.equals(obj)) {
                    }
                    t73 a42222 = w73Var2.a(obj, t73Var);
                    if (!z11) {
                    }
                    z6 = false;
                    if (r7 == 0) {
                    }
                    a = zn1Var2;
                    if (a.a()) {
                    }
                    fo0Var = new fo0(a, j6, j5, z2, z3, z4);
                }
                j3 = j;
                obj = obj4;
                i3 = -1;
                z2 = false;
                z3 = false;
                z4 = false;
                if (i2 == i3) {
                }
                a = un1Var2.a(w73Var2, obj, j4);
                int i822222 = a.e;
                if (zn1Var2.a.equals(obj)) {
                }
                t73 a422222 = w73Var2.a(obj, t73Var);
                if (!z11) {
                }
                z6 = false;
                if (r7 == 0) {
                }
                a = zn1Var2;
                if (a.a()) {
                }
                fo0Var = new fo0(a, j6, j5, z2, z3, z4);
            }
        }
        zn1 zn1Var3 = fo0Var.a;
        long j12 = fo0Var.c;
        boolean z12 = fo0Var.d;
        long j13 = fo0Var.b;
        boolean z13 = (this.y.b.equals(zn1Var3) && j13 == this.y.r) ? false : true;
        try {
            if (fo0Var.e) {
                try {
                    z9 = true;
                    if (this.y.e != 1) {
                        try {
                            b(4);
                        } catch (Throwable th) {
                            th = th;
                            w73Var3 = w73Var2;
                            z8 = z9;
                            zn1Var = zn1Var3;
                            j8 = j12;
                            j9 = j13;
                            df2 df2Var2 = this.y;
                            w73 w73Var8 = df2Var2.a;
                            zn1 zn1Var4 = df2Var2.b;
                            zn1 zn1Var5 = zn1Var;
                            w73Var4 = w73Var3;
                            a(w73Var4, zn1Var5, w73Var8, zn1Var4, !fo0Var.f ? j9 : -9223372036854775807L);
                            if (!z13) {
                            }
                            df2 df2Var3 = this.y;
                            obj2 = df2Var3.b.a;
                            w73 w73Var9 = df2Var3.a;
                            if (z13) {
                            }
                            long j14 = this.y.d;
                            if (w73Var4.a(obj2) != -1) {
                            }
                            this.y = a(zn1Var5, j9, j10, j14, r7, i6);
                            k();
                            a(w73Var4, this.y.a);
                            this.y = this.y.a(w73Var4);
                            if (!w73Var4.c()) {
                            }
                            a(false);
                            throw th;
                        }
                    }
                    a(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    z9 = true;
                }
            } else {
                z9 = true;
            }
            try {
                if (!z13) {
                    try {
                        z8 = z9;
                        try {
                            try {
                                r7 = w73Var;
                                if (!this.t.a(w73Var, this.M, b())) {
                                    b(false);
                                    r7 = r7;
                                }
                                zn1Var = zn1Var3;
                                j11 = j13;
                                w73Var5 = r7;
                                df2 df2Var4 = this.y;
                                zn1 zn1Var6 = zn1Var;
                                w73Var6 = w73Var5;
                                a(w73Var6, zn1Var6, df2Var4.a, df2Var4.b, fo0Var.f ? j11 : -9223372036854775807L);
                                if (!z13 || j12 != this.y.c) {
                                    df2 df2Var5 = this.y;
                                    Object obj5 = df2Var5.b.a;
                                    w73 w73Var10 = df2Var5.a;
                                    this.y = a(zn1Var6, j11, j12, this.y.d, (z13 || !z || w73Var10.c() || w73Var10.a(obj5, this.m).g) ? false : z8, w73Var6.a(obj5) == -1 ? 4 : 3);
                                }
                                k();
                                a(w73Var6, this.y.a);
                                this.y = this.y.a(w73Var6);
                                if (!w73Var6.c()) {
                                    this.L = null;
                                }
                                a(false);
                            } catch (Throwable th3) {
                                th = th3;
                                r7 = w73Var;
                                w73Var3 = r7;
                                zn1Var = zn1Var3;
                                j8 = j12;
                                j9 = j13;
                                df2 df2Var22 = this.y;
                                w73 w73Var82 = df2Var22.a;
                                zn1 zn1Var42 = df2Var22.b;
                                zn1 zn1Var52 = zn1Var;
                                w73Var4 = w73Var3;
                                a(w73Var4, zn1Var52, w73Var82, zn1Var42, !fo0Var.f ? j9 : -9223372036854775807L);
                                if (!z13 || j8 != this.y.c) {
                                    df2 df2Var32 = this.y;
                                    obj2 = df2Var32.b.a;
                                    w73 w73Var92 = df2Var32.a;
                                    boolean z14 = (z13 || !z || w73Var92.c() || w73Var92.a(obj2, this.m).g) ? false : z8;
                                    long j142 = this.y.d;
                                    if (w73Var4.a(obj2) != -1) {
                                        j10 = j8;
                                        i6 = 4;
                                    } else {
                                        j10 = j8;
                                        i6 = 3;
                                    }
                                    this.y = a(zn1Var52, j9, j10, j142, z14, i6);
                                }
                                k();
                                a(w73Var4, this.y.a);
                                this.y = this.y.a(w73Var4);
                                if (!w73Var4.c()) {
                                    this.L = null;
                                }
                                a(false);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r7 = w73Var;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r7 = w73Var;
                        z8 = z9;
                    }
                } else {
                    w73 w73Var11 = w73Var2;
                    z8 = z9;
                    boolean c = w73Var11.c();
                    r7 = w73Var11;
                    if (!c) {
                        try {
                            rn1 rn1Var = this.t.h;
                            while (rn1Var != null) {
                                try {
                                    if (rn1Var.f.a.equals(zn1Var3)) {
                                        tn1 a9 = this.t.a(w73Var11, rn1Var.f);
                                        rn1Var.f = a9;
                                        qn1 qn1Var = rn1Var.a;
                                        if (qn1Var instanceof tv) {
                                            long j15 = a9.d;
                                            if (j15 == C.TIME_UNSET) {
                                                j15 = Long.MIN_VALUE;
                                            }
                                            tv tvVar = (tv) qn1Var;
                                            j9 = j13;
                                            try {
                                                tvVar.f = 0L;
                                                tvVar.g = j15;
                                                rn1Var = rn1Var.l;
                                                j13 = j9;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                w73Var3 = w73Var11;
                                                zn1Var = zn1Var3;
                                                j8 = j12;
                                                df2 df2Var222 = this.y;
                                                w73 w73Var822 = df2Var222.a;
                                                zn1 zn1Var422 = df2Var222.b;
                                                zn1 zn1Var522 = zn1Var;
                                                w73Var4 = w73Var3;
                                                a(w73Var4, zn1Var522, w73Var822, zn1Var422, !fo0Var.f ? j9 : -9223372036854775807L);
                                                if (!z13) {
                                                }
                                                df2 df2Var322 = this.y;
                                                obj2 = df2Var322.b.a;
                                                w73 w73Var922 = df2Var322.a;
                                                if (z13) {
                                                }
                                                long j1422 = this.y.d;
                                                if (w73Var4.a(obj2) != -1) {
                                                }
                                                this.y = a(zn1Var522, j9, j10, j1422, z14, i6);
                                                k();
                                                a(w73Var4, this.y.a);
                                                this.y = this.y.a(w73Var4);
                                                if (!w73Var4.c()) {
                                                }
                                                a(false);
                                                throw th;
                                            }
                                        }
                                    }
                                    j9 = j13;
                                    rn1Var = rn1Var.l;
                                    j13 = j9;
                                } catch (Throwable th7) {
                                    th = th7;
                                    j9 = j13;
                                }
                            }
                            j9 = j13;
                            try {
                                un1Var = this.t;
                                zn1Var = zn1Var3;
                            } catch (Throwable th8) {
                                th = th8;
                                zn1Var = zn1Var3;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            zn1Var = zn1Var3;
                            j9 = j13;
                        }
                        try {
                            j11 = a(zn1Var, j9, un1Var.h != un1Var.i ? z8 : false, z12);
                            w73Var5 = w73Var11;
                            df2 df2Var42 = this.y;
                            zn1 zn1Var62 = zn1Var;
                            w73Var6 = w73Var5;
                            a(w73Var6, zn1Var62, df2Var42.a, df2Var42.b, fo0Var.f ? j11 : -9223372036854775807L);
                            if (!z13) {
                            }
                            df2 df2Var52 = this.y;
                            Object obj52 = df2Var52.b.a;
                            w73 w73Var102 = df2Var52.a;
                            if (z13) {
                            }
                            this.y = a(zn1Var62, j11, j12, this.y.d, (z13 || !z || w73Var102.c() || w73Var102.a(obj52, this.m).g) ? false : z8, w73Var6.a(obj52) == -1 ? 4 : 3);
                            k();
                            a(w73Var6, this.y.a);
                            this.y = this.y.a(w73Var6);
                            if (!w73Var6.c()) {
                            }
                            a(false);
                        } catch (Throwable th10) {
                            th = th10;
                            j9 = j9;
                            w73Var3 = w73Var11;
                            j8 = j12;
                            df2 df2Var2222 = this.y;
                            w73 w73Var8222 = df2Var2222.a;
                            zn1 zn1Var4222 = df2Var2222.b;
                            zn1 zn1Var5222 = zn1Var;
                            w73Var4 = w73Var3;
                            a(w73Var4, zn1Var5222, w73Var8222, zn1Var4222, !fo0Var.f ? j9 : -9223372036854775807L);
                            if (!z13) {
                            }
                            df2 df2Var3222 = this.y;
                            obj2 = df2Var3222.b.a;
                            w73 w73Var9222 = df2Var3222.a;
                            if (z13) {
                            }
                            long j14222 = this.y.d;
                            if (w73Var4.a(obj2) != -1) {
                            }
                            this.y = a(zn1Var5222, j9, j10, j14222, z14, i6);
                            k();
                            a(w73Var4, this.y.a);
                            this.y = this.y.a(w73Var4);
                            if (!w73Var4.c()) {
                            }
                            a(false);
                            throw th;
                        }
                    }
                }
                zn1Var = zn1Var3;
                j11 = j13;
                w73Var5 = r7;
                df2 df2Var422 = this.y;
                zn1 zn1Var622 = zn1Var;
                w73Var6 = w73Var5;
                a(w73Var6, zn1Var622, df2Var422.a, df2Var422.b, fo0Var.f ? j11 : -9223372036854775807L);
                if (!z13) {
                }
                df2 df2Var522 = this.y;
                Object obj522 = df2Var522.b.a;
                w73 w73Var1022 = df2Var522.a;
                if (z13) {
                }
                this.y = a(zn1Var622, j11, j12, this.y.d, (z13 || !z || w73Var1022.c() || w73Var1022.a(obj522, this.m).g) ? false : z8, w73Var6.a(obj522) == -1 ? 4 : 3);
                k();
                a(w73Var6, this.y.a);
                this.y = this.y.a(w73Var6);
                if (!w73Var6.c()) {
                }
                a(false);
            } catch (Throwable th11) {
                th = th11;
            }
        } catch (Throwable th12) {
            th = th12;
            w73Var3 = w73Var2;
            zn1Var = zn1Var3;
            j8 = j12;
            j9 = j13;
            z8 = true;
        }
    }

    public final void a(ff2 ff2Var, float f, boolean z, boolean z2) {
        ff2 ff2Var2;
        int i;
        if (z) {
            if (z2) {
                this.z.a(1);
            }
            df2 df2Var = this.y;
            df2 df2Var2 = new df2(df2Var.a, df2Var.b, df2Var.c, df2Var.d, df2Var.e, df2Var.f, df2Var.g, df2Var.h, df2Var.i, df2Var.j, df2Var.k, df2Var.l, df2Var.m, ff2Var, df2Var.p, df2Var.q, df2Var.r, df2Var.o);
            ff2Var2 = ff2Var;
            this.y = df2Var2;
        } else {
            ff2Var2 = ff2Var;
        }
        float f2 = ff2Var2.b;
        rn1 rn1Var = this.t.h;
        while (true) {
            i = 0;
            if (rn1Var == null) {
                break;
            }
            pp0[] pp0VarArr = rn1Var.n.c;
            int length = pp0VarArr.length;
            while (i < length) {
                pp0 pp0Var = pp0VarArr[i];
                if (pp0Var != null) {
                    pp0Var.a(f2);
                }
                i++;
            }
            rn1Var = rn1Var.l;
        }
        ro[] roVarArr = this.b;
        int length2 = roVarArr.length;
        while (i < length2) {
            ro roVar = roVarArr[i];
            if (roVar != null) {
                roVar.a(f, ff2Var2.b);
            }
            i++;
        }
    }

    public final df2 a(zn1 zn1Var, long j, long j2, long j3, boolean z, int i) {
        m83 m83Var;
        x83 x83Var;
        List list;
        m83 m83Var2;
        x83 x83Var2;
        tn2 tn2Var;
        m83 m83Var3;
        x83 x83Var3;
        this.O = (!this.O && j == this.y.r && zn1Var.equals(this.y.b)) ? false : true;
        k();
        df2 df2Var = this.y;
        m83 m83Var4 = df2Var.h;
        x83 x83Var4 = df2Var.i;
        List list2 = df2Var.j;
        if (this.u.k) {
            rn1 rn1Var = this.t.h;
            if (rn1Var == null) {
                m83Var2 = m83.e;
            } else {
                m83Var2 = rn1Var.m;
            }
            if (rn1Var == null) {
                x83Var2 = this.f;
            } else {
                x83Var2 = rn1Var.n;
            }
            pp0[] pp0VarArr = x83Var2.c;
            o51 o51Var = new o51();
            boolean z2 = false;
            for (pp0 pp0Var : pp0VarArr) {
                if (pp0Var != null) {
                    ut1 ut1Var = pp0Var.a(0).k;
                    if (ut1Var == null) {
                        o51Var.a(new ut1(new tt1[0]));
                    } else {
                        o51Var.a(ut1Var);
                        z2 = true;
                    }
                }
            }
            if (z2) {
                tn2Var = o51Var.a();
            } else {
                p51 p51Var = s51.c;
                tn2Var = tn2.f;
            }
            tn2 tn2Var2 = tn2Var;
            if (rn1Var != null) {
                tn1 tn1Var = rn1Var.f;
                long j4 = tn1Var.c;
                if (j4 != j2) {
                    if (j2 == j4) {
                        m83Var3 = m83Var2;
                        x83Var3 = x83Var2;
                    } else {
                        m83Var3 = m83Var2;
                        x83Var3 = x83Var2;
                        tn1Var = new tn1(tn1Var.a, tn1Var.b, j2, tn1Var.d, tn1Var.e, tn1Var.f, tn1Var.g, tn1Var.h, tn1Var.i);
                    }
                    rn1Var.f = tn1Var;
                    list = tn2Var2;
                    m83Var = m83Var3;
                    x83Var = x83Var3;
                }
            }
            m83Var3 = m83Var2;
            x83Var3 = x83Var2;
            list = tn2Var2;
            m83Var = m83Var3;
            x83Var = x83Var3;
        } else {
            if (!zn1Var.equals(df2Var.b)) {
                m83Var4 = m83.e;
                x83Var4 = this.f;
                list2 = tn2.f;
            }
            m83Var = m83Var4;
            x83Var = x83Var4;
            list = list2;
        }
        if (z) {
            do0 do0Var = this.z;
            if (!do0Var.d || do0Var.e == 5) {
                do0Var.a = true;
                do0Var.d = true;
                do0Var.e = i;
            } else if (i != 5) {
                throw new IllegalArgumentException();
            }
        }
        df2 df2Var2 = this.y;
        return df2Var2.a(zn1Var, j, j2, j3, a(df2Var2.p), m83Var, x83Var, list);
    }

    @Override // yads.uy2
    public final void a(vy2 vy2Var) {
        this.i.a(9, (qn1) vy2Var).b();
    }

    @Override // yads.pn1
    public final void a(qn1 qn1Var) {
        this.i.a(8, qn1Var).b();
    }

    public final void a(int i, int i2, wz2 wz2Var) {
        this.z.a(1);
        jo1 jo1Var = this.u;
        jo1Var.getClass();
        if (i >= 0 && i <= i2 && i2 <= jo1Var.b.size()) {
            jo1Var.j = wz2Var;
            jo1Var.a(i, i2);
            a(jo1Var.a(), false);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        boolean z5;
        List list;
        this.i.a.removeMessages(2);
        this.P = null;
        this.D = false;
        de0 de0Var = this.p;
        de0Var.g = false;
        n43 n43Var = de0Var.b;
        if (n43Var.c) {
            n43Var.a(n43Var.a());
            n43Var.c = false;
        }
        this.M = 1000000000000L;
        for (ro roVar : this.b) {
            try {
                a(roVar);
            } catch (RuntimeException | qn0 e) {
                ji1.b("ExoPlayerImplInternal", ji1.a("Disable failed.", e));
            }
        }
        if (z) {
            for (ro roVar2 : this.b) {
                if (this.c.remove(roVar2)) {
                    try {
                        if (roVar2.g == 0) {
                            ox0 ox0Var = roVar2.c;
                            ox0Var.a = null;
                            ox0Var.b = null;
                            roVar2.i();
                        } else {
                            throw new IllegalStateException();
                        }
                    } catch (RuntimeException e2) {
                        ji1.b("ExoPlayerImplInternal", ji1.a("Reset failed.", e2));
                    }
                }
            }
        }
        this.K = 0;
        df2 df2Var = this.y;
        zn1 zn1Var = df2Var.b;
        long j2 = df2Var.r;
        if (!this.y.b.a()) {
            df2 df2Var2 = this.y;
            t73 t73Var = this.m;
            zn1 zn1Var2 = df2Var2.b;
            w73 w73Var = df2Var2.a;
            if (!w73Var.c() && !w73Var.a(zn1Var2.a, t73Var).g) {
                j = this.y.r;
                if (z2) {
                    this.L = null;
                    Pair a = a(this.y.a);
                    zn1Var = (zn1) a.first;
                    j2 = ((Long) a.second).longValue();
                    boolean equals = zn1Var.equals(this.y.b);
                    j = C.TIME_UNSET;
                    if (!equals) {
                        z5 = true;
                        long j3 = j2;
                        zn1 zn1Var3 = zn1Var;
                        this.t.b();
                        this.E = false;
                        df2 df2Var3 = this.y;
                        w73 w73Var2 = df2Var3.a;
                        int i = df2Var3.e;
                        qn0 qn0Var = z4 ? null : df2Var3.f;
                        m83 m83Var = z5 ? m83.e : df2Var3.h;
                        x83 x83Var = z5 ? this.f : df2Var3.i;
                        if (z5) {
                            p51 p51Var = s51.c;
                            list = tn2.f;
                        } else {
                            list = df2Var3.j;
                        }
                        this.y = new df2(w73Var2, zn1Var3, j, j3, i, qn0Var, false, m83Var, x83Var, list, zn1Var3, df2Var3.l, df2Var3.m, df2Var3.n, j3, 0L, j3, false);
                        if (z3) {
                            jo1 jo1Var = this.u;
                            for (go1 go1Var : jo1Var.h.values()) {
                                try {
                                    go1Var.a.c(go1Var.b);
                                } catch (RuntimeException e3) {
                                    ji1.b("MediaSourceList", ji1.a("Failed to release child source.", e3));
                                }
                                go1Var.a.a((do1) go1Var.c);
                                go1Var.a.a((qk0) go1Var.c);
                            }
                            jo1Var.h.clear();
                            jo1Var.i.clear();
                            jo1Var.k = false;
                            return;
                        }
                        return;
                    }
                }
                z5 = false;
                long j32 = j2;
                zn1 zn1Var32 = zn1Var;
                this.t.b();
                this.E = false;
                df2 df2Var32 = this.y;
                w73 w73Var22 = df2Var32.a;
                int i2 = df2Var32.e;
                if (z4) {
                }
                m83 m83Var2 = z5 ? m83.e : df2Var32.h;
                x83 x83Var2 = z5 ? this.f : df2Var32.i;
                if (z5) {
                }
                this.y = new df2(w73Var22, zn1Var32, j, j32, i2, qn0Var, false, m83Var2, x83Var2, list, zn1Var32, df2Var32.l, df2Var32.m, df2Var32.n, j32, 0L, j32, false);
                if (z3) {
                }
            }
        }
        j = this.y.c;
        if (z2) {
        }
        z5 = false;
        long j322 = j2;
        zn1 zn1Var322 = zn1Var;
        this.t.b();
        this.E = false;
        df2 df2Var322 = this.y;
        w73 w73Var222 = df2Var322.a;
        int i22 = df2Var322.e;
        if (z4) {
        }
        m83 m83Var22 = z5 ? m83.e : df2Var322.h;
        x83 x83Var22 = z5 ? this.f : df2Var322.i;
        if (z5) {
        }
        this.y = new df2(w73Var222, zn1Var322, j, j322, i22, qn0Var, false, m83Var22, x83Var22, list, zn1Var322, df2Var322.l, df2Var322.m, df2Var322.n, j322, 0L, j322, false);
        if (z3) {
        }
    }

    public final void a(w73 w73Var, w73 w73Var2) {
        if (w73Var.c() && w73Var2.c()) {
            return;
        }
        int size = this.q.size() - 1;
        if (size < 0) {
            Collections.sort(this.q);
        } else {
            a2.a(this.q.get(size));
            throw null;
        }
    }

    public static Pair a(w73 w73Var, go0 go0Var, boolean z, int i, boolean z2, v73 v73Var, t73 t73Var) {
        Pair a;
        w73 w73Var2;
        Object a2;
        w73 w73Var3 = go0Var.a;
        if (w73Var.c()) {
            return null;
        }
        if (w73Var3.c()) {
            w73Var3 = w73Var;
        }
        try {
            a = w73Var3.a(v73Var, t73Var, go0Var.b, go0Var.c);
            w73Var2 = w73Var3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (w73Var.equals(w73Var2)) {
            return a;
        }
        if (w73Var.a(a.first) != -1) {
            return (w73Var2.a(a.first, t73Var).g && w73Var2.a(t73Var.d, v73Var, 0L).p == w73Var2.a(a.first)) ? w73Var.a(v73Var, t73Var, w73Var.a(a.first, t73Var).d, go0Var.c) : a;
        }
        if (z && (a2 = a(v73Var, t73Var, i, z2, a.first, w73Var2, w73Var)) != null) {
            return w73Var.a(v73Var, t73Var, w73Var.a(a2, t73Var).d, C.TIME_UNSET);
        }
        return null;
    }

    public static Object a(v73 v73Var, t73 t73Var, int i, boolean z, Object obj, w73 w73Var, w73 w73Var2) {
        int a = w73Var.a(obj);
        int a2 = w73Var.a();
        int i2 = 0;
        int i3 = a;
        int i4 = -1;
        while (i2 < a2 && i4 == -1) {
            v73 v73Var2 = v73Var;
            t73 t73Var2 = t73Var;
            int i5 = i;
            boolean z2 = z;
            w73 w73Var3 = w73Var;
            i3 = w73Var3.a(i3, t73Var2, v73Var2, i5, z2);
            if (i3 == -1) {
                break;
            }
            i4 = w73Var2.a(w73Var3.a(i3));
            i2++;
            w73Var = w73Var3;
            t73Var = t73Var2;
            v73Var = v73Var2;
            i = i5;
            z = z2;
        }
        if (i4 == -1) {
            return null;
        }
        return w73Var2.a(i4);
    }

    public final void a(go0 go0Var) {
        long longValue;
        zn1 a;
        long j;
        boolean z;
        long j2;
        boolean z2;
        zn1 zn1Var;
        long j3;
        long a2;
        long j4;
        df2 df2Var;
        int i;
        zn1 zn1Var2;
        boolean z3;
        long j5;
        this.z.a(1);
        Pair a3 = a(this.y.a, go0Var, true, this.F, this.G, this.l, this.m);
        if (a3 == null) {
            Pair a4 = a(this.y.a);
            a = (zn1) a4.first;
            longValue = ((Long) a4.second).longValue();
            z = !this.y.a.c();
            j2 = -9223372036854775807L;
            j = 0;
        } else {
            Object obj = a3.first;
            longValue = ((Long) a3.second).longValue();
            long j6 = go0Var.c == C.TIME_UNSET ? -9223372036854775807L : longValue;
            a = this.t.a(this.y.a, obj, longValue);
            if (a.a()) {
                this.y.a.a(a.a, this.m);
                longValue = this.m.a(a.b) == a.c ? this.m.h.d : 0L;
                j = 0;
            } else {
                j = 0;
                if (go0Var.c != C.TIME_UNSET) {
                    z = false;
                    j2 = j6;
                }
            }
            z = true;
            j2 = j6;
        }
        try {
            if (this.y.a.c()) {
                this.L = go0Var;
            } else if (a3 == null) {
                if (this.y.e != 1) {
                    b(4);
                }
                a(false, true, false, true);
            } else {
                if (a.equals(this.y.b)) {
                    try {
                        rn1 rn1Var = this.t.h;
                        a2 = (rn1Var == null || !rn1Var.d || longValue == j) ? longValue : rn1Var.a.a(longValue, this.x);
                        if (mc3.b(a2) != mc3.b(this.y.r) || ((i = (df2Var = this.y).e) != 2 && i != 3)) {
                            z2 = z;
                            j4 = j2;
                            zn1Var = a;
                        }
                        long j7 = df2Var.r;
                        this.y = a(a, j7, j2, j7, z, 2);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        z2 = z;
                        zn1Var = a;
                        j3 = longValue;
                        this.y = a(zn1Var, j3, j2, j3, z2, 2);
                        throw th;
                    }
                }
                z2 = z;
                j4 = j2;
                zn1Var = a;
                a2 = longValue;
                try {
                    boolean z4 = this.y.e == 4;
                    un1 un1Var = this.t;
                    long a5 = a(zn1Var, a2, un1Var.h != un1Var.i, z4);
                    boolean z5 = z2 | (longValue != a5);
                    try {
                        df2 df2Var2 = this.y;
                        zn1 zn1Var3 = zn1Var;
                        try {
                            w73 w73Var = df2Var2.a;
                            long j8 = j4;
                            try {
                                a(w73Var, zn1Var3, w73Var, df2Var2.b, j8);
                                zn1Var2 = zn1Var3;
                                j2 = j8;
                                z3 = z5;
                                j5 = a5;
                                this.y = a(zn1Var2, j5, j2, j5, z3, 2);
                            } catch (Throwable th2) {
                                th = th2;
                                zn1Var = zn1Var3;
                                j2 = j8;
                                z2 = z5;
                                j3 = a5;
                                this.y = a(zn1Var, j3, j2, j3, z2, 2);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            zn1Var = zn1Var3;
                            j2 = j4;
                            z2 = z5;
                            j3 = a5;
                            this.y = a(zn1Var, j3, j2, j3, z2, 2);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    j2 = j4;
                    j3 = longValue;
                    this.y = a(zn1Var, j3, j2, j3, z2, 2);
                    throw th;
                }
            }
            z3 = z;
            zn1Var2 = a;
            j5 = longValue;
            this.y = a(zn1Var2, j5, j2, j5, z3, 2);
        } catch (Throwable th6) {
            th = th6;
            z2 = z;
        }
    }

    public final long a(zn1 zn1Var, long j, boolean z, boolean z2) {
        un1 un1Var;
        long j2;
        long j3;
        rn1 rn1Var;
        m();
        this.D = false;
        if (z2 || this.y.e == 3) {
            b(2);
        }
        rn1 rn1Var2 = this.t.h;
        rn1 rn1Var3 = rn1Var2;
        while (rn1Var3 != null && !zn1Var.equals(rn1Var3.f.a)) {
            rn1Var3 = rn1Var3.l;
        }
        if (z || rn1Var2 != rn1Var3 || (rn1Var3 != null && j + rn1Var3.o < 0)) {
            for (ro roVar : this.b) {
                a(roVar);
            }
            if (rn1Var3 != null) {
                while (true) {
                    un1Var = this.t;
                    if (un1Var.h == rn1Var3) {
                        break;
                    }
                    un1Var.a();
                }
                un1Var.a(rn1Var3);
                rn1Var3.o = 1000000000000L;
                a(new boolean[this.b.length]);
            }
        }
        if (rn1Var3 != null) {
            this.t.a(rn1Var3);
            if (!rn1Var3.d) {
                tn1 tn1Var = rn1Var3.f;
                if (j == tn1Var.b) {
                    rn1Var = rn1Var3;
                    j3 = j;
                } else {
                    rn1Var = rn1Var3;
                    j3 = j;
                    tn1Var = new tn1(tn1Var.a, j3, tn1Var.c, tn1Var.d, tn1Var.e, tn1Var.f, tn1Var.g, tn1Var.h, tn1Var.i);
                }
                rn1Var.f = tn1Var;
            } else {
                rn1 rn1Var4 = rn1Var3;
                j3 = j;
                if (rn1Var4.e) {
                    j2 = rn1Var4.a.seekToUs(j3);
                    rn1Var4.a.discardBuffer(j2 - this.n, this.o);
                    b(j2);
                    d();
                }
            }
            j2 = j3;
            b(j2);
            d();
        } else {
            this.t.b();
            b(j);
            j2 = j;
        }
        a(false);
        this.i.a.sendEmptyMessage(2);
        return j2;
    }

    public static void a(ro roVar, long j) {
        roVar.l = true;
        if (roVar instanceof e73) {
            e73 e73Var = (e73) roVar;
            if (e73Var.l) {
                e73Var.B = j;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final void a(boolean z, AtomicBoolean atomicBoolean) {
        if (this.H != z) {
            this.H = z;
            if (!z) {
                for (ro roVar : this.b) {
                    if (!b(roVar) && this.c.remove(roVar)) {
                        if (roVar.g == 0) {
                            ox0 ox0Var = roVar.c;
                            ox0Var.a = null;
                            ox0Var.b = null;
                            roVar.i();
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void a(co0 co0Var) {
        this.z.a(1);
        if (co0Var.c != -1) {
            this.L = new go0(new yg2(co0Var.a, co0Var.b), co0Var.c, co0Var.d);
        }
        jo1 jo1Var = this.u;
        List list = co0Var.a;
        wz2 wz2Var = co0Var.b;
        jo1Var.a(0, jo1Var.b.size());
        a(jo1Var.a(jo1Var.b.size(), list, wz2Var), false);
    }

    public final void a(boolean z, int i, boolean z2, int i2) {
        this.z.a(z2 ? 1 : 0);
        do0 do0Var = this.z;
        do0Var.a = true;
        do0Var.f = true;
        do0Var.g = i2;
        df2 df2Var = this.y;
        this.y = new df2(df2Var.a, df2Var.b, df2Var.c, df2Var.d, df2Var.e, df2Var.f, df2Var.g, df2Var.h, df2Var.i, df2Var.j, df2Var.k, z, i, df2Var.n, df2Var.p, df2Var.q, df2Var.r, df2Var.o);
        this.D = false;
        for (rn1 rn1Var = this.t.h; rn1Var != null; rn1Var = rn1Var.l) {
            for (pp0 pp0Var : rn1Var.n.c) {
                if (pp0Var != null) {
                    pp0Var.a(z);
                }
            }
        }
        if (!l()) {
            m();
            o();
            return;
        }
        int i3 = this.y.e;
        if (i3 != 3) {
            if (i3 == 2) {
                this.i.a.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.D = false;
        de0 de0Var = this.p;
        de0Var.g = true;
        n43 n43Var = de0Var.b;
        if (!n43Var.c) {
            ((j63) n43Var.b).getClass();
            n43Var.e = SystemClock.elapsedRealtime();
            n43Var.c = true;
        }
        for (ro roVar : this.b) {
            if (b(roVar)) {
                if (roVar.g == 1) {
                    roVar.g = 2;
                    roVar.j();
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        this.i.a.sendEmptyMessage(2);
    }

    public final void a(ff2 ff2Var) {
        this.p.a(ff2Var);
        ff2 playbackParameters = this.p.getPlaybackParameters();
        a(playbackParameters, playbackParameters.b, true, true);
    }

    public final void a(int i) {
        this.F = i;
        un1 un1Var = this.t;
        w73 w73Var = this.y.a;
        un1Var.f = i;
        if (!un1Var.a(w73Var)) {
            b(true);
        }
        a(false);
    }

    public final void a(wz2 wz2Var) {
        this.z.a(1);
        jo1 jo1Var = this.u;
        int size = jo1Var.b.size();
        if (wz2Var.b.length != size) {
            wz2Var = new wz2(new int[0], new Random(wz2Var.a.nextLong())).a(size);
        }
        jo1Var.j = wz2Var;
        a(jo1Var.a(), false);
    }

    public final boolean a(w73 w73Var, zn1 zn1Var) {
        if (!zn1Var.a() && !w73Var.c()) {
            w73Var.a(w73Var.a(zn1Var.a, this.m).d, this.l, 0L);
            if (this.l.a()) {
                v73 v73Var = this.l;
                if (v73Var.j && v73Var.g != C.TIME_UNSET) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(boolean z, boolean z2) {
        a(z || !this.H, false, true, false);
        this.z.a(z2 ? 1 : 0);
        ((zd0) this.g).a(true);
        b(1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(x83 x83Var) {
        tg1 tg1Var = this.g;
        ro[] roVarArr = this.b;
        pp0[] pp0VarArr = x83Var.c;
        zd0 zd0Var = (zd0) tg1Var;
        int i = zd0Var.f;
        if (i == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int length = roVarArr.length;
                int i4 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                if (i2 < length) {
                    if (pp0VarArr[i2] != null) {
                        switch (roVarArr[i2].b) {
                            case -2:
                                i4 = 0;
                                i3 += i4;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i4 = 144310272;
                                i3 += i4;
                                break;
                            case 1:
                                i3 += i4;
                                break;
                            case 2:
                                i4 = 131072000;
                                i3 += i4;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i4 = 131072;
                                i3 += i4;
                                break;
                        }
                    }
                    i2++;
                } else {
                    i = Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, i3);
                }
            }
        }
        zd0Var.j = i;
        zd0Var.a.a(i);
    }

    public final void a(w73 w73Var, zn1 zn1Var, w73 w73Var2, zn1 zn1Var2, long j) {
        if (!a(w73Var, zn1Var)) {
            ff2 ff2Var = zn1Var.a() ? ff2.e : this.y.n;
            if (this.p.getPlaybackParameters().equals(ff2Var)) {
                return;
            }
            this.p.a(ff2Var);
            return;
        }
        w73Var.a(w73Var.a(zn1Var.a, this.m).d, this.l, 0L);
        sg1 sg1Var = this.v;
        zm1 zm1Var = this.l.l;
        int i = mc3.a;
        yd0 yd0Var = (yd0) sg1Var;
        yd0Var.getClass();
        yd0Var.d = mc3.a(zm1Var.b);
        yd0Var.g = mc3.a(zm1Var.c);
        yd0Var.h = mc3.a(zm1Var.d);
        float f = zm1Var.e;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        yd0Var.k = f;
        float f2 = zm1Var.f;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        yd0Var.j = f2;
        if (f == 1.0f && f2 == 1.0f) {
            yd0Var.d = C.TIME_UNSET;
        }
        yd0Var.a();
        if (j != C.TIME_UNSET) {
            yd0 yd0Var2 = (yd0) this.v;
            yd0Var2.e = a(w73Var, zn1Var.a, j);
            yd0Var2.a();
        } else {
            if (mc3.a(!w73Var2.c() ? w73Var2.a(w73Var2.a(zn1Var2.a, this.m).d, this.l, 0L).b : null, this.l.b)) {
                return;
            }
            yd0 yd0Var3 = (yd0) this.v;
            yd0Var3.e = C.TIME_UNSET;
            yd0Var3.a();
        }
    }

    public final synchronized void a(c63 c63Var, long j) {
        ((j63) this.r).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) c63Var.get()).booleanValue() && j > 0) {
            try {
                this.r.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            ((j63) this.r).getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
