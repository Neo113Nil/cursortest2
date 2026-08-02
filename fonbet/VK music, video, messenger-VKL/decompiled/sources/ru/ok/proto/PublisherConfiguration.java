package ru.ok.proto;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import ru.ok.media.utils.RateRange;
import ru.ok.proto.AudioAdaptationConfig;
import ru.ok.proto.BitrateConfiguration;
import xsna.h5s;
import xsna.tgw;

@Keep
/* loaded from: classes9.dex */
public class PublisherConfiguration {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean DEFAULT_AGC = true;
    public static final boolean DEFAULT_ATTACH_SN = false;
    public static final String DEFAULT_AUDIO_CONFIG = "{\"force44K\":{\n\"samsung\":[\"SM-.*\"],\n\"huawei\":[\"SLA-.*\"],\n\"xiaomi\":[\"Redmi.*\"],\n\"google\":[\"^Pixel 5$\"]\n}}";
    public static final int DEFAULT_AUDIO_DSHIFT = 1300;
    public static final boolean DEFAULT_CLEAN_SAVED_ON_STARTUP = true;
    public static final int DEFAULT_CREATION_STRATEGY = 4;
    public static final int DEFAULT_DUMP_FLAGS = 0;
    public static final int DEFAULT_EMULATE_PACKET_LOSS = 0;
    public static final int DEFAULT_EMULATE_RECV_ERROR_PERIOD_MILLIS = -1;
    public static final int DEFAULT_EMULATE_SEND_ERROR_PERIOD_MILLIS = -1;
    public static final boolean DEFAULT_ENCRYPT_AUDIO = false;
    public static final boolean DEFAULT_ENCRYPT_SIG = true;
    public static final boolean DEFAULT_ENCRYPT_VIDEO = false;
    public static final int DEFAULT_FIX_AUDIO_BR_KBPS = 0;
    public static final int DEFAULT_FIX_AUDIO_SR = 0;
    public static final int DEFAULT_KEYFRAME_INTERVAL = 3;
    public static final long DEFAULT_LOW_BANDWIDTH_MARK = 1048575;
    public static final int DEFAULT_MAX_DELAY_MS = 4500;
    public static final int DEFAULT_MAX_ENOBUFS_MILLIS = 0;
    public static final int DEFAULT_MAX_MTU = 1350;
    public static final int DEFAULT_MAX_RES = 720;
    public static final long DEFAULT_MAX_VIDEO_BITRATE = 9437184;
    public static final String DEFAULT_MIC_TYPE = "camcorder";
    public static final int DEFAULT_MIN_MTU = 300;
    public static final boolean DEFAULT_NS = true;
    public static final int DEFAULT_OKMP_THR_DOWN = 4000;
    public static final long DEFAULT_OVERRIDE_INITIAL_BITRATE = 0;
    public static final long DEFAULT_RECONNECT_TIMEOUT = 60000;
    public static final long DEFAULT_RESUME_TIMEOUT = 40000;
    public static final long DEFAULT_RETRY_COUNT = -1;
    public static final boolean DEFAULT_SAVE_AUDIO = false;
    public static final boolean DEFAULT_SAVE_FLV = false;
    public static final boolean DEFAULT_SAVE_SENT_FLV = false;
    public static final int DEFAULT_SEND_OVER_DELIVERY_MILLIS = 0;
    public static final int DEFAULT_SEND_OVER_DELIVERY_THRESHOLD = 3;
    public static final boolean DEFAULT_SUPPRESS_16K = true;
    public static String DEFAULT_SYSTEM_AUDIO_CFG = "{\"force44K\":{\"samsung\":[\"SM-.*\"],\"huawei\":[\"SLA-.*\"],\"xiaomi\":[\"Redmi.*\"],\"google\":[\"^Pixel 5\"]}}";
    public static final int DEFAULT_TOS = -1;
    public static final String DEFAULT_VENC_SETTINGS = "{\n\"yuv.wl\":{\n\"OMX\\\\.TI\\\\.DUCATI1.*\":{},\n\"OMX\\\\.qcom\\\\.video.*\":{}},\n\"max.isz\":{\".*\":{r:\"reset\"}}\n}";
    public static String DEFAULT_VIDEO_ENCODER_SETTINGS = "{\"yuv.wl\":{\"OMX\\.TI\\.DUCATI1.*\":{},\"OMX\\.qcom\\.video.*\":{}},\"max.isz\":{\".*\":{r:\"reset\"}}}";
    public static final int dumpAudioFrameCaptured = 128;
    public static final int dumpChannelFlush = 64;
    public static final int dumpDataAck = 16;
    public static final int dumpDatagramsReceived = 2;
    public static final int dumpDatagramsSent = 1;
    public static final int dumpRTTFromAck = 4;
    public static final int dumpRangeSent = 8;
    public static final int dumpSendInterrupt = 32;
    public static final int dumpVideoFrameCaptured = 256;
    public final boolean agc;
    public final boolean attachSN;

