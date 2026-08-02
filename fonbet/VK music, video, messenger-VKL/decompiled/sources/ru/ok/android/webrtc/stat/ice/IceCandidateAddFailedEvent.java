package ru.ok.android.webrtc.stat.ice;

import xsna.de;
import xsna.epx;
import xsna.i5s;
import xsna.xy6;

/* loaded from: classes9.dex */
public final class IceCandidateAddFailedEvent {
    public final String a;
    public final int b;
    public final String c;

    public IceCandidateAddFailedEvent(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public static /* synthetic */ IceCandidateAddFailedEvent copy$default(IceCandidateAddFailedEvent iceCandidateAddFailedEvent, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = iceCandidateAddFailedEvent.a;
        }
        if ((i2 & 2) != 0) {
            i = iceCandidateAddFailedEvent.b;
        }
        if ((i2 & 4) != 0) {
            str2 = iceCandidateAddFailedEvent.c;
        }
        return iceCandidateAddFailedEvent.copy(str, i, str2);
    }

    public final String component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final IceCandidateAddFailedEvent copy(String str, int i, String str2) {
        return new IceCandidateAddFailedEvent(str, i, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IceCandidateAddFailedEvent)) {
            return false;
        }
        IceCandidateAddFailedEvent iceCandidateAddFailedEvent = (IceCandidateAddFailedEvent) obj;
        return epx.f(this.a, iceCandidateAddFailedEvent.a) && this.b == iceCandidateAddFailedEvent.b && epx.f(this.c, iceCandidateAddFailedEvent.c);
    }

    public final int getCode() {
        return this.b;
    }

    public final String getDescription() {
        return this.c;
    }

    public final String getRemoteIceCandidate() {
        return this.a;
    }

    public int hashCode() {
        return this.c.hashCode() + de.v(this.b, this.a.hashCode() * 31);
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        return i5s.a(xy6.b(i, "IceCandidateAddFailedEvent(remoteIceCandidate=", str, ", code=", ", description="), this.c, ")");
    }
}
