package ru.ok.android.webrtc.stat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.B5;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.webrtc.StatsReport;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import ru.ok.android.webrtc.stat.rtc.CandidatePair;
import ru.ok.android.webrtc.topology.StatsObserver;

/* loaded from: classes9.dex */
public class RTCDeprecatedStat {
    public long VideoBwe_googActualEncBitrate;
    public long VideoBwe_googRetransmitBitrate;
    public long VideoBwe_googTargetEncBitrate;
    public long VideoBwe_googTransmitBitrate;
    public final RTCLog a;
    public long audio_googJitterBufferMs;

    @Nullable
    public String googCandidatePair_googLocalAddress;
    public String googCandidatePair_googLocalCandidateType;

    @Nullable
    public String googCandidatePair_googRemoteAddress;

    @Nullable
    public String googCandidatePair_googRemoteCandidateType;
    public String googCandidatePair_rtt;

    @Nullable
    public String googCandidatePair_transport;
    public long send_audio_bytesSent;
    public long send_audio_packetsLost;
    public long send_audio_packetsSent;
    public long send_video_bytesSent;
    public String send_video_googAdaptationChanges;
    public String send_video_googAvgEncodeMs;
    public long send_video_googFrameHeightSent;
    public long send_video_googFrameWidthSent;
    public long send_video_packetsLost;
    public long send_video_packetsSent;
    public final StatsReport[] stat;
    public long video_framesDecoded;
    public long video_framesEncoded;
    public long video_framesReceived;
    public long video_googFirReceived;
    public long video_googFirSent;
    public long video_googJitterBufferMs;
    public long video_googNacksReceived;
    public long video_googNacksSent;
    public long video_googPliReceived;
    public long video_googPliSent;