    @NonNull
    public final AudioAdaptationConfig audioConfig;

    @NonNull
    public final BitrateConfiguration bitrateConfig;
    public final boolean clean_saved_on_startup;
    public final int creationStrategy;
    public final int delayThresholdSwitchDown;
    public final int disguiseAudioShift;
    public final int dump_flags;
    public final int emulateRecvErrorPeriodMillis;
    public final int emulateSendErrorPeriodMillis;
    public final int emulate_packet_loss;
    public final boolean encryptAudio;
    public final boolean encryptSignalling;
    public final boolean encryptVideo;
    public final String fileNamePrefix;
    public final String fileTag;
    public final int fix_audio_br_kbps;
    public final int fix_audio_sr;
    public final int iframeIntervalSeconds;
    public final long lowBandwidthMark;
    public final int maxDelayMS;
    public final int maxMTU;
    public final int maxRes;
    public final long maxVideoBitrate;
    public final int max_enobufs_millis;

    @NonNull
    public final String microphoneType;
    public final int minMTU;
    public final boolean ns;
    public final long override_initial_bitrate;
    public final long reconnectTimeout;
    public final long resumeTimeout;
    public final long retryCount;
    public final boolean save_audio;
    public final boolean save_flv;
    public final boolean save_sent_flv;
    public final int send_over_delivery_millis;
    public final int send_over_delivery_threshold;
    public final boolean suppress16K;

    @NonNull
    public final String systemAudioCfg;
    public final int tos;

    @NonNull
    public final String videoEncoderSettings;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CreationStrategy {
        public static final int OKMP_LEGACY_AND_RTMP = 4;
        public static final int OKMP_LEGACY_ONLY = 1;
        public static final int OKMP_NATIVE_AND_RTMP = 3;
        public static final int OKMP_NATIVE_ONLY = 0;
        public static final int RTMP_ONLY = 2;
    }

    public PublisherConfiguration() {
        this.reconnectTimeout = 60000L;
        this.retryCount = -1L;
        this.resumeTimeout = DEFAULT_RESUME_TIMEOUT;
        this.creationStrategy = 4;
        this.bitrateConfig = new BitrateConfiguration.Builder().build();
        this.audioConfig = AudioAdaptationConfig.Builder.buildDefault();
        this.minMTU = 300;
        this.maxMTU = DEFAULT_MAX_MTU;
        this.agc = true;
        this.ns = true;
        this.suppress16K = true;
        this.systemAudioCfg = DEFAULT_AUDIO_CONFIG;
        this.encryptSignalling = true;
        this.encryptAudio = false;
        this.encryptVideo = false;
        this.maxRes = DEFAULT_MAX_RES;
        this.maxVideoBitrate = DEFAULT_MAX_VIDEO_BITRATE;
        this.videoEncoderSettings = DEFAULT_VENC_SETTINGS;
        this.microphoneType = DEFAULT_MIC_TYPE;
        this.attachSN = false;
        this.disguiseAudioShift = DEFAULT_AUDIO_DSHIFT;
        this.tos = -1;
        this.maxDelayMS = DEFAULT_MAX_DELAY_MS;
        this.delayThresholdSwitchDown = 4000;
        this.iframeIntervalSeconds = 3;
        this.emulateSendErrorPeriodMillis = -1;
        this.emulateRecvErrorPeriodMillis = -1;
        this.emulate_packet_loss = 0;
        this.max_enobufs_millis = 0;
        this.lowBandwidthMark = DEFAULT_LOW_BANDWIDTH_MARK;
        this.fileNamePrefix = "";
        this.fileTag = "";
        this.save_flv = false;
        this.save_sent_flv = false;
        this.save_audio = false;
        this.clean_saved_on_startup = true;
        this.fix_audio_sr = 0;
        this.fix_audio_br_kbps = 0;
        this.override_initial_bitrate = 0L;
        this.send_over_delivery_threshold = 3;
        this.send_over_delivery_millis = 0;
        this.dump_flags = 0;
    }

    public static int audioRateForBandwidth(long j) {
        long j2 = j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        return (j2 > 3000 ? PsExtractor.AUDIO_STREAM : j2 > 1000 ? 128 : j2 > 500 ? 64 : j2 > 300 ? 48 : 32) * 1024;
    }

