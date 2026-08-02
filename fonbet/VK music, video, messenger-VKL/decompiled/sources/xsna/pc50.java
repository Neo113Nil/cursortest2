package xsna;

import android.content.Context;
import android.media.AudioManager;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.menu.MusicBottomSheetHeaderMenuItem;
import com.vk.music.bottomsheets.menu.MusicBottomSheetListMenuItem;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.MusicCountDownTimer;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioSourceEnum;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ed50;
import xsna.fd50;
import xsna.hg1;
import xsna.k840;
import xsna.lc50;
import xsna.mc50;

/* compiled from: MusicTrackMenuFeature.kt */
/* loaded from: classes3.dex */
public final class pc50 extends wk50<jd50, id50, lc50, fd50> {
    public final od50 f;
    public final kbj0 g;
    public final wz2 h;
    public final otp i;
    public final MusicBottomSheetLaunchPoint j;
    public final lc40 k;
    public final f4z l;
    public final f4z m;
    public final u2b0 n;
    public final a630 o;
    public final a p;

    /* compiled from: MusicTrackMenuFeature.kt */
    public static final class a implements MusicCountDownTimer.a {
        public a() {
        }

        @Override // com.vk.music.player.MusicCountDownTimer.a
        public final void n0() {
            pc50.this.T(new fd50.c(null));
        }

        @Override // com.vk.music.player.MusicCountDownTimer.a
        public final void s0(long j) {
            pc50.this.T(new fd50.c(Long.valueOf(j)));
        }

        @Override // com.vk.music.player.MusicCountDownTimer.a
        public final void u0() {
            pc50.this.T(new fd50.c(null));
        }
    }

    public pc50(gd50 gd50Var, lc50.a aVar, di5 di5Var, od50 od50Var, kbj0 kbj0Var, wz2 wz2Var, otp otpVar, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, lc40 lc40Var) {
        super(aVar, gd50Var);
        this.f = od50Var;
        this.g = kbj0Var;
        this.h = wz2Var;
        this.i = otpVar;
        this.j = musicBottomSheetLaunchPoint;
        this.k = lc40Var;
        this.l = new f4z();
        this.m = new f4z();
        this.n = (u2b0) di5Var.a;
        this.o = (a630) di5Var.b;
        this.p = new a();
    }

