package xsna;

import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import java.util.List;

/* compiled from: VideoRelatedVideosMoreActionsState.kt */
/* loaded from: classes7.dex */
public final class kct0 implements km50 {
    public final VideoDiscoveryRelatedVideosSource b;
    public final List<cct0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public kct0(VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource, List<? extends cct0> list) {
        this.b = videoDiscoveryRelatedVideosSource;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kct0)) {
            return false;
        }
        kct0 kct0Var = (kct0) obj;
        return epx.f(this.b, kct0Var.b) && epx.f(this.c, kct0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoRelatedVideosMoreActionsState(source=");
        sb.append(this.b);
        sb.append(", items=");
        return ms9.a(')', sb, this.c);
    }
}
