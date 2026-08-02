package androidx.media3.exoplayer;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import defpackage.a3x0;
import defpackage.a9z0;
import defpackage.aoo;
import defpackage.b32;
import defpackage.cyd;
import defpackage.d6z;
import defpackage.do31;
import defpackage.eoo;
import defpackage.fe10;
import defpackage.fyi0;
import defpackage.g7q0;
import defpackage.ga4;
import defpackage.ge10;
import defpackage.gfr;
import defpackage.h42;
import defpackage.hg10;
import defpackage.i630;
import defpackage.ip4;
import defpackage.j42;
import defpackage.j5h;
import defpackage.jxc0;
import defpackage.jy4;
import defpackage.jzc0;
import defpackage.kas0;
import defpackage.kyg;
import defpackage.kzc0;
import defpackage.las0;
import defpackage.lk91;
import defpackage.loo;
import defpackage.lxc0;
import defpackage.lyi0;
import defpackage.m001;
import defpackage.mh3;
import defpackage.nno;
import defpackage.ny61;
import defpackage.o2x0;
import defpackage.ol31;
import defpackage.ono;
import defpackage.owy;
import defpackage.oxe;
import defpackage.pno;
import defpackage.qe10;
import defpackage.qr7;
import defpackage.r001;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.rf10;
import defpackage.ruy;
import defpackage.rxc0;
import defpackage.s820;
import defpackage.sf10;
import defpackage.sno;
import defpackage.syi0;
import defpackage.tno;
import defpackage.tw21;
import defpackage.ue3;
import defpackage.uf10;
import defpackage.uhm;
import defpackage.uno;
import defpackage.unr0;
import defpackage.uuy;
import defpackage.uxc0;
import defpackage.v75;
import defpackage.vis0;
import defpackage.vno;
import defpackage.vxc0;
import defpackage.vyc0;
import defpackage.w4h;
import defpackage.w820;
import defpackage.wno;
import defpackage.wqj;
import defpackage.x001;
import defpackage.xaj;
import defpackage.xen;
import defpackage.xl31;
import defpackage.xm7;
import defpackage.xxc0;
import defpackage.xyc0;
import defpackage.y001;
import defpackage.y3c;
import defpackage.y8z0;
import defpackage.yno;
import defpackage.yxc0;
import defpackage.yyc0;
import defpackage.yzz0;
import defpackage.z8z0;
import defpackage.zgl;
import defpackage.zno;
import defpackage.zp1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes10.dex */
public final class f extends v75 implements ExoPlayer {
    public static final /* synthetic */ int y0 = 0;
    public final zno A;
    public final b B;
    public final i630 C;
    public final i630 D;
    public final long E;
    public final zp1 F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public g7q0 M;
    public las0 N;
    public pno O;
    public boolean P;
    public vxc0 Q;
    public re10 R;
    public re10 S;
    public androidx.media3.common.a T;
    public androidx.media3.common.a U;
    public Object V;
    public Surface W;
    public SurfaceHolder X;
    public SphericalGLSurfaceView Y;
    public boolean Z;
    public TextureView a0;
    public final y001 b;
    public int b0;
    public final vxc0 c;
    public int c0;
    public final cyd d = new cyd();
    public vis0 d0;
    public final Context e;
    public kyg e0;
    public final f f;
    public kyg f0;
    public final fyi0[] g;
    public ue3 g0;
    public final fyi0[] h;
    public float h0;
    public final x001 i;
    public boolean i0;
    public final a3x0 j;
    public rdf j0;
    public final wno k;
    public xl31 k0;
    public final ExoPlayerImplInternal l;
    public qr7 l0;
    public final uuy m;
    public final boolean m0;
    public final CopyOnWriteArraySet n;
    public boolean n0;
    public final y8z0 o;
    public int o0;
    public final ArrayList p;
    public PriorityTaskManager p0;
    public final boolean q;
    public boolean q0;
    public final rf10 r;
    public boolean r0;
    public final b32 s;
    public xaj s0;
    public final Looper t;
    public do31 t0;
    public final ip4 u;
    public re10 u0;
    public final long v;
    public jxc0 v0;
    public final long w;
    public int w0;
    public final long x;
    public long x0;
    public final o2x0 y;
    public final ExoPlayerImpl$ComponentListener z;

    static {
        ge10.a("media3.exoplayer");
    }

    public f(ono onoVar) {
        try {
            lk91.h("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.7.1] [" + tw21.b + "]");
            Context context = onoVar.a;
            o2x0 o2x0Var = onoVar.b;
            this.e = context.getApplicationContext();
            this.s = (b32) onoVar.h.mo489apply(o2x0Var);
            this.o0 = onoVar.j;
            this.p0 = onoVar.k;
            this.g0 = onoVar.l;
            this.b0 = onoVar.o;
            this.c0 = 0;
            this.i0 = false;
            this.E = onoVar.w;
            ExoPlayerImpl$ComponentListener exoPlayerImpl$ComponentListener = new ExoPlayerImpl$ComponentListener(this);
            this.z = exoPlayerImpl$ComponentListener;
            this.A = new zno();
            Handler handler = new Handler(onoVar.i);
            syi0 syi0Var = (syi0) onoVar.c.get();
            fyi0[] createRenderers = syi0Var.createRenderers(handler, exoPlayerImpl$ComponentListener, exoPlayerImpl$ComponentListener, exoPlayerImpl$ComponentListener, exoPlayerImpl$ComponentListener);
            this.g = createRenderers;
            int i = 1;
            d6z.x(createRenderers.length > 0);
            this.h = new fyi0[createRenderers.length];
            int i2 = 0;
            while (true) {
                fyi0[] fyi0VarArr = this.h;
                if (i2 >= fyi0VarArr.length) {
                    break;
                }
                fyi0 fyi0Var = this.g[i2];
                ExoPlayerImpl$ComponentListener exoPlayerImpl$ComponentListener2 = this.z;
                int i3 = i;
                syi0 syi0Var2 = syi0Var;
                Handler handler2 = handler;
                fyi0VarArr[i2] = syi0Var2.createSecondaryRenderer(fyi0Var, handler2, exoPlayerImpl$ComponentListener2, exoPlayerImpl$ComponentListener2, exoPlayerImpl$ComponentListener2, exoPlayerImpl$ComponentListener2);
                i2++;
                i = i3;
                syi0Var = syi0Var2;
                handler = handler2;
            }
            this.i = (x001) onoVar.e.get();
            this.r = (rf10) onoVar.d.get();
            this.u = (ip4) onoVar.g.get();
            this.q = onoVar.p;
            this.M = onoVar.q;
            this.v = onoVar.r;
            this.w = onoVar.s;
            this.x = onoVar.t;
            this.P = false;
            Looper looper = onoVar.i;
            this.t = looper;
            this.y = o2x0Var;
            this.f = this;
            this.m = new uuy(looper, o2x0Var, new wno(this, i));
            this.n = new CopyOnWriteArraySet();
            this.p = new ArrayList();
            this.N = new kas0();
            this.O = pno.a;
            fyi0[] fyi0VarArr2 = this.g;
            this.b = new y001(new lyi0[fyi0VarArr2.length], new loo[fyi0VarArr2.length], r801.b, null);
            this.o = new y8z0();
            uxc0 uxc0Var = new uxc0();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            gfr gfrVar = uxc0Var.a;
            gfrVar.getClass();
            for (int i4 = 0; i4 < 20; i4++) {
                gfrVar.a(iArr[i4]);
            }
            uxc0Var.b(29, this.i.isSetParametersSupported());
            uxc0Var.b(23, false);
            uxc0Var.b(25, false);
            uxc0Var.b(33, false);
            uxc0Var.b(26, false);
            uxc0Var.b(34, false);
            vxc0 c = uxc0Var.c();
            this.c = c;
            uxc0 uxc0Var2 = new uxc0();
            gfr gfrVar2 = uxc0Var2.a;
            uxc0Var2.a(c);
            gfrVar2.a(4);
            gfrVar2.a(10);
            this.Q = uxc0Var2.c();
            this.j = this.y.a(this.t, null);
            wno wnoVar = new wno(this, 2);
            this.k = wnoVar;
            this.v0 = jxc0.j(this.b);
            ((j5h) this.s).g(this.f, this.t);
            vyc0 vyc0Var = new vyc0(onoVar.z);
            ExoPlayerImplInternal exoPlayerImplInternal = new ExoPlayerImplInternal(this.e, this.g, this.h, this.i, this.b, (owy) onoVar.f.get(), this.u, this.G, this.H, this.s, this.M, onoVar.u, onoVar.v, this.P, false, this.t, this.y, wnoVar, vyc0Var, null, this.O);
            this.l = exoPlayerImplInternal;
            Looper playbackLooper = exoPlayerImplInternal.getPlaybackLooper();
            this.h0 = 1.0f;
            this.G = 0;
            re10 re10Var = re10.B;
            this.R = re10Var;
            this.S = re10Var;
            this.u0 = re10Var;
            this.w0 = -1;
            this.j0 = rdf.b;
            this.m0 = true;
            addListener(this.s);
            this.u.addEventListener(new Handler(this.t), this.s);
            addAudioOffloadListener(this.z);
            if (tw21.a >= 31) {
                this.y.a(exoPlayerImplInternal.getPlaybackLooper(), null).e(new yno(this.e, onoVar.x, this, vyc0Var));
            }
            zp1 zp1Var = new zp1((Object) 0, playbackLooper, this.t, this.y, new wno(this, 3));
            this.F = zp1Var;
            ((a3x0) zp1Var.b).e(new uhm(23, this));
            b bVar = new b(onoVar.a, playbackLooper, onoVar.i, this.z, this.y);
            this.B = bVar;
            bVar.a(onoVar.n);
            i630 i630Var = new i630(context, playbackLooper, this.y, 2);
            this.C = i630Var;
            i630Var.h(false);
            i630 i630Var2 = new i630(context, playbackLooper, this.y, 3);
            this.D = i630Var2;
            i630Var2.h(false);
            this.s0 = xaj.c;
            this.t0 = do31.d;
            this.d0 = vis0.c;
            exoPlayerImplInternal.setAudioAttributes(this.g0, onoVar.m);
            w(1, 3, this.g0);
            w(2, 4, Integer.valueOf(this.b0));
            w(2, 5, Integer.valueOf(this.c0));
            w(1, 9, Boolean.valueOf(this.i0));
            w(2, 7, this.A);
            w(6, 8, this.A);
            w(-1, 16, Integer.valueOf(this.o0));
            this.d.d();
        } catch (Throwable th) {
            this.d.d();
            throw th;
        }
    }

