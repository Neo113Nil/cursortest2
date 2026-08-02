package ru.ok.android.webrtc.stat.rtc;

import androidx.annotation.Nullable;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class CandidatePair {
    public static final String TYPE = "googCandidatePair";
    public final boolean activeConnection;
    public final String channelId;
    public final String localAddress;
    public final String localAddressWithPort;
    public final String localCandidateType;
    public final String name;
    public final String remoteAddress;
    public final String remoteAddressWithPort;
    public final String remoteCandidateType;

    @Nullable
    public final Double rtt;
    public final String transport;
    public final HashMap<String, String> unknown = new HashMap<>();

    public CandidatePair(String str, String str2, String str3, String str4, String str5, String str6, String str7, @Nullable Double d, String str8, String str9, boolean z) {
        this.name = str;
        this.localCandidateType = str2;
        this.localAddressWithPort = str3;
        this.localAddress = str4;
        this.remoteCandidateType = str5;
        this.remoteAddressWithPort = str6;
        this.remoteAddress = str7;
        this.rtt = d;
        this.transport = str8;
        this.channelId = str9;
        this.activeConnection = z;
    }

    public String toString() {
        return "CandidatePair{name='" + this.name + "', localCandidateType='" + this.localCandidateType + "', localAddress='" + this.localAddressWithPort + "', remoteCandidateType='" + this.remoteCandidateType + "', remoteAddress='" + this.remoteAddressWithPort + "', rtt='" + this.rtt + "', transport='" + this.transport + "', channelId='" + this.channelId + "', activeConnection=" + this.activeConnection + ", unknown=" + this.unknown + '}';
    }
}
