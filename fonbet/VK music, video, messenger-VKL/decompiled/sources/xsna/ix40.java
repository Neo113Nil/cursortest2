package xsna;

import android.os.SystemClock;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.upstream.Loader;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.music.offline.api.exception.KeyNotFoundHlsPlaybackException;
import com.vk.music.player.api.helper.AudioPlayer;
import com.vk.music.player.api.helper.dto.AudioDiscontinuityReason;
import com.vk.music.player.api.helper.dto.AudioPlaybackError;
import com.vk.music.player.cache.a;
import com.vk.music.player.error.VkPlayerException;
import com.vk.toggle.features.MusicFeatures;
import kotlin.NoWhenBranchMatchedException;
import xsna.k840;
import xsna.ry40;
import xsna.ty40;

/* compiled from: MusicPlayerHelperImpl.kt */
/* loaded from: classes3.dex */
public final class ix40 implements rs4 {
    public final /* synthetic */ hx40 a;

    public ix40(hx40 hx40Var) {
        this.a = hx40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00aa  */
    @Override // xsna.rs4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(AudioPlaybackError audioPlaybackError) {
        hk80 hk80Var;
        hk80 hk80Var2;
        VkPlayerException unknownVkPlayerException;
        VkPlayerException httpDataSourceVkPlayerException;
        AudioPlaybackError.Type g;
        AudioPlaybackError.Type type;
        px40 e;
        hx40 hx40Var = this.a;
        pm80 pm80Var = (pm80) hx40Var.t.getValue();
        kx40 kx40Var = hx40Var.p;
        jx40 jx40Var = new jx40(hx40Var.n);
        pm80Var.getClass();
        MusicTrack musicTrack = kx40Var.b;
        AudioBookChapter audioBookChapter = musicTrack.O;
        String concat = audioBookChapter != null ? "chapter_download_".concat(audioBookChapter.b) : musicTrack.w != null ? "episode_download_".concat(musicTrack.Fb()) : "track_download_".concat(musicTrack.Fb());
        com.vk.music.offline.api.domain.download.b I = pm80Var.c.I();
        if (((Boolean) pm80Var.h.getValue()).booleanValue()) {
            eqy<bek0> eqyVar = com.vk.toggle.d.a;
            if (com.vk.toggle.d.T(k840.a.i.b()) && audioPlaybackError.g() == AudioPlaybackError.Type.SOURCE && !pm80Var.f && kx40Var.d() && !epx.f(pm80Var.g, concat) && I != null && I.c(concat)) {
                Object invoke = jx40Var.invoke();
                if (invoke instanceof hk80) {
                    hk80Var = (hk80) invoke;
                    if (hk80Var == null) {
                        pm80Var.g = concat;
                        pm80Var.f = true;
                        hk80Var2 = hk80Var;
                        pm80Var.f(hk80Var2, pm80Var.c(kx40Var), kx40Var, hk80Var.c.getCurrentPosition());
                    } else {
                        hk80Var2 = hk80Var;
                    }
                    if (hk80Var2 == null) {
                        hx40Var.n(audioPlaybackError);
                        return;
                    }
                    if (audioPlaybackError.getCause() instanceof Loader.UnexpectedLoaderException) {
                        Throwable cause = audioPlaybackError.getCause();
                        if ((cause != null ? cause.getCause() : null) instanceof KeyNotFoundHlsPlaybackException) {
                            unknownVkPlayerException = new VkPlayerException.OfflineKeysMissingVkPlayerException(audioPlaybackError);
                            httpDataSourceVkPlayerException = unknownVkPlayerException;
                            hx40Var.n(audioPlaybackError);
                            g = audioPlaybackError.g();
                            type = AudioPlaybackError.Type.SOURCE;
                            if (g == type) {
                                kx40 kx40Var2 = hx40Var.p;
                                MusicTrack musicTrack2 = kx40Var2.b;
                                if (!kx40Var2.d()) {
                                    musicTrack2 = null;
                                }
                                if (musicTrack2 != null) {
                                    mr10 h = hx40Var.n.a().h();
                                    amy amyVar = ((cy1) hx40Var.m.getValue()).a;
                                    Throwable cause2 = audioPlaybackError.g() == type ? audioPlaybackError.getCause() : null;
                                    String obj = hx40Var.o.e.toString();
                                    ct4 ct4Var = hx40Var.o.d;
                                    AudioPlayer a = ct4Var.c() ? ct4Var.a() : null;
                                    Boolean valueOf = Boolean.valueOf(a != null && a.getPlayWhenReady());
                                    Long valueOf2 = Long.valueOf(hx40Var.o.a());
                                    ty40 ty40Var = hx40Var.o;
                                    hx40Var.e.d(musicTrack2, new oya0(audioPlaybackError, cause2, obj, valueOf, valueOf2, Integer.valueOf(ty40Var.f ? ty40Var.d.a().getBufferedPercentage() : 0), h.a, String.valueOf(h.b), amyVar.a, amyVar.b, amyVar.c));
                                }
                            }
                            kx40 kx40Var3 = hx40Var.p;
                            hx40Var.p = kx40.a(kx40Var3, null, new wva0(hx40Var.n.a().getCurrentPosition(), kx40Var3.c.b), null, false, 507);
                            hx40Var.pause(27);
                            ty40 ty40Var2 = hx40Var.o;
                            ty40Var2.j(new ry40.b.a(ty40Var2.b(), httpDataSourceVkPlayerException));
                            ty40Var2.h();
                            r6m.a.getClass();
                            if (!r6m.j()) {
                                ty40Var2.f = false;
                            }
                            e = hx40Var.e();
                            if (e != null) {
                                e.v(hx40Var.b, httpDataSourceVkPlayerException);
                                return;
                            }
                            return;
                        }
                    }
                    if (audioPlaybackError.g() == AudioPlaybackError.Type.SOURCE && (audioPlaybackError.getCause() instanceof HttpDataSource$InvalidResponseCodeException)) {
                        HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException = (HttpDataSource$InvalidResponseCodeException) audioPlaybackError.getCause();
                        httpDataSourceVkPlayerException = new VkPlayerException.HttpDataSourceVkPlayerException(audioPlaybackError, httpDataSource$InvalidResponseCodeException.responseCode, httpDataSource$InvalidResponseCodeException.dataSpec.a);
                        hx40Var.n(audioPlaybackError);
                        g = audioPlaybackError.g();
                        type = AudioPlaybackError.Type.SOURCE;
                        if (g == type) {
                        }
                        kx40 kx40Var32 = hx40Var.p;
                        hx40Var.p = kx40.a(kx40Var32, null, new wva0(hx40Var.n.a().getCurrentPosition(), kx40Var32.c.b), null, false, 507);
                        hx40Var.pause(27);
                        ty40 ty40Var22 = hx40Var.o;
                        ty40Var22.j(new ry40.b.a(ty40Var22.b(), httpDataSourceVkPlayerException));
                        ty40Var22.h();
                        r6m.a.getClass();
                        if (!r6m.j()) {
                        }
                        e = hx40Var.e();
                        if (e != null) {
                        }
                    } else {
                        unknownVkPlayerException = new VkPlayerException.UnknownVkPlayerException(audioPlaybackError);
                        httpDataSourceVkPlayerException = unknownVkPlayerException;
                        hx40Var.n(audioPlaybackError);
                        g = audioPlaybackError.g();
                        type = AudioPlaybackError.Type.SOURCE;
                        if (g == type) {
                        }
                        kx40 kx40Var322 = hx40Var.p;
                        hx40Var.p = kx40.a(kx40Var322, null, new wva0(hx40Var.n.a().getCurrentPosition(), kx40Var322.c.b), null, false, 507);
                        hx40Var.pause(27);
                        ty40 ty40Var222 = hx40Var.o;
                        ty40Var222.j(new ry40.b.a(ty40Var222.b(), httpDataSourceVkPlayerException));
                        ty40Var222.h();
                        r6m.a.getClass();
                        if (!r6m.j()) {
                        }
                        e = hx40Var.e();
                        if (e != null) {
                        }
                    }
                }
            }
        }
        hk80Var = null;
        if (hk80Var == null) {
        }
        if (hk80Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rs4
    public final void e(AudioPlayer.State state) {
        hx40 hx40Var = this.a;
        AudioPlayer i = hx40Var.i();
        if (i == null) {
            return;
        }
        if (MusicFeatures.AUDIO_GET_ALL_PLAYING_FORMATS.h() && state == AudioPlayer.State.PLAYING) {
            hx40Var.j.c = false;
        }
        ty40 ty40Var = hx40Var.o;
        ty40Var.getClass();
        if (state == AudioPlayer.State.IDLE || state == AudioPlayer.State.ENDED) {
            ty40Var.s = true;
        }
        int i2 = ty40.b.$EnumSwitchMapping$0[state.ordinal()];
        if (i2 == 1) {
            if (i.getPlayWhenReady()) {
                ty40Var.j(new ry40.b(ty40Var.b()));
            }
            px40 px40Var = ty40Var.p;
            if (px40Var != null) {
                px40Var.l(ty40Var.a);
                return;
            }
            return;
        }
        if (i2 == 2) {
            boolean playWhenReady = i.getPlayWhenReady();
            boolean z = !playWhenReady;
            ty40Var.g(z);
            if (((Boolean) ty40Var.k.getValue()).booleanValue() && !(ty40Var.e instanceof ry40.a.c)) {
                ty40Var.j(new ry40.a.b(ty40Var.b(), ty40Var.f ? ty40Var.d.a().getBufferedPercentage() : 0, z));
                ty40Var.r = Boolean.valueOf(z);
            }
            ry40 ry40Var = ty40Var.e;
            ry40.a aVar = ry40Var instanceof ry40.a ? (ry40.a) ry40Var : null;
            if (aVar == null || aVar.e != playWhenReady || playWhenReady) {
                return;
            }
            ty40Var.h();
            return;
        }
        if (i2 != 3 && i2 != 4) {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        boolean playWhenReady2 = i.getPlayWhenReady();
        if (ty40Var.f) {
            if (playWhenReady2) {
                return;
            }
            if (ty40Var.t) {
                ty40Var.t = false;
                px40 px40Var2 = ty40Var.p;
                if (px40Var2 != null) {
                    px40Var2.B(ty40Var.c(i));
                }
            }
            ty40Var.h();
            return;
        }
        ty40Var.f = true;
        if (ty40Var.e.j()) {
            if (!ty40Var.u) {
                i.setPlayWhenReady(true);
                ty40Var.k();
                ty40Var.l.b();
            }
        } else if (!playWhenReady2) {
            if (ty40Var.t) {
                ty40Var.t = false;
                px40 px40Var3 = ty40Var.p;
                if (px40Var3 != null) {
                    px40Var3.B(ty40Var.c(i));
                }
            }
            ty40Var.h();
        }
        px40 px40Var4 = ty40Var.p;
        if (px40Var4 != null) {
            px40Var4.q(ty40Var.c(i));
        }
    }

    @Override // xsna.rs4
    public final void onIsLoadingChanged(boolean z) {
        AudioPlayer i;
        px40 e;
        hx40 hx40Var = this.a;
        if ((hx40Var.h.f instanceof a.b) || !hx40Var.p.b.Tb() || z || (i = hx40Var.i()) == null || i.getBufferedPercentage() != 100 || (e = hx40Var.e()) == null) {
            return;
        }
        e.F(hx40Var.b);
    }

    @Override // xsna.rs4
    public final void onIsPlayingChanged(boolean z) {
        ty40 ty40Var = this.a.o;
        ty40Var.getClass();
        if (z) {
            ty40Var.w = SystemClock.elapsedRealtime();
        }
    }

    @Override // xsna.rs4
    public final void a(int i) {
    }

    @Override // xsna.rs4
    public final void g(AudioDiscontinuityReason audioDiscontinuityReason) {
    }
}
