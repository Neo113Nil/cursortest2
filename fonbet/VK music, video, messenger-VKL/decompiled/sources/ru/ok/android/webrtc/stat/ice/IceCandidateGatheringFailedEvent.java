package ru.ok.android.webrtc.stat.ice;

import xsna.de;
import xsna.epx;
import xsna.i5s;
import xsna.nyh0;
import xsna.urd0;
import xsna.xe9;

/* loaded from: classes9.dex */
public final class IceCandidateGatheringFailedEvent {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    public IceCandidateGatheringFailedEvent(String str, String str2, String str3, int i, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
    }

    public static /* synthetic */ IceCandidateGatheringFailedEvent copy$default(IceCandidateGatheringFailedEvent iceCandidateGatheringFailedEvent, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = iceCandidateGatheringFailedEvent.a;
        }
        if ((i2 & 2) != 0) {
            str2 = iceCandidateGatheringFailedEvent.b;
        }
        if ((i2 & 4) != 0) {
            str3 = iceCandidateGatheringFailedEvent.c;
        }
        if ((i2 & 8) != 0) {
            i = iceCandidateGatheringFailedEvent.d;
        }
        if ((i2 & 16) != 0) {
            str4 = iceCandidateGatheringFailedEvent.e;
        }
        String str5 = str4;
        String str6 = str3;
        return iceCandidateGatheringFailedEvent.copy(str, str2, str6, i, str5);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    public final IceCandidateGatheringFailedEvent copy(String str, String str2, String str3, int i, String str4) {
        return new IceCandidateGatheringFailedEvent(str, str2, str3, i, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IceCandidateGatheringFailedEvent)) {
            return false;
        }
        IceCandidateGatheringFailedEvent iceCandidateGatheringFailedEvent = (IceCandidateGatheringFailedEvent) obj;
        return epx.f(this.a, iceCandidateGatheringFailedEvent.a) && epx.f(this.b, iceCandidateGatheringFailedEvent.b) && epx.f(this.c, iceCandidateGatheringFailedEvent.c) && this.d == iceCandidateGatheringFailedEvent.d && epx.f(this.e, iceCandidateGatheringFailedEvent.e);
    }

    public final int getCode() {
        return this.d;
    }

    public final String getDescription() {
        return this.c;
    }

    public final String getLocalAddress() {
        return this.a;
    }

    public final String getRemoteUrl() {
        return this.b;
    }

    public final String getTransportType() {
        return this.e;
    }

    public int hashCode() {
        int v = de.v(this.d, urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c));
        String str = this.e;
        return v + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int i = this.d;
        String str4 = this.e;
        StringBuilder a = xe9.a("IceCandidateGatheringFailedEvent(localAddress=", str, ", remoteUrl=", str2, ", description=");
        nyh0.a(i, str3, ", code=", ", transportType=", a);
        return i5s.a(a, str4, ")");
    }
}
