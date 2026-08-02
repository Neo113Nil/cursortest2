package one.video.exo.error;

import one.video.player.error.OneVideoPlaybackException;

/* compiled from: OneVideoExoPlaybackException.kt */
/* loaded from: classes8.dex */
public final class OneVideoExoPlaybackException extends OneVideoPlaybackException {

    /* compiled from: OneVideoExoPlaybackException.kt */
    public static final /* synthetic */ class a {
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
}
