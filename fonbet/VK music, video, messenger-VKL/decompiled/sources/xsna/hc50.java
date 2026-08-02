package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import org.json.JSONObject;

/* compiled from: MusicTrackLiteEntity.kt */
/* loaded from: classes3.dex */
public final class hc50 {
    public final int a;
    public final UserId b;
    public final String c;
    public final DownloadingState d;
    public final String e;

    /* compiled from: MusicTrackLiteEntity.kt */
    public static final class a {
        public static MusicTrack a(hc50 hc50Var) {
            return MusicTrack.zb(new MusicTrack(new JSONObject(hc50Var.e)), 0, null, 0, 0, null, false, null, hc50Var.d, false, false, null, null, null, -1, 1048571);
        }
    }

    public hc50(int i, DownloadingState downloadingState, UserId userId, String str, String str2) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = downloadingState;
        this.e = str2;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc50)) {
            return false;
        }
        hc50 hc50Var = (hc50) obj;
        return this.a == hc50Var.a && epx.f(this.b, hc50Var.b) && epx.f(this.c, hc50Var.c) && epx.f(this.d, hc50Var.d) && epx.f(this.e, hc50Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + urd0.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicTrackLiteEntity(id=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", mid=");
        sb.append(this.c);
        sb.append(", downloadingState=");
        sb.append(this.d);
        sb.append(", jsonRaw=");
        return ho8.a(sb, this.e, ')');
    }
}
