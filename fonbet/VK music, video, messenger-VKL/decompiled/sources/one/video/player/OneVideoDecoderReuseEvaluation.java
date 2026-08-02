package one.video.player;

import java.util.EnumSet;
import xsna.asp;
import xsna.er10;
import xsna.zrp;

/* compiled from: OneVideoDecoderReuseEvaluation.kt */
/* loaded from: classes8.dex */
public final class OneVideoDecoderReuseEvaluation {
    public final String a;
    public final er10 b;
    public final er10 c;
    public final DecoderReuseResult d;
    public final EnumSet<DecoderDiscardReasons> e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OneVideoDecoderReuseEvaluation.kt */
    public static final class DecoderDiscardReasons {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DecoderDiscardReasons[] $VALUES;
        public static final DecoderDiscardReasons DISCARD_REASON_APP_OVERRIDE;
        public static final DecoderDiscardReasons DISCARD_REASON_AUDIO_BYPASS_POSSIBLE;
        public static final DecoderDiscardReasons DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;
        public static final DecoderDiscardReasons DISCARD_REASON_AUDIO_ENCODING_CHANGED;
        public static final DecoderDiscardReasons DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED;
        public static final DecoderDiscardReasons DISCARD_REASON_DRM_SESSION_CHANGED;
        public static final DecoderDiscardReasons DISCARD_REASON_INITIALIZATION_DATA_CHANGED;
        public static final DecoderDiscardReasons DISCARD_REASON_MAX_INPUT_SIZE_EXCEEDED;
        public static final DecoderDiscardReasons DISCARD_REASON_MIME_TYPE_CHANGED;
        public static final DecoderDiscardReasons DISCARD_REASON_OPERATING_RATE_CHANGED;
        public static final DecoderDiscardReasons DISCARD_REASON_REUSE_NOT_IMPLEMENTED;
        public static final DecoderDiscardReasons DISCARD_REASON_VIDEO_COLOR_INFO_CHANGED;
        public static final DecoderDiscardReasons DISCARD_REASON_VIDEO_MAX_RESOLUTION_EXCEEDED;
        public static final DecoderDiscardReasons DISCARD_REASON_VIDEO_RESOLUTION_CHANGED;
        public static final DecoderDiscardReasons DISCARD_REASON_VIDEO_ROTATION_CHANGED;
        public static final DecoderDiscardReasons DISCARD_REASON_WORKAROUND;
        private final int value;

        static {
            DecoderDiscardReasons decoderDiscardReasons = new DecoderDiscardReasons("DISCARD_REASON_REUSE_NOT_IMPLEMENTED", 0, 1);
            DISCARD_REASON_REUSE_NOT_IMPLEMENTED = decoderDiscardReasons;
            DecoderDiscardReasons decoderDiscardReasons2 = new DecoderDiscardReasons("DISCARD_REASON_WORKAROUND", 1, 2);
            DISCARD_REASON_WORKAROUND = decoderDiscardReasons2;
            DecoderDiscardReasons decoderDiscardReasons3 = new DecoderDiscardReasons("DISCARD_REASON_APP_OVERRIDE", 2, 4);
            DISCARD_REASON_APP_OVERRIDE = decoderDiscardReasons3;
            DecoderDiscardReasons decoderDiscardReasons4 = new DecoderDiscardReasons("DISCARD_REASON_MIME_TYPE_CHANGED", 3, 8);
            DISCARD_REASON_MIME_TYPE_CHANGED = decoderDiscardReasons4;
            DecoderDiscardReasons decoderDiscardReasons5 = new DecoderDiscardReasons("DISCARD_REASON_OPERATING_RATE_CHANGED", 4, 16);
            DISCARD_REASON_OPERATING_RATE_CHANGED = decoderDiscardReasons5;
            DecoderDiscardReasons decoderDiscardReasons6 = new DecoderDiscardReasons("DISCARD_REASON_INITIALIZATION_DATA_CHANGED", 5, 32);
            DISCARD_REASON_INITIALIZATION_DATA_CHANGED = decoderDiscardReasons6;
            DecoderDiscardReasons decoderDiscardReasons7 = new DecoderDiscardReasons("DISCARD_REASON_MAX_INPUT_SIZE_EXCEEDED", 6, 64);
            DISCARD_REASON_MAX_INPUT_SIZE_EXCEEDED = decoderDiscardReasons7;
            DecoderDiscardReasons decoderDiscardReasons8 = new DecoderDiscardReasons("DISCARD_REASON_DRM_SESSION_CHANGED", 7, 128);
            DISCARD_REASON_DRM_SESSION_CHANGED = decoderDiscardReasons8;
            DecoderDiscardReasons decoderDiscardReasons9 = new DecoderDiscardReasons("DISCARD_REASON_VIDEO_MAX_RESOLUTION_EXCEEDED", 8, 256);
            DISCARD_REASON_VIDEO_MAX_RESOLUTION_EXCEEDED = decoderDiscardReasons9;
            DecoderDiscardReasons decoderDiscardReasons10 = new DecoderDiscardReasons("DISCARD_REASON_VIDEO_RESOLUTION_CHANGED", 9, 512);
            DISCARD_REASON_VIDEO_RESOLUTION_CHANGED = decoderDiscardReasons10;
            DecoderDiscardReasons decoderDiscardReasons11 = new DecoderDiscardReasons("DISCARD_REASON_VIDEO_ROTATION_CHANGED", 10, 1024);
            DISCARD_REASON_VIDEO_ROTATION_CHANGED = decoderDiscardReasons11;
            DecoderDiscardReasons decoderDiscardReasons12 = new DecoderDiscardReasons("DISCARD_REASON_VIDEO_COLOR_INFO_CHANGED", 11, 2048);
            DISCARD_REASON_VIDEO_COLOR_INFO_CHANGED = decoderDiscardReasons12;
            DecoderDiscardReasons decoderDiscardReasons13 = new DecoderDiscardReasons("DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED", 12, 4096);
            DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED = decoderDiscardReasons13;
            DecoderDiscardReasons decoderDiscardReasons14 = new DecoderDiscardReasons("DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED", 13, 8192);
            DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED = decoderDiscardReasons14;
            DecoderDiscardReasons decoderDiscardReasons15 = new DecoderDiscardReasons("DISCARD_REASON_AUDIO_ENCODING_CHANGED", 14, 16384);
            DISCARD_REASON_AUDIO_ENCODING_CHANGED = decoderDiscardReasons15;
            DecoderDiscardReasons decoderDiscardReasons16 = new DecoderDiscardReasons("DISCARD_REASON_AUDIO_BYPASS_POSSIBLE", 15, 32768);
            DISCARD_REASON_AUDIO_BYPASS_POSSIBLE = decoderDiscardReasons16;
            DecoderDiscardReasons[] decoderDiscardReasonsArr = {decoderDiscardReasons, decoderDiscardReasons2, decoderDiscardReasons3, decoderDiscardReasons4, decoderDiscardReasons5, decoderDiscardReasons6, decoderDiscardReasons7, decoderDiscardReasons8, decoderDiscardReasons9, decoderDiscardReasons10, decoderDiscardReasons11, decoderDiscardReasons12, decoderDiscardReasons13, decoderDiscardReasons14, decoderDiscardReasons15, decoderDiscardReasons16};
            $VALUES = decoderDiscardReasonsArr;
            $ENTRIES = new asp(decoderDiscardReasonsArr);
        }

