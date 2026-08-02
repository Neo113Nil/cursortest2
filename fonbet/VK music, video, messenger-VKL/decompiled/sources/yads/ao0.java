package yads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import xsna.a840;
import xsna.at6;
import xsna.fel;
import xsna.ggj0;
import xsna.he40;
import xsna.je40;
import xsna.l340;
import xsna.mau;
import xsna.nh40;
import xsna.nit;
import xsna.p5w;
import xsna.qca0;
import xsna.ss9;
import xsna.tuz;
import xsna.utg0;
import xsna.wii0;
import xsna.yzt;

/* loaded from: classes10.dex */
public final class ao0 extends qo implements tn0 {
    public int A;
    public int B;
    public boolean C;
    public int D;
    public wz2 E;
    public mf2 F;
    public kn1 G;
    public AudioTrack H;
    public Object I;
    public Surface J;
    public SurfaceHolder K;
    public m33 L;
    public boolean M;
    public TextureView N;
    public final int O;
    public int P;
    public int Q;
    public final int R;
    public final pk S;
    public float T;
    public boolean U;
    public final boolean V;
    public boolean W;
    public ig0 X;
    public kn1 Y;
    public df2 Z;
    public int a0;
    public final x83 b;
    public long b0;
    public final mf2 c;
    public final vy d;
    public final pf2 e;
    public final ro[] f;
    public final w83 g;
    public final m63 h;
    public final ho0 i;
    public final qg1 j;
    public final CopyOnWriteArraySet k;
    public final t73 l;
    public final ArrayList m;
    public final boolean n;
    public final se o;
    public final Looper p;
    public final im q;
    public final j63 r;
    public final xn0 s;
    public final yn0 t;
    public final sk u;
    public final yk v;
    public final g53 w;
    public final jo3 x;
    public final yp3 y;
    public final long z;

    static {
        io0.a("goog.exo.exoplayer");
    }

    public ao0(sn0 sn0Var) {
        vy vyVar = new vy();
        this.d = vyVar;
        try {
            ji1.c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + mc3.e + X3.j.e);
            Context applicationContext = sn0Var.a.getApplicationContext();
            se seVar = (se) sn0Var.h.apply(sn0Var.b);
            this.o = seVar;
            pk pkVar = sn0Var.j;
            this.S = pkVar;
            int i = sn0Var.k;
            this.O = i;
            this.U = false;
            this.z = sn0Var.p;
            xn0 xn0Var = new xn0(this);
            this.s = xn0Var;
            yn0 yn0Var = new yn0();
            this.t = yn0Var;
            Handler handler = new Handler(sn0Var.i);
            ro[] a = ((pe0) sn0Var.c.get()).a(handler, xn0Var, xn0Var, xn0Var, xn0Var);
            this.f = a;
            ni.b(a.length > 0);
            w83 w83Var = (w83) sn0Var.e.get();
            this.g = w83Var;
            im imVar = (im) sn0Var.g.get();
            this.q = imVar;
            this.n = sn0Var.l;
            ay2 ay2Var = sn0Var.m;
            Looper looper = sn0Var.i;
            this.p = looper;
            j63 j63Var = sn0Var.b;
            this.r = j63Var;
            this.e = this;
            this.j = new qg1(looper, j63Var, new wii0(this, 20));
            this.k = new CopyOnWriteArraySet();
            this.m = new ArrayList();
            this.E = new wz2();
            x83 x83Var = new x83(new no2[a.length], new pp0[a.length], s93.c, null);
            this.b = x83Var;
            this.l = new t73();
            lf2 a2 = new lf2().a(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            w83Var.getClass();
            mf2 a3 = a2.a(true, 29).a();
            this.c = a3;
            this.F = new lf2().a(a3).a(4).a(10).a();
            this.h = j63Var.a(looper, null);
            tuz tuzVar = new tuz(this, 27);
            this.Z = df2.a(x83Var);
            ((kb0) seVar).a(this, looper);
            int i2 = mc3.a;
            this.i = new ho0(a, w83Var, x83Var, (tg1) sn0Var.f.get(), imVar, 0, seVar, ay2Var, sn0Var.n, sn0Var.o, looper, j63Var, tuzVar, i2 < 31 ? new zf2() : wn0.a(applicationContext, this, sn0Var.q));
            this.T = 1.0f;
            kn1 kn1Var = kn1.H;
            this.G = kn1Var;
            this.Y = kn1Var;
            this.a0 = -1;
            if (i2 < 21) {
                this.R = k();
            } else {
                this.R = mc3.a(applicationContext);
            }
            int i3 = q20.b;
            this.V = true;
            a(seVar);
            ((dc0) imVar).a(new Handler(looper), seVar);
            a(xn0Var);
            sk skVar = new sk(sn0Var.a, handler, xn0Var);
            this.u = skVar;
            skVar.a();
            yk ykVar = new yk(sn0Var.a, handler, xn0Var);
            this.v = ykVar;
            ykVar.b();
            g53 g53Var = new g53(sn0Var.a, handler, xn0Var);
            this.w = g53Var;
            g53Var.a(mc3.c(pkVar.d));
            jo3 jo3Var = new jo3(sn0Var.a);
            this.x = jo3Var;
            jo3Var.a();
            yp3 yp3Var = new yp3(sn0Var.a);
            this.y = yp3Var;
            yp3Var.a();
            this.X = a(g53Var);
            w83Var.a(pkVar);
            a(1, 10, Integer.valueOf(this.R));
            a(2, 10, Integer.valueOf(this.R));
            a(1, 3, pkVar);
            a(2, 4, Integer.valueOf(i));
            a(2, 5, (Object) 0);
            a(1, 9, Boolean.valueOf(this.U));
            a(2, 7, yn0Var);
            a(6, 8, yn0Var);
            vyVar.d();
        } catch (Throwable th) {
            this.d.d();
            throw th;
        }
    }