    public static String getCreationStrategyName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? tgw.b(i, "<unknown ", ">") : "OKMP_LEGACY_AND_RTMP" : "OKMP_NATIVE_AND_RTMP" : "RTMP_ONLY" : "OKMP_LEGACY_ONLY" : "OKMP_NATIVE_ONLY";
    }

    public static boolean isOkmpLegacyEnabled(int i) {
        return i == 1 || i == 4;
    }

    public static boolean isOkmpNativeEnabled(int i) {
        return i == 0 || i == 3;
    }

    @NonNull
    public AudioAdaptationConfig.Entry audioParamsForBandwidth(long j, AudioAdaptationConfig.Entry entry) {
        return this.audioConfig.find(j, entry);
    }

    public int audioRateForVideoRate(long j, AudioAdaptationConfig.Entry entry) {
        AudioAdaptationConfig.Entry findForVideoRate = this.audioConfig.findForVideoRate(j, entry);
        if (findForVideoRate.isValid()) {
            return findForVideoRate.m_params.m_bitRate;
        }
        return 32000;
    }

    @NonNull
    public RateRange getRateRange(@NonNull AudioAdaptationConfig.Entry entry) {
        RateRange videoRateRange = getVideoRateRange();
        return new RateRange(videoRateRange.getMinRate() + audioRateForVideoRate(videoRateRange.getMinRate(), entry), videoRateRange.getMaxRate() + audioRateForVideoRate(videoRateRange.getMaxRate(), entry));
    }

    @NonNull
    public RateRange getVideoRateRange() {
        BitrateConfiguration bitrateConfiguration = this.bitrateConfig;
        if (bitrateConfiguration == null) {
            return new RateRange();
        }
        RateRange rateRange = bitrateConfiguration.getRateRange(this.maxRes);
        long minRate = rateRange.getMinRate();
        long maxRate = rateRange.getMaxRate();
        long j = this.maxVideoBitrate;
        if (j <= 0) {
            j = maxRate;
        }
        return new RateRange(minRate, rateRange.trimValue(Math.min(j, maxRate)));
    }

    public boolean isLowBandwidth(long j) {
        long j2 = this.lowBandwidthMark;
        return j2 > 0 && j <= j2;
    }

    public boolean isOkmpEnabled() {
        return isOkmpEnabled(this.creationStrategy);
    }

    public boolean isRtmpEnabled() {
        int i = this.creationStrategy;
        return i == 4 || i == 3 || i == 2;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("{\nreconnectTimeout = ");
        sb.append(this.reconnectTimeout);
        sb.append(",\nretryCount = ");
        sb.append(this.retryCount);
        sb.append(",\nresumeTimeout = ");
        sb.append(this.resumeTimeout);
        sb.append(",\ncreationStrategy = ");
        sb.append(getCreationStrategyName(this.creationStrategy));
        sb.append(" (");
        sb.append(this.creationStrategy);
        sb.append("),\nbitrateConfig = ");
        sb.append(this.bitrateConfig);
        sb.append(",\nminMTU = ");
        sb.append(this.minMTU);
        sb.append(",\nmaxMTU = ");
        sb.append(this.maxMTU);
        sb.append(",\nagc = ");
        sb.append(this.agc);
        sb.append(",\nns = ");
        sb.append(this.ns);
        sb.append(",\nsuppress16K = ");
        sb.append(this.suppress16K);
        sb.append(",\nsystemAudioCfg = \"");
        sb.append(this.systemAudioCfg);
        sb.append("\",\nencryptSignalling = ");
        sb.append(this.encryptSignalling);
        sb.append(",\nencryptAudio = ");
        sb.append(this.encryptAudio);
        sb.append(",\nencryptVideo = ");
        sb.append(this.encryptVideo);
        sb.append(",\nmaxRes = ");
        sb.append(this.maxRes);
        sb.append(",\nmaxVideoBitrate = ");
        sb.append(this.maxVideoBitrate);
        sb.append(",\nvideoEncoderSettings = \"");
        sb.append(this.videoEncoderSettings);
        sb.append("\",\nmicrophoneType = \"");
        sb.append(this.microphoneType);
        sb.append("\",\nattachSN = ");
        sb.append(this.attachSN);
        sb.append(",\ndisguiseAudioShift = ");
        sb.append(this.disguiseAudioShift);
        sb.append(",\ntos = ");
        sb.append(this.tos);
        sb.append(",\nmaxDelayMS = ");
        sb.append(this.maxDelayMS);
        sb.append(",\ndelayThresholdSwitchDown = ");
        sb.append(this.delayThresholdSwitchDown);
        sb.append(",\niframeIntervalSeconds = ");
        sb.append(this.iframeIntervalSeconds);
        sb.append(",\nemulateSendErrorPeriodMillis = ");
        sb.append(this.emulateSendErrorPeriodMillis);
        sb.append(",\nemulateRecvErrorPeriodMillis = ");
        sb.append(this.emulateRecvErrorPeriodMillis);
        sb.append(",\nlowBandwidthMark = ");
        sb.append(this.lowBandwidthMark);
        sb.append(",\nfileNamePrefix = ");
        sb.append(this.fileNamePrefix);
        sb.append("\nfileTag = ");
        sb.append(this.fileTag);
        sb.append("\nsave_flv = ");
        sb.append(this.save_flv);
        sb.append("\nsave_sent_flv = ");
        sb.append(this.save_sent_flv);
        sb.append("\nsave_audio = ");
        sb.append(this.save_audio);
        sb.append("\nclean_saved_on_startup = ");
        sb.append(this.clean_saved_on_startup);
        sb.append("\nfix_audio_sr = ");
        sb.append(this.fix_audio_sr);
        sb.append("\nfix_audio_br_kbps = ");
        sb.append(this.fix_audio_br_kbps);
        sb.append("\noverride_initial_bitrate = ");
        sb.append(this.override_initial_bitrate);
        sb.append("\nsend_over_delivery_threshold = ");
        sb.append(this.send_over_delivery_threshold);
        sb.append("\nsend_over_delivery_millis = ");
        sb.append(this.send_over_delivery_millis);
        sb.append("\ndump_flags = ");
        return h5s.c(this.dump_flags, "\n}", sb);
    }

    public int videoRateForBandwidth(long j, AudioAdaptationConfig.Entry entry) {
        long j2 = j - audioParamsForBandwidth(j, entry).m_params.m_bitRate;
        if (j2 < 0 || j2 > 2147483647L) {
            return 0;
        }
        return (int) j2;
    }

    public static boolean isOkmpEnabled(int i) {
        return isOkmpLegacyEnabled(i) || isOkmpNativeEnabled(i);
    }

    public boolean isOkmpLegacyEnabled() {
        return isOkmpLegacyEnabled(this.creationStrategy);
    }

    public boolean isOkmpNativeEnabled() {
        return isOkmpNativeEnabled(this.creationStrategy);
    }

    public static int audioRateForVideoRate(long j) {
        long j2 = j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        return (192 + j2 > 3000 ? PsExtractor.AUDIO_STREAM : 128 + j2 > 1000 ? 128 : 64 + j2 > 500 ? 64 : j2 + 48 > 300 ? 48 : 32) * 1024;
    }

    public static int videoRateForBandwidth(long j) {
        long audioRateForBandwidth = j - audioRateForBandwidth(j);
        if (audioRateForBandwidth < 0 || audioRateForBandwidth > 2147483647L) {
            return 0;
        }
        return (int) audioRateForBandwidth;
    }

    public PublisherConfiguration(long j, long j2, long j3, int i, @Nullable BitrateConfiguration bitrateConfiguration, @Nullable AudioAdaptationConfig audioAdaptationConfig, int i2, int i3, boolean z, boolean z2, boolean z3, @NonNull String str, boolean z4, boolean z5, boolean z6, int i4, long j4, @NonNull String str2, @NonNull String str3, boolean z7, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j5, String str4, String str5, boolean z8, boolean z9, boolean z10, boolean z11, int i14, int i15, long j6, int i16, int i17, int i18) {
        this.reconnectTimeout = j;
        this.retryCount = j2;
        this.resumeTimeout = j3;
        this.creationStrategy = i;
        if (bitrateConfiguration == null) {
            this.bitrateConfig = new BitrateConfiguration.Builder().build();
        } else {
            this.bitrateConfig = bitrateConfiguration;
        }
        if (audioAdaptationConfig == null) {
            this.audioConfig = AudioAdaptationConfig.Builder.buildDefault();
        } else {
            this.audioConfig = audioAdaptationConfig;
        }
        this.minMTU = i2;
        this.maxMTU = i3;
        this.agc = z;
        this.ns = z2;
        this.suppress16K = z3;
        this.systemAudioCfg = str;
        this.encryptSignalling = z4;
        this.encryptAudio = z5;
        this.encryptVideo = z6;
        this.maxRes = i4;
        this.maxVideoBitrate = j4;
        this.videoEncoderSettings = str2;
        this.microphoneType = str3;
        this.attachSN = z7;
        this.disguiseAudioShift = i5;
        this.tos = i6;
        this.maxDelayMS = i7;
        this.delayThresholdSwitchDown = i8;
        this.iframeIntervalSeconds = i9;
        this.emulateSendErrorPeriodMillis = i10;
        this.emulateRecvErrorPeriodMillis = i11;
        this.emulate_packet_loss = i12;
        this.max_enobufs_millis = i13;
        this.lowBandwidthMark = j5;
        this.fileNamePrefix = str4;
        this.fileTag = str5;
        this.save_flv = z8;
        this.save_sent_flv = z9;
        this.save_audio = z10;
        this.clean_saved_on_startup = z11;
        this.fix_audio_sr = i14;
        this.fix_audio_br_kbps = i15;
        this.override_initial_bitrate = j6;
        this.send_over_delivery_threshold = i16;
        this.send_over_delivery_millis = i17;
        this.dump_flags = i18;
    }
}
