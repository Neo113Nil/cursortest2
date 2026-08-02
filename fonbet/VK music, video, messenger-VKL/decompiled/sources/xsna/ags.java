package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.PropertyReference0Impl;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;

/* compiled from: VkFrameDecorator.kt */
/* loaded from: classes7.dex */
public final class ags implements FrameDecorator {
    public final PropertyReference0Impl a;

    public ags(PropertyReference0Impl propertyReference0Impl) {
        this.a = propertyReference0Impl;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.FrameDecorator
    public final VideoFrame apply(VideoFrame videoFrame) {
        float rotation = videoFrame.getRotation();
        float floatValue = ((Number) this.a.get()).floatValue();
        return floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? videoFrame : new VideoFrame(videoFrame.getBuffer(), (int) ((rotation + floatValue) % 360), videoFrame.getTimestampNs(), videoFrame.getCompactParticipantId());
    }
}
