package ru.ok.android.webrtc.video.qualityupdate;

import java.util.LinkedHashMap;
import java.util.Map;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class VideoQualityUpdates {
    public final Map a;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoQualityUpdates() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final VideoQualityUpdate getCameraQuality() {
        return (VideoQualityUpdate) this.a.get(0);
    }

    public final VideoQualityUpdate getScreenShareQuality() {
        return (VideoQualityUpdate) this.a.get(1);
    }

    public final VideoQualityUpdate getVideoQualityBySource(int i) {
        return (VideoQualityUpdate) this.a.get(Integer.valueOf(i));
    }

    public final void updateVideoQuality(VideoQualityUpdate videoQualityUpdate) {
        this.a.put(Integer.valueOf(videoQualityUpdate.getSource()), videoQualityUpdate);
    }

    public VideoQualityUpdates(Map<Integer, VideoQualityUpdate> map) {
        this.a = map;
    }

    public /* synthetic */ VideoQualityUpdates(Map map, int i, zcl zclVar) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}
