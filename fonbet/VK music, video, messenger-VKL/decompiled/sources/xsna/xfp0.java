package xsna;

import android.content.Context;
import com.vk.api.generated.combo.dto.ComboAvailableOfferPlatformDto;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.group.Group;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerMode;
import com.vk.network.kbh.state.NetworkState;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioSourceEnum;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapGotoEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTrackMenuUiClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.toggle.features.CoreFeatures;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.agp0;
import xsna.bgp0;
import xsna.egp0;
import xsna.hg1;
import xsna.k840;
import xsna.mc50;
import xsna.tfp0;
import xsna.wzm0;

/* compiled from: TrackMenuFeature.kt */
/* loaded from: classes3.dex */
public final class xfp0 extends wk50<ggp0, fgp0, tfp0, bgp0> {
    public final MusicBottomSheetActionTracker f;
    public final u2b0 g;
    public final a630 h;
    public final g950 i;
    public final u750 j;
    public final xl40 k;
    public final x2b0 l;
    public final wfp0 m;
    public final us4 n;
    public final f4z o;
    public final f4z p;
    public final f4z q;

    public xfp0(dgp0 dgp0Var, tfp0.a aVar, MusicBottomSheetActionTracker musicBottomSheetActionTracker, u2b0 u2b0Var, com.vk.music.track.a aVar2, g950 g950Var, u750 u750Var, xl40 xl40Var, x2b0 x2b0Var) {
        super(aVar, dgp0Var);
        this.f = musicBottomSheetActionTracker;
        this.g = u2b0Var;
        this.h = aVar2;
        this.i = g950Var;
        this.j = u750Var;
        this.k = xl40Var;
        this.l = x2b0Var;
        wfp0 wfp0Var = new wfp0();
        this.m = wfp0Var;
        this.n = new us4(u750Var, x2b0Var);
        this.o = new f4z();
        this.p = new f4z();
        this.q = new f4z();
        CoreFeatures coreFeatures = CoreFeatures.KBH_DETECT;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            d6q0.c(wfp0Var);
        }
    }

    @Override // xsna.wk50
    public final void N(fgp0 fgp0Var, tfp0 tfp0Var) {
        Playlist playlist;
        ArrayList arrayList;
        fgp0 fgp0Var2 = fgp0Var;
        tfp0 tfp0Var2 = tfp0Var;
        int i = 10;
        int i2 = 3;
        int i3 = 1;
        if (tfp0Var2 instanceof tfp0.a) {
            io.reactivex.rxjava3.disposables.b bVar = this.e;
            MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint = ((tfp0.a) tfp0Var2).b;
            MusicTrack musicTrack = fgp0Var2.b;
            a630 a630Var = this.h;
            u2b0 u2b0Var = this.g;
            g950 g950Var = this.i;
            boolean booleanValue = this.k.isEnabled().getValue().booleanValue();
            yfp0 yfp0Var = new yfp0(musicBottomSheetLaunchPoint, musicTrack, a630Var, u2b0Var, g950Var, booleanValue);
            if (musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Player.Full) {
                arrayList = new ArrayList();
                arrayList.add(tfp0.b.s.b);
                if (!g950Var.c()) {
                    arrayList.add(tfp0.b.r.b);
                }
                yfp0Var.a(arrayList);
                yfp0Var.b(arrayList);
                if (!musicTrack.B()) {
                    arrayList.add(tfp0.b.g.b);
                }
                if (!musicTrack.B()) {
                    arrayList.add(tfp0.b.q.b);
                }
                yfp0Var.c(arrayList);
                yfp0.g(arrayList);
                yfp0Var.e(arrayList);
                yfp0Var.d(arrayList);
                if (!booleanValue) {
                    yfp0.g(arrayList);
                    arrayList.add(tfp0.b.p.b);
                }
                yfp0.g(arrayList);
                yfp0Var.f(arrayList);
            } else if (musicBottomSheetLaunchPoint instanceof MusicBottomSheetLaunchPoint.Playlist) {
                Playlist playlist2 = ((MusicBottomSheetLaunchPoint.Playlist) musicBottomSheetLaunchPoint).b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(tfp0.b.s.b);
                if (!g950Var.c()) {
                    arrayList2.add(tfp0.b.r.b);
                }
                yfp0Var.a(arrayList2);
                yfp0Var.b(arrayList2);
                if (!musicTrack.B()) {
                    arrayList2.add(tfp0.b.g.b);
                }
                if (!musicTrack.B()) {
                    arrayList2.add(tfp0.b.q.b);
                }
                yfp0Var.c(arrayList2);
                yfp0.g(arrayList2);
                yfp0Var.e(arrayList2);
                yfp0Var.d(arrayList2);
                if (sp.f(u2b0Var) && !booleanValue) {
                    if (!musicTrack.B()) {
                        arrayList2.add(tfp0.b.o.b);
                        arrayList2.add(tfp0.b.k.b);
                    }
                    if (!musicTrack.B()) {
                        arrayList2.add(tfp0.b.d.b);
                    }
                }
                if (!booleanValue) {
                    yfp0.g(arrayList2);
                    arrayList2.add(tfp0.b.p.b);
                }
                yfp0.g(arrayList2);
                if (xx1.w(xx1.m(playlist2)) && o25.a().a(musicTrack.c)) {
                    t6g0 t6g0Var = t6g0.b;
                    Group C0 = t6g0.b().C0(fkq0.e(musicTrack.c));
                    if ((C0 != null && C0.i) || !xx1.x(playlist2)) {
                        arrayList2.add(tfp0.b.n.b);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = new ArrayList();
                arrayList.add(tfp0.b.s.b);
                if (!g950Var.c()) {
                    arrayList.add(tfp0.b.r.b);
                }
                yfp0Var.a(arrayList);
                yfp0Var.b(arrayList);
                if (!musicTrack.B()) {
                    arrayList.add(tfp0.b.g.b);
                }
                if (!musicTrack.B()) {
                    arrayList.add(tfp0.b.q.b);
                }
                yfp0Var.c(arrayList);
                yfp0.g(arrayList);
                yfp0Var.e(arrayList);
                yfp0Var.d(arrayList);
                if (sp.f(u2b0Var) && !booleanValue) {
                    if (!musicTrack.B()) {
                        arrayList.add(tfp0.b.o.b);
                        arrayList.add(tfp0.b.k.b);
                    }
                    if (!musicTrack.B()) {
                        arrayList.add(tfp0.b.d.b);
                    }
                }
                if (!booleanValue) {
                    yfp0.g(arrayList);
                    arrayList.add(tfp0.b.p.b);
                }
                yfp0.g(arrayList);
                yfp0Var.f(arrayList);
            }
            ArrayList arrayList3 = new ArrayList(arrayList);
            if (epx.f(j5g.k0(arrayList), tfp0.b.o.b)) {
                arrayList3.remove(e43.h(arrayList3));
            }
            T(new bgp0.a(j5g.O0(arrayList3)));
            MusicTrack musicTrack2 = fgp0Var2.b;
            T(new bgp0.c(musicTrack2, musicTrack2.J));
            ComboAvailableOfferPlatformDto comboAvailableOfferPlatformDto = ComboAvailableOfferPlatformDto.ANDROID;
            int i4 = 13;
            tfx tfxVar = new tfx("combo.availableOffer", new ao(10), new bo(13));
            if (comboAvailableOfferPlatformDto != null) {
                tfx.o(tfxVar, "platform", comboAvailableOfferPlatformDto.i(), 0, 0, 12);
            }
            tfx.o(tfxVar, "ref", "track_menu", 0, 0, 12);
            bVar.b(rsg0.y0(yfb.x(tfxVar), null, null, 3).subscribe(new whm0(new f6m0(this, 6), i2)));
            r5v0 r5v0Var = k840.a.h;
            bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0((r5v0Var != null ? r5v0Var : null).a.a, new hg1.d4()).U(new hg1.c4()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new k5j0(new mcj0(this, i4), 9)));
            return;
        }
        if (!(tfp0Var2 instanceof tfp0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        tfp0.b bVar2 = (tfp0.b) tfp0Var2;
        wfp0 wfp0Var = this.m;
        wfp0Var.getClass();
        CoreFeatures coreFeatures = CoreFeatures.KBH_DETECT;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures) && wfp0Var.a == NetworkState.UNSTABLE && ((bVar2 instanceof tfp0.b.s) || (bVar2 instanceof tfp0.b.j) || (bVar2 instanceof tfp0.b.i))) {
            this.o.b(agp0.a.a);
            d6q0.a.getClass();
            d6q0.l(true, false);
            return;
        }
        us4 us4Var = this.n;
        boolean b = this.i.b();
        yyk0 yyk0Var = us4Var.a;
        tfp0.b.c cVar = tfp0.b.c.b;
        if (bVar2.equals(cVar)) {
            yyk0Var.a.u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_ADD_MY_MUSIC_MENU, yyk0Var.c);
        } else if (bVar2.equals(tfp0.b.e.b)) {
            yyk0Var.a.u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_ADD_TO_PLAYLIST_MENU, yyk0Var.c);
            yyk0Var.b.a(MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO, (r3 & 4) == 0);
        } else if (bVar2.equals(tfp0.b.q.b)) {
            yyk0Var.a.u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_SHARE_TRACK_MENU, yyk0Var.c);
        } else if (bVar2 instanceof tfp0.b.f) {
            boolean z = ((tfp0.b.f) bVar2).b;
            PlayerMode playerMode = yyk0Var.c;
            u750 u750Var = yyk0Var.a;
            if (z) {
                u750Var.u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_HATE_MENU, playerMode);
            } else {
                u750Var.u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_UNHATE_MENU, playerMode);
            }
        } else if (bVar2.equals(tfp0.b.j.b)) {
            yyk0Var.a.u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_GOTO_ARTIST_MENU, yyk0Var.c);
            yyk0Var.b.a(MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO, (r3 & 4) == 0);
        } else if (bVar2.equals(tfp0.b.h.b)) {
            yyk0Var.a.u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_SEARCH_MENU, yyk0Var.c);
            yyk0Var.b.a(MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO, (r3 & 4) == 0);
        } else if (bVar2.equals(tfp0.b.i.b)) {
            yyk0Var.a.u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_GOTO_ALBUM_MENU, yyk0Var.c);
            yyk0Var.b.a(MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO, (r3 & 4) == 0);
        } else if (bVar2.equals(tfp0.b.k.b)) {
            yyk0Var.a.u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_PLAY_NEXT_MENU, yyk0Var.c);
        } else if (bVar2.equals(tfp0.b.m.b)) {
            yyk0Var.a.u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_DELETE_MY_MUSIC_MENU, yyk0Var.c);
        } else if (bVar2.equals(tfp0.b.p.b)) {
            yyk0Var.a.u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_SET_MENU, yyk0Var.c);
        } else if (bVar2.equals(tfp0.b.g.b)) {
            MusicTrack musicTrack3 = fgp0Var2.b;
            yyk0Var.getClass();
            yyk0Var.a.u0((musicTrack3.S4() || musicTrack3.Pb()) ? CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_DELETE_CACHE_MENU : !b ? CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_ADD_NO_SUBSCRIBE_MENU : musicTrack3.U ? CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_ADD_CACHE_MENU : CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_ADD_ONLINE_CACHE_MENU, yyk0Var.c);
        } else if (bVar2.equals(tfp0.b.r.b)) {
            yyk0Var.a.u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_DISABLE_ADS_MENU, yyk0Var.c);
            yyk0Var.b.a(MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO, (r3 & 4) == 0);
        } else if (bVar2.equals(tfp0.b.d.b)) {
            yyk0Var.a.u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_ADD_TO_QUEUE_MENU, yyk0Var.c);
        } else if (bVar2.equals(tfp0.b.s.b)) {
            yyk0Var.a.u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType.TAP_MIX_TRACK_MENU, yyk0Var.c);
        }
        if (bVar2.equals(cVar)) {
            U(fgp0Var2);
        } else if (bVar2.equals(tfp0.b.a.b)) {
            U(fgp0Var2);
        } else if (bVar2.equals(tfp0.b.C3742b.b)) {
            U(fgp0Var2);
        } else if (bVar2.equals(tfp0.b.e.b)) {
            MusicBottomSheetActionTracker musicBottomSheetActionTracker = this.f;
            if (musicBottomSheetActionTracker != null) {
                musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.AddToPlaylist);
            }
            MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint2 = fgp0Var2.c;
            MusicBottomSheetLaunchPoint.Playlist playlist3 = musicBottomSheetLaunchPoint2 instanceof MusicBottomSheetLaunchPoint.Playlist ? (MusicBottomSheetLaunchPoint.Playlist) musicBottomSheetLaunchPoint2 : null;
            this.p.b(new mc50.a(fgp0Var2.b, playlist3 != null ? playlist3.b : null, fgp0Var2.g));
        } else if (bVar2.equals(tfp0.b.q.b)) {
            MusicTrack musicTrack4 = fgp0Var2.b;
            if (!musicTrack4.B()) {
                MusicBottomSheetActionTracker musicBottomSheetActionTracker2 = this.f;
                if (musicBottomSheetActionTracker2 != null) {
                    musicBottomSheetActionTracker2.b(MusicBottomSheetActionTracker.Action.Share);
                }
                if (this.k.isEnabled().getValue().booleanValue()) {
                    Context context = e43.a;
                    Context context2 = context != null ? context : null;
                    String str = vm40.a;
                    mhy.a(context2, vm40.d(musicTrack4));
                    this.q.b(egp0.a.b.b);
                } else {
                    this.o.b(new agp0.d(musicTrack4));
                }
            }
        } else if (bVar2 instanceof tfp0.b.f) {
            boolean z2 = ((tfp0.b.f) bVar2).b;
            com.vk.core.utils.newtork.b.a.getClass();
            if (com.vk.core.utils.newtork.b.d()) {
                int i5 = 2;
                if (z2) {
                    MusicTrack musicTrack5 = fgp0Var2.b;
                    if (musicTrack5.P) {
                        itg0.i(3, this.h.p1(musicTrack5, false, true), new tsk0(this, i), null, null);
                        if (musicTrack5.l && musicTrack5.m) {
                            itg0.i(7, this.h.e1(musicTrack5, MusicPlaybackLaunchContext.A, true).F(new f2u(new c1o0(i5, this, musicTrack5), 23)), null, null, null);
                        }
                    }
                } else {
                    MusicTrack musicTrack6 = fgp0Var2.b;
                    a630 a630Var2 = this.h;
                    if (!musicTrack6.P) {
                        boolean i0 = a630Var2.i0(musicTrack6);
                        if (a630Var2.i0(musicTrack6)) {
                            io.reactivex.rxjava3.core.q<List<String>> u1 = a630Var2.u1(musicTrack6, false);
                            onm0 onm0Var = new onm0(new i7h(this, musicTrack6, i0, i3), i5);
                            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                            itg0.i(7, u1.E(onm0Var, lVar, kVar, kVar).F(new t5n0(new tn0(29, this, musicTrack6), i3)), null, null, null);
                        } else {
                            itg0.i(3, a630Var2.q1(musicTrack6, i0).F(new a960(new snj0(4, this, musicTrack6), 25)), new hbj0(this, 12), null, null);
                        }
                    }
                }
            } else {
                this.q.b(egp0.a.c.b);
            }
        } else if (bVar2.equals(tfp0.b.h.b)) {
            W(fgp0Var2);
        } else if (bVar2.equals(tfp0.b.j.b)) {
            W(fgp0Var2);
        } else if (bVar2.equals(tfp0.b.i.b)) {
            f4z f4zVar = this.o;
            if (jnj.j(fgp0Var2.b.V)) {
                f4zVar.b(agp0.e.a);
            } else {
                MusicBottomSheetActionTracker musicBottomSheetActionTracker3 = this.f;
                if (musicBottomSheetActionTracker3 != null) {
                    musicBottomSheetActionTracker3.b(MusicBottomSheetActionTracker.Action.OpenAlbum);
                }
                AlbumLink albumLink = fgp0Var2.b.q;
                if (albumLink != null) {
                    MusicPlaybackLaunchContext musicPlaybackLaunchContext = fgp0Var2.g;
                    if (musicPlaybackLaunchContext == null) {
                        musicPlaybackLaunchContext = MusicPlaybackLaunchContext.d;
                    }
                    f4zVar.b(new agp0.b(albumLink, musicPlaybackLaunchContext));
                }
            }
        } else if (bVar2.equals(tfp0.b.k.b)) {
            if (jnj.j(fgp0Var2.b.V)) {
                this.o.b(agp0.e.a);
            } else {
                MusicBottomSheetActionTracker musicBottomSheetActionTracker4 = this.f;
                if (musicBottomSheetActionTracker4 != null) {
                    musicBottomSheetActionTracker4.b(MusicBottomSheetActionTracker.Action.ListenNext);
                }
                u2b0 u2b0Var2 = this.g;
                List singletonList = Collections.singletonList(fgp0Var2.b);
                MusicPlaybackLaunchContext musicPlaybackLaunchContext2 = fgp0Var2.g;
                if (musicPlaybackLaunchContext2 == null) {
                    musicPlaybackLaunchContext2 = MusicPlaybackLaunchContext.d;
                }
                u2b0Var2.m1(null, singletonList, musicPlaybackLaunchContext2, (r15 & 8) == 0, new PlaybackActionMeta(6, 0L, 2, null));
            }
        } else if (bVar2.equals(tfp0.b.m.b)) {
            X(fgp0Var2);
        } else if (bVar2.equals(tfp0.b.l.b)) {
            X(fgp0Var2);
        } else if (bVar2.equals(tfp0.b.n.b)) {
            MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint3 = fgp0Var2.c;
            MusicBottomSheetLaunchPoint.Playlist playlist4 = musicBottomSheetLaunchPoint3 instanceof MusicBottomSheetLaunchPoint.Playlist ? (MusicBottomSheetLaunchPoint.Playlist) musicBottomSheetLaunchPoint3 : null;
            if (playlist4 != null && (playlist = playlist4.b) != null) {
                this.p.b(new mc50.j(fgp0Var2.b, playlist));
            }
        } else if (bVar2.equals(tfp0.b.p.b)) {
            this.p.b(mc50.e.a);
        } else if (bVar2.equals(tfp0.b.g.b)) {
            f4z f4zVar2 = this.o;
            f4z f4zVar3 = this.p;
            DownloadingState downloadingState = fgp0Var2.e;
            MusicTrack musicTrack7 = fgp0Var2.b;
            if (epx.f(downloadingState, DownloadingState.NotLoaded.b)) {
                com.vk.core.utils.newtork.b.a.getClass();
                if (com.vk.core.utils.newtork.b.d()) {
                    MusicBottomSheetActionTracker musicBottomSheetActionTracker5 = this.f;
                    if (musicBottomSheetActionTracker5 != null) {
                        musicBottomSheetActionTracker5.b(MusicBottomSheetActionTracker.Action.Download);
                    }
                    if (!this.i.c()) {
                        f4zVar2.b(agp0.a.a);
                        f4zVar3.b(mc50.d.a);
                    } else if (o25.a().i().C) {
                        f4zVar3.b(new mc50.b(musicTrack7));
                    }
                } else {
                    this.q.b(egp0.a.c.b);
                }
            } else if (epx.f(downloadingState, DownloadingState.Downloaded.b) || epx.f(downloadingState, DownloadingState.Corrupted.b)) {
                f4zVar2.b(agp0.a.a);
                f4zVar3.b(new mc50.h(musicTrack7));
            }
        } else if (!bVar2.equals(tfp0.b.o.b)) {
            if (bVar2.equals(tfp0.b.r.b)) {
                wzm0 wzm0Var = fgp0Var2.f;
                wzm0.a aVar = wzm0Var instanceof wzm0.a ? (wzm0.a) wzm0Var : null;
                if (aVar != null) {
                    this.j.M(CommonAudioStat$TypeAudioSourceEnum.TRACK_MENU, new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), CommonAudioStat$TypeAudioTapGotoEventItem.MenuAction.SUBSCRIPTION_MENU);
                    this.o.b(new agp0.f(aVar.b));
                }
            } else if (bVar2.equals(tfp0.b.d.b)) {
                if (jnj.j(fgp0Var2.b.V)) {
                    this.o.b(agp0.e.a);
                } else {
                    u2b0 u2b0Var3 = this.g;
                    List singletonList2 = Collections.singletonList(fgp0Var2.b);
                    MusicPlaybackLaunchContext musicPlaybackLaunchContext3 = fgp0Var2.g;
                    if (musicPlaybackLaunchContext3 == null) {
                        musicPlaybackLaunchContext3 = MusicPlaybackLaunchContext.d;
                    }
                    u2b0Var3.m1(null, singletonList2, musicPlaybackLaunchContext3, (r15 & 8) == 0, new PlaybackActionMeta(6, 0L, 2, null));
                }
            } else {
                if (!bVar2.equals(tfp0.b.s.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.j.N(fgp0Var2.b, CommonAudioStat$TypeAudioSourceEnum.TRACK_MENU);
                com.vk.core.utils.newtork.b.a.getClass();
                if (com.vk.core.utils.newtork.b.d()) {
                    this.o.b(agp0.g.a);
                } else {
                    this.q.b(egp0.a.c.b);
                }
            }
        }
        this.o.b(agp0.a.a);
    }

    public final void U(fgp0 fgp0Var) {
        MusicTrack musicTrack = fgp0Var.b;
        this.j.u(musicTrack.Fb(), CommonAudioStat$TypeAudioSourceEnum.TRACK_MENU);
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            this.q.b(egp0.a.c.b);
            return;
        }
        a630 a630Var = this.h;
        if (a630Var.i(musicTrack)) {
            MusicBottomSheetActionTracker musicBottomSheetActionTracker = this.f;
            if (musicBottomSheetActionTracker != null) {
                musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.AddToMyMusic);
            }
            if (musicTrack.P) {
                itg0.i(7, a630Var.p1(musicTrack, true, false), null, null, null);
            }
            itg0.i(7, a630Var.e1(fgp0Var.b, fgp0Var.g, true).F(new qg60(new k82(27, this, fgp0Var), 17)), null, null, null);
        }
    }

    public final void V(egp0.a aVar, MusicTrack musicTrack) {
        if (!this.e.c) {
            this.q.b(aVar);
            return;
        }
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        r5v0Var.b(new lb50(aVar.a, musicTrack));
    }

    public final void W(fgp0 fgp0Var) {
        MusicBottomSheetActionTracker musicBottomSheetActionTracker = this.f;
        if (musicBottomSheetActionTracker != null) {
            musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.GoToArtists);
        }
        MusicTrack musicTrack = fgp0Var.b;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = fgp0Var.g;
        if (musicPlaybackLaunchContext == null) {
            musicPlaybackLaunchContext = MusicPlaybackLaunchContext.d;
        }
        this.o.b(new agp0.c(musicTrack, musicPlaybackLaunchContext));
    }

    public final void X(fgp0 fgp0Var) {
        io.reactivex.rxjava3.core.q<List<String>> u1 = this.h.u1(fgp0Var.b, true);
        xj50 xj50Var = new xj50(new y5m0(5, this, fgp0Var), 16);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        itg0.i(7, new io.reactivex.rxjava3.internal.operators.observable.a0(u1.E(xj50Var, lVar, kVar, kVar).F(new d120(new uyn0(1, this, fgp0Var), 22)), new hgb(this, 3)), null, null, null);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        d6q0.g(this.m);
    }
}
