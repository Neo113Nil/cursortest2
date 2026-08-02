package xsna;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Size;
import androidx.media3.datasource.a;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.a;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.base.utils.Range;
import com.vk.core.telemetry.VideoOpenTelemetryComponent;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.RangeCollection;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.libvideo.storage.CachedVideoViewedSegments;
import com.vk.media.player.PlayerError;
import com.vk.media.player.VideoMode;
import com.vk.media.player.VideoPlayerType;
import com.vk.mediastore.media.exo.datasource.VkHttpCallFactory;
import com.vk.mediastore.storage.ClipsVideoStorage;
import com.vk.mediastore.storage.MediaStorage;
import com.vk.reefton.Reef;
import com.vk.toggle.features.VideoFeatures;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.error.OneVideoSourceException;
import one.video.player.model.FrameSize;
import one.video.player.model.VideoContentType;
import one.video.player.tracks.trackselection.AdaptiveTrackSelectionInterval;
import ru.ok.proto.PublisherConfiguration;
import xsna.d5b0;
import xsna.f8f0;
import xsna.irt0;
import xsna.nza0;
import xsna.toz;
import xsna.uuv0;

/* compiled from: ExoPlayerBase.kt */
/* loaded from: classes3.dex */
public final class a6q implements d3b0 {
    public static final a D;
    public static final /* synthetic */ qcy<Object>[] E;
    public static final Object F;
    public fuk0 A;
    public boolean B;
    public boolean C;
    public final Context a;
    public final OneVideoPlayer b;
    public final am80 c;
    public final VideoOpenTelemetryComponent d;
    public final VkHttpCallFactory e;
    public final mjp0 f;
    public final bpn0 g;
    public final bpn0 h;
    public final zsa0 i;
    public final j000 j;
    public final boolean k;
    public final b l;
    public final bpn0 m;
    public final boolean n;
    public final uuv0 o;
    public final d p;
    public final f q;
    public final s2t r;
    public final c s;
    public final xi7 t;
    public volatile VideoMode u;
    public final com.vk.core.telemetry.b v;
    public izs<? super d3b0, s3q0> w;
    public final nza0 x;
    public toz y;
    public m7q z;

    /* compiled from: ExoPlayerBase.kt */
    public static final class a {
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        public static final boolean a(a aVar) {
            aVar.getClass();
            return ((Boolean) a6q.F.getValue()).booleanValue();
        }
    }

    /* compiled from: ExoPlayerBase.kt */
    public final class b extends n5q {
        public b() {
        }

        @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
        public final void h(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, OneVideoPlayer.DataType dataType, er10 er10Var) {
            nza0 nza0Var = a6q.this.x;
            Uri uri = lk80Var.a;
            en80 en80Var = nza0Var.e;
            if (en80Var != null) {
                en80Var.l(uri);
            }
        }
    }

    /* compiled from: ExoPlayerBase.kt */
    public final class d implements OneVideoPlayer.d {
        public d() {
        }

        @Override // one.video.player.OneVideoPlayer.d
        public final void C(BaseVideoPlayer baseVideoPlayer, long j) {
            long duration = baseVideoPlayer.getDuration();
            long currentPosition = baseVideoPlayer.getCurrentPosition();
            int bufferedPercentage = baseVideoPlayer.getBufferedPercentage();
            if (duration > 0) {
                a6q a6qVar = a6q.this;
                fuk0 fuk0Var = a6qVar.A;
                if (fuk0Var != null) {
                    fuk0Var.m(currentPosition, duration);
                }
                fuk0 fuk0Var2 = a6qVar.A;
                if (fuk0Var2 != null) {
                    fuk0Var2.H0(bufferedPercentage);
                }
                nza0 nza0Var = a6qVar.x;
                en80 en80Var = nza0Var.e;
                if (en80Var != null) {
                    en80Var.c(currentPosition);
                }
                mza0 mza0Var = nza0Var.p;
                if (mza0Var != null) {
                    int b = an10.b(currentPosition / 1000);
                    if (mza0Var.a || mza0Var.c == b) {
                        return;
                    }
                    if (bps0.a != null) {
                        qg90<Long, Integer> qg90Var = mza0Var.b;
                        r2u0 r2u0Var = dst0.b;
                        UserId userId = new UserId(qg90Var.a.longValue());
                        Integer num = qg90Var.b;
                        qg90<UserId, Integer> qg90Var2 = new qg90<>(userId, num);
                        r2u0Var.getClass();
                        bpn0 bpn0Var = irt0.d;
                        CachedVideoViewedSegments a = irt0.b.a().a(qg90Var2);
                        boolean z = a == null;
                        if (z) {
                            a = new CachedVideoViewedSegments(userId, num.intValue());
                        }
                        String str = a.q() + BundleUtil.UNDERLINE_TAG + a.Ib();
                        LinkedList<qg90<String, String>> linkedList = r2u0Var.d;
                        if (linkedList.peekFirst() == null || !Objects.equals(linkedList.peekFirst().a, str)) {
                            linkedList.push(new qg90<>(str, a.r()));
                        }
                        if (linkedList.size() > 2) {
                            linkedList.removeLast();
                        }
                        if (linkedList.size() == 2) {
                            a.n = linkedList.peekLast().a;
                            a.m = linkedList.peekLast().b;
                        }
                        RangeCollection Eb = a.Eb();
                        Range range = Eb.b;
                        if (range != null) {
                            long j2 = b;
                            if ((range != null ? Long.valueOf(range.c) : null).longValue() <= j2) {
                                Range range2 = Eb.b;
                                if (range2 != null && range2.c != j2) {
                                    range2.c = j2;
                                }
                                if (SystemClock.elapsedRealtime() - r2u0Var.c <= 10000 || z) {
                                    irt0.b.a().e(a);
                                    r2u0Var.c = SystemClock.elapsedRealtime();
                                }
                            }
                        }
                        long j3 = b;
                        Eb.b = new Range(j3, j3);
                        if (SystemClock.elapsedRealtime() - r2u0Var.c <= 10000) {
                        }
                        irt0.b.a().e(a);
                        r2u0Var.c = SystemClock.elapsedRealtime();
                    }
                    mza0Var.c = b;
                }
            }
        }
    }

