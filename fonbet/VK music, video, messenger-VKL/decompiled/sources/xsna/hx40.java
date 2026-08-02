package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.datasource.AssetDataSource;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.a;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.music.AudioLoudness;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.moosic.EncryptedFileInfo;
import com.vk.dto.music.moosic.MoosicAudio;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.api.helper.AudioPlayer;
import com.vk.music.player.api.helper.dto.AudioPlaybackError;
import com.vk.music.player.cache.MusicPlayerCacheComponent;
import com.vk.music.player.core.audioeffect.fade.FadeDirection;
import com.vk.music.player.core.helper.AudioPlayerType;
import com.vk.music.player.core.helper.moosic.VkMusicOfflineCipher;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import one.video.statistics.ContentType;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.dnk;
import xsna.en4;
import xsna.fx40;
import xsna.jk80;
import xsna.k840;
import xsna.kr10;
import xsna.kw40;
import xsna.ljp;
import xsna.ry40;

/* compiled from: MusicPlayerHelperImpl.kt */
/* loaded from: classes3.dex */
public final class hx40 implements dx40 {
    public static final /* synthetic */ qcy<Object>[] u;
    public final cz40 b;
    public final Context c;
    public final fx40.a d;
    public final aw40 e;
    public final Object f;
    public float g;
    public final fx40.a h;
    public final String i;
    public final x6b0 j;
    public boolean k;
    public final k5q l;
    public final bpn0 m;
    public final ct4 n;
    public final ty40 o;
    public kx40 p;
    public final cra q;
    public final bpn0 r;
    public final bpn0 s;
    public final bpn0 t;