    public final void a(xn0 xn0Var) {
        this.k.add(xn0Var);
    }

    public final long b() {
        r();
        r();
        if (!this.Z.b.a()) {
            r();
            return mc3.b(a(this.Z));
        }
        df2 df2Var = this.Z;
        df2Var.a.a(df2Var.b.a, this.l);
        df2 df2Var2 = this.Z;
        if (df2Var2.c == C.TIME_UNSET) {
            return mc3.b(df2Var2.a.a(e(), this.a, 0L).n);
        }
        return mc3.b(this.Z.c) + mc3.b(this.l.f);
    }

    public final int c() {
        r();
        r();
        if (this.Z.b.a()) {
            return this.Z.b.b;
        }
        return -1;
    }

    public final int d() {
        r();
        r();
        if (this.Z.b.a()) {
            return this.Z.b.c;
        }
        return -1;
    }

    public final int e() {
        r();
        int i = i();
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final int f() {
        r();
        if (this.Z.a.c()) {
            return 0;
        }
        df2 df2Var = this.Z;
        return df2Var.a.a(df2Var.b.a);
    }

    public final long g() {
        r();
        return mc3.b(a(this.Z));
    }

    public final w73 h() {
        r();
        return this.Z.a;
    }

    public final int i() {
        if (this.Z.a.c()) {
            return this.a0;
        }
        df2 df2Var = this.Z;
        return df2Var.a.a(df2Var.b.a, this.l).d;
    }

    public final long j() {
        r();
        r();
        if (!this.Z.b.a()) {
            r();
            w73 w73Var = this.Z.a;
            return w73Var.c() ? C.TIME_UNSET : mc3.b(w73Var.a(e(), this.a, 0L).o);
        }
        df2 df2Var = this.Z;
        zn1 zn1Var = df2Var.b;
        df2Var.a.a(zn1Var.a, this.l);
        return mc3.b(this.l.a(zn1Var.b, zn1Var.c));
    }

    public final int k() {
        AudioTrack audioTrack = this.H;
        if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
            this.H.release();
            this.H = null;
        }
        if (this.H == null) {
            this.H = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
        }
        return this.H.getAudioSessionId();
    }

    public final boolean l() {
        r();
        return this.Z.b.a();
    }

    public final void m() {
        r();
        r();
        boolean z = this.Z.l;
        int a = this.v.a(z, 2);
        a(a, (!z || a == 1) ? 1 : 2, z);
        df2 df2Var = this.Z;
        if (df2Var.e != 1) {
            return;
        }
        df2 a2 = df2Var.a((qn0) null);
        df2 a3 = a2.a(a2.a.c() ? 4 : 2);
        this.A++;
        m63 m63Var = this.i.i;
        m63Var.getClass();
        l63 a4 = m63.a();
        a4.a = m63Var.a.obtainMessage(0);
        a4.b();
        a(a3, 1, 1, false, 5, C.TIME_UNSET);
    }

    public final void n() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [ExoPlayerLib/2.18.1] [");
        sb.append(mc3.e);
        sb.append("] [");
        synchronized (io0.class) {
            str = io0.b;
        }
        sb.append(str);
        sb.append(X3.j.e);
        ji1.c("ExoPlayerImpl", sb.toString());
        r();
        if (mc3.a < 21 && (audioTrack = this.H) != null) {
            audioTrack.release();
            this.H = null;
        }
        this.u.a();
        this.w.b();
        jo3 jo3Var = this.x;
        jo3Var.b = false;
        jo3Var.b();
        yp3 yp3Var = this.y;
        yp3Var.b = false;
        yp3Var.b();
        yk ykVar = this.v;
        ykVar.c = null;
        ykVar.a();
        if (!this.i.h()) {
            qg1 qg1Var = this.j;
            qg1Var.a(10, new ggj0(11));
            qg1Var.a();
        }
        qg1 qg1Var2 = this.j;
        Iterator it = qg1Var2.d.iterator();
        while (it.hasNext()) {
            pg1 pg1Var = (pg1) it.next();
            og1 og1Var = qg1Var2.c;
            pg1Var.d = true;
            if (pg1Var.c) {
                og1Var.a(pg1Var.a, pg1Var.b.a());
            }
        }
        qg1Var2.d.clear();
        qg1Var2.g = true;
        this.h.a.removeCallbacksAndMessages(null);
        im imVar = this.q;
        se seVar = this.o;
        gm gmVar = ((dc0) imVar).b;
        Iterator it2 = gmVar.a.iterator();
        while (it2.hasNext()) {
            fm fmVar = (fm) it2.next();
            if (fmVar.b == seVar) {
                fmVar.c = true;
                gmVar.a.remove(fmVar);
            }
        }
        df2 a = this.Z.a(1);
        this.Z = a;
        df2 a2 = a.a(a.b);
        this.Z = a2;
        a2.p = a2.r;
        this.Z.q = 0L;
        ((kb0) this.o).c();
        this.g.a();
        o();
        Surface surface = this.J;
        if (surface != null) {
            surface.release();
            this.J = null;
        }
        int i = q20.b;
    }

