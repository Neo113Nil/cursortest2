package xsna;

import one.video.pip.config.data.PlaybackStatus;

/* compiled from: VideoPipParamsFactory.kt */
/* loaded from: classes8.dex */
public final class o3t0 {
    public final m3t0 a = new m3t0();
    public boolean b = true;

    /* compiled from: VideoPipParamsFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlaybackStatus.values().length];
            try {
                iArr[PlaybackStatus.AD_PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaybackStatus.PLAYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlaybackStatus.COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlaybackStatus.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlaybackStatus.AD_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PlaybackStatus.PAUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
