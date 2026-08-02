package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.reactions.Reaction;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.domain.state.LyricsScrollMode;
import com.vk.music.stickyplayer.domain.PlayerUiMode;
import com.vk.music.stickyplayer.domain.lyrics.TabLyricsMode;
import com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: MusicPlayerState.kt */
/* loaded from: classes3.dex */
public final class sy40 implements km50 {
    public final Map<MusicTrack, Reaction> A;
    public final boolean B;
    public final boolean C;
    public final lac D;
    public final PlayerUiMode b;
    public final long c;
    public final PlayerTrack d;
    public final dy40 e;
    public final List<PlayerTrack> f;
    public final List<String> g;
    public final boolean h;
    public final boolean i;
    public final LoopMode j;
    public final int k;
    public volatile int l;
    public volatile int m;
    public final DownloadingState n;
    public final LyricsScrollMode o;
    public final TabLyricsMode p;
    public final da00 q;
    public final boolean r;
    public final AdvertisementInfo s;
    public final StartPlaySource t;
    public final boolean u;
    public final boolean v;
    public final OnboardingStrategy w;
    public final String x;
    public final float y;
    public final boolean z;

    public sy40() {
        throw null;
    }

    public sy40(PlayerUiMode playerUiMode, long j, PlayerTrack playerTrack, dy40 dy40Var, List list, List list2, boolean z, boolean z2, LoopMode loopMode, int i, int i2, int i3, DownloadingState downloadingState, LyricsScrollMode lyricsScrollMode, TabLyricsMode tabLyricsMode, da00 da00Var, boolean z3, AdvertisementInfo advertisementInfo, StartPlaySource startPlaySource, boolean z4, boolean z5, OnboardingStrategy onboardingStrategy, String str, float f, boolean z6, Map map, boolean z7, boolean z8, lac lacVar) {
        this.b = playerUiMode;
        this.c = j;
        this.d = playerTrack;
        this.e = dy40Var;
        this.f = list;
        this.g = list2;
        this.h = z;
        this.i = z2;
        this.j = loopMode;
        this.k = i;
        this.l = i2;
        this.m = i3;
        this.n = downloadingState;
        this.o = lyricsScrollMode;
        this.p = tabLyricsMode;
        this.q = da00Var;
        this.r = z3;
        this.s = advertisementInfo;
        this.t = startPlaySource;
        this.u = z4;
        this.v = z5;
        this.w = onboardingStrategy;
        this.x = str;
        this.y = f;
        this.z = z6;
        this.A = map;
        this.B = z7;
        this.C = z8;
        this.D = lacVar;
    }

