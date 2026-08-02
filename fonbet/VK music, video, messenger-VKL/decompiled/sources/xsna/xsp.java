package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import org.json.JSONObject;

/* compiled from: EpisodeEntity.kt */
/* loaded from: classes3.dex */
public final class xsp {
    public final int a;
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Long h;
    public final Long i;
    public final boolean j;
    public final Boolean k;
    public final int l;
    public final boolean m;
    public final long n;
    public final String o;
    public final Image p;
    public final String q;
    public final boolean r;
    public final DownloadingState s;
    public final MusicOfflineCacheStorage t;
    public final String u;
    public final String v;

    /* compiled from: EpisodeEntity.kt */
    public static final class a {
        public static xsp a(UserId userId, MusicTrack musicTrack, boolean z, MusicOfflineCacheStorage musicOfflineCacheStorage, String str) {
            String Fb = musicTrack.Fb();
            String str2 = musicTrack.y;
            String str3 = musicTrack.d;
            String str4 = musicTrack.h;
            String str5 = musicTrack.i;
            long j = musicTrack.f;
            long j2 = musicTrack.z;
            boolean z2 = musicTrack.s;
            boolean z3 = musicTrack.B;
            Episode episode = musicTrack.w;
            return new xsp(0, userId, Fb, str2, str3, str4, str5, Long.valueOf(j), Long.valueOf(j2), z2, Boolean.valueOf(z3), episode != null ? episode.b : 0, episode != null ? episode.c : false, episode != null ? episode.d : 0L, episode != null ? episode.e : null, episode != null ? episode.f : null, episode != null ? episode.g : null, episode != null ? episode.k : false, z ? musicTrack.J : DownloadingState.NotLoaded.b, musicOfflineCacheStorage, str, musicTrack.e5().toString());
        }

        public static MusicTrack b(xsp xspVar) {
            Episode episode;
            MusicTrack musicTrack = new MusicTrack(new JSONObject(xspVar.v));
            DownloadingState downloadingState = xspVar.s;
            Episode episode2 = musicTrack.w;
            if (episode2 != null) {
                episode = new Episode(episode2.b, episode2.c, xspVar.n, episode2.e, episode2.f, episode2.g, episode2.h, episode2.i, episode2.j, episode2.k);
            } else {
                episode = null;
            }
            return MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, episode, downloadingState, false, false, null, null, null, -2097153, 1048571);
        }
    }

    public xsp(int i, UserId userId, String str, String str2, String str3, String str4, String str5, Long l, Long l2, boolean z, Boolean bool, int i2, boolean z2, long j, String str6, Image image, String str7, boolean z3, DownloadingState downloadingState, MusicOfflineCacheStorage musicOfflineCacheStorage, String str8, String str9) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = l;
        this.i = l2;
        this.j = z;
        this.k = bool;
        this.l = i2;
        this.m = z2;
        this.n = j;
        this.o = str6;
        this.p = image;
        this.q = str7;
        this.r = z3;
        this.s = downloadingState;
        this.t = musicOfflineCacheStorage;
        this.u = str8;
        this.v = str9;
    }

    public final String a() {
        return this.f;
    }

    public final Image b() {
        return this.p;
    }

    public final Long c() {
        return this.i;
    }

    public final String d() {
        return this.o;
    }

    public final DownloadingState e() {
        return this.s;
    }

    public final Long f() {
        return this.h;
    }

    public final int g() {
        return this.a;
    }

    public final String h() {
        return this.v;
    }

    public final String i() {
        return this.u;
    }

    public final String j() {
        return this.c;
    }

    public final int k() {
        return this.l;
    }

    public final long l() {
        return this.n;
    }

    public final String m() {
        return this.q;
    }

    public final MusicOfflineCacheStorage n() {
        return this.t;
    }

    public final String o() {
        return this.e;
    }

    public final String p() {
        return this.d;
    }

    public final UserId q() {
        return this.b;
    }

    public final String r() {
        return this.g;
    }

    public final boolean s() {
        return this.r;
    }

    public final boolean t() {
        return this.j;
    }

    public final boolean u() {
        return this.m;
    }

    public final Boolean v() {
        return this.k;
    }
}
