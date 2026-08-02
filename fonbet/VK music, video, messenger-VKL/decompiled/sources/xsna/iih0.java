package xsna;

import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import xsna.ki0;

/* compiled from: SdkAnalyticsWrapper.kt */
/* loaded from: classes17.dex */
public final class iih0 implements hih0 {
    public final pih0 b;
    public boolean c = true;

    public iih0(pih0 pih0Var) {
        this.b = pih0Var;
    }

    @Override // xsna.hih0
    public final void Tf(boolean z) {
        this.c = z;
    }

    @Override // xsna.pih0
    public final void Ub(int i, long j) {
        if (this.c) {
            this.b.Ub(i, j);
        }
    }

    @Override // xsna.pih0
    public final void ai(ClipViewerAnalyticsEvent clipViewerAnalyticsEvent) {
        if (this.c) {
            this.b.ai(clipViewerAnalyticsEvent);
        }
    }

    @Override // xsna.pih0
    public final ki0 kd() {
        return !this.c ? ki0.a.a.getSTUB() : this.b.kd();
    }

    @Override // xsna.pih0
    public final sih0 l8(SdkVideoFile sdkVideoFile) {
        if (this.c) {
            return this.b.l8(sdkVideoFile);
        }
        return null;
    }

    @Override // xsna.pih0
    public final void o2(SdkClipViewerClick sdkClipViewerClick) {
        if (this.c) {
            this.b.o2(sdkClipViewerClick);
        }
    }
}
