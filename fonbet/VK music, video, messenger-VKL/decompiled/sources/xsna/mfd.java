package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;

/* compiled from: ClipViewerAnalyticsEvent.kt */
/* loaded from: classes17.dex */
public final class mfd implements ClipViewerAnalyticsEvent {
    public final SdkVideoFile a;

    public mfd(SdkVideoFile sdkVideoFile) {
        this.a = sdkVideoFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfd) && epx.f(this.a, ((mfd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenOwnerFromSnackbar(video=" + this.a + ')';
    }
}
