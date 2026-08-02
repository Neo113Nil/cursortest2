package ru.ok.android.webrtc.stat;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.k0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.StatsReport;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.connection.BadNetworkIndicatorConfig;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.stat.rtc.CandidatePair;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.topology.ExtendedStatsCallback;
import ru.ok.android.webrtc.topology.StatsObserver;

/* loaded from: classes9.dex */
public final class StatsReportHandler {
    public final Hashtable a = new Hashtable();
    public final MediaStat b = new MediaStat();
    public final CallParams c;
    public final RTCLog d;
    public final CallParticipant e;
    public boolean f;
    public boolean g;
    public boolean h;

    public StatsReportHandler(@NonNull CallParams callParams, @NonNull RTCLog rTCLog, @NonNull CallParticipant callParticipant) {
        this.c = callParams;
        this.d = rTCLog;
        this.e = callParticipant;
    }

    public static long a(Number... numberArr) {
        long j = 0;
        if (numberArr.length == 1) {
            Number number = numberArr[0];
            if (number == null) {
                return 0L;
            }
            return number.longValue();
        }
        for (Number number2 : numberArr) {
            if (number2 != null) {
                j = number2.longValue() + j;
            }
        }
        return j;
    }

    public void exclude(CallParticipant callParticipant) {
        if (callParticipant != null) {
            this.a.remove(callParticipant);
        }
    }

    public MediaStat getMediaStat(CallParticipant callParticipant) {
        if (callParticipant != null) {
            return (MediaStat) this.a.get(callParticipant);
        }
        return null;
    }

