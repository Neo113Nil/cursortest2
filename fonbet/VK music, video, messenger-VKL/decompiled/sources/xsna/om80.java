package xsna;

import one.video.player.error.OneVideoPlaybackException;

/* compiled from: OneVideoPlaybackExceptionExt.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class om80 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[OneVideoPlaybackException.Type.values().length];
        try {
            iArr[OneVideoPlaybackException.Type.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OneVideoPlaybackException.Type.RENDERER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OneVideoPlaybackException.Type.UNEXPECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OneVideoPlaybackException.Type.REMOTE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[OneVideoPlaybackException.Type.UNRESOLVED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
