package com.yandex.go.navigator.repository;

import defpackage.cz31;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/navigator/repository/VoiceMode;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "cz31", "TURN_OFF", "ACCIDENTS_ONLY", "ALL_SOUND", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VoiceMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VoiceMode[] $VALUES;
    public static final VoiceMode ACCIDENTS_ONLY;
    public static final VoiceMode ALL_SOUND;
    public static final cz31 Companion;
    public static final VoiceMode TURN_OFF;
    private final String id;

    static {
        VoiceMode voiceMode = new VoiceMode("TURN_OFF", 0, "turn_off");
        TURN_OFF = voiceMode;
        VoiceMode voiceMode2 = new VoiceMode("ACCIDENTS_ONLY", 1, "accidents_only");
        ACCIDENTS_ONLY = voiceMode2;
        VoiceMode voiceMode3 = new VoiceMode("ALL_SOUND", 2, "all_sound");
        ALL_SOUND = voiceMode3;
        VoiceMode[] voiceModeArr = {voiceMode, voiceMode2, voiceMode3};
        $VALUES = voiceModeArr;
        $ENTRIES = kotlin.enums.a.a(voiceModeArr);
        Companion = new cz31();
    }

    public VoiceMode(String str, int i, String str2) {
        this.id = str2;
    }

    public static VoiceMode valueOf(String str) {
        return (VoiceMode) Enum.valueOf(VoiceMode.class, str);
    }

    public static VoiceMode[] values() {
        return (VoiceMode[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
