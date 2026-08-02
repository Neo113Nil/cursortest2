package androidx.camera.video.internal.audio;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class AudioSource$InternalState {
    private static final /* synthetic */ AudioSource$InternalState[] $VALUES;
    public static final AudioSource$InternalState CONFIGURED;
    public static final AudioSource$InternalState RELEASED;
    public static final AudioSource$InternalState STARTED;

    static {
        AudioSource$InternalState audioSource$InternalState = new AudioSource$InternalState("CONFIGURED", 0);
        CONFIGURED = audioSource$InternalState;
        AudioSource$InternalState audioSource$InternalState2 = new AudioSource$InternalState("STARTED", 1);
        STARTED = audioSource$InternalState2;
        AudioSource$InternalState audioSource$InternalState3 = new AudioSource$InternalState("RELEASED", 2);
        RELEASED = audioSource$InternalState3;
        $VALUES = new AudioSource$InternalState[]{audioSource$InternalState, audioSource$InternalState2, audioSource$InternalState3};
    }

    public static AudioSource$InternalState valueOf(String str) {
        return (AudioSource$InternalState) Enum.valueOf(AudioSource$InternalState.class, str);
    }

    public static AudioSource$InternalState[] values() {
        return (AudioSource$InternalState[]) $VALUES.clone();
    }
}