    public Long getTimeSinceBytesReceivedMs(boolean z) {
        if (z) {
            MediaStat mediaStat = this.b;
            mediaStat.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(mediaStat.c.c, mediaStat.b.c);
            if (max == 0) {
                return null;
            }
            return Long.valueOf(elapsedRealtime - max);
        }
        long j = Long.MAX_VALUE;
        for (CallParticipant callParticipant : this.a.keySet()) {
            if (!callParticipant.equals(this.e)) {
                MediaStat mediaStat2 = (MediaStat) this.a.get(callParticipant);
                mediaStat2.getClass();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long max2 = Math.max(mediaStat2.c.c, mediaStat2.b.c);
                Long valueOf = max2 == 0 ? null : Long.valueOf(elapsedRealtime2 - max2);
                if (valueOf != null) {
                    j = Math.min(valueOf.longValue(), j);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(j);
    }

    public void handle(StatsReport[] statsReportArr, StatsObserver.MediaTrackMapping[] mediaTrackMappingArr) {
        int i;
        MediaStat mediaStat;
        StatsReport[] statsReportArr2 = statsReportArr;
        int i2 = 0;
        while (i2 < statsReportArr2.length) {
            StatsObserver.MediaTrackMapping mediaTrackMapping = mediaTrackMappingArr[i2];
            if (mediaTrackMapping.getCallParticipant() != null || mediaTrackMapping.isAudioMixTrack()) {
                StatsReport.Value[] valueArr = statsReportArr2[i2].values;
                int length = valueArr.length;
                String str = null;
                i = i2;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                long j = Long.MIN_VALUE;
                long j2 = Long.MIN_VALUE;
                long j3 = Long.MIN_VALUE;
                long j4 = Long.MIN_VALUE;
                int i3 = 0;
                long j5 = Long.MIN_VALUE;
                long j6 = Long.MIN_VALUE;
                while (i3 < length) {
                    StatsReport.Value value = valueArr[i3];
                    int i4 = length;
                    if ("bytesSent".equals(value.name)) {
                        try {
                            j2 = Long.parseLong(value.value);
                        } catch (Exception unused) {
                        }
                    } else if ("bytesReceived".equals(value.name)) {
                        j3 = Long.parseLong(value.value);
                    } else if (StatsObserver.KEY_AUDIO_OUTPUT_LEVEL.equals(value.name)) {
                        j = Long.parseLong(value.value);
                    } else if (StatsObserver.KEY_MEDIA_TYPE.equals(value.name)) {
                        str = value.value;
                    } else if ("ssrc".equalsIgnoreCase(value.name)) {
                        str4 = value.value;
                    } else if (StatsObserver.KEY_GOOG_CODEC_NAME.equals(value.name)) {
                        str2 = value.value;
                    } else if (StatsObserver.KEY_CODEC_IMPL_NAME.equals(value.name)) {
                        str3 = value.value;
                    } else if ("packetsLost".equals(value.name)) {
                        j4 = Long.parseLong(value.value);
                    } else if (StatsObserver.KEY_RTT.equals(value.name)) {
                        j6 = Long.parseLong(value.value);
                    } else if ("packetsSent".equals(value.name)) {
                        j5 = Long.parseLong(value.value);
                    }
                    i3++;
                    length = i4;
                }
                if (mediaTrackMapping.isAudioMixTrack()) {
                    mediaStat = this.b;
                } else {
                    CallParticipant callParticipant = mediaTrackMapping.getCallParticipant();
                    MediaStat mediaStat2 = (MediaStat) this.a.get(callParticipant);
                    if (mediaStat2 == null) {
                        Hashtable hashtable = this.a;
                        MediaStat mediaStat3 = new MediaStat();
                        hashtable.put(callParticipant, mediaStat3);
                        mediaStat = mediaStat3;
                    } else {
                        mediaStat = mediaStat2;
                    }
                }
                BadNetworkIndicatorConfig.DebugLoggingConfig debugLoggingConfig = this.c.getBadNetworkIndicatorConfig().getDebugLoggingConfig();
                if ("audio".equals(str)) {
                    if (j != Long.MIN_VALUE && mediaStat.audioProcessor.getLastAudioLevel() != j) {
                        mediaStat.audioProcessor.appendAudioLevel(j);
                        mediaStat.a = SystemClock.elapsedRealtime();
                    }
                    if (j3 != Long.MIN_VALUE) {
                        debugLoggingConfig.logV(this.d, "StatsReportHandler", k0.a(j3, "setAudioBytesReceived: "));
                        mediaStat.c.a.a(j3);
                    }
                    if (j2 != Long.MIN_VALUE) {
                        debugLoggingConfig.logV(this.d, "StatsReportHandler", k0.a(j2, "setAudioBytesSent: "));
                        mediaStat.b.a.a(j2);
                    }
                    if (j4 != Long.MIN_VALUE) {
                        debugLoggingConfig.logV(this.d, "StatsReportHandler", k0.a(j4, "setAudioPacketsLost: "));
                        mediaStat.e = j4;
                    }
                    long j7 = j5;
                    if (j7 != Long.MIN_VALUE) {
                        debugLoggingConfig.logV(this.d, "StatsReportHandler", k0.a(j7, "setAudioPacketsSent: "));
                        mediaStat.setAudioPacketsSent(j7);
                    }
                    mediaStat.j = str2;
                    mediaStat.h = str4;
                    mediaStat.setAudioRtt(j6);
                } else {
                    String str5 = str4;
                    long j8 = j5;
                    long j9 = j6;
                    if ("video".equals(str)) {
                        if (j3 != Long.MIN_VALUE) {
                            debugLoggingConfig.logV(this.d, "StatsReportHandler", k0.a(j3, "setVideoBytesReceived: "));
                            mediaStat.c.b.a(j3);
                        }
                        if (j2 != Long.MIN_VALUE) {
                            debugLoggingConfig.logV(this.d, "StatsReportHandler", k0.a(j2, "setVideoBytesSent: "));
                            mediaStat.b.b.a(j2);
                        }
                        if (j4 != Long.MIN_VALUE) {
                            debugLoggingConfig.logV(this.d, "StatsReportHandler", k0.a(j4, "setVideoPacketsLost: "));
                            mediaStat.d = j4;
                        }
                        if (j8 != Long.MIN_VALUE) {
                            debugLoggingConfig.logV(this.d, "StatsReportHandler", k0.a(j8, "setVideoPacketsSent: "));
                            mediaStat.setVideoPacketsSent(j8);
                        }
                        mediaStat.setVideoCodecName(str2);
                        mediaStat.l = str3;
                        mediaStat.i = str5;
                        mediaStat.setVideoRtt(j9);
                    }
                }
            } else {
                this.d.log("StatsReportHandler", "incorrect mapping skipped " + statsReportArr2[i2].id);
                i = i2;
            }
            i2 = i + 1;
            statsReportArr2 = statsReportArr;
        }
    }

    public void handleScreenshareRecv(CallParticipants callParticipants, Map<CallParticipant.ParticipantId, ScreenshareRecvStat> map) {
        CallParticipant participant;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<CallParticipant.ParticipantId, ScreenshareRecvStat> entry : map.entrySet()) {
            ScreenshareRecvStat value = entry.getValue();
            CallParticipant.ParticipantId key = entry.getKey();
            if (value != null && key != null && (participant = callParticipants.getParticipant(key)) != null) {
                MediaStat mediaStat = (MediaStat) this.a.get(participant);
                if (mediaStat == null) {
                    Hashtable hashtable = this.a;
                    MediaStat mediaStat2 = new MediaStat();
                    hashtable.put(participant, mediaStat2);
                    mediaStat = mediaStat2;
                }
                mediaStat.setScreenshareRecvStat(value);
            }
        }
    }

    public void updateConnectivity(@NonNull CallParticipants callParticipants, boolean z, boolean z2, @Nullable List<CallParticipant.ParticipantId> list, boolean z3) {
        HashMap hashMap;
        long j = 1000;
        if (z2) {
            hashMap = new HashMap();
            MediaStat mediaStat = this.b;
            mediaStat.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - Math.max(mediaStat.c.c, mediaStat.b.c);
            long mediaReceivingTimeoutMs = this.c.getTimeouts().getMediaReceivingTimeoutMs();
            if (mediaReceivingTimeoutMs <= 1000) {
                mediaReceivingTimeoutMs = 3000;
            }
            boolean z4 = elapsedRealtime < mediaReceivingTimeoutMs;
            if (this.h != z4) {
                RTCLog rTCLog = this.d;
                StringBuilder sb = new StringBuilder("audio-mix track isConnected ");
                sb.append(z4);
                sb.append(" timeout ms ");
                MediaStat mediaStat2 = this.b;
                mediaStat2.getClass();
                sb.append(SystemClock.elapsedRealtime() - Math.max(mediaStat2.c.c, mediaStat2.b.c));
                rTCLog.log("StatsReportHandler", sb.toString());
            }
            this.h = z4;
            if (z4) {
                for (CallParticipant callParticipant : callParticipants.getActiveSessionRoomParticipants()) {
                    hashMap.put(callParticipant, Boolean.valueOf(callParticipant.isCallAccepted()));
                }
                if (list != null) {
                    Iterator<CallParticipant.ParticipantId> it = list.iterator();
                    while (it.hasNext()) {
                        CallParticipant participant = callParticipants.getParticipant(it.next());
                        if (participant != null) {
                            hashMap.put(participant, Boolean.FALSE);
                        }
                    }
                }
                if (z3) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        CallParticipant callParticipant2 = (CallParticipant) entry.getKey();
                        hashMap.put(callParticipant2, Boolean.valueOf(((Boolean) entry.getValue()).booleanValue() && callParticipant2.getSessionState().isConnected().booleanValue()));
                    }
                }
            } else {
                Iterator<CallParticipant> it2 = callParticipants.getActiveSessionRoomParticipants().iterator();
                while (it2.hasNext()) {
                    hashMap.put(it2.next(), Boolean.FALSE);
                }
            }
        } else {
            Iterator it3 = this.a.entrySet().iterator();
            hashMap = new HashMap();
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                CallParticipant callParticipant3 = (CallParticipant) entry2.getKey();
                MediaStat mediaStat3 = (MediaStat) entry2.getValue();
                if (callParticipants.has(callParticipant3) || callParticipant3.equals(this.e)) {
                    mediaStat3.getClass();
                    long j2 = j;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - Math.max(mediaStat3.c.c, mediaStat3.b.c);
                    long mediaReceivingTimeoutMs2 = this.c.getTimeouts().getMediaReceivingTimeoutMs();
                    if (mediaReceivingTimeoutMs2 <= j2) {
                        mediaReceivingTimeoutMs2 = 3000;
                    }
                    hashMap.put(callParticipant3, Boolean.valueOf(elapsedRealtime2 < mediaReceivingTimeoutMs2));
                    if (!this.g && z) {
                        mediaStat3.a = SystemClock.elapsedRealtime();
                        this.g = true;
                    }
                    if (z && !this.f && this.c.getTimeouts().getNoSoundTimeoutMs() > 0 && callParticipant3.isCallAccepted() && callParticipant3.isAudioEnabled() && SystemClock.elapsedRealtime() - mediaStat3.a >= this.c.getTimeouts().getNoSoundTimeoutMs()) {
                        this.f = true;
                    }
                    j = j2;
                } else {
                    it3.remove();
                }
            }
        }
        callParticipants.setConnectivityForBatch(hashMap);
        for (CallParticipant callParticipant4 : callParticipants.getActiveSessionRoomParticipants()) {
            if (callParticipant4.isConnected()) {
                this.d.log("StatsReportHandler", "CONNECTED: " + callParticipant4);
            } else {
                this.d.log("StatsReportHandler", "DISCONNECTED: " + callParticipant4 + " isCallAccepted" + callParticipant4.isCallAccepted());
            }
        }
    }

    public void handle(RTCStat rTCStat, Ssrc[] ssrcArr, ExtendedStatsCallback.MediaTrackMapping[] mediaTrackMappingArr) {
        MediaStat mediaStat;
        Double d;
        for (int i = 0; i < ssrcArr.length; i++) {
            ExtendedStatsCallback.MediaTrackMapping mediaTrackMapping = mediaTrackMappingArr[i];
            if (mediaTrackMapping.getCallParticipant() == null && !mediaTrackMapping.isAudioMixTrack()) {
                this.d.log("StatsReportHandler", "incorrect mapping skipped " + ssrcArr[i].trackId + StringUtils.PROCESS_POSTFIX_DELIMITER + ssrcArr[i].transportId + StringUtils.PROCESS_POSTFIX_DELIMITER + ssrcArr[i].mediaType + StringUtils.PROCESS_POSTFIX_DELIMITER + ssrcArr[i].direction);
            } else {
                if (mediaTrackMapping.isAudioMixTrack()) {
                    mediaStat = this.b;
                } else {
                    CallParticipant callParticipant = mediaTrackMapping.getCallParticipant();
                    MediaStat mediaStat2 = (MediaStat) this.a.get(callParticipant);
                    if (mediaStat2 == null) {
                        Hashtable hashtable = this.a;
                        MediaStat mediaStat3 = new MediaStat();
                        hashtable.put(callParticipant, mediaStat3);
                        mediaStat = mediaStat3;
                    } else {
                        mediaStat = mediaStat2;
                    }
                }
                this.c.getBadNetworkIndicatorConfig().getDebugLoggingConfig();
                Ssrc ssrc = ssrcArr[i];
                Ssrc.CodecInfo codecInfo = ssrc.codecInfo;
                Ssrc.MediaType mediaType = ssrc.mediaType;
                if (codecInfo != null) {
                    if (mediaType == Ssrc.MediaType.AUDIO) {
                        mediaStat.j = codecInfo.codecName;
                    } else {
                        mediaStat.setVideoCodecName(codecInfo.codecName);
                        mediaStat.l = codecInfo.codecImplName;
                    }
                }
                CandidatePair firstActiveConnection = rTCStat.firstActiveConnection();
                long j = Long.MIN_VALUE;
                if (firstActiveConnection != null && (d = firstActiveConnection.rtt) != null) {
                    j = d.longValue();
                }
                if (mediaType == Ssrc.MediaType.AUDIO) {
                    mediaStat.h = String.valueOf(ssrcArr[i].ssrc);
                    mediaStat.setVideoRtt(j);
                } else {
                    mediaStat.i = String.valueOf(ssrcArr[i].ssrc);
                    mediaStat.setAudioRtt(j);
                }
                Ssrc ssrc2 = ssrcArr[i];
                if (ssrc2 instanceof Ssrc.AudioSend) {
                    Ssrc.AudioSend audioSend = (Ssrc.AudioSend) ssrc2;
                    mediaStat.b.a.a(a(audioSend.bytesSent, audioSend.headerBytesSent));
                    long a = a(Double.valueOf(audioSend.getAudioLevel()));
                    if (mediaStat.audioProcessor.getLastAudioLevel() != a) {
                        mediaStat.audioProcessor.appendAudioLevel(a);
                        mediaStat.a = SystemClock.elapsedRealtime();
                    }
                    mediaStat.e = a(audioSend.packetsLost);
                    mediaStat.setAudioPacketsSent(a(audioSend.packetsSent));
                } else if (ssrc2 instanceof Ssrc.AudioRecv) {
                    Ssrc.AudioRecv audioRecv = (Ssrc.AudioRecv) ssrc2;
                    mediaStat.c.a.a(a(audioRecv.getBytesReceived()));
                    mediaStat.e = a(audioRecv.packetsLost);
                } else if (ssrc2 instanceof Ssrc.VideoSend) {
                    Ssrc.VideoSend videoSend = (Ssrc.VideoSend) ssrc2;
                    mediaStat.b.b.a(a(videoSend.bytesSent, videoSend.headerBytesSent));
                    mediaStat.setVideoPacketsSent(a(videoSend.packetsSent));
                    mediaStat.d = a(videoSend.packetsLost);
                } else if (ssrc2 instanceof Ssrc.VideoRecv) {
                    Ssrc.VideoRecv videoRecv = (Ssrc.VideoRecv) ssrc2;
                    mediaStat.c.b.a(a(videoRecv.getBytesReceived()));
                    mediaStat.d = a(videoRecv.packetsLost);
                }
            }
        }
    }
}
