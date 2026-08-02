package xsna;

import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioAudioRawIdTrackedDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Genre;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.music.PlaylistPermissions;
import com.vk.dto.music.Thumb;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.playlist.display.data.LoadPlaylistStateValue;
import com.vk.music.playlist.display.domain.AlbumType;
import com.vk.music.playlist.display.domain.LoadPlaylistTracksRequest;
import com.vk.music.playlist.framework.presentation.track.MusicTrackPlayState;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.kbb0;
import xsna.lab0;
import xsna.wzj;

/* compiled from: DisplayMusicPlaylistState.kt */
/* loaded from: classes3.dex */
public final class yfn implements km50 {
    public final l050 A;
    public final int B;
    public final boolean C;
    public final LoadPlaylistStateValue b;
    public final Playlist c;
    public final boolean d;
    public final String e;
    public final Throwable f;
    public final List<AudioArtistDto> g;
    public final GroupsGroupFullDto h;
    public final UsersUserFullDto i;
    public final List<AudioAudioRawIdTrackedDto> j;
    public final MusicTrackPlayState k;
    public final String l;
    public final List<lab0.a> m;
    public final Map<String, MusicTrack> n;
    public final long o;
    public final boolean p;
    public final MusicPlaybackLaunchContext q;
    public final UserId r;
    public final LoadPlaylistTracksRequest s;
    public final UIBlockList t;
    public final boolean u;
    public final boolean v;
    public final Map<String, String> w;
    public final List<UIBlockPlaceholder> x;
    public final h9b0 y;
    public final kbb0 z;

