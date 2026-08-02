package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbumType;

/* compiled from: VideoDiscoveryActionsTracker.kt */
/* loaded from: classes2.dex */
public final class acb0 {
    public final UserId a;
    public final int b;
    public final VideoAlbumType c;
    public final Integer d;

    public acb0(UserId userId, int i, VideoAlbumType videoAlbumType, Integer num) {
        this.a = userId;
        this.b = i;
        this.c = videoAlbumType;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acb0)) {
            return false;
        }
        acb0 acb0Var = (acb0) obj;
        return epx.f(this.a, acb0Var.a) && this.b == acb0Var.b && this.c == acb0Var.c && epx.f(this.d, acb0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31)) * 31;
        Integer num = this.d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistParams(ownerId=");
        sb.append(this.a);
        sb.append(", playlistId=");
        sb.append(this.b);
        sb.append(", playlistType=");
        sb.append(this.c);
        sb.append(", parentPlaylistId=");
        return uqi.b(sb, this.d, ')');
    }
}
