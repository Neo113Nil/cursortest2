package one.video.player;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.Keep;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vk.movika.sdk.base.ui.p;
import defpackage.f0;
import defpackage.u;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.m;
import one.video.player.model.HdrType;
import xsna.a2t;
import xsna.a6g;
import xsna.b2p;
import xsna.bpn0;
import xsna.br6;
import xsna.c8g;
import xsna.cms0;
import xsna.deb0;
import xsna.dp0;
import xsna.drm0;
import xsna.e3r0;
import xsna.eg1;
import xsna.epx;
import xsna.fw3;
import xsna.g6o0;
import xsna.gzs;
import xsna.h5s;
import xsna.hjp0;
import xsna.hk0;
import xsna.hvo0;
import xsna.hzf0;
import xsna.i5;
import xsna.ig1;
import xsna.j5g;
import xsna.l63;
import xsna.n7g;
import xsna.n7x0;
import xsna.odj;
import xsna.pa2;
import xsna.se0;
import xsna.sht0;
import xsna.so4;
import xsna.svu;
import xsna.te0;
import xsna.uh3;
import xsna.vq6;
import xsna.vw3;
import xsna.w40;
import xsna.wn80;
import xsna.wo1;
import xsna.ww3;
import xsna.xe9;
import xsna.xq6;
import xsna.xus;
import xsna.y6b0;
import xsna.yh;
import xsna.zv;

