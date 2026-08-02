package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import org.json.JSONObject;

/* compiled from: MusicTrackLiteEntityWithPosition.kt */
/* loaded from: classes3.dex */
public final class ic50 {
    public final UserId a;
    public final String b;
    public final DownloadingState c;
    public final String d;
    public final int e;

    /* compiled from: MusicTrackLiteEntityWithPosition.kt */
    public static final class a {
        public static MusicTrack a(ic50 ic50Var) {
            return MusicTrack.zb(new MusicTrack(new JSONObject(ic50Var.d)), 0, null, 0, 0, null, false, null, ic50Var.c, false, false, null, null, null, -1, 1048571);
        }
    }

    public ic50(int i, DownloadingState downloadingState, UserId userId, String str, String str2) {
        this.a = userId;
        this.b = str;
        this.c = downloadingState;
        this.d = str2;
        this.e = i;
    }

    public final int a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic50)) {
            return false;
        }
        ic50 ic50Var = (ic50) obj;
        return epx.f(this.a, ic50Var.a) && epx.f(this.b, ic50Var.b) && epx.f(this.c, ic50Var.c) && epx.f(this.d, ic50Var.d) && this.e == ic50Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + urd0.a((this.c.hashCode() + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicTrackLiteEntityWithPosition(uid=");
        sb.append(this.a);
        sb.append(", mid=");
        sb.append(this.b);
        sb.append(", downloadingState=");
        sb.append(this.c);
        sb.append(", jsonRaw=");
        sb.append(this.d);
        sb.append(", position=");
        return vu5.b(sb, this.e, ')');
    }
}
