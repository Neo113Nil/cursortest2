package xsna;

import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;

/* compiled from: TouchBoundsExpansion.kt */
@vby
/* loaded from: classes11.dex */
public final class cdp0 {
    public static final long a = a.b(0, 0, 0, 0);
    public static final /* synthetic */ int b = 0;

    /* compiled from: TouchBoundsExpansion.kt */
    public static final class a {
        public static final int a(int i, long j) {
            int i2 = cdp0.b;
            return ((int) (j >> (i * 15))) & OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND;
        }

        public static long b(int i, int i2, int i3, int i4) {
            return ((i2 & OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND) << 15) | (i & OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND) | ((i3 & OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND) << 30) | ((i4 & OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND) << 45) | Long.MIN_VALUE;
        }
    }
}
