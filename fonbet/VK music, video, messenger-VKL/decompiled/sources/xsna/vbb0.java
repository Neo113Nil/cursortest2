package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.music.offline.core.database.models.OfflinePlaylistType;

/* compiled from: PlaylistOldEntity.kt */
/* loaded from: classes3.dex */
public final class vbb0 {
    public final int a;
    public final int b;
    public final String c;
    public final Playlist d;
    public final int e;

    /* compiled from: PlaylistOldEntity.kt */
    public static final class a {
        public static w8b0 a(vbb0 vbb0Var) {
            DownloadingState downloadingState;
            UserId userId = new UserId(vbb0Var.b);
            Playlist playlist = vbb0Var.d;
            String Ib = playlist.Ib();
            UserId userId2 = playlist.c;
            String str = playlist.x;
            String str2 = playlist.F;
            int i = vbb0Var.e;
            if (i == 0) {
                downloadingState = DownloadingState.NotLoaded.b;
            } else if (i == 1) {
                downloadingState = DownloadingState.Downloaded.b;
            } else if (i == 2) {
                downloadingState = DownloadingState.PendingDownload.b;
            } else if (i == 3) {
                downloadingState = DownloadingState.PartlyDownloaded.b;
            } else {
                if (i != 4) {
                    throw new IllegalStateException("Incorrect download state value");
                }
                downloadingState = DownloadingState.Corrupted.b;
            }
            OfflinePlaylistType.Companion.getClass();
            return new w8b0(0, userId, Ib, userId2, str, str2, downloadingState, playlist.Eb() ? OfflinePlaylistType.ALBUM : OfflinePlaylistType.PLAYLIST, playlist.h, playlist.i, playlist.j, playlist.l, playlist.n, playlist.I, playlist.k, playlist.J, playlist.M, playlist.e5().toString());
        }
    }

    public vbb0(int i, int i2, String str, Playlist playlist, int i3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = playlist;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbb0)) {
            return false;
        }
        vbb0 vbb0Var = (vbb0) obj;
        return this.a == vbb0Var.a && this.b == vbb0Var.b && epx.f(this.c, vbb0Var.c) && epx.f(this.d, vbb0Var.d) && this.e == vbb0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + urd0.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistOldEntity(id=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", pid=");
        sb.append(this.c);
        sb.append(", playlist=");
        sb.append(this.d);
        sb.append(", downloadingState=");
        return vu5.b(sb, this.e, ')');
    }
}
