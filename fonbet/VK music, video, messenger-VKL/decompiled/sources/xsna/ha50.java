package xsna;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.Episode;
import com.vk.dto.music.ExternalAudio;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.article.ArticleTtsInfo;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.player.PlaybackActionMeta;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.d6v0;
import xsna.ec40;
import xsna.i940;
import xsna.k840;
import xsna.y050;

/* compiled from: MusicTrackBottomSheetClickListener.kt */
/* loaded from: classes3.dex */
public final class ha50 implements ec40.a<MusicTrack> {
    public final AppCompatActivity b;
    public final ia50 c;
    public final ec40.a<MusicTrack> d;
    public final MusicBottomSheetActionTracker e;
    public final boolean f;
    public final u2b0 g;
    public io.reactivex.rxjava3.disposables.c h;
    public final Object i;
    public final Object j;

    public ha50(AppCompatActivity appCompatActivity, ia50 ia50Var, Lazy lazy, ec40.a aVar, MusicBottomSheetActionTracker musicBottomSheetActionTracker, boolean z) {
        u2b0 r = ((AudioModelsComponent) m7m.a(appCompatActivity).a(fpf0.a(AudioModelsComponent.class))).r();
        this.b = appCompatActivity;
        this.c = ia50Var;
        this.d = aVar;
        this.e = musicBottomSheetActionTracker;
        this.f = z;
        this.g = r;
        this.i = lazy;
        this.j = msy.a(LazyThreadSafetyMode.NONE, new t210(this, 11));
    }

