package ru.ok.media;

import com.ironsource.mediationsdk.logger.IronSourceError;
import ru.ok.proto.PacketStats;
import xsna.zcl;

/* compiled from: StreamerPacketsInfo.kt */
/* loaded from: classes9.dex */
public final class StreamerPacketsInfo {
    private final long audioPacketsDelivered;
    private final long audioPacketsLost;
    private final long audioPacketsSent;
    private final long bytesDropped;
    private final long bytesReceived;
    private final long bytesSent;
    private final long payloadBytesSent;
    private final long videoPacketsDelivered;
    private final long videoPacketsLost;
    private final long videoPacketsSent;

    public StreamerPacketsInfo() {
        this(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final long getAudioPacketsDelivered() {
        return this.audioPacketsDelivered;
    }

    public final long getAudioPacketsLost() {
        return this.audioPacketsLost;
    }

    public final long getAudioPacketsSent() {
        return this.audioPacketsSent;
    }

    public final long getBytesDropped() {
        return this.bytesDropped;
    }

    public final long getBytesReceived() {
        return this.bytesReceived;
    }

    public final long getBytesSent() {
        return this.bytesSent;
    }

    public final long getPayloadBytesSent() {
        return this.payloadBytesSent;
    }

    public final long getVideoPacketsDelivered() {
        return this.videoPacketsDelivered;
    }

    public final long getVideoPacketsLost() {
        return this.videoPacketsLost;
    }

    public final long getVideoPacketsSent() {
        return this.videoPacketsSent;
    }

    public final StreamerPacketsInfo plus(PacketStats packetStats) {
        return new StreamerPacketsInfo(this.bytesSent + packetStats.mBytesSent, this.bytesReceived + packetStats.mBytesReceived, this.bytesDropped + packetStats.mBytesDropped, this.payloadBytesSent + packetStats.mPayloadBytesSent, this.audioPacketsSent + packetStats.mAudioPacketsSent, this.audioPacketsDelivered + packetStats.mAudioPacketsDelivered, this.audioPacketsLost + packetStats.mAudioPacketsLost, this.videoPacketsSent + packetStats.mVideoPacketsSent, this.videoPacketsDelivered + packetStats.mVideoPacketsDelivered, this.videoPacketsLost + packetStats.mVideoPacketsLost);
    }

    public StreamerPacketsInfo(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.bytesSent = j;
        this.bytesReceived = j2;
        this.bytesDropped = j3;
        this.payloadBytesSent = j4;
        this.audioPacketsSent = j5;
        this.audioPacketsDelivered = j6;
        this.audioPacketsLost = j7;
        this.videoPacketsSent = j8;
        this.videoPacketsDelivered = j9;
        this.videoPacketsLost = j10;
    }

    public /* synthetic */ StreamerPacketsInfo(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4, (i & 16) != 0 ? 0L : j5, (i & 32) != 0 ? 0L : j6, (i & 64) != 0 ? 0L : j7, (i & 128) != 0 ? 0L : j8, (i & 256) != 0 ? 0L : j9, (i & 512) != 0 ? 0L : j10);
    }
}
