package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.core.database.models.AutoDownloadType;
import java.util.List;
import org.json.JSONObject;

/* compiled from: AutoDownloadTrackEntity.kt */
/* loaded from: classes3.dex */
public final class wf5 {
    public final String A;
    public final long a;
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
    public final Long p;
    public final Long q;
    public final boolean r;
    public final Integer s;
    public final Boolean t;
    public final String u;
    public final int v;
    public final Long w;
    public final Long x;
    public final Long y;
    public final AutoDownloadType z;

    /* compiled from: AutoDownloadTrackEntity.kt */
    public static final class a {
        public static MusicTrack a(wf5 wf5Var) {
            return MusicTrack.zb(new MusicTrack(new JSONObject(wf5Var.A)), 0, null, 0, 0, null, false, null, wf5Var.f, false, false, null, null, null, -1, 1048571);
        }
    }

    public wf5(long j, UserId userId, String str, String str2, String str3, DownloadingState downloadingState, String str4, String str5, String str6, List<Artist> list, List<Artist> list2, Thumb thumb, MusicOfflineCacheStorage musicOfflineCacheStorage, String str7, String str8, Long l, Long l2, boolean z, Integer num, Boolean bool, String str9, int i, Long l3, Long l4, Long l5, AutoDownloadType autoDownloadType, String str10) {
        this.a = j;
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
        this.p = l;
        this.q = l2;
        this.r = z;
        this.s = num;
        this.t = bool;
        this.u = str9;
        this.v = i;
        this.w = l3;
        this.x = l4;
        this.y = l5;
        this.z = autoDownloadType;
        this.A = str10;
    }

    public final Boolean A() {
        return this.t;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.i;
    }

    public final Long c() {
        return this.x;
    }

    public final AutoDownloadType d() {
        return this.z;
    }

    public final int e() {
        return this.v;
    }

    public final Long f() {
        return this.q;
    }

    public final DownloadingState g() {
        return this.f;
    }

    public final Long h() {
        return this.p;
    }

    public final List<Artist> i() {
        return this.k;
    }

    public final long j() {
        return this.a;
    }

    public final Long k() {
        return this.y;
    }

    public final String l() {
        return this.A;
    }

    public final Integer m() {
        return this.s;
    }

    public final List<Artist> n() {
        return this.j;
    }

    public final String o() {
        return this.u;
    }

    public final String p() {
        return this.o;
    }

    public final String q() {
        return this.c;
    }

    public final Long r() {
        return this.w;
    }

    public final MusicOfflineCacheStorage s() {
        return this.m;
    }

    public final String t() {
        return this.h;
    }

    public final Thumb u() {
        return this.l;
    }

    public final String v() {
        return this.g;
    }

    public final String w() {
        return this.e;
    }

    public final UserId x() {
        return this.b;
    }

    public final String y() {
        return this.n;
    }

    public final boolean z() {
        return this.r;
    }
}
