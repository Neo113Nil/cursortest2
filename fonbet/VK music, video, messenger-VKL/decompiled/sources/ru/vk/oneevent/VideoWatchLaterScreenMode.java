package ru.vk.oneevent;

import com.ironsource.D1;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoWatchLaterScreenMode.kt */
/* loaded from: classes9.dex */
public final class VideoWatchLaterScreenMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoWatchLaterScreenMode[] $VALUES;
    public static final VideoWatchLaterScreenMode AIRPLAY;
    public static final VideoWatchLaterScreenMode CHROMECAST;
    public static final VideoWatchLaterScreenMode DISCOVERY;
    public static final VideoWatchLaterScreenMode DLNA;
    public static final VideoWatchLaterScreenMode EXTERNAL;
    public static final VideoWatchLaterScreenMode FULLSCREEN;
    public static final VideoWatchLaterScreenMode FULLSCREEN_LANDSCAPE;
    public static final VideoWatchLaterScreenMode FULLSCREEN_PORTRAIT;
    public static final VideoWatchLaterScreenMode INVISIBLE;
    public static final VideoWatchLaterScreenMode MINIMIZED;
    public static final VideoWatchLaterScreenMode PIP;
    public static final VideoWatchLaterScreenMode PIP_EXTERNAL;
    public static final VideoWatchLaterScreenMode PIP_INTERNAL;
    public static final VideoWatchLaterScreenMode PREVIEW;
    private final String wireValue;

    static {
        VideoWatchLaterScreenMode videoWatchLaterScreenMode = new VideoWatchLaterScreenMode("FULLSCREEN", 0, "fullscreen");
        FULLSCREEN = videoWatchLaterScreenMode;
        VideoWatchLaterScreenMode videoWatchLaterScreenMode2 = new VideoWatchLaterScreenMode("FULLSCREEN_PORTRAIT", 1, "fullscreen_portrait");
        FULLSCREEN_PORTRAIT = videoWatchLaterScreenMode2;
        VideoWatchLaterScreenMode videoWatchLaterScreenMode3 = new VideoWatchLaterScreenMode("FULLSCREEN_LANDSCAPE", 2, "fullscreen_landscape");
        FULLSCREEN_LANDSCAPE = videoWatchLaterScreenMode3;
        VideoWatchLaterScreenMode videoWatchLaterScreenMode4 = new VideoWatchLaterScreenMode("DISCOVERY", 3, "discovery");
        DISCOVERY = videoWatchLaterScreenMode4;
        VideoWatchLaterScreenMode videoWatchLaterScreenMode5 = new VideoWatchLaterScreenMode("MINIMIZED", 4, "minimized");
        MINIMIZED = videoWatchLaterScreenMode5;
        VideoWatchLaterScreenMode videoWatchLaterScreenMode6 = new VideoWatchLaterScreenMode("PIP", 5, "pip");
        PIP = videoWatchLaterScreenMode6;
        VideoWatchLaterScreenMode videoWatchLaterScreenMode7 = new VideoWatchLaterScreenMode("PIP_INTERNAL", 6, "pip_internal");
        PIP_INTERNAL = videoWatchLaterScreenMode7;
        VideoWatchLaterScreenMode videoWatchLaterScreenMode8 = new VideoWatchLaterScreenMode("PIP_EXTERNAL", 7, "pip_external");
        PIP_EXTERNAL = videoWatchLaterScreenMode8;
        VideoWatchLaterScreenMode videoWatchLaterScreenMode9 = new VideoWatchLaterScreenMode("PREVIEW", 8, "preview");
        PREVIEW = videoWatchLaterScreenMode9;
        VideoWatchLaterScreenMode videoWatchLaterScreenMode10 = new VideoWatchLaterScreenMode("INVISIBLE", 9, "invisible");
        INVISIBLE = videoWatchLaterScreenMode10;
        VideoWatchLaterScreenMode videoWatchLaterScreenMode11 = new VideoWatchLaterScreenMode("CHROMECAST", 10, "chromecast");
        CHROMECAST = videoWatchLaterScreenMode11;
        VideoWatchLaterScreenMode videoWatchLaterScreenMode12 = new VideoWatchLaterScreenMode("AIRPLAY", 11, "airplay");
        AIRPLAY = videoWatchLaterScreenMode12;
        VideoWatchLaterScreenMode videoWatchLaterScreenMode13 = new VideoWatchLaterScreenMode("DLNA", 12, "dlna");
        DLNA = videoWatchLaterScreenMode13;
        VideoWatchLaterScreenMode videoWatchLaterScreenMode14 = new VideoWatchLaterScreenMode("EXTERNAL", 13, D1.e);
        EXTERNAL = videoWatchLaterScreenMode14;
        VideoWatchLaterScreenMode[] videoWatchLaterScreenModeArr = {videoWatchLaterScreenMode, videoWatchLaterScreenMode2, videoWatchLaterScreenMode3, videoWatchLaterScreenMode4, videoWatchLaterScreenMode5, videoWatchLaterScreenMode6, videoWatchLaterScreenMode7, videoWatchLaterScreenMode8, videoWatchLaterScreenMode9, videoWatchLaterScreenMode10, videoWatchLaterScreenMode11, videoWatchLaterScreenMode12, videoWatchLaterScreenMode13, videoWatchLaterScreenMode14};
        $VALUES = videoWatchLaterScreenModeArr;
        $ENTRIES = new asp(videoWatchLaterScreenModeArr);
    }

    public VideoWatchLaterScreenMode(String str, int i, String str2) {
        this.wireValue = str2;
    }

    public static VideoWatchLaterScreenMode valueOf(String str) {
        return (VideoWatchLaterScreenMode) Enum.valueOf(VideoWatchLaterScreenMode.class, str);
    }

    public static VideoWatchLaterScreenMode[] values() {
        return (VideoWatchLaterScreenMode[]) $VALUES.clone();
    }

    public final String h() {
        return this.wireValue;
    }
}
