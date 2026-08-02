package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Genre;
import com.vk.dto.music.Playlist;
import com.vk.music.offline.core.database.models.OfflinePlaylistType;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PlaylistEntity.kt */
/* loaded from: classes3.dex */
public final class w8b0 {
    public final int a;
    public final UserId b;
    public final String c;
    public final UserId d;
    public final String e;
    public final String f;
    public final DownloadingState g;
    public final OfflinePlaylistType h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final List<Genre> m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final String r;

    /* compiled from: PlaylistEntity.kt */
    public static final class a {
        public static w8b0 a(UserId userId, Playlist playlist, DownloadingState downloadingState, int i, int i2) {
            int i3;
            boolean z;
            boolean z2;
            boolean z3;
            Playlist playlist2;
            int i4 = (i2 & 8) != 0 ? 0 : i;
            String Ib = playlist.Ib();
            UserId userId2 = playlist.c;
            int i5 = i4;
            String str = playlist.x;
            String str2 = playlist.F;
            DownloadingState downloadingState2 = downloadingState == null ? playlist.H : downloadingState;
            OfflinePlaylistType.Companion.getClass();
            OfflinePlaylistType offlinePlaylistType = playlist.Eb() ? OfflinePlaylistType.ALBUM : OfflinePlaylistType.PLAYLIST;
            String str3 = playlist.h;
            String str4 = playlist.i;
            DownloadingState downloadingState3 = downloadingState2;
            String str5 = playlist.j;
            int i6 = playlist.l;
            List<Genre> list = playlist.n;
            int i7 = playlist.I;
            boolean z4 = playlist.k;
            boolean z5 = playlist.J;
            boolean z6 = playlist.M;
            if (playlist.y.isEmpty()) {
                i3 = i7;
                z = z4;
                z2 = z5;
                z3 = z6;
                playlist2 = playlist;
            } else {
                z2 = z5;
                i3 = i7;
                z = z4;
                z3 = z6;
                playlist2 = Playlist.zb(playlist, null, null, EmptyList.b, null, -8388609, 255);
            }
            return new w8b0(i5, userId, Ib, userId2, str, str2, downloadingState3, offlinePlaylistType, str3, str4, str5, i6, list, i3, z, z2, z3, playlist2.e5().toString());
        }
    }

    public w8b0(int i, UserId userId, String str, UserId userId2, String str2, String str3, DownloadingState downloadingState, OfflinePlaylistType offlinePlaylistType, String str4, String str5, String str6, int i2, List<Genre> list, int i3, boolean z, boolean z2, boolean z3, String str7) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = userId2;
        this.e = str2;
        this.f = str3;
        this.g = downloadingState;
        this.h = offlinePlaylistType;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = i2;
        this.m = list;
        this.n = i3;
        this.o = z;
        this.p = z2;
        this.q = z3;
        this.r = str7;
    }

    public final String a() {
        return this.e;
    }

    public final int b() {
        return this.n;
    }

    public final String c() {
        return this.k;
    }

    public final DownloadingState d() {
        return this.g;
    }

    public final List<Genre> e() {
        return this.m;
    }

    public final int f() {
        return this.a;
    }

    public final String g() {
        return this.r;
    }

    public final UserId h() {
        return this.d;
    }

    public final String i() {
        return this.c;
    }

    public final String j() {
        return this.j;
    }

    public final String k() {
        return this.i;
    }

    public final String l() {
        return this.f;
    }

    public final OfflinePlaylistType m() {
        return this.h;
    }

    public final UserId n() {
        return this.b;
    }

    public final int o() {
        return this.l;
    }

    public final boolean p() {
        return this.p;
    }

    public final boolean q() {
        return this.q;
    }

    public final boolean r() {
        return this.o;
    }
}
