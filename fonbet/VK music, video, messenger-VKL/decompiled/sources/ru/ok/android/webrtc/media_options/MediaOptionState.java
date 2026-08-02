package ru.ok.android.webrtc.media_options;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaOptionState.kt */
/* loaded from: classes9.dex */
public final class MediaOptionState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MediaOptionState[] $VALUES;
    public static final MediaOptionState UNMUTED = new MediaOptionState("UNMUTED", 0);
    public static final MediaOptionState UNMUTED_BUT_MUTED_ONCE = new MediaOptionState("UNMUTED_BUT_MUTED_ONCE", 1);
    public static final MediaOptionState MUTED_PERMANENT = new MediaOptionState("MUTED_PERMANENT", 2);
    public static final MediaOptionState MUTED_PERMANENT_BUT_UNMUTED_ONCE = new MediaOptionState("MUTED_PERMANENT_BUT_UNMUTED_ONCE", 3);

    private static final /* synthetic */ MediaOptionState[] $values() {
        return new MediaOptionState[]{UNMUTED, UNMUTED_BUT_MUTED_ONCE, MUTED_PERMANENT, MUTED_PERMANENT_BUT_UNMUTED_ONCE};
    }

    static {
        MediaOptionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private MediaOptionState(String str, int i) {
    }

    public static zrp<MediaOptionState> getEntries() {
        return $ENTRIES;
    }

    public static MediaOptionState valueOf(String str) {
        return (MediaOptionState) Enum.valueOf(MediaOptionState.class, str);
    }

    public static MediaOptionState[] values() {
        return (MediaOptionState[]) $VALUES.clone();
    }
}
