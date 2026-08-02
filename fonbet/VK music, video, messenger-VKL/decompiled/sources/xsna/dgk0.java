package xsna;

import one.video.player.error.OneVideoPlaybackException;

/* compiled from: SourceErrorResolver.kt */
/* loaded from: classes8.dex */
public final class dgk0 {
    public static final k9x c = new k9x(200, 299, 1);
    public final vw3 a;
    public final boolean b;

    /* compiled from: SourceErrorResolver.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OneVideoPlaybackException.ErrorCode.values().length];
            try {
                iArr[OneVideoPlaybackException.ErrorCode.IO_BAD_HTTP_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OneVideoPlaybackException.ErrorCode.IO_UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OneVideoPlaybackException.ErrorCode.PARSING_MANIFEST_MALFORMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OneVideoPlaybackException.ErrorCode.PARSING_CONTAINER_MALFORMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OneVideoPlaybackException.ErrorCode.BEHIND_LIVE_WINDOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dgk0(vw3 vw3Var, boolean z) {
        this.a = vw3Var;
        this.b = z;
    }
}
