package ru.ok.media;

import android.os.Handler;
import one.video.streaming.tools.TimeMachine;
import ru.ok.media.api.LiveStreamStatReporter;
import ru.ok.media.api.Streamer;
import ru.ok.media.api.StreamerState;
import xsna.an10;
import xsna.jw5;
import xsna.qox;
import xsna.s3q0;
import xsna.vlc0;
import xsna.zcl;

/* compiled from: StreamingStatisticsHandler.kt */
/* loaded from: classes9.dex */
public final class StreamingStatisticsHandler {
    private static final Companion Companion = new Companion(null);
    private static final long REPORTING_INTERVAL_MS = 10000;
    private long lastReportAudioPacketsLost;
    private long lastReportBytesDropped;
    private long lastReportBytesRcvd;
    private long lastReportBytesSent;
    private long lastReportTimeMs;
    private long lastReportVideoFramesDropped;
    private long lastReportVideoPacketsLost;
    private long lastReportedTicks;
    private long lastReportedTicks2;
    private Streamer streamer;
    private final TimeMachine timeMachine;
    private qox timer;

    /* compiled from: StreamingStatisticsHandler.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int long2int(long j) {
            if (j > 2147483647L) {
                return -1;
            }
            return (int) j;
        }

        private Companion() {
        }
    }

    public StreamingStatisticsHandler(Streamer streamer, Handler handler, TimeMachine timeMachine) {
        this.streamer = streamer;
        this.timeMachine = timeMachine;
        this.lastReportTimeMs = timeMachine.currentTimeMillis();
        this.timer = new qox(handler, 10000L, 10000L, timeMachine, new vlc0(this, 16));
    }

    private final void gatherStatistic() {
        LiveStreamStatReporter statsReporter;
        Streamer streamer = this.streamer;
        if (streamer == null || (statsReporter = streamer.getStatsReporter()) == null) {
            return;
        }
        StreamerStatistic statistic = streamer.getStatistic();
        long currentTimeMillis = this.timeMachine.currentTimeMillis();
        long j = currentTimeMillis - this.lastReportTimeMs;
        this.lastReportTimeMs = currentTimeMillis;
        statsReporter.streamLink(statistic.getState(), statistic.getLinkStats());
        StreamerPacketsInfo packetsInfo = statistic.getPacketsInfo();
        Companion companion = Companion;
        int long2int = companion.long2int(j);
        StreamerState state = statistic.getState();
        Integer width = statistic.getWidth();
        Integer height = statistic.getHeight();
        int a = an10.a(statistic.getFps());
        Double altFps = statistic.getAltFps();
        Integer valueOf = altFps != null ? Integer.valueOf(an10.a(altFps.doubleValue())) : null;
        int bitrate = statistic.getBitrate();
        Integer altBitrate = statistic.getAltBitrate();
        Integer num = valueOf;
        int bandwidth = statistic.getBandwidth();
        long bytesSent = packetsInfo.getBytesSent() - this.lastReportBytesSent;
        long bytesReceived = packetsInfo.getBytesReceived() - this.lastReportBytesRcvd;
        long bytesDropped = packetsInfo.getBytesDropped() - this.lastReportBytesDropped;
        int long2int2 = companion.long2int(statistic.getVideoFramesDropped() - this.lastReportVideoFramesDropped);
        int long2int3 = companion.long2int(packetsInfo.getVideoPacketsLost() - this.lastReportVideoPacketsLost);
        int long2int4 = companion.long2int(packetsInfo.getAudioPacketsLost() - this.lastReportAudioPacketsLost);
        long ticks = statistic.getTicks() - this.lastReportedTicks;
        int[] lastBlocksNative = statistic.getLastBlocksNative();
        Integer[] B = lastBlocksNative != null ? jw5.B(lastBlocksNative) : null;
        long ticks2 = statistic.getTicks2() - this.lastReportedTicks2;
        int[] lastBlocks = statistic.getLastBlocks();
        statsReporter.streamQuality(long2int, state, width, height, a, num, bitrate, altBitrate, bandwidth, bytesSent, bytesReceived, bytesDropped, long2int2, long2int3, long2int4, ticks, B, ticks2, lastBlocks != null ? jw5.B(lastBlocks) : null);
        this.lastReportBytesSent = packetsInfo.getBytesSent();
        this.lastReportBytesRcvd = packetsInfo.getBytesReceived();
        this.lastReportBytesDropped = packetsInfo.getBytesDropped();
        this.lastReportVideoFramesDropped = statistic.getVideoFramesDropped();
        this.lastReportVideoPacketsLost = packetsInfo.getVideoPacketsLost();
        this.lastReportAudioPacketsLost = packetsInfo.getAudioPacketsLost();
        this.lastReportedTicks = statistic.getTicks();
        this.lastReportedTicks2 = statistic.getTicks2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 timer$lambda$0(StreamingStatisticsHandler streamingStatisticsHandler, qox qoxVar) {
        streamingStatisticsHandler.gatherStatistic();
        return s3q0.a;
    }

    public final void cleanup() {
        qox qoxVar = this.timer;
        if (qoxVar != null) {
            qoxVar.b();
        }
        this.timer = null;
        this.streamer = null;
    }
}
