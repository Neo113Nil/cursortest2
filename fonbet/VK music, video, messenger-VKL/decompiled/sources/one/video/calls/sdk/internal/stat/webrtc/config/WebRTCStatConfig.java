package one.video.calls.sdk.internal.stat.webrtc.config;

import java.util.Set;
import ru.ok.android.annotation.CallInternalApi;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: WebRTCStatConfig.kt */
@CallInternalApi
/* loaded from: classes8.dex */
public final class WebRTCStatConfig {
    public final Set<LogItemType> a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebRTCStatConfig.kt */
    public static final class LogItemType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LogItemType[] $VALUES;
        public static final LogItemType CANDIDATE;
        public static final a Companion;
        public static final LogItemType NONE;
        public static final LogItemType SDP;
        public static final LogItemType SIGNALING;
        private final String key;

        /* compiled from: WebRTCStatConfig.kt */
        public static final class a {
        }

        static {
            LogItemType logItemType = new LogItemType("NONE", 0, "none");
            NONE = logItemType;
            LogItemType logItemType2 = new LogItemType("CANDIDATE", 1, "candidate");
            CANDIDATE = logItemType2;
            LogItemType logItemType3 = new LogItemType("SIGNALING", 2, "signaling");
            SIGNALING = logItemType3;
            LogItemType logItemType4 = new LogItemType("SDP", 3, "sdp");
            SDP = logItemType4;
            LogItemType[] logItemTypeArr = {logItemType, logItemType2, logItemType3, logItemType4};
            $VALUES = logItemTypeArr;
            $ENTRIES = new asp(logItemTypeArr);
            Companion = new a();
        }

        public LogItemType(String str, int i, String str2) {
            this.key = str2;
        }

        public static zrp<LogItemType> h() {
            return $ENTRIES;
        }

        public static LogItemType valueOf(String str) {
            return (LogItemType) Enum.valueOf(LogItemType.class, str);
        }

        public static LogItemType[] values() {
            return (LogItemType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebRTCStatConfig(Set<? extends LogItemType> set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebRTCStatConfig) && epx.f(this.a, ((WebRTCStatConfig) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WebRTCStatConfig(allowedLogItems=" + this.a + ")";
    }
}
