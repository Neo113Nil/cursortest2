package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;

/* compiled from: VideoFileUtils.kt */
/* loaded from: classes16.dex */
public final class ols0 {
    public static final boolean a(VideoFile videoFile) {
        if (!videoFile.t0() || fxc0.B().c(videoFile)) {
            return false;
        }
        VideoRestriction O = videoFile.O();
        return (O == null || O.f) && !fxc0.B().b0().e(videoFile) && videoFile.k1() > 0;
    }
}
