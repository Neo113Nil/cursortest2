package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;

/* compiled from: MusicTrackOldEntity.kt */
/* loaded from: classes3.dex */
public final class ud50 {
    public final Integer a;
    public final int b;
    public final String c;
    public final MusicTrack d;
    public final int e;
    public final String f;

    /* compiled from: MusicTrackOldEntity.kt */
    public static final class a {
        public static kb50 a(ud50 ud50Var) {
            DownloadingState downloadingState;
            UserId userId = new UserId(ud50Var.b);
            String str = ud50Var.c;
            MusicTrack musicTrack = ud50Var.d;
            String str2 = musicTrack.r;
            String str3 = musicTrack.y;
            int i = ud50Var.e;
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
            return new kb50(0, userId, str, str2, str3, downloadingState, musicTrack.d, musicTrack.e, musicTrack.h, musicTrack.t, musicTrack.u, musicTrack.Jb(), null, musicTrack.i, ud50Var.f, null, Long.valueOf(musicTrack.f), Long.valueOf(musicTrack.z), musicTrack.s, Integer.valueOf(musicTrack.n), Boolean.valueOf(musicTrack.B), musicTrack.S, musicTrack.g, musicTrack.e5().toString(), musicTrack.Z);
        }
    }

    public ud50(Integer num, int i, String str, MusicTrack musicTrack, int i2, String str2) {
        this.a = num;
        this.b = i;
        this.c = str;
        this.d = musicTrack;
        this.e = i2;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud50)) {
            return false;
        }
        ud50 ud50Var = (ud50) obj;
        return epx.f(this.a, ud50Var.a) && this.b == ud50Var.b && epx.f(this.c, ud50Var.c) && epx.f(this.d, ud50Var.d) && this.e == ud50Var.e && epx.f(this.f, ud50Var.f);
    }

    public final int hashCode() {
        Integer num = this.a;
        int a2 = shy.a(this.e, (this.d.hashCode() + urd0.a(shy.a(this.b, (num == null ? 0 : num.hashCode()) * 31, 31), 31, this.c)) * 31, 31);
        String str = this.f;
        return a2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicTrackOldEntity(id=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", mid=");
        sb.append(this.c);
        sb.append(", track=");
        sb.append(this.d);
        sb.append(", downloadingState=");
        sb.append(this.e);
        sb.append(", manifestUrl=");
        return ho8.a(sb, this.f, ')');
    }
}