    public static long o(jxc0 jxc0Var) {
        z8z0 z8z0Var = new z8z0();
        y8z0 y8z0Var = new y8z0();
        jxc0Var.a.h(jxc0Var.b.a, y8z0Var);
        long j = jxc0Var.c;
        return j == -9223372036854775807L ? jxc0Var.a.n(y8z0Var.c, z8z0Var, 0L).k : y8z0Var.e + j;
    }

    public static jxc0 p(jxc0 jxc0Var, int i) {
        jxc0 h = jxc0Var.h(i);
        return (i == 1 || i == 4) ? h.b(false) : h;
    }

    public final void A(ExoPlaybackException exoPlaybackException) {
        jxc0 jxc0Var = this.v0;
        jxc0 c = jxc0Var.c(jxc0Var.b);
        c.q = c.s;
        c.r = 0L;
        jxc0 p = p(c, 1);
        if (exoPlaybackException != null) {
            p = p.f(exoPlaybackException);
        }
        this.I++;
        this.l.stop();
        D(p, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void B() {
        vxc0 vxc0Var = this.Q;
        int i = tw21.a;
        f fVar = this.f;
        boolean isPlayingAd = fVar.isPlayingAd();
        boolean isCurrentMediaItemSeekable = fVar.isCurrentMediaItemSeekable();
        boolean hasPreviousMediaItem = fVar.hasPreviousMediaItem();
        boolean hasNextMediaItem = fVar.hasNextMediaItem();
        boolean isCurrentMediaItemLive = fVar.isCurrentMediaItemLive();
        boolean isCurrentMediaItemDynamic = fVar.isCurrentMediaItemDynamic();
        boolean q = fVar.getCurrentTimeline().q();
        uxc0 uxc0Var = new uxc0();
        uxc0Var.a(this.c);
        boolean z = !isPlayingAd;
        int i2 = 4;
        uxc0Var.b(4, z);
        boolean z2 = false;
        uxc0Var.b(5, isCurrentMediaItemSeekable && !isPlayingAd);
        uxc0Var.b(6, hasPreviousMediaItem && !isPlayingAd);
        uxc0Var.b(7, !q && (hasPreviousMediaItem || !isCurrentMediaItemLive || isCurrentMediaItemSeekable) && !isPlayingAd);
        uxc0Var.b(8, hasNextMediaItem && !isPlayingAd);
        uxc0Var.b(9, !q && (hasNextMediaItem || (isCurrentMediaItemLive && isCurrentMediaItemDynamic)) && !isPlayingAd);
        uxc0Var.b(10, z);
        uxc0Var.b(11, isCurrentMediaItemSeekable && !isPlayingAd);
        if (isCurrentMediaItemSeekable && !isPlayingAd) {
            z2 = true;
        }
        uxc0Var.b(12, z2);
        vxc0 c = uxc0Var.c();
        this.Q = c;
        if (c.equals(vxc0Var)) {
            return;
        }
        this.m.c(13, new wno(this, i2));
    }

    public final void C(int i, boolean z) {
        jxc0 jxc0Var = this.v0;
        int i2 = jxc0Var.n;
        int i3 = (i2 != 1 || z) ? 0 : 1;
        if (jxc0Var.l == z && i2 == i3 && jxc0Var.m == i) {
            return;
        }
        this.I++;
        if (jxc0Var.p) {
            jxc0Var = jxc0Var.a();
        }
        jxc0 e = jxc0Var.e(i, i3, z);
        this.l.setPlayWhenReady(z, i, i3);
        D(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void D(final jxc0 jxc0Var, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        fe10 fe10Var;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        Object obj;
        fe10 fe10Var2;
        Object obj2;
        int i6;
        long j2;
        long j3;
        long j4;
        long o;
        Object obj3;
        fe10 fe10Var3;
        Object obj4;
        int i7;
        PriorityTaskManager priorityTaskManager;
        jxc0 jxc0Var2 = this.v0;
        this.v0 = jxc0Var;
        boolean equals = jxc0Var2.a.equals(jxc0Var.a);
        z8z0 z8z0Var = this.a;
        y8z0 y8z0Var = this.o;
        a9z0 a9z0Var = jxc0Var2.a;
        sf10 sf10Var = jxc0Var2.b;
        a9z0 a9z0Var2 = jxc0Var.a;
        sf10 sf10Var2 = jxc0Var.b;
        int i8 = 2;
        int i9 = 3;
        if (a9z0Var2.q() && a9z0Var.q()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (a9z0Var2.q() != a9z0Var.q()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (a9z0Var.n(a9z0Var.h(sf10Var.a, y8z0Var).c, z8z0Var, 0L).a.equals(a9z0Var2.n(a9z0Var2.h(sf10Var2.a, y8z0Var).c, z8z0Var, 0L).a)) {
            pair = (z && i2 == 0 && sf10Var.d < sf10Var2.d) ? new Pair(Boolean.TRUE, 0) : (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (equals) {
                    ny61.k();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            fe10Var = !jxc0Var.a.q() ? jxc0Var.a.n(jxc0Var.a.h(jxc0Var.b.a, this.o).c, this.a, 0L).b : null;
            this.u0 = re10.B;
        } else {
            fe10Var = null;
        }
        if (booleanValue || !jxc0Var2.j.equals(jxc0Var.j)) {
            qe10 a = this.u0.a();
            List list = jxc0Var.j;
            for (int i10 = 0; i10 < list.size(); i10++) {
                w820 w820Var = (w820) list.get(i10);
                int i11 = 0;
                while (true) {
                    s820[] s820VarArr = w820Var.a;
                    if (i11 < s820VarArr.length) {
                        s820VarArr[i11].populateMediaMetadata(a);
                        i11++;
                    }
                }
            }
            this.u0 = new re10(a);
        }
        re10 g = g();
        boolean equals2 = g.equals(this.R);
        this.R = g;
        boolean z6 = jxc0Var2.l != jxc0Var.l;
        boolean z7 = jxc0Var2.e != jxc0Var.e;
        if (z7 || z6) {
            E();
        }
        boolean z8 = jxc0Var2.g;
        boolean z9 = jxc0Var.g;
        boolean z10 = z8 != z9;
        if (z10 && (priorityTaskManager = this.p0) != null) {
            if (z9 && !this.q0) {
                priorityTaskManager.a(this.o0);
                this.q0 = true;
            } else if (!z9 && this.q0) {
                priorityTaskManager.d(this.o0);
                this.q0 = false;
            }
        }
        if (!equals) {
            this.m.c(0, new jy4(jxc0Var, i, i9));
        }
        if (z) {
            y8z0 y8z0Var2 = new y8z0();
            if (jxc0Var2.a.q()) {
                z3 = booleanValue;
                z4 = equals2;
                z5 = z7;
                i5 = i3;
                obj = null;
                fe10Var2 = null;
                obj2 = null;
                i6 = -1;
            } else {
                Object obj5 = jxc0Var2.b.a;
                jxc0Var2.a.h(obj5, y8z0Var2);
                int i12 = y8z0Var2.c;
                int b = jxc0Var2.a.b(obj5);
                z3 = booleanValue;
                z4 = equals2;
                z5 = z7;
                obj = jxc0Var2.a.n(i12, this.a, 0L).a;
                fe10Var2 = this.a.b;
                obj2 = obj5;
                i5 = i12;
                i6 = b;
            }
            sf10 sf10Var3 = jxc0Var2.b;
            if (i2 == 0) {
                boolean b2 = sf10Var3.b();
                sf10 sf10Var4 = jxc0Var2.b;
                if (b2) {
                    j4 = y8z0Var2.a(sf10Var4.b, sf10Var4.c);
                    o = o(jxc0Var2);
                } else if (sf10Var4.e != -1) {
                    j4 = o(this.v0);
                    o = j4;
                } else {
                    j2 = y8z0Var2.e;
                    j3 = y8z0Var2.d;
                    j4 = j2 + j3;
                    o = j4;
                }
            } else if (sf10Var3.b()) {
                j4 = jxc0Var2.s;
                o = o(jxc0Var2);
            } else {
                j2 = y8z0Var2.e;
                j3 = jxc0Var2.s;
                j4 = j2 + j3;
                o = j4;
            }
            long l0 = tw21.l0(j4);
            long l02 = tw21.l0(o);
            sf10 sf10Var5 = jxc0Var2.b;
            yxc0 yxc0Var = new yxc0(obj, i5, fe10Var2, obj2, i6, l0, l02, sf10Var5.b, sf10Var5.c);
            z8z0 z8z0Var2 = this.a;
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            if (this.v0.a.q()) {
                obj3 = null;
                fe10Var3 = null;
                obj4 = null;
                i7 = -1;
            } else {
                jxc0 jxc0Var3 = this.v0;
                Object obj6 = jxc0Var3.b.a;
                jxc0Var3.a.h(obj6, this.o);
                int b3 = this.v0.a.b(obj6);
                Object obj7 = this.v0.a.n(currentMediaItemIndex, z8z0Var2, 0L).a;
                fe10Var3 = z8z0Var2.b;
                i7 = b3;
                obj4 = obj6;
                obj3 = obj7;
            }
            long l03 = tw21.l0(j);
            long l04 = this.v0.b.b() ? tw21.l0(o(this.v0)) : l03;
            sf10 sf10Var6 = this.v0.b;
            this.m.c(11, new xm7(i2, yxc0Var, new yxc0(obj3, currentMediaItemIndex, fe10Var3, obj4, i7, l03, l04, sf10Var6.b, sf10Var6.c), i8));
        } else {
            z3 = booleanValue;
            z4 = equals2;
            z5 = z7;
        }
        final int i13 = 5;
        if (z3) {
            this.m.c(1, new jy4(fe10Var, intValue, i13));
        }
        final int i14 = 7;
        if (jxc0Var2.f != jxc0Var.f) {
            this.m.c(10, new ruy() { // from class: rno
                @Override // defpackage.ruy
                public final void invoke(Object obj8) {
                    int i15 = i14;
                    jxc0 jxc0Var4 = jxc0Var;
                    xxc0 xxc0Var = (xxc0) obj8;
                    switch (i15) {
                        case 0:
                            xxc0Var.onLoadingChanged(jxc0Var4.g);
                            xxc0Var.onIsLoadingChanged(jxc0Var4.g);
                            break;
                        case 1:
                            xxc0Var.onPlayerStateChanged(jxc0Var4.l, jxc0Var4.e);
                            break;
                        case 2:
                            xxc0Var.onPlaybackStateChanged(jxc0Var4.e);
                            break;
                        case 3:
                            xxc0Var.onPlayWhenReadyChanged(jxc0Var4.l, jxc0Var4.m);
                            break;
                        case 4:
                            xxc0Var.onPlaybackSuppressionReasonChanged(jxc0Var4.n);
                            break;
                        case 5:
                            xxc0Var.onIsPlayingChanged(jxc0Var4.l());
                            break;
                        case 6:
                            xxc0Var.onPlaybackParametersChanged(jxc0Var4.o);
                            break;
                        case 7:
                            xxc0Var.onPlayerErrorChanged(jxc0Var4.f);
                            break;
                        case 8:
                            xxc0Var.onPlayerError(jxc0Var4.f);
                            break;
                        default:
                            xxc0Var.onTracksChanged(jxc0Var4.i.d);
                            break;
                    }
                }
            });
            if (jxc0Var.f != null) {
                final int i15 = 8;
                this.m.c(10, new ruy() { // from class: rno
                    @Override // defpackage.ruy
                    public final void invoke(Object obj8) {
                        int i152 = i15;
                        jxc0 jxc0Var4 = jxc0Var;
                        xxc0 xxc0Var = (xxc0) obj8;
                        switch (i152) {
                            case 0:
                                xxc0Var.onLoadingChanged(jxc0Var4.g);
                                xxc0Var.onIsLoadingChanged(jxc0Var4.g);
                                break;
                            case 1:
                                xxc0Var.onPlayerStateChanged(jxc0Var4.l, jxc0Var4.e);
                                break;
                            case 2:
                                xxc0Var.onPlaybackStateChanged(jxc0Var4.e);
                                break;
                            case 3:
                                xxc0Var.onPlayWhenReadyChanged(jxc0Var4.l, jxc0Var4.m);
                                break;
                            case 4:
                                xxc0Var.onPlaybackSuppressionReasonChanged(jxc0Var4.n);
                                break;
                            case 5:
                                xxc0Var.onIsPlayingChanged(jxc0Var4.l());
                                break;
                            case 6:
                                xxc0Var.onPlaybackParametersChanged(jxc0Var4.o);
                                break;
                            case 7:
                                xxc0Var.onPlayerErrorChanged(jxc0Var4.f);
                                break;
                            case 8:
                                xxc0Var.onPlayerError(jxc0Var4.f);
                                break;
                            default:
                                xxc0Var.onTracksChanged(jxc0Var4.i.d);
                                break;
                        }
                    }
                });
            }
        }
        y001 y001Var = jxc0Var2.i;
        y001 y001Var2 = jxc0Var.i;
        if (y001Var != y001Var2) {
            this.i.onSelectionActivated(y001Var2.e);
            final int i16 = 9;
            this.m.c(2, new ruy() { // from class: rno
                @Override // defpackage.ruy
                public final void invoke(Object obj8) {
                    int i152 = i16;
                    jxc0 jxc0Var4 = jxc0Var;
                    xxc0 xxc0Var = (xxc0) obj8;
                    switch (i152) {
                        case 0:
                            xxc0Var.onLoadingChanged(jxc0Var4.g);
                            xxc0Var.onIsLoadingChanged(jxc0Var4.g);
                            break;
                        case 1:
                            xxc0Var.onPlayerStateChanged(jxc0Var4.l, jxc0Var4.e);
                            break;
                        case 2:
                            xxc0Var.onPlaybackStateChanged(jxc0Var4.e);
                            break;
                        case 3:
                            xxc0Var.onPlayWhenReadyChanged(jxc0Var4.l, jxc0Var4.m);
                            break;
                        case 4:
                            xxc0Var.onPlaybackSuppressionReasonChanged(jxc0Var4.n);
                            break;
                        case 5:
                            xxc0Var.onIsPlayingChanged(jxc0Var4.l());
                            break;
                        case 6:
                            xxc0Var.onPlaybackParametersChanged(jxc0Var4.o);
                            break;
                        case 7:
                            xxc0Var.onPlayerErrorChanged(jxc0Var4.f);
                            break;
                        case 8:
                            xxc0Var.onPlayerError(jxc0Var4.f);
                            break;
                        default:
                            xxc0Var.onTracksChanged(jxc0Var4.i.d);
                            break;
                    }
                }
            });
        }
        final int i17 = 4;
        if (!z4) {
            this.m.c(14, new xen(i17, this.R));
        }
        if (z10) {
            final int i18 = 0;
            this.m.c(3, new ruy() { // from class: rno
                @Override // defpackage.ruy
                public final void invoke(Object obj8) {
                    int i152 = i18;
                    jxc0 jxc0Var4 = jxc0Var;
                    xxc0 xxc0Var = (xxc0) obj8;
                    switch (i152) {
                        case 0:
                            xxc0Var.onLoadingChanged(jxc0Var4.g);
                            xxc0Var.onIsLoadingChanged(jxc0Var4.g);
                            break;
                        case 1:
                            xxc0Var.onPlayerStateChanged(jxc0Var4.l, jxc0Var4.e);
                            break;
                        case 2:
                            xxc0Var.onPlaybackStateChanged(jxc0Var4.e);
                            break;
                        case 3:
                            xxc0Var.onPlayWhenReadyChanged(jxc0Var4.l, jxc0Var4.m);
                            break;
                        case 4:
                            xxc0Var.onPlaybackSuppressionReasonChanged(jxc0Var4.n);
                            break;
                        case 5:
                            xxc0Var.onIsPlayingChanged(jxc0Var4.l());
                            break;
                        case 6:
                            xxc0Var.onPlaybackParametersChanged(jxc0Var4.o);
                            break;
                        case 7:
                            xxc0Var.onPlayerErrorChanged(jxc0Var4.f);
                            break;
                        case 8:
                            xxc0Var.onPlayerError(jxc0Var4.f);
                            break;
                        default:
                            xxc0Var.onTracksChanged(jxc0Var4.i.d);
                            break;
                    }
                }
            });
        }
        if (z5 || z6) {
            final int i19 = 1;
            this.m.c(-1, new ruy() { // from class: rno
                @Override // defpackage.ruy
                public final void invoke(Object obj8) {
                    int i152 = i19;
                    jxc0 jxc0Var4 = jxc0Var;
                    xxc0 xxc0Var = (xxc0) obj8;
                    switch (i152) {
                        case 0:
                            xxc0Var.onLoadingChanged(jxc0Var4.g);
                            xxc0Var.onIsLoadingChanged(jxc0Var4.g);
                            break;
                        case 1:
                            xxc0Var.onPlayerStateChanged(jxc0Var4.l, jxc0Var4.e);
                            break;
                        case 2:
                            xxc0Var.onPlaybackStateChanged(jxc0Var4.e);
                            break;
                        case 3:
                            xxc0Var.onPlayWhenReadyChanged(jxc0Var4.l, jxc0Var4.m);
                            break;
                        case 4:
                            xxc0Var.onPlaybackSuppressionReasonChanged(jxc0Var4.n);
                            break;
                        case 5:
                            xxc0Var.onIsPlayingChanged(jxc0Var4.l());
                            break;
                        case 6:
                            xxc0Var.onPlaybackParametersChanged(jxc0Var4.o);
                            break;
                        case 7:
                            xxc0Var.onPlayerErrorChanged(jxc0Var4.f);
                            break;
                        case 8:
                            xxc0Var.onPlayerError(jxc0Var4.f);
                            break;
                        default:
                            xxc0Var.onTracksChanged(jxc0Var4.i.d);
                            break;
                    }
                }
            });
        }
        if (z5) {
            final int i20 = 2;
            this.m.c(4, new ruy() { // from class: rno
                @Override // defpackage.ruy
                public final void invoke(Object obj8) {
                    int i152 = i20;
                    jxc0 jxc0Var4 = jxc0Var;
                    xxc0 xxc0Var = (xxc0) obj8;
                    switch (i152) {
                        case 0:
                            xxc0Var.onLoadingChanged(jxc0Var4.g);
                            xxc0Var.onIsLoadingChanged(jxc0Var4.g);
                            break;
                        case 1:
                            xxc0Var.onPlayerStateChanged(jxc0Var4.l, jxc0Var4.e);
                            break;
                        case 2:
                            xxc0Var.onPlaybackStateChanged(jxc0Var4.e);
                            break;
                        case 3:
                            xxc0Var.onPlayWhenReadyChanged(jxc0Var4.l, jxc0Var4.m);
                            break;
                        case 4:
                            xxc0Var.onPlaybackSuppressionReasonChanged(jxc0Var4.n);
                            break;
                        case 5:
                            xxc0Var.onIsPlayingChanged(jxc0Var4.l());
                            break;
                        case 6:
                            xxc0Var.onPlaybackParametersChanged(jxc0Var4.o);
                            break;
                        case 7:
                            xxc0Var.onPlayerErrorChanged(jxc0Var4.f);
                            break;
                        case 8:
                            xxc0Var.onPlayerError(jxc0Var4.f);
                            break;
                        default:
                            xxc0Var.onTracksChanged(jxc0Var4.i.d);
                            break;
                    }
                }
            });
        }
        if (z6 || jxc0Var2.m != jxc0Var.m) {
            final int i21 = 3;
            this.m.c(5, new ruy() { // from class: rno
                @Override // defpackage.ruy
                public final void invoke(Object obj8) {
                    int i152 = i21;
                    jxc0 jxc0Var4 = jxc0Var;
                    xxc0 xxc0Var = (xxc0) obj8;
                    switch (i152) {
                        case 0:
                            xxc0Var.onLoadingChanged(jxc0Var4.g);
                            xxc0Var.onIsLoadingChanged(jxc0Var4.g);
                            break;
                        case 1:
                            xxc0Var.onPlayerStateChanged(jxc0Var4.l, jxc0Var4.e);
                            break;
                        case 2:
                            xxc0Var.onPlaybackStateChanged(jxc0Var4.e);
                            break;
                        case 3:
                            xxc0Var.onPlayWhenReadyChanged(jxc0Var4.l, jxc0Var4.m);
                            break;
                        case 4:
                            xxc0Var.onPlaybackSuppressionReasonChanged(jxc0Var4.n);
                            break;
                        case 5:
                            xxc0Var.onIsPlayingChanged(jxc0Var4.l());
                            break;
                        case 6:
                            xxc0Var.onPlaybackParametersChanged(jxc0Var4.o);
                            break;
                        case 7:
                            xxc0Var.onPlayerErrorChanged(jxc0Var4.f);
                            break;
                        case 8:
                            xxc0Var.onPlayerError(jxc0Var4.f);
                            break;
                        default:
                            xxc0Var.onTracksChanged(jxc0Var4.i.d);
                            break;
                    }
                }
            });
        }
        final int i22 = 6;
        if (jxc0Var2.n != jxc0Var.n) {
            this.m.c(6, new ruy() { // from class: rno
                @Override // defpackage.ruy
                public final void invoke(Object obj8) {
                    int i152 = i17;
                    jxc0 jxc0Var4 = jxc0Var;
                    xxc0 xxc0Var = (xxc0) obj8;
                    switch (i152) {
                        case 0:
                            xxc0Var.onLoadingChanged(jxc0Var4.g);
                            xxc0Var.onIsLoadingChanged(jxc0Var4.g);
                            break;
                        case 1:
                            xxc0Var.onPlayerStateChanged(jxc0Var4.l, jxc0Var4.e);
                            break;
                        case 2:
                            xxc0Var.onPlaybackStateChanged(jxc0Var4.e);
                            break;
                        case 3:
                            xxc0Var.onPlayWhenReadyChanged(jxc0Var4.l, jxc0Var4.m);
                            break;
                        case 4:
                            xxc0Var.onPlaybackSuppressionReasonChanged(jxc0Var4.n);
                            break;
                        case 5:
                            xxc0Var.onIsPlayingChanged(jxc0Var4.l());
                            break;
                        case 6:
                            xxc0Var.onPlaybackParametersChanged(jxc0Var4.o);
                            break;
                        case 7:
                            xxc0Var.onPlayerErrorChanged(jxc0Var4.f);
                            break;
                        case 8:
                            xxc0Var.onPlayerError(jxc0Var4.f);
                            break;
                        default:
                            xxc0Var.onTracksChanged(jxc0Var4.i.d);
                            break;
                    }
                }
            });
        }
        if (jxc0Var2.l() != jxc0Var.l()) {
            this.m.c(7, new ruy() { // from class: rno
                @Override // defpackage.ruy
                public final void invoke(Object obj8) {
                    int i152 = i13;
                    jxc0 jxc0Var4 = jxc0Var;
                    xxc0 xxc0Var = (xxc0) obj8;
                    switch (i152) {
                        case 0:
                            xxc0Var.onLoadingChanged(jxc0Var4.g);
                            xxc0Var.onIsLoadingChanged(jxc0Var4.g);
                            break;
                        case 1:
                            xxc0Var.onPlayerStateChanged(jxc0Var4.l, jxc0Var4.e);
                            break;
                        case 2:
                            xxc0Var.onPlaybackStateChanged(jxc0Var4.e);
                            break;
                        case 3:
                            xxc0Var.onPlayWhenReadyChanged(jxc0Var4.l, jxc0Var4.m);
                            break;
                        case 4:
                            xxc0Var.onPlaybackSuppressionReasonChanged(jxc0Var4.n);
                            break;
                        case 5:
                            xxc0Var.onIsPlayingChanged(jxc0Var4.l());
                            break;
                        case 6:
                            xxc0Var.onPlaybackParametersChanged(jxc0Var4.o);
                            break;
                        case 7:
                            xxc0Var.onPlayerErrorChanged(jxc0Var4.f);
                            break;
                        case 8:
                            xxc0Var.onPlayerError(jxc0Var4.f);
                            break;
                        default:
                            xxc0Var.onTracksChanged(jxc0Var4.i.d);
                            break;
                    }
                }
            });
        }
        if (!jxc0Var2.o.equals(jxc0Var.o)) {
            this.m.c(12, new ruy() { // from class: rno
                @Override // defpackage.ruy
                public final void invoke(Object obj8) {
                    int i152 = i22;
                    jxc0 jxc0Var4 = jxc0Var;
                    xxc0 xxc0Var = (xxc0) obj8;
                    switch (i152) {
                        case 0:
                            xxc0Var.onLoadingChanged(jxc0Var4.g);
                            xxc0Var.onIsLoadingChanged(jxc0Var4.g);
                            break;
                        case 1:
                            xxc0Var.onPlayerStateChanged(jxc0Var4.l, jxc0Var4.e);
                            break;
                        case 2:
                            xxc0Var.onPlaybackStateChanged(jxc0Var4.e);
                            break;
                        case 3:
                            xxc0Var.onPlayWhenReadyChanged(jxc0Var4.l, jxc0Var4.m);
                            break;
                        case 4:
                            xxc0Var.onPlaybackSuppressionReasonChanged(jxc0Var4.n);
                            break;
                        case 5:
                            xxc0Var.onIsPlayingChanged(jxc0Var4.l());
                            break;
                        case 6:
                            xxc0Var.onPlaybackParametersChanged(jxc0Var4.o);
                            break;
                        case 7:
                            xxc0Var.onPlayerErrorChanged(jxc0Var4.f);
                            break;
                        case 8:
                            xxc0Var.onPlayerError(jxc0Var4.f);
                            break;
                        default:
                            xxc0Var.onTracksChanged(jxc0Var4.i.d);
                            break;
                    }
                }
            });
        }
        B();
        this.m.b();
        if (jxc0Var2.p != jxc0Var.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((nno) it.next()).onSleepingForOffloadChanged(jxc0Var.p);
            }
        }
    }

    public final void E() {
        int playbackState = getPlaybackState();
        i630 i630Var = this.D;
        i630 i630Var2 = this.C;
        boolean z = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                boolean isSleepingForOffload = isSleepingForOffload();
                if (getPlayWhenReady() && !isSleepingForOffload) {
                    z = true;
                }
                i630Var2.i(z);
                i630Var.i(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                ny61.k();
                return;
            }
        }
        i630Var2.i(false);
        i630Var.i(false);
    }

    public final void F() {
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i = tw21.a;
            Locale locale = Locale.US;
            String p = unr0.p("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.m0) {
                ny61.r(p);
            } else {
                lk91.k(p, this.n0 ? null : new IllegalStateException());
                this.n0 = true;
            }
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addAnalyticsListener(j42 j42Var) {
        j42Var.getClass();
        j5h j5hVar = (j5h) this.s;
        j5hVar.getClass();
        j5hVar.y.a(j42Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addAudioOffloadListener(nno nnoVar) {
        this.n.add(nnoVar);
    }

    @Override // defpackage.zxc0
    public final void addListener(xxc0 xxc0Var) {
        xxc0Var.getClass();
        this.m.a(xxc0Var);
    }

    @Override // defpackage.zxc0
    public final void addMediaItems(int i, List list) {
        F();
        addMediaSources(i, i(list));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addMediaSource(uf10 uf10Var) {
        F();
        addMediaSources(Collections.singletonList(uf10Var));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addMediaSources(int i, List list) {
        F();
        d6z.l(i >= 0);
        ArrayList arrayList = this.p;
        int min = Math.min(i, arrayList.size());
        if (arrayList.isEmpty()) {
            setMediaSources(list, this.w0 == -1);
        } else {
            D(f(this.v0, min, list), 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    @Override // defpackage.v75
    public final void b(boolean z, int i, long j) {
        F();
        if (i == -1) {
            return;
        }
        int i2 = 0;
        d6z.l(i >= 0);
        a9z0 a9z0Var = this.v0.a;
        if (a9z0Var.q() || i < a9z0Var.p()) {
            j5h j5hVar = (j5h) this.s;
            if (!j5hVar.B) {
                h42 a = j5hVar.a();
                j5hVar.B = true;
                j5hVar.f(a, -1, new w4h(a, i2));
            }
            this.I++;
            if (isPlayingAd()) {
                lk91.j("seekTo ignored because an ad is playing");
                eoo eooVar = new eoo(this.v0);
                eooVar.a(1);
                f fVar = this.k.b;
                fVar.j.e(new wqj(29, fVar, eooVar));
                return;
            }
            jxc0 jxc0Var = this.v0;
            int i3 = jxc0Var.e;
            if (i3 == 3 || (i3 == 4 && !a9z0Var.q())) {
                jxc0Var = this.v0.h(2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            jxc0 q = q(jxc0Var, a9z0Var, r(a9z0Var, i, j));
            this.l.seekTo(a9z0Var, i, tw21.W(j));
            D(q, 0, true, 1, l(q), currentMediaItemIndex, z);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void clearAuxEffectInfo() {
        F();
        setAuxEffectInfo(new ga4());
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void clearCameraMotionListener(qr7 qr7Var) {
        F();
        if (this.l0 != qr7Var) {
            return;
        }
        yyc0 j = j(this.A);
        j.d(8);
        j.c(null);
        j.b();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void clearVideoFrameMetadataListener(xl31 xl31Var) {
        F();
        if (this.k0 != xl31Var) {
            return;
        }
        yyc0 j = j(this.A);
        j.d(7);
        j.c(null);
        j.b();
    }

    @Override // defpackage.zxc0
    public final void clearVideoSurface() {
        F();
        v();
        z(null);
        s(0, 0);
    }

    @Override // defpackage.zxc0
    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        F();
        if (surfaceHolder == null || surfaceHolder != this.X) {
            return;
        }
        clearVideoSurface();
    }

    @Override // defpackage.zxc0
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        F();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // defpackage.zxc0
    public final void clearVideoTextureView(TextureView textureView) {
        F();
        if (textureView == null || textureView != this.a0) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final yyc0 createMessage(xyc0 xyc0Var) {
        F();
        return j(xyc0Var);
    }

    @Override // defpackage.zxc0
    public final void decreaseDeviceVolume() {
        F();
    }

    public final ArrayList e(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            hg10 hg10Var = new hg10((uf10) list.get(i2), this.q);
            arrayList.add(hg10Var);
            aoo aooVar = new aoo(hg10Var.b, hg10Var.a);
            this.p.add(i2 + i, aooVar);
        }
        this.N = ((kas0) this.N).a(i, arrayList.size());
        return arrayList;
    }

    public final jxc0 f(jxc0 jxc0Var, int i, List list) {
        a9z0 a9z0Var = jxc0Var.a;
        this.I++;
        ArrayList e = e(i, list);
        kzc0 h = h();
        jxc0 q = q(jxc0Var, h, n(a9z0Var, h, m(jxc0Var), k(jxc0Var)));
        this.l.addMediaSources(i, e, this.N);
        return q;
    }

    public final re10 g() {
        a9z0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.q()) {
            return this.u0;
        }
        fe10 fe10Var = currentTimeline.n(getCurrentMediaItemIndex(), this.a, 0L).b;
        qe10 a = this.u0.a();
        re10 re10Var = fe10Var.d;
        if (re10Var != null) {
            ImmutableList immutableList = re10Var.A;
            byte[] bArr = re10Var.f;
            CharSequence charSequence = re10Var.a;
            if (charSequence != null) {
                a.a = charSequence;
            }
            CharSequence charSequence2 = re10Var.b;
            if (charSequence2 != null) {
                a.b = charSequence2;
            }
            CharSequence charSequence3 = re10Var.c;
            if (charSequence3 != null) {
                a.c = charSequence3;
            }
            CharSequence charSequence4 = re10Var.d;
            if (charSequence4 != null) {
                a.d = charSequence4;
            }
            CharSequence charSequence5 = re10Var.e;
            if (charSequence5 != null) {
                a.e = charSequence5;
            }
            if (bArr != null) {
                Integer num = re10Var.g;
                a.f = bArr == null ? null : (byte[]) bArr.clone();
                a.g = num;
            }
            Integer num2 = re10Var.h;
            if (num2 != null) {
                a.h = num2;
            }
            Integer num3 = re10Var.i;
            if (num3 != null) {
                a.i = num3;
            }
            Integer num4 = re10Var.j;
            if (num4 != null) {
                a.j = num4;
            }
            Boolean bool = re10Var.k;
            if (bool != null) {
                a.k = bool;
            }
            Integer num5 = re10Var.l;
            if (num5 != null) {
                a.l = num5;
            }
            Integer num6 = re10Var.m;
            if (num6 != null) {
                a.l = num6;
            }
            Integer num7 = re10Var.n;
            if (num7 != null) {
                a.m = num7;
            }
            Integer num8 = re10Var.o;
            if (num8 != null) {
                a.n = num8;
            }
            Integer num9 = re10Var.p;
            if (num9 != null) {
                a.o = num9;
            }
            Integer num10 = re10Var.q;
            if (num10 != null) {
                a.p = num10;
            }
            Integer num11 = re10Var.r;
            if (num11 != null) {
                a.q = num11;
            }
            CharSequence charSequence6 = re10Var.s;
            if (charSequence6 != null) {
                a.r = charSequence6;
            }
            CharSequence charSequence7 = re10Var.t;
            if (charSequence7 != null) {
                a.s = charSequence7;
            }
            CharSequence charSequence8 = re10Var.u;
            if (charSequence8 != null) {
                a.t = charSequence8;
            }
            Integer num12 = re10Var.v;
            if (num12 != null) {
                a.u = num12;
            }
            Integer num13 = re10Var.w;
            if (num13 != null) {
                a.v = num13;
            }
            CharSequence charSequence9 = re10Var.x;
            if (charSequence9 != null) {
                a.w = charSequence9;
            }
            CharSequence charSequence10 = re10Var.y;
            if (charSequence10 != null) {
                a.x = charSequence10;
            }
            Integer num14 = re10Var.z;
            if (num14 != null) {
                a.y = num14;
            }
            if (!immutableList.isEmpty()) {
                a.z = ImmutableList.l(immutableList);
            }
        }
        return new re10(a);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final b32 getAnalyticsCollector() {
        F();
        return this.s;
    }

    @Override // defpackage.zxc0
    public final Looper getApplicationLooper() {
        return this.t;
    }

    @Override // defpackage.zxc0
    public final ue3 getAudioAttributes() {
        F();
        return this.g0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final kyg getAudioDecoderCounters() {
        F();
        return this.f0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final androidx.media3.common.a getAudioFormat() {
        F();
        return this.U;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getAudioSessionId() {
        F();
        return ((Integer) this.F.h()).intValue();
    }

    @Override // defpackage.zxc0
    public final vxc0 getAvailableCommands() {
        F();
        return this.Q;
    }

    @Override // defpackage.zxc0
    public final long getBufferedPosition() {
        F();
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        jxc0 jxc0Var = this.v0;
        return jxc0Var.k.equals(jxc0Var.b) ? tw21.l0(this.v0.q) : getDuration();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final y3c getClock() {
        return this.y;
    }

    @Override // defpackage.zxc0
    public final long getContentBufferedPosition() {
        F();
        if (this.v0.a.q()) {
            return this.x0;
        }
        jxc0 jxc0Var = this.v0;
        long j = 0;
        if (jxc0Var.k.d != jxc0Var.b.d) {
            return tw21.l0(jxc0Var.a.n(getCurrentMediaItemIndex(), this.a, 0L).l);
        }
        long j2 = jxc0Var.q;
        if (this.v0.k.b()) {
            jxc0 jxc0Var2 = this.v0;
            jxc0Var2.a.h(jxc0Var2.k.a, this.o).d(this.v0.k.b);
        } else {
            j = j2;
        }
        jxc0 jxc0Var3 = this.v0;
        a9z0 a9z0Var = jxc0Var3.a;
        Object obj = jxc0Var3.k.a;
        y8z0 y8z0Var = this.o;
        a9z0Var.h(obj, y8z0Var);
        return tw21.l0(j + y8z0Var.e);
    }

    @Override // defpackage.zxc0
    public final long getContentPosition() {
        F();
        return k(this.v0);
    }

    @Override // defpackage.zxc0
    public final int getCurrentAdGroupIndex() {
        F();
        if (isPlayingAd()) {
            return this.v0.b.b;
        }
        return -1;
    }

    @Override // defpackage.zxc0
    public final int getCurrentAdIndexInAdGroup() {
        F();
        if (isPlayingAd()) {
            return this.v0.b.c;
        }
        return -1;
    }

    @Override // defpackage.zxc0
    public final rdf getCurrentCues() {
        F();
        return this.j0;
    }

    @Override // defpackage.zxc0
    public final int getCurrentMediaItemIndex() {
        F();
        int m = m(this.v0);
        if (m == -1) {
            return 0;
        }
        return m;
    }

    @Override // defpackage.zxc0
    public final int getCurrentPeriodIndex() {
        F();
        if (this.v0.a.q()) {
            return 0;
        }
        jxc0 jxc0Var = this.v0;
        return jxc0Var.a.b(jxc0Var.b.a);
    }

    @Override // defpackage.zxc0
    public final long getCurrentPosition() {
        F();
        return tw21.l0(l(this.v0));
    }

    @Override // defpackage.zxc0
    public final a9z0 getCurrentTimeline() {
        F();
        return this.v0.a;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final yzz0 getCurrentTrackGroups() {
        F();
        return this.v0.h;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final m001 getCurrentTrackSelections() {
        F();
        return new m001(this.v0.i.c);
    }

    @Override // defpackage.zxc0
    public final r801 getCurrentTracks() {
        F();
        return this.v0.i.d;
    }

    @Override // defpackage.zxc0
    public final xaj getDeviceInfo() {
        F();
        return this.s0;
    }

    @Override // defpackage.zxc0
    public final int getDeviceVolume() {
        F();
        return 0;
    }

    @Override // defpackage.zxc0
    public final long getDuration() {
        F();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        jxc0 jxc0Var = this.v0;
        sf10 sf10Var = jxc0Var.b;
        a9z0 a9z0Var = jxc0Var.a;
        Object obj = sf10Var.a;
        y8z0 y8z0Var = this.o;
        a9z0Var.h(obj, y8z0Var);
        return tw21.l0(y8z0Var.a(sf10Var.b, sf10Var.c));
    }

    @Override // defpackage.zxc0
    public final long getMaxSeekToPreviousPosition() {
        F();
        return this.x;
    }

    @Override // defpackage.zxc0
    public final re10 getMediaMetadata() {
        F();
        return this.R;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean getPauseAtEndOfMediaItems() {
        F();
        return this.P;
    }

    @Override // defpackage.zxc0
    public final boolean getPlayWhenReady() {
        F();
        return this.v0.l;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final Looper getPlaybackLooper() {
        return this.l.getPlaybackLooper();
    }

    @Override // defpackage.zxc0
    public final lxc0 getPlaybackParameters() {
        F();
        return this.v0.o;
    }

    @Override // defpackage.zxc0
    public final int getPlaybackState() {
        F();
        return this.v0.e;
    }

    @Override // defpackage.zxc0
    public final int getPlaybackSuppressionReason() {
        F();
        return this.v0.n;
    }

    @Override // defpackage.zxc0
    public final ExoPlaybackException getPlayerError() {
        F();
        return this.v0.f;
    }

    @Override // defpackage.zxc0
    public final re10 getPlaylistMetadata() {
        F();
        return this.S;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final pno getPreloadConfiguration() {
        return this.O;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final fyi0 getRenderer(int i) {
        F();
        return this.g[i];
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getRendererCount() {
        F();
        return this.g.length;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getRendererType(int i) {
        F();
        return this.g[i].getTrackType();
    }

    @Override // defpackage.zxc0
    public final int getRepeatMode() {
        F();
        return this.G;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final fyi0 getSecondaryRenderer(int i) {
        F();
        return this.h[i];
    }

    @Override // defpackage.zxc0
    public final long getSeekBackIncrement() {
        F();
        return this.v;
    }

    @Override // defpackage.zxc0
    public final long getSeekForwardIncrement() {
        F();
        return this.w;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final g7q0 getSeekParameters() {
        F();
        return this.M;
    }

    @Override // defpackage.zxc0
    public final boolean getShuffleModeEnabled() {
        F();
        return this.H;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean getSkipSilenceEnabled() {
        F();
        return this.i0;
    }

    @Override // defpackage.zxc0
    public final vis0 getSurfaceSize() {
        F();
        return this.d0;
    }

    @Override // defpackage.zxc0
    public final long getTotalBufferedDuration() {
        F();
        return tw21.l0(this.v0.r);
    }

    @Override // defpackage.zxc0
    public final r001 getTrackSelectionParameters() {
        F();
        return this.i.getParameters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final x001 getTrackSelector() {
        F();
        return this.i;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getVideoChangeFrameRateStrategy() {
        F();
        return this.c0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final kyg getVideoDecoderCounters() {
        F();
        return this.e0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final androidx.media3.common.a getVideoFormat() {
        F();
        return this.T;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int getVideoScalingMode() {
        F();
        return this.b0;
    }

    @Override // defpackage.zxc0
    public final do31 getVideoSize() {
        F();
        return this.t0;
    }

    @Override // defpackage.zxc0
    public final float getVolume() {
        F();
        return this.h0;
    }

    public final kzc0 h() {
        return new kzc0(this.p, this.N);
    }

    public final ArrayList i(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.r.createMediaSource((fe10) list.get(i)));
        }
        return arrayList;
    }

    @Override // defpackage.zxc0
    public final void increaseDeviceVolume() {
        F();
    }

    @Override // defpackage.zxc0
    public final boolean isDeviceMuted() {
        F();
        return false;
    }

    @Override // defpackage.zxc0
    public final boolean isLoading() {
        F();
        return this.v0.g;
    }

    @Override // defpackage.zxc0
    public final boolean isPlayingAd() {
        F();
        return this.v0.b.b();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isReleased() {
        F();
        return this.r0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isSleepingForOffload() {
        F();
        return this.v0.p;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isTunnelingEnabled() {
        F();
        for (lyi0 lyi0Var : this.v0.i.b) {
            if (lyi0Var != null && lyi0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final yyc0 j(xyc0 xyc0Var) {
        int m = m(this.v0);
        a9z0 a9z0Var = this.v0.a;
        if (m == -1) {
            m = 0;
        }
        ExoPlayerImplInternal exoPlayerImplInternal = this.l;
        return new yyc0(exoPlayerImplInternal, xyc0Var, a9z0Var, m, exoPlayerImplInternal.getPlaybackLooper());
    }

    public final long k(jxc0 jxc0Var) {
        sf10 sf10Var = jxc0Var.b;
        long j = jxc0Var.c;
        a9z0 a9z0Var = jxc0Var.a;
        if (!sf10Var.b()) {
            return tw21.l0(l(jxc0Var));
        }
        Object obj = jxc0Var.b.a;
        y8z0 y8z0Var = this.o;
        a9z0Var.h(obj, y8z0Var);
        if (j == -9223372036854775807L) {
            return tw21.l0(a9z0Var.n(m(jxc0Var), this.a, 0L).k);
        }
        return tw21.l0(j) + tw21.l0(y8z0Var.e);
    }

    public final long l(jxc0 jxc0Var) {
        if (jxc0Var.a.q()) {
            return tw21.W(this.x0);
        }
        long k = jxc0Var.p ? jxc0Var.k() : jxc0Var.s;
        if (jxc0Var.b.b()) {
            return k;
        }
        a9z0 a9z0Var = jxc0Var.a;
        Object obj = jxc0Var.b.a;
        y8z0 y8z0Var = this.o;
        a9z0Var.h(obj, y8z0Var);
        return k + y8z0Var.e;
    }

    public final int m(jxc0 jxc0Var) {
        return jxc0Var.a.q() ? this.w0 : jxc0Var.a.h(jxc0Var.b.a, this.o).c;
    }

    @Override // defpackage.zxc0
    public final void moveMediaItems(int i, int i2, int i3) {
        F();
        d6z.l(i >= 0 && i <= i2 && i3 >= 0);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int min = Math.min(i2, size);
        int min2 = Math.min(i3, size - (min - i));
        if (i >= size || i == min || i == min2) {
            return;
        }
        a9z0 currentTimeline = getCurrentTimeline();
        this.I++;
        tw21.V(arrayList, i, min, min2);
        kzc0 h = h();
        jxc0 jxc0Var = this.v0;
        jxc0 q = q(jxc0Var, h, n(currentTimeline, h, m(jxc0Var), k(this.v0)));
        this.l.moveMediaSources(i, min, min2, this.N);
        D(q, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final Pair n(a9z0 a9z0Var, kzc0 kzc0Var, int i, long j) {
        if (a9z0Var.q() || kzc0Var.q()) {
            boolean z = !a9z0Var.q() && kzc0Var.q();
            return r(kzc0Var, z ? -1 : i, z ? -9223372036854775807L : j);
        }
        Pair j2 = a9z0Var.j(this.a, this.o, i, tw21.W(j));
        Object obj = j2.first;
        if (kzc0Var.b(obj) != -1) {
            return j2;
        }
        int resolveSubsequentPeriod = ExoPlayerImplInternal.resolveSubsequentPeriod(this.a, this.o, this.G, this.H, obj, a9z0Var, kzc0Var);
        if (resolveSubsequentPeriod == -1) {
            return r(kzc0Var, -1, -9223372036854775807L);
        }
        z8z0 z8z0Var = this.a;
        kzc0Var.n(resolveSubsequentPeriod, z8z0Var, 0L);
        return r(kzc0Var, resolveSubsequentPeriod, tw21.l0(z8z0Var.k));
    }

    @Override // defpackage.zxc0
    public final void prepare() {
        F();
        jxc0 jxc0Var = this.v0;
        if (jxc0Var.e != 1) {
            return;
        }
        jxc0 f = jxc0Var.f(null);
        jxc0 p = p(f, f.a.q() ? 4 : 2);
        this.I++;
        this.l.prepare();
        D(p, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final jxc0 q(jxc0 jxc0Var, a9z0 a9z0Var, Pair pair) {
        d6z.l(a9z0Var.q() || pair != null);
        a9z0 a9z0Var2 = jxc0Var.a;
        long k = k(jxc0Var);
        jxc0 i = jxc0Var.i(a9z0Var);
        if (a9z0Var.q()) {
            sf10 sf10Var = jxc0.u;
            long W = tw21.W(this.x0);
            jxc0 c = i.d(sf10Var, W, W, W, 0L, yzz0.d, this.b, ImmutableList.p()).c(sf10Var);
            c.q = c.s;
            return c;
        }
        Object obj = i.b.a;
        boolean equals = obj.equals(pair.first);
        sf10 sf10Var2 = !equals ? new sf10(pair.first) : i.b;
        long longValue = ((Long) pair.second).longValue();
        long W2 = tw21.W(k);
        if (!a9z0Var2.q()) {
            W2 -= a9z0Var2.h(obj, this.o).e;
        }
        if (!equals || longValue < W2) {
            sf10 sf10Var3 = sf10Var2;
            d6z.x(!sf10Var3.b());
            jxc0 c2 = i.d(sf10Var3, longValue, longValue, longValue, 0L, !equals ? yzz0.d : i.h, !equals ? this.b : i.i, !equals ? ImmutableList.p() : i.j).c(sf10Var3);
            c2.q = longValue;
            return c2;
        }
        if (longValue != W2) {
            sf10 sf10Var4 = sf10Var2;
            d6z.x(!sf10Var4.b());
            long max = Math.max(0L, i.r - (longValue - W2));
            long j = i.q;
            if (i.k.equals(i.b)) {
                j = longValue + max;
            }
            jxc0 d = i.d(sf10Var4, longValue, longValue, longValue, max, i.h, i.i, i.j);
            d.q = j;
            return d;
        }
        int b = a9z0Var.b(i.k.a);
        if (b != -1 && a9z0Var.g(b, this.o, false).c == a9z0Var.h(sf10Var2.a, this.o).c) {
            return i;
        }
        a9z0Var.h(sf10Var2.a, this.o);
        boolean b2 = sf10Var2.b();
        y8z0 y8z0Var = this.o;
        long a = b2 ? y8z0Var.a(sf10Var2.b, sf10Var2.c) : y8z0Var.d;
        sf10 sf10Var5 = sf10Var2;
        jxc0 c3 = i.d(sf10Var5, i.s, i.s, i.d, a - i.s, i.h, i.i, i.j).c(sf10Var5);
        c3.q = a;
        return c3;
    }

    public final Pair r(a9z0 a9z0Var, int i, long j) {
        if (a9z0Var.q()) {
            this.w0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.x0 = j;
            return null;
        }
        if (i == -1 || i >= a9z0Var.p()) {
            i = a9z0Var.a(this.H);
            j = tw21.l0(a9z0Var.n(i, this.a, 0L).k);
        }
        return a9z0Var.j(this.a, this.o, i, tw21.W(j));
    }

    @Override // defpackage.zxc0
    public final void release() {
        String str;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.7.1] [");
        sb.append(tw21.b);
        sb.append("] [");
        HashSet hashSet = ge10.a;
        synchronized (ge10.class) {
            str = ge10.b;
        }
        sb.append(str);
        sb.append("]");
        lk91.h("ExoPlayerImpl", sb.toString());
        F();
        this.B.a(false);
        this.C.i(false);
        this.D.i(false);
        if (!this.l.release()) {
            this.m.f(10, new zgl(21));
        }
        this.m.d();
        this.j.a.removeCallbacksAndMessages(null);
        this.u.removeEventListener(this.s);
        jxc0 jxc0Var = this.v0;
        if (jxc0Var.p) {
            this.v0 = jxc0Var.a();
        }
        jxc0 p = p(this.v0, 1);
        this.v0 = p;
        jxc0 c = p.c(p.b);
        this.v0 = c;
        c.q = c.s;
        this.v0.r = 0L;
        j5h j5hVar = (j5h) this.s;
        a3x0 a3x0Var = j5hVar.A;
        d6z.z(a3x0Var);
        a3x0Var.e(new oxe(14, j5hVar));
        v();
        Surface surface = this.W;
        if (surface != null) {
            surface.release();
            this.W = null;
        }
        if (this.q0) {
            PriorityTaskManager priorityTaskManager = this.p0;
            priorityTaskManager.getClass();
            priorityTaskManager.d(this.o0);
            this.q0 = false;
        }
        this.j0 = rdf.b;
        this.r0 = true;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void removeAnalyticsListener(j42 j42Var) {
        F();
        j42Var.getClass();
        ((j5h) this.s).y.e(j42Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void removeAudioOffloadListener(nno nnoVar) {
        F();
        this.n.remove(nnoVar);
    }

    @Override // defpackage.zxc0
    public final void removeListener(xxc0 xxc0Var) {
        F();
        xxc0Var.getClass();
        this.m.e(xxc0Var);
    }

    @Override // defpackage.zxc0
    public final void removeMediaItems(int i, int i2) {
        F();
        d6z.l(i >= 0 && i2 >= i);
        int size = this.p.size();
        int min = Math.min(i2, size);
        if (i >= size || i == min) {
            return;
        }
        jxc0 t = t(this.v0, i, min);
        D(t, 0, !t.b.a.equals(this.v0.b.a), 4, l(t), -1, false);
    }

    @Override // defpackage.zxc0
    public final void replaceMediaItems(int i, int i2, List list) {
        F();
        d6z.l(i >= 0 && i2 >= i);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int min = Math.min(i2, size);
        if (min - i == list.size()) {
            for (int i3 = i; i3 < min; i3++) {
                if (((aoo) arrayList.get(i3)).b.D.canUpdateMediaItem((fe10) list.get(i3 - i))) {
                }
            }
            this.I++;
            this.l.updateMediaSourcesWithMediaItems(i, min, list);
            for (int i4 = i; i4 < min; i4++) {
                aoo aooVar = (aoo) arrayList.get(i4);
                aooVar.c = new jzc0(aooVar.c, (fe10) list.get(i4 - i));
            }
            D(this.v0.i(h()), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList i5 = i(list);
        if (arrayList.isEmpty()) {
            setMediaSources(i5, this.w0 == -1);
        } else {
            jxc0 t = t(f(this.v0, min, i5), i, min);
            D(t, 0, !t.b.a.equals(this.v0.b.a), 4, l(t), -1, false);
        }
    }

    public final void s(int i, int i2) {
        vis0 vis0Var = this.d0;
        if (i == vis0Var.a && i2 == vis0Var.b) {
            return;
        }
        this.d0 = new vis0(i, i2);
        this.m.f(24, new uno(i, i2, 0));
        w(2, 14, new vis0(i, i2));
    }

    @Override // defpackage.zxc0
    public final void setAudioAttributes(ue3 ue3Var, boolean z) {
        F();
        if (this.r0) {
            return;
        }
        boolean equals = Objects.equals(this.g0, ue3Var);
        uuy uuyVar = this.m;
        if (!equals) {
            this.g0 = ue3Var;
            w(1, 3, ue3Var);
            uuyVar.c(20, new xen(5, ue3Var));
        }
        this.l.setAudioAttributes(this.g0, z);
        uuyVar.b();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setAudioSessionId(int i) {
        F();
        zp1 zp1Var = this.F;
        if (((Integer) zp1Var.h()).intValue() == i) {
            return;
        }
        jy4 jy4Var = new jy4(this, i, 4);
        d6z.x(Looper.myLooper() == ((a3x0) zp1Var.c).a.getLooper());
        zp1Var.a++;
        ((a3x0) zp1Var.b).e(new mh3(7, zp1Var, jy4Var));
        Integer num = (Integer) zp1Var.x;
        if (i == 0) {
            i = num.intValue();
        }
        zp1Var.l(Integer.valueOf(i));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setAuxEffectInfo(ga4 ga4Var) {
        F();
        w(1, 6, ga4Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setCameraMotionListener(qr7 qr7Var) {
        F();
        this.l0 = qr7Var;
        yyc0 j = j(this.A);
        j.d(8);
        j.c(qr7Var);
        j.b();
    }

    @Override // defpackage.zxc0
    public final void setDeviceMuted(boolean z) {
        F();
    }

    @Override // defpackage.zxc0
    public final void setDeviceVolume(int i) {
        F();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setForegroundMode(boolean z) {
        F();
        if (this.L != z) {
            this.L = z;
            if (this.l.setForegroundMode(z)) {
                return;
            }
            A(new ExoPlaybackException(2, new ExoTimeoutException(2), 1003));
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setHandleAudioBecomingNoisy(boolean z) {
        F();
        if (this.r0) {
            return;
        }
        this.B.a(z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        F();
        w(4, 15, imageOutput);
    }

    @Override // defpackage.zxc0
    public final void setMediaItems(List list, boolean z) {
        F();
        setMediaSources(i(list), z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSource(uf10 uf10Var, long j) {
        F();
        setMediaSources(Collections.singletonList(uf10Var), 0, j);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSources(List list, boolean z) {
        F();
        x(-1, -9223372036854775807L, list, z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setPauseAtEndOfMediaItems(boolean z) {
        F();
        if (this.P == z) {
            return;
        }
        this.P = z;
        this.l.setPauseAtEndOfWindow(z);
    }

    @Override // defpackage.zxc0
    public final void setPlayWhenReady(boolean z) {
        F();
        C(1, z);
    }

    @Override // defpackage.zxc0
    public final void setPlaybackParameters(lxc0 lxc0Var) {
        F();
        if (lxc0Var == null) {
            lxc0Var = lxc0.d;
        }
        if (this.v0.o.equals(lxc0Var)) {
            return;
        }
        jxc0 g = this.v0.g(lxc0Var);
        this.I++;
        this.l.setPlaybackParameters(lxc0Var);
        D(g, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.zxc0
    public final void setPlaylistMetadata(re10 re10Var) {
        F();
        re10Var.getClass();
        if (re10Var.equals(this.S)) {
            return;
        }
        this.S = re10Var;
        this.m.f(15, new wno(this, 0));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo) {
        F();
        w(1, 12, audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setPreloadConfiguration(pno pnoVar) {
        F();
        if (this.O.equals(pnoVar)) {
            return;
        }
        this.O = pnoVar;
        this.l.setPreloadConfiguration(pnoVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setPriority(int i) {
        F();
        if (this.o0 == i) {
            return;
        }
        if (this.q0) {
            PriorityTaskManager priorityTaskManager = this.p0;
            priorityTaskManager.getClass();
            priorityTaskManager.a(i);
            priorityTaskManager.d(this.o0);
        }
        this.o0 = i;
        w(-1, 16, Integer.valueOf(i));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
        F();
        PriorityTaskManager priorityTaskManager2 = this.p0;
        if (priorityTaskManager2 != priorityTaskManager) {
            if (this.q0) {
                priorityTaskManager2.getClass();
                priorityTaskManager2.d(this.o0);
            }
            if (priorityTaskManager == null || !isLoading()) {
                this.q0 = false;
            } else {
                priorityTaskManager.a(this.o0);
                this.q0 = true;
            }
            this.p0 = priorityTaskManager;
        }
    }

    @Override // defpackage.zxc0
    public final void setRepeatMode(int i) {
        F();
        if (this.G != i) {
            this.G = i;
            this.l.setRepeatMode(i);
            vno vnoVar = new vno(i, 0);
            uuy uuyVar = this.m;
            uuyVar.c(8, vnoVar);
            B();
            uuyVar.b();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setSeekParameters(g7q0 g7q0Var) {
        F();
        if (g7q0Var == null) {
            g7q0Var = g7q0.c;
        }
        if (this.M.equals(g7q0Var)) {
            return;
        }
        this.M = g7q0Var;
        this.l.setSeekParameters(g7q0Var);
    }

    @Override // defpackage.zxc0
    public final void setShuffleModeEnabled(boolean z) {
        F();
        if (this.H != z) {
            this.H = z;
            this.l.setShuffleModeEnabled(z);
            sno snoVar = new sno(z, 1);
            uuy uuyVar = this.m;
            uuyVar.c(9, snoVar);
            B();
            uuyVar.b();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setShuffleOrder(las0 las0Var) {
        F();
        d6z.l(((kas0) las0Var).b.length == this.p.size());
        this.N = las0Var;
        kzc0 h = h();
        jxc0 q = q(this.v0, h, r(h, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.I++;
        this.l.setShuffleOrder(las0Var);
        D(q, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setSkipSilenceEnabled(boolean z) {
        F();
        if (this.i0 == z) {
            return;
        }
        this.i0 = z;
        w(1, 9, Boolean.valueOf(z));
        this.m.f(23, new sno(z, 0));
    }

    @Override // defpackage.zxc0
    public final void setTrackSelectionParameters(r001 r001Var) {
        F();
        x001 x001Var = this.i;
        if (!x001Var.isSetParametersSupported() || r001Var.equals(x001Var.getParameters())) {
            return;
        }
        x001Var.setParameters(r001Var);
        this.m.f(19, new xen(6, r001Var));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setVideoChangeFrameRateStrategy(int i) {
        F();
        if (this.c0 == i) {
            return;
        }
        this.c0 = i;
        w(2, 5, Integer.valueOf(i));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setVideoEffects(List list) {
        F();
        try {
            Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(rxc0.class);
            w(2, 13, list);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            ny61.h("Could not find required lib-effect dependencies.", e);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setVideoFrameMetadataListener(xl31 xl31Var) {
        F();
        this.k0 = xl31Var;
        yyc0 j = j(this.A);
        j.d(7);
        j.c(xl31Var);
        j.b();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setVideoScalingMode(int i) {
        F();
        this.b0 = i;
        w(2, 4, Integer.valueOf(i));
    }

    @Override // defpackage.zxc0
    public final void setVideoSurface(Surface surface) {
        F();
        v();
        z(surface);
        int i = surface == null ? 0 : -1;
        s(i, i);
    }

    @Override // defpackage.zxc0
    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        F();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        v();
        this.Z = true;
        this.X = surfaceHolder;
        surfaceHolder.addCallback(this.z);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            z(null);
            s(0, 0);
        } else {
            z(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            s(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.zxc0
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        F();
        if (surfaceView instanceof ol31) {
            v();
            z(surfaceView);
            y(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof SphericalGLSurfaceView)) {
                setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            v();
            this.Y = (SphericalGLSurfaceView) surfaceView;
            yyc0 j = j(this.A);
            j.d(10000);
            j.c(this.Y);
            j.b();
            this.Y.addVideoSurfaceListener(this.z);
            z(this.Y.getVideoSurface());
            y(surfaceView.getHolder());
        }
    }

    @Override // defpackage.zxc0
    public final void setVideoTextureView(TextureView textureView) {
        F();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        v();
        this.a0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            lk91.j("Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.z);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            z(null);
            s(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            z(surface);
            this.W = surface;
            s(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // defpackage.zxc0
    public final void setVolume(float f) {
        F();
        float h = tw21.h(f, 0.0f, 1.0f);
        if (this.h0 == h) {
            return;
        }
        this.h0 = h;
        this.l.setVolume(h);
        this.m.f(22, new tno(h, 0));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setWakeMode(int i) {
        F();
        i630 i630Var = this.D;
        i630 i630Var2 = this.C;
        if (i == 0) {
            i630Var2.h(false);
            i630Var.h(false);
        } else if (i == 1) {
            i630Var2.h(true);
            i630Var.h(false);
        } else {
            if (i != 2) {
                return;
            }
            i630Var2.h(true);
            i630Var.h(true);
        }
    }

    @Override // defpackage.zxc0
    public final void stop() {
        F();
        A(null);
        ImmutableList p = ImmutableList.p();
        long j = this.v0.s;
        this.j0 = new rdf(p);
    }

    public final jxc0 t(jxc0 jxc0Var, int i, int i2) {
        int m = m(jxc0Var);
        long k = k(jxc0Var);
        a9z0 a9z0Var = jxc0Var.a;
        int size = this.p.size();
        this.I++;
        u(i, i2);
        kzc0 h = h();
        jxc0 q = q(jxc0Var, h, n(a9z0Var, h, m, k));
        int i3 = q.e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && m >= q.a.p()) {
            q = p(q, 4);
        }
        this.l.removeMediaSources(i, i2, this.N);
        return q;
    }

    public final void u(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.p.remove(i3);
        }
        kas0 kas0Var = (kas0) this.N;
        int i4 = i2 - i;
        int[] iArr = kas0Var.b;
        int[] iArr2 = new int[iArr.length - i4];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 < i || i7 >= i2) {
                int i8 = i6 - i5;
                if (i7 >= i) {
                    i7 -= i4;
                }
                iArr2[i8] = i7;
            } else {
                i5++;
            }
        }
        this.N = new kas0(iArr2, new Random(kas0Var.a.nextLong()));
    }

    public final void v() {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.Y;
        ExoPlayerImpl$ComponentListener exoPlayerImpl$ComponentListener = this.z;
        if (sphericalGLSurfaceView != null) {
            yyc0 j = j(this.A);
            j.d(10000);
            j.c(null);
            j.b();
            this.Y.removeVideoSurfaceListener(exoPlayerImpl$ComponentListener);
            this.Y = null;
        }
        TextureView textureView = this.a0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != exoPlayerImpl$ComponentListener) {
                lk91.j("SurfaceTextureListener already unset or replaced.");
            } else {
                this.a0.setSurfaceTextureListener(null);
            }
            this.a0 = null;
        }
        SurfaceHolder surfaceHolder = this.X;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(exoPlayerImpl$ComponentListener);
            this.X = null;
        }
    }

    public final void w(int i, int i2, Object obj) {
        for (fyi0 fyi0Var : this.g) {
            if (i == -1 || fyi0Var.getTrackType() == i) {
                yyc0 j = j(fyi0Var);
                j.d(i2);
                j.c(obj);
                j.b();
            }
        }
        for (fyi0 fyi0Var2 : this.h) {
            if (fyi0Var2 != null && (i == -1 || fyi0Var2.getTrackType() == i)) {
                yyc0 j2 = j(fyi0Var2);
                j2.d(i2);
                j2.c(obj);
                j2.b();
            }
        }
    }

    public final void x(int i, long j, List list, boolean z) {
        long j2;
        int i2;
        int i3;
        int i4 = i;
        int m = m(this.v0);
        long currentPosition = getCurrentPosition();
        this.I++;
        ArrayList arrayList = this.p;
        if (!arrayList.isEmpty()) {
            u(0, arrayList.size());
        }
        ArrayList e = e(0, list);
        kzc0 h = h();
        int i5 = h.d;
        if (!h.q() && i4 >= i5) {
            throw new IllegalSeekPositionException(h, i4, j);
        }
        if (z) {
            i4 = h.a(this.H);
            j2 = -9223372036854775807L;
        } else {
            if (i4 == -1) {
                i2 = m;
                j2 = currentPosition;
                jxc0 q = q(this.v0, h, r(h, i2, j2));
                i3 = q.e;
                if (i2 != -1 && i3 != 1) {
                    i3 = (!h.q() || i2 >= i5) ? 4 : 2;
                }
                jxc0 p = p(q, i3);
                this.l.setMediaSources(e, i2, tw21.W(j2), this.N);
                D(p, 0, this.v0.b.a.equals(p.b.a) && !this.v0.a.q(), 4, l(p), -1, false);
            }
            j2 = j;
        }
        i2 = i4;
        jxc0 q2 = q(this.v0, h, r(h, i2, j2));
        i3 = q2.e;
        if (i2 != -1) {
            if (h.q()) {
            }
        }
        jxc0 p2 = p(q2, i3);
        this.l.setMediaSources(e, i2, tw21.W(j2), this.N);
        D(p2, 0, this.v0.b.a.equals(p2.b.a) && !this.v0.a.q(), 4, l(p2), -1, false);
    }

    public final void y(SurfaceHolder surfaceHolder) {
        this.Z = false;
        this.X = surfaceHolder;
        surfaceHolder.addCallback(this.z);
        Surface surface = this.X.getSurface();
        if (surface == null || !surface.isValid()) {
            s(0, 0);
        } else {
            Rect surfaceFrame = this.X.getSurfaceFrame();
            s(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void z(Object obj) {
        Object obj2 = this.V;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        boolean videoOutput = this.l.setVideoOutput(obj, z ? this.E : -9223372036854775807L);
        if (z) {
            Object obj3 = this.V;
            Surface surface = this.W;
            if (obj3 == surface) {
                surface.release();
                this.W = null;
            }
        }
        this.V = obj;
        if (videoOutput) {
            return;
        }
        A(new ExoPlaybackException(2, new ExoTimeoutException(3), 1003));
    }

    @Override // defpackage.zxc0
    public final void decreaseDeviceVolume(int i) {
        F();
    }

    @Override // defpackage.zxc0
    public final void increaseDeviceVolume(int i) {
        F();
    }

    @Override // defpackage.zxc0
    public final void setDeviceMuted(boolean z, int i) {
        F();
    }

    @Override // defpackage.zxc0
    public final void setDeviceVolume(int i, int i2) {
        F();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addMediaSource(int i, uf10 uf10Var) {
        F();
        addMediaSources(i, Collections.singletonList(uf10Var));
    }

    @Override // defpackage.zxc0
    public final void setMediaItems(List list, int i, long j) {
        F();
        setMediaSources(i(list), i, j);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSource(uf10 uf10Var) {
        F();
        setMediaSources(Collections.singletonList(uf10Var));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSource(uf10 uf10Var, boolean z) {
        F();
        setMediaSources(Collections.singletonList(uf10Var), z);
    }

    @Override // defpackage.zxc0
    public final void clearVideoSurface(Surface surface) {
        F();
        if (surface == null || surface != this.V) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSources(List list) {
        F();
        setMediaSources(list, true);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setMediaSources(List list, int i, long j) {
        F();
        x(i, j, list, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void prepare(uf10 uf10Var) {
        F();
        setMediaSource(uf10Var);
        prepare();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void prepare(uf10 uf10Var, boolean z, boolean z2) {
        F();
        setMediaSource(uf10Var, z);
        prepare();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void addMediaSources(List list) {
        F();
        addMediaSources(this.p.size(), list);
    }
}
