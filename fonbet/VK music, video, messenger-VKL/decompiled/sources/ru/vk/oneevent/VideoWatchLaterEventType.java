package ru.vk.oneevent;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoWatchLaterEventType.kt */
/* loaded from: classes9.dex */
public final class VideoWatchLaterEventType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoWatchLaterEventType[] $VALUES;
    public static final VideoWatchLaterEventType ADD;
    public static final VideoWatchLaterEventType REMOVE;
    private final String wireValue;

    static {
        VideoWatchLaterEventType videoWatchLaterEventType = new VideoWatchLaterEventType("ADD", 0, "add");
        ADD = videoWatchLaterEventType;
        VideoWatchLaterEventType videoWatchLaterEventType2 = new VideoWatchLaterEventType(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 1, SignalingProtocol.KEY_REMOVE);
        REMOVE = videoWatchLaterEventType2;
        VideoWatchLaterEventType[] videoWatchLaterEventTypeArr = {videoWatchLaterEventType, videoWatchLaterEventType2};
        $VALUES = videoWatchLaterEventTypeArr;
        $ENTRIES = new asp(videoWatchLaterEventTypeArr);
    }

    public VideoWatchLaterEventType(String str, int i, String str2) {
        this.wireValue = str2;
    }

    public static VideoWatchLaterEventType valueOf(String str) {
        return (VideoWatchLaterEventType) Enum.valueOf(VideoWatchLaterEventType.class, str);
    }

    public static VideoWatchLaterEventType[] values() {
        return (VideoWatchLaterEventType[]) $VALUES.clone();
    }

    public final String h() {
        return this.wireValue;
    }
}
