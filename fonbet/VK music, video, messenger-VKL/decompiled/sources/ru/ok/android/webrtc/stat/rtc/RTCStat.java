package ru.ok.android.webrtc.stat.rtc;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.StatsReport;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.topology.StatsObserver;
import xsna.i5s;
import xsna.zr;

/* loaded from: classes9.dex */
public final class RTCStat {

    @NonNull
    public final List<CandidatePair> candidatePairs;

    @NonNull
    public final List<String> googTrackIds;

    @NonNull
    public final List<Ssrc> ssrcs;
    public final long timestamp;

    @NonNull
    public final Map<String, Map<String, String>> unknown = new HashMap();

    public RTCStat(long j, @NonNull List<String> list, @NonNull List<Ssrc> list2, @NonNull List<CandidatePair> list3) {
        this.timestamp = j;
        this.googTrackIds = Collections.unmodifiableList(list);
        this.ssrcs = Collections.unmodifiableList(list2);
        this.candidatePairs = Collections.unmodifiableList(list3);
    }

    public static BigInteger a(String str, RTCLog rTCLog) {
        if (str == null) {
            return null;
        }
        try {
            return new BigInteger(str);
        } catch (NumberFormatException e) {
            rTCLog.logException("RTCStat", "stat.parse", e);
            return null;
        }
    }

