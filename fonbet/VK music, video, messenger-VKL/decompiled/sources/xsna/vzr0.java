package xsna;

import com.vk.video.ad.data.VideoAdInfo;

/* compiled from: VideoAdContract.kt */
/* loaded from: classes5.dex */
public final class vzr0 implements km50 {
    public final VideoAdInfo b;

    public vzr0(VideoAdInfo videoAdInfo) {
        this.b = videoAdInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzr0) && epx.f(this.b, ((vzr0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "VideoAdState(videoAdInfo=" + this.b + ')';
    }
}
