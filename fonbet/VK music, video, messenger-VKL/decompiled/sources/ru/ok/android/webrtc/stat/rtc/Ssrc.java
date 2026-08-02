package ru.ok.android.webrtc.stat.rtc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xsna.cjl0;
import xsna.ms9;
import xsna.vu5;

/* loaded from: classes9.dex */
public abstract class Ssrc {
    public static final String LOG_TAG = "CallsSsrc";
    public static final long NO_VALUE = -1;
    public static final String TYPE = "ssrc";

    @NonNull
    public final CodecInfo codecInfo;

    @NonNull
    public final Direction direction;

    @NonNull
    public final MediaType mediaType;
    public final long ssrc;

    @NonNull
    public final String trackId;

    @NonNull
    public final String transportId;

    @NonNull
    public final Map<String, String> unknown = new HashMap();

    public static final class AudioRecv extends Recv {
        public final double audioLevel;
        public final long concealedSamples;
        public final long concealmentEvents;
        public final long insertedSamplesForDeceleration;
        public final long removedSamplesForAcceleration;
        public final long silentConcealedSamples;
        public final double totalAudioEnergy;
        public final long totalSamplesReceived;

        public AudioRecv(long j, @NonNull String str, @Nullable BigInteger bigInteger, @Nullable BigInteger bigInteger2, @Nullable BigInteger bigInteger3, @Nullable BigInteger bigInteger4, double d, double d2, long j2, @NonNull String str2, long j3, long j4, long j5, long j6, long j7, long j8, @NonNull CodecInfo codecInfo) {
            super(MediaType.AUDIO, j, str, bigInteger, bigInteger2, bigInteger3, bigInteger4, j2, str2, codecInfo);
            this.audioLevel = d;
            this.totalAudioEnergy = d2;
            this.totalSamplesReceived = j3;
            this.insertedSamplesForDeceleration = j4;
            this.removedSamplesForAcceleration = j5;
            this.concealedSamples = j6;
            this.silentConcealedSamples = j7;
            this.concealmentEvents = j8;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AudioRecv{ssrc=");
            sb.append(this.ssrc);
            sb.append(", transportId='");
            sb.append(this.transportId);
            sb.append("', trackId='");
            sb.append(this.trackId);
            sb.append("', packetsReceived=");
            sb.append(this.packetsReceived);
            sb.append(", packetsLost=");
            sb.append(this.packetsLost);
            sb.append(", bytesReceived=");
            sb.append(this.bytesReceived);
            sb.append(", jitterBufferMs=");
            sb.append(this.jitterBufferMs);
            sb.append(", audioLevel=");
            sb.append(this.audioLevel);
            sb.append(", totalAudioEnergy=");
            sb.append(this.totalAudioEnergy);
            sb.append(", unknown=");
            return cjl0.a(sb, this.unknown, '}');
        }
    }

    public static final class AudioSend extends Send {
        public final Double a;

        public AudioSend(long j, @NonNull String str, @Nullable BigInteger bigInteger, @Nullable BigInteger bigInteger2, @Nullable BigInteger bigInteger3, @Nullable BigInteger bigInteger4, @Nullable BigInteger bigInteger5, @Nullable Long l, @NonNull String str2, @NonNull CodecInfo codecInfo, @Nullable Boolean bool, @Nullable Double d) {
            super(MediaType.AUDIO, j, str, bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, l, str2, codecInfo, bool);
            this.a = d;
        }

        @Nullable
        public double getAudioLevel() {
            return this.a.doubleValue();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AudioSend{ssrc=");
            sb.append(this.ssrc);
            sb.append(", transportId='");
            sb.append(this.transportId);
            sb.append("', trackId='");
            sb.append(this.trackId);
            sb.append("', packetsSent=");
            sb.append(this.packetsSent);
            sb.append(", packetsLost=");
            sb.append(this.packetsLost);
            sb.append(", bytesSent=");
            sb.append(this.bytesSent);
            sb.append(", isMediaShare=");
            sb.append(this.isMediaShare);
            sb.append(", targetBitrate=");
            sb.append(this.targetBitrate);
            sb.append(", audioLevel=");
            sb.append(this.a);
            sb.append(", unknown=");
            return cjl0.a(sb, this.unknown, '}');
        }
    }

    public static class CodecInfo {

        @Nullable
        public final String codecImplName;

