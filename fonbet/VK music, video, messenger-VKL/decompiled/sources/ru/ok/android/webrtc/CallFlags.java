package ru.ok.android.webrtc;

import xsna.gp;
import xsna.wn4;

/* loaded from: classes9.dex */
public final class CallFlags {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public CallFlags(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public static /* synthetic */ CallFlags copy$default(CallFlags callFlags, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = callFlags.a;
        }
        if ((i & 2) != 0) {
            z2 = callFlags.b;
        }
        if ((i & 4) != 0) {
            z3 = callFlags.c;
        }
        if ((i & 8) != 0) {
            z4 = callFlags.d;
        }
        return callFlags.copy(z, z2, z3, z4);
    }

    public final boolean component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    public final CallFlags copy(boolean z, boolean z2, boolean z3, boolean z4) {
        return new CallFlags(z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallFlags)) {
            return false;
        }
        CallFlags callFlags = (CallFlags) obj;
        return this.a == callFlags.a && this.b == callFlags.b && this.c == callFlags.c && this.d == callFlags.d;
    }

    public final boolean getForceRelayPolicy() {
        return this.c;
    }

    public final boolean getInitialVideoEnabled() {
        return this.b;
    }

    public final boolean getStartedAsP2P() {
        return this.a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.d) + wn4.b(this.c, wn4.b(this.b, Boolean.hashCode(this.a) * 31));
    }

    public final boolean isSessionStateEnabled() {
        return this.d;
    }

    public String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        StringBuilder c = gp.c("CallFlags(startedAsP2P=", ", initialVideoEnabled=", ", forceRelayPolicy=", z, z2);
        c.append(z3);
        c.append(", isSessionStateEnabled=");
        c.append(z4);
        c.append(")");
        return c.toString();
    }
}
