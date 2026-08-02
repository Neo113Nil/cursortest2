package xsna;

import android.content.Context;
import com.google.zxing.pdf417.PDF417Common;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dbb0;
import xsna.ebb0;
import xsna.hbb0;
import xsna.k840;
import xsna.vab0;

/* compiled from: PlaylistMenuFeature.kt */
/* loaded from: classes3.dex */
public final class yab0 extends wk50<jbb0, ibb0, vab0, ebb0> {
    public final i7b0 f;
    public final abb0 g;
    public final u2b0 h;
    public final MusicBottomSheetActionTracker i;
    public final f4z j;
    public final f4z k;

    public yab0(gbb0 gbb0Var, j7b0 j7b0Var, abb0 abb0Var, u2b0 u2b0Var, MusicBottomSheetActionTracker musicBottomSheetActionTracker) {
        super(vab0.a.b, gbb0Var);
        this.f = j7b0Var;
        this.g = abb0Var;
        this.h = u2b0Var;
        this.i = musicBottomSheetActionTracker;
        this.j = new f4z();
        this.k = new f4z();
    }

    @Override // xsna.wk50
    public final void N(ibb0 ibb0Var, vab0 vab0Var) {
        ibb0 ibb0Var2 = ibb0Var;
        vab0 vab0Var2 = vab0Var;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = ibb0Var2.f;
        Playlist playlist = ibb0Var2.b;
        if (vab0Var2 instanceof vab0.a) {
            T(new ebb0.a(this.g.a()));
            return;
        }
        if (!(vab0Var2 instanceof vab0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        vab0.b bVar = (vab0.b) vab0Var2;
        boolean z = bVar instanceof vab0.b.c;
        f4z f4zVar = this.j;
        i7b0 i7b0Var = this.f;
        f4z f4zVar2 = this.k;
        MusicBottomSheetActionTracker musicBottomSheetActionTracker = this.i;
        if (z || epx.f(bVar, vab0.b.a.b) || epx.f(bVar, vab0.b.C3877b.b)) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (!com.vk.core.utils.newtork.b.d()) {
                f4zVar2.b(hbb0.a.b.b);
            } else if (i7b0Var.n()) {
                if (musicBottomSheetActionTracker != null) {
                    musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.AddToMyMusic);
                }
                itg0.i(7, i7b0Var.R().a0(io.reactivex.rxjava3.android.schedulers.a.b()), null, null, null);
            }
        } else if ((bVar instanceof vab0.b.n) || epx.f(bVar, vab0.b.m.b)) {
            W(ibb0Var2, false);
        } else if (bVar instanceof vab0.b.f) {
            W(ibb0Var2, true);
        } else if (bVar instanceof vab0.b.k) {
            if (jnj.j(playlist.O)) {
                f4zVar.b(dbb0.j.a);
            } else {
                com.vk.core.utils.newtork.b.a.getClass();
                if (com.vk.core.utils.newtork.b.d()) {
                    if (musicBottomSheetActionTracker != null) {
                        musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.ListenNext);
                    }
                    itg0.i(7, i7b0Var.n1().a0(io.reactivex.rxjava3.android.schedulers.a.b()), null, null, null);
                } else {
                    f4zVar2.b(hbb0.a.b.b);
                }
            }
        } else if ((bVar instanceof vab0.b.j) || epx.f(bVar, vab0.b.i.b)) {
            if (musicBottomSheetActionTracker != null) {
                musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.GoToArtists);
            }
            if (musicPlaybackLaunchContext == null) {
                musicPlaybackLaunchContext = MusicPlaybackLaunchContext.d;
            }
            f4zVar.b(new dbb0.c(playlist, musicPlaybackLaunchContext));
        } else if ((bVar instanceof vab0.b.g) || (bVar instanceof vab0.b.o)) {
            DownloadingState downloadingState = playlist.H;
            if ((downloadingState instanceof DownloadingState.Downloaded) || (downloadingState instanceof DownloadingState.Downloading)) {
                f4zVar.b(new dbb0.e(playlist));
            } else if ((downloadingState instanceof DownloadingState.NotLoaded) || (downloadingState instanceof DownloadingState.PartlyDownloaded)) {
                if (downloadingState instanceof DownloadingState.PartlyDownloaded) {
                    f4zVar.b(new dbb0.e(playlist));
                } else if (k840.a.i.c()) {
                    com.vk.core.utils.newtork.b.a.getClass();
                    if (com.vk.core.utils.newtork.b.d()) {
                        if (musicBottomSheetActionTracker != null) {
                            musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.Download);
                        }
                        f4zVar.b(new dbb0.b(playlist));
                    } else {
                        f4zVar2.b(hbb0.a.b.b);
                    }
                } else {
                    f4zVar.b(dbb0.i.a);
                }
            } else if (downloadingState instanceof DownloadingState.PendingDownload) {
                f4zVar.b(new dbb0.e(playlist));
            }
        } else if (bVar instanceof vab0.b.q) {
            f4zVar.b(new dbb0.h(playlist));
        } else if (bVar instanceof vab0.b.h) {
            f4zVar.b(new dbb0.d(playlist));
        } else if (bVar instanceof vab0.b.e) {
            U(ibb0Var2);
        } else if (bVar instanceof vab0.b.p) {
            if (k840.a.h()) {
                U(ibb0Var2);
            } else {
                if (musicBottomSheetActionTracker != null) {
                    musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.Share);
                }
                f4zVar.b(new dbb0.g(playlist));
            }
        } else {
            if (!(bVar instanceof vab0.b.l) && !epx.f(bVar, vab0.b.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            com.vk.core.utils.newtork.b.a.getClass();
            if (com.vk.core.utils.newtork.b.d()) {
                String str = playlist.Eb() ? "album_mix" : "playlist_mix";
                String Ib = playlist.Ib();
                String str2 = playlist.h;
                if (str2 == null) {
                    str2 = "";
                }
                StartPlayVkMixSource startPlayVkMixSource = new StartPlayVkMixSource("", "", str, false, str2, null, Ib, null, null, null, PDF417Common.MAX_CODEWORDS_IN_BARCODE, null);
                if (musicPlaybackLaunchContext == null) {
                    musicPlaybackLaunchContext = MusicPlaybackLaunchContext.d;
                }
                this.h.N0(new lqk0(startPlayVkMixSource, (MusicTrack) null, (List) null, musicPlaybackLaunchContext, 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886));
            } else {
                f4zVar2.b(hbb0.a.b.b);
            }
        }
        f4zVar.b(dbb0.a.a);
    }

    public final void U(ibb0 ibb0Var) {
        MusicBottomSheetActionTracker musicBottomSheetActionTracker = this.i;
        if (musicBottomSheetActionTracker != null) {
            musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.CopyLink);
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        mhy.a(context, xx1.G(ibb0Var.b));
        this.k.b(hbb0.a.C2983a.b);
    }

    public final void V(ibb0 ibb0Var) {
        Playlist k = xx1.k(ibb0Var.b);
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = this.f.z().a0(io.reactivex.rxjava3.android.schedulers.a.b());
        amt amtVar = new amt(new pm90(3, this, k), 21);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        itg0.i(7, a0.E(amtVar, lVar, kVar, kVar), null, null, null);
    }

    public final void W(ibb0 ibb0Var, boolean z) {
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            this.k.b(hbb0.a.b.b);
            return;
        }
        if (this.f.Y()) {
            MusicBottomSheetActionTracker musicBottomSheetActionTracker = this.i;
            if (musicBottomSheetActionTracker != null) {
                musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.RemoveFromMyMusic);
            }
            if (!z && !ibb0Var.b.S4()) {
                V(ibb0Var);
            } else {
                this.j.b(new dbb0.f(ibb0Var.b, new xq1(11, this, ibb0Var)));
            }
        }
    }
}