        @Nullable
        public final String codecName;
        public final long payloadType;

        @Nullable
        public final String sdpFmtpLine;

        public CodecInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, long j) {
            this.codecName = str;
            this.codecImplName = str2;
            this.sdpFmtpLine = str3;
            this.payloadType = j;
        }
    }

    public enum Direction {
        RECV,
        SEND
    }

    public enum MediaType {
        AUDIO,
        VIDEO
    }

    public static final class Pack {

        @NonNull
        public final List<AudioRecv> incomingAudio;

        @NonNull
        public final List<VideoRecv> incomingVideo;

        @NonNull
        public final List<AudioSend> outgoingAudio;

        @NonNull
        public final List<VideoSend> outgoingVideo;

        public Pack(@NonNull List<AudioRecv> list, @NonNull List<VideoRecv> list2, @NonNull List<AudioSend> list3, @NonNull List<VideoSend> list4) {
            this.incomingAudio = list;
            this.incomingVideo = list2;
            this.outgoingAudio = list3;
            this.outgoingVideo = list4;
        }

        @NonNull
        public List<AudioRecv> getIncomingAudio() {
            return this.incomingAudio;
        }

        @NonNull
        public List<VideoRecv> getIncomingVideo() {
            return this.incomingVideo;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Pack{incomingAudio=");
            sb.append(this.incomingAudio);
            sb.append(", incomingVideo=");
            sb.append(this.incomingVideo);
            sb.append(", outgoingAudio=");
            sb.append(this.outgoingAudio);
            sb.append(", outgoingVideo=");
            return ms9.a('}', sb, this.outgoingVideo);
        }
    }

    public static abstract class Recv extends Ssrc {

        @Nullable
        public final BigInteger bytesReceived;
        public final long jitterBufferMs;

        @Nullable
        public final BigInteger packetsDiscarded;

        @Nullable
        public final BigInteger packetsLost;

        @Nullable
        public final BigInteger packetsReceived;

        public Recv(MediaType mediaType, long j, String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, long j2, String str2, CodecInfo codecInfo) {
            super(mediaType, Direction.RECV, j, str, str2, codecInfo);
            this.packetsReceived = bigInteger;
            this.packetsLost = bigInteger2;
            this.packetsDiscarded = bigInteger3;
            this.bytesReceived = bigInteger4;
            this.jitterBufferMs = j2;
        }

        @Nullable
        public BigInteger getBytesReceived() {
            return this.bytesReceived;
        }
    }

    public static abstract class Send extends Ssrc {

        @Nullable
        public final BigInteger bytesSent;

        @Nullable
        public final BigInteger headerBytesSent;

        @Nullable
        public final Boolean isMediaShare;

        @Nullable
        public final BigInteger packetsLost;

        @Nullable
        public final BigInteger packetsSent;

        @Nullable
        public final BigInteger retransmittedBytesSent;

        @Nullable
        public final Long targetBitrate;

        public Send(MediaType mediaType, long j, String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, Long l, String str2, CodecInfo codecInfo, Boolean bool) {
            super(mediaType, Direction.SEND, j, str, str2, codecInfo);
            this.packetsSent = bigInteger;
            this.packetsLost = bigInteger2;
            this.bytesSent = bigInteger3;
            this.headerBytesSent = bigInteger4;
            this.retransmittedBytesSent = bigInteger5;
            this.isMediaShare = bool;
            this.targetBitrate = l;
        }
    }

    public static final class VideoRecv extends Recv {
        public final long firSent;
        public final long frameHeight;
        public final long frameWidth;
        public final long framesDecoded;
        public final long framesDropped;
        public final long framesReceived;
        public final long freezeCount;
        public final long nacksSent;
        public final long pliSent;
        public final long totalFreezesDurationMs;

        @Nullable
        public final Double totalInterFrameDelay;

        @Nullable
        public final Double totalSquaredInterFrameDelay;

