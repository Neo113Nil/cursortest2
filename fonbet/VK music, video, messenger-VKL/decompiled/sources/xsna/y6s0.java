package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;

/* compiled from: VideoBottomSheetSideEffectsHandler.kt */
/* loaded from: classes3.dex */
public interface y6s0 {
    void b(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile);

    default int c2() {
        return -1;
    }

    default void a(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile) {
    }
}
