package ru.ok.android.webrtc.utils;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.IceCandidate;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import ru.ok.android.webrtc.RTCLog;

/* loaded from: classes9.dex */
public class IceCandidateLogger {
    public static final Pattern e = Pattern.compile(".*typ (host|prflx|srflx|relay+).*");
    public static final Pattern f = Pattern.compile(".*transport=(tcp|udp).*");
    public static final Pattern g = Pattern.compile(".*(?:tcp|udp) \\d+ (\\S+).*");
    public final RTCLog a;
    public long c;
    public boolean d = false;
    public final HashMap b = new HashMap();

    public IceCandidateLogger(RTCLog rTCLog, int i) {
        this.a = rTCLog;
        for (g gVar : g.values()) {
            this.b.put(gVar, 0);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void logCandidate(IceCandidate iceCandidate) {
        String group;
        g gVar;
        if (this.d) {
            return;
        }
        SystemClock.elapsedRealtime();
        Matcher matcher = e.matcher(iceCandidate.sdp);
        if (matcher.matches() && (group = matcher.group(1)) != null) {
            char c = 65535;
            switch (group.hashCode()) {
                case 3208616:
                    if (group.equals(CandidateTypeHintConfig.TYPE_HOST)) {
                        c = 0;
                        break;
                    }
                    break;
                case 106932016:
                    if (group.equals(CandidateTypeHintConfig.TYPE_PRFLX)) {
                        c = 1;
                        break;
                    }
                    break;
                case 108397201:
                    if (group.equals(CandidateTypeHintConfig.TYPE_RELAY)) {
                        c = 2;
                        break;
                    }
                    break;
                case 109702579:
                    if (group.equals(CandidateTypeHintConfig.TYPE_SRFLX)) {
                        c = 3;
                        break;
                    }
                    break;
            }
            String str = null;
            switch (c) {
                case 0:
                    return;
                case 1:
                case 2:
                case 3:
                    String str2 = iceCandidate.serverUrl;
                    if (str2 != null) {
                        Matcher matcher2 = f.matcher(str2);
                        if (matcher2.matches()) {
                            str = matcher2.group(1);
                        }
                    }
                    if (str != null) {
                        str = str.toLowerCase();
                        break;
                    } else {
                        str = "udp";
                        break;
                    }
            }
            if (CandidateTypeHintConfig.TYPE_RELAY.equals(group)) {
                gVar = "tcp".equals(str) ? g.TCP_RELAY : g.UDP_RELAY;
                Matcher matcher3 = g.matcher(iceCandidate.sdp);
                if (matcher3.matches()) {
                    matcher3.group(1);
                }
            } else {
                if (!CandidateTypeHintConfig.TYPE_SRFLX.equals(group)) {
                    this.a.log("CandidateLog", "not logging (unknown?) type: ".concat(group));
                    return;
                }
                gVar = g.SRFLX;
            }
            this.b.put(gVar, Integer.valueOf(((Integer) this.b.get(gVar)).intValue() + 1));
        }
    }

    public void logConnection(boolean z) {
        if (this.c == 0 || this.d) {
            return;
        }
        this.d = true;
    }

    public void markGatheringStart() {
        SystemClock.elapsedRealtime();
    }

    public void markIceStart() {
        if (this.c == 0) {
            this.c = SystemClock.elapsedRealtime();
        }
    }
}
