package ru.ok.tracer;

import com.huawei.hms.api.ConnectionResult;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import xsna.epx;
import xsna.zcl;

/* compiled from: Severity.kt */
/* loaded from: classes9.dex */
public final class Severity implements Comparable<Severity> {
    private final int intValue;
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final Severity FATAL = new Severity("FATAL", ConnectionResult.NETWORK_ERROR);
    public static final Severity ERROR = new Severity("ERROR", RtpSenderHelper.AUDIO_BITRATE_MIN);
    public static final Severity WARNING = new Severity("WARNING", 5000);
    public static final Severity NOTICE = new Severity("NOTICE", 4000);
    public static final Severity INFO = new Severity("INFO", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
    public static final Severity DEBUG = new Severity("DEBUG", 2000);

    /* compiled from: Severity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    private Severity(String str, int i) {
        this.name = str;
        this.intValue = i;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return this.name;
    }

    @Override // java.lang.Comparable
    public int compareTo(Severity severity) {
        return epx.g(this.intValue, severity.intValue);
    }
}
