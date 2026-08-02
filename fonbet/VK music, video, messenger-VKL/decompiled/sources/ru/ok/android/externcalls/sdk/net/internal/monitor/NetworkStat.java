package ru.ok.android.externcalls.sdk.net.internal.monitor;

import xsna.epx;
import xsna.zcl;

/* compiled from: NetworkStat.kt */
/* loaded from: classes9.dex */
public final class NetworkStat {
    private final String activeCandidateType;
    private final Float audioLoss;
    private final Integer rttMs;
    private final Float videoLoss;

    public NetworkStat() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ NetworkStat copy$default(NetworkStat networkStat, Integer num, Float f, Float f2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = networkStat.rttMs;
        }
        if ((i & 2) != 0) {
            f = networkStat.audioLoss;
        }
        if ((i & 4) != 0) {
            f2 = networkStat.videoLoss;
        }
        if ((i & 8) != 0) {
            str = networkStat.activeCandidateType;
        }
        return networkStat.copy(num, f, f2, str);
    }

    public final Integer component1() {
        return this.rttMs;
    }

    public final Float component2() {
        return this.audioLoss;
    }

    public final Float component3() {
        return this.videoLoss;
    }

    public final String component4() {
        return this.activeCandidateType;
    }

    public final NetworkStat copy(Integer num, Float f, Float f2, String str) {
        return new NetworkStat(num, f, f2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkStat)) {
            return false;
        }
        NetworkStat networkStat = (NetworkStat) obj;
        return epx.f(this.rttMs, networkStat.rttMs) && epx.f(this.audioLoss, networkStat.audioLoss) && epx.f(this.videoLoss, networkStat.videoLoss) && epx.f(this.activeCandidateType, networkStat.activeCandidateType);
    }

    public final String getActiveCandidateType() {
        return this.activeCandidateType;
    }

    public final Float getAudioLoss() {
        return this.audioLoss;
    }

    public final Integer getRttMs() {
        return this.rttMs;
    }

    public final Float getVideoLoss() {
        return this.videoLoss;
    }

    public int hashCode() {
        Integer num = this.rttMs;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f = this.audioLoss;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.videoLoss;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str = this.activeCandidateType;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "NetworkStat(rttMs=" + this.rttMs + ", audioLoss=" + this.audioLoss + ", videoLoss=" + this.videoLoss + ", activeCandidateType=" + this.activeCandidateType + ")";
    }

    public NetworkStat(Integer num, Float f, Float f2, String str) {
        this.rttMs = num;
        this.audioLoss = f;
        this.videoLoss = f2;
        this.activeCandidateType = str;
    }

    public /* synthetic */ NetworkStat(Integer num, Float f, Float f2, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2, (i & 8) != 0 ? null : str);
    }
}
