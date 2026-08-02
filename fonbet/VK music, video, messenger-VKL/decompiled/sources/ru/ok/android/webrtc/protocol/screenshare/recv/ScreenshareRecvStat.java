package ru.ok.android.webrtc.protocol.screenshare.recv;

import androidx.annotation.Nullable;
import ru.ok.android.webrtc.protocol.screenshare.recv.stat.FreezeStat;
import xsna.ojp0;

/* loaded from: classes9.dex */
public class ScreenshareRecvStat {
    public final long allocatedBuffersStat;
    public final long allocatedMemStat;

    @Nullable
    public final String codecName;
    public final long completeFramesStat;
    public final long decodeErrors;
    public final long deltaFramesEnqStat;
    public final double frameDecodeErrorEventRateMs;
    public final double frameDecodedEventRateMs;
    public final int frameHeight;
    public final double frameReceivedEventRateMs;
    public final long frameStartsRecvStat;
    public final int frameWidth;
    public final long framesDecodedStat;
    public final long framesDroppedOnEnqStat;
    public final FreezeStat freeze;

    @Nullable
    public final String implName;
    public final long keyFramesEnqStat;
    public final double packetReceivedEventRateMs;
    public final long packetsRecvStat;
    public final long recvOdditiesStat;

    public ScreenshareRecvStat(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, double d, double d2, double d3, double d4, @Nullable String str, @Nullable String str2, int i, int i2, FreezeStat freezeStat) {
        this.packetsRecvStat = j;
        this.frameStartsRecvStat = j2;
        this.recvOdditiesStat = j3;
        this.completeFramesStat = j4;
        this.keyFramesEnqStat = j5;
        this.deltaFramesEnqStat = j6;
        this.framesDroppedOnEnqStat = j7;
        this.framesDecodedStat = j8;
        this.decodeErrors = j9;
        this.allocatedBuffersStat = j10;
        this.allocatedMemStat = j11;
        this.packetReceivedEventRateMs = d;
        this.frameReceivedEventRateMs = d2;
        this.frameDecodedEventRateMs = d3;
        this.frameDecodeErrorEventRateMs = d4;
        this.codecName = str;
        this.implName = str2;
        this.frameWidth = i;
        this.frameHeight = i2;
        this.freeze = freezeStat;
    }

    public String toDebugString() {
        return "  packetsRecvStat: " + this.packetsRecvStat + "\n  frameStartsRecvStat: " + this.frameStartsRecvStat + "\n  recvOdditiesStat: " + this.recvOdditiesStat + "\n  completeFramesStat: " + this.completeFramesStat + "\n\n  keyFramesEnqStat: " + this.keyFramesEnqStat + "\n  deltaFramesEnqStat: " + this.deltaFramesEnqStat + "\n  framesDroppedOnEnqStat: " + this.framesDroppedOnEnqStat + "\n\n  framesDecodedStat: " + this.framesDecodedStat + "\n  decodeErrors: " + this.decodeErrors + "\n\n  allocatedBuffersStat: " + this.allocatedBuffersStat + "\n  allocatedMemStat: " + this.allocatedMemStat + "\n\n  packetReceivedEventRateMs: 1 / " + this.packetReceivedEventRateMs + "ms\n  frameReceivedEventRateMs: 1 / " + this.frameReceivedEventRateMs + "ms\n  recvFps: " + (1000.0d / this.frameReceivedEventRateMs) + "\n  frameDecodedEventRateMs: 1 / " + this.frameDecodedEventRateMs + "ms\n  decodedFps: " + (1000.0d / this.frameDecodedEventRateMs) + "\n  frameDecodeErrorEventRateMs: 1 / " + this.frameDecodeErrorEventRateMs + "ms\n";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScreenshareRecvStat{packetsRecvStat=");
        sb.append(this.packetsRecvStat);
        sb.append(", frameStartsRecvStat=");
        sb.append(this.frameStartsRecvStat);
        sb.append(", recvOdditiesStat=");
        sb.append(this.recvOdditiesStat);
        sb.append(", completeFramesStat=");
        sb.append(this.completeFramesStat);
        sb.append(", keyFramesEnqStat=");
        sb.append(this.keyFramesEnqStat);
        sb.append(", deltaFramesEnqStat=");
        sb.append(this.deltaFramesEnqStat);
        sb.append(", framesDroppedOnEnqStat=");
        sb.append(this.framesDroppedOnEnqStat);
        sb.append(", framesDecodedStat=");
        sb.append(this.framesDecodedStat);
        sb.append(", decodeErrors=");
        sb.append(this.decodeErrors);
        sb.append(", allocatedBuffersStat=");
        sb.append(this.allocatedBuffersStat);
        sb.append(", allocatedMemStat=");
        sb.append(this.allocatedMemStat);
        sb.append(", packetReceivedEventRateMs=");
        sb.append(this.packetReceivedEventRateMs);
        sb.append(", frameReceivedEventRateMs=");
        sb.append(this.frameReceivedEventRateMs);
        sb.append(", frameDecodedEventRateMs=");
        sb.append(this.frameDecodedEventRateMs);
        sb.append(", frameDecodeErrorEventRateMs=");
        return ojp0.a(sb, this.frameDecodeErrorEventRateMs, '}');
    }
}
