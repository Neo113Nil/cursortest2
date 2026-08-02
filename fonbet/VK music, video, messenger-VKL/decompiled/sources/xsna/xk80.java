package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.a;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.exoplayer.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import one.video.exo.datasource.dash.parser.AudioTracksFilterMode;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ahp0;
import xsna.b7q;
import xsna.cms0;
import xsna.ewo0;
import xsna.f7q;
import xsna.jza0;
import xsna.kr10;
import xsna.n640;
import xsna.npl;
import xsna.yn80;

/* compiled from: OneVideoExoPlayer.kt */
/* loaded from: classes8.dex */
public final class xk80 extends BaseVideoPlayer {
    public static final float[] t0 = {0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 1.75f, 2.0f};
    public static final bpn0 u0 = new bpn0(new nd1(27));
    public static final bpn0 v0 = new bpn0(new fn4(29));
    public final Context J;
    public final v7s0 K;
    public qo10 L;
    public final xk70 M;
    public AudioTracksFilterMode N;
    public mm80 O;
    public z0d0 P;
    public j1d0 Q;
    public boolean R;
    public final String S;
    public lj00 T;
    public final tju U;
    public final vv20 V;
    public final fbi0 W;
    public final hw3 X;
    public volatile List<String> Y;
    public final iip0 Z;
    public final e7q a0;
    public final s9g b0;
    public boolean c0;
    public int d0;
    public final bpn0 e0;
    public final al80 f0;
    public final zk80 g0;
    public boolean h0;
    public String i0;
    public long j0;
    public long k0;
    public long l0;
    public final androidx.media3.exoplayer.c m0;
    public b n0;
    public final b7q.a o0;
    public a.InterfaceC0045a p0;
    public final yk80 q0;
    public final fe60 r0;
    public Cache s0;

    /* compiled from: OneVideoExoPlayer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RepeatMode.values().length];
            try {
                iArr[RepeatMode.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RepeatMode.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RepeatMode.ONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: OneVideoExoPlayer.kt */
    public static final class b implements jza0.b {
        public b() {
        }

        @Override // xsna.jza0.b
        public final void d(ukk ukkVar) {
            ArrayList n = qv20.n(ukkVar);
            Iterator it = xk80.this.p.iterator();
            while (it.hasNext()) {
                ((OneVideoPlayer.e) it.next()).C(n);
            }
        }
    }

    public xk80(Context context, Looper looper, yl80 yl80Var, String str, v7s0 v7s0Var, boolean z, rhh0 rhh0Var, xgp0 xgp0Var, boolean z2, r8l r8lVar, long j, pp9 pp9Var, etw etwVar, boolean z3, o3i0 o3i0Var, psm0 psm0Var) {
        super(z, z2, 4);
        xk80 xk80Var;
        this.J = context;
        this.K = v7s0Var;
        this.L = rhh0Var;
        if (wn80.h) {
            int i = wn80.a;
        }
        if (xgp0Var.a.compareTo(xgp0Var.b) > 0) {
            Log.e("OneVideoExoPlayer", "trackSelectionConfig is invalid!!!");
        }
        this.M = new xk70(1);
        this.S = str == null ? f7q.c(context) : str;
        tju tjuVar = new tju(this, 15);
        this.U = tjuVar;
        vv20 vv20Var = new vv20(this, 9);
        this.V = vv20Var;
        fbi0 fbi0Var = (wn80.m ? this : null) != null ? new fbi0() : null;
        this.W = fbi0Var;
        hw3 hw3Var = pp9Var != null ? new hw3(pp9Var, new op9(pp9Var.g)) : null;
        this.X = hw3Var;
        ao80 ao80Var = new ao80(context, new yn80.a(xgp0Var, tjuVar, vv20Var, fbi0Var, wn80.i ? new su5(wn80.j, wn80.k, wn80.l) : null, hw3Var, etwVar), r8lVar);
        this.Y = EmptyList.b;
        iip0 iip0Var = new iip0(ao80Var, this.b);
        iip0Var.c.add(new jip0(this, this.l));
        if (fbi0Var != null) {
            iip0Var.c.add(fbi0Var);
        }
        this.Z = iip0Var;
        this.a0 = new e7q(this, this.n);
        s9g s9gVar = new s9g();
        this.b0 = s9gVar;
        final jk80 jk80Var = (jk80) fz5.d.j(context);
        shl shlVar = new shl(y2r0.S(20L), y2r0.S(500L));
        this.d0 = -1;
        this.e0 = new bpn0(new vex(this, 15));
        al80 al80Var = new al80(this);
        this.f0 = al80Var;
        zk80 zk80Var = new zk80(this);
        this.g0 = zk80Var;
        s6y s6yVar = new s6y(this, 20);
        ArrayList arrayList = new ArrayList();
        arrayList.add(s9gVar);
        fn80 fn80Var = new fn80(context, arrayList, z3);
        fn80Var.c = true;
        fn80Var.d = new v6j(s6yVar);
        ExoPlayer.b bVar = new ExoPlayer.b(context, fn80Var);
        bVar.d(ao80Var);
        fxc0.z(!bVar.y);
        bVar.p = shlVar;
        fxc0.z(!bVar.y);
        jk80Var.getClass();
        bVar.g = new zhn0() { // from class: xsna.z5q
            @Override // xsna.zhn0
            public final Object get() {
                return jk80.this;
            }
        };
        Looper looper2 = (Looper) v0.getValue();
        fxc0.z((bVar.y || looper2 == Looper.getMainLooper()) ? false : true);
        bVar.x = new hwa0(looper2);
        fxc0.z(!bVar.y);
        bVar.r = j;
        fxc0.z(!bVar.y);
        bVar.w = false;
        int i2 = psm0Var.a;
        fxc0.z(!bVar.y);
        fxc0.p(i2 > 0);
        bVar.s = i2;
        int i3 = psm0Var.b;
        fxc0.z(!bVar.y);
        fxc0.p(i3 > 0);
        bVar.v = i3;
        if (looper != null) {
            bVar.c(looper);
        }
        if (yl80Var != null) {
            bVar.b(yl80Var);
        } else {
            cm80 cm80Var = new cm80();
            cm80Var.b(new rk80());
            bVar.b(cm80Var.a());
        }
        androidx.media3.exoplayer.c a2 = bVar.a();
        a2.X();
        if (!a2.P.equals(o3i0Var)) {
            a2.P = o3i0Var;
            a2.m.i.obtainMessage(5, o3i0Var).b();
        }
        a2.n.a(al80Var);
        a2.t.G(zk80Var);
        a2.n.a(iip0Var);
        a2.t.G(iip0Var);
        if (hw3Var != null) {
            xk80Var = this;
            xk80Var.d0((op9) hw3Var.b);
        } else {
            xk80Var = this;
        }
        PriorityTaskManager priorityTaskManager = icd0.a;
        int i4 = a2.k0;
        a2.X();
        if (!Objects.equals(a2.l0, priorityTaskManager)) {
            if (a2.m0) {
                PriorityTaskManager priorityTaskManager2 = a2.l0;
                priorityTaskManager2.getClass();
                priorityTaskManager2.d(i4);
            }
            if (priorityTaskManager != null) {
                a2.X();
                if (a2.p0.g) {
                    priorityTaskManager.a(i4);
                    a2.m0 = true;
                    a2.l0 = priorityTaskManager;
                }
            }
            a2.m0 = false;
            a2.l0 = priorityTaskManager;
        }
        hzf0 hzf0Var = xk80Var.e;
        if (hzf0Var != null) {
            hzf0Var.a(xk80Var, new bl80(a2, xk80Var), new Handler(a2.u));
        }
        xk80Var.m0 = a2;
        xk80Var.o0 = new b7q.a(new q60(1, xk80Var, xk80.class, "createMediaSource", "createMediaSource(Lone/video/player/model/source/VideoSource;)Landroidx/media3/exoplayer/source/MediaSource;", 0, 9));
        xk80Var.q0 = new yk80(xk80Var);
        xk80Var.r0 = new fe60(xk80Var, 3);
    }

