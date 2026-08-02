package xsna;

import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import java.util.HashMap;

/* compiled from: VideoFileExt.kt */
/* loaded from: classes5.dex */
public final class fls0 {
    public static final VideoFileOld a(String str) {
        VideoFileOld videoFileOld = new VideoFileOld();
        HashMap hashMap = new HashMap();
        VideoUrl videoUrl = VideoUrl.URL_1080;
        if (!myc0.f(str)) {
            str = null;
        }
        if (str != null) {
            VideoUrlStorage.b bVar = VideoUrlStorage.c;
            VideoUrlStorage.d.b(hashMap, videoUrl, str);
        }
        videoFileOld.f = new VideoUrlStorage(hashMap);
        videoFileOld.Q0 = true;
        videoFileOld.R = false;
        videoFileOld.z = true;
        videoFileOld.j0 = true;
        return videoFileOld;
    }
}