        public VideoRecv(long j, @NonNull String str, @Nullable BigInteger bigInteger, @Nullable BigInteger bigInteger2, @Nullable BigInteger bigInteger3, @Nullable BigInteger bigInteger4, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, @NonNull String str2, long j10, @Nullable Double d, @Nullable Double d2, CodecInfo codecInfo, long j11, long j12) {
            super(MediaType.VIDEO, j, str, bigInteger, bigInteger2, bigInteger3, bigInteger4, j2, str2, codecInfo);
            this.nacksSent = j3;
            this.pliSent = j4;
            this.firSent = j5;
            this.framesDecoded = j6;
            this.framesReceived = j7;
            this.frameHeight = j8;
            this.frameWidth = j9;
            this.framesDropped = j10;
            this.totalSquaredInterFrameDelay = d;
            this.totalInterFrameDelay = d2;
            this.freezeCount = j11;
            this.totalFreezesDurationMs = j12;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("VideoRecv{ssrc=");
            sb.append(this.ssrc);
            sb.append(", transportId='");
            sb.append(this.transportId);
            sb.append("', trackId='");
            sb.append(this.trackId);
            sb.append("', packetsReceived=");
            sb.append(this.packetsReceived);
            sb.append(", packetsLost=");
            sb.append(this.packetsLost);
            sb.append(", bytesReceived=");
            sb.append(this.bytesReceived);
            sb.append(", jitterBufferMs=");
            sb.append(this.jitterBufferMs);
            sb.append(", nacksSent=");
            sb.append(this.nacksSent);
            sb.append(", pliSent=");
            sb.append(this.pliSent);
            sb.append(", firSent=");
            sb.append(this.firSent);
            sb.append(", framesDecoded=");
            sb.append(this.framesDecoded);
            sb.append(", framesReceived=");
            sb.append(this.framesReceived);
            sb.append(", frameHeight=");
            sb.append(this.frameHeight);
            sb.append(", frameWidth=");
            sb.append(this.frameWidth);
            sb.append(", unknown=");
            sb.append(this.unknown);
            sb.append(", framesDropped=");
            return vu5.a('}', this.framesDropped, sb);
        }
    }

    public static final class VideoSend extends Send {
        public final long adaptationChanges;
        public final long avgEncodeMs;
        public final long firReceived;
        public final long frameHeight;
        public final long frameWidth;
        public final long framesEncoded;
        public final long nacksReceived;
        public final long pliReceived;

        public VideoSend(long j, @NonNull String str, @Nullable BigInteger bigInteger, @Nullable BigInteger bigInteger2, @Nullable BigInteger bigInteger3, @Nullable BigInteger bigInteger4, @Nullable BigInteger bigInteger5, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, @Nullable Long l, @NonNull String str2, @NonNull CodecInfo codecInfo, @Nullable Boolean bool) {
            super(MediaType.VIDEO, j, str, bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, l, str2, codecInfo, bool);
            this.nacksReceived = j2;
            this.pliReceived = j3;
            this.firReceived = j4;
            this.framesEncoded = j5;
            this.adaptationChanges = j6;
            this.avgEncodeMs = j7;
            this.frameWidth = j8;
            this.frameHeight = j9;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("VideoSend{ssrc=");
            sb.append(this.ssrc);
            sb.append(", transportId='");
            sb.append(this.transportId);
            sb.append("', trackId='");
            sb.append(this.trackId);
            sb.append("', packetsSent=");
            sb.append(this.packetsSent);
            sb.append(", packetsLost=");
            sb.append(this.packetsLost);
            sb.append(", bytesSent=");
            sb.append(this.bytesSent);
            sb.append(", nacksReceived=");
            sb.append(this.nacksReceived);
            sb.append(", pliReceived=");
            sb.append(this.pliReceived);
            sb.append(", firReceived=");
            sb.append(this.firReceived);
            sb.append(", framesEncoded=");
            sb.append(this.framesEncoded);
            sb.append(", adaptationChanges=");
            sb.append(this.adaptationChanges);
            sb.append(", avgEncodeMs=");
            sb.append(this.avgEncodeMs);
            sb.append(", frameWidth=");
            sb.append(this.frameWidth);
            sb.append(", frameHeight=");
            sb.append(this.frameHeight);
            sb.append(", isMediaShare=");
            sb.append(this.isMediaShare);
            sb.append(", targetBitrate=");
            sb.append(this.targetBitrate);
            sb.append(", unknown=");
            return cjl0.a(sb, this.unknown, '}');
        }
    }

    public Ssrc(MediaType mediaType, Direction direction, long j, String str, String str2, CodecInfo codecInfo) {
        this.mediaType = mediaType;
        this.direction = direction;
        this.ssrc = j;
        this.transportId = str;
        this.trackId = str2;
        this.codecInfo = codecInfo;
    }
}
