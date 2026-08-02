package xsna;

import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerArguments;

/* compiled from: VideoViewerFragmentInternalComponent.kt */
/* loaded from: classes7.dex */
public final class nrt0 extends uaj0 {
    public final VideoViewerArguments a;

    public nrt0(VideoViewerArguments videoViewerArguments) {
        this.a = videoViewerArguments;
    }

    @Override // xsna.pwj0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nrt0) && epx.f(this.a, ((nrt0) obj).a);
    }

    @Override // xsna.pwj0
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VideoViewerFragmentScopeKey(arguments=" + this.a + ')';
    }
}
