package xsna;

import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;

/* compiled from: VideoRelatedVideosMoreActionsAction.kt */
/* loaded from: classes7.dex */
public interface dct0 extends kj50 {

    /* compiled from: VideoRelatedVideosMoreActionsAction.kt */
    public static final class a implements dct0 {
        public final VideoDiscoveryRelatedVideosSource b;

        public a(VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource) {
            this.b = videoDiscoveryRelatedVideosSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Init(source=" + this.b + ')';
        }
    }

    /* compiled from: VideoRelatedVideosMoreActionsAction.kt */
    public static final class b implements dct0 {
        public final cct0 b;

        public b(cct0 cct0Var) {
            this.b = cct0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnActionClicked(action=" + this.b + ')';
        }
    }

    /* compiled from: VideoRelatedVideosMoreActionsAction.kt */
    public static final class c implements dct0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -715343330;
        }

        public final String toString() {
            return "OnUnsubscribeConfirmed";
        }
    }
}
