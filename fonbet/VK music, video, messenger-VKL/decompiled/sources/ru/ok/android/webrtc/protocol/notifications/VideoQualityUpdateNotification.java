package ru.ok.android.webrtc.protocol.notifications;

import ru.ok.android.webrtc.protocol.RtcNotification;
import ru.ok.android.webrtc.video.qualityupdate.VideoQualityUpdate;
import xsna.epx;

/* loaded from: classes9.dex */
public final class VideoQualityUpdateNotification implements RtcNotification {
    public final VideoQualityUpdate a;

    public VideoQualityUpdateNotification(VideoQualityUpdate videoQualityUpdate) {
        this.a = videoQualityUpdate;
    }

    public static /* synthetic */ VideoQualityUpdateNotification copy$default(VideoQualityUpdateNotification videoQualityUpdateNotification, VideoQualityUpdate videoQualityUpdate, int i, Object obj) {
        if ((i & 1) != 0) {
            videoQualityUpdate = videoQualityUpdateNotification.a;
        }
        return videoQualityUpdateNotification.copy(videoQualityUpdate);
    }

    public final VideoQualityUpdate component1() {
        return this.a;
    }

    public final VideoQualityUpdateNotification copy(VideoQualityUpdate videoQualityUpdate) {
        return new VideoQualityUpdateNotification(videoQualityUpdate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoQualityUpdateNotification) && epx.f(this.a, ((VideoQualityUpdateNotification) obj).a);
    }

    public final VideoQualityUpdate getVideoQuality() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "VideoQualityUpdateNotification(videoQuality=" + this.a + ")";
    }
}