    @Override // xsna.wk50
    public final void N(id50 id50Var, lc50 lc50Var) {
        MusicTrack b;
        Playlist playlist;
        Object obj;
        id50 id50Var2 = id50Var;
        lc50 lc50Var2 = lc50Var;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = id50Var2.c;
        MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint = id50Var2.h;
        MusicTrack musicTrack = id50Var2.b;
        boolean z = lc50Var2 instanceof lc50.a;
        a630 a630Var = this.o;
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        u2b0 u2b0Var = this.n;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext2 = null;
        musicPlaybackLaunchContext2 = null;
        musicPlaybackLaunchContext2 = null;
        if (z) {
            MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint2 = ((lc50.a) lc50Var2).b;
            lc40 lc40Var = this.k;
            List<MusicBottomSheetHeaderMenuItem> b2 = lc40Var.b(musicBottomSheetLaunchPoint2);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = b2.iterator();
            while (it.hasNext()) {
                int i = wc50.$EnumSwitchMapping$1[((MusicBottomSheetHeaderMenuItem) it.next()).ordinal()];
                if (i == 1) {
                    obj = lc50.b.a.b;
                } else if (i == 2) {
                    obj = lc50.b.c.b;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj = lc50.b.C3261b.b;
                }
                arrayList.add(obj);
            }
            boolean Wb = musicTrack.Wb();
            int i2 = musicTrack.V;
            List<MusicBottomSheetListMenuItem> a2 = lc40Var.a(musicBottomSheetLaunchPoint2, u2b0Var, Wb);
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = a2.iterator();
            while (it2.hasNext()) {
                switch (wc50.$EnumSwitchMapping$0[((MusicBottomSheetListMenuItem) it2.next()).ordinal()]) {
                    case 1:
                        if (!a630Var.i(musicTrack)) {
                            break;
                        } else {
                            arrayList2.add(lc50.c.a.b);
                            break;
                        }
                    case 2:
                        otp otpVar = this.i;
                        arrayList2.add(new lc50.c.u.a(otpVar.isEnabled(), otpVar.d()));
                        break;
                    case 3:
                        arrayList2.add(lc50.c.s.b);
                        break;
                    case 4:
                        if (!a630Var.i(musicTrack) && a630Var.i0(musicTrack)) {
                            arrayList2.add(lc50.c.q.b);
                            break;
                        }
                        break;
                    case 5:
                        if (!a630Var.i(musicTrack)) {
                            break;
                        } else if (!jnj.h(i2)) {
                            arrayList2.add(lc50.c.C3262c.b);
                            break;
                        } else {
                            arrayList2.add(lc50.c.b.b);
                            break;
                        }
                    case 6:
                        if (a630Var.G(musicTrack) && !jnj.h(i2)) {
                            arrayList2.add(lc50.c.d.b);
                            break;
                        }
                        break;
                    case 7:
                        if (!musicTrack.B()) {
                            arrayList2.add(lc50.c.t.b);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (musicTrack.Bb() <= 0) {
                            arrayList2.add(lc50.c.f.b);
                            break;
                        } else {
                            arrayList2.add(lc50.c.h.b);
                            break;
                        }
                    case 9:
                        AlbumLink albumLink = musicTrack.q;
                        Integer valueOf = albumLink != null ? Integer.valueOf(albumLink.b) : null;
                        if (valueOf != null && valueOf.intValue() != 0) {
                            arrayList2.add(lc50.c.g.b);
                            break;
                        }
                        break;
                    case 10:
                        arrayList2.add(lc50.c.i.b);
                        break;
                    case 11:
                        arrayList2.add(lc50.c.l.b);
                        break;
                    case 12:
                        arrayList2.add(lc50.c.j.b);
                        break;
                    case 13:
                        if (!epx.f(u2b0Var.b(), musicTrack)) {
                            arrayList2.add(lc50.c.p.b);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (!a630Var.i(musicTrack) && a630Var.i0(musicTrack)) {
                            if (!jnj.h(i2)) {
                                arrayList2.add(lc50.c.n.b);
                                break;
                            } else {
                                arrayList2.add(lc50.c.m.b);
                                break;
                            }
                        }
                        break;
                    case 15:
                        arrayList2.add(lc50.c.r.b);
                        break;
                    case 16:
                        arrayList2.add(new lc50.c.e(0));
                        break;
                    case 17:
                        if (!musicTrack.B()) {
                            arrayList2.add(lc50.c.k.b);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        if (!a630Var.i0(musicTrack)) {
                            break;
                        } else {
                            arrayList2.add(lc50.c.o.b);
                            break;
                        }
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            T(new fd50.a(arrayList, arrayList2));
            ((com.vk.music.player.d) this.h.a).a(this.p);
            r5v0 r5v0Var = k840.a.h;
            bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0((r5v0Var != null ? r5v0Var : null).a.a, new hg1.p2()).U(new hg1.o2()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new skz(new wcj(this, 27), 8)));
            return;
        }
        boolean z2 = lc50Var2 instanceof lc50.b;
        f4z f4zVar = this.l;
        od50 od50Var = this.f;
        f4z f4zVar2 = this.m;
        if (z2) {
            lc50.b bVar2 = (lc50.b) lc50Var2;
            if (!(bVar2 instanceof lc50.b.c)) {
                if (bVar2 instanceof lc50.b.C3261b) {
                    if (!musicTrack.B()) {
                        MusicBottomSheetActionTracker musicBottomSheetActionTracker = (MusicBottomSheetActionTracker) od50Var.b;
                        if (musicBottomSheetActionTracker != null) {
                            musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.Broadcast);
                        }
                        f4zVar2.b(mc50.c.a);
                    }
                    f4zVar.b(ed50.a.a);
                    return;
                }
                if (bVar2 instanceof lc50.b.a) {
                    if (!musicTrack.B()) {
                        MusicBottomSheetActionTracker musicBottomSheetActionTracker2 = (MusicBottomSheetActionTracker) od50Var.b;
                        if (musicBottomSheetActionTracker2 != null) {
                            musicBottomSheetActionTracker2.b(MusicBottomSheetActionTracker.Action.Share);
                        }
                        Context context = e43.a;
                        kbj0.e(this.g, context != null ? context : null, new AudioAttachment(musicTrack), false, null, false, null, 60);
                    }
                    f4zVar.b(ed50.a.a);
                    return;
                }
                return;
            }
            DownloadingState downloadingState = id50Var2.g;
            if (!epx.f(downloadingState, DownloadingState.NotLoaded.b)) {
                if (epx.f(downloadingState, DownloadingState.Downloaded.b) || epx.f(downloadingState, DownloadingState.Corrupted.b)) {
                    f4zVar.b(ed50.a.a);
                    f4zVar2.b(new mc50.h(musicTrack));
                    return;
                }
                return;
            }
            MusicBottomSheetActionTracker musicBottomSheetActionTracker3 = (MusicBottomSheetActionTracker) od50Var.b;
            if (musicBottomSheetActionTracker3 != null) {
                musicBottomSheetActionTracker3.b(MusicBottomSheetActionTracker.Action.Download);
            }
            if (!k840.a.i.c()) {
                f4zVar.b(ed50.a.a);
                f4zVar2.b(mc50.d.a);
                return;
            } else {
                if (o25.a().i().C) {
                    f4zVar2.b(new mc50.b(musicTrack));
                    return;
                }
                return;
            }
        }
        if (!(lc50Var2 instanceof lc50.c)) {
            throw new NoWhenBranchMatchedException();
        }
        lc50.c cVar = (lc50.c) lc50Var2;
        if (cVar instanceof lc50.c.C3262c) {
            U(id50Var2);
        } else if (cVar instanceof lc50.c.b) {
            U(id50Var2);
        } else if (cVar instanceof lc50.c.d) {
            MusicBottomSheetActionTracker musicBottomSheetActionTracker4 = (MusicBottomSheetActionTracker) od50Var.b;
            if (musicBottomSheetActionTracker4 != null) {
                musicBottomSheetActionTracker4.b(MusicBottomSheetActionTracker.Action.AddToPlaylist);
            }
            MusicBottomSheetLaunchPoint.Playlist playlist2 = musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Playlist ? (MusicBottomSheetLaunchPoint.Playlist) musicBottomSheetLaunchPoint : null;
            f4zVar2.b(new mc50.a(musicTrack, playlist2 != null ? playlist2.b : null, musicPlaybackLaunchContext));
        } else if (cVar instanceof lc50.c.t) {
            MusicBottomSheetActionTracker musicBottomSheetActionTracker5 = (MusicBottomSheetActionTracker) od50Var.b;
            if (musicBottomSheetActionTracker5 != null) {
                musicBottomSheetActionTracker5.b(MusicBottomSheetActionTracker.Action.AddToStory);
            }
            f4zVar.b(new ed50.f(musicTrack));
        } else if (cVar instanceof lc50.c.k) {
            if (jnj.j(musicTrack.V)) {
                f4zVar.b(ed50.g.a);
            } else {
                MusicBottomSheetActionTracker musicBottomSheetActionTracker6 = (MusicBottomSheetActionTracker) od50Var.b;
                if (musicBottomSheetActionTracker6 != null) {
                    musicBottomSheetActionTracker6.b(MusicBottomSheetActionTracker.Action.ListenNext);
                }
                List singletonList = Collections.singletonList(musicTrack);
                if (musicPlaybackLaunchContext == null) {
                    musicPlaybackLaunchContext = MusicPlaybackLaunchContext.d;
                }
                u2b0Var.m1(null, singletonList, musicPlaybackLaunchContext, (r15 & 8) == 0, new PlaybackActionMeta(6, 0L, 2, null));
                cvk.u(R.string.music_toast_add_to_play_next_playlist, false);
            }
        } else if (cVar instanceof lc50.c.h) {
            V(id50Var2);
        } else if (cVar instanceof lc50.c.f) {
            V(id50Var2);
        } else if (cVar instanceof lc50.c.g) {
            if (jnj.j(musicTrack.V)) {
                f4zVar.b(ed50.g.a);
            } else {
                MusicBottomSheetActionTracker musicBottomSheetActionTracker7 = (MusicBottomSheetActionTracker) od50Var.b;
                if (musicBottomSheetActionTracker7 != null) {
                    musicBottomSheetActionTracker7.b(MusicBottomSheetActionTracker.Action.OpenAlbum);
                }
                AlbumLink albumLink2 = musicTrack.q;
                if (albumLink2 != null) {
                    if (musicPlaybackLaunchContext == null) {
                        musicPlaybackLaunchContext = MusicPlaybackLaunchContext.d;
                    }
                    f4zVar.b(new ed50.b(albumLink2, musicPlaybackLaunchContext));
                }
            }
        } else if (cVar instanceof lc50.c.i) {
            f4zVar.b(ed50.h.a);
        } else if (cVar instanceof lc50.c.l) {
            MusicBottomSheetActionTracker musicBottomSheetActionTracker8 = (MusicBottomSheetActionTracker) od50Var.b;
            if (musicBottomSheetActionTracker8 != null) {
                musicBottomSheetActionTracker8.b(MusicBottomSheetActionTracker.Action.ShowSimilar);
            }
            f4zVar.b(new ed50.e(musicTrack));
        } else if (cVar instanceof lc50.c.s) {
            MusicBottomSheetActionTracker musicBottomSheetActionTracker9 = (MusicBottomSheetActionTracker) od50Var.b;
            if (musicBottomSheetActionTracker9 != null) {
                musicBottomSheetActionTracker9.b(MusicBottomSheetActionTracker.Action.SetSleepTimer);
            }
            f4zVar2.b(mc50.f.a);
        } else if (cVar instanceof lc50.c.p) {
            MusicBottomSheetLaunchPoint.Player player = musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Player ? (MusicBottomSheetLaunchPoint.Player) musicBottomSheetLaunchPoint : null;
            if (!musicTrack.equals(u2b0Var.b()) && player != null) {
                u2b0Var.J1(player.b.f);
            }
        } else if (cVar instanceof lc50.c.n) {
            f4zVar2.b(new mc50.i(musicTrack));
        } else if (cVar instanceof lc50.c.m) {
            f4zVar2.b(new mc50.i(musicTrack));
        } else if (cVar instanceof lc50.c.o) {
            MusicBottomSheetLaunchPoint.Playlist playlist3 = musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Playlist ? (MusicBottomSheetLaunchPoint.Playlist) musicBottomSheetLaunchPoint : null;
            if (playlist3 != null && (playlist = playlist3.b) != null) {
                f4zVar2.b(new mc50.j(musicTrack, playlist));
            }
        } else if (!(cVar instanceof lc50.c.r)) {
            if (cVar instanceof lc50.c.e) {
                final int i3 = ((lc50.c.e) cVar).b;
                i0q0.f(new gzs() { // from class: xsna.oc50
                    @Override // xsna.gzs
                    public final Object invoke() {
                        ((AudioManager) pc50.this.h.b).setStreamVolume(3, i3, 1);
                        return s3q0.a;
                    }
                });
                return;
            }
            boolean z3 = cVar instanceof lc50.c.j;
            MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint3 = this.j;
            if (z3) {
                ((u750) od50Var.c).Y(musicBottomSheetLaunchPoint3 instanceof MusicBottomSheetLaunchPoint.Player ? CommonAudioStat$TypeAudioSourceEnum.MENU : null);
                f4zVar2.b(mc50.e.a);
            } else if (cVar instanceof lc50.c.a) {
                if ((musicBottomSheetLaunchPoint3 instanceof MusicBottomSheetLaunchPoint.Player) && (b = u2b0Var.b()) != null && b.Wb()) {
                    musicPlaybackLaunchContext2 = MusicPlaybackLaunchContext.A.zb();
                    musicPlaybackLaunchContext2.b.putString("__META_PLAYER_TYPE", "radio_player");
                }
                bVar.b(itg0.m(a630.L1(a630Var, musicTrack.b, musicPlaybackLaunchContext2, 2)));
            } else if (cVar instanceof lc50.c.q) {
                f4zVar2.b(new mc50.g(musicTrack.b));
            } else {
                if (!(cVar instanceof lc50.c.u.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((u750) od50Var.c).K0(musicTrack.Wb() ? CommonAudioStat$TypeAudioSourceEnum.RADIO_PLAYER_MENU : CommonAudioStat$TypeAudioSourceEnum.MENU);
                f4zVar.b(ed50.d.a);
            }
        }
        f4zVar.b(ed50.a.a);
    }

    public final void U(id50 id50Var) {
        MusicTrack musicTrack = id50Var.b;
        MusicTrack musicTrack2 = id50Var.b;
        a630 a630Var = this.o;
        if (a630Var.i(musicTrack)) {
            MusicBottomSheetActionTracker musicBottomSheetActionTracker = (MusicBottomSheetActionTracker) this.f.b;
            if (musicBottomSheetActionTracker != null) {
                musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.AddToMyMusic);
            }
            boolean z = musicTrack2.P;
            io.reactivex.rxjava3.disposables.b bVar = this.e;
            if (z) {
                bVar.b(itg0.m(a630Var.p1(musicTrack2, true, false)));
            }
            io.reactivex.rxjava3.core.q<Integer> e1 = a630Var.e1(musicTrack2, id50Var.c, true);
            bdz bdzVar = new bdz(new h630(id50Var, 6), 7);
            int i = kwg0.a;
            bVar.b(e1.subscribe(bdzVar, new hwg0()));
        }
    }

    public final void V(id50 id50Var) {
        MusicBottomSheetActionTracker musicBottomSheetActionTracker = (MusicBottomSheetActionTracker) this.f.b;
        if (musicBottomSheetActionTracker != null) {
            musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.GoToArtists);
        }
        MusicTrack musicTrack = id50Var.b;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = id50Var.c;
        if (musicPlaybackLaunchContext == null) {
            musicPlaybackLaunchContext = MusicPlaybackLaunchContext.d;
        }
        this.l.b(new ed50.c(musicTrack, musicPlaybackLaunchContext));
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        ((com.vk.music.player.d) this.h.a).c(this.p);
        super.onDestroy();
    }
}