/* compiled from: BaseVideoPlayer.kt */
/* loaded from: classes8.dex */
public abstract class BaseVideoPlayer implements OneVideoPlayer {
    public static final vw3 H = ww3.a("Player");
    public static final bpn0 I = new bpn0(new l63(3));
    public float A;
    public RepeatMode B;
    public volatile Size C;
    public volatile l D;
    public final b E;
    public OneVideoPlaybackException F;
    public volatile OneVideoPlayer.State G;
    public final boolean a;
    public final int b;
    public final Thread c;
    public final te0 d;
    public final hzf0 e;
    public final hvo0 f;
    public long g;
    public long h;
    public long i;
    public String j;
    public String k;
    public final j l;
    public final CopyOnWriteArrayList m;
    public final k n;
    public final h o;
    public final CopyOnWriteArrayList p;
    public final i q;
    public double r;
    public long s;
    public long t;
    public final long u;
    public final xq6 v;
    public final m.a.C2181a w;
    public y6b0 x;
    public hk0 y;
    public float z;

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, xsna.xq6] */
    public BaseVideoPlayer(boolean z, boolean z2) {
        this.a = z2;
        this.b = e3r0.a.getAndIncrement();
        this.c = Thread.currentThread();
        H.a("BaseVideoPlayer.constructor", new se0(2), epx.f(Looper.myLooper(), Looper.getMainLooper()));
        this.d = new te0(3);
        this.e = z ? (hzf0) I.getValue() : null;
        hvo0 hvo0Var = new hvo0(wn80.a, Looper.myLooper());
        this.f = hvo0Var;
        this.g = -1L;
        this.h = -1L;
        this.i = -1L;
        this.l = new j();
        this.m = new CopyOnWriteArrayList();
        this.n = new k();
        this.o = new h();
        this.p = new CopyOnWriteArrayList();
        this.q = new i();
        this.t = SystemClock.elapsedRealtime();
        this.u = 1000L;
        ?? r5 = new hvo0.a() { // from class: xsna.xq6
            @Override // xsna.hvo0.a
            public final void a(long j) {
                vw3 vw3Var = BaseVideoPlayer.H;
                BaseVideoPlayer baseVideoPlayer = BaseVideoPlayer.this;
                baseVideoPlayer.getState();
                OneVideoPlayer.State state = OneVideoPlayer.State.IDLE;
                hvo0 hvo0Var2 = baseVideoPlayer.f;
                if (hvo0Var2 != null) {
                    hvo0Var2.b.getClass();
                }
                baseVideoPlayer.q0(j);
            }
        };
        this.v = r5;
        this.w = m.a.a;
        this.y = hk0.e;
        this.z = 1.0f;
        this.A = 1.0f;
        this.B = RepeatMode.OFF;
        this.E = new b(this);
        a aVar = new a(this);
        hvo0Var.a.add(r5);
        d0(aVar);
        if (wn80.q) {
            d0(new c());
            W(new d());
        }
        this.G = OneVideoPlayer.State.IDLE;
    }

    public static void c(gzs gzsVar, gzs gzsVar2) {
        if (!wn80.h) {
            if (gzsVar2 != null) {
                return;
            }
            return;
        }
        if (wn80.q) {
            if (gzsVar2 != null) {
            }
        }
    }

    public static void d(gzs gzsVar) {
        if (!wn80.h) {
            if (gzsVar != null) {
            }
        } else {
            if (!wn80.q || gzsVar == null) {
                return;
            }
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void A(y6b0 y6b0Var, deb0 deb0Var) {
        verifyThread("one.video.player.BaseVideoPlayer.play");
        c(new zv(2, y6b0Var, deb0Var), null);
        y6b0 a = g().a(y6b0Var.a);
        this.x = a;
        r0(a, deb0Var, true);
    }

    @Override // one.video.player.OneVideoPlayer
    public final void C(final sht0 sht0Var, final long j) {
        verifyThread("one.video.player.BaseVideoPlayer.prepare");
        c(new gzs() { // from class: xsna.wq6
            @Override // xsna.gzs
            public final Object invoke() {
                vw3 vw3Var = BaseVideoPlayer.H;
                return "prepare() source= " + sht0.this + " position= " + j;
            }
        }, null);
        I(new y6b0(Collections.singletonList(sht0Var)), new deb0(0, j, null));
    }

    @Override // one.video.player.OneVideoPlayer
    public final void D(OneVideoPlayer.a aVar) {
        verifyThread("one.video.player.BaseVideoPlayer.addAnalyticsListener");
        this.o.a.add(aVar);
        c(new vq6(0, this, aVar), null);
    }

    @Override // one.video.player.OneVideoPlayer
    public final void G(a2t a2tVar) {
        verifyThread("one.video.player.BaseVideoPlayer.setRendererScene");
        hzf0 hzf0Var = this.e;
        if (hzf0Var == null) {
            throw new RuntimeException("setRendererScene failed. To use this method, create player with OneVideoPlayerBuilder().withExternalRenderer()");
        }
        hzf0Var.g(this, a2tVar);
    }

    @Override // one.video.player.OneVideoPlayer
    public void H(OneVideoPlayer.e eVar) {
        verifyThread("one.video.player.BaseVideoPlayer.removeSubtitlesListener");
        this.p.remove(eVar);
        c(new i5(3, this, eVar), null);
    }

    @Override // one.video.player.OneVideoPlayer
    public final void I(y6b0 y6b0Var, deb0 deb0Var) {
        verifyThread("one.video.player.BaseVideoPlayer.prepare");
        c(new f0(5, y6b0Var, deb0Var), null);
        y6b0 a = g().a(y6b0Var.a);
        this.x = a;
        r0(a, deb0Var, false);
    }

    @Override // one.video.player.OneVideoPlayer
    public final void K(OneVideoPlayer.a aVar) {
        verifyThread("one.video.player.BaseVideoPlayer.removeAnalyticsListener");
        this.o.a.remove(aVar);
        c(new com.vk.movika.sdk.base.flow.binding.g(3, this, aVar), null);
    }

    @Override // one.video.player.OneVideoPlayer
    public final int N() {
        return this.b;
    }

    @Override // one.video.player.OneVideoPlayer
    public final hk0 P() {
        return this.y;
    }

    @Override // one.video.player.OneVideoPlayer
    public final void R(RepeatMode repeatMode) {
        verifyThread("one.video.player.BaseVideoPlayer.<set-repeatMode>");
        if (this.B != repeatMode) {
            c(new w40(repeatMode, 11), this.d);
            RepeatMode m = m(repeatMode);
            if (m != null) {
                if (m != repeatMode) {
                    c(new eg1(2, repeatMode, m), null);
                }
                if (this.B != m) {
                    this.B = m;
                    this.l.u(this, m);
                }
            }
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void T(OneVideoPlayer.d dVar) {
        verifyThread("one.video.player.BaseVideoPlayer.removePositionChangeListener");
        this.m.remove(dVar);
        c(new uh3(2, this, dVar), null);
    }

    @Override // one.video.player.OneVideoPlayer
    public final y6b0 U() {
        verifyThread("one.video.player.BaseVideoPlayer.getCurrentPlaylist");
        return this.x;
    }

    @Override // one.video.player.OneVideoPlayer
    public final void W(OneVideoPlayer.f fVar) {
        verifyThread("one.video.player.BaseVideoPlayer.addTransferListener");
        this.n.a.add(fVar);
        c(new com.vk.movika.sdk.base.flow.binding.l(3, this, fVar), null);
    }

    @Override // one.video.player.OneVideoPlayer
    public final void X(Size size) {
        this.C = size;
    }

    @Override // one.video.player.OneVideoPlayer
    public void a0(OneVideoPlayer.e eVar) {
        verifyThread("one.video.player.BaseVideoPlayer.addSubtitlesListener");
        this.p.add(eVar);
        c(new dp0(1, this, eVar), null);
    }

    @Override // one.video.player.OneVideoPlayer
    public final float b() {
        return this.z;
    }

    @Override // one.video.player.OneVideoPlayer
    public final void b0(hk0 hk0Var) {
        verifyThread("one.video.player.BaseVideoPlayer.<set-adaptiveTrackSelectionConfig>");
        if (epx.f(this.y, hk0Var)) {
            return;
        }
        c(new com.vk.movika.sdk.base.presenter.b(hk0Var, 2), this.d);
        hk0 k = k(hk0Var);
        if (k != null) {
            if (!k.equals(hk0Var)) {
                c(new com.vk.movika.sdk.base.presenter.c(6, hk0Var, k), null);
            }
            if (epx.f(this.y, k)) {
                return;
            }
            this.y = k;
            this.l.c(this, k);
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void c0(OneVideoPlayer.c cVar) {
        verifyThread("one.video.player.BaseVideoPlayer.removeListener");
        this.l.b.remove(cVar);
        c(new p(2, this, cVar), null);
    }

    @Override // one.video.player.OneVideoPlayer
    public final void d0(OneVideoPlayer.c cVar) {
        verifyThread("one.video.player.BaseVideoPlayer.addListener");
        this.l.b.add(cVar);
        c(new com.vk.newsfeed.common.recycler.holders.attachments.a(3, this, cVar), null);
    }

    @Override // one.video.player.OneVideoPlayer
    public final Size f() {
        Size f;
        l lVar = this.D;
        return (lVar == null || (f = lVar.f()) == null) ? this.C : f;
    }

    public m g() {
        return this.w;
    }

    @Override // one.video.player.OneVideoPlayer
    public b2p g0() {
        verifyThread("one.video.player.BaseVideoPlayer.editPlaylist");
        return null;
    }

    @Override // one.video.player.OneVideoPlayer
    public long getBufferedPosition() {
        return a();
    }

    @Override // one.video.player.OneVideoPlayer
    public final OneVideoPlaybackException getError() {
        verifyThread("one.video.player.BaseVideoPlayer.getError");
        return this.F;
    }

    @Override // one.video.player.OneVideoPlayer
    public final RepeatMode getRepeatMode() {
        return this.B;
    }

    @Override // one.video.player.OneVideoPlayer
    public final OneVideoPlayer.State getState() {
        verifyThread("one.video.player.BaseVideoPlayer.getState");
        return this.G;
    }

    @Override // one.video.player.OneVideoPlayer
    public final float getVolume() {
        return this.A;
    }

    public long h(boolean z) {
        verifyThread("one.video.player.BaseVideoPlayer.getVideoFrameProcessingOffsetAverage");
        return 100L;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01df  */
    @Override // one.video.player.OneVideoPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String i0() {
        String str;
        String str2;
        so4 so4Var;
        long currentPosition;
        long Z;
        Size f;
        g6o0 g6o0Var;
        HdrType hdrType;
        pa2 pa2Var;
        n7x0 n7x0Var;
        verifyThread("one.video.player.BaseVideoPlayer.getDebugInfoString");
        String str3 = this.j;
        String str4 = this.k;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" ");
        sht0 j = j();
        if (j != null) {
            sb.append(j.a + " " + (j.c ? "live" : "") + "\n");
        }
        one.video.player.tracks.c E = E();
        cms0 cms0Var = E != null ? (cms0) E.c : null;
        if (cms0Var != null) {
            String str5 = cms0Var.c;
            String str6 = cms0Var.b;
            String f2 = xus.f(str6, str3);
            StringBuilder a = xe9.a("-- VIDEO ", str6, " (", str3, ") - ");
            a.append(f2);
            a.append("\n");
            sb.append(a.toString());
            int i = cms0Var.e;
            int i2 = cms0Var.f;
            float f3 = cms0Var.g;
            int i3 = cms0Var.d / 1000;
            StringBuilder a2 = odj.a(i, i2, "Format: ", "x", "@");
            a2.append(f3);
            a2.append(" ");
            a2.append(i3);
            a2.append(" Kbps\n");
            sb.append(a2.toString());
            List c0 = drm0.c0(str5 == null ? "" : str5, new String[]{"."}, 0, 6);
            String str7 = (String) j5g.b0(0, c0);
            if (str7 == null) {
                str = "x";
            } else {
                str = "x";
                if (str7.equals("vp09")) {
                    try {
                        String str8 = (String) c0.get(1);
                        switch (str8.hashCode()) {
                            case 1536:
                                if (str8.equals("00")) {
                                    n7x0Var = n7x0.Profile0;
                                    break;
                                }
                                n7x0Var = n7x0.Unknown;
                                break;
                            case 1537:
                                if (!str8.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
                                    n7x0Var = n7x0.Unknown;
                                    break;
                                } else {
                                    n7x0Var = n7x0.Profile1;
                                    break;
                                }
                            case 1538:
                                if (!str8.equals("02")) {
                                    n7x0Var = n7x0.Unknown;
                                    break;
                                } else {
                                    n7x0Var = n7x0.Profile2;
                                    break;
                                }
                            default:
                                n7x0Var = n7x0.Unknown;
                                break;
                        }
                        n7x0 n7x0Var2 = n7x0Var;
                        a6g b = svu.b((String) c0.get(3));
                        n7g n7gVar = epx.f((String) c0.get(5), "09") ? n7g.BT2020 : n7g.Unknown;
                        String str9 = (String) c0.get(6);
                        pa2Var = new pa2(n7x0Var2, b, epx.f((String) c0.get(7), "09") ? c8g.BT2020NC : c8g.Unknown, n7gVar, epx.f(str9, "16") ? hjp0.PQ : epx.f(str9, "18") ? hjp0.HLG : hjp0.Unknown);
                    } catch (Exception unused) {
                        pa2Var = null;
                    }
                    if (pa2Var != null) {
                        hdrType = (HdrType) pa2Var.b;
                        str2 = " Kbps\n";
                    }
                } else if (str7.equals("av01")) {
                    try {
                        a6g b2 = svu.b((String) c0.get(3));
                        n7g n7gVar2 = epx.f((String) c0.get(6), "09") ? n7g.BT2020 : n7g.Unknown;
                        str2 = " Kbps\n";
                        try {
                            String str10 = (String) c0.get(7);
                            g6o0Var = new g6o0(b2, epx.f((String) c0.get(8), "09") ? c8g.BT2020NC : c8g.Unknown, n7gVar2, epx.f(str10, "16") ? hjp0.PQ : epx.f(str10, "18") ? hjp0.HLG : hjp0.Unknown);
                        } catch (Exception unused2) {
                            g6o0Var = null;
                            if (g6o0Var != null) {
                            }
                            hdrType = null;
                            if (hdrType != null) {
                            }
                            sb.append("Codecs: " + str5 + (hdrType != null ? "(HDR)" : "") + "\n");
                            one.video.player.tracks.a M = M();
                            if (M == null) {
                            }
                            if (so4Var != null) {
                            }
                            long bufferedPosition = getBufferedPosition();
                            currentPosition = getCurrentPosition();
                            Z = Z();
                            sb.append("Buffer: " + (bufferedPosition - currentPosition));
                            if (currentPosition != Z) {
                            }
                            sb.append(" ms\n");
                            StringBuilder e = fw3.e(sb.toString());
                            f = f();
                            if (f != null) {
                            }
                            return e.toString();
                        }
                    } catch (Exception unused3) {
                        str2 = " Kbps\n";
                    }
                    if (g6o0Var != null) {
                        hdrType = (HdrType) g6o0Var.b;
                    }
                    hdrType = null;
                }
                sb.append("Codecs: " + str5 + (hdrType != null ? "(HDR)" : "") + "\n");
            }
            str2 = " Kbps\n";
            hdrType = null;
            if (hdrType != null) {
            }
            sb.append("Codecs: " + str5 + (hdrType != null ? "(HDR)" : "") + "\n");
        } else {
            str = "x";
            str2 = " Kbps\n";
        }
        one.video.player.tracks.a M2 = M();
        so4Var = M2 == null ? (so4) M2.c : null;
        if (so4Var != null) {
            String str11 = so4Var.b;
            String f4 = xus.f(str11, str4);
            String str12 = so4Var.h;
            if (str12 == null) {
                str12 = "?";
            }
            sb.append(h5s.d(xe9.a("-- AUDIO ", str11, " ", str12, " ("), str4, ") - ", f4, "\n"));
            int i4 = so4Var.f;
            int i5 = so4Var.e;
            int i6 = so4Var.d / 1000;
            StringBuilder a3 = odj.a(i4, i5, "Format: ", "*", " ");
            a3.append(i6);
            a3.append(str2);
            sb.append(a3.toString());
            sb.append("Codecs: " + so4Var.c + "\n");
        }
        long bufferedPosition2 = getBufferedPosition();
        currentPosition = getCurrentPosition();
        Z = Z();
        sb.append("Buffer: " + (bufferedPosition2 - currentPosition));
        if (currentPosition != Z) {
            sb.append(" (" + (bufferedPosition2 - Z) + ")");
        }
        sb.append(" ms\n");
        StringBuilder e2 = fw3.e(sb.toString());
        f = f();
        if (f != null) {
            e2.append("Viewport: " + f.getWidth() + str + f.getHeight());
            e2.append('\n');
        }
        return e2.toString();
    }

    @Override // one.video.player.OneVideoPlayer
    public final void j0(l lVar) {
        verifyThread("one.video.player.BaseVideoPlayer.setSurfaceHolder");
        c(new yh(lVar, 6), null);
        if (this.D == lVar) {
            return;
        }
        l lVar2 = this.D;
        if (lVar2 != null) {
            lVar2.a(null);
        }
        if (lVar != null) {
            lVar.a(this.E);
        }
        this.D = lVar;
        Surface surface = lVar != null ? lVar.getSurface() : null;
        if (surface != null) {
            setVideoSurface(surface);
        } else {
            clearVideoSurface();
        }
    }

    public hk0 k(hk0 hk0Var) {
        return null;
    }

    public Float l(float f) {
        return null;
    }

    public RepeatMode m(RepeatMode repeatMode) {
        return null;
    }

    public Float n(float f) {
        return null;
    }

    @Override // one.video.player.OneVideoPlayer
    public final void n0(final sht0 sht0Var, final long j) {
        verifyThread("one.video.player.BaseVideoPlayer.play");
        c(new gzs() { // from class: xsna.uq6
            @Override // xsna.gzs
            public final Object invoke() {
                vw3 vw3Var = BaseVideoPlayer.H;
                return "play() source= " + sht0.this + " position= " + j;
            }
        }, null);
        A(new y6b0(Collections.singletonList(sht0Var)), new deb0(0, j, null));
    }

    public final void q0(long j) {
        sht0 j2 = j();
        boolean z = false;
        if (j2 != null && j2.c) {
            z = true;
        }
        long currentPosition = getCurrentPosition();
        long bufferedPosition = getBufferedPosition();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (wn80.s && elapsedRealtime - this.t > this.u) {
            h(true);
            this.t = elapsedRealtime;
        }
        if (currentPosition == this.g && bufferedPosition == this.h && (!z || j == this.i)) {
            return;
        }
        this.g = currentPosition;
        this.h = bufferedPosition;
        this.i = j;
        if ((currentPosition <= -1 || j <= -1) && !z) {
            return;
        }
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((OneVideoPlayer.d) it.next()).C(this, this.g);
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void r(OneVideoPlayer.f fVar) {
        verifyThread("one.video.player.BaseVideoPlayer.removeTransferListener");
        this.n.a.remove(fVar);
        c(new com.vk.movika.sdk.base.ui.i(4, this, fVar), null);
    }

    public abstract void r0(y6b0 y6b0Var, deb0 deb0Var, boolean z);

    @Override // one.video.player.OneVideoPlayer
    public void release() {
        verifyThread("one.video.player.BaseVideoPlayer.release");
        hvo0 hvo0Var = this.f;
        if (hvo0Var != null) {
            hvo0Var.a.remove(this.v);
        }
        if (hvo0Var != null) {
            hvo0Var.a.clear();
            hvo0Var.b.b();
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void s(OneVideoPlayer.d dVar) {
        verifyThread("one.video.player.BaseVideoPlayer.addPositionChangeListener");
        this.m.add(dVar);
        c(new u(3, this, dVar), null);
    }

    public final void s0(OneVideoPlayer.State state, OneVideoPlaybackException oneVideoPlaybackException) {
        if (this.G != state) {
            c(new wo1(2, this, state), null);
            OneVideoPlayer.State state2 = OneVideoPlayer.State.IDLE;
            OneVideoPlayer.State state3 = this.G;
            this.G = state;
            this.F = oneVideoPlaybackException;
            this.l.z(this, state3, state);
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void setPlaybackSpeed(final float f) {
        verifyThread("one.video.player.BaseVideoPlayer.<set-playbackSpeed>");
        if (this.z == f) {
            return;
        }
        c(new gzs() { // from class: xsna.yq6
            @Override // xsna.gzs
            public final Object invoke() {
                vw3 vw3Var = BaseVideoPlayer.H;
                return n23.a(f, "playbackSpeed set to ");
            }
        }, this.d);
        final Float l = l(f);
        if (l != null) {
            if (!epx.d(l, f)) {
                c(new gzs() { // from class: xsna.zq6
                    @Override // xsna.gzs
                    public final Object invoke() {
                        vw3 vw3Var = BaseVideoPlayer.H;
                        return "Playback speed adjusted " + f + " -> " + l;
                    }
                }, null);
            }
            if (epx.a(this.z, l)) {
                return;
            }
            this.z = l.floatValue();
            this.l.o(this, l.floatValue());
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void setVolume(final float f) {
        verifyThread("one.video.player.BaseVideoPlayer.<set-volume>");
        if (this.A == f) {
            return;
        }
        c(new gzs() { // from class: xsna.ar6
            @Override // xsna.gzs
            public final Object invoke() {
                vw3 vw3Var = BaseVideoPlayer.H;
                return n23.a(f, "volume set to ");
            }
        }, this.d);
        Float n = n(f);
        if (n != null) {
            if (!epx.d(n, f)) {
                c(new br6(f, n), null);
            }
            if (epx.a(this.A, n)) {
                return;
            }
            this.A = n.floatValue();
            this.l.g(this, n.floatValue());
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public void stop() {
        verifyThread("one.video.player.BaseVideoPlayer.stop");
        this.x = null;
    }

    @Keep
    public final void verifyThread(String str) {
        if (wn80.g) {
            Thread currentThread = Thread.currentThread();
            H.a(str, new ig1(2, currentThread, this), this.c == currentThread);
        }
    }

    public /* synthetic */ BaseVideoPlayer(boolean z, boolean z2, int i) {
        this(z, (i & 2) != 0 ? false : z2);
    }
}