    public RTCDeprecatedStat(RTCLog rTCLog, StatsReport[] statsReportArr) {
        int i;
        this.VideoBwe_googTargetEncBitrate = -1L;
        this.VideoBwe_googTransmitBitrate = -1L;
        this.VideoBwe_googRetransmitBitrate = -1L;
        this.VideoBwe_googActualEncBitrate = -1L;
        this.send_video_googAvgEncodeMs = null;
        this.send_video_googAdaptationChanges = null;
        this.send_video_googFrameHeightSent = -1L;
        this.send_video_googFrameWidthSent = -1L;
        this.send_video_packetsSent = -1L;
        this.send_video_packetsLost = -1L;
        this.send_video_bytesSent = -1L;
        this.send_audio_packetsSent = -1L;
        this.send_audio_packetsLost = -1L;
        this.send_audio_bytesSent = -1L;
        this.googCandidatePair_rtt = null;
        this.googCandidatePair_transport = null;
        this.googCandidatePair_googRemoteCandidateType = null;
        this.video_googNacksReceived = -1L;
        this.video_googNacksSent = -1L;
        this.video_googPliSent = -1L;
        this.video_googPliReceived = -1L;
        this.video_googFirSent = -1L;
        this.video_googFirReceived = -1L;
        this.video_googJitterBufferMs = -1L;
        this.audio_googJitterBufferMs = -1L;
        this.video_framesDecoded = -1L;
        this.video_framesReceived = -1L;
        this.video_framesEncoded = -1L;
        this.stat = statsReportArr;
        this.a = rTCLog;
        int length = statsReportArr.length;
        for (int i2 = 0; i2 < length; i2 = i + 1) {
            StatsReport statsReport = statsReportArr[i2];
            if (statsReport.type.equals("VideoBwe")) {
                for (StatsReport.Value value : statsReport.values) {
                    try {
                        String str = value.name;
                        int hashCode = str.hashCode();
                        if (hashCode != -1709278787) {
                            if (hashCode != -1197172950) {
                                if (hashCode != 1074688577) {
                                    if (hashCode == 1093751428 && str.equals("googTargetEncBitrate")) {
                                        this.VideoBwe_googTargetEncBitrate = Long.valueOf(value.value).longValue();
                                    }
                                } else if (str.equals("googActualEncBitrate")) {
                                    this.VideoBwe_googActualEncBitrate = Long.valueOf(value.value).longValue();
                                }
                            } else if (str.equals("googRetransmitBitrate")) {
                                this.VideoBwe_googRetransmitBitrate = Long.valueOf(value.value).longValue();
                            }
                        } else if (str.equals("googTransmitBitrate")) {
                            this.VideoBwe_googTransmitBitrate = Long.valueOf(value.value).longValue();
                        }
                    } catch (NumberFormatException e) {
                        rTCLog.logException("RTCDeprecatedStat", "stat.parse", e);
                    }
                }
            }
            HashMap hashMap = new HashMap();
            for (StatsReport.Value value2 : statsReport.values) {
                hashMap.put(value2.name, value2.value);
            }
            if (!statsReport.type.equals("ssrc") || !statsReport.id.contains("recv")) {
                i = i2;
            } else if ("video".equals((String) hashMap.get(StatsObserver.KEY_MEDIA_TYPE))) {
                i = i2;
                this.video_googNacksSent = a((String) hashMap.get("googNacksSent"));
                this.video_googPliSent = a((String) hashMap.get("googPlisSent"));
                this.video_googFirSent = a((String) hashMap.get("googFirsSent"));
                this.video_googJitterBufferMs = a((String) hashMap.get("googJitterBufferMs"));
                this.video_framesDecoded = a((String) hashMap.get(RTCStatsConstants.KEY_FRAMES_DECODED)) + this.video_framesDecoded;
                this.video_framesReceived = a((String) hashMap.get(RTCStatsConstants.KEY_FRAMES_RECEIVED)) + this.video_framesReceived;
            } else {
                i = i2;
                this.audio_googJitterBufferMs = a((String) hashMap.get("googJitterBufferMs"));
            }
            if (statsReport.type.equals("ssrc") && statsReport.id.contains("send")) {
                boolean equals = "video".equals((String) hashMap.get(StatsObserver.KEY_MEDIA_TYPE));
                if (equals) {
                    this.video_framesEncoded = a((String) hashMap.get(RTCStatsConstants.KEY_FRAMES_ENCODED));
                    this.video_googNacksReceived = a((String) hashMap.get("googNacksReceived"));
                    this.video_googPliReceived = a((String) hashMap.get("googPlisReceived"));
                    this.video_googFirReceived = a((String) hashMap.get("googFirsReceived"));
                    this.send_video_googAvgEncodeMs = (String) hashMap.get("googAvgEncodeMs");
                    this.send_video_googAdaptationChanges = (String) hashMap.get("googAdaptationChanges");
                    String str2 = (String) hashMap.get("googFrameWidthSent");
                    String str3 = (String) hashMap.get("googFrameHeightSent");
                    if (str2 != null && str3 != null) {
                        try {
                            int parseInt = Integer.parseInt(str2);
                            int parseInt2 = Integer.parseInt(str3);
                            this.send_video_googFrameWidthSent = Math.min(parseInt, parseInt2);
                            this.send_video_googFrameHeightSent = Math.max(parseInt, parseInt2);
                        } catch (NumberFormatException e2) {
                            rTCLog.logException("RTCDeprecatedStat", "stat.parse", e2);
                        }
                    }
                }
                long a = a((String) hashMap.get("bytesSent"));
                if (equals) {
                    this.send_video_bytesSent = a;
                } else {
                    this.send_audio_bytesSent = a;
                }
                String str4 = (String) hashMap.get("packetsLost");
                String str5 = (String) hashMap.get("packetsSent");
                if (str5 != null && str4 != null) {
                    try {
                        long parseLong = Long.parseLong(str4);
                        long parseLong2 = Long.parseLong(str5);
                        if (equals) {
                            this.send_video_packetsSent = parseLong2;
                            this.send_video_packetsLost = parseLong;
                        } else {
                            this.send_audio_packetsSent = parseLong2;
                            this.send_audio_packetsLost = parseLong;
                        }
                    } catch (NumberFormatException e3) {
                        rTCLog.logException("RTCDeprecatedStat", "stat.parse", e3);
                    }
                }
            }
            if (statsReport.type.equals(CandidatePair.TYPE)) {
                if ("true".equals((String) hashMap.get("googActiveConnection"))) {
                    this.googCandidatePair_rtt = (String) hashMap.get(StatsObserver.KEY_RTT);
                    this.googCandidatePair_transport = (String) hashMap.get("googTransportType");
                    this.googCandidatePair_googRemoteCandidateType = (String) hashMap.get("googRemoteCandidateType");
                    this.googCandidatePair_googLocalCandidateType = (String) hashMap.get("googLocalCandidateType");
                }
                this.googCandidatePair_googLocalAddress = (String) hashMap.get("googLocalAddress");
                this.googCandidatePair_googRemoteAddress = (String) hashMap.get("googRemoteAddress");
            }
        }
    }

    public final long a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            this.a.logException("RTCDeprecatedStat", "stat.parse", e);
            return -1L;
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('\n');
        for (Field field : getClass().getDeclaredFields()) {
            try {
                sb.append(field.getName());
                sb.append(B5.U);
                sb.append(field.get(this));
                sb.append('\n');
            } catch (IllegalAccessException e) {
                sb.append("\nCaught ");
                sb.append(e.getMessage());
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}
