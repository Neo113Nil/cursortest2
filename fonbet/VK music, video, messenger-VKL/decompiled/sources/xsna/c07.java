package xsna;

import android.app.Activity;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.ExternalAudio;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.article.ArticleTtsInfo;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.AudioBookBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlayAudioBookSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.domain.state.LyricsMode;
import com.vk.music.stats.MusicActionTracker;
import com.vk.music.view.player.MusicBigPlayerParams;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.dw20;
import xsna.k840;
import xsna.sb40;
import xsna.tzp0;
import xsna.zy6;

/* compiled from: BigPlayerActions.kt */
/* loaded from: classes3.dex */
public final class c07 {
    public final WeakReference<Activity> a;
    public final u2b0 b;
    public final MusicRestrictionPopupDisplayer c;
    public final com.vk.music.track.a d;
    public final MusicBigPlayerParams.FeatureSet e;
    public final qb40 f;
    public com.vk.music.stats.a g;
    public final io.reactivex.rxjava3.disposables.g h;
    public final ArrayList i;

    /* compiled from: BigPlayerActions.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicBigPlayerParams.FeatureSet.values().length];
            try {
                iArr[MusicBigPlayerParams.FeatureSet.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicBigPlayerParams.FeatureSet.LIMITED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicBigPlayerParams.FeatureSet.MESSENGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c07(WeakReference<Activity> weakReference, MusicBigPlayerParams musicBigPlayerParams) {
        this.a = weakReference;
        u2b0 u2b0Var = musicBigPlayerParams.c;
        this.b = u2b0Var;
        this.c = musicBigPlayerParams.f;
        com.vk.music.track.a aVar = musicBigPlayerParams.d;
        this.d = aVar;
        MusicBigPlayerParams.FeatureSet featureSet = musicBigPlayerParams.j;
        this.e = featureSet;
        ny40 ny40Var = new ny40(0);
        boolean j = featureSet.j();
        tb40 tb40Var = musicBigPlayerParams.a;
        s750 s750Var = k840.a.e;
        this.f = new qb40(u2b0Var, aVar, j, tb40Var, ny40Var, s750Var == null ? null : s750Var);
        this.h = new io.reactivex.rxjava3.disposables.g();
        this.i = new ArrayList();
    }

    public final void a(zy6 zy6Var) {
        PlayerTrack playerTrack;
        PlayerTrack playerTrack2;
        PlayerTrack playerTrack3;
        Activity activity;
        Activity activity2;
        Activity activity3;
        AudioBook audioBook;
        MusicBottomSheetLaunchPoint full;
        Activity activity4;
        boolean z = zy6Var instanceof nz6;
        com.vk.music.track.a aVar = this.d;
        if (z) {
            MusicTrack musicTrack = ((nz6) zy6Var).a;
            if (aVar.i(musicTrack) || musicTrack.l) {
                com.vk.music.stats.a aVar2 = this.g;
                if (aVar2 != null) {
                    aVar2.a(MusicActionTracker.Action.AddToMe, new MusicActionTracker.a.b(musicTrack.y));
                }
                if (musicTrack.P) {
                    itg0.m(aVar.p1(musicTrack, true, false));
                }
                itg0.m(aVar.e1(musicTrack, MusicPlaybackLaunchContext.A, true));
                return;
            }
            return;
        }
        boolean z2 = zy6Var instanceof pz6;
        MusicBigPlayerParams.FeatureSet featureSet = this.e;
        WeakReference<Activity> weakReference = this.a;
        if (z2) {
            MusicTrack musicTrack2 = ((pz6) zy6Var).a;
            if (!featureSet.j() || (activity4 = weakReference.get()) == null || (musicTrack2.J instanceof DownloadingState.Downloading)) {
                return;
            }
            ms1 ms1Var = new ms1(aVar, new e07(k840.a.i, 0));
            if (musicTrack2.S4() || musicTrack2.Pb()) {
                a630.d1(ms1Var, activity4, musicTrack2, false);
                return;
            }
            com.vk.music.stats.a aVar3 = this.g;
            if (aVar3 != null) {
                aVar3.a(MusicActionTracker.Action.Download, new MusicActionTracker.a.b(musicTrack2.y));
            }
            ms1Var.M(activity4, musicTrack2);
            return;
        }
        if (zy6Var instanceof oz6) {
            MusicTrack musicTrack3 = ((oz6) zy6Var).a;
            Activity activity5 = weakReference.get();
            if (activity5 == null) {
                return;
            }
            ms1 ms1Var2 = new ms1(aVar, new jn2(k840.a.i, 1));
            boolean i0 = aVar.i0(musicTrack3);
            boolean z3 = musicTrack3.P;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            if (z3) {
                itg0.m(aVar.p1(musicTrack3, false, true));
                if (musicTrack3.l) {
                    itg0.m(aVar.e1(musicTrack3, MusicPlaybackLaunchContext.A, true).E(new m20(new wa(this, musicTrack3, ms1Var2, activity5, 1), 6), lVar, kVar, kVar).F(new n20(new jt(5), 7)));
                    return;
                }
                return;
            }
            if (!aVar.i0(musicTrack3)) {
                itg0.m(aVar.q1(musicTrack3, i0));
                return;
            }
            io.reactivex.rxjava3.core.q<List<String>> u1 = aVar.u1(musicTrack3, false);
            int i = 6;
            itg0.m(u1.E(new f60(new b07(this, musicTrack3, i0, ms1Var2, activity5), i), lVar, kVar, kVar).F(new com.vk.im.ui.components.dialogs_list.b(new nt(i), 6)));
            return;
        }
        MusicTrack musicTrack4 = null;
        r9 = null;
        MusicTrack musicTrack5 = null;
        musicTrack4 = null;
        if (zy6Var instanceof qz6) {
            MusicTrack musicTrack6 = ((qz6) zy6Var).a;
            boolean i02 = aVar.i0(musicTrack6);
            io.reactivex.rxjava3.disposables.g gVar = this.h;
            if (i02) {
                gVar.b(itg0.m(a630.h0(aVar, musicTrack6.b, null, 6)));
                return;
            } else {
                gVar.b(itg0.m(a630.L1(aVar, musicTrack6.b, null, 6)));
                return;
            }
        }
        boolean z4 = zy6Var instanceof fz6;
        u2b0 u2b0Var = this.b;
        if (z4) {
            u2b0Var.w0(true, new PlaybackActionMeta(8, 0L, 2, null));
            return;
        }
        if (zy6Var instanceof dz6) {
            u2b0Var.s0(new PlaybackActionMeta(7, 0L, 2, null));
            return;
        }
        if (zy6Var instanceof az6) {
            u2b0Var.L0(new PlaybackActionMeta(21, 0L, 2, null));
            return;
        }
        if (zy6Var instanceof bz6) {
            u2b0Var.b1(new PlaybackActionMeta(20, 0L, 2, null));
            return;
        }
        if (zy6Var instanceof ez6) {
            u2b0Var.w0(false, new PlaybackActionMeta(8, 0L, 2, null));
            return;
        }
        if (zy6Var instanceof cz6) {
            u2b0Var.s0(new PlaybackActionMeta(7, 0L, 2, null));
            return;
        }
        if (zy6Var instanceof hz6) {
            u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
            return;
        }
        if (zy6Var instanceof gz6) {
            u2b0Var.G0(((gz6) zy6Var).a, new PlaybackActionMeta(17, 0L, 2, null));
            return;
        }
        if (zy6Var instanceof wz6) {
            com.vk.music.player.f fVar = ((wz6) zy6Var).a;
            Activity activity6 = weakReference.get();
            if (activity6 == null) {
                return;
            }
            PlayerTrack playerTrack4 = fVar.m() ? fVar.c : null;
            if (playerTrack4 != null) {
                int i2 = a.$EnumSwitchMapping$0[featureSet.ordinal()];
                if (i2 == 1) {
                    full = new MusicBottomSheetLaunchPoint.Player.Full(playerTrack4);
                } else if (i2 == 2) {
                    full = new MusicBottomSheetLaunchPoint.Player.Limited(playerTrack4);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    full = new MusicBottomSheetLaunchPoint.Player.Messenger(playerTrack4);
                }
                MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint = full;
                MusicTrack musicTrack7 = playerTrack4.b;
                ic40.r(lyd.g().w(), activity6, musicBottomSheetLaunchPoint, musicTrack7, MusicPlaybackLaunchContext.A, new d07(this, musicTrack7), false, false, null, null, 480);
                return;
            }
            return;
        }
        if (zy6Var instanceof vz6) {
            Activity activity7 = weakReference.get();
            if (activity7 == null) {
                return;
            }
            StartPlaySource j = u2b0Var.j();
            StartPlayAudioBookSource startPlayAudioBookSource = j instanceof StartPlayAudioBookSource ? (StartPlayAudioBookSource) j : null;
            if (startPlayAudioBookSource == null || (audioBook = startPlayAudioBookSource.c) == null) {
                return;
            }
            lyd.g().w().o(activity7, audioBook, AudioBookBottomSheetLaunchPoint.BigPlayer.b, u2b0Var.x0(), false);
            return;
        }
        if (zy6Var instanceof rz6) {
            ((rz6) zy6Var).a.o(AdvertisementInfo.Action.AD_CHOICE_CLICK);
            return;
        }
        if (zy6Var instanceof zz6) {
            Activity activity8 = weakReference.get();
            if (activity8 == null) {
                return;
            }
            new dw20.b(activity8, new tzp0.c(null, false)).v0(R.string.music_playback_speed).c(new cpo(false, 0, 6)).D0(new nib0(activity8), false).h0(R.string.done, new i21(3)).I0(null);
            return;
        }
        if (zy6Var instanceof tz6) {
            MusicTrack musicTrack8 = ((tz6) zy6Var).a;
            if (featureSet.h() && (activity3 = weakReference.get()) != null) {
                com.vk.music.stats.a aVar4 = this.g;
                if (aVar4 != null) {
                    aVar4.a(MusicActionTracker.Action.GoToArtist, new MusicActionTracker.a.b(musicTrack8.y));
                }
                if (jnj.j(musicTrack8.V)) {
                    i0q0.f(new i3r(activity3, 2));
                    return;
                } else {
                    lyd.g().r(activity3, musicTrack8, MusicPlaybackLaunchContext.A.Cb(jnj.a(musicTrack8.V)));
                    return;
                }
            }
            return;
        }
        if (zy6Var instanceof uz6) {
            MusicTrack musicTrack9 = ((uz6) zy6Var).a;
            if (featureSet.h() && (activity2 = weakReference.get()) != null) {
                lyd.g().v(activity2, musicTrack9.c, MusicPlaybackLaunchContext.v.Cb(jnj.a(musicTrack9.V)));
                return;
            }
            return;
        }
        if (zy6Var instanceof sz6) {
            MusicTrack musicTrack10 = ((sz6) zy6Var).a;
            if (featureSet.h() && (activity = weakReference.get()) != null) {
                ExternalAudio externalAudio = musicTrack10.H;
                ArticleTtsInfo articleTtsInfo = externalAudio != null ? externalAudio.c : null;
                if (articleTtsInfo != null) {
                    lyd.g().E(activity, articleTtsInfo.c);
                    return;
                }
                return;
            }
            return;
        }
        if (zy6Var instanceof yz6) {
            this.c.i(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, MusicPlaybackLaunchContext.A, "", MusicRestrictionPopupDisplayer.SubscriptionPopupType.DEFAULT);
            return;
        }
        if (zy6Var instanceof xz6) {
            com.vk.music.player.f fVar2 = ((xz6) zy6Var).a;
            AdvertisementInfo c = fVar2.c();
            if (c == null || !c.d) {
                return;
            }
            fVar2.o(AdvertisementInfo.Action.CLICK);
            return;
        }
        qb40 qb40Var = this.f;
        com.vk.music.player.domain.state.a aVar5 = qb40Var.d.b;
        u750 u750Var = qb40Var.f;
        if (zy6Var instanceof zy6.a) {
            qb40Var.b(new sb40.a(((zy6.a) zy6Var).a));
            return;
        }
        if (zy6Var instanceof lz6) {
            com.vk.music.player.f fVar3 = aVar5.a;
            MusicTrack musicTrack11 = (fVar3 == null || (playerTrack3 = fVar3.c) == null) ? null : playerTrack3.b;
            if (musicTrack11 == null) {
                qb40Var.b(sb40.d.c.a);
                return;
            }
            if (aVar5.l != LyricsMode.CONTENT) {
                u750Var.a0(musicTrack11.b, musicTrack11.c);
            }
            qb40Var.i.b(io.reactivex.rxjava3.core.q.B0(1L, TimeUnit.SECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new pdw(new jjx(qb40Var, 12), 6)));
            ny40 ny40Var = qb40Var.e;
            qb40Var.g.b(rsg0.y0(yfb.x(ny40Var.a.b(musicTrack11.Ib())), null, null, 3).U(new e40(new lw3(1, ny40Var, ny40.class, "convertLyricsDto", "convertLyricsDto(Lcom/vk/api/generated/audio/dto/AudioLyricsDto;)Lcom/vk/music/player/domain/model/LyricsContent;", 0, 6), 21)).subscribe(new k2y(new w910(qb40Var, 4), 6), new gf0(new j9k(qb40Var, 29), 27)));
            return;
        }
        if (zy6Var instanceof iz6) {
            com.vk.music.player.f fVar4 = aVar5.a;
            if (fVar4 != null && (playerTrack2 = fVar4.c) != null) {
                musicTrack5 = playerTrack2.b;
            }
            if (musicTrack5 != null && aVar5.l != LyricsMode.COLLAPSED) {
                u750Var.F0(musicTrack5.b, musicTrack5.c);
            }
            qb40Var.b(sb40.d.a.a);
            return;
        }
        boolean z5 = zy6Var instanceof jz6;
        sb40 sb40Var = sb40.e.a.a;
        if (z5) {
            if (((jz6) zy6Var).a) {
                sb40Var = sb40.e.b.a;
            }
            qb40Var.b(sb40Var);
        } else {
            if (zy6Var instanceof mz6) {
                qb40Var.b(((mz6) zy6Var).a ? sb40.h.a.a : sb40.h.b.a);
                return;
            }
            if (zy6Var instanceof kz6) {
                kz6 kz6Var = (kz6) zy6Var;
                com.vk.music.player.f fVar5 = aVar5.a;
                if (fVar5 != null && (playerTrack = fVar5.c) != null) {
                    musicTrack4 = playerTrack.b;
                }
                if (musicTrack4 != null) {
                    u750Var.s(musicTrack4.b, musicTrack4.c);
                }
                qb40Var.a.G0(kz6Var.a, new PlaybackActionMeta(17, 0L, 2, null));
                qb40Var.b(sb40Var);
            }
        }
    }
}
