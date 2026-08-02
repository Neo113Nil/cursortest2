package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;

/* compiled from: ClipViewerAnalyticsEvent.kt */
/* loaded from: classes17.dex */
public final class lfd implements ClipViewerAnalyticsEvent {
    public final SdkClipVideoFile a;
    public final String b;
    public final String c;

    public lfd(SdkClipVideoFile sdkClipVideoFile, String str, String str2) {
        this.a = sdkClipVideoFile;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfd)) {
            return false;
        }
        lfd lfdVar = (lfd) obj;
        return epx.f(this.a, lfdVar.a) && epx.f(this.b, lfdVar.b) && epx.f(this.c, lfdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("View(video=");
        sb.append(this.a);
        sb.append(", questionsId=");
        sb.append(this.b);
        sb.append(", questionId=");
        return ho8.a(sb, this.c, ')');
    }
}