    /* compiled from: ExoPlayerBase.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoContentType.values().length];
            try {
                iArr[VideoContentType.DASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(a6q.class, "textureView", "getTextureView()Lcom/vk/media/player/video/VideoTextureViewContract;", 0);
        fpf0.a.getClass();
        E = new qcy[]{mutablePropertyReference1Impl};
        D = new a();
        F = msy.a(LazyThreadSafetyMode.PUBLICATION, new bu0(10));
    }

    public a6q(Context context, OneVideoPlayer oneVideoPlayer, am80 am80Var, VideoOpenTelemetryComponent videoOpenTelemetryComponent) {
        this.a = context;
        this.b = oneVideoPlayer;
        this.c = am80Var;
        this.d = videoOpenTelemetryComponent;
        VkHttpCallFactory vkHttpCallFactory = new VkHttpCallFactory(null, new atm(this, 4), 1);
        this.e = vkHttpCallFactory;
        this.f = (videoOpenTelemetryComponent.Ya() ? this : null) != null ? videoOpenTelemetryComponent.i().i() : null;
        this.g = new bpn0(new m1o(this, 2));
        this.h = new bpn0(new btm(this, 4));
        this.i = new zsa0();
        this.j = new j000();
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIPS_NEW_DISK_CACHE;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        this.k = bVar.a(videoFeatures);
        b bVar2 = new b();
        this.l = bVar2;
        bpn0 bpn0Var = new bpn0(new vg0(11));
        this.m = bpn0Var;
        bpn0 bpn0Var2 = new bpn0(new s1m(this, 8));
        VideoFeatures videoFeatures2 = VideoFeatures.REMOVE_IS_PREPARED;
        videoFeatures2.getClass();
        this.n = bVar.a(videoFeatures2);
        asu0.a.getClass();
        uuv0 uuv0Var = new uuv0(asu0.o());
        uuv0Var.b.add(new g());
        this.o = uuv0Var;
        d dVar = new d();
        this.p = dVar;
        f fVar = new f();
        this.q = fVar;
        s2t s2tVar = new s2t();
        s2tVar.a = 1.0f;
        this.r = s2tVar;
        c cVar = new c();
        this.s = cVar;
        xi7 xi7Var = new xi7();
        xi7Var.b = new WeakReference(null);
        this.t = xi7Var;
        this.u = VideoMode.EMPTY;
        this.v = videoOpenTelemetryComponent.x6();
        oneVideoPlayer.d0(cVar);
        oneVideoPlayer.W(fVar);
        oneVideoPlayer.W(uuv0Var);
        oneVideoPlayer.s(dVar);
        oneVideoPlayer.D(bVar2);
        oneVideoPlayer.D((vsk) bpn0Var.getValue());
        oneVideoPlayer.e0(s2tVar);
        oneVideoPlayer.v((lj00) bpn0Var2.getValue());
        videoOpenTelemetryComponent.x6().b(oneVideoPlayer);
        this.x = new nza0(context, vkHttpCallFactory);
        toz.a.getClass();
        this.y = toz.b.b;
    }

    public static a.InterfaceC0045a t(m7q m7qVar, a.InterfaceC0045a interfaceC0045a) {
        if (m7qVar.n == 1 && fxc0.B().s().isEnabled()) {
            return fxc0.B().s().C(interfaceC0045a);
        }
        return null;
    }

    @Override // xsna.d3b0
    public final void C(boolean z) {
        nza0 nza0Var = this.x;
        en80 en80Var = nza0Var.e;
        OneVideoPlayer oneVideoPlayer = this.b;
        if (en80Var != null) {
            en80Var.f(oneVideoPlayer != null ? oneVideoPlayer.getCurrentPosition() : 0L, oneVideoPlayer != null ? oneVideoPlayer.getDuration() : 0L);
        }
        en80 en80Var2 = nza0Var.e;
        if (en80Var2 != null) {
            en80Var2.pause();
        }
        oneVideoPlayer.pause();
        this.c.i(z);
    }

    @Override // xsna.d3b0
    public final void L(VideoMode videoMode) {
        Map<String, Object> map;
        if (this.u != videoMode) {
            this.u = videoMode;
            nza0 nza0Var = this.x;
            if (nza0Var.s != videoMode) {
                if (nza0.a.a(nza0.x)) {
                    Objects.toString(nza0Var.s);
                    videoMode.toString();
                    Objects.toString(nza0Var.s);
                    new Exception();
                }
                nza0Var.s = videoMode;
                g4b0 g4b0Var = nza0Var.u;
                if (g4b0Var != null && (map = g4b0Var.j) != null) {
                    map.put(X3.a.t, videoMode.h());
                }
                fit0 fit0Var = nza0Var.h;
                if (fit0Var != null) {
                    String h = videoMode.h();
                    g4b0 g4b0Var2 = fit0Var.c;
                    if (g4b0Var2 != null) {
                        g4b0Var2.j.put(X3.a.t, h);
                    }
                }
                nza0Var.g.c(videoMode.h(), X3.a.t);
            }
        }
    }

    @Override // xsna.d3b0
    public final OneVideoPlayer a() {
        return this.b;
    }

    @Override // xsna.d3b0
    public final void b() {
        f(null);
        toz.a.getClass();
        g(toz.b.b);
        OneVideoPlayer oneVideoPlayer = this.b;
        oneVideoPlayer.setPlaybackSpeed(1.0f);
        this.B = false;
        this.C = false;
        oneVideoPlayer.V(false);
    }

    @Override // xsna.d3b0
    public final m7q c() {
        return this.z;
    }

    @Override // xsna.d3b0
    public final void d(izs<? super d3b0, s3q0> izsVar) {
        this.w = izsVar;
    }

    @Override // xsna.d3b0
    public final boolean e() {
        return this.b.p() && this.C;
    }

    @Override // xsna.d3b0
    public final void f(m7q m7qVar) {
        this.z = m7qVar;
        VideoFeatures videoFeatures = VideoFeatures.REVERSE_EXP_RENDERER_THREAD;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            return;
        }
        this.b.G(this.i);
    }

    @Override // xsna.d3b0
    public final void g(toz tozVar) {
        this.y = tozVar;
        this.c.j(tozVar, this.z != null ? Long.valueOf(r0.k * 1000) : null);
    }

    @Override // xsna.d3b0
    public final String getSessionId() {
        m7q m7qVar = this.z;
        if (m7qVar != null) {
            return m7qVar.z;
        }
        return null;
    }

    @Override // xsna.d3b0
    public final nza0 h() {
        return this.x;
    }

    @Override // xsna.d3b0
    public final void i(m7q m7qVar, z0d0 z0d0Var) {
        a.InterfaceC0045a s = s(jgz.e(m7qVar).a);
        a.InterfaceC0045a r = r(m7qVar, s);
        OneVideoPlayer oneVideoPlayer = this.b;
        if ((oneVideoPlayer instanceof xk80 ? (xk80) oneVideoPlayer : null) != null) {
            if (z0d0Var == null) {
                xk80 xk80Var = (xk80) oneVideoPlayer;
                xk80Var.B0(r);
                if (m7qVar.E) {
                    ClipsVideoStorage.a.getClass();
                    j7q c2 = ClipsVideoStorage.c();
                    androidx.media3.datasource.cache.c c3 = c2 != null ? c2.c() : null;
                    xk80Var.verifyThread("one.video.exo.OneVideoExoPlayer.setVideoDashPrioritisedCache");
                    xk80Var.s0 = c3;
                } else {
                    xk80Var.verifyThread("one.video.exo.OneVideoExoPlayer.setVideoDashPrioritisedCache");
                    xk80Var.s0 = null;
                }
            } else {
                xk80 xk80Var2 = (xk80) oneVideoPlayer;
                xk80Var2.B0(s);
                xk80Var2.verifyThread("one.video.exo.OneVideoExoPlayer.setVideoDashPrioritisedCache");
                xk80Var2.s0 = null;
            }
            ((xk80) oneVideoPlayer).P = z0d0Var;
        }
    }

    @Override // xsna.d3b0
    public final boolean isPrepared() {
        return this.B;
    }

    @Override // xsna.d3b0
    public final void j(ujt0 ujt0Var) {
        qcy<Object>[] qcyVarArr = E;
        qcy<Object> qcyVar = qcyVarArr[0];
        xi7 xi7Var = this.t;
        ujt0 ujt0Var2 = (ujt0) xi7Var.getValue(this, qcyVar);
        if (ujt0Var == ujt0Var2) {
            return;
        }
        xi7Var.setValue(this, qcyVarArr[0], ujt0Var);
        if (ujt0Var2 != null) {
            ujt0Var2.setPlayer(null);
        }
        OneVideoPlayer oneVideoPlayer = this.b;
        if (ujt0Var != null) {
            ujt0Var.setPlayer(oneVideoPlayer);
        }
        oneVideoPlayer.j0(ujt0Var != null ? ujt0Var.b() : null);
        u();
    }

    @Override // xsna.d3b0
    public final boolean k(ujt0 ujt0Var) {
        return ujt0Var == ((ujt0) this.t.getValue(this, E[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015e  */
    @Override // xsna.d3b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(m7q m7qVar, List<String> list) {
        Size size;
        boolean z;
        FrameSize frameSize;
        f(m7qVar);
        this.e.d.set(0);
        this.c.j(this.y, this.z != null ? Long.valueOf(r5.k * 1000) : null);
        this.B = false;
        this.C = false;
        if (m7qVar.F) {
            j000 j000Var = this.j;
            OneVideoPlayer oneVideoPlayer = this.b;
            if (a.a(D)) {
                oneVideoPlayer.getClass();
                Objects.toString(m7qVar);
                new Exception();
            }
            this.x.a(oneVideoPlayer, dx1.a(m7qVar));
            oneVideoPlayer.R(RepeatMode.OFF);
            s2t s2tVar = this.r;
            float f2 = m7qVar.v;
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = 1.0f;
            }
            s2tVar.getClass();
            s2tVar.a = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
            oneVideoPlayer.setPlaybackSpeed(1.0f);
            j000Var.a = 0L;
            j000Var.b = false;
            j000Var.c = false;
            j000Var.a = System.nanoTime();
        } else {
            j000 j000Var2 = this.j;
            sht0 sht0Var = m7qVar.e;
            boolean z2 = m7qVar.E;
            sht0Var.b.toString();
            this.l.getClass();
            nza0 nza0Var = this.x;
            OneVideoPlayer oneVideoPlayer2 = this.b;
            nza0Var.a(oneVideoPlayer2, dx1.a(m7qVar));
            sht0 e2 = jgz.e(m7qVar);
            s2t s2tVar2 = this.r;
            float f3 = m7qVar.v;
            if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f3 = 1.0f;
            }
            s2tVar2.getClass();
            s2tVar2.a = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
            oneVideoPlayer2.setPlaybackSpeed(1.0f);
            a.InterfaceC0045a r = r(m7qVar, s(e2.a));
            xk80 xk80Var = oneVideoPlayer2 instanceof xk80 ? (xk80) oneVideoPlayer2 : null;
            if (xk80Var != null) {
                if (!this.k) {
                    xk80Var.B0(r);
                    if (z2) {
                        ClipsVideoStorage.a.getClass();
                        j7q c2 = ClipsVideoStorage.c();
                        androidx.media3.datasource.cache.c c3 = c2 != null ? c2.c() : null;
                        xk80Var.verifyThread("one.video.exo.OneVideoExoPlayer.setVideoDashPrioritisedCache");
                        xk80Var.s0 = c3;
                    } else {
                        xk80Var.verifyThread("one.video.exo.OneVideoExoPlayer.setVideoDashPrioritisedCache");
                        xk80Var.s0 = null;
                    }
                }
                boolean z3 = m7qVar.C || m7qVar.E;
                AdaptiveTrackSelectionInterval h = fxc0.B().J().l0() ? fxc0.B().w0().h() : null;
                hk0 P = oneVideoPlayer2.P();
                if (fxc0.B().J().E() && z3) {
                    AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval = AdaptiveTrackSelectionInterval.HIGH;
                    if (P.a != (adaptiveTrackSelectionInterval != null ? adaptiveTrackSelectionInterval.i() : null) || P.b != adaptiveTrackSelectionInterval.h()) {
                        z = true;
                        if (h != null || (frameSize = h.i()) == null) {
                            frameSize = P.a;
                        }
                        if (h != null || (r9 = h.h()) == null) {
                            FrameSize frameSize2 = P.b;
                        }
                        FrameSize frameSize3 = !z2 ? FrameSize._360p : frameSize;
                        P.getClass();
                        oneVideoPlayer2.b0(new hk0(frameSize, frameSize2, z, frameSize3));
                    }
                }
                z = false;
                if (h != null) {
                }
                frameSize = P.a;
                if (h != null) {
                }
                FrameSize frameSize22 = P.b;
                if (!z2) {
                }
                P.getClass();
                oneVideoPlayer2.b0(new hk0(frameSize, frameSize22, z, frameSize3));
            }
            j000Var2.a = 0L;
            j000Var2.b = false;
            j000Var2.c = false;
            j000Var2.a = System.nanoTime();
            if (fxc0.B().J().E()) {
                a aVar = D;
                Context context = this.a;
                aVar.getClass();
                float f4 = m7qVar.l / m7qVar.m;
                Float valueOf = Float.valueOf(f4);
                if (Float.isNaN(f4)) {
                    valueOf = null;
                }
                float floatValue = valueOf != null ? valueOf.floatValue() : 1.0f;
                Point z4 = y2r0.z(context);
                if (context.getResources().getConfiguration().orientation == 1) {
                    int i = z4.x;
                    size = new Size(i, (int) (i / floatValue));
                } else {
                    size = new Size((int) (z4.x * floatValue), z4.y);
                }
                oneVideoPlayer2.X(size);
            }
        }
        OneVideoPlayer oneVideoPlayer3 = this.b;
        xk80 xk80Var2 = oneVideoPlayer3 instanceof xk80 ? (xk80) oneVideoPlayer3 : null;
        if (xk80Var2 != null) {
            xk80Var2.Y = list;
        }
        this.b.C(jgz.e(m7qVar), m7qVar.s);
    }

    @Override // xsna.d3b0
    public final izs<d3b0, s3q0> m() {
        return this.w;
    }

    @Override // xsna.d3b0
    public final am80 n() {
        return this.c;
    }

    @Override // xsna.d3b0
    public final void o(fuk0 fuk0Var) {
        this.A = fuk0Var;
        if (!(this.n ? false : this.B) || fuk0Var == null) {
            return;
        }
        fuk0Var.S0(this);
    }

    @Override // xsna.d3b0
    public final void p(mm80 mm80Var) {
        OneVideoPlayer oneVideoPlayer = this.b;
        if ((oneVideoPlayer instanceof xk80 ? (xk80) oneVideoPlayer : null) != null) {
            ((xk80) oneVideoPlayer).O = mm80Var;
        }
    }

    @Override // xsna.d3b0
    public final boolean q(one.video.player.tracks.a aVar) {
        fuk0 fuk0Var;
        OneVideoPlayer oneVideoPlayer = this.b;
        one.video.player.tracks.a M = oneVideoPlayer.M();
        if (epx.f(M != null ? M.b : null, aVar.b)) {
            return false;
        }
        boolean q = oneVideoPlayer.q(aVar);
        if (q && (fuk0Var = this.A) != null) {
            fuk0Var.i(this, aVar);
        }
        return q;
    }

    public final a.InterfaceC0045a r(m7q m7qVar, final a.InterfaceC0045a interfaceC0045a) {
        a.InterfaceC0045a t;
        a.b bVar;
        androidx.media3.datasource.cache.c c2;
        CacheDataSink.a aVar;
        if (m7qVar.n == 4) {
            MediaStorage mediaStorage = MediaStorage.b;
            return MediaStorage.c(MediaStorage.VideoCacheType.COVERS).d();
        }
        if (m7qVar.p && m7qVar.x == null) {
            int i = m7qVar.i;
            if (i != -4) {
                if (i == -2) {
                    t = t(m7qVar, interfaceC0045a);
                } else if (m7qVar.B) {
                    a.b bVar2 = new a.b();
                    g9e0 g9e0Var = MediaStorage.d.a;
                    qcy<Object> qcyVar = ezt.b[0];
                    bVar2.a = (androidx.media3.datasource.cache.c) g9e0Var.b();
                    bVar2.e = interfaceC0045a;
                    t = new ssu(bVar2);
                } else {
                    t = t(m7qVar, interfaceC0045a);
                }
            } else if (m7qVar.E) {
                ClipsVideoStorage.a.getClass();
                a.InterfaceC0045a interfaceC0045a2 = new a.InterfaceC0045a() { // from class: xsna.mnf
                    @Override // androidx.media3.datasource.a.InterfaceC0045a
                    public final androidx.media3.datasource.a createDataSource() {
                        return a.InterfaceC0045a.this.createDataSource();
                    }
                };
                j7q c3 = ClipsVideoStorage.c();
                if (c3 == null || (c2 = c3.c()) == null) {
                    bVar = null;
                } else {
                    bVar = new a.b();
                    bVar.a = c2;
                    bVar.e = interfaceC0045a2;
                    if (com.vk.toggle.d.g().b) {
                        aVar = null;
                    } else {
                        aVar = new CacheDataSink.a();
                        aVar.a = c2;
                        aVar.b = 2097152L;
                    }
                    bVar.d(aVar);
                    bVar.h = 3;
                    bVar.c = (yw8) ClipsVideoStorage.f.getValue();
                }
                if (bVar != null) {
                    interfaceC0045a2 = bVar;
                }
                t = new androidx.media3.datasource.d(this.a, (mjp0) null, interfaceC0045a2);
            } else {
                t = t(m7qVar, interfaceC0045a);
            }
            if (t != null) {
                return t;
            }
        }
        return interfaceC0045a;
    }

    public final a.InterfaceC0045a s(VideoContentType videoContentType) {
        return e.$EnumSwitchMapping$0[videoContentType.ordinal()] == 1 ? (a.InterfaceC0045a) this.h.getValue() : (a.InterfaceC0045a) this.g.getValue();
    }

    public final void u() {
        m7q m7qVar;
        String str;
        ujt0 ujt0Var = (ujt0) this.t.getValue(this, E[0]);
        if (ujt0Var == null || (m7qVar = this.z) == null || (str = m7qVar.a) == null) {
            return;
        }
        String str2 = m7qVar.z;
        if (str2 == null && (str2 = getSessionId()) == null) {
            return;
        }
        String str3 = str2;
        m7q m7qVar2 = this.z;
        if (m7qVar2 != null) {
            ujt0Var.a(ces0.a(ujt0Var.c(), str, str3, m7qVar2.u, null, qu5.c().k(), qu5.c().d(), 8));
        }
    }

    /* compiled from: ExoPlayerBase.kt */
    public final class c implements one.video.player.f {
        public c() {
        }

        public final void C(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
            int i;
            cms0 cms0Var;
            if (fxc0.B().J().l0() && baseVideoPlayer.O()) {
                FrameSize b = (cVar == null || (cms0Var = (cms0) cVar.c) == null) ? null : cms0Var.b();
                if (b != null) {
                    switch (d5b0.a.$EnumSwitchMapping$0[e3r0.a(b.getWidth(), b.getHeight()).ordinal()]) {
                        case 1:
                            i = 144;
                            break;
                        case 2:
                            i = PsExtractor.VIDEO_STREAM_MASK;
                            break;
                        case 3:
                            i = 360;
                            break;
                        case 4:
                            i = 480;
                            break;
                        case 5:
                            i = PublisherConfiguration.DEFAULT_MAX_RES;
                            break;
                        case 6:
                            i = 1080;
                            break;
                        case 7:
                            i = 1440;
                            break;
                        case 8:
                            i = 2160;
                            break;
                        case 9:
                            i = 4320;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    fxc0.B().w(i);
                    return;
                }
                hk0 hk0Var = baseVideoPlayer.y;
                AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval = AdaptiveTrackSelectionInterval.HIGH;
                boolean z = false;
                boolean z2 = hk0Var.a == (adaptiveTrackSelectionInterval != null ? adaptiveTrackSelectionInterval.i() : null) && hk0Var.b == adaptiveTrackSelectionInterval.h();
                hk0 hk0Var2 = baseVideoPlayer.y;
                AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval2 = AdaptiveTrackSelectionInterval.LOW;
                fxc0.B().h0(z2 ? QualitySettingsType.HIGH : hk0Var2.a == (adaptiveTrackSelectionInterval2 != null ? adaptiveTrackSelectionInterval2.i() : null) && hk0Var2.b == adaptiveTrackSelectionInterval2.h() ? QualitySettingsType.ECONOM : QualitySettingsType.AUTO);
                if (fxc0.B().J().E() && !z2) {
                    z = true;
                }
                m7q m7qVar = a6q.this.z;
                if (m7qVar == null) {
                    return;
                }
                if (m7qVar.C || m7qVar.E) {
                    hk0 hk0Var3 = baseVideoPlayer.y;
                    if (hk0Var3.c != z) {
                        baseVideoPlayer.b0(hk0.a(hk0Var3, null, null, z, 11));
                    }
                }
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
            mza0 mza0Var;
            a6q a6qVar = a6q.this;
            nza0 nza0Var = a6qVar.x;
            fuk0 fuk0Var = a6qVar.A;
            if (fuk0Var != null) {
                fuk0Var.z(discontinuityReason);
            }
            if (discontinuityReason == OneVideoPlayer.DiscontinuityReason.AUTO_TRANSITION) {
                en80 en80Var = nza0Var.e;
                if (en80Var != null) {
                    en80Var.g();
                }
                mza0 mza0Var2 = nza0Var.p;
                if (mza0Var2 != null) {
                    mza0Var2.a();
                }
            }
            if (discontinuityReason != OneVideoPlayer.DiscontinuityReason.SEEK || (mza0Var = nza0Var.p) == null || bps0.a == null) {
                return;
            }
            qg90<Long, Integer> qg90Var = mza0Var.b;
            r2u0 r2u0Var = dst0.b;
            qg90<UserId, Integer> qg90Var2 = new qg90<>(new UserId(qg90Var.a.longValue()), qg90Var.b);
            r2u0Var.getClass();
            bpn0 bpn0Var = irt0.d;
            CachedVideoViewedSegments a = irt0.b.a().a(qg90Var2);
            if (a != null) {
                a.Eb().d();
                irt0.b.a().e(a);
                r2u0Var.c = 0L;
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void c(BaseVideoPlayer baseVideoPlayer, hk0 hk0Var) {
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_OTHER_QUALITY_STICKING_FIX;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                return;
            }
            C(baseVideoPlayer, null);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
            cms0 cms0Var;
            cms0 cms0Var2;
            a6q a6qVar = a6q.this;
            fuk0 fuk0Var = a6qVar.A;
            if (fuk0Var != null) {
                fuk0Var.x(cVar);
            }
            int i = 0;
            int i2 = (cVar == null || (cms0Var2 = (cms0) cVar.c) == null) ? 0 : cms0Var2.e;
            if (cVar != null && (cms0Var = (cms0) cVar.c) != null) {
                i = cms0Var.f;
            }
            fuk0 fuk0Var2 = a6qVar.A;
            if (fuk0Var2 != null) {
                fuk0Var2.n(a6qVar, i2, i);
            }
            Integer a = vm80.a(baseVideoPlayer);
            if (a != null) {
                int intValue = a.intValue();
                nza0 nza0Var = a6qVar.x;
                Integer num = nza0Var.r;
                if (num != null && num.intValue() == intValue) {
                    return;
                }
                nza0Var.r = a;
                en80 en80Var = nza0Var.e;
                if (en80Var != null) {
                    en80Var.d(d5b0.a(intValue));
                }
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void f(OneVideoPlayer oneVideoPlayer) {
            a6q.this.B = false;
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void h(OneVideoPlayer oneVideoPlayer) {
            a6q a6qVar = a6q.this;
            fuk0 fuk0Var = a6qVar.A;
            if (fuk0Var != null) {
                fuk0Var.L0();
            }
            nza0 nza0Var = a6qVar.x;
            en80 en80Var = nza0Var.e;
            if (en80Var != null) {
                en80Var.g();
            }
            mza0 mza0Var = nza0Var.p;
            if (mza0Var != null) {
                mza0Var.a();
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void j(OneVideoPlayer oneVideoPlayer) {
            fuk0 fuk0Var;
            a6q a6qVar = a6q.this;
            if ((a6qVar.B || a6qVar.n) && (fuk0Var = a6qVar.A) != null) {
                fuk0Var.h();
            }
            a6qVar.c.h();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void k(OneVideoPlayer oneVideoPlayer, long j) {
            fuk0 fuk0Var;
            boolean a = a.a(a6q.D);
            a6q a6qVar = a6q.this;
            if (a) {
                a6qVar.b.getClass();
            }
            if (j < 0 || (fuk0Var = a6qVar.A) == null) {
                return;
            }
            fuk0Var.s(j);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void m(xk80 xk80Var, one.video.player.tracks.b bVar, boolean z) {
            String str;
            who0 who0Var;
            boolean a = a.a(a6q.D);
            a6q a6qVar = a6q.this;
            if (a) {
                a6qVar.b.getClass();
                Objects.toString(bVar);
            }
            nza0 nza0Var = a6qVar.x;
            nza0Var.getClass();
            boolean z2 = false;
            if (bVar != null && bVar.d) {
                z2 = true;
            }
            if (bVar == null || (who0Var = (who0) bVar.c) == null || (str = who0Var.c) == null) {
                str = null;
            } else if (z2) {
                str = str.concat("_auto");
            }
            bj80 bj80Var = nza0Var.g;
            if (str == null) {
                str = "";
            }
            bj80Var.c(str, "subtitles");
            fuk0 fuk0Var = a6qVar.A;
            if (fuk0Var != null) {
                fuk0Var.r(bVar, z);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void n(xk80 xk80Var, one.video.player.tracks.c cVar) {
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_OTHER_QUALITY_STICKING_FIX;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                return;
            }
            C(xk80Var, cVar);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void o(BaseVideoPlayer baseVideoPlayer, float f) {
            fuk0 fuk0Var = a6q.this.A;
            if (fuk0Var != null) {
                fuk0Var.u(f);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void p(OneVideoPlayer oneVideoPlayer) {
            a6q a6qVar = a6q.this;
            j000 j000Var = a6qVar.j;
            if (j000Var.a <= 0 || j000Var.b) {
                return;
            }
            j000Var.b = true;
            fuk0 fuk0Var = a6qVar.A;
            if (fuk0Var != null) {
                fuk0Var.t(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j000Var.a));
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
            PlayerError playerError;
            OneVideoSourceException.a g;
            if (oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.UNRESOLVED) {
                playerError = PlayerError.ERROR_NOT_SUPPORT;
            } else if (oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.RENDERER) {
                playerError = PlayerError.ERROR_CANT_DECODE;
            } else {
                if (oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.SOURCE) {
                    OneVideoSourceException i = oneVideoPlaybackException.i();
                    if (((i == null || (g = i.g()) == null) ? null : Integer.valueOf(g.a)) != null) {
                        playerError = PlayerError.ERROR_SERVER;
                    }
                }
                playerError = oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.UNEXPECTED ? PlayerError.ERROR_NOT_SUPPORT_RESOLUTION : PlayerError.ERROR_NETWORK;
            }
            a6q a6qVar = a6q.this;
            fuk0 fuk0Var = a6qVar.A;
            if (fuk0Var != null) {
                fuk0Var.k(playerError, oneVideoPlaybackException);
            }
            a6qVar.B = false;
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void r(OneVideoPlayer oneVideoPlayer) {
            fuk0 fuk0Var = a6q.this.A;
            if (fuk0Var != null) {
                fuk0Var.w();
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void s(OneVideoPlayer oneVideoPlayer) {
            fuk0 fuk0Var;
            a6q a6qVar = a6q.this;
            boolean z = a6qVar.n;
            if (z || a6qVar.B) {
                return;
            }
            a6qVar.B = true;
            if (z || (fuk0Var = a6qVar.A) == null) {
                return;
            }
            fuk0Var.S0(a6qVar);
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void v(OneVideoPlayer oneVideoPlayer) {
            fuk0 fuk0Var = a6q.this.A;
            if (fuk0Var != null) {
                fuk0Var.g();
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void w(BaseVideoPlayer baseVideoPlayer) {
            a6q a6qVar = a6q.this;
            fuk0 fuk0Var = a6qVar.A;
            if (fuk0Var != null) {
                fuk0Var.o(a6qVar);
            }
            a6qVar.u();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void x(OneVideoPlayer oneVideoPlayer) {
            a6q a6qVar = a6q.this;
            a6qVar.C = true;
            j000 j000Var = a6qVar.j;
            j000Var.getClass();
            Long valueOf = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j000Var.a));
            if (j000Var.a <= 0 || j000Var.c) {
                valueOf = null;
            }
            j000Var.c = true;
            fuk0 fuk0Var = a6qVar.A;
            if (fuk0Var != null) {
                fuk0Var.E0(valueOf);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void y(OneVideoPlayer oneVideoPlayer, boolean z) {
            fuk0 fuk0Var = a6q.this.A;
            if (fuk0Var != null) {
                fuk0Var.l(z);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
            fuk0 fuk0Var;
            OneVideoPlayer.State state3 = OneVideoPlayer.State.BUFFERING;
            if (state == state3 && state2 == OneVideoPlayer.State.PLAYING) {
                fuk0 fuk0Var2 = a6q.this.A;
                if (fuk0Var2 != null) {
                    fuk0Var2.h();
                }
            } else if (state == state3 && state2 == OneVideoPlayer.State.PAUSED && (fuk0Var = a6q.this.A) != null) {
                fuk0Var.w();
            }
            if (state2 == OneVideoPlayer.State.IDLE) {
                a6q a6qVar = a6q.this;
                j000 j000Var = a6qVar.j;
                j000Var.a = 0L;
                j000Var.b = false;
                j000Var.c = false;
                nza0 nza0Var = a6qVar.x;
                en80 en80Var = nza0Var.e;
                if (en80Var != null) {
                    en80Var.j();
                }
                en80 en80Var2 = nza0Var.e;
                if (en80Var2 != null) {
                    en80Var2.pause();
                }
                mza0 mza0Var = nza0Var.p;
                if (mza0Var != null) {
                    mza0Var.a();
                }
                nza0Var.p = null;
                a6qVar.C = false;
                return;
            }
            if (state2 != OneVideoPlayer.State.RELEASED) {
                if (state2 == OneVideoPlayer.State.PLAYING) {
                    nza0 nza0Var2 = a6q.this.x;
                    en80 en80Var3 = nza0Var2.e;
                    if (en80Var3 != null) {
                        en80Var3.k(baseVideoPlayer.getCurrentPosition(), baseVideoPlayer.getDuration());
                    }
                    en80 en80Var4 = nza0Var2.e;
                    if (en80Var4 != null) {
                        en80Var4.start();
                    }
                    a6q.this.c.h();
                    return;
                }
                return;
            }
            a6q a6qVar2 = a6q.this;
            j000 j000Var2 = a6qVar2.j;
            j000Var2.a = 0L;
            j000Var2.b = false;
            j000Var2.c = false;
            baseVideoPlayer.B(a6qVar2.r);
            baseVideoPlayer.K(a6qVar2.l);
            baseVideoPlayer.K((vsk) a6qVar2.m.getValue());
            baseVideoPlayer.T(a6qVar2.p);
            baseVideoPlayer.r(a6qVar2.o);
            baseVideoPlayer.r(a6qVar2.q);
            baseVideoPlayer.c0(a6qVar2.s);
            baseVideoPlayer.v(null);
            nza0 nza0Var3 = a6qVar2.x;
            nza0Var3.getClass();
            if (nza0.a.a(nza0.x)) {
                new Exception();
            }
            pgn pgnVar = nza0Var3.t;
            qcy<Object> qcyVar = nza0.y[0];
            pgnVar.b(null);
            baseVideoPlayer.c0(nza0Var3.l);
            nza0Var3.j.a = null;
            fit0 fit0Var = nza0Var3.h;
            if (fit0Var != null) {
                fit0Var.d(null);
            }
            nza0Var3.g.z(null);
            oyk0 oyk0Var = nza0Var3.i;
            if (oyk0Var != null) {
                oyk0Var.z(null);
            }
            nza0Var3.m.a(null);
            uxs0 uxs0Var = nza0Var3.m;
            VideoPlayerType videoPlayerType = VideoPlayerType.UNKNOWN;
            uxs0Var.getClass();
            nza0Var3.n.a(null);
            nza0Var3.n.b(videoPlayerType);
            baseVideoPlayer.r(nza0Var3.o);
            en80 en80Var5 = nza0Var3.e;
            if (en80Var5 != null) {
                en80Var5.setPlayer(null);
            }
            en80 en80Var6 = nza0Var3.e;
            if (en80Var6 != null) {
                HashSet<Pair<VkHttpCallFactory.a, Executor>> hashSet = VkHttpCallFactory.k.get(Integer.valueOf(nza0Var3.a.e));
                if (hashSet != null) {
                    hashSet.removeIf(new wqk(new egt0(en80Var6, 4), 1));
                }
                en80Var6.release();
            }
            gof0 gof0Var = nza0Var3.f;
            if (gof0Var != null) {
                gof0Var.a.a.g.onNext(Reef.State.RELEASED);
            }
            ry70 ry70Var = nza0Var3.b;
            qcn qcnVar = ry70Var.b.b;
            synchronized (qcnVar) {
                try {
                    Iterator<f8f0.a> it = qcnVar.e.iterator();
                    while (it.hasNext()) {
                        f8f0.this.cancel();
                    }
                    Iterator<f8f0.a> it2 = qcnVar.f.iterator();
                    while (it2.hasNext()) {
                        f8f0.this.cancel();
                    }
                    Iterator<f8f0> it3 = qcnVar.g.iterator();
                    while (it3.hasNext()) {
                        it3.next().cancel();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            tx70 tx70Var = ry70Var.a;
            synchronized (tx70Var.b) {
                tx70Var.b.clear();
                s3q0 s3q0Var = s3q0.a;
            }
            nza0Var3.w = null;
            a6qVar2.d.x6().c(baseVideoPlayer);
            a6qVar2.C = false;
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void d(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void l(OneVideoPlayer oneVideoPlayer) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        @ozl
        public final void b(OneVideoPlayer oneVideoPlayer, boolean z) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void g(BaseVideoPlayer baseVideoPlayer, float f) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void i(OneVideoPlayer oneVideoPlayer, int i) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void t(OneVideoPlayer oneVideoPlayer, one.video.player.tracks.a aVar) {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void u(BaseVideoPlayer baseVideoPlayer, RepeatMode repeatMode) {
        }
    }

    /* compiled from: ExoPlayerBase.kt */
    public static final class g implements uuv0.a {
        public g() {
        }

        @Override // xsna.uuv0.a
        public final void a(long j) {
            fuk0 fuk0Var = a6q.this.A;
            if (fuk0Var != null) {
                fuk0Var.y(j);
            }
        }

        @Override // xsna.uuv0.a
        public final void b(int i) {
        }
    }

    /* compiled from: ExoPlayerBase.kt */
    public static final class f implements one.video.player.g {
        public f() {
        }

        @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
        public final void b(OneVideoPlayer oneVideoPlayer, String str, String str2) {
            g4b0 g4b0Var;
            g4b0 g4b0Var2;
            nza0 nza0Var = a6q.this.x;
            bj80 bj80Var = nza0Var.g;
            fit0 fit0Var = nza0Var.h;
            if (fit0Var != null && (g4b0Var2 = fit0Var.c) != null) {
                g4b0Var2.j.put("connection_type", str);
            }
            if (fit0Var != null && (g4b0Var = fit0Var.c) != null) {
                g4b0Var.j.put("connection_reused", str2);
            }
            bj80Var.c(str, "connection_type");
            bj80Var.c(str2, "connection_reused");
        }

        @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
        public final void c(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z) {
        }

        @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
        public final void d(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z) {
        }

        @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
        public final void e(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z) {
        }

        @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
        public final void a(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z, int i) {
        }
    }
}
