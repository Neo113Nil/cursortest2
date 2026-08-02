package xsna;

import one.video.player.OneVideoPlayer;

/* compiled from: DiscontinuityReasonExt.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class k1n {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[OneVideoPlayer.DiscontinuityReason.values().length];
        try {
            iArr[OneVideoPlayer.DiscontinuityReason.AUTO_TRANSITION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OneVideoPlayer.DiscontinuityReason.SEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OneVideoPlayer.DiscontinuityReason.SEEK_ADJUSTMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OneVideoPlayer.DiscontinuityReason.SKIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[OneVideoPlayer.DiscontinuityReason.REMOVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[OneVideoPlayer.DiscontinuityReason.INTERNAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[OneVideoPlayer.DiscontinuityReason.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
