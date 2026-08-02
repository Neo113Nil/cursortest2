package xsna;

import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerResult;

/* compiled from: VideoViewerEvent.kt */
/* loaded from: classes7.dex */
public interface lrt0 extends pk50 {

    /* compiled from: VideoViewerEvent.kt */
    public static final class a implements lrt0 {
        public final VideoViewerResult a;

        public a(VideoViewerResult videoViewerResult) {
            this.a = videoViewerResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            VideoViewerResult videoViewerResult = this.a;
            if (videoViewerResult == null) {
                return 0;
            }
            return videoViewerResult.b.hashCode();
        }

        public final String toString() {
            return "Close(result=" + this.a + ')';
        }
    }
}
