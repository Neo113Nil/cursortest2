package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import org.json.JSONObject;

/* compiled from: AutoDownloadTrackLiteEntity.kt */
/* loaded from: classes3.dex */
public final class xf5 {
    public final int a;
    public final UserId b;
    public final String c;
    public final DownloadingState d;
    public final Long e;
    public final Long f;
    public final String g;

    /* compiled from: AutoDownloadTrackLiteEntity.kt */
    public static final class a {
        public static MusicTrack a(xf5 xf5Var) {
            return MusicTrack.zb(new MusicTrack(new JSONObject(xf5Var.g)), 0, null, 0, 0, null, false, null, xf5Var.d, false, false, null, null, null, -1, 1048571);
        }
    }

    public xf5(int i, UserId userId, String str, DownloadingState downloadingState, Long l, Long l2, String str2) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = downloadingState;
        this.e = l;
        this.f = l2;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf5)) {
            return false;
        }
        xf5 xf5Var = (xf5) obj;
        return this.a == xf5Var.a && epx.f(this.b, xf5Var.b) && epx.f(this.c, xf5Var.c) && epx.f(this.d, xf5Var.d) && epx.f(this.e, xf5Var.e) && epx.f(this.f, xf5Var.f) && epx.f(this.g, xf5Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + urd0.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b), 31, this.c)) * 31;
        Long l = this.e;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        return this.g.hashCode() + ((hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoDownloadTrackLiteEntity(id=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", mid=");
        sb.append(this.c);
        sb.append(", downloadingState=");
        sb.append(this.d);
        sb.append(", sizeInBytes=");
        sb.append(this.e);
        sb.append(", autoDownloadDate=");
        sb.append(this.f);
        sb.append(", jsonRaw=");
        return ho8.a(sb, this.g, ')');
    }
}
