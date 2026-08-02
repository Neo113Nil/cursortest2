package ru.ok.android.webrtc.media_options;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaOption.kt */
/* loaded from: classes9.dex */
public final class MediaOption {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MediaOption[] $VALUES;
    public static final MediaOption AUDIO = new MediaOption(SignalingProtocol.MEDIA_OPTION_AUDIO, 0);
    public static final MediaOption VIDEO = new MediaOption(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
    public static final MediaOption SCREEN_SHARING = new MediaOption(SignalingProtocol.MEDIA_OPTION_SCREEN_SHARING, 2);
    public static final MediaOption MOVIE_SHARING = new MediaOption(SignalingProtocol.MEDIA_OPTION_MOVIE_SHARING, 3);

    private static final /* synthetic */ MediaOption[] $values() {
        return new MediaOption[]{AUDIO, VIDEO, SCREEN_SHARING, MOVIE_SHARING};
    }

    static {
        MediaOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private MediaOption(String str, int i) {
    }

    public static zrp<MediaOption> getEntries() {
        return $ENTRIES;
    }

    public static MediaOption valueOf(String str) {
        return (MediaOption) Enum.valueOf(MediaOption.class, str);
    }

    public static MediaOption[] values() {
        return (MediaOption[]) $VALUES.clone();
    }
}
