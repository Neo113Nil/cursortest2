package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import org.webrtc.MediaStreamTrack;
import yads.bs1;
import yads.cs1;
import yads.e23;
import yads.gn0;
import yads.ho0;
import yads.l03;
import yads.nj;
import yads.rn0;
import yads.wk2;
import yads.zm0;

/* loaded from: classes7.dex */
public final class ek71 extends bn61 {
    public final long A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public final lb71 F;
    public zj61 G;
    public o881 H;
    public oi61 I;
    public AudioTrack J;
    public Surface K;
    public Surface L;
    public SurfaceHolder M;
    public l03 N;
    public boolean O;
    public TextureView P;
    public final int Q;
    public int R;
    public int S;
    public final int T;
    public final ws71 U;
    public float V;
    public boolean W;
    public final boolean X;
    public boolean Y;
    public dd71 Z;
    public oi61 a0;
    public final lu81 b;
    public hp71 b0;
    public final o881 c;
    public int c0;
    public final sh71 d = new sh71();
    public long d0;
    public final Context e;
    public final ek71 f;
    public final gy61[] g;
    public final kr81 h;
    public final rl71 i;
    public final rn0 j;
    public final xrr k;
    public final CopyOnWriteArraySet l;
    public final ie81 m;
    public final ArrayList n;
    public final boolean o;
    public final ep71 p;
    public final Looper q;
    public final cj71 r;
    public final xb71 s;
    public final gn0 t;
    public final xd71 u;
    public final q281 v;
    public final bm81 w;
    public final t571 x;
    public final r100 y;
    public final hay z;

    static {
        xc81.a("goog.exo.exoplayer");
    }

