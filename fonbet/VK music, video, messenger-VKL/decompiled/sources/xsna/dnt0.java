package xsna;

import com.vk.libvideo.api.VideoAutoPlayDelayType;

/* compiled from: VideoUI.kt */
/* loaded from: classes2.dex */
public interface dnt0 {

    /* compiled from: VideoUI.kt */
    public interface a extends dnt0 {
    }

    default VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return null;
    }

    boolean getVideoFocused();

    void setVideoFocused(boolean z);
}
