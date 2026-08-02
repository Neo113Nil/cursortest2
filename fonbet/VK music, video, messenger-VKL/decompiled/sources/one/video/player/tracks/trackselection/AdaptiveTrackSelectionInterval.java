package one.video.player.tracks.trackselection;

import one.video.player.model.FrameSize;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdaptiveTrackSelectionInterval.kt */
/* loaded from: classes8.dex */
public final class AdaptiveTrackSelectionInterval {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdaptiveTrackSelectionInterval[] $VALUES;
    public static final AdaptiveTrackSelectionInterval DEFAULT;
    public static final AdaptiveTrackSelectionInterval HIGH;
    public static final AdaptiveTrackSelectionInterval LOW;
    private final FrameSize maxFrameSize;
    private final FrameSize minFrameSize;

    static {
        FrameSize.a aVar = FrameSize.Companion;
        aVar.getClass();
        FrameSize frameSize = FrameSize._144p;
        aVar.getClass();
        FrameSize frameSize2 = FrameSize._4320p;
        AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval = new AdaptiveTrackSelectionInterval("DEFAULT", 0, frameSize, frameSize2);
        DEFAULT = adaptiveTrackSelectionInterval;
        aVar.getClass();
        FrameSize frameSize3 = FrameSize._480p;
        AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval2 = new AdaptiveTrackSelectionInterval("LOW", 1, frameSize, frameSize3);
        LOW = adaptiveTrackSelectionInterval2;
        aVar.getClass();
        AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval3 = new AdaptiveTrackSelectionInterval("HIGH", 2, frameSize3, frameSize2);
        HIGH = adaptiveTrackSelectionInterval3;
        AdaptiveTrackSelectionInterval[] adaptiveTrackSelectionIntervalArr = {adaptiveTrackSelectionInterval, adaptiveTrackSelectionInterval2, adaptiveTrackSelectionInterval3};
        $VALUES = adaptiveTrackSelectionIntervalArr;
        $ENTRIES = new asp(adaptiveTrackSelectionIntervalArr);
    }

    public AdaptiveTrackSelectionInterval(String str, int i, FrameSize frameSize, FrameSize frameSize2) {
        this.minFrameSize = frameSize;
        this.maxFrameSize = frameSize2;
    }

    public static AdaptiveTrackSelectionInterval valueOf(String str) {
        return (AdaptiveTrackSelectionInterval) Enum.valueOf(AdaptiveTrackSelectionInterval.class, str);
    }

    public static AdaptiveTrackSelectionInterval[] values() {
        return (AdaptiveTrackSelectionInterval[]) $VALUES.clone();
    }

    public final FrameSize h() {
        return this.maxFrameSize;
    }

    public final FrameSize i() {
        return this.minFrameSize;
    }
}
