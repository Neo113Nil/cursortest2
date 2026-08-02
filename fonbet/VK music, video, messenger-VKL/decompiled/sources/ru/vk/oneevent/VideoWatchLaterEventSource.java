package ru.vk.oneevent;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoWatchLaterEventSource.kt */
/* loaded from: classes9.dex */
public final class VideoWatchLaterEventSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoWatchLaterEventSource[] $VALUES;
    public static final VideoWatchLaterEventSource ACTION_MENU;
    public static final VideoWatchLaterEventSource ACTION_SHEET;
    public static final VideoWatchLaterEventSource APP_SETTINGS;
    public static final VideoWatchLaterEventSource BUTTON;
    public static final VideoWatchLaterEventSource CROSS;
    public static final VideoWatchLaterEventSource HEADER;
    public static final VideoWatchLaterEventSource OFFER_MODAL;
    public static final VideoWatchLaterEventSource OFFER_MODAL_FIRST;
    public static final VideoWatchLaterEventSource OFFER_MODAL_RECONNECT_MULTI;
    public static final VideoWatchLaterEventSource PLAYER;
    public static final VideoWatchLaterEventSource SETTINGS;
    public static final VideoWatchLaterEventSource SWIPE;
    public static final VideoWatchLaterEventSource VIDEO_PLAYER_MODAL;
    private final String wireValue;

    static {
        VideoWatchLaterEventSource videoWatchLaterEventSource = new VideoWatchLaterEventSource("APP_SETTINGS", 0, "app_settings");
        APP_SETTINGS = videoWatchLaterEventSource;
        VideoWatchLaterEventSource videoWatchLaterEventSource2 = new VideoWatchLaterEventSource("BUTTON", 1, "button");
        BUTTON = videoWatchLaterEventSource2;
        VideoWatchLaterEventSource videoWatchLaterEventSource3 = new VideoWatchLaterEventSource("ACTION_MENU", 2, "action_menu");
        ACTION_MENU = videoWatchLaterEventSource3;
        VideoWatchLaterEventSource videoWatchLaterEventSource4 = new VideoWatchLaterEventSource("VIDEO_PLAYER_MODAL", 3, "video_player_modal");
        VIDEO_PLAYER_MODAL = videoWatchLaterEventSource4;
        VideoWatchLaterEventSource videoWatchLaterEventSource5 = new VideoWatchLaterEventSource("SWIPE", 4, "swipe");
        SWIPE = videoWatchLaterEventSource5;
        VideoWatchLaterEventSource videoWatchLaterEventSource6 = new VideoWatchLaterEventSource("CROSS", 5, "cross");
        CROSS = videoWatchLaterEventSource6;
        VideoWatchLaterEventSource videoWatchLaterEventSource7 = new VideoWatchLaterEventSource("SETTINGS", 6, "settings");
        SETTINGS = videoWatchLaterEventSource7;
        VideoWatchLaterEventSource videoWatchLaterEventSource8 = new VideoWatchLaterEventSource("HEADER", 7, "header");
        HEADER = videoWatchLaterEventSource8;
        VideoWatchLaterEventSource videoWatchLaterEventSource9 = new VideoWatchLaterEventSource("PLAYER", 8, "player");
        PLAYER = videoWatchLaterEventSource9;
        VideoWatchLaterEventSource videoWatchLaterEventSource10 = new VideoWatchLaterEventSource("OFFER_MODAL_FIRST", 9, "offer_modal_first");
        OFFER_MODAL_FIRST = videoWatchLaterEventSource10;
        VideoWatchLaterEventSource videoWatchLaterEventSource11 = new VideoWatchLaterEventSource("OFFER_MODAL_RECONNECT_MULTI", 10, "offer_modal_reconnect_multi");
        OFFER_MODAL_RECONNECT_MULTI = videoWatchLaterEventSource11;
        VideoWatchLaterEventSource videoWatchLaterEventSource12 = new VideoWatchLaterEventSource("ACTION_SHEET", 11, "action_sheet");
        ACTION_SHEET = videoWatchLaterEventSource12;
        VideoWatchLaterEventSource videoWatchLaterEventSource13 = new VideoWatchLaterEventSource("OFFER_MODAL", 12, "offer_modal");
        OFFER_MODAL = videoWatchLaterEventSource13;
        VideoWatchLaterEventSource[] videoWatchLaterEventSourceArr = {videoWatchLaterEventSource, videoWatchLaterEventSource2, videoWatchLaterEventSource3, videoWatchLaterEventSource4, videoWatchLaterEventSource5, videoWatchLaterEventSource6, videoWatchLaterEventSource7, videoWatchLaterEventSource8, videoWatchLaterEventSource9, videoWatchLaterEventSource10, videoWatchLaterEventSource11, videoWatchLaterEventSource12, videoWatchLaterEventSource13};
        $VALUES = videoWatchLaterEventSourceArr;
        $ENTRIES = new asp(videoWatchLaterEventSourceArr);
    }

    public VideoWatchLaterEventSource(String str, int i, String str2) {
        this.wireValue = str2;
    }

    public static VideoWatchLaterEventSource valueOf(String str) {
        return (VideoWatchLaterEventSource) Enum.valueOf(VideoWatchLaterEventSource.class, str);
    }

    public static VideoWatchLaterEventSource[] values() {
        return (VideoWatchLaterEventSource[]) $VALUES.clone();
    }

    public final String h() {
        return this.wireValue;
    }
}