    public ek71(wm61 wm61Var) {
        int i;
        boolean equals;
        try {
            nba1.d("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + rf71.e + "]");
            this.e = wm61Var.a.getApplicationContext();
            this.p = new ep71(wm61Var.b);
            this.U = wm61Var.i;
            this.Q = wm61Var.j;
            this.W = false;
            this.A = wm61Var.o;
            gn0 gn0Var = new gn0(this);
            this.t = gn0Var;
            this.u = new xd71();
            Handler handler = new Handler(wm61Var.h);
            gy61[] a = ((ks71) wm61Var.c.get()).a(handler, gn0Var, gn0Var, gn0Var, gn0Var);
            this.g = a;
            if (a.length <= 0) {
                throw new IllegalStateException();
            }
            this.h = (kr81) wm61Var.e.get();
            wm61Var.d.get();
            this.r = wm61.a(wm61Var.g.b);
            this.o = wm61Var.k;
            this.F = wm61Var.l;
            Looper looper = wm61Var.h;
            this.q = looper;
            xb71 xb71Var = wm61Var.b;
            this.s = xb71Var;
            this.f = this;
            this.k = new xrr(new CopyOnWriteArraySet(), looper, xb71Var, new yx61(this));
            this.l = new CopyOnWriteArraySet();
            this.n = new ArrayList();
            this.G = new zj61(new Random());
            this.b = new lu81(new v581[a.length], new gk71[a.length], ph81.b, null);
            this.m = new ie81();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i2 = 0; i2 < 21; i2++) {
                sparseBooleanArray.append(iArr[i2], true);
            }
            this.h.getClass();
            sparseBooleanArray.append(29, true);
            hh71 hh71Var = new hh71(sparseBooleanArray);
            this.c = new o881(hh71Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i3 = 0; i3 < hh71Var.a.size(); i3++) {
                sparseBooleanArray2.append(hh71Var.a(i3), true);
            }
            sparseBooleanArray2.append(4, true);
            sparseBooleanArray2.append(10, true);
            this.H = new o881(new hh71(sparseBooleanArray2));
            xb71 xb71Var2 = this.s;
            Looper looper2 = this.q;
            xb71Var2.getClass();
            this.i = new rl71(new Handler(looper2, null));
            ck71 ck71Var = new ck71(this);
            lu81 lu81Var = this.b;
            cb81 cb81Var = yn81.b;
            v281 v281Var = hp71.s;
            this.b0 = new hp71(cb81Var, v281Var, -9223372036854775807L, 0L, 1, null, false, wx71.w, lu81Var, wk2.x, v281Var, false, 0, kv71.w, 0L, 0L, 0L, false);
            this.p.z(this.f, this.q);
            int i4 = rf71.a;
            this.j = new rn0(this.g, this.h, this.b, (hi81) wm61Var.f.get(), this.r, this.p, this.F, wm61Var.m, wm61Var.n, this.q, this.s, ck71Var, i4 < 31 ? new wl61() : j771.a(this.e, this, wm61Var.p));
            this.V = 1.0f;
            oi61 oi61Var = oi61.b0;
            this.I = oi61Var;
            this.a0 = oi61Var;
            int i5 = -1;
            this.c0 = -1;
            if (i4 < 21) {
                AudioTrack audioTrack = this.J;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.J.release();
                    this.J = null;
                }
                if (this.J == null) {
                    this.J = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.T = this.J.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.e.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager != null) {
                    i5 = audioManager.generateAudioSessionId();
                }
                this.T = i5;
            }
            int i6 = bf71.a;
            this.X = true;
            ep71 ep71Var = this.p;
            ep71Var.getClass();
            xrr xrrVar = this.k;
            if (!xrrVar.b) {
                ((CopyOnWriteArraySet) xrrVar.y).add(new x181(ep71Var));
            }
            cj71 cj71Var = this.r;
            Handler handler2 = new Handler(this.q);
            ep71 ep71Var2 = this.p;
            cj71Var.getClass();
            ep71Var2.getClass();
            pi61 pi61Var = cj71Var.b;
            pi61Var.getClass();
            Iterator it = pi61Var.a.iterator();
            while (it.hasNext()) {
                b291 b291Var = (b291) it.next();
                if (b291Var.b == ep71Var2) {
                    b291Var.c = true;
                    pi61Var.a.remove(b291Var);
                }
            }
            pi61Var.a.add(new b291(handler2, ep71Var2));
            this.l.add(this.t);
            Context context = wm61Var.a;
            gn0 gn0Var2 = this.t;
            q281 q281Var = new q281();
            context.getApplicationContext();
            new nj(q281Var, handler, gn0Var2);
            this.v = q281Var;
            this.w = new bm81(wm61Var.a, handler, this.t);
            t571 t571Var = new t571(wm61Var.a, handler, this.t);
            this.x = t571Var;
            int i7 = this.U.c;
            if (i7 != 13) {
                switch (i7) {
                    case 2:
                        i = 0;
                        break;
                    case 3:
                        i = 8;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i = 5;
                        break;
                    case 6:
                        i = 2;
                        break;
                    default:
                        i = 3;
                        break;
                }
            } else {
                i = 1;
            }
            if (t571Var.g != i) {
                t571Var.g = i;
                t571Var.b();
                t571Var.c.a();
            }
            Context context2 = wm61Var.a;
            r100 r100Var = new r100();
            this.y = r100Var;
            Context context3 = wm61Var.a;
            hay hayVar = new hay(21);
            this.z = hayVar;
            this.Z = new dd71(0, rf71.a >= 28 ? t571Var.d.getStreamMinVolume(t571Var.g) : 0, t571Var.d.getStreamMaxVolume(t571Var.g));
            kr81 kr81Var = this.h;
            ws71 ws71Var = this.U;
            ba71 ba71Var = (ba71) kr81Var;
            synchronized (ba71Var.c) {
                equals = ba71Var.h.equals(ws71Var);
                ba71Var.h = ws71Var;
            }
            if (!equals) {
                ba71Var.h();
            }
            d(1, 10, Integer.valueOf(this.T));
            d(2, 10, Integer.valueOf(this.T));
            d(1, 3, this.U);
            d(2, 4, Integer.valueOf(this.Q));
            d(2, 5, 0);
            d(1, 9, Boolean.valueOf(this.W));
            d(2, 7, this.u);
            d(6, 8, this.u);
            this.d.c();
        } catch (Throwable th) {
            this.d.c();
            throw th;
        }
    }

    public static long k(hp71 hp71Var) {
        uk81 uk81Var = new uk81();
        ie81 ie81Var = new ie81();
        hp71Var.a.a(hp71Var.b.a, ie81Var);
        long j = hp71Var.c;
        return j == -9223372036854775807L ? hp71Var.a.a(ie81Var.c, uk81Var, 0L).E : ie81Var.x + j;
    }

    public final long a(hp71 hp71Var) {
        if (hp71Var.a.c()) {
            return rf71.g(this.d0);
        }
        if (hp71Var.b.a()) {
            return hp71Var.r;
        }
        yn81 yn81Var = hp71Var.a;
        v281 v281Var = hp71Var.b;
        long j = hp71Var.r;
        yn81Var.a(v281Var.a, this.m);
        return j + this.m.x;
    }

    public final s371 b(i071 i071Var) {
        r();
        yn81 yn81Var = this.b0.a;
        xb71 xb71Var = this.s;
        rn0 rn0Var = this.j;
        return new s371(rn0Var, i071Var, xb71Var, rn0Var.k);
    }

    public final void c(int i, int i2) {
        if (i == this.R && i2 == this.S) {
            return;
        }
        this.R = i;
        this.S = i2;
        uno unoVar = new uno(i, i2, 1);
        xrr xrrVar = this.k;
        xrrVar.b(24, unoVar);
        xrrVar.a();
    }

    public final void d(int i, int i2, Object obj) {
        for (gy61 gy61Var : this.g) {
            if (gy61Var.b == i) {
                s371 b = b(gy61Var);
                boolean z = b.g;
                if (z) {
                    ny61.k();
                    return;
                }
                b.d = i2;
                if (z) {
                    ny61.k();
                    return;
                } else {
                    b.e = obj;
                    b.a();
                }
            }
        }
    }

    public final void e(int i, int i2, boolean z) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        hp71 hp71Var = this.b0;
        if (hp71Var.l == z2 && hp71Var.m == i3) {
            return;
        }
        this.B++;
        int i4 = i3;
        boolean z3 = z2;
        hp71 hp71Var2 = new hp71(hp71Var.a, hp71Var.b, hp71Var.c, hp71Var.d, hp71Var.e, hp71Var.f, hp71Var.g, hp71Var.h, hp71Var.i, hp71Var.j, hp71Var.k, z3, i4, hp71Var.n, hp71Var.p, hp71Var.q, hp71Var.r, hp71Var.o);
        rl71 rl71Var = this.j.i;
        rl71Var.getClass();
        fi71 a = rl71.a();
        a.a = rl71Var.a.obtainMessage(1, z3 ? 1 : 0, i4);
        a.b();
        h(hp71Var2, 0, i2, false, 5, -9223372036854775807L);
    }

    public final void f(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (gy61 gy61Var : this.g) {
            if (gy61Var.b == 2) {
                s371 b = b(gy61Var);
                boolean z2 = b.g;
                if (z2) {
                    ny61.k();
                    return;
                }
                b.d = 1;
                if (z2) {
                    ny61.k();
                    return;
                } else {
                    b.e = surface;
                    b.a();
                    arrayList.add(b);
                }
            }
        }
        Surface surface2 = this.K;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((s371) it.next()).b(this.A);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Surface surface3 = this.K;
            Surface surface4 = this.L;
            if (surface3 == surface4) {
                surface4.release();
                this.L = null;
            }
        }
        this.K = surface;
        if (z) {
            i(new zm0(2, new ho0("Detaching surface timed out."), 1003));
        }
    }

    public final void g(TextureView textureView) {
        v();
        if (textureView == null) {
            v();
            t();
            f(null);
            c(0, 0);
            return;
        }
        t();
        this.P = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            nba1.e();
        }
        textureView.setSurfaceTextureListener(this.t);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            f(null);
            c(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            f(surface);
            this.L = surface;
            c(textureView.getWidth(), textureView.getHeight());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0489 A[LOOP:0: B:118:0x0481->B:120:0x0489, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0540 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0466  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(final hp71 hp71Var, final int i, final int i2, boolean z, int i3, long j) {
        int i4;
        Pair pair;
        int i5;
        op81 op81Var;
        boolean z2;
        boolean z3;
        boolean z4;
        final int i6;
        final int i7;
        int a;
        boolean z5;
        int a2;
        boolean z6;
        boolean z7;
        yn81 yn81Var;
        boolean z8;
        boolean z9;
        hh71 hh71Var;
        int i8;
        o881 o881Var;
        Object obj;
        int i9;
        op81 op81Var2;
        Object obj2;
        int i10;
        long j2;
        long j3;
        long j4;
        long k;
        Object obj3;
        op81 op81Var3;
        Object obj4;
        int i11;
        hp71 hp71Var2 = this.b0;
        this.b0 = hp71Var;
        boolean equals = hp71Var2.a.equals(hp71Var.a);
        yn81 yn81Var2 = hp71Var2.a;
        yn81 yn81Var3 = hp71Var.a;
        final int i12 = 0;
        if (yn81Var3.c() && yn81Var2.c()) {
            pair = new Pair(Boolean.FALSE, -1);
            i4 = 3;
        } else {
            i4 = 3;
            if (yn81Var3.c() != yn81Var2.c()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (yn81Var2.a(yn81Var2.a(hp71Var2.b.a, this.m).c, this.a, 0L).a.equals(yn81Var3.a(yn81Var3.a(hp71Var.b.a, this.m).c, this.a, 0L).a)) {
                pair = (z && i3 == 0 && hp71Var2.b.d < hp71Var.b.d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z && i3 == 0) {
                    i5 = 1;
                } else if (z && i3 == 1) {
                    i5 = 2;
                } else {
                    if (equals) {
                        ny61.k();
                        return;
                    }
                    i5 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        oi61 oi61Var = this.I;
        if (booleanValue) {
            op81Var = !hp71Var.a.c() ? hp71Var.a.a(hp71Var.a.a(hp71Var.b.a, this.m).c, this.a, 0L).b : null;
            this.a0 = oi61.b0;
        } else {
            op81Var = null;
        }
        if (booleanValue || !hp71Var2.j.equals(hp71Var.j)) {
            oi61 oi61Var2 = this.a0;
            oi61Var2.getClass();
            a291 a291Var = new a291(oi61Var2);
            List list = hp71Var.j;
            for (int i13 = 0; i13 < list.size(); i13++) {
                cs1 cs1Var = (cs1) list.get(i13);
                int i14 = 0;
                while (true) {
                    bs1[] bs1VarArr = cs1Var.b;
                    if (i14 < bs1VarArr.length) {
                        bs1VarArr[i14].a(a291Var);
                        i14++;
                    }
                }
            }
            this.a0 = new oi61(a291Var);
            oi61Var = l();
        }
        boolean equals2 = oi61Var.equals(this.I);
        this.I = oi61Var;
        boolean z10 = hp71Var2.l != hp71Var.l;
        boolean z11 = hp71Var2.e != hp71Var.e;
        if (z11 || z10) {
            u();
        }
        boolean z12 = hp71Var2.g != hp71Var.g;
        if (!hp71Var2.a.equals(hp71Var.a)) {
            this.k.b(0, new ov71() { // from class: dk71
                @Override // defpackage.ov71
                public final void invoke(Object obj5) {
                    ub81 ub81Var = (ub81) obj5;
                    switch (i12) {
                        case 0:
                            yn81 yn81Var4 = hp71Var.a;
                            ub81Var.b(i);
                            break;
                        default:
                            ub81Var.onPlayWhenReadyChanged(hp71Var.l, i);
                            break;
                    }
                }
            });
        }
        if (z) {
            ie81 ie81Var = new ie81();
            if (hp71Var2.a.c()) {
                z2 = equals2;
                z3 = z11;
                z4 = z12;
                obj = null;
                i9 = -1;
                op81Var2 = null;
                obj2 = null;
                i10 = -1;
            } else {
                Object obj5 = hp71Var2.b.a;
                hp71Var2.a.a(obj5, ie81Var);
                int i15 = ie81Var.c;
                int a3 = hp71Var2.a.a(obj5);
                z2 = equals2;
                z3 = z11;
                z4 = z12;
                obj = hp71Var2.a.a(i15, this.a, 0L).a;
                op81Var2 = this.a.b;
                i10 = a3;
                i9 = i15;
                obj2 = obj5;
            }
            v281 v281Var = hp71Var2.b;
            if (i3 == 0) {
                boolean a4 = v281Var.a();
                v281 v281Var2 = hp71Var2.b;
                if (a4) {
                    j4 = ie81Var.c(v281Var2.b, v281Var2.c);
                    k = k(hp71Var2);
                } else if (v281Var2.e != -1) {
                    j4 = k(this.b0);
                    k = j4;
                } else {
                    j2 = ie81Var.x;
                    j3 = ie81Var.w;
                    j4 = j2 + j3;
                    k = j4;
                }
            } else if (v281Var.a()) {
                j4 = hp71Var2.r;
                k = k(hp71Var2);
            } else {
                j2 = ie81Var.x;
                j3 = hp71Var2.r;
                j4 = j2 + j3;
                k = j4;
            }
            long u = rf71.u(j4);
            long u2 = rf71.u(k);
            v281 v281Var3 = hp71Var2.b;
            af81 af81Var = new af81(obj, i9, op81Var2, obj2, i10, u, u2, v281Var3.b, v281Var3.c);
            int q = q();
            if (this.b0.a.c()) {
                obj3 = null;
                op81Var3 = null;
                obj4 = null;
                i11 = -1;
            } else {
                hp71 hp71Var3 = this.b0;
                Object obj6 = hp71Var3.b.a;
                hp71Var3.a.a(obj6, this.m);
                i11 = this.b0.a.a(obj6);
                obj4 = obj6;
                obj3 = this.b0.a.a(q, this.a, 0L).a;
                op81Var3 = this.a.b;
            }
            long u3 = rf71.u(j);
            long u4 = this.b0.b.a() ? rf71.u(k(this.b0)) : u3;
            v281 v281Var4 = this.b0.b;
            this.k.b(11, new xm7(i3, af81Var, new af81(obj3, q, op81Var3, obj4, i11, u3, u4, v281Var4.b, v281Var4.c), 5));
        } else {
            z2 = equals2;
            z3 = z11;
            z4 = z12;
        }
        int i16 = 10;
        if (booleanValue) {
            this.k.b(1, new jy4(op81Var, intValue, i16));
        }
        if (hp71Var2.f != hp71Var.f) {
            final int i17 = 0;
            this.k.b(10, new ov71() { // from class: bk71
                @Override // defpackage.ov71
                public final void invoke(Object obj7) {
                    int i18 = i17;
                    hp71 hp71Var4 = hp71Var;
                    ub81 ub81Var = (ub81) obj7;
                    switch (i18) {
                        case 0:
                            ub81Var.g(hp71Var4.f);
                            break;
                        case 1:
                            ub81Var.f(hp71Var4.f);
                            break;
                        case 2:
                            ub81Var.r(hp71Var4.i.d);
                            break;
                        case 3:
                            boolean z13 = hp71Var4.g;
                            ub81Var.getClass();
                            ub81Var.onIsLoadingChanged(hp71Var4.g);
                            break;
                        case 4:
                            ub81Var.onPlayerStateChanged(hp71Var4.l, hp71Var4.e);
                            break;
                        case 5:
                            ub81Var.onPlaybackStateChanged(hp71Var4.e);
                            break;
                        case 6:
                            ub81Var.onPlaybackSuppressionReasonChanged(hp71Var4.m);
                            break;
                        case 7:
                            ub81Var.onIsPlayingChanged(hp71Var4.e == 3 && hp71Var4.l && hp71Var4.m == 0);
                            break;
                        default:
                            ub81Var.e(hp71Var4.n);
                            break;
                    }
                }
            });
            if (hp71Var.f != null) {
                final int i18 = 1;
                this.k.b(10, new ov71() { // from class: bk71
                    @Override // defpackage.ov71
                    public final void invoke(Object obj7) {
                        int i182 = i18;
                        hp71 hp71Var4 = hp71Var;
                        ub81 ub81Var = (ub81) obj7;
                        switch (i182) {
                            case 0:
                                ub81Var.g(hp71Var4.f);
                                break;
                            case 1:
                                ub81Var.f(hp71Var4.f);
                                break;
                            case 2:
                                ub81Var.r(hp71Var4.i.d);
                                break;
                            case 3:
                                boolean z13 = hp71Var4.g;
                                ub81Var.getClass();
                                ub81Var.onIsLoadingChanged(hp71Var4.g);
                                break;
                            case 4:
                                ub81Var.onPlayerStateChanged(hp71Var4.l, hp71Var4.e);
                                break;
                            case 5:
                                ub81Var.onPlaybackStateChanged(hp71Var4.e);
                                break;
                            case 6:
                                ub81Var.onPlaybackSuppressionReasonChanged(hp71Var4.m);
                                break;
                            case 7:
                                ub81Var.onIsPlayingChanged(hp71Var4.e == 3 && hp71Var4.l && hp71Var4.m == 0);
                                break;
                            default:
                                ub81Var.e(hp71Var4.n);
                                break;
                        }
                    }
                });
            }
        }
        lu81 lu81Var = hp71Var2.i;
        lu81 lu81Var2 = hp71Var.i;
        if (lu81Var != lu81Var2) {
            kr81 kr81Var = this.h;
            zp1 zp1Var = lu81Var2.e;
            ((x671) kr81Var).getClass();
            final int i19 = 2;
            this.k.b(2, new ov71() { // from class: bk71
                @Override // defpackage.ov71
                public final void invoke(Object obj7) {
                    int i182 = i19;
                    hp71 hp71Var4 = hp71Var;
                    ub81 ub81Var = (ub81) obj7;
                    switch (i182) {
                        case 0:
                            ub81Var.g(hp71Var4.f);
                            break;
                        case 1:
                            ub81Var.f(hp71Var4.f);
                            break;
                        case 2:
                            ub81Var.r(hp71Var4.i.d);
                            break;
                        case 3:
                            boolean z13 = hp71Var4.g;
                            ub81Var.getClass();
                            ub81Var.onIsLoadingChanged(hp71Var4.g);
                            break;
                        case 4:
                            ub81Var.onPlayerStateChanged(hp71Var4.l, hp71Var4.e);
                            break;
                        case 5:
                            ub81Var.onPlaybackStateChanged(hp71Var4.e);
                            break;
                        case 6:
                            ub81Var.onPlaybackSuppressionReasonChanged(hp71Var4.m);
                            break;
                        case 7:
                            ub81Var.onIsPlayingChanged(hp71Var4.e == 3 && hp71Var4.l && hp71Var4.m == 0);
                            break;
                        default:
                            ub81Var.e(hp71Var4.n);
                            break;
                    }
                }
            });
        }
        if (!z2) {
            this.k.b(14, new gp51(16, this.I));
        }
        if (z4) {
            final int i20 = i4;
            this.k.b(i20, new ov71() { // from class: bk71
                @Override // defpackage.ov71
                public final void invoke(Object obj7) {
                    int i182 = i20;
                    hp71 hp71Var4 = hp71Var;
                    ub81 ub81Var = (ub81) obj7;
                    switch (i182) {
                        case 0:
                            ub81Var.g(hp71Var4.f);
                            break;
                        case 1:
                            ub81Var.f(hp71Var4.f);
                            break;
                        case 2:
                            ub81Var.r(hp71Var4.i.d);
                            break;
                        case 3:
                            boolean z13 = hp71Var4.g;
                            ub81Var.getClass();
                            ub81Var.onIsLoadingChanged(hp71Var4.g);
                            break;
                        case 4:
                            ub81Var.onPlayerStateChanged(hp71Var4.l, hp71Var4.e);
                            break;
                        case 5:
                            ub81Var.onPlaybackStateChanged(hp71Var4.e);
                            break;
                        case 6:
                            ub81Var.onPlaybackSuppressionReasonChanged(hp71Var4.m);
                            break;
                        case 7:
                            ub81Var.onIsPlayingChanged(hp71Var4.e == 3 && hp71Var4.l && hp71Var4.m == 0);
                            break;
                        default:
                            ub81Var.e(hp71Var4.n);
                            break;
                    }
                }
            });
        }
        final int i21 = 4;
        if (z3 || z10) {
            this.k.b(-1, new ov71() { // from class: bk71
                @Override // defpackage.ov71
                public final void invoke(Object obj7) {
                    int i182 = i21;
                    hp71 hp71Var4 = hp71Var;
                    ub81 ub81Var = (ub81) obj7;
                    switch (i182) {
                        case 0:
                            ub81Var.g(hp71Var4.f);
                            break;
                        case 1:
                            ub81Var.f(hp71Var4.f);
                            break;
                        case 2:
                            ub81Var.r(hp71Var4.i.d);
                            break;
                        case 3:
                            boolean z13 = hp71Var4.g;
                            ub81Var.getClass();
                            ub81Var.onIsLoadingChanged(hp71Var4.g);
                            break;
                        case 4:
                            ub81Var.onPlayerStateChanged(hp71Var4.l, hp71Var4.e);
                            break;
                        case 5:
                            ub81Var.onPlaybackStateChanged(hp71Var4.e);
                            break;
                        case 6:
                            ub81Var.onPlaybackSuppressionReasonChanged(hp71Var4.m);
                            break;
                        case 7:
                            ub81Var.onIsPlayingChanged(hp71Var4.e == 3 && hp71Var4.l && hp71Var4.m == 0);
                            break;
                        default:
                            ub81Var.e(hp71Var4.n);
                            break;
                    }
                }
            });
        }
        if (z3) {
            i6 = 5;
            this.k.b(4, new ov71() { // from class: bk71
                @Override // defpackage.ov71
                public final void invoke(Object obj7) {
                    int i182 = i6;
                    hp71 hp71Var4 = hp71Var;
                    ub81 ub81Var = (ub81) obj7;
                    switch (i182) {
                        case 0:
                            ub81Var.g(hp71Var4.f);
                            break;
                        case 1:
                            ub81Var.f(hp71Var4.f);
                            break;
                        case 2:
                            ub81Var.r(hp71Var4.i.d);
                            break;
                        case 3:
                            boolean z13 = hp71Var4.g;
                            ub81Var.getClass();
                            ub81Var.onIsLoadingChanged(hp71Var4.g);
                            break;
                        case 4:
                            ub81Var.onPlayerStateChanged(hp71Var4.l, hp71Var4.e);
                            break;
                        case 5:
                            ub81Var.onPlaybackStateChanged(hp71Var4.e);
                            break;
                        case 6:
                            ub81Var.onPlaybackSuppressionReasonChanged(hp71Var4.m);
                            break;
                        case 7:
                            ub81Var.onIsPlayingChanged(hp71Var4.e == 3 && hp71Var4.l && hp71Var4.m == 0);
                            break;
                        default:
                            ub81Var.e(hp71Var4.n);
                            break;
                    }
                }
            });
        } else {
            i6 = 5;
        }
        if (z10) {
            i7 = 1;
            this.k.b(i6, new ov71() { // from class: dk71
                @Override // defpackage.ov71
                public final void invoke(Object obj52) {
                    ub81 ub81Var = (ub81) obj52;
                    switch (i7) {
                        case 0:
                            yn81 yn81Var4 = hp71Var.a;
                            ub81Var.b(i2);
                            break;
                        default:
                            ub81Var.onPlayWhenReadyChanged(hp71Var.l, i2);
                            break;
                    }
                }
            });
        } else {
            i7 = 1;
        }
        final int i22 = 6;
        if (hp71Var2.m != hp71Var.m) {
            this.k.b(6, new ov71() { // from class: bk71
                @Override // defpackage.ov71
                public final void invoke(Object obj7) {
                    int i182 = i22;
                    hp71 hp71Var4 = hp71Var;
                    ub81 ub81Var = (ub81) obj7;
                    switch (i182) {
                        case 0:
                            ub81Var.g(hp71Var4.f);
                            break;
                        case 1:
                            ub81Var.f(hp71Var4.f);
                            break;
                        case 2:
                            ub81Var.r(hp71Var4.i.d);
                            break;
                        case 3:
                            boolean z13 = hp71Var4.g;
                            ub81Var.getClass();
                            ub81Var.onIsLoadingChanged(hp71Var4.g);
                            break;
                        case 4:
                            ub81Var.onPlayerStateChanged(hp71Var4.l, hp71Var4.e);
                            break;
                        case 5:
                            ub81Var.onPlaybackStateChanged(hp71Var4.e);
                            break;
                        case 6:
                            ub81Var.onPlaybackSuppressionReasonChanged(hp71Var4.m);
                            break;
                        case 7:
                            ub81Var.onIsPlayingChanged(hp71Var4.e == 3 && hp71Var4.l && hp71Var4.m == 0);
                            break;
                        default:
                            ub81Var.e(hp71Var4.n);
                            break;
                    }
                }
            });
        }
        final int i23 = 7;
        if (((hp71Var2.e == 3 && hp71Var2.l && hp71Var2.m == 0) ? i7 : 0) != ((hp71Var.e == 3 && hp71Var.l && hp71Var.m == 0) ? i7 : 0)) {
            this.k.b(7, new ov71() { // from class: bk71
                @Override // defpackage.ov71
                public final void invoke(Object obj7) {
                    int i182 = i23;
                    hp71 hp71Var4 = hp71Var;
                    ub81 ub81Var = (ub81) obj7;
                    switch (i182) {
                        case 0:
                            ub81Var.g(hp71Var4.f);
                            break;
                        case 1:
                            ub81Var.f(hp71Var4.f);
                            break;
                        case 2:
                            ub81Var.r(hp71Var4.i.d);
                            break;
                        case 3:
                            boolean z13 = hp71Var4.g;
                            ub81Var.getClass();
                            ub81Var.onIsLoadingChanged(hp71Var4.g);
                            break;
                        case 4:
                            ub81Var.onPlayerStateChanged(hp71Var4.l, hp71Var4.e);
                            break;
                        case 5:
                            ub81Var.onPlaybackStateChanged(hp71Var4.e);
                            break;
                        case 6:
                            ub81Var.onPlaybackSuppressionReasonChanged(hp71Var4.m);
                            break;
                        case 7:
                            ub81Var.onIsPlayingChanged(hp71Var4.e == 3 && hp71Var4.l && hp71Var4.m == 0);
                            break;
                        default:
                            ub81Var.e(hp71Var4.n);
                            break;
                    }
                }
            });
        }
        final int i24 = 8;
        if (!hp71Var2.n.equals(hp71Var.n)) {
            this.k.b(12, new ov71() { // from class: bk71
                @Override // defpackage.ov71
                public final void invoke(Object obj7) {
                    int i182 = i24;
                    hp71 hp71Var4 = hp71Var;
                    ub81 ub81Var = (ub81) obj7;
                    switch (i182) {
                        case 0:
                            ub81Var.g(hp71Var4.f);
                            break;
                        case 1:
                            ub81Var.f(hp71Var4.f);
                            break;
                        case 2:
                            ub81Var.r(hp71Var4.i.d);
                            break;
                        case 3:
                            boolean z13 = hp71Var4.g;
                            ub81Var.getClass();
                            ub81Var.onIsLoadingChanged(hp71Var4.g);
                            break;
                        case 4:
                            ub81Var.onPlayerStateChanged(hp71Var4.l, hp71Var4.e);
                            break;
                        case 5:
                            ub81Var.onPlaybackStateChanged(hp71Var4.e);
                            break;
                        case 6:
                            ub81Var.onPlaybackSuppressionReasonChanged(hp71Var4.m);
                            break;
                        case 7:
                            ub81Var.onIsPlayingChanged(hp71Var4.e == 3 && hp71Var4.l && hp71Var4.m == 0);
                            break;
                        default:
                            ub81Var.e(hp71Var4.n);
                            break;
                    }
                }
            });
        }
        o881 o881Var2 = this.H;
        ek71 ek71Var = this.f;
        o881 o881Var3 = this.c;
        int i25 = rf71.a;
        ek71Var.v();
        uk81 uk81Var = ek71Var.a;
        boolean a5 = ek71Var.b0.b.a();
        ek71Var.v();
        yn81 yn81Var4 = ek71Var.b0.a;
        boolean z13 = !yn81Var4.c() && yn81Var4.a(ek71Var.q(), uk81Var, 0L).z;
        ek71Var.v();
        yn81 yn81Var5 = ek71Var.b0.a;
        if (yn81Var5.c()) {
            a = -1;
        } else {
            int q2 = ek71Var.q();
            ek71Var.v();
            ek71Var.v();
            a = yn81Var5.a(q2, 0);
        }
        boolean z14 = a != -1;
        ek71Var.v();
        yn81 yn81Var6 = ek71Var.b0.a;
        if (yn81Var6.c()) {
            z5 = false;
            a2 = -1;
        } else {
            int q3 = ek71Var.q();
            ek71Var.v();
            ek71Var.v();
            z5 = false;
            a2 = yn81Var6.a(q3, 0, false);
        }
        boolean z15 = a2 != -1 ? true : z5;
        ek71Var.v();
        yn81 yn81Var7 = ek71Var.b0.a;
        if (yn81Var7.c()) {
            z6 = z13;
        } else {
            z6 = z13;
            if (yn81Var7.a(ek71Var.q(), uk81Var, 0L).b()) {
                z7 = true;
                ek71Var.v();
                yn81Var = ek71Var.b0.a;
                if (yn81Var.c()) {
                    z8 = z14;
                    if (yn81Var.a(ek71Var.q(), uk81Var, 0L).A) {
                        z9 = true;
                        ek71Var.v();
                        boolean c = ek71Var.b0.a.c();
                        h581 h581Var = new h581();
                        je71 je71Var = h581Var.a;
                        hh71Var = o881Var3.a;
                        je71Var.getClass();
                        for (i8 = 0; i8 < hh71Var.a.size(); i8++) {
                            je71Var.b(hh71Var.a(i8));
                        }
                        boolean z16 = !a5;
                        h581Var.a(z16, 4);
                        h581Var.a((z6 || a5) ? false : true, 5);
                        h581Var.a((z8 || a5) ? false : true, 6);
                        h581Var.a(c && (z8 || !z7 || z6) && !a5, 7);
                        h581Var.a((z15 || a5) ? false : true, 8);
                        h581Var.a(c && (z15 || (z7 && z9)) && !a5, 9);
                        h581Var.a(z16, 10);
                        h581Var.a((z6 || a5) ? false : true, 11);
                        h581Var.a((z6 || a5) ? false : true, 12);
                        o881Var = new o881(je71Var.a());
                        this.H = o881Var;
                        if (!o881Var.equals(o881Var2)) {
                            this.k.b(13, new ck71(this));
                        }
                        this.k.a();
                        if (hp71Var2.o != hp71Var.o) {
                            Iterator it = this.l.iterator();
                            while (it.hasNext()) {
                                ((gn0) it.next()).a.u();
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    z8 = z14;
                }
                z9 = false;
                ek71Var.v();
                boolean c2 = ek71Var.b0.a.c();
                h581 h581Var2 = new h581();
                je71 je71Var2 = h581Var2.a;
                hh71Var = o881Var3.a;
                je71Var2.getClass();
                while (i8 < hh71Var.a.size()) {
                }
                boolean z162 = !a5;
                h581Var2.a(z162, 4);
                h581Var2.a((z6 || a5) ? false : true, 5);
                h581Var2.a((z8 || a5) ? false : true, 6);
                h581Var2.a(c2 && (z8 || !z7 || z6) && !a5, 7);
                h581Var2.a((z15 || a5) ? false : true, 8);
                h581Var2.a(c2 && (z15 || (z7 && z9)) && !a5, 9);
                h581Var2.a(z162, 10);
                h581Var2.a((z6 || a5) ? false : true, 11);
                h581Var2.a((z6 || a5) ? false : true, 12);
                o881Var = new o881(je71Var2.a());
                this.H = o881Var;
                if (!o881Var.equals(o881Var2)) {
                }
                this.k.a();
                if (hp71Var2.o != hp71Var.o) {
                }
            }
        }
        z7 = false;
        ek71Var.v();
        yn81Var = ek71Var.b0.a;
        if (yn81Var.c()) {
        }
        z9 = false;
        ek71Var.v();
        boolean c22 = ek71Var.b0.a.c();
        h581 h581Var22 = new h581();
        je71 je71Var22 = h581Var22.a;
        hh71Var = o881Var3.a;
        je71Var22.getClass();
        while (i8 < hh71Var.a.size()) {
        }
        boolean z1622 = !a5;
        h581Var22.a(z1622, 4);
        h581Var22.a((z6 || a5) ? false : true, 5);
        h581Var22.a((z8 || a5) ? false : true, 6);
        h581Var22.a(c22 && (z8 || !z7 || z6) && !a5, 7);
        h581Var22.a((z15 || a5) ? false : true, 8);
        h581Var22.a(c22 && (z15 || (z7 && z9)) && !a5, 9);
        h581Var22.a(z1622, 10);
        h581Var22.a((z6 || a5) ? false : true, 11);
        h581Var22.a((z6 || a5) ? false : true, 12);
        o881Var = new o881(je71Var22.a());
        this.H = o881Var;
        if (!o881Var.equals(o881Var2)) {
        }
        this.k.a();
        if (hp71Var2.o != hp71Var.o) {
        }
    }

    public final void i(zm0 zm0Var) {
        hp71 hp71Var = this.b0;
        hp71 b = hp71Var.b(hp71Var.b);
        b.p = b.r;
        b.q = 0L;
        hp71 a = b.a(1);
        if (zm0Var != null) {
            a = a.e(zm0Var);
        }
        hp71 hp71Var2 = a;
        this.B++;
        rl71 rl71Var = this.j.i;
        rl71Var.getClass();
        fi71 a2 = rl71.a();
        a2.a = rl71Var.a.obtainMessage(6);
        a2.b();
        h(hp71Var2, 0, 1, hp71Var2.a.c() && !this.b0.a.c(), 4, a(hp71Var2));
    }

    public final void j(boolean z) {
        v();
        v();
        int i = this.b0.e;
        this.w.a();
        int i2 = 1;
        int i3 = z ? 1 : -1;
        if (z && i3 != 1) {
            i2 = 2;
        }
        e(i3, i2, z);
    }

    public final oi61 l() {
        v();
        yn81 yn81Var = this.b0.a;
        if (yn81Var.c()) {
            return this.a0;
        }
        op81 op81Var = yn81Var.a(q(), this.a, 0L).b;
        oi61 oi61Var = this.a0;
        oi61Var.getClass();
        a291 a291Var = new a291(oi61Var);
        oi61 oi61Var2 = op81Var.w;
        if (oi61Var2 != null) {
            CharSequence charSequence = oi61Var2.a;
            if (charSequence != null) {
                a291Var.a = charSequence;
            }
            CharSequence charSequence2 = oi61Var2.b;
            if (charSequence2 != null) {
                a291Var.b = charSequence2;
            }
            CharSequence charSequence3 = oi61Var2.c;
            if (charSequence3 != null) {
                a291Var.c = charSequence3;
            }
            CharSequence charSequence4 = oi61Var2.w;
            if (charSequence4 != null) {
                a291Var.d = charSequence4;
            }
            CharSequence charSequence5 = oi61Var2.x;
            if (charSequence5 != null) {
                a291Var.e = charSequence5;
            }
            CharSequence charSequence6 = oi61Var2.y;
            if (charSequence6 != null) {
                a291Var.f = charSequence6;
            }
            CharSequence charSequence7 = oi61Var2.z;
            if (charSequence7 != null) {
                a291Var.g = charSequence7;
            }
            ui81 ui81Var = oi61Var2.A;
            if (ui81Var != null) {
                a291Var.h = ui81Var;
            }
            ui81 ui81Var2 = oi61Var2.B;
            if (ui81Var2 != null) {
                a291Var.i = ui81Var2;
            }
            byte[] bArr = oi61Var2.C;
            if (bArr != null) {
                Integer num = oi61Var2.D;
                a291Var.j = (byte[]) bArr.clone();
                a291Var.k = num;
            }
            Uri uri = oi61Var2.E;
            if (uri != null) {
                a291Var.l = uri;
            }
            Integer num2 = oi61Var2.F;
            if (num2 != null) {
                a291Var.m = num2;
            }
            Integer num3 = oi61Var2.G;
            if (num3 != null) {
                a291Var.n = num3;
            }
            Integer num4 = oi61Var2.H;
            if (num4 != null) {
                a291Var.o = num4;
            }
            Boolean bool = oi61Var2.I;
            if (bool != null) {
                a291Var.p = bool;
            }
            Integer num5 = oi61Var2.J;
            if (num5 != null) {
                a291Var.q = num5;
            }
            Integer num6 = oi61Var2.K;
            if (num6 != null) {
                a291Var.q = num6;
            }
            Integer num7 = oi61Var2.L;
            if (num7 != null) {
                a291Var.r = num7;
            }
            Integer num8 = oi61Var2.M;
            if (num8 != null) {
                a291Var.s = num8;
            }
            Integer num9 = oi61Var2.N;
            if (num9 != null) {
                a291Var.t = num9;
            }
            Integer num10 = oi61Var2.O;
            if (num10 != null) {
                a291Var.u = num10;
            }
            Integer num11 = oi61Var2.P;
            if (num11 != null) {
                a291Var.v = num11;
            }
            CharSequence charSequence8 = oi61Var2.Q;
            if (charSequence8 != null) {
                a291Var.w = charSequence8;
            }
            CharSequence charSequence9 = oi61Var2.R;
            if (charSequence9 != null) {
                a291Var.x = charSequence9;
            }
            CharSequence charSequence10 = oi61Var2.S;
            if (charSequence10 != null) {
                a291Var.y = charSequence10;
            }
            Integer num12 = oi61Var2.T;
            if (num12 != null) {
                a291Var.z = num12;
            }
            Integer num13 = oi61Var2.U;
            if (num13 != null) {
                a291Var.A = num13;
            }
            CharSequence charSequence11 = oi61Var2.V;
            if (charSequence11 != null) {
                a291Var.B = charSequence11;
            }
            CharSequence charSequence12 = oi61Var2.W;
            if (charSequence12 != null) {
                a291Var.C = charSequence12;
            }
            CharSequence charSequence13 = oi61Var2.Z;
            if (charSequence13 != null) {
                a291Var.D = charSequence13;
            }
            Bundle bundle = oi61Var2.a0;
            if (bundle != null) {
                a291Var.E = bundle;
            }
        }
        return new oi61(a291Var);
    }

    public final void m(ub81 ub81Var) {
        ub81Var.getClass();
        xrr xrrVar = this.k;
        Iterator it = ((CopyOnWriteArraySet) xrrVar.y).iterator();
        while (it.hasNext()) {
            x181 x181Var = (x181) it.next();
            if (x181Var.a.equals(ub81Var)) {
                ly71 ly71Var = (ly71) xrrVar.x;
                x181Var.d = true;
                if (x181Var.c) {
                    ly71Var.c(x181Var.a, x181Var.b.a());
                }
                ((CopyOnWriteArraySet) xrrVar.y).remove(x181Var);
            }
        }
    }

    public final long n() {
        v();
        v();
        if (!this.b0.b.a()) {
            v();
            return rf71.u(a(this.b0));
        }
        hp71 hp71Var = this.b0;
        yn81 yn81Var = hp71Var.a;
        Object obj = hp71Var.b.a;
        ie81 ie81Var = this.m;
        yn81Var.a(obj, ie81Var);
        hp71 hp71Var2 = this.b0;
        if (hp71Var2.c == -9223372036854775807L) {
            return rf71.u(hp71Var2.a.a(q(), this.a, 0L).E);
        }
        return rf71.u(this.b0.c) + rf71.u(ie81Var.x);
    }

    public final int o() {
        v();
        v();
        if (this.b0.b.a()) {
            return this.b0.b.b;
        }
        return -1;
    }

    public final int p() {
        v();
        v();
        if (this.b0.b.a()) {
            return this.b0.b.c;
        }
        return -1;
    }

    public final int q() {
        v();
        int r = r();
        if (r == -1) {
            return 0;
        }
        return r;
    }

    public final int r() {
        if (this.b0.a.c()) {
            return this.c0;
        }
        hp71 hp71Var = this.b0;
        return hp71Var.a.a(hp71Var.b.a, this.m).c;
    }

    public final void s() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [ExoPlayerLib/2.18.1] [");
        sb.append(rf71.e);
        sb.append("] [");
        synchronized (xc81.class) {
            str = xc81.b;
        }
        sb.append(str);
        sb.append("]");
        nba1.d("ExoPlayerImpl", sb.toString());
        v();
        if (rf71.a < 21 && (audioTrack = this.J) != null) {
            audioTrack.release();
            this.J = null;
        }
        this.v.getClass();
        t571 t571Var = this.x;
        e23 e23Var = t571Var.e;
        if (e23Var != null) {
            try {
                t571Var.a.unregisterReceiver(e23Var);
            } catch (RuntimeException e) {
                nba1.b("Error unregistering stream volume receiver", e);
                nba1.e();
            }
            t571Var.e = null;
        }
        HandlerThread handlerThread = t571Var.f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            t571Var.f = null;
        }
        this.y.getClass();
        this.z.getClass();
        bm81 bm81Var = this.w;
        bm81Var.c = null;
        bm81Var.a();
        if (!this.j.h()) {
            xrr xrrVar = this.k;
            xrrVar.b(10, new yx61(11));
            xrrVar.a();
        }
        xrr xrrVar2 = this.k;
        Iterator it = ((CopyOnWriteArraySet) xrrVar2.y).iterator();
        while (it.hasNext()) {
            x181 x181Var = (x181) it.next();
            ly71 ly71Var = (ly71) xrrVar2.x;
            x181Var.d = true;
            if (x181Var.c) {
                ly71Var.c(x181Var.a, x181Var.b.a());
            }
        }
        ((CopyOnWriteArraySet) xrrVar2.y).clear();
        xrrVar2.b = true;
        this.i.a.removeCallbacksAndMessages(null);
        cj71 cj71Var = this.r;
        ep71 ep71Var = this.p;
        pi61 pi61Var = cj71Var.b;
        Iterator it2 = pi61Var.a.iterator();
        while (it2.hasNext()) {
            b291 b291Var = (b291) it2.next();
            if (b291Var.b == ep71Var) {
                b291Var.c = true;
                pi61Var.a.remove(b291Var);
            }
        }
        hp71 a = this.b0.a(1);
        this.b0 = a;
        hp71 b = a.b(a.b);
        this.b0 = b;
        b.p = b.r;
        this.b0.q = 0L;
        ep71 ep71Var2 = this.p;
        ep71Var2.A.a.post(new jy31(27, ep71Var2));
        this.h.b();
        t();
        Surface surface = this.L;
        if (surface != null) {
            surface.release();
            this.L = null;
        }
        int i = bf71.a;
    }

    public final void t() {
        l03 l03Var = this.N;
        gn0 gn0Var = this.t;
        if (l03Var != null) {
            s371 b = b(this.u);
            boolean z = b.g;
            if (z) {
                ny61.k();
                return;
            }
            b.d = 10000;
            if (z) {
                ny61.k();
                return;
            }
            b.e = null;
            b.a();
            this.N.a.remove(gn0Var);
            this.N = null;
        }
        TextureView textureView = this.P;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != gn0Var) {
                nba1.e();
            } else {
                this.P.setSurfaceTextureListener(null);
            }
            this.P = null;
        }
        SurfaceHolder surfaceHolder = this.M;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(gn0Var);
            this.M = null;
        }
    }

    public final void u() {
        v();
        int i = this.b0.e;
        hay hayVar = this.z;
        r100 r100Var = this.y;
        if (i != 1) {
            if (i == 2 || i == 3) {
                v();
                boolean z = this.b0.o;
                v();
                boolean z2 = this.b0.l;
                r100Var.getClass();
                v();
                boolean z3 = this.b0.l;
                hayVar.getClass();
                return;
            }
            if (i != 4) {
                ny61.k();
                return;
            }
        }
        r100Var.getClass();
        hayVar.getClass();
    }

    public final void v() {
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.q;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i = rf71.a;
            Locale locale = Locale.US;
            String p = unr0.p("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.X) {
                ny61.r(p);
                return;
            }
            nba1.b(p, this.Y ? null : new IllegalStateException());
            nba1.e();
            this.Y = true;
        }
    }
}