    @Override // xsna.ec40.a
    public final boolean a(MusicTrack musicTrack) {
        MusicTrack musicTrack2 = musicTrack;
        ec40.a<MusicTrack> aVar = this.d;
        if (aVar == null || !aVar.a(musicTrack2)) {
            if (musicTrack2.Vb()) {
                MusicPlaybackLaunchContext Cb = MusicPlaybackLaunchContext.Fb(musicTrack2.y).Cb(jnj.a(musicTrack2.V));
                fl4 g = lyd.g();
                UserId userId = musicTrack2.c;
                int i = musicTrack2.b;
                int i2 = fl4.a;
                g.O(this.b, userId, i, Cb, null);
                return true;
            }
            AlbumLink albumLink = musicTrack2.q;
            if (albumLink != null) {
                MusicBottomSheetActionTracker musicBottomSheetActionTracker = this.e;
                if (musicBottomSheetActionTracker != null) {
                    musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.OpenAlbum);
                }
                y050 U = lyd.g().U();
                UserId userId2 = albumLink.c;
                int i3 = albumLink.b;
                String str = albumLink.d;
                ia50 ia50Var = this.c;
                U.a(this.b, new y050.b.C4065b(userId2, i3, str, ia50Var.b.t(), null, ia50Var.b.Gb(), 48));
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ec40.a
    public final boolean b(ec40<MusicTrack> ec40Var) {
        ArticleTtsInfo articleTtsInfo;
        String str;
        MusicTrack musicTrack = ec40Var.b;
        ec40.a<MusicTrack> aVar = this.d;
        if (aVar == null || !aVar.b(ec40Var)) {
            MusicTrack musicTrack2 = musicTrack;
            ia50 ia50Var = this.c;
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = ia50Var.b;
            Playlist playlist = ia50Var.c;
            int i = ec40Var.a;
            AppCompatActivity appCompatActivity = this.b;
            MusicBottomSheetActionTracker musicBottomSheetActionTracker = this.e;
            boolean z = false;
            if (i != R.id.music_action_remove_from_my_music) {
                u2b0 u2b0Var = this.g;
                if (i == R.id.music_action_play_next) {
                    if (jnj.j(musicTrack2.V)) {
                        i0q0.f(new i3r(appCompatActivity, 2));
                        return true;
                    }
                    if (musicBottomSheetActionTracker != null) {
                        musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.ListenNext);
                    }
                    u2b0Var.m1(null, Collections.singletonList(musicTrack2), musicPlaybackLaunchContext, (r15 & 8) == 0, new PlaybackActionMeta(6, 0L, 2, null));
                    cvk.u(R.string.music_toast_add_to_play_next_playlist, false);
                    return true;
                }
                if (i == R.id.music_action_share) {
                    if (!musicTrack2.B()) {
                        if (musicBottomSheetActionTracker != null) {
                            musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.Share);
                        }
                        kbj0.e(nr4.b(), this.b, new AudioAttachment(musicTrack2), false, null, false, null, 60);
                        return true;
                    }
                } else if (i == R.id.music_action_toggle_download) {
                    DownloadingState downloadingState = musicTrack2.J;
                    if (epx.f(downloadingState, DownloadingState.Downloaded.b) || epx.f(downloadingState, DownloadingState.Corrupted.b)) {
                        a630.d1(ia50Var, appCompatActivity, musicTrack2, false);
                        return true;
                    }
                    if (epx.f(downloadingState, DownloadingState.NotLoaded.b)) {
                        if (musicBottomSheetActionTracker != null) {
                            musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.Download);
                        }
                        if (o25.a().i().C) {
                            ia50Var.M(appCompatActivity, musicTrack2);
                            return true;
                        }
                    }
                } else {
                    if (i == R.id.music_action_add_to_playlist) {
                        if (musicBottomSheetActionTracker != null) {
                            musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.AddToPlaylist);
                        }
                        ((i940) this.i.getValue()).b(appCompatActivity, new i940.b(Long.valueOf(playlist != null ? playlist.Db() : -1L).longValue(), musicTrack2, ia50Var.b));
                        return true;
                    }
                    if (i == R.id.music_action_setting_player_timer) {
                        if (musicBottomSheetActionTracker != null) {
                            musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.SetSleepTimer);
                        }
                        com.vk.music.player.d dVar = k840.a.f;
                        com.vk.music.player.d dVar2 = dVar != null ? dVar : null;
                        List<Long> list = d6v0.d;
                        new e6v0(d6v0.a.a(dVar2), dVar2, this.f).d(appCompatActivity);
                        return true;
                    }
                    int i2 = 3;
                    if (i == R.id.music_action_add_to_my_music) {
                        if (ia50Var.i(musicTrack2) && this.h == null) {
                            if (musicBottomSheetActionTracker != null) {
                                musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.AddToMyMusic);
                            }
                            p2u p2uVar = new p2u(9);
                            io.reactivex.rxjava3.core.q<Integer> e1 = ia50Var.e1(musicTrack2, musicPlaybackLaunchContext, true);
                            e9b e9bVar = new e9b(this, i2);
                            e1.getClass();
                            io.reactivex.rxjava3.internal.operators.observable.a0 a0Var = new io.reactivex.rxjava3.internal.operators.observable.a0(e1, e9bVar);
                            c2y c2yVar = new c2y(new t7f(musicTrack2, p2uVar), 9);
                            int i3 = kwg0.a;
                            this.h = a0Var.subscribe(c2yVar, new hwg0());
                            return true;
                        }
                    } else {
                        if (i == R.id.music_action_go_to_artists) {
                            if (musicBottomSheetActionTracker != null) {
                                musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.GoToArtists);
                            }
                            lyd.g().r(appCompatActivity, musicTrack2, musicPlaybackLaunchContext);
                            return true;
                        }
                        if (i == R.id.music_action_add_to_favorites) {
                            if (this.h == null) {
                                if (musicBottomSheetActionTracker != null) {
                                    musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.Fave);
                                }
                                this.h = itg0.m(new io.reactivex.rxjava3.internal.operators.observable.a0(l370.J(ia50Var.J(musicTrack2, musicPlaybackLaunchContext), R.string.podcast_toast_fave_done), new b9b(this, 2)));
                                return true;
                            }
                        } else if (i == R.id.music_action_add_remove_from_favorites) {
                            if (this.h == null) {
                                if (musicBottomSheetActionTracker != null) {
                                    musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.Unfave);
                                }
                                this.h = itg0.m(new io.reactivex.rxjava3.internal.operators.observable.a0(l370.J(ia50Var.E(musicTrack2, musicPlaybackLaunchContext), R.string.podcast_toast_unfave_done), new lm1(this, 3)));
                                return true;
                            }
                        } else {
                            if (i == R.id.music_action_share_cover_to_story) {
                                if (musicBottomSheetActionTracker != null) {
                                    musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.AddToStory);
                                }
                                y501.a().h(appCompatActivity, musicTrack2);
                                return true;
                            }
                            if (i == R.id.music_action_podcast_mark_listened) {
                                itg0.m(hg1.m(ia50Var.X0(musicTrack2, musicPlaybackLaunchContext), this.b, 0L, false, 62).F(new d750(new b40(29), 1)));
                                return true;
                            }
                            if (i == R.id.music_action_go_to_podcast) {
                                lyd.g().v(appCompatActivity, musicTrack2.c, MusicPlaybackLaunchContext.Fb(musicTrack2.y).Cb(jnj.a(musicTrack2.V)));
                                return true;
                            }
                            if (i == R.id.music_action_go_to_post) {
                                Episode episode = musicTrack2.w;
                                if (episode != null && (str = episode.g) != null) {
                                    if (jnj.d(musicTrack2.V)) {
                                        i0q0.f(new i3r(appCompatActivity, 2));
                                        return true;
                                    }
                                    ((d4c0) this.j.getValue()).w(appCompatActivity, str);
                                    return true;
                                }
                            } else {
                                if (i == R.id.music_action_cancel_download || i == R.id.music_action_remove_from_storage) {
                                    a630.d1(ia50Var, appCompatActivity, musicTrack2, true);
                                    return true;
                                }
                                if (i == R.id.music_action_longread_open) {
                                    ExternalAudio externalAudio = musicTrack2.H;
                                    if (externalAudio != null && (articleTtsInfo = externalAudio.c) != null) {
                                        maz.c(xwk.d().e(), this.b, articleTtsInfo.d, LaunchContext.A, null, null, 24);
                                        s750 s750Var = k840.a.e;
                                        (s750Var != null ? s750Var : null).b();
                                        return true;
                                    }
                                } else if (i == R.id.music_action_remove_from_current_playlist) {
                                    MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint = ia50Var.d;
                                    MusicBottomSheetLaunchPoint.Player player = musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Player ? (MusicBottomSheetLaunchPoint.Player) musicBottomSheetLaunchPoint : null;
                                    if (player != null) {
                                        if (u2b0Var.J1(player.b.f)) {
                                            Context context = e43.a;
                                            cvk.w((context != null ? context : null).getString(R.string.music_toast_audio_removal_from_next), false);
                                        }
                                    }
                                } else {
                                    if (i == R.id.music_action_open_equalizer) {
                                        lyd.g().w().b(appCompatActivity, false);
                                        return true;
                                    }
                                    if (i == R.id.music_action_copy_link) {
                                        if (musicBottomSheetActionTracker != null) {
                                            musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.CopyLink);
                                        }
                                        Context context2 = e43.a;
                                        Context context3 = context2 != null ? context2 : null;
                                        String str2 = vm40.a;
                                        mhy.a(context3, vm40.d(musicTrack2));
                                        cvk.u(R.string.link_copied, false);
                                        return true;
                                    }
                                    if (i == R.id.music_action_podcast_episode_download) {
                                        i0q0.f(new hv00(appCompatActivity, R.string.music_snack_download_tmp_unavailable_message, 2));
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (ia50Var.i0(musicTrack2)) {
                Playlist Bb = playlist != null ? playlist.Bb(o25.a().c()) : null;
                if (Bb != null && xx1.w(Bb) && !xx1.x(Bb)) {
                    z = true;
                }
                if (!z) {
                    playlist = null;
                }
                if (!z || playlist == null) {
                    fxf0.b(appCompatActivity, musicTrack2, new exf0(new fxf0(ia50Var, musicBottomSheetActionTracker), musicTrack2, appCompatActivity));
                    return true;
                }
                new fxf0(ia50Var, musicBottomSheetActionTracker).a(appCompatActivity, musicTrack2, playlist);
                return true;
            }
            return false;
        }
        return true;
    }
}
