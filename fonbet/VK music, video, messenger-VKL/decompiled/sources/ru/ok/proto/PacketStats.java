package ru.ok.proto;

import androidx.annotation.NonNull;
import xsna.efz;

/* loaded from: classes9.dex */
public class PacketStats {
    public long mAudioPacketsDelivered;
    public long mAudioPacketsLost;
    public long mAudioPacketsSent;
    public long mBenchPacketsDelivered;
    public long mBenchPacketsLost;
    public long mBenchPacketsSent;
    public long mBytesDropped;
    public long mBytesReceived;
    public long mBytesSent;
    public long mInvokePacketsDelivered;
    public long mInvokePacketsLost;
    public long mInvokePacketsSent;
    public long mPayloadBytesDelivered;
    public long mPayloadBytesSent;
    public long mVideoPacketsDelivered;
    public long mVideoPacketsLost;
    public long mVideoPacketsSent;

    public PacketStats() {
        this.mBytesReceived = 0L;
        this.mBytesSent = 0L;
        this.mBytesDropped = 0L;
        this.mPayloadBytesSent = 0L;
        this.mPayloadBytesDelivered = 0L;
        this.mAudioPacketsSent = 0L;
        this.mAudioPacketsDelivered = 0L;
        this.mAudioPacketsLost = 0L;
        this.mVideoPacketsSent = 0L;
        this.mVideoPacketsDelivered = 0L;
        this.mVideoPacketsLost = 0L;
        this.mInvokePacketsSent = 0L;
        this.mInvokePacketsDelivered = 0L;
        this.mInvokePacketsLost = 0L;
        this.mBenchPacketsSent = 0L;
        this.mBenchPacketsDelivered = 0L;
        this.mBenchPacketsLost = 0L;
    }

    @NonNull
    public PacketStats add(@NonNull PacketStats packetStats) {
        this.mBytesReceived += packetStats.mBytesReceived;
        this.mBytesSent += packetStats.mBytesSent;
        this.mBytesDropped += packetStats.mBytesDropped;
        this.mPayloadBytesSent += packetStats.mPayloadBytesSent;
        this.mPayloadBytesDelivered += packetStats.mPayloadBytesDelivered;
        this.mAudioPacketsSent += packetStats.mAudioPacketsSent;
        this.mAudioPacketsDelivered += packetStats.mAudioPacketsDelivered;
        this.mAudioPacketsLost += packetStats.mAudioPacketsLost;
        this.mVideoPacketsSent += packetStats.mVideoPacketsSent;
        this.mVideoPacketsDelivered += packetStats.mVideoPacketsDelivered;
        this.mVideoPacketsLost += packetStats.mVideoPacketsLost;
        this.mInvokePacketsSent += packetStats.mInvokePacketsSent;
        this.mInvokePacketsDelivered += packetStats.mInvokePacketsDelivered;
        this.mInvokePacketsLost += packetStats.mInvokePacketsLost;
        this.mBenchPacketsSent += packetStats.mBenchPacketsSent;
        this.mBenchPacketsDelivered += packetStats.mBenchPacketsDelivered;
        this.mBenchPacketsLost += packetStats.mBenchPacketsLost;
        return this;
    }

    @NonNull
    public PacketStats subtract(@NonNull PacketStats packetStats) {
        this.mBytesReceived -= packetStats.mBytesReceived;
        this.mBytesSent -= packetStats.mBytesSent;
        this.mBytesDropped -= packetStats.mBytesDropped;
        this.mPayloadBytesSent -= packetStats.mPayloadBytesSent;
        this.mPayloadBytesDelivered -= packetStats.mPayloadBytesDelivered;
        this.mAudioPacketsSent -= packetStats.mAudioPacketsSent;
        this.mAudioPacketsDelivered -= packetStats.mAudioPacketsDelivered;
        this.mAudioPacketsLost -= packetStats.mAudioPacketsLost;
        this.mVideoPacketsSent -= packetStats.mVideoPacketsSent;
        this.mVideoPacketsDelivered -= packetStats.mVideoPacketsDelivered;
        this.mVideoPacketsLost -= packetStats.mVideoPacketsLost;
        this.mInvokePacketsSent -= packetStats.mInvokePacketsSent;
        this.mInvokePacketsDelivered -= packetStats.mInvokePacketsDelivered;
        this.mInvokePacketsLost -= packetStats.mInvokePacketsLost;
        this.mBenchPacketsSent -= packetStats.mBenchPacketsSent;
        this.mBenchPacketsDelivered -= packetStats.mBenchPacketsDelivered;
        this.mBenchPacketsLost -= packetStats.mBenchPacketsLost;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{ sent= ");
        sb.append(this.mBytesSent);
        sb.append(" rcvd= ");
        sb.append(this.mBytesReceived);
        sb.append(" lost= ");
        sb.append(this.mBytesDropped);
        sb.append(" audio= ");
        sb.append(this.mAudioPacketsSent);
        sb.append(" / ");
        sb.append(this.mAudioPacketsDelivered);
        sb.append(" / ");
        sb.append(this.mAudioPacketsLost);
        sb.append(" video= ");
        sb.append(this.mVideoPacketsSent);
        sb.append(" / ");
        sb.append(this.mVideoPacketsDelivered);
        sb.append(" / ");
        sb.append(this.mVideoPacketsLost);
        sb.append(" invoke= ");
        sb.append(this.mInvokePacketsSent);
        sb.append(" / ");
        sb.append(this.mInvokePacketsDelivered);
        sb.append(" / ");
        sb.append(this.mInvokePacketsLost);
        sb.append(" bench= ");
        sb.append(this.mBenchPacketsSent);
        sb.append(" / ");
        sb.append(this.mBenchPacketsDelivered);
        sb.append(" / ");
        sb.append(this.mBenchPacketsLost);
        sb.append(" payload= ");
        sb.append(this.mPayloadBytesSent);
        sb.append(" payloadSent= ");
        return efz.b(this.mPayloadBytesDelivered, " }", sb);
    }

    public PacketStats(@NonNull PacketStats packetStats) {
        this.mBytesReceived = packetStats.mBytesReceived;
        this.mBytesSent = packetStats.mBytesSent;
        this.mBytesDropped = packetStats.mBytesDropped;
        this.mPayloadBytesSent = packetStats.mPayloadBytesSent;
        this.mPayloadBytesDelivered = packetStats.mPayloadBytesDelivered;
        this.mAudioPacketsSent = packetStats.mAudioPacketsSent;
        this.mAudioPacketsDelivered = packetStats.mAudioPacketsDelivered;
        this.mAudioPacketsLost = packetStats.mAudioPacketsLost;
        this.mVideoPacketsSent = packetStats.mVideoPacketsSent;
        this.mVideoPacketsDelivered = packetStats.mVideoPacketsDelivered;
        this.mVideoPacketsLost = packetStats.mVideoPacketsLost;
        this.mInvokePacketsSent = packetStats.mInvokePacketsSent;
        this.mInvokePacketsDelivered = packetStats.mInvokePacketsDelivered;
        this.mInvokePacketsLost = packetStats.mInvokePacketsLost;
        this.mBenchPacketsSent = packetStats.mBenchPacketsSent;
        this.mBenchPacketsDelivered = packetStats.mBenchPacketsDelivered;
        this.mBenchPacketsLost = packetStats.mBenchPacketsLost;
    }
}
