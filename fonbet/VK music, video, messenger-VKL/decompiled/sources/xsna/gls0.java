package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.stat.scheme.SchemeStat$EventItem;

/* compiled from: VideoFileExt.kt */
/* loaded from: classes17.dex */
public final class gls0 {
    public static final SchemeStat$EventItem a(VideoFile videoFile) {
        return new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, videoFile.r(), null, 40, null);
    }
}