    public yfn(LoadPlaylistStateValue loadPlaylistStateValue, Playlist playlist, boolean z, String str, Throwable th, List<AudioArtistDto> list, GroupsGroupFullDto groupsGroupFullDto, UsersUserFullDto usersUserFullDto, List<AudioAudioRawIdTrackedDto> list2, MusicTrackPlayState musicTrackPlayState, String str2, List<lab0.a> list3, Map<String, MusicTrack> map, long j, boolean z2, MusicPlaybackLaunchContext musicPlaybackLaunchContext, UserId userId, LoadPlaylistTracksRequest loadPlaylistTracksRequest, UIBlockList uIBlockList, boolean z3, boolean z4, Map<String, String> map2, List<UIBlockPlaceholder> list4) {
        wzj c3964b;
        String str3;
        kbb0 kbb0Var;
        ybb0 ybb0Var;
        kbb0 aVar;
        List H0;
        PlaylistPermissions playlistPermissions;
        long c;
        ybb0 ybb0Var2;
        UserId userId2;
        this.b = loadPlaylistStateValue;
        this.c = playlist;
        this.d = z;
        this.e = str;
        this.f = th;
        this.g = list;
        this.h = groupsGroupFullDto;
        this.i = usersUserFullDto;
        this.j = list2;
        this.k = musicTrackPlayState;
        this.l = str2;
        this.m = list3;
        this.n = map;
        this.o = j;
        this.p = z2;
        this.q = musicPlaybackLaunchContext;
        this.r = userId;
        this.s = loadPlaylistTracksRequest;
        this.t = uIBlockList;
        this.u = z3;
        this.v = z4;
        this.w = map2;
        this.x = list4;
        List<Thumb> list5 = playlist.p;
        Thumb thumb = playlist.m;
        if (thumb == null) {
            List<Thumb> list6 = list5;
            c3964b = (list6 == null || list6.isEmpty()) ? wzj.b.a.a : list5.size() == 1 ? new wzj.b.C3964b((Thumb) j5g.Y(list5)) : new wzj.a(j5g.H0(list5, 4));
        } else {
            c3964b = new wzj.b.C3964b(thumb);
        }
        String str4 = playlist.h;
        str3 = "";
        this.y = new h9b0(c3964b, str4 == null ? "" : str4, playlist.J, playlist.k);
        boolean Gb = playlist.Gb();
        String str5 = playlist.i;
        long j2 = playlist.w;
        boolean z5 = false;
        if (Gb) {
            if (j2 == 0) {
                c = -1;
            } else {
                xuo0.a.getClass();
                c = xuo0.c() - j2;
            }
            if (playlist.b < 0) {
                kbb0Var = new kbb0.g(c, str5 != null ? str5 : "");
            } else if (playlist.d == 5) {
                kbb0Var = new kbb0.c(playlist.u, c, str5 != null ? str5 : "");
            } else {
                int i = playlist.u;
                PlaylistLink playlistLink = playlist.f;
                if (fkq0.b((playlistLink == null || (userId2 = playlistLink.c) == null) ? playlist.c : userId2)) {
                    String V1 = (groupsGroupFullDto == null || (V1 = groupsGroupFullDto.R1()) == null) ? groupsGroupFullDto != null ? groupsGroupFullDto.V1() : null : V1;
                    r14 = groupsGroupFullDto != null ? groupsGroupFullDto.y1() : null;
                    ybb0Var2 = new ybb0(V1, r14 != null ? r14 : "");
                } else {
                    String r2 = (usersUserFullDto == null || (r2 = usersUserFullDto.o2()) == null) ? usersUserFullDto != null ? usersUserFullDto.r2() : null : r2;
                    String D0 = usersUserFullDto != null ? usersUserFullDto.D0() : null;
                    String x1 = usersUserFullDto != null ? usersUserFullDto.x1() : null;
                    if (D0 != null && x1 != null) {
                        r14 = v1v.a(' ', D0, x1);
                    }
                    ybb0Var2 = new ybb0(r2, r14 != null ? r14 : "");
                }
                aVar = new kbb0.f(i, c, jnj.i(playlist.O) && !z, ybb0Var2, playlist.f == null && epx.f(playlist.c, userId), playlist.J);
                kbb0Var = aVar;
            }
        } else if (playlist.Eb()) {
            int i2 = playlist.u;
            AlbumType albumType = AlbumType.ALBUM;
            int i3 = playlist.l;
            List<Genre> list7 = playlist.n;
            if (list7 != null && (H0 = j5g.H0(list7, 3)) != null) {
                r14 = j5g.g0(H0, null, null, null, 0, new b40(16), 31);
            }
            r14 = r14 == null ? "" : r14;
            if (list.isEmpty()) {
                List<Artist> list8 = playlist.r;
                if (list8 != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list8.iterator();
                    while (it.hasNext()) {
                        String str6 = ((Artist) it.next()).c;
                        if (str6 != null) {
                            arrayList.add(str6);
                        }
                    }
                    String g0 = j5g.g0(arrayList, ", ", null, null, 0, null, 62);
                    if (g0 != null) {
                        str3 = g0;
                    }
                }
                ybb0Var = new ybb0(str3, 1);
            } else {
                ybb0Var = new ybb0(j5g.g0(list, ", ", null, null, 0, new com.vk.movika.sdk.base.observable.e0(19), 30), 1);
            }
            aVar = new kbb0.a(jnj.i(playlist.O) && !z, i2, albumType, i3, r14, ybb0Var, playlist.M);
            kbb0Var = aVar;
        } else {
            kbb0Var = kbb0.d.a;
        }
        this.z = kbb0Var;
        MusicTrackPlayState musicTrackPlayState2 = this.k;
        boolean z6 = this.p;
        PlaylistPermissions playlistPermissions2 = this.c.B;
        boolean z7 = (playlistPermissions2 != null ? playlistPermissions2.b : false) && !this.j.isEmpty();
        boolean v = xx1.v(this.c);
        boolean b = xx1.b(this.c);
        Playlist playlist2 = this.c;
        boolean z8 = (jnj.f(playlist2.O) || (playlistPermissions = playlist2.B) == null) ? false : playlistPermissions.h;
        boolean e = xx1.e(xx1.m(this.c));
        Playlist playlist3 = this.c;
        if (!playlist3.Fb() && playlist3.v > 0 && !xx1.x(playlist3) && !xx1.u(playlist3)) {
            z5 = true;
        }
        this.A = new l050(musicTrackPlayState2, z6, z7, e, v, b, z8, z5, di40.a(this.c.H), this.c.Eb(), this.v, jnj.d(this.c.O), true ^ this.j.isEmpty());
        this.B = this.j.size();
        this.C = jnj.f(this.c.O);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yfn a(yfn yfnVar, LoadPlaylistStateValue loadPlaylistStateValue, Playlist playlist, Throwable th, List list, GroupsGroupFullDto groupsGroupFullDto, UsersUserFullDto usersUserFullDto, List list2, MusicTrackPlayState musicTrackPlayState, String str, List list3, Map map, long j, boolean z, LoadPlaylistTracksRequest loadPlaylistTracksRequest, UIBlockList uIBlockList, boolean z2, Map map2, ArrayList arrayList, int i) {
        LoadPlaylistStateValue loadPlaylistStateValue2 = (i & 1) != 0 ? yfnVar.b : loadPlaylistStateValue;
        Playlist playlist2 = (i & 2) != 0 ? yfnVar.c : playlist;
        boolean z3 = yfnVar.d;
        String str2 = yfnVar.e;
        Throwable th2 = (i & 16) != 0 ? yfnVar.f : th;
        List list4 = (i & 32) != 0 ? yfnVar.g : list;
        GroupsGroupFullDto groupsGroupFullDto2 = (i & 64) != 0 ? yfnVar.h : groupsGroupFullDto;
        UsersUserFullDto usersUserFullDto2 = (i & 128) != 0 ? yfnVar.i : usersUserFullDto;
        List list5 = (i & 256) != 0 ? yfnVar.j : list2;
        MusicTrackPlayState musicTrackPlayState2 = (i & 512) != 0 ? yfnVar.k : musicTrackPlayState;
        String str3 = (i & 1024) != 0 ? yfnVar.l : str;
        List list6 = (i & 2048) != 0 ? yfnVar.m : list3;
        Map map3 = (i & 4096) != 0 ? yfnVar.n : map;
        long j2 = (i & 8192) != 0 ? yfnVar.o : j;
        boolean z4 = (i & 16384) != 0 ? yfnVar.p : z;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = yfnVar.q;
        UserId userId = yfnVar.r;
        LoadPlaylistTracksRequest loadPlaylistTracksRequest2 = (i & 131072) != 0 ? yfnVar.s : loadPlaylistTracksRequest;
        UIBlockList uIBlockList2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? yfnVar.t : uIBlockList;
        boolean z5 = (i & 524288) != 0 ? yfnVar.u : z2;
        boolean z6 = yfnVar.v;
        Map map4 = (i & 2097152) != 0 ? yfnVar.w : map2;
        List list7 = (i & 4194304) != 0 ? yfnVar.x : arrayList;
        yfnVar.getClass();
        return new yfn(loadPlaylistStateValue2, playlist2, z3, str2, th2, list4, groupsGroupFullDto2, usersUserFullDto2, list5, musicTrackPlayState2, str3, list6, map3, j2, z4, musicPlaybackLaunchContext, userId, loadPlaylistTracksRequest2, uIBlockList2, z5, z6, map4, list7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfn)) {
            return false;
        }
        yfn yfnVar = (yfn) obj;
        return this.b == yfnVar.b && epx.f(this.c, yfnVar.c) && this.d == yfnVar.d && epx.f(this.e, yfnVar.e) && epx.f(this.f, yfnVar.f) && epx.f(this.g, yfnVar.g) && epx.f(this.h, yfnVar.h) && epx.f(this.i, yfnVar.i) && epx.f(this.j, yfnVar.j) && this.k == yfnVar.k && epx.f(this.l, yfnVar.l) && epx.f(this.m, yfnVar.m) && epx.f(this.n, yfnVar.n) && this.o == yfnVar.o && this.p == yfnVar.p && epx.f(this.q, yfnVar.q) && epx.f(this.r, yfnVar.r) && epx.f(this.s, yfnVar.s) && epx.f(this.t, yfnVar.t) && this.u == yfnVar.u && this.v == yfnVar.v && epx.f(this.w, yfnVar.w) && epx.f(this.x, yfnVar.x);
    }

