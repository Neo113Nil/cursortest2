package ru.ok.android.webrtc;

import androidx.annotation.Nullable;
import org.webrtc.VideoFrame;

/* loaded from: classes11.dex */
public interface CapturedFrameInterceptor {
    @Nullable
    VideoFrame onFrameCaptured(VideoFrame videoFrame);

    default void onStop() {
    }

    default void onStart(boolean z) {
    }
}
