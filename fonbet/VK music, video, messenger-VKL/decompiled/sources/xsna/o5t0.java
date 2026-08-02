package xsna;

import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;

/* compiled from: VideoPlaylistWithOwnerInfo.kt */
/* loaded from: classes7.dex */
public final class o5t0 {
    public final VideoAlbum a;
    public final UserProfile b;

    public o5t0(VideoAlbum videoAlbum, UserProfile userProfile) {
        this.a = videoAlbum;
        this.b = userProfile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5t0)) {
            return false;
        }
        o5t0 o5t0Var = (o5t0) obj;
        return epx.f(this.a, o5t0Var.a) && epx.f(this.b, o5t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoPlaylistWithOwnerInfo(videoAlbum=" + this.a + ", owner=" + this.b + ')';
    }
}