    public static sy40 a(sy40 sy40Var, PlayerUiMode playerUiMode, long j, PlayerTrack playerTrack, dy40 dy40Var, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2, LoopMode loopMode, int i, int i2, int i3, DownloadingState downloadingState, LyricsScrollMode lyricsScrollMode, TabLyricsMode tabLyricsMode, da00 da00Var, boolean z3, AdvertisementInfo advertisementInfo, StartPlaySource startPlaySource, boolean z4, boolean z5, OnboardingStrategy onboardingStrategy, String str, float f, boolean z6, LinkedHashMap linkedHashMap, boolean z7, boolean z8, lac lacVar, int i4) {
        PlayerUiMode playerUiMode2 = (i4 & 1) != 0 ? sy40Var.b : playerUiMode;
        long j2 = (i4 & 2) != 0 ? sy40Var.c : j;
        PlayerTrack playerTrack2 = (i4 & 4) != 0 ? sy40Var.d : playerTrack;
        dy40 dy40Var2 = (i4 & 8) != 0 ? sy40Var.e : dy40Var;
        List<PlayerTrack> list = (i4 & 16) != 0 ? sy40Var.f : arrayList;
        List<String> list2 = (i4 & 32) != 0 ? sy40Var.g : arrayList2;
        boolean z9 = (i4 & 64) != 0 ? sy40Var.h : z;
        boolean z10 = (i4 & 128) != 0 ? sy40Var.i : z2;
        LoopMode loopMode2 = (i4 & 256) != 0 ? sy40Var.j : loopMode;
        int i5 = (i4 & 512) != 0 ? sy40Var.k : i;
        int i6 = (i4 & 1024) != 0 ? sy40Var.l : i2;
        int i7 = (i4 & 2048) != 0 ? sy40Var.m : i3;
        DownloadingState downloadingState2 = (i4 & 4096) != 0 ? sy40Var.n : downloadingState;
        PlayerUiMode playerUiMode3 = playerUiMode2;
        LyricsScrollMode lyricsScrollMode2 = (i4 & 8192) != 0 ? sy40Var.o : lyricsScrollMode;
        TabLyricsMode tabLyricsMode2 = (i4 & 16384) != 0 ? sy40Var.p : tabLyricsMode;
        da00 da00Var2 = (i4 & 32768) != 0 ? sy40Var.q : da00Var;
        boolean z11 = (i4 & 65536) != 0 ? sy40Var.r : z3;
        AdvertisementInfo advertisementInfo2 = (i4 & 131072) != 0 ? sy40Var.s : advertisementInfo;
        StartPlaySource startPlaySource2 = (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? sy40Var.t : startPlaySource;
        boolean z12 = (i4 & 524288) != 0 ? sy40Var.u : z4;
        boolean z13 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? sy40Var.v : z5;
        OnboardingStrategy onboardingStrategy2 = (i4 & 2097152) != 0 ? sy40Var.w : onboardingStrategy;
        String str2 = (i4 & 4194304) != 0 ? sy40Var.x : str;
        float f2 = (i4 & 8388608) != 0 ? sy40Var.y : f;
        boolean z14 = (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? sy40Var.z : z6;
        Map<MusicTrack, Reaction> map = (i4 & 33554432) != 0 ? sy40Var.A : linkedHashMap;
        boolean z15 = (i4 & 67108864) != 0 ? sy40Var.B : z7;
        boolean z16 = (i4 & 134217728) != 0 ? sy40Var.C : z8;
        lac lacVar2 = (i4 & 268435456) != 0 ? sy40Var.D : lacVar;
        sy40Var.getClass();
        return new sy40(playerUiMode3, j2, playerTrack2, dy40Var2, list, list2, z9, z10, loopMode2, i5, i6, i7, downloadingState2, lyricsScrollMode2, tabLyricsMode2, da00Var2, z11, advertisementInfo2, startPlaySource2, z12, z13, onboardingStrategy2, str2, f2, z14, map, z15, z16, lacVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy40)) {
            return false;
        }
        sy40 sy40Var = (sy40) obj;
        return this.b == sy40Var.b && l5g.d(this.c, sy40Var.c) && epx.f(this.d, sy40Var.d) && epx.f(this.e, sy40Var.e) && epx.f(this.f, sy40Var.f) && epx.f(this.g, sy40Var.g) && this.h == sy40Var.h && this.i == sy40Var.i && this.j == sy40Var.j && this.k == sy40Var.k && this.l == sy40Var.l && this.m == sy40Var.m && epx.f(this.n, sy40Var.n) && this.o == sy40Var.o && this.p == sy40Var.p && epx.f(this.q, sy40Var.q) && this.r == sy40Var.r && epx.f(this.s, sy40Var.s) && epx.f(this.t, sy40Var.t) && this.u == sy40Var.u && this.v == sy40Var.v && this.w == sy40Var.w && epx.f(this.x, sy40Var.x) && Float.compare(this.y, sy40Var.y) == 0 && this.z == sy40Var.z && epx.f(this.A, sy40Var.A) && this.B == sy40Var.B && this.C == sy40Var.C && epx.f(this.D, sy40Var.D);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        long j = this.c;
        int i = l5g.l;
        int a = bh10.a(hashCode, 31, j);
        PlayerTrack playerTrack = this.d;
        int b = qoy.b((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + shy.a(this.m, shy.a(this.l, shy.a(this.k, (this.j.hashCode() + qoy.b(qoy.b(fw3.a(fw3.a((this.e.hashCode() + ((a + (playerTrack == null ? 0 : playerTrack.hashCode())) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31, 31), 31), 31)) * 31)) * 31)) * 31)) * 31, 31, this.r);
        AdvertisementInfo advertisementInfo = this.s;
        int hashCode2 = (b + (advertisementInfo == null ? 0 : advertisementInfo.hashCode())) * 31;
        StartPlaySource startPlaySource = this.t;
        int hashCode3 = (this.w.hashCode() + qoy.b(qoy.b((hashCode2 + (startPlaySource == null ? 0 : startPlaySource.hashCode())) * 31, 31, this.u), 31, this.v)) * 31;
        String str = this.x;
        int b2 = qoy.b(qoy.b(v11.a(qoy.b(io.reactivex.rxjava3.subjects.b.a(this.y, (hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.z), 31, this.A), 31, this.B), 31, this.C);
        lac lacVar = this.D;
        return b2 + (lacVar != null ? lacVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicPlayerState(playerUiMode=");
        sb.append(this.b);
        sb.append(", accentColor=");
        dn.h(this.c, ", currentTrack=", sb);
        sb.append(this.d);
        sb.append(", permissions=");
        sb.append(this.e);
        sb.append(", isPlaying=");
        sb.append(this.h);
        sb.append(", isShuffleOn=");
        sb.append(this.i);
        sb.append(", loopMode=");
        sb.append(this.j);
        sb.append(", durationSec=");
        sb.append(this.k);
        sb.append(", playPositionSec=");
        sb.append(this.l);
        sb.append(", bufferingProgress=");
        sb.append(this.m);
        sb.append(", tracklistNotLoadedSize=");
        sb.append(this.g.size());
        sb.append(", downloadingState=");
        sb.append(this.n);
        sb.append(", isTracksSaveAsPlaylistInProgress=");
        sb.append(this.r);
        sb.append(", source=");
        sb.append(this.t);
        sb.append(", trackMixLoadingInfo=");
        sb.append(this.u);
        sb.append(", isOnboardingAnimationPlaying=");
        sb.append(this.v);
        sb.append(", onboardingStrategy=");
        sb.append(this.w);
        sb.append(", audioOutput=");
        sb.append(this.x);
        sb.append(", advertisementInfo=");
        sb.append(this.s);
        sb.append(")playbackSpeed=");
        sb.append(this.y);
        sb.append(")isSleepTimerTicking=");
        sb.append(this.z);
        sb.append(")reactions=");
        sb.append(this.A);
        sb.append(")isKidsModeEnabled=");
        sb.append(this.B);
        sb.append("isInformerVisible=");
        sb.append(this.C);
        sb.append("concertChip=");
        sb.append(this.D);
        return sb.toString();
    }
}
