package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Playlist;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.collections.EmptyList;
import xsna.ec40;
import xsna.y050;

/* compiled from: PlaylistBottomSheetClickListener.kt */
/* loaded from: classes3.dex */
public final class h7b0 implements ec40.a<Playlist>, DialogInterface.OnDismissListener {
    public final AppCompatActivity b;
    public final Playlist c;
    public final j7b0 d;
    public final MusicBottomSheetActionTracker e;
    public final NewsEntry f;
    public io.reactivex.rxjava3.disposables.c g;
    public io.reactivex.rxjava3.disposables.c h;
    public io.reactivex.rxjava3.disposables.c i;

    public h7b0(AppCompatActivity appCompatActivity, Playlist playlist, j7b0 j7b0Var, MusicBottomSheetActionTracker musicBottomSheetActionTracker, NewsEntry newsEntry) {
        this.b = appCompatActivity;
        this.c = playlist;
        this.d = j7b0Var;
        this.e = musicBottomSheetActionTracker;
        this.f = newsEntry;
    }

    @Override // xsna.ec40.a
    public final boolean a(Playlist playlist) {
        Playlist playlist2 = playlist;
        y050 U = lyd.g().U();
        bpn0 bpn0Var = enj.a;
        U.a(e3m.h(this.b), new y050.b.a(playlist2, this.d.b.t(), null, null, null, 28));
        return true;
    }

    @Override // xsna.ec40.a
    public final boolean b(ec40<Playlist> ec40Var) {
        j7b0 j7b0Var = this.d;
        Playlist playlist = j7b0Var.c;
        int i = ec40Var.a;
        NewsEntry newsEntry = this.f;
        MusicBottomSheetActionTracker musicBottomSheetActionTracker = this.e;
        AppCompatActivity appCompatActivity = this.b;
        int i2 = 1;
        if (i == R.id.music_action_share) {
            if (musicBottomSheetActionTracker != null) {
                musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.Share);
            }
            nr4.b().B(appCompatActivity, Playlist.zb(this.c, null, null, EmptyList.b, null, -8388609, 255), newsEntry);
            return true;
        }
        if (i == R.id.music_action_add_to_my_music) {
            if (xx1.b(playlist)) {
                if (this.g == null) {
                    if (musicBottomSheetActionTracker != null) {
                        musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.AddToMyMusic);
                    }
                    io.reactivex.rxjava3.internal.operators.observable.m1 a0 = j7b0Var.R().a0(io.reactivex.rxjava3.android.schedulers.a.b());
                    kjs kjsVar = new kjs(new mi10(this, 12), 14);
                    a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                    a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                    this.g = itg0.m(new io.reactivex.rxjava3.internal.operators.observable.a0(a0.E(kjsVar, lVar, kVar, kVar), new rg60(this, i2)));
                    return true;
                }
                return true;
            }
            return false;
        }
        Playlist playlist2 = this.c;
        if (i != R.id.music_action_remove_from_my_music) {
            if (i == R.id.music_action_play_next) {
                if (this.h == null) {
                    if (jnj.j(playlist2.O)) {
                        i0q0.f(new i3r(appCompatActivity, 2));
                        return true;
                    }
                    if (musicBottomSheetActionTracker != null) {
                        musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.ListenNext);
                    }
                    this.h = itg0.m(new io.reactivex.rxjava3.internal.operators.observable.a0(j7b0Var.n1().a0(io.reactivex.rxjava3.android.schedulers.a.b()), new sbb(this, 3)));
                    return true;
                }
            } else if (i == R.id.music_action_toggle_download) {
                DownloadingState downloadingState = playlist2.H;
                if ((downloadingState instanceof DownloadingState.Downloaded) || (downloadingState instanceof DownloadingState.Downloading)) {
                    c(true);
                    return true;
                }
                if ((downloadingState instanceof DownloadingState.NotLoaded) || (downloadingState instanceof DownloadingState.PartlyDownloaded)) {
                    if (downloadingState instanceof DownloadingState.PartlyDownloaded) {
                        c(true);
                        return true;
                    }
                    if (musicBottomSheetActionTracker != null) {
                        musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.Download);
                    }
                    j7b0Var.y(appCompatActivity, playlist2);
                    return true;
                }
                if (downloadingState instanceof DownloadingState.PendingDownload) {
                    c(true);
                }
            } else if (i == R.id.music_action_go_to_artists) {
                Activity h = e3m.h(appCompatActivity);
                if (h != null) {
                    if (musicBottomSheetActionTracker != null) {
                        musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.GoToArtists);
                    }
                    lyd.g().I(h, playlist2, j7b0Var.b);
                    return true;
                }
            } else {
                if (i == R.id.music_action_copy_link) {
                    if (musicBottomSheetActionTracker != null) {
                        musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.CopyLink);
                    }
                    mhy.a(appCompatActivity, xx1.G(playlist2));
                    cvk.u(R.string.link_copied, false);
                    return true;
                }
                if (i == R.id.music_action_edit) {
                    lyd.g().g().c(appCompatActivity, Playlist.zb(this.c, null, null, EmptyList.b, null, -8388609, 255));
                    return true;
                }
                if (i == R.id.music_action_cancel_download || i == R.id.music_action_remove_from_storage) {
                    c(false);
                    return true;
                }
                if (i == R.id.music_action_share_cover_to_story) {
                    g7j0 a = y501.a();
                    bpn0 bpn0Var = enj.a;
                    a.j(e3m.h(appCompatActivity), Playlist.zb(this.c, null, null, EmptyList.b, null, -8388609, 255), newsEntry);
                    return true;
                }
                if (i == R.id.music_action_continue_downloading) {
                    if (musicBottomSheetActionTracker != null) {
                        musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.Download);
                    }
                    j7b0Var.y(appCompatActivity, playlist2);
                    return true;
                }
            }
            return true;
        }
        if (xx1.d(playlist)) {
            if (musicBottomSheetActionTracker != null) {
                musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.RemoveFromMyMusic);
            }
            je50.b(appCompatActivity, playlist2, new xsw(this, 22));
            return true;
        }
        return false;
    }

    public final void c(boolean z) {
        if (!z) {
            this.d.B(xx1.k(this.c));
            return;
        }
        ic40 w = lyd.g().w();
        bpn0 bpn0Var = enj.a;
        ic40.j(w, e3m.h(this.b), this.c, MusicPlaybackLaunchContext.d, MusicBottomSheetLaunchPoint.Delete.b, null, PsExtractor.VIDEO_STREAM_MASK);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.i;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar3 = this.h;
        if (cVar3 != null) {
            cVar3.dispose();
        }
    }
}
