package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.bottomsheets.domain.model.MixData;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.music.stickyplayer.domain.PlayerUiMode;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.sx40;
import xsna.tx40;

/* compiled from: MusicActionHandler.kt */
/* loaded from: classes3.dex */
public final class m840 implements n10 {
    public final a630 a;
    public final u2b0 b;
    public final f4z c;
    public final f4z d;
    public final MusicRestrictionPopupDisplayer e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final io.reactivex.rxjava3.disposables.g g;

    public m840(a630 a630Var, u2b0 u2b0Var, f4z f4zVar, f4z f4zVar2, MusicRestrictionPopupDisplayer musicRestrictionPopupDisplayer, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = a630Var;
        this.b = u2b0Var;
        this.c = f4zVar;
        this.d = f4zVar2;
        this.e = musicRestrictionPopupDisplayer;
        this.f = bVar;
        io.reactivex.rxjava3.disposables.g gVar = new io.reactivex.rxjava3.disposables.g();
        this.g = gVar;
        bVar.b(gVar);
    }

    @Override // xsna.n10
    public final void a(sy40 sy40Var, MusicTrack musicTrack) {
        io.reactivex.rxjava3.core.q<List<String>> u1 = this.a.u1(musicTrack, true);
        fl30 fl30Var = new fl30(new com.vk.movika.sdk.base.ui.s0(17, this, musicTrack), 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.g.b(u1.E(fl30Var, lVar, kVar, kVar).subscribe(new hms(new qi00(this, 11), 12), new o330(new ng3(26, musicTrack, this), 2)));
    }

    @Override // xsna.n10
    public final void b(sy40 sy40Var, PlayerTrack playerTrack, PlayerContext playerContext) {
        if (sy40Var.b == PlayerUiMode.ADVERTISEMENT && sy40Var.s != null) {
            f(sy40Var, new sx40.a.d(playerContext));
        } else {
            this.c.b(new tx40.r(playerTrack, playerContext.h(), false));
        }
    }

    @Override // xsna.n10
    public final void c(sy40 sy40Var, MusicTrack musicTrack) {
        a630 a630Var = this.a;
        if (a630Var.i(musicTrack) || musicTrack.l) {
            if (musicTrack.P) {
                this.f.b(itg0.m(a630Var.p1(musicTrack, true, false)));
            }
            this.g.b(a630Var.e1(musicTrack, MusicPlaybackLaunchContext.A, true).subscribe(new kl6(new tcn(this, 24), 28), new zyu(new qt5(17, musicTrack, this), 7)));
        }
    }

    @Override // xsna.n10
    public final void d(MusicTrack musicTrack) {
        this.c.b(new tx40.d(musicTrack));
    }

    @Override // xsna.n10
    public final void e(sy40 sy40Var) {
        PlaybackLaunchMeta playbackLaunchMeta;
        PlayerTrack playerTrack = sy40Var.d;
        PlaySourceMeta playSourceMeta = (playerTrack == null || (playbackLaunchMeta = playerTrack.c) == null) ? null : playbackLaunchMeta.e;
        boolean z = playSourceMeta instanceof PlaySourceMeta.PlaylistPlaySourceMeta;
        f4z f4zVar = this.c;
        if (z) {
            PlaySourceMeta.PlaylistPlaySourceMeta playlistPlaySourceMeta = (PlaySourceMeta.PlaylistPlaySourceMeta) playSourceMeta;
            f4zVar.b(new tx40.k(playlistPlaySourceMeta.d, playlistPlaySourceMeta.e, jnj.a(playlistPlaySourceMeta.f)));
        } else if (playSourceMeta instanceof PlaySourceMeta.SimilarTrackPlaySourceMeta) {
            PlaySourceMeta.SimilarTrackPlaySourceMeta similarTrackPlaySourceMeta = (PlaySourceMeta.SimilarTrackPlaySourceMeta) playSourceMeta;
            f4zVar.b(new tx40.p(similarTrackPlaySourceMeta.c, similarTrackPlaySourceMeta.d));
        } else if (playSourceMeta instanceof PlaySourceMeta.CatalogPlaySourceMeta) {
            f4zVar.b(new tx40.h(((PlaySourceMeta.CatalogPlaySourceMeta) playSourceMeta).c, jnj.a(playerTrack.b.V)));
        } else if (playSourceMeta instanceof PlaySourceMeta.VKMixPlaySourceMeta) {
            g(sy40Var);
        }
    }

    public final void f(sy40 sy40Var, sx40.a aVar) {
        com.vk.music.player.f H = this.b.H();
        if (H != null && epx.f(H.c, sy40Var.d)) {
            if (aVar.equals(sx40.a.C3698a.b)) {
                H.o(AdvertisementInfo.Action.CLICK);
                return;
            }
            if (aVar.equals(sx40.a.b.b)) {
                H.o(AdvertisementInfo.Action.CLICK);
                return;
            }
            if (aVar instanceof sx40.a.d) {
                H.o(AdvertisementInfo.Action.AD_CHOICE_CLICK);
            } else {
                if (!aVar.equals(sx40.a.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.e.i(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, MusicPlaybackLaunchContext.A, "", MusicRestrictionPopupDisplayer.SubscriptionPopupType.DEFAULT);
            }
        }
    }

    public final void g(sy40 sy40Var) {
        this.d.b(MusicHapticEvent.LIGHT);
        StartPlaySource j = this.b.j();
        StartPlayVkMixSource startPlayVkMixSource = j instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j : null;
        if (startPlayVkMixSource == null) {
            return;
        }
        PlaySourceMeta playSourceMeta = startPlayVkMixSource.b;
        PlaySourceMeta.VKMixPlaySourceMeta vKMixPlaySourceMeta = playSourceMeta instanceof PlaySourceMeta.VKMixPlaySourceMeta ? (PlaySourceMeta.VKMixPlaySourceMeta) playSourceMeta : null;
        String str = vKMixPlaySourceMeta != null ? vKMixPlaySourceMeta.b : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        PlayerTrack playerTrack = sy40Var.d;
        if (playerTrack != null) {
            String str3 = startPlayVkMixSource.e;
            String str4 = startPlayVkMixSource.c;
            String str5 = startPlayVkMixSource.d;
            boolean z = startPlayVkMixSource.f;
            MixSettingsEntity mixSettingsEntity = startPlayVkMixSource.h;
            this.c.b(new tx40.t(playerTrack, new MixData(str3, str4, str5, str2, z, mixSettingsEntity != null ? cdi.E(mixSettingsEntity) : null)));
        }
    }
}
