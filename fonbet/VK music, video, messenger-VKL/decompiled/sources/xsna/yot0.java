package xsna;

import com.vk.clips.models.VideoUrlPack;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import java.util.List;

/* compiled from: VideoUrlPackMapper.kt */
/* loaded from: classes18.dex */
public final class yot0 {
    public static final VideoUrlPack a(ClipVideoFile clipVideoFile) {
        List<? extends VideoUrl> list;
        String Ab = clipVideoFile.f.Ab(VideoUrl.DASH_WEBM_URL);
        String Ab2 = clipVideoFile.f.Ab(VideoUrl.DASH_URL);
        if (Ab2 == null) {
            Ab2 = clipVideoFile.f.Ab(VideoUrl.DASH_ONDEMAND_URL);
        }
        String Ab3 = clipVideoFile.f.Ab(VideoUrl.HLS_LIVE);
        String Ab4 = clipVideoFile.f.Ab(VideoUrl.HLS_URL);
        if (Ab4 == null) {
            Ab4 = clipVideoFile.f.Ab(VideoUrl.HLS_ONDEMAND_URL);
        }
        VideoUrlStorage videoUrlStorage = clipVideoFile.f;
        VideoUrl.Companion.getClass();
        list = VideoUrl.MP4_URLS;
        return new VideoUrlPack(Ab, Ab2, Ab3, Ab4, videoUrlStorage.Db(list));
    }
}
