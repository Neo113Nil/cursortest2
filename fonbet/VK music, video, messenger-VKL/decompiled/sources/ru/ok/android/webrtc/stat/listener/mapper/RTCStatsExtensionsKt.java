package ru.ok.android.webrtc.stat.listener.mapper;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.math.BigInteger;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.webrtc.RTCStats;
import org.webrtc.RTCStatsReport;
import xsna.be;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.i7f0;
import xsna.khc0;
import xsna.na8;
import xsna.qcy;
import xsna.tj60;

/* loaded from: classes9.dex */
public final class RTCStatsExtensionsKt {
    public static final /* synthetic */ qcy[] a;
    public static final i7f0 b;
    public static final i7f0 c;
    public static final i7f0 d;
    public static final i7f0 e;
    public static final i7f0 f;
    public static final i7f0 g;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(RTCStatsExtensionsKt.class, RTCStatsConstants.KEY_MIME_TYPE, "getMimeType(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1);
        hpf0 hpf0Var = fpf0.a;
        a = new qcy[]{propertyReference1Impl, fp.c(1, RTCStatsExtensionsKt.class, RTCStatsConstants.KEY_DECODER_IMPLEMENTATION, "getDecoderImplementation(Lorg/webrtc/RTCStats;)Ljava/lang/String;", hpf0Var), ep.a(1, RTCStatsExtensionsKt.class, RTCStatsConstants.KEY_ENCODER_IMPLEMENTATION, "getEncoderImplementation(Lorg/webrtc/RTCStats;)Ljava/lang/String;", hpf0Var), ep.a(1, RTCStatsExtensionsKt.class, RTCStatsConstants.KEY_SDP_FMTP_LINE, "getSdpFmtpLine(Lorg/webrtc/RTCStats;)Ljava/lang/String;", hpf0Var), ep.a(1, RTCStatsExtensionsKt.class, RTCStatsConstants.KEY_PAYLOAD_TYPE, "getPayloadType(Lorg/webrtc/RTCStats;)Ljava/lang/Long;", hpf0Var), ep.a(1, RTCStatsExtensionsKt.class, RTCStatsConstants.KEY_CHANNELS, "getChannels(Lorg/webrtc/RTCStats;)Ljava/lang/Long;", hpf0Var)};
        b = b(RTCStatsConstants.KEY_MIME_TYPE);
        c = b(RTCStatsConstants.KEY_DECODER_IMPLEMENTATION);
        d = b(RTCStatsConstants.KEY_ENCODER_IMPLEMENTATION);
        e = b(RTCStatsConstants.KEY_SDP_FMTP_LINE);
        f = a(RTCStatsConstants.KEY_PAYLOAD_TYPE);
        g = a(RTCStatsConstants.KEY_CHANNELS);
    }

