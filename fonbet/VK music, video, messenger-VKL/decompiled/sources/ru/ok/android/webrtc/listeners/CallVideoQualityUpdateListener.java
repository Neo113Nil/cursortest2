package ru.ok.android.webrtc.listeners;

import ru.ok.android.webrtc.video.qualityupdate.VideoQualityUpdate;

/* loaded from: classes9.dex */
public interface CallVideoQualityUpdateListener {

    public static final class VideoQualityUpdateParams {
        public final VideoQualityUpdate a;

        public VideoQualityUpdateParams(VideoQualityUpdate videoQualityUpdate) {
            this.a = videoQualityUpdate;
        }

        public final VideoQualityUpdate getData() {
            return this.a;
        }
    }

    void onVideoQualityUpdate(VideoQualityUpdateParams videoQualityUpdateParams);
}