    public final void o() {
        if (this.L != null) {
            cg2 a = a(this.t);
            boolean z = a.g;
            if (z) {
                throw new IllegalStateException();
            }
            a.d = 10000;
            if (z) {
                throw new IllegalStateException();
            }
            a.e = null;
            a.a();
            m33 m33Var = this.L;
            m33Var.a.remove(this.s);
            this.L = null;
        }
        TextureView textureView = this.N;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.s) {
                ji1.d("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.N.setSurfaceTextureListener(null);
            }
            this.N = null;
        }
        SurfaceHolder surfaceHolder = this.K;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.s);
            this.K = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        boolean z;
        w73 w73Var;
        boolean z2;
        mf2 mf2Var;
        mf2 mf2Var2 = this.F;
        pf2 pf2Var = this.e;
        mf2 mf2Var3 = this.c;
        int i = mc3.a;
        ao0 ao0Var = (ao0) pf2Var;
        ao0Var.r();
        boolean a = ao0Var.Z.b.a();
        qo qoVar = (qo) pf2Var;
        ao0 ao0Var2 = (ao0) qoVar;
        ao0Var2.r();
        w73 w73Var2 = ao0Var2.Z.a;
        boolean z3 = !w73Var2.c() && w73Var2.a(ao0Var2.e(), qoVar.a, 0L).i;
        ao0Var2.r();
        w73 w73Var3 = ao0Var2.Z.a;
        if (!w73Var3.c()) {
            int e = ao0Var2.e();
            qoVar.getClass();
            ((ao0) qoVar).r();
            ao0Var2.r();
            if (w73Var3.b(e, 0, false) != -1) {
                z = true;
                ao0Var2.r();
                w73Var = ao0Var2.Z.a;
                if (!w73Var.c()) {
                    int e2 = ao0Var2.e();
                    qoVar.getClass();
                    ((ao0) qoVar).r();
                    ao0Var2.r();
                    if (w73Var.a(e2, 0, false) != -1) {
                        z2 = true;
                        ao0Var2.r();
                        w73 w73Var4 = ao0Var2.Z.a;
                        boolean z4 = w73Var4.c() && w73Var4.a(ao0Var2.e(), qoVar.a, 0L).a();
                        ao0Var2.r();
                        w73 w73Var5 = ao0Var2.Z.a;
                        boolean z5 = w73Var5.c() && w73Var5.a(ao0Var2.e(), qoVar.a, 0L).j;
                        ao0Var.r();
                        boolean c = ao0Var.Z.a.c();
                        boolean z6 = !a;
                        mf2Var = new mf2(new lf2().a(mf2Var3).a(z6, 4).a((z3 || a) ? false : true, 5).a((z || a) ? false : true, 6).a(c && (z || !z4 || z3) && !a, 7).a((z2 || a) ? false : true, 8).a(c && (z2 || (z4 && z5)) && !a, 9).a(z6, 10).a((z3 || a) ? false : true, 11).a((z3 || a) ? false : true, 12).a.a());
                        this.F = mf2Var;
                        if (mf2Var.equals(mf2Var2)) {
                            return;
                        }
                        this.j.a(13, new he40(this, 26));
                        return;
                    }
                }
                z2 = false;
                ao0Var2.r();
                w73 w73Var42 = ao0Var2.Z.a;
                if (w73Var42.c()) {
                }
                ao0Var2.r();
                w73 w73Var52 = ao0Var2.Z.a;
                if (w73Var52.c()) {
                }
                ao0Var.r();
                boolean c2 = ao0Var.Z.a.c();
                boolean z62 = !a;
                mf2Var = new mf2(new lf2().a(mf2Var3).a(z62, 4).a((z3 || a) ? false : true, 5).a((z || a) ? false : true, 6).a(c2 && (z || !z4 || z3) && !a, 7).a((z2 || a) ? false : true, 8).a(c2 && (z2 || (z4 && z5)) && !a, 9).a(z62, 10).a((z3 || a) ? false : true, 11).a((z3 || a) ? false : true, 12).a.a());
                this.F = mf2Var;
                if (mf2Var.equals(mf2Var2)) {
                }
            }
        }
        z = false;
        ao0Var2.r();
        w73Var = ao0Var2.Z.a;
        if (!w73Var.c()) {
        }
        z2 = false;
        ao0Var2.r();
        w73 w73Var422 = ao0Var2.Z.a;
        if (w73Var422.c()) {
        }
        ao0Var2.r();
        w73 w73Var522 = ao0Var2.Z.a;
        if (w73Var522.c()) {
        }
        ao0Var.r();
        boolean c22 = ao0Var.Z.a.c();
        boolean z622 = !a;
        mf2Var = new mf2(new lf2().a(mf2Var3).a(z622, 4).a((z3 || a) ? false : true, 5).a((z || a) ? false : true, 6).a(c22 && (z || !z4 || z3) && !a, 7).a((z2 || a) ? false : true, 8).a(c22 && (z2 || (z4 && z5)) && !a, 9).a(z622, 10).a((z3 || a) ? false : true, 11).a((z3 || a) ? false : true, 12).a.a());
        this.F = mf2Var;
        if (mf2Var.equals(mf2Var2)) {
        }
    }

    public final void q() {
        r();
        int i = this.Z.e;
        boolean z = false;
        if (i != 1) {
            if (i == 2 || i == 3) {
                r();
                boolean z2 = this.Z.o;
                jo3 jo3Var = this.x;
                r();
                if (this.Z.l && !z2) {
                    z = true;
                }
                jo3Var.b = z;
                jo3Var.b();
                yp3 yp3Var = this.y;
                r();
                yp3Var.b = this.Z.l;
                yp3Var.b();
                return;
            }
            if (i != 4) {
                throw new IllegalStateException();
            }
        }
        jo3 jo3Var2 = this.x;
        jo3Var2.b = false;
        jo3Var2.b();
        yp3 yp3Var2 = this.y;
        yp3Var2.b = false;
        yp3Var2.b();
    }

    public final void r() {
        this.d.b();
        if (Thread.currentThread() != this.p.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.p.getThread().getName();
            int i = mc3.a;
            Locale locale = Locale.US;
            String a = ss9.a("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.V) {
                throw new IllegalStateException(a);
            }
            ji1.d("ExoPlayerImpl", ji1.a(a, this.W ? null : new IllegalStateException()));
            this.W = true;
        }
    }

    public final void a(nf2 nf2Var) {
        nf2Var.getClass();
        qg1 qg1Var = this.j;
        if (qg1Var.g) {
            return;
        }
        qg1Var.d.add(new pg1(nf2Var));
    }

    public static void h(df2 df2Var, nf2 nf2Var) {
        nf2Var.onIsPlayingChanged(df2Var.e == 3 && df2Var.l && df2Var.m == 0);
    }

    public static /* synthetic */ void d(df2 df2Var, nf2 nf2Var) {
        boolean z = df2Var.g;
        nf2Var.getClass();
        nf2Var.onIsLoadingChanged(df2Var.g);
    }

    public final /* synthetic */ void c(nf2 nf2Var) {
        nf2Var.a(this.F);
    }

    public final kn1 a() {
        r();
        w73 w73Var = this.Z.a;
        if (w73Var.c()) {
            return this.Y;
        }
        gn1 gn1Var = w73Var.a(e(), this.a, 0L).d;
        kn1 kn1Var = this.Y;
        kn1Var.getClass();
        jn1 jn1Var = new jn1(kn1Var);
        kn1 kn1Var2 = gn1Var.e;
        if (kn1Var2 != null) {
            CharSequence charSequence = kn1Var2.b;
            if (charSequence != null) {
                jn1Var.a = charSequence;
            }
            CharSequence charSequence2 = kn1Var2.c;
            if (charSequence2 != null) {
                jn1Var.b = charSequence2;
            }
            CharSequence charSequence3 = kn1Var2.d;
            if (charSequence3 != null) {
                jn1Var.c = charSequence3;
            }
            CharSequence charSequence4 = kn1Var2.e;
            if (charSequence4 != null) {
                jn1Var.d = charSequence4;
            }
            CharSequence charSequence5 = kn1Var2.f;
            if (charSequence5 != null) {
                jn1Var.e = charSequence5;
            }
            CharSequence charSequence6 = kn1Var2.g;
            if (charSequence6 != null) {
                jn1Var.f = charSequence6;
            }
            CharSequence charSequence7 = kn1Var2.h;
            if (charSequence7 != null) {
                jn1Var.g = charSequence7;
            }
            rm2 rm2Var = kn1Var2.i;
            if (rm2Var != null) {
                jn1Var.h = rm2Var;
            }
            rm2 rm2Var2 = kn1Var2.j;
            if (rm2Var2 != null) {
                jn1Var.i = rm2Var2;
            }
            byte[] bArr = kn1Var2.k;
            if (bArr != null) {
                Integer num = kn1Var2.l;
                jn1Var.j = (byte[]) bArr.clone();
                jn1Var.k = num;
            }
            Uri uri = kn1Var2.m;
            if (uri != null) {
                jn1Var.l = uri;
            }
            Integer num2 = kn1Var2.n;
            if (num2 != null) {
                jn1Var.m = num2;
            }
            Integer num3 = kn1Var2.o;
            if (num3 != null) {
                jn1Var.n = num3;
            }
            Integer num4 = kn1Var2.p;
            if (num4 != null) {
                jn1Var.o = num4;
            }
            Boolean bool = kn1Var2.q;
            if (bool != null) {
                jn1Var.p = bool;
            }
            Integer num5 = kn1Var2.r;
            if (num5 != null) {
                jn1Var.q = num5;
            }
            Integer num6 = kn1Var2.s;
            if (num6 != null) {
                jn1Var.q = num6;
            }
            Integer num7 = kn1Var2.t;
            if (num7 != null) {
                jn1Var.r = num7;
            }
            Integer num8 = kn1Var2.u;
            if (num8 != null) {
                jn1Var.s = num8;
            }
            Integer num9 = kn1Var2.v;
            if (num9 != null) {
                jn1Var.t = num9;
            }
            Integer num10 = kn1Var2.w;
            if (num10 != null) {
                jn1Var.u = num10;
            }
            Integer num11 = kn1Var2.x;
            if (num11 != null) {
                jn1Var.v = num11;
            }
            CharSequence charSequence8 = kn1Var2.y;
            if (charSequence8 != null) {
                jn1Var.w = charSequence8;
            }
            CharSequence charSequence9 = kn1Var2.z;
            if (charSequence9 != null) {
                jn1Var.x = charSequence9;
            }
            CharSequence charSequence10 = kn1Var2.A;
            if (charSequence10 != null) {
                jn1Var.y = charSequence10;
            }
            Integer num12 = kn1Var2.B;
            if (num12 != null) {
                jn1Var.z = num12;
            }
            Integer num13 = kn1Var2.C;
            if (num13 != null) {
                jn1Var.A = num13;
            }
            CharSequence charSequence11 = kn1Var2.D;
            if (charSequence11 != null) {
                jn1Var.B = charSequence11;
            }
            CharSequence charSequence12 = kn1Var2.E;
            if (charSequence12 != null) {
                jn1Var.C = charSequence12;
            }
            CharSequence charSequence13 = kn1Var2.F;
            if (charSequence13 != null) {
                jn1Var.D = charSequence13;
            }
            Bundle bundle = kn1Var2.G;
            if (bundle != null) {
                jn1Var.E = bundle;
            }
        }
        return new kn1(jn1Var);
    }

    public final void d(nf2 nf2Var) {
        nf2Var.getClass();
        qg1 qg1Var = this.j;
        Iterator it = qg1Var.d.iterator();
        while (it.hasNext()) {
            pg1 pg1Var = (pg1) it.next();
            if (pg1Var.a.equals(nf2Var)) {
                og1 og1Var = qg1Var.c;
                pg1Var.d = true;
                if (pg1Var.c) {
                    og1Var.a(pg1Var.a, pg1Var.b.a());
                }
                qg1Var.d.remove(pg1Var);
            }
        }
    }

    public static long b(df2 df2Var) {
        v73 v73Var = new v73();
        t73 t73Var = new t73();
        df2Var.a.a(df2Var.b.a, t73Var);
        long j = df2Var.c;
        if (j == C.TIME_UNSET) {
            return df2Var.a.a(t73Var.d, v73Var, 0L).n;
        }
        return t73Var.f + j;
    }

    public final void b(do0 do0Var) {
        m63 m63Var = this.h;
        m63Var.a.post(new at6(10, this, do0Var));
    }

    public static void b(nf2 nf2Var) {
        nf2Var.a(new qn0(2, new mp0(1), 1003, 0));
    }

    public final void b(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.m.remove(i2);
        }
        wz2 wz2Var = this.E;
        int[] iArr = new int[wz2Var.b.length - i];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = wz2Var.b;
            if (i3 < iArr2.length) {
                int i5 = iArr2[i3];
                if (i5 < 0 || i5 >= i) {
                    int i6 = i3 - i4;
                    if (i5 >= 0) {
                        i5 -= i;
                    }
                    iArr[i6] = i5;
                } else {
                    i4++;
                }
                i3++;
            } else {
                this.E = new wz2(iArr, new Random(wz2Var.a.nextLong()));
                return;
            }
        }
    }

    public final cg2 a(bg2 bg2Var) {
        int i = i();
        ho0 ho0Var = this.i;
        w73 w73Var = this.Z.a;
        if (i == -1) {
            i = 0;
        }
        return new cg2(ho0Var, bg2Var, w73Var, i, this.r, ho0Var.k);
    }

    public final long a(df2 df2Var) {
        if (df2Var.a.c()) {
            return mc3.a(this.b0);
        }
        if (df2Var.b.a()) {
            return df2Var.r;
        }
        w73 w73Var = df2Var.a;
        zn1 zn1Var = df2Var.b;
        long j = df2Var.r;
        w73Var.a(zn1Var.a, this.l);
        return j + this.l.f;
    }

    public final /* synthetic */ void a(nf2 nf2Var, ew0 ew0Var) {
        nf2Var.getClass();
    }

    public final void a(do0 do0Var) {
        boolean z;
        int i = this.A - do0Var.c;
        this.A = i;
        boolean z2 = true;
        if (do0Var.d) {
            this.B = do0Var.e;
            this.C = true;
        }
        if (do0Var.f) {
            this.D = do0Var.g;
        }
        if (i == 0) {
            w73 w73Var = do0Var.b.a;
            if (!this.Z.a.c() && w73Var.c()) {
                this.a0 = -1;
                this.b0 = 0L;
            }
            if (!w73Var.c()) {
                List asList = Arrays.asList(((yg2) w73Var).j);
                if (asList.size() == this.m.size()) {
                    for (int i2 = 0; i2 < asList.size(); i2++) {
                        ((zn0) this.m.get(i2)).b = (w73) asList.get(i2);
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            boolean z3 = this.C;
            long j = C.TIME_UNSET;
            if (z3) {
                if (do0Var.b.b.equals(this.Z.b) && do0Var.b.d == this.Z.r) {
                    z2 = false;
                }
                if (z2) {
                    if (!w73Var.c() && !do0Var.b.b.a()) {
                        df2 df2Var = do0Var.b;
                        zn1 zn1Var = df2Var.b;
                        long j2 = df2Var.d;
                        w73Var.a(zn1Var.a, this.l);
                        j = j2 + this.l.f;
                    } else {
                        j = do0Var.b.d;
                    }
                }
                z = z2;
            } else {
                z = false;
            }
            long j3 = j;
            this.C = false;
            a(do0Var.b, 1, this.D, z, this.B, j3);
        }
    }

    public static /* synthetic */ void a(df2 df2Var, int i, nf2 nf2Var) {
        w73 w73Var = df2Var.a;
        nf2Var.a(i);
    }

    public static /* synthetic */ void a(int i, of2 of2Var, of2 of2Var2, nf2 nf2Var) {
        nf2Var.getClass();
        nf2Var.a(of2Var, of2Var2, i);
    }

    public final df2 a(df2 df2Var, yg2 yg2Var, Pair pair) {
        List list;
        long j;
        if (!yg2Var.c() && pair == null) {
            throw new IllegalArgumentException();
        }
        w73 w73Var = df2Var.a;
        df2 a = df2Var.a(yg2Var);
        if (yg2Var.c()) {
            zn1 zn1Var = df2.s;
            long a2 = mc3.a(this.b0);
            df2 a3 = a.a(zn1Var, a2, a2, a2, 0L, m83.e, this.b, tn2.f).a(zn1Var);
            a3.p = a3.r;
            return a3;
        }
        Object obj = a.b.a;
        int i = mc3.a;
        boolean equals = obj.equals(pair.first);
        zn1 zn1Var2 = !equals ? new zn1(pair.first) : a.b;
        long longValue = ((Long) pair.second).longValue();
        long a4 = mc3.a(b());
        if (!w73Var.c()) {
            a4 -= w73Var.a(obj, this.l).f;
        }
        if (!equals || longValue < a4) {
            zn1 zn1Var3 = zn1Var2;
            if (!zn1Var3.a()) {
                m83 m83Var = !equals ? m83.e : a.h;
                x83 x83Var = !equals ? this.b : a.i;
                if (!equals) {
                    p51 p51Var = s51.c;
                    list = tn2.f;
                } else {
                    list = a.j;
                }
                df2 a5 = a.a(zn1Var3, longValue, longValue, longValue, 0L, m83Var, x83Var, list).a(zn1Var3);
                a5.p = longValue;
                return a5;
            }
            throw new IllegalStateException();
        }
        if (longValue == a4) {
            int a6 = yg2Var.a(a.k.a);
            if (a6 != -1 && yg2Var.a(a6, this.l, false).d == yg2Var.a(zn1Var2.a, this.l).d) {
                return a;
            }
            yg2Var.a(zn1Var2.a, this.l);
            if (zn1Var2.a()) {
                j = this.l.a(zn1Var2.b, zn1Var2.c);
            } else {
                j = this.l.e;
            }
            zn1 zn1Var4 = zn1Var2;
            df2 a7 = a.a(zn1Var4, a.r, a.r, a.d, j - a.r, a.h, a.i, a.j).a(zn1Var4);
            a7.p = j;
            return a7;
        }
        zn1 zn1Var5 = zn1Var2;
        if (!zn1Var5.a()) {
            long max = Math.max(0L, a.q - (longValue - a4));
            long j2 = a.p;
            if (a.k.equals(a.b)) {
                j2 = longValue + max;
            }
            df2 a8 = a.a(zn1Var5, longValue, longValue, longValue, max, a.h, a.i, a.j);
            a8.p = j2;
            return a8;
        }
        throw new IllegalStateException();
    }

    public final Pair a(yg2 yg2Var, int i, long j) {
        if (yg2Var.c()) {
            this.a0 = i;
            if (j == C.TIME_UNSET) {
                j = 0;
            }
            this.b0 = j;
            return null;
        }
        if (i == -1 || i >= yg2Var.f) {
            i = yg2Var.a(false);
            j = mc3.b(yg2Var.a(i, this.a, 0L).n);
        }
        return yg2Var.a(this.a, this.l, i, mc3.a(j));
    }

    public final void a(final int i, final int i2) {
        if (i == this.P && i2 == this.Q) {
            return;
        }
        this.P = i;
        this.Q = i2;
        qg1 qg1Var = this.j;
        qg1Var.a(24, new ng1() { // from class: xsna.ody0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                ((yads.nf2) obj).onSurfaceSizeChanged(i, i2);
            }
        });
        qg1Var.a();
    }

    public final void a(int i, int i2, Object obj) {
        for (ro roVar : this.f) {
            if (roVar.b == i) {
                cg2 a = a(roVar);
                boolean z = a.g;
                if (!z) {
                    a.d = i2;
                    if (!z) {
                        a.e = obj;
                        a.a();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    public final void a(mo moVar) {
        r();
        List singletonList = Collections.singletonList(moVar);
        r();
        r();
        i();
        r();
        a(this.Z);
        int i = mc3.a;
        this.A++;
        if (!this.m.isEmpty()) {
            b(this.m.size());
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            ho1 ho1Var = new ho1((mo) singletonList.get(i2), this.n);
            arrayList.add(ho1Var);
            this.m.add(i2, new zn0(ho1Var.a.o, ho1Var.b));
        }
        this.E = this.E.a(arrayList.size());
        yg2 yg2Var = new yg2(this.m, this.E);
        if (!yg2Var.c() && -1 >= yg2Var.f) {
            throw new h31();
        }
        int a = yg2Var.a(false);
        df2 a2 = a(this.Z, yg2Var, a(yg2Var, a, C.TIME_UNSET));
        int i3 = a2.e;
        if (a != -1 && i3 != 1) {
            i3 = (yg2Var.c() || a >= yg2Var.f) ? 4 : 2;
        }
        df2 a3 = a2.a(i3);
        this.i.i.a(17, new co0(a, mc3.a(C.TIME_UNSET), this.E, arrayList)).b();
        a(a3, 0, 1, (this.Z.b.a.equals(a3.b.a) || this.Z.a.c()) ? false : true, 4, a(a3));
    }

    public final void a(boolean z) {
        r();
        yk ykVar = this.v;
        r();
        int a = ykVar.a(z, this.Z.e);
        int i = 1;
        if (z && a != 1) {
            i = 2;
        }
        a(a, i, z);
    }

    public final void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.J = surface;
    }

    public final void a(Surface surface) {
        ArrayList arrayList = new ArrayList();
        ro[] roVarArr = this.f;
        int length = roVarArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                ro roVar = roVarArr[i];
                if (roVar.b == 2) {
                    cg2 a = a(roVar);
                    boolean z2 = a.g;
                    if (!z2) {
                        a.d = 1;
                        if (!z2) {
                            a.e = surface;
                            arrayList.add(a.a());
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                i++;
            } else {
                Object obj = this.I;
                if (obj == null || obj == surface) {
                    z = false;
                } else {
                    try {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((cg2) it.next()).a(this.z);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (TimeoutException unused2) {
                    }
                    z = false;
                    Object obj2 = this.I;
                    Surface surface2 = this.J;
                    if (obj2 == surface2) {
                        surface2.release();
                        this.J = null;
                    }
                }
                this.I = surface;
                if (z) {
                    a(new qn0(2, new mp0(3), 1003, 0));
                    return;
                }
                return;
            }
        }
    }

    public final void a(TextureView textureView) {
        r();
        if (textureView == null) {
            r();
            o();
            a((Surface) null);
            a(0, 0);
            return;
        }
        o();
        this.N = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            ji1.d("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.s);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Surface) null);
            a(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            a(surface);
            this.J = surface;
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final void a(float f) {
        r();
        int i = mc3.a;
        final float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f, 1.0f));
        if (this.T == max) {
            return;
        }
        this.T = max;
        a(1, 2, Float.valueOf(this.v.g * max));
        qg1 qg1Var = this.j;
        qg1Var.a(22, new ng1() { // from class: xsna.ndy0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                ((yads.nf2) obj).onVolumeChanged(max);
            }
        });
        qg1Var.a();
    }

    public final void a(qn0 qn0Var) {
        df2 df2Var = this.Z;
        df2 a = df2Var.a(df2Var.b);
        a.p = a.r;
        a.q = 0L;
        df2 a2 = a.a(1);
        if (qn0Var != null) {
            a2 = a2.a(qn0Var);
        }
        df2 df2Var2 = a2;
        this.A++;
        m63 m63Var = this.i.i;
        m63Var.getClass();
        l63 a3 = m63.a();
        a3.a = m63Var.a.obtainMessage(6);
        a3.b();
        a(df2Var2, 0, 1, df2Var2.a.c() && !this.Z.a.c(), 4, a(df2Var2));
    }

    public final void a(int i, int i2, boolean z) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        df2 df2Var = this.Z;
        if (df2Var.l == z2 && df2Var.m == i3) {
            return;
        }
        this.A++;
        int i4 = i3;
        boolean z3 = z2;
        df2 df2Var2 = new df2(df2Var.a, df2Var.b, df2Var.c, df2Var.d, df2Var.e, df2Var.f, df2Var.g, df2Var.h, df2Var.i, df2Var.j, df2Var.k, z3, i4, df2Var.n, df2Var.p, df2Var.q, df2Var.r, df2Var.o);
        m63 m63Var = this.i.i;
        m63Var.getClass();
        l63 a = m63.a();
        a.a = m63Var.a.obtainMessage(1, z3 ? 1 : 0, i4);
        a.b();
        a(df2Var2, 0, i2, false, 5, C.TIME_UNSET);
    }

    public final void a(final df2 df2Var, int i, final int i2, boolean z, final int i3, long j) {
        int i4;
        Pair pair;
        int i5;
        final gn1 gn1Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj;
        int i6;
        gn1 gn1Var2;
        Object obj2;
        int i7;
        long j2;
        long j3;
        long j4;
        long b;
        Object obj3;
        gn1 gn1Var3;
        Object obj4;
        int i8;
        df2 df2Var2 = this.Z;
        this.Z = df2Var;
        boolean equals = df2Var2.a.equals(df2Var.a);
        w73 w73Var = df2Var2.a;
        w73 w73Var2 = df2Var.a;
        if (w73Var2.c() && w73Var.c()) {
            pair = new Pair(Boolean.FALSE, -1);
            i4 = 3;
        } else {
            i4 = 3;
            if (w73Var2.c() != w73Var.c()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (!w73Var.a(w73Var.a(df2Var2.b.a, this.l).d, this.a, 0L).b.equals(w73Var2.a(w73Var2.a(df2Var.b.a, this.l).d, this.a, 0L).b)) {
                if (z && i3 == 0) {
                    i5 = 1;
                } else if (z && i3 == 1) {
                    i5 = 2;
                } else {
                    if (equals) {
                        throw new IllegalStateException();
                    }
                    i5 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
            } else if (z && i3 == 0 && df2Var2.b.d < df2Var.b.d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        kn1 kn1Var = this.G;
        if (booleanValue) {
            gn1Var = !df2Var.a.c() ? df2Var.a.a(df2Var.a.a(df2Var.b.a, this.l).d, this.a, 0L).d : null;
            this.Y = kn1.H;
        } else {
            gn1Var = null;
        }
        if (booleanValue || !df2Var2.j.equals(df2Var.j)) {
            kn1 kn1Var2 = this.Y;
            kn1Var2.getClass();
            jn1 jn1Var = new jn1(kn1Var2);
            List list = df2Var.j;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ut1 ut1Var = (ut1) list.get(i9);
                int i10 = 0;
                while (true) {
                    tt1[] tt1VarArr = ut1Var.b;
                    if (i10 < tt1VarArr.length) {
                        tt1VarArr[i10].a(jn1Var);
                        i10++;
                    }
                }
            }
            this.Y = new kn1(jn1Var);
            kn1Var = a();
        }
        boolean equals2 = kn1Var.equals(this.G);
        this.G = kn1Var;
        boolean z6 = df2Var2.l != df2Var.l;
        boolean z7 = df2Var2.e != df2Var.e;
        if (z7 || z6) {
            q();
        }
        boolean z8 = df2Var2.g != df2Var.g;
        if (!df2Var2.a.equals(df2Var.a)) {
            this.j.a(0, new fel(df2Var, i));
        }
        if (z) {
            t73 t73Var = new t73();
            if (df2Var2.a.c()) {
                z2 = equals2;
                z3 = z7;
                z4 = z8;
                obj = null;
                i6 = -1;
                gn1Var2 = null;
                obj2 = null;
                i7 = -1;
            } else {
                Object obj5 = df2Var2.b.a;
                df2Var2.a.a(obj5, t73Var);
                int i11 = t73Var.d;
                int a = df2Var2.a.a(obj5);
                z2 = equals2;
                z3 = z7;
                z4 = z8;
                obj = df2Var2.a.a(i11, this.a, 0L).b;
                gn1Var2 = this.a.d;
                obj2 = obj5;
                i6 = i11;
                i7 = a;
            }
            if (i3 == 0) {
                if (df2Var2.b.a()) {
                    zn1 zn1Var = df2Var2.b;
                    j4 = t73Var.a(zn1Var.b, zn1Var.c);
                    b = b(df2Var2);
                } else if (df2Var2.b.e != -1) {
                    j4 = b(this.Z);
                    b = j4;
                } else {
                    j2 = t73Var.f;
                    j3 = t73Var.e;
                    j4 = j2 + j3;
                    b = j4;
                }
            } else if (df2Var2.b.a()) {
                j4 = df2Var2.r;
                b = b(df2Var2);
            } else {
                j2 = t73Var.f;
                j3 = df2Var2.r;
                j4 = j2 + j3;
                b = j4;
            }
            long b2 = mc3.b(j4);
            long b3 = mc3.b(b);
            zn1 zn1Var2 = df2Var2.b;
            final of2 of2Var = new of2(obj, i6, gn1Var2, obj2, i7, b2, b3, zn1Var2.b, zn1Var2.c);
            int e = e();
            if (this.Z.a.c()) {
                obj3 = null;
                gn1Var3 = null;
                obj4 = null;
                i8 = -1;
            } else {
                df2 df2Var3 = this.Z;
                Object obj6 = df2Var3.b.a;
                df2Var3.a.a(obj6, this.l);
                i8 = this.Z.a.a(obj6);
                obj4 = obj6;
                obj3 = this.Z.a.a(e, this.a, 0L).b;
                gn1Var3 = this.a.d;
            }
            long b4 = mc3.b(j);
            long b5 = this.Z.b.a() ? mc3.b(b(this.Z)) : b4;
            zn1 zn1Var3 = this.Z.b;
            final of2 of2Var2 = new of2(obj3, e, gn1Var3, obj4, i8, b4, b5, zn1Var3.b, zn1Var3.c);
            this.j.a(11, new ng1() { // from class: xsna.qdy0
                @Override // yads.ng1
                public final void invoke(Object obj7) {
                    yads.ao0.a(i3, of2Var, of2Var2, (yads.nf2) obj7);
                }
            });
        } else {
            z2 = equals2;
            z3 = z7;
            z4 = z8;
        }
        if (booleanValue) {
            z5 = true;
            this.j.a(1, new ng1() { // from class: xsna.rdy0
                @Override // yads.ng1
                public final void invoke(Object obj7) {
                    ((yads.nf2) obj7).a(yads.gn1.this, intValue);
                }
            });
        } else {
            z5 = true;
        }
        if (df2Var2.f != df2Var.f) {
            this.j.a(10, new utg0(df2Var, 12));
            if (df2Var.f != null) {
                this.j.a(10, new l340(df2Var, 25));
            }
        }
        x83 x83Var = df2Var2.i;
        x83 x83Var2 = df2Var.i;
        if (x83Var != x83Var2) {
            w83 w83Var = this.g;
            Object obj7 = x83Var2.e;
            ((nj1) w83Var).getClass();
            this.j.a(2, new nit(df2Var, 28));
        }
        if (!z2) {
            this.j.a(14, new a840(this.G, 19));
        }
        if (z4) {
            this.j.a(i4, new qca0(df2Var, 19));
        }
        if (z3 || z6) {
            this.j.a(-1, new p5w(df2Var, 29));
        }
        if (z3) {
            this.j.a(4, new yzt(df2Var, 27));
        }
        if (z6) {
            this.j.a(5, new ng1() { // from class: xsna.pdy0
                @Override // yads.ng1
                public final void invoke(Object obj8) {
                    ((yads.nf2) obj8).onPlayWhenReadyChanged(yads.df2.this.l, i2);
                }
            });
        }
        if (df2Var2.m != df2Var.m) {
            this.j.a(6, new nh40(df2Var, 27));
        }
        if (((df2Var2.e == 3 && df2Var2.l && df2Var2.m == 0) ? z5 : false) != ((df2Var.e == 3 && df2Var.l && df2Var.m == 0) ? z5 : false)) {
            this.j.a(7, new je40(df2Var, 24));
        }
        if (!df2Var2.n.equals(df2Var.n)) {
            this.j.a(12, new mau(df2Var, 21));
        }
        p();
        this.j.a();
        if (df2Var2.o != df2Var.o) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((xn0) ((rn0) it.next())).a.q();
            }
        }
    }

    public static ig0 a(g53 g53Var) {
        return new ig0(0, g53Var.a(), g53Var.d.getStreamMaxVolume(g53Var.g));
    }
}