        public DecoderDiscardReasons(String str, int i, int i2) {
            this.value = i2;
        }

        public static zrp<DecoderDiscardReasons> h() {
            return $ENTRIES;
        }

        public static DecoderDiscardReasons valueOf(String str) {
            return (DecoderDiscardReasons) Enum.valueOf(DecoderDiscardReasons.class, str);
        }

        public static DecoderDiscardReasons[] values() {
            return (DecoderDiscardReasons[]) $VALUES.clone();
        }

        public final int a(int i) {
            return i & this.value;
        }

        public final int i(int i) {
            return i | this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OneVideoDecoderReuseEvaluation.kt */
    public static final class DecoderReuseResult {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DecoderReuseResult[] $VALUES;
        public static final DecoderReuseResult NO;
        public static final DecoderReuseResult YES_WITHOUT_RECONFIGURATION;
        public static final DecoderReuseResult YES_WITH_FLUSH;
        public static final DecoderReuseResult YES_WITH_RECONFIGURATION;

        static {
            DecoderReuseResult decoderReuseResult = new DecoderReuseResult("NO", 0);
            NO = decoderReuseResult;
            DecoderReuseResult decoderReuseResult2 = new DecoderReuseResult("YES_WITH_FLUSH", 1);
            YES_WITH_FLUSH = decoderReuseResult2;
            DecoderReuseResult decoderReuseResult3 = new DecoderReuseResult("YES_WITH_RECONFIGURATION", 2);
            YES_WITH_RECONFIGURATION = decoderReuseResult3;
            DecoderReuseResult decoderReuseResult4 = new DecoderReuseResult("YES_WITHOUT_RECONFIGURATION", 3);
            YES_WITHOUT_RECONFIGURATION = decoderReuseResult4;
            DecoderReuseResult[] decoderReuseResultArr = {decoderReuseResult, decoderReuseResult2, decoderReuseResult3, decoderReuseResult4};
            $VALUES = decoderReuseResultArr;
            $ENTRIES = new asp(decoderReuseResultArr);
        }

        public DecoderReuseResult() {
            throw null;
        }

        public static DecoderReuseResult valueOf(String str) {
            return (DecoderReuseResult) Enum.valueOf(DecoderReuseResult.class, str);
        }

        public static DecoderReuseResult[] values() {
            return (DecoderReuseResult[]) $VALUES.clone();
        }
    }

    public OneVideoDecoderReuseEvaluation(String str, er10 er10Var, er10 er10Var2, DecoderReuseResult decoderReuseResult, EnumSet<DecoderDiscardReasons> enumSet) {
        this.a = str;
        this.b = er10Var;
        this.c = er10Var2;
        this.d = decoderReuseResult;
        this.e = enumSet;
    }

    public final String toString() {
        return "OneVideoDecoderReuseEvaluation(decoderName='" + this.a + "', oldFormat=" + this.b + ", newFormat=" + this.c + ", result=" + this.d + ", discardReasons=" + this.e + ")";
    }
}