    public static final deb0 t0(xk80 xk80Var, jza0.c cVar) {
        long j = cVar.f;
        int i = cVar.b;
        y6b0 U = xk80Var.U();
        sht0 a2 = U != null ? U.a(i) : null;
        BaseVideoPlayer.c(new v43(15, cVar, a2), null);
        if (a2 instanceof mnz) {
            fkz fkzVar = ((mnz) a2).d;
            if (fkzVar != null) {
                long j2 = fkzVar.e;
                long duration = xk80Var.m0.getDuration();
                deb0 deb0Var = new deb0(i, duration != C.TIME_UNSET ? (j - j2) - duration : -j2, Long.valueOf(j));
                if (!wn80.h) {
                    deb0Var.toString();
                } else if (wn80.q) {
                    deb0Var.toString();
                }
                return deb0Var;
            }
            BaseVideoPlayer.d(null);
        } else {
            BaseVideoPlayer.d(null);
        }
        return new deb0(i, j, null);
    }

    public final void A0(ewo0 ewo0Var) {
        if (!wn80.h) {
            Objects.toString(ewo0Var);
        } else if (wn80.q) {
            Objects.toString(ewo0Var);
        }
        androidx.media3.exoplayer.c cVar = this.m0;
        if (ewo0Var == null) {
            ewo0Var = cVar.getCurrentTimeline();
        }
        if (ewo0Var.p()) {
            BaseVideoPlayer.d(null);
            return;
        }
        final ewo0.c cVar2 = new ewo0.c();
        ewo0Var.n(0, cVar2);
        final kr10.e eVar = cVar2.j;
        if (eVar != null) {
            final long currentPosition = cVar.getCurrentPosition();
            final long j0 = y2r0.j0(cVar2.l);
            BaseVideoPlayer.c(new gzs() { // from class: xsna.qk80
                @Override // xsna.gzs
                public final Object invoke() {
                    androidx.media3.exoplayer.c cVar3 = xk80.this.m0;
                    boolean e = cVar3.e();
                    boolean o = cVar3.o();
                    long u = cVar3.u();
                    long duration = cVar3.getDuration();
                    ewo0.c cVar4 = cVar2;
                    long j = cVar4.f;
                    long E = y2r0.E(cVar4.g);
                    kr10.e eVar2 = eVar;
                    long j2 = eVar2.b;
                    long j3 = eVar2.a;
                    long j4 = eVar2.c;
                    float f = eVar2.d;
                    float f2 = eVar2.e;
                    StringBuilder c = gp.c("seekToLiveEdge() - live= ", " dyn= ", " curLiveOffset= ", e, o);
                    c.append(u);
                    tj0.d(c, " wDef= ", j0, " ppos= ");
                    c.append(currentPosition);
                    tj0.d(c, " dur= ", duration, " window={ start= ");
                    c.append(j);
                    tj0.d(c, " cur= ", E, " } lc={ min= ");
                    c.append(j2);
                    tj0.d(c, " target= ", j3, " max= ");
                    c.append(j4);
                    c.append(" minSpd= ");
                    c.append(f);
                    c.append(" maxSpd= ");
                    c.append(f2);
                    c.append(" }");
                    return c.toString();
                }
            }, null);
            if (j0 == C.TIME_UNSET || currentPosition >= j0) {
                return;
            }
            BaseVideoPlayer.c(new gzs() { // from class: xsna.uk80
                @Override // xsna.gzs
                public final Object invoke() {
                    StringBuilder b2 = fp.b(currentPosition, "seekToLiveEdge() - seek from ", " to default position ");
                    b2.append(j0);
                    return b2.toString();
                }
            }, null);
            cVar.x(j0);
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void B(rt4 rt4Var) {
        verifyThread("one.video.exo.OneVideoExoPlayer.removeAudioProcessor");
        BaseVideoPlayer.d(this.M);
        s9g s9gVar = this.b0;
        ReentrantLock reentrantLock = s9gVar.i;
        reentrantLock.lock();
        try {
            s9gVar.j.remove(rt4Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @ozl
    public final void B0(a.InterfaceC0045a interfaceC0045a) {
        verifyThread("one.video.exo.OneVideoExoPlayer.setBaseDataSourceFactory");
        int i = wn80.a;
        boolean z = wn80.h;
        xk70 xk70Var = this.M;
        if (!z) {
            Objects.toString(interfaceC0045a);
            if (xk70Var != null) {
                xk70Var.invoke();
            }
        } else if (wn80.q) {
            Objects.toString(interfaceC0045a);
            if (xk70Var != null) {
                xk70Var.invoke();
            }
        }
        this.p0 = interfaceC0045a;
    }

    public final void C0(final deb0 deb0Var, final boolean z) {
        fkz fkzVar;
        BaseVideoPlayer.c(new gzs() { // from class: xsna.sk80
            @Override // xsna.gzs
            public final Object invoke() {
                deb0 deb0Var2 = deb0.this;
                StringBuilder b2 = jr.b(deb0Var2.a, "start() - position= {", ", ", deb0Var2.b);
                b2.append("} playWhenReady= ");
                b2.append(z);
                return b2.toString();
            }
        }, null);
        this.r = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        this.s = 0L;
        this.t = SystemClock.elapsedRealtime();
        final b7q g0 = g0();
        if (g0 == null) {
            return;
        }
        int i = deb0Var.a;
        sht0 a2 = g0.a(i);
        if ((a2 instanceof mnz) && (fkzVar = ((mnz) a2).d) != null) {
            BaseVideoPlayer.c(new zf20(fkzVar, 12), null);
            mnz b2 = fkzVar.b(-deb0Var.b);
            if (b2 != null) {
                this.m0.stop();
                g0.d(i, b2, new gzs() { // from class: xsna.tk80
                    @Override // xsna.gzs
                    public final Object invoke() {
                        Long valueOf;
                        deb0 deb0Var2 = deb0Var;
                        int i2 = deb0Var2.a;
                        Long l = deb0Var2.c;
                        if (l == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf((0 - deb0Var2.b) + l.longValue());
                        }
                        xk80.this.D0(g0, new deb0(i2, 0L, valueOf), z);
                        return s3q0.a;
                    }
                });
                return;
            }
        }
        D0(g0, deb0Var, z);
    }

    public final void D0(final b7q b7qVar, final deb0 deb0Var, final boolean z) {
        androidx.media3.exoplayer.source.d dVar = null;
        BaseVideoPlayer.c(new gzs() { // from class: xsna.vk80
            @Override // xsna.gzs
            public final Object invoke() {
                return "startPlaylist() - playlist= " + b7q.this + " position= " + deb0Var + " playWhenReady= " + z;
            }
        }, null);
        if (b7qVar.a.size() != 0) {
            androidx.media3.exoplayer.source.d dVar2 = new androidx.media3.exoplayer.source.d(new androidx.media3.exoplayer.source.i[0]);
            Iterator it = b7qVar.a.iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.source.i iVar = (androidx.media3.exoplayer.source.i) b7qVar.b.invoke((sht0) it.next());
                synchronized (dVar2) {
                    int size = dVar2.k.size();
                    synchronized (dVar2) {
                        dVar2.A(size, Collections.singletonList(iVar), null, null);
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                s3q0 s3q0Var2 = s3q0.a;
            }
            b7qVar.c = dVar2;
            dVar = dVar2;
        }
        if (dVar != null) {
            long j = deb0Var.b;
            if (b7qVar.a(deb0Var.a) instanceof mnz) {
                j = C.TIME_UNSET;
            }
            this.h0 = false;
            this.l.w(this);
            androidx.media3.exoplayer.c cVar = this.m0;
            List singletonList = Collections.singletonList(dVar);
            int i = deb0Var.a;
            cVar.X();
            cVar.N(i, j, singletonList, false);
            this.c0 = z;
            this.m0.setPlayWhenReady(z);
            this.m0.prepare();
            hzf0 hzf0Var = this.e;
            if (hzf0Var != null) {
                hzf0Var.f(this);
            }
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final one.video.player.tracks.c E() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getCurrentVideoTrack");
        return this.Z.i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List<one.video.player.tracks.a>] */
    @Override // one.video.player.OneVideoPlayer
    public final List<one.video.player.tracks.a> F() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getAudioTracks");
        return this.Z.d;
    }

    @Override // one.video.player.BaseVideoPlayer, one.video.player.OneVideoPlayer
    public final void H(OneVideoPlayer.e eVar) {
        b bVar;
        verifyThread("one.video.exo.OneVideoExoPlayer.removeSubtitlesListener");
        BaseVideoPlayer.d(this.M);
        super.H(eVar);
        if (this.p.size() != 0 || (bVar = this.n0) == null) {
            return;
        }
        this.m0.l(bVar);
        this.n0 = null;
    }

    @Override // one.video.player.OneVideoPlayer
    public final one.video.player.tracks.c J() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getSelectedVideoTrack");
        return this.Z.h;
    }

    @Override // one.video.player.OneVideoPlayer
    public final ymo L() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getDroppedFramesInfo");
        zmo zmoVar = (zmo) this.e0.getValue();
        if (zmoVar == null) {
            return null;
        }
        g8l g8lVar = zmoVar.f;
        if (g8lVar != null) {
            zmoVar.a(g8lVar);
        }
        return zmoVar.a;
    }

    @Override // one.video.player.OneVideoPlayer
    public final one.video.player.tracks.a M() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getCurrentAudioTrack");
        return this.Z.g;
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean O() {
        verifyThread("one.video.exo.OneVideoExoPlayer.isInitiated");
        return this.m0.getPlaybackState() != 1;
    }

    @Override // one.video.player.OneVideoPlayer
    public final one.video.player.tracks.b Q() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getCurrentTextTrack");
        return this.Z.j;
    }

    @Override // one.video.player.OneVideoPlayer
    public final void S(one.video.player.tracks.c cVar) {
        sht0 sht0Var;
        ay8 ay8Var;
        er10 er10Var = cVar.c;
        verifyThread("one.video.exo.OneVideoExoPlayer.selectVideoTrack");
        boolean z = wn80.h;
        xk70 xk70Var = this.M;
        if (!z) {
            cVar.toString();
            if (xk70Var != null) {
                xk70Var.invoke();
            }
        } else if (wn80.q) {
            cVar.toString();
            if (xk70Var != null) {
                xk70Var.invoke();
            }
        }
        sht0 j = j();
        if (j != null) {
            if (j instanceof ay8) {
                ay8Var = (ay8) j;
                sht0Var = ay8Var.f;
            } else {
                sht0Var = j;
                ay8Var = null;
            }
            if (!(sht0Var instanceof n640)) {
                this.Z.i0(cVar);
                return;
            }
            n640 n640Var = (n640) sht0Var;
            Iterator<n640.a> it = n640Var.d.iterator();
            while (it.hasNext()) {
                cms0 cms0Var = (cms0) er10Var;
                if (it.next().a == cms0Var.b()) {
                    sht0 n640Var2 = new n640(n640Var.d, cms0Var.b());
                    long currentPosition = getCurrentPosition();
                    if (ay8Var != null) {
                        n640Var2 = new ay8(ay8Var.d, ay8Var.e, n640Var2);
                    }
                    float f = this.z;
                    if (f0()) {
                        n0(n640Var2, currentPosition);
                    } else {
                        C(n640Var2, currentPosition);
                    }
                    setPlaybackSpeed(f);
                    return;
                }
            }
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void V(boolean z) {
        verifyThread("one.video.exo.OneVideoExoPlayer.setPauseAtEndOfMediaItems");
        boolean z2 = wn80.h;
        xk70 xk70Var = this.M;
        if (z2) {
            if (wn80.q && xk70Var != null) {
                xk70Var.invoke();
            }
        } else if (xk70Var != null) {
            xk70Var.invoke();
        }
        androidx.media3.exoplayer.c cVar = this.m0;
        cVar.X();
        if (cVar.S == z) {
            return;
        }
        cVar.S = z;
        cVar.m.i.obtainMessage(23, z ? 1 : 0, 0).b();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List<one.video.player.tracks.b>] */
    @Override // one.video.player.OneVideoPlayer
    public final List<one.video.player.tracks.b> Y() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getTextTracks");
        return this.Z.f;
    }

    @Override // one.video.player.OneVideoPlayer
    public final long Z() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getCurrentPositionReal");
        return this.m0.getCurrentPosition();
    }

    @Override // one.video.player.OneVideoPlayer
    public final long a() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getTotalBufferedDuration");
        return this.m0.a();
    }

    @Override // one.video.player.BaseVideoPlayer, one.video.player.OneVideoPlayer
    public final void a0(OneVideoPlayer.e eVar) {
        verifyThread("one.video.exo.OneVideoExoPlayer.addSubtitlesListener");
        BaseVideoPlayer.d(this.M);
        super.a0(eVar);
        if (this.n0 == null) {
            b bVar = new b();
            this.m0.n.a(bVar);
            this.n0 = bVar;
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean canPause() {
        verifyThread("one.video.exo.OneVideoExoPlayer.canPause");
        sht0 j = j();
        return !(j == null || j.c) || this.a;
    }

    @Override // one.video.player.OneVideoPlayer
    @ozl
    public final void clearVideoSurface() {
        verifyThread("one.video.exo.OneVideoExoPlayer.clearVideoSurface");
        BaseVideoPlayer.d(this.M);
        this.h0 = false;
        hzf0 hzf0Var = this.e;
        if (hzf0Var != null) {
            hzf0Var.h(this, null);
        } else {
            this.m0.z();
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void e() {
        verifyThread("one.video.exo.OneVideoExoPlayer.retry");
        BaseVideoPlayer.d(this.M);
        this.l.w(this);
        this.m0.prepare();
        hzf0 hzf0Var = this.e;
        if (hzf0Var != null) {
            hzf0Var.f(this);
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void e0(rt4 rt4Var) {
        verifyThread("one.video.exo.OneVideoExoPlayer.addAudioProcessor");
        BaseVideoPlayer.d(this.M);
        s9g s9gVar = this.b0;
        ReentrantLock reentrantLock = s9gVar.i;
        reentrantLock.lock();
        try {
            s9gVar.j.add(rt4Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean f0() {
        verifyThread("one.video.exo.OneVideoExoPlayer.isPlayWhenReady");
        return this.m0.getPlayWhenReady();
    }

    @Override // one.video.player.BaseVideoPlayer
    public final one.video.player.m g() {
        return this.o0;
    }

    @Override // one.video.player.OneVideoPlayer
    public final int getBufferedPercentage() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getBufferedPercentage");
        return this.m0.t();
    }

    @Override // one.video.player.BaseVideoPlayer, one.video.player.OneVideoPlayer
    public final long getBufferedPosition() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getBufferedPosition");
        return this.m0.getBufferedPosition();
    }

    @Override // one.video.player.OneVideoPlayer
    public final long getCurrentPosition() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getCurrentPosition");
        sht0 j = j();
        if (!(j instanceof mnz) || o()) {
            androidx.media3.exoplayer.c cVar = this.m0;
            if (cVar.getDuration() == C.TIME_UNSET) {
                return 0L;
            }
            return cVar.getCurrentPosition();
        }
        fkz fkzVar = ((mnz) j).d;
        if (fkzVar != null) {
            return -fkzVar.e;
        }
        return 0L;
    }

    @Override // one.video.player.OneVideoPlayer
    public final long getDuration() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getDuration");
        return w0(j());
    }

    @Override // one.video.player.BaseVideoPlayer
    public final long h(boolean z) {
        cms0 cms0Var;
        verifyThread("one.video.exo.OneVideoExoPlayer.getVideoFrameProcessingOffsetAverage");
        one.video.player.tracks.c E = E();
        if (E == null || (cms0Var = (cms0) E.c) == null) {
            return 100L;
        }
        if (!z) {
            return y0(cms0Var);
        }
        androidx.media3.exoplayer.c cVar = this.m0;
        cVar.X();
        g8l g8lVar = cVar.d0;
        long j = g8lVar != null ? g8lVar.k : 0L;
        cVar.X();
        g8l g8lVar2 = cVar.d0;
        long j2 = ((g8lVar2 != null ? g8lVar2.l : 0) == 0 || j == 0) ? Long.MIN_VALUE : (long) (j / (r9 * 1000));
        if (j2 == Long.MIN_VALUE) {
            return 100L;
        }
        this.r += j2;
        this.s++;
        return y0(cms0Var);
    }

    @Override // one.video.player.OneVideoPlayer
    public final void h0(deb0 deb0Var) {
        sht0 a2;
        fkz fkzVar;
        mnz b2;
        long j = deb0Var.b;
        int i = deb0Var.a;
        verifyThread("one.video.exo.OneVideoExoPlayer.seekTo");
        boolean z = wn80.h;
        xk70 xk70Var = this.M;
        if (!z) {
            deb0Var.toString();
            if (xk70Var != null) {
                xk70Var.invoke();
            }
        } else if (wn80.q) {
            deb0Var.toString();
            if (xk70Var != null) {
                xk70Var.invoke();
            }
        }
        b7q g0 = g0();
        if (g0 == null || (a2 = g0.a(i)) == null) {
            return;
        }
        androidx.media3.exoplayer.c cVar = this.m0;
        int s = cVar.s();
        sht0 a3 = g0.a(s);
        boolean o = o();
        if (s != i && (a3 instanceof mnz) && !o && (fkzVar = ((mnz) a3).d) != null && (b2 = fkzVar.b(0L)) != null) {
            g0.d(s, b2, null);
        }
        if (!(a2 instanceof mnz)) {
            cVar.w(i, j);
            return;
        }
        if (o) {
            if (j == C.TIME_UNSET) {
                cVar.v(cVar.s(), 4, C.TIME_UNSET);
                return;
            } else {
                cVar.w(i, j);
                return;
            }
        }
        deb0 deb0Var2 = new deb0(m0(), getCurrentPosition(), null);
        if (deb0Var.equals(deb0Var2)) {
            return;
        }
        C0(deb0Var, true);
        this.l.a(OneVideoPlayer.DiscontinuityReason.SEEK, this, deb0Var2, deb0Var);
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean i() {
        long j;
        verifyThread("one.video.exo.OneVideoExoPlayer.isLiveEdge");
        sht0 j2 = j();
        if (j2 == null || j2.c) {
            ewo0 currentTimeline = this.m0.getCurrentTimeline();
            Long l = null;
            if (currentTimeline.p()) {
                BaseVideoPlayer.d(null);
            } else {
                ewo0.c cVar = new ewo0.c();
                currentTimeline.n(0, cVar);
                kr10.e eVar = cVar.j;
                if (eVar != null) {
                    long j3 = eVar.a;
                    Long valueOf = Long.valueOf(j3);
                    if (j3 != C.TIME_UNSET && j3 > 0) {
                        l = valueOf;
                    }
                    if (l != null) {
                        j = l.longValue();
                        l = Long.valueOf(j);
                    }
                }
                int i = wn80.a;
                j = 5000;
                l = Long.valueOf(j);
            }
            if (l != null) {
                long longValue = l.longValue();
                int i2 = wn80.a;
                long j4 = longValue * 2;
                if (o()) {
                    if (j() instanceof qsk) {
                        Long u = u();
                        if ((u != null ? u.longValue() : 0L) < j4) {
                            return true;
                        }
                    }
                } else if (getCurrentPosition() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    @Override // one.video.player.BaseVideoPlayer, one.video.player.OneVideoPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String i0() {
        f7q.a aVar;
        f7q.a aVar2;
        f7q.a aVar3;
        StringBuilder sb;
        String sb2;
        long u;
        String str;
        String str2;
        dip0 dip0Var;
        f7q.a aVar4;
        verifyThread("one.video.exo.OneVideoExoPlayer.getDebugInfoString");
        long currentPosition = getCurrentPosition();
        long Z = Z();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.i0());
        sb3.append("host: " + this.i0);
        sb3.append('\n');
        long j = this.j0;
        long j2 = 1024;
        long j3 = this.k0 / j2;
        long j4 = this.l0 / j2;
        StringBuilder b2 = fp.b(j, "chunk: [D]=", " ms, size: [V]=");
        b2.append(j3);
        sb3.append(e630.c(b2, " kB, [A]=", j4, " kB"));
        sb3.append('\n');
        int i = 0;
        f7q.a aVar5 = new f7q.a(i);
        f7q.a aVar6 = new f7q.a(i);
        androidx.media3.exoplayer.c cVar = this.m0;
        ewo0 currentTimeline = cVar.getCurrentTimeline();
        if (!currentTimeline.p()) {
            long currentPosition2 = cVar.getCurrentPosition();
            ewo0.c cVar2 = new ewo0.c();
            currentTimeline.i(cVar2, new ewo0.b(), 0, currentPosition2);
            Object obj = cVar2.d;
            if (obj != null && (obj instanceof rsk)) {
                rsk rskVar = (rsk) obj;
                long j5 = rskVar.a;
                if (C.TIME_UNSET == j5) {
                    j5 = 0;
                }
                int size = rskVar.m.size();
                if (size > 0) {
                    aVar = aVar5;
                    long j6 = cVar2.f;
                    long j7 = (C.TIME_UNSET != j6 ? j6 : 0L) + currentPosition2;
                    dip0 j8 = cVar.j();
                    if (j8.a(2) || j8.a(1)) {
                        int i2 = 0;
                        while (i2 < size) {
                            jx90 b3 = rskVar.b(i2);
                            List<cj0> list = b3.c;
                            long c = rskVar.c(i2);
                            int i3 = size;
                            f7q.a aVar7 = aVar6;
                            long j9 = b3.b;
                            long j10 = j5 + j9;
                            if (j10 <= j7 && (C.TIME_UNSET == c || j7 - j10 < c)) {
                                long j11 = (j7 - j5) - j9;
                                int a2 = b3.a(2);
                                if (-1 != a2) {
                                    dip0Var = j8;
                                    aVar4 = f7q.b(list.get(a2), dip0Var, j11, c);
                                } else {
                                    dip0Var = j8;
                                    aVar4 = aVar;
                                }
                                int a3 = b3.a(1);
                                aVar2 = -1 != a3 ? f7q.b(list.get(a3), dip0Var, j11, c) : aVar7;
                                aVar3 = aVar4;
                                sb = new StringBuilder();
                                if (aVar3.a() || !aVar2.a()) {
                                    sb.append("Segment");
                                    if (!aVar3.a()) {
                                        sb.append(" V: ");
                                        sb.append(aVar3);
                                    }
                                    if (!aVar2.a()) {
                                        sb.append(" A: ");
                                        sb.append(aVar2);
                                    }
                                }
                                sb2 = sb.toString();
                                if (drm0.N(sb2)) {
                                    sb2 = null;
                                }
                                if (sb2 != null) {
                                    sb3.append(sb2);
                                    sb3.append('\n');
                                }
                                String a4 = currentPosition != Z ? qlb0.a(Z, " (", ")") : "";
                                sb3.append("Position: " + currentPosition + a4 + " ms, duration: " + getDuration() + " ms");
                                sb3.append('\n');
                                long h = h(false);
                                StringBuilder sb4 = new StringBuilder("vfpo: ");
                                sb4.append(h);
                                sb3.append(sb4.toString());
                                sb3.append('\n');
                                sb3.append("SegmentsToLoad: " + this.L.h());
                                sb3.append('\n');
                                if (Build.VERSION.SDK_INT >= 31) {
                                    str = Build.SOC_MODEL;
                                    str2 = Build.SOC_MANUFACTURER;
                                    sb3.append("SoC: " + str + ", Manufacturer: " + str2);
                                    sb3.append('\n');
                                }
                                u = cVar.u();
                                StringBuilder sb5 = new StringBuilder();
                                if (u != C.TIME_UNSET) {
                                    long currentPosition3 = cVar.getCurrentPosition();
                                    long duration = cVar.getDuration();
                                    StringBuilder b4 = fp.b(u, "Live offset: ", ", pos: ");
                                    b4.append(currentPosition3);
                                    sb5.append(e630.c(b4, ", dur: ", duration, " ms"));
                                    sb5.append('\n');
                                    ewo0 currentTimeline2 = cVar.getCurrentTimeline();
                                    if (!currentTimeline2.p()) {
                                        ewo0.c cVar3 = new ewo0.c();
                                        currentTimeline2.n(0, cVar3);
                                        kr10.e eVar = cVar3.j;
                                        if (eVar != null) {
                                            long j12 = eVar.a;
                                            String valueOf = j12 == C.TIME_UNSET ? "-" : String.valueOf(j12);
                                            long j13 = eVar.b;
                                            String valueOf2 = j13 == C.TIME_UNSET ? "-" : String.valueOf(j13);
                                            long j14 = eVar.c;
                                            String valueOf3 = j14 != C.TIME_UNSET ? String.valueOf(j14) : "-";
                                            StringBuilder a5 = xe9.a("Target: ", valueOf, " min: ", valueOf2, " max: ");
                                            a5.append(valueOf3);
                                            sb5.append(a5.toString());
                                            sb5.append('\n');
                                        }
                                    }
                                }
                                sb3.append(sb5.toString());
                                return sb3.toString();
                            }
                            i2++;
                            size = i3;
                            aVar6 = aVar7;
                        }
                    }
                    aVar3 = aVar;
                    aVar2 = aVar6;
                    sb = new StringBuilder();
                    if (aVar3.a()) {
                    }
                    sb.append("Segment");
                    if (!aVar3.a()) {
                    }
                    if (!aVar2.a()) {
                    }
                    sb2 = sb.toString();
                    if (drm0.N(sb2)) {
                    }
                    if (sb2 != null) {
                    }
                    if (currentPosition != Z) {
                    }
                    sb3.append("Position: " + currentPosition + a4 + " ms, duration: " + getDuration() + " ms");
                    sb3.append('\n');
                    long h2 = h(false);
                    StringBuilder sb42 = new StringBuilder("vfpo: ");
                    sb42.append(h2);
                    sb3.append(sb42.toString());
                    sb3.append('\n');
                    sb3.append("SegmentsToLoad: " + this.L.h());
                    sb3.append('\n');
                    if (Build.VERSION.SDK_INT >= 31) {
                    }
                    u = cVar.u();
                    StringBuilder sb52 = new StringBuilder();
                    if (u != C.TIME_UNSET) {
                    }
                    sb3.append(sb52.toString());
                    return sb3.toString();
                }
            }
        }
        aVar = aVar5;
        aVar3 = aVar;
        aVar2 = aVar6;
        sb = new StringBuilder();
        if (aVar3.a()) {
        }
        sb.append("Segment");
        if (!aVar3.a()) {
        }
        if (!aVar2.a()) {
        }
        sb2 = sb.toString();
        if (drm0.N(sb2)) {
        }
        if (sb2 != null) {
        }
        if (currentPosition != Z) {
        }
        sb3.append("Position: " + currentPosition + a4 + " ms, duration: " + getDuration() + " ms");
        sb3.append('\n');
        long h22 = h(false);
        StringBuilder sb422 = new StringBuilder("vfpo: ");
        sb422.append(h22);
        sb3.append(sb422.toString());
        sb3.append('\n');
        sb3.append("SegmentsToLoad: " + this.L.h());
        sb3.append('\n');
        if (Build.VERSION.SDK_INT >= 31) {
        }
        u = cVar.u();
        StringBuilder sb522 = new StringBuilder();
        if (u != C.TIME_UNSET) {
        }
        sb3.append(sb522.toString());
        return sb3.toString();
    }

    @Override // one.video.player.OneVideoPlayer
    public final sht0 j() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getCurrentSource");
        y6b0 U = U();
        if (U != null) {
            return U.a(this.m0.s());
        }
        return null;
    }

    @Override // one.video.player.OneVideoPlayer
    public final List<one.video.player.tracks.c> k0() {
        List<one.video.player.tracks.c> x0;
        verifyThread("one.video.exo.OneVideoExoPlayer.getVideoTracks");
        sht0 j = j();
        if (j != null) {
            ay8 ay8Var = j instanceof ay8 ? (ay8) j : null;
            if (ay8Var == null || (x0 = x0(ay8Var.f)) == null) {
                x0 = x0(j);
            }
            if (x0 != null) {
                return x0;
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // one.video.player.BaseVideoPlayer
    public final Float l(float f) {
        androidx.media3.exoplayer.c cVar = this.m0;
        jwa0 E = cVar.E();
        if (f == 1.0f) {
            int i = wn80.a;
        }
        if (E.a == f) {
            return Float.valueOf(f);
        }
        cVar.O(new jwa0(f, E.b));
        return Float.valueOf(cVar.E().a);
    }

    @Override // one.video.player.OneVideoPlayer
    public final long l0() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getWindowStartUnixTime");
        ewo0 currentTimeline = this.m0.getCurrentTimeline();
        if (currentTimeline.p()) {
            if (wn80.h) {
                int i = wn80.a;
            }
            return 0L;
        }
        ewo0.c cVar = new ewo0.c();
        currentTimeline.n(0, cVar);
        long j = cVar.f;
        if (j == C.TIME_UNSET) {
            return 0L;
        }
        return j;
    }

    @Override // one.video.player.BaseVideoPlayer
    public final RepeatMode m(RepeatMode repeatMode) {
        int i = a.$EnumSwitchMapping$0[repeatMode.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i == 2) {
            i2 = 2;
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        androidx.media3.exoplayer.c cVar = this.m0;
        cVar.X();
        if (i2 != cVar.I) {
            cVar.P(i2);
        }
        return repeatMode;
    }

    @Override // one.video.player.OneVideoPlayer
    public final int m0() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getCurrentPlaylistItemIndex");
        int s = this.m0.s();
        y6b0 U = U();
        if (U == null || s >= U.a.size()) {
            return -1;
        }
        return s;
    }

    @Override // one.video.player.BaseVideoPlayer
    public final Float n(float f) {
        androidx.media3.exoplayer.c cVar = this.m0;
        cVar.X();
        if (cVar.f0 != f) {
            cVar.setVolume(f);
        }
        cVar.X();
        return Float.valueOf(cVar.f0);
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean o() {
        verifyThread("one.video.exo.OneVideoExoPlayer.isStandardLiveSeekSupported");
        if (!(j() instanceof qsk)) {
            return false;
        }
        int i = wn80.a;
        return wn80.d;
    }

    @Override // one.video.player.OneVideoPlayer
    public final void o0() {
        verifyThread("one.video.exo.OneVideoExoPlayer.setAutoVideoTrackSelection");
        BaseVideoPlayer.d(this.M);
        if (y()) {
            iip0 iip0Var = this.Z;
            iip0Var.l = null;
            if (wn80.m) {
                iip0Var.h = null;
                iip0Var.h0(null);
                return;
            }
            ao80 ao80Var = iip0Var.b;
            npl.d a2 = ao80Var.a();
            a2.getClass();
            npl.d.a aVar = new npl.d.a(a2);
            aVar.i(2);
            ao80Var.i(new npl.d(aVar));
        }
    }

    @Override // one.video.player.OneVideoPlayer
    @ozl
    public final boolean p() {
        verifyThread("one.video.exo.OneVideoExoPlayer.isFirstFrameRendered");
        return this.h0;
    }

    @Override // one.video.player.OneVideoPlayer
    public final float[] p0() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getPlaybackSpeeds");
        return t0;
    }

    @Override // one.video.player.OneVideoPlayer
    public final void pause() {
        verifyThread("one.video.exo.OneVideoExoPlayer.pause");
        BaseVideoPlayer.d(this.M);
        this.m0.setPlayWhenReady(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    @Override // one.video.player.OneVideoPlayer
    public final boolean q(one.video.player.tracks.a aVar) {
        hz4 hz4Var;
        verifyThread("one.video.exo.OneVideoExoPlayer.selectAudioTrack");
        boolean z = wn80.h;
        xk70 xk70Var = this.M;
        if (!z) {
            Objects.toString(aVar);
            if (xk70Var != null) {
                xk70Var.invoke();
            }
        } else if (wn80.q) {
            Objects.toString(aVar);
            if (xk70Var != null) {
                xk70Var.invoke();
            }
        }
        iip0 iip0Var = this.Z;
        Iterator it = ((Iterable) iip0Var.d).iterator();
        while (true) {
            if (!it.hasNext()) {
                hz4Var = 0;
                break;
            }
            hz4Var = it.next();
            if (epx.f(((one.video.player.tracks.a) hz4Var).b, aVar.b)) {
                break;
            }
        }
        hz4 hz4Var2 = hz4Var instanceof hz4 ? hz4Var : null;
        if (hz4Var2 == null) {
            return false;
        }
        ao80 ao80Var = iip0Var.b;
        npl.d a2 = ao80Var.a();
        a2.getClass();
        npl.d.a aVar2 = new npl.d.a(a2);
        nie nieVar = hz4Var2.d;
        aVar2.j(new zgp0((pfp0) nieVar.b, (List) nieVar.c));
        aVar2.l = ahp0.b.d(new String[0]);
        ao80Var.i(new npl.d(aVar2));
        return true;
    }

    @Override // one.video.player.BaseVideoPlayer
    public final void r0(final y6b0 y6b0Var, final deb0 deb0Var, final boolean z) {
        BaseVideoPlayer.c(new gzs() { // from class: xsna.wk80
            @Override // xsna.gzs
            public final Object invoke() {
                return "onPlaylistChanged() - playlist: " + y6b0.this + " position: " + deb0Var + " playWhenReady: " + z;
            }
        }, null);
        z0();
        C0(deb0Var, z);
    }

    @Override // one.video.player.BaseVideoPlayer, one.video.player.OneVideoPlayer
    public final void release() {
        verifyThread("one.video.exo.OneVideoExoPlayer.release");
        BaseVideoPlayer.d(this.M);
        al80 al80Var = this.f0;
        androidx.media3.exoplayer.c cVar = this.m0;
        cVar.l(al80Var);
        cVar.q(this.g0);
        iip0 iip0Var = this.Z;
        cVar.l(iip0Var);
        cVar.q(iip0Var);
        hw3 hw3Var = this.X;
        if (hw3Var != null) {
            c0((op9) hw3Var.b);
        }
        cVar.z();
        cVar.release();
        hzf0 hzf0Var = this.e;
        if (hzf0Var != null) {
            hzf0Var.b(this);
        }
        z0();
        s0(OneVideoPlayer.State.RELEASED, null);
        super.release();
    }

    @Override // one.video.player.OneVideoPlayer
    public final void resume() {
        verifyThread("one.video.exo.OneVideoExoPlayer.resume");
        BaseVideoPlayer.d(this.M);
        boolean o = o();
        androidx.media3.exoplayer.c cVar = this.m0;
        if (!o) {
            A0(null);
        } else if (cVar.e()) {
            if (cVar.u() > cVar.getDuration()) {
                seekTo(0L);
            }
        }
        cVar.setPlayWhenReady(true);
    }

    @Override // one.video.player.OneVideoPlayer
    public final void seekTo(long j) {
        verifyThread("one.video.exo.OneVideoExoPlayer.seekTo");
        boolean z = wn80.h;
        xk70 xk70Var = this.M;
        if (z) {
            if (wn80.q && xk70Var != null) {
                xk70Var.invoke();
            }
        } else if (xk70Var != null) {
            xk70Var.invoke();
        }
        h0(new deb0(this.m0.s(), j, null));
    }

    @Override // one.video.player.OneVideoPlayer
    @ozl
    public final void setVideoSurface(Surface surface) {
        verifyThread("one.video.exo.OneVideoExoPlayer.setVideoSurface");
        boolean z = wn80.h;
        xk70 xk70Var = this.M;
        if (!z) {
            Objects.toString(surface);
            if (xk70Var != null) {
                xk70Var.invoke();
            }
        } else if (wn80.q) {
            Objects.toString(surface);
            if (xk70Var != null) {
                xk70Var.invoke();
            }
        }
        this.h0 = false;
        hzf0 hzf0Var = this.e;
        if (hzf0Var != null) {
            hzf0Var.h(this, surface);
        } else {
            this.m0.R(surface);
        }
    }

    @Override // one.video.player.BaseVideoPlayer, one.video.player.OneVideoPlayer
    public final void stop() {
        verifyThread("one.video.exo.OneVideoExoPlayer.stop");
        BaseVideoPlayer.d(this.M);
        super.stop();
        androidx.media3.exoplayer.c cVar = this.m0;
        cVar.stop();
        cVar.k();
        this.h0 = false;
        hzf0 hzf0Var = this.e;
        if (hzf0Var != null) {
            hzf0Var.f(this);
        }
        if (getState() == OneVideoPlayer.State.ERROR) {
            s0(OneVideoPlayer.State.IDLE, null);
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void t() {
        verifyThread("one.video.exo.OneVideoExoPlayer.disableTextTracks");
        BaseVideoPlayer.d(this.M);
        ao80 ao80Var = this.Z.b;
        npl.d a2 = ao80Var.a();
        a2.getClass();
        npl.d.a aVar = new npl.d.a(a2);
        aVar.i(3);
        aVar.k(true);
        ao80Var.i(new npl.d(aVar));
    }

    @Override // one.video.player.OneVideoPlayer
    public final Long u() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getCurrentLiveOffset");
        long u = this.m0.u();
        if (C.TIME_UNSET == u) {
            return null;
        }
        return Long.valueOf(u);
    }

    public final um80 u0(Runnable runnable, Looper looper) {
        verifyThread("one.video.exo.OneVideoExoPlayer.createMessage");
        ga40 ga40Var = new ga40(runnable, 4);
        androidx.media3.exoplayer.c cVar = this.m0;
        cVar.X();
        androidx.media3.exoplayer.i A = cVar.A(ga40Var);
        fxc0.z(!A.k);
        A.g = looper;
        return new um80(A);
    }

    @Override // one.video.player.OneVideoPlayer
    public final void v(lj00 lj00Var) {
        verifyThread("one.video.exo.OneVideoExoPlayer.setManifestValidationErrorCallback");
        this.T = lj00Var;
    }

    @Override // one.video.player.BaseVideoPlayer, one.video.player.OneVideoPlayer
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public final b7q g0() {
        verifyThread("one.video.exo.OneVideoExoPlayer.editPlaylist");
        BaseVideoPlayer.d(this.M);
        return (b7q) U();
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean w() {
        verifyThread("one.video.exo.OneVideoExoPlayer.canSeek");
        sht0 j = j();
        if (!(j instanceof mnz)) {
            return j != null;
        }
        if (o()) {
            return true;
        }
        fkz fkzVar = ((mnz) j).d;
        return (fkzVar != null ? fkzVar.d : 0L) > 0;
    }

    public final long w0(sht0 sht0Var) {
        if (!(sht0Var instanceof mnz) || o()) {
            androidx.media3.exoplayer.c cVar = this.m0;
            if (cVar.getDuration() == C.TIME_UNSET) {
                return 0L;
            }
            return cVar.getDuration();
        }
        fkz fkzVar = ((mnz) sht0Var).d;
        if (fkzVar != null) {
            return -fkzVar.d;
        }
        return 0L;
    }

    @Override // one.video.player.OneVideoPlayer
    public final ik80 x() {
        verifyThread("one.video.exo.OneVideoExoPlayer.getBandwidthMeter");
        return fz5.d.j(this.J);
    }

    public final List<one.video.player.tracks.c> x0(sht0 sht0Var) {
        if (!(sht0Var instanceof n640)) {
            return this.Z.e;
        }
        List<n640.a> list = ((n640) sht0Var).d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (n640.a aVar : list) {
            cms0.a aVar2 = new cms0.a();
            aVar2.e = aVar.a.getWidth();
            aVar2.f = aVar.a.getHeight();
            cms0 a2 = aVar2.a();
            arrayList.add(new one.video.player.tracks.c(hr80.x(a2), a2, true));
        }
        return arrayList;
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean y() {
        verifyThread("one.video.exo.OneVideoExoPlayer.isVideoAdaptiveSupported");
        return this.Z.k;
    }

    public final long y0(cms0 cms0Var) {
        long j = this.s;
        if (j == 0) {
            return 100L;
        }
        return (long) (((this.r / j) / (1000.0d / (Double.compare((double) cms0Var.g, ConnectivityTracker.DEFAULT_UPLINK_BITRATE) != 0 ? cms0Var.g : 1.0f))) * 100.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    @Override // one.video.player.OneVideoPlayer
    public final void z(one.video.player.tracks.b bVar) {
        cno0 cno0Var;
        verifyThread("one.video.exo.OneVideoExoPlayer.selectTextTrack");
        boolean z = wn80.h;
        xk70 xk70Var = this.M;
        if (!z) {
            Objects.toString(bVar);
            if (xk70Var != null) {
                xk70Var.invoke();
            }
        } else if (wn80.q) {
            Objects.toString(bVar);
            if (xk70Var != null) {
                xk70Var.invoke();
            }
        }
        iip0 iip0Var = this.Z;
        Iterator it = ((Iterable) iip0Var.f).iterator();
        while (true) {
            if (!it.hasNext()) {
                cno0Var = 0;
                break;
            } else {
                cno0Var = it.next();
                if (epx.f(((one.video.player.tracks.b) cno0Var).b, bVar.b)) {
                    break;
                }
            }
        }
        cno0 cno0Var2 = cno0Var instanceof cno0 ? cno0Var : null;
        if (cno0Var2 != null) {
            ao80 ao80Var = iip0Var.b;
            npl.d a2 = ao80Var.a();
            a2.getClass();
            npl.d.a aVar = new npl.d.a(a2);
            nie nieVar = cno0Var2.e;
            aVar.j(new zgp0((pfp0) nieVar.b, (List) nieVar.c));
            aVar.k(false);
            ao80Var.i(new npl.d(aVar));
        }
    }

    public final void z0() {
        iip0 iip0Var = this.Z;
        iip0Var.getClass();
        if (wn80.q) {
            new Exception();
        }
        EmptyList emptyList = EmptyList.b;
        iip0Var.d = emptyList;
        iip0Var.e = emptyList;
        iip0Var.f = emptyList;
        iip0Var.g = null;
        iip0Var.o = null;
        iip0Var.h = null;
        iip0Var.i = null;
        iip0Var.n = null;
        iip0Var.j = null;
        iip0Var.k = false;
        fbi0 fbi0Var = this.W;
        if (fbi0Var != null) {
            fbi0Var.a = null;
        }
    }

    @Override // one.video.player.BaseVideoPlayer
    public final hk0 k(hk0 hk0Var) {
        return hk0Var;
    }
}