    /* compiled from: MusicPlayerHelperImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioPlaybackError.Type.values().length];
            try {
                iArr[AudioPlaybackError.Type.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioPlaybackError.Type.RENDERER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioPlaybackError.Type.UNEXPECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MusicPlayerHelperImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            g4b0 g4b0Var = ((c7q) this.receiver).b;
            if (g4b0Var != null) {
                wi80.b("first_bytes", g4b0Var, Long.valueOf(SystemClock.elapsedRealtime() - g4b0Var.k), null);
            }
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(hx40.class, "musicPlayerListener", "getMusicPlayerListener()Lcom/vk/music/player/api/listener/MusicPlayerListener;", 0);
        fpf0.a.getClass();
        u = new qcy[]{mutablePropertyReference1Impl};
    }

    public hx40(cz40 cz40Var, Context context, otp otpVar, fx40.a aVar, b370 b370Var, aw40 aw40Var) {
        this.b = cz40Var;
        this.c = context;
        this.d = aVar;
        this.e = aw40Var;
        this.f = msy.a(LazyThreadSafetyMode.NONE, new n1i(this, 29));
        this.g = 1.0f;
        Object obj = PlaybackLaunchMeta.g;
        PlaybackLaunchMeta.a.a();
        this.h = aVar;
        this.i = UUID.randomUUID().toString();
        this.j = x6b0.d.getSTUB();
        bpn0 bpn0Var = new bpn0(new b1z(this, 9));
        k5q k5qVar = new k5q();
        this.l = k5qVar;
        bpn0 bpn0Var2 = new bpn0(new e20(19));
        this.m = bpn0Var2;
        ct4 ct4Var = new ct4(new ix40(this), k5qVar, (cy1) bpn0Var2.getValue(), this, aw40Var, otpVar, (xs4) bpn0Var.getValue());
        this.n = ct4Var;
        ty40 ty40Var = new ty40(cz40Var, context, aVar, ct4Var);
        this.o = ty40Var;
        this.p = new kx40(null, null, null, null, null, false, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        this.q = new cra(aVar, this, new oe5(12, this, b370Var), aw40Var);
        this.r = new bpn0(new wb1(28));
        this.s = new bpn0(new qfj(this, 25));
        this.t = new bpn0(new w4u(this, 18));
        ty40Var.p = e();
        xs4 xs4Var = (xs4) bpn0Var.getValue();
        Context context2 = e43.a;
        xs4Var.a(context2 == null ? null : context2);
    }

    public static boolean m(MusicTrack musicTrack) {
        boolean z;
        EncryptedFileInfo encryptedFileInfo;
        String str;
        if (!musicTrack.Sb() || !k840.a.i.c()) {
            return false;
        }
        MoosicAudio moosicAudio = musicTrack.W;
        File file = (moosicAudio == null || (encryptedFileInfo = moosicAudio.d) == null || (str = encryptedFileInfo.b) == null) ? null : new File(str);
        if (file == null) {
            return false;
        }
        try {
            z = file.exists();
        } catch (SecurityException unused) {
            z = false;
        }
        return z;
    }

    @Override // xsna.ex40
    public final float C() {
        ct4 ct4Var = this.n;
        qs4 b2 = ct4Var.b();
        if (b2 != null) {
            return b2.a.a.getVolume();
        }
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        if (BuildInfo.h()) {
            throw new RuntimeException("[ExoPlayerProvider#getAudioVolumeInternal] - Player not initialized");
        }
        bn40.d("[ExoPlayerProvider#getAudioVolumeInternal] - Player not initialized");
        return ct4Var.j;
    }

    @Override // xsna.ex40
    public final x6b0 H() {
        return this.j;
    }

    public final androidx.media3.exoplayer.source.n a(Uri uri) {
        androidx.media3.datasource.d dVar = new androidx.media3.datasource.d(this.c, (String) null, (jk80.a) null);
        b630 b630Var = new b630(new uel(), 8);
        androidx.media3.exoplayer.upstream.a aVar = new androidx.media3.exoplayer.upstream.a();
        kr10.b.a aVar2 = new kr10.b.a();
        com.google.common.collect.h hVar = com.google.common.collect.h.h;
        ImmutableList.b bVar = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        List list = Collections.EMPTY_LIST;
        com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
        kr10.e.a aVar3 = new kr10.e.a();
        kr10.g gVar3 = kr10.g.a;
        kr10.f fVar = uri != null ? new kr10.f(uri, null, null, list, null, gVar2, C.TIME_UNSET) : null;
        kr10 kr10Var = new kr10("", new kr10.c(aVar2), fVar, new kr10.e(aVar3), vr10.B, gVar3);
        fVar.getClass();
        kr10.f fVar2 = kr10Var.b;
        fVar2.getClass();
        fVar2.getClass();
        return new androidx.media3.exoplayer.source.n(kr10Var, dVar, b630Var, androidx.media3.exoplayer.drm.b.a, aVar, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null);
    }

    @Override // xsna.ex40
    public final float b() {
        return this.g;
    }

    @Override // xsna.ex40
    public final cz40 c() {
        return this.b;
    }

    public final boolean d(int i, Runnable runnable) {
        StringBuilder sb = new StringBuilder("state=");
        ty40 ty40Var = this.o;
        sb.append(ty40Var.e);
        sb.append(", actionTrigger=");
        sb.append(i);
        bn40.f(sb.toString());
        ty40Var.e(i);
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final px40 e() {
        qcy<Object> qcyVar = u[0];
        cra craVar = this.q;
        if (((px40) craVar.c) == null) {
            Iterator it = ((List) craVar.b.getValue()).iterator();
            px40 px40Var = null;
            while (it.hasNext()) {
                px40Var = ((qx40) it.next()).a(px40Var);
            }
            craVar.c = px40Var;
        }
        return (px40) craVar.c;
    }

    @Override // xsna.dx40
    public final boolean f(PlaybackActionMeta playbackActionMeta) {
        StringBuilder sb = new StringBuilder("state=");
        ty40 ty40Var = this.o;
        sb.append(ty40Var.e);
        sb.append(", actionTrigger=");
        sb.append(playbackActionMeta.b);
        bn40.f(sb.toString());
        ty40Var.getClass();
        ty40Var.l(playbackActionMeta.b, playbackActionMeta.c, ty40Var.a(), ty40Var.m.a);
        ty40Var.x = true;
        boolean z = ty40Var.e.i() || this.k;
        if (z) {
            if (ty40Var.d()) {
                ty40Var.i(true);
                return z;
            }
            if (this.p.f()) {
                u(kx40.a(this.p, null, null, playbackActionMeta, false, 495));
            }
        }
        return z;
    }

    @Override // xsna.ex40
    public final boolean g() {
        qs4 b2 = this.n.b();
        if (b2 != null) {
            Boolean valueOf = Boolean.valueOf(b2.a.c.b());
            Boolean bool = Boolean.TRUE;
            return epx.f(valueOf, bool) || epx.f(Boolean.valueOf(b2.a().c.b()), bool);
        }
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        if (BuildInfo.h()) {
            throw new RuntimeException("[ExoPlayerProvider#isLoudnessNormalizationEffective] - Player not initialized");
        }
        bn40.d("[ExoPlayerProvider#isLoudnessNormalizationEffective] - Player not initialized");
        return false;
    }

    @Override // xsna.dx40
    public final int getAudioSessionId() {
        qs4 b2 = this.n.b();
        if (b2 != null) {
            return b2.a.a.getAudioSessionId();
        }
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        if (BuildInfo.h()) {
            throw new RuntimeException("[ExoPlayerProvider#getAudioSessionId] - Player not initialized");
        }
        bn40.d("[ExoPlayerProvider#getAudioSessionId] - Player not initialized");
        return 0;
    }

    @Override // xsna.dx40
    public final int getBufferedPercentage() {
        ty40 ty40Var = this.o;
        if (ty40Var.f) {
            return ty40Var.d.a().getBufferedPercentage();
        }
        return 0;
    }

    @Override // xsna.ex40
    public final fx40 getConfig() {
        return this.h;
    }

    @Override // xsna.dx40
    public final long getCurrentPosition() {
        return this.o.a();
    }

    @Override // xsna.dx40
    public final ry40 getState() {
        return this.o.e;
    }

    @Override // xsna.ex40
    public final String h() {
        return this.i;
    }

    public final AudioPlayer i() {
        ct4 ct4Var = this.n;
        if (ct4Var.c()) {
            return ct4Var.a();
        }
        return null;
    }

    @Override // xsna.dx40
    public final boolean isRunning() {
        return this.o.d();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dx40
    public final boolean j(int i, PlaybackActionMeta playbackActionMeta) {
        long j;
        kw40 g;
        StringBuilder sb = new StringBuilder("state=");
        ty40 ty40Var = this.o;
        sb.append(ty40Var.e);
        sb.append(", millis=");
        sb.append(i);
        sb.append(", actionTrigger=");
        int i2 = playbackActionMeta.b;
        sb.append(i2);
        bn40.f(sb.toString());
        long j2 = i;
        boolean z = ty40Var.f;
        if (z) {
            if (i2 == 26) {
                j = j2;
            } else if (ty40Var.e.j()) {
                long a2 = ty40Var.a();
                ty40Var.l(playbackActionMeta.b, playbackActionMeta.c, a2, ty40Var.m.a);
                ty40Var.m.e = j2;
                w0q w0qVar = (w0q) ty40Var.j.getValue();
                lw40 lw40Var = (lw40) ty40Var.h.getValue();
                nw40 nw40Var = ty40Var.m;
                rfc a3 = fpf0.a(kw40.a.class);
                if (a3.equals(fpf0.a(kw40.b.class))) {
                    g = ((hy40) lw40Var.a.getValue()).g(nw40Var);
                } else if (a3.equals(fpf0.a(kw40.a.class))) {
                    g = ((cy40) lw40Var.b.getValue()).g(nw40Var);
                } else {
                    if (!a3.equals(fpf0.a(kw40.c.class))) {
                        throw new IllegalStateException(("Unknown music player event " + fpf0.a(kw40.a.class)).toString());
                    }
                    g = ((zy40) lw40Var.c.getValue()).g(nw40Var);
                }
                w0qVar.a(new ry40.d((kw40.a) g, ty40Var.b()));
                ty40Var.l(playbackActionMeta.b, playbackActionMeta.c, j2, a2);
                j = j2;
            } else {
                j = j2;
                long j3 = playbackActionMeta.c;
                nw40 nw40Var2 = ty40Var.m;
                ty40Var.l(26, j3, nw40Var2.a, nw40Var2.b);
            }
            ty40Var.x = true;
            ty40Var.t = true;
            qxo0 qxo0Var = ty40Var.q;
            if (qxo0Var != null) {
                ju4 ju4Var = qxo0Var.c;
                ((Handler) ju4Var.a).removeCallbacks((Runnable) ju4Var.b);
            }
            ty40Var.q = null;
            ty40Var.d.a().seekTo(j);
            ty40Var.k();
        }
        return z;
    }

    public final long l() {
        ty40 ty40Var = this.o;
        if (ty40Var.f) {
            return ty40Var.d.a().getDuration();
        }
        return 0L;
    }

    public final void n(AudioPlaybackError audioPlaybackError) {
        Throwable runtimeException;
        String d = audioPlaybackError.d();
        bn40.c(audioPlaybackError, "code=", d, "playUrl=", this.p.b(), "launchMeta=", this.p.d);
        try {
            int i = a.$EnumSwitchMapping$0[audioPlaybackError.g().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                runtimeException = audioPlaybackError.getCause();
            } else {
                runtimeException = new RuntimeException("Unknown underlying exception of type=" + audioPlaybackError.g());
            }
            if (runtimeException instanceof UnrecognizedInputFormatException) {
                runtimeException = new Exception(((UnrecognizedInputFormatException) runtimeException).getMessage() + "|uri=" + ((UnrecognizedInputFormatException) runtimeException).uri, runtimeException);
            }
            if (runtimeException instanceof HttpDataSource$HttpDataSourceException) {
                runtimeException = new Exception(((HttpDataSource$HttpDataSourceException) runtimeException).getMessage() + "|code=" + d + "|uri=" + ((HttpDataSource$HttpDataSourceException) runtimeException).dataSpec.a, runtimeException);
            }
        } catch (Exception e) {
            runtimeException = new RuntimeException(lhg.a(audioPlaybackError.g().h(), "Failed to resolve underlying exception for type="), e);
        }
        if (runtimeException != null) {
            bn40.c(runtimeException, new Object[0]);
        }
    }

    public final void o(boolean z) {
        this.k = z;
        if (z) {
            qs4 b2 = this.n.b();
            if (b2 == null) {
                up2.c("[ExoPlayerProvider#launchFade] - player not initialized");
                return;
            }
            b2.a().a.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            b2.a.b.b(FadeDirection.OUT);
            b2.a().b.b(FadeDirection.IN);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dx40
    public final void p(px40 px40Var) {
        qcy<Object> qcyVar = u[0];
        cra craVar = this.q;
        Iterator it = ((List) craVar.b.getValue()).iterator();
        while (it.hasNext()) {
            px40Var = ((qx40) it.next()).a(px40Var);
        }
        craVar.c = px40Var;
        this.o.p = e();
    }

    @Override // xsna.dx40
    public final boolean pause(int i) {
        StringBuilder sb = new StringBuilder("state=");
        ty40 ty40Var = this.o;
        sb.append(ty40Var.e);
        sb.append(", actionTrigger=");
        sb.append(i);
        bn40.f(sb.toString());
        if (this.k) {
            qs4 b2 = this.n.b();
            if (b2 != null) {
                gt4 gt4Var = b2.a;
                gt4Var.b.a();
                b2.a().b.a();
                gt4Var.a.setVolume(1.0f);
                b2.a().a.setVolume(1.0f);
            } else {
                up2.c("[ExoPlayerProvider#setDefaultVolume] - player not initialized");
            }
        }
        ty40Var.getClass();
        ty40Var.l(i, SystemClock.elapsedRealtime(), ty40Var.a(), ty40Var.m.a);
        boolean j = ty40Var.e.j();
        ty40Var.t = false;
        ty40Var.i(false);
        return j;
    }

    public final void q(float f) {
        bn40.f("playbackSpeed=", Float.valueOf(f));
        this.g = f;
        ct4 ct4Var = this.n;
        ct4Var.k = f;
        qs4 b2 = ct4Var.b();
        if (b2 == null) {
            up2.c("[ExoPlayerProvider#setPlaybackSpeedInternal] - Player not initialized");
        } else {
            b2.a.a.setPlaybackSpeed(f);
            b2.a().a.setPlaybackSpeed(f);
        }
    }

    @Override // xsna.dx40
    public final void release(int i) {
        StringBuilder sb = new StringBuilder("state=");
        ty40 ty40Var = this.o;
        sb.append(ty40Var.e);
        sb.append(", actionTrigger=");
        sb.append(i);
        bn40.f(sb.toString());
        ct4 ct4Var = this.n;
        if (!ct4Var.c()) {
            bn40.b("skip release for non-initialized player");
            return;
        }
        ty40Var.f(i);
        qs4 qs4Var = (qs4) ((AtomicReference) ct4Var.i.getValue()).getAndSet(null);
        if (qs4Var == null) {
            up2.c("[ExoPlayerProvider#release] - player already released or not initialized yet");
            return;
        }
        boolean z = (i == 34 || i == 36) ? false : true;
        ct4Var.e(qs4Var.a, z);
        ct4Var.e(qs4Var.a(), z);
    }

    @Override // xsna.ex40
    public final void s(float f) {
        bn40.f("volume=", Float.valueOf(f));
        ct4 ct4Var = this.n;
        ct4Var.j = f;
        if (ct4Var.d.k) {
            return;
        }
        qs4 b2 = ct4Var.b();
        if (b2 == null) {
            up2.c("[ExoPlayerProvider#setAudioVolumeInternal] - Player not initialized");
        } else {
            b2.a.a.setVolume(f);
            b2.a().a.setVolume(f);
        }
    }

    @Override // xsna.dx40
    public final void stop(int i) {
        px40 e;
        bn40.f("state=" + this.o.e + ", actionTrigger=" + i);
        AudioPlayer i2 = i();
        if (i2 != null && i2.isEnded() && (e = e()) != null) {
            e.onStop();
        }
        release(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0464  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dx40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(kx40 kx40Var) {
        Integer num;
        a.InterfaceC0045a interfaceC0045a;
        ct4 ct4Var;
        androidx.media3.exoplayer.source.i a2;
        kr10.e.a aVar;
        kr10.f fVar;
        androidx.media3.exoplayer.source.n nVar;
        kr10.f fVar2;
        VideoFeatures videoFeatures;
        g4b0 g4b0Var;
        long j;
        gt4 gt4Var;
        wva0 wva0Var = kx40Var.c;
        MusicTrack musicTrack = kx40Var.b;
        bn40.f(kx40Var);
        uz4 uz4Var = kx40Var.a;
        uz4Var.d = kx40Var.c();
        this.p = kx40Var;
        PlaybackActionMeta playbackActionMeta = kx40Var.e;
        if (playbackActionMeta.b != 37) {
            this.k = false;
        }
        aw40 aw40Var = this.e;
        hn40 f = aw40Var.f0().f();
        AudioLoudness audioLoudness = kx40Var.g;
        final float a3 = f.a(audioLoudness != null ? Float.valueOf(audioLoudness.b) : null);
        int i = playbackActionMeta.b;
        StringBuilder sb = new StringBuilder("state=");
        ty40 ty40Var = this.o;
        sb.append(ty40Var.e);
        sb.append(", actionTrigger=");
        sb.append(i);
        bn40.f(sb.toString());
        final ct4 ct4Var2 = this.n;
        if (ct4Var2.c()) {
            ty40Var.f(i);
        }
        final boolean Tb = musicTrack.Tb();
        if (!kx40Var.f()) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.e, new Object[]{"Invalid playback params for choosing player with track " + musicTrack.Fb()});
            }
        }
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        boolean T = com.vk.toggle.d.T(k840.a.i.b());
        String b2 = kx40Var.b();
        fx40.a aVar2 = this.d;
        boolean z = aVar2.b && musicTrack.S4();
        AudioBookChapter audioBookChapter = musicTrack.O;
        String concat = audioBookChapter != null ? "chapter_download_".concat(audioBookChapter.b) : musicTrack.w != null ? "episode_download_".concat(musicTrack.Fb()) : "track_download_".concat(musicTrack.Fb());
        com.vk.music.offline.api.domain.download.b I = aw40Var.I();
        final boolean z2 = (m(musicTrack) || drm0.D(b2, "asset", false) || ((!z || !(I != null && I.c(concat))) && (z || !T))) ? false : true;
        ((AtomicReference) ct4Var2.i.getValue()).getAndUpdate(new UnaryOperator() { // from class: xsna.bt4
            /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003b A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                boolean z3;
                boolean z4;
                qs4 qs4Var = (qs4) obj;
                ct4 ct4Var3 = ct4.this;
                boolean z5 = ct4Var3.d.k;
                k5q k5qVar = ct4Var3.b;
                gt4 gt4Var2 = qs4Var != null ? qs4Var.a : null;
                gt4 a4 = qs4Var != null ? qs4Var.a() : null;
                boolean z6 = z2;
                if (z6) {
                    if ((a4 != null ? a4.a : null) instanceof hk80) {
                        z3 = true;
                        if (!z6) {
                            if ((a4 != null ? a4.a : null) instanceof l5q) {
                                z4 = true;
                                if (!z3 && !z4) {
                                    a4 = ct4Var3.d(z6);
                                }
                                if (!z5) {
                                    a4.a.setVolume(1.0f);
                                    if (gt4Var2 != null) {
                                        gt4Var2.a.setVolume(1.0f);
                                    }
                                    if (gt4Var2 != null) {
                                        ct4Var3.e(gt4Var2, true);
                                    }
                                } else if (gt4Var2 != null) {
                                    AudioPlayer audioPlayer = gt4Var2.a;
                                    audioPlayer.i(new ps4(AudioPlayer.State.ENDED, new rp1(1, ct4Var3, gt4Var2), audioPlayer));
                                }
                                AudioPlayer audioPlayer2 = a4.a;
                                en4 en4Var = a4.c;
                                audioPlayer2.i(k5qVar);
                                audioPlayer2.i(ct4Var3.a);
                                audioPlayer2.i(en4Var);
                                audioPlayer2.g(k5qVar);
                                en4.b bVar = en4Var.f;
                                qcy<?>[] qcyVarArr = en4.g;
                                bVar.setValue(en4Var, qcyVarArr[1], Boolean.valueOf(Tb));
                                en4Var.e.setValue(en4Var, qcyVarArr[0], Float.valueOf(a3));
                                return new qs4(a4, new xm1(ct4Var3, 2));
                            }
                        }
                        z4 = false;
                        if (!z3) {
                            a4 = ct4Var3.d(z6);
                        }
                        if (!z5) {
                        }
                        AudioPlayer audioPlayer22 = a4.a;
                        en4 en4Var2 = a4.c;
                        audioPlayer22.i(k5qVar);
                        audioPlayer22.i(ct4Var3.a);
                        audioPlayer22.i(en4Var2);
                        audioPlayer22.g(k5qVar);
                        en4.b bVar2 = en4Var2.f;
                        qcy<?>[] qcyVarArr2 = en4.g;
                        bVar2.setValue(en4Var2, qcyVarArr2[1], Boolean.valueOf(Tb));
                        en4Var2.e.setValue(en4Var2, qcyVarArr2[0], Float.valueOf(a3));
                        return new qs4(a4, new xm1(ct4Var3, 2));
                    }
                }
                z3 = false;
                if (!z6) {
                }
                z4 = false;
                if (!z3) {
                }
                if (!z5) {
                }
                AudioPlayer audioPlayer222 = a4.a;
                en4 en4Var22 = a4.c;
                audioPlayer222.i(k5qVar);
                audioPlayer222.i(ct4Var3.a);
                audioPlayer222.i(en4Var22);
                audioPlayer222.g(k5qVar);
                en4.b bVar22 = en4Var22.f;
                qcy<?>[] qcyVarArr22 = en4.g;
                bVar22.setValue(en4Var22, qcyVarArr22[1], Boolean.valueOf(Tb));
                en4Var22.e.setValue(en4Var22, qcyVarArr22[0], Float.valueOf(a3));
                return new qs4(a4, new xm1(ct4Var3, 2));
            }
        });
        q(kx40Var.h);
        ty40Var.x = true;
        ty40Var.u = false;
        ty40Var.n = new uy40(musicTrack, kx40Var.b(), kx40Var.d, uz4Var.c);
        long j2 = wva0Var.c;
        ty40Var.m = new nw40(playbackActionMeta.b, j2, j2, playbackActionMeta.c);
        ty40Var.v = ky40.f;
        ty40Var.o = kx40Var;
        ((n1v) ty40Var.i.getValue()).a(wva0Var.c);
        AudioPlayer a4 = ct4Var2.a();
        ty40Var.i(kx40Var.f);
        boolean z3 = a4 instanceof hk80;
        bpn0 bpn0Var = this.t;
        if (z3) {
            if (com.vk.toggle.d.A().b) {
                musicTrack.Fb();
                kx40Var.b();
            }
            pm80 pm80Var = (pm80) bpn0Var.getValue();
            hk80 hk80Var = (hk80) a4;
            sht0 c = pm80Var.c(kx40Var);
            pm80Var.f = c instanceof mv70;
            num = null;
            pm80Var.g = null;
            pm80Var.f(hk80Var, c, kx40Var, wva0Var.c);
        } else {
            num = null;
            if (a4 instanceof l5q) {
                if (com.vk.toggle.d.A().b) {
                    musicTrack.Fb();
                    kx40Var.b();
                }
                Cache cache = ((MusicPlayerCacheComponent) this.s.getValue()).getCache();
                if (this.h.f.a() <= 0 || cache == null || !musicTrack.Tb()) {
                    interfaceC0045a = aw40Var.a(musicTrack);
                } else {
                    a.b bVar = new a.b();
                    bVar.a = cache;
                    bVar.e = aw40Var.a(musicTrack);
                    interfaceC0045a = bVar;
                }
                l5q l5qVar = (l5q) a4;
                c7q c7qVar = (c7q) l5qVar.d.getValue();
                a.InterfaceC0045a interfaceC0045a2 = interfaceC0045a;
                if (c7qVar != null) {
                    interfaceC0045a2 = new dnk.a(interfaceC0045a, new b(0, c7qVar, c7q.class, "onFirstBytes", "onFirstBytes()V", 0), c7qVar.l);
                }
                Uri parse = Uri.parse(kx40Var.b());
                int i2 = 8;
                if (m(musicTrack)) {
                    MoosicAudio moosicAudio = musicTrack.W;
                    if (moosicAudio == null) {
                        a2 = a(parse);
                    } else {
                        EncryptedFileInfo encryptedFileInfo = moosicAudio.d;
                        if (encryptedFileInfo == null) {
                            a2 = a(parse);
                        } else {
                            String str = encryptedFileInfo.b;
                            Map map = Collections.EMPTY_MAP;
                            Uri parse2 = Uri.parse(str);
                            String str2 = encryptedFileInfo.d;
                            byte[] bArr = encryptedFileInfo.c;
                            long j3 = moosicAudio.e;
                            fxc0.t(parse2, "The uri must be set.");
                            ljp.a aVar3 = new ljp.a(String.valueOf(moosicAudio.b), new evk(parse2, 0L, 1, bArr, map, 0L, j3, str2, 0, null), (VkMusicOfflineCipher) this.r.getValue());
                            b630 b630Var = new b630(new uel(), i2);
                            androidx.media3.exoplayer.upstream.a aVar4 = new androidx.media3.exoplayer.upstream.a();
                            kr10.b.a aVar5 = new kr10.b.a();
                            new kr10.d.a();
                            List list = Collections.EMPTY_LIST;
                            com.google.common.collect.g gVar = com.google.common.collect.g.f;
                            kr10.e.a aVar6 = new kr10.e.a();
                            kr10.g gVar2 = kr10.g.a;
                            Uri parse3 = str == null ? null : Uri.parse(str);
                            kr10 kr10Var = new kr10("", new kr10.c(aVar5), parse3 != null ? new kr10.f(parse3, null, null, list, null, gVar, C.TIME_UNSET) : null, new kr10.e(aVar6), vr10.B, gVar2);
                            kr10.f fVar3 = kr10Var.b;
                            fVar3.getClass();
                            fVar3.getClass();
                            fVar3.getClass();
                            nVar = new androidx.media3.exoplayer.source.n(kr10Var, aVar3, b630Var, androidx.media3.exoplayer.drm.b.a, aVar4, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null);
                            ct4Var = ct4Var2;
                            a2 = nVar;
                            videoFeatures = VideoFeatures.VIDEO_MUSIC_PLAYER_STAT;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                pm80 pm80Var2 = (pm80) bpn0Var.getValue();
                                pm80Var2.getClass();
                                AudioPlayerType audioPlayerType = AudioPlayerType.EXO;
                                Uri g = jeq0.g(kx40Var.b());
                                String b3 = kx40Var.b();
                                g4b0Var = pm80Var2.d(kx40Var, audioPlayerType, g, pm80.e(b3) ? ContentType.hls : drm0.D(b3, ".mpd", true) ? ContentType.dash : ContentType.mp4);
                            } else {
                                g4b0Var = null;
                            }
                            androidx.media3.exoplayer.c cVar = l5qVar.c;
                            cVar.r(a2);
                            cVar.prepare();
                            if (g4b0Var != null) {
                                c7q c7qVar2 = (c7q) l5qVar.d.getValue();
                                if (c7qVar2 != null) {
                                    c7qVar2.c = g4b0Var;
                                }
                                c7q c7qVar3 = (c7q) l5qVar.d.getValue();
                                if (c7qVar3 != null) {
                                    c7qVar3.e(cVar);
                                }
                            }
                            j = wva0Var.c;
                            if (j > 0) {
                                l5qVar.seekTo(j);
                            }
                        }
                    }
                    ct4Var = ct4Var2;
                    videoFeatures = VideoFeatures.VIDEO_MUSIC_PLAYER_STAT;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                    }
                    androidx.media3.exoplayer.c cVar2 = l5qVar.c;
                    cVar2.r(a2);
                    cVar2.prepare();
                    if (g4b0Var != null) {
                    }
                    j = wva0Var.c;
                    if (j > 0) {
                    }
                } else {
                    pm80 pm80Var3 = (pm80) bpn0Var.getValue();
                    String b4 = kx40Var.b();
                    pm80Var3.getClass();
                    if (pm80.e(b4)) {
                        boolean a5 = aVar2.c.a();
                        k5q k5qVar = this.l;
                        if (a5 && kx40Var.d()) {
                            k5qVar.l();
                            k5q.m(new fk(6, k5qVar, musicTrack));
                        } else {
                            k5qVar.i();
                        }
                        HlsMediaSource.Factory factory = new HlsMediaSource.Factory(interfaceC0045a2);
                        p9v b5 = aw40Var.b(musicTrack);
                        fxc0.t(b5, "HlsMediaSource.Factory#setPlaylistParserFactory no longer handles null by instantiating a new DefaultHlsPlaylistParserFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
                        factory.e = b5;
                        HlsPlaylistTracker.a c2 = aw40Var.c(musicTrack);
                        fxc0.t(c2, "HlsMediaSource.Factory#setPlaylistTrackerFactory no longer handles null by defaulting to DefaultHlsPlaylistTracker.FACTORY. Explicitly pass a reference to this instance in order to retain the old behavior.");
                        factory.f = c2;
                        kr10.b.a aVar7 = new kr10.b.a();
                        com.google.common.collect.h hVar = com.google.common.collect.h.h;
                        ImmutableList.b bVar2 = ImmutableList.c;
                        com.google.common.collect.g gVar3 = com.google.common.collect.g.f;
                        List list2 = Collections.EMPTY_LIST;
                        com.google.common.collect.g gVar4 = com.google.common.collect.g.f;
                        kr10.e.a aVar8 = new kr10.e.a();
                        kr10.g gVar5 = kr10.g.a;
                        if (parse != null) {
                            ct4Var = ct4Var2;
                            fVar2 = new kr10.f(parse, null, null, list2, null, gVar4, C.TIME_UNSET);
                        } else {
                            ct4Var = ct4Var2;
                            fVar2 = null;
                        }
                        a2 = factory.d(new kr10("", new kr10.c(aVar7), fVar2, new kr10.e(aVar8), vr10.B, gVar5));
                    } else {
                        ct4Var = ct4Var2;
                        if (drm0.D(kx40Var.b(), "asset", false)) {
                            a.InterfaceC0045a interfaceC0045a3 = new a.InterfaceC0045a() { // from class: xsna.gx40
                                @Override // androidx.media3.datasource.a.InterfaceC0045a
                                public final androidx.media3.datasource.a createDataSource() {
                                    return new AssetDataSource(hx40.this.c);
                                }
                            };
                            b630 b630Var2 = new b630(new uel(), i2);
                            androidx.media3.exoplayer.upstream.a aVar9 = new androidx.media3.exoplayer.upstream.a();
                            kr10.b.a aVar10 = new kr10.b.a();
                            com.google.common.collect.h hVar2 = com.google.common.collect.h.h;
                            ImmutableList.b bVar3 = ImmutableList.c;
                            com.google.common.collect.g gVar6 = com.google.common.collect.g.f;
                            List list3 = Collections.EMPTY_LIST;
                            com.google.common.collect.g gVar7 = com.google.common.collect.g.f;
                            kr10.e.a aVar11 = new kr10.e.a();
                            kr10.g gVar8 = kr10.g.a;
                            if (parse != null) {
                                aVar = aVar11;
                                fVar = new kr10.f(parse, null, null, list3, null, gVar7, C.TIME_UNSET);
                            } else {
                                aVar = aVar11;
                                fVar = null;
                            }
                            kr10 kr10Var2 = new kr10("", new kr10.c(aVar10), fVar, new kr10.e(aVar), vr10.B, gVar8);
                            fVar.getClass();
                            kr10.f fVar4 = kr10Var2.b;
                            fVar4.getClass();
                            fVar4.getClass();
                            nVar = new androidx.media3.exoplayer.source.n(kr10Var2, interfaceC0045a3, b630Var2, androidx.media3.exoplayer.drm.b.a, aVar9, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null);
                            a2 = nVar;
                        } else {
                            a2 = a(parse);
                        }
                    }
                    videoFeatures = VideoFeatures.VIDEO_MUSIC_PLAYER_STAT;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                    }
                    androidx.media3.exoplayer.c cVar22 = l5qVar.c;
                    cVar22.r(a2);
                    cVar22.prepare();
                    if (g4b0Var != null) {
                    }
                    j = wva0Var.c;
                    if (j > 0) {
                    }
                }
                qs4 qs4Var = (qs4) ((AtomicReference) ct4Var.i.getValue()).get();
                gt4Var = qs4Var == null ? qs4Var.a : num;
                if (gt4Var != 0) {
                    num = Integer.valueOf(gt4Var.a.getAudioSessionId());
                }
                if (num == null) {
                    gt4Var.c.a(num.intValue());
                    return;
                }
                return;
            }
        }
        ct4Var = ct4Var2;
        qs4 qs4Var2 = (qs4) ((AtomicReference) ct4Var.i.getValue()).get();
        if (qs4Var2 == null) {
        }
        if (gt4Var != 0) {
        }
        if (num == null) {
        }
    }

    @Override // xsna.ex40
    public final boolean x() {
        return this.k;
    }

    @Override // xsna.dx40
    public final boolean z() {
        return this.n.c();
    }

    public hx40(cz40 cz40Var, Context context, otp otpVar, fx40.a aVar, oh6 oh6Var, int i) {
        this(cz40Var, context, (i & 4) != 0 ? null : otpVar, aVar, new b370(), (i & 32) != 0 ? new oh6(aVar.b, com.vk.music.audioeffect.a.a.getSTUB()) : oh6Var);
    }
}
