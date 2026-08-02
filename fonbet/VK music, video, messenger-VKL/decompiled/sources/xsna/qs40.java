package xsna;

import android.os.SystemClock;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.newsfeed.posting.music_picker.domain.model.SnippetOnboardingState;
import com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.fu40;
import xsna.lr40;
import xsna.su40;

/* compiled from: MusicPickerFeature.kt */
/* loaded from: classes4.dex */
public final class qs40 extends wk50<xu40, MusicPickerState, lr40, fu40> {
    public final wj50<su40> f;
    public final tp4 g;
    public final w0b0 h;
    public final a i;
    public final io.reactivex.rxjava3.subjects.f<String> j;

    /* compiled from: MusicPickerFeature.kt */
    public static final class a extends juq<fu40, lr40, su40> {
        public final qs40 a;

        public a(qs40 qs40Var) {
            this.a = qs40Var;
        }

        @Override // xsna.juq
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(fu40 fu40Var) {
            this.a.T(fu40Var);
        }
    }

    public qs40(qu40 qu40Var, lr40.b bVar, f4z f4zVar, k7y k7yVar) {
        super(bVar, qu40Var);
        this.f = f4zVar;
        this.g = new tp4(new pn0(3));
        this.h = new w0b0(new yo20(1, this, qs40.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 2), k7yVar);
        a aVar = new a(this);
        this.i = aVar;
        io.reactivex.rxjava3.subjects.f<String> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.j = fVar;
        aVar.a.e.b(fVar.y(300L, TimeUnit.MILLISECONDS).subscribe(new n1r(new dxh(this, 29), 7)));
    }

    public static String V(MusicPickerList musicPickerList) {
        boolean z = musicPickerList instanceof MusicPickerList.Tracks;
        return !(z ? ((MusicPickerList.Tracks) musicPickerList).h : musicPickerList instanceof MusicPickerList.Playlists ? ((MusicPickerList.Playlists) musicPickerList).h : false) ? "" : z ? ((MusicPickerList.Tracks) musicPickerList).c : musicPickerList instanceof MusicPickerList.Playlists ? ((MusicPickerList.Playlists) musicPickerList).c : "";
    }

    public static void Y(qs40 qs40Var, MusicPickerState musicPickerState, MusicPickerList musicPickerList, UserId userId, int i, String str, Playlist playlist, int i2) {
        UserId userId2;
        UserId userId3 = (i2 & 4) != 0 ? musicPickerState.i : userId;
        int i3 = (i2 & 8) != 0 ? 0 : i;
        String str2 = (i2 & 16) != 0 ? "" : str;
        Playlist playlist2 = (i2 & 32) != 0 ? null : playlist;
        if (i3 == 0) {
            qs40Var.T(new wt40(musicPickerList, playlist2));
        } else {
            qs40Var.T(new au40(musicPickerList, playlist2));
        }
        if (playlist2 != null) {
            qs40Var.T(new xt40(false));
        }
        tp4 tp4Var = qs40Var.g;
        if (playlist2 == null || (userId2 = playlist2.c) == null) {
            userId2 = userId3;
        }
        Playlist playlist3 = playlist2;
        qs40Var.i.a.e.b(tp4Var.a(userId2, str2, playlist3, i3, true).subscribe(new cl30(new he3(29, qs40Var, musicPickerList), 1), new skz(new acb(i3, qs40Var, musicPickerState, musicPickerList, userId3, str2, playlist3), 6)));
    }

