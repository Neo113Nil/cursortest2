package one.video.pip.config.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlaybackStatus.kt */
/* loaded from: classes8.dex */
public final class PlaybackStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlaybackStatus[] $VALUES;
    public static final PlaybackStatus AD_PAUSE;
    public static final PlaybackStatus AD_PLAYING;
    public static final PlaybackStatus COMPLETE;
    public static final PlaybackStatus ERROR;
    public static final PlaybackStatus PAUSE;
    public static final PlaybackStatus PLAYING;

    static {
        PlaybackStatus playbackStatus = new PlaybackStatus("AD_PLAYING", 0);
        AD_PLAYING = playbackStatus;
        PlaybackStatus playbackStatus2 = new PlaybackStatus("AD_PAUSE", 1);
        AD_PAUSE = playbackStatus2;
        PlaybackStatus playbackStatus3 = new PlaybackStatus("PLAYING", 2);
        PLAYING = playbackStatus3;
        PlaybackStatus playbackStatus4 = new PlaybackStatus("PAUSE", 3);
        PAUSE = playbackStatus4;
        PlaybackStatus playbackStatus5 = new PlaybackStatus("COMPLETE", 4);
        COMPLETE = playbackStatus5;
        PlaybackStatus playbackStatus6 = new PlaybackStatus("ERROR", 5);
        ERROR = playbackStatus6;
        PlaybackStatus[] playbackStatusArr = {playbackStatus, playbackStatus2, playbackStatus3, playbackStatus4, playbackStatus5, playbackStatus6};
        $VALUES = playbackStatusArr;
        $ENTRIES = new asp(playbackStatusArr);
    }

    public PlaybackStatus() {
        throw null;
    }

    public static PlaybackStatus valueOf(String str) {
        return (PlaybackStatus) Enum.valueOf(PlaybackStatus.class, str);
    }

    public static PlaybackStatus[] values() {
        return (PlaybackStatus[]) $VALUES.clone();
    }
}
