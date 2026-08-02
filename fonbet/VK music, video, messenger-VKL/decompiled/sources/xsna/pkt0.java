package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.newsfeed.api.data.VideoStatistic;

/* compiled from: VideoToVideoStatisticMapper.kt */
/* loaded from: classes4.dex */
public final class pkt0 {
    public static final pkt0 a = new pkt0();

    public static VideoStatistic a(VideoFile videoFile) {
        return new VideoStatistic(videoFile.l1(), videoFile.W7(), videoFile.L8(), videoFile.O9(), videoFile.v2(), videoFile.i0(), videoFile.Fa(), videoFile.c0());
    }
}
