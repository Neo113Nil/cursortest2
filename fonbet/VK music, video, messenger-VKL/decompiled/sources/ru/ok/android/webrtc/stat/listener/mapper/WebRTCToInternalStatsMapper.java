package ru.ok.android.webrtc.stat.listener.mapper;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import org.webrtc.RTCStats;
import org.webrtc.RTCStatsReport;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.rtc.CandidatePair;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.stat.screenshare.StatsTrackIdClassifier;
import ru.ok.android.webrtc.topology.StatsCallback;
import xsna.drm0;
import xsna.epx;
import xsna.qns;

/* loaded from: classes9.dex */
public final class WebRTCToInternalStatsMapper {
    public final RTCLog a;
    public StatsTrackIdClassifier b;

    public WebRTCToInternalStatsMapper(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    public static Ssrc.CodecInfo a(RTCStats rTCStats, RTCStatsReport rTCStatsReport) {
        String str;
        Long payloadType;
        String sdpFmtpLine;
        String mimeType;
        RTCStats codecInfo = RTCStatsExtensionsKt.getCodecInfo(rTCStats, rTCStatsReport);
        if (codecInfo == null || (mimeType = RTCStatsExtensionsKt.getMimeType(codecInfo)) == null) {
            str = "";
        } else {
            int H = drm0.H(mimeType);
            while (true) {
                if (-1 < H) {
                    if (mimeType.charAt(H) == '/') {
                        mimeType = mimeType.substring(H + 1);
                        break;
                    }
                    H--;
                } else {
                    break;
                }
            }
            str = mimeType;
        }
        String encoderImplementation = RTCStatsExtensionsKt.getEncoderImplementation(rTCStats);
        return new Ssrc.CodecInfo(str, (encoderImplementation == null && (encoderImplementation = RTCStatsExtensionsKt.getDecoderImplementation(rTCStats)) == null) ? "" : encoderImplementation, (codecInfo == null || (sdpFmtpLine = RTCStatsExtensionsKt.getSdpFmtpLine(codecInfo)) == null) ? "" : sdpFmtpLine, (codecInfo == null || (payloadType = RTCStatsExtensionsKt.getPayloadType(codecInfo)) == null) ? 0L : payloadType.longValue());
    }

    public final ArrayList b(RTCStatsReport rTCStatsReport) {
        Long ssrc;
        String trackIdentifier;
        Ssrc ssrc2;
        Ssrc ssrc3;
        String trackIdentifier2;
        Map<String, RTCStats> statsMap = rTCStatsReport.getStatsMap();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, RTCStats>> it = statsMap.entrySet().iterator();
        int i = -1;
        int i2 = -1;
        while (it.hasNext()) {
            RTCStats value = it.next().getValue();
            if (epx.f(value.getType(), RTCStatsConstants.TYPE_INBOUND_RTP) && epx.f(RTCStatsExtensionsKt.getKind(value), "audio")) {
                Long ssrc4 = RTCStatsExtensionsKt.getSsrc(value);
                if (ssrc4 != null) {
                    long longValue = ssrc4.longValue();
                    String transportId = RTCStatsExtensionsKt.getTransportId(value);
                    if (transportId != null) {
                        BigInteger packetsReceived = RTCStatsExtensionsKt.getPacketsReceived(value);
                        BigInteger packetsLost = RTCStatsExtensionsKt.getPacketsLost(value);
                        BigInteger packetsDiscarded = RTCStatsExtensionsKt.getPacketsDiscarded(value);
                        BigInteger bytesReceived = RTCStatsExtensionsKt.getBytesReceived(value);
                        Double jitterInSeconds = RTCStatsExtensionsKt.getJitterInSeconds(value);
                        long doubleValue = (long) ((jitterInSeconds != null ? jitterInSeconds.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE) * TimeUnit.SECONDS.toMillis(1L));
                        String trackIdentifier3 = RTCStatsExtensionsKt.getTrackIdentifier(value);
                        if (trackIdentifier3 != null) {
                            Long totalSamplesReceived = RTCStatsExtensionsKt.getTotalSamplesReceived(value);
                            long longValue2 = totalSamplesReceived != null ? totalSamplesReceived.longValue() : 0L;
                            Long insertedSamplesForDeceleration = RTCStatsExtensionsKt.getInsertedSamplesForDeceleration(value);
                            long longValue3 = insertedSamplesForDeceleration != null ? insertedSamplesForDeceleration.longValue() : 0L;
                            Long removedSamplesForAcceleration = RTCStatsExtensionsKt.getRemovedSamplesForAcceleration(value);
                            long longValue4 = removedSamplesForAcceleration != null ? removedSamplesForAcceleration.longValue() : 0L;
                            Long concealedSamples = RTCStatsExtensionsKt.getConcealedSamples(value);
                            long longValue5 = concealedSamples != null ? concealedSamples.longValue() : 0L;
                            Long silentConcealedSamples = RTCStatsExtensionsKt.getSilentConcealedSamples(value);
                            long longValue6 = silentConcealedSamples != null ? silentConcealedSamples.longValue() : 0L;
                            Long concealmentEvents = RTCStatsExtensionsKt.getConcealmentEvents(value);
                            long longValue7 = concealmentEvents != null ? concealmentEvents.longValue() : 0L;
                            Double audioLevel = RTCStatsExtensionsKt.getAudioLevel(value);
                            double doubleValue2 = audioLevel != null ? audioLevel.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                            Double totalAudioEnergy = RTCStatsExtensionsKt.getTotalAudioEnergy(value);
                            ssrc3 = new Ssrc.AudioRecv(longValue, transportId, packetsReceived, packetsLost, packetsDiscarded, bytesReceived, doubleValue2, totalAudioEnergy != null ? totalAudioEnergy.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE, doubleValue, trackIdentifier3, longValue2, longValue3, longValue4, longValue5, longValue6, longValue7, a(value, rTCStatsReport));
                        }
                    }
                }
                ssrc3 = null;
            } else {
                if (epx.f(value.getType(), RTCStatsConstants.TYPE_INBOUND_RTP) && epx.f(RTCStatsExtensionsKt.getKind(value), "video")) {
                    Long ssrc5 = RTCStatsExtensionsKt.getSsrc(value);
                    if (ssrc5 != null) {
                        long longValue8 = ssrc5.longValue();
                        String transportId2 = RTCStatsExtensionsKt.getTransportId(value);
                        if (transportId2 != null) {
                            BigInteger packetsReceived2 = RTCStatsExtensionsKt.getPacketsReceived(value);
                            BigInteger packetsLost2 = RTCStatsExtensionsKt.getPacketsLost(value);
                            BigInteger packetsDiscarded2 = RTCStatsExtensionsKt.getPacketsDiscarded(value);
                            BigInteger bytesReceived2 = RTCStatsExtensionsKt.getBytesReceived(value);
                            Double jitterInSeconds2 = RTCStatsExtensionsKt.getJitterInSeconds(value);
                            double doubleValue3 = jitterInSeconds2 != null ? jitterInSeconds2.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            long millis = (long) (doubleValue3 * timeUnit.toMillis(1L));
                            Long nackCount = RTCStatsExtensionsKt.getNackCount(value);
                            long longValue9 = nackCount != null ? nackCount.longValue() : 0L;
                            Long pliCount = RTCStatsExtensionsKt.getPliCount(value);
                            long longValue10 = pliCount != null ? pliCount.longValue() : 0L;
                            Long firCount = RTCStatsExtensionsKt.getFirCount(value);
                            long longValue11 = firCount != null ? firCount.longValue() : 0L;
                            Long framesDecoded = RTCStatsExtensionsKt.getFramesDecoded(value);
                            long longValue12 = framesDecoded != null ? framesDecoded.longValue() : 0L;
                            Long framesReceived = RTCStatsExtensionsKt.getFramesReceived(value);
                            long longValue13 = framesReceived != null ? framesReceived.longValue() : 0L;
                            Long framesDropped = RTCStatsExtensionsKt.getFramesDropped(value);
                            long longValue14 = framesDropped != null ? framesDropped.longValue() : 0L;
                            Long framesWidth = RTCStatsExtensionsKt.getFramesWidth(value);
                            long longValue15 = framesWidth != null ? framesWidth.longValue() : -1L;
                            Long framesHeight = RTCStatsExtensionsKt.getFramesHeight(value);
                            long longValue16 = framesHeight != null ? framesHeight.longValue() : -1L;
                            String trackIdentifier4 = RTCStatsExtensionsKt.getTrackIdentifier(value);
                            if (trackIdentifier4 != null) {
                                Double totalSquaredInterFrameDelay = RTCStatsExtensionsKt.getTotalSquaredInterFrameDelay(value);
                                Double totalInterFrameDelay = RTCStatsExtensionsKt.getTotalInterFrameDelay(value);
                                Ssrc.CodecInfo a = a(value, rTCStatsReport);
                                Long freezeCount = RTCStatsExtensionsKt.getFreezeCount(value);
                                long longValue17 = freezeCount != null ? freezeCount.longValue() : 0L;
                                Double totalFreezesDurationSec = RTCStatsExtensionsKt.getTotalFreezesDurationSec(value);
                                ssrc3 = new Ssrc.VideoRecv(longValue8, transportId2, packetsReceived2, packetsLost2, packetsDiscarded2, bytesReceived2, millis, longValue9, longValue10, longValue11, longValue12, longValue13, longValue16, longValue15, trackIdentifier4, longValue14, totalSquaredInterFrameDelay, totalInterFrameDelay, a, longValue17, (long) ((totalFreezesDurationSec != null ? totalFreezesDurationSec.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE) * timeUnit.toMillis(1L)));
                            }
                        }
                    }
                    ssrc3 = null;
                } else if (epx.f(value.getType(), RTCStatsConstants.TYPE_OUTBOUND_RTP) && epx.f(RTCStatsExtensionsKt.getKind(value), "audio")) {
                    Long ssrc6 = RTCStatsExtensionsKt.getSsrc(value);
                    if (ssrc6 != null) {
                        long longValue18 = ssrc6.longValue();
                        String transportId3 = RTCStatsExtensionsKt.getTransportId(value);
                        if (transportId3 != null) {
                            BigInteger packetsSent = RTCStatsExtensionsKt.getPacketsSent(value);
                            BigInteger bytesSent = RTCStatsExtensionsKt.getBytesSent(value);
                            BigInteger headerBytesSent = RTCStatsExtensionsKt.getHeaderBytesSent(value);
                            BigInteger retransmittedBytesSent = RTCStatsExtensionsKt.getRetransmittedBytesSent(value);
                            Long targetBitrate = RTCStatsExtensionsKt.getTargetBitrate(value);
                            RTCStats remoteInboundForLocalOutbound = RTCStatsExtensionsKt.getRemoteInboundForLocalOutbound(value, rTCStatsReport);
                            BigInteger packetsLost3 = remoteInboundForLocalOutbound != null ? RTCStatsExtensionsKt.getPacketsLost(remoteInboundForLocalOutbound) : null;
                            RTCStats mediaSource = RTCStatsExtensionsKt.getMediaSource(value, rTCStatsReport);
                            if (mediaSource != null && (trackIdentifier2 = RTCStatsExtensionsKt.getTrackIdentifier(mediaSource)) != null) {
                                Double audioLevel2 = RTCStatsExtensionsKt.getAudioLevel(mediaSource);
                                Ssrc.CodecInfo a2 = a(value, rTCStatsReport);
                                StatsTrackIdClassifier statsTrackIdClassifier = this.b;
                                ssrc2 = new Ssrc.AudioSend(longValue18, transportId3, packetsSent, packetsLost3, bytesSent, headerBytesSent, retransmittedBytesSent, targetBitrate, trackIdentifier2, a2, statsTrackIdClassifier != null ? Boolean.valueOf(statsTrackIdClassifier.isMediaShare(trackIdentifier2)) : null, audioLevel2);
                                ssrc3 = ssrc2;
                            }
                        }
                    }
                    ssrc3 = null;
                } else {
                    if (epx.f(value.getType(), RTCStatsConstants.TYPE_OUTBOUND_RTP) && epx.f(RTCStatsExtensionsKt.getKind(value), "video") && (ssrc = RTCStatsExtensionsKt.getSsrc(value)) != null) {
                        long longValue19 = ssrc.longValue();
                        String transportId4 = RTCStatsExtensionsKt.getTransportId(value);
                        if (transportId4 != null) {
                            BigInteger packetsSent2 = RTCStatsExtensionsKt.getPacketsSent(value);
                            BigInteger bytesSent2 = RTCStatsExtensionsKt.getBytesSent(value);
                            BigInteger headerBytesSent2 = RTCStatsExtensionsKt.getHeaderBytesSent(value);
                            BigInteger retransmittedBytesSent2 = RTCStatsExtensionsKt.getRetransmittedBytesSent(value);
                            Long nackCount2 = RTCStatsExtensionsKt.getNackCount(value);
                            long longValue20 = nackCount2 != null ? nackCount2.longValue() : 0L;
                            Long pliCount2 = RTCStatsExtensionsKt.getPliCount(value);
                            long longValue21 = pliCount2 != null ? pliCount2.longValue() : 0L;
                            Long firCount2 = RTCStatsExtensionsKt.getFirCount(value);
                            long longValue22 = firCount2 != null ? firCount2.longValue() : 0L;
                            Long framesEncoded = RTCStatsExtensionsKt.getFramesEncoded(value);
                            long longValue23 = framesEncoded != null ? framesEncoded.longValue() : 0L;
                            Long framesHeight2 = RTCStatsExtensionsKt.getFramesHeight(value);
                            long longValue24 = framesHeight2 != null ? framesHeight2.longValue() : -1L;
                            Long framesWidth2 = RTCStatsExtensionsKt.getFramesWidth(value);
                            long longValue25 = framesWidth2 != null ? framesWidth2.longValue() : -1L;
                            RTCStats remoteInboundForLocalOutbound2 = RTCStatsExtensionsKt.getRemoteInboundForLocalOutbound(value, rTCStatsReport);
                            BigInteger packetsLost4 = remoteInboundForLocalOutbound2 != null ? RTCStatsExtensionsKt.getPacketsLost(remoteInboundForLocalOutbound2) : null;
                            RTCStats mediaSource2 = RTCStatsExtensionsKt.getMediaSource(value, rTCStatsReport);
                            if (mediaSource2 != null && (trackIdentifier = RTCStatsExtensionsKt.getTrackIdentifier(mediaSource2)) != null) {
                                Ssrc.CodecInfo a3 = a(value, rTCStatsReport);
                                StatsTrackIdClassifier statsTrackIdClassifier2 = this.b;
                                ssrc2 = new Ssrc.VideoSend(longValue19, transportId4, packetsSent2, packetsLost4, bytesSent2, headerBytesSent2, retransmittedBytesSent2, longValue20, longValue21, longValue22, longValue23, -1L, -1L, longValue25, longValue24, RTCStatsExtensionsKt.getTargetBitrate(value), trackIdentifier, a3, statsTrackIdClassifier2 != null ? Boolean.valueOf(statsTrackIdClassifier2.isMediaShare(trackIdentifier)) : null);
                                ssrc3 = ssrc2;
                            }
                        }
                    }
                    ssrc3 = null;
                }
            }
            if (ssrc3 != null) {
                if (ssrc3 instanceof Ssrc.VideoSend) {
                    if (i2 == -1 && epx.f(((Ssrc.VideoSend) ssrc3).isMediaShare, Boolean.FALSE)) {
                        i2 = arrayList.size();
                    }
                    if (i == -1 && epx.f(((Ssrc.VideoSend) ssrc3).isMediaShare, Boolean.TRUE)) {
                        i = arrayList.size();
                    }
                }
                arrayList.add(ssrc3);
            }
        }
        if (i < i2 && i != -1) {
            Ssrc ssrc7 = (Ssrc) arrayList.get(i2);
            arrayList.set(i2, arrayList.get(i));
            arrayList.set(i, ssrc7);
        }
        this.a.log("WebRTCToInternalStatsMapper", arrayList.size() + " ssrcs parsed");
        return arrayList;
    }

    public final void setStatsTrackIdClassifier(StatsTrackIdClassifier statsTrackIdClassifier) {
        this.b = statsTrackIdClassifier;
    }

    public final RTCStat transform(StatsCallback.Stats stats) {
        RTCStatsReport report = stats.getReport();
        return new RTCStat(TimeUnit.MICROSECONDS.toMillis((long) report.getTimestampUs()), EmptyList.b, b(report), a(report));
    }

    public final ArrayList a(RTCStatsReport rTCStatsReport) {
        RTCStats remoteCandidate;
        String addressWithPort;
        String address;
        String protocol;
        String addressWithPort2;
        String address2;
        String protocol2;
        Map<String, RTCStats> statsMap = rTCStatsReport.getStatsMap();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, RTCStats>> it = statsMap.entrySet().iterator();
        while (it.hasNext()) {
            RTCStats value = it.next().getValue();
            if (epx.f(value.getType(), RTCStatsConstants.TYPE_CANDIDATE_PAIR)) {
                RTCStats localCandidate = RTCStatsExtensionsKt.getLocalCandidate(value, rTCStatsReport);
                CandidatePair candidatePair = null;
                if (localCandidate != null && (remoteCandidate = RTCStatsExtensionsKt.getRemoteCandidate(value, rTCStatsReport)) != null) {
                    String candidateType = RTCStatsExtensionsKt.getCandidateType(localCandidate);
                    qns qnsVar = (candidateType == null || (addressWithPort2 = RTCStatsExtensionsKt.getAddressWithPort(localCandidate)) == null || (address2 = RTCStatsExtensionsKt.getAddress(localCandidate)) == null || (protocol2 = RTCStatsExtensionsKt.getProtocol(localCandidate)) == null) ? null : new qns(candidateType, addressWithPort2, address2, protocol2);
                    if (qnsVar != null) {
                        String candidateType2 = RTCStatsExtensionsKt.getCandidateType(remoteCandidate);
                        qns qnsVar2 = (candidateType2 == null || (addressWithPort = RTCStatsExtensionsKt.getAddressWithPort(remoteCandidate)) == null || (address = RTCStatsExtensionsKt.getAddress(remoteCandidate)) == null || (protocol = RTCStatsExtensionsKt.getProtocol(remoteCandidate)) == null) ? null : new qns(candidateType2, addressWithPort, address, protocol);
                        if (qnsVar2 != null) {
                            Double currentRoundTripTime = RTCStatsExtensionsKt.getCurrentRoundTripTime(value);
                            Double valueOf = currentRoundTripTime != null ? Double.valueOf(currentRoundTripTime.doubleValue() * TimeUnit.SECONDS.toMillis(1L)) : null;
                            String str = (String) qnsVar.d;
                            String transportId = RTCStatsExtensionsKt.getTransportId(value);
                            if (transportId != null) {
                                Map<String, RTCStats> statsMap2 = rTCStatsReport.getStatsMap();
                                ArrayList arrayList2 = new ArrayList(statsMap2.size());
                                Iterator<Map.Entry<String, RTCStats>> it2 = statsMap2.entrySet().iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(it2.next().getValue());
                                }
                                ArrayList arrayList3 = new ArrayList();
                                int size = arrayList2.size();
                                boolean z = false;
                                int i = 0;
                                while (i < size) {
                                    Object obj = arrayList2.get(i);
                                    i++;
                                    if (epx.f(((RTCStats) obj).getType(), "transport")) {
                                        arrayList3.add(obj);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    int size2 = arrayList3.size();
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= size2) {
                                            break;
                                        }
                                        Object obj2 = arrayList3.get(i2);
                                        i2++;
                                        if (epx.f(RTCStatsExtensionsKt.getSelectedCandidatePairId((RTCStats) obj2), value.getId())) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                                candidatePair = new CandidatePair(value.getId(), qnsVar.a, (String) qnsVar.b, (String) qnsVar.c, qnsVar2.a, (String) qnsVar2.b, (String) qnsVar2.c, valueOf, str, transportId, z);
                            }
                        }
                    }
                }
                if (candidatePair != null) {
                    arrayList.add(candidatePair);
                }
            }
        }
        this.a.log("WebRTCToInternalStatsMapper", arrayList.size() + " candidatePairs parsed");
        return arrayList;
    }
}
