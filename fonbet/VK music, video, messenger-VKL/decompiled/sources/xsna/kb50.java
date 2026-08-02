package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.music.offline.api.model.CorruptedReason;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import java.util.List;

/* compiled from: MusicTrackEntity.kt */
/* loaded from: classes3.dex */
public final class kb50 {
    public final int a;
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final DownloadingState f;
    public final String g;
    public final String h;
    public final String i;
    public final List<Artist> j;
    public final List<Artist> k;
    public final Thumb l;
    public final MusicOfflineCacheStorage m;
    public final String n;
    public final String o;
    public final CorruptedReason p;
    public final Long q;
    public final Long r;
    public final boolean s;
    public final Integer t;
    public final Boolean u;
    public final String v;
    public final int w;
    public final String x;
    public final String y;

    /* compiled from: MusicTrackEntity.kt */
    public static final class a {
        public static kb50 a(UserId userId, MusicTrack musicTrack, boolean z, MusicOfflineCacheStorage musicOfflineCacheStorage, String str, CorruptedReason corruptedReason, int i, int i2) {
            return new kb50((i2 & 64) != 0 ? 0 : i, userId, musicTrack.Fb(), musicTrack.r, musicTrack.y, (i2 & 4) != 0 ? true : z ? musicTrack.J : DownloadingState.NotLoaded.b, musicTrack.d, musicTrack.e, musicTrack.h, musicTrack.t, musicTrack.u, musicTrack.Jb(), (i2 & 8) != 0 ? null : musicOfflineCacheStorage, musicTrack.i, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : corruptedReason, Long.valueOf(musicTrack.f), Long.valueOf(musicTrack.z), musicTrack.s, Integer.valueOf(musicTrack.n), Boolean.valueOf(musicTrack.B), musicTrack.S, musicTrack.g, musicTrack.e5().toString(), musicTrack.Z);
        }
    }

    public kb50(int i, UserId userId, String str, String str2, String str3, DownloadingState downloadingState, String str4, String str5, String str6, List<Artist> list, List<Artist> list2, Thumb thumb, MusicOfflineCacheStorage musicOfflineCacheStorage, String str7, String str8, CorruptedReason corruptedReason, Long l, Long l2, boolean z, Integer num, Boolean bool, String str9, int i2, String str10, String str11) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = downloadingState;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = list;
        this.k = list2;
        this.l = thumb;
        this.m = musicOfflineCacheStorage;
        this.n = str7;
        this.o = str8;
        this.p = corruptedReason;
        this.q = l;
        this.r = l2;
        this.s = z;
        this.t = num;
        this.u = bool;
        this.v = str9;
        this.w = i2;
        this.x = str10;
        this.y = str11;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.i;
    }

    public final int c() {
        return this.w;
    }

    public final CorruptedReason d() {
        return this.p;
    }

    public final Long e() {
        return this.r;
    }

    public final DownloadingState f() {
        return this.f;
    }

    public final Long g() {
        return this.q;
    }

    public final List<Artist> h() {
        return this.k;
    }

    public final int i() {
        return this.a;
    }

    public final String j() {
        return this.x;
    }

    public final Integer k() {
        return this.t;
    }

    public final List<Artist> l() {
        return this.j;
    }

    public final String m() {
        return this.v;
    }

    public final String n() {
        return this.o;
    }

    public final String o() {
        return this.c;
    }

    public final String p() {
        return this.y;
    }

    public final MusicOfflineCacheStorage q() {
        return this.m;
    }

    public final String r() {
        return this.h;
    }

    public final Thumb s() {
        return this.l;
    }

    public final String t() {
        return this.g;
    }

    public final String u() {
        return this.e;
    }

    public final UserId v() {
        return this.b;
    }

    public final String w() {
        return this.n;
    }

    public final boolean x() {
        return this.s;
    }

    public final Boolean y() {
        return this.u;
    }
}
