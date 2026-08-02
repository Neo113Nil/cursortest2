package ru.ok.android.webrtc.stat.scheme;

import ru.ok.android.externcalls.sdk.rate.loss.LossHintConfig;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class CallStatMetric {
    public static final CallStatMetric AudioBytesSent;
    public static final CallStatMetric AudioLevel;
    public static final CallStatMetric AudioLoss;
    public static final CallStatMetric AudioLossIn;
    public static final CallStatMetric BatteryLevelChange;
    public static final CallStatMetric ConcealedAudioSamples;
    public static final CallStatMetric ConcealedSilentAudioSamples;
    public static final CallStatMetric ConcealmentAudioAverageSize;
    public static final CallStatMetric CpuHardwareConcurrency;
    public static final CallStatMetric CpuScoreAvg;
    public static final CallStatMetric CpuScoreMax;
    public static final CallStatMetric CpuUsagePercentTotal;
    public static final CallStatMetric InsertedAudioSamplesForDeceleration;
    public static final CallStatMetric JitterAudio;
    public static final CallStatMetric MemoryUsageMbAvg;
    public static final CallStatMetric MemoryUsageMbMax;
    public static final CallStatMetric RTT;
    public static final CallStatMetric RemovedAudioSamplesForAcceleration;
    public static final CallStatMetric ScreenShareFreezeCount;
    public static final CallStatMetric ScreenShareFreezeDuration;
    public static final CallStatMetric TotalAudioEnergy;
    public static final CallStatMetric VideoAdaptationChanges;
    public static final CallStatMetric VideoBrEncode;
    public static final CallStatMetric VideoBrRetransmit;
    public static final CallStatMetric VideoBrTransmit;
    public static final CallStatMetric VideoFirReceived;
    public static final CallStatMetric VideoFirSent;
    public static final CallStatMetric VideoFramesDecoded;
    public static final CallStatMetric VideoFramesDropped;
    public static final CallStatMetric VideoFramesEncoded;
    public static final CallStatMetric VideoFreezeCount;
    public static final CallStatMetric VideoInterframeDelayVariance;
    public static final CallStatMetric VideoJitter;
    public static final CallStatMetric VideoLoss;
    public static final CallStatMetric VideoLossIn;
    public static final CallStatMetric VideoNackReceived;
    public static final CallStatMetric VideoNackSent;
    public static final CallStatMetric VideoPliReceived;
    public static final CallStatMetric VideoPliSent;
    public static final CallStatMetric VideoTotalFreezesDuration;
    public static final /* synthetic */ CallStatMetric[] b;
    public static final /* synthetic */ zrp c;
    public final String a;

    static {
        CallStatMetric callStatMetric = new CallStatMetric("RTT", 0, "rtt");
        RTT = callStatMetric;
        CallStatMetric callStatMetric2 = new CallStatMetric("ScreenShareFreezeCount", 1, "ss_freeze_count");
        ScreenShareFreezeCount = callStatMetric2;
        CallStatMetric callStatMetric3 = new CallStatMetric("ScreenShareFreezeDuration", 2, "ss_total_freezes_duration");
        ScreenShareFreezeDuration = callStatMetric3;
        CallStatMetric callStatMetric4 = new CallStatMetric("CpuUsagePercentTotal", 3, "cpu_usage_percent_total");
        CpuUsagePercentTotal = callStatMetric4;
        CallStatMetric callStatMetric5 = new CallStatMetric("CpuScoreMax", 4, "cpu_score_max");
        CpuScoreMax = callStatMetric5;
        CallStatMetric callStatMetric6 = new CallStatMetric("CpuScoreAvg", 5, "cpu_score_avg");
        CpuScoreAvg = callStatMetric6;
        CallStatMetric callStatMetric7 = new CallStatMetric("CpuHardwareConcurrency", 6, "cpu_hardware_concurrency");
        CpuHardwareConcurrency = callStatMetric7;
        CallStatMetric callStatMetric8 = new CallStatMetric("MemoryUsageMbMax", 7, "memory_usage_mb_max");
        MemoryUsageMbMax = callStatMetric8;
        CallStatMetric callStatMetric9 = new CallStatMetric("MemoryUsageMbAvg", 8, "memory_usage_mb_avg");
        MemoryUsageMbAvg = callStatMetric9;
        CallStatMetric callStatMetric10 = new CallStatMetric("BatteryLevelChange", 9, "battery_level_change");
        BatteryLevelChange = callStatMetric10;
        CallStatMetric callStatMetric11 = new CallStatMetric("InsertedAudioSamplesForDeceleration", 10, "inserted_audio_samples_for_deceleration");
        InsertedAudioSamplesForDeceleration = callStatMetric11;
        CallStatMetric callStatMetric12 = new CallStatMetric("RemovedAudioSamplesForAcceleration", 11, "removed_audio_samples_for_acceleration");
        RemovedAudioSamplesForAcceleration = callStatMetric12;
        CallStatMetric callStatMetric13 = new CallStatMetric("ConcealedAudioSamples", 12, "concealed_audio_samples");
        ConcealedAudioSamples = callStatMetric13;
        CallStatMetric callStatMetric14 = new CallStatMetric("JitterAudio", 13, "jitter_audio");
        JitterAudio = callStatMetric14;
        CallStatMetric callStatMetric15 = new CallStatMetric("ConcealedSilentAudioSamples", 14, "concealed_silent_audio_samples");
        ConcealedSilentAudioSamples = callStatMetric15;
        CallStatMetric callStatMetric16 = new CallStatMetric("ConcealmentAudioAverageSize", 15, "concealment_audio_avg_size");
        ConcealmentAudioAverageSize = callStatMetric16;
        CallStatMetric callStatMetric17 = new CallStatMetric("AudioLevel", 16, "audio_level");
        AudioLevel = callStatMetric17;
        CallStatMetric callStatMetric18 = new CallStatMetric("AudioBytesSent", 17, "audio_bytes_sent");
        AudioBytesSent = callStatMetric18;
        CallStatMetric callStatMetric19 = new CallStatMetric("TotalAudioEnergy", 18, "total_audio_energy");
        TotalAudioEnergy = callStatMetric19;
        CallStatMetric callStatMetric20 = new CallStatMetric("AudioLossIn", 19, "in_audio_loss");
        AudioLossIn = callStatMetric20;
        CallStatMetric callStatMetric21 = new CallStatMetric("AudioLoss", 20, LossHintConfig.AUDIO_LOSS);
        AudioLoss = callStatMetric21;
        CallStatMetric callStatMetric22 = new CallStatMetric("VideoNackSent", 21, "nack_sent");
        VideoNackSent = callStatMetric22;
        CallStatMetric callStatMetric23 = new CallStatMetric("VideoPliSent", 22, "pli_sent");
        VideoPliSent = callStatMetric23;
        CallStatMetric callStatMetric24 = new CallStatMetric("VideoFirSent", 23, "fir_sent");
        VideoFirSent = callStatMetric24;
        CallStatMetric callStatMetric25 = new CallStatMetric("VideoFramesDecoded", 24, "frames_decoded");
        VideoFramesDecoded = callStatMetric25;
        CallStatMetric callStatMetric26 = new CallStatMetric("VideoFramesDropped", 25, "frames_dropped");
        VideoFramesDropped = callStatMetric26;
        CallStatMetric callStatMetric27 = new CallStatMetric("VideoJitter", 26, "jitter_video");
        VideoJitter = callStatMetric27;
        CallStatMetric callStatMetric28 = new CallStatMetric("VideoInterframeDelayVariance", 27, "interframe_delay_variance");
        VideoInterframeDelayVariance = callStatMetric28;
        CallStatMetric callStatMetric29 = new CallStatMetric("VideoFreezeCount", 28, "freeze_count");
        VideoFreezeCount = callStatMetric29;
        CallStatMetric callStatMetric30 = new CallStatMetric("VideoTotalFreezesDuration", 29, "total_freezes_duration");
        VideoTotalFreezesDuration = callStatMetric30;
        CallStatMetric callStatMetric31 = new CallStatMetric("VideoLossIn", 30, "in_video_loss");
        VideoLossIn = callStatMetric31;
        CallStatMetric callStatMetric32 = new CallStatMetric("VideoLoss", 31, LossHintConfig.VIDEO_LOSS);
        VideoLoss = callStatMetric32;
        CallStatMetric callStatMetric33 = new CallStatMetric("VideoNackReceived", 32, "nack_received");
        VideoNackReceived = callStatMetric33;
        CallStatMetric callStatMetric34 = new CallStatMetric("VideoPliReceived", 33, "pli_received");
        VideoPliReceived = callStatMetric34;
        CallStatMetric callStatMetric35 = new CallStatMetric("VideoFirReceived", 34, "fir_received");
        VideoFirReceived = callStatMetric35;
        CallStatMetric callStatMetric36 = new CallStatMetric("VideoAdaptationChanges", 35, "adaptation_changes");
        VideoAdaptationChanges = callStatMetric36;
        CallStatMetric callStatMetric37 = new CallStatMetric("VideoFramesEncoded", 36, "frames_encoded");
        VideoFramesEncoded = callStatMetric37;
        CallStatMetric callStatMetric38 = new CallStatMetric("VideoBrEncode", 37, "br_encode");
        VideoBrEncode = callStatMetric38;
        CallStatMetric callStatMetric39 = new CallStatMetric("VideoBrTransmit", 38, "br_transmit");
        VideoBrTransmit = callStatMetric39;
        CallStatMetric callStatMetric40 = new CallStatMetric("VideoBrRetransmit", 39, "br_retransmit");
        VideoBrRetransmit = callStatMetric40;
        CallStatMetric[] callStatMetricArr = {callStatMetric, callStatMetric2, callStatMetric3, callStatMetric4, callStatMetric5, callStatMetric6, callStatMetric7, callStatMetric8, callStatMetric9, callStatMetric10, callStatMetric11, callStatMetric12, callStatMetric13, callStatMetric14, callStatMetric15, callStatMetric16, callStatMetric17, callStatMetric18, callStatMetric19, callStatMetric20, callStatMetric21, callStatMetric22, callStatMetric23, callStatMetric24, callStatMetric25, callStatMetric26, callStatMetric27, callStatMetric28, callStatMetric29, callStatMetric30, callStatMetric31, callStatMetric32, callStatMetric33, callStatMetric34, callStatMetric35, callStatMetric36, callStatMetric37, callStatMetric38, callStatMetric39, callStatMetric40};
        b = callStatMetricArr;
        c = new asp(callStatMetricArr);
    }

    public CallStatMetric(String str, int i, String str2) {
        this.a = str2;
    }

    public static zrp<CallStatMetric> getEntries() {
        return c;
    }

    public static CallStatMetric valueOf(String str) {
        return (CallStatMetric) Enum.valueOf(CallStatMetric.class, str);
    }

    public static CallStatMetric[] values() {
        return (CallStatMetric[]) b.clone();
    }

    public final String getKey() {
        return this.a;
    }
}