    public static long b(String str, RTCLog rTCLog) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            rTCLog.logException("RTCStat", "stat.parse", e);
            return -1L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0566 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static RTCStat from(@NonNull StatsReport[] statsReportArr, @NonNull RTCLog rTCLog) {
        char c;
        Ssrc.Direction direction;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        long j;
        int i2;
        HashMap hashMap;
        ArrayList arrayList3;
        Ssrc videoRecv;
        Ssrc ssrc;
        StatsReport.Value[] valueArr;
        char c2;
        StatsReport[] statsReportArr2 = statsReportArr;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        int length = statsReportArr2.length;
        long j2 = 0;
        int i3 = 0;
        while (i3 < length) {
            StatsReport statsReport = statsReportArr2[i3];
            double d = statsReport.timestamp;
            if (d > j2) {
                j2 = (long) d;
            }
            String str = statsReport.type;
            str.getClass();
            switch (str.hashCode()) {
                case 3540113:
                    if (str.equals("ssrc")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 292608541:
                    if (str.equals(CandidatePair.TYPE)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1452734571:
                    if (str.equals("googTrack")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            Double d2 = null;
            switch (c) {
                case 0:
                    String substring = statsReport.id.substring(r1.length() - 4);
                    substring.getClass();
                    if (substring.equals("recv")) {
                        direction = Ssrc.Direction.RECV;
                    } else if (!substring.equals("send")) {
                        rTCLog.logException(Ssrc.LOG_TAG, "stat.parse", new IllegalArgumentException(i5s.a(new StringBuilder("ssrc type '"), statsReport.id, "' is not send/recv")));
                        arrayList = arrayList5;
                        arrayList3 = arrayList4;
                        arrayList2 = arrayList6;
                        hashMap = hashMap2;
                        i = length;
                        j = j2;
                        i2 = i3;
                        ssrc = null;
                        arrayList4 = arrayList3;
                        if (ssrc != null) {
                            break;
                        } else {
                            arrayList4.add(ssrc);
                            continue;
                        }
                    } else {
                        direction = Ssrc.Direction.SEND;
                    }
                    HashMap hashMap3 = new HashMap(statsReport.values.length);
                    StatsReport.Value[] valueArr2 = statsReport.values;
                    int length2 = valueArr2.length;
                    int i4 = 0;
                    while (i4 < length2) {
                        int i5 = i4;
                        StatsReport.Value value = valueArr2[i5];
                        hashMap3.put(value.name, value.value);
                        i4 = i5 + 1;
                        arrayList5 = arrayList5;
                    }
                    arrayList = arrayList5;
                    String str2 = (String) hashMap3.get(StatsObserver.KEY_MEDIA_TYPE);
                    String str3 = (String) hashMap3.remove(StatsObserver.KEY_GOOG_CODEC_NAME);
                    String str4 = str3 == null ? "" : str3;
                    String str5 = (String) hashMap3.remove(StatsObserver.KEY_CODEC_IMPL_NAME);
                    Ssrc.CodecInfo codecInfo = new Ssrc.CodecInfo(str4, str5 == null ? "" : str5, null, 0L);
                    arrayList2 = arrayList6;
                    i = length;
                    j = j2;
                    i2 = i3;
                    hashMap = hashMap2;
                    if (direction == Ssrc.Direction.SEND) {
                        arrayList3 = arrayList4;
                        if ("audio".equalsIgnoreCase(str2)) {
                            long b = b((String) hashMap3.remove("ssrc"), rTCLog);
                            String str6 = (String) hashMap3.remove(RTCStatsConstants.KEY_TRANSPORT_ID);
                            String str7 = str6 == null ? "" : str6;
                            BigInteger a = a((String) hashMap3.remove("packetsSent"), rTCLog);
                            BigInteger a2 = a((String) hashMap3.remove("packetsLost"), rTCLog);
                            BigInteger a3 = a((String) hashMap3.remove("bytesSent"), rTCLog);
                            BigInteger a4 = a((String) hashMap3.remove(RTCStatsConstants.KEY_HEADER_BYTES_SENT), rTCLog);
                            BigInteger a5 = a((String) hashMap3.remove(RTCStatsConstants.KEY_RETRANSMITTED_BYTES_SENT), rTCLog);
                            Long valueOf = Long.valueOf(b((String) hashMap3.remove(RTCStatsConstants.KEY_TARGET_BITRATE), rTCLog));
                            String str8 = (String) hashMap3.remove(StatsObserver.KEY_TRACK_ID);
                            videoRecv = new Ssrc.AudioSend(b, str7, a, a2, a3, a4, a5, valueOf, str8 == null ? "" : str8, codecInfo, null, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
                        } else if ("video".equalsIgnoreCase(str2)) {
                            long b2 = b((String) hashMap3.remove("ssrc"), rTCLog);
                            String str9 = (String) hashMap3.remove(RTCStatsConstants.KEY_TRANSPORT_ID);
                            String str10 = str9 == null ? "" : str9;
                            BigInteger a6 = a((String) hashMap3.remove("packetsSent"), rTCLog);
                            BigInteger a7 = a((String) hashMap3.remove("packetsLost"), rTCLog);
                            BigInteger a8 = a((String) hashMap3.remove("bytesSent"), rTCLog);
                            BigInteger a9 = a((String) hashMap3.remove(RTCStatsConstants.KEY_HEADER_BYTES_SENT), rTCLog);
                            BigInteger a10 = a((String) hashMap3.remove(RTCStatsConstants.KEY_RETRANSMITTED_BYTES_SENT), rTCLog);
                            long b3 = b((String) hashMap3.remove("googNacksReceived"), rTCLog);
                            long b4 = b((String) hashMap3.remove("googPlisReceived"), rTCLog);
                            long b5 = b((String) hashMap3.remove("googFirsReceived"), rTCLog);
                            long b6 = b((String) hashMap3.remove(RTCStatsConstants.KEY_FRAMES_ENCODED), rTCLog);
                            long b7 = b((String) hashMap3.remove("googAdaptationChanges"), rTCLog);
                            long b8 = b((String) hashMap3.remove("googAvgEncodeMs"), rTCLog);
                            long b9 = b((String) hashMap3.remove("googFrameWidthSent"), rTCLog);
                            long b10 = b((String) hashMap3.remove("googFrameHeightSent"), rTCLog);
                            Long valueOf2 = Long.valueOf(b((String) hashMap3.remove(RTCStatsConstants.KEY_TARGET_BITRATE), rTCLog));
                            String str11 = (String) hashMap3.remove(StatsObserver.KEY_TRACK_ID);
                            videoRecv = new Ssrc.VideoSend(b2, str10, a6, a7, a8, a9, a10, b3, b4, b5, b6, b7, b8, b9, b10, valueOf2, str11 == null ? "" : str11, codecInfo, null);
                        } else {
                            rTCLog.logException(Ssrc.LOG_TAG, "stat.parse", new IllegalArgumentException(zr.a("media type '", str2, "' is not video/audio")));
                            ssrc = null;
                        }
                        ssrc = videoRecv;
                        ssrc.unknown.putAll(hashMap3);
                    } else {
                        arrayList3 = arrayList4;
                        if ("audio".equalsIgnoreCase(str2)) {
                            long b11 = b((String) hashMap3.remove("ssrc"), rTCLog);
                            String str12 = (String) hashMap3.remove(RTCStatsConstants.KEY_TRANSPORT_ID);
                            String str13 = str12 == null ? "" : str12;
                            BigInteger a11 = a((String) hashMap3.remove("packetsReceived"), rTCLog);
                            BigInteger a12 = a((String) hashMap3.remove("packetsLost"), rTCLog);
                            BigInteger a13 = a((String) hashMap3.remove(RTCStatsConstants.KEY_PACKETS_DISCARDED), rTCLog);
                            BigInteger a14 = a((String) hashMap3.remove("bytesReceived"), rTCLog);
                            long b12 = b((String) hashMap3.remove("googJitterBufferMs"), rTCLog);
                            String str14 = (String) hashMap3.remove(StatsObserver.KEY_TRACK_ID);
                            videoRecv = new Ssrc.AudioRecv(b11, str13, a11, a12, a13, a14, -1.0d, -1.0d, b12, str14 == null ? "" : str14, -1L, -1L, -1L, -1L, -1L, -1L, codecInfo);
                        } else if ("video".equalsIgnoreCase(str2)) {
                            long b13 = b((String) hashMap3.remove("ssrc"), rTCLog);
                            String str15 = (String) hashMap3.remove(RTCStatsConstants.KEY_TRANSPORT_ID);
                            String str16 = str15 == null ? "" : str15;
                            BigInteger a15 = a((String) hashMap3.remove("packetsReceived"), rTCLog);
                            BigInteger a16 = a((String) hashMap3.remove("packetsLost"), rTCLog);
                            BigInteger a17 = a((String) hashMap3.remove(RTCStatsConstants.KEY_PACKETS_DISCARDED), rTCLog);
                            BigInteger a18 = a((String) hashMap3.remove("bytesReceived"), rTCLog);
                            long b14 = b((String) hashMap3.remove("googJitterBufferMs"), rTCLog);
                            long b15 = b((String) hashMap3.remove("googNacksSent"), rTCLog);
                            long b16 = b((String) hashMap3.remove("googPlisSent"), rTCLog);
                            long b17 = b((String) hashMap3.remove("googFirsSent"), rTCLog);
                            long b18 = b((String) hashMap3.remove(RTCStatsConstants.KEY_FRAMES_DECODED), rTCLog);
                            long b19 = b((String) hashMap3.remove(RTCStatsConstants.KEY_FRAMES_RECEIVED), rTCLog);
                            long b20 = b((String) hashMap3.remove("googFrameHeightReceived"), rTCLog);
                            long b21 = b((String) hashMap3.remove("googFrameWidthReceived"), rTCLog);
                            String str17 = (String) hashMap3.remove(StatsObserver.KEY_TRACK_ID);
                            videoRecv = new Ssrc.VideoRecv(b13, str16, a15, a16, a17, a18, b14, b15, b16, b17, b18, b19, b20, b21, str17 == null ? "" : str17, 0L, null, null, codecInfo, 0L, 0L);
                        } else {
                            rTCLog.logException(Ssrc.LOG_TAG, "stat.parse", new IllegalArgumentException(zr.a("media type '", str2, "' is not video/audio")));
                            ssrc = null;
                        }
                        ssrc = videoRecv;
                        ssrc.unknown.putAll(hashMap3);
                    }
                    arrayList4 = arrayList3;
                    if (ssrc != null) {
                    }
                case 1:
                    String str18 = statsReport.id;
                    HashMap hashMap4 = new HashMap();
                    StatsReport.Value[] valueArr3 = statsReport.values;
                    int length3 = valueArr3.length;
                    int i6 = 0;
                    boolean z = false;
                    String str19 = null;
                    String str20 = null;
                    String str21 = null;
                    String str22 = null;
                    String str23 = null;
                    String str24 = null;
                    String str25 = null;
                    String str26 = null;
                    String str27 = null;
                    while (i6 < length3) {
                        StatsReport.Value value2 = valueArr3[i6];
                        String str28 = value2.name;
                        str28.getClass();
                        switch (str28.hashCode()) {
                            case -1553358190:
                                valueArr = valueArr3;
                                if (str28.equals("googLocalCandidateType")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -747991196:
                                valueArr = valueArr3;
                                if (str28.equals("googActiveConnection")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -244374237:
                                valueArr = valueArr3;
                                if (str28.equals("googTransportType")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -200882018:
                                valueArr = valueArr3;
                                if (str28.equals("googChannelId")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 207096210:
                                valueArr = valueArr3;
                                if (str28.equals(StatsObserver.KEY_RTT)) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 230681321:
                                valueArr = valueArr3;
                                if (str28.equals("googLocalAddress")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 585525230:
                                valueArr = valueArr3;
                                if (str28.equals("googRemoteAddress")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 930973655:
                                valueArr = valueArr3;
                                if (str28.equals("googRemoteCandidateType")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                valueArr = valueArr3;
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                str20 = value2.value;
                                break;
                            case 1:
                                z = "true".equalsIgnoreCase(value2.value);
                                break;
                            case 2:
                                str26 = value2.value;
                                break;
                            case 3:
                                str27 = value2.value;
                                break;
                            case 4:
                                str19 = value2.value;
                                break;
                            case 5:
                                String str29 = value2.value;
                                if (str29 != null) {
                                    str22 = str29.split(StringUtils.PROCESS_POSTFIX_DELIMITER)[0];
                                }
                                str21 = str29;
                                break;
                            case 6:
                                String str30 = value2.value;
                                if (str30 != null) {
                                    str25 = str30.split(StringUtils.PROCESS_POSTFIX_DELIMITER)[0];
                                }
                                str24 = str30;
                                break;
                            case 7:
                                str23 = value2.value;
                                break;
                            default:
                                hashMap4.put(value2.name, value2.value);
                                break;
                        }
                        i6++;
                        valueArr3 = valueArr;
                    }
                    try {
                        d2 = Double.valueOf(Double.parseDouble(str19));
                    } catch (Throwable th) {
                        Log.e("CandidatePair", "Can't parse rtt", th);
                    }
                    CandidatePair candidatePair = new CandidatePair(str18, str20, str21, str22, str23, str24, str25, d2, str26, str27, z);
                    candidatePair.unknown.putAll(hashMap4);
                    arrayList6.add(candidatePair);
                    break;
                case 2:
                    arrayList5.add(statsReport.values[0].value);
                    break;
                default:
                    HashMap hashMap5 = new HashMap();
                    for (StatsReport.Value value3 : statsReport.values) {
                        hashMap5.put(value3.name, value3.value);
                    }
                    hashMap2.put(statsReport.id, hashMap5);
                    break;
            }
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            hashMap = hashMap2;
            i = length;
            j = j2;
            i2 = i3;
            i3 = i2 + 1;
            statsReportArr2 = statsReportArr;
            arrayList6 = arrayList2;
            length = i;
            arrayList5 = arrayList;
            j2 = j;
            hashMap2 = hashMap;
        }
        RTCStat rTCStat = new RTCStat(j2, arrayList5, arrayList4, arrayList6);
        rTCStat.unknown.putAll(hashMap2);
        return rTCStat;
    }

    @Nullable
    public CandidatePair firstActiveConnection() {
        for (CandidatePair candidatePair : this.candidatePairs) {
            if (candidatePair.activeConnection) {
                return candidatePair;
            }
        }
        return null;
    }

    @NonNull
    public List<Ssrc> getSsrcs() {
        return this.ssrcs;
    }
}
