package ru.ok.media;

import ru.ok.media.api.StreamerState;

/* compiled from: StreamerStatistic.kt */
/* loaded from: classes9.dex */
public final class StreamerStatistic {
    private final Integer altBitrate;
    private final Double altFps;
    private final int averageOverheadBitrate;
    private final int bandwidth;
    private final int bitrate;
    private final int connectionId;
    private final String debugInfo;
    private final double fps;
    private final Integer height;
    private final int[] lastBlocks;
    private final int[] lastBlocksNative;
    private final Long lastPresentationTimeInSeconds;
    private final StreamerLinkStats linkStats;
    private final StreamerLinkState networkState;
    private final StreamerPacketsInfo packetsInfo;
    private final String proto;
    private final StreamQuality quality;
    private final Integer rotationAngle;
    private final StreamerState state;
    private final long ticks;
    private final long ticks2;
    private final long videoFramesDropped;
    private final Integer width;

    public StreamerStatistic(String str, StreamerState streamerState, double d, Double d2, int i, StreamerPacketsInfo streamerPacketsInfo, long j, int i2, Integer num, int i3, int i4, Long l, Integer num2, Integer num3, Integer num4, String str2, StreamerLinkStats streamerLinkStats, StreamerLinkState streamerLinkState, StreamQuality streamQuality, long j2, int[] iArr, long j3, int[] iArr2) {
        this.proto = str;
        this.state = streamerState;
        this.fps = d;
        this.altFps = d2;
        this.connectionId = i;
        this.packetsInfo = streamerPacketsInfo;
        this.videoFramesDropped = j;
        this.bitrate = i2;
        this.altBitrate = num;
        this.bandwidth = i3;
        this.averageOverheadBitrate = i4;
        this.lastPresentationTimeInSeconds = l;
        this.width = num2;
        this.height = num3;
        this.rotationAngle = num4;
        this.debugInfo = str2;
        this.linkStats = streamerLinkStats;
        this.networkState = streamerLinkState;
        this.quality = streamQuality;
        this.ticks = j2;
        this.lastBlocksNative = iArr;
        this.ticks2 = j3;
        this.lastBlocks = iArr2;
    }

    public final Integer getAltBitrate() {
        return this.altBitrate;
    }

    public final Double getAltFps() {
        return this.altFps;
    }

    public final int getAverageOverheadBitrate() {
        return this.averageOverheadBitrate;
    }

    public final int getBandwidth() {
        return this.bandwidth;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getConnectionId() {
        return this.connectionId;
    }

    public final String getDebugInfo() {
        return this.debugInfo;
    }

    public final double getFps() {
        return this.fps;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final int[] getLastBlocks() {
        return this.lastBlocks;
    }

    public final int[] getLastBlocksNative() {
        return this.lastBlocksNative;
    }

    public final Long getLastPresentationTimeInSeconds() {
        return this.lastPresentationTimeInSeconds;
    }

    public final StreamerLinkStats getLinkStats() {
        return this.linkStats;
    }

    public final StreamerLinkState getNetworkState() {
        return this.networkState;
    }

    public final StreamerPacketsInfo getPacketsInfo() {
        return this.packetsInfo;
    }

    public final String getProto() {
        return this.proto;
    }

    public final StreamQuality getQuality() {
        return this.quality;
    }

    public final Integer getRotationAngle() {
        return this.rotationAngle;
    }

    public final StreamerState getState() {
        return this.state;
    }

    public final long getTicks() {
        return this.ticks;
    }

    public final long getTicks2() {
        return this.ticks2;
    }

    public final long getVideoFramesDropped() {
        return this.videoFramesDropped;
    }

    public final Integer getWidth() {
        return this.width;
    }
}
