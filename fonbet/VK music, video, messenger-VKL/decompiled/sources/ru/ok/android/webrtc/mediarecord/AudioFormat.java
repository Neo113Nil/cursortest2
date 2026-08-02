package ru.ok.android.webrtc.mediarecord;

import okcalls.f;
import okcalls.g;
import okcalls.h;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.RTCLog;
import xsna.lhg;
import xsna.sni0;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class AudioFormat {

    @Deprecated
    public static final String LOG_TAG = "AudioUtils";

    @Deprecated
    public static final Integer[] PREFERRED_SAMPLE_RATES = {48000, 44100, 24000, 16000, 8000};

    @Deprecated
    public static boolean weirdAudioSamplingRateAlreadyReported;
    public final Config a;
    public final RTCLog b;

    public static final class Config {
        public final boolean a;
        public final boolean b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Config() {
            this(r2, r2, 3, null);
            boolean z = false;
        }

        public static /* synthetic */ Config copy$default(Config config, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = config.a;
            }
            if ((i & 2) != 0) {
                z2 = config.b;
            }
            return config.copy(z, z2);
        }

        public final boolean component1() {
            return this.a;
        }

        public final boolean component2() {
            return this.b;
        }

        public final Config copy(boolean z, boolean z2) {
            return new Config(z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.a == config.a && this.b == config.b;
        }

        public final boolean getReportWeirdConfig() {
            return this.b;
        }

        public int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final boolean isEnabled() {
            return this.a;
        }

        public String toString() {
            return sni0.a("Config(isEnabled=", ", reportWeirdConfig=", ")", this.a, this.b);
        }

        public Config(boolean z) {
            this(z, false, 2, null);
        }

        public Config(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public /* synthetic */ Config(boolean z, boolean z2, int i, zcl zclVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }
    }

    public AudioFormat(Config config, RTCLog rTCLog) {
        this.a = config;
        this.b = rTCLog;
    }

    public final Integer a() {
        if (!this.a.isEnabled()) {
            return null;
        }
        Integer[] numArr = PREFERRED_SAMPLE_RATES;
        int length = numArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                f fVar = new f();
                RTCLog rTCLog = this.b;
                String message = fVar.getMessage();
                rTCLog.reportException(LOG_TAG, message != null ? message : "", fVar);
                return null;
            }
            Integer num = numArr[i];
            int intValue = num.intValue();
            if (android.media.AudioRecord.getMinBufferSize(intValue, 16, 2) > 0) {
                if (intValue < PREFERRED_SAMPLE_RATES[0].intValue() && this.a.getReportWeirdConfig() && !weirdAudioSamplingRateAlreadyReported) {
                    h hVar = new h(lhg.a(intValue, "Unexpected sampling rate selected: "));
                    RTCLog rTCLog2 = this.b;
                    String message2 = hVar.getMessage();
                    rTCLog2.reportException(LOG_TAG, message2 != null ? message2 : "", hVar);
                    weirdAudioSamplingRateAlreadyReported = true;
                }
                this.b.log(LOG_TAG, "Found usable recording sample rate: " + intValue);
                return num;
            }
            this.b.log(LOG_TAG, "Recording sampling rate of " + intValue + " doesn't supported by device");
            i++;
        }
    }

    @CallInternalApi
    public final Integer getSampleRateForAudioRecord() {
        try {
            return a();
        } catch (Throwable th) {
            g gVar = new g(th);
            RTCLog rTCLog = this.b;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            rTCLog.reportException(LOG_TAG, message, gVar);
            return null;
        }
    }
}
