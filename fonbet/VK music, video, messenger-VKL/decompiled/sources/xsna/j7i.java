package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.PropertyReference0Impl;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;

/* compiled from: VkFrameDecorator.kt */
/* loaded from: classes7.dex */
public final class j7i implements FrameDecorator {
    public final PropertyReference0Impl a;
    public final o6m b;

    public j7i(PropertyReference0Impl propertyReference0Impl, wly wlyVar) {
        this.a = propertyReference0Impl;
        this.b = new o6m(wlyVar, true);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.FrameDecorator
    public final VideoFrame apply(VideoFrame videoFrame) {
        float rotation = videoFrame.getRotation();
        float a = this.b.a(((Number) this.a.get()).floatValue());
        return a == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? videoFrame : new VideoFrame(videoFrame.getBuffer(), (int) ((rotation - a) % 360), videoFrame.getTimestampNs(), videoFrame.getCompactParticipantId());
    }
}