    @Override // xsna.wk50
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void N(MusicPickerState musicPickerState, lr40 lr40Var) {
        SnippetOnboardingState snippetOnboardingState = musicPickerState.p;
        MusicDto musicDto = musicPickerState.g;
        boolean z = musicPickerState.h;
        boolean z2 = musicPickerState.n;
        PickerTechMetrics pickerTechMetrics = musicPickerState.b;
        List<MusicDto> list = musicPickerState.f;
        List<MusicPickerList> list2 = musicPickerState.j;
        if (lr40Var instanceof lr40.b) {
            MusicPickerList musicPickerList = (MusicPickerList) j5g.k0(list2);
            if (musicPickerList != null) {
                Y(this, musicPickerState, musicPickerList, null, 0, null, null, 52);
                return;
            }
            return;
        }
        boolean z3 = lr40Var instanceof gs40;
        wj50<su40> wj50Var = this.f;
        boolean z4 = false;
        if (z3) {
            gs40 gs40Var = (gs40) lr40Var;
            MusicTrack musicTrack = gs40Var.b;
            List<MusicDto> list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (s1v.m((MusicDto) it.next(), musicTrack)) {
                        z4 = true;
                        break;
                    }
                }
            }
            if (z && musicDto != null && gs40Var.c) {
                wj50Var.b(new su40.a.b(musicTrack));
                return;
            }
            if (z && !z4) {
                int size = list.size() + 1;
                int i = musicPickerState.c;
                if (size > i) {
                    wj50Var.b(new su40.a.c(i));
                    return;
                }
            }
            T(new ku40(musicTrack));
            if (z2 && snippetOnboardingState == SnippetOnboardingState.BOTTOM_SHEET) {
                wj50Var.b(new su40.b.d(true, Collections.singletonList(jq4.b(musicTrack))));
                T(du40.b);
                return;
            }
            return;
        }
        if (lr40Var instanceof fs40) {
            T(new ju40(((fs40) lr40Var).b));
            return;
        }
        r14 = null;
        MusicDto musicDto2 = null;
        if (lr40Var instanceof lr40.a) {
            lr40.a aVar = (lr40.a) lr40Var;
            if (aVar.b && !list.isEmpty() && z) {
                z4 = true;
            }
            Object k0 = j5g.k0(list2);
            MusicPickerList.SelectedPlaylist selectedPlaylist = k0 instanceof MusicPickerList.SelectedPlaylist ? (MusicPickerList.SelectedPlaylist) k0 : null;
            if (aVar.c) {
                wj50Var.b(su40.a.d.a);
                return;
            }
            if (z4 && selectedPlaylist != null) {
                wj50Var.b(new su40.a.C3689a(selectedPlaylist.c));
                return;
            } else {
                if (selectedPlaylist != null) {
                    Z(new su40.b.C3690b(selectedPlaylist.c, pickerTechMetrics));
                    return;
                }
                return;
            }
        }
        if (lr40Var instanceof lr40.c) {
            T(fu40.b.b);
            return;
        }
        if (lr40Var instanceof sr40) {
            sr40 sr40Var = (sr40) lr40Var;
            MusicPickerList.SelectedPlaylist selectedPlaylist2 = new MusicPickerList.SelectedPlaylist(null, sr40Var.b, null, null, 0, 0, 61, null);
            T(new com.vk.newsfeed.posting.music_picker.domain.model.a(selectedPlaylist2));
            Playlist playlist = sr40Var.b;
            Y(this, musicPickerState, selectedPlaylist2, playlist.c, 0, null, playlist, 24);
            return;
        }
        if (lr40Var instanceof tr40) {
            MusicPickerList.Playlists playlists = new MusicPickerList.Playlists(null, null, null, null, 0, 0, false, 127, null);
            T(new com.vk.newsfeed.posting.music_picker.domain.model.b(playlists));
            X(musicPickerState, playlists, 0, "");
            return;
        }
        if (lr40Var instanceof nr40) {
            Iterator<T> it2 = list2.iterator();
            if (it2.hasNext()) {
                ((MusicPickerList) it2.next()).getClass();
                throw null;
            }
            return;
        }
        if (lr40Var instanceof or40) {
            MusicPickerList musicPickerList2 = (MusicPickerList) j5g.k0(list2);
            if ((musicPickerList2 != null ? musicPickerList2.l7() : null) != MusicPickerLoadingState.Loading) {
                if ((musicPickerList2 != null ? musicPickerList2.l7() : null) != MusicPickerLoadingState.NextPageLoading) {
                    if (musicPickerList2 instanceof MusicPickerList.Tracks) {
                        MusicPickerList.Tracks tracks = (MusicPickerList.Tracks) musicPickerList2;
                        Y(this, musicPickerState, musicPickerList2, null, 0, tracks.h ? tracks.c : "", null, 36);
                        return;
                    } else if (musicPickerList2 instanceof MusicPickerList.SelectedPlaylist) {
                        MusicPickerList.SelectedPlaylist selectedPlaylist3 = (MusicPickerList.SelectedPlaylist) musicPickerList2;
                        Playlist playlist2 = selectedPlaylist3.c;
                        Y(this, musicPickerState, selectedPlaylist3, playlist2.c, 0, null, playlist2, 16);
                        return;
                    } else {
                        if (musicPickerList2 instanceof MusicPickerList.Playlists) {
                            MusicPickerList.Playlists playlists2 = (MusicPickerList.Playlists) musicPickerList2;
                            X(musicPickerState, musicPickerList2, 0, playlists2.h ? playlists2.c : "");
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (lr40Var instanceof pr40) {
            W(musicPickerState);
            return;
        }
        if (lr40Var instanceof mr40) {
            W(musicPickerState);
            return;
        }
        if (lr40Var instanceof rr40) {
            MusicPickerList musicPickerList3 = (MusicPickerList) j5g.k0(list2);
            if (musicPickerList3 != null) {
                if (musicPickerList3 instanceof MusicPickerList.Tracks) {
                    z4 = ((MusicPickerList.Tracks) musicPickerList3).h;
                } else if (musicPickerList3 instanceof MusicPickerList.Playlists) {
                    z4 = ((MusicPickerList.Playlists) musicPickerList3).h;
                }
                if (z4) {
                    N(musicPickerState, as40.b);
                    return;
                }
            }
            if (list2.size() == 1) {
                Z(new su40.b.a(pickerTechMetrics));
                return;
            } else {
                T(bu40.b);
                return;
            }
        }
        boolean z5 = lr40Var instanceof qr40;
        a aVar2 = this.i;
        if (z5) {
            aVar2.a(new mu40(SystemClock.elapsedRealtime()));
            if (list.size() == 1 && z2) {
                musicDto2 = MusicDto.a((MusicDto) j5g.Y(list), true, null, null, 15359);
            }
            Z(new su40.b.c(musicDto, musicDto2, list, pickerTechMetrics));
            return;
        }
        if (lr40Var instanceof vr40) {
            Z(new su40.b.e(list));
            return;
        }
        if (lr40Var instanceof ur40) {
            Z(new su40.b.d(z2, list));
            return;
        }
        if (lr40Var instanceof es40) {
            aVar2.a(new iu40(((es40) lr40Var).b));
            return;
        }
        if (lr40Var instanceof cs40) {
            T(fu40.c.C2894c.b);
            return;
        }
        if (lr40Var instanceof as40) {
            T(fu40.c.a.b);
            T(fu40.c.b.b);
            return;
        }
        if (lr40Var instanceof ds40) {
            MusicPickerList musicPickerList4 = (MusicPickerList) j5g.k0(list2);
            if (musicPickerList4 != null) {
                String V = V(musicPickerList4);
                String str = ((ds40) lr40Var).b;
                if (epx.f(V, str)) {
                    return;
                }
                T(new fu40.c.d(str));
                this.j.onNext(str);
                return;
            }
            return;
        }
        if (lr40Var instanceof bs40) {
            MusicPickerList musicPickerList5 = (MusicPickerList) j5g.k0(list2);
            if (musicPickerList5 instanceof MusicPickerList.SelectedPlaylist) {
                return;
            }
            if (musicPickerList5 instanceof MusicPickerList.Playlists) {
                if (((MusicPickerList.Playlists) musicPickerList5).h) {
                    X(musicPickerState, (MusicPickerList.Playlists) musicPickerList5, 0, V(musicPickerList5));
                    return;
                }
                return;
            } else {
                if ((musicPickerList5 instanceof MusicPickerList.Tracks) && ((MusicPickerList.Tracks) musicPickerList5).h) {
                    Y(this, musicPickerState, musicPickerList5, null, 0, V(musicPickerList5), null, 44);
                    return;
                }
                return;
            }
        }
        if (lr40Var instanceof yr40) {
            MusicTrack musicTrack2 = ((yr40) lr40Var).b;
            w0b0 w0b0Var = this.h;
            u2b0 u2b0Var = w0b0Var.d;
            MusicTrack b = u2b0Var.b();
            if (epx.f(b != null ? b.Ib() : null, musicTrack2 != null ? musicTrack2.Ib() : null)) {
                u2b0Var.pause(6);
                return;
            } else {
                w0b0Var.c.invoke();
                u2b0Var.N0(new lqk0((StartPlaySource) null, musicTrack2, (List) null, (MusicPlaybackLaunchContext) null, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT));
                return;
            }
        }
        if (lr40Var instanceof zr40) {
            zr40 zr40Var = (zr40) lr40Var;
            aVar2.a(new gu40(zr40Var.b, zr40Var.c));
            return;
        }
        if (lr40Var instanceof ks40) {
            aVar2.a.Z(uu40.a);
            return;
        }
        if (lr40Var instanceof hs40) {
            aVar2.a(new lu40(((hs40) lr40Var).b));
            return;
        }
        if (lr40Var instanceof is40) {
            aVar2.a(new mu40(((is40) lr40Var).b));
            return;
        }
        if (lr40Var instanceof js40) {
            aVar2.a.Z(new vu40(pickerTechMetrics));
            return;
        }
        if (lr40Var instanceof xr40) {
            T(eu40.b);
        } else {
            if (!(lr40Var instanceof wr40)) {
                throw new NoWhenBranchMatchedException();
            }
            if (snippetOnboardingState == SnippetOnboardingState.TOOLTIP) {
                aVar2.a.Z(tu40.a);
                T(cu40.b);
            }
        }
    }

    public final void W(MusicPickerState musicPickerState) {
        MusicPickerList.Playlists playlists;
        int i;
        MusicPickerList musicPickerList = (MusicPickerList) j5g.k0(musicPickerState.j);
        if ((musicPickerList != null ? musicPickerList.l7() : null) != MusicPickerLoadingState.Loading) {
            if ((musicPickerList != null ? musicPickerList.l7() : null) != MusicPickerLoadingState.NextPageLoading) {
                if (musicPickerList instanceof MusicPickerList.Tracks) {
                    MusicPickerList.Tracks tracks = (MusicPickerList.Tracks) musicPickerList;
                    String str = tracks.h ? tracks.c : "";
                    int i2 = tracks.f;
                    if (i2 <= tracks.g) {
                        Y(this, musicPickerState, tracks, null, i2, str, null, 36);
                        return;
                    }
                    return;
                }
                if (!(musicPickerList instanceof MusicPickerList.SelectedPlaylist)) {
                    if (!(musicPickerList instanceof MusicPickerList.Playlists) || (i = (playlists = (MusicPickerList.Playlists) musicPickerList).f) > playlists.g) {
                        return;
                    }
                    X(musicPickerState, playlists, i, playlists.h ? playlists.c : "");
                    return;
                }
                MusicPickerList.SelectedPlaylist selectedPlaylist = (MusicPickerList.SelectedPlaylist) musicPickerList;
                int i3 = selectedPlaylist.f;
                if (i3 <= selectedPlaylist.g) {
                    Playlist playlist = selectedPlaylist.c;
                    Y(this, musicPickerState, selectedPlaylist, playlist.c, i3, null, playlist, 16);
                }
            }
        }
    }

    public final void X(MusicPickerState musicPickerState, MusicPickerList musicPickerList, int i, String str) {
        xy2 xy2Var;
        if (i == 0) {
            T(new vt40(musicPickerList));
        } else {
            T(new zt40(musicPickerList));
        }
        UserId userId = musicPickerState.i;
        pn0 pn0Var = this.g.a;
        if (str.length() > 0) {
            tfx tfxVar = new tfx("audio.searchPlaylists", new lr(6), new pn(4));
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
            tfx tfxVar2 = tfxVar;
            tfx.l(tfxVar2, SignalingProtocol.KEY_OFFSET, i, 0, 0, 8);
            tfxVar2.f(50, 0, 100, "count");
            tfxVar2.j("extended", true);
            xy2Var = tfxVar2;
        } else {
            xy2Var = hx4.t(new ix4(), userId, 50, Integer.valueOf(i), null, 466);
        }
        this.i.a.e.b(rsg0.T(yfb.x(xy2Var)).U(new l960(new d630(pn0Var, i, 1), 7)).subscribe(new bdz(new kp5(17, this, musicPickerList), 6), new m1r(new ps40(i, this, musicPickerList), 9)));
    }

    public final void Z(su40 su40Var) {
        this.f.b(su40Var);
    }
}
