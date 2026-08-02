package one.video.player.live.media.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class DecoderInterface$FrameAction {
    private static final /* synthetic */ DecoderInterface$FrameAction[] $VALUES;
    public static final DecoderInterface$FrameAction DROP;
    public static final DecoderInterface$FrameAction PLAY;
    public static final DecoderInterface$FrameAction PLAY_IMMEDIATELY;

    static {
        DecoderInterface$FrameAction decoderInterface$FrameAction = new DecoderInterface$FrameAction("PLAY", 0);
        PLAY = decoderInterface$FrameAction;
        DecoderInterface$FrameAction decoderInterface$FrameAction2 = new DecoderInterface$FrameAction("PLAY_IMMEDIATELY", 1);
        PLAY_IMMEDIATELY = decoderInterface$FrameAction2;
        DecoderInterface$FrameAction decoderInterface$FrameAction3 = new DecoderInterface$FrameAction("DROP", 2);
        DROP = decoderInterface$FrameAction3;
        $VALUES = new DecoderInterface$FrameAction[]{decoderInterface$FrameAction, decoderInterface$FrameAction2, decoderInterface$FrameAction3};
    }

    public DecoderInterface$FrameAction() {
        throw null;
    }

    public static DecoderInterface$FrameAction valueOf(String str) {
        return (DecoderInterface$FrameAction) Enum.valueOf(DecoderInterface$FrameAction.class, str);
    }

    public static DecoderInterface$FrameAction[] values() {
        return (DecoderInterface$FrameAction[]) $VALUES.clone();
    }
}