    public final int hashCode() {
        int a = urd0.a(qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
        Throwable th = this.f;
        int a2 = fw3.a((a + (th == null ? 0 : th.hashCode())) * 31, 31, this.g);
        GroupsGroupFullDto groupsGroupFullDto = this.h;
        int hashCode = (a2 + (groupsGroupFullDto == null ? 0 : groupsGroupFullDto.hashCode())) * 31;
        UsersUserFullDto usersUserFullDto = this.i;
        int hashCode2 = (this.k.hashCode() + fw3.a((hashCode + (usersUserFullDto == null ? 0 : usersUserFullDto.hashCode())) * 31, 31, this.j)) * 31;
        String str = this.l;
        int b = qoy.b(bh10.a(v11.a(fw3.a((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.q;
        int hashCode3 = (this.s.hashCode() + bh10.a((b + (musicPlaybackLaunchContext == null ? 0 : musicPlaybackLaunchContext.b.hashCode())) * 31, 31, this.r.b)) * 31;
        UIBlockList uIBlockList = this.t;
        return this.x.hashCode() + v11.a(qoy.b(qoy.b((hashCode3 + (uIBlockList != null ? uIBlockList.hashCode() : 0)) * 31, 31, this.u), 31, this.v), 31, this.w);
    }

    public final String toString() {
        return "DisplayMusicPlaylistState(loadState=" + this.b + ", playlistId=" + this.c.Ib() + ", metadata=" + this.z + ", buttons=" + this.A + ", trackIds=" + this.j.size() + ", playState=" + this.k + ", playingTrackMid=" + this.l + ", tracks=" + this.m.size() + ", duration=" + this.o + ", isShuffleOn=" + this.p + ", refer=" + this.q + ", currentUserId=" + this.r + ", activeRequest=" + this.s + ", hasActionsForBottomSheet=" + this.u + "), isKidsModeEnabled=" + this.v;
    }
}