    public static final BigInteger a(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number == null) {
            return null;
        }
        return number instanceof BigInteger ? (BigInteger) number : number instanceof Long ? BigInteger.valueOf(number.longValue()) : number instanceof Integer ? BigInteger.valueOf(number.intValue()) : BigInteger.valueOf(number.longValue());
    }

    public static final Double b(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        return null;
    }

    public static final Long c(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    public static final String getAddress(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_ADDRESS);
        if (I != null) {
            return I.toString();
        }
        return null;
    }

    public static final String getAddressWithPort(RTCStats rTCStats) {
        Integer port;
        String address = getAddress(rTCStats);
        if (address == null || (port = getPort(rTCStats)) == null) {
            return null;
        }
        return na8.a(port.intValue(), address, StringUtils.PROCESS_POSTFIX_DELIMITER);
    }

    public static final Double getAudioLevel(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_AUDIO_LEVEL);
        if (I != null) {
            return b(I);
        }
        return null;
    }

    public static final BigInteger getBytesReceived(RTCStats rTCStats) {
        Object I = be.I(rTCStats, "bytesReceived");
        if (I != null) {
            return a(I);
        }
        return null;
    }

    public static final BigInteger getBytesSent(RTCStats rTCStats) {
        Object I = be.I(rTCStats, "bytesSent");
        if (I != null) {
            return a(I);
        }
        return null;
    }

    public static final String getCandidateType(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_CANDIDATE_TYPE);
        if (I != null) {
            return I.toString();
        }
        return null;
    }

    public static final Long getChannels(RTCStats rTCStats) {
        return (Long) g.getValue(rTCStats, a[5]);
    }

    public static final RTCStats getCodecInfo(RTCStats rTCStats, RTCStatsReport rTCStatsReport) {
        return rTCStatsReport.getStatsMap().get(rTCStats.getMembers().get(RTCStatsConstants.KEY_CODEC_ID));
    }

    public static final Long getConcealedSamples(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_CONCEALED_SAMPLES);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final Long getConcealmentEvents(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_CONCEALMENT_EVENTS);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final Double getCurrentRoundTripTime(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_CURRENT_ROUND_TRIP_TIME);
        if (I != null) {
            return b(I);
        }
        return null;
    }

    public static final String getDecoderImplementation(RTCStats rTCStats) {
        return (String) c.getValue(rTCStats, a[1]);
    }

    public static final String getEncoderImplementation(RTCStats rTCStats) {
        return (String) d.getValue(rTCStats, a[2]);
    }

    public static final Long getFirCount(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_FIR_COUNT);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final Long getFramesDecoded(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_FRAMES_DECODED);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final Long getFramesDropped(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_FRAMES_DROPPED);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final Long getFramesEncoded(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_FRAMES_ENCODED);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final Long getFramesHeight(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_FRAME_HEIGHT);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final Long getFramesReceived(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_FRAMES_RECEIVED);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final Long getFramesWidth(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_FRAME_WIDTH);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final Long getFreezeCount(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_FREEZE_COUNT);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final BigInteger getHeaderBytesSent(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_HEADER_BYTES_SENT);
        if (I != null) {
            return a(I);
        }
        return null;
    }

    public static final Long getInsertedSamplesForDeceleration(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_INSERTED_SAMPLES_FOR_DECELERATION);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final Double getJitterBufferDelay(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_JITTER_BUFFER_DELAY);
        if (I != null) {
            return b(I);
        }
        return null;
    }

    public static final Double getJitterInSeconds(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_JITTER);
        if (I != null) {
            return b(I);
        }
        return null;
    }

    public static final String getKind(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_KIND);
        if (I != null) {
            return I.toString();
        }
        return null;
    }

    public static final RTCStats getLocalCandidate(RTCStats rTCStats, RTCStatsReport rTCStatsReport) {
        return rTCStatsReport.getStatsMap().get(rTCStats.getMembers().get(RTCStatsConstants.KEY_LOCAL_CANDIDATE_ID));
    }

    public static final RTCStats getMediaSource(RTCStats rTCStats, RTCStatsReport rTCStatsReport) {
        return rTCStatsReport.getStatsMap().get(rTCStats.getMembers().get(RTCStatsConstants.KEY_MEDIA_SOURCE_ID));
    }

    public static final String getMediaSourceId(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_MEDIA_SOURCE_ID);
        if (I != null) {
            return I.toString();
        }
        return null;
    }

    public static final String getMimeType(RTCStats rTCStats) {
        return (String) b.getValue(rTCStats, a[0]);
    }

    public static final Long getNackCount(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_NACK_COUNT);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final BigInteger getPacketsDiscarded(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_PACKETS_DISCARDED);
        if (I != null) {
            return a(I);
        }
        return null;
    }

    public static final BigInteger getPacketsLost(RTCStats rTCStats) {
        Object I = be.I(rTCStats, "packetsLost");
        if (I != null) {
            return a(I);
        }
        return null;
    }

    public static final BigInteger getPacketsReceived(RTCStats rTCStats) {
        Object I = be.I(rTCStats, "packetsReceived");
        if (I != null) {
            return a(I);
        }
        return null;
    }

    public static final BigInteger getPacketsSent(RTCStats rTCStats) {
        Object I = be.I(rTCStats, "packetsSent");
        if (I != null) {
            return a(I);
        }
        return null;
    }

    public static final Long getPayloadType(RTCStats rTCStats) {
        return (Long) f.getValue(rTCStats, a[4]);
    }

    public static final Long getPliCount(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_PLI_COUNT);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final Integer getPort(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_PORT);
        if (I != null) {
            Number number = I instanceof Number ? (Number) I : null;
            if (number != null) {
                return Integer.valueOf(number.intValue());
            }
        }
        return null;
    }

    public static final String getProtocol(RTCStats rTCStats) {
        Object I = be.I(rTCStats, "protocol");
        if (I != null) {
            return I.toString();
        }
        return null;
    }

    public static final RTCStats getRemoteCandidate(RTCStats rTCStats, RTCStatsReport rTCStatsReport) {
        return rTCStatsReport.getStatsMap().get(rTCStats.getMembers().get(RTCStatsConstants.KEY_REMOTE_CANDIDATE_ID));
    }

    public static final RTCStats getRemoteInboundForLocalOutbound(RTCStats rTCStats, RTCStatsReport rTCStatsReport) {
        return rTCStatsReport.getStatsMap().get(rTCStats.getMembers().get(RTCStatsConstants.KEY_REMOTE_ID));
    }

    public static final Long getRemovedSamplesForAcceleration(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_REMOVED_SAMPLES_FOR_ACCELERATION);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final BigInteger getRetransmittedBytesSent(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_RETRANSMITTED_BYTES_SENT);
        if (I != null) {
            return a(I);
        }
        return null;
    }

    public static final Double getRoundTripTimeSec(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_ROUND_TRIP_TIME);
        if (I != null) {
            return b(I);
        }
        return null;
    }

    public static final String getSdpFmtpLine(RTCStats rTCStats) {
        return (String) e.getValue(rTCStats, a[3]);
    }

    public static final String getSelectedCandidatePairId(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_SELECTED_CANDIDATE_PAIR_ID);
        if (I != null) {
            return I.toString();
        }
        return null;
    }

    public static final Long getSilentConcealedSamples(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_SILENT_CONCEALED_SAMPLES);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final Long getSsrc(RTCStats rTCStats) {
        Object I = be.I(rTCStats, "ssrc");
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final String getState(RTCStats rTCStats) {
        Object I = be.I(rTCStats, "state");
        if (I != null) {
            return I.toString();
        }
        return null;
    }

    public static final Long getTargetBitrate(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_TARGET_BITRATE);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final Double getTotalAudioEnergy(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_TOTAL_AUDIO_ENERGY);
        if (I != null) {
            return b(I);
        }
        return null;
    }

    public static final Double getTotalFreezesDurationSec(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_TOTAL_FREEZES_DURATION);
        if (I != null) {
            return b(I);
        }
        return null;
    }

    public static final Double getTotalInterFrameDelay(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_TOTAL_INTER_FRAME_DELAY);
        if (I != null) {
            return b(I);
        }
        return null;
    }

    public static final Double getTotalRoundTripTimeSec(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_TOTAL_ROUND_TRIP_TIME);
        if (I != null) {
            return b(I);
        }
        return null;
    }

    public static final Long getTotalSamplesReceived(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_TOTAL_SAMPLES_RECEIVED);
        if (I != null) {
            return c(I);
        }
        return null;
    }

    public static final Double getTotalSquaredInterFrameDelay(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_TOTAL_SQUARED_INTER_FRAME_DELAY);
        if (I != null) {
            return b(I);
        }
        return null;
    }

    public static final String getTrackIdentifier(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_TRACK_IDENTIFIER);
        if (I != null) {
            return I.toString();
        }
        return null;
    }

    public static final String getTransportId(RTCStats rTCStats) {
        Object I = be.I(rTCStats, RTCStatsConstants.KEY_TRANSPORT_ID);
        if (I != null) {
            return I.toString();
        }
        return null;
    }

    public static final i7f0 b(String str) {
        return new khc0(str, 2);
    }

    public static final String b(String str, RTCStats rTCStats, qcy qcyVar) {
        Object obj = rTCStats.getMembers().get(str);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static final i7f0 a(String str) {
        return new tj60(str, 6);
    }

    public static final Long a(String str, RTCStats rTCStats, qcy qcyVar) {
        Object obj = rTCStats.getMembers().get(str);
        if (obj != null) {
            return c(obj);
        }
        return null;
    }
}
